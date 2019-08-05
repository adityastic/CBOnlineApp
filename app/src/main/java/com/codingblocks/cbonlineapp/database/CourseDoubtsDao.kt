package com.codingblocks.cbonlineapp.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.codingblocks.cbonlineapp.database.models.CourseDoubts

@Dao
abstract class CourseDoubtsDao : BaseDao<CourseDoubts> {

    @Query("SElECT * FROM CourseDoubts where courseId = :courseId ")
    abstract fun getDoubtsfromCourse(courseId: String): LiveData<List<CourseDoubts>>
}
