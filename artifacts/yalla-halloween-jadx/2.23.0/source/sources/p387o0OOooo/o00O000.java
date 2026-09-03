package p387o0OOooo;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooO0O0;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
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
import p145o00Oo0O.o000oOoO;
import p417o0OoO0.o0OoOo0;
import p427o0OoOO00.OooOo;
import p427o0OoOO00.o0OOO0o;
import p579o0oOoo.oOOOOo0O;
import p579o0oOoo.ooo0Oo0;
import p584o0oOooO0.oO00OOo0;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00O000 extends o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f44371OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f44372OooO0o0;

    public static final class OooO00o implements Application.ActivityLifecycleCallbacks {
        public OooO00o() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            OooOOO0.OooO0o("AppOnBackground onCreate = " + activity.getLocalClassName());
            OooOOO0.OooO0o("ActivityTask onCreate = " + activity.getLocalClassName());
            LiveEventBus.get("PageCreate_InApp").post(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            OooOOO0.OooO0o("AppOnBackground OnDestroy = " + activity.getLocalClassName());
            OooOOO0.OooO0o("ActivityTask OnDestroy = " + activity.getLocalClassName());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            OooOOO0.OooO0o("ActivityTask onPause = " + activity.getLocalClassName());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            OooOOO0.OooO0o("ActivityTask OnResumed = " + activity.getLocalClassName());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            o00O000 o00o001 = o00O000.this;
            o00o001.f44372OooO0o0++;
            if (App.f22703OooO0o0) {
                o00o001.getClass();
                App.f22703OooO0o0 = false;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            OooOOO0.OooO0o("ActivityTask OnStopped = " + activity.getLocalClassName());
            o00O000 o00o001 = o00O000.this;
            int i = o00o001.f44372OooO0o0 + (-1);
            o00o001.f44372OooO0o0 = i;
            if (i == 0) {
                App.f22703OooO0o0 = true;
                Intrinsics.checkNotNullParameter(activity, "activity");
                if ((activity instanceof PhoneNumberActivity) || (activity instanceof SmsCodeActivity) || (activity instanceof PasswordActivity)) {
                    String strOooO0OO = o0000.OooO0OO(oO00OOo0.running_background);
                    if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                        o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o.run();
                        } else {
                            o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                        }
                    }
                }
                Sailfish.INSTANCE.flush();
                oOOOOo0O oooooo0o = oOOOOo0O.f56683OooO00o;
                Activity activityOooO0O0 = OooO0O0.OooO0O0();
                if (Intrinsics.areEqual(activityOooO0O0 != null ? o0OoOo0.OooO00o(activityOooO0O0) : null, "MainActivity")) {
                    MutableState mutableState = o0OOO0o.f45698OooO00o;
                    if (o0OOO0o.OooO0oO() == RoomState.InRoom || o0OOO0o.OooO0oO() == RoomState.Hook) {
                        return;
                    }
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        PackageManager pm = o000O0.OooO00o().getPackageManager();
                        int i2 = oOOOOo0O.OooO0O0.$EnumSwitchMapping$0[OooOo.OooO00o(OooOo.f45669OooO00o.getValue()).ordinal()];
                        String str = oOOOOo0O.f56687OooO0o0;
                        String str2 = oOOOOo0O.f56686OooO0Oo;
                        String str3 = oOOOOo0O.f56685OooO0OO;
                        if (i2 == 1) {
                            Intrinsics.checkNotNullExpressionValue(pm, "pm");
                            if (!ooo0Oo0.OooO0OO(pm, str3)) {
                                ooo0Oo0.OooO0O0(pm, str3);
                                ooo0Oo0.OooO00o(pm, str2);
                                ooo0Oo0.OooO00o(pm, str);
                            }
                        } else if (i2 == 2) {
                            Intrinsics.checkNotNullExpressionValue(pm, "pm");
                            if (!ooo0Oo0.OooO0OO(pm, str2)) {
                                ooo0Oo0.OooO00o(pm, str3);
                                ooo0Oo0.OooO0O0(pm, str2);
                                ooo0Oo0.OooO00o(pm, str);
                            }
                        } else if (i2 == 3) {
                            Intrinsics.checkNotNullExpressionValue(pm, "pm");
                            if (!ooo0Oo0.OooO0OO(pm, str)) {
                                ooo0Oo0.OooO00o(pm, str3);
                                ooo0Oo0.OooO00o(pm, str2);
                                ooo0Oo0.OooO0O0(pm, str);
                            }
                        }
                        Result.m4213constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m4213constructorimpl(ResultKt.createFailure(th));
                    }
                }
            }
        }
    }

    public o00O000(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44371OooO0Oo = context;
    }

    @Override // p145o00Oo0O.Oooo0
    public final void run() {
        Context context = this.f44371OooO0Oo;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Application");
        ((Application) context).registerActivityLifecycleCallbacks(new OooO00o());
    }
}
