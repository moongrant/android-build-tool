package com.yalla.yalla.api.old.service;

import com.yalla.yalla.model.http.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/yalla/yalla/api/old/service/LogApiService;", "", "postBuriedPoint", "Lcom/yalla/yalla/model/http/ApiResult;", "", "content", "eventId", "type", "", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface LogApiService {
    @FormUrlEncoded
    @POST("/Webservers/events/point")
    @Nullable
    Object postBuriedPoint(@Field("content") @NotNull String str, @Field("event_id") @NotNull String str2, @Field("type") int i, @NotNull Continuation<? super ApiResult<String>> continuation);
}
