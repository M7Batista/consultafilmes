package com.michaelbatista.stepDefinitions;

import static org.junit.Assert.assertEquals;

import com.michaelbatista.requests.RqConsultaFilmes;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import io.restassured.response.Response;


public class SDConsultaFilmes {

    RqConsultaFilmes rqConsultaFilmes;

    Response response;

    @Dado("uma requisicao para consulta de filmes")
    public void umaRequisicaoParaConsultaDeFilmes(){
        rqConsultaFilmes = new RqConsultaFilmes();
    }
    @Quando("for informado o ID {string}")
    public void forInformadoOID(String idFilme){
        response = rqConsultaFilmes.getFilme(idFilme);
    }
    @Quando("for informado um ID invalido {string}")
    public void forInformadoUmIDInvalido(String idFilme){
        response = rqConsultaFilmes.getFilme(idFilme);
    }
    @Então("sera retornado os dados do filme {string}")
    public void seraRetornadoOsDadosDoFilme(String title){
        assertEquals(200, response.getStatusCode());
        assertEquals(title, response.then().extract().path("Title"));
    }
    @Então("sera retornado o erro {string}")
    public void seraRetornadoOErro(String errorMsg){
        assertEquals(200, response.getStatusCode());
        assertEquals(errorMsg, response.then().extract().path("Error"));
    }
}