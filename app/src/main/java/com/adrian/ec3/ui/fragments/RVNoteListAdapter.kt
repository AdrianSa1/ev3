package com.adrian.ec3.ui.fragments

import android.content.res.ColorStateList
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.adrian.ec3.databinding.ItemNoteBinding
import com.adrian.ec3.model.Note

class RVNoteListAdapter(var notes: List<Note>): RecyclerView.Adapter<NoteVH>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteVH {
        val binding = ItemNoteBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NoteVH(binding)
    }

    override fun getItemCount(): Int = notes.size

    override fun onBindViewHolder(holder: NoteVH, position: Int) {
        holder.bind(notes[position])
    }

}

class NoteVH(private val binding: ItemNoteBinding): RecyclerView.ViewHolder(binding.root) {

    fun bind(note: Note) {
        binding.txtNoteTitle.text = note.name
        binding.txtContentNote.text = note.type
        //val labelString = note.labels.joinToString(" | " )
       // binding.txtLablesNote.text = labelString
        //binding.txtCreateNote.text = note.createOn
        //binding.cvItemNote.setCardBackgroundColor(ColorStateList.valueOf(note.getColor()))
    }

}