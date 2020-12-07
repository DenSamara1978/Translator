package ru.melandra.translator.main.presenter

import io.reactivex.Observable
import ru.melandra.translator.model.data.DataModel
import ru.melandra.translator.model.data.SearchResult
import ru.melandra.translator.model.repository.Repository
import ru.melandra.translator.presenter.Interactor

class MainInteractor(
    private val remoteRepository: Repository<List<SearchResult>>,
    private val localRepository: Repository<List<SearchResult>>
) : Interactor<DataModel> {

    override fun getData(word: String, fromRemoteSource: Boolean): Observable<DataModel> {
        return if (fromRemoteSource) {
            remoteRepository.getData(word).map { DataModel.Success(it) }
        } else {
            localRepository.getData(word).map { DataModel.Success(it) }
        }
    }
}

