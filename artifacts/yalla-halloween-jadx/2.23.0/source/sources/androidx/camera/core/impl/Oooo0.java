package androidx.camera.core.impl;

import android.util.Size;
import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 extends oo0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Size f3605OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<Integer, Size> f3606OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Size f3607OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Map<Integer, Size> f3608OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Map<Integer, Size> f3609OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Size f3610OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Map<Integer, Size> f3611OooO0oO;

    public Oooo0(Size size, Map<Integer, Size> map, Size size2, Map<Integer, Size> map2, Size size3, Map<Integer, Size> map3, Map<Integer, Size> map4) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.f3605OooO00o = size;
        if (map == null) {
            throw new NullPointerException("Null s720pSizeMap");
        }
        this.f3606OooO0O0 = map;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.f3607OooO0OO = size2;
        if (map2 == null) {
            throw new NullPointerException("Null s1440pSizeMap");
        }
        this.f3608OooO0Oo = map2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.f3610OooO0o0 = size3;
        if (map3 == null) {
            throw new NullPointerException("Null maximumSizeMap");
        }
        this.f3609OooO0o = map3;
        if (map4 == null) {
            throw new NullPointerException("Null ultraMaximumSizeMap");
        }
        this.f3611OooO0oO = map4;
    }

    @Override // androidx.camera.core.impl.oo0O
    @NonNull
    public final Size OooO00o() {
        return this.f3605OooO00o;
    }

    @Override // androidx.camera.core.impl.oo0O
    @NonNull
    public final Map<Integer, Size> OooO0O0() {
        return this.f3609OooO0o;
    }

    @Override // androidx.camera.core.impl.oo0O
    @NonNull
    public final Size OooO0OO() {
        return this.f3607OooO0OO;
    }

    @Override // androidx.camera.core.impl.oo0O
    @NonNull
    public final Size OooO0Oo() {
        return this.f3610OooO0o0;
    }

    @Override // androidx.camera.core.impl.oo0O
    @NonNull
    public final Map<Integer, Size> OooO0o() {
        return this.f3606OooO0O0;
    }

    @Override // androidx.camera.core.impl.oo0O
    @NonNull
    public final Map<Integer, Size> OooO0o0() {
        return this.f3608OooO0Oo;
    }

    @Override // androidx.camera.core.impl.oo0O
    @NonNull
    public final Map<Integer, Size> OooO0oO() {
        return this.f3611OooO0oO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oo0O)) {
            return false;
        }
        oo0O oo0o = (oo0O) obj;
        return this.f3605OooO00o.equals(oo0o.OooO00o()) && this.f3606OooO0O0.equals(oo0o.OooO0o()) && this.f3607OooO0OO.equals(oo0o.OooO0OO()) && this.f3608OooO0Oo.equals(oo0o.OooO0o0()) && this.f3610OooO0o0.equals(oo0o.OooO0Oo()) && this.f3609OooO0o.equals(oo0o.OooO0O0()) && this.f3611OooO0oO.equals(oo0o.OooO0oO());
    }

    public final int hashCode() {
        return ((((((((((((this.f3605OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f3606OooO0O0.hashCode()) * 1000003) ^ this.f3607OooO0OO.hashCode()) * 1000003) ^ this.f3608OooO0Oo.hashCode()) * 1000003) ^ this.f3610OooO0o0.hashCode()) * 1000003) ^ this.f3609OooO0o.hashCode()) * 1000003) ^ this.f3611OooO0oO.hashCode();
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f3605OooO00o + ", s720pSizeMap=" + this.f3606OooO0O0 + ", previewSize=" + this.f3607OooO0OO + ", s1440pSizeMap=" + this.f3608OooO0Oo + ", recordSize=" + this.f3610OooO0o0 + ", maximumSizeMap=" + this.f3609OooO0o + ", ultraMaximumSizeMap=" + this.f3611OooO0oO + "}";
    }
}
