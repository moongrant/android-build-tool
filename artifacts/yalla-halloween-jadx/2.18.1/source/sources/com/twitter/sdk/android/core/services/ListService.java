package com.twitter.sdk.android.core.services;

import java.util.List;
import p436o0OoOOOO.o0O00OOO;
import retrofit2.OooO0O0;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes2.dex */
public interface ListService {
    @GET("/1.1/lists/statuses.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    OooO0O0<List<o0O00OOO>> statuses(@Query("list_id") Long l, @Query("slug") String str, @Query("owner_screen_name") String str2, @Query("owner_id") Long l2, @Query("since_id") Long l3, @Query("max_id") Long l4, @Query("count") Integer num, @Query("include_entities") Boolean bool, @Query("include_rts") Boolean bool2);
}
