package p677o0oooo0o;

import com.umeng.analytics.pro.bz;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import oO000Oo.OooO00o;
import org.bouncycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes3.dex */
public final class O0OO00 extends oO0OO0O implements oOO00000 {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final char[] f52111Oooo0oO = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final byte[] f52112Oooo0o;

    public O0OO00(byte[] bArr) {
        this.f52112Oooo0o = OooO00o.OooO0OO(bArr);
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final boolean OooO(oO0OO0O oo0oo0o) {
        if (oo0oo0o instanceof O0OO00) {
            return OooO00o.OooO00o(this.f52112Oooo0o, ((O0OO00) oo0oo0o).f52112Oooo0o);
        }
        return false;
    }

    @Override // p677o0oooo0o.oOO00000
    public final String OooO0OO() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new oO0OO00(byteArrayOutputStream).OooO(this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i = 0; i != byteArray.length; i++) {
                char[] cArr = f52111Oooo0oO;
                stringBuffer.append(cArr[(byteArray[i] >>> 4) & 15]);
                stringBuffer.append(cArr[byteArray[i] & bz.m]);
            }
            return stringBuffer.toString();
        } catch (IOException unused) {
            throw new ASN1ParsingException("internal error encoding BitString");
        }
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final void OooOO0(oO0OO00 oo0oo00) throws IOException {
        oo0oo00.OooO0o(28, OooO00o.OooO0OO(this.f52112Oooo0o));
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final int OooOO0O() {
        return m.OooO00o(this.f52112Oooo0o.length) + 1 + this.f52112Oooo0o.length;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final boolean OooOOO0() {
        return false;
    }

    @Override // p677o0oooo0o.oO0OO0O, p677o0oooo0o.oOo0o0oO
    public final int hashCode() {
        return OooO00o.OooO0oO(this.f52112Oooo0o);
    }

    public final String toString() {
        return OooO0OO();
    }
}
