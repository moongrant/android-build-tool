package p416o0Oo0oO0;

import java.io.IOException;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import p412o0Oo0o00.o000000;
import p412o0Oo0o00.o0000O;
import p412o0Oo0o00.o0000Ooo;
import p412o0Oo0o00.o000O000;
import p412o0Oo0o00.o000O0o;
import p412o0Oo0o00.o000OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Comparator<String> f39585OooO00o = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String f39586OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final String f39587OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final String f39588OooO0Oo;

    public static class OooO00o implements Comparator<String> {
        @Override // java.util.Comparator
        public final int compare(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            if (str3 == str4) {
                return 0;
            }
            if (str3 == null) {
                return -1;
            }
            if (str4 == null) {
                return 1;
            }
            return String.CASE_INSENSITIVE_ORDER.compare(str3, str4);
        }
    }

    static {
        Objects.requireNonNull(p413o0Oo0o0O.o0O0O00.f39356OooO00o);
        f39586OooO0O0 = "OkHttp-Sent-Millis";
        f39587OooO0OO = "OkHttp-Received-Millis";
        f39588OooO0Oo = "OkHttp-Selected-Protocol";
    }

    public static long OooO00o(o000OO o000oo2) {
        String strOooO00o = o000oo2.OooO00o("Content-Length");
        if (strOooO00o == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strOooO00o);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static boolean OooO0O0(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static o000O000 OooO0OO(o000000 o000000Var, o000O0o o000o0o2, Proxy proxy) throws IOException {
        int i = 0;
        if (o000o0o2.f39315OooO0OO == 407) {
            o00O0O o00o0o2 = (o00O0O) o000000Var;
            Objects.requireNonNull(o00o0o2);
            List<o0000Ooo> listOooO0O0 = o000o0o2.OooO0O0();
            o000O000 o000o001 = o000o0o2.f39313OooO00o;
            o0000O o0000o2 = o000o001.f39302OooO00o;
            int size = listOooO0O0.size();
            while (i < size) {
                o0000Ooo o0000ooo = listOooO0O0.get(i);
                if ("Basic".equalsIgnoreCase(o0000ooo.f39286OooO00o)) {
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) proxy.address();
                    try {
                        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(inetSocketAddress.getHostName(), o00o0o2.OooO00o(proxy, o0000o2), inetSocketAddress.getPort(), o0000o2.f39259OooO00o, o0000ooo.f39287OooO0O0, o0000ooo.f39286OooO00o, new URL(o0000o2.f39266OooO0oo), Authenticator.RequestorType.PROXY);
                        if (passwordAuthenticationRequestPasswordAuthentication != null) {
                            String strOooO00o = com.android.billingclient.api.o0O0O00.OooO00o(passwordAuthenticationRequestPasswordAuthentication.getUserName(), new String(passwordAuthenticationRequestPasswordAuthentication.getPassword()));
                            o000O000.OooO00o oooO00oOooO0Oo = o000o001.OooO0Oo();
                            oooO00oOooO0Oo.f39310OooO0OO.OooO0oO("Proxy-Authorization", strOooO00o);
                            return oooO00oOooO0Oo.OooO00o();
                        }
                    } catch (MalformedURLException e) {
                        throw new RuntimeException(e);
                    }
                }
                i++;
            }
        } else {
            o00O0O o00o0o3 = (o00O0O) o000000Var;
            Objects.requireNonNull(o00o0o3);
            List<o0000Ooo> listOooO0O1 = o000o0o2.OooO0O0();
            o000O000 o000o002 = o000o0o2.f39313OooO00o;
            o0000O o0000o3 = o000o002.f39302OooO00o;
            int size2 = listOooO0O1.size();
            while (i < size2) {
                o0000Ooo o0000ooo2 = listOooO0O1.get(i);
                if ("Basic".equalsIgnoreCase(o0000ooo2.f39286OooO00o)) {
                    try {
                        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication2 = Authenticator.requestPasswordAuthentication(o0000o3.f39262OooO0Oo, o00o0o3.OooO00o(proxy, o0000o3), o0000o3.f39264OooO0o0, o0000o3.f39259OooO00o, o0000ooo2.f39287OooO0O0, o0000ooo2.f39286OooO00o, new URL(o0000o3.f39266OooO0oo), Authenticator.RequestorType.SERVER);
                        if (passwordAuthenticationRequestPasswordAuthentication2 != null) {
                            String strOooO00o2 = com.android.billingclient.api.o0O0O00.OooO00o(passwordAuthenticationRequestPasswordAuthentication2.getUserName(), new String(passwordAuthenticationRequestPasswordAuthentication2.getPassword()));
                            o000O000.OooO00o oooO00oOooO0Oo2 = o000o002.OooO0Oo();
                            oooO00oOooO0Oo2.f39310OooO0OO.OooO0oO("Authorization", strOooO00o2);
                            return oooO00oOooO0Oo2.OooO00o();
                        }
                    } catch (MalformedURLException e2) {
                        throw new RuntimeException(e2);
                    }
                }
                i++;
            }
        }
        return null;
    }

    public static Map OooO0Oo(o000OO o000oo2) {
        TreeMap treeMap = new TreeMap(f39585OooO00o);
        int length = o000oo2.f39333OooO00o.length / 2;
        for (int i = 0; i < length; i++) {
            String strOooO0O0 = o000oo2.OooO0O0(i);
            String strOooO0Oo = o000oo2.OooO0Oo(i);
            ArrayList arrayList = new ArrayList();
            List list = (List) treeMap.get(strOooO0O0);
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.add(strOooO0Oo);
            treeMap.put(strOooO0O0, Collections.unmodifiableList(arrayList));
        }
        return Collections.unmodifiableMap(treeMap);
    }

    public static Set<String> OooO0o0(o000OO o000oo2) {
        Set<String> setEmptySet = Collections.emptySet();
        int length = o000oo2.f39333OooO00o.length / 2;
        for (int i = 0; i < length; i++) {
            if ("Vary".equalsIgnoreCase(o000oo2.OooO0O0(i))) {
                String strOooO0Oo = o000oo2.OooO0Oo(i);
                if (setEmptySet.isEmpty()) {
                    setEmptySet = new TreeSet<>((Comparator<? super String>) String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : strOooO0Oo.split(",")) {
                    setEmptySet.add(str.trim());
                }
            }
        }
        return setEmptySet;
    }
}
