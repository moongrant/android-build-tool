package com.yalla.yalla.api.old.service;

import com.appsflyer.AppsFlyerProperties;
import com.yalla.yalla.model.AccountBindResult;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.open_auth.OpenAuthManager;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p382o0OOoo0o.oo000o;
import p406o0Oo0Ooo.p0;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J?\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/api/old/service/YallaChatBindApiService;", "", "bindChat", "Lcom/yalla/yalla/model/http/ApiResult;", "Lcom/yalla/yalla/model/AccountBindResult;", "yallaChatAuthCode", "", AppsFlyerProperties.CHANNEL, "", "type", "deviceId", "(Ljava/lang/String;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface YallaChatBindApiService {

    public static final class OooO00o {
        public static /* synthetic */ Object OooO00o(YallaChatBindApiService yallaChatBindApiService, String str, p0.OooO00o oooO00o) {
            OpenAuthManager.AuthType authType = OpenAuthManager.AuthType.YallaChat;
            return yallaChatBindApiService.bindChat(str, authType.getValue(), authType.getValue(), oo000o.OooO00o(), oooO00o);
        }
    }

    @FormUrlEncoded
    @POST("/Webservers/User/UserBindingAccount")
    @Nullable
    Object bindChat(@Field("wxcode") @NotNull String str, @Field(AppsFlyerProperties.CHANNEL) int i, @Field("circleId") int i2, @Field("uniqueid") @NotNull String str2, @NotNull Continuation<? super ApiResult<AccountBindResult>> continuation);
}
