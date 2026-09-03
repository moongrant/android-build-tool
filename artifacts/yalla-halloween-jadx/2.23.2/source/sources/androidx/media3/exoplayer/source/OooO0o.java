package androidx.media3.exoplayer.source;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.TrackOutput;
import com.google.common.base.o000OOo;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o000OOoO.o000000;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements OooOOOO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f7899OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final androidx.media3.datasource.OooO00o.InterfaceC0142OooO00o f7900OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public LoadErrorHandlingPolicy f7901OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f7902OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f7903OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f7904OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float f7905OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final float f7906OooO0oo;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000OOoO.o0OoOo0 f7907OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final HashMap f7908OooO0O0 = new HashMap();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final HashSet f7909OooO0OO = new HashSet();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final HashMap f7910OooO0Oo = new HashMap();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public o000OO0O.OooOO0O f7911OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public androidx.media3.datasource.OooO00o.InterfaceC0142OooO00o f7912OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public LoadErrorHandlingPolicy f7913OooO0oO;

        public OooO00o(o000OOoO.OooOOO oooOOO) {
            this.f7907OooO00o = oooOOO;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x007e  */
        @Nullable
        public final o000OOo<OooOOOO.OooO00o> OooO00o(int i) {
            o000OOo<OooOOOO.OooO00o> o000ooo2;
            o000OOo<OooOOOO.OooO00o> o000ooo3;
            HashMap map = this.f7908OooO0O0;
            if (map.containsKey(Integer.valueOf(i))) {
                return (o000OOo) map.get(Integer.valueOf(i));
            }
            final androidx.media3.datasource.OooO00o.InterfaceC0142OooO00o interfaceC0142OooO00o = this.f7912OooO0o0;
            interfaceC0142OooO00o.getClass();
            try {
                if (i == 0) {
                    final Class<? extends U> clsAsSubclass = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(OooOOOO.OooO00o.class);
                    o000ooo3 = new o000OOo() { // from class: o000O.OooO
                        @Override // com.google.common.base.o000OOo
                        public final Object get() {
                            return androidx.media3.exoplayer.source.OooO0o.OooO0o0(clsAsSubclass, interfaceC0142OooO00o);
                        }
                    };
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            final Class<? extends U> clsAsSubclass2 = Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(OooOOOO.OooO00o.class);
                            o000ooo3 = new o000OOo() { // from class: o000O.OooOO0O
                                @Override // com.google.common.base.o000OOo
                                public final Object get() {
                                    return androidx.media3.exoplayer.source.OooO0o.OooO0o0(clsAsSubclass2, interfaceC0142OooO00o);
                                }
                            };
                        } else if (i != 3) {
                            o000ooo2 = i != 4 ? null : new o000OOo() { // from class: o000O.OooOOO
                                @Override // com.google.common.base.o000OOo
                                public final Object get() {
                                    return new androidx.media3.exoplayer.source.o000oOoO.OooO0O0(interfaceC0142OooO00o, this.f33839OooO0Oo.f7907OooO00o);
                                }
                            };
                        } else {
                            final Class<? extends U> clsAsSubclass3 = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(OooOOOO.OooO00o.class);
                            o000ooo2 = new o000OOo() { // from class: o000O.OooOOO0
                                @Override // com.google.common.base.o000OOo
                                public final Object get() {
                                    try {
                                        return (androidx.media3.exoplayer.source.OooOOOO.OooO00o) clsAsSubclass3.getConstructor(new Class[0]).newInstance(new Object[0]);
                                    } catch (Exception e) {
                                        throw new IllegalStateException(e);
                                    }
                                }
                            };
                        }
                        map.put(Integer.valueOf(i), o000ooo2);
                        if (o000ooo2 != null) {
                            this.f7909OooO0OO.add(Integer.valueOf(i));
                        }
                        return o000ooo2;
                    }
                    final Class<? extends U> clsAsSubclass4 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(OooOOOO.OooO00o.class);
                    o000ooo3 = new o000OOo() { // from class: o000O.OooOO0
                        @Override // com.google.common.base.o000OOo
                        public final Object get() {
                            return androidx.media3.exoplayer.source.OooO0o.OooO0o0(clsAsSubclass4, interfaceC0142OooO00o);
                        }
                    };
                }
                o000ooo2 = o000ooo3;
            } catch (ClassNotFoundException unused) {
            }
            map.put(Integer.valueOf(i), o000ooo2);
            if (o000ooo2 != null) {
                this.f7909OooO0OO.add(Integer.valueOf(i));
            }
            return o000ooo2;
        }
    }

    public static final class OooO0O0 implements Extractor {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final androidx.media3.common.OooOO0 f7914OooO00o;

        public OooO0O0(androidx.media3.common.OooOO0 oooOO1) {
            this.f7914OooO00o = oooOO1;
        }

        @Override // androidx.media3.extractor.Extractor
        public final int OooO00o(o000OOoO.Oooo000 oooo000, o000OOoO.o000OOo o000ooo2) throws IOException {
            return ((o000OOoO.OooOO0O) oooo000).OooOOOo(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // androidx.media3.extractor.Extractor
        public final void OooO0O0(long j, long j2) {
        }

        @Override // androidx.media3.extractor.Extractor
        public final void OooO0OO(o000OOoO.Oooo0 oooo0) {
            TrackOutput trackOutputOooOOOO = oooo0.OooOOOO(0, 3);
            oooo0.OooO(new o000000.OooO0O0(-9223372036854775807L));
            oooo0.OooOO0O();
            androidx.media3.common.OooOO0 oooOO1 = this.f7914OooO00o;
            oooOO1.getClass();
            androidx.media3.common.OooOO0.OooO00o oooO00o = new androidx.media3.common.OooOO0.OooO00o(oooOO1);
            oooO00o.f6445OooOO0O = "text/x-unknown";
            oooO00o.f6443OooO0oo = oooOO1.f6412OooOOOO;
            trackOutputOooOOOO.OooO0O0(new androidx.media3.common.OooOO0(oooO00o));
        }

        @Override // androidx.media3.extractor.Extractor
        public final boolean OooO0o(o000OOoO.Oooo000 oooo000) {
            return true;
        }

        @Override // androidx.media3.extractor.Extractor
        public final void release() {
        }
    }

    @UnstableApi
    public OooO0o(Context context, o000OOoO.OooOOO oooOOO) {
        this(new androidx.media3.datasource.OooO0O0.OooO00o(context), oooOOO);
    }

    public static OooOOOO.OooO00o OooO0o0(Class cls, androidx.media3.datasource.OooO00o.InterfaceC0142OooO00o interfaceC0142OooO00o) {
        try {
            return (OooOOOO.OooO00o) cls.getConstructor(androidx.media3.datasource.OooO00o.InterfaceC0142OooO00o.class).newInstance(interfaceC0142OooO00o);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // androidx.media3.exoplayer.source.OooOOOO.OooO00o
    @UnstableApi
    public final OooOOOO OooO00o(androidx.media3.common.OooOOO0 oooOOO0) {
        androidx.media3.common.OooOOO0 oooOOO0OooO00o = oooOOO0;
        oooOOO0OooO00o.f6486OooO0o0.getClass();
        androidx.media3.common.OooOOO0.OooOO0O oooOO0O = oooOOO0OooO00o.f6486OooO0o0;
        String scheme = oooOO0O.f6575OooO0Oo.getScheme();
        OooOOOO.OooO00o oooO00o = null;
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        int iOooo000 = o00.Oooo000(oooOO0O.f6575OooO0Oo, oooOO0O.f6577OooO0o0);
        OooO00o oooO00o2 = this.f7899OooO00o;
        HashMap map = oooO00o2.f7910OooO0Oo;
        OooOOOO.OooO00o oooO00o3 = (OooOOOO.OooO00o) map.get(Integer.valueOf(iOooo000));
        if (oooO00o3 != null) {
            oooO00o = oooO00o3;
        } else {
            o000OOo<OooOOOO.OooO00o> o000oooOooO00o = oooO00o2.OooO00o(iOooo000);
            if (o000oooOooO00o != null) {
                oooO00o = o000oooOooO00o.get();
                oooO00o2.getClass();
                o000OO0O.OooOO0O oooOO0O2 = oooO00o2.f7911OooO0o;
                if (oooOO0O2 != null) {
                    oooO00o.OooO0O0(oooOO0O2);
                }
                LoadErrorHandlingPolicy loadErrorHandlingPolicy = oooO00o2.f7913OooO0oO;
                if (loadErrorHandlingPolicy != null) {
                    oooO00o.OooO0Oo(loadErrorHandlingPolicy);
                }
                map.put(Integer.valueOf(iOooo000), oooO00o);
            }
        }
        p080o000OoO.o00Oo0.OooO0oO(oooO00o, "No suitable media source factory found for content type: " + iOooo000);
        androidx.media3.common.OooOOO0.OooOO0 oooOO1 = oooOOO0OooO00o.f6485OooO0o;
        oooOO1.getClass();
        androidx.media3.common.OooOOO0.OooOO0 oooOO2 = new androidx.media3.common.OooOOO0.OooOO0(oooOO1.f6556OooO0Oo == -9223372036854775807L ? this.f7902OooO0Oo : oooOO1.f6556OooO0Oo, oooOO1.f6558OooO0o0 == -9223372036854775807L ? this.f7904OooO0o0 : oooOO1.f6558OooO0o0, oooOO1.f6557OooO0o == -9223372036854775807L ? this.f7903OooO0o : oooOO1.f6557OooO0o, oooOO1.f6559OooO0oO == -3.4028235E38f ? this.f7905OooO0oO : oooOO1.f6559OooO0oO, oooOO1.f6560OooO0oo == -3.4028235E38f ? this.f7906OooO0oo : oooOO1.f6560OooO0oo);
        if (!oooOO2.equals(oooOO1)) {
            androidx.media3.common.OooOOO0.OooO0O0 oooO0O0 = new androidx.media3.common.OooOOO0.OooO0O0(oooOOO0OooO00o);
            oooO0O0.f6529OooOO0o = new androidx.media3.common.OooOOO0.OooOO0.OooO00o(oooOO2);
            oooOOO0OooO00o = oooO0O0.OooO00o();
        }
        OooOOOO oooOOOOOooO00o = oooO00o.OooO00o(oooOOO0OooO00o);
        ImmutableList<androidx.media3.common.OooOOO0.OooOOOO> immutableList = oooOOO0OooO00o.f6486OooO0o0.f6580OooOO0;
        if (!immutableList.isEmpty()) {
            OooOOOO[] oooOOOOArr = new OooOOOO[immutableList.size() + 1];
            int i = 0;
            oooOOOOArr[0] = oooOOOOOooO00o;
            while (i < immutableList.size()) {
                androidx.media3.datasource.OooO00o.InterfaceC0142OooO00o interfaceC0142OooO00o = this.f7900OooO0O0;
                interfaceC0142OooO00o.getClass();
                LoadErrorHandlingPolicy oooO00o4 = new androidx.media3.exoplayer.upstream.OooO00o();
                LoadErrorHandlingPolicy loadErrorHandlingPolicy2 = this.f7901OooO0OO;
                if (loadErrorHandlingPolicy2 != null) {
                    oooO00o4 = loadErrorHandlingPolicy2;
                }
                int i2 = i + 1;
                oooOOOOArr[i2] = new o00oO0o(immutableList.get(i), interfaceC0142OooO00o, oooO00o4);
                i = i2;
            }
            oooOOOOOooO00o = new MergingMediaSource(oooOOOOArr);
        }
        OooOOOO clippingMediaSource = oooOOOOOooO00o;
        androidx.media3.common.OooOOO0.OooO0o oooO0o = oooOOO0OooO00o.f6488OooO0oo;
        long j = oooO0o.f6538OooO0Oo;
        long j2 = oooO0o.f6540OooO0o0;
        if (j != 0 || j2 != Long.MIN_VALUE || oooO0o.f6541OooO0oO) {
            clippingMediaSource = new ClippingMediaSource(clippingMediaSource, o00.Oooo0OO(j), o00.Oooo0OO(j2), !oooO0o.f6542OooO0oo, oooO0o.f6539OooO0o, oooO0o.f6541OooO0oO);
        }
        androidx.media3.common.OooOOO0.OooOO0O oooOO0O3 = oooOOO0OooO00o.f6486OooO0o0;
        oooOO0O3.getClass();
        if (oooOO0O3.f6578OooO0oO != null) {
            Log.OooO0o("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
        }
        return clippingMediaSource;
    }

    @Override // androidx.media3.exoplayer.source.OooOOOO.OooO00o
    @CanIgnoreReturnValue
    @UnstableApi
    public final OooOOOO.OooO00o OooO0O0(o000OO0O.OooOO0O oooOO0O) {
        if (oooOO0O == null) {
            throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        }
        OooO00o oooO00o = this.f7899OooO00o;
        oooO00o.f7911OooO0o = oooOO0O;
        Iterator it = oooO00o.f7910OooO0Oo.values().iterator();
        while (it.hasNext()) {
            ((OooOOOO.OooO00o) it.next()).OooO0O0(oooOO0O);
        }
        return this;
    }

    @Override // androidx.media3.exoplayer.source.OooOOOO.OooO00o
    @CanIgnoreReturnValue
    @UnstableApi
    public final OooOOOO.OooO00o OooO0OO(p074o000OO0o.o00oO0o o00oo0o2) {
        o00oo0o2.getClass();
        OooO00o oooO00o = this.f7899OooO00o;
        oooO00o.getClass();
        Iterator it = oooO00o.f7910OooO0Oo.values().iterator();
        while (it.hasNext()) {
            ((OooOOOO.OooO00o) it.next()).OooO0OO(o00oo0o2);
        }
        return this;
    }

    @Override // androidx.media3.exoplayer.source.OooOOOO.OooO00o
    @CanIgnoreReturnValue
    @UnstableApi
    public final OooOOOO.OooO00o OooO0Oo(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        if (loadErrorHandlingPolicy == null) {
            throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        }
        this.f7901OooO0OO = loadErrorHandlingPolicy;
        OooO00o oooO00o = this.f7899OooO00o;
        oooO00o.f7913OooO0oO = loadErrorHandlingPolicy;
        Iterator it = oooO00o.f7910OooO0Oo.values().iterator();
        while (it.hasNext()) {
            ((OooOOOO.OooO00o) it.next()).OooO0Oo(loadErrorHandlingPolicy);
        }
        return this;
    }

    @UnstableApi
    public OooO0o(androidx.media3.datasource.OooO0O0.OooO00o oooO00o, o000OOoO.OooOOO oooOOO) {
        this.f7900OooO0O0 = oooO00o;
        OooO00o oooO00o2 = new OooO00o(oooOOO);
        this.f7899OooO00o = oooO00o2;
        if (oooO00o != oooO00o2.f7912OooO0o0) {
            oooO00o2.f7912OooO0o0 = oooO00o;
            oooO00o2.f7908OooO0O0.clear();
            oooO00o2.f7910OooO0Oo.clear();
        }
        this.f7902OooO0Oo = -9223372036854775807L;
        this.f7904OooO0o0 = -9223372036854775807L;
        this.f7903OooO0o = -9223372036854775807L;
        this.f7905OooO0oO = -3.4028235E38f;
        this.f7906OooO0oo = -3.4028235E38f;
    }
}
