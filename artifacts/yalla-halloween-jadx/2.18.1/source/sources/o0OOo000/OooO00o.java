package o0OOo000;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO00o implements FilenameFilter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ OooO00o f38612OooO00o = new OooO00o();

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        Charset charset = OooO.f38604OooO0Oo;
        return str.startsWith("event");
    }
}
