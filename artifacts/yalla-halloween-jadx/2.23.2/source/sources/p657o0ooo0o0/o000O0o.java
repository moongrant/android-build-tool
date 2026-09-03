package p657o0ooo0o0;

import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p641o0ooOO0o.o0OoO00O;
import p656o0ooo0o.oO000Oo;
import p656o0ooo0o.oO000o00;
import p661o0oooO00.o0000O;
import p661o0oooO00.o0000O0;
import p661o0oooO00.o0000O0O;
import p661o0oooO00.o0000oo;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes5.dex */
public class o000O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static volatile o000O0o f59618OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Logger f59619OooO0O0;

    public static final class OooO00o {
        @NotNull
        public static ArrayList OooO00o(@NotNull List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.OooO0oo(arrayList));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Protocol) it.next()).getProtocol());
            }
            return arrayList2;
        }

        @NotNull
        public static byte[] OooO0O0(@NotNull List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            oo0OOoo oo0oooo = new oo0OOoo();
            for (String str : OooO00o(protocols)) {
                oo0oooo.o00o0O(str.length());
                oo0oooo.o00000OO(str);
            }
            return oo0oooo.o00ooo();
        }

        public static boolean OooO0OO() {
            return Intrinsics.areEqual("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0076 A[PHI: r1
      0x0076: PHI (r1v3 o0ooo0o0.o000O0o) = (r1v1 o0ooo0o0.o000O0o), (r1v4 o0ooo0o0.o000O0o) binds: [B:66:0x016b, B:25:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:62:0x0103  */
    /* JADX WARN: Code duplicated, block: B:68:0x016f  */
    static {
        o000O0o o000o0o2;
        String jvmVersion;
        new OooO00o();
        o000O0o o0000o2 = null;
        if (OooO00o.OooO0OO()) {
            for (Map.Entry<String, String> entry : oO000Oo.f59579OooO0O0.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                Logger logger = Logger.getLogger(key);
                if (oO000Oo.f59578OooO00o.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(value, 3) ? Level.FINE : Log.isLoggable(value, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(oO000o00.f59582OooO00o);
                }
            }
            o000o0o2 = o0000oo.f59614OooO0Oo ? new o0000oo() : null;
            if (o000o0o2 == null) {
                o0000o2 = o0000O0.f59607OooO0o0 ? new o0000O0() : null;
                Intrinsics.checkNotNull(o0000o2);
                o000o0o2 = o0000o2;
            }
        } else if (Intrinsics.areEqual("Conscrypt", Security.getProviders()[0].getName())) {
            o000o0o2 = o000OO.f59620OooO0Oo ? new o000OO() : null;
            if (o000o0o2 == null) {
                if (!Intrinsics.areEqual("BC", Security.getProviders()[0].getName())) {
                    if (o0000O0O.f59612OooO0Oo) {
                        o000o0o2 = new o0000O0O();
                    } else {
                        o000o0o2 = null;
                    }
                    if (o000o0o2 == null) {
                        if (Intrinsics.areEqual("OpenJSSE", Security.getProviders()[0].getName())) {
                            if (o000O000.f59616OooO0Oo) {
                                o000o0o2 = new o000O000();
                            } else {
                                o000o0o2 = null;
                            }
                            if (o000o0o2 == null) {
                                if (o000.f59598OooO0OO) {
                                    o000o0o2 = new o000();
                                } else {
                                    o000o0o2 = null;
                                }
                                if (o000o0o2 == null) {
                                    jvmVersion = System.getProperty("java.specification.version", "unknown");
                                    Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                                    if (Integer.parseInt(jvmVersion) < 9) {
                                        Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                        Class<?> cls2 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, null);
                                        Class<?> clientProviderClass = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, null);
                                        Class<?> serverProviderClass = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, null);
                                        Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                                        Method getMethod = cls.getMethod("get", SSLSocket.class);
                                        Method removeMethod = cls.getMethod("remove", SSLSocket.class);
                                        Intrinsics.checkNotNullExpressionValue(putMethod, "putMethod");
                                        Intrinsics.checkNotNullExpressionValue(getMethod, "getMethod");
                                        Intrinsics.checkNotNullExpressionValue(removeMethod, "removeMethod");
                                        Intrinsics.checkNotNullExpressionValue(clientProviderClass, "clientProviderClass");
                                        Intrinsics.checkNotNullExpressionValue(serverProviderClass, "serverProviderClass");
                                        o0000o2 = new o0000O(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
                                    }
                                    if (o0000o2 != null) {
                                        o000o0o2 = o0000o2;
                                    } else {
                                        o000o0o2 = new o000O0o();
                                    }
                                }
                            }
                        } else {
                            if (o000.f59598OooO0OO) {
                                o000o0o2 = new o000();
                            } else {
                                o000o0o2 = null;
                            }
                            if (o000o0o2 == null) {
                                jvmVersion = System.getProperty("java.specification.version", "unknown");
                                Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                                if (Integer.parseInt(jvmVersion) < 9) {
                                    Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                    Class<?> cls4 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, null);
                                    Class<?> clientProviderClass2 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, null);
                                    Class<?> serverProviderClass2 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, null);
                                    Method putMethod2 = cls3.getMethod("put", SSLSocket.class, cls4);
                                    Method getMethod2 = cls3.getMethod("get", SSLSocket.class);
                                    Method removeMethod2 = cls3.getMethod("remove", SSLSocket.class);
                                    Intrinsics.checkNotNullExpressionValue(putMethod2, "putMethod");
                                    Intrinsics.checkNotNullExpressionValue(getMethod2, "getMethod");
                                    Intrinsics.checkNotNullExpressionValue(removeMethod2, "removeMethod");
                                    Intrinsics.checkNotNullExpressionValue(clientProviderClass2, "clientProviderClass");
                                    Intrinsics.checkNotNullExpressionValue(serverProviderClass2, "serverProviderClass");
                                    o0000o2 = new o0000O(putMethod2, getMethod2, removeMethod2, clientProviderClass2, serverProviderClass2);
                                }
                                if (o0000o2 != null) {
                                    o000o0o2 = o0000o2;
                                } else {
                                    o000o0o2 = new o000O0o();
                                }
                            }
                        }
                    }
                } else if (Intrinsics.areEqual("OpenJSSE", Security.getProviders()[0].getName())) {
                    if (o000.f59598OooO0OO) {
                        o000o0o2 = new o000();
                    } else {
                        o000o0o2 = null;
                    }
                    if (o000o0o2 == null) {
                        jvmVersion = System.getProperty("java.specification.version", "unknown");
                        Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                        if (Integer.parseInt(jvmVersion) < 9) {
                            Class<?> cls5 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls6 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, null);
                            Class<?> clientProviderClass3 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, null);
                            Class<?> serverProviderClass3 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, null);
                            Method putMethod3 = cls5.getMethod("put", SSLSocket.class, cls6);
                            Method getMethod3 = cls5.getMethod("get", SSLSocket.class);
                            Method removeMethod3 = cls5.getMethod("remove", SSLSocket.class);
                            Intrinsics.checkNotNullExpressionValue(putMethod3, "putMethod");
                            Intrinsics.checkNotNullExpressionValue(getMethod3, "getMethod");
                            Intrinsics.checkNotNullExpressionValue(removeMethod3, "removeMethod");
                            Intrinsics.checkNotNullExpressionValue(clientProviderClass3, "clientProviderClass");
                            Intrinsics.checkNotNullExpressionValue(serverProviderClass3, "serverProviderClass");
                            o0000o2 = new o0000O(putMethod3, getMethod3, removeMethod3, clientProviderClass3, serverProviderClass3);
                        }
                        if (o0000o2 != null) {
                            o000o0o2 = o0000o2;
                        } else {
                            o000o0o2 = new o000O0o();
                        }
                    }
                } else {
                    if (o000O000.f59616OooO0Oo) {
                        o000o0o2 = new o000O000();
                    } else {
                        o000o0o2 = null;
                    }
                    if (o000o0o2 == null) {
                        if (o000.f59598OooO0OO) {
                            o000o0o2 = new o000();
                        } else {
                            o000o0o2 = null;
                        }
                        if (o000o0o2 == null) {
                            jvmVersion = System.getProperty("java.specification.version", "unknown");
                            Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                            if (Integer.parseInt(jvmVersion) < 9) {
                                Class<?> cls7 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                Class<?> cls8 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, null);
                                Class<?> clientProviderClass4 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, null);
                                Class<?> serverProviderClass4 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, null);
                                Method putMethod4 = cls7.getMethod("put", SSLSocket.class, cls8);
                                Method getMethod4 = cls7.getMethod("get", SSLSocket.class);
                                Method removeMethod4 = cls7.getMethod("remove", SSLSocket.class);
                                Intrinsics.checkNotNullExpressionValue(putMethod4, "putMethod");
                                Intrinsics.checkNotNullExpressionValue(getMethod4, "getMethod");
                                Intrinsics.checkNotNullExpressionValue(removeMethod4, "removeMethod");
                                Intrinsics.checkNotNullExpressionValue(clientProviderClass4, "clientProviderClass");
                                Intrinsics.checkNotNullExpressionValue(serverProviderClass4, "serverProviderClass");
                                o0000o2 = new o0000O(putMethod4, getMethod4, removeMethod4, clientProviderClass4, serverProviderClass4);
                            }
                            if (o0000o2 != null) {
                                o000o0o2 = o0000o2;
                            } else {
                                o000o0o2 = new o000O0o();
                            }
                        }
                    }
                }
            }
        } else if (!Intrinsics.areEqual("BC", Security.getProviders()[0].getName())) {
            if (o0000O0O.f59612OooO0Oo) {
                o000o0o2 = new o0000O0O();
            } else {
                o000o0o2 = null;
            }
            if (o000o0o2 == null) {
                if (Intrinsics.areEqual("OpenJSSE", Security.getProviders()[0].getName())) {
                    if (o000.f59598OooO0OO) {
                        o000o0o2 = new o000();
                    } else {
                        o000o0o2 = null;
                    }
                    if (o000o0o2 == null) {
                        jvmVersion = System.getProperty("java.specification.version", "unknown");
                        Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                        if (Integer.parseInt(jvmVersion) < 9) {
                            Class<?> cls9 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls10 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, null);
                            Class<?> clientProviderClass5 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, null);
                            Class<?> serverProviderClass5 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, null);
                            Method putMethod5 = cls9.getMethod("put", SSLSocket.class, cls10);
                            Method getMethod5 = cls9.getMethod("get", SSLSocket.class);
                            Method removeMethod5 = cls9.getMethod("remove", SSLSocket.class);
                            Intrinsics.checkNotNullExpressionValue(putMethod5, "putMethod");
                            Intrinsics.checkNotNullExpressionValue(getMethod5, "getMethod");
                            Intrinsics.checkNotNullExpressionValue(removeMethod5, "removeMethod");
                            Intrinsics.checkNotNullExpressionValue(clientProviderClass5, "clientProviderClass");
                            Intrinsics.checkNotNullExpressionValue(serverProviderClass5, "serverProviderClass");
                            o0000o2 = new o0000O(putMethod5, getMethod5, removeMethod5, clientProviderClass5, serverProviderClass5);
                        }
                        if (o0000o2 != null) {
                            o000o0o2 = o0000o2;
                        } else {
                            o000o0o2 = new o000O0o();
                        }
                    }
                } else {
                    if (o000O000.f59616OooO0Oo) {
                        o000o0o2 = new o000O000();
                    } else {
                        o000o0o2 = null;
                    }
                    if (o000o0o2 == null) {
                        if (o000.f59598OooO0OO) {
                            o000o0o2 = new o000();
                        } else {
                            o000o0o2 = null;
                        }
                        if (o000o0o2 == null) {
                            jvmVersion = System.getProperty("java.specification.version", "unknown");
                            Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                            if (Integer.parseInt(jvmVersion) < 9) {
                                Class<?> cls11 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                Class<?> cls12 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, null);
                                Class<?> clientProviderClass6 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, null);
                                Class<?> serverProviderClass6 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, null);
                                Method putMethod6 = cls11.getMethod("put", SSLSocket.class, cls12);
                                Method getMethod6 = cls11.getMethod("get", SSLSocket.class);
                                Method removeMethod6 = cls11.getMethod("remove", SSLSocket.class);
                                Intrinsics.checkNotNullExpressionValue(putMethod6, "putMethod");
                                Intrinsics.checkNotNullExpressionValue(getMethod6, "getMethod");
                                Intrinsics.checkNotNullExpressionValue(removeMethod6, "removeMethod");
                                Intrinsics.checkNotNullExpressionValue(clientProviderClass6, "clientProviderClass");
                                Intrinsics.checkNotNullExpressionValue(serverProviderClass6, "serverProviderClass");
                                o0000o2 = new o0000O(putMethod6, getMethod6, removeMethod6, clientProviderClass6, serverProviderClass6);
                            }
                            if (o0000o2 != null) {
                                o000o0o2 = o0000o2;
                            } else {
                                o000o0o2 = new o000O0o();
                            }
                        }
                    }
                }
            }
        } else if (Intrinsics.areEqual("OpenJSSE", Security.getProviders()[0].getName())) {
            if (o000.f59598OooO0OO) {
                o000o0o2 = new o000();
            } else {
                o000o0o2 = null;
            }
            if (o000o0o2 == null) {
                jvmVersion = System.getProperty("java.specification.version", "unknown");
                try {
                    Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                    if (Integer.parseInt(jvmVersion) < 9) {
                        try {
                            Class<?> cls13 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls14 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, null);
                            Class<?> clientProviderClass7 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, null);
                            Class<?> serverProviderClass7 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, null);
                            Method putMethod7 = cls13.getMethod("put", SSLSocket.class, cls14);
                            Method getMethod7 = cls13.getMethod("get", SSLSocket.class);
                            Method removeMethod7 = cls13.getMethod("remove", SSLSocket.class);
                            Intrinsics.checkNotNullExpressionValue(putMethod7, "putMethod");
                            Intrinsics.checkNotNullExpressionValue(getMethod7, "getMethod");
                            Intrinsics.checkNotNullExpressionValue(removeMethod7, "removeMethod");
                            Intrinsics.checkNotNullExpressionValue(clientProviderClass7, "clientProviderClass");
                            Intrinsics.checkNotNullExpressionValue(serverProviderClass7, "serverProviderClass");
                            o0000o2 = new o0000O(putMethod7, getMethod7, removeMethod7, clientProviderClass7, serverProviderClass7);
                        } catch (ClassNotFoundException | NoSuchMethodException unused) {
                        }
                    }
                } catch (NumberFormatException unused2) {
                }
                if (o0000o2 != null) {
                    o000o0o2 = o0000o2;
                } else {
                    o000o0o2 = new o000O0o();
                }
            }
        } else {
            if (o000O000.f59616OooO0Oo) {
                o000o0o2 = new o000O000();
            } else {
                o000o0o2 = null;
            }
            if (o000o0o2 == null) {
                if (o000.f59598OooO0OO) {
                    o000o0o2 = new o000();
                } else {
                    o000o0o2 = null;
                }
                if (o000o0o2 == null) {
                    jvmVersion = System.getProperty("java.specification.version", "unknown");
                    Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                    if (Integer.parseInt(jvmVersion) < 9) {
                        Class<?> cls15 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        Class<?> cls16 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, null);
                        Class<?> clientProviderClass8 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, null);
                        Class<?> serverProviderClass8 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, null);
                        Method putMethod8 = cls15.getMethod("put", SSLSocket.class, cls16);
                        Method getMethod8 = cls15.getMethod("get", SSLSocket.class);
                        Method removeMethod8 = cls15.getMethod("remove", SSLSocket.class);
                        Intrinsics.checkNotNullExpressionValue(putMethod8, "putMethod");
                        Intrinsics.checkNotNullExpressionValue(getMethod8, "getMethod");
                        Intrinsics.checkNotNullExpressionValue(removeMethod8, "removeMethod");
                        Intrinsics.checkNotNullExpressionValue(clientProviderClass8, "clientProviderClass");
                        Intrinsics.checkNotNullExpressionValue(serverProviderClass8, "serverProviderClass");
                        o0000o2 = new o0000O(putMethod8, getMethod8, removeMethod8, clientProviderClass8, serverProviderClass8);
                    }
                    if (o0000o2 != null) {
                        o000o0o2 = o0000o2;
                    } else {
                        o000o0o2 = new o000O0o();
                    }
                }
            }
        }
        f59618OooO00o = o000o0o2;
        f59619OooO0O0 = Logger.getLogger(o0OoO00O.class.getName());
    }

    public static void OooO(@Nullable Throwable th, int i, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        f59619OooO0O0.log(i == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    public static /* synthetic */ void OooOO0(o000O0o o000o0o2, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        o000o0o2.getClass();
        OooO(null, i, str);
    }

    public void OooO00o(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
    }

    @NotNull
    public o0000O0O OooO0O0(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        return new o0000oo(OooO0OO(trustManager));
    }

    @NotNull
    public o0000O OooO0OO(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "trustManager.acceptedIssuers");
        return new o0000O0((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void OooO0Oo(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<Protocol> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
    }

    @Nullable
    public String OooO0o(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return null;
    }

    public void OooO0o0(@NotNull Socket socket, @NotNull InetSocketAddress address, int i) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        socket.connect(address, i);
    }

    @Nullable
    public Object OooO0oO() {
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        if (f59619OooO0O0.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean OooO0oo(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return true;
    }

    public void OooOO0O(@Nullable Object obj, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (obj == null) {
            message = Intrinsics.stringPlus(message, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        OooO((Throwable) obj, 5, message);
    }

    @NotNull
    public SSLContext OooOO0o() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    @NotNull
    public X509TrustManager OooOOO() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        if (!(trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager))) {
            String string = Arrays.toString(trustManagers);
            Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
            throw new IllegalStateException(Intrinsics.stringPlus("Unexpected default trust managers: ", string).toString());
        }
        TrustManager trustManager = trustManagers[0];
        if (trustManager != null) {
            return (X509TrustManager) trustManager;
        }
        throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
    }

    @NotNull
    public SSLSocketFactory OooOOO0(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            SSLContext sSLContextOooOO0o = OooOO0o();
            sSLContextOooOO0o.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContextOooOO0o.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError(Intrinsics.stringPlus("No System TLS: ", e), e);
        }
    }

    @NotNull
    public final String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
