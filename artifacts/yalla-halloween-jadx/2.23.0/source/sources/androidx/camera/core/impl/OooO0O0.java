package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.DynamicRange;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SurfaceConfig f3557OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f3558OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Size f3559OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final DynamicRange f3560OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Config f3561OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<UseCaseConfigFactory.CaptureType> f3562OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Range<Integer> f3563OooO0oO;

    public OooO0O0(Oooo000 oooo000, int i, Size size, DynamicRange dynamicRange, ArrayList arrayList, @Nullable Config config, @Nullable Range range) {
        if (oooo000 == null) {
            throw new NullPointerException("Null surfaceConfig");
        }
        this.f3557OooO00o = oooo000;
        this.f3558OooO0O0 = i;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f3559OooO0OO = size;
        if (dynamicRange == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.f3560OooO0Oo = dynamicRange;
        this.f3562OooO0o0 = arrayList;
        this.f3561OooO0o = config;
        this.f3563OooO0oO = range;
    }

    @Override // androidx.camera.core.impl.OooO00o
    @NonNull
    public final List<UseCaseConfigFactory.CaptureType> OooO00o() {
        return this.f3562OooO0o0;
    }

    @Override // androidx.camera.core.impl.OooO00o
    @NonNull
    public final DynamicRange OooO0O0() {
        return this.f3560OooO0Oo;
    }

    @Override // androidx.camera.core.impl.OooO00o
    public final int OooO0OO() {
        return this.f3558OooO0O0;
    }

    @Override // androidx.camera.core.impl.OooO00o
    @Nullable
    public final Config OooO0Oo() {
        return this.f3561OooO0o;
    }

    @Override // androidx.camera.core.impl.OooO00o
    @NonNull
    public final SurfaceConfig OooO0o() {
        return this.f3557OooO00o;
    }

    @Override // androidx.camera.core.impl.OooO00o
    @NonNull
    public final Size OooO0o0() {
        return this.f3559OooO0OO;
    }

    @Override // androidx.camera.core.impl.OooO00o
    @Nullable
    public final Range<Integer> OooO0oO() {
        return this.f3563OooO0oO;
    }

    public final boolean equals(Object obj) {
        Config config;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooO00o)) {
            return false;
        }
        OooO00o oooO00o = (OooO00o) obj;
        if (this.f3557OooO00o.equals(oooO00o.OooO0o()) && this.f3558OooO0O0 == oooO00o.OooO0OO() && this.f3559OooO0OO.equals(oooO00o.OooO0o0()) && this.f3560OooO0Oo.equals(oooO00o.OooO0O0()) && this.f3562OooO0o0.equals(oooO00o.OooO00o()) && ((config = this.f3561OooO0o) != null ? config.equals(oooO00o.OooO0Oo()) : oooO00o.OooO0Oo() == null)) {
            Range<Integer> range = this.f3563OooO0oO;
            if (range == null) {
                if (oooO00o.OooO0oO() == null) {
                    return true;
                }
            } else if (range.equals(oooO00o.OooO0oO())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.f3557OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f3558OooO0O0) * 1000003) ^ this.f3559OooO0OO.hashCode()) * 1000003) ^ this.f3560OooO0Oo.hashCode()) * 1000003) ^ this.f3562OooO0o0.hashCode()) * 1000003;
        Config config = this.f3561OooO0o;
        int iHashCode2 = (iHashCode ^ (config == null ? 0 : config.hashCode())) * 1000003;
        Range<Integer> range = this.f3563OooO0oO;
        return iHashCode2 ^ (range != null ? range.hashCode() : 0);
    }

    public final String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f3557OooO00o + ", imageFormat=" + this.f3558OooO0O0 + ", size=" + this.f3559OooO0OO + ", dynamicRange=" + this.f3560OooO0Oo + ", captureTypes=" + this.f3562OooO0o0 + ", implementationOptions=" + this.f3561OooO0o + ", targetFrameRate=" + this.f3563OooO0oO + "}";
    }
}
