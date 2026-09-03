package androidx.camera.core.impl;

import android.os.Handler;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO extends o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Executor f3564OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Handler f3565OooO0O0;

    public OooO0OO(Executor executor, Handler handler) {
        if (executor == null) {
            throw new NullPointerException("Null cameraExecutor");
        }
        this.f3564OooO00o = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.f3565OooO0O0 = handler;
    }

    @Override // androidx.camera.core.impl.o000OOo
    @NonNull
    public final Executor OooO00o() {
        return this.f3564OooO00o;
    }

    @Override // androidx.camera.core.impl.o000OOo
    @NonNull
    public final Handler OooO0O0() {
        return this.f3565OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o000OOo)) {
            return false;
        }
        o000OOo o000ooo2 = (o000OOo) obj;
        return this.f3564OooO00o.equals(o000ooo2.OooO00o()) && this.f3565OooO0O0.equals(o000ooo2.OooO0O0());
    }

    public final int hashCode() {
        return ((this.f3564OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f3565OooO0O0.hashCode();
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f3564OooO00o + ", schedulerHandler=" + this.f3565OooO0O0 + "}";
    }
}
