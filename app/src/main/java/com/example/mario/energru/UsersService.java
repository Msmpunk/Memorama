package com.example.mario.energru;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UsersService {
    @GET("usuario/")
    Call<User> getUsers();
}
