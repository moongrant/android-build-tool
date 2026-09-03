package com.google.android.exoplayer2.drm;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.common.collect.o0OoO00O;
import java.io.ByteArrayOutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p244o00oo0Oo.o00O0O0;
import p244o00oo0Oo.o00oOoo;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooOO0O implements OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0215OooO00o f11780OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f11781OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f11782OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap f11783OooO0Oo;

    public OooOO0O(@Nullable String str, boolean z, com.google.android.exoplayer2.upstream.OooO0o.OooO00o oooO00o) {
        o00O000o.OooO00o((z && TextUtils.isEmpty(str)) ? false : true);
        this.f11780OooO00o = oooO00o;
        this.f11781OooO0O0 = str;
        this.f11782OooO0OO = z;
        this.f11783OooO0Oo = new HashMap();
    }

    public static byte[] OooO0O0(com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0215OooO00o interfaceC0215OooO00o, String str, @Nullable byte[] bArr, Map<String, String> map) throws MediaDrmCallbackException {
        Map<String, List<String>> map2;
        List<String> list;
        o00O0O0 o00o0o0 = new o00O0O0(interfaceC0215OooO00o.OooO00o());
        Collections.emptyMap();
        Uri uri = Uri.parse(str);
        o00O000o.OooO0o(uri, "The uri must be set.");
        String str2 = "The uri must be set.";
        DataSpec dataSpec = new DataSpec(uri, 0L, 2, bArr, map, 0L, -1L, null, 1, null);
        int i = 0;
        int i2 = 0;
        DataSpec dataSpec2 = dataSpec;
        while (true) {
            try {
                o00oOoo o00oooo2 = new o00oOoo(o00o0o0, dataSpec2);
                try {
                    int i3 = o0O00.f40595OooO00o;
                    byte[] bArr2 = new byte[4096];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int i4 = o00oooo2.read(bArr2);
                        if (i4 == -1) {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            o0O00.OooO0oO(o00oooo2);
                            return byteArray;
                        }
                        byteArrayOutputStream.write(bArr2, i, i4);
                        o0O00.OooO0oO(o00oooo2);
                        throw th;
                    }
                } catch (HttpDataSource$InvalidResponseCodeException e) {
                    try {
                        int i5 = e.f14182OooO0oO;
                        String str3 = ((((i5 == 307 || i5 == 308) && i2 < 5) ? 1 : i) == 0 || (map2 = e.f14183OooO0oo) == null || (list = map2.get("Location")) == null || list.isEmpty()) ? null : list.get(i);
                        if (str3 == null) {
                            throw e;
                        }
                        int i6 = i2 + 1;
                        long j = dataSpec2.f14162OooO0O0;
                        int i7 = dataSpec2.f14163OooO0OO;
                        byte[] bArr3 = dataSpec2.f14164OooO0Oo;
                        Map<String, String> map3 = dataSpec2.f14166OooO0o0;
                        long j2 = dataSpec2.f14165OooO0o;
                        long j3 = dataSpec2.f14167OooO0oO;
                        String str4 = dataSpec2.f14168OooO0oo;
                        int i8 = dataSpec2.f14160OooO;
                        Object obj = dataSpec2.f14169OooOO0;
                        Uri uri2 = Uri.parse(str3);
                        String str5 = str2;
                        o00O000o.OooO0o(uri2, str5);
                        DataSpec dataSpec3 = new DataSpec(uri2, j, i7, bArr3, map3, j2, j3, str4, i8, obj);
                        o0O00.OooO0oO(o00oooo2);
                        str2 = str5;
                        dataSpec2 = dataSpec3;
                        i = 0;
                        i2 = i6;
                    } catch (Throwable th) {
                        o0O00.OooO0oO(o00oooo2);
                        throw th;
                    }
                }
            } catch (Exception e2) {
                Uri uri3 = o00o0o0.f40517OooO0OO;
                uri3.getClass();
                throw new MediaDrmCallbackException(dataSpec, uri3, o00o0o0.OooO0o0(), o00o0o0.f40516OooO0O0, e2);
            }
        }
    }

    public final byte[] OooO00o(UUID uuid, ExoMediaDrm.KeyRequest keyRequest) throws MediaDrmCallbackException {
        String str;
        String str2 = keyRequest.f11761OooO0O0;
        if (this.f11782OooO0OO || TextUtils.isEmpty(str2)) {
            str2 = this.f11781OooO0O0;
        }
        if (TextUtils.isEmpty(str2)) {
            Map mapEmptyMap = Collections.emptyMap();
            Uri uri = Uri.EMPTY;
            o00O000o.OooO0o(uri, "The uri must be set.");
            throw new MediaDrmCallbackException(new DataSpec(uri, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 0, null), Uri.EMPTY, o0OoO00O.f19626OooOO0, 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = C.f10900OooO0o0;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = C.f10898OooO0OO.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f11783OooO0Oo) {
            map.putAll(this.f11783OooO0Oo);
        }
        return OooO0O0(this.f11780OooO00o, str2, keyRequest.f11760OooO00o, map);
    }

    public final byte[] OooO0OO(ExoMediaDrm.OooO0OO oooO0OO) throws MediaDrmCallbackException {
        return OooO0O0(this.f11780OooO00o, oooO0OO.f11763OooO0O0 + "&signedRequest=" + o0O00.OooOOO0(oooO0OO.f11762OooO00o), null, Collections.emptyMap());
    }
}
