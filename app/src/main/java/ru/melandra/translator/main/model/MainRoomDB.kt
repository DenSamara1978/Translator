package ru.melandra.translator.main.model

import io.reactivex.Observable
import ru.melandra.translator.model.data.SearchResult
import ru.melandra.translator.model.datasource.DataSource

class MainRoomDB : DataSource<List<SearchResult>> {

    override fun getData(word: String): Observable<List<SearchResult>> {
        TODO("not implemented")
    }
}
