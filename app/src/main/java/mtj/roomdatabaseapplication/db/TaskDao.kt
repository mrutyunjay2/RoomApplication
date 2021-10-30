package mtj.roomdatabaseapplication.db

import androidx.room.*

@Dao
interface TaskDao {
    @Query("Select * from TaskTable")
    fun getAllTaskDetails():List<Task>

    @Insert
    fun insertData(task: Task)

    @Delete
    fun DeleteData(task: Task)

    @Update
    fun Update(task: Task)

}