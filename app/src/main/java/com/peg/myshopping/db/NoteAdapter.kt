package com.peg.myshopping.db

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.peg.myshopping.R
import com.peg.myshopping.databinding.NoteListItemBinding
import com.peg.myshopping.entities.NoteItem

class NoteAdapter : ListAdapter<NoteItem, NoteAdapter.ItemHolder>(ItemComparator()) {

    class ItemHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val binding = NoteListItemBinding.bind(view)

        fun setData(note: NoteItem) = with(binding) {
            tvTitle.text = note.title
            tvDescription.text = note.content
            tvTime.text = note.time
        }
}


        companion object {
            fun create(parent: ViewGroup): ItemHolder {
                return ItemHolder(
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.note_list_item,parent,false)
                )
            }
        }

        class ItemComparator:DiffUtil.ItemCallback<NoteItem>(){
            override fun areItemsTheSame(oldItem: NoteItem, newItem: NoteItem): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: NoteItem, newItem: NoteItem): Boolean {
                return oldItem == newItem
            }

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteAdapter.ItemHolder {
            TODO("Not yet implemented")
        }

        override fun onBindViewHolder(holder: NoteAdapter.ItemHolder, position: Int) {
            TODO("Not yet implemented")
        }
    }