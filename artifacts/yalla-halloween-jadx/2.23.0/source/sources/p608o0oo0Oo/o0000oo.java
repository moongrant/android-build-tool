package p608o0oo0Oo;

import android.os.Handler;
import android.os.HandlerThread;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class o0000oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public HandlerThread f56993OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Handler f56994OooO0O0 = null;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0000oo)) {
            return false;
        }
        o0000oo o0000ooVar = (o0000oo) obj;
        return Intrinsics.areEqual(this.f56993OooO00o, o0000ooVar.f56993OooO00o) && Intrinsics.areEqual(this.f56994OooO0O0, o0000ooVar.f56994OooO0O0);
    }

    public final int hashCode() {
        HandlerThread handlerThread = this.f56993OooO00o;
        int iHashCode = (handlerThread == null ? 0 : handlerThread.hashCode()) * 31;
        Handler handler = this.f56994OooO0O0;
        return iHashCode + (handler != null ? handler.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "HandlerHolder(thread=" + this.f56993OooO00o + ", handler=" + this.f56994OooO0O0 + ')';
    }
}
