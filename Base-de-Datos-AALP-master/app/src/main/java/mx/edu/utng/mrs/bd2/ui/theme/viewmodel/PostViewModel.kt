package mx.edu.utng.mrs.bd2.ui.theme.viewmodel
/*
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import mx.edu.utng.mrs.bd2.data.local.entity.Post
import mx.edu.utng.mrs.bd2.data.repository.PostRepository

class PostViewModel(private val repository: PostRepository)
    : ViewModel(){

        //Devuelve todas las publicaciones
        val posts: StateFlow<List<Post>> = repository.post.stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(
                5000),
            initialValue = emptyList()
        )
    //Agregar una nueva publicacion

    fun addPost(content: String){
        viewModelScope.launch {
            val post = Post(content= content)
            repository.insert(post)
        }
    }
    //Borrar Post
    fun deletePost(post: Post){
        viewModelScope.launch {
            repository.delete(post)
        }
    }
    //Actualizar Post
    fun updatePost(content: String){
        viewModelScope.launch {
            val post = Post(content = content)
            repository.update(post)
        }
    }

    //Borrar Todas las publicaciones
    fun deleteAllPost(){
        viewModelScope.launch {
            repository.deleteAll()
        }
    }

    //Obtener un post por su id
    fun getPostById(postId: Int): Flow<Post?>{
       return repository.getPostById(postId)
        }
    }




*/


