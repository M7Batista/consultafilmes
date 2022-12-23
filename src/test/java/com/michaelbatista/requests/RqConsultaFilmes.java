package com.michaelbatista.requests;

import com.michaelbatista.base.BaseApi;
import io.restassured.response.Response;
import io.restassured.RestAssured;

public class RqConsultaFilmes extends BaseApi {

    public Response getFilme(String idFilme) {
        Response response = null;
        try {
            response = RestAssured.given()
                    .contentType("application/json")
                    .param("apikey", getValue("api.key"))
                    .param("i", idFilme)
                    .get(getValue("base.url"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }
}
