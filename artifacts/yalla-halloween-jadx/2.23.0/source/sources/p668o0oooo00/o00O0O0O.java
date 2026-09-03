package p668o0oooo00;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class o00O0O0O implements o00O0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ File f60343OooO00o;

    public o00O0O0O(File file) {
        this.f60343OooO00o = file;
    }

    @Override // p668o0oooo00.o00O0O0
    public final String OooO00o() {
        return this.f60343OooO00o.getAbsolutePath();
    }

    @Override // p668o0oooo00.o00O0O0
    public final FileInputStream open() throws IOException {
        return new FileInputStream(this.f60343OooO00o);
    }
}
