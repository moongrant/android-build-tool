package o0O0o000;

import com.google.android.exoplayer2.Format;
import com.qiniu.android.http.ResponseInfo;
import java.util.Arrays;
import java.util.List;
import kotlin.UByte;
import p032OoooO0.o0O000Oo;
import p318o0O0oOo.o000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O extends OooOOO0 {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final byte[] f36132OooOOOO = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f36133OooOOO;

    @Override // o0O0o000.OooOOO0
    public final long OooO0OO(o000 o000Var) {
        int i;
        byte[] bArr = o000Var.f36661OooO00o;
        int i2 = bArr[0] & UByte.MAX_VALUE;
        int i3 = i2 & 3;
        int i4 = 2;
        if (i3 == 0) {
            i4 = 1;
        } else if (i3 != 1 && i3 != 2) {
            i4 = bArr[1] & 63;
        }
        int i5 = i2 >> 3;
        int i6 = i5 & 3;
        if (i5 >= 16) {
            i = 2500 << i6;
        } else if (i5 >= 12) {
            i = ResponseInfo.UnknownError << (i6 & 1);
        } else {
            i = i6 == 3 ? 60000 : ResponseInfo.UnknownError << i6;
        }
        return OooO00o(((long) i4) * ((long) i));
    }

    @Override // o0O0o000.OooOOO0
    public final boolean OooO0Oo(o000 o000Var, long j, OooOOO0.OooO00o oooO00o) {
        if (this.f36133OooOOO) {
            boolean z = o000Var.OooO0Oo() == 1332770163;
            o000Var.OooOoOO(0);
            return z;
        }
        byte[] bArrCopyOf = Arrays.copyOf(o000Var.f36661OooO00o, o000Var.f36663OooO0OO);
        int i = bArrCopyOf[9] & UByte.MAX_VALUE;
        List<byte[]> listOooO00o = o0O000Oo.OooO00o(bArrCopyOf);
        Format.OooO0O0 oooO0O0 = new Format.OooO0O0();
        oooO0O0.f13163OooOO0O = "audio/opus";
        oooO0O0.f13172OooOo = i;
        oooO0O0.f13178OooOoO0 = 48000;
        oooO0O0.f13166OooOOO0 = listOooO00o;
        oooO00o.f36156OooO00o = new Format(oooO0O0);
        this.f36133OooOOO = true;
        return true;
    }

    @Override // o0O0o000.OooOOO0
    public final void OooO0o0(boolean z) {
        super.OooO0o0(z);
        if (z) {
            this.f36133OooOOO = false;
        }
    }
}
