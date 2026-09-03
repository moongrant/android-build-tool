package androidx.media3.exoplayer.drm;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import com.google.common.collect.o0OoO00O;
import java.io.ByteArrayOutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import o000O0O.OooOOOO;
import p080o000OoO.o00;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooOO0O implements OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final androidx.media3.datasource.OooO00o.InterfaceC0142OooO00o f7650OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f7651OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f7652OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap f7653OooO0Oo;

    public OooOO0O(@Nullable String str, boolean z, androidx.media3.datasource.OooO0o.OooO00o oooO00o) {
        o00Oo0.OooO00o((z && TextUtils.isEmpty(str)) ? false : true);
        this.f7650OooO00o = oooO00o;
        this.f7651OooO0O0 = str;
        this.f7652OooO0OO = z;
        this.f7653OooO0Oo = new HashMap();
    }

    public static byte[] OooO0O0(androidx.media3.datasource.OooO00o.InterfaceC0142OooO00o interfaceC0142OooO00o, String str, @Nullable byte[] bArr, Map<String, String> map) throws MediaDrmCallbackException {
        Map<String, List<String>> map2;
        List<String> list;
        OooOOOO oooOOOO = new OooOOOO(interfaceC0142OooO00o.OooO00o());
        Collections.emptyMap();
        Uri uri = Uri.parse(str);
        o00Oo0.OooO0oO(uri, "The uri must be set.");
        String str2 = "The uri must be set.";
        DataSpec dataSpec = new DataSpec(uri, 0L, 2, bArr, map, 0L, -1L, null, 1, null);
        int i = 0;
        int i2 = 0;
        DataSpec dataSpec2 = dataSpec;
        while (true) {
            try {
                o000O0O.OooO0o oooO0o = new o000O0O.OooO0o(oooOOOO, dataSpec2);
                try {
                    int i3 = o00.f34910OooO00o;
                    byte[] bArr2 = new byte[4096];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int i4 = oooO0o.read(bArr2);
                        if (i4 == -1) {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            o00.OooO0oO(oooO0o);
                            return byteArray;
                        }
                        byteArrayOutputStream.write(bArr2, i, i4);
                        o00.OooO0oO(oooO0o);
                        throw th;
                    }
                } catch (HttpDataSource$InvalidResponseCodeException e) {
                    try {
                        int i5 = e.f6984OooO0oO;
                        String str3 = ((((i5 == 307 || i5 == 308) && i2 < 5) ? 1 : i) == 0 || (map2 = e.f6985OooO0oo) == null || (list = map2.get("Location")) == null || list.isEmpty()) ? null : list.get(i);
                        if (str3 == null) {
                            throw e;
                        }
                        int i6 = i2 + 1;
                        long j = dataSpec2.f6971OooO0O0;
                        int i7 = dataSpec2.f6972OooO0OO;
                        byte[] bArr3 = dataSpec2.f6973OooO0Oo;
                        Map<String, String> map3 = dataSpec2.f6975OooO0o0;
                        long j2 = dataSpec2.f6974OooO0o;
                        long j3 = dataSpec2.f6976OooO0oO;
                        String str4 = dataSpec2.f6977OooO0oo;
                        int i8 = dataSpec2.f6969OooO;
                        Object obj = dataSpec2.f6978OooOO0;
                        Uri uri2 = Uri.parse(str3);
                        String str5 = str2;
                        o00Oo0.OooO0oO(uri2, str5);
                        DataSpec dataSpec3 = new DataSpec(uri2, j, i7, bArr3, map3, j2, j3, str4, i8, obj);
                        o00.OooO0oO(oooO0o);
                        str2 = str5;
                        dataSpec2 = dataSpec3;
                        i = 0;
                        i2 = i6;
                    } catch (Throwable th) {
                        o00.OooO0oO(oooO0o);
                        throw th;
                    }
                }
            } catch (Exception e2) {
                Uri uri3 = oooOOOO.f34183OooO0OO;
                uri3.getClass();
                throw new MediaDrmCallbackException(dataSpec, uri3, oooOOOO.OooO0Oo(), oooOOOO.f34182OooO0O0, e2);
            }
        }
    }

    public final byte[] OooO00o(UUID uuid, ExoMediaDrm.KeyRequest keyRequest) throws MediaDrmCallbackException {
        String str;
        String str2 = keyRequest.f7631OooO0O0;
        if (this.f7652OooO0OO || TextUtils.isEmpty(str2)) {
            str2 = this.f7651OooO0O0;
        }
        if (TextUtils.isEmpty(str2)) {
            Map mapEmptyMap = Collections.emptyMap();
            Uri uri = Uri.EMPTY;
            o00Oo0.OooO0oO(uri, "The uri must be set.");
            throw new MediaDrmCallbackException(new DataSpec(uri, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 0, null), Uri.EMPTY, o0OoO00O.f19150OooOO0, 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = C.f6210OooO0o0;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = C.f6208OooO0OO.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f7653OooO0Oo) {
            map.putAll(this.f7653OooO0Oo);
        }
        return OooO0O0(this.f7650OooO00o, str2, keyRequest.f7630OooO00o, map);
    }

    public final byte[] OooO0OO(ExoMediaDrm.OooO0OO oooO0OO) throws MediaDrmCallbackException {
        return OooO0O0(this.f7650OooO00o, oooO0OO.f7633OooO0O0 + "&signedRequest=" + o00.OooOOOO(oooO0OO.f7632OooO00o), null, Collections.emptyMap());
    }
}
