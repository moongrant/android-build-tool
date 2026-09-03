package com.yalla.yalla.api.old.service;

import android.content.Context;
import android.content.res.Resources;
import android.telephony.TelephonyManager;
import androidx.compose.ui.text.StringKt;
import androidx.compose.ui.text.intl.Locale;
import com.appsflyer.AppsFlyerProperties;
import com.code.android.util.o000O00O;
import com.yalla.yalla.model.AccountBindResult;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.open_auth.OpenAuthManager;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p063o0000oO.o00O0O;
import p063o0000oO.o00oO0o;
import p386o0OOooO.o000000;
import p412o0Oo0o0O.o0O00OOO;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001JS\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\u00062\b\b\u0003\u0010\u000b\u001a\u00020\u00062\b\b\u0003\u0010\f\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/yalla/yalla/api/old/service/YallaChatBindApiService;", "", "bindChat", "Lcom/yalla/yalla/model/http/ApiResult;", "Lcom/yalla/yalla/model/AccountBindResult;", "yallaChatAuthCode", "", AppsFlyerProperties.CHANNEL, "", "type", "deviceId", "simCountryCode", "deviceCountryCode", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface YallaChatBindApiService {

    public static final class OooO00o {
        public static Object OooO00o(YallaChatBindApiService yallaChatBindApiService, String str, o0O00OOO.OooO00o oooO00o) {
            String upperCase;
            OpenAuthManager.AuthType authType = OpenAuthManager.AuthType.YallaChat;
            int value = authType.getValue();
            int value2 = authType.getValue();
            String strOooO00o = o000000.OooO00o();
            Context context = o000O00O.OooO00o();
            Intrinsics.checkNotNullParameter(context, "context");
            Object systemService = context.getSystemService("phone");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            String simCountryIso = ((TelephonyManager) systemService).getSimCountryIso();
            String upperCase2 = null;
            if (simCountryIso == null || simCountryIso.length() == 0) {
                upperCase = null;
            } else {
                Intrinsics.checkNotNull(simCountryIso);
                upperCase = StringKt.toUpperCase(simCountryIso, Locale.INSTANCE.getCurrent());
            }
            if (upperCase == null) {
                upperCase = "";
            }
            o00oO0o o00oo0oOooO00o = o00O0O.OooO00o(Resources.getSystem().getConfiguration());
            Intrinsics.checkNotNullExpressionValue(o00oo0oOooO00o, "getLocales(...)");
            if (!o00oo0oOooO00o.OooO0Oo()) {
                java.util.Locale localeOooO0OO = o00oo0oOooO00o.OooO0OO(0);
                String country = localeOooO0OO != null ? localeOooO0OO.getCountry() : null;
                if (!(country == null || country.length() == 0)) {
                    upperCase2 = StringKt.toUpperCase(country, Locale.INSTANCE.getCurrent());
                }
            }
            if (upperCase2 == null) {
                upperCase2 = "";
            }
            return yallaChatBindApiService.bindChat(str, value, value2, strOooO00o, upperCase, upperCase2, oooO00o);
        }
    }

    @FormUrlEncoded
    @POST("/Webservers/User/UserBindingAccount")
    @Nullable
    Object bindChat(@Field("wxcode") @NotNull String str, @Field(AppsFlyerProperties.CHANNEL) int i, @Field("circleId") int i2, @Field("uniqueid") @NotNull String str2, @Field("SimCountryCode") @NotNull String str3, @Field("DeviceCountryCode") @NotNull String str4, @NotNull Continuation<? super ApiResult<AccountBindResult>> continuation);
}
