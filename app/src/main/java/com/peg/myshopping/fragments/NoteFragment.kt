package com.peg.myshopping.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.peg.myshopping.databinding.FragmentNoteBinding

class NoteFragment : BaseFragment() {
    private lateinit var binding: FragmentNoteBinding

    fun onClickView() {

    }
    override fun onCreateView (
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNoteBinding.inflate(inflater, container, false)
        return binding.root
    }
    companion object {
        @JvmStatic
        fun newInstance() = NoteFragment()
    }
}