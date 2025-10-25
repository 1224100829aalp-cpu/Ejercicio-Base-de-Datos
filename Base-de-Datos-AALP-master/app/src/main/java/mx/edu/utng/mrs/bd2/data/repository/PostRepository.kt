package mx.edu.utng.mrs.bd2.data.repository
/*
import kotlinx.coroutines.flow.Flow
import mx.edu.utng.mrs.bd2.data.local.dao.PostDao
import mx.edu.utng.mrs.bd2.data.local.entity.Post

class PostRepository (private val postDao: PostDao) {

    //Lista de Publicaciones
    val post: Flow<List<Post>> = postDao.getAll()

    suspend fun insert(post: Post){
        postDao.insert(post)
    }
    suspend fun delete(post: Post){
        postDao.delete(post)
    }

    suspend fun update(post: Post){
        postDao.update(post)
    }

    suspend fun deleteAll(){
        postDao.deleteAll()
    }

   fun getPostById(id: Int): Flow<Post>{
      return postDao.getPostById(id)
    }





}*/