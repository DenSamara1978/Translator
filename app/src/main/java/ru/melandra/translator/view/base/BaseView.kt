package ru.melandra.translator.view.base

import ru.melandra.translator.model.data.DataModel

interface BaseView {
    fun renderData(dataModel: DataModel)
}
