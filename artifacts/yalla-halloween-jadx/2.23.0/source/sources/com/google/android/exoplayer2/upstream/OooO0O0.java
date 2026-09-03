package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.share.internal.ShareInternalUtility;
import com.google.android.exoplayer2.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p244o00oo0Oo.o00O0000;
import p244o00oo0Oo.o00O0OO0;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO0O0 implements com.google.android.exoplayer2.upstream.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public o00O0000 f14210OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f14211OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f14212OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.OooO00o f14213OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public FileDataSource f14214OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public ContentDataSource f14215OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public AssetDataSource f14216OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public com.google.android.exoplayer2.upstream.OooO00o f14217OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public UdpDataSource f14218OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public RawResourceDataSource f14219OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public com.google.android.exoplayer2.upstream.OooO00o f14220OooOO0O;

    public static final class OooO00o implements com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0215OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f14221OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0215OooO00o f14222OooO0O0;

        public OooO00o(Context context) {
            OooO0o.OooO00o oooO00o = new OooO0o.OooO00o();
            this.f14221OooO00o = context.getApplicationContext();
            this.f14222OooO0O0 = oooO00o;
        }

        @Override // com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0215OooO00o
        public final com.google.android.exoplayer2.upstream.OooO00o OooO00o() {
            return new OooO0O0(this.f14221OooO00o, this.f14222OooO0O0.OooO00o());
        }
    }

    public OooO0O0(Context context, com.google.android.exoplayer2.upstream.OooO00o oooO00o) {
        this.f14211OooO00o = context.getApplicationContext();
        oooO00o.getClass();
        this.f14213OooO0OO = oooO00o;
        this.f14212OooO0O0 = new ArrayList();
    }

    public static void OooOOO0(@Nullable com.google.android.exoplayer2.upstream.OooO00o oooO00o, o00O0OO0 o00o0oo1) {
        if (oooO00o != null) {
            oooO00o.OooO0OO(o00o0oo1);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final long OooO00o(DataSpec dataSpec) throws IOException {
        boolean z = true;
        o00O000o.OooO0Oo(this.f14220OooOO0O == null);
        String scheme = dataSpec.f14161OooO00o.getScheme();
        int i = o0O00.f40595OooO00o;
        Uri uri = dataSpec.f14161OooO00o;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !ShareInternalUtility.STAGING_PARAM.equals(scheme2)) {
            z = false;
        }
        Context context = this.f14211OooO00o;
        if (z) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f14214OooO0Oo == null) {
                    FileDataSource fileDataSource = new FileDataSource();
                    this.f14214OooO0Oo = fileDataSource;
                    OooOO0o(fileDataSource);
                }
                this.f14220OooOO0O = this.f14214OooO0Oo;
            } else {
                if (this.f14216OooO0o0 == null) {
                    AssetDataSource assetDataSource = new AssetDataSource(context);
                    this.f14216OooO0o0 = assetDataSource;
                    OooOO0o(assetDataSource);
                }
                this.f14220OooOO0O = this.f14216OooO0o0;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f14216OooO0o0 == null) {
                AssetDataSource assetDataSource2 = new AssetDataSource(context);
                this.f14216OooO0o0 = assetDataSource2;
                OooOO0o(assetDataSource2);
            }
            this.f14220OooOO0O = this.f14216OooO0o0;
        } else if ("content".equals(scheme)) {
            if (this.f14215OooO0o == null) {
                ContentDataSource contentDataSource = new ContentDataSource(context);
                this.f14215OooO0o = contentDataSource;
                OooOO0o(contentDataSource);
            }
            this.f14220OooOO0O = this.f14215OooO0o;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            com.google.android.exoplayer2.upstream.OooO00o oooO00o = this.f14213OooO0OO;
            if (zEquals) {
                if (this.f14217OooO0oO == null) {
                    try {
                        com.google.android.exoplayer2.upstream.OooO00o oooO00o2 = (com.google.android.exoplayer2.upstream.OooO00o) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                        this.f14217OooO0oO = oooO00o2;
                        OooOO0o(oooO00o2);
                    } catch (ClassNotFoundException unused) {
                        Log.OooO0o("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.f14217OooO0oO == null) {
                        this.f14217OooO0oO = oooO00o;
                    }
                }
                this.f14220OooOO0O = this.f14217OooO0oO;
            } else if ("udp".equals(scheme)) {
                if (this.f14218OooO0oo == null) {
                    UdpDataSource udpDataSource = new UdpDataSource();
                    this.f14218OooO0oo = udpDataSource;
                    OooOO0o(udpDataSource);
                }
                this.f14220OooOO0O = this.f14218OooO0oo;
            } else if ("data".equals(scheme)) {
                if (this.f14210OooO == null) {
                    o00O0000 o00o0001 = new o00O0000();
                    this.f14210OooO = o00o0001;
                    OooOO0o(o00o0001);
                }
                this.f14220OooOO0O = this.f14210OooO;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f14219OooOO0 == null) {
                    RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(context);
                    this.f14219OooOO0 = rawResourceDataSource;
                    OooOO0o(rawResourceDataSource);
                }
                this.f14220OooOO0O = this.f14219OooOO0;
            } else {
                this.f14220OooOO0O = oooO00o;
            }
        }
        return this.f14220OooOO0O.OooO00o(dataSpec);
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final void OooO0OO(o00O0OO0 o00o0oo1) {
        o00o0oo1.getClass();
        this.f14213OooO0OO.OooO0OO(o00o0oo1);
        this.f14212OooO0O0.add(o00o0oo1);
        OooOOO0(this.f14214OooO0Oo, o00o0oo1);
        OooOOO0(this.f14216OooO0o0, o00o0oo1);
        OooOOO0(this.f14215OooO0o, o00o0oo1);
        OooOOO0(this.f14217OooO0oO, o00o0oo1);
        OooOOO0(this.f14218OooO0oo, o00o0oo1);
        OooOOO0(this.f14210OooO, o00o0oo1);
        OooOOO0(this.f14219OooOO0, o00o0oo1);
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final Map<String, List<String>> OooO0o0() {
        com.google.android.exoplayer2.upstream.OooO00o oooO00o = this.f14220OooOO0O;
        return oooO00o == null ? Collections.emptyMap() : oooO00o.OooO0o0();
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    @Nullable
    public final Uri OooOO0O() {
        com.google.android.exoplayer2.upstream.OooO00o oooO00o = this.f14220OooOO0O;
        if (oooO00o == null) {
            return null;
        }
        return oooO00o.OooOO0O();
    }

    public final void OooOO0o(com.google.android.exoplayer2.upstream.OooO00o oooO00o) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f14212OooO0O0;
            if (i >= arrayList.size()) {
                return;
            }
            oooO00o.OooO0OO((o00O0OO0) arrayList.get(i));
            i++;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final void close() throws IOException {
        com.google.android.exoplayer2.upstream.OooO00o oooO00o = this.f14220OooOO0O;
        if (oooO00o != null) {
            try {
                oooO00o.close();
            } finally {
                this.f14220OooOO0O = null;
            }
        }
    }

    @Override // p244o00oo0Oo.o00
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        com.google.android.exoplayer2.upstream.OooO00o oooO00o = this.f14220OooOO0O;
        oooO00o.getClass();
        return oooO00o.read(bArr, i, i2);
    }
}
