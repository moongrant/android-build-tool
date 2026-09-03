package p106o000ooO;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import p109o000ooo.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo implements OooOo00<Integer, Uri> {
    @Override // p106o000ooO.OooOo00
    public final Uri OooO00o(Integer num, o0Oo0oo o0oo0oo2) {
        boolean z;
        int iIntValue = num.intValue();
        Context context = o0oo0oo2.f35863OooO00o;
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
