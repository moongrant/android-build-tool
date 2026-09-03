package com.ishumei.l111l11111Il;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.text.format.Formatter;
import com.facebook.internal.security.CertificateUtil;
import java.io.File;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class l111l1111lIl {
    private static final int l111l11111I1l = -1;
    private static final int l111l11111Il = -101;
    private Context l1111l111111Il;
    private Object l111l11111lIl;

    public l111l1111lIl() {
        Object objL1111l111111Il;
        this.l111l11111lIl = null;
        try {
            Context context = com.ishumei.l1111l111111Il.l111l1111llIl.l1111l111111Il.l111l11111Il;
            this.l1111l111111Il = context;
            if (context == null || (objL1111l111111Il = com.ishumei.l111l1111llIl.l111l1111l1Il.l1111l111111Il(context, com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("989a8bac868c8b9a92ac9a8d89969c9a"), new Class[]{String.class}, new Object[]{com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("88969996")})) == null) {
                return;
            }
            this.l111l11111lIl = com.ishumei.l111l1111llIl.l111l1111l1Il.l1111l111111Il(objL1111l111111Il, com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("989a8bbc9091919a9c8b969091b6919990"));
        } catch (Exception unused) {
        }
    }

    private static String l1111l111111Il(int i) {
        if (i == -101) {
            return "wifi";
        }
        switch (i) {
            case -1:
                return "nil";
            case 0:
                return "unknown";
            case 1:
                return "2g.gprs";
            case 2:
                return "2g.edge";
            case 3:
                return "3g.umts";
            case 4:
                return "2g.cdma";
            case 5:
                return "3g.evdo_0";
            case 6:
                return "3g.evdo_a";
            case 7:
                return "2g.1xrtt";
            case 8:
                return "3g.hsdpa";
            case 9:
                return "3g.hsupa";
            case 10:
                return "3g.hspa";
            case 11:
                return "2g.iden";
            case 12:
                return "3g.evdo_b";
            case 13:
                return "4g.lte";
            case 14:
                return "3g.ehrpd";
            case 15:
                return "3g.hspap";
            default:
                return String.format("%d", Integer.valueOf(i));
        }
    }

    private static String l1111l111111Il(String str) {
        if (str == null) {
            return "";
        }
        try {
            String hostAddress = InetAddress.getByName(str).getHostAddress();
            return hostAddress == null ? "" : hostAddress;
        } catch (Exception unused) {
            return "";
        }
    }

    public static List<String> l111l1111l1Il() {
        ArrayList arrayList = new ArrayList();
        try {
            Object objL1111l111111Il = com.ishumei.l111l1111llIl.l111l1111l1Il.l1111l111111Il(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("959e899ed1919a8bd1b19a8b88908d94b6918b9a8d999e9c9a"), com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("989a8bb19a8b88908d94b6918b9a8d999e9c9a8c"));
            Method declaredMethod = Enumeration.class.getDeclaredMethod(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("979e8cb2908d9aba939a929a918b8c"), new Class[0]);
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = Enumeration.class.getDeclaredMethod(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("919a878bba939a929a918b"), new Class[0]);
            declaredMethod2.setAccessible(true);
            while (((Boolean) declaredMethod.invoke(objL1111l111111Il, new Object[0])).booleanValue()) {
                NetworkInterface networkInterface = (NetworkInterface) declaredMethod2.invoke(objL1111l111111Il, new Object[0]);
                String displayName = networkInterface.getDisplayName();
                if (displayName.startsWith("wlan0") || displayName.startsWith("eth0")) {
                    if (!networkInterface.isLoopback()) {
                        byte[] hardwareAddress = networkInterface.getHardwareAddress();
                        String str = "";
                        String strL111l11111lIl = (hardwareAddress == null || hardwareAddress.length <= 0) ? "" : com.ishumei.l111l1111llIl.l111l1111lIl.l111l11111lIl(com.ishumei.l111l1111llIl.l111l1111lIl.l1111l111111Il(hardwareAddress));
                        if (!strL111l11111lIl.isEmpty() && !strL111l11111lIl.equals("000000000000")) {
                            Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
                            String str2 = "";
                            while (inetAddresses.hasMoreElements()) {
                                InetAddress inetAddressNextElement = inetAddresses.nextElement();
                                if (!inetAddressNextElement.isLoopbackAddress()) {
                                    String hostAddress = inetAddressNextElement.getHostAddress();
                                    if (hostAddress.trim().length() < 17) {
                                        str = hostAddress;
                                    } else {
                                        str2 = hostAddress;
                                    }
                                }
                            }
                            arrayList.add(displayName + "," + str + "," + strL111l11111lIl + "," + str2);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public static boolean l111l1111lI1l() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) com.ishumei.l1111l111111Il.l111l1111llIl.l1111l111111Il.l111l11111Il.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    private static String l111l1111lIl() {
        try {
            try {
                Object objInvoke = Class.forName(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9e919b8d90969bd19d938a9a8b90908b97d1bd938a9a8b90908b97be9b9e8f8b9a8d")).getDeclaredMethod(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("989a8bbb9a999e8a938bbe9b9e8f8b9a8d"), new Class[0]).invoke(null, new Object[0]);
                return com.ishumei.l111l1111llIl.l111l1111lIl.l111l11111lIl((String) objInvoke.getClass().getDeclaredMethod(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("989a8bbe9b9b8d9a8c8c"), new Class[0]).invoke(objInvoke, new Object[0]));
            } catch (Exception unused) {
                return null;
            }
        } catch (Throwable unused2) {
            return com.ishumei.l111l1111llIl.l111l1111lIl.l111l11111lIl(com.ishumei.l111l1111llIl.l111l1111lIl.l1111l111111Il(new File(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("d09a998cd09d938a9a8b90908b97d09d8ba09e9b9b8d"))));
        }
    }

    public static String l111l1111llIl() {
        try {
            String property = System.getProperty("http.proxyHost");
            String property2 = System.getProperty("http.proxyPort");
            if (TextUtils.isEmpty(property2)) {
                property2 = "-1";
            }
            if (TextUtils.isEmpty(property)) {
                return "";
            }
            return property + CertificateUtil.DELIMITER + property2;
        } catch (Exception unused) {
            return "";
        }
    }

    private static boolean l11l1111I11l() {
        Context context = com.ishumei.l1111l111111Il.l111l1111llIl.l1111l111111Il.l111l11111Il;
        if (context == null) {
            return false;
        }
        return Build.VERSION.SDK_INT < 23 || context.checkSelfPermission("android.permission.ACCESS_WIFI_STATE") == 0;
    }

    private String l11l1111lIIl() {
        int networkType;
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.l1111l111111Il.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type == 1) {
                    networkType = -101;
                } else {
                    networkType = type == 0 ? ((TelephonyManager) this.l1111l111111Il.getSystemService("phone")).getNetworkType() : 0;
                }
            } else {
                networkType = -1;
            }
        } catch (Exception unused) {
        }
        if (networkType == -101) {
            return "wifi";
        }
        switch (networkType) {
            case -1:
                return "nil";
            case 0:
                return "unknown";
            case 1:
                return "2g.gprs";
            case 2:
                return "2g.edge";
            case 3:
                return "3g.umts";
            case 4:
                return "2g.cdma";
            case 5:
                return "3g.evdo_0";
            case 6:
                return "3g.evdo_a";
            case 7:
                return "2g.1xrtt";
            case 8:
                return "3g.hsdpa";
            case 9:
                return "3g.hsupa";
            case 10:
                return "3g.hspa";
            case 11:
                return "2g.iden";
            case 12:
                return "3g.evdo_b";
            case 13:
                return "4g.lte";
            case 14:
                return "3g.ehrpd";
            case 15:
                return "3g.hspap";
            default:
                return String.format("%d", Integer.valueOf(networkType));
        }
    }

    public final String l1111l111111Il() {
        Object obj;
        String str;
        try {
            return (!l11l1111I11l() || (obj = this.l111l11111lIl) == null || (str = (String) com.ishumei.l111l1111llIl.l111l1111l1Il.l1111l111111Il(obj, com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("989a8bacacb6bb"))) == null) ? "" : str;
        } catch (Exception unused) {
            return "";
        }
    }

    public final String l111l11111I1l() {
        String ipAddress;
        try {
            Object obj = this.l111l11111lIl;
            return (obj == null || (ipAddress = Formatter.formatIpAddress(((Integer) com.ishumei.l111l1111llIl.l111l1111l1Il.l1111l111111Il(obj, com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("989a8bb68fbe9b9b8d9a8c8c"))).intValue())) == null) ? "" : ipAddress;
        } catch (Exception unused) {
            return "";
        }
    }

    public final String l111l11111Il() {
        String strL11l1111lIIl;
        try {
            return (this.l1111l111111Il == null || (strL11l1111lIIl = l11l1111lIIl()) == null) ? "" : strL11l1111lIIl;
        } catch (Exception unused) {
            return "";
        }
    }

    public final String l111l11111lIl() {
        Object obj;
        String str;
        try {
            return (!l11l1111I11l() || (obj = this.l111l11111lIl) == null || (str = (String) com.ishumei.l111l1111llIl.l111l1111l1Il.l1111l111111Il(obj, com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("989a8bbdacacb6bb"))) == null) ? "" : str;
        } catch (Exception unused) {
            return "";
        }
    }
}
