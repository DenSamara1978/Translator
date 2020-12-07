package ru.melandra.translator.model.datasource

import io.reactivex.Observable
import ru.melandra.translator.main.model.MainRoomDB
import ru.melandra.translator.model.data.SearchResult

class DataSourceLocal(private val remoteProvider: MainRoomDB = MainRoomDB()) : DataSource<List<SearchResult>> {

    override fun getData(word: String): Observable<List<SearchResult>> = remoteProvider.getData(word)
}
