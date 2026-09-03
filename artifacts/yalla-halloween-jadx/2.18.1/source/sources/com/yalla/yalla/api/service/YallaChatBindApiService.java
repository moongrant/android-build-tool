package com.yalla.yalla.api.service;

import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.AccountBindResult;
import com.yalla.yalla.open_auth.OpenAuthManager;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p487o0o000oO.o0Oo0oo;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J?\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/api/service/YallaChatBindApiService;", "", "bindChat", "Lcom/yalla/yalla/common/model/ApiResult;", "Lcom/yalla/yalla/model/AccountBindResult;", "yallaChatAuthCode", "", "channel", "", "type", "deviceId", "(Ljava/lang/String;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface YallaChatBindApiService {

    public static final class OooO00o {
        public static /* synthetic */ Object OooO00o(YallaChatBindApiService yallaChatBindApiService, String str, int i, int i2, String str2, Continuation continuation, int i3, Object obj) {
            OpenAuthManager.AuthType authType = OpenAuthManager.AuthType.YallaChat;
            int value = authType.getValue();
            int value2 = authType.getValue();
            o0Oo0oo o0oo0oo2 = o0Oo0oo.f40947OooO00o;
            return yallaChatBindApiService.bindChat(str, value, value2, o0Oo0oo.OooO00o(), continuation);
        }
    }

    @FormUrlEncoded
    @POST("/Webservers/User/UserBindingAccount")
    @Nullable
    Object bindChat(@Field("wxcode") @NotNull String str, @Field("channel") int i, @Field("circleId") int i2, @Field("uniqueid") @NotNull String str2, @NotNull Continuation<? super ApiResult<AccountBindResult>> continuation);
}
