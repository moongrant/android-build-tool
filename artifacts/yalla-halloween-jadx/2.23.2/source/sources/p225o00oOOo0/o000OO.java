package p225o00oOOo0;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OO implements FilenameFilter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f39717OooO00o;

    public o000OO(String str) {
        this.f39717OooO00o = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(this.f39717OooO00o);
    }
}
