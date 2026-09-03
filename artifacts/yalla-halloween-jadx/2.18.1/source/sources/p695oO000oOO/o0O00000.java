package p695oO000oOO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00000 implements o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ File f52714OooO00o;

    public o0O00000(File file) {
        this.f52714OooO00o = file;
    }

    @Override // p695oO000oOO.o0
    public final String OooO00o() {
        return this.f52714OooO00o.getAbsolutePath();
    }

    @Override // p695oO000oOO.o0
    public final InputStream open() throws IOException {
        return new FileInputStream(this.f52714OooO00o);
    }
}
