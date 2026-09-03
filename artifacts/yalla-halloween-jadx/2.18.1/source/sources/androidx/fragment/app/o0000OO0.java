package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public final class o0000OO0 extends Writer {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public StringBuilder f8479Oooo0oO = new StringBuilder(128);

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final String f8478Oooo0o = "FragmentManager";

    public final void OooO00o() {
        if (this.f8479Oooo0oO.length() > 0) {
            Log.d(this.f8478Oooo0o, this.f8479Oooo0oO.toString());
            StringBuilder sb = this.f8479Oooo0oO;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        OooO00o();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        OooO00o();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                OooO00o();
            } else {
                this.f8479Oooo0oO.append(c);
            }
        }
    }
}
