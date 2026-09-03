package io.grpc;

import com.google.common.io.BaseEncoding;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
@Internal
public final class OooOOO0 {

    @Internal
    public interface OooO00o<T> extends OooOo00.OooOO0O<T> {
    }

    static {
        Charset.forName("US-ASCII");
        BaseEncoding baseEncoding = OooOo00.f26374OooO0O0;
    }

    @Internal
    public static <T> OooOo00.OooO<T> OooO00o(String str, OooO00o<T> oooO00o) {
        boolean z = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        return OooOo00.OooO.OooO0O0(str, z, oooO00o);
    }
}
