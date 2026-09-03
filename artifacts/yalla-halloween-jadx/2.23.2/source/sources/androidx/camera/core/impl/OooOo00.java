package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.DynamicRange;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 extends SessionConfig.OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final DeferrableSurface f3593OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<DeferrableSurface> f3594OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f3595OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f3596OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final DynamicRange f3597OooO0o0;

    public static final class OooO00o extends SessionConfig.OooO.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public DeferrableSurface f3598OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public List<DeferrableSurface> f3599OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f3600OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Integer f3601OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public DynamicRange f3602OooO0o0;

        public final OooOo00 OooO00o() {
            String strOooO00o = this.f3598OooO00o == null ? " surface" : "";
            if (this.f3599OooO0O0 == null) {
                strOooO00o = strOooO00o.concat(" sharedSurfaces");
            }
            if (this.f3601OooO0Oo == null) {
                strOooO00o = OooOOOO.OooO00o(strOooO00o, " surfaceGroupId");
            }
            if (this.f3602OooO0o0 == null) {
                strOooO00o = OooOOOO.OooO00o(strOooO00o, " dynamicRange");
            }
            if (strOooO00o.isEmpty()) {
                return new OooOo00(this.f3598OooO00o, this.f3599OooO0O0, this.f3600OooO0OO, this.f3601OooO0Oo.intValue(), this.f3602OooO0o0);
            }
            throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
        }

        public final OooO00o OooO0O0(DynamicRange dynamicRange) {
            if (dynamicRange == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f3602OooO0o0 = dynamicRange;
            return this;
        }
    }

    public OooOo00(DeferrableSurface deferrableSurface, List list, String str, int i, DynamicRange dynamicRange) {
        this.f3593OooO00o = deferrableSurface;
        this.f3594OooO0O0 = list;
        this.f3595OooO0OO = str;
        this.f3596OooO0Oo = i;
        this.f3597OooO0o0 = dynamicRange;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OooO
    @NonNull
    public final DynamicRange OooO0O0() {
        return this.f3597OooO0o0;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OooO
    @Nullable
    public final String OooO0OO() {
        return this.f3595OooO0OO;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OooO
    @NonNull
    public final List<DeferrableSurface> OooO0Oo() {
        return this.f3594OooO0O0;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OooO
    public final int OooO0o() {
        return this.f3596OooO0Oo;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OooO
    @NonNull
    public final DeferrableSurface OooO0o0() {
        return this.f3593OooO00o;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SessionConfig.OooO)) {
            return false;
        }
        SessionConfig.OooO oooO = (SessionConfig.OooO) obj;
        return this.f3593OooO00o.equals(oooO.OooO0o0()) && this.f3594OooO0O0.equals(oooO.OooO0Oo()) && ((str = this.f3595OooO0OO) != null ? str.equals(oooO.OooO0OO()) : oooO.OooO0OO() == null) && this.f3596OooO0Oo == oooO.OooO0o() && this.f3597OooO0o0.equals(oooO.OooO0O0());
    }

    public final int hashCode() {
        int iHashCode = (((this.f3593OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f3594OooO0O0.hashCode()) * 1000003;
        String str = this.f3595OooO0OO;
        return ((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f3596OooO0Oo) * 1000003) ^ this.f3597OooO0o0.hashCode();
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.f3593OooO00o + ", sharedSurfaces=" + this.f3594OooO0O0 + ", physicalCameraId=" + this.f3595OooO0OO + ", surfaceGroupId=" + this.f3596OooO0Oo + ", dynamicRange=" + this.f3597OooO0o0 + "}";
    }
}
