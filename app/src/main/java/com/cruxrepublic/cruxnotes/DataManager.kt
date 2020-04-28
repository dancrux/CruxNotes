package com.cruxrepublic.cruxnotes

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }

    fun addNote(course: CourseInfo, noteTitle: String, noteText: String): Int {
        val note = NoteInfo(course, noteTitle, noteText)
        notes.add(note)
        return notes.lastIndex
    }

    fun findNote(course: CourseInfo, noteTitle: String, noteText: String): NoteInfo? {
        for (note in notes)
            if (course == note.course &&
                noteTitle == note.title &&
                    noteText == note.text)
                return note
        return null
    }

     fun initializeNotes() {
        var note = NoteInfo(
            CourseInfo("android_intents", "Android Programming With Intents")
            ,"programming With Intents ", "This is how to program" )
        notes.add(note)

         note = NoteInfo(
            CourseInfo("ndroid_async", "Android Async Programming and Services")
            ,"Android Async Programming and Services ", "This is how to program with async services" )
        notes.add(note)

        note = NoteInfo(
            CourseInfo("java_lang", "Java Fundamentals: The Java Language")
            ,"Java Fundamentals: The Java Language ", "This is how to program" )
        notes.add(note)
    }

    private fun initializeCourses(){
       var course = CourseInfo("android_intents", "Android Programming With Intents")
        courses[course.courseId] = course

       course = CourseInfo("android_async", "Android Async Programming and Services")
       courses.set(course.courseId, course)

       course = CourseInfo(title = "Java Fundamentals: The Java Language", courseId = "java_lang")
        courses.set(course.courseId, course)

       course = CourseInfo("java_core", "Java Fundamentals: The Core Platform")
       courses.set(course.courseId, course)
   }

}