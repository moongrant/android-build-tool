package p107o000ooO0;

import java.io.File;
import p109o000ooo.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00O implements oo0o0Oo<File> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f35803OooO00o;

    public o0OO00O(boolean z) {
        this.f35803OooO00o = z;
    }

    @Override // p107o000ooO0.oo0o0Oo
    public final String OooO00o(File file, o0Oo0oo o0oo0oo2) {
        File file2 = file;
        if (!this.f35803OooO00o) {
            return file2.getPath();
        }
        return file2.getPath() + ':' + file2.lastModified();
    }
}
