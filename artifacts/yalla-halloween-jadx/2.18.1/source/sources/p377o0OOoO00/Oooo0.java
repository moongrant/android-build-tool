package p377o0OOoO00;

import android.util.Base64;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final byte f38700OooO00o = Byte.parseByte("01110000", 2);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte f38701OooO0O0 = Byte.parseByte("00001111", 2);

    @NonNull
    public final String OooO00o() {
        UUID uuidRandomUUID = UUID.randomUUID();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[17]);
        byteBufferWrap.putLong(uuidRandomUUID.getMostSignificantBits());
        byteBufferWrap.putLong(uuidRandomUUID.getLeastSignificantBits());
        byte[] bArrArray = byteBufferWrap.array();
        bArrArray[16] = bArrArray[0];
        bArrArray[0] = (byte) ((f38701OooO0O0 & bArrArray[0]) | f38700OooO00o);
        return new String(Base64.encode(bArrArray, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
