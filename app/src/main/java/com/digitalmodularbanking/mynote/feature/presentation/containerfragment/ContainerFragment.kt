package com.digitalmodularbanking.mynote.feature.presentation.containerfragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.digitalmodularbanking.mynote.R
import com.digitalmodularbanking.mynote.databinding.FragmentContainerBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ContainerFragment : Fragment(), OrderAdapterListener {

    private val viewModel: ContainerViewModel by viewModels()

    private var _binding: FragmentContainerBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentContainerBinding.inflate(inflater,container,false)

        val navController = (childFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment).navController

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setRecycler()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    //UI Component

    private fun setRecycler(){

         val layoutManager = LinearLayoutManager(requireContext())
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL

        val adapter = NoteOrderAdapter(this)

        with( binding.notesOrderRecyclerView){

            this.layoutManager = layoutManager

            this.adapter = adapter
        }

        adapter.updateElement(viewModel.getOrderElementList())

    }

    /*
       OrderAdapterListener
     */
    override fun order(id: Int) {
        TODO("Not yet implemented")
    }

}