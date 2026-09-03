package oO0OO0OO;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.util.encoders.DecoderException;
import org.bouncycastle.util.encoders.EncoderException;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0O0 f52750OooO00o = new OooO0O0();

    public static byte[] OooO00o(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((str.length() / 4) * 3);
        try {
            f52750OooO00o.OooO00o(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("unable to decode base64 string: ");
            sbOooO0o0.append(e.getMessage());
            throw new DecoderException(sbOooO0o0.toString(), e);
        }
    }

    public static byte[] OooO0O0(byte[] bArr) {
        int length = bArr.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((length + 2) / 3) * 4);
        try {
            f52750OooO00o.OooO0O0(bArr, 0, length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("exception encoding base64 string: ");
            sbOooO0o0.append(e.getMessage());
            throw new EncoderException(sbOooO0o0.toString(), e);
        }
    }
}
