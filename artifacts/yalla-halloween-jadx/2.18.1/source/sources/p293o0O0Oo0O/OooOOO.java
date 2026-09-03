package p293o0O0Oo0O;

import androidx.annotation.Nullable;
import com.android.billingclient.api.o0OO00O;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooOOO f35739OooO0OO = new OooOOO(new int[]{2}, 8);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooOOO f35740OooO0Oo = new OooOOO(new int[]{2, 5, 6}, 8);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int[] f35741OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f35742OooO0O0;

    public OooOOO(@Nullable int[] iArr, int i) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f35741OooO00o = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f35741OooO00o = new int[0];
        }
        this.f35742OooO0O0 = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOOO)) {
            return false;
        }
        OooOOO oooOOO = (OooOOO) obj;
        return Arrays.equals(this.f35741OooO00o, oooOOO.f35741OooO00o) && this.f35742OooO0O0 == oooOOO.f35742OooO0O0;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f35741OooO00o) * 31) + this.f35742OooO0O0;
    }

    public final String toString() {
        int i = this.f35742OooO0O0;
        String string = Arrays.toString(this.f35741OooO00o);
        StringBuilder sb = new StringBuilder(o0OO00O.OooO00o(string, 67));
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", supportedEncodings=");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }
}
