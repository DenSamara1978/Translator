package ru.melandra.translator.main.model

import io.reactivex.Observable
import ru.melandra.translator.model.data.SearchResult
import ru.melandra.translator.model.datasource.DataSource
import ru.melandra.translator.model.repository.Repository

class MainRepository(private val dataSource: DataSource<List<SearchResult>>) :
    Repository<List<SearchResult>> {

    override fun getData(word: String): Observable<List<SearchResult>> {
        return dataSource.getData(word)
    }
}

