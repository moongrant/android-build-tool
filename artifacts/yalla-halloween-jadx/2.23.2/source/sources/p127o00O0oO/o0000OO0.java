package p127o00O0oO;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import p131o00O0oo0.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000OO0 implements o0000O<Integer, Uri> {
    @Override // p127o00O0oO.o0000O
    public final Uri OooO00o(Integer num, o0O0O00 o0o0o00) {
        boolean z;
        int iIntValue = num.intValue();
        Context context = o0o0o00.f36838OooO00o;
        try {
            z = context.getResources().getResourceEntryName(iIntValue) != null;
        } catch (Resources.NotFoundException unused) {
        }
        if (!z) {
            return null;
        }
        Uri uri = Uri.parse("android.resource://" + context.getPackageName() + '/' + iIntValue);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(this)");
        return uri;
    }
}
