package p656o0ooo0o;

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
import p657o0ooo0o0.o0000O0;
import p657o0ooo0o0.o000O0o;

/* JADX INFO: loaded from: classes5.dex */
public class oO00O0o0 implements oO00OOO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final oO0O0OoO f59584OooO0o;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Class<? super SSLSocket> f59585OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Method f59586OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Method f59587OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Method f59588OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Method f59589OooO0o0;

    static {
        Intrinsics.checkNotNullParameter("com.google.android.gms.org.conscrypt", RemoteConfigConstants$RequestFieldKey.PACKAGE_NAME);
        f59584OooO0o = new oO0O0OoO();
    }

    public oO00O0o0(@NotNull Class<? super SSLSocket> sslSocketClass) throws NoSuchMethodException {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.f59585OooO00o = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f59586OooO0O0 = declaredMethod;
        this.f59587OooO0OO = sslSocketClass.getMethod("setHostname", String.class);
        this.f59588OooO0Oo = sslSocketClass.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f59589OooO0o0 = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p656o0ooo0o.oO00OOO
    public final boolean OooO00o(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f59585OooO00o.isInstance(sslSocket);
    }

    @Override // p656o0ooo0o.oO00OOO
    public final boolean OooO0O0() {
        boolean z = o0000O0.f59607OooO0o0;
        return o0000O0.f59607OooO0o0;
    }

    @Override // p656o0ooo0o.oO00OOO
    @Nullable
    public final String OooO0OO(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (!OooO00o(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f59588OooO0Oo.invoke(sslSocket, new Object[0]);
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

    @Override // p656o0ooo0o.oO00OOO
    public final void OooO0Oo(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends Protocol> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (OooO00o(sslSocket)) {
            try {
                this.f59586OooO0O0.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f59587OooO0OO.invoke(sslSocket, str);
                }
                Method method = this.f59589OooO0o0;
                o000O0o o000o0o2 = o000O0o.f59618OooO00o;
                method.invoke(sslSocket, o000O0o.OooO00o.OooO0O0(protocols));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
