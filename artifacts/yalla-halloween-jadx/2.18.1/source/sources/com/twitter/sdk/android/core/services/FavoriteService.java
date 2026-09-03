package com.twitter.sdk.android.core.services;

import com.facebook.AccessToken;
import java.util.List;
import p436o0OoOOOO.o0O00OOO;
import retrofit2.OooO0O0;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes2.dex */
public interface FavoriteService {
    @FormUrlEncoded
    @POST("/1.1/favorites/create.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    OooO0O0<o0O00OOO> create(@Field("id") Long l, @Field("include_entities") Boolean bool);

    @FormUrlEncoded
    @POST("/1.1/favorites/destroy.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    OooO0O0<o0O00OOO> destroy(@Field("id") Long l, @Field("include_entities") Boolean bool);

    @GET("/1.1/favorites/list.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    OooO0O0<List<o0O00OOO>> list(@Query(AccessToken.USER_ID_KEY) Long l, @Query("screen_name") String str, @Query("count") Integer num, @Query("since_id") String str2, @Query("max_id") String str3, @Query("include_entities") Boolean bool);
}
