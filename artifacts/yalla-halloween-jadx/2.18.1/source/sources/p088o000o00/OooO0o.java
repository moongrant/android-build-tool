package p088o000o00;

import android.support.v4.media.OooO00o;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
public final class OooO0o {
    public static void OooO(@NonNull OutputStream outputStream, @NonNull String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    public static byte[] OooO00o(@NonNull byte[] bArr) throws IOException {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    @NonNull
    public static byte[] OooO0O0(@NonNull InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw new IllegalStateException(OooO00o.OooO00o("Not enough bytes to read: ", i));
            }
            i2 += i3;
        }
        return bArr;
    }

    @NonNull
    public static byte[] OooO0OO(@NonNull InputStream inputStream, int i, int i2) throws IOException {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[RecyclerView.oo0o0Oo.FLAG_MOVED];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = inputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    @NonNull
    public static String OooO0Oo(InputStream inputStream, int i) throws IOException {
        return new String(OooO0O0(inputStream, i), StandardCharsets.UTF_8);
    }

    public static int OooO0o(@NonNull InputStream inputStream) throws IOException {
        return (int) OooO0o0(inputStream, 2);
    }

    public static long OooO0o0(@NonNull InputStream inputStream, int i) throws IOException {
        byte[] bArrOooO0O0 = OooO0O0(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrOooO0O0[i2] & UByte.MAX_VALUE)) << (i2 * 8);
        }
        return j;
    }

    public static int OooO0oO(@NonNull InputStream inputStream) throws IOException {
        return (int) OooO0o0(inputStream, 1);
    }

    public static int OooO0oo(@NonNull String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    public static void OooOO0(@NonNull OutputStream outputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    public static void OooOO0O(@NonNull OutputStream outputStream, int i) throws IOException {
        OooOO0(outputStream, i, 2);
    }

    public static void OooOO0o(@NonNull OutputStream outputStream, int i) throws IOException {
        OooOO0(outputStream, i, 1);
    }
}
