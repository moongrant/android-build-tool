package p312o0O0oOO;

import androidx.annotation.NonNull;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import p308o0O0oO.OooO;
import p311o0O0oO0o.o0O0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Pattern f41842OooO00o = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    public static Long OooO00o(@NonNull HttpMessage httpMessage) {
        try {
            Header firstHeader = httpMessage.getFirstHeader("content-length");
            if (firstHeader != null) {
                return Long.valueOf(Long.parseLong(firstHeader.getValue()));
            }
            return null;
        } catch (NumberFormatException unused) {
            o0O0O00.OooO0Oo().OooO00o("The content-length value is not a valid number");
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

    public static void OooO0OO(OooO oooO) {
        if (!oooO.f41775OooO0oO.OooO0oO()) {
            oooO.f41775OooO0oO.OooOO0o(NetworkRequestMetric.NetworkClientErrorReason.GENERIC_CLIENT_ERROR);
        }
        oooO.OooO0O0();
    }
}
