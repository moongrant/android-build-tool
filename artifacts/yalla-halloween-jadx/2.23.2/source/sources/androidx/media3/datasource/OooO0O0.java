package androidx.media3.datasource;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o000O0O.OooOo;
import p080o000OoO.o00;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 implements androidx.media3.datasource.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public o000O0O.OooO0O0 f6986OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f6987OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f6988OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final androidx.media3.datasource.OooO00o f6989OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public FileDataSource f6990OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public ContentDataSource f6991OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public AssetDataSource f6992OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public androidx.media3.datasource.OooO00o f6993OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public UdpDataSource f6994OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public RawResourceDataSource f6995OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public androidx.media3.datasource.OooO00o f6996OooOO0O;

    public static final class OooO00o implements androidx.media3.datasource.OooO00o.InterfaceC0142OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f6997OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final androidx.media3.datasource.OooO00o.InterfaceC0142OooO00o f6998OooO0O0;

        public OooO00o(Context context) {
            this(context, new OooO0o.OooO00o());
        }

        @Override // androidx.media3.datasource.OooO00o.InterfaceC0142OooO00o
        @UnstableApi
        public final androidx.media3.datasource.OooO00o OooO00o() {
            return new OooO0O0(this.f6997OooO00o, this.f6998OooO0O0.OooO00o());
        }

        public OooO00o(Context context, OooO oooO) {
            this.f6997OooO00o = context.getApplicationContext();
            this.f6998OooO0O0 = oooO;
        }
    }

    @UnstableApi
    public OooO0O0(Context context, androidx.media3.datasource.OooO00o oooO00o) {
        this.f6987OooO00o = context.getApplicationContext();
        oooO00o.getClass();
        this.f6989OooO0OO = oooO00o;
        this.f6988OooO0O0 = new ArrayList();
    }

    public static void OooOOO0(@Nullable androidx.media3.datasource.OooO00o oooO00o, OooOo oooOo) {
        if (oooO00o != null) {
            oooO00o.OooO0oO(oooOo);
        }
    }

    @Override // androidx.media3.datasource.OooO00o
    @UnstableApi
    public final long OooO00o(DataSpec dataSpec) throws IOException {
        boolean z = true;
        o00Oo0.OooO0Oo(this.f6996OooOO0O == null);
        String scheme = dataSpec.f6970OooO00o.getScheme();
        int i = o00.f34910OooO00o;
        Uri uri = dataSpec.f6970OooO00o;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !ShareInternalUtility.STAGING_PARAM.equals(scheme2)) {
            z = false;
        }
        Context context = this.f6987OooO00o;
        if (z) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f6990OooO0Oo == null) {
                    FileDataSource fileDataSource = new FileDataSource();
                    this.f6990OooO0Oo = fileDataSource;
                    OooOO0o(fileDataSource);
                }
                this.f6996OooOO0O = this.f6990OooO0Oo;
            } else {
                if (this.f6992OooO0o0 == null) {
                    AssetDataSource assetDataSource = new AssetDataSource(context);
                    this.f6992OooO0o0 = assetDataSource;
                    OooOO0o(assetDataSource);
                }
                this.f6996OooOO0O = this.f6992OooO0o0;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f6992OooO0o0 == null) {
                AssetDataSource assetDataSource2 = new AssetDataSource(context);
                this.f6992OooO0o0 = assetDataSource2;
                OooOO0o(assetDataSource2);
            }
            this.f6996OooOO0O = this.f6992OooO0o0;
        } else if ("content".equals(scheme)) {
            if (this.f6991OooO0o == null) {
                ContentDataSource contentDataSource = new ContentDataSource(context);
                this.f6991OooO0o = contentDataSource;
                OooOO0o(contentDataSource);
            }
            this.f6996OooOO0O = this.f6991OooO0o;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            androidx.media3.datasource.OooO00o oooO00o = this.f6989OooO0OO;
            if (zEquals) {
                if (this.f6993OooO0oO == null) {
                    try {
                        androidx.media3.datasource.OooO00o oooO00o2 = (androidx.media3.datasource.OooO00o) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                        this.f6993OooO0oO = oooO00o2;
                        OooOO0o(oooO00o2);
                    } catch (ClassNotFoundException unused) {
                        Log.OooO0o("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.f6993OooO0oO == null) {
                        this.f6993OooO0oO = oooO00o;
                    }
                }
                this.f6996OooOO0O = this.f6993OooO0oO;
            } else if ("udp".equals(scheme)) {
                if (this.f6994OooO0oo == null) {
                    UdpDataSource udpDataSource = new UdpDataSource();
                    this.f6994OooO0oo = udpDataSource;
                    OooOO0o(udpDataSource);
                }
                this.f6996OooOO0O = this.f6994OooO0oo;
            } else if ("data".equals(scheme)) {
                if (this.f6986OooO == null) {
                    o000O0O.OooO0O0 oooO0O0 = new o000O0O.OooO0O0();
                    this.f6986OooO = oooO0O0;
                    OooOO0o(oooO0O0);
                }
                this.f6996OooOO0O = this.f6986OooO;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f6995OooOO0 == null) {
                    RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(context);
                    this.f6995OooOO0 = rawResourceDataSource;
                    OooOO0o(rawResourceDataSource);
                }
                this.f6996OooOO0O = this.f6995OooOO0;
            } else {
                this.f6996OooOO0O = oooO00o;
            }
        }
        return this.f6996OooOO0O.OooO00o(dataSpec);
    }

    @Override // androidx.media3.datasource.OooO00o
    @UnstableApi
    public final Map<String, List<String>> OooO0Oo() {
        androidx.media3.datasource.OooO00o oooO00o = this.f6996OooOO0O;
        return oooO00o == null ? Collections.emptyMap() : oooO00o.OooO0Oo();
    }

    @Override // androidx.media3.datasource.OooO00o
    @UnstableApi
    public final void OooO0oO(OooOo oooOo) {
        oooOo.getClass();
        this.f6989OooO0OO.OooO0oO(oooOo);
        this.f6988OooO0O0.add(oooOo);
        OooOOO0(this.f6990OooO0Oo, oooOo);
        OooOOO0(this.f6992OooO0o0, oooOo);
        OooOOO0(this.f6991OooO0o, oooOo);
        OooOOO0(this.f6993OooO0oO, oooOo);
        OooOOO0(this.f6994OooO0oo, oooOo);
        OooOOO0(this.f6986OooO, oooOo);
        OooOOO0(this.f6995OooOO0, oooOo);
    }

    @Override // androidx.media3.datasource.OooO00o
    @Nullable
    @UnstableApi
    public final Uri OooOO0O() {
        androidx.media3.datasource.OooO00o oooO00o = this.f6996OooOO0O;
        if (oooO00o == null) {
            return null;
        }
        return oooO00o.OooOO0O();
    }

    public final void OooOO0o(androidx.media3.datasource.OooO00o oooO00o) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f6988OooO0O0;
            if (i >= arrayList.size()) {
                return;
            }
            oooO00o.OooO0oO((OooOo) arrayList.get(i));
            i++;
        }
    }

    @Override // androidx.media3.datasource.OooO00o
    @UnstableApi
    public final void close() throws IOException {
        androidx.media3.datasource.OooO00o oooO00o = this.f6996OooOO0O;
        if (oooO00o != null) {
            try {
                oooO00o.close();
            } finally {
                this.f6996OooOO0O = null;
            }
        }
    }

    @Override // p069o0000ooO.o00000O0
    @UnstableApi
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        androidx.media3.datasource.OooO00o oooO00o = this.f6996OooOO0O;
        oooO00o.getClass();
        return oooO00o.read(bArr, i, i2);
    }
}
