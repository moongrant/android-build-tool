package androidx.media3.exoplayer.analytics;

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
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.OooOO0;
import androidx.media3.common.OooOOO0;
import androidx.media3.common.Oooo0;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.o00Oo0;
import androidx.media3.common.o00Ooo;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidContentTypeException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.datasource.UdpDataSource;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.source.OooOOOO;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import o000O.Oooo000;
import o000O0.o00O;
import o000O0.o00O00o0;
import o000O0.o00OOOO0;
import o000O0.o0O00o0;
import o000O0.oOO00O;
import o000O00O.OooOo;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p080o000OoO.o0000O00;
import p080o000OoO.o000OO00;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(31)
@UnstableApi
public final class OooO0OO implements AnalyticsListener, OooO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public String f7377OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f7378OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final androidx.media3.exoplayer.analytics.OooO0O0 f7379OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final PlaybackSession f7380OooO0OO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public PlaybackMetrics.Builder f7386OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f7387OooOO0O;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public PlaybackException f7389OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public OooO0O0 f7391OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public OooO0O0 f7392OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public OooOO0 f7393OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public OooO0O0 f7394OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public OooOO0 f7395OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f7396OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f7397OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public OooOO0 f7398OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f7399OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f7400OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f7401OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f7402OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f7403OooOoOO;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Oooo0.OooO0o f7383OooO0o0 = new Oooo0.OooO0o();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Oooo0.OooO0O0 f7382OooO0o = new Oooo0.OooO0O0();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final HashMap<String, Long> f7385OooO0oo = new HashMap<>();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final HashMap<String, Long> f7384OooO0oO = new HashMap<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f7381OooO0Oo = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f7388OooOO0o = 0;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f7390OooOOO0 = 0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f7404OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f7405OooO0O0;

        public OooO00o(int i, int i2) {
            this.f7404OooO00o = i;
            this.f7405OooO0O0 = i2;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOO0 f7406OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f7407OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f7408OooO0OO;

        public OooO0O0(OooOO0 oooOO1, int i, String str) {
            this.f7406OooO00o = oooOO1;
            this.f7407OooO0O0 = i;
            this.f7408OooO0OO = str;
        }
    }

    public OooO0OO(Context context, PlaybackSession playbackSession) {
        this.f7378OooO00o = context.getApplicationContext();
        this.f7380OooO0OO = playbackSession;
        androidx.media3.exoplayer.analytics.OooO0O0 oooO0O0 = new androidx.media3.exoplayer.analytics.OooO0O0();
        this.f7379OooO0O0 = oooO0O0;
        oooO0O0.f7366OooO0Oo = this;
    }

    @SuppressLint({"SwitchIntDef"})
    public static int OooO0Oo(int i) {
        switch (o000OO00.OooOOo(i)) {
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

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void OooO00o(OooOo oooOo) {
        this.f7396OooOo += oooOo.f33962OooO0oO;
        this.f7402OooOoO0 += oooOo.f33961OooO0o0;
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    public final boolean OooO0O0(@Nullable OooO0O0 oooO0O0) {
        String str;
        if (oooO0O0 != null) {
            String str2 = oooO0O0.f7408OooO0OO;
            androidx.media3.exoplayer.analytics.OooO0O0 oooO0O1 = this.f7379OooO0O0;
            synchronized (oooO0O1) {
                str = oooO0O1.f7367OooO0o;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void OooO0OO() {
        PlaybackMetrics.Builder builder = this.f7386OooOO0;
        if (builder != null && this.f7403OooOoOO) {
            builder.setAudioUnderrunCount(this.f7401OooOoO);
            this.f7386OooOO0.setVideoFramesDropped(this.f7396OooOo);
            this.f7386OooOO0.setVideoFramesPlayed(this.f7402OooOoO0);
            Long l = this.f7384OooO0oO.get(this.f7377OooO);
            this.f7386OooOO0.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = this.f7385OooO0oo.get(this.f7377OooO);
            this.f7386OooOO0.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.f7386OooOO0.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.f7380OooO0OO.reportPlaybackMetrics(this.f7386OooOO0.build());
        }
        this.f7386OooOO0 = null;
        this.f7377OooO = null;
        this.f7401OooOoO = 0;
        this.f7396OooOo = 0;
        this.f7402OooOoO0 = 0;
        this.f7393OooOOo = null;
        this.f7395OooOOoo = null;
        this.f7398OooOo00 = null;
        this.f7403OooOoOO = false;
    }

    public final void OooO0o(AnalyticsListener.OooO00o oooO00o, String str) {
        OooOOOO.OooO0O0 oooO0O0 = oooO00o.f7338OooO0Oo;
        if ((oooO0O0 == null || !oooO0O0.OooO00o()) && str.equals(this.f7377OooO)) {
            OooO0OO();
        }
        this.f7384OooO0oO.remove(str);
        this.f7385OooO0oo.remove(str);
    }

    @RequiresNonNull({"metricsBuilder"})
    public final void OooO0o0(Oooo0 oooo0, @Nullable OooOOOO.OooO0O0 oooO0O0) {
        int iOooO0o0;
        int i;
        PlaybackMetrics.Builder builder = this.f7386OooOO0;
        if (oooO0O0 == null || (iOooO0o0 = oooo0.OooO0o0(oooO0O0.f33815OooO00o)) == -1) {
            return;
        }
        Oooo0.OooO0O0 oooO0O1 = this.f7382OooO0o;
        oooo0.OooO(iOooO0o0, oooO0O1);
        int i2 = oooO0O1.f6647OooO0o;
        Oooo0.OooO0o oooO0o = this.f7383OooO0o0;
        oooo0.OooOOo0(i2, oooO0o);
        OooOOO0.OooOO0O oooOO0O = oooO0o.f6675OooO0o.f6491OooO0o0;
        if (oooOO0O == null) {
            i = 0;
        } else {
            int iOooo000 = o000OO00.Oooo000(oooOO0O.f6580OooO0Oo, oooOO0O.f6582OooO0o0);
            if (iOooo000 == 0) {
                i = 3;
            } else if (iOooo000 != 1) {
                i = iOooo000 != 2 ? 1 : 4;
            } else {
                i = 5;
            }
        }
        builder.setStreamType(i);
        if (oooO0o.f6687OooOOo0 != -9223372036854775807L && !oooO0o.f6684OooOOOO && !oooO0o.f6681OooOO0o && !oooO0o.OooO0Oo()) {
            builder.setMediaDurationMillis(oooO0o.OooO0OO());
        }
        builder.setPlaybackType(oooO0o.OooO0Oo() ? 2 : 1);
        this.f7403OooOoOO = true;
    }

    public final void OooO0oO(int i, long j, @Nullable OooOO0 oooOO1, int i2) {
        int i3;
        TrackChangeEvent.Builder timeSinceCreatedMillis = o00O.OooO00o(i).setTimeSinceCreatedMillis(j - this.f7381OooO0Oo);
        if (oooOO1 != null) {
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
            String str = oooOO1.f6415OooOOO;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = oooOO1.f6417OooOOOO;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = oooOO1.f6414OooOO0o;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = oooOO1.f6413OooOO0O;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = oooOO1.f6424OooOo00;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = oooOO1.f6423OooOo0;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = oooOO1.f6431OooOoo0;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = oooOO1.f6430OooOoo;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = oooOO1.f6408OooO0o;
            if (str4 != null) {
                int i9 = o000OO00.f34965OooO00o;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = oooOO1.f6425OooOo0O;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f7403OooOoOO = true;
        this.f7380OooO0OO.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void OooOO0O() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void OooOOO0() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void OooOOoo() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void OooOo() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void OooOo0() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void OooOo00() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void OooOo0O() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void OooOo0o() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void OooOoO() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void OooOoO0() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void OooOoOO() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void OooOoo() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void OooOoo0() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void OooOooO() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void OooOooo() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void Oooo() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void Oooo0() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void Oooo000() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void Oooo00O() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void Oooo00o() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void Oooo0O0() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void Oooo0OO() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void Oooo0o() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void Oooo0o0() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void Oooo0oO() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void Oooo0oo() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void OoooO() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void OoooO0() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void OoooO00() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void OoooO0O() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void OoooOO0() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void OoooOOO() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void OoooOOo() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void OoooOo0() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void OoooOoO() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void OoooOoo() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void Ooooo00() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void Ooooo0o() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void OooooO0(AnalyticsListener.OooO00o oooO00o, Oooo000 oooo000) {
        String str;
        if (oooO00o.f7338OooO0Oo == null) {
            return;
        }
        OooOO0 oooOO1 = oooo000.f33847OooO0OO;
        oooOO1.getClass();
        androidx.media3.exoplayer.analytics.OooO0O0 oooO0O0 = this.f7379OooO0O0;
        OooOOOO.OooO0O0 oooO0O1 = oooO00o.f7338OooO0Oo;
        oooO0O1.getClass();
        Oooo0 oooo0 = oooO00o.f7336OooO0O0;
        synchronized (oooO0O0) {
            str = oooO0O0.OooO0OO(oooo0.OooOO0O(oooO0O1.f33815OooO00o, oooO0O0.f7364OooO0O0).f6647OooO0o, oooO0O1).f7370OooO00o;
        }
        OooO0O0 oooO0O2 = new OooO0O0(oooOO1, oooo000.f33848OooO0Oo, str);
        int i = oooo000.f33846OooO0O0;
        if (i != 0) {
            if (i == 1) {
                this.f7392OooOOOo = oooO0O2;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.f7394OooOOo0 = oooO0O2;
                return;
            }
        }
        this.f7391OooOOOO = oooO0O2;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void OooooOO() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void OooooOo() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void Oooooo() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void Oooooo0() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void OoooooO() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void Ooooooo() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void o000000() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void o000000O(AnalyticsListener.OooO00o oooO00o, int i, long j) {
        String str;
        OooOOOO.OooO0O0 oooO0O0 = oooO00o.f7338OooO0Oo;
        if (oooO0O0 != null) {
            androidx.media3.exoplayer.analytics.OooO0O0 oooO0O1 = this.f7379OooO0O0;
            Oooo0 oooo0 = oooO00o.f7336OooO0O0;
            synchronized (oooO0O1) {
                str = oooO0O1.OooO0OO(oooo0.OooOO0O(oooO0O0.f33815OooO00o, oooO0O1.f7364OooO0O0).f6647OooO0o, oooO0O0).f7370OooO00o;
            }
            HashMap<String, Long> map = this.f7385OooO0oo;
            Long l = map.get(str);
            HashMap<String, Long> map2 = this.f7384OooO0oO;
            Long l2 = map2.get(str);
            map.put(str, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            map2.put(str, Long.valueOf((l2 != null ? l2.longValue() : 0L) + ((long) i)));
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void o000OOo() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void o000oOoO() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void o00O0O() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void o00Oo0() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void o00Ooo() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void o00o0O() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void o00oO0O() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void o00oO0o() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void o00ooo() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void o0O0O00() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void o0OO00O() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void o0OOO0o() {
    }

    /* JADX WARN: Code duplicated, block: B:247:0x041f  */
    /* JADX WARN: Code duplicated, block: B:332:0x053d A[PHI: r3
      0x053d: PHI (r3v53 int) = (r3v52 int), (r3v51 int), (r3v51 int) binds: [B:339:0x054e, B:322:0x0526, B:323:0x0528] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0, types: [androidx.media3.exoplayer.analytics.OooO0OO] */
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
    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void o0Oo0oo(Player player, AnalyticsListener.OooO0O0 oooO0O0) {
        int i;
        boolean z;
        char c;
        OooO00o oooO00o;
        OooO00o oooO00o2;
        char c2;
        OooO00o oooO00o3;
        int i2;
        int i3;
        int i4;
        ?? r6;
        int i5;
        DrmInitData drmInitData;
        int i6;
        if (oooO0O0.f7344OooO00o.OooO0OO() == 0) {
            return;
        }
        for (int i7 = 0; i7 < oooO0O0.f7344OooO00o.OooO0OO(); i7++) {
            int iOooO0O0 = oooO0O0.f7344OooO00o.OooO0O0(i7);
            AnalyticsListener.OooO00o oooO00o4 = oooO0O0.f7345OooO0O0.get(iOooO0O0);
            oooO00o4.getClass();
            if (iOooO0O0 == 0) {
                androidx.media3.exoplayer.analytics.OooO0O0 oooO0O1 = this.f7379OooO0O0;
                synchronized (oooO0O1) {
                    oooO0O1.f7366OooO0Oo.getClass();
                    Oooo0 oooo0 = oooO0O1.f7368OooO0o0;
                    oooO0O1.f7368OooO0o0 = oooO00o4.f7336OooO0O0;
                    Iterator<androidx.media3.exoplayer.analytics.OooO0O0.OooO00o> it = oooO0O1.f7365OooO0OO.values().iterator();
                    while (it.hasNext()) {
                        androidx.media3.exoplayer.analytics.OooO0O0.OooO00o next = it.next();
                        if (!next.OooO0O0(oooo0, oooO0O1.f7368OooO0o0) || next.OooO00o(oooO00o4)) {
                            it.remove();
                            if (next.f7375OooO0o0) {
                                if (next.f7370OooO00o.equals(oooO0O1.f7367OooO0o)) {
                                    oooO0O1.OooO00o(next);
                                }
                                ((OooO0OO) oooO0O1.f7366OooO0Oo).OooO0o(oooO00o4, next.f7370OooO00o);
                            }
                        }
                    }
                    oooO0O1.OooO0Oo(oooO00o4);
                }
            } else if (iOooO0O0 == 11) {
                this.f7379OooO0O0.OooO0o(oooO00o4, this.f7387OooOO0O);
            } else {
                this.f7379OooO0O0.OooO0o0(oooO00o4);
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (oooO0O0.OooO00o(0)) {
            AnalyticsListener.OooO00o oooO00o5 = oooO0O0.f7345OooO0O0.get(0);
            oooO00o5.getClass();
            if (this.f7386OooOO0 != null) {
                OooO0o0(oooO00o5.f7336OooO0O0, oooO00o5.f7338OooO0Oo);
            }
        }
        boolean z2 = true;
        if (oooO0O0.OooO00o(2) && this.f7386OooOO0 != null) {
            ImmutableList.OooO0O0 oooO0O0ListIterator = player.OooOO0o().f6857OooO0Oo.listIterator(0);
            loop2: while (true) {
                if (!oooO0O0ListIterator.hasNext()) {
                    drmInitData = null;
                    break;
                }
                o00Oo0.OooO00o oooO00o6 = (o00Oo0.OooO00o) oooO0O0ListIterator.next();
                for (int i8 = 0; i8 < oooO00o6.f6863OooO0Oo; i8++) {
                    if (oooO00o6.f6867OooO0oo[i8] && (drmInitData = oooO00o6.f6865OooO0o0.f6773OooO0oO[i8].f6419OooOOo) != null) {
                        break loop2;
                    }
                }
            }
            if (drmInitData != null) {
                PlaybackMetrics.Builder builderOooO00o = oOO00O.OooO00o(this.f7386OooOO0);
                int i9 = 0;
                while (true) {
                    if (i9 >= drmInitData.f6233OooO0oO) {
                        i6 = 1;
                        break;
                    }
                    UUID uuid = drmInitData.f6230OooO0Oo[i9].f6236OooO0o0;
                    if (uuid.equals(C.f6214OooO0Oo)) {
                        i6 = 3;
                        break;
                    } else if (uuid.equals(C.f6215OooO0o0)) {
                        i6 = 2;
                        break;
                    } else {
                        if (uuid.equals(C.f6213OooO0OO)) {
                            i6 = 6;
                            break;
                        }
                        i9++;
                    }
                }
                builderOooO00o.setDrmType(i6);
            }
        }
        if (oooO0O0.OooO00o(1011)) {
            this.f7401OooOoO++;
        }
        PlaybackException playbackException = this.f7389OooOOO;
        int i10 = 9;
        if (playbackException == null) {
            i2 = 2;
            c = '\b';
        } else {
            boolean z3 = this.f7399OooOo0O == 4;
            int i11 = playbackException.f6703OooO0Oo;
            if (i11 == 1001) {
                oooO00o = new OooO00o(20, 0);
            } else {
                if (playbackException instanceof ExoPlaybackException) {
                    ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
                    boolean z4 = exoPlaybackException.f7119OooOO0o == 1;
                    i = exoPlaybackException.f7123OooOOOo;
                    z = z4;
                } else {
                    i = 0;
                    z = false;
                }
                Throwable cause = playbackException.getCause();
                cause.getClass();
                if (!(cause instanceof IOException)) {
                    c = '\b';
                    if (z && (i == 0 || i == 1)) {
                        oooO00o2 = new OooO00o(35, 0);
                    } else if (z && i == 3) {
                        oooO00o2 = new OooO00o(15, 0);
                    } else {
                        if (z && i == 2) {
                            oooO00o2 = new OooO00o(23, 0);
                        } else if (cause instanceof MediaCodecRenderer.DecoderInitializationException) {
                            oooO00o = new OooO00o(13, o000OO00.OooOOoo(((MediaCodecRenderer.DecoderInitializationException) cause).f7732OooO0oO));
                        } else if (cause instanceof MediaCodecDecoderException) {
                            oooO00o = new OooO00o(14, o000OO00.OooOOoo(((MediaCodecDecoderException) cause).f7659OooO0Oo));
                        } else if (cause instanceof OutOfMemoryError) {
                            oooO00o = new OooO00o(14, 0);
                        } else if (cause instanceof AudioSink.InitializationException) {
                            oooO00o = new OooO00o(17, ((AudioSink.InitializationException) cause).f7410OooO0Oo);
                        } else if (cause instanceof AudioSink.WriteException) {
                            oooO00o = new OooO00o(18, ((AudioSink.WriteException) cause).f7412OooO0Oo);
                        } else if (o000OO00.f34965OooO00o < 16 || !(cause instanceof MediaCodec.CryptoException)) {
                            oooO00o = new OooO00o(22, 0);
                        } else {
                            int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                            oooO00o = new OooO00o(OooO0Oo(errorCode), errorCode);
                        }
                        this.f7380OooO0OO.reportPlaybackErrorEvent(o00O00o0.OooO00o().setTimeSinceCreatedMillis(jElapsedRealtime - this.f7381OooO0Oo).setErrorCode(oooO00o.f7404OooO00o).setSubErrorCode(oooO00o.f7405OooO0O0).setException(playbackException).build());
                        z2 = true;
                        this.f7403OooOoOO = true;
                        this.f7389OooOOO = null;
                        i2 = 2;
                    }
                    oooO00o = oooO00o2;
                } else if (cause instanceof HttpDataSource$InvalidResponseCodeException) {
                    oooO00o = new OooO00o(5, ((HttpDataSource$InvalidResponseCodeException) cause).f6989OooO0oO);
                } else {
                    if ((cause instanceof HttpDataSource$InvalidContentTypeException) || (cause instanceof ParserException)) {
                        c2 = '\b';
                        oooO00o3 = new OooO00o(z3 ? 10 : 11, 0);
                    } else {
                        boolean z5 = cause instanceof HttpDataSource$HttpDataSourceException;
                        if (z5 || (cause instanceof UdpDataSource.UdpDataSourceException)) {
                            if (o0000O00.OooO0O0(this.f7378OooO00o).OooO0OO() == 1) {
                                oooO00o = new OooO00o(3, 0);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    oooO00o = new OooO00o(6, 0);
                                } else {
                                    if (cause2 instanceof SocketTimeoutException) {
                                        oooO00o3 = new OooO00o(7, 0);
                                    } else if (z5 && ((HttpDataSource$HttpDataSourceException) cause).f6988OooO0o == 1) {
                                        oooO00o3 = new OooO00o(4, 0);
                                    } else {
                                        c2 = '\b';
                                        oooO00o3 = new OooO00o(8, 0);
                                    }
                                    c2 = '\b';
                                }
                            }
                            c = '\b';
                            this.f7380OooO0OO.reportPlaybackErrorEvent(o00O00o0.OooO00o().setTimeSinceCreatedMillis(jElapsedRealtime - this.f7381OooO0Oo).setErrorCode(oooO00o.f7404OooO00o).setSubErrorCode(oooO00o.f7405OooO0O0).setException(playbackException).build());
                            z2 = true;
                            this.f7403OooOoOO = true;
                            this.f7389OooOOO = null;
                            i2 = 2;
                        } else if (i11 == 1002) {
                            oooO00o = new OooO00o(21, 0);
                        } else if (cause instanceof DrmSession.DrmSessionException) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            int i12 = o000OO00.f34965OooO00o;
                            if (i12 >= 21 && (cause3 instanceof MediaDrm.MediaDrmStateException)) {
                                int iOooOOoo = o000OO00.OooOOoo(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                oooO00o = new OooO00o(OooO0Oo(iOooOOoo), iOooOOoo);
                            } else if (i12 >= 23 && (cause3 instanceof MediaDrmResetException)) {
                                oooO00o = new OooO00o(27, 0);
                            } else if (i12 >= 18 && (cause3 instanceof NotProvisionedException)) {
                                oooO00o = new OooO00o(24, 0);
                            } else if (i12 >= 18 && (cause3 instanceof DeniedByServerException)) {
                                oooO00o = new OooO00o(29, 0);
                            } else if (cause3 instanceof UnsupportedDrmException) {
                                oooO00o = new OooO00o(23, 0);
                            } else {
                                oooO00o = cause3 instanceof DefaultDrmSessionManager.MissingSchemeDataException ? new OooO00o(28, 0) : new OooO00o(30, 0);
                            }
                        } else if ((cause instanceof FileDataSource.FileDataSourceException) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            oooO00o = (o000OO00.f34965OooO00o >= 21 && (cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new OooO00o(32, 0) : new OooO00o(31, 0);
                        } else {
                            oooO00o = new OooO00o(9, 0);
                        }
                    }
                    oooO00o = oooO00o3;
                    c = c2;
                }
                this.f7380OooO0OO.reportPlaybackErrorEvent(o00O00o0.OooO00o().setTimeSinceCreatedMillis(jElapsedRealtime - this.f7381OooO0Oo).setErrorCode(oooO00o.f7404OooO00o).setSubErrorCode(oooO00o.f7405OooO0O0).setException(playbackException).build());
                z2 = true;
                this.f7403OooOoOO = true;
                this.f7389OooOOO = null;
                i2 = 2;
            }
            c = '\b';
            this.f7380OooO0OO.reportPlaybackErrorEvent(o00O00o0.OooO00o().setTimeSinceCreatedMillis(jElapsedRealtime - this.f7381OooO0Oo).setErrorCode(oooO00o.f7404OooO00o).setSubErrorCode(oooO00o.f7405OooO0O0).setException(playbackException).build());
            z2 = true;
            this.f7403OooOoOO = true;
            this.f7389OooOOO = null;
            i2 = 2;
        }
        if (oooO0O0.OooO00o(i2)) {
            o00Oo0 o00oo0OooOO0o = player.OooOO0o();
            boolean zOooO0Oo = o00oo0OooOO0o.OooO0Oo(i2);
            boolean zOooO0Oo2 = o00oo0OooOO0o.OooO0Oo(z2 ? 1 : 0);
            boolean zOooO0Oo3 = o00oo0OooOO0o.OooO0Oo(3);
            if (zOooO0Oo || zOooO0Oo2 || zOooO0Oo3) {
                if (zOooO0Oo || o000OO00.OooO00o(this.f7393OooOOo, null)) {
                    i3 = 10;
                    i4 = 13;
                } else {
                    boolean z6 = this.f7393OooOOo == null ? z2 ? 1 : 0 : false;
                    this.f7393OooOOo = null;
                    i3 = 10;
                    i4 = 13;
                    OooO0oO(1, jElapsedRealtime, null, z6 ? 1 : 0);
                }
                if (!zOooO0Oo2 && !o000OO00.OooO00o(this.f7395OooOOoo, null)) {
                    int i13 = this.f7395OooOOoo == null ? z2 ? 1 : 0 : 0;
                    this.f7395OooOOoo = null;
                    OooO0oO(0, jElapsedRealtime, null, i13);
                }
                if (!zOooO0Oo3 && !o000OO00.OooO00o(this.f7398OooOo00, null)) {
                    ?? r7 = this.f7398OooOo00 == null ? z2 : 0;
                    this.f7398OooOo00 = null;
                    OooO0oO(2, jElapsedRealtime, null, r7);
                }
            } else {
                i10 = 9;
                z2 = z2 ? 1 : 0;
                i3 = 10;
                i4 = 13;
            }
        } else {
            i10 = 9;
            z2 = z2 ? 1 : 0;
            i3 = 10;
            i4 = 13;
        }
        if (OooO0O0(this.f7391OooOOOO)) {
            OooO0O0 oooO0O2 = this.f7391OooOOOO;
            OooOO0 oooOO1 = oooO0O2.f7406OooO00o;
            if (oooOO1.f6423OooOo0 != -1) {
                int i14 = oooO0O2.f7407OooO0O0;
                if (!o000OO00.OooO00o(this.f7393OooOOo, oooOO1)) {
                    ?? r8 = (this.f7393OooOOo == null && i14 == 0) ? z2 : i14;
                    this.f7393OooOOo = oooOO1;
                    OooO0oO(1, jElapsedRealtime, oooOO1, r8);
                }
                this.f7391OooOOOO = null;
            }
        }
        if (OooO0O0(this.f7392OooOOOo)) {
            OooO0O0 oooO0O3 = this.f7392OooOOOo;
            OooOO0 oooOO2 = oooO0O3.f7406OooO00o;
            int i15 = oooO0O3.f7407OooO0O0;
            if (!o000OO00.OooO00o(this.f7395OooOOoo, oooOO2)) {
                ?? r9 = (this.f7395OooOOoo == null && i15 == 0) ? z2 : i15;
                this.f7395OooOOoo = oooOO2;
                OooO0oO(0, jElapsedRealtime, oooOO2, r9);
            }
            this.f7392OooOOOo = null;
        }
        if (OooO0O0(this.f7394OooOOo0)) {
            OooO0O0 oooO0O4 = this.f7394OooOOo0;
            OooOO0 oooOO3 = oooO0O4.f7406OooO00o;
            int i16 = oooO0O4.f7407OooO0O0;
            if (!o000OO00.OooO00o(this.f7398OooOo00, oooOO3)) {
                ?? r10 = (this.f7398OooOo00 == null && i16 == 0) ? z2 : i16;
                this.f7398OooOo00 = oooOO3;
                OooO0oO(2, jElapsedRealtime, oooOO3, r10);
            }
            this.f7394OooOOo0 = null;
        }
        switch (o0000O00.OooO0O0(this.f7378OooO00o).OooO0OO()) {
            case 0:
                r6 = 0;
                break;
            case 1:
                r6 = i10;
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
                r6 = 7;
                break;
        }
        if (r6 != this.f7390OooOOO0) {
            this.f7390OooOOO0 = r6;
            this.f7380OooO0OO.reportNetworkEvent(o00OOOO0.OooO00o().setNetworkType(r6).setTimeSinceCreatedMillis(jElapsedRealtime - this.f7381OooO0Oo).build());
        }
        if (player.Oooo0o() != 2) {
            this.f7397OooOo0 = false;
        }
        if (player.OooOO0O() == null) {
            this.f7400OooOo0o = false;
        } else if (oooO0O0.OooO00o(i3)) {
            this.f7400OooOo0o = z2;
        }
        int iOooo0o = player.Oooo0o();
        if (this.f7397OooOo0) {
            i5 = 5;
        } else if (this.f7400OooOo0o) {
            i5 = i4;
        } else if (iOooo0o == 4) {
            i5 = 11;
        } else {
            int i17 = 2;
            if (iOooo0o == 2) {
                int i18 = this.f7388OooOO0o;
                if (i18 == 0 || i18 == 2) {
                    i5 = i17;
                } else if (player.OooOoOO()) {
                    i5 = player.OooOo00() != 0 ? i3 : 6;
                } else {
                    i5 = 7;
                }
            } else {
                i17 = 3;
                if (iOooo0o != 3) {
                    i5 = (iOooo0o != z2 || this.f7388OooOO0o == 0) ? this.f7388OooOO0o : 12;
                } else if (!player.OooOoOO()) {
                    i5 = 4;
                } else if (player.OooOo00() != 0) {
                    i5 = i10;
                } else {
                    i5 = i17;
                }
            }
        }
        if (this.f7388OooOO0o != i5) {
            this.f7388OooOO0o = i5;
            this.f7403OooOoOO = z2;
            this.f7380OooO0OO.reportPlaybackStateEvent(o0O00o0.OooO00o().setState(this.f7388OooOO0o).setTimeSinceCreatedMillis(jElapsedRealtime - this.f7381OooO0Oo).build());
        }
        if (oooO0O0.OooO00o(1028)) {
            androidx.media3.exoplayer.analytics.OooO0O0 oooO0O5 = this.f7379OooO0O0;
            AnalyticsListener.OooO00o oooO00o7 = oooO0O0.f7345OooO0O0.get(1028);
            oooO00o7.getClass();
            oooO0O5.OooO0O0(oooO00o7);
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void o0OoOo0() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void o0ooOO0() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void o0ooOOo(Oooo000 oooo000) {
        this.f7399OooOo0O = oooo000.f33845OooO00o;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void o0ooOoO() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onPlayerError(PlaybackException playbackException) {
        this.f7389OooOOO = playbackException;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onPositionDiscontinuity(int i) {
        if (i == 1) {
            this.f7397OooOo0 = true;
        }
        this.f7387OooOO0O = i;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onRenderedFirstFrame() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onVideoSizeChanged(o00Ooo o00ooo2) {
        OooO0O0 oooO0O0 = this.f7391OooOOOO;
        if (oooO0O0 != null) {
            OooOO0 oooOO1 = oooO0O0.f7406OooO00o;
            if (oooOO1.f6423OooOo0 == -1) {
                OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(oooOO1);
                oooO00o.f6455OooOOOo = o00ooo2.f6874OooO0Oo;
                oooO00o.f6457OooOOo0 = o00ooo2.f6876OooO0o0;
                this.f7391OooOOOO = new OooO0O0(new OooOO0(oooO00o), oooO0O0.f7407OooO0O0, oooO0O0.f7408OooO0OO);
            }
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void oo000o() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void oo0o0Oo() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void ooOO() {
    }
}
