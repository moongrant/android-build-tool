package p106o000ooO;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import p109o000ooo.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 implements OooOo00<String, Uri> {
    @Override // p106o000ooO.OooOo00
    public final Uri OooO00o(String str, o0Oo0oo o0oo0oo2) {
        Uri uri = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(this)");
        return uri;
    }
}
