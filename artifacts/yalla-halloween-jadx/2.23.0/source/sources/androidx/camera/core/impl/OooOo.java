package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.DynamicRange;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo extends o00OO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Size f3587OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final DynamicRange f3588OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Range<Integer> f3589OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Config f3590OooO0o0;

    public static final class OooO00o extends o00OO0O0.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Size f3591OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public DynamicRange f3592OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Range<Integer> f3593OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Config f3594OooO0Oo;

        public OooO00o(o00OO0O0 o00oo0o1) {
            this.f3591OooO00o = o00oo0o1.OooO0Oo();
            this.f3592OooO0O0 = o00oo0o1.OooO00o();
            this.f3593OooO0OO = o00oo0o1.OooO0O0();
            this.f3594OooO0Oo = o00oo0o1.OooO0OO();
        }

        public final OooOo OooO00o() {
            String strOooO00o = this.f3591OooO00o == null ? " resolution" : "";
            if (this.f3592OooO0O0 == null) {
                strOooO00o = strOooO00o.concat(" dynamicRange");
            }
            if (this.f3593OooO0OO == null) {
                strOooO00o = OooOOOO.OooO00o(strOooO00o, " expectedFrameRateRange");
            }
            if (strOooO00o.isEmpty()) {
                return new OooOo(this.f3591OooO00o, this.f3592OooO0O0, this.f3593OooO0OO, this.f3594OooO0Oo);
            }
            throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
        }

        public final OooO00o OooO0O0(Range range) {
            if (range == null) {
                throw new NullPointerException("Null expectedFrameRateRange");
            }
            this.f3593OooO0OO = range;
            return this;
        }
    }

    public OooOo(Size size, DynamicRange dynamicRange, Range range, Config config) {
        this.f3587OooO0O0 = size;
        this.f3588OooO0OO = dynamicRange;
        this.f3589OooO0Oo = range;
        this.f3590OooO0o0 = config;
    }

    @Override // androidx.camera.core.impl.o00OO0O0
    @NonNull
    public final DynamicRange OooO00o() {
        return this.f3588OooO0OO;
    }

    @Override // androidx.camera.core.impl.o00OO0O0
    @NonNull
    public final Range<Integer> OooO0O0() {
        return this.f3589OooO0Oo;
    }

    @Override // androidx.camera.core.impl.o00OO0O0
    @Nullable
    public final Config OooO0OO() {
        return this.f3590OooO0o0;
    }

    @Override // androidx.camera.core.impl.o00OO0O0
    @NonNull
    public final Size OooO0Oo() {
        return this.f3587OooO0O0;
    }

    @Override // androidx.camera.core.impl.o00OO0O0
    public final OooO00o OooO0o0() {
        return new OooO00o(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00OO0O0)) {
            return false;
        }
        o00OO0O0 o00oo0o1 = (o00OO0O0) obj;
        if (this.f3587OooO0O0.equals(o00oo0o1.OooO0Oo()) && this.f3588OooO0OO.equals(o00oo0o1.OooO00o()) && this.f3589OooO0Oo.equals(o00oo0o1.OooO0O0())) {
            Config config = this.f3590OooO0o0;
            if (config == null) {
                if (o00oo0o1.OooO0OO() == null) {
                    return true;
                }
            } else if (config.equals(o00oo0o1.OooO0OO())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f3587OooO0O0.hashCode() ^ 1000003) * 1000003) ^ this.f3588OooO0OO.hashCode()) * 1000003) ^ this.f3589OooO0Oo.hashCode()) * 1000003;
        Config config = this.f3590OooO0o0;
        return iHashCode ^ (config == null ? 0 : config.hashCode());
    }

    public final String toString() {
        return "StreamSpec{resolution=" + this.f3587OooO0O0 + ", dynamicRange=" + this.f3588OooO0OO + ", expectedFrameRateRange=" + this.f3589OooO0Oo + ", implementationOptions=" + this.f3590OooO0o0 + "}";
    }
}
