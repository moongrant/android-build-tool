package o00O0OO0;

import android.content.Context;
import android.os.Build;
import androidx.annotation.RestrictTo;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p119o00O0Oo0.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooOO0O<Boolean> f36268OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooO0OO f36269OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final OooOO0O<o00O0O0O.OooO0O0> f36270OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooOO0O<Boolean> f36271OooO0Oo;

    @JvmOverloads
    public o000oOoO(@NotNull Context context, @NotNull o00O0O taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        OooO00o batteryChargingTracker = new OooO00o(applicationContext, taskExecutor);
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "context.applicationContext");
        OooO0OO batteryNotLowTracker = new OooO0OO(applicationContext2, taskExecutor);
        Context context2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context.applicationContext");
        String str = OooOo00.f36266OooO00o;
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        OooOO0O<o00O0O0O.OooO0O0> networkStateTracker = Build.VERSION.SDK_INT >= 24 ? new OooOOOO(context2, taskExecutor) : new OooOo(context2, taskExecutor);
        Context applicationContext3 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext3, "context.applicationContext");
        Oooo000 storageNotLowTracker = new Oooo000(applicationContext3, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Intrinsics.checkNotNullParameter(batteryChargingTracker, "batteryChargingTracker");
        Intrinsics.checkNotNullParameter(batteryNotLowTracker, "batteryNotLowTracker");
        Intrinsics.checkNotNullParameter(networkStateTracker, "networkStateTracker");
        Intrinsics.checkNotNullParameter(storageNotLowTracker, "storageNotLowTracker");
        this.f36268OooO00o = batteryChargingTracker;
        this.f36269OooO0O0 = batteryNotLowTracker;
        this.f36270OooO0OO = networkStateTracker;
        this.f36271OooO0Oo = storageNotLowTracker;
    }
}
