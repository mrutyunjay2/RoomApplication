package mtj.roomdatabaseapplication.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "TaskTable")
data class Task(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "Subscriber_Id")
    var id :Int,
    @ColumnInfo(name = "task")
    var  task:String,

    @ColumnInfo(name = "desc")
    var  desc:String,

    @ColumnInfo(name = "finish_by")
    var   finishBy:String,

    @ColumnInfo(name = "finished")
    var  finished:Boolean
)
