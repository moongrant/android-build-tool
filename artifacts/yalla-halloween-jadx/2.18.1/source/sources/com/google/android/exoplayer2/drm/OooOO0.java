package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.android.billingclient.api.o0OO00O;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.OooO;
import com.google.android.exoplayer2.drm.OooOO0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p300o0O0OooO.o000O00;
import p301o0O0Oooo.o00;
import p318o0O0oOo.o000;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o0000oo;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(18)
public final class OooOO0 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final UUID f13727OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final MediaDrm f13728OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f13729OooO0OO;

    public OooOO0(UUID uuid) throws UnsupportedSchemeException {
        Objects.requireNonNull(uuid);
        UUID uuid2 = C.f13106OooO0O0;
        o00000O0.OooO0O0(!uuid2.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f13727OooO00o = uuid;
        MediaDrm mediaDrm = new MediaDrm((o000OOo0.f36740OooO00o >= 27 || !C.f13107OooO0OO.equals(uuid)) ? uuid : uuid2);
        this.f13728OooO0O0 = mediaDrm;
        this.f13729OooO0OO = 1;
        if (C.f13108OooO0Oo.equals(uuid) && "ASUS_Z00AD".equals(o000OOo0.f36743OooO0Oo)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // com.google.android.exoplayer2.drm.OooO
    @Nullable
    public final byte[] OooO(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException {
        if (C.f13107OooO0OO.equals(this.f13727OooO00o) && o000OOo0.f36740OooO00o < 27) {
            try {
                JSONObject jSONObject = new JSONObject(o000OOo0.OooOO0o(bArr2));
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
                bArr2 = o000OOo0.OooOoO0(sb.toString());
            } catch (JSONException e) {
                String strOooOO0o = o000OOo0.OooOO0o(bArr2);
                o0000oo.OooO0O0("ClearKeyUtil", strOooOO0o.length() != 0 ? "Failed to adjust response data: ".concat(strOooOO0o) : new String("Failed to adjust response data: "), e);
            }
        }
        return this.f13728OooO0O0.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.OooO
    public final Class<o00> OooO00o() {
        return o00.class;
    }

    @Override // com.google.android.exoplayer2.drm.OooO
    public final Map<String, String> OooO0O0(byte[] bArr) {
        return this.f13728OooO0O0.queryKeyStatus(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.OooO
    public final p301o0O0Oooo.o000OOo0 OooO0OO(byte[] bArr) throws MediaCryptoException {
        int i = o000OOo0.f36740OooO00o;
        boolean z = i < 21 && C.f13108OooO0Oo.equals(this.f13727OooO00o) && "L3".equals(this.f13728OooO0O0.getPropertyString("securityLevel"));
        UUID uuid = this.f13727OooO00o;
        if (i < 27 && C.f13107OooO0OO.equals(uuid)) {
            uuid = C.f13106OooO0O0;
        }
        return new o00(uuid, bArr, z);
    }

    @Override // com.google.android.exoplayer2.drm.OooO
    public final OooO.OooO0o OooO0Oo() {
        MediaDrm.ProvisionRequest provisionRequest = this.f13728OooO0O0.getProvisionRequest();
        return new OooO.OooO0o(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.google.android.exoplayer2.drm.OooO
    public final void OooO0o(byte[] bArr, byte[] bArr2) {
        this.f13728OooO0O0.restoreKeys(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.OooO
    public final byte[] OooO0o0() throws MediaDrmException {
        return this.f13728OooO0O0.openSession();
    }

    @Override // com.google.android.exoplayer2.drm.OooO
    public final void OooO0oO(byte[] bArr) {
        this.f13728OooO0O0.closeSession(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.OooO
    public final void OooO0oo(@Nullable final OooO.OooO0O0 oooO0O0) {
        this.f13728OooO0O0.setOnEventListener(new MediaDrm.OnEventListener() { // from class: o0O0Oooo.o00O0000
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                OooOO0 oooOO1 = this.f36048OooO00o;
                OooO.OooO0O0 oooO0O1 = oooO0O0;
                Objects.requireNonNull(oooOO1);
                DefaultDrmSessionManager.OooO0OO oooO0OO = ((DefaultDrmSessionManager.OooO0O0) oooO0O1).f13703OooO00o.f13697OooOo;
                Objects.requireNonNull(oooO0OO);
                oooO0OO.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.OooO
    public final void OooOO0(byte[] bArr) throws DeniedByServerException {
        this.f13728OooO0O0.provideProvisionResponse(bArr);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x020b  */
    /* JADX WARN: Code duplicated, block: B:130:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:38:0x00af  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:66:0x0169  */
    /* JADX WARN: Code duplicated, block: B:68:0x0170  */
    /* JADX WARN: Code duplicated, block: B:69:0x0172  */
    /* JADX WARN: Code duplicated, block: B:80:0x01af  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:86:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ef  */
    @Override // com.google.android.exoplayer2.drm.OooO
    public final OooO.OooO00o OooOO0O(byte[] bArr, @Nullable List<DrmInitData.SchemeData> list, int i, @Nullable HashMap<String, String> map) throws NotProvisionedException {
        byte[] bArr2;
        String str;
        int i2;
        DrmInitData.SchemeData schemeData;
        o000O00.OooO00o OooO00o2;
        int i3;
        int i4;
        boolean z;
        UUID uuid;
        byte[] bArrArray;
        UUID uuid2;
        int i5;
        String str2;
        byte[] bArrOooO0O0;
        String str3;
        String str4;
        byte[] bArrOooO0O1;
        short sOooO0oO;
        int length;
        ByteBuffer byteBufferAllocate;
        DrmInitData.SchemeData schemeData2 = null;
        if (list != null) {
            if (C.f13108OooO0Oo.equals(this.f13727OooO00o)) {
                if (o000OOo0.f36740OooO00o < 28 || list.size() <= 1) {
                    i2 = 0;
                    while (true) {
                        if (i2 < list.size()) {
                            DrmInitData.SchemeData schemeData3 = list.get(i2);
                            byte[] bArr3 = schemeData3.f13714OoooO00;
                            Objects.requireNonNull(bArr3);
                            OooO00o2 = o000O00.OooO00o(bArr3);
                            if (OooO00o2 == null) {
                                i3 = -1;
                            } else {
                                i3 = OooO00o2.f36006OooO0O0;
                            }
                            i4 = o000OOo0.f36740OooO00o;
                            if ((i4 >= 23 && i3 == 0) || (i4 >= 23 && i3 == 1)) {
                                schemeData2 = schemeData3;
                            }
                        } else {
                            schemeData = list.get(0);
                        }
                    }
                } else {
                    DrmInitData.SchemeData schemeData4 = list.get(0);
                    int i6 = 0;
                    int length2 = 0;
                    while (true) {
                        if (i6 >= list.size()) {
                            z = true;
                            break;
                        }
                        DrmInitData.SchemeData schemeData5 = list.get(i6);
                        byte[] bArr4 = schemeData5.f13714OoooO00;
                        Objects.requireNonNull(bArr4);
                        if (o000OOo0.OooO00o(schemeData5.f13710Oooo, schemeData4.f13710Oooo) && o000OOo0.OooO00o(schemeData5.f13713Oooo0oo, schemeData4.f13713Oooo0oo)) {
                            if (o000O00.OooO00o(bArr4) != null) {
                                length2 += bArr4.length;
                                i6++;
                            }
                        }
                        z = false;
                        break;
                    }
                    if (z) {
                        byte[] bArr5 = new byte[length2];
                        int i7 = 0;
                        for (int i8 = 0; i8 < list.size(); i8++) {
                            byte[] bArr6 = list.get(i8).f13714OoooO00;
                            Objects.requireNonNull(bArr6);
                            int length3 = bArr6.length;
                            System.arraycopy(bArr6, 0, bArr5, i7, length3);
                            i7 += length3;
                        }
                        schemeData = new DrmInitData.SchemeData(schemeData4.f13712Oooo0oO, schemeData4.f13713Oooo0oo, schemeData4.f13710Oooo, bArr5);
                    } else {
                        i2 = 0;
                        while (true) {
                            if (i2 < list.size()) {
                                DrmInitData.SchemeData schemeData6 = list.get(i2);
                                byte[] bArr7 = schemeData6.f13714OoooO00;
                                Objects.requireNonNull(bArr7);
                                OooO00o2 = o000O00.OooO00o(bArr7);
                                if (OooO00o2 == null) {
                                    i3 = -1;
                                } else {
                                    i3 = OooO00o2.f36006OooO0O0;
                                }
                                i4 = o000OOo0.f36740OooO00o;
                                i2 = i4 >= 23 ? i2 + 1 : i2 + 1;
                                schemeData2 = schemeData6;
                            } else {
                                schemeData = list.get(0);
                            }
                        }
                    }
                }
                uuid = this.f13727OooO00o;
                bArrArray = schemeData2.f13714OoooO00;
                Objects.requireNonNull(bArrArray);
                uuid2 = C.f13109OooO0o0;
                if (uuid2.equals(uuid)) {
                    bArrOooO0O1 = o000O00.OooO0O0(bArrArray, uuid);
                    if (bArrOooO0O1 != null) {
                        bArrArray = bArrOooO0O1;
                    }
                    o000 o000Var = new o000(bArrArray);
                    int iOooO0o = o000Var.OooO0o();
                    sOooO0oO = o000Var.OooO0oO();
                    short sOooO0oO2 = o000Var.OooO0oO();
                    if (sOooO0oO == 1 || sOooO0oO2 != 1) {
                        Log.i("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                    } else {
                        short sOooO0oO3 = o000Var.OooO0oO();
                        Charset charset = o0OOOO0o.OooO0o.f38233OooO0Oo;
                        String strOooOOOO = o000Var.OooOOOO(sOooO0oO3, charset);
                        if (!strOooOOOO.contains("<LA_URL>")) {
                            int iIndexOf = strOooOOOO.indexOf("</DATA>");
                            if (iIndexOf == -1) {
                                Log.w("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
                            }
                            String strSubstring = strOooOOOO.substring(0, iIndexOf);
                            String strSubstring2 = strOooOOOO.substring(iIndexOf);
                            StringBuilder sb = new StringBuilder(o0OO00O.OooO00o(strSubstring2, o0OO00O.OooO00o(strSubstring, 26)));
                            sb.append(strSubstring);
                            sb.append("<LA_URL>https://x</LA_URL>");
                            sb.append(strSubstring2);
                            String string = sb.toString();
                            int i9 = iOooO0o + 52;
                            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i9);
                            byteBufferAllocate2.order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferAllocate2.putInt(i9);
                            byteBufferAllocate2.putShort(sOooO0oO);
                            byteBufferAllocate2.putShort(sOooO0oO2);
                            byteBufferAllocate2.putShort((short) (string.length() * 2));
                            byteBufferAllocate2.put(string.getBytes(charset));
                            bArrArray = byteBufferAllocate2.array();
                        }
                    }
                    if (bArrArray != null) {
                        length = bArrArray.length;
                    } else {
                        length = 0;
                    }
                    int i10 = length + 32;
                    byteBufferAllocate = ByteBuffer.allocate(i10);
                    byteBufferAllocate.putInt(i10);
                    byteBufferAllocate.putInt(1886614376);
                    byteBufferAllocate.putInt(0);
                    byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                    byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
                    if (bArrArray != null && bArrArray.length != 0) {
                        byteBufferAllocate.putInt(bArrArray.length);
                        byteBufferAllocate.put(bArrArray);
                    }
                    bArrArray = byteBufferAllocate.array();
                }
                i5 = o000OOo0.f36740OooO00o;
                if (i5 < 23 || !C.f13108OooO0Oo.equals(uuid)) {
                    if (uuid2.equals(uuid) && "Amazon".equals(o000OOo0.f36742OooO0OO)) {
                        str2 = o000OOo0.f36743OooO0Oo;
                        if ("AFTB".equals(str2) || "AFTS".equals(str2) || "AFTM".equals(str2) || "AFTT".equals(str2)) {
                            bArrOooO0O0 = o000O00.OooO0O0(bArrArray, uuid);
                            if (bArrOooO0O0 == null) {
                            }
                        }
                    }
                    bArrOooO0O0 = bArrArray;
                } else {
                    bArrOooO0O0 = o000O00.OooO0O0(bArrArray, uuid);
                    if (bArrOooO0O0 == null) {
                        bArrOooO0O0 = bArrArray;
                    }
                }
                UUID uuid3 = this.f13727OooO00o;
                str3 = schemeData2.f13710Oooo;
                if (i5 >= 26 && C.f13107OooO0OO.equals(uuid3) && ("video/mp4".equals(str3) || "audio/mp4".equals(str3))) {
                    str4 = "cenc";
                } else {
                    str4 = str3;
                }
                bArr2 = bArrOooO0O0;
                str = str4;
            } else {
                schemeData = list.get(0);
            }
            schemeData2 = schemeData;
            uuid = this.f13727OooO00o;
            bArrArray = schemeData2.f13714OoooO00;
            Objects.requireNonNull(bArrArray);
            uuid2 = C.f13109OooO0o0;
            if (uuid2.equals(uuid)) {
                bArrOooO0O1 = o000O00.OooO0O0(bArrArray, uuid);
                if (bArrOooO0O1 != null) {
                    bArrArray = bArrOooO0O1;
                }
                o000 o000Var2 = new o000(bArrArray);
                int iOooO0o2 = o000Var2.OooO0o();
                sOooO0oO = o000Var2.OooO0oO();
                short sOooO0oO4 = o000Var2.OooO0oO();
                if (sOooO0oO == 1) {
                    Log.i("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                } else {
                    Log.i("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                }
                if (bArrArray != null) {
                    length = bArrArray.length;
                } else {
                    length = 0;
                }
                int i11 = length + 32;
                byteBufferAllocate = ByteBuffer.allocate(i11);
                byteBufferAllocate.putInt(i11);
                byteBufferAllocate.putInt(1886614376);
                byteBufferAllocate.putInt(0);
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
                if (bArrArray != null) {
                    byteBufferAllocate.putInt(bArrArray.length);
                    byteBufferAllocate.put(bArrArray);
                }
                bArrArray = byteBufferAllocate.array();
            }
            i5 = o000OOo0.f36740OooO00o;
            if (i5 < 23) {
                if (uuid2.equals(uuid)) {
                    str2 = o000OOo0.f36743OooO0Oo;
                    if ("AFTB".equals(str2)) {
                        bArrOooO0O0 = o000O00.OooO0O0(bArrArray, uuid);
                        if (bArrOooO0O0 == null) {
                        }
                    } else {
                        bArrOooO0O0 = o000O00.OooO0O0(bArrArray, uuid);
                        if (bArrOooO0O0 == null) {
                        }
                    }
                    UUID uuid4 = this.f13727OooO00o;
                    str3 = schemeData2.f13710Oooo;
                    if (i5 >= 26) {
                        str4 = str3;
                    } else {
                        str4 = str3;
                    }
                    bArr2 = bArrOooO0O0;
                    str = str4;
                }
            } else if (uuid2.equals(uuid)) {
                str2 = o000OOo0.f36743OooO0Oo;
                if ("AFTB".equals(str2)) {
                    bArrOooO0O0 = o000O00.OooO0O0(bArrArray, uuid);
                    if (bArrOooO0O0 == null) {
                    }
                } else {
                    bArrOooO0O0 = o000O00.OooO0O0(bArrArray, uuid);
                    if (bArrOooO0O0 == null) {
                    }
                }
                UUID uuid5 = this.f13727OooO00o;
                str3 = schemeData2.f13710Oooo;
                if (i5 >= 26) {
                    str4 = str3;
                } else {
                    str4 = str3;
                }
                bArr2 = bArrOooO0O0;
                str = str4;
            }
            bArrOooO0O0 = bArrArray;
            UUID uuid6 = this.f13727OooO00o;
            str3 = schemeData2.f13710Oooo;
            if (i5 >= 26) {
                str4 = str3;
            } else {
                str4 = str3;
            }
            bArr2 = bArrOooO0O0;
            str = str4;
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f13728OooO0O0.getKeyRequest(bArr, bArr2, str, i, map);
        UUID uuid7 = this.f13727OooO00o;
        byte[] data = keyRequest.getData();
        if (C.f13107OooO0OO.equals(uuid7) && o000OOo0.f36740OooO00o < 27) {
            data = o000OOo0.OooOoO0(o000OOo0.OooOO0o(data).replace('+', '-').replace('/', '_'));
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && schemeData2 != null && !TextUtils.isEmpty(schemeData2.f13713Oooo0oo)) {
            defaultUrl = schemeData2.f13713Oooo0oo;
        }
        return new OooO.OooO00o(data, defaultUrl);
    }

    @Override // com.google.android.exoplayer2.drm.OooO
    public final synchronized void release() {
        int i = this.f13729OooO0OO - 1;
        this.f13729OooO0OO = i;
        if (i == 0) {
            this.f13728OooO0O0.release();
        }
    }
}
