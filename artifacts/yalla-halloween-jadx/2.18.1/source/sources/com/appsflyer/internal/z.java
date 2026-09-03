package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.oaid.OaidClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class z {
    public static String valueOf;

    @Nullable
    public static Boolean values;
    public final boolean AFInAppEventParameterName;

    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    @Nullable
    public static b.e.a AFInAppEventParameterName(Context context) {
        Boolean lat;
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        String str = valueOf;
        boolean z = str != null;
        if (z) {
            lat = null;
        } else {
            Boolean bool = values;
            if ((bool == null || !bool.booleanValue()) && !(values == null && appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_OAID, true))) {
                lat = null;
                str = null;
            } else {
                try {
                    OaidClient oaidClient = new OaidClient(context);
                    oaidClient.setLogging(appsFlyerProperties.isEnableLog());
                    OaidClient.Info infoFetch = oaidClient.fetch();
                    if (infoFetch != null) {
                        String id = infoFetch.getId();
                        try {
                            lat = infoFetch.getLat();
                            str = id;
                        } catch (Throwable unused) {
                            str = id;
                            AFLogger.valueOf("No OAID library");
                            lat = null;
                        }
                    } else {
                        lat = null;
                        str = null;
                    }
                } catch (Throwable unused2) {
                    str = null;
                }
            }
        }
        if (str == null) {
            return null;
        }
        b.e.a aVar = new b.e.a(str, lat);
        aVar.AFInAppEventParameterName = Boolean.valueOf(z);
        return aVar;
    }

    @Nullable
    public static b.e.a AFKeystoreWrapper(ContentResolver contentResolver) {
        String string;
        if (!AFInAppEventParameterName() || contentResolver == null || AppsFlyerProperties.getInstance().getString("amazon_aid") != null || !"Amazon".equals(Build.MANUFACTURER)) {
            return null;
        }
        int i = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 2);
        if (i == 0) {
            return new b.e.a(Settings.Secure.getString(contentResolver, "advertising_id"), Boolean.FALSE);
        }
        if (i == 2) {
            return null;
        }
        try {
            string = Settings.Secure.getString(contentResolver, "advertising_id");
        } catch (Throwable th) {
            AFLogger.AFKeystoreWrapper("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th);
            string = "";
        }
        return new b.e.a(string, Boolean.TRUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && z.class == obj.getClass() && this.AFInAppEventParameterName == ((z) obj).AFInAppEventParameterName;
    }

    public final int hashCode() {
        return (this.AFInAppEventParameterName ? 1 : 0) + 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArsFeatureParams{additionalParameters=");
        sb.append((Object) null);
        sb.append(", success=");
        sb.append((Object) null);
        sb.append(", failure=");
        sb.append((Object) null);
        sb.append(", sandbox=");
        sb.append(this.AFInAppEventParameterName);
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003b A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #2 {all -> 0x0043, blocks: (B:13:0x0035, B:15:0x003b), top: B:57:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x009b A[Catch: all -> 0x00a1, TRY_LEAVE, TryCatch #1 {all -> 0x00a1, blocks: (B:28:0x0085, B:30:0x0095, B:32:0x009b), top: B:55:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:46:0x011f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Nullable
    public static b.e.a AFKeystoreWrapper(Context context, Map<String, Object> map) {
        String string;
        Throwable th;
        Boolean boolValueOf;
        boolean z;
        Boolean boolValueOf2;
        boolean z2;
        if (!AFInAppEventParameterName()) {
            return null;
        }
        AFLogger.AFInAppEventType("Trying to fetch GAID..");
        StringBuilder sb = new StringBuilder();
        int iIsGooglePlayServicesAvailable = -1;
        try {
            iIsGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        } catch (Throwable unused) {
        }
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            if (advertisingIdInfo != null) {
                string = advertisingIdInfo.getId();
                try {
                    boolValueOf2 = Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled());
                    if (string != null) {
                        try {
                            if (string.length() == 0) {
                                sb.append("emptyOrNull |");
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            boolValueOf = boolValueOf2;
                            z = true;
                            AFLogger.AFKeystoreWrapper(th.getMessage(), th);
                            sb.append(th.getClass().getSimpleName());
                            sb.append(" |");
                            AFLogger.AFInAppEventType("WARNING: Google Play Services is missing.");
                            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.ENABLE_GPS_FALLBACK, true)) {
                                try {
                                    ac.a aVarAFInAppEventParameterName = ac.AFInAppEventParameterName(context);
                                    string = aVarAFInAppEventParameterName.AFInAppEventType;
                                    boolValueOf = Boolean.valueOf(aVarAFInAppEventParameterName.values());
                                    if (string != null || string.length() == 0) {
                                        sb.append("emptyOrNull (bypass) |");
                                    }
                                } catch (Throwable th3) {
                                    AFLogger.AFKeystoreWrapper(th3.getMessage(), th3);
                                    sb.append(th3.getClass().getSimpleName());
                                    sb.append(" |");
                                    string = AppsFlyerProperties.getInstance().getString("advertiserId");
                                    Boolean boolValueOf3 = Boolean.valueOf(!Boolean.parseBoolean(AppsFlyerProperties.getInstance().getString("advertiserIdEnabled")));
                                    if (th3.getLocalizedMessage() != null) {
                                        AFLogger.AFInAppEventType(th3.getLocalizedMessage());
                                    } else {
                                        AFLogger.AFInAppEventType(th3.toString());
                                    }
                                    boolean z3 = z;
                                    boolValueOf2 = boolValueOf3;
                                    z2 = z3;
                                }
                            }
                            z2 = z;
                            boolValueOf2 = boolValueOf;
                        }
                    } else {
                        sb.append("emptyOrNull |");
                    }
                    z2 = true;
                } catch (Throwable th4) {
                    th = th4;
                    boolValueOf = null;
                    z = false;
                    AFLogger.AFKeystoreWrapper(th.getMessage(), th);
                    sb.append(th.getClass().getSimpleName());
                    sb.append(" |");
                    AFLogger.AFInAppEventType("WARNING: Google Play Services is missing.");
                    if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.ENABLE_GPS_FALLBACK, true)) {
                        ac.a aVarAFInAppEventParameterName2 = ac.AFInAppEventParameterName(context);
                        string = aVarAFInAppEventParameterName2.AFInAppEventType;
                        boolValueOf = Boolean.valueOf(aVarAFInAppEventParameterName2.values());
                        if (string != null) {
                            sb.append("emptyOrNull (bypass) |");
                        } else {
                            sb.append("emptyOrNull (bypass) |");
                        }
                    }
                    z2 = z;
                    boolValueOf2 = boolValueOf;
                    if (context.getClass().getName().equals("android.app.ReceiverRestrictedContext")) {
                        string = AppsFlyerProperties.getInstance().getString("advertiserId");
                        boolValueOf2 = Boolean.valueOf(!Boolean.parseBoolean(AppsFlyerProperties.getInstance().getString("advertiserIdEnabled")));
                        sb.append("context = android.app.ReceiverRestrictedContext |");
                    }
                    if (sb.length() > 0) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(iIsGooglePlayServicesAvailable);
                        sb2.append(": ");
                        sb2.append((Object) sb);
                        map.put("gaidError", sb2.toString());
                    }
                    if (string != null) {
                        map.put("advertiserId", string);
                        map.put("advertiserIdEnabled", String.valueOf(!boolValueOf2.booleanValue()));
                        AppsFlyerProperties.getInstance().set("advertiserId", string);
                        AppsFlyerProperties.getInstance().set("advertiserIdEnabled", String.valueOf(!boolValueOf2.booleanValue()));
                        map.put("isGaidWithGps", String.valueOf(z2));
                    }
                    return new b.e.a(string, boolValueOf2);
                }
                if (context.getClass().getName().equals("android.app.ReceiverRestrictedContext")) {
                    string = AppsFlyerProperties.getInstance().getString("advertiserId");
                    boolValueOf2 = Boolean.valueOf(!Boolean.parseBoolean(AppsFlyerProperties.getInstance().getString("advertiserIdEnabled")));
                    sb.append("context = android.app.ReceiverRestrictedContext |");
                }
                if (sb.length() > 0) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(iIsGooglePlayServicesAvailable);
                    sb3.append(": ");
                    sb3.append((Object) sb);
                    map.put("gaidError", sb3.toString());
                }
                if (string != null && boolValueOf2 != null) {
                    map.put("advertiserId", string);
                    map.put("advertiserIdEnabled", String.valueOf(!boolValueOf2.booleanValue()));
                    AppsFlyerProperties.getInstance().set("advertiserId", string);
                    AppsFlyerProperties.getInstance().set("advertiserIdEnabled", String.valueOf(!boolValueOf2.booleanValue()));
                    map.put("isGaidWithGps", String.valueOf(z2));
                }
                return new b.e.a(string, boolValueOf2);
            }
            sb.append("gpsAdInfo-null |");
            throw new IllegalStateException("GpsAdIndo is null");
        } catch (Throwable th5) {
            string = null;
            th = th5;
            boolValueOf = null;
        }
    }

    private static boolean AFInAppEventParameterName() {
        Boolean bool = values;
        return bool == null || bool.booleanValue();
    }
}
