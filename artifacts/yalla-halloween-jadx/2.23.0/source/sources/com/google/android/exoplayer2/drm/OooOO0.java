package com.google.android.exoplayer2.drm;

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
import com.common.support.imagepicker.dataprovider.utils.MediaUtils;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import com.google.android.exoplayer2.drm.OooOO0;
import com.google.android.exoplayer2.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p200o00o0o.o0O0OOO0;
import p206o00o0oOO.o00Oo00;
import p207o00o0oOo.o0O0O0O;
import p207o00o0oOo.o0oO0Ooo;
import p214o00oO00o.o000;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(18)
@Deprecated
public final class OooOO0 implements ExoMediaDrm {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final kotlin.collections.OooO00o f11776OooO0Oo = new kotlin.collections.OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final UUID f11777OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final MediaDrm f11778OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f11779OooO0OO;

    @RequiresApi(31)
    public static class OooO00o {
        @DoNotInline
        public static boolean OooO00o(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }

        @DoNotInline
        public static void OooO0O0(MediaDrm mediaDrm, byte[] bArr, o0O0OOO0 o0o0ooo0) {
            o0O0OOO0.OooO00o oooO00o = o0o0ooo0.f39134OooO00o;
            oooO00o.getClass();
            LogSessionId logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            LogSessionId logSessionId2 = oooO00o.f39136OooO00o;
            if (logSessionId2.equals(logSessionId)) {
                return;
            }
            MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            playbackComponent.getClass();
            o0O0O0O.OooO00o(playbackComponent).setLogSessionId(logSessionId2);
        }
    }

    public OooOO0(UUID uuid) throws UnsupportedSchemeException {
        uuid.getClass();
        UUID uuid2 = C.f10897OooO0O0;
        o00O000o.OooO0O0(!uuid2.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f11777OooO00o = uuid;
        MediaDrm mediaDrm = new MediaDrm((o0O00.f40595OooO00o >= 27 || !C.f10898OooO0OO.equals(uuid)) ? uuid : uuid2);
        this.f11778OooO0O0 = mediaDrm;
        this.f11779OooO0OO = 1;
        if (C.f10899OooO0Oo.equals(uuid) && "ASUS_Z00AD".equals(o0O00.f40598OooO0Oo)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final void OooO(byte[] bArr) {
        this.f11778OooO0O0.closeSession(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final Map<String, String> OooO00o(byte[] bArr) {
        return this.f11778OooO0O0.queryKeyStatus(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final ExoMediaDrm.OooO0OO OooO0O0() {
        MediaDrm.ProvisionRequest provisionRequest = this.f11778OooO0O0.getProvisionRequest();
        return new ExoMediaDrm.OooO0OO(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final byte[] OooO0OO() throws MediaDrmException {
        return this.f11778OooO0O0.openSession();
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final void OooO0Oo(byte[] bArr, byte[] bArr2) {
        this.f11778OooO0O0.restoreKeys(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final void OooO0o(@Nullable final DefaultDrmSessionManager.OooO00o oooO00o) {
        this.f11778OooO0O0.setOnEventListener(new MediaDrm.OnEventListener() { // from class: o00o0oOo.o0O00o00
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                OooOO0 oooOO1 = this.f39446OooO00o;
                ExoMediaDrm.OooO00o oooO00o2 = oooO00o;
                oooOO1.getClass();
                DefaultDrmSessionManager.OooO0O0 oooO0O0 = DefaultDrmSessionManager.this.f11740OooOoO0;
                oooO0O0.getClass();
                oooO0O0.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final void OooO0o0(byte[] bArr) throws DeniedByServerException {
        this.f11778OooO0O0.provideProvisionResponse(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final int OooO0oO() {
        return 2;
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final o00Oo00 OooO0oo(byte[] bArr) throws MediaCryptoException {
        int i = o0O00.f40595OooO00o;
        UUID uuid = this.f11777OooO00o;
        boolean z = i < 21 && C.f10899OooO0Oo.equals(uuid) && "L3".equals(this.f11778OooO0O0.getPropertyString("securityLevel"));
        if (i < 27 && C.f10898OooO0OO.equals(uuid)) {
            uuid = C.f10897OooO0O0;
        }
        return new o0oO0Ooo(uuid, bArr, z);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    @Nullable
    public final byte[] OooOO0(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException {
        if (C.f10898OooO0OO.equals(this.f11777OooO00o) && o0O00.f40595OooO00o < 27) {
            try {
                JSONObject jSONObject = new JSONObject(o0O00.OooOOO0(bArr2));
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
                bArr2 = o0O00.OooOoo0(sb.toString());
            } catch (JSONException e) {
                Log.OooO0Oo("ClearKeyUtil", "Failed to adjust response data: ".concat(o0O00.OooOOO0(bArr2)), e);
            }
        }
        return this.f11778OooO0O0.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final void OooOO0O(byte[] bArr, o0O0OOO0 o0o0ooo0) {
        if (o0O00.f40595OooO00o >= 31) {
            try {
                OooO00o.OooO0O0(this.f11778OooO0O0, bArr, o0o0ooo0);
            } catch (UnsupportedOperationException unused) {
                Log.OooO0o("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:129:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:35:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00af  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a5  */
    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    @SuppressLint({"WrongConstant"})
    public final ExoMediaDrm.KeyRequest OooOO0o(byte[] bArr, @Nullable List<DrmInitData.SchemeData> list, int i, @Nullable HashMap<String, String> map) throws NotProvisionedException {
        byte[] bArr2;
        String str;
        int i2;
        DrmInitData.SchemeData schemeData;
        o000.OooO00o oooO00oOooO0O0;
        int i3;
        int i4;
        boolean z;
        byte[] bArrOooO0OO;
        UUID uuid = this.f11777OooO00o;
        DrmInitData.SchemeData schemeData2 = null;
        if (list != null) {
            if (C.f10899OooO0Oo.equals(uuid)) {
                if (o0O00.f40595OooO00o < 28 || list.size() <= 1) {
                    i2 = 0;
                    while (true) {
                        if (i2 < list.size()) {
                            schemeData = list.get(0);
                            break;
                        }
                        DrmInitData.SchemeData schemeData3 = list.get(i2);
                        byte[] bArr3 = schemeData3.f11758OooO0oo;
                        bArr3.getClass();
                        oooO00oOooO0O0 = o000.OooO0O0(bArr3);
                        if (oooO00oOooO0O0 == null) {
                            i3 = -1;
                        } else {
                            i3 = oooO00oOooO0O0.f39656OooO0O0;
                        }
                        i4 = o0O00.f40595OooO00o;
                        if ((i4 >= 23 && i3 == 0) || (i4 >= 23 && i3 == 1)) {
                            schemeData = schemeData3;
                            break;
                        }
                    }
                } else {
                    DrmInitData.SchemeData schemeData4 = list.get(0);
                    int i5 = 0;
                    int length = 0;
                    while (true) {
                        if (i5 >= list.size()) {
                            z = true;
                            break;
                        }
                        DrmInitData.SchemeData schemeData5 = list.get(i5);
                        byte[] bArr4 = schemeData5.f11758OooO0oo;
                        bArr4.getClass();
                        if (o0O00.OooO00o(schemeData5.f11757OooO0oO, schemeData4.f11757OooO0oO) && o0O00.OooO00o(schemeData5.f11755OooO0o, schemeData4.f11755OooO0o)) {
                            if (o000.OooO0O0(bArr4) != null) {
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
                            DrmInitData.SchemeData schemeData6 = list.get(i2);
                            byte[] bArr5 = schemeData6.f11758OooO0oo;
                            bArr5.getClass();
                            oooO00oOooO0O0 = o000.OooO0O0(bArr5);
                            if (oooO00oOooO0O0 == null) {
                                i3 = -1;
                            } else {
                                i3 = oooO00oOooO0O0.f39656OooO0O0;
                            }
                            i4 = o0O00.f40595OooO00o;
                            i2 = i4 >= 23 ? i2 + 1 : i2 + 1;
                            schemeData = schemeData6;
                            break;
                        }
                    }
                    byte[] bArr6 = new byte[length];
                    int i6 = 0;
                    for (int i7 = 0; i7 < list.size(); i7++) {
                        byte[] bArr7 = list.get(i7).f11758OooO0oo;
                        bArr7.getClass();
                        int length2 = bArr7.length;
                        System.arraycopy(bArr7, 0, bArr6, i6, length2);
                        i6 += length2;
                    }
                    schemeData = new DrmInitData.SchemeData(schemeData4.f11756OooO0o0, schemeData4.f11755OooO0o, schemeData4.f11757OooO0oO, bArr6);
                }
            } else {
                schemeData = list.get(0);
            }
            byte[] bArrOooO00o = schemeData.f11758OooO0oo;
            bArrOooO00o.getClass();
            UUID uuid2 = C.f10900OooO0o0;
            if (uuid2.equals(uuid)) {
                byte[] bArrOooO0OO2 = o000.OooO0OO(uuid, bArrOooO00o);
                if (bArrOooO0OO2 != null) {
                    bArrOooO00o = bArrOooO0OO2;
                }
                p245o00oo0o.o00Oo00 o00oo00 = new p245o00oo0o.o00Oo00(bArrOooO00o);
                int iOooO = o00oo00.OooO();
                short sOooOO0O = o00oo00.OooOO0O();
                short sOooOO0O2 = o00oo00.OooOO0O();
                if (sOooOO0O == 1 && sOooOO0O2 == 1) {
                    short sOooOO0O3 = o00oo00.OooOO0O();
                    Charset charset = com.google.common.base.OooO.f19062OooO0o0;
                    String strOooOo00 = o00oo00.OooOo00(sOooOO0O3, charset);
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
                        bArrOooO00o = byteBufferAllocate.array();
                    }
                } else {
                    Log.OooO0o0("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                }
                bArrOooO00o = o000.OooO00o(uuid2, null, bArrOooO00o);
            }
            int i9 = o0O00.f40595OooO00o;
            if (i9 >= 23 || !C.f10899OooO0Oo.equals(uuid)) {
                if (uuid2.equals(uuid) && "Amazon".equals(o0O00.f40597OooO0OO)) {
                    String str3 = o0O00.f40598OooO0Oo;
                    if ("AFTB".equals(str3) || "AFTS".equals(str3) || "AFTM".equals(str3) || "AFTT".equals(str3)) {
                        bArrOooO0OO = o000.OooO0OO(uuid, bArrOooO00o);
                        if (bArrOooO0OO == null) {
                        }
                    }
                }
                bArrOooO0OO = bArrOooO00o;
            } else {
                bArrOooO0OO = o000.OooO0OO(uuid, bArrOooO00o);
                if (bArrOooO0OO == null) {
                    bArrOooO0OO = bArrOooO00o;
                }
            }
            String str4 = schemeData.f11757OooO0oO;
            str = (i9 < 26 && C.f10898OooO0OO.equals(uuid) && (MediaUtils.VIDEO_MP4.equals(str4) || "audio/mp4".equals(str4))) ? "cenc" : str4;
            bArr2 = bArrOooO0OO;
            schemeData2 = schemeData;
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f11778OooO0O0.getKeyRequest(bArr, bArr2, str, i, map);
        byte[] data = keyRequest.getData();
        if (C.f10898OooO0OO.equals(uuid) && o0O00.f40595OooO00o < 27) {
            data = o0O00.OooOoo0(o0O00.OooOOO0(data).replace('+', '-').replace('/', '_'));
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("<LA_URL>https://x</LA_URL>".equals(defaultUrl) || (o0O00.f40595OooO00o == 33 && "https://default.url".equals(defaultUrl))) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && schemeData2 != null) {
            String str5 = schemeData2.f11755OooO0o;
            if (!TextUtils.isEmpty(str5)) {
                defaultUrl = str5;
            }
        }
        if (o0O00.f40595OooO00o >= 23) {
            keyRequest.getRequestType();
        }
        return new ExoMediaDrm.KeyRequest(defaultUrl, data);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final boolean OooOOO0(String str, byte[] bArr) {
        if (o0O00.f40595OooO00o >= 31) {
            return OooO00o.OooO00o(this.f11778OooO0O0, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f11777OooO00o, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final synchronized void release() {
        int i = this.f11779OooO0OO - 1;
        this.f11779OooO0OO = i;
        if (i == 0) {
            this.f11778OooO0O0.release();
        }
    }
}
