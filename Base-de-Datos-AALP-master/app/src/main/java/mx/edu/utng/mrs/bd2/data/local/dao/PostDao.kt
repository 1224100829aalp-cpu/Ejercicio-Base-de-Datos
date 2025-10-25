package mx.edu.utng.mrs.bd2.data.local.dao

import androidx.room.*
import mx.edu.utng.mrs.bd2.data.local.entity.Post

@Dao
interface PostDao {
    @Query("SELECT * FROM posts")
    suspend fun getAll(): List<Post>

    @Insert
    suspend fun insert(post: Post)

    @Delete
    suspend fun delete(post: Post)
}
/*
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import mx.edu.utng.mrs.bd2.data.local.entity.Post

@Dao
interface PostDao {
    @Query("SELECT * FROM posts ORDER BY id DESC ")
    fun  getAll(): Flow<List<Post>>

    @Query("SELECT * FROM posts WHERE id = :postId ")
    suspend fun getById(postId: Int): Flow<Post>

    @Query("DELETE FROM posts")
    suspend fun deleteAll()

    @Insert
    suspend fun insert(post: Post)
    @Delete
    suspend fun delete(post: Long)

    @Update
    suspend fun update(post: Post)
*/




