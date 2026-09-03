package com.google.android.exoplayer2.source;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.OooO0o;
import com.google.android.exoplayer2.source.OooOOOO;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.o000oOoO;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.util.Log;
import com.google.common.base.o0O0O00;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p207o00o0oOo.o0O00O0o;
import p209o00o0oo0.o00O00o0;
import p209o00o0oo0.o00O0O0;
import p209o00o0oo0.o00O0O00;
import p209o00o0oo0.o00O0OO0;
import p209o00o0oo0.o00OO0O0;
import p209o00o0oo0.o00OO0OO;
import p209o00o0oo0.oo00o;
import p244o00oo0Oo.o000OOo0;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO0o implements OooOOOO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f13000OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0215OooO00o f13001OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public LoadErrorHandlingPolicy f13002OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f13003OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f13004OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f13005OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float f13006OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final float f13007OooO0oo;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00O0OO0 f13008OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final HashMap f13009OooO0O0 = new HashMap();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final HashSet f13010OooO0OO = new HashSet();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final HashMap f13011OooO0Oo = new HashMap();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public o0O00O0o f13012OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0215OooO00o f13013OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public LoadErrorHandlingPolicy f13014OooO0oO;

        public OooO00o(oo00o oo00oVar) {
            this.f13008OooO00o = oo00oVar;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x007a  */
        @Nullable
        public final o0O0O00<OooOOOO.OooO00o> OooO00o(int i) {
            o0O0O00<OooOOOO.OooO00o> o0o0o00;
            o0O0O00<OooOOOO.OooO00o> o0o0o01;
            HashMap map = this.f13009OooO0O0;
            if (map.containsKey(Integer.valueOf(i))) {
                return (o0O0O00) map.get(Integer.valueOf(i));
            }
            final com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0215OooO00o interfaceC0215OooO00o = this.f13013OooO0o0;
            interfaceC0215OooO00o.getClass();
            try {
                if (i == 0) {
                    final Class clsAsSubclass = DashMediaSource.Factory.class.asSubclass(OooOOOO.OooO00o.class);
                    o0o0o01 = new o0O0O00() { // from class: o00oOo00.o000000
                        @Override // com.google.common.base.o0O0O00
                        public final Object get() {
                            return OooO0o.OooO0o0(clsAsSubclass, interfaceC0215OooO00o);
                        }
                    };
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            final Class<? extends U> clsAsSubclass2 = Class.forName("com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory").asSubclass(OooOOOO.OooO00o.class);
                            o0o0o01 = new o0O0O00() { // from class: o00oOo00.o00000
                                @Override // com.google.common.base.o0O0O00
                                public final Object get() {
                                    return OooO0o.OooO0o0(clsAsSubclass2, interfaceC0215OooO00o);
                                }
                            };
                        } else if (i != 3) {
                            o0o0o00 = i != 4 ? null : new o0O0O00() { // from class: o00oOo00.o00000O
                                @Override // com.google.common.base.o0O0O00
                                public final Object get() {
                                    return new o000oOoO.OooO0O0(interfaceC0215OooO00o, this.f39830OooO0Oo.f13008OooO00o);
                                }
                            };
                        } else {
                            final Class<? extends U> clsAsSubclass3 = Class.forName("com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory").asSubclass(OooOOOO.OooO00o.class);
                            o0o0o00 = new o0O0O00() { // from class: o00oOo00.o00000O0
                                @Override // com.google.common.base.o0O0O00
                                public final Object get() {
                                    try {
                                        return (OooOOOO.OooO00o) clsAsSubclass3.getConstructor(new Class[0]).newInstance(new Object[0]);
                                    } catch (Exception e) {
                                        throw new IllegalStateException(e);
                                    }
                                }
                            };
                        }
                        map.put(Integer.valueOf(i), o0o0o00);
                        if (o0o0o00 != null) {
                            this.f13010OooO0OO.add(Integer.valueOf(i));
                        }
                        return o0o0o00;
                    }
                    final Class<? extends U> clsAsSubclass4 = Class.forName("com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(OooOOOO.OooO00o.class);
                    o0o0o01 = new o0O0O00() { // from class: o00oOo00.o000000O
                        @Override // com.google.common.base.o0O0O00
                        public final Object get() {
                            return OooO0o.OooO0o0(clsAsSubclass4, interfaceC0215OooO00o);
                        }
                    };
                }
                o0o0o00 = o0o0o01;
            } catch (ClassNotFoundException unused) {
            }
            map.put(Integer.valueOf(i), o0o0o00);
            if (o0o0o00 != null) {
                this.f13010OooO0OO.add(Integer.valueOf(i));
            }
            return o0o0o00;
        }
    }

    public static final class OooO0O0 implements Extractor {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final com.google.android.exoplayer2.OooOo f13015OooO00o;

        public OooO0O0(com.google.android.exoplayer2.OooOo oooOo) {
            this.f13015OooO00o = oooOo;
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public final void OooO0O0(long j, long j2) {
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public final boolean OooO0Oo(o00O0O00 o00o0o01) {
            return true;
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public final int OooO0oO(o00O0O00 o00o0o01, o00OO0O0 o00oo0o1) throws IOException {
            return ((o00O00o0) o00o0o01).OooOOOo(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public final void OooO0oo(o00O0O0 o00o0o0) {
            TrackOutput trackOutputOooOOO = o00o0o0.OooOOO(0, 3);
            o00o0o0.OooO0O0(new o00OO0OO.OooO0O0(-9223372036854775807L));
            o00o0o0.OooO00o();
            com.google.android.exoplayer2.OooOo oooOo = this.f13015OooO00o;
            oooOo.getClass();
            com.google.android.exoplayer2.OooOo.OooO00o oooO00o = new com.google.android.exoplayer2.OooOo.OooO00o(oooOo);
            oooO00o.f11244OooOO0O = "text/x-unknown";
            oooO00o.f11242OooO0oo = oooOo.f11211OooOOOO;
            trackOutputOooOOO.OooO0OO(new com.google.android.exoplayer2.OooOo(oooO00o));
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public final void release() {
        }
    }

    public OooO0o(Context context, oo00o oo00oVar) {
        this(new com.google.android.exoplayer2.upstream.OooO0O0.OooO00o(context), oo00oVar);
    }

    public static OooOOOO.OooO00o OooO0o0(Class cls, com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0215OooO00o interfaceC0215OooO00o) {
        try {
            return (OooOOOO.OooO00o) cls.getConstructor(com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0215OooO00o.class).newInstance(interfaceC0215OooO00o);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO.OooO00o
    public final OooOOOO OooO00o(com.google.android.exoplayer2.o000oOoO o000oooo2) {
        com.google.android.exoplayer2.o000oOoO o000ooooOooO00o = o000oooo2;
        o000ooooOooO00o.f12670OooO0o0.getClass();
        com.google.android.exoplayer2.o000oOoO.OooOO0O oooOO0O = o000ooooOooO00o.f12670OooO0o0;
        String scheme = oooOO0O.f12759OooO0Oo.getScheme();
        OooOOOO.OooO00o oooO00o = null;
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        int iOooOooo = o0O00.OooOooo(oooOO0O.f12759OooO0Oo, oooOO0O.f12761OooO0o0);
        OooO00o oooO00o2 = this.f13000OooO00o;
        HashMap map = oooO00o2.f13011OooO0Oo;
        OooOOOO.OooO00o oooO00o3 = (OooOOOO.OooO00o) map.get(Integer.valueOf(iOooOooo));
        if (oooO00o3 != null) {
            oooO00o = oooO00o3;
        } else {
            o0O0O00<OooOOOO.OooO00o> o0o0o00OooO00o = oooO00o2.OooO00o(iOooOooo);
            if (o0o0o00OooO00o != null) {
                oooO00o = o0o0o00OooO00o.get();
                oooO00o2.getClass();
                o0O00O0o o0o00o0o = oooO00o2.f13012OooO0o;
                if (o0o00o0o != null) {
                    oooO00o.OooO0Oo(o0o00o0o);
                }
                LoadErrorHandlingPolicy loadErrorHandlingPolicy = oooO00o2.f13014OooO0oO;
                if (loadErrorHandlingPolicy != null) {
                    oooO00o.OooO0O0(loadErrorHandlingPolicy);
                }
                map.put(Integer.valueOf(iOooOooo), oooO00o);
            }
        }
        o00O000o.OooO0o(oooO00o, "No suitable media source factory found for content type: " + iOooOooo);
        com.google.android.exoplayer2.o000oOoO.OooOO0 oooOO1 = o000ooooOooO00o.f12669OooO0o;
        oooOO1.getClass();
        com.google.android.exoplayer2.o000oOoO.OooOO0 oooOO2 = new com.google.android.exoplayer2.o000oOoO.OooOO0(oooOO1.f12740OooO0Oo == -9223372036854775807L ? this.f13003OooO0Oo : oooOO1.f12740OooO0Oo, oooOO1.f12742OooO0o0 == -9223372036854775807L ? this.f13005OooO0o0 : oooOO1.f12742OooO0o0, oooOO1.f12741OooO0o == -9223372036854775807L ? this.f13004OooO0o : oooOO1.f12741OooO0o, oooOO1.f12743OooO0oO == -3.4028235E38f ? this.f13006OooO0oO : oooOO1.f12743OooO0oO, oooOO1.f12744OooO0oo == -3.4028235E38f ? this.f13007OooO0oo : oooOO1.f12744OooO0oo);
        if (!oooOO2.equals(oooOO1)) {
            com.google.android.exoplayer2.o000oOoO.OooO0O0 oooO0O0 = new com.google.android.exoplayer2.o000oOoO.OooO0O0(o000ooooOooO00o);
            oooO0O0.f12713OooOO0o = new com.google.android.exoplayer2.o000oOoO.OooOO0.OooO00o(oooOO2);
            o000ooooOooO00o = oooO0O0.OooO00o();
        }
        OooOOOO oooOOOOOooO00o = oooO00o.OooO00o(o000ooooOooO00o);
        ImmutableList<com.google.android.exoplayer2.o000oOoO.OooOOOO> immutableList = o000ooooOooO00o.f12670OooO0o0.f12764OooOO0;
        if (!immutableList.isEmpty()) {
            OooOOOO[] oooOOOOArr = new OooOOOO[immutableList.size() + 1];
            int i = 0;
            oooOOOOArr[0] = oooOOOOOooO00o;
            while (i < immutableList.size()) {
                com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0215OooO00o interfaceC0215OooO00o = this.f13001OooO0O0;
                interfaceC0215OooO00o.getClass();
                LoadErrorHandlingPolicy oooO = new com.google.android.exoplayer2.upstream.OooO();
                LoadErrorHandlingPolicy loadErrorHandlingPolicy2 = this.f13002OooO0OO;
                if (loadErrorHandlingPolicy2 != null) {
                    oooO = loadErrorHandlingPolicy2;
                }
                int i2 = i + 1;
                oooOOOOArr[i2] = new o00oO0o(immutableList.get(i), interfaceC0215OooO00o, oooO);
                i = i2;
            }
            oooOOOOOooO00o = new MergingMediaSource(oooOOOOArr);
        }
        OooOOOO clippingMediaSource = oooOOOOOooO00o;
        com.google.android.exoplayer2.o000oOoO.OooO0o oooO0o = o000ooooOooO00o.f12672OooO0oo;
        long j = oooO0o.f12722OooO0Oo;
        long j2 = oooO0o.f12724OooO0o0;
        if (j != 0 || j2 != Long.MIN_VALUE || oooO0o.f12725OooO0oO) {
            clippingMediaSource = new ClippingMediaSource(clippingMediaSource, o0O00.Oooo0O0(j), o0O00.Oooo0O0(j2), !oooO0o.f12726OooO0oo, oooO0o.f12723OooO0o, oooO0o.f12725OooO0oO);
        }
        com.google.android.exoplayer2.o000oOoO.OooOO0O oooOO0O2 = o000ooooOooO00o.f12670OooO0o0;
        oooOO0O2.getClass();
        if (oooOO0O2.f12762OooO0oO != null) {
            Log.OooO0o("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
        }
        return clippingMediaSource;
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO.OooO00o
    @CanIgnoreReturnValue
    public final OooOOOO.OooO00o OooO0O0(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        if (loadErrorHandlingPolicy == null) {
            throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        }
        this.f13002OooO0OO = loadErrorHandlingPolicy;
        OooO00o oooO00o = this.f13000OooO00o;
        oooO00o.f13014OooO0oO = loadErrorHandlingPolicy;
        Iterator it = oooO00o.f13011OooO0Oo.values().iterator();
        while (it.hasNext()) {
            ((OooOOOO.OooO00o) it.next()).OooO0O0(loadErrorHandlingPolicy);
        }
        return this;
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO.OooO00o
    @CanIgnoreReturnValue
    public final OooOOOO.OooO00o OooO0OO(o000OOo0 o000ooo1) {
        o000ooo1.getClass();
        OooO00o oooO00o = this.f13000OooO00o;
        oooO00o.getClass();
        Iterator it = oooO00o.f13011OooO0Oo.values().iterator();
        while (it.hasNext()) {
            ((OooOOOO.OooO00o) it.next()).OooO0OO(o000ooo1);
        }
        return this;
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO.OooO00o
    @CanIgnoreReturnValue
    public final OooOOOO.OooO00o OooO0Oo(o0O00O0o o0o00o0o) {
        if (o0o00o0o == null) {
            throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        }
        OooO00o oooO00o = this.f13000OooO00o;
        oooO00o.f13012OooO0o = o0o00o0o;
        Iterator it = oooO00o.f13011OooO0Oo.values().iterator();
        while (it.hasNext()) {
            ((OooOOOO.OooO00o) it.next()).OooO0Oo(o0o00o0o);
        }
        return this;
    }

    public OooO0o(com.google.android.exoplayer2.upstream.OooO0O0.OooO00o oooO00o, oo00o oo00oVar) {
        this.f13001OooO0O0 = oooO00o;
        OooO00o oooO00o2 = new OooO00o(oo00oVar);
        this.f13000OooO00o = oooO00o2;
        if (oooO00o != oooO00o2.f13013OooO0o0) {
            oooO00o2.f13013OooO0o0 = oooO00o;
            oooO00o2.f13009OooO0O0.clear();
            oooO00o2.f13011OooO0Oo.clear();
        }
        this.f13003OooO0Oo = -9223372036854775807L;
        this.f13005OooO0o0 = -9223372036854775807L;
        this.f13004OooO0o = -9223372036854775807L;
        this.f13006OooO0oO = -3.4028235E38f;
        this.f13007OooO0oo = -3.4028235E38f;
    }
}
