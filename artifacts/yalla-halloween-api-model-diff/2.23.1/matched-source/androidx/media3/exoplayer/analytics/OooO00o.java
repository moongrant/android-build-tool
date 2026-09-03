package androidx.media3.exoplayer.analytics;

import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.compose.foundation.layout.oo000o;
import androidx.compose.material.OooO;
import androidx.compose.runtime.OooOOO0;
import androidx.compose.runtime.o000oOoO;
import androidx.compose.ui.graphics.colorspace.OooOOO;
import androidx.compose.ui.graphics.colorspace.OooOo00;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.OooOO0;
import androidx.media3.common.Oooo0;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.o00Oo0;
import androidx.media3.common.o00Ooo;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.OooOOOO;
import androidx.media3.session.o000O;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.o0O00;
import com.google.common.collect.o0OoO00O;
import io.agora.rtc.Constants;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import o000O.Oooo000;
import o000O0.o0000OO0;
import o000O0.o0OoOo0;
import o000O00O.OooOo;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p022Oooo00O.o000O00O;
import p022Oooo00O.o0O00oO0;
import p022Oooo00O.o0OOO0;
import p028Oooo0oO.o00OOO00;
import p028Oooo0oO.o00OOOO0;
import p028Oooo0oO.oo0O;
import p042OooooO0.o00O0;
import p045Oooooo.o000000O;
import p069o0000ooO.o0000O0O;
import p080o000OoO.o00000;
import p080o000OoO.o000OO00;
import p080o000OoO.o000OOo;
import p080o000OoO.o00O0O;
import p080o000OoO.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class OooO00o implements o000O0.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o00000<AnalyticsListener> f7346OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00oO0o f7347OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Oooo0.OooO0o f7348OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Oooo0.OooO0O0 f7349OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C0145OooO00o f7350OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final SparseArray<AnalyticsListener.OooO00o> f7351OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public Player f7352OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public o000OOo f7353OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f7354OooOO0o;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.analytics.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0145OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Oooo0.OooO0O0 f7355OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public ImmutableList<OooOOOO.OooO0O0> f7356OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public ImmutableMap<OooOOOO.OooO0O0, Oooo0> f7357OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public OooOOOO.OooO0O0 f7358OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public OooOOOO.OooO0O0 f7359OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public OooOOOO.OooO0O0 f7360OooO0o0;

        public C0145OooO00o(Oooo0.OooO0O0 oooO0O0) {
            this.f7355OooO00o = oooO0O0;
            ImmutableList.OooO0O0 oooO0O1 = ImmutableList.f18686OooO0o0;
            this.f7356OooO0O0 = o0O00.f19065OooO0oo;
            this.f7357OooO0OO = o0OoO00O.f19155OooOO0;
        }

        @Nullable
        public static OooOOOO.OooO0O0 OooO0O0(Player player, ImmutableList<OooOOOO.OooO0O0> immutableList, @Nullable OooOOOO.OooO0O0 oooO0O0, Oooo0.OooO0O0 oooO0O1) {
            Oooo0 oooo0OooOo0 = player.OooOo0();
            int iOooOooO = player.OooOooO();
            Object objOooOOOo = oooo0OooOo0.OooOo00() ? null : oooo0OooOo0.OooOOOo(iOooOooO);
            int iOooO0o0 = (player.OooO0o() || oooo0OooOo0.OooOo00()) ? -1 : oooo0OooOo0.OooO(iOooOooO, oooO0O1).OooO0o0(o000OO00.Oooo0OO(player.getCurrentPosition()) - oooO0O1.OooOO0());
            for (int i = 0; i < immutableList.size(); i++) {
                OooOOOO.OooO0O0 oooO0O2 = immutableList.get(i);
                if (OooO0OO(oooO0O2, objOooOOOo, player.OooO0o(), player.OooOOOo(), player.Oooo00o(), iOooO0o0)) {
                    return oooO0O2;
                }
            }
            if (immutableList.isEmpty() && oooO0O0 != null) {
                if (OooO0OO(oooO0O0, objOooOOOo, player.OooO0o(), player.OooOOOo(), player.Oooo00o(), iOooO0o0)) {
                    return oooO0O0;
                }
            }
            return null;
        }

        public static boolean OooO0OO(OooOOOO.OooO0O0 oooO0O0, @Nullable Object obj, boolean z, int i, int i2, int i3) {
            if (!oooO0O0.f33815OooO00o.equals(obj)) {
                return false;
            }
            int i4 = oooO0O0.f33816OooO0O0;
            return (z && i4 == i && oooO0O0.f33817OooO0OO == i2) || (!z && i4 == -1 && oooO0O0.f33819OooO0o0 == i3);
        }

        public final void OooO00o(ImmutableMap.OooO00o<OooOOOO.OooO0O0, Oooo0> oooO00o, @Nullable OooOOOO.OooO0O0 oooO0O0, Oooo0 oooo0) {
            if (oooO0O0 == null) {
                return;
            }
            if (oooo0.OooO0o0(oooO0O0.f33815OooO00o) != -1) {
                oooO00o.OooO0OO(oooO0O0, oooo0);
                return;
            }
            Oooo0 oooo1 = this.f7357OooO0OO.get(oooO0O0);
            if (oooo1 != null) {
                oooO00o.OooO0OO(oooO0O0, oooo1);
            }
        }

        public final void OooO0Oo(Oooo0 oooo0) {
            ImmutableMap.OooO00o<OooOOOO.OooO0O0, Oooo0> OooO00o2 = ImmutableMap.OooO00o();
            if (this.f7356OooO0O0.isEmpty()) {
                OooO00o(OooO00o2, this.f7360OooO0o0, oooo0);
                if (!com.google.common.base.Oooo0.OooO00o(this.f7359OooO0o, this.f7360OooO0o0)) {
                    OooO00o(OooO00o2, this.f7359OooO0o, oooo0);
                }
                if (!com.google.common.base.Oooo0.OooO00o(this.f7358OooO0Oo, this.f7360OooO0o0) && !com.google.common.base.Oooo0.OooO00o(this.f7358OooO0Oo, this.f7359OooO0o)) {
                    OooO00o(OooO00o2, this.f7358OooO0Oo, oooo0);
                }
            } else {
                for (int i = 0; i < this.f7356OooO0O0.size(); i++) {
                    OooO00o(OooO00o2, this.f7356OooO0O0.get(i), oooo0);
                }
                if (!this.f7356OooO0O0.contains(this.f7358OooO0Oo)) {
                    OooO00o(OooO00o2, this.f7358OooO0Oo, oooo0);
                }
            }
            this.f7357OooO0OO = OooO00o2.OooO0O0();
        }
    }

    public OooO00o(o00oO0o o00oo0o2) {
        o00oo0o2.getClass();
        this.f7347OooO0Oo = o00oo0o2;
        int i = o000OO00.f34965OooO00o;
        Looper looperMyLooper = Looper.myLooper();
        this.f7346OooO = new o00000<>(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, o00oo0o2, new o00O0());
        Oooo0.OooO0O0 oooO0O0 = new Oooo0.OooO0O0();
        this.f7349OooO0o0 = oooO0O0;
        this.f7348OooO0o = new Oooo0.OooO0o();
        this.f7350OooO0oO = new C0145OooO00o(oooO0O0);
        this.f7351OooO0oo = new SparseArray<>();
    }

    @Override // o000O0.OooO00o
    public final void OooO(Exception exc) {
        AnalyticsListener.OooO00o oooO00oOooo0oO = Oooo0oO();
        Oooo0oo(oooO00oOooo0oO, 1030, new o00OOO00(oooO00oOooo0oO, exc));
    }

    @Override // o000O0.OooO00o
    public final void OooO00o(final OooOo oooOo) {
        final AnalyticsListener.OooO00o oooO00oOooo0o0 = Oooo0o0(this.f7350OooO0oO.f7360OooO0o0);
        Oooo0oo(oooO00oOooo0o0, Constants.WARN_ADM_PLAYOUT_ABNORMAL_FREQUENCY, new o00000.OooO00o(oooO00oOooo0o0, oooOo) { // from class: o000O0.o000OOo

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ o000O00O.OooOo f33913OooO0Oo;

            {
                this.f33913OooO0Oo = oooOo;
            }

            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).OooO00o(this.f33913OooO0Oo);
            }
        });
    }

    @Override // o000O0.OooO00o
    public final void OooO0O0(String str) {
        AnalyticsListener.OooO00o oooO00oOooo0oO = Oooo0oO();
        Oooo0oo(oooO00oOooo0oO, 1019, new o000O(oooO00oOooo0oO, str));
    }

    @Override // o000O0.OooO00o
    public final void OooO0OO(final String str) {
        final AnalyticsListener.OooO00o oooO00oOooo0oO = Oooo0oO();
        Oooo0oo(oooO00oOooo0oO, 1012, new o00000.OooO00o(oooO00oOooo0oO, str) { // from class: o000O0.o000OO
            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).o0OO00O();
            }
        });
    }

    @Override // o000O0.OooO00o
    public final void OooO0Oo(final OooOo oooOo) {
        final AnalyticsListener.OooO00o oooO00oOooo0o0 = Oooo0o0(this.f7350OooO0oO.f7360OooO0o0);
        Oooo0oo(oooO00oOooo0o0, 1013, new o00000.OooO00o(oooO00oOooo0o0, oooOo) { // from class: o000O0.o0OO00O
            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).OooOo00();
            }
        });
    }

    @Override // o000O0.OooO00o
    public final void OooO0o(final long j) {
        final AnalyticsListener.OooO00o oooO00oOooo0oO = Oooo0oO();
        Oooo0oo(oooO00oOooo0oO, 1010, new o00000.OooO00o(oooO00oOooo0oO, j) { // from class: o000O0.o0O0O00
            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).OooOo0O();
            }
        });
    }

    @Override // o000O0.OooO00o
    public final void OooO0o0(Exception exc) {
        AnalyticsListener.OooO00o oooO00oOooo0oO = Oooo0oO();
        Oooo0oo(oooO00oOooo0oO, 1014, new androidx.compose.foundation.text.OooO00o(oooO00oOooo0oO, exc));
    }

    @Override // o000O0.OooO00o
    public final void OooO0oO(final OooOO0 oooOO1, @Nullable final DecoderReuseEvaluation decoderReuseEvaluation) {
        final AnalyticsListener.OooO00o oooO00oOooo0oO = Oooo0oO();
        Oooo0oo(oooO00oOooo0oO, 1009, new o00000.OooO00o(oooO00oOooo0oO, oooOO1, decoderReuseEvaluation) { // from class: o000O0.o0Oo0oo
            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj) {
                AnalyticsListener analyticsListener = (AnalyticsListener) obj;
                analyticsListener.OooOO0O();
                analyticsListener.Oooo000();
            }
        });
    }

    @Override // o000O0.OooO00o
    public final void OooO0oo(OooOo oooOo) {
        AnalyticsListener.OooO00o oooO00oOooo0oO = Oooo0oO();
        Oooo0oo(oooO00oOooo0oO, 1007, new o000O0.Oooo0(oooO00oOooo0oO, oooOo));
    }

    @Override // o000O0.OooO00o
    public final void OooOO0(final long j, final Object obj) {
        final AnalyticsListener.OooO00o oooO00oOooo0oO = Oooo0oO();
        Oooo0oo(oooO00oOooo0oO, 26, new o00000.OooO00o(oooO00oOooo0oO, obj, j) { // from class: o000O0.o00000OO

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Object f33909OooO0Oo;

            {
                this.f33909OooO0Oo = obj;
            }

            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj2) {
                ((AnalyticsListener) obj2).onRenderedFirstFrame();
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.OooOo00
    public final void OooOO0O(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, Oooo000 oooo000) {
        AnalyticsListener.OooO00o oooO00oOooo0o = Oooo0o(i, oooO0O0);
        Oooo0oo(oooO00oOooo0o, 1004, new oo0O(oooO00oOooo0o, oooo000));
    }

    @Override // o000O0.OooO00o
    public final void OooOO0o(OooOo oooOo) {
        AnalyticsListener.OooO00o oooO00oOooo0oO = Oooo0oO();
        Oooo0oo(oooO00oOooo0oO, 1015, new OooOOO0(oooO00oOooo0oO, oooOo));
    }

    @Override // o000O0.OooO00o
    public final void OooOOO(long j, long j2, String str) {
        AnalyticsListener.OooO00o oooO00oOooo0oO = Oooo0oO();
        Oooo0oo(oooO00oOooo0oO, 1008, new o000O0.Oooo000(oooO00oOooo0oO, str, j2, j));
    }

    @Override // androidx.media3.exoplayer.drm.OooO0O0
    public final /* synthetic */ void OooOOO0() {
    }

    @Override // o000O0.OooO00o
    public final void OooOOOO(final int i, final long j) {
        final AnalyticsListener.OooO00o oooO00oOooo0o0 = Oooo0o0(this.f7350OooO0oO.f7360OooO0o0);
        Oooo0oo(oooO00oOooo0o0, Constants.WARN_ADM_RECORD_ABNORMAL_FREQUENCY, new o00000.OooO00o(i, j, oooO00oOooo0o0) { // from class: o000O0.OooO0O0
            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).Oooo0o();
            }
        });
    }

    @Override // o000O0.OooO00o
    public final void OooOOOo(int i, long j) {
        AnalyticsListener.OooO00o oooO00oOooo0o0 = Oooo0o0(this.f7350OooO0oO.f7360OooO0o0);
        Oooo0oo(oooO00oOooo0o0, 1018, new androidx.compose.runtime.OooO0o(i, j, oooO00oOooo0o0));
    }

    @Override // o000O0.OooO00o
    public final void OooOOo(Exception exc) {
        AnalyticsListener.OooO00o oooO00oOooo0oO = Oooo0oO();
        Oooo0oo(oooO00oOooo0oO, 1029, new androidx.compose.material.OooO0OO(oooO00oOooo0oO, exc));
    }

    @Override // o000O0.OooO00o
    public final void OooOOo0(OooOO0 oooOO1, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
        AnalyticsListener.OooO00o oooO00oOooo0oO = Oooo0oO();
        Oooo0oo(oooO00oOooo0oO, 1017, new o0000OO0(oooO00oOooo0oO, oooOO1, decoderReuseEvaluation));
    }

    @Override // o000OO0o.oo000o.OooO00o
    public final void OooOOoo(final int i, final long j, final long j2) {
        OooOOOO.OooO0O0 next;
        OooOOOO.OooO0O0 oooO0O0;
        OooOOOO.OooO0O0 oooO0O1;
        C0145OooO00o c0145OooO00o = this.f7350OooO0oO;
        if (c0145OooO00o.f7356OooO0O0.isEmpty()) {
            oooO0O1 = null;
        } else {
            ImmutableList<OooOOOO.OooO0O0> immutableList = c0145OooO00o.f7356OooO0O0;
            if (!(immutableList instanceof List)) {
                Iterator<OooOOOO.OooO0O0> it = immutableList.iterator();
                do {
                    next = it.next();
                } while (it.hasNext());
                oooO0O0 = next;
            } else {
                if (immutableList.isEmpty()) {
                    throw new NoSuchElementException();
                }
                oooO0O0 = immutableList.get(immutableList.size() - 1);
            }
            oooO0O1 = oooO0O0;
        }
        final AnalyticsListener.OooO00o oooO00oOooo0o0 = Oooo0o0(oooO0O1);
        Oooo0oo(oooO00oOooo0o0, 1006, new o00000.OooO00o(i, j, j2) { // from class: o000O0.o0000Ooo

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ long f33911OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ int f33912OooO0o0;

            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).o000000O(this.f33910OooO0Oo, this.f33912OooO0o0, this.f33911OooO0o);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.OooOo00
    public final void OooOo(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, final o000O.OooOo oooOo, final Oooo000 oooo000) {
        final AnalyticsListener.OooO00o oooO00oOooo0o = Oooo0o(i, oooO0O0);
        Oooo0oo(oooO00oOooo0o, 1001, new o00000.OooO00o(oooO00oOooo0o, oooOo, oooo000) { // from class: o000O0.oo000o
            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).OooooOO();
            }
        });
    }

    @Override // o000O0.OooO00o
    public final void OooOo0(final int i, final long j, final long j2) {
        final AnalyticsListener.OooO00o oooO00oOooo0oO = Oooo0oO();
        Oooo0oo(oooO00oOooo0oO, 1011, new o00000.OooO00o(oooO00oOooo0oO, i, j, j2) { // from class: o000O0.o000000
            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).OooOoo();
            }
        });
    }

    @Override // o000O0.OooO00o
    public final void OooOo00(final long j, final long j2, final String str) {
        final AnalyticsListener.OooO00o oooO00oOooo0oO = Oooo0oO();
        Oooo0oo(oooO00oOooo0oO, 1016, new o00000.OooO00o(oooO00oOooo0oO, str, j2, j) { // from class: o000O0.OooOOOO
            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj) {
                AnalyticsListener analyticsListener = (AnalyticsListener) obj;
                analyticsListener.Ooooooo();
                analyticsListener.o00o0O();
            }
        });
    }

    @Override // o000O0.OooO00o
    public final void OooOo0O() {
        if (this.f7354OooOO0o) {
            return;
        }
        AnalyticsListener.OooO00o oooO00oOooo0O0 = Oooo0O0();
        this.f7354OooOO0o = true;
        Oooo0oo(oooO00oOooo0O0, -1, new OooOOO(oooO00oOooo0O0));
    }

    @Override // androidx.media3.exoplayer.drm.OooO0O0
    public final void OooOo0o(int i, @Nullable OooOOOO.OooO0O0 oooO0O0) {
        final AnalyticsListener.OooO00o oooO00oOooo0o = Oooo0o(i, oooO0O0);
        Oooo0oo(oooO00oOooo0o, 1023, new o00000.OooO00o(oooO00oOooo0o) { // from class: o000O0.o000000O
            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).o0OoOo0();
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.OooO0O0
    public final void OooOoO(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, int i2) {
        AnalyticsListener.OooO00o oooO00oOooo0o = Oooo0o(i, oooO0O0);
        Oooo0oo(oooO00oOooo0o, 1022, new androidx.compose.foundation.layout.o00oO0o(oooO00oOooo0o, i2));
    }

    @Override // o000O0.OooO00o
    public final void OooOoO0(o0O00 o0o01, @Nullable OooOOOO.OooO0O0 oooO0O0) {
        Player player = this.f7352OooOO0;
        player.getClass();
        C0145OooO00o c0145OooO00o = this.f7350OooO0oO;
        c0145OooO00o.getClass();
        c0145OooO00o.f7356OooO0O0 = ImmutableList.OooOO0O(o0o01);
        if (!o0o01.isEmpty()) {
            c0145OooO00o.f7360OooO0o0 = (OooOOOO.OooO0O0) o0o01.get(0);
            oooO0O0.getClass();
            c0145OooO00o.f7359OooO0o = oooO0O0;
        }
        if (c0145OooO00o.f7358OooO0Oo == null) {
            c0145OooO00o.f7358OooO0Oo = C0145OooO00o.OooO0O0(player, c0145OooO00o.f7356OooO0O0, c0145OooO00o.f7360OooO0o0, c0145OooO00o.f7355OooO00o);
        }
        c0145OooO00o.OooO0Oo(player.OooOo0());
    }

    @Override // androidx.media3.exoplayer.drm.OooO0O0
    public final void OooOoOO(int i, @Nullable OooOOOO.OooO0O0 oooO0O0) {
        AnalyticsListener.OooO00o oooO00oOooo0o = Oooo0o(i, oooO0O0);
        Oooo0oo(oooO00oOooo0o, 1026, new o000O00O(oooO00oOooo0o, 3));
    }

    @Override // o000O0.OooO00o
    @CallSuper
    public final void OooOoo(OooO0OO oooO0OO) {
        this.f7346OooO.OooO00o(oooO0OO);
    }

    @Override // androidx.media3.exoplayer.drm.OooO0O0
    public final void OooOoo0(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, final Exception exc) {
        final AnalyticsListener.OooO00o oooO00oOooo0o = Oooo0o(i, oooO0O0);
        Oooo0oo(oooO00oOooo0o, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, new o00000.OooO00o(oooO00oOooo0o, exc) { // from class: o000O0.o0000O0O
            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).Ooooo00();
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.OooOo00
    public final void OooOooO(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, o000O.OooOo oooOo, Oooo000 oooo000) {
        AnalyticsListener.OooO00o oooO00oOooo0o = Oooo0o(i, oooO0O0);
        Oooo0oo(oooO00oOooo0o, 1000, new o000O0.OooOo(oooO00oOooo0o, oooOo, oooo000));
    }

    @Override // androidx.media3.exoplayer.source.OooOo00
    public final void OooOooo(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, final o000O.OooOo oooOo, final Oooo000 oooo000, final IOException iOException, final boolean z) {
        final AnalyticsListener.OooO00o oooO00oOooo0o = Oooo0o(i, oooO0O0);
        Oooo0oo(oooO00oOooo0o, 1003, new o00000.OooO00o(oooO00oOooo0o, oooOo, oooo000, iOException, z) { // from class: o000O0.OooOO0O

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ o000O.Oooo000 f33898OooO0Oo;

            {
                this.f33898OooO0Oo = oooo000;
            }

            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).o0ooOOo(this.f33898OooO0Oo);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.OooOo00
    public final void Oooo0(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, o000O.OooOo oooOo, Oooo000 oooo000) {
        AnalyticsListener.OooO00o oooO00oOooo0o = Oooo0o(i, oooO0O0);
        Oooo0oo(oooO00oOooo0o, 1002, new o000oOoO(oooO00oOooo0o, oooOo, oooo000));
    }

    @Override // androidx.media3.exoplayer.drm.OooO0O0
    public final void Oooo000(int i, @Nullable OooOOOO.OooO0O0 oooO0O0) {
        AnalyticsListener.OooO00o oooO00oOooo0o = Oooo0o(i, oooO0O0);
        Oooo0oo(oooO00oOooo0o, 1025, new OooOo00(oooO00oOooo0o));
    }

    @Override // androidx.media3.exoplayer.drm.OooO0O0
    public final void Oooo00O(int i, @Nullable OooOOOO.OooO0O0 oooO0O0) {
        AnalyticsListener.OooO00o oooO00oOooo0o = Oooo0o(i, oooO0O0);
        Oooo0oo(oooO00oOooo0o, 1027, new o000O0.OooO0OO(oooO00oOooo0o, 0));
    }

    @Override // o000O0.OooO00o
    @CallSuper
    public final void Oooo00o(final Player player, Looper looper) {
        o00O0O.OooO0Oo(this.f7352OooOO0 == null || this.f7350OooO0oO.f7356OooO0O0.isEmpty());
        this.f7352OooOO0 = player;
        this.f7353OooOO0O = this.f7347OooO0Oo.OooO0O0(looper, null);
        o00000<AnalyticsListener> o00000Var = this.f7346OooO;
        this.f7346OooO = new o00000<>(o00000Var.f34918OooO0Oo, looper, o00000Var.f34915OooO00o, new o00000.OooO0O0() { // from class: o000O0.OooOOO0
            @Override // o000OoO.o00000.OooO0O0
            public final void OooO0O0(Object obj, androidx.media3.common.OooO oooO) {
                ((AnalyticsListener) obj).o0Oo0oo(player, new AnalyticsListener.OooO0O0(oooO, this.f33900OooO0Oo.f7351OooO0oo));
            }
        }, o00000Var.f34914OooO);
    }

    public final AnalyticsListener.OooO00o Oooo0O0() {
        return Oooo0o0(this.f7350OooO0oO.f7358OooO0Oo);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    @RequiresNonNull({"player"})
    public final AnalyticsListener.OooO00o Oooo0OO(Oooo0 oooo0, int i, @Nullable OooOOOO.OooO0O0 oooO0O0) {
        long jO000oOoO;
        OooOOOO.OooO0O0 oooO0O1 = oooo0.OooOo00() ? null : oooO0O0;
        long jElapsedRealtime = this.f7347OooO0Oo.elapsedRealtime();
        boolean z = oooo0.equals(this.f7352OooOO0.OooOo0()) && i == this.f7352OooOO0.Oooo0oO();
        if (oooO0O1 != null && oooO0O1.OooO00o()) {
            if (z && this.f7352OooOO0.OooOOOo() == oooO0O1.f33816OooO0O0 && this.f7352OooOO0.Oooo00o() == oooO0O1.f33817OooO0OO) {
                jO000oOoO = this.f7352OooOO0.getCurrentPosition();
            } else {
                jO000oOoO = 0;
            }
        } else if (z) {
            jO000oOoO = this.f7352OooOO0.Oooo0OO();
        } else if (oooo0.OooOo00()) {
            jO000oOoO = 0;
        } else {
            jO000oOoO = o000OO00.o000oOoO(oooo0.OooOOo0(i, this.f7348OooO0o).f6685OooOOOo);
        }
        return new AnalyticsListener.OooO00o(jElapsedRealtime, oooo0, i, oooO0O1, jO000oOoO, this.f7352OooOO0.OooOo0(), this.f7352OooOO0.Oooo0oO(), this.f7350OooO0oO.f7358OooO0Oo, this.f7352OooOO0.getCurrentPosition(), this.f7352OooOO0.OooO0oO());
    }

    public final AnalyticsListener.OooO00o Oooo0o(int i, @Nullable OooOOOO.OooO0O0 oooO0O0) {
        this.f7352OooOO0.getClass();
        if (oooO0O0 != null) {
            return this.f7350OooO0oO.f7357OooO0OO.get(oooO0O0) != null ? Oooo0o0(oooO0O0) : Oooo0OO(Oooo0.f6634OooO0Oo, i, oooO0O0);
        }
        Oooo0 oooo0OooOo0 = this.f7352OooOO0.OooOo0();
        if (!(i < oooo0OooOo0.OooOOoo())) {
            oooo0OooOo0 = Oooo0.f6634OooO0Oo;
        }
        return Oooo0OO(oooo0OooOo0, i, null);
    }

    public final AnalyticsListener.OooO00o Oooo0o0(@Nullable OooOOOO.OooO0O0 oooO0O0) {
        this.f7352OooOO0.getClass();
        Oooo0 oooo0 = oooO0O0 == null ? null : this.f7350OooO0oO.f7357OooO0OO.get(oooO0O0);
        if (oooO0O0 != null && oooo0 != null) {
            return Oooo0OO(oooo0, oooo0.OooOO0O(oooO0O0.f33815OooO00o, this.f7349OooO0o0).f6647OooO0o, oooO0O0);
        }
        int iOooo0oO = this.f7352OooOO0.Oooo0oO();
        Oooo0 oooo0OooOo0 = this.f7352OooOO0.OooOo0();
        if (!(iOooo0oO < oooo0OooOo0.OooOOoo())) {
            oooo0OooOo0 = Oooo0.f6634OooO0Oo;
        }
        return Oooo0OO(oooo0OooOo0, iOooo0oO, null);
    }

    public final AnalyticsListener.OooO00o Oooo0oO() {
        return Oooo0o0(this.f7350OooO0oO.f7359OooO0o);
    }

    public final void Oooo0oo(AnalyticsListener.OooO00o oooO00o, int i, o00000.OooO00o<AnalyticsListener> oooO00o2) {
        this.f7351OooO0oo.put(i, oooO00o);
        this.f7346OooO.OooO0o(i, oooO00o2);
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onAudioAttributesChanged(final androidx.media3.common.OooO00o oooO00o) {
        final AnalyticsListener.OooO00o oooO00oOooo0oO = Oooo0oO();
        Oooo0oo(oooO00oOooo0oO, 20, new o00000.OooO00o(oooO00oOooo0oO, oooO00o) { // from class: o000O0.oo0o0Oo
            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).oo0o0Oo();
            }
        });
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onAvailableCommandsChanged(Player.OooO00o oooO00o) {
        AnalyticsListener.OooO00o oooO00oOooo0O0 = Oooo0O0();
        Oooo0oo(oooO00oOooo0O0, 13, new o0O00oO0(oooO00oOooo0O0, oooO00o));
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onCues(final List<Cue> list) {
        final AnalyticsListener.OooO00o oooO00oOooo0O0 = Oooo0O0();
        Oooo0oo(oooO00oOooo0O0, 27, new o00000.OooO00o(oooO00oOooo0O0, list) { // from class: o000O0.OooOOO

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ List f33899OooO0Oo;

            {
                this.f33899OooO0Oo = list;
            }

            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).o00oO0O();
            }
        });
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        AnalyticsListener.OooO00o oooO00oOooo0O0 = Oooo0O0();
        Oooo0oo(oooO00oOooo0O0, 29, new o00OOOO0(oooO00oOooo0O0, deviceInfo));
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onDeviceVolumeChanged(int i, boolean z) {
        AnalyticsListener.OooO00o oooO00oOooo0O0 = Oooo0O0();
        Oooo0oo(oooO00oOooo0O0, 30, new OooO(i, oooO00oOooo0O0, z));
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onEvents(Player player, Player.OooO0O0 oooO0O0) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onIsLoadingChanged(final boolean z) {
        final AnalyticsListener.OooO00o oooO00oOooo0O0 = Oooo0O0();
        Oooo0oo(oooO00oOooo0O0, 3, new o00000.OooO00o(oooO00oOooo0O0, z) { // from class: o000O0.o00000O0
            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj) {
                AnalyticsListener analyticsListener = (AnalyticsListener) obj;
                analyticsListener.OooOooo();
                analyticsListener.Oooo00O();
            }
        });
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onIsPlayingChanged(boolean z) {
        AnalyticsListener.OooO00o oooO00oOooo0O0 = Oooo0O0();
        Oooo0oo(oooO00oOooo0O0, 7, new o0OOO0(oooO00oOooo0O0, z));
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onLoadingChanged(boolean z) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onMediaItemTransition(@Nullable final androidx.media3.common.OooOOO0 oooOOO0, final int i) {
        final AnalyticsListener.OooO00o oooO00oOooo0O0 = Oooo0O0();
        Oooo0oo(oooO00oOooo0O0, 1, new o00000.OooO00o(oooO00oOooo0O0, oooOOO0, i) { // from class: o000O0.o00Ooo
            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).Oooooo0();
            }
        });
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onMediaMetadataChanged(final MediaMetadata mediaMetadata) {
        final AnalyticsListener.OooO00o oooO00oOooo0O0 = Oooo0O0();
        Oooo0oo(oooO00oOooo0O0, 14, new o00000.OooO00o(oooO00oOooo0O0, mediaMetadata) { // from class: o000O0.o0OOO0o
            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).o000oOoO();
            }
        });
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onMetadata(Metadata metadata) {
        AnalyticsListener.OooO00o oooO00oOooo0O0 = Oooo0O0();
        Oooo0oo(oooO00oOooo0O0, 28, new androidx.compose.ui.focus.OooO00o(oooO00oOooo0O0, metadata));
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onPlayWhenReadyChanged(boolean z, int i) {
        AnalyticsListener.OooO00o oooO00oOooo0O0 = Oooo0O0();
        Oooo0oo(oooO00oOooo0O0, 5, new o0OoOo0(i, oooO00oOooo0O0, z));
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onPlaybackParametersChanged(androidx.media3.common.OooOOOO oooOOOO) {
        AnalyticsListener.OooO00o oooO00oOooo0O0 = Oooo0O0();
        Oooo0oo(oooO00oOooo0O0, 12, new oo000o(oooO00oOooo0O0, oooOOOO));
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onPlaybackStateChanged(final int i) {
        final AnalyticsListener.OooO00o oooO00oOooo0O0 = Oooo0O0();
        Oooo0oo(oooO00oOooo0O0, 4, new o00000.OooO00o(oooO00oOooo0O0, i) { // from class: o000O0.o00Oo0
            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).Oooo();
            }
        });
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onPlaybackSuppressionReasonChanged(final int i) {
        final AnalyticsListener.OooO00o oooO00oOooo0O0 = Oooo0O0();
        Oooo0oo(oooO00oOooo0O0, 6, new o00000.OooO00o(oooO00oOooo0O0, i) { // from class: o000O0.o0ooOOo
            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).OoooO00();
            }
        });
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onPlayerError(final PlaybackException playbackException) {
        o0000O0O o0000o0o2;
        final AnalyticsListener.OooO00o oooO00oOooo0O0 = (!(playbackException instanceof ExoPlaybackException) || (o0000o0o2 = ((ExoPlaybackException) playbackException).f7125OooOOo0) == null) ? Oooo0O0() : Oooo0o0(new OooOOOO.OooO0O0(o0000o0o2));
        Oooo0oo(oooO00oOooo0O0, 10, new o00000.OooO00o(oooO00oOooo0O0, playbackException) { // from class: o000O0.OooOo00

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ PlaybackException f33902OooO0Oo;

            {
                this.f33902OooO0Oo = playbackException;
            }

            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlayerError(this.f33902OooO0Oo);
            }
        });
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onPlayerErrorChanged(@Nullable final PlaybackException playbackException) {
        o0000O0O o0000o0o2;
        final AnalyticsListener.OooO00o oooO00oOooo0O0 = (!(playbackException instanceof ExoPlaybackException) || (o0000o0o2 = ((ExoPlaybackException) playbackException).f7125OooOOo0) == null) ? Oooo0O0() : Oooo0o0(new OooOOOO.OooO0O0(o0000o0o2));
        Oooo0oo(oooO00oOooo0O0, 10, new o00000.OooO00o(oooO00oOooo0O0, playbackException) { // from class: o000O0.o00oO0o
            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).Oooo0o0();
            }
        });
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onPlayerStateChanged(final boolean z, final int i) {
        final AnalyticsListener.OooO00o oooO00oOooo0O0 = Oooo0O0();
        Oooo0oo(oooO00oOooo0O0, -1, new o00000.OooO00o(i, oooO00oOooo0O0, z) { // from class: o000O0.o0000O
            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).o00O0O();
            }
        });
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onPlaylistMetadataChanged(final MediaMetadata mediaMetadata) {
        final AnalyticsListener.OooO00o oooO00oOooo0O0 = Oooo0O0();
        Oooo0oo(oooO00oOooo0O0, 15, new o00000.OooO00o(oooO00oOooo0O0, mediaMetadata) { // from class: o000O0.o0000
            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).OooOoO();
            }
        });
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onPositionDiscontinuity(int i) {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onRenderedFirstFrame() {
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onRepeatModeChanged(int i) {
        AnalyticsListener.OooO00o oooO00oOooo0O0 = Oooo0O0();
        Oooo0oo(oooO00oOooo0O0, 8, new androidx.compose.foundation.lazy.OooO0o(oooO00oOooo0O0, i));
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onSeekBackIncrementChanged(final long j) {
        final AnalyticsListener.OooO00o oooO00oOooo0O0 = Oooo0O0();
        Oooo0oo(oooO00oOooo0O0, 16, new o00000.OooO00o(oooO00oOooo0O0, j) { // from class: o000O0.o0000O0
            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).OooOoOO();
            }
        });
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onSeekForwardIncrementChanged(final long j) {
        final AnalyticsListener.OooO00o oooO00oOooo0O0 = Oooo0O0();
        Oooo0oo(oooO00oOooo0O0, 17, new o00000.OooO00o(oooO00oOooo0O0, j) { // from class: o000O0.o0000oo
            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).o000OOo();
            }
        });
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onShuffleModeEnabledChanged(boolean z) {
        AnalyticsListener.OooO00o oooO00oOooo0O0 = Oooo0O0();
        Oooo0oo(oooO00oOooo0O0, 9, new o000O0.o00O0O(oooO00oOooo0O0, z));
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onSkipSilenceEnabledChanged(final boolean z) {
        final AnalyticsListener.OooO00o oooO00oOooo0oO = Oooo0oO();
        Oooo0oo(oooO00oOooo0oO, 23, new o00000.OooO00o(oooO00oOooo0oO, z) { // from class: o000O0.o0000O00
            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).OooOo();
            }
        });
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onSurfaceSizeChanged(int i, int i2) {
        AnalyticsListener.OooO00o oooO00oOooo0oO = Oooo0oO();
        Oooo0oo(oooO00oOooo0oO, 24, new com.google.android.material.internal.OooOOO(oooO00oOooo0oO, i, i2));
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onTimelineChanged(Oooo0 oooo0, int i) {
        Player player = this.f7352OooOO0;
        player.getClass();
        C0145OooO00o c0145OooO00o = this.f7350OooO0oO;
        c0145OooO00o.f7358OooO0Oo = C0145OooO00o.OooO0O0(player, c0145OooO00o.f7356OooO0O0, c0145OooO00o.f7360OooO0o0, c0145OooO00o.f7355OooO00o);
        c0145OooO00o.OooO0Oo(player.OooOo0());
        AnalyticsListener.OooO00o oooO00oOooo0O0 = Oooo0O0();
        Oooo0oo(oooO00oOooo0O0, 0, new androidx.compose.runtime.OooO0OO(oooO00oOooo0O0, i));
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onTrackSelectionParametersChanged(final androidx.media3.common.o00O0O o00o0o2) {
        final AnalyticsListener.OooO00o oooO00oOooo0O0 = Oooo0O0();
        Oooo0oo(oooO00oOooo0O0, 19, new o00000.OooO00o(oooO00oOooo0O0, o00o0o2) { // from class: o000O0.o00000
            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).Oooo0oO();
            }
        });
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onTracksChanged(o00Oo0 o00oo1) {
        AnalyticsListener.OooO00o oooO00oOooo0O0 = Oooo0O0();
        Oooo0oo(oooO00oOooo0O0, 2, new o000O0.OooOO0(oooO00oOooo0O0, o00oo1));
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onVideoSizeChanged(final o00Ooo o00ooo2) {
        final AnalyticsListener.OooO00o oooO00oOooo0oO = Oooo0oO();
        final int i = 0;
        Oooo0oo(oooO00oOooo0oO, 25, new o00000.OooO00o() { // from class: o000O0.o00000O
            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj) {
                int i2 = i;
                Object obj2 = o00ooo2;
                switch (i2) {
                    case 0:
                        androidx.media3.common.o00Ooo o00ooo3 = (androidx.media3.common.o00Ooo) obj2;
                        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
                        analyticsListener.onVideoSizeChanged(o00ooo3);
                        int i3 = o00ooo3.f6874OooO0Oo;
                        analyticsListener.o000000();
                        break;
                    default:
                        ((Player.OooO0OO) obj).onTimelineChanged(((androidx.media3.session.o00O00O) oooO00oOooo0oO).f9382OooOOO0, ((Integer) obj2).intValue());
                        break;
                }
            }
        });
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onVolumeChanged(final float f) {
        final AnalyticsListener.OooO00o oooO00oOooo0oO = Oooo0oO();
        Oooo0oo(oooO00oOooo0oO, 22, new o00000.OooO00o(oooO00oOooo0oO, f) { // from class: o000O0.OooO0o
            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).Oooo0oo();
            }
        });
    }

    @Override // o000O0.OooO00o
    @CallSuper
    public final void release() {
        o000OOo o000ooo2 = this.f7353OooOO0O;
        o00O0O.OooO0o(o000ooo2);
        o000ooo2.OooO(new o000000O(this, 1));
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onPositionDiscontinuity(final Player.OooO0o oooO0o, final Player.OooO0o oooO0o2, final int i) {
        if (i == 1) {
            this.f7354OooOO0o = false;
        }
        Player player = this.f7352OooOO0;
        player.getClass();
        C0145OooO00o c0145OooO00o = this.f7350OooO0oO;
        c0145OooO00o.f7358OooO0Oo = C0145OooO00o.OooO0O0(player, c0145OooO00o.f7356OooO0O0, c0145OooO00o.f7360OooO0o0, c0145OooO00o.f7355OooO00o);
        final AnalyticsListener.OooO00o oooO00oOooo0O0 = Oooo0O0();
        Oooo0oo(oooO00oOooo0O0, 11, new o00000.OooO00o(i, oooO0o, oooO0o2, oooO00oOooo0O0) { // from class: o000O0.OooO

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ int f33893OooO0Oo;

            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj) {
                AnalyticsListener analyticsListener = (AnalyticsListener) obj;
                analyticsListener.o0OOO0o();
                analyticsListener.onPositionDiscontinuity(this.f33893OooO0Oo);
            }
        });
    }

    @Override // androidx.media3.common.Player.OooO0OO
    public final void onCues(final o000O000.OooO0O0 oooO0O0) {
        final AnalyticsListener.OooO00o oooO00oOooo0O0 = Oooo0O0();
        Oooo0oo(oooO00oOooo0O0, 27, new o00000.OooO00o() { // from class: o000O0.o000oOoO
            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).OoooOOo();
            }
        });
    }
}
