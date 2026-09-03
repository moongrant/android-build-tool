package p395o0Oo00o;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import androidx.activity.OooOo00;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooO0O0;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.common.support.apm.Sailfish;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.app.application.App;
import com.yalla.yalla.manager.RoomState;
import com.yalla.yalla.ui.activity.account.PasswordActivity;
import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p191o00o0O0.o00Oo0;
import p423o0OoO0OO.o0000oo;
import p429o0OoOO.o0Oo0oo;
import p562o0oOo000.o000000;
import p590o0oOooo0.oOO00000;
import p590o0oOooo0.z0;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooOO0 extends o00Oo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f43619OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f43620OooO0o0;

    public static final class OooO00o implements Application.ActivityLifecycleCallbacks {
        public OooO00o() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            o0000O00.OooO0o("AppOnBackground onCreate = " + activity.getLocalClassName());
            o0000O00.OooO0o("ActivityTask onCreate = " + activity.getLocalClassName());
            LiveEventBus.get("PageCreate_InApp").post(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            o0000O00.OooO0o("AppOnBackground OnDestroy = " + activity.getLocalClassName());
            o0000O00.OooO0o("ActivityTask OnDestroy = " + activity.getLocalClassName());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            o0000O00.OooO0o("ActivityTask onPause = " + activity.getLocalClassName());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            o0000O00.OooO0o("ActivityTask OnResumed = " + activity.getLocalClassName());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            OooOO0 oooOO1 = OooOO0.this;
            oooOO1.f43620OooO0o0++;
            if (App.f22233OooO0o0) {
                oooOO1.getClass();
                App.f22233OooO0o0 = false;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            o0000O00.OooO0o("ActivityTask OnStopped = " + activity.getLocalClassName());
            OooOO0 oooOO1 = OooOO0.this;
            int i = oooOO1.f43620OooO0o0 + (-1);
            oooOO1.f43620OooO0o0 = i;
            if (i == 0) {
                App.f22233OooO0o0 = true;
                Intrinsics.checkNotNullParameter(activity, "activity");
                if ((activity instanceof PhoneNumberActivity) || (activity instanceof SmsCodeActivity) || (activity instanceof PasswordActivity)) {
                    String strOooO0OO = o0000.OooO0OO(o000000.running_background);
                    if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                        o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o.run();
                        } else {
                            o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                        }
                    }
                }
                Sailfish.INSTANCE.flush();
                z0 z0Var = z0.f57313OooO00o;
                Activity activityOooO0O0 = OooO0O0.OooO0O0();
                if (Intrinsics.areEqual(activityOooO0O0 != null ? o0000oo.OooO00o(activityOooO0O0) : null, "MainActivity")) {
                    MutableState mutableState = o0Oo0oo.f46817OooO00o;
                    if (o0Oo0oo.OooO0oO() == RoomState.InRoom || o0Oo0oo.OooO0oO() == RoomState.Hook) {
                        return;
                    }
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        PackageManager packageManager = o000O00O.OooO00o().getPackageManager();
                        int i2 = z0.OooO0O0.$EnumSwitchMapping$0[p429o0OoOO.OooOo00.OooO00o(p429o0OoOO.OooOo00.f46776OooO00o.getValue()).ordinal()];
                        String str = z0.f57317OooO0o0;
                        String str2 = z0.f57316OooO0Oo;
                        String str3 = z0.f57315OooO0OO;
                        if (i2 == 1) {
                            Intrinsics.checkNotNull(packageManager);
                            if (!oOO00000.OooO0OO(packageManager, str3)) {
                                oOO00000.OooO0O0(packageManager, str3);
                                oOO00000.OooO00o(packageManager, str2);
                                oOO00000.OooO00o(packageManager, str);
                            }
                        } else if (i2 == 2) {
                            Intrinsics.checkNotNull(packageManager);
                            if (!oOO00000.OooO0OO(packageManager, str2)) {
                                oOO00000.OooO00o(packageManager, str3);
                                oOO00000.OooO0O0(packageManager, str2);
                                oOO00000.OooO00o(packageManager, str);
                            }
                        } else if (i2 == 3) {
                            Intrinsics.checkNotNull(packageManager);
                            if (!oOO00000.OooO0OO(packageManager, str)) {
                                oOO00000.OooO00o(packageManager, str3);
                                oOO00000.OooO00o(packageManager, str2);
                                oOO00000.OooO0O0(packageManager, str);
                            }
                        }
                        Result.m4215constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m4215constructorimpl(ResultKt.createFailure(th));
                    }
                }
            }
        }
    }

    public OooOO0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43619OooO0Oo = context;
    }

    @Override // p191o00o0O0.o00O0O
    public final void run() {
        Context context = this.f43619OooO0Oo;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Application");
        ((Application) context).registerActivityLifecycleCallbacks(new OooO00o());
    }
}
