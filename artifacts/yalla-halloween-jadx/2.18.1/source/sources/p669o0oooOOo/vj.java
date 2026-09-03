package p669o0oooOOo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p667o0oooOO.l;
import p667o0oooOO.s;

/* JADX INFO: loaded from: classes3.dex */
public class vj implements ak {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final uj f51931OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooO00o f51932OooO0oO = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Method f51933OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Method f51934OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Method f51935OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Method f51936OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Class<? super SSLSocket> f51937OooO0o0;

    public static final class OooO00o {
    }

    static {
        Intrinsics.checkNotNullParameter("com.google.android.gms.org.conscrypt", "packageName");
        f51931OooO0o = new uj();
    }

    public vj(@NotNull Class<? super SSLSocket> sslSocketClass) throws NoSuchMethodException {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.f51937OooO0o0 = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f51933OooO00o = declaredMethod;
        this.f51934OooO0O0 = sslSocketClass.getMethod("setHostname", String.class);
        this.f51935OooO0OO = sslSocketClass.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f51936OooO0Oo = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p669o0oooOOo.ak
    public final boolean OooO00o(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f51937OooO0o0.isInstance(sslSocket);
    }

    @Override // p669o0oooOOo.ak
    public final boolean OooO0O0() {
        l.OooO00o oooO00o = l.f51894OooO0oO;
        return l.f51893OooO0o;
    }

    @Override // p669o0oooOOo.ak
    @Nullable
    public final String OooO0OO(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (!OooO00o(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f51935OooO0OO.invoke(sslSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(charset, "StandardCharsets.UTF_8");
            return new String(bArr, charset);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (NullPointerException e2) {
            if (Intrinsics.areEqual(e2.getMessage(), "ssl == null")) {
                return null;
            }
            throw e2;
        } catch (InvocationTargetException e3) {
            throw new AssertionError(e3);
        }
    }

    @Override // p669o0oooOOo.ak
    public final void OooO0Oo(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends Protocol> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (OooO00o(sslSocket)) {
            try {
                this.f51933OooO00o.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f51934OooO0O0.invoke(sslSocket, str);
                }
                this.f51936OooO0Oo.invoke(sslSocket, s.f51921OooO0OO.OooO0O0(protocols));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
