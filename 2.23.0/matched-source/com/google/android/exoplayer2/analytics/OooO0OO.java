package com.google.android.exoplayer2.analytics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.UnsupportedDrmException;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.o000oOoO;
import com.google.android.exoplayer2.o0O0O00;
import com.google.android.exoplayer2.oo0o0Oo;
import com.google.android.exoplayer2.source.OooOOOO;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.android.exoplayer2.upstream.UdpDataSource;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p200o00o0o.o00OOOO0;
import p200o00o0o.o00Oo00;
import p200o00o0o.o0O000;
import p200o00o0o.o0O00OOO;
import p200o00o0o.o0oO0O0o;
import p206o00o0oOO.o0;
import p226o00oOo00.o0000O00;
import p245o00oo0o.o0O00;
import p247o00oo0oO.o0oOOo;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(31)
@Deprecated
public final class OooO0OO implements AnalyticsListener, OooO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public String f11405OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f11406OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final com.google.android.exoplayer2.analytics.OooO0O0 f11407OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final PlaybackSession f11408OooO0OO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public PlaybackMetrics.Builder f11414OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f11415OooOO0O;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public PlaybackException f11417OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public OooO0O0 f11419OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public OooO0O0 f11420OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public OooOo f11421OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public OooO0O0 f11422OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public OooOo f11423OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f11424OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f11425OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public OooOo f11426OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f11427OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f11428OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f11429OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f11430OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f11431OooOoOO;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final oo0o0Oo.OooO0OO f11411OooO0o0 = new oo0o0Oo.OooO0OO();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final oo0o0Oo.OooO0O0 f11410OooO0o = new oo0o0Oo.OooO0O0();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final HashMap<String, Long> f11413OooO0oo = new HashMap<>();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final HashMap<String, Long> f11412OooO0oO = new HashMap<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f11409OooO0Oo = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f11416OooOO0o = 0;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f11418OooOOO0 = 0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f11432OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f11433OooO0O0;

        public OooO00o(int i, int i2) {
            this.f11432OooO00o = i;
            this.f11433OooO0O0 = i2;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOo f11434OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f11435OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f11436OooO0OO;

        public OooO0O0(OooOo oooOo, int i, String str) {
            this.f11434OooO00o = oooOo;
            this.f11435OooO0O0 = i;
            this.f11436OooO0OO = str;
        }
    }

    public OooO0OO(Context context, PlaybackSession playbackSession) {
        this.f11406OooO00o = context.getApplicationContext();
        this.f11408OooO0OO = playbackSession;
        com.google.android.exoplayer2.analytics.OooO0O0 oooO0O0 = new com.google.android.exoplayer2.analytics.OooO0O0();
        this.f11407OooO0O0 = oooO0O0;
        oooO0O0.f11395OooO0Oo = this;
    }

    @SuppressLint({"SwitchIntDef"})
    public static int OooO0Oo(int i) {
        switch (o0O00.OooOOOo(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    public final boolean OooO00o(@Nullable OooO0O0 oooO0O0) {
        String str;
        if (oooO0O0 != null) {
            String str2 = oooO0O0.f11436OooO0OO;
            com.google.android.exoplayer2.analytics.OooO0O0 oooO0O1 = this.f11407OooO0O0;
            synchronized (oooO0O1) {
                str = oooO0O1.f11396OooO0o;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void OooO0O0(o0 o0Var) {
        this.f11424OooOo += o0Var.f39405OooO0oO;
        this.f11430OooOoO0 += o0Var.f39404OooO0o0;
    }

    public final void OooO0OO() {
        PlaybackMetrics.Builder builder = this.f11414OooOO0;
        if (builder != null && this.f11431OooOoOO) {
            builder.setAudioUnderrunCount(this.f11429OooOoO);
            this.f11414OooOO0.setVideoFramesDropped(this.f11424OooOo);
            this.f11414OooOO0.setVideoFramesPlayed(this.f11430OooOoO0);
            Long l = this.f11412OooO0oO.get(this.f11405OooO);
            this.f11414OooOO0.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = this.f11413OooO0oo.get(this.f11405OooO);
            this.f11414OooOO0.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.f11414OooOO0.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.f11408OooO0OO.reportPlaybackMetrics(this.f11414OooOO0.build());
        }
        this.f11414OooOO0 = null;
        this.f11405OooO = null;
        this.f11429OooOoO = 0;
        this.f11424OooOo = 0;
        this.f11430OooOoO0 = 0;
        this.f11421OooOOo = null;
        this.f11423OooOOoo = null;
        this.f11426OooOo00 = null;
        this.f11431OooOoOO = false;
    }

    public final void OooO0o(AnalyticsListener.OooO00o oooO00o, String str) {
        OooOOOO.OooO0O0 oooO0O0 = oooO00o.f11367OooO0Oo;
        if ((oooO0O0 == null || !oooO0O0.OooO00o()) && str.equals(this.f11405OooO)) {
            OooO0OO();
        }
        this.f11412OooO0oO.remove(str);
        this.f11413OooO0oo.remove(str);
    }

    @RequiresNonNull({"metricsBuilder"})
    public final void OooO0o0(oo0o0Oo oo0o0oo, @Nullable OooOOOO.OooO0O0 oooO0O0) {
        int iOooO0O0;
        int i;
        PlaybackMetrics.Builder builder = this.f11414OooOO0;
        if (oooO0O0 == null || (iOooO0O0 = oo0o0oo.OooO0O0(oooO0O0.f39859OooO00o)) == -1) {
            return;
        }
        oo0o0Oo.OooO0O0 oooO0O1 = this.f11410OooO0o;
        oo0o0oo.OooO0o(iOooO0O0, oooO0O1);
        int i2 = oooO0O1.f12906OooO0o;
        oo0o0Oo.OooO0OO oooO0OO = this.f11411OooO0o0;
        oo0o0oo.OooOOO(i2, oooO0OO);
        o000oOoO.OooOO0O oooOO0O = oooO0OO.f12929OooO0o.f12670OooO0o0;
        if (oooOO0O == null) {
            i = 0;
        } else {
            int iOooOooo = o0O00.OooOooo(oooOO0O.f12759OooO0Oo, oooOO0O.f12761OooO0o0);
            if (iOooOooo == 0) {
                i = 3;
            } else if (iOooOooo != 1) {
                i = iOooOooo != 2 ? 1 : 4;
            } else {
                i = 5;
            }
        }
        builder.setStreamType(i);
        if (oooO0OO.f12941OooOOo0 != -9223372036854775807L && !oooO0OO.f12938OooOOOO && !oooO0OO.f12935OooOO0o && !oooO0OO.OooO00o()) {
            builder.setMediaDurationMillis(o0O00.OoooOO0(oooO0OO.f12941OooOOo0));
        }
        builder.setPlaybackType(oooO0OO.OooO00o() ? 2 : 1);
        this.f11431OooOoOO = true;
    }

    public final void OooO0oO(int i, long j, @Nullable OooOo oooOo, int i2) {
        int i3;
        TrackChangeEvent.Builder timeSinceCreatedMillis = o0oO0O0o.OooO00o(i).setTimeSinceCreatedMillis(j - this.f11409OooO0Oo);
        if (oooOo != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 1 : 4;
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str = oooOo.f11209OooOOO;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = oooOo.f11211OooOOOO;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = oooOo.f11208OooOO0o;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = oooOo.f11207OooOO0O;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = oooOo.f11218OooOo00;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = oooOo.f11217OooOo0;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = oooOo.f11225OooOoo0;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = oooOo.f11224OooOoo;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = oooOo.f11202OooO0o;
            if (str4 != null) {
                int i9 = o0O00.f40595OooO00o;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = oooOo.f11219OooOo0O;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f11431OooOoOO = true;
        this.f11408OooO0OO.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void OooOO0() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void OooOO0O() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void OooOo() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void OooOo0() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void OooOo00() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void OooOo0O() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void OooOo0o(o0000O00 o0000o00) {
        this.f11427OooOo0O = o0000o00.f39841OooO00o;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void OooOoO() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void OooOoO0() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void OooOoOO() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void OooOoo() {
    }

    /* JADX WARN: Code duplicated, block: B:248:0x0420  */
    /* JADX WARN: Code duplicated, block: B:333:0x053e A[PHI: r3
      0x053e: PHI (r3v55 int) = (r3v54 int), (r3v53 int), (r3v53 int) binds: [B:340:0x054f, B:323:0x0527, B:324:0x0529] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0, types: [com.google.android.exoplayer2.analytics.OooO0OO] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [int] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22, types: [int] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25, types: [int] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28, types: [int] */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31, types: [int] */
    /* JADX WARN: Type inference failed for: r6v32 */
    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void OooOoo0(Player player, AnalyticsListener.OooO0O0 oooO0O0) {
        int i;
        boolean z;
        int i2;
        char c;
        OooO00o oooO00o;
        OooO00o oooO00o2;
        OooO00o oooO00o3;
        char c2;
        OooO00o oooO00o4;
        int i3;
        int i4;
        int i5;
        ?? r6;
        int i6;
        DrmInitData drmInitData;
        int i7;
        if (oooO0O0.f11373OooO00o.OooO0O0() == 0) {
            return;
        }
        for (int i8 = 0; i8 < oooO0O0.f11373OooO00o.OooO0O0(); i8++) {
            int iOooO00o = oooO0O0.f11373OooO00o.OooO00o(i8);
            AnalyticsListener.OooO00o oooO00o5 = oooO0O0.f11374OooO0O0.get(iOooO00o);
            oooO00o5.getClass();
            if (iOooO00o == 0) {
                com.google.android.exoplayer2.analytics.OooO0O0 oooO0O1 = this.f11407OooO0O0;
                synchronized (oooO0O1) {
                    oooO0O1.f11395OooO0Oo.getClass();
                    oo0o0Oo oo0o0oo = oooO0O1.f11397OooO0o0;
                    oooO0O1.f11397OooO0o0 = oooO00o5.f11365OooO0O0;
                    Iterator<com.google.android.exoplayer2.analytics.OooO0O0.OooO00o> it = oooO0O1.f11394OooO0OO.values().iterator();
                    while (it.hasNext()) {
                        com.google.android.exoplayer2.analytics.OooO0O0.OooO00o next = it.next();
                        if (!next.OooO0O0(oo0o0oo, oooO0O1.f11397OooO0o0) || next.OooO00o(oooO00o5)) {
                            it.remove();
                            if (next.f11403OooO0o0) {
                                if (next.f11398OooO00o.equals(oooO0O1.f11396OooO0o)) {
                                    oooO0O1.f11396OooO0o = null;
                                }
                                ((OooO0OO) oooO0O1.f11395OooO0Oo).OooO0o(oooO00o5, next.f11398OooO00o);
                            }
                        }
                    }
                    oooO0O1.OooO0OO(oooO00o5);
                }
            } else if (iOooO00o == 11) {
                this.f11407OooO0O0.OooO0o0(oooO00o5, this.f11415OooOO0O);
            } else {
                this.f11407OooO0O0.OooO0Oo(oooO00o5);
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (oooO0O0.OooO00o(0)) {
            AnalyticsListener.OooO00o oooO00o6 = oooO0O0.f11374OooO0O0.get(0);
            oooO00o6.getClass();
            if (this.f11414OooOO0 != null) {
                OooO0o0(oooO00o6.f11365OooO0O0, oooO00o6.f11367OooO0Oo);
            }
        }
        boolean z2 = true;
        if (oooO0O0.OooO00o(2) && this.f11414OooOO0 != null) {
            ImmutableList.OooO0O0 oooO0O0ListIterator = player.OooO0oo().f12832OooO0Oo.listIterator(0);
            loop2: while (true) {
                if (!oooO0O0ListIterator.hasNext()) {
                    drmInitData = null;
                    break;
                }
                o0O0O00.OooO00o oooO00o7 = (o0O0O00.OooO00o) oooO0O0ListIterator.next();
                for (int i9 = 0; i9 < oooO00o7.f12837OooO0Oo; i9++) {
                    if (oooO00o7.f12841OooO0oo[i9] && (drmInitData = oooO00o7.f12839OooO0o0.f39876OooO0oO[i9].f11213OooOOo) != null) {
                        break loop2;
                    }
                }
            }
            if (drmInitData != null) {
                PlaybackMetrics.Builder builderOooO00o = o00Oo00.OooO00o(this.f11414OooOO0);
                int i10 = 0;
                while (true) {
                    if (i10 >= drmInitData.f11753OooO0oO) {
                        i7 = 1;
                        break;
                    }
                    UUID uuid = drmInitData.f11750OooO0Oo[i10].f11756OooO0o0;
                    if (uuid.equals(C.f10899OooO0Oo)) {
                        i7 = 3;
                        break;
                    } else if (uuid.equals(C.f10900OooO0o0)) {
                        i7 = 2;
                        break;
                    } else {
                        if (uuid.equals(C.f10898OooO0OO)) {
                            i7 = 6;
                            break;
                        }
                        i10++;
                    }
                }
                builderOooO00o.setDrmType(i7);
            }
        }
        if (oooO0O0.OooO00o(1011)) {
            this.f11429OooOoO++;
        }
        PlaybackException playbackException = this.f11417OooOOO;
        int i11 = 9;
        if (playbackException == null) {
            i3 = 2;
            i2 = 7;
            c = '\b';
        } else {
            boolean z3 = this.f11427OooOo0O == 4;
            int i12 = playbackException.f11340OooO0Oo;
            if (i12 == 1001) {
                oooO00o2 = new OooO00o(20, 0);
            } else {
                if (playbackException instanceof ExoPlaybackException) {
                    ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
                    boolean z4 = exoPlaybackException.f10921OooOO0O == 1;
                    i = exoPlaybackException.f10925OooOOOO;
                    z = z4;
                } else {
                    i = 0;
                    z = false;
                }
                Throwable cause = playbackException.getCause();
                cause.getClass();
                if (!(cause instanceof IOException)) {
                    i2 = 7;
                    c = '\b';
                    if (z && (i == 0 || i == 1)) {
                        oooO00o3 = new OooO00o(35, 0);
                    } else if (z && i == 3) {
                        oooO00o3 = new OooO00o(15, 0);
                    } else {
                        if (z && i == 2) {
                            oooO00o3 = new OooO00o(23, 0);
                        } else if (cause instanceof MediaCodecRenderer.DecoderInitializationException) {
                            oooO00o2 = new OooO00o(13, o0O00.OooOOo0(((MediaCodecRenderer.DecoderInitializationException) cause).f12492OooO0oO));
                        } else if (cause instanceof MediaCodecDecoderException) {
                            oooO00o2 = new OooO00o(14, o0O00.OooOOo0(((MediaCodecDecoderException) cause).f12419OooO0Oo));
                        } else {
                            if (cause instanceof OutOfMemoryError) {
                                oooO00o = new OooO00o(14, 0);
                            } else if (cause instanceof AudioSink.InitializationException) {
                                oooO00o2 = new OooO00o(17, ((AudioSink.InitializationException) cause).f11449OooO0Oo);
                            } else if (cause instanceof AudioSink.WriteException) {
                                oooO00o2 = new OooO00o(18, ((AudioSink.WriteException) cause).f11451OooO0Oo);
                            } else if (o0O00.f40595OooO00o < 16 || !(cause instanceof MediaCodec.CryptoException)) {
                                oooO00o = new OooO00o(22, 0);
                            } else {
                                int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                oooO00o2 = new OooO00o(OooO0Oo(errorCode), errorCode);
                            }
                            oooO00o2 = oooO00o;
                        }
                        this.f11408OooO0OO.reportPlaybackErrorEvent(o00OOOO0.OooO00o().setTimeSinceCreatedMillis(jElapsedRealtime - this.f11409OooO0Oo).setErrorCode(oooO00o2.f11432OooO00o).setSubErrorCode(oooO00o2.f11433OooO0O0).setException(playbackException).build());
                        z2 = true;
                        this.f11431OooOoOO = true;
                        this.f11417OooOOO = null;
                        i3 = 2;
                    }
                    oooO00o2 = oooO00o3;
                } else if (cause instanceof HttpDataSource$InvalidResponseCodeException) {
                    oooO00o2 = new OooO00o(5, ((HttpDataSource$InvalidResponseCodeException) cause).f14182OooO0oO);
                } else {
                    if ((cause instanceof HttpDataSource$InvalidContentTypeException) || (cause instanceof ParserException)) {
                        c2 = '\b';
                        i2 = 7;
                        oooO00o4 = new OooO00o(z3 ? 10 : 11, 0);
                    } else {
                        boolean z5 = cause instanceof HttpDataSource$HttpDataSourceException;
                        if (z5 || (cause instanceof UdpDataSource.UdpDataSourceException)) {
                            if (p245o00oo0o.o00OOOO0.OooO0O0(this.f11406OooO00o).OooO0OO() == 1) {
                                oooO00o2 = new OooO00o(3, 0);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    oooO00o2 = new OooO00o(6, 0);
                                } else {
                                    if (cause2 instanceof SocketTimeoutException) {
                                        i2 = 7;
                                        oooO00o4 = new OooO00o(7, 0);
                                    } else {
                                        i2 = 7;
                                        if (z5 && ((HttpDataSource$HttpDataSourceException) cause).f14181OooO0o == 1) {
                                            oooO00o4 = new OooO00o(4, 0);
                                        } else {
                                            c2 = '\b';
                                            oooO00o4 = new OooO00o(8, 0);
                                        }
                                    }
                                    c2 = '\b';
                                }
                            }
                            i2 = 7;
                            c = '\b';
                            this.f11408OooO0OO.reportPlaybackErrorEvent(o00OOOO0.OooO00o().setTimeSinceCreatedMillis(jElapsedRealtime - this.f11409OooO0Oo).setErrorCode(oooO00o2.f11432OooO00o).setSubErrorCode(oooO00o2.f11433OooO0O0).setException(playbackException).build());
                            z2 = true;
                            this.f11431OooOoOO = true;
                            this.f11417OooOOO = null;
                            i3 = 2;
                        } else if (i12 == 1002) {
                            oooO00o2 = new OooO00o(21, 0);
                        } else if (cause instanceof DrmSession.DrmSessionException) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            int i13 = o0O00.f40595OooO00o;
                            if (i13 >= 21 && (cause3 instanceof MediaDrm.MediaDrmStateException)) {
                                int iOooOOo0 = o0O00.OooOOo0(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                oooO00o2 = new OooO00o(OooO0Oo(iOooOOo0), iOooOOo0);
                            } else if (i13 >= 23 && (cause3 instanceof MediaDrmResetException)) {
                                oooO00o2 = new OooO00o(27, 0);
                            } else if (i13 >= 18 && (cause3 instanceof NotProvisionedException)) {
                                oooO00o2 = new OooO00o(24, 0);
                            } else if (i13 >= 18 && (cause3 instanceof DeniedByServerException)) {
                                oooO00o2 = new OooO00o(29, 0);
                            } else if (cause3 instanceof UnsupportedDrmException) {
                                oooO00o2 = new OooO00o(23, 0);
                            } else {
                                oooO00o2 = cause3 instanceof DefaultDrmSessionManager.MissingSchemeDataException ? new OooO00o(28, 0) : new OooO00o(30, 0);
                            }
                        } else if ((cause instanceof FileDataSource.FileDataSourceException) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            oooO00o2 = (o0O00.f40595OooO00o >= 21 && (cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new OooO00o(32, 0) : new OooO00o(31, 0);
                        } else {
                            oooO00o2 = new OooO00o(9, 0);
                        }
                    }
                    oooO00o2 = oooO00o4;
                    c = c2;
                }
                this.f11408OooO0OO.reportPlaybackErrorEvent(o00OOOO0.OooO00o().setTimeSinceCreatedMillis(jElapsedRealtime - this.f11409OooO0Oo).setErrorCode(oooO00o2.f11432OooO00o).setSubErrorCode(oooO00o2.f11433OooO0O0).setException(playbackException).build());
                z2 = true;
                this.f11431OooOoOO = true;
                this.f11417OooOOO = null;
                i3 = 2;
            }
            i2 = 7;
            c = '\b';
            this.f11408OooO0OO.reportPlaybackErrorEvent(o00OOOO0.OooO00o().setTimeSinceCreatedMillis(jElapsedRealtime - this.f11409OooO0Oo).setErrorCode(oooO00o2.f11432OooO00o).setSubErrorCode(oooO00o2.f11433OooO0O0).setException(playbackException).build());
            z2 = true;
            this.f11431OooOoOO = true;
            this.f11417OooOOO = null;
            i3 = 2;
        }
        if (oooO0O0.OooO00o(i3)) {
            o0O0O00 o0o0o00OooO0oo = player.OooO0oo();
            boolean zOooO0O0 = o0o0o00OooO0oo.OooO0O0(i3);
            boolean zOooO0O1 = o0o0o00OooO0oo.OooO0O0(z2 ? 1 : 0);
            boolean zOooO0O2 = o0o0o00OooO0oo.OooO0O0(3);
            if (zOooO0O0 || zOooO0O1 || zOooO0O2) {
                if (zOooO0O0 || o0O00.OooO00o(this.f11421OooOOo, null)) {
                    i4 = 10;
                    i5 = 13;
                } else {
                    boolean z6 = this.f11421OooOOo == null ? z2 ? 1 : 0 : false;
                    this.f11421OooOOo = null;
                    i4 = 10;
                    i5 = 13;
                    OooO0oO(1, jElapsedRealtime, null, z6 ? 1 : 0);
                }
                if (!zOooO0O1 && !o0O00.OooO00o(this.f11423OooOOoo, null)) {
                    int i14 = this.f11423OooOOoo == null ? z2 ? 1 : 0 : 0;
                    this.f11423OooOOoo = null;
                    OooO0oO(0, jElapsedRealtime, null, i14);
                }
                if (!zOooO0O2 && !o0O00.OooO00o(this.f11426OooOo00, null)) {
                    ?? r7 = this.f11426OooOo00 == null ? z2 : 0;
                    this.f11426OooOo00 = null;
                    OooO0oO(2, jElapsedRealtime, null, r7);
                }
            } else {
                i11 = 9;
                z2 = z2 ? 1 : 0;
                i4 = 10;
                i5 = 13;
            }
        } else {
            i11 = 9;
            z2 = z2 ? 1 : 0;
            i4 = 10;
            i5 = 13;
        }
        if (OooO00o(this.f11419OooOOOO)) {
            OooO0O0 oooO0O2 = this.f11419OooOOOO;
            OooOo oooOo = oooO0O2.f11434OooO00o;
            if (oooOo.f11217OooOo0 != -1) {
                int i15 = oooO0O2.f11435OooO0O0;
                if (!o0O00.OooO00o(this.f11421OooOOo, oooOo)) {
                    ?? r8 = (this.f11421OooOOo == null && i15 == 0) ? z2 : i15;
                    this.f11421OooOOo = oooOo;
                    OooO0oO(1, jElapsedRealtime, oooOo, r8);
                }
                this.f11419OooOOOO = null;
            }
        }
        if (OooO00o(this.f11420OooOOOo)) {
            OooO0O0 oooO0O3 = this.f11420OooOOOo;
            OooOo oooOo2 = oooO0O3.f11434OooO00o;
            int i16 = oooO0O3.f11435OooO0O0;
            if (!o0O00.OooO00o(this.f11423OooOOoo, oooOo2)) {
                ?? r9 = (this.f11423OooOOoo == null && i16 == 0) ? z2 : i16;
                this.f11423OooOOoo = oooOo2;
                OooO0oO(0, jElapsedRealtime, oooOo2, r9);
            }
            this.f11420OooOOOo = null;
        }
        if (OooO00o(this.f11422OooOOo0)) {
            OooO0O0 oooO0O4 = this.f11422OooOOo0;
            OooOo oooOo3 = oooO0O4.f11434OooO00o;
            int i17 = oooO0O4.f11435OooO0O0;
            if (!o0O00.OooO00o(this.f11426OooOo00, oooOo3)) {
                ?? r10 = (this.f11426OooOo00 == null && i17 == 0) ? z2 : i17;
                this.f11426OooOo00 = oooOo3;
                OooO0oO(2, jElapsedRealtime, oooOo3, r10);
            }
            this.f11422OooOOo0 = null;
        }
        switch (p245o00oo0o.o00OOOO0.OooO0O0(this.f11406OooO00o).OooO0OO()) {
            case 0:
                r6 = 0;
                break;
            case 1:
                r6 = i11;
                break;
            case 2:
                r6 = 2;
                break;
            case 3:
                r6 = 4;
                break;
            case 4:
                r6 = 5;
                break;
            case 5:
                r6 = 6;
                break;
            case 6:
            case 8:
            default:
                r6 = z2;
                break;
            case 7:
                r6 = 3;
                break;
            case 9:
                r6 = c;
                break;
            case 10:
                r6 = i2;
                break;
        }
        if (r6 != this.f11418OooOOO0) {
            this.f11418OooOOO0 = r6;
            this.f11408OooO0OO.reportNetworkEvent(o0O00OOO.OooO00o().setNetworkType(r6).setTimeSinceCreatedMillis(jElapsedRealtime - this.f11409OooO0Oo).build());
        }
        if (player.OooOOoo() != 2) {
            this.f11425OooOo0 = false;
        }
        if (player.OooooOo() == null) {
            this.f11428OooOo0o = false;
        } else if (oooO0O0.OooO00o(i4)) {
            this.f11428OooOo0o = z2;
        }
        int iOooOOoo = player.OooOOoo();
        if (this.f11425OooOo0) {
            i6 = 5;
        } else if (this.f11428OooOo0o) {
            i6 = i5;
        } else if (iOooOOoo == 4) {
            i6 = 11;
        } else {
            int i18 = 2;
            if (iOooOOoo == 2) {
                int i19 = this.f11416OooOO0o;
                if (i19 == 0 || i19 == 2) {
                    i6 = i18;
                } else if (player.OooOOO()) {
                    i6 = player.Oooo0o0() != 0 ? i4 : 6;
                } else {
                    i6 = i2;
                }
            } else {
                i18 = 3;
                if (iOooOOoo != 3) {
                    i6 = (iOooOOoo != z2 || this.f11416OooOO0o == 0) ? this.f11416OooOO0o : 12;
                } else if (!player.OooOOO()) {
                    i6 = 4;
                } else if (player.Oooo0o0() != 0) {
                    i6 = i11;
                } else {
                    i6 = i18;
                }
            }
        }
        if (this.f11416OooOO0o != i6) {
            this.f11416OooOO0o = i6;
            this.f11431OooOoOO = z2;
            this.f11408OooO0OO.reportPlaybackStateEvent(o0O000.OooO00o().setState(this.f11416OooOO0o).setTimeSinceCreatedMillis(jElapsedRealtime - this.f11409OooO0Oo).build());
        }
        if (oooO0O0.OooO00o(1028)) {
            com.google.android.exoplayer2.analytics.OooO0O0 oooO0O5 = this.f11407OooO0O0;
            AnalyticsListener.OooO00o oooO00o8 = oooO0O0.f11374OooO0O0.get(1028);
            oooO00o8.getClass();
            oooO0O5.OooO00o(oooO00o8);
        }
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void OooOooO() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void OooOooo() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void Oooo() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void Oooo0() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void Oooo000() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void Oooo00O() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void Oooo00o() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void Oooo0O0() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void Oooo0OO() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void Oooo0o() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void Oooo0o0() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void Oooo0oO() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void Oooo0oo() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void OoooO() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void OoooO0() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void OoooO00() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void OoooO0O() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void OoooOO0() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void OoooOOO() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void OoooOOo() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void OoooOo0() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void OoooOoO() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void OoooOoo() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void Ooooo00() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void Ooooo0o() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void OooooO0() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void OooooOO() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void OooooOo() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void Oooooo() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void Oooooo0() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void OoooooO(AnalyticsListener.OooO00o oooO00o, o0000O00 o0000o00) {
        String str;
        if (oooO00o.f11367OooO0Oo == null) {
            return;
        }
        OooOo oooOo = o0000o00.f39843OooO0OO;
        oooOo.getClass();
        com.google.android.exoplayer2.analytics.OooO0O0 oooO0O0 = this.f11407OooO0O0;
        OooOOOO.OooO0O0 oooO0O1 = oooO00o.f11367OooO0Oo;
        oooO0O1.getClass();
        oo0o0Oo oo0o0oo = oooO00o.f11365OooO0O0;
        synchronized (oooO0O0) {
            str = oooO0O0.OooO0O0(oo0o0oo.OooO0oo(oooO0O1.f39859OooO00o, oooO0O0.f11393OooO0O0).f12906OooO0o, oooO0O1).f11398OooO00o;
        }
        OooO0O0 oooO0O2 = new OooO0O0(oooOo, o0000o00.f39844OooO0Oo, str);
        int i = o0000o00.f39842OooO0O0;
        if (i != 0) {
            if (i == 1) {
                this.f11420OooOOOo = oooO0O2;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.f11422OooOOo0 = oooO0O2;
                return;
            }
        }
        this.f11419OooOOOO = oooO0O2;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void Ooooooo() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void o000OOo() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void o000oOoO() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void o00O0O() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void o00Oo0() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void o00Ooo() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void o00o0O(AnalyticsListener.OooO00o oooO00o, int i, long j) {
        String str;
        OooOOOO.OooO0O0 oooO0O0 = oooO00o.f11367OooO0Oo;
        if (oooO0O0 != null) {
            com.google.android.exoplayer2.analytics.OooO0O0 oooO0O1 = this.f11407OooO0O0;
            oo0o0Oo oo0o0oo = oooO00o.f11365OooO0O0;
            synchronized (oooO0O1) {
                str = oooO0O1.OooO0O0(oo0o0oo.OooO0oo(oooO0O0.f39859OooO00o, oooO0O1.f11393OooO0O0).f12906OooO0o, oooO0O0).f11398OooO00o;
            }
            HashMap<String, Long> map = this.f11413OooO0oo;
            Long l = map.get(str);
            HashMap<String, Long> map2 = this.f11412OooO0oO;
            Long l2 = map2.get(str);
            map.put(str, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            map2.put(str, Long.valueOf((l2 != null ? l2.longValue() : 0L) + ((long) i)));
        }
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void o00oO0O() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void o00oO0o() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void o00ooo() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void o0O0O00() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void o0OO00O() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void o0OOO0o() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void o0Oo0oo() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void o0OoOo0() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void o0ooOO0() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void o0ooOOo() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void o0ooOoO() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void onPlayerError(PlaybackException playbackException) {
        this.f11417OooOOO = playbackException;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void onPositionDiscontinuity(int i) {
        if (i == 1) {
            this.f11425OooOo0 = true;
        }
        this.f11415OooOO0O = i;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onRenderedFirstFrame() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void onVideoSizeChanged(o0oOOo o0oooo) {
        OooO0O0 oooO0O0 = this.f11419OooOOOO;
        if (oooO0O0 != null) {
            OooOo oooOo = oooO0O0.f11434OooO00o;
            if (oooOo.f11217OooOo0 == -1) {
                OooOo.OooO00o oooO00o = new OooOo.OooO00o(oooOo);
                oooO00o.f11249OooOOOo = o0oooo.f40864OooO0Oo;
                oooO00o.f11251OooOOo0 = o0oooo.f40866OooO0o0;
                this.f11419OooOOOO = new OooO0O0(new OooOo(oooO00o), oooO0O0.f11435OooO0O0, oooO0O0.f11436OooO0OO);
            }
        }
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void oo000o() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void oo0o0Oo() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void ooOO() {
    }
}
