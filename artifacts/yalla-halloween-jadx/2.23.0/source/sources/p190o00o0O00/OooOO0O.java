package p190o00o0O00;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.appevents.UserDataStore;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.firebase.encoders.EncodingException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p022Oooo00O.o00O00OO;
import p189o00o0O0.OooO;
import p189o00o0O0.OooO0OO;
import p189o00o0O0.OooO0o;
import p189o00o0O0.OooOO0;
import p189o00o0O0.OooOo00;
import p191o00o0O0O.OooOo;
import p191o00o0O0O.o00O0O;
import p191o00o0O0O.o00Oo0;
import p193o00o0OO0.OooOOOO;
import p193o00o0OO0.o00oO0o;
import p195o00o0OOo.o000O0O0;
import p201o00o0o00.OooOOO0;
import p295o0O0OooO.o00O0;
import p295o0O0OooO.oo00o;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0O implements o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oo00o f38861OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ConnectivityManager f38862OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Context f38863OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final URL f38864OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooOOO0 f38865OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOOO0 f38866OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f38867OooO0oO;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final URL f38868OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final p189o00o0O0.OooOOO0 f38869OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public final String f38870OooO0OO;

        public OooO00o(URL url, p189o00o0O0.OooOOO0 oooOOO0, @Nullable String str) {
            this.f38868OooO00o = url;
            this.f38869OooO0O0 = oooOOO0;
            this.f38870OooO0OO = str;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f38871OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final URL f38872OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f38873OooO0OO;

        public OooO0O0(int i, @Nullable URL url, long j) {
            this.f38871OooO00o = i;
            this.f38872OooO0O0 = url;
            this.f38873OooO0OO = j;
        }
    }

    public OooOO0O(Context context, OooOOO0 oooOOO0, OooOOO0 oooOOO1) {
        o00O0 o00o1 = new o00O0();
        com.google.android.datatransport.cct.internal.OooO00o.f10830OooO00o.OooO00o(o00o1);
        o00o1.f42317OooO0Oo = true;
        this.f38861OooO00o = new oo00o(o00o1);
        this.f38863OooO0OO = context;
        this.f38862OooO0O0 = (ConnectivityManager) context.getSystemService("connectivity");
        String str = OooO.f38855OooO0OO;
        try {
            this.f38864OooO0Oo = new URL(str);
            this.f38866OooO0o0 = oooOOO1;
            this.f38865OooO0o = oooOOO0;
            this.f38867OooO0oO = 130000;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(o00O00OO.OooO00o("Invalid url: ", str), e);
        }
    }

    @Override // p193o00o0OO0.o00oO0o
    public final OooOo OooO00o(o00Oo0 o00oo1) {
        int subtype;
        NetworkInfo activeNetworkInfo = this.f38862OooO0O0.getActiveNetworkInfo();
        OooOo.OooO00o oooO00oOooO = o00oo1.OooO();
        int i = Build.VERSION.SDK_INT;
        Map<String, String> map = oooO00oOooO.f38902OooO0o;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put("sdk-version", String.valueOf(i));
        oooO00oOooO.OooO00o(DeviceRequestsHelper.DEVICE_INFO_MODEL, Build.MODEL);
        oooO00oOooO.OooO00o("hardware", Build.HARDWARE);
        oooO00oOooO.OooO00o(DeviceRequestsHelper.DEVICE_INFO_DEVICE, Build.DEVICE);
        oooO00oOooO.OooO00o("product", Build.PRODUCT);
        oooO00oOooO.OooO00o("os-uild", Build.ID);
        oooO00oOooO.OooO00o("manufacturer", Build.MANUFACTURER);
        oooO00oOooO.OooO00o("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        Map<String, String> map2 = oooO00oOooO.f38902OooO0o;
        if (map2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map2.put("tz-offset", String.valueOf(offset));
        int iOooO0O0 = activeNetworkInfo == null ? NetworkConnectionInfo.NetworkType.NONE.OooO0O0() : activeNetworkInfo.getType();
        Map<String, String> map3 = oooO00oOooO.f38902OooO0o;
        if (map3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map3.put("net-type", String.valueOf(iOooO0O0));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            subtype = NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.OooO0O0();
        } else {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                subtype = NetworkConnectionInfo.MobileSubtype.COMBINED.OooO0O0();
            } else if (NetworkConnectionInfo.MobileSubtype.OooO00o(subtype) == null) {
                subtype = 0;
            }
        }
        Map<String, String> map4 = oooO00oOooO.f38902OooO0o;
        if (map4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map4.put("mobile-subtype", String.valueOf(subtype));
        oooO00oOooO.OooO00o(UserDataStore.COUNTRY, Locale.getDefault().getCountry());
        oooO00oOooO.OooO00o("locale", Locale.getDefault().getLanguage());
        Context context = this.f38863OooO0OO;
        oooO00oOooO.OooO00o("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
        try {
            i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            o000O0O0.OooO0O0("CctTransportBackend", "Unable to find version code for package", e);
        }
        oooO00oOooO.OooO00o("application_build", Integer.toString(i2));
        return oooO00oOooO.OooO0O0();
    }

    /* JADX WARN: Code duplicated, block: B:170:0x0434 A[Catch: IOException -> 0x0483, TryCatch #13 {IOException -> 0x0483, blocks: (B:78:0x029d, B:81:0x02ab, B:85:0x02be, B:86:0x02cc, B:88:0x0312, B:95:0x0337, B:97:0x0349, B:98:0x0358, B:107:0x037b, B:168:0x0430, B:170:0x0434, B:173:0x0443, B:175:0x0448, B:177:0x044e, B:186:0x0465, B:188:0x046f, B:190:0x0479, B:108:0x0385, B:118:0x03b7, B:137:0x03d8, B:136:0x03d5, B:138:0x03d9, B:165:0x040f, B:167:0x0420, B:109:0x0389, B:111:0x0393, B:116:0x03b2, B:128:0x03ca, B:127:0x03c7, B:123:0x03c1, B:114:0x039a, B:132:0x03cf), top: B:212:0x029d, inners: #6, #12 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x0443 A[Catch: IOException -> 0x0483, TryCatch #13 {IOException -> 0x0483, blocks: (B:78:0x029d, B:81:0x02ab, B:85:0x02be, B:86:0x02cc, B:88:0x0312, B:95:0x0337, B:97:0x0349, B:98:0x0358, B:107:0x037b, B:168:0x0430, B:170:0x0434, B:173:0x0443, B:175:0x0448, B:177:0x044e, B:186:0x0465, B:188:0x046f, B:190:0x0479, B:108:0x0385, B:118:0x03b7, B:137:0x03d8, B:136:0x03d5, B:138:0x03d9, B:165:0x040f, B:167:0x0420, B:109:0x0389, B:111:0x0393, B:116:0x03b2, B:128:0x03ca, B:127:0x03c7, B:123:0x03c1, B:114:0x039a, B:132:0x03cf), top: B:212:0x029d, inners: #6, #12 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x044e A[Catch: IOException -> 0x0483, TryCatch #13 {IOException -> 0x0483, blocks: (B:78:0x029d, B:81:0x02ab, B:85:0x02be, B:86:0x02cc, B:88:0x0312, B:95:0x0337, B:97:0x0349, B:98:0x0358, B:107:0x037b, B:168:0x0430, B:170:0x0434, B:173:0x0443, B:175:0x0448, B:177:0x044e, B:186:0x0465, B:188:0x046f, B:190:0x0479, B:108:0x0385, B:118:0x03b7, B:137:0x03d8, B:136:0x03d5, B:138:0x03d9, B:165:0x040f, B:167:0x0420, B:109:0x0389, B:111:0x0393, B:116:0x03b2, B:128:0x03ca, B:127:0x03c7, B:123:0x03c1, B:114:0x039a, B:132:0x03cf), top: B:212:0x029d, inners: #6, #12 }] */
    /* JADX WARN: Code duplicated, block: B:179:0x0458  */
    /* JADX WARN: Code duplicated, block: B:181:0x045c  */
    /* JADX WARN: Code duplicated, block: B:186:0x0465 A[Catch: IOException -> 0x0483, TryCatch #13 {IOException -> 0x0483, blocks: (B:78:0x029d, B:81:0x02ab, B:85:0x02be, B:86:0x02cc, B:88:0x0312, B:95:0x0337, B:97:0x0349, B:98:0x0358, B:107:0x037b, B:168:0x0430, B:170:0x0434, B:173:0x0443, B:175:0x0448, B:177:0x044e, B:186:0x0465, B:188:0x046f, B:190:0x0479, B:108:0x0385, B:118:0x03b7, B:137:0x03d8, B:136:0x03d5, B:138:0x03d9, B:165:0x040f, B:167:0x0420, B:109:0x0389, B:111:0x0393, B:116:0x03b2, B:128:0x03ca, B:127:0x03c7, B:123:0x03c1, B:114:0x039a, B:132:0x03cf), top: B:212:0x029d, inners: #6, #12 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x046f A[Catch: IOException -> 0x0483, TryCatch #13 {IOException -> 0x0483, blocks: (B:78:0x029d, B:81:0x02ab, B:85:0x02be, B:86:0x02cc, B:88:0x0312, B:95:0x0337, B:97:0x0349, B:98:0x0358, B:107:0x037b, B:168:0x0430, B:170:0x0434, B:173:0x0443, B:175:0x0448, B:177:0x044e, B:186:0x0465, B:188:0x046f, B:190:0x0479, B:108:0x0385, B:118:0x03b7, B:137:0x03d8, B:136:0x03d5, B:138:0x03d9, B:165:0x040f, B:167:0x0420, B:109:0x0389, B:111:0x0393, B:116:0x03b2, B:128:0x03ca, B:127:0x03c7, B:123:0x03c1, B:114:0x039a, B:132:0x03cf), top: B:212:0x029d, inners: #6, #12 }] */
    /* JADX WARN: Code duplicated, block: B:234:0x0448 A[EDGE_INSN: B:234:0x0448->B:175:0x0448 BREAK  A[LOOP:3: B:80:0x02a9->B:236:?], SYNTHETIC] */
    @Override // p193o00o0OO0.o00oO0o
    public final com.google.android.datatransport.runtime.backends.OooO00o OooO0O0(OooOOOO oooOOOO) {
        String str;
        OooO0O0 oooO0O0;
        OooO00o oooO00o;
        URL url;
        int i;
        String str2;
        Integer numValueOf;
        OooO.OooO00o oooO00o2;
        HashMap map = new HashMap();
        for (o00Oo0 o00oo1 : oooOOOO.f38952OooO00o) {
            String strOooO0oO = o00oo1.OooO0oO();
            if (map.containsKey(strOooO0oO)) {
                ((List) map.get(strOooO0oO)).add(o00oo1);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(o00oo1);
                map.put(strOooO0oO, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            o00Oo0 o00oo2 = (o00Oo0) ((List) entry.getValue()).get(0);
            QosTier qosTier = QosTier.DEFAULT;
            Long lValueOf = Long.valueOf(this.f38865OooO0o.getTime());
            Long lValueOf2 = Long.valueOf(this.f38866OooO0o0.getTime());
            com.google.android.datatransport.cct.internal.OooO0O0 oooO0O1 = new com.google.android.datatransport.cct.internal.OooO0O0(ClientInfo.ClientType.ANDROID_FIREBASE, new OooO0OO(Integer.valueOf(o00oo2.OooO0o("sdk-version")), o00oo2.OooO00o(DeviceRequestsHelper.DEVICE_INFO_MODEL), o00oo2.OooO00o("hardware"), o00oo2.OooO00o(DeviceRequestsHelper.DEVICE_INFO_DEVICE), o00oo2.OooO00o("product"), o00oo2.OooO00o("os-uild"), o00oo2.OooO00o("manufacturer"), o00oo2.OooO00o("fingerprint"), o00oo2.OooO00o("locale"), o00oo2.OooO00o(UserDataStore.COUNTRY), o00oo2.OooO00o("mcc_mnc"), o00oo2.OooO00o("application_build")));
            try {
                numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                str2 = null;
            } catch (NumberFormatException unused) {
                str2 = (String) entry.getKey();
                numValueOf = null;
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = ((List) entry.getValue()).iterator();
            while (it2.hasNext()) {
                o00Oo0 o00oo3 = (o00Oo0) it2.next();
                o00O0O o00o0oOooO0Oo = o00oo3.OooO0Oo();
                Iterator it3 = it;
                p176o00o0.OooOo oooOo = o00o0oOooO0Oo.f38934OooO00o;
                Iterator it4 = it2;
                boolean zEquals = oooOo.equals(new p176o00o0.OooOo("proto"));
                byte[] bArr = o00o0oOooO0Oo.f38935OooO0O0;
                if (zEquals) {
                    oooO00o2 = new OooO.OooO00o();
                    oooO00o2.f38830OooO0Oo = bArr;
                } else {
                    if (oooOo.equals(new p176o00o0.OooOo("json"))) {
                        String str3 = new String(bArr, Charset.forName("UTF-8"));
                        OooO.OooO00o oooO00o3 = new OooO.OooO00o();
                        oooO00o3.f38832OooO0o0 = str3;
                        oooO00o2 = oooO00o3;
                    } else {
                        String strOooO0OO = o000O0O0.OooO0OO("CctTransportBackend");
                        if (Log.isLoggable(strOooO0OO, 5)) {
                            Log.w(strOooO0OO, String.format("Received event of unsupported encoding %s. Skipping...", oooOo));
                        }
                    }
                    it = it3;
                    it2 = it4;
                }
                oooO00o2.f38827OooO00o = Long.valueOf(o00oo3.OooO0o0());
                oooO00o2.f38829OooO0OO = Long.valueOf(o00oo3.OooO0oo());
                String str4 = o00oo3.OooO0O0().get("tz-offset");
                oooO00o2.f38831OooO0o = Long.valueOf(str4 == null ? 0L : Long.valueOf(str4).longValue());
                oooO00o2.f38833OooO0oO = new com.google.android.datatransport.cct.internal.OooO0OO(NetworkConnectionInfo.NetworkType.OooO00o(o00oo3.OooO0o("net-type")), NetworkConnectionInfo.MobileSubtype.OooO00o(o00oo3.OooO0o("mobile-subtype")));
                if (o00oo3.OooO0OO() != null) {
                    oooO00o2.f38828OooO0O0 = o00oo3.OooO0OO();
                }
                String strOooO00o = oooO00o2.f38827OooO00o == null ? " eventTimeMs" : "";
                if (oooO00o2.f38829OooO0OO == null) {
                    strOooO00o = strOooO00o.concat(" eventUptimeMs");
                }
                if (oooO00o2.f38831OooO0o == null) {
                    strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " timezoneOffsetSeconds");
                }
                if (!strOooO00o.isEmpty()) {
                    throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
                }
                arrayList3.add(new OooO(oooO00o2.f38827OooO00o.longValue(), oooO00o2.f38828OooO0O0, oooO00o2.f38829OooO0OO.longValue(), oooO00o2.f38830OooO0Oo, oooO00o2.f38832OooO0o0, oooO00o2.f38831OooO0o.longValue(), oooO00o2.f38833OooO0oO));
                it = it3;
                it2 = it4;
            }
            Iterator it5 = it;
            String strConcat = lValueOf == null ? " requestTimeMs" : "";
            if (lValueOf2 == null) {
                strConcat = strConcat.concat(" requestUptimeMs");
            }
            if (!strConcat.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(strConcat));
            }
            arrayList2.add(new OooOO0(lValueOf.longValue(), lValueOf2.longValue(), oooO0O1, numValueOf, str2, arrayList3, qosTier));
            it = it5;
        }
        OooO0o oooO0o = new OooO0o(arrayList2);
        byte[] bArr2 = oooOOOO.f38953OooO0O0;
        URL url2 = this.f38864OooO0Oo;
        if (bArr2 != null) {
            try {
                OooO oooOOooO00o = OooO.OooO00o(bArr2);
                str = oooOOooO00o.f38859OooO0O0;
                if (str == null) {
                    str = null;
                }
                String str5 = oooOOooO00o.f38858OooO00o;
                if (str5 != null) {
                    try {
                        url2 = new URL(str5);
                    } catch (MalformedURLException e) {
                        throw new IllegalArgumentException("Invalid url: " + str5, e);
                    }
                }
            } catch (IllegalArgumentException unused2) {
                return new com.google.android.datatransport.runtime.backends.OooO00o(BackendResponse.Status.FATAL_ERROR, -1L);
            }
        } else {
            str = null;
        }
        try {
            OooO00o oooO00o4 = new OooO00o(url2, oooO0o, str);
            OooOO0 oooOO1 = new OooOO0(this);
            int i2 = 5;
            OooO00o oooO00o5 = oooO00o4;
            do {
                p189o00o0O0.OooOOO0 oooOOO0 = oooO00o5.f38869OooO0O0;
                OooOO0O oooOO0O = oooOO1.f38860OooO00o;
                oooOO0O.getClass();
                String strOooO0OO2 = o000O0O0.OooO0OO("CctTransportBackend");
                boolean zIsLoggable = Log.isLoggable(strOooO0OO2, 4);
                URL url3 = oooO00o5.f38868OooO00o;
                if (zIsLoggable) {
                    Log.i(strOooO0OO2, String.format("Making request to: %s", url3));
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url3.openConnection();
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(oooOO0O.f38867OooO0oO);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.9"));
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                String str6 = oooO00o5.f38870OooO0OO;
                if (str6 != null) {
                    httpURLConnection.setRequestProperty("X-Goog-Api-Key", str6);
                }
                try {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                        try {
                            oooOO0O.f38861OooO00o.OooO00o(new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)), oooOOO0);
                            gZIPOutputStream.close();
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            int responseCode = httpURLConnection.getResponseCode();
                            Integer numValueOf2 = Integer.valueOf(responseCode);
                            String strOooO0OO3 = o000O0O0.OooO0OO("CctTransportBackend");
                            if (Log.isLoggable(strOooO0OO3, 4)) {
                                Log.i(strOooO0OO3, String.format("Status Code: %d", numValueOf2));
                            }
                            o000O0O0.OooO00o(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                            o000O0O0.OooO00o(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                            if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                                oooO0O0 = new OooO0O0(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                            } else if (responseCode != 200) {
                                oooO0O0 = new OooO0O0(responseCode, null, 0L);
                            } else {
                                InputStream inputStream = httpURLConnection.getInputStream();
                                try {
                                    InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                                    try {
                                        OooO0O0 oooO0O2 = new OooO0O0(responseCode, null, OooOo00.OooO00o(new BufferedReader(new InputStreamReader(gZIPInputStream))).f38854OooO00o);
                                        if (gZIPInputStream != null) {
                                            gZIPInputStream.close();
                                        }
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        oooO0O0 = oooO0O2;
                                    } catch (Throwable th) {
                                        if (gZIPInputStream == null) {
                                            throw th;
                                        }
                                        try {
                                            gZIPInputStream.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                            throw th;
                                        }
                                        o000O0O0.OooO0O0("CctTransportBackend", "Could not make request to the backend", e);
                                        return new com.google.android.datatransport.runtime.backends.OooO00o(BackendResponse.Status.TRANSIENT_ERROR, -1L);
                                    }
                                } catch (Throwable th3) {
                                    if (inputStream == null) {
                                        throw th3;
                                    }
                                    try {
                                        inputStream.close();
                                        throw th3;
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                        throw th3;
                                    }
                                }
                            }
                        } catch (Throwable th5) {
                            try {
                                gZIPOutputStream.close();
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                            }
                            throw th5;
                        }
                    } catch (Throwable th7) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th8) {
                                th7.addSuppressed(th8);
                            }
                        }
                        throw th7;
                    }
                } catch (EncodingException e2) {
                    e = e2;
                    o000O0O0.OooO0O0("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                    oooO0O0 = new OooO0O0(400, null, 0L);
                } catch (ConnectException e3) {
                    e = e3;
                    o000O0O0.OooO0O0("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                    oooO0O0 = new OooO0O0(500, null, 0L);
                    oooO00o = null;
                    url = oooO0O0.f38872OooO0O0;
                    if (url != null) {
                        o000O0O0.OooO00o(url, "CctTransportBackend", "Following redirect to: %s");
                        oooO00o = new OooO00o(url, oooOOO0, oooO00o5.f38870OooO0OO);
                    }
                    oooO00o5 = oooO00o;
                    if (oooO00o5 == null) {
                        break;
                    }
                    i2--;
                    i = oooO0O0.f38871OooO00o;
                    if (i == 200) {
                        return new com.google.android.datatransport.runtime.backends.OooO00o(BackendResponse.Status.OK, oooO0O0.f38873OooO0OO);
                    }
                    if (i < 500) {
                        return i == 400 ? new com.google.android.datatransport.runtime.backends.OooO00o(BackendResponse.Status.INVALID_PAYLOAD, -1L) : new com.google.android.datatransport.runtime.backends.OooO00o(BackendResponse.Status.FATAL_ERROR, -1L);
                    }
                    return new com.google.android.datatransport.runtime.backends.OooO00o(BackendResponse.Status.TRANSIENT_ERROR, -1L);
                } catch (UnknownHostException e4) {
                    e = e4;
                    o000O0O0.OooO0O0("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                    oooO0O0 = new OooO0O0(500, null, 0L);
                    oooO00o = null;
                    url = oooO0O0.f38872OooO0O0;
                    if (url != null) {
                        o000O0O0.OooO00o(url, "CctTransportBackend", "Following redirect to: %s");
                        oooO00o = new OooO00o(url, oooOOO0, oooO00o5.f38870OooO0OO);
                    }
                    oooO00o5 = oooO00o;
                    if (oooO00o5 == null) {
                        break;
                        break;
                    }
                    i2--;
                    i = oooO0O0.f38871OooO00o;
                    if (i == 200) {
                        return new com.google.android.datatransport.runtime.backends.OooO00o(BackendResponse.Status.OK, oooO0O0.f38873OooO0OO);
                    }
                    if (i < 500) {
                        if (i == 400) {
                        }
                    }
                    return new com.google.android.datatransport.runtime.backends.OooO00o(BackendResponse.Status.TRANSIENT_ERROR, -1L);
                } catch (IOException e5) {
                    e = e5;
                    o000O0O0.OooO0O0("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                    oooO0O0 = new OooO0O0(400, null, 0L);
                }
                oooO00o = null;
                url = oooO0O0.f38872OooO0O0;
                if (url != null) {
                    o000O0O0.OooO00o(url, "CctTransportBackend", "Following redirect to: %s");
                    oooO00o = new OooO00o(url, oooOOO0, oooO00o5.f38870OooO0OO);
                }
                oooO00o5 = oooO00o;
                if (oooO00o5 == null) {
                    break;
                    break;
                }
                i2--;
            } while (i2 >= 1);
            i = oooO0O0.f38871OooO00o;
            if (i == 200) {
                return new com.google.android.datatransport.runtime.backends.OooO00o(BackendResponse.Status.OK, oooO0O0.f38873OooO0OO);
            }
            if (i < 500 && i != 404) {
                if (i == 400) {
                }
            }
            return new com.google.android.datatransport.runtime.backends.OooO00o(BackendResponse.Status.TRANSIENT_ERROR, -1L);
        } catch (IOException e6) {
            o000O0O0.OooO0O0("CctTransportBackend", "Could not make request to the backend", e6);
            return new com.google.android.datatransport.runtime.backends.OooO00o(BackendResponse.Status.TRANSIENT_ERROR, -1L);
        }
    }
}
