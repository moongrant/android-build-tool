package p122o00O0o;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import o00OO00O.OooOo00;
import p131o00O0oo0.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements OooO0OO<Uri> {
    @Override // p122o00O0o.OooO0OO
    public final String OooO00o(Uri uri, o0O0O00 o0o0o00) {
        Uri uri2 = uri;
        if (!Intrinsics.areEqual(uri2.getScheme(), "android.resource")) {
            return uri2.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(uri2);
        sb.append('-');
        Configuration configuration = o0o0o00.f36838OooO00o.getResources().getConfiguration();
        Bitmap.Config[] configArr = OooOo00.f37081OooO00o;
        sb.append(configuration.uiMode & 48);
        return sb.toString();
    }
}
