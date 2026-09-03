package p296o0O0OoO0;

import OooO0O0.OooO0O0;
import Oooo000.o00O0O;
import com.android.billingclient.api.o0OO00O;
import java.util.Arrays;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 implements oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f35883OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int[] f35884OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long[] f35885OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long[] f35886OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f35887OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long[] f35888OooO0o0;

    public OooOo00(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f35884OooO0O0 = iArr;
        this.f35885OooO0OO = jArr;
        this.f35886OooO0Oo = jArr2;
        this.f35888OooO0o0 = jArr3;
        int length = iArr.length;
        this.f35883OooO00o = length;
        if (length > 0) {
            this.f35887OooO0o = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f35887OooO0o = 0L;
        }
    }

    @Override // p296o0O0OoO0.oo0o0Oo
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p296o0O0OoO0.oo0o0Oo
    public final oo0o0Oo.OooO00o OooO0oO(long j) {
        int iOooO0o0 = o000OOo0.OooO0o0(this.f35888OooO0o0, j, true);
        long[] jArr = this.f35888OooO0o0;
        long j2 = jArr[iOooO0o0];
        long[] jArr2 = this.f35885OooO0OO;
        o0O0O00 o0o0o00 = new o0O0O00(j2, jArr2[iOooO0o0]);
        if (j2 >= j || iOooO0o0 == this.f35883OooO00o - 1) {
            return new oo0o0Oo.OooO00o(o0o0o00, o0o0o00);
        }
        int i = iOooO0o0 + 1;
        return new oo0o0Oo.OooO00o(o0o0o00, new o0O0O00(jArr[i], jArr2[i]));
    }

    @Override // p296o0O0OoO0.oo0o0Oo
    public final long OooO0oo() {
        return this.f35887OooO0o;
    }

    public final String toString() {
        int i = this.f35883OooO00o;
        String string = Arrays.toString(this.f35884OooO0O0);
        String string2 = Arrays.toString(this.f35885OooO0OO);
        String string3 = Arrays.toString(this.f35888OooO0o0);
        String string4 = Arrays.toString(this.f35886OooO0Oo);
        StringBuilder sb = new StringBuilder(o0OO00O.OooO00o(string4, o0OO00O.OooO00o(string3, o0OO00O.OooO00o(string2, o0OO00O.OooO00o(string, 71)))));
        sb.append("ChunkIndex(length=");
        sb.append(i);
        sb.append(", sizes=");
        sb.append(string);
        OooO0O0.OooO00o(sb, ", offsets=", string2, ", timeUs=", string3);
        return o00O0O.OooO0O0(sb, ", durationsUs=", string4, ")");
    }
}
