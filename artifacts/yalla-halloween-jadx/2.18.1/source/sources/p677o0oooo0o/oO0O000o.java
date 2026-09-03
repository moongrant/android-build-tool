package p677o0oooo0o;

import com.umeng.analytics.pro.bz;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Objects;
import kotlin.KotlinVersion;
import oO000Oo.OooO00o;
import org.bouncycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oO0O000o extends oO0OO0O implements oOO00000 {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final char[] f52143Oooo0oo = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final byte[] f52144Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f52145Oooo0oO;

    public oO0O000o(byte[] bArr, int i) {
        Objects.requireNonNull(bArr, "data cannot be null");
        if (bArr.length == 0 && i != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i > 7 || i < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.f52144Oooo0o = OooO00o.OooO0OO(bArr);
        this.f52145Oooo0oO = i;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final boolean OooO(oO0OO0O oo0oo0o) {
        if (!(oo0oo0o instanceof oO0O000o)) {
            return false;
        }
        oO0O000o oo0o000o = (oO0O000o) oo0oo0o;
        return this.f52145Oooo0oO == oo0o000o.f52145Oooo0oO && OooO00o.OooO00o(OooOOo0(), oo0o000o.OooOOo0());
    }

    @Override // p677o0oooo0o.oOO00000
    public final String OooO0OO() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new oO0OO00(byteArrayOutputStream).OooO(this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i = 0; i != byteArray.length; i++) {
                char[] cArr = f52143Oooo0oo;
                stringBuffer.append(cArr[(byteArray[i] >>> 4) & 15]);
                stringBuffer.append(cArr[byteArray[i] & bz.m]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Internal error encoding BitString: ");
            sbOooO0o0.append(e.getMessage());
            throw new ASN1ParsingException(sbOooO0o0.toString(), e);
        }
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final oO0OO0O OooOOOO() {
        return new oOO0Oo00(this.f52144Oooo0o, this.f52145Oooo0oO);
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final oO0OO0O OooOOOo() {
        return new b(this.f52144Oooo0o, this.f52145Oooo0oO);
    }

    public final byte[] OooOOo0() {
        byte[] bArr = this.f52144Oooo0o;
        int i = this.f52145Oooo0oO;
        byte[] bArrOooO0OO = OooO00o.OooO0OO(bArr);
        if (i > 0) {
            int length = bArr.length - 1;
            bArrOooO0OO[length] = (byte) ((KotlinVersion.MAX_COMPONENT_VALUE << i) & bArrOooO0OO[length]);
        }
        return bArrOooO0OO;
    }

    @Override // p677o0oooo0o.oO0OO0O, p677o0oooo0o.oOo0o0oO
    public final int hashCode() {
        return this.f52145Oooo0oO ^ OooO00o.OooO0oO(OooOOo0());
    }

    public String toString() {
        return OooO0OO();
    }
}
