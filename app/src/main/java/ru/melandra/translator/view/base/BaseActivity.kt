package ru.melandra.translator.view.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.melandra.translator.model.data.DataModel
import ru.melandra.translator.presenter.Presenter

abstract class BaseActivity<T : DataModel> : AppCompatActivity(), BaseView {

    protected lateinit var presenter: Presenter<T, BaseView>
    protected abstract fun createPresenter(): Presenter<T, BaseView>
    abstract override fun renderData(dataModel: DataModel)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = createPresenter()
    }

    override fun onStart() {
        super.onStart()
        presenter.attachView(this)
    }

    override fun onStop() {
        super.onStop()
        presenter.detachView(this)
    }
}
