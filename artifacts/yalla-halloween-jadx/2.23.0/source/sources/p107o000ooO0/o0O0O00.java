package p107o000ooO0;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import p109o000ooo.o0Oo0oo;
import p321o0O0ooO.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O00 implements oo0o0Oo<Uri> {
    @Override // p107o000ooO0.oo0o0Oo
    public final String OooO00o(Uri uri, o0Oo0oo o0oo0oo2) {
        Uri uri2 = uri;
        if (!Intrinsics.areEqual(uri2.getScheme(), "android.resource")) {
            return uri2.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(uri2);
        sb.append('-');
        Configuration configuration = o0oo0oo2.f35863OooO00o.getResources().getConfiguration();
        Bitmap.Config[] configArr = o000O0O0.f42845OooO00o;
        sb.append(configuration.uiMode & 48);
        return sb.toString();
    }
}
