package p292o0O0Oo0;

import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.o000oOoO;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.o0;
import com.google.common.collect.o0O00000;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import o0O0o0.OooO0o;
import o0OOOO0o.OooOOO;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p293o0O0Oo0O.OooOOOO;
import p294o0O0Oo0o.o0O0O00;
import p310o0O0o0oo.o00O0000;
import p310o0O0o0oo.o00O000o;
import p310o0O0o0oo.o00O00O;
import p310o0O0o0oo.o00O0O00;
import p318o0O0oOo.o00000O;
import p319o0O0oOo0.o0000O;
import p320o0O0oOoO.o00OO000;
import p320o0O0oOoO.o00OOO0O;
import p466o0OooO0.o000O00;
import p709oo0oOOo.OooO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements Player.OooO00o, OooO0o, com.google.android.exoplayer2.audio.OooO00o, o00OOO0O, o00O0O00, OooO.OooO00o, com.google.android.exoplayer2.drm.OooO00o, o00OO000, OooOOOO {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final o000oOoO.OooO0OO f35707Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final o000oOoO.OooO0O0 f35710Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public Player f35711OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final OooO00o f35712OoooO00;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final o00000O f35709Oooo0oO = o00000O.f36668OooO00o;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final CopyOnWriteArraySet<OooO0o> f35708Oooo0o = new CopyOnWriteArraySet<>();

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000oOoO.OooO0O0 f35713OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public ImmutableList<o00O00O.OooO00o> f35714OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public ImmutableMap<o00O00O.OooO00o, o000oOoO> f35715OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public o00O00O.OooO00o f35716OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public o00O00O.OooO00o f35717OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public o00O00O.OooO00o f35718OooO0o0;

        public OooO00o(o000oOoO.OooO0O0 oooO0O0) {
            this.f35713OooO00o = oooO0O0;
            com.google.common.collect.OooO0OO oooO0OO = ImmutableList.f18169Oooo0oO;
            this.f35714OooO0O0 = o0.f18399OoooO00;
            this.f35715OooO0OO = o0O00000.f18579OoooO0O;
        }

        @Nullable
        public static o00O00O.OooO00o OooO0O0(Player player, ImmutableList<o00O00O.OooO00o> immutableList, @Nullable o00O00O.OooO00o oooO00o, o000oOoO.OooO0O0 oooO0O0) {
            o000oOoO o000ooooOooO0oo = player.OooO0oo();
            int iOooO0OO = player.OooO0OO();
            Object objOooOO0O = o000ooooOooO0oo.OooOOOO() ? null : o000ooooOooO0oo.OooOO0O(iOooO0OO);
            int iOooO0O0 = (player.OooO00o() || o000ooooOooO0oo.OooOOOO()) ? -1 : o000ooooOooO0oo.OooO0o(iOooO0OO, oooO0O0, false).OooO0O0(C.OooO00o(player.getCurrentPosition()) - oooO0O0.f14562OooO0o0);
            for (int i = 0; i < immutableList.size(); i++) {
                o00O00O.OooO00o oooO00o2 = immutableList.get(i);
                if (OooO0OO(oooO00o2, objOooOO0O, player.OooO00o(), player.OooO0oO(), player.OooO0Oo(), iOooO0O0)) {
                    return oooO00o2;
                }
            }
            if (immutableList.isEmpty() && oooO00o != null) {
                if (OooO0OO(oooO00o, objOooOO0O, player.OooO00o(), player.OooO0oO(), player.OooO0Oo(), iOooO0O0)) {
                    return oooO00o;
                }
            }
            return null;
        }

        public static boolean OooO0OO(o00O00O.OooO00o oooO00o, @Nullable Object obj, boolean z, int i, int i2, int i3) {
            if (oooO00o.f36330OooO00o.equals(obj)) {
                return (z && oooO00o.f36331OooO0O0 == i && oooO00o.f36332OooO0OO == i2) || (!z && oooO00o.f36331OooO0O0 == -1 && oooO00o.f36334OooO0o0 == i3);
            }
            return false;
        }

        public final void OooO00o(ImmutableMap.OooO00o<o00O00O.OooO00o, o000oOoO> oooO00o, @Nullable o00O00O.OooO00o oooO00o2, o000oOoO o000oooo2) {
            if (oooO00o2 == null) {
                return;
            }
            if (o000oooo2.OooO0O0(oooO00o2.f36330OooO00o) != -1) {
                oooO00o.OooO0OO(oooO00o2, o000oooo2);
                return;
            }
            o000oOoO o000oooo3 = this.f35715OooO0OO.get(oooO00o2);
            if (o000oooo3 != null) {
                oooO00o.OooO0OO(oooO00o2, o000oooo3);
            }
        }

        public final void OooO0Oo(o000oOoO o000oooo2) {
            ImmutableMap.OooO00o<o00O00O.OooO00o, o000oOoO> OooO00o2 = ImmutableMap.OooO00o();
            if (this.f35714OooO0O0.isEmpty()) {
                OooO00o(OooO00o2, this.f35718OooO0o0, o000oooo2);
                if (!OooOOO.OooO00o(this.f35717OooO0o, this.f35718OooO0o0)) {
                    OooO00o(OooO00o2, this.f35717OooO0o, o000oooo2);
                }
                if (!OooOOO.OooO00o(this.f35716OooO0Oo, this.f35718OooO0o0) && !OooOOO.OooO00o(this.f35716OooO0Oo, this.f35717OooO0o)) {
                    OooO00o(OooO00o2, this.f35716OooO0Oo, o000oooo2);
                }
            } else {
                for (int i = 0; i < this.f35714OooO0O0.size(); i++) {
                    OooO00o(OooO00o2, this.f35714OooO0O0.get(i), o000oooo2);
                }
                if (!this.f35714OooO0O0.contains(this.f35716OooO0Oo)) {
                    OooO00o(OooO00o2, this.f35716OooO0Oo, o000oooo2);
                }
            }
            this.f35715OooO0OO = OooO00o2.OooO00o();
        }
    }

    public OooO0OO() {
        o000oOoO.OooO0O0 oooO0O0 = new o000oOoO.OooO0O0();
        this.f35710Oooo0oo = oooO0O0;
        this.f35707Oooo = new o000oOoO.OooO0OO();
        this.f35712OoooO00 = new OooO00o(oooO0O0);
    }

    @Override // com.google.android.exoplayer2.Player.OooO00o
    public final void OooO(int i) {
        OooO00o oooO00o = this.f35712OoooO00;
        Player player = this.f35711OoooO0;
        Objects.requireNonNull(player);
        oooO00o.f35716OooO0Oo = OooO00o.OooO0O0(player, oooO00o.f35714OooO0O0, oooO00o.f35718OooO0o0, oooO00o.f35713OooO00o);
        OoooOO0();
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().Oooo00o();
        }
    }

    @Override // com.google.android.exoplayer2.Player.OooO00o
    public final void OooO00o() {
        OoooOO0();
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().OooO00o();
        }
    }

    @Override // com.google.android.exoplayer2.audio.OooO00o
    public final void OooO0O0(int i) {
        OoooOoO();
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().OooOooo();
        }
    }

    @Override // com.google.android.exoplayer2.Player.OooO00o
    public final /* synthetic */ void OooO0OO() {
    }

    @Override // p320o0O0oOoO.o00OOO0O
    public final void OooO0Oo(int i, int i2, int i3, float f) {
        OoooOoO();
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().OoooOOO();
        }
    }

    @Override // com.google.android.exoplayer2.audio.OooO00o
    public final void OooO0o(boolean z) {
        OoooOoO();
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().OooOOo0();
        }
    }

    @Override // p320o0O0oOoO.o00OO000
    public final void OooO0o0() {
    }

    @Override // com.google.android.exoplayer2.Player.OooO00o
    public final void OooO0oO(int i) {
        OoooOO0();
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().OoooO00();
        }
    }

    @Override // p310o0O0o0oo.o00O0O00
    public final void OooO0oo(int i, @Nullable o00O00O.OooO00o oooO00o, o00O0000 o00o0001, o00O000o o00o000o2) {
        OoooOOo(i, oooO00o);
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().Oooo00O();
        }
    }

    @Override // p320o0O0oOoO.o00OOO0O
    public final void OooOO0(String str, long j, long j2) {
        OoooOoO();
        for (OooO0o oooO0o : this.f35708Oooo0o) {
            oooO0o.OooOooO();
            oooO0o.Oooo0();
        }
    }

    @Override // com.google.android.exoplayer2.Player.OooO00o
    public final void OooOO0O(o000O00 o000o01) {
        OoooOO0();
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().OooOoo0();
        }
    }

    @Override // com.google.android.exoplayer2.Player.OooO00o
    public final void OooOO0o(ExoPlaybackException exoPlaybackException) {
        o00O00O.OooO00o oooO00o = exoPlaybackException.f13116OoooO;
        if (oooO00o != null) {
            OoooOOO(oooO00o);
        } else {
            OoooOO0();
        }
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().OooOoo();
        }
    }

    @Override // com.google.android.exoplayer2.Player.OooO00o
    public final void OooOOO(o000oOoO o000oooo2, int i) {
        OooO00o oooO00o = this.f35712OoooO00;
        Player player = this.f35711OoooO0;
        Objects.requireNonNull(player);
        oooO00o.f35716OooO0Oo = OooO00o.OooO0O0(player, oooO00o.f35714OooO0O0, oooO00o.f35718OooO0o0, oooO00o.f35713OooO00o);
        oooO00o.OooO0Oo(player.OooO0oo());
        OoooOO0();
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().OooO0OO();
        }
    }

    @Override // com.google.android.exoplayer2.Player.OooO00o
    public final void OooOOO0(boolean z) {
        OoooOO0();
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().Oooo000();
        }
    }

    @Override // p293o0O0Oo0O.OooOOOO
    public final void OooOOOO(float f) {
        OoooOoO();
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().Oooo0oO();
        }
    }

    @Override // com.google.android.exoplayer2.drm.OooO00o
    public final void OooOOOo(int i, @Nullable o00O00O.OooO00o oooO00o) {
        OoooOOo(i, oooO00o);
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().OooOo0O();
        }
    }

    @Override // p320o0O0oOoO.o00OOO0O
    public final void OooOOo(@Nullable Surface surface) {
        OoooOoO();
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().OooO0o0();
        }
    }

    @Override // com.google.android.exoplayer2.Player.OooO00o
    public final void OooOOo0(int i) {
        OoooOO0();
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().Oooo0oo();
        }
    }

    @Override // com.google.android.exoplayer2.Player.OooO00o
    public final /* synthetic */ void OooOOoo() {
    }

    @Override // p310o0O0o0oo.o00O0O00
    public final void OooOo(int i, @Nullable o00O00O.OooO00o oooO00o, o00O0000 o00o0001, o00O000o o00o000o2) {
        OoooOOo(i, oooO00o);
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().OooOOOo();
        }
    }

    @Override // com.google.android.exoplayer2.audio.OooO00o
    public final void OooOo0(o0O0O00 o0o0o00) {
        OoooOoO();
        for (OooO0o oooO0o : this.f35708Oooo0o) {
            oooO0o.OooOO0();
            oooO0o.OooOoO0();
        }
    }

    @Override // com.google.android.exoplayer2.audio.OooO00o
    public final void OooOo00(String str, long j, long j2) {
        OoooOoO();
        for (OooO0o oooO0o : this.f35708Oooo0o) {
            oooO0o.Oooo0O0();
            oooO0o.Oooo0();
        }
    }

    @Override // com.google.android.exoplayer2.drm.OooO00o
    public final void OooOo0O(int i, @Nullable o00O00O.OooO00o oooO00o, Exception exc) {
        OoooOOo(i, oooO00o);
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().OooOOOO();
        }
    }

    @Override // o0O0o0.OooO0o
    public final void OooOo0o(Metadata metadata) {
        OoooOO0();
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().OoooO0();
        }
    }

    @Override // com.google.android.exoplayer2.drm.OooO00o
    public final void OooOoO(int i, @Nullable o00O00O.OooO00o oooO00o) {
        OoooOOo(i, oooO00o);
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().OooOOo();
        }
    }

    @Override // p320o0O0oOoO.o00OOO0O
    public final void OooOoO0(int i, long j) {
        OoooOo0();
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().OooO0oo();
        }
    }

    @Override // com.google.android.exoplayer2.Player.OooO00o
    public final void OooOoOO(boolean z, int i) {
        OoooOO0();
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().OooOoO();
        }
    }

    @Override // com.google.android.exoplayer2.drm.OooO00o
    public final void OooOoo(int i, @Nullable o00O00O.OooO00o oooO00o) {
        OoooOOo(i, oooO00o);
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().OoooO0O();
        }
    }

    @Override // p320o0O0oOoO.o00OOO0O
    public final void OooOoo0(o0O0O00 o0o0o00) {
        OoooOo0();
        for (OooO0o oooO0o : this.f35708Oooo0o) {
            oooO0o.OooOOO();
            oooO0o.OooO();
        }
    }

    @Override // com.google.android.exoplayer2.Player.OooO00o
    public final void OooOooO(@Nullable com.google.android.exoplayer2.OooOOO oooOOO, int i) {
        OoooOO0();
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().OooOOoo();
        }
    }

    @Override // p310o0O0o0oo.o00O0O00
    public final void OooOooo(int i, @Nullable o00O00O.OooO00o oooO00o, o00O0000 o00o0001, o00O000o o00o000o2, IOException iOException, boolean z) {
        OoooOOo(i, oooO00o);
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().OooOo00();
        }
    }

    @Override // p320o0O0oOoO.o00OOO0O
    public final void Oooo(o0O0O00 o0o0o00) {
        OoooOoO();
        for (OooO0o oooO0o : this.f35708Oooo0o) {
            oooO0o.Oooo0o0();
            oooO0o.OooOoO0();
        }
    }

    @Override // com.google.android.exoplayer2.drm.OooO00o
    public final void Oooo0(int i, @Nullable o00O00O.OooO00o oooO00o) {
        OoooOOo(i, oooO00o);
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().Oooo0OO();
        }
    }

    @Override // p320o0O0oOoO.o00OOO0O
    public final void Oooo000(Format format) {
        OoooOoO();
        for (OooO0o oooO0o : this.f35708Oooo0o) {
            oooO0o.OoooO();
            oooO0o.OooOo0();
        }
    }

    @Override // com.google.android.exoplayer2.drm.OooO00o
    public final void Oooo00O(int i, @Nullable o00O00O.OooO00o oooO00o) {
        OoooOOo(i, oooO00o);
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().OoooOOo();
        }
    }

    @Override // com.google.android.exoplayer2.audio.OooO00o
    public final void Oooo00o(long j) {
        OoooOoO();
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().OooOO0O();
        }
    }

    @Override // com.google.android.exoplayer2.audio.OooO00o
    public final void Oooo0O0(Format format) {
        OoooOoO();
        for (OooO0o oooO0o : this.f35708Oooo0o) {
            oooO0o.Oooo();
            oooO0o.OooOo0();
        }
    }

    @Override // com.google.android.exoplayer2.Player.OooO00o
    public final void Oooo0OO(boolean z, int i) {
        OoooOO0();
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().OooO0oO();
        }
    }

    @Override // p310o0O0o0oo.o00O0O00
    public final void Oooo0o(int i, @Nullable o00O00O.OooO00o oooO00o, o00O0000 o00o0001, o00O000o o00o000o2) {
        OoooOOo(i, oooO00o);
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().OooOO0o();
        }
    }

    @Override // com.google.android.exoplayer2.Player.OooO00o
    public final void Oooo0o0(TrackGroupArray trackGroupArray, o0000O o0000o2) {
        OoooOO0();
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().o000oOoO();
        }
    }

    @Override // p320o0O0oOoO.o00OO000
    public final void Oooo0oO(int i, int i2) {
        OoooOoO();
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().OooOOO0();
        }
    }

    @Override // com.google.android.exoplayer2.audio.OooO00o
    public final void Oooo0oo(o0O0O00 o0o0o00) {
        OoooOo0();
        for (OooO0o oooO0o : this.f35708Oooo0o) {
            oooO0o.OooO0o();
            oooO0o.OooO();
        }
    }

    @Override // com.google.android.exoplayer2.Player.OooO00o
    public final void OoooO(boolean z) {
        OoooOO0();
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().OooOo();
        }
    }

    @Override // p310o0O0o0oo.o00O0O00
    public final void OoooO0(int i, @Nullable o00O00O.OooO00o oooO00o, o00O000o o00o000o2) {
        OoooOOo(i, oooO00o);
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().OooOoOO();
        }
    }

    @Override // com.google.android.exoplayer2.audio.OooO00o
    public final void OoooO00(int i, long j, long j2) {
        OoooOoO();
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().OooOo0o();
        }
    }

    @Override // p320o0O0oOoO.o00OOO0O
    public final void OoooO0O(long j, int i) {
        OoooOo0();
        Iterator<OooO0o> it = this.f35708Oooo0o.iterator();
        while (it.hasNext()) {
            it.next().Oooo0o();
        }
    }

    public final OooO0o.OooO00o OoooOO0() {
        return OoooOOO(this.f35712OoooO00.f35716OooO0Oo);
    }

    public final OooO0o.OooO00o OoooOOO(@Nullable o00O00O.OooO00o oooO00o) {
        Objects.requireNonNull(this.f35711OoooO0);
        o000oOoO o000oooo2 = oooO00o == null ? null : this.f35712OoooO00.f35715OooO0OO.get(oooO00o);
        if (oooO00o != null && o000oooo2 != null) {
            return o000oOoO(o000oooo2, o000oooo2.OooO0oO(oooO00o.f36330OooO00o, this.f35710Oooo0oo).f14559OooO0OO, oooO00o);
        }
        int iOooO0o0 = this.f35711OoooO0.OooO0o0();
        o000oOoO o000ooooOooO0oo = this.f35711OoooO0.OooO0oo();
        if (!(iOooO0o0 < o000ooooOooO0oo.OooOOO())) {
            o000ooooOooO0oo = o000oOoO.f14556OooO00o;
        }
        return o000oOoO(o000ooooOooO0oo, iOooO0o0, null);
    }

    public final OooO0o.OooO00o OoooOOo(int i, @Nullable o00O00O.OooO00o oooO00o) {
        Objects.requireNonNull(this.f35711OoooO0);
        if (oooO00o != null) {
            return this.f35712OoooO00.f35715OooO0OO.get(oooO00o) != null ? OoooOOO(oooO00o) : o000oOoO(o000oOoO.f14556OooO00o, i, oooO00o);
        }
        o000oOoO o000ooooOooO0oo = this.f35711OoooO0.OooO0oo();
        if (!(i < o000ooooOooO0oo.OooOOO())) {
            o000ooooOooO0oo = o000oOoO.f14556OooO00o;
        }
        return o000oOoO(o000ooooOooO0oo, i, null);
    }

    public final OooO0o.OooO00o OoooOo0() {
        return OoooOOO(this.f35712OoooO00.f35718OooO0o0);
    }

    public final OooO0o.OooO00o OoooOoO() {
        return OoooOOO(this.f35712OoooO00.f35717OooO0o);
    }

    @RequiresNonNull({"player"})
    public final OooO0o.OooO00o o000oOoO(o000oOoO o000oooo2, int i, @Nullable o00O00O.OooO00o oooO00o) {
        long jOooO0o;
        o00O00O.OooO00o oooO00o2 = o000oooo2.OooOOOO() ? null : oooO00o;
        long jElapsedRealtime = this.f35709Oooo0oO.elapsedRealtime();
        boolean z = false;
        boolean z2 = o000oooo2.equals(this.f35711OoooO0.OooO0oo()) && i == this.f35711OoooO0.OooO0o0();
        long jOooO00o = 0;
        if (oooO00o2 == null || !oooO00o2.OooO0O0()) {
            if (z2) {
                jOooO0o = this.f35711OoooO0.OooO0o();
            } else if (!o000oooo2.OooOOOO()) {
                jOooO00o = o000oooo2.OooOO0o(i, this.f35707Oooo).OooO00o();
            }
            return new OooO0o.OooO00o(jElapsedRealtime, o000oooo2, i, oooO00o2, jOooO0o, this.f35711OoooO0.OooO0oo(), this.f35711OoooO0.OooO0o0(), this.f35712OoooO00.f35716OooO0Oo, this.f35711OoooO0.getCurrentPosition(), this.f35711OoooO0.OooO0O0());
        }
        if (z2 && this.f35711OoooO0.OooO0oO() == oooO00o2.f36331OooO0O0 && this.f35711OoooO0.OooO0Oo() == oooO00o2.f36332OooO0OO) {
            z = true;
        }
        if (z) {
            jOooO00o = this.f35711OoooO0.getCurrentPosition();
        }
        jOooO0o = jOooO00o;
        return new OooO0o.OooO00o(jElapsedRealtime, o000oooo2, i, oooO00o2, jOooO0o, this.f35711OoooO0.OooO0oo(), this.f35711OoooO0.OooO0o0(), this.f35712OoooO00.f35716OooO0Oo, this.f35711OoooO0.getCurrentPosition(), this.f35711OoooO0.OooO0O0());
    }
}
