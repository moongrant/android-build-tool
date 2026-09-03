package p647o0ooOooo;

import java.util.List;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Cookie;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import p634o0ooO0oO.o00O0OOO;
import p634o0ooO0oO.o00OO;
import p634o0ooO0oO.o0oOOo;
import p634o0ooO0oO.oo0O;
import p635o0ooO0oo.o0O000o0;

/* JADX INFO: loaded from: classes5.dex */
@JvmName(name = "HttpHeaders")
public final class lc {
    static {
        ByteString byteString = ByteString.f60866OooO0oO;
        ByteString.OooO00o.OooO0OO("\"\\");
        ByteString.OooO00o.OooO0OO("\t ,=");
    }

    public static final boolean OooO00o(@NotNull o0oOOo o0oooo) {
        Intrinsics.checkNotNullParameter(o0oooo, "<this>");
        if (Intrinsics.areEqual(o0oooo.f57342OooO0Oo.f57314OooO0O0, "HEAD")) {
            return false;
        }
        int i = o0oooo.f57345OooO0oO;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && o0O000o0.OooOO0O(o0oooo) == -1 && !StringsKt.OooOO0o("chunked", o0oooo.OooO0OO("Transfer-Encoding", null))) ? false : true;
    }

    public static final void OooO0O0(@NotNull o00O0OOO o00o0ooo2, @NotNull o00OO url, @NotNull oo0O headers) {
        Intrinsics.checkNotNullParameter(o00o0ooo2, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (o00o0ooo2 == o00O0OOO.f57200OooO00o) {
            return;
        }
        Cookie.INSTANCE.getClass();
        List<Cookie> listOooO0Oo = Cookie.Companion.OooO0Oo(url, headers);
        if (listOooO0Oo.isEmpty()) {
            return;
        }
        o00o0ooo2.saveFromResponse(url, listOooO0Oo);
    }
}
