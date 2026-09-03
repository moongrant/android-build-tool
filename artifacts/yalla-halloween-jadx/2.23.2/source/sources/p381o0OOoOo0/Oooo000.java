package p381o0OOoOo0;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import androidx.activity.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.http.AdditionalData;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiError1058;
import com.yalla.yalla.model.http.ApiError2056;
import com.yalla.yalla.model.http.ApiError2062;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.unsigned.OooO0OO;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import oo0o0O0.OooO0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o0oOO;
import p187o00o00o0.OooO;
import p205o00o0o0o.o000O;
import p391o0OOooo0.o0OO00O;
import p435o0OoOOOo.o0O000;
import p435o0OoOOOo.o0O0o;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p598o0oo00Oo.o0000O00;
import p606o0oo0O0o.o0O0O0o0;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.api.ApiErrorHandler$post$1", f = "ApiErrorHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class Oooo000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ApiError f43267OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(ApiError apiError, Continuation<? super Oooo000> continuation) {
        super(2, continuation);
        this.f43267OooO0Oo = apiError;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new Oooo000(this.f43267OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Oooo000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ApiError apiError = this.f43267OooO0Oo;
        int code = apiError.getCode();
        String message3 = apiError.getMessage();
        String url = apiError.getUrl();
        StringBuilder sbOooO00o = OooO0O0.OooO00o("handle code = ", code, ", message = ", message3, ", url = ");
        sbOooO00o.append(url);
        o0000O00.OooO0OO("ApiErrorHandler", sbOooO00o.toString());
        if (code == 0 || code == 1 || code == 2) {
            String strOooO0OO = o0000.OooO0OO(o000000.Network_request_failed);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
        } else if (code != 3) {
            o0O000 o0o001 = o0O000.f47005OooO00o;
            if (code != 1005) {
                ApiError2062.MessageModel messageModel = null;
                messageModel = null;
                ApiError2056.MessageModel messageModel2 = null;
                messageModel = null;
                if (code == 1059) {
                    ApiError1058 apiError1058 = (ApiError1058) OooO.OooO0O0(ApiError1058.class, message3);
                    if (apiError1058 != null && (additionalData = apiError1058.getAdditionalData()) != null) {
                        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                        o0O00oO0.OooOOOO().postValue(additionalData.getActiveToken());
                        o0O00oO0.OooOOo0().postValue(Long.valueOf(additionalData.getUserId()));
                    }
                    LiveEventBus.get("ACTIVE_ACCOUNT").post(null);
                } else if (code == 1202) {
                    Context context = o000O00O.f13421OooO00o;
                    Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O0 != null) {
                        o000O o000o = new o000O(activityOooO0O0);
                        o000o.OooOOoo(o000000.no_room_tip);
                        o000o.OooOOOO(o000000.Creat_Room);
                        o000o.OooOo0(new OooOO0O(activityOooO0O0));
                        o000o.OooOO0o();
                    }
                } else if (code == 2003) {
                    OooO0OO.OooO0O0(o0O0o.Coin_NotEnough, null, 2, null, o0o001);
                } else if (code == 2008) {
                    OooO0OO.OooO0O0(o0O0o.Crystal_NotEnough, null, 2, null, o0o001);
                } else if (code == 2062) {
                    ApiError2062 apiError2062 = (ApiError2062) OooO.OooO0O0(ApiError2062.class, message3);
                    if (apiError2062 != null && (message = apiError2062.getMessage()) != null) {
                        messageModel = (ApiError2062.MessageModel) OooO.OooO0O0(ApiError2062.MessageModel.class, message);
                    }
                    String strOooO0OO2 = o0000.OooO0OO(o000000.event_create_err_time_message);
                    String[] strArr = new String[2];
                    strArr[0] = o0O0O0o0.OooO0O0(messageModel != null ? messageModel.getUnblockTime() : 0L, "dd/MM/yyyy HH:mm", "GMT+02");
                    if (messageModel == null || (reason = messageModel.getReason()) == null) {
                        reason = "";
                    }
                    strArr[1] = reason;
                    String strOooO00o = o0000O.OooO00o(strOooO0OO2, strArr);
                    Context context2 = o000O00O.f13421OooO00o;
                    Activity activityOooO0O1 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O1 != null) {
                        o000O o000o2 = new o000O(activityOooO0O1);
                        o000o2.OooOo00(strOooO00o);
                        o000o2.OooOO0o();
                    }
                } else if (code == 3001) {
                    Context context3 = o000O00O.f13421OooO00o;
                    Activity activityOooO0O2 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O2 != null) {
                        o000O o000o3 = new o000O(activityOooO0O2);
                        o000o3.OooOOoo(o000000.feature_not_available);
                        o000o3.OooOOOO(o000000.Update_Now);
                        o000o3.OooOo0(Oooo0.f43266OooO0Oo);
                        o000o3.OooOo(true);
                        o000o3.OooOO0o();
                    }
                } else if (code == 3003) {
                    Context context4 = o000O00O.f13421OooO00o;
                    Activity activityOooO0O3 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O3 != null) {
                        o000O o000o4 = new o000O(activityOooO0O3);
                        o000o4.OooOOoo(o000000.Recharge_Page_CopyUnder_maintenance_Dialog);
                        o000o4.OooOOOO(o000000.OK);
                        o000o4.OooOo0(OooOO0.f43259OooO0Oo);
                        o000o4.OooOO0o();
                    }
                } else if (code == 2056) {
                    ApiError2056 apiError2056 = (ApiError2056) OooO.OooO0O0(ApiError2056.class, message3);
                    if (apiError2056 != null && (message2 = apiError2056.getMessage()) != null) {
                        messageModel2 = (ApiError2056.MessageModel) OooO.OooO0O0(ApiError2056.MessageModel.class, message2);
                    }
                    String strOooO0OO3 = o0000.OooO0OO(o000000.event_create_err_count_max);
                    String[] strArr2 = new String[1];
                    strArr2[0] = String.valueOf(messageModel2 != null ? messageModel2.getMaxCreateNum() : 10);
                    String strOooO00o2 = o0000O.OooO00o(strOooO0OO3, strArr2);
                    Context context5 = o000O00O.f13421OooO00o;
                    Activity activityOooO0O4 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O4 != null) {
                        o000O o000o5 = new o000O(activityOooO0O4);
                        o000o5.OooOo00(strOooO00o2);
                        o000o5.OooOO0o();
                    }
                } else if (code == 2057) {
                    Context context6 = o000O00O.f13421OooO00o;
                    Activity activityOooO0O5 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O5 != null) {
                        o000O o000o6 = new o000O(activityOooO0O5);
                        o000o6.OooOo00(o0000.OooO0OO(o000000.event_create_err_room_level_reaches10));
                        o000o6.OooOo0(OooOOO0.f43262OooO0Oo);
                        o000o6.OooOO0o();
                    }
                } else if (code == 2084) {
                    Context context7 = o000O00O.f13421OooO00o;
                    Activity activityOooO0O6 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O6 != null) {
                        o000O o000o7 = new o000O(activityOooO0O6);
                        o000o7.OooOOoo(o000000.only_premium_purchase);
                        o000o7.OooOOOO(o000000.Get_Yalla_Premium);
                        o000o7.OooOo0(new OooOOO(activityOooO0O6));
                        o000o7.OooOo0O(OooOOOO.f43263OooO0Oo);
                        o000o7.OooOO0o();
                    }
                } else if (code != 2085) {
                    o0OO00O.OooO00o(String.valueOf(code), new o0oOO());
                } else {
                    Context context8 = o000O00O.f13421OooO00o;
                    Activity activityOooO0O7 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O7 != null) {
                        o000O o000o8 = new o000O(activityOooO0O7);
                        o000o8.OooOOoo(o000000.only_vip_purchase);
                        o000o8.OooOOOO(o000000.Get_Vip);
                        o000o8.OooOo0(OooOo00.f43265OooO0Oo);
                        o000o8.OooOo0O(OooOo.f43264OooO0Oo);
                        o000o8.OooOO0o();
                    }
                }
            } else {
                o0o001.OooO0OO(new o0O0o(o0O0o.Account_Suspension, message3));
            }
        }
        return Unit.INSTANCE;
    }
}
