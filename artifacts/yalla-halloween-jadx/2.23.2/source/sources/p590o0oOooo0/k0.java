package p590o0oOooo0;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Looper;
import androidx.activity.OooOo00;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import com.yalla.yalla.ui.screen.ScreenNavigationActivity;
import com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen;
import com.yalla.yalla.ui.screen.user.UserMomentListScreen;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import p105o000oo0o.o00O00OO;
import p190o00o0O.OooO;
import p205o00o0o0o.o000O;
import p532o0o0OOo0.o00O00;
import p562o0oOo000.o000000;
import p650o0ooo.f0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class k0 {

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f57127OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(FragmentActivity fragmentActivity) {
            super(0);
            this.f57127OooO0Oo = fragmentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0oo0000.OooO00o.OooO0O0("102024");
            int i = WalletActivity.f26588OooOoOO;
            WalletActivity.OooO00o.OooO00o(this.f57127OooO0Oo, false);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<DialogInterface, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<f0, Unit> f57128OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Function1<? super f0, Unit> function1) {
            super(1);
            this.f57128OooO0Oo = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DialogInterface dialogInterface) {
            DialogInterface it = dialogInterface;
            Intrinsics.checkNotNullParameter(it, "it");
            LiveEventBus.get("QuickRechargeDialogFromGiftSendDialog").post(Boolean.TRUE);
            Function1<f0, Unit> function1 = this.f57128OooO0Oo;
            if (function1 != null) {
                function1.invoke(null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f57129OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(FragmentActivity fragmentActivity) {
            super(0);
            this.f57129OooO0Oo = fragmentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0oo0000.OooO00o.OooO0O0("102024");
            int i = WalletActivity.f26588OooOoOO;
            WalletActivity.OooO00o.OooO00o(this.f57129OooO0Oo, false);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:51:0x0110  */
    /* JADX WARN: Code duplicated, block: B:52:0x0114  */
    /* JADX WARN: Code duplicated, block: B:55:0x0128  */
    @JvmStatic
    public static final void OooO00o(boolean z, boolean z2, @Nullable Function1<? super f0, Unit> function1) {
        boolean z3;
        f0 f0Var;
        String strOooO0OO;
        o000Oo0 o000oo0OooO00o;
        Context context = o000O00O.f13421OooO00o;
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        FragmentActivity fragmentActivity = activityOooO0O0 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O0 : null;
        if (fragmentActivity != null) {
            boolean z4 = true;
            if (oOO0.f57167OooO00o.OooO0O0()) {
                o0oo0000.OooO00o.OooO0O0("202006");
                LiveEventBus.get("RechargeFromUserInfo_Show").post(Boolean.TRUE);
                o000O o000o = new o000O(fragmentActivity);
                o000o.OooOOoo(o000000.gold_notenough);
                o000o.OooOo(true);
                o000o.OooOo0(new OooO00o(fragmentActivity));
                o000o.OooOO0o();
                return;
            }
            if (fragmentActivity instanceof MixedRoomActivity) {
                o0oo0000.OooO00o.OooO0OO("202005", MapsKt.mapOf(new Pair("source", 1)));
            } else if (fragmentActivity instanceof PrivateChatActivity) {
                o0oo0000.OooO00o.OooO0OO("202005", MapsKt.mapOf(new Pair("source", 3)));
            } else {
                if (!(fragmentActivity instanceof MainActivity ? true : fragmentActivity instanceof MomentDetailActivity ? true : fragmentActivity instanceof TopicDetailActivity)) {
                    if (fragmentActivity instanceof ScreenNavigationActivity) {
                        OooO<Activity, o00O00OO> oooO = o00O00.f53494OooO00o;
                        String strOooO0OO2 = o00O00.OooO0OO((ScreenNavigationActivity) fragmentActivity);
                        if (!Intrinsics.areEqual(strOooO0OO2, UserMomentListScreen.INSTANCE.routerName()) && !Intrinsics.areEqual(strOooO0OO2, VideoFeedScreen.INSTANCE.routerName())) {
                        }
                        if (z && !z3) {
                            o0oo0000.OooO00o.OooO0O0("202006");
                            LiveEventBus.get("RechargeFromUserInfo_Show").post(Boolean.TRUE);
                            o000O o000o2 = new o000O(fragmentActivity);
                            o000o2.OooOOoo(o000000.gold_notenough);
                            o000o2.OooOo(true);
                            o000o2.OooOo0(new OooO0OO(fragmentActivity));
                            o000o2.OooOO0o();
                            return;
                        }
                        if (z2) {
                            strOooO0OO = o0000.OooO0OO(o000000.gold_notenough);
                            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                                z4 = false;
                            }
                            if (!z4) {
                                o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                    o000oo0OooO00o.run();
                                } else {
                                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                                }
                            }
                        }
                        f0Var = new f0(fragmentActivity);
                        f0Var.OooO00o(new OooO0O0(function1));
                        if (function1 != null) {
                            function1.invoke(f0Var);
                        }
                        f0Var.OooO();
                    }
                    z3 = false;
                    if (z) {
                    }
                    if (z2) {
                        strOooO0OO = o0000.OooO0OO(o000000.gold_notenough);
                        if (strOooO0OO != null) {
                            z4 = false;
                        }
                        if (!z4) {
                            o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o000oo0OooO00o.run();
                            } else {
                                o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                            }
                        }
                    }
                    f0Var = new f0(fragmentActivity);
                    f0Var.OooO00o(new OooO0O0(function1));
                    if (function1 != null) {
                        function1.invoke(f0Var);
                    }
                    f0Var.OooO();
                }
                o0oo0000.OooO00o.OooO0OO("202005", MapsKt.mapOf(new Pair("source", 2)));
            }
            z3 = true;
            if (z) {
            }
            if (z2) {
                strOooO0OO = o0000.OooO0OO(o000000.gold_notenough);
                if (strOooO0OO != null) {
                    z4 = false;
                }
                if (!z4) {
                    o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                    }
                }
            }
            f0Var = new f0(fragmentActivity);
            f0Var.OooO00o(new OooO0O0(function1));
            if (function1 != null) {
                function1.invoke(f0Var);
            }
            f0Var.OooO();
        }
    }
}
