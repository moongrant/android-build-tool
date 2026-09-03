package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 extends SurfaceRequest.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Rect f3442OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f3443OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f3444OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f3445OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Matrix f3446OooO0o0;

    public OooOO0(Rect rect, int i, int i2, boolean z, Matrix matrix) {
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f3442OooO00o = rect;
        this.f3443OooO0O0 = i;
        this.f3444OooO0OO = i2;
        this.f3445OooO0Oo = z;
        if (matrix == null) {
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        this.f3446OooO0o0 = matrix;
    }

    @Override // androidx.camera.core.SurfaceRequest.OooO0OO
    @NonNull
    public final Rect OooO00o() {
        return this.f3442OooO00o;
    }

    @Override // androidx.camera.core.SurfaceRequest.OooO0OO
    public final int OooO0O0() {
        return this.f3443OooO0O0;
    }

    @Override // androidx.camera.core.SurfaceRequest.OooO0OO
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Matrix OooO0OO() {
        return this.f3446OooO0o0;
    }

    @Override // androidx.camera.core.SurfaceRequest.OooO0OO
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int OooO0Oo() {
        return this.f3444OooO0OO;
    }

    @Override // androidx.camera.core.SurfaceRequest.OooO0OO
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean OooO0o0() {
        return this.f3445OooO0Oo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceRequest.OooO0OO)) {
            return false;
        }
        SurfaceRequest.OooO0OO oooO0OO = (SurfaceRequest.OooO0OO) obj;
        return this.f3442OooO00o.equals(oooO0OO.OooO00o()) && this.f3443OooO0O0 == oooO0OO.OooO0O0() && this.f3444OooO0OO == oooO0OO.OooO0Oo() && this.f3445OooO0Oo == oooO0OO.OooO0o0() && this.f3446OooO0o0.equals(oooO0OO.OooO0OO());
    }

    public final int hashCode() {
        return ((((((((this.f3442OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f3443OooO0O0) * 1000003) ^ this.f3444OooO0OO) * 1000003) ^ (this.f3445OooO0Oo ? 1231 : 1237)) * 1000003) ^ this.f3446OooO0o0.hashCode();
    }

    public final String toString() {
        return "TransformationInfo{getCropRect=" + this.f3442OooO00o + ", getRotationDegrees=" + this.f3443OooO0O0 + ", getTargetRotation=" + this.f3444OooO0OO + ", hasCameraTransform=" + this.f3445OooO0Oo + ", getSensorToBufferTransform=" + this.f3446OooO0o0 + "}";
    }
}
