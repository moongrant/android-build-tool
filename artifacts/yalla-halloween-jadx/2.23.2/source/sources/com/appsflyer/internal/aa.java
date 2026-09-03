package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.billingclient.api.Purchase;
import com.appsflyer.AFLogger;
import com.qiniu.android.collect.ReportItem;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class aa {
    private final boolean AFInAppEventParameterName;

    @NonNull
    public final List<Purchase> AFInAppEventType;
    private final boolean valueOf;

    @Nullable
    public final Map<String, String> values;

    public aa() {
    }

    public aa(boolean z, boolean z2, List<Purchase> list, Map<String, String> map) {
        this.AFInAppEventParameterName = z;
        this.valueOf = z2;
        this.AFInAppEventType = list;
        this.values = null;
    }

    public static String AFInAppEventParameterName(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.AFKeystoreWrapper(e.getMessage(), e);
            return "";
        }
    }

    public static boolean valueOf() {
        return Build.BRAND.equals("OPPO");
    }

    public static boolean values(Context context, Intent intent) {
        return context.getPackageManager().queryIntentServices(intent, 0).size() > 0;
    }

    public final boolean AFInAppEventType() {
        return this.valueOf;
    }

    public final boolean AFKeystoreWrapper() {
        return this.AFInAppEventParameterName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aa.class == obj.getClass()) {
            aa aaVar = (aa) obj;
            if (this.AFInAppEventParameterName != aaVar.AFInAppEventParameterName || this.valueOf != aaVar.valueOf || !this.AFInAppEventType.equals(aaVar.AFInAppEventType)) {
                return false;
            }
            Map<String, String> map = this.values;
            Map<String, String> map2 = aaVar.values;
            if (map != null) {
                return map.equals(map2);
            }
            if (map2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.AFInAppEventType.hashCode() + ((((this.AFInAppEventParameterName ? 1 : 0) * 31) + (this.valueOf ? 1 : 0)) * 31)) * 31;
        Map<String, String> map = this.values;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArsValidateRequestData{isSandbox=");
        sb.append(this.AFInAppEventParameterName);
        sb.append(", isHistory=");
        sb.append(this.valueOf);
        sb.append(", subscriptions=");
        sb.append(this.AFInAppEventType);
        sb.append(", additionalParams=");
        sb.append(this.values);
        sb.append('}');
        return sb.toString();
    }

    public static String valueOf(PackageManager packageManager, String str) throws NoSuchAlgorithmException, PackageManager.NameNotFoundException, CertificateException {
        Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        if (signatureArr == null) {
            return null;
        }
        X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()));
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        messageDigest.update(x509Certificate.getEncoded());
        return String.format("%032X", new BigInteger(1, messageDigest.digest()));
    }

    public static boolean values(Context context, String str) {
        if (str == null) {
            throw new IllegalArgumentException("permission is null");
        }
        int iCheckPermission = context.checkPermission(str, Process.myPid(), Process.myUid());
        StringBuilder sb = new StringBuilder("is Permission Available: ");
        sb.append(str);
        sb.append("; res: ");
        sb.append(iCheckPermission);
        AFLogger.AFKeystoreWrapper(sb.toString());
        return iCheckPermission == 0;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    public static Map<String, String> values(Context context, Map<String, String> map, Uri uri) {
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (true) {
            byte b = 0;
            String str = "media_source";
            if (it.hasNext()) {
                String next = it.next();
                String queryParameter = uri.getQueryParameter(next);
                if (map.containsKey(next)) {
                    str = next;
                } else {
                    int iHashCode = next.hashCode();
                    if (iHashCode != -1420799080) {
                        if (iHashCode != 99) {
                            if (iHashCode == 110987 && next.equals("pid")) {
                                b = 1;
                            } else {
                                b = -1;
                            }
                        } else if (!next.equals("c")) {
                            b = -1;
                        }
                    } else if (next.equals("af_prt")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                    if (b == 0) {
                        str = "campaign";
                    } else if (b != 1) {
                        if (b != 2) {
                            str = next;
                        } else {
                            str = "agency";
                        }
                    }
                }
                map.put(str, queryParameter);
            } else {
                try {
                    break;
                } catch (Exception e) {
                    AFLogger.AFKeystoreWrapper("Could not fetch install time. ", e);
                }
            }
        }
        if (!map.containsKey("install_time")) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
            long j = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("install_time", simpleDateFormat.format(new Date(j)));
        }
        if (map.containsKey("af_deeplink") && !map.containsKey("af_status")) {
            map.put("af_status", "Non-organic");
        }
        if (map.containsKey("agency")) {
            map.remove("media_source");
        }
        String path = uri.getPath();
        if (path != null) {
            map.put("path", path);
        }
        String scheme = uri.getScheme();
        if (scheme != null) {
            map.put("scheme", scheme);
        }
        String host = uri.getHost();
        if (host != null) {
            map.put(ReportItem.RequestKeyHost, host);
        }
        return map;
    }

    public static long valueOf(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (Build.VERSION.SDK_INT >= 28) {
                return packageInfo.getLongVersionCode();
            }
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.AFKeystoreWrapper(e.getMessage(), e);
            return 0L;
        }
    }
}
