package p243o00oo00O;

import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
public final class o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final AtomicReference<byte[]> f34168OooO00o = new AtomicReference<>();

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f34171OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f34172OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final byte[] f34173OooO0OO;

        public OooO0O0(@NonNull byte[] bArr, int i, int i2) {
            this.f34173OooO0OO = bArr;
            this.f34171OooO00o = i;
            this.f34172OooO0O0 = i2;
        }
    }

    @NonNull
    public static ByteBuffer OooO00o(@NonNull File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        FileChannel channel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                channel = randomAccessFile.getChannel();
                MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                return mappedByteBufferLoad;
            } catch (Throwable th) {
                th = th;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    public static void OooO0O0(@NonNull ByteBuffer byteBuffer, @NonNull File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        byteBuffer.position(0);
        FileChannel channel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                channel = randomAccessFile.getChannel();
                channel.write(byteBuffer);
                channel.force(false);
                channel.close();
                randomAccessFile.close();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th) {
                th = th;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    public static class OooO00o extends InputStream {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @NonNull
        public final ByteBuffer f34169Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f34170Oooo0oO = -1;

        public OooO00o(@NonNull ByteBuffer byteBuffer) {
            this.f34169Oooo0o = byteBuffer;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.f34169Oooo0o.remaining();
        }

        @Override // java.io.InputStream
        public final synchronized void mark(int i) {
            this.f34170Oooo0oO = this.f34169Oooo0o.position();
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read() {
            if (this.f34169Oooo0o.hasRemaining()) {
                return this.f34169Oooo0o.get() & UByte.MAX_VALUE;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final synchronized void reset() throws IOException {
            int i = this.f34170Oooo0oO;
            if (i == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f34169Oooo0o.position(i);
        }

        @Override // java.io.InputStream
        public final long skip(long j) throws IOException {
            if (!this.f34169Oooo0o.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j, available());
            ByteBuffer byteBuffer = this.f34169Oooo0o;
            byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
            return jMin;
        }

        @Override // java.io.InputStream
        public final int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
            if (!this.f34169Oooo0o.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i2, available());
            this.f34169Oooo0o.get(bArr, i, iMin);
            return iMin;
        }
    }
}
