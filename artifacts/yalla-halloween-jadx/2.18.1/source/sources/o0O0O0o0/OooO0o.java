package o0O0O0o0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p016OooOoO0.OooOo00;
import p285o0O0O0o.OooOOOO;
import p285o0O0O0o.OooOo;
import p285o0O0O0o.Oooo000;
import p285o0O0O0o.o000oOoO;
import p286o0O0O0oO.oo000o;
import p287o0O0O0oo.o00000O0;
import p287o0O0O0oo.o0000O00;
import p287o0O0O0oo.o0000OO0;
import p289o0O0OOoO.o0000Ooo;
import p371o0OOo0Oo.o00Oo0;
import p371o0OOo0Oo.o00Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements o0000OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00Oo0 f35426OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ConnectivityManager f35427OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Context f35428OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final URL f35429OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0000Ooo f35430OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0000Ooo f35431OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f35432OooO0oO;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final URL f35433OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o000oOoO f35434OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public final String f35435OooO0OO;

        public OooO00o(URL url, o000oOoO o000oooo2, @Nullable String str) {
            this.f35433OooO00o = url;
            this.f35434OooO0O0 = o000oooo2;
            this.f35435OooO0OO = str;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f35436OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final URL f35437OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f35438OooO0OO;

        public OooO0O0(int i, @Nullable URL url, long j) {
            this.f35436OooO00o = i;
            this.f35437OooO0O0 = url;
            this.f35438OooO0OO = j;
        }
    }

    public OooO0o(Context context, o0000Ooo o0000ooo, o0000Ooo o0000ooo2) {
        o00Ooo o00ooo2 = new o00Ooo();
        com.google.android.datatransport.cct.internal.OooO00o.f13039OooO00o.OooO00o(o00ooo2);
        o00ooo2.f38671OooO0Oo = true;
        this.f35426OooO00o = new o00Oo0(o00ooo2);
        this.f35428OooO0OO = context;
        this.f35427OooO0O0 = (ConnectivityManager) context.getSystemService("connectivity");
        this.f35429OooO0Oo = OooO0OO(o0O0O0o0.OooO00o.f35418OooO0OO);
        this.f35431OooO0o0 = o0000ooo2;
        this.f35430OooO0o = o0000ooo;
        this.f35432OooO0oO = 130000;
    }

    public static URL OooO0OO(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(OooOo00.OooO0Oo("Invalid url: ", str), e);
        }
    }

    @Override // p287o0O0O0oo.o0000OO0
    public final oo000o OooO00o(oo000o oo000oVar) {
        int subtype;
        NetworkInfo activeNetworkInfo = this.f35427OooO0O0.getActiveNetworkInfo();
        oo000o.OooO00o oooO00oOooOO0 = oo000oVar.OooOO0();
        oooO00oOooOO0.OooO00o("sdk-version", Build.VERSION.SDK_INT);
        oooO00oOooOO0.OooO0O0(DeviceRequestsHelper.DEVICE_INFO_MODEL, Build.MODEL);
        oooO00oOooOO0.OooO0O0("hardware", Build.HARDWARE);
        oooO00oOooOO0.OooO0O0(DeviceRequestsHelper.DEVICE_INFO_DEVICE, Build.DEVICE);
        oooO00oOooOO0.OooO0O0("product", Build.PRODUCT);
        oooO00oOooOO0.OooO0O0("os-uild", Build.ID);
        oooO00oOooOO0.OooO0O0("manufacturer", Build.MANUFACTURER);
        oooO00oOooOO0.OooO0O0("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        oooO00oOooOO0.OooO0Oo().put("tz-offset", String.valueOf(TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000));
        oooO00oOooOO0.OooO00o("net-type", activeNetworkInfo == null ? NetworkConnectionInfo.NetworkType.NONE.OooO0O0() : activeNetworkInfo.getType());
        int i = -1;
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
        oooO00oOooOO0.OooO00o("mobile-subtype", subtype);
        oooO00oOooOO0.OooO0O0("country", Locale.getDefault().getCountry());
        oooO00oOooOO0.OooO0O0("locale", Locale.getDefault().getLanguage());
        oooO00oOooOO0.OooO0O0("mcc_mnc", ((TelephonyManager) this.f35428OooO0OO.getSystemService("phone")).getSimOperator());
        Context context = this.f35428OooO0OO;
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            o0O0OO.OooO00o.OooO0OO("CctTransportBackend", "Unable to find version code for package", e);
        }
        oooO00oOooOO0.OooO0O0("application_build", Integer.toString(i));
        return oooO00oOooOO0.OooO0OO();
    }

    @Override // p287o0O0O0oo.o0000OO0
    public final BackendResponse OooO0O0(o0000O00 o0000o00) {
        String str;
        Object objOooO00o;
        Integer numValueOf;
        String str2;
        OooOo.OooO00o oooO00o;
        HashMap map = new HashMap();
        o00000O0 o00000o1 = (o00000O0) o0000o00;
        for (oo000o oo000oVar : o00000o1.f35519OooO00o) {
            String strOooO0oo = oo000oVar.OooO0oo();
            if (map.containsKey(strOooO0oo)) {
                ((List) map.get(strOooO0oo)).add(oo000oVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(oo000oVar);
                map.put(strOooO0oo, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            oo000o oo000oVar2 = (oo000o) ((List) entry.getValue()).get(0);
            QosTier qosTier = QosTier.DEFAULT;
            Long lValueOf = Long.valueOf(this.f35430OooO0o.getTime());
            Long lValueOf2 = Long.valueOf(this.f35431OooO0o0.getTime());
            com.google.android.datatransport.cct.internal.OooO0O0 oooO0O0 = new com.google.android.datatransport.cct.internal.OooO0O0(ClientInfo.ClientType.ANDROID_FIREBASE, new OooOOOO(Integer.valueOf(oo000oVar2.OooO0oO("sdk-version")), oo000oVar2.OooO0O0(DeviceRequestsHelper.DEVICE_INFO_MODEL), oo000oVar2.OooO0O0("hardware"), oo000oVar2.OooO0O0(DeviceRequestsHelper.DEVICE_INFO_DEVICE), oo000oVar2.OooO0O0("product"), oo000oVar2.OooO0O0("os-uild"), oo000oVar2.OooO0O0("manufacturer"), oo000oVar2.OooO0O0("fingerprint"), oo000oVar2.OooO0O0("locale"), oo000oVar2.OooO0O0("country"), oo000oVar2.OooO0O0("mcc_mnc"), oo000oVar2.OooO0O0("application_build")));
            try {
                str2 = null;
                numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                numValueOf = null;
                str2 = (String) entry.getKey();
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = ((List) entry.getValue()).iterator();
            while (it2.hasNext()) {
                oo000o oo000oVar3 = (oo000o) it2.next();
                p286o0O0O0oO.o00Ooo o00oooOooO0o0 = oo000oVar3.OooO0o0();
                Iterator it3 = it;
                o0O0O0Oo.OooO0O0 oooO0O1 = o00oooOooO0o0.f35495OooO00o;
                Iterator it4 = it2;
                if (oooO0O1.equals(new o0O0O0Oo.OooO0O0("proto"))) {
                    byte[] bArr = o00oooOooO0o0.f35496OooO0O0;
                    oooO00o = new OooOo.OooO00o();
                    oooO00o.f35405OooO0Oo = bArr;
                } else {
                    if (oooO0O1.equals(new o0O0O0Oo.OooO0O0("json"))) {
                        String str3 = new String(o00oooOooO0o0.f35496OooO0O0, Charset.forName("UTF-8"));
                        oooO00o = new OooOo.OooO00o();
                        oooO00o.f35407OooO0o0 = str3;
                    } else {
                        String strOooO0Oo = o0O0OO.OooO00o.OooO0Oo("CctTransportBackend");
                        if (Log.isLoggable(strOooO0Oo, 5)) {
                            Log.w(strOooO0Oo, String.format("Received event of unsupported encoding %s. Skipping...", oooO0O1));
                        }
                    }
                    it2 = it4;
                    it = it3;
                }
                oooO00o.f35402OooO00o = Long.valueOf(oo000oVar3.OooO0o());
                oooO00o.f35404OooO0OO = Long.valueOf(oo000oVar3.OooO());
                String str4 = oo000oVar3.OooO0OO().get("tz-offset");
                oooO00o.f35406OooO0o = Long.valueOf(str4 == null ? 0L : Long.valueOf(str4).longValue());
                oooO00o.f35408OooO0oO = new com.google.android.datatransport.cct.internal.OooO0OO(NetworkConnectionInfo.NetworkType.OooO00o(oo000oVar3.OooO0oO("net-type")), NetworkConnectionInfo.MobileSubtype.OooO00o(oo000oVar3.OooO0oO("mobile-subtype")));
                if (oo000oVar3.OooO0Oo() != null) {
                    oooO00o.f35403OooO0O0 = oo000oVar3.OooO0Oo();
                }
                String strOooO0Oo2 = oooO00o.f35402OooO00o == null ? " eventTimeMs" : "";
                if (oooO00o.f35404OooO0OO == null) {
                    strOooO0Oo2 = OooOo00.OooO0Oo(strOooO0Oo2, " eventUptimeMs");
                }
                if (oooO00o.f35406OooO0o == null) {
                    strOooO0Oo2 = OooOo00.OooO0Oo(strOooO0Oo2, " timezoneOffsetSeconds");
                }
                if (!strOooO0Oo2.isEmpty()) {
                    throw new IllegalStateException(OooOo00.OooO0Oo("Missing required properties:", strOooO0Oo2));
                }
                arrayList3.add(new OooOo(oooO00o.f35402OooO00o.longValue(), oooO00o.f35403OooO0O0, oooO00o.f35404OooO0OO.longValue(), oooO00o.f35405OooO0Oo, oooO00o.f35407OooO0o0, oooO00o.f35406OooO0o.longValue(), oooO00o.f35408OooO0oO));
                it2 = it4;
                it = it3;
            }
            Iterator it5 = it;
            String strOooO0Oo3 = lValueOf == null ? " requestTimeMs" : "";
            if (lValueOf2 == null) {
                strOooO0Oo3 = OooOo00.OooO0Oo(strOooO0Oo3, " requestUptimeMs");
            }
            if (!strOooO0Oo3.isEmpty()) {
                throw new IllegalStateException(OooOo00.OooO0Oo("Missing required properties:", strOooO0Oo3));
            }
            arrayList2.add(new Oooo000(lValueOf.longValue(), lValueOf2.longValue(), oooO0O0, numValueOf, str2, arrayList3, qosTier, null));
            it = it5;
        }
        int i = 5;
        p285o0O0O0o.OooOo00 oooOo00 = new p285o0O0O0o.OooOo00(arrayList2);
        URL urlOooO0OO = this.f35429OooO0Oo;
        if (o00000o1.f35520OooO0O0 != null) {
            try {
                o0O0O0o0.OooO00o OooO00o2 = o0O0O0o0.OooO00o.OooO00o(((o00000O0) o0000o00).f35520OooO0O0);
                str = OooO00o2.f35422OooO0O0;
                if (str == null) {
                    str = null;
                }
                String str5 = OooO00o2.f35421OooO00o;
                if (str5 != null) {
                    urlOooO0OO = OooO0OO(str5);
                }
            } catch (IllegalArgumentException unused2) {
                return BackendResponse.OooO00o();
            }
        } else {
            str = null;
        }
        try {
            OooO00o oooO00o2 = new OooO00o(urlOooO0OO, oooOo00, str);
            OooO0OO oooO0OO = new OooO0OO(this, 0);
            do {
                objOooO00o = oooO0OO.OooO00o(oooO00o2);
                OooO0O0 oooO0O2 = (OooO0O0) objOooO00o;
                URL url = oooO0O2.f35437OooO0O0;
                if (url != null) {
                    o0O0OO.OooO00o.OooO00o("CctTransportBackend", "Following redirect to: %s", url);
                    oooO00o2 = new OooO00o(oooO0O2.f35437OooO0O0, oooO00o2.f35434OooO0O0, oooO00o2.f35435OooO0OO);
                } else {
                    oooO00o2 = null;
                }
                if (oooO00o2 == null) {
                    break;
                }
                i--;
            } while (i >= 1);
            OooO0O0 oooO0O3 = (OooO0O0) objOooO00o;
            int i2 = oooO0O3.f35436OooO00o;
            if (i2 == 200) {
                return new com.google.android.datatransport.runtime.backends.OooO00o(BackendResponse.Status.OK, oooO0O3.f35438OooO0OO);
            }
            if (i2 < 500 && i2 != 404) {
                return i2 == 400 ? new com.google.android.datatransport.runtime.backends.OooO00o(BackendResponse.Status.INVALID_PAYLOAD, -1L) : BackendResponse.OooO00o();
            }
            return new com.google.android.datatransport.runtime.backends.OooO00o(BackendResponse.Status.TRANSIENT_ERROR, -1L);
        } catch (IOException e) {
            o0O0OO.OooO00o.OooO0OO("CctTransportBackend", "Could not make request to the backend", e);
            return new com.google.android.datatransport.runtime.backends.OooO00o(BackendResponse.Status.TRANSIENT_ERROR, -1L);
        }
    }
}
