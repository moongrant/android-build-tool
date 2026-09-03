package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public final class o000Oo0 extends Writer {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final StringBuilder f6017OooO0o0 = new StringBuilder(128);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f6016OooO0Oo = "FragmentManager";

    public final void OooO00o() {
        StringBuilder sb = this.f6017OooO0o0;
        if (sb.length() > 0) {
            Log.d(this.f6016OooO0Oo, sb.toString());
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
                this.f6017OooO0o0.append(c);
            }
        }
    }
}
