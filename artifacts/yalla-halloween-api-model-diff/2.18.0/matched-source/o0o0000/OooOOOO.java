package o0o0000;

import android.app.Activity;
import android.os.Looper;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.manager.error.CommonError;
import com.yalla.yalla.common.manager.error.CommonErrorHandler;
import com.yalla.yalla.common.model.AdditionalData;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiError1058;
import com.yalla.yalla.common.model.ApiError2056;
import com.yalla.yalla.common.model.ApiError2062;
import com.yalla.yalla.data.db.model.ApiErrorCodeDB;
import io.agora.rtc.Constants;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.conscrypt.NativeConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p074o000O0oo.OooOOO;
import p190o00o00oO.oo0o0Oo;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o000Oo0;
import p255o00ooO0O.o00O000;
import p255o00ooO0O.o0O0ooO;
import p256o00ooO0o.oo0oOO0;
import p517o0o0O00.o00O00;
import p518o0o0O000.o0Oo0oo;
import p623o0oo0o0o.oo00o;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.api.ApiErrorHandler$post$1", f = "ApiErrorHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class OooOOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ ApiError f40825Oooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(ApiError apiError, Continuation<? super OooOOOO> continuation) {
        super(2, continuation);
        this.f40825Oooo = apiError;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooOOOO(this.f40825Oooo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooOOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        AdditionalData additionalData;
        String reason;
        String message;
        String message2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int code2 = this.f40825Oooo.getCode();
        String message3 = this.f40825Oooo.getMessage();
        o00O00.OooO0OO("ApiErrorHandler", "handle code = " + code2 + ", message = " + message3);
        if (code2 == 1 || code2 == 2) {
            ToastUtil.f12582OooO00o.OooO00o(R.string.Network_request_failed);
        } else if (code2 != 3) {
            if (code2 != 1005) {
                ApiError2062.MessageModel messageModel = null;
                messageModel = null;
                ApiError2056.MessageModel messageModel2 = null;
                messageModel = null;
                if (code2 == 1059) {
                    ApiError1058 apiError1058 = (ApiError1058) o0Oo0oo.OooO0OO(message3, ApiError1058.class);
                    if (apiError1058 != null && (additionalData = apiError1058.getAdditionalData()) != null) {
                        p500o0o00Oo0.OooOOO oooOOO = p500o0o00Oo0.OooOOO.f41235OooO00o;
                        oooOOO.OooOo00().postValue(additionalData.getActiveToken());
                        oooOOO.OooOo().postValue(Long.valueOf(additionalData.getUserId()));
                    }
                    LiveEventBus.get("ACTIVE_ACCOUNT").post(null);
                } else if (code2 == 1202) {
                    o00O000 o00o001 = o00O000.f34368OooO00o;
                    Activity activityOooO0O0 = o00O000.OooO0O0();
                    if (activityOooO0O0 != null) {
                        oo0oOO0 oo0ooo0 = new oo0oOO0(activityOooO0O0);
                        oo0ooo0.OooOo0(R.string.no_room_tip);
                        oo0ooo0.OooOOOo(R.string.Creat_Room);
                        oo0ooo0.OooOo0o(new OooO0o(activityOooO0O0));
                        oo0ooo0.OooOOO0();
                    }
                } else if (code2 == 2003) {
                    oo0o0Oo.OooO0O0(CommonError.Coin_NotEnough, null, 2, null, CommonErrorHandler.INSTANCE);
                } else if (code2 == 2008) {
                    oo0o0Oo.OooO0O0(CommonError.Crystal_NotEnough, null, 2, null, CommonErrorHandler.INSTANCE);
                } else if (code2 == 2062) {
                    ApiError2062 apiError2062 = (ApiError2062) o0Oo0oo.OooO0OO(message3, ApiError2062.class);
                    if (apiError2062 != null && (message = apiError2062.getMessage()) != null) {
                        messageModel = (ApiError2062.MessageModel) o0Oo0oo.OooO0OO(message, ApiError2062.MessageModel.class);
                    }
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.event_create_err_time_message);
                    String[] strArr = new String[2];
                    strArr[0] = oo00o.f48643OooO00o.OooO0O0(messageModel != null ? messageModel.getUnblockTime() : 0L, "dd/MM/yyyy HH:mm", "GMT+02");
                    if (messageModel == null || (reason = messageModel.getReason()) == null) {
                        reason = "";
                    }
                    strArr[1] = reason;
                    String strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO, strArr);
                    o00O000 o00o002 = o00O000.f34368OooO00o;
                    Activity activityOooO0O1 = o00O000.OooO0O0();
                    if (activityOooO0O1 != null) {
                        oo0oOO0 oo0ooo1 = new oo0oOO0(activityOooO0O1);
                        oo0ooo1.OooOo0O(strOooO00o);
                        oo0ooo1.OooOOO0();
                    }
                } else if (code2 == 3001) {
                    o00O000 o00o003 = o00O000.f34368OooO00o;
                    Activity activityOooO0O2 = o00O000.OooO0O0();
                    if (activityOooO0O2 != null) {
                        oo0oOO0 oo0ooo2 = new oo0oOO0(activityOooO0O2);
                        oo0ooo2.OooOo0(R.string.feature_not_available);
                        oo0ooo2.OooOOOo(R.string.Update_Now);
                        oo0ooo2.OooOo0o(OooOo00.f40830Oooo);
                        oo0oOO0.OooOoo0(oo0ooo2, false, 1, null);
                        oo0ooo2.OooOOO0();
                    }
                } else if (code2 == 3003) {
                    o00O000 o00o004 = o00O000.f34368OooO00o;
                    Activity activityOooO0O3 = o00O000.OooO0O0();
                    if (activityOooO0O3 != null) {
                        oo0oOO0 oo0ooo3 = new oo0oOO0(activityOooO0O3);
                        oo0ooo3.OooOo0(R.string.Recharge_Page_CopyUnder_maintenance_Dialog);
                        oo0ooo3.OooOOOo(R.string.OK);
                        oo0ooo3.OooOo0o(OooO0OO.f40819Oooo);
                        oo0ooo3.OooOOO0();
                    }
                } else if (code2 == 2056) {
                    ApiError2056 apiError2056 = (ApiError2056) o0Oo0oo.OooO0OO(message3, ApiError2056.class);
                    if (apiError2056 != null && (message2 = apiError2056.getMessage()) != null) {
                        messageModel2 = (ApiError2056.MessageModel) o0Oo0oo.OooO0OO(message2, ApiError2056.MessageModel.class);
                    }
                    String strOooO0OO2 = o000O0O0.OooO0OO(R.string.event_create_err_count_max);
                    String[] strArr2 = new String[1];
                    strArr2[0] = String.valueOf(messageModel2 != null ? messageModel2.getMaxCreateNum() : 10);
                    String strOooO00o2 = com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO2, strArr2);
                    o00O000 o00o005 = o00O000.f34368OooO00o;
                    Activity activityOooO0O4 = o00O000.OooO0O0();
                    if (activityOooO0O4 != null) {
                        oo0oOO0 oo0ooo4 = new oo0oOO0(activityOooO0O4);
                        oo0ooo4.OooOo0O(strOooO00o2);
                        oo0ooo4.OooOOO0();
                    }
                } else if (code2 == 2057) {
                    o00O000 o00o006 = o00O000.f34368OooO00o;
                    Activity activityOooO0O5 = o00O000.OooO0O0();
                    if (activityOooO0O5 != null) {
                        oo0oOO0 oo0ooo5 = new oo0oOO0(activityOooO0O5);
                        oo0ooo5.OooOo0O(o000O0O0.OooO0OO(R.string.event_create_err_room_level_reaches10));
                        oo0ooo5.OooOo0o(OooO.f40786Oooo);
                        oo0ooo5.OooOOO0();
                    }
                } else if (code2 == 2084) {
                    o00O000 o00o007 = o00O000.f34368OooO00o;
                    Activity activityOooO0O6 = o00O000.OooO0O0();
                    if (activityOooO0O6 != null) {
                        oo0oOO0 oo0ooo6 = new oo0oOO0(activityOooO0O6);
                        oo0ooo6.OooOo0(R.string.only_premium_purchase);
                        oo0ooo6.OooOOOo(R.string.Get_Yalla_Premium);
                        oo0ooo6.OooOo0o(new OooOO0(activityOooO0O6));
                        oo0ooo6.OooOo(OooOO0O.f40822Oooo);
                        oo0ooo6.OooOOO0();
                    }
                } else if (code2 != 2085) {
                    new p137o00OO0oO.OooO0OO().OooO00o(String.valueOf(code2), new o00OO0oO.OooO0OO.OooO0O0() { // from class: o0O0Oooo.o000OO0O
                        @Override // o00OO0oO.OooO0OO.OooO0O0
                        public final void OooO00o(ApiErrorCodeDB apiErrorCodeDB) {
                            int iOooO0OO = o000Oo0.OooO0OO(apiErrorCodeDB.Code, 0);
                            if (iOooO0OO != 1007 && iOooO0OO != 1058 && iOooO0OO != 2045 && iOooO0OO != 2048 && iOooO0OO != 2058 && iOooO0OO != 2083 && iOooO0OO != 2074 && iOooO0OO != 2075 && iOooO0OO != 4002 && iOooO0OO != 4003) {
                                switch (iOooO0OO) {
                                    case 1003:
                                        CommonErrorHandler commonErrorHandler = CommonErrorHandler.INSTANCE;
                                        String messge = apiErrorCodeDB.getMessge();
                                        Intrinsics.checkNotNullExpressionValue(messge, "it.messge");
                                        commonErrorHandler.post(new CommonError(CommonError.Other_Device_Login, messge));
                                        return;
                                    case 1004:
                                    case 1005:
                                        break;
                                    default:
                                        switch (iOooO0OO) {
                                            case NativeConstants.SSL_SIGN_RSA_PSS_RSAE_SHA384 /* 2053 */:
                                            case NativeConstants.SSL_SIGN_RSA_PSS_RSAE_SHA512 /* 2054 */:
                                            case NativeConstants.SSL_SIGN_ED25519 /* 2055 */:
                                                break;
                                            default:
                                                switch (iOooO0OO) {
                                                    case Constants.LOG_FILTER_DEBUG /* 2063 */:
                                                    case 2064:
                                                    case 2065:
                                                    case 2066:
                                                    case 2067:
                                                    case 2068:
                                                        break;
                                                    default:
                                                        switch (iOooO0OO) {
                                                            case 2086:
                                                            case 2087:
                                                            case 2088:
                                                            case 2089:
                                                                break;
                                                            default:
                                                                String messge2 = apiErrorCodeDB.getMessge();
                                                                ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
                                                                if (!(messge2 == null || StringsKt.isBlank(messge2))) {
                                                                    o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, messge2, "runnable");
                                                                    if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                                                        o00O000 o00o008 = o00O000.f34368OooO00o;
                                                                        o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                                                                    } else {
                                                                        o0o0oooOooO0O0.run();
                                                                    }
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                }
                                                break;
                                        }
                                        break;
                                }
                            }
                            String messge3 = apiErrorCodeDB.getMessge();
                            Intrinsics.checkNotNullExpressionValue(messge3, "it.messge");
                            o00O000 o00o009 = o00O000.f34368OooO00o;
                            Activity activityOooO0O7 = o00O000.OooO0O0();
                            if (activityOooO0O7 != null) {
                                oo0oOO0 oo0ooo7 = new oo0oOO0(activityOooO0O7);
                                oo0ooo7.OooOo0O(messge3);
                                oo0ooo7.OooOOO0();
                            }
                        }
                    });
                } else {
                    o00O000 o00o008 = o00O000.f34368OooO00o;
                    Activity activityOooO0O7 = o00O000.OooO0O0();
                    if (activityOooO0O7 != null) {
                        oo0oOO0 oo0ooo7 = new oo0oOO0(activityOooO0O7);
                        oo0ooo7.OooOo0(R.string.only_vip_purchase);
                        oo0ooo7.OooOOOo(R.string.Get_Vip);
                        oo0ooo7.OooOo0o(new OooOOO0(activityOooO0O7));
                        oo0ooo7.OooOo(OooOOO.f40823Oooo);
                        oo0ooo7.OooOOO0();
                    }
                }
            } else {
                CommonErrorHandler.INSTANCE.post(new CommonError(CommonError.Account_Suspension, message3));
            }
        }
        return Unit.INSTANCE;
    }
}
