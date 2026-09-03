package p247o00oo0oO;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.OooO;
import java.util.Arrays;
import kotlin.reflect.jvm.internal.impl.builtins.OooO00o;
import org.checkerframework.dataflow.qual.Pure;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O0OO implements OooO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f40746OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f40747OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f40748OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final byte[] f40749OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f40750OooO0oo;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final o00O0OO f40740OooO = new o00O0OO(1, null, 2, 3);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final String f40741OooOO0 = o0O00.Oooo00O(0);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final String f40742OooOO0O = o0O00.Oooo00O(1);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final String f40743OooOO0o = o0O00.Oooo00O(2);

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final String f40745OooOOO0 = o0O00.Oooo00O(3);

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final OooO00o f40744OooOOO = new OooO00o();

    @Deprecated
    public o00O0OO(int i, @Nullable byte[] bArr, int i2, int i3) {
        this.f40746OooO0Oo = i;
        this.f40748OooO0o0 = i2;
        this.f40747OooO0o = i3;
        this.f40749OooO0oO = bArr;
    }

    public static String OooO00o(int i) {
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
    public static int OooO0O0(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    @Pure
    public static int OooO0OO(int i) {
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
        if (obj == null || o00O0OO.class != obj.getClass()) {
            return false;
        }
        o00O0OO o00o0oo2 = (o00O0OO) obj;
        return this.f40746OooO0Oo == o00o0oo2.f40746OooO0Oo && this.f40748OooO0o0 == o00o0oo2.f40748OooO0o0 && this.f40747OooO0o == o00o0oo2.f40747OooO0o && Arrays.equals(this.f40749OooO0oO, o00o0oo2.f40749OooO0oO);
    }

    public final int hashCode() {
        if (this.f40750OooO0oo == 0) {
            this.f40750OooO0oo = Arrays.hashCode(this.f40749OooO0oO) + ((((((527 + this.f40746OooO0Oo) * 31) + this.f40748OooO0o0) * 31) + this.f40747OooO0o) * 31);
        }
        return this.f40750OooO0oo;
    }

    @Override // com.google.android.exoplayer2.OooO
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f40741OooOO0, this.f40746OooO0Oo);
        bundle.putInt(f40742OooOO0O, this.f40748OooO0o0);
        bundle.putInt(f40743OooOO0o, this.f40747OooO0o);
        bundle.putByteArray(f40745OooOOO0, this.f40749OooO0oO);
        return bundle;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        int i = this.f40746OooO0Oo;
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
        int i2 = this.f40748OooO0o0;
        if (i2 == -1) {
            str2 = "Unset color range";
        } else if (i2 != 1) {
            str2 = i2 != 2 ? "Undefined color range" : "Limited range";
        } else {
            str2 = "Full range";
        }
        sb.append(str2);
        sb.append(", ");
        sb.append(OooO00o(this.f40747OooO0o));
        sb.append(", ");
        sb.append(this.f40749OooO0oO != null);
        sb.append(")");
        return sb.toString();
    }
}
