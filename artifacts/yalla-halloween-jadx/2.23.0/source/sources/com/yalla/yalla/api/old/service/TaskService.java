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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lcom/yalla/yalla/api/old/service/TaskService;", "", "yallaChatBindTask", "Lcom/yalla/yalla/model/http/ApiResult;", "", "code", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface TaskService {
    @FormUrlEncoded
    @POST("/Webservers/Account/YallaChatAuthVerify")
    @Nullable
    Object yallaChatBindTask(@Field("code") @NotNull String str, @NotNull Continuation<? super ApiResult<String>> continuation);
}
