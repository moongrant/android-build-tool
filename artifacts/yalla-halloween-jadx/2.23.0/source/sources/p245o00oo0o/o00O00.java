package p245o00oo0o;

import com.google.android.exoplayer2.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final File f40557OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final File f40558OooO0O0;

    public static final class OooO00o extends OutputStream {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final FileOutputStream f40559OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f40560OooO0o0 = false;

        public OooO00o(File file) throws FileNotFoundException {
            this.f40559OooO0Oo = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            FileOutputStream fileOutputStream = this.f40559OooO0Oo;
            if (this.f40560OooO0o0) {
                return;
            }
            this.f40560OooO0o0 = true;
            flush();
            try {
                fileOutputStream.getFD().sync();
            } catch (IOException e) {
                Log.OooO0oO("AtomicFile", "Failed to sync file descriptor:", e);
            }
            fileOutputStream.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() throws IOException {
            this.f40559OooO0Oo.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i) throws IOException {
            this.f40559OooO0Oo.write(i);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            this.f40559OooO0Oo.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            this.f40559OooO0Oo.write(bArr, i, i2);
        }
    }

    public o00O00(File file) {
        this.f40557OooO00o = file;
        this.f40558OooO0O0 = new File(file.getPath() + ".bak");
    }

    public final OooO00o OooO00o() throws IOException {
        File file = this.f40557OooO00o;
        if (file.exists()) {
            File file2 = this.f40558OooO0O0;
            if (file2.exists()) {
                file.delete();
            } else if (!file.renameTo(file2)) {
                Log.OooO0o("AtomicFile", "Couldn't rename file " + file + " to backup file " + file2);
            }
        }
        try {
            return new OooO00o(file);
        } catch (FileNotFoundException e) {
            File parentFile = file.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + file, e);
            }
            try {
                return new OooO00o(file);
            } catch (FileNotFoundException e2) {
                throw new IOException("Couldn't create " + file, e2);
            }
        }
    }
}
