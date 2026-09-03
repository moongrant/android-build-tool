package p667o0oooOO;

import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016OooOoO0.OooOo00;
import p660o0ooo0o0.o00OO;
import p669o0oooOOo.sj;
import p669o0oooOOo.tj;
import p670o0oooOo.t;
import p670o0oooOo.u;
import p670o0oooOo.v;
import p670o0oooOo.x;
import p674o0oooo0.o0oOO;

/* JADX INFO: loaded from: classes3.dex */
public class s {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static volatile s f51919OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Logger f51920OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO00o f51921OooO0OO;

    public static final class OooO00o {
        @NotNull
        public final List<String> OooO00o(@NotNull List<? extends Protocol> protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Protocol) it.next()).getProtocol());
            }
            return arrayList2;
        }

        @NotNull
        public final byte[] OooO0O0(@NotNull List<? extends Protocol> protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            o0oOO o0ooo2 = new o0oOO();
            for (String str : (ArrayList) OooO00o(protocols)) {
                o0ooo2.Ooooo0o(str.length());
                o0ooo2.o00oO0o(str);
            }
            return o0ooo2.OooOoo0();
        }

        public final boolean OooO0OO() {
            return Intrinsics.areEqual("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0085 A[PHI: r1
      0x0085: PHI (r1v3 o0oooOO.s) = (r1v1 o0oooOO.s), (r1v4 o0oooOO.s) binds: [B:67:0x0185, B:26:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:54:0x0102  */
    /* JADX WARN: Code duplicated, block: B:55:0x0108  */
    /* JADX WARN: Code duplicated, block: B:58:0x010d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0123  */
    /* JADX WARN: Code duplicated, block: B:69:0x0189  */
    static {
        Provider provider;
        Provider provider2;
        s sVar;
        String jvmVersion;
        OooO00o oooO00o = new OooO00o();
        f51921OooO0OO = oooO00o;
        s pVar = null;
        if (oooO00o.OooO0OO()) {
            sj sjVar = sj.f51928OooO0OO;
            for (Map.Entry<String, String> entry : sj.f51927OooO0O0.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                Logger logger = Logger.getLogger(key);
                if (sj.f51926OooO00o.add(logger)) {
                    Intrinsics.checkNotNullExpressionValue(logger, "logger");
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(value, 3) ? Level.FINE : Log.isLoggable(value, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(tj.f51929OooO00o);
                }
            }
            k.OooO00o oooO00o2 = k.f51890OooO0o;
            sVar = k.f51891OooO0o0 ? new k() : null;
            if (sVar == null) {
                l.OooO00o oooO00o3 = l.f51894OooO0oO;
                pVar = l.f51893OooO0o ? new l() : null;
                Intrinsics.checkNotNull(pVar);
                sVar = pVar;
            }
        } else {
            Provider provider3 = Security.getProviders()[0];
            Intrinsics.checkNotNullExpressionValue(provider3, "Security.getProviders()[0]");
            if (Intrinsics.areEqual("Conscrypt", provider3.getName())) {
                n.OooO00o oooO00o4 = n.f51902OooO0o;
                sVar = n.f51903OooO0o0 ? new n() : null;
                if (sVar == null) {
                    provider = Security.getProviders()[0];
                    Intrinsics.checkNotNullExpressionValue(provider, "Security.getProviders()[0]");
                    if (Intrinsics.areEqual("BC", provider.getName())) {
                        m.OooO00o oooO00o5 = m.f51899OooO0o;
                        if (m.f51900OooO0o0) {
                            sVar = new m();
                        } else {
                            sVar = null;
                        }
                        if (sVar == null) {
                            provider2 = Security.getProviders()[0];
                            Intrinsics.checkNotNullExpressionValue(provider2, "Security.getProviders()[0]");
                            if (Intrinsics.areEqual("OpenJSSE", provider2.getName())) {
                                r.OooO00o oooO00o6 = r.f51916OooO0o;
                                if (r.f51917OooO0o0) {
                                    sVar = new r();
                                } else {
                                    sVar = null;
                                }
                                if (sVar == null) {
                                    q.OooO00o oooO00o7 = q.f51915OooO0o0;
                                    if (q.f51914OooO0Oo) {
                                        sVar = new q();
                                    } else {
                                        sVar = null;
                                    }
                                    if (sVar == null) {
                                        jvmVersion = System.getProperty("java.specification.version", "unknown");
                                        try {
                                            Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                                            if (Integer.parseInt(jvmVersion) < 9) {
                                                try {
                                                    Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                                    Class<?> clientProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                                    Class<?> serverProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                                    Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                                                    Method getMethod = cls.getMethod("get", SSLSocket.class);
                                                    Method removeMethod = cls.getMethod("remove", SSLSocket.class);
                                                    Intrinsics.checkNotNullExpressionValue(putMethod, "putMethod");
                                                    Intrinsics.checkNotNullExpressionValue(getMethod, "getMethod");
                                                    Intrinsics.checkNotNullExpressionValue(removeMethod, "removeMethod");
                                                    Intrinsics.checkNotNullExpressionValue(clientProviderClass, "clientProviderClass");
                                                    Intrinsics.checkNotNullExpressionValue(serverProviderClass, "serverProviderClass");
                                                    pVar = new p(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
                                                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                                                }
                                            }
                                        } catch (NumberFormatException unused2) {
                                        }
                                        if (pVar != null) {
                                            sVar = pVar;
                                        } else {
                                            sVar = new s();
                                        }
                                    }
                                }
                            } else {
                                q.OooO00o oooO00o8 = q.f51915OooO0o0;
                                if (q.f51914OooO0Oo) {
                                    sVar = new q();
                                } else {
                                    sVar = null;
                                }
                                if (sVar == null) {
                                    jvmVersion = System.getProperty("java.specification.version", "unknown");
                                    Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                                    if (Integer.parseInt(jvmVersion) < 9) {
                                        Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                        Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                        Class<?> clientProviderClass2 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                        Class<?> serverProviderClass2 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                        Method putMethod2 = cls3.getMethod("put", SSLSocket.class, cls4);
                                        Method getMethod2 = cls3.getMethod("get", SSLSocket.class);
                                        Method removeMethod2 = cls3.getMethod("remove", SSLSocket.class);
                                        Intrinsics.checkNotNullExpressionValue(putMethod2, "putMethod");
                                        Intrinsics.checkNotNullExpressionValue(getMethod2, "getMethod");
                                        Intrinsics.checkNotNullExpressionValue(removeMethod2, "removeMethod");
                                        Intrinsics.checkNotNullExpressionValue(clientProviderClass2, "clientProviderClass");
                                        Intrinsics.checkNotNullExpressionValue(serverProviderClass2, "serverProviderClass");
                                        pVar = new p(putMethod2, getMethod2, removeMethod2, clientProviderClass2, serverProviderClass2);
                                    }
                                    if (pVar != null) {
                                        sVar = pVar;
                                    } else {
                                        sVar = new s();
                                    }
                                }
                            }
                        }
                    } else {
                        provider2 = Security.getProviders()[0];
                        Intrinsics.checkNotNullExpressionValue(provider2, "Security.getProviders()[0]");
                        if (Intrinsics.areEqual("OpenJSSE", provider2.getName())) {
                            r.OooO00o oooO00o9 = r.f51916OooO0o;
                            if (r.f51917OooO0o0) {
                                sVar = new r();
                            } else {
                                sVar = null;
                            }
                            if (sVar == null) {
                                q.OooO00o oooO00o10 = q.f51915OooO0o0;
                                if (q.f51914OooO0Oo) {
                                    sVar = new q();
                                } else {
                                    sVar = null;
                                }
                                if (sVar == null) {
                                    jvmVersion = System.getProperty("java.specification.version", "unknown");
                                    Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                                    if (Integer.parseInt(jvmVersion) < 9) {
                                        Class<?> cls5 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                        Class<?> cls6 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                        Class<?> clientProviderClass3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                        Class<?> serverProviderClass3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                        Method putMethod3 = cls5.getMethod("put", SSLSocket.class, cls6);
                                        Method getMethod3 = cls5.getMethod("get", SSLSocket.class);
                                        Method removeMethod3 = cls5.getMethod("remove", SSLSocket.class);
                                        Intrinsics.checkNotNullExpressionValue(putMethod3, "putMethod");
                                        Intrinsics.checkNotNullExpressionValue(getMethod3, "getMethod");
                                        Intrinsics.checkNotNullExpressionValue(removeMethod3, "removeMethod");
                                        Intrinsics.checkNotNullExpressionValue(clientProviderClass3, "clientProviderClass");
                                        Intrinsics.checkNotNullExpressionValue(serverProviderClass3, "serverProviderClass");
                                        pVar = new p(putMethod3, getMethod3, removeMethod3, clientProviderClass3, serverProviderClass3);
                                    }
                                    if (pVar != null) {
                                        sVar = pVar;
                                    } else {
                                        sVar = new s();
                                    }
                                }
                            }
                        } else {
                            q.OooO00o oooO00o11 = q.f51915OooO0o0;
                            if (q.f51914OooO0Oo) {
                                sVar = new q();
                            } else {
                                sVar = null;
                            }
                            if (sVar == null) {
                                jvmVersion = System.getProperty("java.specification.version", "unknown");
                                Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                                if (Integer.parseInt(jvmVersion) < 9) {
                                    Class<?> cls7 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                    Class<?> cls8 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                    Class<?> clientProviderClass4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                    Class<?> serverProviderClass4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                    Method putMethod4 = cls7.getMethod("put", SSLSocket.class, cls8);
                                    Method getMethod4 = cls7.getMethod("get", SSLSocket.class);
                                    Method removeMethod4 = cls7.getMethod("remove", SSLSocket.class);
                                    Intrinsics.checkNotNullExpressionValue(putMethod4, "putMethod");
                                    Intrinsics.checkNotNullExpressionValue(getMethod4, "getMethod");
                                    Intrinsics.checkNotNullExpressionValue(removeMethod4, "removeMethod");
                                    Intrinsics.checkNotNullExpressionValue(clientProviderClass4, "clientProviderClass");
                                    Intrinsics.checkNotNullExpressionValue(serverProviderClass4, "serverProviderClass");
                                    pVar = new p(putMethod4, getMethod4, removeMethod4, clientProviderClass4, serverProviderClass4);
                                }
                                if (pVar != null) {
                                    sVar = pVar;
                                } else {
                                    sVar = new s();
                                }
                            }
                        }
                    }
                }
            } else {
                provider = Security.getProviders()[0];
                Intrinsics.checkNotNullExpressionValue(provider, "Security.getProviders()[0]");
                if (Intrinsics.areEqual("BC", provider.getName())) {
                    m.OooO00o oooO00o12 = m.f51899OooO0o;
                    if (m.f51900OooO0o0) {
                        sVar = new m();
                    } else {
                        sVar = null;
                    }
                    if (sVar == null) {
                        provider2 = Security.getProviders()[0];
                        Intrinsics.checkNotNullExpressionValue(provider2, "Security.getProviders()[0]");
                        if (Intrinsics.areEqual("OpenJSSE", provider2.getName())) {
                            r.OooO00o oooO00o13 = r.f51916OooO0o;
                            if (r.f51917OooO0o0) {
                                sVar = new r();
                            } else {
                                sVar = null;
                            }
                            if (sVar == null) {
                                q.OooO00o oooO00o14 = q.f51915OooO0o0;
                                if (q.f51914OooO0Oo) {
                                    sVar = new q();
                                } else {
                                    sVar = null;
                                }
                                if (sVar == null) {
                                    jvmVersion = System.getProperty("java.specification.version", "unknown");
                                    Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                                    if (Integer.parseInt(jvmVersion) < 9) {
                                        Class<?> cls9 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                        Class<?> cls10 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                        Class<?> clientProviderClass5 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                        Class<?> serverProviderClass5 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                        Method putMethod5 = cls9.getMethod("put", SSLSocket.class, cls10);
                                        Method getMethod5 = cls9.getMethod("get", SSLSocket.class);
                                        Method removeMethod5 = cls9.getMethod("remove", SSLSocket.class);
                                        Intrinsics.checkNotNullExpressionValue(putMethod5, "putMethod");
                                        Intrinsics.checkNotNullExpressionValue(getMethod5, "getMethod");
                                        Intrinsics.checkNotNullExpressionValue(removeMethod5, "removeMethod");
                                        Intrinsics.checkNotNullExpressionValue(clientProviderClass5, "clientProviderClass");
                                        Intrinsics.checkNotNullExpressionValue(serverProviderClass5, "serverProviderClass");
                                        pVar = new p(putMethod5, getMethod5, removeMethod5, clientProviderClass5, serverProviderClass5);
                                    }
                                    if (pVar != null) {
                                        sVar = pVar;
                                    } else {
                                        sVar = new s();
                                    }
                                }
                            }
                        } else {
                            q.OooO00o oooO00o15 = q.f51915OooO0o0;
                            if (q.f51914OooO0Oo) {
                                sVar = new q();
                            } else {
                                sVar = null;
                            }
                            if (sVar == null) {
                                jvmVersion = System.getProperty("java.specification.version", "unknown");
                                Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                                if (Integer.parseInt(jvmVersion) < 9) {
                                    Class<?> cls11 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                    Class<?> cls12 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                    Class<?> clientProviderClass6 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                    Class<?> serverProviderClass6 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                    Method putMethod6 = cls11.getMethod("put", SSLSocket.class, cls12);
                                    Method getMethod6 = cls11.getMethod("get", SSLSocket.class);
                                    Method removeMethod6 = cls11.getMethod("remove", SSLSocket.class);
                                    Intrinsics.checkNotNullExpressionValue(putMethod6, "putMethod");
                                    Intrinsics.checkNotNullExpressionValue(getMethod6, "getMethod");
                                    Intrinsics.checkNotNullExpressionValue(removeMethod6, "removeMethod");
                                    Intrinsics.checkNotNullExpressionValue(clientProviderClass6, "clientProviderClass");
                                    Intrinsics.checkNotNullExpressionValue(serverProviderClass6, "serverProviderClass");
                                    pVar = new p(putMethod6, getMethod6, removeMethod6, clientProviderClass6, serverProviderClass6);
                                }
                                if (pVar != null) {
                                    sVar = pVar;
                                } else {
                                    sVar = new s();
                                }
                            }
                        }
                    }
                } else {
                    provider2 = Security.getProviders()[0];
                    Intrinsics.checkNotNullExpressionValue(provider2, "Security.getProviders()[0]");
                    if (Intrinsics.areEqual("OpenJSSE", provider2.getName())) {
                        r.OooO00o oooO00o16 = r.f51916OooO0o;
                        if (r.f51917OooO0o0) {
                            sVar = new r();
                        } else {
                            sVar = null;
                        }
                        if (sVar == null) {
                            q.OooO00o oooO00o17 = q.f51915OooO0o0;
                            if (q.f51914OooO0Oo) {
                                sVar = new q();
                            } else {
                                sVar = null;
                            }
                            if (sVar == null) {
                                jvmVersion = System.getProperty("java.specification.version", "unknown");
                                Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                                if (Integer.parseInt(jvmVersion) < 9) {
                                    Class<?> cls13 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                    Class<?> cls14 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                    Class<?> clientProviderClass7 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                    Class<?> serverProviderClass7 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                    Method putMethod7 = cls13.getMethod("put", SSLSocket.class, cls14);
                                    Method getMethod7 = cls13.getMethod("get", SSLSocket.class);
                                    Method removeMethod7 = cls13.getMethod("remove", SSLSocket.class);
                                    Intrinsics.checkNotNullExpressionValue(putMethod7, "putMethod");
                                    Intrinsics.checkNotNullExpressionValue(getMethod7, "getMethod");
                                    Intrinsics.checkNotNullExpressionValue(removeMethod7, "removeMethod");
                                    Intrinsics.checkNotNullExpressionValue(clientProviderClass7, "clientProviderClass");
                                    Intrinsics.checkNotNullExpressionValue(serverProviderClass7, "serverProviderClass");
                                    pVar = new p(putMethod7, getMethod7, removeMethod7, clientProviderClass7, serverProviderClass7);
                                }
                                if (pVar != null) {
                                    sVar = pVar;
                                } else {
                                    sVar = new s();
                                }
                            }
                        }
                    } else {
                        q.OooO00o oooO00o18 = q.f51915OooO0o0;
                        if (q.f51914OooO0Oo) {
                            sVar = new q();
                        } else {
                            sVar = null;
                        }
                        if (sVar == null) {
                            jvmVersion = System.getProperty("java.specification.version", "unknown");
                            Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                            if (Integer.parseInt(jvmVersion) < 9) {
                                Class<?> cls15 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                Class<?> cls16 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                Class<?> clientProviderClass8 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                Class<?> serverProviderClass8 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                Method putMethod8 = cls15.getMethod("put", SSLSocket.class, cls16);
                                Method getMethod8 = cls15.getMethod("get", SSLSocket.class);
                                Method removeMethod8 = cls15.getMethod("remove", SSLSocket.class);
                                Intrinsics.checkNotNullExpressionValue(putMethod8, "putMethod");
                                Intrinsics.checkNotNullExpressionValue(getMethod8, "getMethod");
                                Intrinsics.checkNotNullExpressionValue(removeMethod8, "removeMethod");
                                Intrinsics.checkNotNullExpressionValue(clientProviderClass8, "clientProviderClass");
                                Intrinsics.checkNotNullExpressionValue(serverProviderClass8, "serverProviderClass");
                                pVar = new p(putMethod8, getMethod8, removeMethod8, clientProviderClass8, serverProviderClass8);
                            }
                            if (pVar != null) {
                                sVar = pVar;
                            } else {
                                sVar = new s();
                            }
                        }
                    }
                }
            }
        }
        f51919OooO00o = sVar;
        f51920OooO0O0 = Logger.getLogger(o00OO.class.getName());
    }

    public static /* synthetic */ void OooOO0(s sVar, String str, int i, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        sVar.OooO(str, i, null);
    }

    public final void OooO(@NotNull String message, int i, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        f51920OooO0O0.log(i == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    public void OooO00o(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
    }

    @NotNull
    public v OooO0O0(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        return new t(OooO0OO(trustManager));
    }

    @NotNull
    public x OooO0OO(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "trustManager.acceptedIssuers");
        return new u((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
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
        if (f51920OooO0O0.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean OooO0oo(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return true;
    }

    public void OooOO0O(@NotNull String message, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (obj == null) {
            message = OooOo00.OooO0Oo(message, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        OooO(message, 5, (Throwable) obj);
    }

    @NotNull
    public SSLContext OooOO0o() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Intrinsics.checkNotNullExpressionValue(sSLContext, "SSLContext.getInstance(\"TLS\")");
        return sSLContext;
    }

    @NotNull
    public X509TrustManager OooOOO() {
        TrustManagerFactory factory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        factory.init((KeyStore) null);
        Intrinsics.checkNotNullExpressionValue(factory, "factory");
        TrustManager[] trustManagers = factory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
            TrustManager trustManager = trustManagers[0];
            Objects.requireNonNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            return (X509TrustManager) trustManager;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(string, "java.util.Arrays.toString(this)");
        sbOooO0o0.append(string);
        throw new IllegalStateException(sbOooO0o0.toString().toString());
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
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    @NotNull
    public final String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
