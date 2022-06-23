package com.example.registro.ui.home;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RegisterApi {
    String API_ROUTE = "/api/registro";

    @POST(API_ROUTE)
    Call<Register> createpost(@Body Register post);
}
