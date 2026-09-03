package p429o0OoOOO;

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
import com.code.android.util.o000O0;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p157o00OoOO0.o0OO00O;
import p417o0OoO0.o0000O0O;
import p417o0OoO0.oo0o0Oo;
import p427o0OoOO00.o0OOO0o;
import p464o0Oooo.o000000O;
import p519o0o0O0oO.o00O000o;
import p579o0oOoo.oOO0OO;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p601o0oo0O0.o0000oo;
import p641o0ooOOOO.h1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nCommonErrorHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonErrorHandler.kt\ncom/yalla/yalla/manager/unBlur/error/CommonErrorHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,312:1\n1#2:313\n*E\n"})
public final class o00O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00O0 f45732OooO00o = new o00O0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static boolean f45733OooO0O0;

    @DebugMetadata(c = "com.yalla.yalla.manager.unBlur.error.CommonErrorHandler$post$1", f = "CommonErrorHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ oOO00O f45734OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(oOO00O ooo00o, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f45734OooO0Oo = ooo00o;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f45734OooO0Oo, continuation);
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
            o00O0 o00o1 = o00O0.f45732OooO00o;
            oOO00O ooo00o = this.f45734OooO0Oo;
            o00o1.OooO00o(ooo00o.getCode(), ooo00o.getMessage());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f45735OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Activity f45736OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Activity activity, boolean z) {
            super(0);
            this.f45735OooO0Oo = z;
            this.f45736OooO0o0 = activity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00O0.f45733OooO0O0 = false;
            if (this.f45735OooO0Oo) {
                int i = StartActivity.f25535OooO0o0;
                StartActivity.OooO00o.OooO0O0(this.f45736OooO0o0);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    public static boolean OooO0O0(boolean z) {
        boolean z2;
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
            CharSequence charSequence = (CharSequence) o000000O.OooOOOO().getValue();
            z2 = charSequence == null || StringsKt.isBlank(charSequence) ? false : true;
        }
        if (z2 || z) {
            o0OOO0o.OooO0OO(0, 3);
            o000000o2.OooO00o();
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
            oOO0OO.OooO00o(true, true, null);
            return;
        }
        switch (i) {
            case oOO00O.Account_Has_Deleted /* 99909 */:
                Context context = o000O0.f10354OooO00o;
                Activity activityOooO0O1 = com.code.android.util.OooO0O0.OooO0O0();
                FragmentActivity fragmentActivity = activityOooO0O1 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O1 : null;
                if (fragmentActivity != null) {
                    o0OO00O o0oo00o2 = new o0OO00O(fragmentActivity);
                    o0oo00o2.OooOo00(o0000.OooO0OO(oO00OOo0.room_theme_error_account_canceled));
                    o0oo00o2.OooOO0o();
                    return;
                }
                return;
            case oOO00O.He_Is_Not_Your_Friend /* 99910 */:
                Context context2 = o000O0.f10354OooO00o;
                Activity activityOooO0O2 = com.code.android.util.OooO0O0.OooO0O0();
                FragmentActivity fragmentActivity2 = activityOooO0O2 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O2 : null;
                if (fragmentActivity2 != null) {
                    o0OO00O o0oo00o3 = new o0OO00O(fragmentActivity2);
                    o0oo00o3.OooOOoo(oO00OOo0.message_theme_send_failed_not_friend);
                    o0oo00o3.OooOO0o();
                    return;
                }
                return;
            case oOO00O.Friend_Has_This_Theme /* 99911 */:
                Context context3 = o000O0.f10354OooO00o;
                Activity activityOooO0O3 = com.code.android.util.OooO0O0.OooO0O0();
                FragmentActivity fragmentActivity3 = activityOooO0O3 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O3 : null;
                if (fragmentActivity3 != null) {
                    o0OO00O o0oo00o4 = new o0OO00O(fragmentActivity3);
                    o0oo00o4.OooOOoo(oO00OOo0.room_theme_you_friend_has_it);
                    o0oo00o4.OooOo(true);
                    o0oo00o4.OooOOOo(o0000O0O.OooOO0O(o0000.OooO0OO(oO00OOo0.reselect_aother_theme)));
                    o0oo00o4.OooOo0(new oo00o(fragmentActivity3));
                    o0oo00o4.OooOO0o();
                    return;
                }
                return;
            default:
                switch (i) {
                    case oOO00O.Other_Device_Login /* 999001 */:
                        if (!OooO0O0(false) || f45733OooO0O0 || (activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0()) == null || !(activityOooO0O0 instanceof FragmentActivity)) {
                            return;
                        }
                        f45733OooO0O0 = true;
                        o0OO00O o0oo00o5 = new o0OO00O(activityOooO0O0);
                        if (str != null && !StringsKt.isBlank(str)) {
                            z = false;
                        }
                        if (z) {
                            str = o0000.OooO0OO(oO00OOo0.login_err);
                        }
                        o0oo00o5.OooOo00(str);
                        o0oo00o5.OooO0o(false);
                        o0oo00o5.OooOO0(new o00O0OO(activityOooO0O0));
                        o0oo00o5.OooOO0o();
                        return;
                    case oOO00O.Coin_Frozen /* 999002 */:
                        Context context4 = o000O0.f10354OooO00o;
                        Activity activityOooO0O4 = com.code.android.util.OooO0O0.OooO0O0();
                        FragmentActivity fragmentActivity4 = activityOooO0O4 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O4 : null;
                        if (fragmentActivity4 != null) {
                            o0OO00O o0oo00o6 = new o0OO00O(fragmentActivity4);
                            o0oo00o6.OooOOoo(oO00OOo0.money_freeze);
                            o0oo00o6.OooOO0o();
                            return;
                        }
                        return;
                    case oOO00O.Crystal_Frozen /* 999003 */:
                        Context context5 = o000O0.f10354OooO00o;
                        Activity activityOooO0O5 = com.code.android.util.OooO0O0.OooO0O0();
                        FragmentActivity fragmentActivity5 = activityOooO0O5 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O5 : null;
                        if (fragmentActivity5 != null) {
                            o0OO00O o0oo00o7 = new o0OO00O(fragmentActivity5);
                            o0oo00o7.OooOOoo(oO00OOo0.money_freeze);
                            o0oo00o7.OooOO0o();
                            return;
                        }
                        return;
                    case oOO00O.Account_Suspension /* 999004 */:
                        if (StringsKt.isBlank(str)) {
                            OooO0Oo(str, OooO0O0(false));
                            return;
                        }
                        final boolean zOooO0O0 = OooO0O0(false);
                        synchronized (this) {
                            if (f45733OooO0O0) {
                                return;
                            }
                            final Activity activityOooO0O6 = com.code.android.util.OooO0O0.OooO0O0();
                            if (activityOooO0O6 != null) {
                                if (!(activityOooO0O6 instanceof FragmentActivity)) {
                                    return;
                                }
                                f45733OooO0O0 = true;
                                final o0OO00O o0oo00o8 = new o0OO00O(activityOooO0O6);
                                h1 h1VarInflate = h1.inflate(LayoutInflater.from(o0oo00o8.f10133OooO00o), o0oo00o8.f10135OooO0OO, false);
                                Intrinsics.checkNotNullExpressionValue(h1VarInflate, "inflate(\n               …  false\n                )");
                                o0oo00o8.OooOoO(o0000.OooO0OO(oO00OOo0.common_dialog_suspension_blocked_title));
                                LinearLayout linearLayout = h1VarInflate.f58018OooO00o;
                                Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.root");
                                o0oo00o8.OooOOo(linearLayout);
                                o0oo00o8.OooOOo0(false);
                                o0oo00o8.OooOO0(new o00O0O00(activityOooO0O6, zOooO0O0));
                                try {
                                    final ApiError1005 apiError1005 = (ApiError1005) com.code.android.json.OooO00o.OooO0OO(ApiError1005.class, str);
                                    h1VarInflate.f58020OooO0OO.setText(String.valueOf((apiError1005 == null || (data3 = apiError1005.getData()) == null) ? null : Long.valueOf(data3.getPrettyId())));
                                    h1VarInflate.f58021OooO0Oo.setText(o0000.OooO0OO(oO00OOo0.common_dialog_suspension_blocked_content));
                                    h1VarInflate.f58024OooO0oO.setText(o0000oo.OooO0OO((apiError1005 == null || (data2 = apiError1005.getData()) == null || (endTime = data2.getEndTime()) == null) ? 0L : o0OoOo0.OooO(0L, endTime), "dd/MM/yyyy HH:mm:ss"));
                                    TextView textView = h1VarInflate.f58023OooO0o0;
                                    if (apiError1005 != null && (data = apiError1005.getData()) != null) {
                                        reason = data.getReason();
                                    }
                                    textView.setText(reason);
                                    String strOooO0OO = o0000.OooO0OO(oO00OOo0.common_dialog_suspension_blocked_request);
                                    SpannableString spannableString = new SpannableString(strOooO0OO);
                                    spannableString.setSpan(new UnderlineSpan(), 0, strOooO0OO.length(), 0);
                                    h1VarInflate.f58022OooO0o.setText(spannableString);
                                    h1VarInflate.f58022OooO0o.setOnClickListener(new View.OnClickListener() { // from class: o0OoOOO.o00O00OO
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            ApiError1005.ApiError1005Data data4;
                                            ApiError1005.ApiError1005Data data5;
                                            ApiError1005.ApiError1005Data data6;
                                            Activity activity = activityOooO0O6;
                                            Intrinsics.checkNotNullParameter(activity, "$activity");
                                            o0OO00O this_apply = o0oo00o8;
                                            Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                                            o0OO000.OooO00o("101067");
                                            if (zOooO0O0) {
                                                int i2 = StartActivity.f25535OooO0o0;
                                                StartActivity.OooO00o.OooO0O0(activity);
                                            }
                                            boolean z2 = false;
                                            o00O0.f45733OooO0O0 = false;
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
                                            Context context6 = o000O0.f10354OooO00o;
                                            Activity activityOooO0O7 = OooO0O0.OooO0O0();
                                            FragmentActivity fragmentActivity6 = activityOooO0O7 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O7 : null;
                                            if (fragmentActivity6 != null) {
                                                long prettyId = (apiError1006 == null || (data5 = apiError1006.getData()) == null) ? 0L : data5.getPrettyId();
                                                if (apiError1006 != null && (data4 = apiError1006.getData()) != null) {
                                                    userId = data4.getUserId();
                                                }
                                                new o00O000o(fragmentActivity6, prettyId, userId).OooO();
                                            }
                                        }
                                    });
                                    h1VarInflate.f58019OooO0O0.setOnClickListener(new View.OnClickListener() { // from class: o0OoOOO.o00O00o0
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            Activity activity = activityOooO0O6;
                                            Intrinsics.checkNotNullParameter(activity, "$activity");
                                            o0OO00O this_apply = o0oo00o8;
                                            Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                                            if (zOooO0O0) {
                                                int i2 = StartActivity.f25535OooO0o0;
                                                StartActivity.OooO00o.OooO0O0(activity);
                                            }
                                            o00O0.f45733OooO0O0 = false;
                                            this_apply.OooO0OO();
                                        }
                                    });
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                o0oo00o8.OooOO0o();
                                break;
                            }
                            return;
                        }
                    case oOO00O.Coin_NotEnough /* 999005 */:
                        oOO0OO.OooO00o(false, true, null);
                        return;
                    case oOO00O.Crystal_NotEnough /* 999006 */:
                        Context context6 = o000O0.f10354OooO00o;
                        Activity activityOooO0O7 = com.code.android.util.OooO0O0.OooO0O0();
                        FragmentActivity fragmentActivity6 = activityOooO0O7 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O7 : null;
                        if (fragmentActivity6 != null) {
                            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                            o0OO00O o0oo00o9 = new o0OO00O(fragmentActivity6);
                            o0oo00o9.OooOOoo(oO00OOo0.error_113);
                            o0oo00o9.OooOo(true);
                            o0oo00o9.OooOo0(new o00O0O0O(booleanRef, fragmentActivity6));
                            o0oo00o9.OooO(o00O0OO0.f45750OooO0Oo);
                            oo0o0Oo.OooO0O0(o0oo00o9, new oo0o0O0(booleanRef));
                            o0oo00o9.OooOO0o();
                            return;
                        }
                        return;
                    case oOO00O.Device_Suspension /* 999007 */:
                        OooO0Oo(str, OooO0O0(true));
                        return;
                    case oOO00O.Create_Room_Tips /* 999008 */:
                        Context context7 = o000O0.f10354OooO00o;
                        Activity activityOooO0O8 = com.code.android.util.OooO0O0.OooO0O0();
                        FragmentActivity fragmentActivity7 = activityOooO0O8 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O8 : null;
                        if (fragmentActivity7 != null) {
                            o0OO00O o0oo00o10 = new o0OO00O(fragmentActivity7);
                            o0oo00o10.OooOOoo(oO00OOo0.message_theme_accept_failed_not_room);
                            o0oo00o10.OooOOOO(oO00OOo0.message_theme_error_to_create_room);
                            o0oo00o10.OooOo0(new o00O0O0(fragmentActivity7));
                            o0oo00o10.OooOo(true);
                            o0oo00o10.OooOO0o();
                            return;
                        }
                        return;
                    default:
                        return;
                }
        }
    }

    public final void OooO0OO(@NotNull oOO00O error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
            OooO00o(error.getCode(), error.getMessage());
        } else {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new OooO00o(error, null), 2, null);
        }
    }

    public final synchronized void OooO0Oo(String str, boolean z) {
        if (f45733OooO0O0) {
            return;
        }
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            if (!(activityOooO0O0 instanceof FragmentActivity)) {
                return;
            }
            f45733OooO0O0 = true;
            o0OO00O o0oo00o2 = new o0OO00O(activityOooO0O0);
            if (StringsKt.isBlank(str)) {
                str = o0000.OooO0OO(oO00OOo0.account_closure);
            }
            o0oo00o2.OooOo00(str);
            o0oo00o2.OooO0o(false);
            o0oo00o2.OooOO0(new OooO0O0(activityOooO0O0, z));
            o0oo00o2.OooOO0o();
        }
    }
}
