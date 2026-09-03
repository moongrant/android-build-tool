package androidx.media3.exoplayer.drm;

import android.annotation.SuppressLint;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.text.android.o0OOO0o;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import com.common.support.imagepicker.dataprovider.utils.MediaUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import o000O0.o0oOO;
import o000OO0O.OooOo;
import o000OO0O.OooOo00;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p080o000OoO.o00;
import p080o000OoO.o000O000;
import p080o000OoO.o00Oo0;
import p090o000o00o.o0oOOo;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(18)
public final class OooOO0 implements ExoMediaDrm {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @UnstableApi
    public static final OooOo f7646OooO0Oo = new OooOo();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final UUID f7647OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final MediaDrm f7648OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f7649OooO0OO;

    @RequiresApi(31)
    public static class OooO00o {
        @DoNotInline
        public static boolean OooO00o(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }

        @DoNotInline
        public static void OooO0O0(MediaDrm mediaDrm, byte[] bArr, o0oOO o0ooo2) {
            o0oOO.OooO00o oooO00o = o0ooo2.f33916OooO00o;
            oooO00o.getClass();
            LogSessionId logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            LogSessionId logSessionId2 = oooO00o.f33918OooO00o;
            if (logSessionId2.equals(logSessionId)) {
                return;
            }
            MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            playbackComponent.getClass();
            o0OOO0o.OooO00o(playbackComponent).setLogSessionId(logSessionId2);
        }
    }

    public OooOO0(UUID uuid) throws UnsupportedSchemeException {
        uuid.getClass();
        UUID uuid2 = C.f6207OooO0O0;
        o00Oo0.OooO0O0(!uuid2.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f7647OooO00o = uuid;
        MediaDrm mediaDrm = new MediaDrm((o00.f34910OooO00o >= 27 || !C.f6208OooO0OO.equals(uuid)) ? uuid : uuid2);
        this.f7648OooO0O0 = mediaDrm;
        this.f7649OooO0OO = 1;
        if (C.f6209OooO0Oo.equals(uuid) && "ASUS_Z00AD".equals(o00.f34913OooO0Oo)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public final o000O00.OooO0O0 OooO(byte[] bArr) throws MediaCryptoException {
        int i = o00.f34910OooO00o;
        UUID uuid = this.f7647OooO00o;
        boolean z = i < 21 && C.f6209OooO0Oo.equals(uuid) && "L3".equals(this.f7648OooO0O0.getPropertyString("securityLevel"));
        if (i < 27 && C.f6208OooO0OO.equals(uuid)) {
            uuid = C.f6207OooO0O0;
        }
        return new OooOo00(uuid, bArr, z);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public final Map<String, String> OooO00o(byte[] bArr) {
        return this.f7648OooO0O0.queryKeyStatus(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public final ExoMediaDrm.OooO0OO OooO0O0() {
        MediaDrm.ProvisionRequest provisionRequest = this.f7648OooO0O0.getProvisionRequest();
        return new ExoMediaDrm.OooO0OO(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public final byte[] OooO0OO() throws MediaDrmException {
        return this.f7648OooO0O0.openSession();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public final void OooO0Oo(byte[] bArr, byte[] bArr2) {
        this.f7648OooO0O0.restoreKeys(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public final void OooO0o(byte[] bArr) throws DeniedByServerException {
        this.f7648OooO0O0.provideProvisionResponse(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public final void OooO0o0(@Nullable final DefaultDrmSessionManager.OooO00o oooO00o) {
        this.f7648OooO0O0.setOnEventListener(new MediaDrm.OnEventListener() { // from class: o000OO0O.Oooo000
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                androidx.media3.exoplayer.drm.OooOO0 oooOO1 = this.f34420OooO00o;
                ExoMediaDrm.OooO00o oooO00o2 = oooO00o;
                oooOO1.getClass();
                DefaultDrmSessionManager.OooO0O0 oooO0O0 = DefaultDrmSessionManager.this.f7619OooOoO0;
                oooO0O0.getClass();
                oooO0O0.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public final void OooO0oO(byte[] bArr, o0oOO o0ooo2) {
        if (o00.f34910OooO00o >= 31) {
            try {
                OooO00o.OooO0O0(this.f7648OooO0O0, bArr, o0ooo2);
            } catch (UnsupportedOperationException unused) {
                Log.OooO0o("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public final int OooO0oo() {
        return 2;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public final void OooOO0(byte[] bArr) {
        this.f7648OooO0O0.closeSession(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @Nullable
    @UnstableApi
    public final byte[] OooOO0O(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException {
        if (C.f6208OooO0OO.equals(this.f7647OooO00o) && o00.f34910OooO00o < 27) {
            try {
                JSONObject jSONObject = new JSONObject(o00.OooOOOO(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = o00.OooOoo(sb.toString());
            } catch (JSONException e) {
                Log.OooO0Oo("ClearKeyUtil", "Failed to adjust response data: ".concat(o00.OooOOOO(bArr2)), e);
            }
        }
        return this.f7648OooO0O0.provideKeyResponse(bArr, bArr2);
    }

    /* JADX WARN: Code duplicated, block: B:135:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0096  */
    /* JADX WARN: Code duplicated, block: B:35:0x009d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d9  */
    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @SuppressLint({"WrongConstant"})
    @UnstableApi
    public final ExoMediaDrm.KeyRequest OooOO0o(byte[] bArr, @Nullable List<DrmInitData.SchemeData> list, int i, @Nullable HashMap<String, String> map) throws NotProvisionedException {
        DrmInitData.SchemeData schemeData;
        byte[] bArr2;
        String str;
        int i2;
        o0oOOo.OooO00o OooO00o2;
        int i3;
        int i4;
        boolean z;
        byte[] bArrOooO0O0;
        UUID uuid = this.f7647OooO00o;
        if (list != null) {
            if (C.f6209OooO0Oo.equals(uuid)) {
                if (o00.f34910OooO00o < 28 || list.size() <= 1) {
                    i2 = 0;
                    while (true) {
                        if (i2 < list.size()) {
                            schemeData = list.get(0);
                            break;
                        }
                        DrmInitData.SchemeData schemeData2 = list.get(i2);
                        byte[] bArr3 = schemeData2.f6233OooO0oo;
                        bArr3.getClass();
                        OooO00o2 = o0oOOo.OooO00o(bArr3);
                        if (OooO00o2 == null) {
                            i3 = -1;
                        } else {
                            i3 = OooO00o2.f35092OooO0O0;
                        }
                        i4 = o00.f34910OooO00o;
                        if ((i4 >= 23 && i3 == 0) || (i4 >= 23 && i3 == 1)) {
                            schemeData = schemeData2;
                            break;
                        }
                    }
                } else {
                    DrmInitData.SchemeData schemeData3 = list.get(0);
                    int i5 = 0;
                    int length = 0;
                    while (true) {
                        if (i5 >= list.size()) {
                            z = true;
                            break;
                        }
                        DrmInitData.SchemeData schemeData4 = list.get(i5);
                        byte[] bArr4 = schemeData4.f6233OooO0oo;
                        bArr4.getClass();
                        if (o00.OooO00o(schemeData4.f6232OooO0oO, schemeData3.f6232OooO0oO) && o00.OooO00o(schemeData4.f6230OooO0o, schemeData3.f6230OooO0o)) {
                            if (o0oOOo.OooO00o(bArr4) != null) {
                                length += bArr4.length;
                                i5++;
                            }
                        }
                        z = false;
                        break;
                    }
                    if (!z) {
                        i2 = 0;
                        while (true) {
                            if (i2 < list.size()) {
                                schemeData = list.get(0);
                                break;
                            }
                            DrmInitData.SchemeData schemeData5 = list.get(i2);
                            byte[] bArr5 = schemeData5.f6233OooO0oo;
                            bArr5.getClass();
                            OooO00o2 = o0oOOo.OooO00o(bArr5);
                            if (OooO00o2 == null) {
                                i3 = -1;
                            } else {
                                i3 = OooO00o2.f35092OooO0O0;
                            }
                            i4 = o00.f34910OooO00o;
                            i2 = i4 >= 23 ? i2 + 1 : i2 + 1;
                            schemeData = schemeData5;
                            break;
                        }
                    }
                    byte[] bArr6 = new byte[length];
                    int i6 = 0;
                    for (int i7 = 0; i7 < list.size(); i7++) {
                        byte[] bArr7 = list.get(i7).f6233OooO0oo;
                        bArr7.getClass();
                        int length2 = bArr7.length;
                        System.arraycopy(bArr7, 0, bArr6, i6, length2);
                        i6 += length2;
                    }
                    schemeData = new DrmInitData.SchemeData(schemeData3.f6231OooO0o0, schemeData3.f6230OooO0o, schemeData3.f6232OooO0oO, bArr6);
                }
            } else {
                schemeData = list.get(0);
            }
            byte[] bArrArray = schemeData.f6233OooO0oo;
            bArrArray.getClass();
            UUID uuid2 = C.f6210OooO0o0;
            if (uuid2.equals(uuid)) {
                byte[] bArrOooO0O1 = o0oOOo.OooO0O0(uuid, bArrArray);
                if (bArrOooO0O1 != null) {
                    bArrArray = bArrOooO0O1;
                }
                o000O000 o000o001 = new o000O000(bArrArray);
                int iOooO = o000o001.OooO();
                short sOooOO0O = o000o001.OooOO0O();
                short sOooOO0O2 = o000o001.OooOO0O();
                if (sOooOO0O == 1 && sOooOO0O2 == 1) {
                    short sOooOO0O3 = o000o001.OooOO0O();
                    Charset charset = com.google.common.base.OooOO0.f18595OooO0o0;
                    String strOooOo00 = o000o001.OooOo00(sOooOO0O3, charset);
                    if (!strOooOo00.contains("<LA_URL>")) {
                        int iIndexOf = strOooOo00.indexOf("</DATA>");
                        if (iIndexOf == -1) {
                            Log.OooO0o("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        String str2 = strOooOo00.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strOooOo00.substring(iIndexOf);
                        int i8 = iOooO + 52;
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i8);
                        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                        byteBufferAllocate.putInt(i8);
                        byteBufferAllocate.putShort(sOooOO0O);
                        byteBufferAllocate.putShort(sOooOO0O2);
                        byteBufferAllocate.putShort((short) (str2.length() * 2));
                        byteBufferAllocate.put(str2.getBytes(charset));
                        bArrArray = byteBufferAllocate.array();
                    }
                } else {
                    Log.OooO0o0("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                }
                int length3 = (bArrArray != null ? bArrArray.length : 0) + 32;
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(length3);
                byteBufferAllocate2.putInt(length3);
                byteBufferAllocate2.putInt(1886614376);
                byteBufferAllocate2.putInt(0);
                byteBufferAllocate2.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate2.putLong(uuid2.getLeastSignificantBits());
                if (bArrArray != null && bArrArray.length != 0) {
                    byteBufferAllocate2.putInt(bArrArray.length);
                    byteBufferAllocate2.put(bArrArray);
                }
                bArrArray = byteBufferAllocate2.array();
            }
            int i9 = o00.f34910OooO00o;
            if (i9 < 23 && C.f6209OooO0Oo.equals(uuid)) {
                bArrOooO0O0 = o0oOOo.OooO0O0(uuid, bArrArray);
                if (bArrOooO0O0 != null) {
                    bArrArray = bArrOooO0O0;
                }
            } else if (uuid2.equals(uuid) && "Amazon".equals(o00.f34912OooO0OO)) {
                String str3 = o00.f34913OooO0Oo;
                if ("AFTB".equals(str3) || "AFTS".equals(str3) || "AFTM".equals(str3) || "AFTT".equals(str3)) {
                    bArrOooO0O0 = o0oOOo.OooO0O0(uuid, bArrArray);
                    if (bArrOooO0O0 != null) {
                        bArrArray = bArrOooO0O0;
                    }
                }
            }
            str = schemeData.f6232OooO0oO;
            if (i9 < 26 && C.f6208OooO0OO.equals(uuid) && (MediaUtils.VIDEO_MP4.equals(str) || "audio/mp4".equals(str))) {
                str = "cenc";
            }
            bArr2 = bArrArray;
        } else {
            schemeData = null;
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f7648OooO0O0.getKeyRequest(bArr, bArr2, str, i, map);
        byte[] data = keyRequest.getData();
        if (C.f6208OooO0OO.equals(uuid) && o00.f34910OooO00o < 27) {
            data = o00.OooOoo(o00.OooOOOO(data).replace('+', '-').replace('/', '_'));
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("<LA_URL>https://x</LA_URL>".equals(defaultUrl) || (o00.f34910OooO00o == 33 && "https://default.url".equals(defaultUrl))) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && schemeData != null) {
            String str4 = schemeData.f6230OooO0o;
            if (!TextUtils.isEmpty(str4)) {
                defaultUrl = str4;
            }
        }
        if (o00.f34910OooO00o >= 23) {
            keyRequest.getRequestType();
        }
        return new ExoMediaDrm.KeyRequest(defaultUrl, data);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public final boolean OooOOO0(String str, byte[] bArr) {
        if (o00.f34910OooO00o >= 31) {
            return OooO00o.OooO00o(this.f7648OooO0O0, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f7647OooO00o, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public final synchronized void release() {
        int i = this.f7649OooO0OO - 1;
        this.f7649OooO0OO = i;
        if (i == 0) {
            this.f7648OooO0O0.release();
        }
    }
}
