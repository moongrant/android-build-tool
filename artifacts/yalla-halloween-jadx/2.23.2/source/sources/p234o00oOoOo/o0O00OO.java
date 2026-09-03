package p234o00oOoOo;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.OooOOOO;
import com.facebook.appevents.UserDataStore;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.OooO0OO;
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
import p022Oooo00O.o0O0o000;
import p233o00oOoOO.o0OoOoOo;
import p236o00oOoo0.o00;
import p236o00oOoo0.o000O;
import p236o00oOoo0.o000O0;
import p236o00oOoo0.o000O00O;
import p236o00oOoo0.o000OO0O;
import p238o00oOooo.o0O0OOOo;
import p238o00oOooo.o0O0oo00;
import p238o00oOooo.o0oOo0O0;
import p242o00oo00O.o0000oo;
import p242o00oo00O.o0O0O00;
import p244o00oo0O0.o00000OO;
import p249o00oo0oO.o000O0Oo;
import p299o0O0o00.o00oO0o;
import p299o0O0o00.oo000o;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00OO implements o0000oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oo000o f39911OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ConnectivityManager f39912OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Context f39913OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final URL f39914OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o000O0Oo f39915OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000O0Oo f39916OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f39917OooO0oO;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final URL f39918OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o000O f39919OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public final String f39920OooO0OO;

        public OooO00o(URL url, o000O o000o, @Nullable String str) {
            this.f39918OooO00o = url;
            this.f39919OooO0O0 = o000o;
            this.f39920OooO0OO = str;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f39921OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final URL f39922OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f39923OooO0OO;

        public OooO0O0(int i, @Nullable URL url, long j) {
            this.f39921OooO00o = i;
            this.f39922OooO0O0 = url;
            this.f39923OooO0OO = j;
        }
    }

    public o0O00OO(Context context, o000O0Oo o000o0oo2, o000O0Oo o000o0oo3) {
        o00oO0o o00oo0o2 = new o00oO0o();
        com.google.android.datatransport.cct.internal.OooO00o.f13878OooO00o.OooO00o(o00oo0o2);
        o00oo0o2.f41723OooO0Oo = true;
        this.f39911OooO00o = new oo000o(o00oo0o2);
        this.f39913OooO0OO = context;
        this.f39912OooO0O0 = (ConnectivityManager) context.getSystemService("connectivity");
        String str = o0O00O.f39906OooO0OO;
        try {
            this.f39914OooO0Oo = new URL(str);
            this.f39916OooO0o0 = o000o0oo3;
            this.f39915OooO0o = o000o0oo2;
            this.f39917OooO0oO = 130000;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(o00O00OO.OooO00o("Invalid url: ", str), e);
        }
    }

    @Override // p242o00oo00O.o0000oo
    public final o0O0OOOo OooO00o(o0O0oo00 o0o0oo00) {
        int subtype;
        NetworkInfo activeNetworkInfo = this.f39912OooO0O0.getActiveNetworkInfo();
        o0O0OOOo.OooO00o oooO00oOooO = o0o0oo00.OooO();
        int i = Build.VERSION.SDK_INT;
        Map<String, String> map = oooO00oOooO.f40003OooO0o;
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
        Map<String, String> map2 = oooO00oOooO.f40003OooO0o;
        if (map2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map2.put("tz-offset", String.valueOf(offset));
        int iOooO0O0 = activeNetworkInfo == null ? NetworkConnectionInfo.NetworkType.NONE.OooO0O0() : activeNetworkInfo.getType();
        Map<String, String> map3 = oooO00oOooO.f40003OooO0o;
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
        Map<String, String> map4 = oooO00oOooO.f40003OooO0o;
        if (map4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map4.put("mobile-subtype", String.valueOf(subtype));
        oooO00oOooO.OooO00o(UserDataStore.COUNTRY, Locale.getDefault().getCountry());
        oooO00oOooO.OooO00o("locale", Locale.getDefault().getLanguage());
        Context context = this.f39913OooO0OO;
        oooO00oOooO.OooO00o("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
        try {
            i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            o00000OO.OooO0O0("CctTransportBackend", "Unable to find version code for package", e);
        }
        oooO00oOooO.OooO00o("application_build", Integer.toString(i2));
        return oooO00oOooO.OooO0O0();
    }

    /* JADX WARN: Code duplicated, block: B:170:0x0436 A[Catch: IOException -> 0x0485, TryCatch #11 {IOException -> 0x0485, blocks: (B:78:0x029d, B:81:0x02ab, B:85:0x02c0, B:86:0x02ce, B:88:0x0314, B:95:0x0339, B:97:0x034b, B:98:0x035a, B:107:0x037d, B:168:0x0432, B:170:0x0436, B:173:0x0445, B:175:0x044a, B:177:0x0450, B:186:0x0467, B:188:0x0471, B:190:0x047b, B:108:0x0387, B:118:0x03b9, B:137:0x03da, B:136:0x03d7, B:138:0x03db, B:165:0x0411, B:167:0x0422, B:109:0x038b, B:111:0x0395, B:116:0x03b4, B:128:0x03cc, B:127:0x03c9, B:123:0x03c3, B:114:0x039c, B:132:0x03d1), top: B:208:0x029d, inners: #6, #13 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x0445 A[Catch: IOException -> 0x0485, TryCatch #11 {IOException -> 0x0485, blocks: (B:78:0x029d, B:81:0x02ab, B:85:0x02c0, B:86:0x02ce, B:88:0x0314, B:95:0x0339, B:97:0x034b, B:98:0x035a, B:107:0x037d, B:168:0x0432, B:170:0x0436, B:173:0x0445, B:175:0x044a, B:177:0x0450, B:186:0x0467, B:188:0x0471, B:190:0x047b, B:108:0x0387, B:118:0x03b9, B:137:0x03da, B:136:0x03d7, B:138:0x03db, B:165:0x0411, B:167:0x0422, B:109:0x038b, B:111:0x0395, B:116:0x03b4, B:128:0x03cc, B:127:0x03c9, B:123:0x03c3, B:114:0x039c, B:132:0x03d1), top: B:208:0x029d, inners: #6, #13 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x0450 A[Catch: IOException -> 0x0485, TryCatch #11 {IOException -> 0x0485, blocks: (B:78:0x029d, B:81:0x02ab, B:85:0x02c0, B:86:0x02ce, B:88:0x0314, B:95:0x0339, B:97:0x034b, B:98:0x035a, B:107:0x037d, B:168:0x0432, B:170:0x0436, B:173:0x0445, B:175:0x044a, B:177:0x0450, B:186:0x0467, B:188:0x0471, B:190:0x047b, B:108:0x0387, B:118:0x03b9, B:137:0x03da, B:136:0x03d7, B:138:0x03db, B:165:0x0411, B:167:0x0422, B:109:0x038b, B:111:0x0395, B:116:0x03b4, B:128:0x03cc, B:127:0x03c9, B:123:0x03c3, B:114:0x039c, B:132:0x03d1), top: B:208:0x029d, inners: #6, #13 }] */
    /* JADX WARN: Code duplicated, block: B:179:0x045a  */
    /* JADX WARN: Code duplicated, block: B:181:0x045e  */
    /* JADX WARN: Code duplicated, block: B:186:0x0467 A[Catch: IOException -> 0x0485, TryCatch #11 {IOException -> 0x0485, blocks: (B:78:0x029d, B:81:0x02ab, B:85:0x02c0, B:86:0x02ce, B:88:0x0314, B:95:0x0339, B:97:0x034b, B:98:0x035a, B:107:0x037d, B:168:0x0432, B:170:0x0436, B:173:0x0445, B:175:0x044a, B:177:0x0450, B:186:0x0467, B:188:0x0471, B:190:0x047b, B:108:0x0387, B:118:0x03b9, B:137:0x03da, B:136:0x03d7, B:138:0x03db, B:165:0x0411, B:167:0x0422, B:109:0x038b, B:111:0x0395, B:116:0x03b4, B:128:0x03cc, B:127:0x03c9, B:123:0x03c3, B:114:0x039c, B:132:0x03d1), top: B:208:0x029d, inners: #6, #13 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x0471 A[Catch: IOException -> 0x0485, TryCatch #11 {IOException -> 0x0485, blocks: (B:78:0x029d, B:81:0x02ab, B:85:0x02c0, B:86:0x02ce, B:88:0x0314, B:95:0x0339, B:97:0x034b, B:98:0x035a, B:107:0x037d, B:168:0x0432, B:170:0x0436, B:173:0x0445, B:175:0x044a, B:177:0x0450, B:186:0x0467, B:188:0x0471, B:190:0x047b, B:108:0x0387, B:118:0x03b9, B:137:0x03da, B:136:0x03d7, B:138:0x03db, B:165:0x0411, B:167:0x0422, B:109:0x038b, B:111:0x0395, B:116:0x03b4, B:128:0x03cc, B:127:0x03c9, B:123:0x03c3, B:114:0x039c, B:132:0x03d1), top: B:208:0x029d, inners: #6, #13 }] */
    /* JADX WARN: Code duplicated, block: B:234:0x044a A[EDGE_INSN: B:234:0x044a->B:175:0x044a BREAK  A[LOOP:3: B:80:0x02a9->B:236:?], SYNTHETIC] */
    @Override // p242o00oo00O.o0000oo
    public final com.google.android.datatransport.runtime.backends.OooO00o OooO0O0(o0O0O00 o0o0o00) {
        String str;
        OooO0O0 oooO0O0;
        OooO00o oooO00o;
        URL url;
        int i;
        String str2;
        Integer numValueOf;
        o00oOoo0.o000O0Oo.OooO00o oooO00o2;
        HashMap map = new HashMap();
        for (o0O0oo00 o0o0oo00 : o0o0o00.f40076OooO00o) {
            String strOooO0oO = o0o0oo00.OooO0oO();
            if (map.containsKey(strOooO0oO)) {
                ((List) map.get(strOooO0oO)).add(o0o0oo00);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(o0o0oo00);
                map.put(strOooO0oO, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            o0O0oo00 o0o0oo01 = (o0O0oo00) ((List) entry.getValue()).get(0);
            QosTier qosTier = QosTier.DEFAULT;
            Long lValueOf = Long.valueOf(this.f39915OooO0o.getTime());
            Long lValueOf2 = Long.valueOf(this.f39916OooO0o0.getTime());
            com.google.android.datatransport.cct.internal.OooO0O0 oooO0O1 = new com.google.android.datatransport.cct.internal.OooO0O0(ClientInfo.ClientType.ANDROID_FIREBASE, new o000O00O(Integer.valueOf(o0o0oo01.OooO0o("sdk-version")), o0o0oo01.OooO00o(DeviceRequestsHelper.DEVICE_INFO_MODEL), o0o0oo01.OooO00o("hardware"), o0o0oo01.OooO00o(DeviceRequestsHelper.DEVICE_INFO_DEVICE), o0o0oo01.OooO00o("product"), o0o0oo01.OooO00o("os-uild"), o0o0oo01.OooO00o("manufacturer"), o0o0oo01.OooO00o("fingerprint"), o0o0oo01.OooO00o("locale"), o0o0oo01.OooO00o(UserDataStore.COUNTRY), o0o0oo01.OooO00o("mcc_mnc"), o0o0oo01.OooO00o("application_build")));
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
                o0O0oo00 o0o0oo02 = (o0O0oo00) it2.next();
                o0oOo0O0 o0ooo0o0OooO0Oo = o0o0oo02.OooO0Oo();
                Iterator it3 = it;
                o0OoOoOo o0oooooo = o0ooo0o0OooO0Oo.f40042OooO00o;
                Iterator it4 = it2;
                boolean zEquals = o0oooooo.equals(new o0OoOoOo("proto"));
                byte[] bArr = o0ooo0o0OooO0Oo.f40043OooO0O0;
                if (zEquals) {
                    oooO00o2 = new o00oOoo0.o000O0Oo.OooO00o();
                    oooO00o2.f39958OooO0Oo = bArr;
                } else {
                    if (o0oooooo.equals(new o0OoOoOo("json"))) {
                        String str3 = new String(bArr, Charset.forName("UTF-8"));
                        o00oOoo0.o000O0Oo.OooO00o oooO00o3 = new o00oOoo0.o000O0Oo.OooO00o();
                        oooO00o3.f39960OooO0o0 = str3;
                        oooO00o2 = oooO00o3;
                    } else {
                        String strOooO0OO = o00000OO.OooO0OO("CctTransportBackend");
                        if (Log.isLoggable(strOooO0OO, 5)) {
                            Log.w(strOooO0OO, String.format("Received event of unsupported encoding %s. Skipping...", o0oooooo));
                        }
                    }
                    it = it3;
                    it2 = it4;
                }
                oooO00o2.f39955OooO00o = Long.valueOf(o0o0oo02.OooO0o0());
                oooO00o2.f39957OooO0OO = Long.valueOf(o0o0oo02.OooO0oo());
                String str4 = o0o0oo02.OooO0O0().get("tz-offset");
                oooO00o2.f39959OooO0o = Long.valueOf(str4 == null ? 0L : Long.valueOf(str4).longValue());
                oooO00o2.f39961OooO0oO = new OooO0OO(NetworkConnectionInfo.NetworkType.OooO00o(o0o0oo02.OooO0o("net-type")), NetworkConnectionInfo.MobileSubtype.OooO00o(o0o0oo02.OooO0o("mobile-subtype")));
                if (o0o0oo02.OooO0OO() != null) {
                    oooO00o2.f39956OooO0O0 = o0o0oo02.OooO0OO();
                }
                String strOooO00o = oooO00o2.f39955OooO00o == null ? " eventTimeMs" : "";
                if (oooO00o2.f39957OooO0OO == null) {
                    strOooO00o = strOooO00o.concat(" eventUptimeMs");
                }
                if (oooO00o2.f39959OooO0o == null) {
                    strOooO00o = OooOOOO.OooO00o(strOooO00o, " timezoneOffsetSeconds");
                }
                if (!strOooO00o.isEmpty()) {
                    throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
                }
                arrayList3.add(new p236o00oOoo0.o000O0Oo(oooO00o2.f39955OooO00o.longValue(), oooO00o2.f39956OooO0O0, oooO00o2.f39957OooO0OO.longValue(), oooO00o2.f39958OooO0Oo, oooO00o2.f39960OooO0o0, oooO00o2.f39959OooO0o.longValue(), oooO00o2.f39961OooO0oO));
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
            arrayList2.add(new o000OO0O(lValueOf.longValue(), lValueOf2.longValue(), oooO0O1, numValueOf, str2, arrayList3, qosTier));
            it = it5;
        }
        o000O0 o000o0 = new o000O0(arrayList2);
        byte[] bArr2 = o0o0o00.f40077OooO0O0;
        URL url2 = this.f39914OooO0Oo;
        if (bArr2 != null) {
            try {
                o0O00O o0o00oOooO00o = o0O00O.OooO00o(bArr2);
                str = o0o00oOooO00o.f39910OooO0O0;
                if (str == null) {
                    str = null;
                }
                String str5 = o0o00oOooO00o.f39909OooO00o;
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
            OooO00o oooO00o4 = new OooO00o(url2, o000o0, str);
            o0O0o000 o0o0o000 = new o0O0o000(this);
            int i2 = 5;
            OooO00o oooO00o5 = oooO00o4;
            do {
                o000O o000o = oooO00o5.f39919OooO0O0;
                o0O00OO o0o00oo2 = (o0O00OO) o0o0o000.f784OooO0Oo;
                o0o00oo2.getClass();
                String strOooO0OO2 = o00000OO.OooO0OO("CctTransportBackend");
                boolean zIsLoggable = Log.isLoggable(strOooO0OO2, 4);
                URL url3 = oooO00o5.f39918OooO00o;
                if (zIsLoggable) {
                    Log.i(strOooO0OO2, String.format("Making request to: %s", url3));
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url3.openConnection();
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(o0o00oo2.f39917OooO0oO);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.9"));
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                String str6 = oooO00o5.f39920OooO0OO;
                if (str6 != null) {
                    httpURLConnection.setRequestProperty("X-Goog-Api-Key", str6);
                }
                try {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                        try {
                            o0o00oo2.f39911OooO00o.OooO00o(new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)), o000o);
                            gZIPOutputStream.close();
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            int responseCode = httpURLConnection.getResponseCode();
                            Integer numValueOf2 = Integer.valueOf(responseCode);
                            String strOooO0OO3 = o00000OO.OooO0OO("CctTransportBackend");
                            if (Log.isLoggable(strOooO0OO3, 4)) {
                                Log.i(strOooO0OO3, String.format("Status Code: %d", numValueOf2));
                            }
                            o00000OO.OooO00o(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                            o00000OO.OooO00o(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                            if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                                oooO0O0 = new OooO0O0(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                            } else if (responseCode != 200) {
                                oooO0O0 = new OooO0O0(responseCode, null, 0L);
                            } else {
                                InputStream inputStream = httpURLConnection.getInputStream();
                                try {
                                    InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                                    try {
                                        OooO0O0 oooO0O2 = new OooO0O0(responseCode, null, o00.OooO00o(new BufferedReader(new InputStreamReader(gZIPInputStream))).f39947OooO00o);
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
                                        o00000OO.OooO0O0("CctTransportBackend", "Could not make request to the backend", e);
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
                    o00000OO.OooO0O0("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                    oooO0O0 = new OooO0O0(400, null, 0L);
                } catch (ConnectException e3) {
                    e = e3;
                    o00000OO.OooO0O0("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                    oooO0O0 = new OooO0O0(500, null, 0L);
                    oooO00o = null;
                    url = oooO0O0.f39922OooO0O0;
                    if (url != null) {
                        o00000OO.OooO00o(url, "CctTransportBackend", "Following redirect to: %s");
                        oooO00o = new OooO00o(url, o000o, oooO00o5.f39920OooO0OO);
                    }
                    oooO00o5 = oooO00o;
                    if (oooO00o5 == null) {
                        break;
                    }
                    i2--;
                    i = oooO0O0.f39921OooO00o;
                    if (i == 200) {
                        return new com.google.android.datatransport.runtime.backends.OooO00o(BackendResponse.Status.OK, oooO0O0.f39923OooO0OO);
                    }
                    if (i < 500) {
                        return i == 400 ? new com.google.android.datatransport.runtime.backends.OooO00o(BackendResponse.Status.INVALID_PAYLOAD, -1L) : new com.google.android.datatransport.runtime.backends.OooO00o(BackendResponse.Status.FATAL_ERROR, -1L);
                    }
                    return new com.google.android.datatransport.runtime.backends.OooO00o(BackendResponse.Status.TRANSIENT_ERROR, -1L);
                } catch (UnknownHostException e4) {
                    e = e4;
                    o00000OO.OooO0O0("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                    oooO0O0 = new OooO0O0(500, null, 0L);
                    oooO00o = null;
                    url = oooO0O0.f39922OooO0O0;
                    if (url != null) {
                        o00000OO.OooO00o(url, "CctTransportBackend", "Following redirect to: %s");
                        oooO00o = new OooO00o(url, o000o, oooO00o5.f39920OooO0OO);
                    }
                    oooO00o5 = oooO00o;
                    if (oooO00o5 == null) {
                        break;
                        break;
                    }
                    i2--;
                    i = oooO0O0.f39921OooO00o;
                    if (i == 200) {
                        return new com.google.android.datatransport.runtime.backends.OooO00o(BackendResponse.Status.OK, oooO0O0.f39923OooO0OO);
                    }
                    if (i < 500) {
                        if (i == 400) {
                        }
                    }
                    return new com.google.android.datatransport.runtime.backends.OooO00o(BackendResponse.Status.TRANSIENT_ERROR, -1L);
                } catch (IOException e5) {
                    e = e5;
                    o00000OO.OooO0O0("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                    oooO0O0 = new OooO0O0(400, null, 0L);
                }
                oooO00o = null;
                url = oooO0O0.f39922OooO0O0;
                if (url != null) {
                    o00000OO.OooO00o(url, "CctTransportBackend", "Following redirect to: %s");
                    oooO00o = new OooO00o(url, o000o, oooO00o5.f39920OooO0OO);
                }
                oooO00o5 = oooO00o;
                if (oooO00o5 == null) {
                    break;
                    break;
                }
                i2--;
            } while (i2 >= 1);
            i = oooO0O0.f39921OooO00o;
            if (i == 200) {
                return new com.google.android.datatransport.runtime.backends.OooO00o(BackendResponse.Status.OK, oooO0O0.f39923OooO0OO);
            }
            if (i < 500 && i != 404) {
                if (i == 400) {
                }
            }
            return new com.google.android.datatransport.runtime.backends.OooO00o(BackendResponse.Status.TRANSIENT_ERROR, -1L);
        } catch (IOException e6) {
            o00000OO.OooO0O0("CctTransportBackend", "Could not make request to the backend", e6);
            return new com.google.android.datatransport.runtime.backends.OooO00o(BackendResponse.Status.TRANSIENT_ERROR, -1L);
        }
    }
}
