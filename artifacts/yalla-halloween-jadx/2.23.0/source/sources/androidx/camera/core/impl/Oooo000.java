package androidx.camera.core.impl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 extends SurfaceConfig {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SurfaceConfig.ConfigType f3612OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final SurfaceConfig.ConfigSize f3613OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f3614OooO0OO;

    public Oooo000(SurfaceConfig.ConfigType configType, SurfaceConfig.ConfigSize configSize, long j) {
        if (configType == null) {
            throw new NullPointerException("Null configType");
        }
        this.f3612OooO00o = configType;
        if (configSize == null) {
            throw new NullPointerException("Null configSize");
        }
        this.f3613OooO0O0 = configSize;
        this.f3614OooO0OO = j;
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    @NonNull
    public final SurfaceConfig.ConfigSize OooO0O0() {
        return this.f3613OooO0O0;
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    @NonNull
    public final SurfaceConfig.ConfigType OooO0OO() {
        return this.f3612OooO00o;
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    public final long OooO0Oo() {
        return this.f3614OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceConfig)) {
            return false;
        }
        SurfaceConfig surfaceConfig = (SurfaceConfig) obj;
        return this.f3612OooO00o.equals(surfaceConfig.OooO0OO()) && this.f3613OooO0O0.equals(surfaceConfig.OooO0O0()) && this.f3614OooO0OO == surfaceConfig.OooO0Oo();
    }

    public final int hashCode() {
        int iHashCode = (((this.f3612OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f3613OooO0O0.hashCode()) * 1000003;
        long j = this.f3614OooO0OO;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceConfig{configType=");
        sb.append(this.f3612OooO00o);
        sb.append(", configSize=");
        sb.append(this.f3613OooO0O0);
        sb.append(", streamUseCase=");
        return android.support.v4.media.session.OooO0o.OooO0O0(sb, this.f3614OooO0OO, "}");
    }
}
