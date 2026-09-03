package oo00oO;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o implements FilenameFilter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f60878OooO00o;

    public OooO0o(String str) {
        this.f60878OooO00o = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(this.f60878OooO00o);
    }
}
