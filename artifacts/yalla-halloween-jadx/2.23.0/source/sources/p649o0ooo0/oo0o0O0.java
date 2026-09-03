package p649o0ooo0;

import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p652o0ooo00o.o000O0O0;
import p652o0ooo00o.o000Oo0;

/* JADX INFO: loaded from: classes5.dex */
public class oo0o0O0 implements o00OO000 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final o00O0OO0 f59821OooO0o;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Class<? super SSLSocket> f59822OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Method f59823OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Method f59824OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Method f59825OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Method f59826OooO0o0;

    static {
        Intrinsics.checkNotNullParameter("com.google.android.gms.org.conscrypt", RemoteConfigConstants$RequestFieldKey.PACKAGE_NAME);
        f59821OooO0o = new o00O0OO0();
    }

    public oo0o0O0(@NotNull Class<? super SSLSocket> sslSocketClass) throws NoSuchMethodException {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.f59822OooO00o = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f59823OooO0O0 = declaredMethod;
        this.f59824OooO0OO = sslSocketClass.getMethod("setHostname", String.class);
        this.f59825OooO0Oo = sslSocketClass.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f59826OooO0o0 = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p649o0ooo0.o00OO000
    public final boolean OooO00o(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f59822OooO00o.isInstance(sslSocket);
    }

    @Override // p649o0ooo0.o00OO000
    public final boolean OooO0O0() {
        boolean z = o000Oo0.f60038OooO0o0;
        return o000Oo0.f60038OooO0o0;
    }

    @Override // p649o0ooo0.o00OO000
    @Nullable
    public final String OooO0OO(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (!OooO00o(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f59825OooO0Oo.invoke(sslSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, Charsets.UTF_8);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof NullPointerException) && Intrinsics.areEqual(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e2);
        }
    }

    @Override // p649o0ooo0.o00OO000
    public final void OooO0Oo(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends Protocol> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (OooO00o(sslSocket)) {
            try {
                this.f59823OooO0O0.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f59824OooO0OO.invoke(sslSocket, str);
                }
                Method method = this.f59826OooO0o0;
                o000O0O0 o000o0o1 = o000O0O0.f60031OooO00o;
                method.invoke(sslSocket, o000O0O0.OooO00o.OooO0O0(protocols));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
