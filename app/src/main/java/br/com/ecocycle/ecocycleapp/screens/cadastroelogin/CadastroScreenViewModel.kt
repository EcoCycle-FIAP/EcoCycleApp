package br.com.ecocycle.ecocycleapp.screens.cadastroelogin

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CadastroScreenViewModel : ViewModel() {

    private val _nome = MutableLiveData<String>()
    val nome: LiveData<String> = _nome

    private val _email = MutableLiveData<String>()
    val email: LiveData<String> = _email

    private val _senha = MutableLiveData<String>()
    val senha: LiveData<String> = _senha

    private val _confSenha = MutableLiveData<String>()
    val confSenha: LiveData<String> = _confSenha

    private val _erro = MutableLiveData<String?>()
    val erro: LiveData<String?> = _erro

    fun onNomeChanged(novoNome: String){
        _nome.value = novoNome
        validarCampos()
    }

    fun onEmailChanged(novoEmail: String){
        _email.value = novoEmail
        validarCampos()
    }

    fun onSenhaChanged(novaSenha: String){
        _senha.value = novaSenha
        validarCampos()
    }

    fun onConfSenhaChanged(novaConfSenha: String){
        _confSenha.value = novaConfSenha
        validarCampos()
    }

    private fun validarCampos() {
        val nome = _nome.value.orEmpty()
        val email = _email.value.orEmpty()
        val senha = _senha.value.orEmpty()
        val confSenha = _confSenha.value.orEmpty()

        //campo  vazio
        if (nome.isBlank() || email.isBlank() || senha.isBlank() || confSenha.isBlank()){
            _erro.value = "Nenhum dos campos pode estar vazio"
            return
        }

        //2 sobrenomes
        if (!nome.contains(" ")){
            _erro.value = "O nome precisa ter ao menos 2 sobrenomes"
            return
        }

        //email
        if (!email.contains("@") || !email.contains(".com")){
            _erro.value = "O email precisa ser válido"
            return
        }

        //senha
        if (senha.length !in 8..20 ||!senha.any { it.isLetter() } || !senha.any { it.isDigit() }){
            _erro.value = "A Senha precisa ter entre 8 a 20 caracteres, contendo ao menos uma letra e um número"
            return
        }

        if (senha != confSenha){
            _erro.value = "As senhas são diferentes"
            return
        }

        _erro.value = null

    }




}