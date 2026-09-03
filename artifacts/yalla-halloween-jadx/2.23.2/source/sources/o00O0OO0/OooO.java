package o00O0OO0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.RestrictTo;
import androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$broadcastReceiver$1;
import kotlin.jvm.internal.Intrinsics;
import o00O0OO0.OooO;
import org.jetbrains.annotations.NotNull;
import p115o00O00oO.o0Oo0oo;
import p119o00O0Oo0.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class OooO<T> extends OooOO0O<T> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final BroadcastReceiverConstraintTracker$broadcastReceiver$1 f36252OooO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$broadcastReceiver$1] */
    public OooO(@NotNull Context context, @NotNull o00O0O taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.f36252OooO0o = new BroadcastReceiver(this) { // from class: androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$broadcastReceiver$1

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ OooO<Object> f11553OooO00o;

            {
                this.f11553OooO00o = this;
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(@NotNull Context context2, @NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                this.f11553OooO00o.OooO0oO(intent);
            }
        };
    }

    @Override // o00O0OO0.OooOO0O
    public final void OooO0Oo() {
        o0Oo0oo.OooO0Oo().OooO00o(OooOO0.f36255OooO00o, getClass().getSimpleName().concat(": registering receiver"));
        this.f36257OooO0O0.registerReceiver(this.f36252OooO0o, OooO0o());
    }

    @NotNull
    public abstract IntentFilter OooO0o();

    @Override // o00O0OO0.OooOO0O
    public final void OooO0o0() {
        o0Oo0oo.OooO0Oo().OooO00o(OooOO0.f36255OooO00o, getClass().getSimpleName().concat(": unregistering receiver"));
        this.f36257OooO0O0.unregisterReceiver(this.f36252OooO0o);
    }

    public abstract void OooO0oO(@NotNull Intent intent);
}
