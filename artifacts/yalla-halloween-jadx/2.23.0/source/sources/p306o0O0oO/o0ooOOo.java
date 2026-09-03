package p306o0O0oO;

import androidx.annotation.NonNull;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import p307o0O0oO0.OooOOO0;
import p308o0O0oO0O.o00O0O;

/* JADX INFO: loaded from: classes3.dex */
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Pattern f42471OooO00o = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    public static Long OooO00o(@NonNull HttpMessage httpMessage) {
        try {
            Header firstHeader = httpMessage.getFirstHeader("content-length");
            if (firstHeader != null) {
                return Long.valueOf(Long.parseLong(firstHeader.getValue()));
            }
            return null;
        } catch (NumberFormatException unused) {
            OooOOO0.OooO0Oo().OooO00o("The content-length value is not a valid number");
            return null;
        }
    }

    public static String OooO0O0(@NonNull HttpResponse httpResponse) {
        String value;
        Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader == null || (value = firstHeader.getValue()) == null) {
            return null;
        }
        return value;
    }

    public static void OooO0OO(o00O0O o00o0o2) {
        if (!o00o0o2.f42486OooO0oO.OooO0oO()) {
            o00o0o2.f42486OooO0oO.OooOO0o(NetworkRequestMetric.NetworkClientErrorReason.GENERIC_CLIENT_ERROR);
        }
        o00o0o2.OooO0O0();
    }
}
