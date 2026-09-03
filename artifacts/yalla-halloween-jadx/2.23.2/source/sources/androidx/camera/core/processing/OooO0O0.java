package androidx.camera.core.processing;

import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends SurfaceProcessorNode.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final UUID f3831OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f3832OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f3833OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Rect f3834OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f3835OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Size f3836OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f3837OooO0oO;

    public OooO0O0(UUID uuid, int i, int i2, Rect rect, Size size, int i3, boolean z) {
        if (uuid == null) {
            throw new NullPointerException("Null uuid");
        }
        this.f3831OooO00o = uuid;
        this.f3832OooO0O0 = i;
        this.f3833OooO0OO = i2;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f3834OooO0Oo = rect;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f3836OooO0o0 = size;
        this.f3835OooO0o = i3;
        this.f3837OooO0oO = z;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OooO0OO
    @NonNull
    public final Rect OooO00o() {
        return this.f3834OooO0Oo;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OooO0OO
    public final int OooO0O0() {
        return this.f3833OooO0OO;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OooO0OO
    public final boolean OooO0OO() {
        return this.f3837OooO0oO;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OooO0OO
    public final int OooO0Oo() {
        return this.f3835OooO0o;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OooO0OO
    public final int OooO0o() {
        return this.f3832OooO0O0;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OooO0OO
    @NonNull
    public final Size OooO0o0() {
        return this.f3836OooO0o0;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OooO0OO
    @NonNull
    public final UUID OooO0oO() {
        return this.f3831OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceProcessorNode.OooO0OO)) {
            return false;
        }
        SurfaceProcessorNode.OooO0OO oooO0OO = (SurfaceProcessorNode.OooO0OO) obj;
        return this.f3831OooO00o.equals(oooO0OO.OooO0oO()) && this.f3832OooO0O0 == oooO0OO.OooO0o() && this.f3833OooO0OO == oooO0OO.OooO0O0() && this.f3834OooO0Oo.equals(oooO0OO.OooO00o()) && this.f3836OooO0o0.equals(oooO0OO.OooO0o0()) && this.f3835OooO0o == oooO0OO.OooO0Oo() && this.f3837OooO0oO == oooO0OO.OooO0OO();
    }

    public final int hashCode() {
        return ((((((((((((this.f3831OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f3832OooO0O0) * 1000003) ^ this.f3833OooO0OO) * 1000003) ^ this.f3834OooO0Oo.hashCode()) * 1000003) ^ this.f3836OooO0o0.hashCode()) * 1000003) ^ this.f3835OooO0o) * 1000003) ^ (this.f3837OooO0oO ? 1231 : 1237);
    }

    public final String toString() {
        return "OutConfig{uuid=" + this.f3831OooO00o + ", targets=" + this.f3832OooO0O0 + ", format=" + this.f3833OooO0OO + ", cropRect=" + this.f3834OooO0Oo + ", size=" + this.f3836OooO0o0 + ", rotationDegrees=" + this.f3835OooO0o + ", mirroring=" + this.f3837OooO0oO + "}";
    }
}
