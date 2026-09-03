package p634o0ooO0O;

import com.facebook.internal.security.CertificateUtil;
import java.net.InetSocketAddress;
import java.net.ProxySelector;
import java.util.Objects;
import java.util.logging.Logger;
import o0OOOO0o.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OO000 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Logger f48842OooO0OO = Logger.getLogger(o00OO000.class.getName());

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO00o f48843OooO0Oo = new OooO00o();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final o0OoOo0<ProxySelector> f48844OooO0o0 = new OooO0O0();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OoOo0<ProxySelector> f48845OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0OO f48846OooO0O0;

    public class OooO00o implements OooO0OO {
    }

    public class OooO0O0 implements o0OoOo0<ProxySelector> {
        @Override // o0OOOO0o.o0OoOo0
        public final ProxySelector get() {
            return ProxySelector.getDefault();
        }
    }

    public interface OooO0OO {
    }

    public o00OO000() {
        o0OoOo0<ProxySelector> o0oooo1 = f48844OooO0o0;
        OooO00o oooO00o = f48843OooO0Oo;
        String str = System.getenv("GRPC_PROXY_EXP");
        Objects.requireNonNull(o0oooo1);
        this.f48845OooO00o = o0oooo1;
        Objects.requireNonNull(oooO00o);
        this.f48846OooO0O0 = oooO00o;
        if (str != null) {
            String[] strArrSplit = str.split(CertificateUtil.DELIMITER, 2);
            int i = strArrSplit.length > 1 ? Integer.parseInt(strArrSplit[1]) : 80;
            f48842OooO0OO.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
            new InetSocketAddress(strArrSplit[0], i);
        }
    }
}
