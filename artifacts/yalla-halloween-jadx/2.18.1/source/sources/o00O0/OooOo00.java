package o00O0;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p660o0ooo0o0.o00OO000;
import p660o0ooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 extends OooOOOO<Uri> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(@NotNull o0O0ooO.OooO00o callFactory) {
        super(callFactory);
        Intrinsics.checkNotNullParameter(callFactory, "callFactory");
    }

    @Override // o00O0.OooOOOO, o00O0.OooOO0O
    public final boolean OooO00o(Object obj) {
        Uri data = (Uri) obj;
        Intrinsics.checkNotNullParameter(data, "data");
        return Intrinsics.areEqual(data.getScheme(), "http") || Intrinsics.areEqual(data.getScheme(), "https");
    }

    @Override // o00O0.OooOO0O
    public final String OooO0O0(Object obj) {
        Uri data = (Uri) obj;
        Intrinsics.checkNotNullParameter(data, "data");
        String string = data.toString();
        Intrinsics.checkNotNullExpressionValue(string, "data.toString()");
        return string;
    }

    @Override // o00O0.OooOOOO
    public final o00OO000 OooO0o0(Uri uri) {
        Uri uri2 = uri;
        Intrinsics.checkNotNullParameter(uri2, "<this>");
        String toHttpUrl = uri2.toString();
        Intrinsics.checkNotNullParameter(toHttpUrl, "$this$toHttpUrl");
        o00OO000.OooO00o oooO00o = new o00OO000.OooO00o();
        oooO00o.OooO0oO(null, toHttpUrl);
        o00OO000 o00oo000OooO0OO = oooO00o.OooO0OO();
        Intrinsics.checkNotNullExpressionValue(o00oo000OooO0OO, "get(toString())");
        return o00oo000OooO0OO;
    }
}
