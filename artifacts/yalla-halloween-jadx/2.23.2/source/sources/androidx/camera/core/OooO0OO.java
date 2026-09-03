package androidx.camera.core;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO extends CameraState.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f3438OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Throwable f3439OooO0O0;

    public OooO0OO(int i, @Nullable Throwable th) {
        this.f3438OooO00o = i;
        this.f3439OooO0O0 = th;
    }

    @Override // androidx.camera.core.CameraState.OooO00o
    @Nullable
    public final Throwable OooO00o() {
        return this.f3439OooO0O0;
    }

    @Override // androidx.camera.core.CameraState.OooO00o
    public final int OooO0O0() {
        return this.f3438OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraState.OooO00o)) {
            return false;
        }
        CameraState.OooO00o oooO00o = (CameraState.OooO00o) obj;
        if (this.f3438OooO00o == oooO00o.OooO0O0()) {
            Throwable th = this.f3439OooO0O0;
            if (th == null) {
                if (oooO00o.OooO00o() == null) {
                    return true;
                }
            } else if (th.equals(oooO00o.OooO00o())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f3438OooO00o ^ 1000003) * 1000003;
        Throwable th = this.f3439OooO0O0;
        return i ^ (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "StateError{code=" + this.f3438OooO00o + ", cause=" + this.f3439OooO0O0 + "}";
    }
}
