package p435o0OoOOOo;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.OooO0O0;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o0OoOo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.model.http.ApiError1005;
import com.yalla.yalla.ui.activity.main.StartActivity;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import o0oo0000.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p205o00o0o0o.o000O;
import p405o0Oo0OOO.o0O00o0;
import p423o0OoO0OO.o000O0Oo;
import p423o0OoO0OO.o00O00OO;
import p429o0OoOO.o0Oo0oo;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p590o0oOooo0.k0;
import p606o0oo0O0o.o0O0O0o0;
import p650o0ooo.o000OO0O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nCommonErrorHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonErrorHandler.kt\ncom/yalla/yalla/manager/unBlur/error/CommonErrorHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,312:1\n1#2:313\n*E\n"})
public final class o0O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0O000 f47005OooO00o = new o0O000();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static boolean f47006OooO0O0;

    @DebugMetadata(c = "com.yalla.yalla.manager.unBlur.error.CommonErrorHandler$post$1", f = "CommonErrorHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0O0o f47007OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0O0o o0o0o, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f47007OooO0Oo = o0o0o;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f47007OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o0O000 o0o001 = o0O000.f47005OooO00o;
            o0O0o o0o0o = this.f47007OooO0Oo;
            o0o001.OooO00o(o0o0o.getCode(), o0o0o.getMessage());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f47008OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Activity f47009OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Activity activity, boolean z) {
            super(0);
            this.f47008OooO0Oo = z;
            this.f47009OooO0o0 = activity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0O000.f47006OooO0O0 = false;
            if (this.f47008OooO0Oo) {
                int i = StartActivity.f25081OooO0o0;
                StartActivity.OooO00o.OooO0O0(this.f47009OooO0o0);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    public static boolean OooO0O0(boolean z) {
        boolean z2;
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
            CharSequence charSequence = (CharSequence) o0O00oO0.OooOOOO().getValue();
            z2 = charSequence == null || StringsKt.isBlank(charSequence) ? false : true;
        }
        if (z2 || z) {
            o0Oo0oo.OooO0OO(0, 3);
            o0o00oo1.OooO00o();
        }
        return z2;
    }

    public final void OooO00o(int i, String str) {
        Activity activityOooO0O0;
        ApiError1005.ApiError1005Data data;
        ApiError1005.ApiError1005Data data2;
        String endTime;
        ApiError1005.ApiError1005Data data3;
        boolean z = true;
        reason = null;
        String reason = null;
        if (i == 9990050) {
            k0.OooO00o(true, true, null);
            return;
        }
        switch (i) {
            case o0O0o.Account_Has_Deleted /* 99909 */:
                Context context = o000O00O.f13421OooO00o;
                Activity activityOooO0O1 = com.code.android.util.OooO0O0.OooO0O0();
                FragmentActivity fragmentActivity = activityOooO0O1 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O1 : null;
                if (fragmentActivity != null) {
                    o000O o000o = new o000O(fragmentActivity);
                    o000o.OooOo00(o0000.OooO0OO(o000000.room_theme_error_account_canceled));
                    o000o.OooOO0o();
                    return;
                }
                return;
            case o0O0o.He_Is_Not_Your_Friend /* 99910 */:
                Context context2 = o000O00O.f13421OooO00o;
                Activity activityOooO0O2 = com.code.android.util.OooO0O0.OooO0O0();
                FragmentActivity fragmentActivity2 = activityOooO0O2 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O2 : null;
                if (fragmentActivity2 != null) {
                    o000O o000o2 = new o000O(fragmentActivity2);
                    o000o2.OooOOoo(o000000.message_theme_send_failed_not_friend);
                    o000o2.OooOO0o();
                    return;
                }
                return;
            case o0O0o.Friend_Has_This_Theme /* 99911 */:
                Context context3 = o000O00O.f13421OooO00o;
                Activity activityOooO0O3 = com.code.android.util.OooO0O0.OooO0O0();
                FragmentActivity fragmentActivity3 = activityOooO0O3 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O3 : null;
                if (fragmentActivity3 != null) {
                    o000O o000o3 = new o000O(fragmentActivity3);
                    o000o3.OooOOoo(o000000.room_theme_you_friend_has_it);
                    o000o3.OooOo(true);
                    o000o3.OooOOOo(o00O00OO.OooOO0O(o0000.OooO0OO(o000000.reselect_aother_theme)));
                    o000o3.OooOo0(new o0O0000O(fragmentActivity3));
                    o000o3.OooOO0o();
                    return;
                }
                return;
            default:
                switch (i) {
                    case o0O0o.Other_Device_Login /* 999001 */:
                        if (!OooO0O0(false) || f47006OooO0O0 || (activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0()) == null || !(activityOooO0O0 instanceof FragmentActivity)) {
                            return;
                        }
                        f47006OooO0O0 = true;
                        o000O o000o4 = new o000O(activityOooO0O0);
                        if (str != null && !StringsKt.isBlank(str)) {
                            z = false;
                        }
                        if (z) {
                            str = o0000.OooO0OO(o000000.login_err);
                        }
                        o000o4.OooOo00(str);
                        o000o4.OooO0o(false);
                        o000o4.OooOO0(new o0OoO00O(activityOooO0O0));
                        o000o4.OooOO0o();
                        return;
                    case o0O0o.Coin_Frozen /* 999002 */:
                        Context context4 = o000O00O.f13421OooO00o;
                        Activity activityOooO0O4 = com.code.android.util.OooO0O0.OooO0O0();
                        FragmentActivity fragmentActivity4 = activityOooO0O4 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O4 : null;
                        if (fragmentActivity4 != null) {
                            o000O o000o5 = new o000O(fragmentActivity4);
                            o000o5.OooOOoo(o000000.money_freeze);
                            o000o5.OooOO0o();
                            return;
                        }
                        return;
                    case o0O0o.Crystal_Frozen /* 999003 */:
                        Context context5 = o000O00O.f13421OooO00o;
                        Activity activityOooO0O5 = com.code.android.util.OooO0O0.OooO0O0();
                        FragmentActivity fragmentActivity5 = activityOooO0O5 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O5 : null;
                        if (fragmentActivity5 != null) {
                            o000O o000o6 = new o000O(fragmentActivity5);
                            o000o6.OooOOoo(o000000.money_freeze);
                            o000o6.OooOO0o();
                            return;
                        }
                        return;
                    case o0O0o.Account_Suspension /* 999004 */:
                        if (StringsKt.isBlank(str)) {
                            OooO0Oo(str, OooO0O0(false));
                            return;
                        }
                        final boolean zOooO0O0 = OooO0O0(false);
                        synchronized (this) {
                            if (f47006OooO0O0) {
                                return;
                            }
                            final Activity activityOooO0O6 = com.code.android.util.OooO0O0.OooO0O0();
                            if (activityOooO0O6 != null) {
                                if (!(activityOooO0O6 instanceof FragmentActivity)) {
                                    return;
                                }
                                f47006OooO0O0 = true;
                                final o000O o000o7 = new o000O(activityOooO0O6);
                                o0O00o0 o0o00o0Inflate = o0O00o0.inflate(LayoutInflater.from(o000o7.f38487OooO00o), o000o7.f38489OooO0OO, false);
                                Intrinsics.checkNotNullExpressionValue(o0o00o0Inflate, "inflate(...)");
                                o000o7.OooOoO(o0000.OooO0OO(o000000.common_dialog_suspension_blocked_title));
                                LinearLayout linearLayout = o0o00o0Inflate.f44465OooO00o;
                                Intrinsics.checkNotNullExpressionValue(linearLayout, "getRoot(...)");
                                o000o7.OooOOo(linearLayout);
                                o000o7.OooOOo0(false);
                                o000o7.OooOO0(new o0O000O(activityOooO0O6, zOooO0O0));
                                try {
                                    final ApiError1005 apiError1005 = (ApiError1005) com.code.android.json.OooO00o.OooO0OO(ApiError1005.class, str);
                                    o0o00o0Inflate.f44467OooO0OO.setText(String.valueOf((apiError1005 == null || (data3 = apiError1005.getData()) == null) ? null : Long.valueOf(data3.getPrettyId())));
                                    o0o00o0Inflate.f44468OooO0Oo.setText(o0000.OooO0OO(o000000.common_dialog_suspension_blocked_content));
                                    o0o00o0Inflate.f44471OooO0oO.setText(o0O0O0o0.OooO0OO((apiError1005 == null || (data2 = apiError1005.getData()) == null || (endTime = data2.getEndTime()) == null) ? 0L : o0OoOo0.OooO(0L, endTime), "dd/MM/yyyy HH:mm:ss"));
                                    TextView textView = o0o00o0Inflate.f44470OooO0o0;
                                    if (apiError1005 != null && (data = apiError1005.getData()) != null) {
                                        reason = data.getReason();
                                    }
                                    textView.setText(reason);
                                    String strOooO0OO = o0000.OooO0OO(o000000.common_dialog_suspension_blocked_request);
                                    SpannableString spannableString = new SpannableString(strOooO0OO);
                                    spannableString.setSpan(new UnderlineSpan(), 0, strOooO0OO.length(), 0);
                                    o0o00o0Inflate.f44469OooO0o.setText(spannableString);
                                    o0o00o0Inflate.f44469OooO0o.setOnClickListener(new View.OnClickListener() { // from class: o0OoOOOo.o0
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            ApiError1005.ApiError1005Data data4;
                                            ApiError1005.ApiError1005Data data5;
                                            ApiError1005.ApiError1005Data data6;
                                            Activity activity = activityOooO0O6;
                                            Intrinsics.checkNotNullParameter(activity, "$activity");
                                            o000O this_apply = o000o7;
                                            Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                                            OooO00o.OooO0O0("101067");
                                            if (zOooO0O0) {
                                                int i2 = StartActivity.f25081OooO0o0;
                                                StartActivity.OooO00o.OooO0O0(activity);
                                            }
                                            boolean z2 = false;
                                            o0O000.f47006OooO0O0 = false;
                                            this_apply.OooO0OO();
                                            ApiError1005 apiError1006 = apiError1005;
                                            if (apiError1006 != null && (data6 = apiError1006.getData()) != null && data6.getIsInLoginShow()) {
                                                z2 = true;
                                            }
                                            long userId = 0;
                                            if (z2) {
                                                Observable<Object> observable = LiveEventBus.get("SHOW_APPEAL_DIALOG");
                                                ApiError1005.ApiError1005Data data7 = apiError1006.getData();
                                                Long lValueOf = Long.valueOf(data7 != null ? data7.getPrettyId() : 0L);
                                                ApiError1005.ApiError1005Data data8 = apiError1006.getData();
                                                observable.post(new Pair(lValueOf, Long.valueOf(data8 != null ? data8.getUserId() : 0L)));
                                                return;
                                            }
                                            Context context6 = o000O00O.f13421OooO00o;
                                            Activity activityOooO0O7 = OooO0O0.OooO0O0();
                                            FragmentActivity fragmentActivity6 = activityOooO0O7 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O7 : null;
                                            if (fragmentActivity6 != null) {
                                                long prettyId = (apiError1006 == null || (data5 = apiError1006.getData()) == null) ? 0L : data5.getPrettyId();
                                                if (apiError1006 != null && (data4 = apiError1006.getData()) != null) {
                                                    userId = data4.getUserId();
                                                }
                                                new o000OO0O(fragmentActivity6, prettyId, userId).OooO();
                                            }
                                        }
                                    });
                                    o0o00o0Inflate.f44466OooO0O0.setOnClickListener(new View.OnClickListener() { // from class: o0OoOOOo.o0O00000
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            Activity activity = activityOooO0O6;
                                            Intrinsics.checkNotNullParameter(activity, "$activity");
                                            o000O this_apply = o000o7;
                                            Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                                            if (zOooO0O0) {
                                                int i2 = StartActivity.f25081OooO0o0;
                                                StartActivity.OooO00o.OooO0O0(activity);
                                            }
                                            o0O000.f47006OooO0O0 = false;
                                            this_apply.OooO0OO();
                                        }
                                    });
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                o000o7.OooOO0o();
                                break;
                            }
                            return;
                        }
                    case o0O0o.Coin_NotEnough /* 999005 */:
                        k0.OooO00o(false, true, null);
                        return;
                    case o0O0o.Crystal_NotEnough /* 999006 */:
                        Context context6 = o000O00O.f13421OooO00o;
                        Activity activityOooO0O7 = com.code.android.util.OooO0O0.OooO0O0();
                        FragmentActivity fragmentActivity6 = activityOooO0O7 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O7 : null;
                        if (fragmentActivity6 != null) {
                            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                            o000O o000o8 = new o000O(fragmentActivity6);
                            o000o8.OooOOoo(o000000.error_113);
                            o000o8.OooOo(true);
                            o000o8.OooOo0(new o0O000Oo(booleanRef, fragmentActivity6));
                            o000o8.OooO(o0O000o0.f47018OooO0Oo);
                            o000O0Oo.OooO00o(o000o8, new o0O00(booleanRef));
                            o000o8.OooOO0o();
                            return;
                        }
                        return;
                    case o0O0o.Device_Suspension /* 999007 */:
                        OooO0Oo(str, OooO0O0(true));
                        return;
                    case o0O0o.Create_Room_Tips /* 999008 */:
                        Context context7 = o000O00O.f13421OooO00o;
                        Activity activityOooO0O8 = com.code.android.util.OooO0O0.OooO0O0();
                        FragmentActivity fragmentActivity7 = activityOooO0O8 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O8 : null;
                        if (fragmentActivity7 != null) {
                            o000O o000o9 = new o000O(fragmentActivity7);
                            o000o9.OooOOoo(o000000.message_theme_accept_failed_not_room);
                            o000o9.OooOOOO(o000000.message_theme_error_to_create_room);
                            o000o9.OooOo0(new o0OoOoOo(fragmentActivity7));
                            o000o9.OooOo(true);
                            o000o9.OooOO0o();
                            return;
                        }
                        return;
                    default:
                        return;
                }
        }
    }

    public final void OooO0OO(@NotNull o0O0o error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
            OooO00o(error.getCode(), error.getMessage());
        } else {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new OooO00o(error, null), 2, null);
        }
    }

    public final synchronized void OooO0Oo(String str, boolean z) {
        if (f47006OooO0O0) {
            return;
        }
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            if (!(activityOooO0O0 instanceof FragmentActivity)) {
                return;
            }
            f47006OooO0O0 = true;
            o000O o000o = new o000O(activityOooO0O0);
            if (StringsKt.isBlank(str)) {
                str = o0000.OooO0OO(o000000.account_closure);
            }
            o000o.OooOo00(str);
            o000o.OooO0o(false);
            o000o.OooOO0(new OooO0O0(activityOooO0O0, z));
            o000o.OooOO0o();
        }
    }
}
