package p375o0OOoOO;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import androidx.compose.animation.OooO;
import com.code.android.util.OooO0O0;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.http.AdditionalData;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiError1058;
import com.yalla.yalla.model.http.ApiError2056;
import com.yalla.yalla.model.http.ApiError2062;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p085o000OooO.o00Oo0;
import p140o00OOooo.OooOO0;
import p157o00OoOO0.o0OO00O;
import p385o0OOooOO.o00O00O;
import p429o0OoOOO.o00O0;
import p429o0OoOOO.oOO00O;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00OOo0;
import p592o0oo00O.OooOOO0;
import p601o0oo0O0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.api.ApiErrorHandler$post$1", f = "ApiErrorHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o00000O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ApiError f44052OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O0(ApiError apiError, Continuation<? super o00000O0> continuation) {
        super(2, continuation);
        this.f44052OooO0Oo = apiError;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00000O0(this.f44052OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00000O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ApiError apiError = this.f44052OooO0Oo;
        int code = apiError.getCode();
        String message3 = apiError.getMessage();
        OooOOO0.OooO0OO("ApiErrorHandler", "handle code = " + code + ", message = " + message3 + ", url = " + apiError.getUrl());
        if (code == 0 || code == 1 || code == 2) {
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.Network_request_failed);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
        } else if (code != 3) {
            o00O0 o00o1 = o00O0.f45732OooO00o;
            if (code != 1005) {
                ApiError2062.MessageModel messageModel = null;
                messageModel = null;
                ApiError2056.MessageModel messageModel2 = null;
                messageModel = null;
                if (code == 1059) {
                    ApiError1058 apiError1058 = (ApiError1058) OooOO0.OooO0O0(ApiError1058.class, message3);
                    if (apiError1058 != null && (additionalData = apiError1058.getAdditionalData()) != null) {
                        o000000O o000000o2 = o000000O.f46674OooO00o;
                        o000000O.OooOOOO().postValue(additionalData.getActiveToken());
                        o000000O.OooOOo0().postValue(Long.valueOf(additionalData.getUserId()));
                    }
                    LiveEventBus.get("ACTIVE_ACCOUNT").post(null);
                } else if (code == 1202) {
                    Context context = o000O0.f10354OooO00o;
                    Activity activityOooO0O0 = OooO0O0.OooO0O0();
                    if (activityOooO0O0 != null) {
                        o0OO00O o0oo00o2 = new o0OO00O(activityOooO0O0);
                        o0oo00o2.OooOOoo(oO00OOo0.no_room_tip);
                        o0oo00o2.OooOOOO(oO00OOo0.Creat_Room);
                        o0oo00o2.OooOo0(new oo0o0Oo(activityOooO0O0));
                        o0oo00o2.OooOO0o();
                    }
                } else if (code == 2003) {
                    OooO.OooO0O0(oOO00O.Coin_NotEnough, null, 2, null, o00o1);
                } else if (code == 2008) {
                    OooO.OooO0O0(oOO00O.Crystal_NotEnough, null, 2, null, o00o1);
                } else if (code == 2062) {
                    ApiError2062 apiError2062 = (ApiError2062) OooOO0.OooO0O0(ApiError2062.class, message3);
                    if (apiError2062 != null && (message = apiError2062.getMessage()) != null) {
                        messageModel = (ApiError2062.MessageModel) OooOO0.OooO0O0(ApiError2062.MessageModel.class, message);
                    }
                    String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.event_create_err_time_message);
                    String[] strArr = new String[2];
                    strArr[0] = o0000oo.OooO0O0(messageModel != null ? messageModel.getUnblockTime() : 0L, "dd/MM/yyyy HH:mm", "GMT+02");
                    if (messageModel == null || (reason = messageModel.getReason()) == null) {
                        reason = "";
                    }
                    strArr[1] = reason;
                    String strOooO00o = o0000O.OooO00o(strOooO0OO2, strArr);
                    Context context2 = o000O0.f10354OooO00o;
                    Activity activityOooO0O1 = OooO0O0.OooO0O0();
                    if (activityOooO0O1 != null) {
                        o0OO00O o0oo00o3 = new o0OO00O(activityOooO0O1);
                        o0oo00o3.OooOo00(strOooO00o);
                        o0oo00o3.OooOO0o();
                    }
                } else if (code == 3001) {
                    Context context3 = o000O0.f10354OooO00o;
                    Activity activityOooO0O2 = OooO0O0.OooO0O0();
                    if (activityOooO0O2 != null) {
                        o0OO00O o0oo00o4 = new o0OO00O(activityOooO0O2);
                        o0oo00o4.OooOOoo(oO00OOo0.feature_not_available);
                        o0oo00o4.OooOOOO(oO00OOo0.Update_Now);
                        o0oo00o4.OooOo0(o00000O.f44051OooO0Oo);
                        o0oo00o4.OooOo(true);
                        o0oo00o4.OooOO0o();
                    }
                } else if (code == 3003) {
                    Context context4 = o000O0.f10354OooO00o;
                    Activity activityOooO0O3 = OooO0O0.OooO0O0();
                    if (activityOooO0O3 != null) {
                        o0OO00O o0oo00o5 = new o0OO00O(activityOooO0O3);
                        o0oo00o5.OooOOoo(oO00OOo0.Recharge_Page_CopyUnder_maintenance_Dialog);
                        o0oo00o5.OooOOOO(oO00OOo0.OK);
                        o0oo00o5.OooOo0(o0OO00O.f44057OooO0Oo);
                        o0oo00o5.OooOO0o();
                    }
                } else if (code == 2056) {
                    ApiError2056 apiError2056 = (ApiError2056) OooOO0.OooO0O0(ApiError2056.class, message3);
                    if (apiError2056 != null && (message2 = apiError2056.getMessage()) != null) {
                        messageModel2 = (ApiError2056.MessageModel) OooOO0.OooO0O0(ApiError2056.MessageModel.class, message2);
                    }
                    String strOooO0OO3 = o0000.OooO0OO(oO00OOo0.event_create_err_count_max);
                    String[] strArr2 = new String[1];
                    strArr2[0] = String.valueOf(messageModel2 != null ? messageModel2.getMaxCreateNum() : 10);
                    String strOooO00o2 = o0000O.OooO00o(strOooO0OO3, strArr2);
                    Context context5 = o000O0.f10354OooO00o;
                    Activity activityOooO0O4 = OooO0O0.OooO0O0();
                    if (activityOooO0O4 != null) {
                        o0OO00O o0oo00o6 = new o0OO00O(activityOooO0O4);
                        o0oo00o6.OooOo00(strOooO00o2);
                        o0oo00o6.OooOO0o();
                    }
                } else if (code == 2057) {
                    Context context6 = o000O0.f10354OooO00o;
                    Activity activityOooO0O5 = OooO0O0.OooO0O0();
                    if (activityOooO0O5 != null) {
                        o0OO00O o0oo00o7 = new o0OO00O(activityOooO0O5);
                        o0oo00o7.OooOo00(o0000.OooO0OO(oO00OOo0.event_create_err_room_level_reaches10));
                        o0oo00o7.OooOo0(o0O0O00.f44056OooO0Oo);
                        o0oo00o7.OooOO0o();
                    }
                } else if (code == 2084) {
                    Context context7 = o000O0.f10354OooO00o;
                    Activity activityOooO0O6 = OooO0O0.OooO0O0();
                    if (activityOooO0O6 != null) {
                        o0OO00O o0oo00o8 = new o0OO00O(activityOooO0O6);
                        o0oo00o8.OooOOoo(oO00OOo0.only_premium_purchase);
                        o0oo00o8.OooOOOO(oO00OOo0.Get_Yalla_Premium);
                        o0oo00o8.OooOo0(new o000OOo(activityOooO0O6));
                        o0oo00o8.OooOo0O(o000000.f44049OooO0Oo);
                        o0oo00o8.OooOO0o();
                    }
                } else if (code != 2085) {
                    o00O00O.OooO00o(String.valueOf(code), new o00Oo0());
                } else {
                    Context context8 = o000O0.f10354OooO00o;
                    Activity activityOooO0O7 = OooO0O0.OooO0O0();
                    if (activityOooO0O7 != null) {
                        o0OO00O o0oo00o9 = new o0OO00O(activityOooO0O7);
                        o0oo00o9.OooOOoo(oO00OOo0.only_vip_purchase);
                        o0oo00o9.OooOOOO(oO00OOo0.Get_Vip);
                        o0oo00o9.OooOo0(o000000O.f44050OooO0Oo);
                        o0oo00o9.OooOo0O(o00000.f44048OooO0Oo);
                        o0oo00o9.OooOO0o();
                    }
                }
            } else {
                o00o1.OooO0OO(new oOO00O(oOO00O.Account_Suspension, message3));
            }
        }
        return Unit.INSTANCE;
    }
}
