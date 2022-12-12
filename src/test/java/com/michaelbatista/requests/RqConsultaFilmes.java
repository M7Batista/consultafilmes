package com.michaelbatista.requests;

import io.restassured.response.Response;
import io.restassured.RestAssured;

public class RqConsultaFilmes {


    String baseURI = "http://www.omdbapi.com/";

    public Response getFilme(String idFilme) {
        Response response = (Response) RestAssured.given()
                .contentType("application/json")
                .param("apikey", "ca3ca2c5")
                .param("i", idFilme)
                .get(baseURI);

        return response;
    }
}
