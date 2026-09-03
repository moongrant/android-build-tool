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

/* JADX INFO: loaded from: classes2.dex */
public final class z {
    static String valueOf;

    @Nullable
    static Boolean values;
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
        StringBuilder sb = new StringBuilder("ArsFeatureParams{additionalParameters=null, success=null, failure=null, sandbox=");
        sb.append(this.AFInAppEventParameterName);
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003c A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #1 {all -> 0x0044, blocks: (B:15:0x0036, B:17:0x003c), top: B:57:0x0036 }] */
    @Nullable
    public static b.e.a AFKeystoreWrapper(Context context, Map<String, Object> map) {
        int iIsGooglePlayServicesAvailable;
        boolean z;
        Boolean bool;
        String string;
        Boolean boolValueOf;
        boolean z2;
        String str = null;
        if (!AFInAppEventParameterName()) {
            return null;
        }
        AFLogger.AFInAppEventType("Trying to fetch GAID..");
        StringBuilder sb = new StringBuilder();
        try {
            iIsGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        } catch (Throwable unused) {
            iIsGooglePlayServicesAvailable = -1;
        }
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            if (advertisingIdInfo != null) {
                String string2 = advertisingIdInfo.getId();
                try {
                    boolValueOf = Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled());
                    if (string2 != null) {
                        try {
                            if (string2.length() == 0) {
                                sb.append("emptyOrNull |");
                            }
                        } catch (Throwable th) {
                            th = th;
                            bool = boolValueOf;
                            str = string2;
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
                                    if (string == null || string.length() == 0) {
                                        sb.append("emptyOrNull (bypass) |");
                                    }
                                } catch (Throwable th2) {
                                    AFLogger.AFKeystoreWrapper(th2.getMessage(), th2);
                                    sb.append(th2.getClass().getSimpleName());
                                    sb.append(" |");
                                    string = AppsFlyerProperties.getInstance().getString("advertiserId");
                                    Boolean boolValueOf2 = Boolean.valueOf(!Boolean.parseBoolean(AppsFlyerProperties.getInstance().getString("advertiserIdEnabled")));
                                    if (th2.getLocalizedMessage() != null) {
                                        AFLogger.AFInAppEventType(th2.getLocalizedMessage());
                                    } else {
                                        AFLogger.AFInAppEventType(th2.toString());
                                    }
                                    boolValueOf = boolValueOf2;
                                }
                                string2 = string;
                            } else {
                                string2 = str;
                                boolValueOf = bool;
                            }
                            z2 = z;
                        }
                    } else {
                        sb.append("emptyOrNull |");
                    }
                    z2 = true;
                } catch (Throwable th3) {
                    th = th3;
                    bool = null;
                    str = string2;
                    z = false;
                }
                if (context.getClass().getName().equals("android.app.ReceiverRestrictedContext")) {
                    string2 = AppsFlyerProperties.getInstance().getString("advertiserId");
                    boolValueOf = Boolean.valueOf(!Boolean.parseBoolean(AppsFlyerProperties.getInstance().getString("advertiserIdEnabled")));
                    sb.append("context = android.app.ReceiverRestrictedContext |");
                }
                if (sb.length() > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iIsGooglePlayServicesAvailable);
                    sb2.append(": ");
                    sb2.append((Object) sb);
                    map.put("gaidError", sb2.toString());
                }
                if (string2 != null && boolValueOf != null) {
                    map.put("advertiserId", string2);
                    map.put("advertiserIdEnabled", String.valueOf(!boolValueOf.booleanValue()));
                    AppsFlyerProperties.getInstance().set("advertiserId", string2);
                    AppsFlyerProperties.getInstance().set("advertiserIdEnabled", String.valueOf(!boolValueOf.booleanValue()));
                    map.put("isGaidWithGps", String.valueOf(z2));
                }
                return new b.e.a(string2, boolValueOf);
            }
            sb.append("gpsAdInfo-null |");
            throw new IllegalStateException("GpsAdIndo is null");
        } catch (Throwable th4) {
            th = th4;
            z = false;
            bool = null;
        }
    }

    private static boolean AFInAppEventParameterName() {
        Boolean bool = values;
        return bool == null || bool.booleanValue();
    }
}
