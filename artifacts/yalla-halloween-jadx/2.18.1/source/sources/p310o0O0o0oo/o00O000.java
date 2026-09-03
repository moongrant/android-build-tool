package p310o0O0o0oo;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.OooOOO;
import com.google.android.exoplayer2.o000oOoO;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p318o0O0oOo.o000OOo0;
import p709oo0oOOo.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O000 extends o000O0O0<Void> {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o00O00O f36307OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f36308OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final o000oOoO.OooO0OO f36309OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public OooO00o f36310OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final o000oOoO.OooO0O0 f36311OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public o00oOoo f36312OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f36313OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f36314OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f36315OooOOo0;

    public static final class OooO00o extends o000OOo0 {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final Object f36316OooO0o0 = new Object();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public final Object f36317OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public final Object f36318OooO0Oo;

        public OooO00o(o000oOoO o000oooo2, @Nullable Object obj, @Nullable Object obj2) {
            super(o000oooo2);
            this.f36317OooO0OO = obj;
            this.f36318OooO0Oo = obj2;
        }

        @Override // p310o0O0o0oo.o000OOo0, com.google.android.exoplayer2.o000oOoO
        public final int OooO0O0(Object obj) {
            Object obj2;
            o000oOoO o000oooo2 = this.f36296OooO0O0;
            if (f36316OooO0o0.equals(obj) && (obj2 = this.f36318OooO0Oo) != null) {
                obj = obj2;
            }
            return o000oooo2.OooO0O0(obj);
        }

        @Override // p310o0O0o0oo.o000OOo0, com.google.android.exoplayer2.o000oOoO
        public final o000oOoO.OooO0O0 OooO0o(int i, o000oOoO.OooO0O0 oooO0O0, boolean z) {
            this.f36296OooO0O0.OooO0o(i, oooO0O0, z);
            if (o000OOo0.OooO00o(oooO0O0.f14558OooO0O0, this.f36318OooO0Oo) && z) {
                oooO0O0.f14558OooO0O0 = f36316OooO0o0;
            }
            return oooO0O0;
        }

        @Override // p310o0O0o0oo.o000OOo0, com.google.android.exoplayer2.o000oOoO
        public final Object OooOO0O(int i) {
            Object objOooOO0O = this.f36296OooO0O0.OooOO0O(i);
            return o000OOo0.OooO00o(objOooOO0O, this.f36318OooO0Oo) ? f36316OooO0o0 : objOooOO0O;
        }

        @Override // p310o0O0o0oo.o000OOo0, com.google.android.exoplayer2.o000oOoO
        public final o000oOoO.OooO0OO OooOOO0(int i, o000oOoO.OooO0OO oooO0OO, long j) {
            this.f36296OooO0O0.OooOOO0(i, oooO0OO, j);
            if (o000OOo0.OooO00o(oooO0OO.f14566OooO00o, this.f36317OooO0OO)) {
                oooO0OO.f14566OooO00o = o000oOoO.OooO0OO.f14564OooOOo0;
            }
            return oooO0OO;
        }

        public final OooO00o OooOOOo(o000oOoO o000oooo2) {
            return new OooO00o(o000oooo2, this.f36317OooO0OO, this.f36318OooO0Oo);
        }
    }

    @VisibleForTesting
    public static final class OooO0O0 extends o000oOoO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooOOO f36319OooO0O0;

        public OooO0O0(OooOOO oooOOO) {
            this.f36319OooO0O0 = oooOOO;
        }

        @Override // com.google.android.exoplayer2.o000oOoO
        public final int OooO0O0(Object obj) {
            return obj == OooO00o.f36316OooO0o0 ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.o000oOoO
        public final o000oOoO.OooO0O0 OooO0o(int i, o000oOoO.OooO0O0 oooO0O0, boolean z) {
            Integer num = z ? 0 : null;
            Object obj = z ? OooO00o.f36316OooO0o0 : null;
            Objects.requireNonNull(oooO0O0);
            AdPlaybackState adPlaybackState = AdPlaybackState.f14608OooO0o0;
            oooO0O0.f14557OooO00o = num;
            oooO0O0.f14558OooO0O0 = obj;
            oooO0O0.f14559OooO0OO = 0;
            oooO0O0.f14560OooO0Oo = -9223372036854775807L;
            oooO0O0.f14562OooO0o0 = 0L;
            oooO0O0.f14561OooO0o = adPlaybackState;
            return oooO0O0;
        }

        @Override // com.google.android.exoplayer2.o000oOoO
        public final int OooO0oo() {
            return 1;
        }

        @Override // com.google.android.exoplayer2.o000oOoO
        public final Object OooOO0O(int i) {
            return OooO00o.f36316OooO0o0;
        }

        @Override // com.google.android.exoplayer2.o000oOoO
        public final int OooOOO() {
            return 1;
        }

        @Override // com.google.android.exoplayer2.o000oOoO
        public final o000oOoO.OooO0OO OooOOO0(int i, o000oOoO.OooO0OO oooO0OO, long j) {
            Object obj = o000oOoO.OooO0OO.f14564OooOOo0;
            oooO0OO.OooO0O0(this.f36319OooO0O0, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, false, 0L, -9223372036854775807L, 0L);
            oooO0OO.f14575OooOO0O = true;
            return oooO0OO;
        }
    }

    public o00O000(o00O00O o00o00o2, boolean z) {
        this.f36307OooOO0 = o00o00o2;
        this.f36308OooOO0O = z && o00o00o2.OooO();
        this.f36309OooOO0o = new o000oOoO.OooO0OO();
        this.f36311OooOOO0 = new o000oOoO.OooO0O0();
        o000oOoO o000ooooOooOO0O = o00o00o2.OooOO0O();
        if (o000ooooOooOO0O == null) {
            this.f36310OooOOO = new OooO00o(new OooO0O0(o00o00o2.OooO0o()), o000oOoO.OooO0OO.f14564OooOOo0, OooO00o.f36316OooO0o0);
        } else {
            this.f36310OooOOO = new OooO00o(o000ooooOooOO0O, null, null);
            this.f36314OooOOo = true;
        }
    }

    @Override // p310o0O0o0oo.o00O00O
    public final OooOOO OooO0o() {
        return this.f36307OooOO0.OooO0o();
    }

    @Override // p310o0O0o0oo.o000O0O0, p310o0O0o0oo.o00O00O
    public final void OooO0oo() {
    }

    @Override // p310o0O0o0oo.o00O00O
    public final void OooOOO0(o00O00 o00o01) {
        o00oOoo o00oooo2 = (o00oOoo) o00o01;
        o00O00 o00o02 = o00oooo2.f36465Oooo;
        if (o00o02 != null) {
            o00oooo2.f36466Oooo0o.OooOOO0(o00o02);
        }
        if (o00o01 == this.f36312OooOOOO) {
            this.f36312OooOOOO = null;
        }
    }

    @Override // p310o0O0o0oo.o000O0O0, p310o0O0o0oo.o000O00O
    public final void OooOOOo(@Nullable p709oo0oOOo.o000oOoO o000oooo2) {
        super.OooOOOo(o000oooo2);
        if (this.f36308OooOO0O) {
            return;
        }
        this.f36313OooOOOo = true;
        OooOo0(this.f36307OooOO0);
    }

    @Override // p310o0O0o0oo.o000O0O0, p310o0O0o0oo.o000O00O
    public final void OooOOo() {
        this.f36315OooOOo0 = false;
        this.f36313OooOOOo = false;
        super.OooOOo();
    }

    @Override // p310o0O0o0oo.o000O0O0
    @Nullable
    public final o00O00O.OooO00o OooOOoo(Void r2, o00O00O.OooO00o oooO00o) {
        Object obj = oooO00o.f36330OooO00o;
        Object obj2 = this.f36310OooOOO.f36318OooO0Oo;
        if (obj2 != null && obj2.equals(obj)) {
            obj = OooO00o.f36316OooO0o0;
        }
        return oooO00o.OooO00o(obj);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // p310o0O0o0oo.o000O0O0
    public final void OooOo00(Object obj, o000oOoO o000oooo2) {
        long j;
        o00O00O.OooO00o OooO00o2;
        if (this.f36315OooOOo0) {
            this.f36310OooOOO = this.f36310OooOOO.OooOOOo(o000oooo2);
            o00oOoo o00oooo2 = this.f36312OooOOOO;
            if (o00oooo2 != null) {
                OooOo0o(o00oooo2.f36471OoooO0O);
            }
        } else {
            if (!o000oooo2.OooOOOO()) {
                o000oooo2.OooOO0o(0, this.f36309OooOO0o);
                o000oOoO.OooO0OO oooO0OO = this.f36309OooOO0o;
                long j2 = oooO0OO.f14577OooOOO;
                o00oOoo o00oooo3 = this.f36312OooOOOO;
                if (o00oooo3 != null) {
                    long j3 = o00oooo3.f36469OoooO0;
                    if (j3 != 0) {
                        j = j3;
                    } else {
                        j = j2;
                    }
                } else {
                    j = j2;
                }
                Object obj2 = oooO0OO.f14566OooO00o;
                Pair<Object, Long> pairOooO = o000oooo2.OooO(oooO0OO, this.f36311OooOOO0, 0, j);
                Object obj3 = pairOooO.first;
                long jLongValue = ((Long) pairOooO.second).longValue();
                this.f36310OooOOO = this.f36314OooOOo ? this.f36310OooOOO.OooOOOo(o000oooo2) : new OooO00o(o000oooo2, obj2, obj3);
                o00oOoo o00oooo4 = this.f36312OooOOOO;
                if (o00oooo4 != null) {
                    OooOo0o(jLongValue);
                    o00O00O.OooO00o oooO00o = o00oooo4.f36467Oooo0oO;
                    Object obj4 = oooO00o.f36330OooO00o;
                    if (this.f36310OooOOO.f36318OooO0Oo != null && obj4.equals(OooO00o.f36316OooO0o0)) {
                        obj4 = this.f36310OooOOO.f36318OooO0Oo;
                    }
                    OooO00o2 = oooO00o.OooO00o(obj4);
                }
                this.f36314OooOOo = true;
                this.f36315OooOOo0 = true;
                OooOOo0(this.f36310OooOOO);
                if (OooO00o2 != null) {
                    o00oOoo o00oooo5 = this.f36312OooOOOO;
                    Objects.requireNonNull(o00oooo5);
                    o00oooo5.OooO0oO(OooO00o2);
                }
            }
            this.f36310OooOOO = this.f36314OooOOo ? this.f36310OooOOO.OooOOOo(o000oooo2) : new OooO00o(o000oooo2, o000oOoO.OooO0OO.f14564OooOOo0, OooO00o.f36316OooO0o0);
        }
        OooO00o2 = null;
        this.f36314OooOOo = true;
        this.f36315OooOOo0 = true;
        OooOOo0(this.f36310OooOOO);
        if (OooO00o2 != null) {
            o00oOoo o00oooo6 = this.f36312OooOOOO;
            Objects.requireNonNull(o00oooo6);
            o00oooo6.OooO0oO(OooO00o2);
        }
    }

    @Override // p310o0O0o0oo.o00O00O
    /* JADX INFO: renamed from: OooOo0O, reason: merged with bridge method [inline-methods] */
    public final o00oOoo OooO0Oo(o00O00O.OooO00o oooO00o, OooO0OO oooO0OO, long j) {
        o00O00O o00o00o2 = this.f36307OooOO0;
        o00oOoo o00oooo2 = new o00oOoo(o00o00o2, oooO00o, oooO0OO, j);
        if (this.f36315OooOOo0) {
            Object obj = oooO00o.f36330OooO00o;
            if (this.f36310OooOOO.f36318OooO0Oo != null && obj.equals(OooO00o.f36316OooO0o0)) {
                obj = this.f36310OooOOO.f36318OooO0Oo;
            }
            o00oooo2.OooO0oO(oooO00o.OooO00o(obj));
        } else {
            this.f36312OooOOOO = o00oooo2;
            if (!this.f36313OooOOOo) {
                this.f36313OooOOOo = true;
                OooOo0(o00o00o2);
            }
        }
        return o00oooo2;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    public final void OooOo0o(long j) {
        o00oOoo o00oooo2 = this.f36312OooOOOO;
        int iOooO0O0 = this.f36310OooOOO.OooO0O0(o00oooo2.f36467Oooo0oO.f36330OooO00o);
        if (iOooO0O0 == -1) {
            return;
        }
        OooO00o oooO00o = this.f36310OooOOO;
        o000oOoO.OooO0O0 oooO0O0 = this.f36311OooOOO0;
        oooO00o.OooO0o(iOooO0O0, oooO0O0, false);
        long j2 = oooO0O0.f14560OooO0Oo;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        o00oooo2.f36471OoooO0O = j;
    }
}
