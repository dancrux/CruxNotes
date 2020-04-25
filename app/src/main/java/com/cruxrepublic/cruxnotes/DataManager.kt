package com.cruxrepublic.cruxnotes

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }

    private fun initializeNotes() {
        var note = NoteInfo(
            CourseInfo("android", "Programming")
            ,"programming ", "This is how to program" )
        notes.add(note)

         note = NoteInfo(
            CourseInfo("java_language", "Programming With Java")
            ,"programming ", "This is how to program" )
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