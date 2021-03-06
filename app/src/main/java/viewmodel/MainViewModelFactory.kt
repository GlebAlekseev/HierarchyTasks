package viewmodel

import android.os.Bundle
import androidx.lifecycle.AbstractSavedStateViewModelFactory
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.savedstate.SavedStateRegistryOwner
import data.repository.RepositoryBoard
import data.repository.RepositoryTask

@Suppress("UNCHECKED_CAST")
class MainViewModelFactory(
    owner: SavedStateRegistryOwner,

    private val repositoryTask: RepositoryBoard,
    private val repositoryBoard: RepositoryTask,
    private val defaultArgs: Bundle? = null
) : AbstractSavedStateViewModelFactory(owner, defaultArgs) {

    override fun <T : ViewModel?> create(
        key: String,
        modelClass: Class<T>,
        handle: SavedStateHandle
    ): T {
        return MainViewModel(repositoryBoard,repositoryTask) as T
    }
}