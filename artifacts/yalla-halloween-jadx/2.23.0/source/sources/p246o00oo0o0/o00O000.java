package p246o00oo0o0;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import p245o00oo0o.o00O00;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O000 extends BufferedOutputStream {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f40725OooO0Oo;

    public o00O000(o00O00.OooO00o oooO00o) {
        super(oooO00o);
    }

    public final void OooO00o(OutputStream outputStream) {
        o00O000o.OooO0Oo(this.f40725OooO0Oo);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f40725OooO0Oo = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f40725OooO0Oo = true;
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
        int i = o0O00.f40595OooO00o;
        throw th;
    }

    public o00O000(FileOutputStream fileOutputStream, int i) {
        super(fileOutputStream, i);
    }
}
