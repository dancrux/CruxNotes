package com.cruxrepublic.cruxnotes

import androidx.lifecycle.ViewModel

class ItemsActivityViewModel : ViewModel() {
    var navDrawerDisplaySelection = R.id.nav_notes

    private val maxRecentlyViewedNotes = 5
    val recentlyViewedNotes = ArrayList<NoteInfo>(maxRecentlyViewedNotes)

    fun addToRecentlyViewedNotes(note: NoteInfo){
//        checks if the selected note is already in the list
        val existingIndex = recentlyViewedNotes.indexOf(note)
        if (existingIndex == -1){
//            Add  new selection to the beginning of the list and remove any selection beyond max no
            recentlyViewedNotes.add(0, note)
            for (index in recentlyViewedNotes.lastIndex downTo maxRecentlyViewedNotes)
                recentlyViewedNotes.removeAt(index)
        }else{
//            the selected note is in the list
//            move the previous selection down and make the current selection first on the list
            for (index in (existingIndex -1) downTo 0)
                recentlyViewedNotes[index + 1] = recentlyViewedNotes[index]
            recentlyViewedNotes[0] = note
        }
    }
}