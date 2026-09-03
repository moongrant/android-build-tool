package p677o0oooo0o;

import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l extends InputStream {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final InputStream f52127Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f52128Oooo0oO;

    public l(InputStream inputStream, int i) {
        this.f52127Oooo0o = inputStream;
        this.f52128Oooo0oO = i;
    }

    public int OooO00o() {
        return this.f52128Oooo0oO;
    }

    public final void OooO0O0() {
        InputStream inputStream = this.f52127Oooo0o;
        if (inputStream instanceof i) {
            i iVar = (i) inputStream;
            iVar.f52122OoooO0 = true;
            iVar.OooO0Oo();
        }
    }
}
