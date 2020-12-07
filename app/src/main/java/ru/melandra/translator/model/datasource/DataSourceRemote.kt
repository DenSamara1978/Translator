package ru.melandra.translator.model.datasource

import io.reactivex.Observable
import ru.melandra.translator.main.model.MainRetrofit
import ru.melandra.translator.model.data.SearchResult

class DataSourceRemote(private val remoteProvider: MainRetrofit = MainRetrofit()) : DataSource<List<SearchResult>> {

    override fun getData(word: String): Observable<List<SearchResult>> = remoteProvider.getData(word)
}
