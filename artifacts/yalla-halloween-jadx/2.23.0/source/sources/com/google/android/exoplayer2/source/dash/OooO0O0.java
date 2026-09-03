package com.google.android.exoplayer2.source.dash;

import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.trackselection.OooO0o;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import p200o00o0o.o0O0OOO0;
import p203o00o0o0o.o0O00OO;
import p209o00o0oo0.o00OO0OO;
import p209o00o0oo0.oOO00O;
import p227o00oOo0O.OooOo00;
import p227o00oOo0O.Oooo0;
import p227o00oOo0O.Oooo000;
import p227o00oOo0O.o000oOoO;
import p228o00oOo0o.o00O0O;
import p228o00oOo0o.o00Oo0;
import p228o00oOo0o.o00Ooo;
import p228o00oOo0o.o0OO00O;
import p228o00oOo0o.oo0o0Oo;
import p235o00oOooO.o00O;
import p235o00oOooO.o00O0OO;
import p235o00oOooO.o00OO;
import p235o00oOooO.o00OO000;
import p235o00oOooO.o00OO00O;
import p235o00oOooO.o00OO0O0;
import p235o00oOooO.o00OOO0;
import p235o00oOooO.o00OOO00;
import p235o00oOooO.o00OOO0O;
import p235o00oOooO.o0o0Oo;
import p235o00oOooO.oo0oOO0;
import p244o00oo0Oo.o00O0OO0;
import p244o00oo0Oo.oo00o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 implements com.google.android.exoplayer2.source.dash.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooO0o f13246OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oo00o f13247OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOo00 f13248OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int[] f13249OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f13250OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f13251OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.OooO00o f13252OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final com.google.android.exoplayer2.source.dash.OooO0OO.C0212OooO0OO f13253OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C0211OooO0O0[] f13254OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public o00Ooo f13255OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f13256OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public BehindLiveWindowException f13257OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f13258OooOOO0;

    public static final class OooO00o implements com.google.android.exoplayer2.source.dash.OooO00o.InterfaceC0210OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0215OooO00o f13259OooO00o;

        public OooO00o(com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0215OooO00o interfaceC0215OooO00o) {
            this.f13259OooO00o = interfaceC0215OooO00o;
        }

        @Override // com.google.android.exoplayer2.source.dash.OooO00o.InterfaceC0210OooO00o
        public final OooO0O0 OooO00o(oo00o oo00oVar, o00Ooo o00ooo2, OooOo00 oooOo00, int i, int[] iArr, OooO0o oooO0o, int i2, long j, boolean z, ArrayList arrayList, @Nullable com.google.android.exoplayer2.source.dash.OooO0OO.C0212OooO0OO c0212OooO0OO, @Nullable o00O0OO0 o00o0oo1, o0O0OOO0 o0o0ooo0) {
            com.google.android.exoplayer2.upstream.OooO00o OooO00o2 = this.f13259OooO00o.OooO00o();
            if (o00o0oo1 != null) {
                OooO00o2.OooO0OO(o00o0oo1);
            }
            return new OooO0O0(oo00oVar, o00ooo2, oooOo00, i, iArr, oooO0o, i2, OooO00o2, j, z, arrayList, c0212OooO0OO, o0o0ooo0);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C0211OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final o00OO00O f13260OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final oo0o0Oo f13261OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o00Oo0 f13262OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public final Oooo000 f13263OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final long f13264OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final long f13265OooO0o0;

        public C0211OooO0O0(long j, oo0o0Oo oo0o0oo, o00Oo0 o00oo1, @Nullable o00OO00O o00oo00o, long j2, @Nullable Oooo000 oooo000) {
            this.f13265OooO0o0 = j;
            this.f13261OooO0O0 = oo0o0oo;
            this.f13262OooO0OO = o00oo1;
            this.f13264OooO0o = j2;
            this.f13260OooO00o = o00oo00o;
            this.f13263OooO0Oo = oooo000;
        }

        @CheckResult
        public final C0211OooO0O0 OooO00o(long j, oo0o0Oo oo0o0oo) throws BehindLiveWindowException {
            long jOooO0o;
            long jOooO0o2;
            Oooo000 oooo000OooOO0o = this.f13261OooO0O0.OooOO0o();
            Oooo000 oooo000OooOO0o2 = oo0o0oo.OooOO0o();
            if (oooo000OooOO0o == null) {
                return new C0211OooO0O0(j, oo0o0oo, this.f13262OooO0OO, this.f13260OooO00o, this.f13264OooO0o, oooo000OooOO0o);
            }
            if (!oooo000OooOO0o.OooO0oo()) {
                return new C0211OooO0O0(j, oo0o0oo, this.f13262OooO0OO, this.f13260OooO00o, this.f13264OooO0o, oooo000OooOO0o2);
            }
            long jOooO0oO = oooo000OooOO0o.OooO0oO(j);
            if (jOooO0oO == 0) {
                return new C0211OooO0O0(j, oo0o0oo, this.f13262OooO0OO, this.f13260OooO00o, this.f13264OooO0o, oooo000OooOO0o2);
            }
            long jOooO = oooo000OooOO0o.OooO();
            long jOooO00o = oooo000OooOO0o.OooO00o(jOooO);
            long j2 = (jOooO0oO + jOooO) - 1;
            long jOooO0O0 = oooo000OooOO0o.OooO0O0(j2, j) + oooo000OooOO0o.OooO00o(j2);
            long jOooO2 = oooo000OooOO0o2.OooO();
            long jOooO00o2 = oooo000OooOO0o2.OooO00o(jOooO2);
            long j3 = this.f13264OooO0o;
            if (jOooO0O0 != jOooO00o2) {
                if (jOooO0O0 < jOooO00o2) {
                    throw new BehindLiveWindowException();
                }
                if (jOooO00o2 < jOooO00o) {
                    jOooO0o2 = j3 - (oooo000OooOO0o2.OooO0o(jOooO00o, j) - jOooO);
                } else {
                    jOooO0o = oooo000OooOO0o.OooO0o(jOooO00o2, j);
                }
                return new C0211OooO0O0(j, oo0o0oo, this.f13262OooO0OO, this.f13260OooO00o, jOooO0o2, oooo000OooOO0o2);
            }
            jOooO0o = j2 + 1;
            jOooO0o2 = (jOooO0o - jOooO2) + j3;
            return new C0211OooO0O0(j, oo0o0oo, this.f13262OooO0OO, this.f13260OooO00o, jOooO0o2, oooo000OooOO0o2);
        }

        public final long OooO0O0(long j) {
            Oooo000 oooo000 = this.f13263OooO0Oo;
            long j2 = this.f13265OooO0o0;
            return (oooo000.OooOO0(j2, j) + (oooo000.OooO0OO(j2, j) + this.f13264OooO0o)) - 1;
        }

        public final long OooO0OO(long j) {
            return this.f13263OooO0Oo.OooO0O0(j - this.f13264OooO0o, this.f13265OooO0o0) + OooO0Oo(j);
        }

        public final long OooO0Oo(long j) {
            return this.f13263OooO0Oo.OooO00o(j - this.f13264OooO0o);
        }

        public final boolean OooO0o0(long j, long j2) {
            return this.f13263OooO0Oo.OooO0oo() || j2 == -9223372036854775807L || OooO0OO(j) <= j2;
        }
    }

    public static final class OooO0OO extends o00O0OO {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final C0211OooO0O0 f13266OooO0o0;

        public OooO0OO(C0211OooO0O0 c0211OooO0O0, long j, long j2) {
            super(j, j2);
            this.f13266OooO0o0 = c0211OooO0O0;
        }

        @Override // p235o00oOooO.o00OOO0O
        public final long OooO00o() {
            long j = this.f40243OooO0Oo;
            if (j < this.f40241OooO0O0 || j > this.f40242OooO0OO) {
                throw new NoSuchElementException();
            }
            return this.f13266OooO0o0.OooO0Oo(j);
        }

        @Override // p235o00oOooO.o00OOO0O
        public final long OooO0O0() {
            long j = this.f40243OooO0Oo;
            if (j < this.f40241OooO0O0 || j > this.f40242OooO0OO) {
                throw new NoSuchElementException();
            }
            return this.f13266OooO0o0.OooO0OO(j);
        }
    }

    public OooO0O0(oo00o oo00oVar, o00Ooo o00ooo2, OooOo00 oooOo00, int i, int[] iArr, OooO0o oooO0o, int i2, com.google.android.exoplayer2.upstream.OooO00o oooO00o, long j, boolean z, ArrayList arrayList, @Nullable com.google.android.exoplayer2.source.dash.OooO0OO.C0212OooO0OO c0212OooO0OO, o0O0OOO0 o0o0ooo0) {
        oo0oOO0 oo0ooo0 = o00O.f40225OooOOO0;
        this.f13247OooO00o = oo00oVar;
        this.f13255OooOO0 = o00ooo2;
        this.f13248OooO0O0 = oooOo00;
        this.f13249OooO0OO = iArr;
        this.f13246OooO = oooO0o;
        this.f13250OooO0Oo = i2;
        this.f13252OooO0o0 = oooO00o;
        this.f13256OooOO0O = i;
        this.f13251OooO0o = j;
        this.f13253OooO0oO = c0212OooO0OO;
        long jOooO0o0 = o00ooo2.OooO0o0(i);
        ArrayList<oo0o0Oo> arrayListOooOO0o = OooOO0o();
        this.f13254OooO0oo = new C0211OooO0O0[oooO0o.length()];
        int i3 = 0;
        while (i3 < this.f13254OooO0oo.length) {
            oo0o0Oo oo0o0oo = arrayListOooOO0o.get(oooO0o.OooO0OO(i3));
            o00Oo0 o00oo0OooO0Oo = oooOo00.OooO0Oo(oo0o0oo.f40004OooO0O0);
            C0211OooO0O0[] c0211OooO0O0Arr = this.f13254OooO0oo;
            if (o00oo0OooO0Oo == null) {
                o00oo0OooO0Oo = oo0o0oo.f40004OooO0O0.get(0);
            }
            int i4 = i3;
            c0211OooO0O0Arr[i4] = new C0211OooO0O0(jOooO0o0, oo0o0oo, o00oo0OooO0Oo, oo0ooo0.OooO00o(i2, oo0o0oo.f40003OooO00o, z, arrayList, c0212OooO0OO), 0L, oo0o0oo.OooOO0o());
            i3 = i4 + 1;
        }
    }

    @Override // p235o00oOooO.oo0O
    public final void OooO(long j, long j2, List<? extends o00OOO0> list, o00OO0O0 o00oo0o1) {
        C0211OooO0O0[] c0211OooO0O0Arr;
        long jMax;
        com.google.android.exoplayer2.upstream.OooO00o oooO00o;
        o00OO000 o00oo2;
        long j3;
        boolean z;
        if (this.f13257OooOO0o != null) {
            return;
        }
        long j4 = j2 - j;
        long jOooo0O0 = o0O00.Oooo0O0(this.f13255OooOO0.OooO0O0(this.f13256OooOO0O).f39977OooO0O0) + o0O00.Oooo0O0(this.f13255OooOO0.f39940OooO00o) + j2;
        com.google.android.exoplayer2.source.dash.OooO0OO.C0212OooO0OO c0212OooO0OO = this.f13253OooO0oO;
        if (c0212OooO0OO != null) {
            com.google.android.exoplayer2.source.dash.OooO0OO oooO0OO = com.google.android.exoplayer2.source.dash.OooO0OO.this;
            o00Ooo o00ooo2 = oooO0OO.f13267OooO;
            if (!o00ooo2.f39943OooO0Oo) {
                z = false;
            } else if (oooO0OO.f13274OooOO0O) {
                z = true;
            } else {
                Map.Entry<Long, Long> entryCeilingEntry = oooO0OO.f13272OooO0oo.ceilingEntry(Long.valueOf(o00ooo2.f39947OooO0oo));
                com.google.android.exoplayer2.source.dash.OooO0OO.OooO0O0 oooO0O0 = oooO0OO.f13270OooO0o0;
                if (entryCeilingEntry == null || entryCeilingEntry.getValue().longValue() >= jOooo0O0) {
                    z = false;
                } else {
                    long jLongValue = entryCeilingEntry.getKey().longValue();
                    DashMediaSource dashMediaSource = DashMediaSource.this;
                    long j5 = dashMediaSource.f13222Oooo0oO;
                    if (j5 == -9223372036854775807L || j5 < jLongValue) {
                        dashMediaSource.f13222Oooo0oO = jLongValue;
                    }
                    z = true;
                }
                if (z && oooO0OO.f13273OooOO0) {
                    oooO0OO.f13274OooOO0O = true;
                    oooO0OO.f13273OooOO0 = false;
                    DashMediaSource dashMediaSource2 = DashMediaSource.this;
                    dashMediaSource2.f13212OooOooO.removeCallbacks(dashMediaSource2.f13206OooOo0o);
                    dashMediaSource2.OooOoO0();
                }
            }
            if (z) {
                return;
            }
        }
        long jOooo0O1 = o0O00.Oooo0O0(o0O00.OooOOoo(this.f13251OooO0o));
        long jOooOO0O = OooOO0O(jOooo0O1);
        o00OOO0 o00ooo1 = list.isEmpty() ? null : list.get(list.size() - 1);
        int length = this.f13246OooO.length();
        o00OOO0O[] o00ooo0oArr = new o00OOO0O[length];
        int i = 0;
        while (true) {
            c0211OooO0O0Arr = this.f13254OooO0oo;
            if (i >= length) {
                break;
            }
            C0211OooO0O0 c0211OooO0O0 = c0211OooO0O0Arr[i];
            Oooo000 oooo000 = c0211OooO0O0.f13263OooO0Oo;
            o00OOO0O.OooO00o oooO00o2 = o00OOO0O.f40296OooO00o;
            if (oooo000 == null) {
                o00ooo0oArr[i] = oooO00o2;
                j4 = j4;
                j3 = jOooOO0O;
            } else {
                j3 = jOooOO0O;
                long j6 = c0211OooO0O0.f13265OooO0o0;
                long jOooO0OO = oooo000.OooO0OO(j6, jOooo0O1);
                long j7 = c0211OooO0O0.f13264OooO0o;
                long j8 = jOooO0OO + j7;
                long jOooO0O0 = c0211OooO0O0.OooO0O0(jOooo0O1);
                long jOooO0OO2 = o00ooo1 != null ? o00ooo1.OooO0OO() : o0O00.OooOO0(c0211OooO0O0.f13263OooO0Oo.OooO0o(j2, j6) + j7, j8, jOooO0O0);
                if (jOooO0OO2 < j8) {
                    o00ooo0oArr[i] = oooO00o2;
                } else {
                    o00ooo0oArr[i] = new OooO0OO(OooOOO0(i), jOooO0OO2, jOooO0O0);
                }
            }
            i++;
            jOooOO0O = j3;
            j4 = j4;
        }
        long j9 = j4;
        long j10 = jOooOO0O;
        if (this.f13255OooOO0.f39943OooO0Oo) {
            jMax = Math.max(0L, Math.min(OooOO0O(jOooo0O1), c0211OooO0O0Arr[0].OooO0OO(c0211OooO0O0Arr[0].OooO0O0(jOooo0O1))) - j);
        } else {
            jMax = -9223372036854775807L;
        }
        this.f13246OooO.OooOOOO(j, j9, jMax, list, o00ooo0oArr);
        C0211OooO0O0 c0211OooO0O0OooOOO0 = OooOOO0(this.f13246OooO.OooO00o());
        Oooo000 oooo001 = c0211OooO0O0OooOOO0.f13263OooO0Oo;
        o00Oo0 o00oo1 = c0211OooO0O0OooOOO0.f13262OooO0OO;
        o00OO00O o00oo00o = c0211OooO0O0OooOOO0.f13260OooO00o;
        oo0o0Oo oo0o0oo = c0211OooO0O0OooOOO0.f13261OooO0O0;
        if (o00oo00o != null) {
            o0OO00O o0oo00o2 = ((o00O) o00oo00o).f40234OooOO0o == null ? oo0o0oo.f40009OooO0oO : null;
            o0OO00O o0oo00oOooOOO0 = oooo001 == null ? oo0o0oo.OooOOO0() : null;
            if (o0oo00o2 != null || o0oo00oOooOOO0 != null) {
                com.google.android.exoplayer2.upstream.OooO00o oooO00o3 = this.f13252OooO0o0;
                OooOo oooOoOooOOOo = this.f13246OooO.OooOOOo();
                int iOooOOo0 = this.f13246OooO.OooOOo0();
                Object objOooO0oO = this.f13246OooO.OooO0oO();
                if (o0oo00o2 != null) {
                    o0OO00O o0oo00oOooO00o = o0oo00o2.OooO00o(o0oo00oOooOOO0, o00oo1.f39935OooO00o);
                    if (o0oo00oOooO00o != null) {
                        o0oo00o2 = o0oo00oOooO00o;
                    }
                } else {
                    o0oo00o2 = o0oo00oOooOOO0;
                }
                o00oo0o1.f40261OooO00o = new o00OOO00(oooO00o3, Oooo0.OooO00o(oo0o0oo, o00oo1.f39935OooO00o, o0oo00o2, 0), oooOoOooOOOo, iOooOOo0, objOooO0oO, c0211OooO0O0OooOOO0.f13260OooO00o);
                return;
            }
        }
        long j11 = c0211OooO0O0OooOOO0.f13265OooO0o0;
        boolean z2 = j11 != -9223372036854775807L;
        if (oooo001.OooO0oO(j11) == 0) {
            o00oo0o1.f40262OooO0O0 = z2;
            return;
        }
        long jOooO0OO3 = oooo001.OooO0OO(j11, jOooo0O1);
        boolean z3 = z2;
        long j12 = c0211OooO0O0OooOOO0.f13264OooO0o;
        long j13 = jOooO0OO3 + j12;
        long jOooO0O1 = c0211OooO0O0OooOOO0.OooO0O0(jOooo0O1);
        long jOooO0OO4 = o00ooo1 != null ? o00ooo1.OooO0OO() : o0O00.OooOO0(oooo001.OooO0o(j2, j11) + j12, j13, jOooO0O1);
        if (jOooO0OO4 < j13) {
            this.f13257OooOO0o = new BehindLiveWindowException();
            return;
        }
        if (jOooO0OO4 > jOooO0O1 || (this.f13258OooOOO0 && jOooO0OO4 >= jOooO0O1)) {
            o00oo0o1.f40262OooO0O0 = z3;
            return;
        }
        if (z3 && c0211OooO0O0OooOOO0.OooO0Oo(jOooO0OO4) >= j11) {
            o00oo0o1.f40262OooO0O0 = true;
            return;
        }
        int iMin = (int) Math.min(1, (jOooO0O1 - jOooO0OO4) + 1);
        if (j11 != -9223372036854775807L) {
            while (iMin > 1 && c0211OooO0O0OooOOO0.OooO0Oo((((long) iMin) + jOooO0OO4) - 1) >= j11) {
                iMin--;
            }
        }
        long j14 = list.isEmpty() ? j2 : -9223372036854775807L;
        com.google.android.exoplayer2.upstream.OooO00o oooO00o4 = this.f13252OooO0o0;
        int i2 = this.f13250OooO0Oo;
        OooOo oooOoOooOOOo2 = this.f13246OooO.OooOOOo();
        int iOooOOo1 = this.f13246OooO.OooOOo0();
        Object objOooO0oO2 = this.f13246OooO.OooO0oO();
        long jOooO0Oo = c0211OooO0O0OooOOO0.OooO0Oo(jOooO0OO4);
        o0OO00O o0oo00oOooO0o0 = oooo001.OooO0o0(jOooO0OO4 - j12);
        if (o00oo00o == null) {
            o00oo2 = new o0o0Oo(oooO00o4, Oooo0.OooO00o(oo0o0oo, o00oo1.f39935OooO00o, o0oo00oOooO0o0, c0211OooO0O0OooOOO0.OooO0o0(jOooO0OO4, j10) ? 0 : 8), oooOoOooOOOo2, iOooOOo1, objOooO0oO2, jOooO0Oo, c0211OooO0O0OooOOO0.OooO0OO(jOooO0OO4), jOooO0OO4, i2, oooOoOooOOOo2);
        } else {
            o0OO00O o0oo00o3 = o0oo00oOooO0o0;
            int i3 = 1;
            int i4 = 1;
            while (true) {
                if (i4 >= iMin) {
                    oooO00o = oooO00o4;
                    break;
                }
                int i5 = iMin;
                oooO00o = oooO00o4;
                o0OO00O o0oo00oOooO00o2 = o0oo00o3.OooO00o(oooo001.OooO0o0((((long) i4) + jOooO0OO4) - j12), o00oo1.f39935OooO00o);
                if (o0oo00oOooO00o2 == null) {
                    break;
                }
                i3++;
                i4++;
                o0oo00o3 = o0oo00oOooO00o2;
                oooO00o4 = oooO00o;
                iMin = i5;
            }
            long j15 = (((long) i3) + jOooO0OO4) - 1;
            long jOooO0OO5 = c0211OooO0O0OooOOO0.OooO0OO(j15);
            o00oo2 = new o00OO(oooO00o, Oooo0.OooO00o(oo0o0oo, o00oo1.f39935OooO00o, o0oo00o3, c0211OooO0O0OooOOO0.OooO0o0(j15, j10) ? 0 : 8), oooOoOooOOOo2, iOooOOo1, objOooO0oO2, jOooO0Oo, jOooO0OO5, j14, (j11 == -9223372036854775807L || j11 > jOooO0OO5) ? -9223372036854775807L : j11, jOooO0OO4, i3, -oo0o0oo.f40005OooO0OO, c0211OooO0O0OooOOO0.f13260OooO00o);
        }
        o00oo0o1.f40261OooO00o = o00oo2;
    }

    @Override // p235o00oOooO.oo0O
    public final void OooO00o() throws IOException {
        BehindLiveWindowException behindLiveWindowException = this.f13257OooOO0o;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        this.f13247OooO00o.OooO00o();
    }

    @Override // p235o00oOooO.oo0O
    public final void OooO0O0(o00OO000 o00oo001) {
        if (o00oo001 instanceof o00OOO00) {
            int iOooOOO = this.f13246OooO.OooOOO(((o00OOO00) o00oo001).f40256OooO0Oo);
            C0211OooO0O0[] c0211OooO0O0Arr = this.f13254OooO0oo;
            C0211OooO0O0 c0211OooO0O0 = c0211OooO0O0Arr[iOooOOO];
            if (c0211OooO0O0.f13263OooO0Oo == null) {
                o00OO00O o00oo00o = c0211OooO0O0.f13260OooO00o;
                o00OO0OO o00oo0oo = ((o00O) o00oo00o).f40233OooOO0O;
                oOO00O ooo00o = o00oo0oo instanceof oOO00O ? (oOO00O) o00oo0oo : null;
                if (ooo00o != null) {
                    oo0o0Oo oo0o0oo = c0211OooO0O0.f13261OooO0O0;
                    c0211OooO0O0Arr[iOooOOO] = new C0211OooO0O0(c0211OooO0O0.f13265OooO0o0, oo0o0oo, c0211OooO0O0.f13262OooO0OO, o00oo00o, c0211OooO0O0.f13264OooO0o, new o000oOoO(ooo00o, oo0o0oo.f40005OooO0OO));
                }
            }
        }
        com.google.android.exoplayer2.source.dash.OooO0OO.C0212OooO0OO c0212OooO0OO = this.f13253OooO0oO;
        if (c0212OooO0OO != null) {
            long j = c0212OooO0OO.f13281OooO0Oo;
            if (j == -9223372036854775807L || o00oo001.f40260OooO0oo > j) {
                c0212OooO0OO.f13281OooO0Oo = o00oo001.f40260OooO0oo;
            }
            com.google.android.exoplayer2.source.dash.OooO0OO.this.f13273OooOO0 = true;
        }
    }

    @Override // p235o00oOooO.oo0O
    public final long OooO0OO(long j, o0O00OO o0o00oo2) {
        for (C0211OooO0O0 c0211OooO0O0 : this.f13254OooO0oo) {
            Oooo000 oooo000 = c0211OooO0O0.f13263OooO0Oo;
            if (oooo000 != null) {
                long j2 = c0211OooO0O0.f13265OooO0o0;
                long jOooO0o = oooo000.OooO0o(j, j2);
                long j3 = c0211OooO0O0.f13264OooO0o;
                long j4 = jOooO0o + j3;
                long jOooO0Oo = c0211OooO0O0.OooO0Oo(j4);
                Oooo000 oooo001 = c0211OooO0O0.f13263OooO0Oo;
                long jOooO0oO = oooo001.OooO0oO(j2);
                return o0o00oo2.OooO00o(j, jOooO0Oo, (jOooO0Oo >= j || (jOooO0oO != -1 && j4 >= ((oooo001.OooO() + j3) + jOooO0oO) - 1)) ? jOooO0Oo : c0211OooO0O0.OooO0Oo(j4 + 1));
            }
        }
        return j;
    }

    @Override // p235o00oOooO.oo0O
    public final boolean OooO0Oo(long j, o00OO000 o00oo001, List<? extends o00OOO0> list) {
        if (this.f13257OooOO0o != null) {
            return false;
        }
        return this.f13246OooO.OooO0Oo(j, o00oo001, list);
    }

    @Override // com.google.android.exoplayer2.source.dash.OooO00o
    public final void OooO0o(OooO0o oooO0o) {
        this.f13246OooO = oooO0o;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    @Override // p235o00oOooO.oo0O
    public final boolean OooO0o0(o00OO000 o00oo001, boolean z, LoadErrorHandlingPolicy.OooO0OO oooO0OO, LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        LoadErrorHandlingPolicy.OooO0O0 oooO0O0OooO0OO;
        boolean z2;
        if (!z) {
            return false;
        }
        com.google.android.exoplayer2.source.dash.OooO0OO.C0212OooO0OO c0212OooO0OO = this.f13253OooO0oO;
        if (c0212OooO0OO != null) {
            long j = c0212OooO0OO.f13281OooO0Oo;
            boolean z3 = j != -9223372036854775807L && j < o00oo001.f40259OooO0oO;
            com.google.android.exoplayer2.source.dash.OooO0OO oooO0OO2 = com.google.android.exoplayer2.source.dash.OooO0OO.this;
            if (oooO0OO2.f13267OooO.f39943OooO0Oo) {
                if (!oooO0OO2.f13274OooOO0O) {
                    if (!z3) {
                        z2 = false;
                    } else if (oooO0OO2.f13273OooOO0) {
                        oooO0OO2.f13274OooOO0O = true;
                        oooO0OO2.f13273OooOO0 = false;
                        DashMediaSource dashMediaSource = DashMediaSource.this;
                        dashMediaSource.f13212OooOooO.removeCallbacks(dashMediaSource.f13206OooOo0o);
                        dashMediaSource.OooOoO0();
                    }
                }
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
        }
        boolean z4 = this.f13255OooOO0.f39943OooO0Oo;
        C0211OooO0O0[] c0211OooO0O0Arr = this.f13254OooO0oo;
        if (!z4 && (o00oo001 instanceof o00OOO0)) {
            IOException iOException = oooO0OO.f14190OooO00o;
            if ((iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((HttpDataSource$InvalidResponseCodeException) iOException).f14182OooO0oO == 404) {
                C0211OooO0O0 c0211OooO0O0 = c0211OooO0O0Arr[this.f13246OooO.OooOOO(o00oo001.f40256OooO0Oo)];
                long jOooO0oO = c0211OooO0O0.f13263OooO0Oo.OooO0oO(c0211OooO0O0.f13265OooO0o0);
                if (jOooO0oO != -1 && jOooO0oO != 0) {
                    if (((o00OOO0) o00oo001).OooO0OO() > ((c0211OooO0O0.f13263OooO0Oo.OooO() + c0211OooO0O0.f13264OooO0o) + jOooO0oO) - 1) {
                        this.f13258OooOOO0 = true;
                        return true;
                    }
                }
            }
        }
        C0211OooO0O0 c0211OooO0O1 = c0211OooO0O0Arr[this.f13246OooO.OooOOO(o00oo001.f40256OooO0Oo)];
        ImmutableList<o00Oo0> immutableList = c0211OooO0O1.f13261OooO0O0.f40004OooO0O0;
        OooOo00 oooOo00 = this.f13248OooO0O0;
        o00Oo0 o00oo0OooO0Oo = oooOo00.OooO0Oo(immutableList);
        o00Oo0 o00oo1 = c0211OooO0O1.f13262OooO0OO;
        if (o00oo0OooO0Oo != null && !o00oo1.equals(o00oo0OooO0Oo)) {
            return true;
        }
        LoadErrorHandlingPolicy.OooO00o oooO00oOooOO0 = OooOO0(this.f13246OooO, c0211OooO0O1.f13261OooO0O0.f40004OooO0O0);
        if ((!oooO00oOooOO0.OooO00o(2) && !oooO00oOooOO0.OooO00o(1)) || (oooO0O0OooO0OO = loadErrorHandlingPolicy.OooO0OO(oooO00oOooOO0, oooO0OO)) == null) {
            return false;
        }
        int i = oooO0O0OooO0OO.f14188OooO00o;
        if (!oooO00oOooOO0.OooO00o(i)) {
            return false;
        }
        long j2 = oooO0O0OooO0OO.f14189OooO0O0;
        if (i == 2) {
            OooO0o oooO0o = this.f13246OooO;
            return oooO0o.blacklist(oooO0o.OooOOO(o00oo001.f40256OooO0Oo), j2);
        }
        if (i != 1) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j2;
        OooOo00.OooO00o(o00oo1.f39936OooO0O0, jElapsedRealtime, oooOo00.f39903OooO00o);
        int i2 = o00oo1.f39937OooO0OO;
        if (i2 != Integer.MIN_VALUE) {
            OooOo00.OooO00o(Integer.valueOf(i2), jElapsedRealtime, oooOo00.f39904OooO0O0);
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.source.dash.OooO00o
    public final void OooO0oO(o00Ooo o00ooo2, int i) {
        C0211OooO0O0[] c0211OooO0O0Arr = this.f13254OooO0oo;
        try {
            this.f13255OooOO0 = o00ooo2;
            this.f13256OooOO0O = i;
            long jOooO0o0 = o00ooo2.OooO0o0(i);
            ArrayList<oo0o0Oo> arrayListOooOO0o = OooOO0o();
            for (int i2 = 0; i2 < c0211OooO0O0Arr.length; i2++) {
                c0211OooO0O0Arr[i2] = c0211OooO0O0Arr[i2].OooO00o(jOooO0o0, arrayListOooOO0o.get(this.f13246OooO.OooO0OO(i2)));
            }
        } catch (BehindLiveWindowException e) {
            this.f13257OooOO0o = e;
        }
    }

    @Override // p235o00oOooO.oo0O
    public final int OooO0oo(long j, List<? extends o00OOO0> list) {
        return (this.f13257OooOO0o != null || this.f13246OooO.length() < 2) ? list.size() : this.f13246OooO.OooOOO0(j, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LoadErrorHandlingPolicy.OooO00o OooOO0(OooO0o oooO0o, ImmutableList immutableList) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = oooO0o.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (oooO0o.isBlacklisted(i2, jElapsedRealtime)) {
                i++;
            }
        }
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < immutableList.size(); i3++) {
            hashSet.add(Integer.valueOf(((o00Oo0) immutableList.get(i3)).f39937OooO0OO));
        }
        int size = hashSet.size();
        OooOo00 oooOo00 = this.f13248OooO0O0;
        oooOo00.getClass();
        HashSet hashSet2 = new HashSet();
        ArrayList arrayListOooO0O0 = oooOo00.OooO0O0(immutableList);
        for (int i4 = 0; i4 < arrayListOooO0O0.size(); i4++) {
            hashSet2.add(Integer.valueOf(((o00Oo0) arrayListOooO0O0.get(i4)).f39937OooO0OO));
        }
        return new LoadErrorHandlingPolicy.OooO00o(size, size - hashSet2.size(), length, i);
    }

    public final long OooOO0O(long j) {
        o00Ooo o00ooo2 = this.f13255OooOO0;
        long j2 = o00ooo2.f39940OooO00o;
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j - o0O00.Oooo0O0(j2 + o00ooo2.OooO0O0(this.f13256OooOO0O).f39977OooO0O0);
    }

    public final ArrayList<oo0o0Oo> OooOO0o() {
        List<o00O0O> list = this.f13255OooOO0.OooO0O0(this.f13256OooOO0O).f39978OooO0OO;
        ArrayList<oo0o0Oo> arrayList = new ArrayList<>();
        for (int i : this.f13249OooO0OO) {
            arrayList.addAll(list.get(i).f39931OooO0OO);
        }
        return arrayList;
    }

    public final C0211OooO0O0 OooOOO0(int i) {
        C0211OooO0O0[] c0211OooO0O0Arr = this.f13254OooO0oo;
        C0211OooO0O0 c0211OooO0O0 = c0211OooO0O0Arr[i];
        o00Oo0 o00oo0OooO0Oo = this.f13248OooO0O0.OooO0Oo(c0211OooO0O0.f13261OooO0O0.f40004OooO0O0);
        if (o00oo0OooO0Oo == null || o00oo0OooO0Oo.equals(c0211OooO0O0.f13262OooO0OO)) {
            return c0211OooO0O0;
        }
        C0211OooO0O0 c0211OooO0O1 = new C0211OooO0O0(c0211OooO0O0.f13265OooO0o0, c0211OooO0O0.f13261OooO0O0, o00oo0OooO0Oo, c0211OooO0O0.f13260OooO00o, c0211OooO0O0.f13264OooO0o, c0211OooO0O0.f13263OooO0Oo);
        c0211OooO0O0Arr[i] = c0211OooO0O1;
        return c0211OooO0O1;
    }

    @Override // p235o00oOooO.oo0O
    public final void release() {
        for (C0211OooO0O0 c0211OooO0O0 : this.f13254OooO0oo) {
            o00OO00O o00oo00o = c0211OooO0O0.f13260OooO00o;
            if (o00oo00o != null) {
                ((o00O) o00oo00o).f40227OooO0Oo.release();
            }
        }
    }
}
