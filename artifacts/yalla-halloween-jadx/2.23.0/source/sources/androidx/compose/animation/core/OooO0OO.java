package androidx.compose.animation.core;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.o000oOoO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0OO implements com.google.android.exoplayer2.OooO.OooO00o {
    public static String OooO00o(String str, int i, char c) {
        return str + i + c;
    }

    @Override // com.google.android.exoplayer2.OooO.OooO00o
    public com.google.android.exoplayer2.OooO OooO0O0(Bundle bundle) {
        Uri uri = (Uri) bundle.getParcelable(o000oOoO.OooO00o.f12699OooO0o0);
        uri.getClass();
        return new o000oOoO.OooO00o(new o000oOoO.OooO00o.C0208OooO00o(uri));
    }
}
