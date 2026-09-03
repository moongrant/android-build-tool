package p668o0oooo00;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.UByte;

/* JADX INFO: loaded from: classes5.dex */
public enum o00O0 {
    SINGLE;

    private static final String GIF = ".gif";
    private static final String JPEG = ".jpeg";
    private static final String JPG = ".jpg";
    private static final String PNG = ".png";
    private static final String TAG = "Luban";
    private static final String WEBP = ".webp";
    private static List<String> format;
    private final byte[] JPEG_SIGNATURE = {-1, -40, -1};

    static {
        ArrayList arrayList = new ArrayList();
        format = arrayList;
        arrayList.add(JPG);
        format.add(JPEG);
        format.add(PNG);
        format.add(WEBP);
        format.add(GIF);
    }

    public static int OooO0O0(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        if (z) {
            i += i2 - 1;
            i3 = -1;
        } else {
            i3 = 1;
        }
        int i4 = 0;
        while (true) {
            int i5 = i2 - 1;
            if (i2 <= 0) {
                return i4;
            }
            i4 = (bArr[i] & UByte.MAX_VALUE) | (i4 << 8);
            i += i3;
            i2 = i5;
        }
    }

    public static byte[] OooO0OO(InputStream inputStream) {
        if (inputStream == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                try {
                    int i = inputStream.read(bArr, 0, 4096);
                    if (i != -1) {
                        byteArrayOutputStream.write(bArr, 0, i);
                    } else {
                        try {
                            break;
                        } catch (IOException unused) {
                        }
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused2) {
                    }
                    throw th;
                }
            } catch (Exception unused3) {
                byte[] bArr2 = new byte[0];
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused4) {
                }
                return bArr2;
            }
        }
        byteArrayOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public final boolean OooO00o(InputStream inputStream) {
        byte[] bArrOooO0OO = OooO0OO(inputStream);
        if (bArrOooO0OO == null || bArrOooO0OO.length < 3) {
            return false;
        }
        return Arrays.equals(this.JPEG_SIGNATURE, new byte[]{bArrOooO0OO[0], bArrOooO0OO[1], bArrOooO0OO[2]});
    }
}
