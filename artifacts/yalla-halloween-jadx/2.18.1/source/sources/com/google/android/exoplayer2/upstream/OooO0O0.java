package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000OOo0;
import p709oo0oOOo.OooOOO0;
import p709oo0oOOo.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public OooOOO0 f14841OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f14842OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<o000oOoO> f14843OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f14844OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public FileDataSource f14845OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public ContentDataSource f14846OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public AssetDataSource f14847OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public OooO00o f14848OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public UdpDataSource f14849OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public RawResourceDataSource f14850OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public OooO00o f14851OooOO0O;

    public OooO0O0(Context context, OooO00o oooO00o) {
        this.f14842OooO00o = context.getApplicationContext();
        Objects.requireNonNull(oooO00o);
        this.f14844OooO0OO = oooO00o;
        this.f14843OooO0O0 = new ArrayList();
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final long OooO0o(DataSpec dataSpec) throws IOException {
        boolean z = true;
        o00000O0.OooO0Oo(this.f14851OooOO0O == null);
        String scheme = dataSpec.f14801OooO00o.getScheme();
        Uri uri = dataSpec.f14801OooO00o;
        int i = o000OOo0.f36740OooO00o;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !ShareInternalUtility.STAGING_PARAM.equals(scheme2)) {
            z = false;
        }
        if (z) {
            String path = dataSpec.f14801OooO00o.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f14845OooO0Oo == null) {
                    FileDataSource fileDataSource = new FileDataSource();
                    this.f14845OooO0Oo = fileDataSource;
                    OooOOOO(fileDataSource);
                }
                this.f14851OooOO0O = this.f14845OooO0Oo;
            } else {
                if (this.f14847OooO0o0 == null) {
                    AssetDataSource assetDataSource = new AssetDataSource(this.f14842OooO00o);
                    this.f14847OooO0o0 = assetDataSource;
                    OooOOOO(assetDataSource);
                }
                this.f14851OooOO0O = this.f14847OooO0o0;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f14847OooO0o0 == null) {
                AssetDataSource assetDataSource2 = new AssetDataSource(this.f14842OooO00o);
                this.f14847OooO0o0 = assetDataSource2;
                OooOOOO(assetDataSource2);
            }
            this.f14851OooOO0O = this.f14847OooO0o0;
        } else if ("content".equals(scheme)) {
            if (this.f14846OooO0o == null) {
                ContentDataSource contentDataSource = new ContentDataSource(this.f14842OooO00o);
                this.f14846OooO0o = contentDataSource;
                OooOOOO(contentDataSource);
            }
            this.f14851OooOO0O = this.f14846OooO0o;
        } else if ("rtmp".equals(scheme)) {
            if (this.f14848OooO0oO == null) {
                try {
                    OooO00o oooO00o = (OooO00o) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.f14848OooO0oO = oooO00o;
                    OooOOOO(oooO00o);
                } catch (ClassNotFoundException unused) {
                    Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating RTMP extension", e);
                }
                if (this.f14848OooO0oO == null) {
                    this.f14848OooO0oO = this.f14844OooO0OO;
                }
            }
            this.f14851OooOO0O = this.f14848OooO0oO;
        } else if ("udp".equals(scheme)) {
            if (this.f14849OooO0oo == null) {
                UdpDataSource udpDataSource = new UdpDataSource();
                this.f14849OooO0oo = udpDataSource;
                OooOOOO(udpDataSource);
            }
            this.f14851OooOO0O = this.f14849OooO0oo;
        } else if ("data".equals(scheme)) {
            if (this.f14841OooO == null) {
                OooOOO0 oooOOO0 = new OooOOO0();
                this.f14841OooO = oooOOO0;
                OooOOOO(oooOOO0);
            }
            this.f14851OooOO0O = this.f14841OooO;
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            if (this.f14850OooOO0 == null) {
                RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.f14842OooO00o);
                this.f14850OooOO0 = rawResourceDataSource;
                OooOOOO(rawResourceDataSource);
            }
            this.f14851OooOO0O = this.f14850OooOO0;
        } else {
            this.f14851OooOO0O = this.f14844OooO0OO;
        }
        return this.f14851OooOO0O.OooO0o(dataSpec);
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final Map<String, List<String>> OooO0oo() {
        OooO00o oooO00o = this.f14851OooOO0O;
        return oooO00o == null ? Collections.emptyMap() : oooO00o.OooO0oo();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<oo0oOOo.o000oOoO>] */
    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final void OooOO0O(o000oOoO o000oooo2) {
        Objects.requireNonNull(o000oooo2);
        this.f14844OooO0OO.OooOO0O(o000oooo2);
        this.f14843OooO0O0.add(o000oooo2);
        OooOOOo(this.f14845OooO0Oo, o000oooo2);
        OooOOOo(this.f14847OooO0o0, o000oooo2);
        OooOOOo(this.f14846OooO0o, o000oooo2);
        OooOOOo(this.f14848OooO0oO, o000oooo2);
        OooOOOo(this.f14849OooO0oo, o000oooo2);
        OooOOOo(this.f14841OooO, o000oooo2);
        OooOOOo(this.f14850OooOO0, o000oooo2);
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    @Nullable
    public final Uri OooOO0o() {
        OooO00o oooO00o = this.f14851OooOO0O;
        if (oooO00o == null) {
            return null;
        }
        return oooO00o.OooOO0o();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<oo0oOOo.o000oOoO>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<oo0oOOo.o000oOoO>] */
    public final void OooOOOO(OooO00o oooO00o) {
        for (int i = 0; i < this.f14843OooO0O0.size(); i++) {
            oooO00o.OooOO0O((o000oOoO) this.f14843OooO0O0.get(i));
        }
    }

    public final void OooOOOo(@Nullable OooO00o oooO00o, o000oOoO o000oooo2) {
        if (oooO00o != null) {
            oooO00o.OooOO0O(o000oooo2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final void close() throws IOException {
        OooO00o oooO00o = this.f14851OooOO0O;
        if (oooO00o != null) {
            try {
                oooO00o.close();
            } finally {
                this.f14851OooOO0O = null;
            }
        }
    }

    @Override // p709oo0oOOo.OooOO0O
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        OooO00o oooO00o = this.f14851OooOO0O;
        Objects.requireNonNull(oooO00o);
        return oooO00o.read(bArr, i, i2);
    }
}
