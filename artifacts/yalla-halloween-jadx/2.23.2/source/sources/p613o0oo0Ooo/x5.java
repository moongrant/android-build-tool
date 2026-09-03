package p613o0oo0Ooo;

import android.os.Handler;
import android.os.HandlerThread;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class x5 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public HandlerThread f57509OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Handler f57510OooO0O0 = null;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5)) {
            return false;
        }
        x5 x5Var = (x5) obj;
        return Intrinsics.areEqual(this.f57509OooO00o, x5Var.f57509OooO00o) && Intrinsics.areEqual(this.f57510OooO0O0, x5Var.f57510OooO0O0);
    }

    public final int hashCode() {
        HandlerThread handlerThread = this.f57509OooO00o;
        int iHashCode = (handlerThread == null ? 0 : handlerThread.hashCode()) * 31;
        Handler handler = this.f57510OooO0O0;
        return iHashCode + (handler != null ? handler.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "HandlerHolder(thread=" + this.f57509OooO00o + ", handler=" + this.f57510OooO0O0 + ')';
    }
}
