package com.yalla.yalla.api.service;

import com.yalla.yalla.common.model.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0002\u0010\bJ!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/yalla/yalla/api/service/LogApiService;", "", "postBuriedPoint", "Lcom/yalla/yalla/common/model/ApiResult;", "", "content", "type", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userSearchLog", "userId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface LogApiService {

    public static final class OooO00o {
    }

    @FormUrlEncoded
    @POST("Webservers/events/point")
    @Nullable
    Object postBuriedPoint(@Field("content") @NotNull String str, @Field("type") int i, @NotNull Continuation<? super ApiResult<String>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/Apk/UserSearchLog")
    @Nullable
    Object userSearchLog(@Field("touserid") long j, @NotNull Continuation<? super ApiResult<Object>> continuation);
}
