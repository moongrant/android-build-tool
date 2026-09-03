package oO0OO0OO;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.util.encoders.DecoderException;
import org.bouncycastle.util.encoders.EncoderException;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0o f52753OooO00o = new OooO0o();

    public static byte[] OooO00o(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f52753OooO00o.OooO00o(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("exception decoding Hex string: ");
            sbOooO0o0.append(e.getMessage());
            throw new DecoderException(sbOooO0o0.toString(), e);
        }
    }

    public static byte[] OooO0O0(byte[] bArr) {
        return OooO0OO(bArr, 0, bArr.length);
    }

    public static byte[] OooO0OO(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f52753OooO00o.OooO0O0(bArr, i, i2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("exception encoding Hex string: ");
            sbOooO0o0.append(e.getMessage());
            throw new EncoderException(sbOooO0o0.toString(), e);
        }
    }
}
