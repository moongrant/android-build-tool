package p482o0o000O;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.application.App;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.account.PasswordActivity;
import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p252o00ooO0.o000000O;
import p515o0o0O00.o00O00;
import p611o0oo0OO0.o0000;
import p611o0oo0OO0.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooOo00 extends o000000O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Context f40864OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f40865OooO0Oo;

    public static final class OooO00o implements Application.ActivityLifecycleCallbacks {
        public OooO00o() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            o00O00.OooO0oO("ActivityStackManager onCreate = " + activity.getLocalClassName());
            LiveEventBus.get("PageCreate_InApp").post(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            o00O00.OooO0oO("ActivityStackManager OnDestroy = " + activity.getLocalClassName());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            OooOo00 oooOo00 = OooOo00.this;
            oooOo00.f40865OooO0Oo++;
            if (App.f11457Oooo0o) {
                Objects.requireNonNull(oooOo00);
                App.f11457Oooo0o = false;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            OooOo00 oooOo00 = OooOo00.this;
            int i = oooOo00.f40865OooO0Oo - 1;
            oooOo00.f40865OooO0Oo = i;
            if (i == 0) {
                Objects.requireNonNull(oooOo00);
                App.f11457Oooo0o = true;
                Intrinsics.checkNotNullParameter(activity, "activity");
                if ((activity instanceof PhoneNumberActivity) || (activity instanceof SmsCodeActivity) || (activity instanceof PasswordActivity)) {
                    ToastUtil.f12567OooO00o.OooO00o(R.string.running_background);
                }
                o0000 o0000Var = o0000.f48362OooO00o;
                BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new o0000O00(null), 3, null);
            }
        }
    }

    public OooOo00(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40864OooO0OO = context;
    }

    @Override // p252o00ooO0.o000000O
    public final void OooO0OO() {
        Context context = this.f40864OooO0OO;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Application");
        ((Application) context).registerActivityLifecycleCallbacks(new OooO00o());
    }
}
