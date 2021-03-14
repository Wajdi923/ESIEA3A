package com.example.esiea3a.Pres.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.esiea3a.R

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class UFCListFragment : Fragment() {

    private lateinit var recyclerView : RecyclerView
    private val adapter= UFCAdapter(listOf())
    private val layoutManager= LinearLayoutManager(context)

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ufc_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView= view.findViewById(R.id.ufc_recycler_view)

        recyclerView.apply {
            layoutManager=this@UFCListFragment.layoutManager
            adapter=this@UFCListFragment.adapter
        }

        val ulist : ArrayList<Fighter> = arrayListOf<Fighter>().apply{
            add(Fighter("Jon Jones"))
            add(Fighter("Khabib Nurmagomedov"))
            add(Fighter("Conor McGregor"))

        }

        adapter.updateList(ulist)

    }
}