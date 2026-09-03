package p654o0ooo00o;

import java.util.List;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Cookie;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import p641o0ooOO0o.o0O000;
import p641o0ooOO0o.o0O000O;
import p641o0ooOO0o.o0O00o0;
import p641o0ooOO0o.o0O00o00;
import p648o0ooOoo.oO000o00;

/* JADX INFO: loaded from: classes5.dex */
@JvmName(name = "HttpHeaders")
public final class o000OO0O {
    static {
        ByteString byteString = ByteString.f60193OooO0oO;
        ByteString.OooO00o.OooO0OO("\"\\");
        ByteString.OooO00o.OooO0OO("\t ,=");
    }

    public static final boolean OooO00o(@NotNull o0O00o00 o0o00o01) {
        Intrinsics.checkNotNullParameter(o0o00o01, "<this>");
        if (Intrinsics.areEqual(o0o00o01.f57847OooO0Oo.f57829OooO0O0, "HEAD")) {
            return false;
        }
        int i = o0o00o01.f57850OooO0oO;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && oO000o00.OooOO0O(o0o00o01) == -1 && !StringsKt__StringsJVMKt.equals("chunked", o0o00o01.OooO0OO("Transfer-Encoding", null), true)) ? false : true;
    }

    public static final void OooO0O0(@NotNull o0O00o0 o0o00o1, @NotNull o0O000O url, @NotNull o0O000 headers) {
        Intrinsics.checkNotNullParameter(o0o00o1, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (o0o00o1 == o0O00o0.f57845OooO00o) {
            return;
        }
        Cookie.INSTANCE.getClass();
        List<Cookie> listOooO0Oo = Cookie.Companion.OooO0Oo(url, headers);
        if (listOooO0Oo.isEmpty()) {
            return;
        }
        o0o00o1.saveFromResponse(url, listOooO0Oo);
    }
}
