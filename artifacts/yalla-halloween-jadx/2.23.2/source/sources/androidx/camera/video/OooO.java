package androidx.camera.video;

import android.util.Range;
import androidx.annotation.NonNull;
import p039OoooOoo.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends OooOo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oOO00O f3877OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Range<Integer> f3878OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Range<Integer> f3879OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f3880OooO0oO;

    public static final class OooO00o extends OooOo.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public oOO00O f3881OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Range<Integer> f3882OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Range<Integer> f3883OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Integer f3884OooO0Oo;

        public OooO00o(OooOo oooOo) {
            this.f3881OooO00o = oooOo.OooO0o0();
            this.f3882OooO0O0 = oooOo.OooO0Oo();
            this.f3883OooO0OO = oooOo.OooO0OO();
            this.f3884OooO0Oo = Integer.valueOf(oooOo.OooO0O0());
        }

        public final OooO OooO00o() {
            String strOooO00o = this.f3881OooO00o == null ? " qualitySelector" : "";
            if (this.f3882OooO0O0 == null) {
                strOooO00o = strOooO00o.concat(" frameRate");
            }
            if (this.f3883OooO0OO == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " bitrate");
            }
            if (this.f3884OooO0Oo == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " aspectRatio");
            }
            if (strOooO00o.isEmpty()) {
                return new OooO(this.f3881OooO00o, this.f3882OooO0O0, this.f3883OooO0OO, this.f3884OooO0Oo.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
        }

        public final OooO00o OooO0O0(int i) {
            this.f3884OooO0Oo = Integer.valueOf(i);
            return this;
        }

        public final OooO00o OooO0OO(oOO00O ooo00o) {
            if (ooo00o == null) {
                throw new NullPointerException("Null qualitySelector");
            }
            this.f3881OooO00o = ooo00o;
            return this;
        }
    }

    public OooO(oOO00O ooo00o, Range range, Range range2, int i) {
        this.f3877OooO0Oo = ooo00o;
        this.f3879OooO0o0 = range;
        this.f3878OooO0o = range2;
        this.f3880OooO0oO = i;
    }

    @Override // androidx.camera.video.OooOo
    public final int OooO0O0() {
        return this.f3880OooO0oO;
    }

    @Override // androidx.camera.video.OooOo
    @NonNull
    public final Range<Integer> OooO0OO() {
        return this.f3878OooO0o;
    }

    @Override // androidx.camera.video.OooOo
    @NonNull
    public final Range<Integer> OooO0Oo() {
        return this.f3879OooO0o0;
    }

    @Override // androidx.camera.video.OooOo
    public final OooO00o OooO0o() {
        return new OooO00o(this);
    }

    @Override // androidx.camera.video.OooOo
    @NonNull
    public final oOO00O OooO0o0() {
        return this.f3877OooO0Oo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooOo)) {
            return false;
        }
        OooOo oooOo = (OooOo) obj;
        return this.f3877OooO0Oo.equals(oooOo.OooO0o0()) && this.f3879OooO0o0.equals(oooOo.OooO0Oo()) && this.f3878OooO0o.equals(oooOo.OooO0OO()) && this.f3880OooO0oO == oooOo.OooO0O0();
    }

    public final int hashCode() {
        return ((((((this.f3877OooO0Oo.hashCode() ^ 1000003) * 1000003) ^ this.f3879OooO0o0.hashCode()) * 1000003) ^ this.f3878OooO0o.hashCode()) * 1000003) ^ this.f3880OooO0oO;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSpec{qualitySelector=");
        sb.append(this.f3877OooO0Oo);
        sb.append(", frameRate=");
        sb.append(this.f3879OooO0o0);
        sb.append(", bitrate=");
        sb.append(this.f3878OooO0o);
        sb.append(", aspectRatio=");
        return p022Oooo00O.OooOO0.OooO00o(sb, this.f3880OooO0oO, "}");
    }
}
