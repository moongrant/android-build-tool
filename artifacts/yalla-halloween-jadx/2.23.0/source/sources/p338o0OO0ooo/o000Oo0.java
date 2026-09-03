package p338o0OO0ooo;

import com.squareup.okhttp.OooO0O0;
import com.squareup.okhttp.OooOOO0;
import com.squareup.okhttp.o000oOoO;
import com.squareup.okhttp.o00Ooo;
import com.squareup.okhttp.o0OoOo0;
import com.squareup.okhttp.oo000o;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
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
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import p336o0OO0oo0.OooOo;

/* JADX INFO: loaded from: classes4.dex */
public final class o000Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f43555OooO00o = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String f43556OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final String f43557OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final String f43558OooO0Oo;

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
        OooOo.f43307OooO00o.getClass();
        f43556OooO0O0 = "OkHttp-Sent-Millis";
        f43557OooO0OO = "OkHttp-Received-Millis";
        f43558OooO0Oo = "OkHttp-Selected-Protocol";
    }

    public static long OooO00o(o000oOoO o000oooo2) {
        String strOooO00o = o000oooo2.OooO00o("Content-Length");
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

    public static o00Ooo OooO0OO(OooO0O0 oooO0O0, oo000o oo000oVar, Proxy proxy) throws IOException {
        int i = oo000oVar.f21653OooO0OO;
        int i2 = 0;
        o00Ooo o00ooo2 = oo000oVar.f21651OooO00o;
        if (i == 407) {
            ((o0000) oooO0O0).getClass();
            List<OooOOO0> listOooO0O0 = oo000oVar.OooO0O0();
            o0OoOo0 o0oooo0 = o00ooo2.f21620OooO00o;
            int size = listOooO0O0.size();
            while (i2 < size) {
                OooOOO0 oooOOO0 = listOooO0O0.get(i2);
                if ("Basic".equalsIgnoreCase(oooOOO0.f21565OooO00o)) {
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) proxy.address();
                    try {
                        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(inetSocketAddress.getHostName(), proxy.type() != Proxy.Type.DIRECT ? ((InetSocketAddress) proxy.address()).getAddress() : InetAddress.getByName(o0oooo0.f21634OooO0Oo), inetSocketAddress.getPort(), o0oooo0.f21631OooO00o, oooOOO0.f21566OooO0O0, oooOOO0.f21565OooO00o, new URL(o0oooo0.f21638OooO0oo), Authenticator.RequestorType.PROXY);
                        if (passwordAuthenticationRequestPasswordAuthentication != null) {
                            String strOooO00o = com.squareup.okhttp.OooOo.OooO00o(passwordAuthenticationRequestPasswordAuthentication.getUserName(), new String(passwordAuthenticationRequestPasswordAuthentication.getPassword()));
                            o00Ooo.OooO00o oooO00o = new o00Ooo.OooO00o(o00ooo2);
                            oooO00o.f21628OooO0OO.OooO0o("Proxy-Authorization", strOooO00o);
                            return oooO00o.OooO00o();
                        }
                    } catch (MalformedURLException e) {
                        throw new RuntimeException(e);
                    }
                }
                i2++;
            }
        } else {
            ((o0000) oooO0O0).getClass();
            List<OooOOO0> listOooO0O1 = oo000oVar.OooO0O0();
            o0OoOo0 o0oooo1 = o00ooo2.f21620OooO00o;
            int size2 = listOooO0O1.size();
            while (i2 < size2) {
                OooOOO0 oooOOO1 = listOooO0O1.get(i2);
                if ("Basic".equalsIgnoreCase(oooOOO1.f21565OooO00o)) {
                    try {
                        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication2 = Authenticator.requestPasswordAuthentication(o0oooo1.f21634OooO0Oo, (proxy == null || proxy.type() == Proxy.Type.DIRECT) ? InetAddress.getByName(o0oooo1.f21634OooO0Oo) : ((InetSocketAddress) proxy.address()).getAddress(), o0oooo1.f21636OooO0o0, o0oooo1.f21631OooO00o, oooOOO1.f21566OooO0O0, oooOOO1.f21565OooO00o, new URL(o0oooo1.f21638OooO0oo), Authenticator.RequestorType.SERVER);
                        if (passwordAuthenticationRequestPasswordAuthentication2 != null) {
                            String strOooO00o2 = com.squareup.okhttp.OooOo.OooO00o(passwordAuthenticationRequestPasswordAuthentication2.getUserName(), new String(passwordAuthenticationRequestPasswordAuthentication2.getPassword()));
                            o00Ooo.OooO00o oooO00o2 = new o00Ooo.OooO00o(o00ooo2);
                            oooO00o2.f21628OooO0OO.OooO0o("Authorization", strOooO00o2);
                            return oooO00o2.OooO00o();
                        }
                    } catch (MalformedURLException e2) {
                        throw new RuntimeException(e2);
                    }
                }
                i2++;
            }
        }
        return null;
    }

    public static Map OooO0Oo(o000oOoO o000oooo2) {
        TreeMap treeMap = new TreeMap(f43555OooO00o);
        int length = o000oooo2.f21591OooO00o.length / 2;
        for (int i = 0; i < length; i++) {
            String strOooO0O0 = o000oooo2.OooO0O0(i);
            String strOooO0Oo = o000oooo2.OooO0Oo(i);
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

    public static Set<String> OooO0o0(o000oOoO o000oooo2) {
        Set<String> setEmptySet = Collections.emptySet();
        int length = o000oooo2.f21591OooO00o.length / 2;
        for (int i = 0; i < length; i++) {
            if ("Vary".equalsIgnoreCase(o000oooo2.OooO0O0(i))) {
                String strOooO0Oo = o000oooo2.OooO0Oo(i);
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
