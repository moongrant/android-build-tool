package o000Oo0;

import androidx.media3.common.util.UnstableApi;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import p080o000OoO.o00;
import p080o000OoO.o00Ooo;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class o000oOoO extends BufferedOutputStream {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f34838OooO0Oo;

    public o000oOoO(o00Ooo.OooO00o oooO00o) {
        super(oooO00o);
    }

    public final void OooO00o(OutputStream outputStream) {
        p080o000OoO.o00Oo0.OooO0Oo(this.f34838OooO0Oo);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f34838OooO0Oo = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f34838OooO0Oo = true;
        flush();
        th = null;
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        if (th == null) {
            return;
        }
        int i = o00.f34910OooO00o;
        throw th;
    }

    public o000oOoO(FileOutputStream fileOutputStream, int i) {
        super(fileOutputStream, i);
    }
}
