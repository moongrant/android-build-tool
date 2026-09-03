package com.google.android.exoplayer2.drm;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.android.billingclient.api.o0OO00O;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000OOo0;
import p709oo0oOOo.OooOOO;
import p709oo0oOOo.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O implements OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HttpDataSource.OooO0O0 f13730OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f13731OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f13732OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Map<String, String> f13733OooO0Oo = new HashMap();

    public OooOO0O(String str, boolean z, HttpDataSource.OooO0O0 oooO0O0) {
        this.f13730OooO00o = oooO0O0;
        this.f13731OooO0O0 = str;
        this.f13732OooO0OO = z;
    }

    public static byte[] OooO0O0(HttpDataSource.OooO0O0 oooO0O0, String str, @Nullable byte[] bArr, Map<String, String> map) throws MediaDrmCallbackException {
        Map<String, List<String>> map2;
        List<String> list;
        Oooo0 oooo0 = new Oooo0(((HttpDataSource.OooO00o) oooO0O0).OooO00o());
        Collections.emptyMap();
        Uri uri = Uri.parse(str);
        o00000O0.OooO0oO(uri, "The uri must be set.");
        Object obj = "The uri must be set.";
        DataSpec dataSpec = new DataSpec(uri, 0L, 2, bArr, map, 0L, -1L, null, 1, null, null);
        int i = 0;
        DataSpec dataSpec2 = dataSpec;
        int i2 = 0;
        while (true) {
            try {
                OooOOO oooOOO = new OooOOO(oooo0, dataSpec2);
                try {
                    byte[] bArrOooo00o = o000OOo0.Oooo00o(oooOOO);
                    o000OOo0.OooO0o(oooOOO);
                    return bArrOooo00o;
                } catch (HttpDataSource.InvalidResponseCodeException e) {
                    try {
                        int i3 = e.f14814Oooo0o;
                        String str2 = null;
                        if (((i3 == 307 || i3 == 308) && i2 < 5) && (map2 = e.f14815Oooo0oO) != null && (list = map2.get("Location")) != null && !list.isEmpty()) {
                            str2 = list.get(i);
                        }
                        if (str2 == null) {
                            throw e;
                        }
                        int i4 = i2 + 1;
                        long j = dataSpec2.f14802OooO0O0;
                        int i5 = dataSpec2.f14803OooO0OO;
                        byte[] bArr2 = dataSpec2.f14804OooO0Oo;
                        Map<String, String> map3 = dataSpec2.f14806OooO0o0;
                        long j2 = dataSpec2.f14805OooO0o;
                        long j3 = dataSpec2.f14807OooO0oO;
                        String str3 = dataSpec2.f14808OooO0oo;
                        int i6 = dataSpec2.f14800OooO;
                        Object obj2 = dataSpec2.f14809OooOO0;
                        Uri uri2 = Uri.parse(str2);
                        Object obj3 = obj;
                        o00000O0.OooO0oO(uri2, obj3);
                        DataSpec dataSpec3 = new DataSpec(uri2, j, i5, bArr2, map3, j2, j3, str3, i6, obj2, null);
                        o000OOo0.OooO0o(oooOOO);
                        obj = obj3;
                        dataSpec2 = dataSpec3;
                        i = 0;
                        i2 = i4;
                    } catch (Throwable th) {
                        o000OOo0.OooO0o(oooOOO);
                        throw th;
                    }
                }
            } catch (Exception e2) {
                Uri uri3 = oooo0.f53420OooO0OO;
                Objects.requireNonNull(uri3);
                throw new MediaDrmCallbackException(dataSpec, uri3, oooo0.OooO0oo(), oooo0.f53419OooO0O0, e2);
            }
        }
    }

    public final byte[] OooO00o(UUID uuid, OooO.OooO00o oooO00o) throws MediaDrmCallbackException {
        String str;
        String str2 = oooO00o.f13717OooO0O0;
        if (this.f13732OooO0OO || TextUtils.isEmpty(str2)) {
            str2 = this.f13731OooO0O0;
        }
        HashMap map = new HashMap();
        UUID uuid2 = C.f13109OooO0o0;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = C.f13107OooO0OO.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f13733OooO0Oo) {
            map.putAll(this.f13733OooO0Oo);
        }
        return OooO0O0(this.f13730OooO00o, str2, oooO00o.f13716OooO00o, map);
    }

    public final byte[] OooO0OO(OooO.OooO0o oooO0o) throws MediaDrmCallbackException {
        String str = oooO0o.f13719OooO0O0;
        String strOooOO0o = o000OOo0.OooOO0o(oooO0o.f13718OooO00o);
        StringBuilder sb = new StringBuilder(strOooOO0o.length() + o0OO00O.OooO00o(str, 15));
        sb.append(str);
        sb.append("&signedRequest=");
        sb.append(strOooOO0o);
        return OooO0O0(this.f13730OooO00o, sb.toString(), null, Collections.emptyMap());
    }
}
