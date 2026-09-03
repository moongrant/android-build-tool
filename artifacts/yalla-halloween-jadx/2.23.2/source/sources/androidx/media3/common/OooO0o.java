package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;
import p069o0000ooO.o00000;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class OooO0o implements OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f6362OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f6363OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f6364OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final byte[] f6365OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f6366OooO0oo;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final OooO0o f6356OooO = new OooO0o(1, null, 2, 3);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final String f6357OooOO0 = o00.Oooo00o(0);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final String f6358OooOO0O = o00.Oooo00o(1);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final String f6359OooOO0o = o00.Oooo00o(2);

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final String f6361OooOOO0 = o00.Oooo00o(3);

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final o00000 f6360OooOOO = new o00000();

    @Deprecated
    public OooO0o(int i, @Nullable byte[] bArr, int i2, int i3) {
        this.f6362OooO0Oo = i;
        this.f6364OooO0o0 = i2;
        this.f6363OooO0o = i3;
        this.f6365OooO0oO = bArr;
    }

    public static String OooO0OO(int i) {
        if (i == -1) {
            return "Unset color transfer";
        }
        if (i == 10) {
            return "Gamma 2.2";
        }
        if (i == 1) {
            return "Linear";
        }
        if (i == 2) {
            return "sRGB";
        }
        if (i == 3) {
            return "SDR SMPTE 170M";
        }
        if (i != 6) {
            return i != 7 ? "Undefined color transfer" : "HLG";
        }
        return "ST2084 PQ";
    }

    @Pure
    public static int OooO0Oo(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    @Pure
    public static int OooO0o0(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OooO0o.class != obj.getClass()) {
            return false;
        }
        OooO0o oooO0o = (OooO0o) obj;
        return this.f6362OooO0Oo == oooO0o.f6362OooO0Oo && this.f6364OooO0o0 == oooO0o.f6364OooO0o0 && this.f6363OooO0o == oooO0o.f6363OooO0o && Arrays.equals(this.f6365OooO0oO, oooO0o.f6365OooO0oO);
    }

    public final int hashCode() {
        if (this.f6366OooO0oo == 0) {
            this.f6366OooO0oo = Arrays.hashCode(this.f6365OooO0oO) + ((((((527 + this.f6362OooO0Oo) * 31) + this.f6364OooO0o0) * 31) + this.f6363OooO0o) * 31);
        }
        return this.f6366OooO0oo;
    }

    @Override // androidx.media3.common.OooO0OO
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f6357OooOO0, this.f6362OooO0Oo);
        bundle.putInt(f6358OooOO0O, this.f6364OooO0o0);
        bundle.putInt(f6359OooOO0o, this.f6363OooO0o);
        bundle.putByteArray(f6361OooOOO0, this.f6365OooO0oO);
        return bundle;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        int i = this.f6362OooO0Oo;
        if (i == -1) {
            str = "Unset color space";
        } else if (i == 6) {
            str = "BT2020";
        } else if (i != 1) {
            str = i != 2 ? "Undefined color space" : "BT601";
        } else {
            str = "BT709";
        }
        sb.append(str);
        sb.append(", ");
        int i2 = this.f6364OooO0o0;
        if (i2 == -1) {
            str2 = "Unset color range";
        } else if (i2 != 1) {
            str2 = i2 != 2 ? "Undefined color range" : "Limited range";
        } else {
            str2 = "Full range";
        }
        sb.append(str2);
        sb.append(", ");
        sb.append(OooO0OO(this.f6363OooO0o));
        sb.append(", ");
        sb.append(this.f6365OooO0oO != null);
        sb.append(")");
        return sb.toString();
    }
}
