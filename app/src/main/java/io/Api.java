package io;

import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Afandi Indiatsi on 20/03/19.
 */
public interface Api {

    @FormUrlEncoded
    @POST("/oauth/token")
    void oauthToken(@Field("username") String username,
                    @Field("password") String password,
                    @Field("grant_type") String grant_type,
                    @Field("scope") String scope,
                    @Field("client_secret") String client_secret,
                    @Field("client_id") String client_id,
                    Callback<Response> callback);
}