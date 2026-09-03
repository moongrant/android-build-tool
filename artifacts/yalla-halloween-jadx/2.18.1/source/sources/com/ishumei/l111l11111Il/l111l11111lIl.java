package com.ishumei.l111l11111Il;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import java.io.ByteArrayInputStream;
import java.io.RandomAccessFile;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.UByte;

/* JADX INFO: loaded from: classes2.dex */
public final class l111l11111lIl {
    private static final String l1111l111111Il = com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9a878f");
    private static final String l111l11111lIl = com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9e8f94ac969891b79e8c97bc909b9a");
    private static final String l111l11111I1l = com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9e8f94af9e8b97");
    private static final String l111l11111Il = com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("8c969891969198b6919990");

    public static class l1111l111111Il {
        private List<String> l111l11111I1l;
        private Map<String, Object> l111l11111Il;
        private String l111l1111l1Il;
        private int l1111l111111Il = 0;
        private int l111l11111lIl = 0;
    }

    public static int l1111l111111Il() {
        Context context = com.ishumei.l1111l111111Il.l111l1111llIl.l1111l111111Il.l111l11111Il;
        if (context == null) {
            return 0;
        }
        return context.getApplicationInfo().targetSdkVersion;
    }

    public static String l1111l111111Il(Object obj) {
        if (obj == null) {
            return "";
        }
        try {
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream((byte[]) com.ishumei.l111l1111llIl.l111l1111l1Il.l1111l111111Il(obj, com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("8b90bd868b9abe8d8d9e86"))))).getSubjectDN().toString();
        } catch (Exception unused) {
            return "";
        }
    }

    private static void l1111l111111Il(Map<String, Object> map) {
        Context context = com.ishumei.l1111l111111Il.l111l1111llIl.l1111l111111Il.l111l11111Il;
        if (context == null) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                Signature[] apkContentsSigners = context.getPackageManager().getPackageInfo(context.getPackageName(), 134217728).signingInfo.getApkContentsSigners();
                ArrayList arrayList = new ArrayList();
                for (Signature signature : apkContentsSigners) {
                    arrayList.add(Integer.valueOf(signature.hashCode()));
                }
                map.put(l111l11111Il, arrayList);
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void l1111l111111Il(Map<String, Object> map, String str) {
        if (TextUtils.isEmpty(str)) {
            map.put(l1111l111111Il, com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9e8f94af9e8b97df968cdf918a9393"));
            return;
        }
        map.put(l111l11111I1l, str);
        if (!str.startsWith(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("d09b9e8b9ed09e8f8fd0") + l111l11111I1l())) {
            map.put(l1111l111111Il, com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9e8f94af9e8b97df968cdf91908bdf8c8b9e8d8bdf88968b97dfd8d09b9e8b9ed09e8f8fd0") + l111l11111I1l() + "'");
        }
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
            try {
                map.put(l111l11111lIl, Integer.valueOf(new Signature(com.ishumei.l111l11111Il.l111l11111lIl.l1111l111111Il.l1111l111111Il(randomAccessFile2, com.ishumei.l111l11111Il.l111l11111lIl.l1111l111111Il.l1111l111111Il(randomAccessFile2)).l1111l111111Il[0][0].getEncoded()).hashCode()));
                try {
                    randomAccessFile2.close();
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
                try {
                    map.put(l1111l111111Il, th.getMessage());
                } finally {
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static Object[] l1111l111111Il(String str) {
        Object[] objArr;
        Context context = com.ishumei.l1111l111111Il.l111l1111llIl.l1111l111111Il.l111l11111Il;
        if (context == null) {
            return null;
        }
        try {
            Object objL1111l111111Il = com.ishumei.l111l1111llIl.l111l1111l1Il.l1111l111111Il(context.getPackageManager(), com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("989a8baf9e9c949e989ab6919990"), new Class[]{String.class, Integer.TYPE}, new Object[]{str, 64});
            if (objL1111l111111Il == null || (objArr = (Object[]) com.ishumei.l111l1111llIl.l111l1111l1Il.l111l11111lIl(objL1111l111111Il, com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("8c9698919e8b8a8d9a8c"))) == null || objArr.length <= 0) {
                return null;
            }
            return objArr;
        } catch (Throwable unused) {
        }
    }

    public static String l111l11111I1l() {
        Context context = com.ishumei.l1111l111111Il.l111l1111llIl.l1111l111111Il.l111l11111Il;
        if (context == null) {
            return "";
        }
        try {
            return (String) com.ishumei.l111l1111llIl.l111l1111l1Il.l1111l111111Il(context, com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("989a8baf9e9c949e989ab19e929a"));
        } catch (Exception unused) {
            return "";
        }
    }

    public static Object l111l11111Il() {
        Object[] objArrL1111l111111Il;
        Context context = com.ishumei.l1111l111111Il.l111l1111llIl.l1111l111111Il.l111l11111Il;
        if (context == null || (objArrL1111l111111Il = l1111l111111Il(context.getPackageName())) == null || objArrL1111l111111Il.length <= 0) {
            return null;
        }
        return objArrL1111l111111Il[0];
    }

    public static String l111l11111lIl() {
        Context context = com.ishumei.l1111l111111Il.l111l1111llIl.l1111l111111Il.l111l11111Il;
        if (context == null) {
            return "";
        }
        try {
            String str = context.getPackageManager().getPackageInfo(l111l11111I1l(), 0).versionName;
            return str == null ? "" : str;
        } catch (Exception unused) {
            return "";
        }
    }

    private static String l111l11111lIl(Object obj) {
        if (obj == null) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            Object objL1111l111111Il = com.ishumei.l111l1111llIl.l111l1111l1Il.l1111l111111Il(obj, com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("8b90bd868b9abe8d8d9e86"));
            Object objL1111l111111Il2 = com.ishumei.l111l1111llIl.l111l1111l1Il.l1111l111111Il(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("959e899ed18c9a9c8a8d968b86d1b29a8c8c9e989abb96989a8c8b"), com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("989a8bb6918c8b9e919c9a"), new Class[]{String.class}, (Object[]) new String[]{com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("b2bbca")});
            com.ishumei.l111l1111llIl.l111l1111l1Il.l1111l111111Il(objL1111l111111Il2, com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("8d9a8c9a8b"));
            com.ishumei.l111l1111llIl.l111l1111l1Il.l1111l111111Il(objL1111l111111Il2, com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("8a8f9b9e8b9a"), new Class[]{byte[].class}, new Object[]{objL1111l111111Il});
            for (byte b : (byte[]) com.ishumei.l111l1111llIl.l111l1111l1Il.l1111l111111Il(objL1111l111111Il2, com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9b96989a8c8b"))) {
                int i = b & UByte.MAX_VALUE;
                if (Integer.toHexString(i).length() == 1) {
                    sb.append(AppEventsConstants.EVENT_PARAM_VALUE_NO);
                }
                sb.append(Integer.toHexString(i));
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    private static String l111l11111lIl(String str) {
        return com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il(str);
    }

    public static Map<String, Object> l111l1111l1Il() {
        HashMap map = new HashMap();
        Context context = com.ishumei.l1111l111111Il.l111l1111llIl.l1111l111111Il.l111l11111Il;
        if (context == null) {
            map.put(l1111l111111Il, com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9c8b87df968cdf918a9393"));
            return map;
        }
        String str = context.getApplicationInfo().sourceDir;
        if (TextUtils.isEmpty(str)) {
            map.put(l1111l111111Il, com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9e8f94af9e8b97df968cdf918a9393"));
        } else {
            map.put(l111l11111I1l, str);
            if (!str.startsWith(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("d09b9e8b9ed09e8f8fd0") + l111l11111I1l())) {
                map.put(l1111l111111Il, com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9e8f94af9e8b97df968cdf91908bdf8c8b9e8d8bdf88968b97dfd8d09b9e8b9ed09e8f8fd0") + l111l11111I1l() + "'");
            }
            RandomAccessFile randomAccessFile = null;
            try {
                try {
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
                    try {
                        map.put(l111l11111lIl, Integer.valueOf(new Signature(com.ishumei.l111l11111Il.l111l11111lIl.l1111l111111Il.l1111l111111Il(randomAccessFile2, com.ishumei.l111l11111Il.l111l11111lIl.l1111l111111Il.l1111l111111Il(randomAccessFile2)).l1111l111111Il[0][0].getEncoded()).hashCode()));
                        randomAccessFile2.close();
                    } catch (Throwable th) {
                        th = th;
                        randomAccessFile = randomAccessFile2;
                        try {
                            map.put(l1111l111111Il, th.getMessage());
                            if (randomAccessFile != null) {
                                randomAccessFile.close();
                            }
                            l1111l111111Il((Map<String, Object>) map);
                            return map;
                        } catch (Throwable th2) {
                            if (randomAccessFile != null) {
                                try {
                                    randomAccessFile.close();
                                } catch (Exception unused) {
                                }
                            }
                            throw th2;
                        }
                    }
                } catch (Exception unused2) {
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        l1111l111111Il((Map<String, Object>) map);
        return map;
    }

    public static int l111l1111llIl() {
        return (com.ishumei.l1111l111111Il.l111l1111llIl.l1111l111111Il.l111l11111Il.getApplicationInfo().flags & 2) > 0 ? 1 : 0;
    }
}
