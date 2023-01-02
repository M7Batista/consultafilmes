package com.michaelbatista.stepDefinitions;

import com.michaelbatista.requests.RqConsultaFilmes;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import io.qameta.allure.Allure;
import io.qameta.allure.AllureId;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SDConsultaFilmes2 {

    RqConsultaFilmes rqConsultaFilmes = new RqConsultaFilmes();;


    @AllureId("teste")
    @Test
    @Story("GET Request")
    public void testarConsultaFilmes() {
        Response response = rqConsultaFilmes.getFilme("tt0372784");
        assertEquals(200, response.getStatusCode());
        assertEquals("Batman Begins", response.then().extract().path("Title"));
    }
}