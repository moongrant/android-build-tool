package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.DynamicRange;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo extends oo0O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Size f3585OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final DynamicRange f3586OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Range<Integer> f3587OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Config f3588OooO0o0;

    public static final class OooO00o extends oo0O.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Size f3589OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public DynamicRange f3590OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Range<Integer> f3591OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Config f3592OooO0Oo;

        public OooO00o(oo0O oo0o) {
            this.f3589OooO00o = oo0o.OooO0Oo();
            this.f3590OooO0O0 = oo0o.OooO00o();
            this.f3591OooO0OO = oo0o.OooO0O0();
            this.f3592OooO0Oo = oo0o.OooO0OO();
        }

        public final OooOo OooO00o() {
            String strOooO00o = this.f3589OooO00o == null ? " resolution" : "";
            if (this.f3590OooO0O0 == null) {
                strOooO00o = strOooO00o.concat(" dynamicRange");
            }
            if (this.f3591OooO0OO == null) {
                strOooO00o = OooOOOO.OooO00o(strOooO00o, " expectedFrameRateRange");
            }
            if (strOooO00o.isEmpty()) {
                return new OooOo(this.f3589OooO00o, this.f3590OooO0O0, this.f3591OooO0OO, this.f3592OooO0Oo);
            }
            throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
        }

        public final OooO00o OooO0O0(Range range) {
            if (range == null) {
                throw new NullPointerException("Null expectedFrameRateRange");
            }
            this.f3591OooO0OO = range;
            return this;
        }
    }

    public OooOo(Size size, DynamicRange dynamicRange, Range range, Config config) {
        this.f3585OooO0O0 = size;
        this.f3586OooO0OO = dynamicRange;
        this.f3587OooO0Oo = range;
        this.f3588OooO0o0 = config;
    }

    @Override // androidx.camera.core.impl.oo0O
    @NonNull
    public final DynamicRange OooO00o() {
        return this.f3586OooO0OO;
    }

    @Override // androidx.camera.core.impl.oo0O
    @NonNull
    public final Range<Integer> OooO0O0() {
        return this.f3587OooO0Oo;
    }

    @Override // androidx.camera.core.impl.oo0O
    @Nullable
    public final Config OooO0OO() {
        return this.f3588OooO0o0;
    }

    @Override // androidx.camera.core.impl.oo0O
    @NonNull
    public final Size OooO0Oo() {
        return this.f3585OooO0O0;
    }

    @Override // androidx.camera.core.impl.oo0O
    public final OooO00o OooO0o0() {
        return new OooO00o(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oo0O)) {
            return false;
        }
        oo0O oo0o = (oo0O) obj;
        if (this.f3585OooO0O0.equals(oo0o.OooO0Oo()) && this.f3586OooO0OO.equals(oo0o.OooO00o()) && this.f3587OooO0Oo.equals(oo0o.OooO0O0())) {
            Config config = this.f3588OooO0o0;
            if (config == null) {
                if (oo0o.OooO0OO() == null) {
                    return true;
                }
            } else if (config.equals(oo0o.OooO0OO())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f3585OooO0O0.hashCode() ^ 1000003) * 1000003) ^ this.f3586OooO0OO.hashCode()) * 1000003) ^ this.f3587OooO0Oo.hashCode()) * 1000003;
        Config config = this.f3588OooO0o0;
        return iHashCode ^ (config == null ? 0 : config.hashCode());
    }

    public final String toString() {
        return "StreamSpec{resolution=" + this.f3585OooO0O0 + ", dynamicRange=" + this.f3586OooO0OO + ", expectedFrameRateRange=" + this.f3587OooO0Oo + ", implementationOptions=" + this.f3588OooO0o0 + "}";
    }
}
