package p673o0oooo0o;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0Oo0oo implements oO0OoOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ File f59929OooO00o;

    public oO0Oo0oo(File file) {
        this.f59929OooO00o = file;
    }

    @Override // p673o0oooo0o.oO0OoOO0
    public final String OooO00o() {
        return this.f59929OooO00o.getAbsolutePath();
    }

    @Override // p673o0oooo0o.oO0OoOO0
    public final FileInputStream open() throws IOException {
        return new FileInputStream(this.f59929OooO00o);
    }
}
