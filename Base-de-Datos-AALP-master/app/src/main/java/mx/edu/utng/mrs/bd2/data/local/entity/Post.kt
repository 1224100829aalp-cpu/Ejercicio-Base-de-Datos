package mx.edu.utng.mrs.bd2.data.local.entity


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "posts")
data class Post(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val content: String
)
/*
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "posts")
data class Post (
    @PrimaryKey(autoGenerate = true)
    val id: Int= 0,
    val content: String
)*/


