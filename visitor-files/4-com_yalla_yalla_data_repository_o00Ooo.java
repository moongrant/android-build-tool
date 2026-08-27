package com.yalla.yalla.data.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.appsflyer.AppsFlyerProperties;
import com.code.android.json.JsonUtil;
import com.code.android.util.o0o0Oo;
import com.common.support.crypto.AESKt;
import com.common.support.crypto.Base64ExtensionsKt;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import com.yalla.yalla.api.old.service.MainApiService;
import com.yalla.yalla.api.result.ApiError;
import com.yalla.yalla.api.result.ApiResult;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 1)
@SourceDebugExtension({"SMAP\nLoginRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginRepo.kt\ncom/yalla/yalla/data/repository/LoginRepo\n+ 2 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n+ 3 ApiCall.kt\ncom/yalla/yalla/http/ApiCallKt\n+ 4 JsonUtil.kt\ncom/code/android/json/JsonUtil\n*L\n1#1,387:1\n91#2,14:388\n91#2,14:402\n91#2,14:416\n91#2,14:451\n91#2,14:465\n91#2,14:479\n91#2,14:493\n91#2,14:528\n91#2,14:542\n91#2,14:556\n91#2,14:591\n91#2,14:647\n91#2,14:661\n91#2,14:675\n91#2,14:689\n91#2,14:703\n91#2,14:717\n91#2,14:731\n91#2,14:745\n91#2,14:759\n91#2,14:773\n91#2,14:787\n91#2,14:801\n12#3,8:430\n20#3,12:439\n12#3,8:507\n20#3,12:516\n12#3,8:570\n20#3,12:579\n12#3,8:605\n20#3,12:614\n12#3,8:626\n20#3,12:635\n189#4:438\n189#4:515\n189#4:578\n189#4:613\n189#4:634\n*S KotlinDebug\n*F\n+ 1 LoginRepo.kt\ncom/yalla/yalla/data/repository/LoginRepo\n*L\n42#1:388,14\n57#1:402,14\n81#1:416,14\n104#1:451,14\n123#1:465,14\n148#1:479,14\n169#1:493,14\n192#1:528,14\n206#1:542,14\n232#1:556,14\n260#1:591,14\n276#1:647,14\n282#1:661,14\n290#1:675,14\n303#1:689,14\n317#1:703,14\n330#1:717,14\n341#1:731,14\n351#1:745,14\n361#1:759,14\n370#1:773,14\n379#1:787,14\n386#1:801,14\n93#1:430,8\n93#1:439,12\n182#1:507,8\n182#1:516,12\n251#1:570,8\n251#1:579,12\n264#1:605,8\n264#1:614,12\n267#1:626,8\n267#1:635,12\n93#1:438\n182#1:515\n251#1:578\n264#1:613\n267#1:634\n*E\n"})
public final class o00Ooo extends com.yalla.yalla.repository.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00Ooo f48615OooO00o = new o00Ooo();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO(@NotNull String str, @NotNull String str2, @NotNull ContinuationImpl continuationImpl) {
        LoginRepo$loginByEmail$1 loginRepo$loginByEmail$1;
        com.yalla.yalla.api.call.OooO oooO;
        if (continuationImpl instanceof LoginRepo$loginByEmail$1) {
            loginRepo$loginByEmail$1 = (LoginRepo$loginByEmail$1) continuationImpl;
            int i = loginRepo$loginByEmail$1.f46681OooOO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginRepo$loginByEmail$1.f46681OooOO0 = i - Integer.MIN_VALUE;
            } else {
                loginRepo$loginByEmail$1 = new LoginRepo$loginByEmail$1(this, continuationImpl);
            }
        } else {
            loginRepo$loginByEmail$1 = new LoginRepo$loginByEmail$1(this, continuationImpl);
        }
        Object objOooO0Oo = loginRepo$loginByEmail$1.f46680OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = loginRepo$loginByEmail$1.f46681OooOO0;
        if (i2 == 0) {
            com.yalla.yalla.api.call.OooO oooO2 = new com.yalla.yalla.api.call.OooO(com.yalla.yalla.data.manager.OooO00o.OooO00o(objOooO0Oo, "/Webservers/Account/EmailLogin", "url"), 1);
            oooO2.OooO00o();
            oooO2.OooO0Oo(str, "email");
            oooO2.OooO0Oo(com.yalla.yalla.util.o00Oo0.OooO00o(str2 + com.yalla.yalla.util.OooO00o.f80881OooO0OO), "password");
            p447o0Ooo00.OooOOO0.f93072OooO00o.getClass();
            oooO2.OooO0Oo(p447o0Ooo00.OooOOO0.OooO0OO(), "afId");
            String str3 = com.yalla.yalla.statistical.business.OooO0OO.f75593OooO00o;
            if (str3 == null) {
                str3 = "";
            }
            oooO2.OooO0Oo(str3, "promotionParam");
            LoginRepo$loginByEmail$$inlined$call$1 loginRepo$loginByEmail$$inlined$call$1 = new LoginRepo$loginByEmail$$inlined$call$1(oooO2, null);
            loginRepo$loginByEmail$1.f46679OooO0oO = oooO2;
            loginRepo$loginByEmail$1.f46681OooOO0 = 1;
            objOooO0Oo = com.code.android.util.o0Oo0oo.OooO0Oo(loginRepo$loginByEmail$$inlined$call$1, loginRepo$loginByEmail$1);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            oooO = oooO2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooO = loginRepo$loginByEmail$1.f46679OooO0oO;
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        ApiResult apiResult = (ApiResult) objOooO0Oo;
        if (!apiResult.isSuccess()) {
            com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o.OooO0OO(oooO.f44947OooO00o, false, 0L, apiResult.getMessage());
        }
        return apiResult;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO00o(@NotNull String str, @NotNull ContinuationImpl continuationImpl) {
        LoginRepo$checkEmailRegister$1 loginRepo$checkEmailRegister$1;
        com.yalla.yalla.api.call.OooO oooOOooO00o;
        if (continuationImpl instanceof LoginRepo$checkEmailRegister$1) {
            loginRepo$checkEmailRegister$1 = (LoginRepo$checkEmailRegister$1) continuationImpl;
            int i = loginRepo$checkEmailRegister$1.f46622OooOO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginRepo$checkEmailRegister$1.f46622OooOO0 = i - Integer.MIN_VALUE;
            } else {
                loginRepo$checkEmailRegister$1 = new LoginRepo$checkEmailRegister$1(this, continuationImpl);
            }
        } else {
            loginRepo$checkEmailRegister$1 = new LoginRepo$checkEmailRegister$1(this, continuationImpl);
        }
        Object objOooO0Oo = loginRepo$checkEmailRegister$1.f46621OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = loginRepo$checkEmailRegister$1.f46622OooOO0;
        if (i2 == 0) {
            oooOOooO00o = p033OoooO0.o0OO00O.OooO00o(1, com.yalla.yalla.data.manager.OooO00o.OooO00o(objOooO0Oo, "/Webservers/Account/CheckEmailRegister", "url"), "email", str);
            LoginRepo$checkEmailRegister$$inlined$call$1 loginRepo$checkEmailRegister$$inlined$call$1 = new LoginRepo$checkEmailRegister$$inlined$call$1(oooOOooO00o, null);
            loginRepo$checkEmailRegister$1.f46620OooO0oO = oooOOooO00o;
            loginRepo$checkEmailRegister$1.f46622OooOO0 = 1;
            objOooO0Oo = com.code.android.util.o0Oo0oo.OooO0Oo(loginRepo$checkEmailRegister$$inlined$call$1, loginRepo$checkEmailRegister$1);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooOOooO00o = loginRepo$checkEmailRegister$1.f46620OooO0oO;
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        ApiResult apiResult = (ApiResult) objOooO0Oo;
        if (!apiResult.isSuccess()) {
            com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o.OooO0OO(oooOOooO00o.f44947OooO00o, false, 0L, apiResult.getMessage());
        }
        return apiResult;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0O0(@NotNull String str, @NotNull String str2, @Nullable String str3, int i, @NotNull ContinuationImpl continuationImpl) {
        LoginRepo$checkPhoneRegister$1 loginRepo$checkPhoneRegister$1;
        com.yalla.yalla.api.call.OooO oooOOooO00o;
        if (continuationImpl instanceof LoginRepo$checkPhoneRegister$1) {
            loginRepo$checkPhoneRegister$1 = (LoginRepo$checkPhoneRegister$1) continuationImpl;
            int i2 = loginRepo$checkPhoneRegister$1.f46630OooOO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                loginRepo$checkPhoneRegister$1.f46630OooOO0 = i2 - Integer.MIN_VALUE;
            } else {
                loginRepo$checkPhoneRegister$1 = new LoginRepo$checkPhoneRegister$1(this, continuationImpl);
            }
        } else {
            loginRepo$checkPhoneRegister$1 = new LoginRepo$checkPhoneRegister$1(this, continuationImpl);
        }
        Object objOooO0Oo = loginRepo$checkPhoneRegister$1.f46629OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = loginRepo$checkPhoneRegister$1.f46630OooOO0;
        if (i3 == 0) {
            oooOOooO00o = p033OoooO0.o0OO00O.OooO00o(0, com.yalla.yalla.data.manager.OooO00o.OooO00o(objOooO0Oo, "/Webservers/User/CheckPhoneRegister", "url"), "phone", str);
            oooOOooO00o.OooO0Oo(str2, "countrycode");
            oooOOooO00o.OooO0Oo(str3, "isoCode");
            oooOOooO00o.OooO0Oo(Boxing.boxInt(i), ShareConstants.FEED_SOURCE_PARAM);
            oooOOooO00o.OooO0O0();
            LoginRepo$checkPhoneRegister$$inlined$call$1 loginRepo$checkPhoneRegister$$inlined$call$1 = new LoginRepo$checkPhoneRegister$$inlined$call$1(oooOOooO00o, null);
            loginRepo$checkPhoneRegister$1.f46628OooO0oO = oooOOooO00o;
            loginRepo$checkPhoneRegister$1.f46630OooOO0 = 1;
            objOooO0Oo = com.code.android.util.o0Oo0oo.OooO0Oo(loginRepo$checkPhoneRegister$$inlined$call$1, loginRepo$checkPhoneRegister$1);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooOOooO00o = loginRepo$checkPhoneRegister$1.f46628OooO0oO;
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        ApiResult apiResult = (ApiResult) objOooO0Oo;
        if (!apiResult.isSuccess()) {
            com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o.OooO0OO(oooOOooO00o.f44947OooO00o, false, 0L, apiResult.getMessage());
        }
        if (apiResult.isSuccess()) {
            apiResult.setData(Boxing.boxBoolean(false));
            return apiResult;
        }
        if (apiResult.getCode() == 1011) {
            apiResult.setCode(1000);
            apiResult.setData(Boxing.boxBoolean(true));
        }
        return apiResult;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO0OO(int i, @NotNull String str, @NotNull ContinuationImpl continuationImpl) {
        LoginRepo$checkVerCodeSendType$1 loginRepo$checkVerCodeSendType$1;
        if (continuationImpl instanceof LoginRepo$checkVerCodeSendType$1) {
            loginRepo$checkVerCodeSendType$1 = (LoginRepo$checkVerCodeSendType$1) continuationImpl;
            int i2 = loginRepo$checkVerCodeSendType$1.f46631OooO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                loginRepo$checkVerCodeSendType$1.f46631OooO = i2 - Integer.MIN_VALUE;
            } else {
                loginRepo$checkVerCodeSendType$1 = new LoginRepo$checkVerCodeSendType$1(this, continuationImpl);
            }
        } else {
            loginRepo$checkVerCodeSendType$1 = new LoginRepo$checkVerCodeSendType$1(this, continuationImpl);
        }
        Object obj = loginRepo$checkVerCodeSendType$1.f46632OooO0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = loginRepo$checkVerCodeSendType$1.f46631OooO;
        try {
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            MainApiService mainApiServiceOooO00o = com.yalla.yalla.api.old.OooO0o.OooO00o();
            loginRepo$checkVerCodeSendType$1.f46631OooO = 1;
            Object phoneCodeSendType = mainApiServiceOooO00o.getPhoneCodeSendType(i, str, loginRepo$checkVerCodeSendType$1);
            return phoneCodeSendType == coroutine_suspended ? coroutine_suspended : phoneCodeSendType;
        } catch (IOException e) {
            com.yalla.yalla.util.log.OooOO0.OooO0oO("WebAPIException", e, com.yalla.yalla.http.OooO00o.f49666OooO0oO, 2);
            com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o.OooOo00(String.valueOf(e.getMessage()));
            String strOooO0O0 = com.yalla.yalla.api.old.o000oOoO.OooO0O0(JsonUtil.f27146OooO00o, new ApiError(1, "time out", null, null, 12, null));
            Object objOooO0Oo = JsonUtil.OooO0Oo(ApiResult.class, strOooO0O0 != null ? strOooO0O0 : "");
            Intrinsics.checkNotNull(objOooO0Oo);
            return objOooO0Oo;
        } catch (CancellationException e2) {
            com.yalla.yalla.api.old.o0OoOo0.OooO00o(e2, com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o);
            com.yalla.yalla.util.log.OooOO0.OooO0oO("WebAPIException", e2, com.yalla.yalla.http.OooO0O0.f49667OooO0oO, 2);
            String strOooO0O1 = com.yalla.yalla.api.old.o000oOoO.OooO0O0(JsonUtil.f27146OooO00o, new ApiError(3, "canceled", null, null, 12, null));
            Object objOooO0Oo2 = JsonUtil.OooO0Oo(ApiResult.class, strOooO0O1 != null ? strOooO0O1 : "");
            Intrinsics.checkNotNull(objOooO0Oo2);
            return objOooO0Oo2;
        } catch (Exception e3) {
            com.yalla.yalla.util.log.OooOO0.OooO0oO("WebAPIException", e3, androidx.compose.material3.internal.o000OO.OooO0O0(e3, com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o, e3), 2);
            String message = e3.getMessage();
            if (message == null) {
                message = e3.getClass().getName();
            }
            String str2 = message;
            Intrinsics.checkNotNull(str2);
            String strOooO0O2 = com.yalla.yalla.api.old.o000oOoO.OooO0O0(JsonUtil.f27146OooO00o, new ApiError(2, str2, null, null, 12, null));
            Object objOooO0Oo3 = JsonUtil.OooO0Oo(ApiResult.class, strOooO0O2 != null ? strOooO0O2 : "");
            Intrinsics.checkNotNull(objOooO0Oo3);
            return objOooO0Oo3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0Oo(@NotNull String str, @NotNull String str2, @NotNull ContinuationImpl continuationImpl) {
        LoginRepo$editEmailPwd$1 loginRepo$editEmailPwd$1;
        com.yalla.yalla.api.call.OooO oooO;
        if (continuationImpl instanceof LoginRepo$editEmailPwd$1) {
            loginRepo$editEmailPwd$1 = (LoginRepo$editEmailPwd$1) continuationImpl;
            int i = loginRepo$editEmailPwd$1.f46641OooOO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginRepo$editEmailPwd$1.f46641OooOO0 = i - Integer.MIN_VALUE;
            } else {
                loginRepo$editEmailPwd$1 = new LoginRepo$editEmailPwd$1(this, continuationImpl);
            }
        } else {
            loginRepo$editEmailPwd$1 = new LoginRepo$editEmailPwd$1(this, continuationImpl);
        }
        Object objOooO0Oo = loginRepo$editEmailPwd$1.f46640OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = loginRepo$editEmailPwd$1.f46641OooOO0;
        if (i2 == 0) {
            com.yalla.yalla.api.call.OooO oooO2 = new com.yalla.yalla.api.call.OooO(com.yalla.yalla.api.old.Oooo0.OooO0OO(objOooO0Oo, "/Webservers/Account/EmailPwdEdit", "url"), 1);
            String str3 = com.yalla.yalla.util.OooO00o.f80881OooO0OO;
            oooO2.OooO0Oo(com.yalla.yalla.util.o00Oo0.OooO00o(str + str3), "oldPwd");
            oooO2.OooO0Oo(com.yalla.yalla.util.o00Oo0.OooO00o(str2 + str3), "newPwd");
            LoginRepo$editEmailPwd$$inlined$call$1 loginRepo$editEmailPwd$$inlined$call$1 = new LoginRepo$editEmailPwd$$inlined$call$1(oooO2, null);
            loginRepo$editEmailPwd$1.f46639OooO0oO = oooO2;
            loginRepo$editEmailPwd$1.f46641OooOO0 = 1;
            objOooO0Oo = com.code.android.util.o0Oo0oo.OooO0Oo(loginRepo$editEmailPwd$$inlined$call$1, loginRepo$editEmailPwd$1);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            oooO = oooO2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooO = loginRepo$editEmailPwd$1.f46639OooO0oO;
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        ApiResult apiResult = (ApiResult) objOooO0Oo;
        if (!apiResult.isSuccess()) {
            com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o.OooO0OO(oooO.f44947OooO00o, false, 0L, apiResult.getMessage());
        }
        return apiResult;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0o(int i, @NotNull ContinuationImpl continuationImpl) {
        LoginRepo$getCountry$1 loginRepo$getCountry$1;
        com.yalla.yalla.api.call.OooO oooO;
        if (continuationImpl instanceof LoginRepo$getCountry$1) {
            loginRepo$getCountry$1 = (LoginRepo$getCountry$1) continuationImpl;
            int i2 = loginRepo$getCountry$1.f46657OooOO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                loginRepo$getCountry$1.f46657OooOO0 = i2 - Integer.MIN_VALUE;
            } else {
                loginRepo$getCountry$1 = new LoginRepo$getCountry$1(this, continuationImpl);
            }
        } else {
            loginRepo$getCountry$1 = new LoginRepo$getCountry$1(this, continuationImpl);
        }
        Object objOooO0Oo = loginRepo$getCountry$1.f46656OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = loginRepo$getCountry$1.f46657OooOO0;
        if (i3 == 0) {
            com.yalla.yalla.api.call.OooO oooO2 = new com.yalla.yalla.api.call.OooO(com.yalla.yalla.data.manager.OooO00o.OooO00o(objOooO0Oo, "/Webservers/AppUI/GetCountry", "url"), 0);
            oooO2.OooO0Oo(Boxing.boxInt(i), ShareConstants.FEED_SOURCE_PARAM);
            LoginRepo$getCountry$$inlined$call$1 loginRepo$getCountry$$inlined$call$1 = new LoginRepo$getCountry$$inlined$call$1(oooO2, null);
            loginRepo$getCountry$1.f46655OooO0oO = oooO2;
            loginRepo$getCountry$1.f46657OooOO0 = 1;
            objOooO0Oo = com.code.android.util.o0Oo0oo.OooO0Oo(loginRepo$getCountry$$inlined$call$1, loginRepo$getCountry$1);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            oooO = oooO2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooO = loginRepo$getCountry$1.f46655OooO0oO;
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        ApiResult apiResult = (ApiResult) objOooO0Oo;
        if (!apiResult.isSuccess()) {
            com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o.OooO0OO(oooO.f44947OooO00o, false, 0L, apiResult.getMessage());
        }
        return apiResult;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0o0(@NotNull String str, @NotNull String str2, @NotNull ContinuationImpl continuationImpl) {
        LoginRepo$emailChange$1 loginRepo$emailChange$1;
        com.yalla.yalla.api.call.OooO oooOOooO00o;
        if (continuationImpl instanceof LoginRepo$emailChange$1) {
            loginRepo$emailChange$1 = (LoginRepo$emailChange$1) continuationImpl;
            int i = loginRepo$emailChange$1.f46649OooOO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginRepo$emailChange$1.f46649OooOO0 = i - Integer.MIN_VALUE;
            } else {
                loginRepo$emailChange$1 = new LoginRepo$emailChange$1(this, continuationImpl);
            }
        } else {
            loginRepo$emailChange$1 = new LoginRepo$emailChange$1(this, continuationImpl);
        }
        Object objOooO0Oo = loginRepo$emailChange$1.f46648OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = loginRepo$emailChange$1.f46649OooOO0;
        if (i2 == 0) {
            oooOOooO00o = p033OoooO0.o0OO00O.OooO00o(1, com.yalla.yalla.api.old.Oooo0.OooO0OO(objOooO0Oo, "/Webservers/Account/EmailChange", "url"), "email", str);
            oooOOooO00o.OooO0Oo(str2, "code");
            LoginRepo$emailChange$$inlined$call$1 loginRepo$emailChange$$inlined$call$1 = new LoginRepo$emailChange$$inlined$call$1(oooOOooO00o, null);
            loginRepo$emailChange$1.f46647OooO0oO = oooOOooO00o;
            loginRepo$emailChange$1.f46649OooOO0 = 1;
            objOooO0Oo = com.code.android.util.o0Oo0oo.OooO0Oo(loginRepo$emailChange$$inlined$call$1, loginRepo$emailChange$1);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooOOooO00o = loginRepo$emailChange$1.f46647OooO0oO;
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        ApiResult apiResult = (ApiResult) objOooO0Oo;
        if (!apiResult.isSuccess()) {
            com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o.OooO0OO(oooOOooO00o.f44947OooO00o, false, 0L, apiResult.getMessage());
        }
        return apiResult;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0oO(@NotNull ContinuationImpl continuationImpl) {
        LoginRepo$getYallaPayToken$1 loginRepo$getYallaPayToken$1;
        com.yalla.yalla.api.call.OooO oooO;
        if (continuationImpl instanceof LoginRepo$getYallaPayToken$1) {
            loginRepo$getYallaPayToken$1 = (LoginRepo$getYallaPayToken$1) continuationImpl;
            int i = loginRepo$getYallaPayToken$1.f46665OooOO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginRepo$getYallaPayToken$1.f46665OooOO0 = i - Integer.MIN_VALUE;
            } else {
                loginRepo$getYallaPayToken$1 = new LoginRepo$getYallaPayToken$1(this, continuationImpl);
            }
        } else {
            loginRepo$getYallaPayToken$1 = new LoginRepo$getYallaPayToken$1(this, continuationImpl);
        }
        Object objOooO0Oo = loginRepo$getYallaPayToken$1.f46664OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = loginRepo$getYallaPayToken$1.f46665OooOO0;
        if (i2 == 0) {
            com.yalla.yalla.api.call.OooO oooO2 = new com.yalla.yalla.api.call.OooO(com.yalla.yalla.api.old.Oooo0.OooO0OO(objOooO0Oo, "/Webservers/User/GetYallaPayToken", "url"), 0);
            LoginRepo$getYallaPayToken$$inlined$call$1 loginRepo$getYallaPayToken$$inlined$call$1 = new LoginRepo$getYallaPayToken$$inlined$call$1(oooO2, null);
            loginRepo$getYallaPayToken$1.f46663OooO0oO = oooO2;
            loginRepo$getYallaPayToken$1.f46665OooOO0 = 1;
            objOooO0Oo = com.code.android.util.o0Oo0oo.OooO0Oo(loginRepo$getYallaPayToken$$inlined$call$1, loginRepo$getYallaPayToken$1);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            oooO = oooO2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooO = loginRepo$getYallaPayToken$1.f46663OooO0oO;
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        ApiResult apiResult = (ApiResult) objOooO0Oo;
        if (!apiResult.isSuccess()) {
            com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o.OooO0OO(oooO.f44947OooO00o, false, 0L, apiResult.getMessage());
        }
        return apiResult;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0oo(@Nullable String str, @Nullable String str2, @NotNull ContinuationImpl continuationImpl) {
        LoginRepo$loadLoginConfig$1 loginRepo$loadLoginConfig$1;
        com.yalla.yalla.api.call.OooO oooOOooO00o;
        if (continuationImpl instanceof LoginRepo$loadLoginConfig$1) {
            loginRepo$loadLoginConfig$1 = (LoginRepo$loadLoginConfig$1) continuationImpl;
            int i = loginRepo$loadLoginConfig$1.f46673OooOO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginRepo$loadLoginConfig$1.f46673OooOO0 = i - Integer.MIN_VALUE;
            } else {
                loginRepo$loadLoginConfig$1 = new LoginRepo$loadLoginConfig$1(this, continuationImpl);
            }
        } else {
            loginRepo$loadLoginConfig$1 = new LoginRepo$loadLoginConfig$1(this, continuationImpl);
        }
        Object objOooO0Oo = loginRepo$loadLoginConfig$1.f46672OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = loginRepo$loadLoginConfig$1.f46673OooOO0;
        if (i2 == 0) {
            oooOOooO00o = p033OoooO0.o0OO00O.OooO00o(0, com.yalla.yalla.data.manager.OooO00o.OooO00o(objOooO0Oo, "/Webservers/Api/GetConfigV2", "url"), "SimCountryCode", str);
            oooOOooO00o.OooO0Oo(str2, "DeviceCountryCode");
            p447o0Ooo00.OooOOO0.f93072OooO00o.getClass();
            oooOOooO00o.OooO0Oo(Boxing.boxBoolean(p447o0Ooo00.OooOOO0.OooO()), "isHuawei");
            LoginRepo$loadLoginConfig$$inlined$call$1 loginRepo$loadLoginConfig$$inlined$call$1 = new LoginRepo$loadLoginConfig$$inlined$call$1(oooOOooO00o, null);
            loginRepo$loadLoginConfig$1.f46671OooO0oO = oooOOooO00o;
            loginRepo$loadLoginConfig$1.f46673OooOO0 = 1;
            objOooO0Oo = com.code.android.util.o0Oo0oo.OooO0Oo(loginRepo$loadLoginConfig$$inlined$call$1, loginRepo$loadLoginConfig$1);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooOOooO00o = loginRepo$loadLoginConfig$1.f46671OooO0oO;
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        ApiResult apiResult = (ApiResult) objOooO0Oo;
        if (!apiResult.isSuccess()) {
            com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o.OooO0OO(oooOOooO00o.f44947OooO00o, false, 0L, apiResult.getMessage());
        }
        return apiResult;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooOO0(@NotNull String str, @NotNull ContinuationImpl continuationImpl) {
        LoginRepo$loginByFacebook$1 loginRepo$loginByFacebook$1;
        com.yalla.yalla.api.call.OooO oooO;
        if (continuationImpl instanceof LoginRepo$loginByFacebook$1) {
            loginRepo$loginByFacebook$1 = (LoginRepo$loginByFacebook$1) continuationImpl;
            int i = loginRepo$loginByFacebook$1.f46689OooOO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginRepo$loginByFacebook$1.f46689OooOO0 = i - Integer.MIN_VALUE;
            } else {
                loginRepo$loginByFacebook$1 = new LoginRepo$loginByFacebook$1(this, continuationImpl);
            }
        } else {
            loginRepo$loginByFacebook$1 = new LoginRepo$loginByFacebook$1(this, continuationImpl);
        }
        Object objOooO0Oo = loginRepo$loginByFacebook$1.f46688OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = loginRepo$loginByFacebook$1.f46689OooOO0;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0Oo);
            String strOooO0O0 = com.yalla.yalla.util.Oooo0.OooO0O0(o0o0Oo.OooO00o());
            String strOooO00o = com.yalla.yalla.util.Oooo0.OooO00o();
            String strOooO0Oo = com.yalla.yalla.api.call.OooO0o.OooO0Oo("/Webservers/User/FbLogin");
            com.yalla.yalla.api.call.OooO oooOOooO00o = com.yalla.yalla.data.cache.OooOO0.OooO00o(0, strOooO0Oo, "url", strOooO0Oo);
            oooOOooO00o.OooO0Oo(p447o0Ooo00.OooOo00.OooO0O0(), "deviceid");
            oooOOooO00o.OooO0Oo(str, "accesstoken");
            oooOOooO00o.OooO0Oo(com.yalla.yalla.util.Oooo0.OooO0OO(), "country");
            if (strOooO0O0 == null) {
                strOooO0O0 = "";
            }
            oooOOooO00o.OooO0Oo(strOooO0O0, "SimCountryCode");
            if (strOooO00o == null) {
                strOooO00o = "";
            }
            oooOOooO00o.OooO0Oo(strOooO00o, "DeviceCountryCode");
            p447o0Ooo00.OooOOO0.f93072OooO00o.getClass();
            oooOOooO00o.OooO0Oo(p447o0Ooo00.OooOOO0.OooO0OO(), "afId");
            String str2 = com.yalla.yalla.statistical.business.OooO0OO.f75593OooO00o;
            oooOOooO00o.OooO0Oo(str2 != null ? str2 : "", "promotionParam");
            oooOOooO00o.OooO00o();
            oooOOooO00o.OooO0O0();
            LoginRepo$loginByFacebook$$inlined$call$1 loginRepo$loginByFacebook$$inlined$call$1 = new LoginRepo$loginByFacebook$$inlined$call$1(oooOOooO00o, null);
            loginRepo$loginByFacebook$1.f46687OooO0oO = oooOOooO00o;
            loginRepo$loginByFacebook$1.f46689OooOO0 = 1;
            objOooO0Oo = com.code.android.util.o0Oo0oo.OooO0Oo(loginRepo$loginByFacebook$$inlined$call$1, loginRepo$loginByFacebook$1);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            oooO = oooOOooO00o;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooO = loginRepo$loginByFacebook$1.f46687OooO0oO;
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        ApiResult apiResult = (ApiResult) objOooO0Oo;
        if (!apiResult.isSuccess()) {
            com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o.OooO0OO(oooO.f44947OooO00o, false, 0L, apiResult.getMessage());
        }
        return apiResult;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooOO0O(@NotNull String str, @NotNull ContinuationImpl continuationImpl) {
        LoginRepo$loginByGoogle$1 loginRepo$loginByGoogle$1;
        com.yalla.yalla.api.call.OooO oooOOooO00o;
        if (continuationImpl instanceof LoginRepo$loginByGoogle$1) {
            loginRepo$loginByGoogle$1 = (LoginRepo$loginByGoogle$1) continuationImpl;
            int i = loginRepo$loginByGoogle$1.f46697OooOO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginRepo$loginByGoogle$1.f46697OooOO0 = i - Integer.MIN_VALUE;
            } else {
                loginRepo$loginByGoogle$1 = new LoginRepo$loginByGoogle$1(this, continuationImpl);
            }
        } else {
            loginRepo$loginByGoogle$1 = new LoginRepo$loginByGoogle$1(this, continuationImpl);
        }
        Object objOooO0Oo = loginRepo$loginByGoogle$1.f46696OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = loginRepo$loginByGoogle$1.f46697OooOO0;
        if (i2 == 0) {
            oooOOooO00o = p033OoooO0.o0OO00O.OooO00o(1, com.yalla.yalla.data.manager.OooO00o.OooO00o(objOooO0Oo, "/Webservers/Account/GoogleLogin", "url"), "idToken", str);
            oooOOooO00o.OooO0Oo(p447o0Ooo00.OooOo00.OooO0O0(), "deviceid");
            oooOOooO00o.OooO0Oo(com.yalla.yalla.util.Oooo0.OooO0OO(), "country");
            String strOooO0O0 = com.yalla.yalla.util.Oooo0.OooO0O0(o0o0Oo.OooO00o());
            if (strOooO0O0 == null) {
                strOooO0O0 = "";
            }
            oooOOooO00o.OooO0Oo(strOooO0O0, "SimCountryCode");
            String strOooO00o = com.yalla.yalla.util.Oooo0.OooO00o();
            if (strOooO00o == null) {
                strOooO00o = "";
            }
            oooOOooO00o.OooO0Oo(strOooO00o, "DeviceCountryCode");
            p447o0Ooo00.OooOOO0.f93072OooO00o.getClass();
            oooOOooO00o.OooO0Oo(p447o0Ooo00.OooOOO0.OooO0OO(), "afId");
            String str2 = com.yalla.yalla.statistical.business.OooO0OO.f75593OooO00o;
            oooOOooO00o.OooO0Oo(str2 != null ? str2 : "", "promotionParam");
            oooOOooO00o.OooO00o();
            oooOOooO00o.OooO0O0();
            LoginRepo$loginByGoogle$$inlined$call$1 loginRepo$loginByGoogle$$inlined$call$1 = new LoginRepo$loginByGoogle$$inlined$call$1(oooOOooO00o, null);
            loginRepo$loginByGoogle$1.f46695OooO0oO = oooOOooO00o;
            loginRepo$loginByGoogle$1.f46697OooOO0 = 1;
            objOooO0Oo = com.code.android.util.o0Oo0oo.OooO0Oo(loginRepo$loginByGoogle$$inlined$call$1, loginRepo$loginByGoogle$1);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooOOooO00o = loginRepo$loginByGoogle$1.f46695OooO0oO;
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        ApiResult apiResult = (ApiResult) objOooO0Oo;
        if (!apiResult.isSuccess()) {
            com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o.OooO0OO(oooOOooO00o.f44947OooO00o, false, 0L, apiResult.getMessage());
        }
        return apiResult;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooOO0o(@NotNull String str, @NotNull String str2, @NotNull ContinuationImpl continuationImpl) {
        LoginRepo$loginByPhone$1 loginRepo$loginByPhone$1;
        com.yalla.yalla.api.call.OooO oooOOooO00o;
        if (continuationImpl instanceof LoginRepo$loginByPhone$1) {
            loginRepo$loginByPhone$1 = (LoginRepo$loginByPhone$1) continuationImpl;
            int i = loginRepo$loginByPhone$1.f46705OooOO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginRepo$loginByPhone$1.f46705OooOO0 = i - Integer.MIN_VALUE;
            } else {
                loginRepo$loginByPhone$1 = new LoginRepo$loginByPhone$1(this, continuationImpl);
            }
        } else {
            loginRepo$loginByPhone$1 = new LoginRepo$loginByPhone$1(this, continuationImpl);
        }
        Object objOooO0Oo = loginRepo$loginByPhone$1.f46704OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = loginRepo$loginByPhone$1.f46705OooOO0;
        if (i2 == 0) {
            oooOOooO00o = p033OoooO0.o0OO00O.OooO00o(1, com.yalla.yalla.data.manager.OooO00o.OooO00o(objOooO0Oo, "/Webservers/User/Userlogin", "url"), "account", str);
            oooOOooO00o.OooO0Oo(com.yalla.yalla.util.o00Oo0.OooO00o(str2), "password");
            oooOOooO00o.OooO0Oo(p447o0Ooo00.OooOo00.OooO0O0(), "deviceid");
            oooOOooO00o.OooO00o();
            p447o0Ooo00.OooOOO0.f93072OooO00o.getClass();
            oooOOooO00o.OooO0Oo(p447o0Ooo00.OooOOO0.OooO0OO(), "afId");
            String str3 = com.yalla.yalla.statistical.business.OooO0OO.f75593OooO00o;
            if (str3 == null) {
                str3 = "";
            }
            oooOOooO00o.OooO0Oo(str3, "promotionParam");
            LoginRepo$loginByPhone$$inlined$call$1 loginRepo$loginByPhone$$inlined$call$1 = new LoginRepo$loginByPhone$$inlined$call$1(oooOOooO00o, null);
            loginRepo$loginByPhone$1.f46703OooO0oO = oooOOooO00o;
            loginRepo$loginByPhone$1.f46705OooOO0 = 1;
            objOooO0Oo = com.code.android.util.o0Oo0oo.OooO0Oo(loginRepo$loginByPhone$$inlined$call$1, loginRepo$loginByPhone$1);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooOOooO00o = loginRepo$loginByPhone$1.f46703OooO0oO;
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        ApiResult apiResult = (ApiResult) objOooO0Oo;
        if (!apiResult.isSuccess()) {
            com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o.OooO0OO(oooOOooO00o.f44947OooO00o, false, 0L, apiResult.getMessage());
        }
        return apiResult;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooOOO(int i, @NotNull String str, @NotNull ContinuationImpl continuationImpl) {
        LoginRepo$loginByVisitor$1 loginRepo$loginByVisitor$1;
        com.yalla.yalla.api.call.OooO oooO;
        if (continuationImpl instanceof LoginRepo$loginByVisitor$1) {
            loginRepo$loginByVisitor$1 = (LoginRepo$loginByVisitor$1) continuationImpl;
            int i2 = loginRepo$loginByVisitor$1.f46721OooOO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                loginRepo$loginByVisitor$1.f46721OooOO0 = i2 - Integer.MIN_VALUE;
            } else {
                loginRepo$loginByVisitor$1 = new LoginRepo$loginByVisitor$1(this, continuationImpl);
            }
        } else {
            loginRepo$loginByVisitor$1 = new LoginRepo$loginByVisitor$1(this, continuationImpl);
        }
        Object objOooO0Oo = loginRepo$loginByVisitor$1.f46720OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = loginRepo$loginByVisitor$1.f46721OooOO0;
        if (i3 == 0) {
            com.yalla.yalla.api.call.OooO oooO2 = new com.yalla.yalla.api.call.OooO(com.yalla.yalla.api.old.Oooo0.OooO0OO(objOooO0Oo, "/Webservers/User/VisitorLogin", "url"), 1);
            oooO2.OooO00o();
            oooO2.OooO0Oo(str, RemoteConfigConstants$RequestFieldKey.COUNTRY_CODE);
            p447o0Ooo00.OooOOO0.f93072OooO00o.getClass();
            oooO2.OooO0Oo(p447o0Ooo00.OooOOO0.OooO0OO(), "afId");
            oooO2.OooO0Oo(Boxing.boxInt(i), "visitType");
            String str2 = com.yalla.yalla.statistical.business.OooO0OO.f75593OooO00o;
            if (str2 == null) {
                str2 = "";
            }
            oooO2.OooO0Oo(str2, "promotionParam");
            LoginRepo$loginByVisitor$$inlined$call$1 loginRepo$loginByVisitor$$inlined$call$1 = new LoginRepo$loginByVisitor$$inlined$call$1(oooO2, null);
            loginRepo$loginByVisitor$1.f46719OooO0oO = oooO2;
            loginRepo$loginByVisitor$1.f46721OooOO0 = 1;
            objOooO0Oo = com.code.android.util.o0Oo0oo.OooO0Oo(loginRepo$loginByVisitor$$inlined$call$1, loginRepo$loginByVisitor$1);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            oooO = oooO2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooO = loginRepo$loginByVisitor$1.f46719OooO0oO;
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        ApiResult apiResult = (ApiResult) objOooO0Oo;
        if (!apiResult.isSuccess()) {
            com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o.OooO0OO(oooO.f44947OooO00o, false, 0L, apiResult.getMessage());
        }
        return apiResult;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooOOO0(@NotNull String str, @NotNull String str2, @NotNull ContinuationImpl continuationImpl) {
        LoginRepo$loginByTwitter$1 loginRepo$loginByTwitter$1;
        com.yalla.yalla.api.call.OooO oooO;
        if (continuationImpl instanceof LoginRepo$loginByTwitter$1) {
            loginRepo$loginByTwitter$1 = (LoginRepo$loginByTwitter$1) continuationImpl;
            int i = loginRepo$loginByTwitter$1.f46713OooOO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginRepo$loginByTwitter$1.f46713OooOO0 = i - Integer.MIN_VALUE;
            } else {
                loginRepo$loginByTwitter$1 = new LoginRepo$loginByTwitter$1(this, continuationImpl);
            }
        } else {
            loginRepo$loginByTwitter$1 = new LoginRepo$loginByTwitter$1(this, continuationImpl);
        }
        Object objOooO0Oo = loginRepo$loginByTwitter$1.f46712OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = loginRepo$loginByTwitter$1.f46713OooOO0;
        if (i2 == 0) {
            com.yalla.yalla.api.call.OooO oooO2 = new com.yalla.yalla.api.call.OooO(com.yalla.yalla.data.manager.OooO00o.OooO00o(objOooO0Oo, "/Webservers/User/TwitterLogin", "url"), 0);
            oooO2.OooO0Oo(p447o0Ooo00.OooOo00.OooO0O0(), "deviceid");
            oooO2.OooO0Oo(str, "authtoken");
            oooO2.OooO0Oo(str2, "authtokensecret");
            oooO2.OooO0Oo(com.yalla.yalla.util.Oooo0.OooO0OO(), "country");
            p447o0Ooo00.OooOOO0.f93072OooO00o.getClass();
            oooO2.OooO0Oo(p447o0Ooo00.OooOOO0.OooO0OO(), "afId");
            String str3 = com.yalla.yalla.statistical.business.OooO0OO.f75593OooO00o;
            if (str3 == null) {
                str3 = "";
            }
            oooO2.OooO0Oo(str3, "promotionParam");
            oooO2.OooO00o();
            oooO2.OooO0O0();
            LoginRepo$loginByTwitter$$inlined$call$1 loginRepo$loginByTwitter$$inlined$call$1 = new LoginRepo$loginByTwitter$$inlined$call$1(oooO2, null);
            loginRepo$loginByTwitter$1.f46711OooO0oO = oooO2;
            loginRepo$loginByTwitter$1.f46713OooOO0 = 1;
            objOooO0Oo = com.code.android.util.o0Oo0oo.OooO0Oo(loginRepo$loginByTwitter$$inlined$call$1, loginRepo$loginByTwitter$1);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            oooO = oooO2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooO = loginRepo$loginByTwitter$1.f46711OooO0oO;
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        ApiResult apiResult = (ApiResult) objOooO0Oo;
        if (!apiResult.isSuccess()) {
            com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o.OooO0OO(oooO.f44947OooO00o, false, 0L, apiResult.getMessage());
        }
        return apiResult;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooOOOO(@NotNull String str, @NotNull ContinuationImpl continuationImpl) {
        LoginRepo$loginByWeChat$1 loginRepo$loginByWeChat$1;
        if (continuationImpl instanceof LoginRepo$loginByWeChat$1) {
            loginRepo$loginByWeChat$1 = (LoginRepo$loginByWeChat$1) continuationImpl;
            int i = loginRepo$loginByWeChat$1.f46722OooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginRepo$loginByWeChat$1.f46722OooO = i - Integer.MIN_VALUE;
            } else {
                loginRepo$loginByWeChat$1 = new LoginRepo$loginByWeChat$1(this, continuationImpl);
            }
        } else {
            loginRepo$loginByWeChat$1 = new LoginRepo$loginByWeChat$1(this, continuationImpl);
        }
        Object obj = loginRepo$loginByWeChat$1.f46723OooO0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = loginRepo$loginByWeChat$1.f46722OooO;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            MainApiService mainApiServiceOooO00o = com.yalla.yalla.api.old.OooO0o.OooO00o();
            String strOooO0O0 = p447o0Ooo00.OooOo00.OooO0O0();
            String strOooO0OO = com.yalla.yalla.util.Oooo0.OooO0OO();
            loginRepo$loginByWeChat$1.f46722OooO = 1;
            Object objOooO00o = MainApiService.OooO00o.OooO00o(mainApiServiceOooO00o, str, strOooO0O0, strOooO0OO, loginRepo$loginByWeChat$1);
            return objOooO00o == coroutine_suspended ? coroutine_suspended : objOooO00o;
        } catch (IOException e) {
            com.yalla.yalla.util.log.OooOO0.OooO0oO("WebAPIException", e, com.yalla.yalla.http.OooO00o.f49666OooO0oO, 2);
            com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o.OooOo00(String.valueOf(e.getMessage()));
            String strOooO0O1 = com.yalla.yalla.api.old.o000oOoO.OooO0O0(JsonUtil.f27146OooO00o, new ApiError(1, "time out", null, null, 12, null));
            Object objOooO0Oo = JsonUtil.OooO0Oo(ApiResult.class, strOooO0O1 != null ? strOooO0O1 : "");
            Intrinsics.checkNotNull(objOooO0Oo);
            return objOooO0Oo;
        } catch (CancellationException e2) {
            com.yalla.yalla.api.old.o0OoOo0.OooO00o(e2, com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o);
            com.yalla.yalla.util.log.OooOO0.OooO0oO("WebAPIException", e2, com.yalla.yalla.http.OooO0O0.f49667OooO0oO, 2);
            String strOooO0O2 = com.yalla.yalla.api.old.o000oOoO.OooO0O0(JsonUtil.f27146OooO00o, new ApiError(3, "canceled", null, null, 12, null));
            Object objOooO0Oo2 = JsonUtil.OooO0Oo(ApiResult.class, strOooO0O2 != null ? strOooO0O2 : "");
            Intrinsics.checkNotNull(objOooO0Oo2);
            return objOooO0Oo2;
        } catch (Exception e3) {
            com.yalla.yalla.util.log.OooOO0.OooO0oO("WebAPIException", e3, androidx.compose.material3.internal.o000OO.OooO0O0(e3, com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o, e3), 2);
            String message = e3.getMessage();
            if (message == null) {
                message = e3.getClass().getName();
            }
            String str2 = message;
            Intrinsics.checkNotNull(str2);
            String strOooO0O3 = com.yalla.yalla.api.old.o000oOoO.OooO0O0(JsonUtil.f27146OooO00o, new ApiError(2, str2, null, null, 12, null));
            Object objOooO0Oo3 = JsonUtil.OooO0Oo(ApiResult.class, strOooO0O3 != null ? strOooO0O3 : "");
            Intrinsics.checkNotNull(objOooO0Oo3);
            return objOooO0Oo3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooOOOo(@NotNull String str, @NotNull ContinuationImpl continuationImpl) {
        LoginRepo$loginByYallaChat$1 loginRepo$loginByYallaChat$1;
        com.yalla.yalla.api.call.OooO oooOOooO00o;
        if (continuationImpl instanceof LoginRepo$loginByYallaChat$1) {
            loginRepo$loginByYallaChat$1 = (LoginRepo$loginByYallaChat$1) continuationImpl;
            int i = loginRepo$loginByYallaChat$1.f46732OooOO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginRepo$loginByYallaChat$1.f46732OooOO0 = i - Integer.MIN_VALUE;
            } else {
                loginRepo$loginByYallaChat$1 = new LoginRepo$loginByYallaChat$1(this, continuationImpl);
            }
        } else {
            loginRepo$loginByYallaChat$1 = new LoginRepo$loginByYallaChat$1(this, continuationImpl);
        }
        Object objOooO0Oo = loginRepo$loginByYallaChat$1.f46731OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = loginRepo$loginByYallaChat$1.f46732OooOO0;
        if (i2 == 0) {
            oooOOooO00o = p033OoooO0.o0OO00O.OooO00o(1, com.yalla.yalla.data.manager.OooO00o.OooO00o(objOooO0Oo, "/Webservers/Account/YallaChatLogin", "url"), "code", str);
            oooOOooO00o.OooO0Oo(p447o0Ooo00.OooOo00.OooO0O0(), "deviceid");
            oooOOooO00o.OooO0Oo(com.yalla.yalla.util.Oooo0.OooO0OO(), "country");
            p447o0Ooo00.OooOOO0.f93072OooO00o.getClass();
            oooOOooO00o.OooO0Oo(p447o0Ooo00.OooOOO0.OooO0OO(), "afId");
            String str2 = com.yalla.yalla.statistical.business.OooO0OO.f75593OooO00o;
            if (str2 == null) {
                str2 = "";
            }
            oooOOooO00o.OooO0Oo(str2, "promotionParam");
            oooOOooO00o.OooO0O0();
            LoginRepo$loginByYallaChat$$inlined$call$1 loginRepo$loginByYallaChat$$inlined$call$1 = new LoginRepo$loginByYallaChat$$inlined$call$1(oooOOooO00o, null);
            loginRepo$loginByYallaChat$1.f46730OooO0oO = oooOOooO00o;
            loginRepo$loginByYallaChat$1.f46732OooOO0 = 1;
            objOooO0Oo = com.code.android.util.o0Oo0oo.OooO0Oo(loginRepo$loginByYallaChat$$inlined$call$1, loginRepo$loginByYallaChat$1);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooOOooO00o = loginRepo$loginByYallaChat$1.f46730OooO0oO;
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        ApiResult apiResult = (ApiResult) objOooO0Oo;
        if (!apiResult.isSuccess()) {
            com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o.OooO0OO(oooOOooO00o.f44947OooO00o, false, 0L, apiResult.getMessage());
        }
        return apiResult;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooOOo(int i, @NotNull String str, @NotNull String str2, @NotNull ContinuationImpl continuationImpl) {
        LoginRepo$protectionLoginByPhone$1 loginRepo$protectionLoginByPhone$1;
        com.yalla.yalla.api.call.OooO oooO;
        if (continuationImpl instanceof LoginRepo$protectionLoginByPhone$1) {
            loginRepo$protectionLoginByPhone$1 = (LoginRepo$protectionLoginByPhone$1) continuationImpl;
            int i2 = loginRepo$protectionLoginByPhone$1.f46743OooOO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                loginRepo$protectionLoginByPhone$1.f46743OooOO0 = i2 - Integer.MIN_VALUE;
            } else {
                loginRepo$protectionLoginByPhone$1 = new LoginRepo$protectionLoginByPhone$1(this, continuationImpl);
            }
        } else {
            loginRepo$protectionLoginByPhone$1 = new LoginRepo$protectionLoginByPhone$1(this, continuationImpl);
        }
        Object objOooO0Oo = loginRepo$protectionLoginByPhone$1.f46742OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = loginRepo$protectionLoginByPhone$1.f46743OooOO0;
        if (i3 == 0) {
            com.yalla.yalla.api.call.OooO oooOOooO00o = p033OoooO0.o0OO00O.OooO00o(1, com.yalla.yalla.data.manager.OooO00o.OooO00o(objOooO0Oo, "/Webservers/User/PhoneSaleLogin", "url"), "phone", str);
            oooOOooO00o.OooO0Oo(str2, "code");
            oooOOooO00o.OooO0Oo(Boxing.boxInt(i), "isActivate");
            oooOOooO00o.OooO0Oo(p447o0Ooo00.OooOo00.OooO0Oo(), "phoneBrand");
            oooOOooO00o.OooO0Oo(p447o0Ooo00.OooOo00.OooO0o0(), "phoneType");
            oooOOooO00o.OooO0Oo(p447o0Ooo00.OooOo00.OooO0oO(), "phoneVersion");
            p447o0Ooo00.OooOOO0.f93072OooO00o.getClass();
            oooOOooO00o.OooO0Oo(p447o0Ooo00.OooOOO0.OooO0OO(), "afId");
            String str3 = com.yalla.yalla.statistical.business.OooO0OO.f75593OooO00o;
            if (str3 == null) {
                str3 = "";
            }
            oooOOooO00o.OooO0Oo(str3, "promotionParam");
            oooOOooO00o.OooO00o();
            LoginRepo$protectionLoginByPhone$$inlined$call$1 loginRepo$protectionLoginByPhone$$inlined$call$1 = new LoginRepo$protectionLoginByPhone$$inlined$call$1(oooOOooO00o, null);
            loginRepo$protectionLoginByPhone$1.f46741OooO0oO = oooOOooO00o;
            loginRepo$protectionLoginByPhone$1.f46743OooOO0 = 1;
            objOooO0Oo = com.code.android.util.o0Oo0oo.OooO0Oo(loginRepo$protectionLoginByPhone$$inlined$call$1, loginRepo$protectionLoginByPhone$1);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            oooO = oooOOooO00o;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooO = loginRepo$protectionLoginByPhone$1.f46741OooO0oO;
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        ApiResult apiResult = (ApiResult) objOooO0Oo;
        if (!apiResult.isSuccess()) {
            com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o.OooO0OO(oooO.f44947OooO00o, false, 0L, apiResult.getMessage());
        }
        return apiResult;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    public final Object OooOOo0(@NotNull String str, @NotNull String str2, @NotNull ContinuationImpl continuationImpl) {
        LoginRepo$phoneChange$1 loginRepo$phoneChange$1;
        if (continuationImpl instanceof LoginRepo$phoneChange$1) {
            loginRepo$phoneChange$1 = (LoginRepo$phoneChange$1) continuationImpl;
            int i = loginRepo$phoneChange$1.f46733OooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginRepo$phoneChange$1.f46733OooO = i - Integer.MIN_VALUE;
            } else {
                loginRepo$phoneChange$1 = new LoginRepo$phoneChange$1(this, continuationImpl);
            }
        } else {
            loginRepo$phoneChange$1 = new LoginRepo$phoneChange$1(this, continuationImpl);
        }
        LoginRepo$phoneChange$1 loginRepo$phoneChange$2 = loginRepo$phoneChange$1;
        Object obj = loginRepo$phoneChange$2.f46734OooO0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = loginRepo$phoneChange$2.f46733OooO;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            MainApiService mainApiServiceOooO00o = com.yalla.yalla.api.old.OooO0o.OooO00o();
            loginRepo$phoneChange$2.f46733OooO = 1;
            Object objPhoneChange = mainApiServiceOooO00o.phoneChange(str, str2, p447o0Ooo00.OooOo00.OooO0Oo(), p447o0Ooo00.OooOo00.OooO0o0(), p447o0Ooo00.OooOo00.OooO0oO(), loginRepo$phoneChange$2);
            return objPhoneChange == coroutine_suspended ? coroutine_suspended : objPhoneChange;
        } catch (IOException e) {
            com.yalla.yalla.util.log.OooOO0.OooO0oO("WebAPIException", e, com.yalla.yalla.http.OooO00o.f49666OooO0oO, 2);
            com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o.OooOo00(String.valueOf(e.getMessage()));
            String strOooO0O0 = com.yalla.yalla.api.old.o000oOoO.OooO0O0(JsonUtil.f27146OooO00o, new ApiError(1, "time out", null, null, 12, null));
            Object objOooO0Oo = JsonUtil.OooO0Oo(ApiResult.class, strOooO0O0 != null ? strOooO0O0 : "");
            Intrinsics.checkNotNull(objOooO0Oo);
            return objOooO0Oo;
        } catch (CancellationException e2) {
            com.yalla.yalla.api.old.o0OoOo0.OooO00o(e2, com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o);
            com.yalla.yalla.util.log.OooOO0.OooO0oO("WebAPIException", e2, com.yalla.yalla.http.OooO0O0.f49667OooO0oO, 2);
            String strOooO0O1 = com.yalla.yalla.api.old.o000oOoO.OooO0O0(JsonUtil.f27146OooO00o, new ApiError(3, "canceled", null, null, 12, null));
            Object objOooO0Oo2 = JsonUtil.OooO0Oo(ApiResult.class, strOooO0O1 != null ? strOooO0O1 : "");
            Intrinsics.checkNotNull(objOooO0Oo2);
            return objOooO0Oo2;
        } catch (Exception e3) {
            com.yalla.yalla.util.log.OooOO0.OooO0oO("WebAPIException", e3, androidx.compose.material3.internal.o000OO.OooO0O0(e3, com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o, e3), 2);
            String message = e3.getMessage();
            if (message == null) {
                message = e3.getClass().getName();
            }
            String str3 = message;
            Intrinsics.checkNotNull(str3);
            String strOooO0O2 = com.yalla.yalla.api.old.o000oOoO.OooO0O0(JsonUtil.f27146OooO00o, new ApiError(2, str3, null, null, 12, null));
            Object objOooO0Oo3 = JsonUtil.OooO0Oo(ApiResult.class, strOooO0O2 != null ? strOooO0O2 : "");
            Intrinsics.checkNotNull(objOooO0Oo3);
            return objOooO0Oo3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooOOoo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull ContinuationImpl continuationImpl) {
        LoginRepo$registerByEmail$1 loginRepo$registerByEmail$1;
        com.yalla.yalla.api.call.OooO oooO;
        if (continuationImpl instanceof LoginRepo$registerByEmail$1) {
            loginRepo$registerByEmail$1 = (LoginRepo$registerByEmail$1) continuationImpl;
            int i = loginRepo$registerByEmail$1.f46751OooOO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginRepo$registerByEmail$1.f46751OooOO0 = i - Integer.MIN_VALUE;
            } else {
                loginRepo$registerByEmail$1 = new LoginRepo$registerByEmail$1(this, continuationImpl);
            }
        } else {
            loginRepo$registerByEmail$1 = new LoginRepo$registerByEmail$1(this, continuationImpl);
        }
        Object objOooO0Oo = loginRepo$registerByEmail$1.f46750OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = loginRepo$registerByEmail$1.f46751OooOO0;
        if (i2 == 0) {
            com.yalla.yalla.api.call.OooO oooO2 = new com.yalla.yalla.api.call.OooO(com.yalla.yalla.data.manager.OooO00o.OooO00o(objOooO0Oo, "/Webservers/Account/EmailRegister", "url"), 1);
            oooO2.OooO00o();
            oooO2.OooO0Oo(str, "email");
            oooO2.OooO0Oo(com.yalla.yalla.util.o00Oo0.OooO00o(str2 + com.yalla.yalla.util.OooO00o.f80881OooO0OO), "password");
            oooO2.OooO0Oo(str3, "code");
            p447o0Ooo00.OooOOO0.f93072OooO00o.getClass();
            oooO2.OooO0Oo(p447o0Ooo00.OooOOO0.OooO0OO(), "afId");
            String str4 = com.yalla.yalla.statistical.business.OooO0OO.f75593OooO00o;
            if (str4 == null) {
                str4 = "";
            }
            oooO2.OooO0Oo(str4, "promotionParam");
            LoginRepo$registerByEmail$$inlined$call$1 loginRepo$registerByEmail$$inlined$call$1 = new LoginRepo$registerByEmail$$inlined$call$1(oooO2, null);
            loginRepo$registerByEmail$1.f46749OooO0oO = oooO2;
            loginRepo$registerByEmail$1.f46751OooOO0 = 1;
            objOooO0Oo = com.code.android.util.o0Oo0oo.OooO0Oo(loginRepo$registerByEmail$$inlined$call$1, loginRepo$registerByEmail$1);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            oooO = oooO2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooO = loginRepo$registerByEmail$1.f46749OooO0oO;
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        ApiResult apiResult = (ApiResult) objOooO0Oo;
        if (!apiResult.isSuccess()) {
            com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o.OooO0OO(oooO.f44947OooO00o, false, 0L, apiResult.getMessage());
        }
        return apiResult;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Nullable
    public final Object OooOo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull ContinuationImpl continuationImpl) {
        LoginRepo$userResetPassword$1 loginRepo$userResetPassword$1;
        if (continuationImpl instanceof LoginRepo$userResetPassword$1) {
            loginRepo$userResetPassword$1 = (LoginRepo$userResetPassword$1) continuationImpl;
            int i = loginRepo$userResetPassword$1.f46784OooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginRepo$userResetPassword$1.f46784OooO = i - Integer.MIN_VALUE;
            } else {
                loginRepo$userResetPassword$1 = new LoginRepo$userResetPassword$1(this, continuationImpl);
            }
        } else {
            loginRepo$userResetPassword$1 = new LoginRepo$userResetPassword$1(this, continuationImpl);
        }
        LoginRepo$userResetPassword$1 loginRepo$userResetPassword$2 = loginRepo$userResetPassword$1;
        Object obj = loginRepo$userResetPassword$2.f46785OooO0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = loginRepo$userResetPassword$2.f46784OooO;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            MainApiService mainApiServiceOooO00o = com.yalla.yalla.api.old.OooO0o.OooO00o();
            String strOooO00o = com.yalla.yalla.util.o00Oo0.OooO00o(str2);
            Intrinsics.checkNotNullExpressionValue(strOooO00o, "MD5(...)");
            loginRepo$userResetPassword$2.f46784OooO = 1;
            Object objUserSmRetrievePwd = mainApiServiceOooO00o.userSmRetrievePwd(str, strOooO00o, str3, p447o0Ooo00.OooOo00.OooO0Oo(), p447o0Ooo00.OooOo00.OooO0o0(), p447o0Ooo00.OooOo00.OooO0oO(), loginRepo$userResetPassword$2);
            return objUserSmRetrievePwd == coroutine_suspended ? coroutine_suspended : objUserSmRetrievePwd;
        } catch (IOException e) {
            com.yalla.yalla.util.log.OooOO0.OooO0oO("WebAPIException", e, com.yalla.yalla.http.OooO00o.f49666OooO0oO, 2);
            com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o.OooOo00(String.valueOf(e.getMessage()));
            String strOooO0O0 = com.yalla.yalla.api.old.o000oOoO.OooO0O0(JsonUtil.f27146OooO00o, new ApiError(1, "time out", null, null, 12, null));
            Object objOooO0Oo = JsonUtil.OooO0Oo(ApiResult.class, strOooO0O0 != null ? strOooO0O0 : "");
            Intrinsics.checkNotNull(objOooO0Oo);
            return objOooO0Oo;
        } catch (CancellationException e2) {
            com.yalla.yalla.api.old.o0OoOo0.OooO00o(e2, com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o);
            com.yalla.yalla.util.log.OooOO0.OooO0oO("WebAPIException", e2, com.yalla.yalla.http.OooO0O0.f49667OooO0oO, 2);
            String strOooO0O1 = com.yalla.yalla.api.old.o000oOoO.OooO0O0(JsonUtil.f27146OooO00o, new ApiError(3, "canceled", null, null, 12, null));
            Object objOooO0Oo2 = JsonUtil.OooO0Oo(ApiResult.class, strOooO0O1 != null ? strOooO0O1 : "");
            Intrinsics.checkNotNull(objOooO0Oo2);
            return objOooO0Oo2;
        } catch (Exception e3) {
            com.yalla.yalla.util.log.OooOO0.OooO0oO("WebAPIException", e3, androidx.compose.material3.internal.o000OO.OooO0O0(e3, com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o, e3), 2);
            String message = e3.getMessage();
            if (message == null) {
                message = e3.getClass().getName();
            }
            String str4 = message;
            Intrinsics.checkNotNull(str4);
            String strOooO0O2 = com.yalla.yalla.api.old.o000oOoO.OooO0O0(JsonUtil.f27146OooO00o, new ApiError(2, str4, null, null, 12, null));
            Object objOooO0Oo3 = JsonUtil.OooO0Oo(ApiResult.class, strOooO0O2 != null ? strOooO0O2 : "");
            Intrinsics.checkNotNull(objOooO0Oo3);
            return objOooO0Oo3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooOo0(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull ContinuationImpl continuationImpl) {
        LoginRepo$retrieveEmailPwd$1 loginRepo$retrieveEmailPwd$1;
        com.yalla.yalla.api.call.OooO oooOOooO00o;
        if (continuationImpl instanceof LoginRepo$retrieveEmailPwd$1) {
            loginRepo$retrieveEmailPwd$1 = (LoginRepo$retrieveEmailPwd$1) continuationImpl;
            int i = loginRepo$retrieveEmailPwd$1.f46767OooOO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginRepo$retrieveEmailPwd$1.f46767OooOO0 = i - Integer.MIN_VALUE;
            } else {
                loginRepo$retrieveEmailPwd$1 = new LoginRepo$retrieveEmailPwd$1(this, continuationImpl);
            }
        } else {
            loginRepo$retrieveEmailPwd$1 = new LoginRepo$retrieveEmailPwd$1(this, continuationImpl);
        }
        Object objOooO0Oo = loginRepo$retrieveEmailPwd$1.f46766OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = loginRepo$retrieveEmailPwd$1.f46767OooOO0;
        if (i2 == 0) {
            oooOOooO00o = p033OoooO0.o0OO00O.OooO00o(1, com.yalla.yalla.api.old.Oooo0.OooO0OO(objOooO0Oo, "/Webservers/Account/EmailRetrievePwd", "url"), "email", str);
            oooOOooO00o.OooO0Oo(com.yalla.yalla.util.o00Oo0.OooO00o(str2 + com.yalla.yalla.util.OooO00o.f80881OooO0OO), "password");
            oooOOooO00o.OooO0Oo(str3, "code");
            LoginRepo$retrieveEmailPwd$$inlined$call$1 loginRepo$retrieveEmailPwd$$inlined$call$1 = new LoginRepo$retrieveEmailPwd$$inlined$call$1(oooOOooO00o, null);
            loginRepo$retrieveEmailPwd$1.f46765OooO0oO = oooOOooO00o;
            loginRepo$retrieveEmailPwd$1.f46767OooOO0 = 1;
            objOooO0Oo = com.code.android.util.o0Oo0oo.OooO0Oo(loginRepo$retrieveEmailPwd$$inlined$call$1, loginRepo$retrieveEmailPwd$1);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooOOooO00o = loginRepo$retrieveEmailPwd$1.f46765OooO0oO;
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        ApiResult apiResult = (ApiResult) objOooO0Oo;
        if (!apiResult.isSuccess()) {
            com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o.OooO0OO(oooOOooO00o.f44947OooO00o, false, 0L, apiResult.getMessage());
        }
        return apiResult;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooOo00(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull ContinuationImpl continuationImpl) {
        LoginRepo$registerByPhone$1 loginRepo$registerByPhone$1;
        com.yalla.yalla.api.call.OooO oooOOooO00o;
        if (continuationImpl instanceof LoginRepo$registerByPhone$1) {
            loginRepo$registerByPhone$1 = (LoginRepo$registerByPhone$1) continuationImpl;
            int i = loginRepo$registerByPhone$1.f46759OooOO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginRepo$registerByPhone$1.f46759OooOO0 = i - Integer.MIN_VALUE;
            } else {
                loginRepo$registerByPhone$1 = new LoginRepo$registerByPhone$1(this, continuationImpl);
            }
        } else {
            loginRepo$registerByPhone$1 = new LoginRepo$registerByPhone$1(this, continuationImpl);
        }
        Object objOooO0Oo = loginRepo$registerByPhone$1.f46758OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = loginRepo$registerByPhone$1.f46759OooOO0;
        if (i2 == 0) {
            oooOOooO00o = p033OoooO0.o0OO00O.OooO00o(0, com.yalla.yalla.data.manager.OooO00o.OooO00o(objOooO0Oo, "/Webservers/User/UserSmRegister", "url"), "phone", str);
            oooOOooO00o.OooO0Oo(com.yalla.yalla.util.o00Oo0.OooO00o(str2), "password");
            oooOOooO00o.OooO0Oo(str3, "code");
            oooOOooO00o.OooO0Oo(p447o0Ooo00.OooOo00.OooO0O0(), "deviceid");
            oooOOooO00o.OooO0Oo(com.yalla.yalla.util.Oooo0.OooO0OO(), "country");
            p447o0Ooo00.OooOOO0.f93072OooO00o.getClass();
            oooOOooO00o.OooO0Oo(p447o0Ooo00.OooOOO0.OooO0OO(), "afId");
            String str4 = com.yalla.yalla.statistical.business.OooO0OO.f75593OooO00o;
            if (str4 == null) {
                str4 = "";
            }
            oooOOooO00o.OooO0Oo(str4, "promotionParam");
            oooOOooO00o.OooO00o();
            LoginRepo$registerByPhone$$inlined$call$1 loginRepo$registerByPhone$$inlined$call$1 = new LoginRepo$registerByPhone$$inlined$call$1(oooOOooO00o, null);
            loginRepo$registerByPhone$1.f46757OooO0oO = oooOOooO00o;
            loginRepo$registerByPhone$1.f46759OooOO0 = 1;
            objOooO0Oo = com.code.android.util.o0Oo0oo.OooO0Oo(loginRepo$registerByPhone$$inlined$call$1, loginRepo$registerByPhone$1);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooOOooO00o = loginRepo$registerByPhone$1.f46757OooO0oO;
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        ApiResult apiResult = (ApiResult) objOooO0Oo;
        if (!apiResult.isSuccess()) {
            com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o.OooO0OO(oooOOooO00o.f44947OooO00o, false, 0L, apiResult.getMessage());
        }
        return apiResult;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooOo0O(int i, @NotNull String str, @Nullable String str2, @NotNull ContinuationImpl continuationImpl) {
        LoginRepo$sendEmailCode$1 loginRepo$sendEmailCode$1;
        com.yalla.yalla.api.call.OooO oooO;
        if (continuationImpl instanceof LoginRepo$sendEmailCode$1) {
            loginRepo$sendEmailCode$1 = (LoginRepo$sendEmailCode$1) continuationImpl;
            int i2 = loginRepo$sendEmailCode$1.f46775OooOO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                loginRepo$sendEmailCode$1.f46775OooOO0 = i2 - Integer.MIN_VALUE;
            } else {
                loginRepo$sendEmailCode$1 = new LoginRepo$sendEmailCode$1(this, continuationImpl);
            }
        } else {
            loginRepo$sendEmailCode$1 = new LoginRepo$sendEmailCode$1(this, continuationImpl);
        }
        Object objOooO0Oo = loginRepo$sendEmailCode$1.f46774OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = loginRepo$sendEmailCode$1.f46775OooOO0;
        if (i3 == 0) {
            com.yalla.yalla.api.call.OooO oooOOooO00o = p033OoooO0.o0OO00O.OooO00o(1, com.yalla.yalla.data.manager.OooO00o.OooO00o(objOooO0Oo, "/Webservers/Account/SendEmailCode", "url"), "email", str);
            oooOOooO00o.OooO0Oo(str2, "geetinfo");
            oooOOooO00o.OooO0Oo(Boxing.boxInt(i), "type");
            LoginRepo$sendEmailCode$$inlined$call$1 loginRepo$sendEmailCode$$inlined$call$1 = new LoginRepo$sendEmailCode$$inlined$call$1(oooOOooO00o, null);
            loginRepo$sendEmailCode$1.f46773OooO0oO = oooOOooO00o;
            loginRepo$sendEmailCode$1.f46775OooOO0 = 1;
            objOooO0Oo = com.code.android.util.o0Oo0oo.OooO0Oo(loginRepo$sendEmailCode$$inlined$call$1, loginRepo$sendEmailCode$1);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            oooO = oooOOooO00o;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooO = loginRepo$sendEmailCode$1.f46773OooO0oO;
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        ApiResult apiResult = (ApiResult) objOooO0Oo;
        if (!apiResult.isSuccess()) {
            com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o.OooO0OO(oooO.f44947OooO00o, false, 0L, apiResult.getMessage());
        }
        return apiResult;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooOo0o(@NotNull String str, @NotNull String str2, int i, int i2, int i3, @Nullable String str3, @Nullable String str4, int i4, @NotNull ContinuationImpl continuationImpl) {
        LoginRepo$sendPhoneSmsCode$1 loginRepo$sendPhoneSmsCode$1;
        com.yalla.yalla.api.call.OooO oooO;
        if (continuationImpl instanceof LoginRepo$sendPhoneSmsCode$1) {
            loginRepo$sendPhoneSmsCode$1 = (LoginRepo$sendPhoneSmsCode$1) continuationImpl;
            int i5 = loginRepo$sendPhoneSmsCode$1.f46783OooOO0;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                loginRepo$sendPhoneSmsCode$1.f46783OooOO0 = i5 - Integer.MIN_VALUE;
            } else {
                loginRepo$sendPhoneSmsCode$1 = new LoginRepo$sendPhoneSmsCode$1(this, continuationImpl);
            }
        } else {
            loginRepo$sendPhoneSmsCode$1 = new LoginRepo$sendPhoneSmsCode$1(this, continuationImpl);
        }
        Object obj = loginRepo$sendPhoneSmsCode$1.f46782OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = loginRepo$sendPhoneSmsCode$1.f46783OooOO0;
        if (i6 == 0) {
            com.yalla.yalla.api.call.OooO oooOOooO00o = p033OoooO0.o0OO00O.OooO00o(1, com.yalla.yalla.data.manager.OooO00o.OooO00o(obj, "/Webservers/User/SendPhoneCode", "url"), "phone", str);
            oooOOooO00o.OooO0Oo(str2, "countrycode");
            oooOOooO00o.OooO0Oo(Boxing.boxInt(i), "type");
            oooOOooO00o.OooO0Oo(Boxing.boxInt(i2), AppsFlyerProperties.CHANNEL);
            oooOOooO00o.OooO0Oo(p447o0Ooo00.OooOo00.OooO0O0(), "deviceid");
            oooOOooO00o.OooO0Oo(Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt$default(str2 + "|" + str + "|" + i, com.yalla.yalla.util.OooO00o.f80880OooO0O0, com.yalla.yalla.util.OooO00o.f80879OooO00o, (String) null, 4, (Object) null)), "sign");
            oooOOooO00o.OooO0Oo(Boxing.boxInt(i3), "sendType");
            oooOOooO00o.OooO0Oo(str3, "geetinfo");
            oooOOooO00o.OooO0Oo(str4, "isoCode");
            oooOOooO00o.OooO0Oo(Boxing.boxInt(i4), ShareConstants.FEED_SOURCE_PARAM);
            LoginRepo$sendPhoneSmsCode$$inlined$call$1 loginRepo$sendPhoneSmsCode$$inlined$call$1 = new LoginRepo$sendPhoneSmsCode$$inlined$call$1(oooOOooO00o, null);
            loginRepo$sendPhoneSmsCode$1.f46781OooO0oO = oooOOooO00o;
            loginRepo$sendPhoneSmsCode$1.f46783OooOO0 = 1;
            Object objOooO0Oo = com.code.android.util.o0Oo0oo.OooO0Oo(loginRepo$sendPhoneSmsCode$$inlined$call$1, loginRepo$sendPhoneSmsCode$1);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objOooO0Oo;
            oooO = oooOOooO00o;
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooO = loginRepo$sendPhoneSmsCode$1.f46781OooO0oO;
            ResultKt.throwOnFailure(obj);
        }
        ApiResult apiResult = (ApiResult) obj;
        if (!apiResult.isSuccess()) {
            com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o.OooO0OO(oooO.f44947OooO00o, false, 0L, apiResult.getMessage());
        }
        return apiResult;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooOoO(int i, @NotNull String str, @NotNull String str2, @NotNull ContinuationImpl continuationImpl) {
        LoginRepo$verCode$1 loginRepo$verCode$1;
        com.yalla.yalla.api.call.OooO oooO;
        if (continuationImpl instanceof LoginRepo$verCode$1) {
            loginRepo$verCode$1 = (LoginRepo$verCode$1) continuationImpl;
            int i2 = loginRepo$verCode$1.f46797OooOO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                loginRepo$verCode$1.f46797OooOO0 = i2 - Integer.MIN_VALUE;
            } else {
                loginRepo$verCode$1 = new LoginRepo$verCode$1(this, continuationImpl);
            }
        } else {
            loginRepo$verCode$1 = new LoginRepo$verCode$1(this, continuationImpl);
        }
        Object objOooO0Oo = loginRepo$verCode$1.f46796OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = loginRepo$verCode$1.f46797OooOO0;
        if (i3 == 0) {
            com.yalla.yalla.api.call.OooO oooOOooO00o = p033OoooO0.o0OO00O.OooO00o(0, com.yalla.yalla.data.manager.OooO00o.OooO00o(objOooO0Oo, "/Webservers/User/VerCode", "url"), "phone", str);
            oooOOooO00o.OooO0Oo(str2, "code");
            oooOOooO00o.OooO0Oo(Boxing.boxInt(i), "type");
            LoginRepo$verCode$$inlined$call$1 loginRepo$verCode$$inlined$call$1 = new LoginRepo$verCode$$inlined$call$1(oooOOooO00o, null);
            loginRepo$verCode$1.f46795OooO0oO = oooOOooO00o;
            loginRepo$verCode$1.f46797OooOO0 = 1;
            objOooO0Oo = com.code.android.util.o0Oo0oo.OooO0Oo(loginRepo$verCode$$inlined$call$1, loginRepo$verCode$1);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            oooO = oooOOooO00o;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooO = loginRepo$verCode$1.f46795OooO0oO;
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        ApiResult apiResult = (ApiResult) objOooO0Oo;
        if (!apiResult.isSuccess()) {
            com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o.OooO0OO(oooO.f44947OooO00o, false, 0L, apiResult.getMessage());
        }
        return apiResult;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooOoO0(long j, @NotNull String str, @NotNull ContinuationImpl continuationImpl) {
        LoginRepo$userUnblockAppeal$1 loginRepo$userUnblockAppeal$1;
        if (continuationImpl instanceof LoginRepo$userUnblockAppeal$1) {
            loginRepo$userUnblockAppeal$1 = (LoginRepo$userUnblockAppeal$1) continuationImpl;
            int i = loginRepo$userUnblockAppeal$1.f46787OooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginRepo$userUnblockAppeal$1.f46787OooO = i - Integer.MIN_VALUE;
            } else {
                loginRepo$userUnblockAppeal$1 = new LoginRepo$userUnblockAppeal$1(this, continuationImpl);
            }
        } else {
            loginRepo$userUnblockAppeal$1 = new LoginRepo$userUnblockAppeal$1(this, continuationImpl);
        }
        Object obj = loginRepo$userUnblockAppeal$1.f46788OooO0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = loginRepo$userUnblockAppeal$1.f46787OooO;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            MainApiService mainApiServiceOooO00o = com.yalla.yalla.api.old.OooO0o.OooO00o();
            String strOooO0O0 = com.yalla.yalla.util.o00Oo0.OooO0O0(str);
            Intrinsics.checkNotNullExpressionValue(strOooO0O0, "utf8ToUnicode(...)");
            loginRepo$userUnblockAppeal$1.f46787OooO = 1;
            Object objUserUnblockAppeal = mainApiServiceOooO00o.userUnblockAppeal(j, strOooO0O0, loginRepo$userUnblockAppeal$1);
            return objUserUnblockAppeal == coroutine_suspended ? coroutine_suspended : objUserUnblockAppeal;
        } catch (IOException e) {
            com.yalla.yalla.util.log.OooOO0.OooO0oO("WebAPIException", e, com.yalla.yalla.http.OooO00o.f49666OooO0oO, 2);
            com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o.OooOo00(String.valueOf(e.getMessage()));
            String strOooO0O1 = com.yalla.yalla.api.old.o000oOoO.OooO0O0(JsonUtil.f27146OooO00o, new ApiError(1, "time out", null, null, 12, null));
            Object objOooO0Oo = JsonUtil.OooO0Oo(ApiResult.class, strOooO0O1 != null ? strOooO0O1 : "");
            Intrinsics.checkNotNull(objOooO0Oo);
            return objOooO0Oo;
        } catch (CancellationException e2) {
            com.yalla.yalla.api.old.o0OoOo0.OooO00o(e2, com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o);
            com.yalla.yalla.util.log.OooOO0.OooO0oO("WebAPIException", e2, com.yalla.yalla.http.OooO0O0.f49667OooO0oO, 2);
            String strOooO0O2 = com.yalla.yalla.api.old.o000oOoO.OooO0O0(JsonUtil.f27146OooO00o, new ApiError(3, "canceled", null, null, 12, null));
            Object objOooO0Oo2 = JsonUtil.OooO0Oo(ApiResult.class, strOooO0O2 != null ? strOooO0O2 : "");
            Intrinsics.checkNotNull(objOooO0Oo2);
            return objOooO0Oo2;
        } catch (Exception e3) {
            com.yalla.yalla.util.log.OooOO0.OooO0oO("WebAPIException", e3, androidx.compose.material3.internal.o000OO.OooO0O0(e3, com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o, e3), 2);
            String message = e3.getMessage();
            if (message == null) {
                message = e3.getClass().getName();
            }
            String str2 = message;
            Intrinsics.checkNotNull(str2);
            String strOooO0O3 = com.yalla.yalla.api.old.o000oOoO.OooO0O0(JsonUtil.f27146OooO00o, new ApiError(2, str2, null, null, 12, null));
            Object objOooO0Oo3 = JsonUtil.OooO0Oo(ApiResult.class, strOooO0O3 != null ? strOooO0O3 : "");
            Intrinsics.checkNotNull(objOooO0Oo3);
            return objOooO0Oo3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooOoOO(@NotNull String str, @NotNull String str2, @NotNull ContinuationImpl continuationImpl) {
        LoginRepo$verEmailPassword$1 loginRepo$verEmailPassword$1;
        com.yalla.yalla.api.call.OooO oooOOooO00o;
        if (continuationImpl instanceof LoginRepo$verEmailPassword$1) {
            loginRepo$verEmailPassword$1 = (LoginRepo$verEmailPassword$1) continuationImpl;
            int i = loginRepo$verEmailPassword$1.f46805OooOO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginRepo$verEmailPassword$1.f46805OooOO0 = i - Integer.MIN_VALUE;
            } else {
                loginRepo$verEmailPassword$1 = new LoginRepo$verEmailPassword$1(this, continuationImpl);
            }
        } else {
            loginRepo$verEmailPassword$1 = new LoginRepo$verEmailPassword$1(this, continuationImpl);
        }
        Object objOooO0Oo = loginRepo$verEmailPassword$1.f46804OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = loginRepo$verEmailPassword$1.f46805OooOO0;
        if (i2 == 0) {
            oooOOooO00o = p033OoooO0.o0OO00O.OooO00o(1, com.yalla.yalla.api.old.Oooo0.OooO0OO(objOooO0Oo, "/Webservers/Account/VerEmailPassword", "url"), "email", str);
            oooOOooO00o.OooO0Oo(com.yalla.yalla.util.o00Oo0.OooO00o(str2 + com.yalla.yalla.util.OooO00o.f80881OooO0OO), "password");
            LoginRepo$verEmailPassword$$inlined$call$1 loginRepo$verEmailPassword$$inlined$call$1 = new LoginRepo$verEmailPassword$$inlined$call$1(oooOOooO00o, null);
            loginRepo$verEmailPassword$1.f46803OooO0oO = oooOOooO00o;
            loginRepo$verEmailPassword$1.f46805OooOO0 = 1;
            objOooO0Oo = com.code.android.util.o0Oo0oo.OooO0Oo(loginRepo$verEmailPassword$$inlined$call$1, loginRepo$verEmailPassword$1);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooOOooO00o = loginRepo$verEmailPassword$1.f46803OooO0oO;
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        ApiResult apiResult = (ApiResult) objOooO0Oo;
        if (!apiResult.isSuccess()) {
            com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o.OooO0OO(oooOOooO00o.f44947OooO00o, false, 0L, apiResult.getMessage());
        }
        return apiResult;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooOoo0(int i, @NotNull String str, @NotNull String str2, @NotNull ContinuationImpl continuationImpl) {
        LoginRepo$verifyEmailCode$1 loginRepo$verifyEmailCode$1;
        com.yalla.yalla.api.call.OooO oooO;
        if (continuationImpl instanceof LoginRepo$verifyEmailCode$1) {
            loginRepo$verifyEmailCode$1 = (LoginRepo$verifyEmailCode$1) continuationImpl;
            int i2 = loginRepo$verifyEmailCode$1.f46813OooOO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                loginRepo$verifyEmailCode$1.f46813OooOO0 = i2 - Integer.MIN_VALUE;
            } else {
                loginRepo$verifyEmailCode$1 = new LoginRepo$verifyEmailCode$1(this, continuationImpl);
            }
        } else {
            loginRepo$verifyEmailCode$1 = new LoginRepo$verifyEmailCode$1(this, continuationImpl);
        }
        Object objOooO0Oo = loginRepo$verifyEmailCode$1.f46812OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = loginRepo$verifyEmailCode$1.f46813OooOO0;
        if (i3 == 0) {
            com.yalla.yalla.api.call.OooO oooOOooO00o = p033OoooO0.o0OO00O.OooO00o(1, com.yalla.yalla.data.manager.OooO00o.OooO00o(objOooO0Oo, "/Webservers/Account/VerifyEmailCode", "url"), "email", str);
            oooOOooO00o.OooO0Oo(str2, "code");
            oooOOooO00o.OooO0Oo(Boxing.boxInt(i), "type");
            LoginRepo$verifyEmailCode$$inlined$call$1 loginRepo$verifyEmailCode$$inlined$call$1 = new LoginRepo$verifyEmailCode$$inlined$call$1(oooOOooO00o, null);
            loginRepo$verifyEmailCode$1.f46811OooO0oO = oooOOooO00o;
            loginRepo$verifyEmailCode$1.f46813OooOO0 = 1;
            objOooO0Oo = com.code.android.util.o0Oo0oo.OooO0Oo(loginRepo$verifyEmailCode$$inlined$call$1, loginRepo$verifyEmailCode$1);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            oooO = oooOOooO00o;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooO = loginRepo$verifyEmailCode$1.f46811OooO0oO;
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        ApiResult apiResult = (ApiResult) objOooO0Oo;
        if (!apiResult.isSuccess()) {
            com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o.OooO0OO(oooO.f44947OooO00o, false, 0L, apiResult.getMessage());
        }
        return apiResult;
    }
}
