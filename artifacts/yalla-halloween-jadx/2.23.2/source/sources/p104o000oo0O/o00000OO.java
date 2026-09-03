package p104o000oo0O;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000OO {

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public long f35701OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f35702OooO0O0;
    }

    public static OooO00o OooO00o(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length() - 22;
        if (length < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
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
                oooO00o.f35702OooO0O0 = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                oooO00o.f35701OooO00o = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                return oooO00o;
            }
            length--;
        } while (length >= j2);
        throw new ZipException("End Of Central Directory signature not found");
    }
}
