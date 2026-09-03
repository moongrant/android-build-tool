package p085o000Ooo0;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 {

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public long f28401OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f28402OooO0O0;
    }

    public static OooO00o OooO00o(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length() - 22;
        if (length < 0) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("File too short to be a zip file: ");
            sbOooO0o0.append(randomAccessFile.length());
            throw new ZipException(sbOooO0o0.toString());
        }
        long j = length - 65536;
        long j2 = j >= 0 ? j : 0L;
        int iReverseBytes = Integer.reverseBytes(101010256);
        do {
            randomAccessFile.seek(length);
            if (randomAccessFile.readInt() == iReverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                OooO00o oooO00o = new OooO00o();
                oooO00o.f28402OooO0O0 = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                oooO00o.f28401OooO00o = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                return oooO00o;
            }
            length--;
        } while (length >= j2);
        throw new ZipException("End Of Central Directory signature not found");
    }
}
