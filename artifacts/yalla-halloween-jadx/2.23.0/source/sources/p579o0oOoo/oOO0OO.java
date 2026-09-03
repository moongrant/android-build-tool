package p579o0oOoo;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Looper;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
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
import o000O00.o00000O;
import org.jetbrains.annotations.Nullable;
import p157o00OoOO0.o0OO00O;
import p188o00o0O.OooOO0;
import p519o0o0O0oO.c0;
import p526o0o0OOO0.oo0oOO0;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class oOO0OO {

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f56661OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(FragmentActivity fragmentActivity) {
            super(0);
            this.f56661OooO0Oo = fragmentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO000.OooO00o("102024");
            int i = WalletActivity.f27054OooOoOO;
            WalletActivity.OooO00o.OooO00o(this.f56661OooO0Oo, false);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<DialogInterface, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<c0, Unit> f56662OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Function1<? super c0, Unit> function1) {
            super(1);
            this.f56662OooO0Oo = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DialogInterface dialogInterface) {
            DialogInterface it = dialogInterface;
            Intrinsics.checkNotNullParameter(it, "it");
            LiveEventBus.get("QuickRechargeDialogFromGiftSendDialog").post(Boolean.TRUE);
            Function1<c0, Unit> function1 = this.f56662OooO0Oo;
            if (function1 != null) {
                function1.invoke(null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f56663OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(FragmentActivity fragmentActivity) {
            super(0);
            this.f56663OooO0Oo = fragmentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO000.OooO00o("102024");
            int i = WalletActivity.f27054OooOoOO;
            WalletActivity.OooO00o.OooO00o(this.f56663OooO0Oo, false);
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
    public static final void OooO00o(boolean z, boolean z2, @Nullable Function1<? super c0, Unit> function1) {
        boolean z3;
        c0 c0Var;
        String strOooO0OO;
        o000Oo0 o000oo0OooO00o;
        Context context = o000O0.f10354OooO00o;
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        FragmentActivity fragmentActivity = activityOooO0O0 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O0 : null;
        if (fragmentActivity != null) {
            boolean z4 = true;
            if (oO000O0.f56533OooO00o.OooO0O0()) {
                o0OO000.OooO00o("202006");
                LiveEventBus.get("RechargeFromUserInfo_Show").post(Boolean.TRUE);
                o0OO00O o0oo00o2 = new o0OO00O(fragmentActivity);
                o0oo00o2.OooOOoo(oO00OOo0.gold_notenough);
                o0oo00o2.OooOo(true);
                o0oo00o2.OooOo0(new OooO00o(fragmentActivity));
                o0oo00o2.OooOO0o();
                return;
            }
            if (fragmentActivity instanceof MixedRoomActivity) {
                o0OO000.OooO0O0("202005", MapsKt.mapOf(new Pair("source", 1)));
            } else if (fragmentActivity instanceof PrivateChatActivity) {
                o0OO000.OooO0O0("202005", MapsKt.mapOf(new Pair("source", 3)));
            } else {
                if (!(fragmentActivity instanceof MainActivity ? true : fragmentActivity instanceof MomentDetailActivity ? true : fragmentActivity instanceof TopicDetailActivity)) {
                    if (fragmentActivity instanceof ScreenNavigationActivity) {
                        OooOO0<Activity, o00000O> oooOO1 = oo0oOO0.f53618OooO00o;
                        String strOooO0OO2 = oo0oOO0.OooO0OO((ScreenNavigationActivity) fragmentActivity);
                        if (!Intrinsics.areEqual(strOooO0OO2, UserMomentListScreen.INSTANCE.routerName()) && !Intrinsics.areEqual(strOooO0OO2, VideoFeedScreen.INSTANCE.routerName())) {
                        }
                        if (z && !z3) {
                            o0OO000.OooO00o("202006");
                            LiveEventBus.get("RechargeFromUserInfo_Show").post(Boolean.TRUE);
                            o0OO00O o0oo00o3 = new o0OO00O(fragmentActivity);
                            o0oo00o3.OooOOoo(oO00OOo0.gold_notenough);
                            o0oo00o3.OooOo(true);
                            o0oo00o3.OooOo0(new OooO0OO(fragmentActivity));
                            o0oo00o3.OooOO0o();
                            return;
                        }
                        if (z2) {
                            strOooO0OO = o0000.OooO0OO(oO00OOo0.gold_notenough);
                            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                                z4 = false;
                            }
                            if (!z4) {
                                o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                    o000oo0OooO00o.run();
                                } else {
                                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                                }
                            }
                        }
                        c0Var = new c0(fragmentActivity);
                        c0Var.OooO00o(new OooO0O0(function1));
                        if (function1 != null) {
                            function1.invoke(c0Var);
                        }
                        c0Var.OooO();
                    }
                    z3 = false;
                    if (z) {
                    }
                    if (z2) {
                        strOooO0OO = o0000.OooO0OO(oO00OOo0.gold_notenough);
                        if (strOooO0OO != null) {
                            z4 = false;
                        }
                        if (!z4) {
                            o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o000oo0OooO00o.run();
                            } else {
                                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                            }
                        }
                    }
                    c0Var = new c0(fragmentActivity);
                    c0Var.OooO00o(new OooO0O0(function1));
                    if (function1 != null) {
                        function1.invoke(c0Var);
                    }
                    c0Var.OooO();
                }
                o0OO000.OooO0O0("202005", MapsKt.mapOf(new Pair("source", 2)));
            }
            z3 = true;
            if (z) {
            }
            if (z2) {
                strOooO0OO = o0000.OooO0OO(oO00OOo0.gold_notenough);
                if (strOooO0OO != null) {
                    z4 = false;
                }
                if (!z4) {
                    o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                    }
                }
            }
            c0Var = new c0(fragmentActivity);
            c0Var.OooO00o(new OooO0O0(function1));
            if (function1 != null) {
                function1.invoke(c0Var);
            }
            c0Var.OooO();
        }
    }
}
