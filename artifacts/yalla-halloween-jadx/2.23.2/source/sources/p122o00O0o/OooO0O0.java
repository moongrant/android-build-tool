package p122o00O0o;

import java.io.File;
import p131o00O0oo0.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements OooO0OO<File> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f36481OooO00o;

    public OooO0O0(boolean z) {
        this.f36481OooO00o = z;
    }

    @Override // p122o00O0o.OooO0OO
    public final String OooO00o(File file, o0O0O00 o0o0o00) {
        File file2 = file;
        if (!this.f36481OooO00o) {
            return file2.getPath();
        }
        return file2.getPath() + ':' + file2.lastModified();
    }
}
