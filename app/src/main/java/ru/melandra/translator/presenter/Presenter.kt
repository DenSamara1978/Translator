package ru.melandra.translator.presenter

import ru.melandra.translator.model.data.DataModel
import ru.melandra.translator.view.base.BaseView

interface Presenter<T : DataModel, V : BaseView> {

    fun attachView(view: V)
    fun detachView(view: V)
    fun getData(word: String, isOnline: Boolean)
}
