package com.google.android.exoplayer2.analytics;

import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.fragment.app.OooO;
import com.facebook.OooOo;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.o000oOoO;
import com.google.android.exoplayer2.o00Ooo;
import com.google.android.exoplayer2.o0O0O00;
import com.google.android.exoplayer2.oo0o0Oo;
import com.google.android.exoplayer2.source.OooOOOO;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.gms.internal.measurement.OooOO0;
import com.google.common.base.Oooo000;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.o00O00o0;
import com.google.common.collect.o0O00;
import com.google.common.collect.o0OoO00O;
import io.agora.rtc.Constants;
import java.io.IOException;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import o000O00.o000000O;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p028Oooo0oO.o000OO00;
import p028Oooo0oO.o00OO;
import p028Oooo0oO.o00OOO0;
import p028Oooo0oO.o00OOO00;
import p028Oooo0oO.o00OOOOo;
import p196o00o0Oo.o000O;
import p196o00o0Oo.o000O0Oo;
import p198o00o0OoO.oo0o0O0;
import p200o00o0o.o00;
import p200o00o0o.o000;
import p200o00o0o.o000000;
import p200o00o0o.o0000O0;
import p200o00o0o.o000O00;
import p200o00o0o.o000O000;
import p200o00o0o.o000OOo;
import p200o00o0o.o00O00;
import p200o00o0o.o00O0O;
import p200o00o0o.o0O0ooO;
import p200o00o0o.o0ooOOo;
import p200o00o0o.oOO00O;
import p206o00o0oOO.o0;
import p226o00oOo00.o0000;
import p226o00oOo00.o0000O00;
import p226o00oOo00.o0000oo;
import p230o00oOoO0.o0000O0O;
import p245o00oo0o.o00O;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00O00OO;
import p245o00oo0o.o00O0OO;
import p245o00oo0o.o00O0OOO;
import p247o00oo0oO.o0oOOo;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO00o implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o00O<AnalyticsListener> f11375OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00O00OO f11376OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final oo0o0Oo.OooO0OO f11377OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final oo0o0Oo.OooO0O0 f11378OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C0198OooO00o f11379OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final SparseArray<AnalyticsListener.OooO00o> f11380OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public Player f11381OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public o00O0OOO f11382OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f11383OooOO0o;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.analytics.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0198OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final oo0o0Oo.OooO0O0 f11384OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public ImmutableList<OooOOOO.OooO0O0> f11385OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public ImmutableMap<OooOOOO.OooO0O0, oo0o0Oo> f11386OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public OooOOOO.OooO0O0 f11387OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public OooOOOO.OooO0O0 f11388OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public OooOOOO.OooO0O0 f11389OooO0o0;

        public C0198OooO00o(oo0o0Oo.OooO0O0 oooO0O0) {
            this.f11384OooO00o = oooO0O0;
            ImmutableList.OooO0O0 oooO0O1 = ImmutableList.f19157OooO0o0;
            this.f11385OooO0O0 = o0O00.f19536OooO0oo;
            this.f11386OooO0OO = o0OoO00O.f19626OooOO0;
        }

        @Nullable
        public static OooOOOO.OooO0O0 OooO0O0(Player player, ImmutableList<OooOOOO.OooO0O0> immutableList, @Nullable OooOOOO.OooO0O0 oooO0O0, oo0o0Oo.OooO0O0 oooO0O1) {
            oo0o0Oo oo0o0ooOooOO0 = player.OooOO0();
            int iOoooO = player.OoooO();
            Object objOooOOO0 = oo0o0ooOooOO0.OooOOo0() ? null : oo0o0ooOooOO0.OooOOO0(iOoooO);
            int iOooO0O0 = (player.OooO0Oo() || oo0o0ooOooOO0.OooOOo0()) ? -1 : oo0o0ooOooOO0.OooO0o(iOoooO, oooO0O1).OooO0O0(p245o00oo0o.o0O00.Oooo0O0(player.getCurrentPosition()) - oooO0O1.OooO0oO());
            for (int i = 0; i < immutableList.size(); i++) {
                OooOOOO.OooO0O0 oooO0O2 = immutableList.get(i);
                if (OooO0OO(oooO0O2, objOooOOO0, player.OooO0Oo(), player.Oooo0(), player.OoooOoO(), iOooO0O0)) {
                    return oooO0O2;
                }
            }
            if (immutableList.isEmpty() && oooO0O0 != null) {
                if (OooO0OO(oooO0O0, objOooOOO0, player.OooO0Oo(), player.Oooo0(), player.OoooOoO(), iOooO0O0)) {
                    return oooO0O0;
                }
            }
            return null;
        }

        public static boolean OooO0OO(OooOOOO.OooO0O0 oooO0O0, @Nullable Object obj, boolean z, int i, int i2, int i3) {
            if (!oooO0O0.f39859OooO00o.equals(obj)) {
                return false;
            }
            int i4 = oooO0O0.f39860OooO0O0;
            return (z && i4 == i && oooO0O0.f39861OooO0OO == i2) || (!z && i4 == -1 && oooO0O0.f39863OooO0o0 == i3);
        }

        public final void OooO00o(ImmutableMap.OooO00o<OooOOOO.OooO0O0, oo0o0Oo> oooO00o, @Nullable OooOOOO.OooO0O0 oooO0O0, oo0o0Oo oo0o0oo) {
            if (oooO0O0 == null) {
                return;
            }
            if (oo0o0oo.OooO0O0(oooO0O0.f39859OooO00o) != -1) {
                oooO00o.OooO0OO(oooO0O0, oo0o0oo);
                return;
            }
            oo0o0Oo oo0o0oo2 = this.f11386OooO0OO.get(oooO0O0);
            if (oo0o0oo2 != null) {
                oooO00o.OooO0OO(oooO0O0, oo0o0oo2);
            }
        }

        public final void OooO0Oo(oo0o0Oo oo0o0oo) {
            ImmutableMap.OooO00o<OooOOOO.OooO0O0, oo0o0Oo> OooO00o2 = ImmutableMap.OooO00o();
            if (this.f11385OooO0O0.isEmpty()) {
                OooO00o(OooO00o2, this.f11389OooO0o0, oo0o0oo);
                if (!Oooo000.OooO00o(this.f11388OooO0o, this.f11389OooO0o0)) {
                    OooO00o(OooO00o2, this.f11388OooO0o, oo0o0oo);
                }
                if (!Oooo000.OooO00o(this.f11387OooO0Oo, this.f11389OooO0o0) && !Oooo000.OooO00o(this.f11387OooO0Oo, this.f11388OooO0o)) {
                    OooO00o(OooO00o2, this.f11387OooO0Oo, oo0o0oo);
                }
            } else {
                for (int i = 0; i < this.f11385OooO0O0.size(); i++) {
                    OooO00o(OooO00o2, this.f11385OooO0O0.get(i), oo0o0oo);
                }
                if (!this.f11385OooO0O0.contains(this.f11387OooO0Oo)) {
                    OooO00o(OooO00o2, this.f11387OooO0Oo, oo0o0oo);
                }
            }
            this.f11386OooO0OO = OooO00o2.OooO0O0();
        }
    }

    public OooO00o(o00O00OO o00o00oo2) {
        o00o00oo2.getClass();
        this.f11376OooO0Oo = o00o00oo2;
        int i = p245o00oo0o.o0O00.f40595OooO00o;
        Looper looperMyLooper = Looper.myLooper();
        this.f11375OooO = new o00O<>(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, o00o00oo2, new OooOo());
        oo0o0Oo.OooO0O0 oooO0O0 = new oo0o0Oo.OooO0O0();
        this.f11378OooO0o0 = oooO0O0;
        this.f11377OooO0o = new oo0o0Oo.OooO0OO();
        this.f11379OooO0oO = new C0198OooO00o(oooO0O0);
        this.f11380OooO0oo = new SparseArray<>();
    }

    @Override // p200o00o0o.o00O0O
    public final void OooO(final long j, final Object obj) {
        final AnalyticsListener.OooO00o oooO00oOooo0oo = Oooo0oo();
        Oooo(oooO00oOooo0oo, 26, new o00O.OooO00o(oooO00oOooo0oo, obj, j) { // from class: o00o0o.o000OOo0

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Object f39127OooO0Oo;

            {
                this.f39127OooO0Oo = obj;
            }

            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj2) {
                ((AnalyticsListener) obj2).onRenderedFirstFrame();
            }
        });
    }

    @Override // o00oo0Oo.o000O.OooO00o
    public final void OooO00o(final int i, final long j, final long j2) {
        C0198OooO00o c0198OooO00o = this.f11379OooO0oO;
        final AnalyticsListener.OooO00o oooO00oOooo0o = Oooo0o(c0198OooO00o.f11385OooO0O0.isEmpty() ? null : (OooOOOO.OooO0O0) o00O00o0.OooO00o(c0198OooO00o.f11385OooO0O0));
        Oooo(oooO00oOooo0o, 1006, new o00O.OooO00o(i, j, j2) { // from class: o00o0o.o00O000o

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ long f39132OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ int f39133OooO0o0;

            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).o00o0O(this.f39131OooO0Oo, this.f39133OooO0o0, this.f39132OooO0o);
            }
        });
    }

    @Override // p200o00o0o.o00O0O
    public final void OooO0O0(o0 o0Var) {
        AnalyticsListener.OooO00o oooO00oOooo0o = Oooo0o(this.f11379OooO0oO.f11389OooO0o0);
        Oooo(oooO00oOooo0o, Constants.WARN_ADM_PLAYOUT_ABNORMAL_FREQUENCY, new o00OOOOo(oooO00oOooo0o, o0Var));
    }

    @Override // p200o00o0o.o00O0O
    public final void OooO0OO(final String str) {
        final AnalyticsListener.OooO00o oooO00oOooo0oo = Oooo0oo();
        Oooo(oooO00oOooo0oo, 1019, new o00O.OooO00o(oooO00oOooo0oo, str) { // from class: o00o0o.o00Ooo
            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).o00oO0o();
            }
        });
    }

    @Override // p200o00o0o.o00O0O
    public final void OooO0Oo(final String str) {
        final AnalyticsListener.OooO00o oooO00oOooo0oo = Oooo0oo();
        Oooo(oooO00oOooo0oo, 1012, new o00O.OooO00o(oooO00oOooo0oo, str) { // from class: o00o0o.o0O0O00
            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).o0OO00O();
            }
        });
    }

    @Override // p200o00o0o.o00O0O
    public final void OooO0o(com.google.android.exoplayer2.OooOo oooOo, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
        AnalyticsListener.OooO00o oooO00oOooo0oo = Oooo0oo();
        Oooo(oooO00oOooo0oo, 1017, new o000(oooO00oOooo0oo, oooOo, decoderReuseEvaluation));
    }

    @Override // p200o00o0o.o00O0O
    public final void OooO0o0(Exception exc) {
        AnalyticsListener.OooO00o oooO00oOooo0oo = Oooo0oo();
        Oooo(oooO00oOooo0oo, 1014, new o00OOO00(oooO00oOooo0oo, exc));
    }

    @Override // p200o00o0o.o00O0O
    public final void OooO0oO(long j) {
        AnalyticsListener.OooO00o oooO00oOooo0oo = Oooo0oo();
        Oooo(oooO00oOooo0oo, 1010, new o000000O(oooO00oOooo0oo, j));
    }

    @Override // p200o00o0o.o00O0O
    public final void OooO0oo(Exception exc) {
        AnalyticsListener.OooO00o oooO00oOooo0oo = Oooo0oo();
        Oooo(oooO00oOooo0oo, 1030, new o00O00(oooO00oOooo0oo, exc));
    }

    @Override // com.google.android.exoplayer2.source.OooOo00
    public final void OooOO0(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, final o0000 o0000Var, final o0000O00 o0000o00, final IOException iOException, final boolean z) {
        final AnalyticsListener.OooO00o oooO00oOooo0oO = Oooo0oO(i, oooO0O0);
        Oooo(oooO00oOooo0oO, 1003, new o00O.OooO00o(oooO00oOooo0oO, o0000Var, o0000o00, iOException, z) { // from class: o00o0o.o000OO

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ o0000O00 f39123OooO0Oo;

            {
                this.f39123OooO0Oo = o0000o00;
            }

            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).OooOo0o(this.f39123OooO0Oo);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.OooO0O0
    public final /* synthetic */ void OooOO0O() {
    }

    @Override // p200o00o0o.o00O0O
    public final void OooOO0o(final long j, final long j2, final String str) {
        final AnalyticsListener.OooO00o oooO00oOooo0oo = Oooo0oo();
        Oooo(oooO00oOooo0oo, 1008, new o00O.OooO00o(oooO00oOooo0oo, str, j2, j) { // from class: o00o0o.o0Oo0oo
            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                AnalyticsListener analyticsListener = (AnalyticsListener) obj;
                analyticsListener.OoooOOO();
                analyticsListener.Oooo0O0();
            }
        });
    }

    @Override // p200o00o0o.o00O0O
    public final void OooOOO(final int i, final long j) {
        final AnalyticsListener.OooO00o oooO00oOooo0o = Oooo0o(this.f11379OooO0oO.f11389OooO0o0);
        Oooo(oooO00oOooo0o, 1018, new o00O.OooO00o(i, j, oooO00oOooo0o) { // from class: o00o0o.o00000OO
            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).OoooOoo();
            }
        });
    }

    @Override // p200o00o0o.o00O0O
    public final void OooOOO0(final int i, final long j) {
        final AnalyticsListener.OooO00o oooO00oOooo0o = Oooo0o(this.f11379OooO0oO.f11389OooO0o0);
        Oooo(oooO00oOooo0o, Constants.WARN_ADM_RECORD_ABNORMAL_FREQUENCY, new o00O.OooO00o(i, j, oooO00oOooo0o) { // from class: o00o0o.o00O00O
            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).Oooo0oo();
            }
        });
    }

    @Override // p200o00o0o.o00O0O
    public final void OooOOOO(final com.google.android.exoplayer2.OooOo oooOo, @Nullable final DecoderReuseEvaluation decoderReuseEvaluation) {
        final AnalyticsListener.OooO00o oooO00oOooo0oo = Oooo0oo();
        Oooo(oooO00oOooo0oo, 1009, new o00O.OooO00o(oooO00oOooo0oo, oooOo, decoderReuseEvaluation) { // from class: o00o0o.o0000Ooo
            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                AnalyticsListener analyticsListener = (AnalyticsListener) obj;
                analyticsListener.OooOO0();
                analyticsListener.Oooo00o();
            }
        });
    }

    @Override // p200o00o0o.o00O0O
    public final void OooOOOo(final o0 o0Var) {
        final AnalyticsListener.OooO00o oooO00oOooo0o = Oooo0o(this.f11379OooO0oO.f11389OooO0o0);
        Oooo(oooO00oOooo0o, 1013, new o00O.OooO00o(oooO00oOooo0o, o0Var) { // from class: o00o0o.o0000OO0
            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).OooOo0();
            }
        });
    }

    @Override // p200o00o0o.o00O0O
    public final void OooOOo(o0 o0Var) {
        AnalyticsListener.OooO00o oooO00oOooo0oo = Oooo0oo();
        Oooo(oooO00oOooo0oo, 1007, new OooOO0(oooO00oOooo0oo, o0Var));
    }

    @Override // p200o00o0o.o00O0O
    public final void OooOOo0(final Exception exc) {
        final AnalyticsListener.OooO00o oooO00oOooo0oo = Oooo0oo();
        Oooo(oooO00oOooo0oo, 1029, new o00O.OooO00o(oooO00oOooo0oo, exc) { // from class: o00o0o.o0000O
            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).Oooo0OO();
            }
        });
    }

    @Override // p200o00o0o.o00O0O
    public final void OooOOoo(final o0 o0Var) {
        final AnalyticsListener.OooO00o oooO00oOooo0oo = Oooo0oo();
        Oooo(oooO00oOooo0oo, 1015, new o00O.OooO00o(oooO00oOooo0oo, o0Var) { // from class: o00o0o.o00oO0o
            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).Oooo0o();
            }
        });
    }

    @Override // p200o00o0o.o00O0O
    @CallSuper
    public final void OooOo(final Player player, Looper looper) {
        o00O000o.OooO0Oo(this.f11381OooOO0 == null || this.f11379OooO0oO.f11385OooO0O0.isEmpty());
        player.getClass();
        this.f11381OooOO0 = player;
        this.f11382OooOO0O = this.f11376OooO0Oo.OooO0O0(looper, null);
        o00O<AnalyticsListener> o00o2 = this.f11375OooO;
        this.f11375OooO = new o00O<>(o00o2.f40547OooO0Oo, looper, o00o2.f40544OooO00o, new o00O.OooO0O0() { // from class: o00o0o.oo0o0Oo
            @Override // o00oo0o.o00O.OooO0O0
            public final void OooO00o(Object obj, o00O0OO o00o0oo2) {
                ((AnalyticsListener) obj).OooOoo0(player, new AnalyticsListener.OooO0O0(o00o0oo2, this.f39142OooO0Oo.f11380OooO0oo));
            }
        }, o00o2.f40543OooO);
    }

    @Override // p200o00o0o.o00O0O
    public final void OooOo0(final long j, final long j2, final String str) {
        final AnalyticsListener.OooO00o oooO00oOooo0oo = Oooo0oo();
        Oooo(oooO00oOooo0oo, 1016, new o00O.OooO00o(oooO00oOooo0oo, str, j2, j) { // from class: o00o0o.o00O00OO
            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                AnalyticsListener analyticsListener = (AnalyticsListener) obj;
                analyticsListener.ooOO();
                analyticsListener.oo000o();
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.OooO0O0
    public final void OooOo00(int i, @Nullable OooOOOO.OooO0O0 oooO0O0) {
        AnalyticsListener.OooO00o oooO00oOooo0oO = Oooo0oO(i, oooO0O0);
        Oooo(oooO00oOooo0oO, 1026, new p022Oooo00O.Oooo000(oooO00oOooo0oO));
    }

    @Override // p200o00o0o.o00O0O
    public final void OooOo0O(final int i, final long j, final long j2) {
        final AnalyticsListener.OooO00o oooO00oOooo0oo = Oooo0oo();
        Oooo(oooO00oOooo0oo, 1011, new o00O.OooO00o(oooO00oOooo0oo, i, j, j2) { // from class: o00o0o.o000O
            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).OooOooO();
            }
        });
    }

    @Override // p200o00o0o.o00O0O
    public final void OooOo0o() {
        if (this.f11383OooOO0o) {
            return;
        }
        AnalyticsListener.OooO00o oooO00oOooo0OO = Oooo0OO();
        this.f11383OooOO0o = true;
        Oooo(oooO00oOooo0OO, -1, new oOO00O(oooO00oOooo0OO));
    }

    @Override // p200o00o0o.o00O0O
    @CallSuper
    public final void OooOoO(OooO0OO oooO0OO) {
        this.f11375OooO.OooO00o(oooO0OO);
    }

    @Override // com.google.android.exoplayer2.source.OooOo00
    public final void OooOoO0(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, final o0000 o0000Var, final o0000O00 o0000o00) {
        final AnalyticsListener.OooO00o oooO00oOooo0oO = Oooo0oO(i, oooO0O0);
        Oooo(oooO00oOooo0oO, 1002, new o00O.OooO00o(oooO00oOooo0oO, o0000Var, o0000o00) { // from class: o00o0o.o0OO00O
            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).Ooooo0o();
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.OooOo00
    public final void OooOoOO(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, o0000 o0000Var, o0000O00 o0000o00) {
        AnalyticsListener.OooO00o oooO00oOooo0oO = Oooo0oO(i, oooO0O0);
        Oooo(oooO00oOooo0oO, 1000, new o000O00(oooO00oOooo0oO, o0000Var, o0000o00));
    }

    @Override // com.google.android.exoplayer2.drm.OooO0O0
    public final void OooOoo(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, Exception exc) {
        AnalyticsListener.OooO00o oooO00oOooo0oO = Oooo0oO(i, oooO0O0);
        Oooo(oooO00oOooo0oO, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, new OooO(oooO00oOooo0oO, exc));
    }

    @Override // com.google.android.exoplayer2.source.OooOo00
    public final void OooOoo0(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, final o0000O00 o0000o00) {
        final AnalyticsListener.OooO00o oooO00oOooo0oO = Oooo0oO(i, oooO0O0);
        Oooo(oooO00oOooo0oO, 1005, new o00O.OooO00o(oooO00oOooo0oO, o0000o00) { // from class: o00o0o.o0000
            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).Oooo000();
            }
        });
    }

    @Override // p200o00o0o.o00O0O
    public final void OooOooO(o0O00 o0o01, @Nullable OooOOOO.OooO0O0 oooO0O0) {
        Player player = this.f11381OooOO0;
        player.getClass();
        C0198OooO00o c0198OooO00o = this.f11379OooO0oO;
        c0198OooO00o.getClass();
        c0198OooO00o.f11385OooO0O0 = ImmutableList.OooOO0O(o0o01);
        if (!o0o01.isEmpty()) {
            c0198OooO00o.f11389OooO0o0 = (OooOOOO.OooO0O0) o0o01.get(0);
            oooO0O0.getClass();
            c0198OooO00o.f11388OooO0o = oooO0O0;
        }
        if (c0198OooO00o.f11387OooO0Oo == null) {
            c0198OooO00o.f11387OooO0Oo = C0198OooO00o.OooO0O0(player, c0198OooO00o.f11385OooO0O0, c0198OooO00o.f11389OooO0o0, c0198OooO00o.f11384OooO00o);
        }
        c0198OooO00o.OooO0Oo(player.OooOO0());
    }

    @Override // com.google.android.exoplayer2.source.OooOo00
    public final void OooOooo(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, final o0000 o0000Var, final o0000O00 o0000o00) {
        final AnalyticsListener.OooO00o oooO00oOooo0oO = Oooo0oO(i, oooO0O0);
        Oooo(oooO00oOooo0oO, 1001, new o00O.OooO00o(oooO00oOooo0oO, o0000Var, o0000o00) { // from class: o00o0o.o000O0O0
            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).OooooOo();
            }
        });
    }

    public final void Oooo(AnalyticsListener.OooO00o oooO00o, int i, o00O.OooO00o<AnalyticsListener> oooO00o2) {
        this.f11380OooO0oo.put(i, oooO00o);
        this.f11375OooO.OooO0o0(i, oooO00o2);
    }

    @Override // com.google.android.exoplayer2.drm.OooO0O0
    public final void Oooo0(int i, @Nullable OooOOOO.OooO0O0 oooO0O0) {
        AnalyticsListener.OooO00o oooO00oOooo0oO = Oooo0oO(i, oooO0O0);
        Oooo(oooO00oOooo0oO, 1027, new o000000(oooO00oOooo0oO, 0));
    }

    @Override // com.google.android.exoplayer2.drm.OooO0O0
    public final void Oooo000(int i, @Nullable OooOOOO.OooO0O0 oooO0O0) {
        AnalyticsListener.OooO00o oooO00oOooo0oO = Oooo0oO(i, oooO0O0);
        Oooo(oooO00oOooo0oO, 1023, new o00(oooO00oOooo0oO));
    }

    @Override // com.google.android.exoplayer2.source.OooOo00
    public final void Oooo00O(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, o0000O00 o0000o00) {
        AnalyticsListener.OooO00o oooO00oOooo0oO = Oooo0oO(i, oooO0O0);
        Oooo(oooO00oOooo0oO, 1004, new o00OOO0(oooO00oOooo0oO, o0000o00));
    }

    @Override // com.google.android.exoplayer2.drm.OooO0O0
    public final void Oooo00o(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, int i2) {
        AnalyticsListener.OooO00o oooO00oOooo0oO = Oooo0oO(i, oooO0O0);
        Oooo(oooO00oOooo0oO, 1022, new o000O000(oooO00oOooo0oO, i2));
    }

    @Override // com.google.android.exoplayer2.drm.OooO0O0
    public final void Oooo0O0(int i, @Nullable OooOOOO.OooO0O0 oooO0O0) {
        AnalyticsListener.OooO00o oooO00oOooo0oO = Oooo0oO(i, oooO0O0);
        Oooo(oooO00oOooo0oO, 1025, new o0O0ooO(oooO00oOooo0oO));
    }

    public final AnalyticsListener.OooO00o Oooo0OO() {
        return Oooo0o(this.f11379OooO0oO.f11387OooO0Oo);
    }

    public final AnalyticsListener.OooO00o Oooo0o(@Nullable OooOOOO.OooO0O0 oooO0O0) {
        this.f11381OooOO0.getClass();
        oo0o0Oo oo0o0oo = oooO0O0 == null ? null : this.f11379OooO0oO.f11386OooO0OO.get(oooO0O0);
        if (oooO0O0 != null && oo0o0oo != null) {
            return Oooo0o0(oo0o0oo, oo0o0oo.OooO0oo(oooO0O0.f39859OooO00o, this.f11378OooO0o0).f12906OooO0o, oooO0O0);
        }
        int iOooOo00 = this.f11381OooOO0.OooOo00();
        oo0o0Oo oo0o0ooOooOO0 = this.f11381OooOO0.OooOO0();
        if (!(iOooOo00 < oo0o0ooOooOO0.OooOOOo())) {
            oo0o0ooOooOO0 = oo0o0Oo.f12895OooO0Oo;
        }
        return Oooo0o0(oo0o0ooOooOO0, iOooOo00, null);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    @RequiresNonNull({"player"})
    public final AnalyticsListener.OooO00o Oooo0o0(oo0o0Oo oo0o0oo, int i, @Nullable OooOOOO.OooO0O0 oooO0O0) {
        long jOoooOO0;
        OooOOOO.OooO0O0 oooO0O1 = oo0o0oo.OooOOo0() ? null : oooO0O0;
        long jElapsedRealtime = this.f11376OooO0Oo.elapsedRealtime();
        boolean z = oo0o0oo.equals(this.f11381OooOO0.OooOO0()) && i == this.f11381OooOO0.OooOo00();
        if (oooO0O1 != null && oooO0O1.OooO00o()) {
            if (z && this.f11381OooOO0.Oooo0() == oooO0O1.f39860OooO0O0 && this.f11381OooOO0.OoooOoO() == oooO0O1.f39861OooO0OO) {
                jOoooOO0 = this.f11381OooOO0.getCurrentPosition();
            } else {
                jOoooOO0 = 0;
            }
        } else if (z) {
            jOoooOO0 = this.f11381OooOO0.OooOOo();
        } else if (oo0o0oo.OooOOo0()) {
            jOoooOO0 = 0;
        } else {
            jOoooOO0 = p245o00oo0o.o0O00.OoooOO0(oo0o0oo.OooOOO(i, this.f11377OooO0o).f12939OooOOOo);
        }
        return new AnalyticsListener.OooO00o(jElapsedRealtime, oo0o0oo, i, oooO0O1, jOoooOO0, this.f11381OooOO0.OooOO0(), this.f11381OooOO0.OooOo00(), this.f11379OooO0oO.f11387OooO0Oo, this.f11381OooOO0.getCurrentPosition(), this.f11381OooOO0.OooOoo());
    }

    public final AnalyticsListener.OooO00o Oooo0oO(int i, @Nullable OooOOOO.OooO0O0 oooO0O0) {
        this.f11381OooOO0.getClass();
        if (oooO0O0 != null) {
            return this.f11379OooO0oO.f11386OooO0OO.get(oooO0O0) != null ? Oooo0o(oooO0O0) : Oooo0o0(oo0o0Oo.f12895OooO0Oo, i, oooO0O0);
        }
        oo0o0Oo oo0o0ooOooOO0 = this.f11381OooOO0.OooOO0();
        if (!(i < oo0o0ooOooOO0.OooOOOo())) {
            oo0o0ooOooOO0 = oo0o0Oo.f12895OooO0Oo;
        }
        return Oooo0o0(oo0o0ooOooOO0, i, null);
    }

    public final AnalyticsListener.OooO00o Oooo0oo() {
        return Oooo0o(this.f11379OooO0oO.f11388OooO0o);
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onAudioAttributesChanged(com.google.android.exoplayer2.audio.OooO00o oooO00o) {
        AnalyticsListener.OooO00o oooO00oOooo0oo = Oooo0oo();
        Oooo(oooO00oOooo0oo, 20, new o00OO(oooO00oOooo0oo, oooO00o));
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onAvailableCommandsChanged(Player.OooO00o oooO00o) {
        AnalyticsListener.OooO00o oooO00oOooo0OO = Oooo0OO();
        Oooo(oooO00oOooo0OO, 13, new o000O0Oo(oooO00oOooo0OO, oooO00o));
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onCues(final List<Cue> list) {
        final AnalyticsListener.OooO00o oooO00oOooo0OO = Oooo0OO();
        Oooo(oooO00oOooo0OO, 27, new o00O.OooO00o(oooO00oOooo0OO, list) { // from class: o00o0o.o000O0Oo

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ List f39122OooO0Oo;

            {
                this.f39122OooO0Oo = list;
            }

            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).o0ooOOo();
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        AnalyticsListener.OooO00o oooO00oOooo0OO = Oooo0OO();
        Oooo(oooO00oOooo0OO, 29, new o000OOo(oooO00oOooo0OO, deviceInfo));
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onEvents(Player player, Player.OooO0O0 oooO0O0) {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onIsLoadingChanged(final boolean z) {
        final AnalyticsListener.OooO00o oooO00oOooo0OO = Oooo0OO();
        Oooo(oooO00oOooo0OO, 3, new o00O.OooO00o(oooO00oOooo0OO, z) { // from class: o00o0o.o000O0o
            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                AnalyticsListener analyticsListener = (AnalyticsListener) obj;
                analyticsListener.Oooo00O();
                analyticsListener.Oooo0();
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onIsPlayingChanged(final boolean z) {
        final AnalyticsListener.OooO00o oooO00oOooo0OO = Oooo0OO();
        Oooo(oooO00oOooo0OO, 7, new o00O.OooO00o(oooO00oOooo0OO, z) { // from class: o00o0o.o00000
            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).OooOooo();
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onLoadingChanged(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onMediaItemTransition(@Nullable final o000oOoO o000oooo2, final int i) {
        final AnalyticsListener.OooO00o oooO00oOooo0OO = Oooo0OO();
        Oooo(oooO00oOooo0OO, 1, new o00O.OooO00o(oooO00oOooo0OO, o000oooo2, i) { // from class: o00o0o.o0000oo
            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).Oooooo();
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        AnalyticsListener.OooO00o oooO00oOooo0OO = Oooo0OO();
        Oooo(oooO00oOooo0OO, 14, new o000OO00(oooO00oOooo0OO, mediaMetadata));
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onMetadata(final Metadata metadata) {
        final AnalyticsListener.OooO00o oooO00oOooo0OO = Oooo0OO();
        Oooo(oooO00oOooo0OO, 28, new o00O.OooO00o(oooO00oOooo0OO, metadata) { // from class: o00o0o.o00Oo0
            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).OoooO();
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onPlayWhenReadyChanged(final boolean z, final int i) {
        final AnalyticsListener.OooO00o oooO00oOooo0OO = Oooo0OO();
        Oooo(oooO00oOooo0OO, 5, new o00O.OooO00o(i, oooO00oOooo0OO, z) { // from class: o00o0o.o0000O0O
            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).OooOo0O();
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onPlaybackParametersChanged(final o00Ooo o00ooo2) {
        final AnalyticsListener.OooO00o oooO00oOooo0OO = Oooo0OO();
        Oooo(oooO00oOooo0OO, 12, new o00O.OooO00o(oooO00oOooo0OO, o00ooo2) { // from class: o00o0o.o000Oo0
            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).o00ooo();
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onPlaybackStateChanged(final int i) {
        final AnalyticsListener.OooO00o oooO00oOooo0OO = Oooo0OO();
        Oooo(oooO00oOooo0OO, 4, new o00O.OooO00o(oooO00oOooo0OO, i) { // from class: o00o0o.o00oOoo
            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).OoooO0();
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onPlaybackSuppressionReasonChanged(final int i) {
        final AnalyticsListener.OooO00o oooO00oOooo0OO = Oooo0OO();
        Oooo(oooO00oOooo0OO, 6, new o00O.OooO00o(oooO00oOooo0OO, i) { // from class: o00o0o.o00000O0
            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).OoooO0O();
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onPlayerError(PlaybackException playbackException) {
        o0000oo o0000ooVar;
        final ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
        final AnalyticsListener.OooO00o oooO00oOooo0OO = (!(exoPlaybackException instanceof ExoPlaybackException) || (o0000ooVar = exoPlaybackException.f10926OooOOOo) == null) ? Oooo0OO() : Oooo0o(new OooOOOO.OooO0O0(o0000ooVar));
        Oooo(oooO00oOooo0OO, 10, new o00O.OooO00o(oooO00oOooo0OO, exoPlaybackException) { // from class: o00o0o.o0OOO0o

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ PlaybackException f39138OooO0Oo;

            {
                this.f39138OooO0Oo = exoPlaybackException;
            }

            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlayerError(this.f39138OooO0Oo);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onPlayerErrorChanged(@Nullable PlaybackException playbackException) {
        o0000oo o0000ooVar;
        final ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
        final AnalyticsListener.OooO00o oooO00oOooo0OO = (!(exoPlaybackException instanceof ExoPlaybackException) || (o0000ooVar = exoPlaybackException.f10926OooOOOo) == null) ? Oooo0OO() : Oooo0o(new OooOOOO.OooO0O0(o0000ooVar));
        Oooo(oooO00oOooo0OO, 10, new o00O.OooO00o(oooO00oOooo0OO, exoPlaybackException) { // from class: o00o0o.o00O00o0
            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).Oooo0oO();
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onPlayerStateChanged(final boolean z, final int i) {
        final AnalyticsListener.OooO00o oooO00oOooo0OO = Oooo0OO();
        Oooo(oooO00oOooo0OO, -1, new o00O.OooO00o(i, oooO00oOooo0OO, z) { // from class: o00o0o.o00000O
            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).o00Ooo();
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onPositionDiscontinuity(int i) {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onRenderedFirstFrame() {
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onRepeatModeChanged(final int i) {
        final AnalyticsListener.OooO00o oooO00oOooo0OO = Oooo0OO();
        Oooo(oooO00oOooo0OO, 8, new o00O.OooO00o(oooO00oOooo0OO, i) { // from class: o00o0o.o0000O00
            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).OoooOo0();
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onShuffleModeEnabledChanged(final boolean z) {
        final AnalyticsListener.OooO00o oooO00oOooo0OO = Oooo0OO();
        Oooo(oooO00oOooo0OO, 9, new o00O.OooO00o(oooO00oOooo0OO, z) { // from class: o00o0o.oo000o
            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).OooooOO();
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onSkipSilenceEnabledChanged(final boolean z) {
        final AnalyticsListener.OooO00o oooO00oOooo0oo = Oooo0oo();
        Oooo(oooO00oOooo0oo, 23, new o00O.OooO00o(oooO00oOooo0oo, z) { // from class: o00o0o.o00O000
            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).OooOoO();
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onSurfaceSizeChanged(int i, int i2) {
        AnalyticsListener.OooO00o oooO00oOooo0oo = Oooo0oo();
        Oooo(oooO00oOooo0oo, 24, new o0000O0(oooO00oOooo0oo, i, i2));
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onTimelineChanged(oo0o0Oo oo0o0oo, final int i) {
        Player player = this.f11381OooOO0;
        player.getClass();
        C0198OooO00o c0198OooO00o = this.f11379OooO0oO;
        c0198OooO00o.f11387OooO0Oo = C0198OooO00o.OooO0O0(player, c0198OooO00o.f11385OooO0O0, c0198OooO00o.f11389OooO0o0, c0198OooO00o.f11384OooO00o);
        c0198OooO00o.OooO0Oo(player.OooOO0());
        final AnalyticsListener.OooO00o oooO00oOooo0OO = Oooo0OO();
        Oooo(oooO00oOooo0OO, 0, new o00O.OooO00o(oooO00oOooo0OO, i) { // from class: o00o0o.o000O0
            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).o0OoOo0();
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onTrackSelectionParametersChanged(final com.google.android.exoplayer2.trackselection.OooO oooO) {
        final AnalyticsListener.OooO00o oooO00oOooo0OO = Oooo0OO();
        Oooo(oooO00oOooo0OO, 19, new o00O.OooO00o(oooO00oOooo0OO, oooO) { // from class: o00o0o.o000OO00
            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).Oooo();
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onTracksChanged(final o0O0O00 o0o0o00) {
        final AnalyticsListener.OooO00o oooO00oOooo0OO = Oooo0OO();
        Oooo(oooO00oOooo0OO, 2, new o00O.OooO00o(oooO00oOooo0OO, o0o0o00) { // from class: o00o0o.o000000O
            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).o000oOoO();
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onVideoSizeChanged(o0oOOo o0oooo) {
        AnalyticsListener.OooO00o oooO00oOooo0oo = Oooo0oo();
        Oooo(oooO00oOooo0oo, 25, new oo0o0O0(oooO00oOooo0oo, o0oooo));
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onVolumeChanged(final float f) {
        final AnalyticsListener.OooO00o oooO00oOooo0oo = Oooo0oo();
        Oooo(oooO00oOooo0oo, 22, new o00O.OooO00o(oooO00oOooo0oo, f) { // from class: o00o0o.o000O00O
            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).OoooO00();
            }
        });
    }

    @Override // p200o00o0o.o00O0O
    @CallSuper
    public final void release() {
        o00O0OOO o00o0ooo2 = this.f11382OooOO0O;
        o00O000o.OooO0o0(o00o0ooo2);
        o00o0ooo2.OooO0oo(new o0ooOOo(this, 0));
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onPositionDiscontinuity(final Player.OooO0o oooO0o, final Player.OooO0o oooO0o2, final int i) {
        if (i == 1) {
            this.f11383OooOO0o = false;
        }
        Player player = this.f11381OooOO0;
        player.getClass();
        C0198OooO00o c0198OooO00o = this.f11379OooO0oO;
        c0198OooO00o.f11387OooO0Oo = C0198OooO00o.OooO0O0(player, c0198OooO00o.f11385OooO0O0, c0198OooO00o.f11389OooO0o0, c0198OooO00o.f11384OooO00o);
        final AnalyticsListener.OooO00o oooO00oOooo0OO = Oooo0OO();
        Oooo(oooO00oOooo0OO, 11, new o00O.OooO00o(i, oooO0o, oooO0o2, oooO00oOooo0OO) { // from class: o00o0o.o000OO0O

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ int f39124OooO0Oo;

            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                AnalyticsListener analyticsListener = (AnalyticsListener) obj;
                analyticsListener.o0Oo0oo();
                analyticsListener.onPositionDiscontinuity(this.f39124OooO0Oo);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.OooO0OO
    public final void onCues(o0000O0O o0000o0o2) {
        AnalyticsListener.OooO00o oooO00oOooo0OO = Oooo0OO();
        Oooo(oooO00oOooo0OO, 27, new o000O(oooO00oOooo0OO, o0000o0o2));
    }
}
