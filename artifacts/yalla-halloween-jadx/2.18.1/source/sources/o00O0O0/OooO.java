package o00O0O0;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class OooO implements OooO0O0<String, Uri> {
    @Override // o00O0O0.OooO0O0
    public final boolean OooO00o(String str) {
        String data = str;
        Intrinsics.checkNotNullParameter(this, "this");
        Intrinsics.checkNotNullParameter(data, "data");
        return true;
    }

    @Override // o00O0O0.OooO0O0
    public final Uri OooO0O0(String str) {
        String data = str;
        Intrinsics.checkNotNullParameter(data, "data");
        Uri uri = Uri.parse(data);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(this)");
        return uri;
    }
}
