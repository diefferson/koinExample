package br.com.disapps.simplemvvm.ui.home

import android.arch.lifecycle.ViewModel
import br.com.disapps.simplemvvm.api.IRestApi

/**
 * Created by diefferson on 29/11/2017.
 */
class HomeViewModel(var iRestApi: IRestApi) : ViewModel() {
    var teste  =  "HEllo Teste"
    var mensagem = "Mensagem"
}