package p228o00oOo0o;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.compose.animation.core.AnimationKt;
import com.google.android.exoplayer2.OooOo;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p227o00oOo0O.Oooo000;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOo f40003OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ImmutableList<o00Oo0> f40004OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f40005OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<o00oO0o> f40006OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final List<o00oO0o> f40007OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<o00oO0o> f40008OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0OO00O f40009OooO0oO;

    public static class OooO00o extends oo0o0Oo implements Oooo000 {

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @VisibleForTesting
        public final o0O0O00.OooO00o f40010OooO0oo;

        public OooO00o(long j, OooOo oooOo, ImmutableList immutableList, o0O0O00.OooO00o oooO00o, @Nullable ArrayList arrayList, List list, List list2) {
            super(oooOo, immutableList, oooO00o, arrayList, list, list2);
            this.f40010OooO0oo = oooO00o;
        }

        @Override // p227o00oOo0O.Oooo000
        public final long OooO() {
            return this.f40010OooO0oo.f39961OooO0Oo;
        }

        @Override // p227o00oOo0O.Oooo000
        public final long OooO00o(long j) {
            return this.f40010OooO0oo.OooO0oO(j);
        }

        @Override // p227o00oOo0O.Oooo000
        public final long OooO0O0(long j, long j2) {
            return this.f40010OooO0oo.OooO0o0(j, j2);
        }

        @Override // p227o00oOo0O.Oooo000
        public final long OooO0OO(long j, long j2) {
            return this.f40010OooO0oo.OooO0OO(j, j2);
        }

        @Override // p227o00oOo0O.Oooo000
        public final long OooO0Oo(long j, long j2) {
            o0O0O00.OooO00o oooO00o = this.f40010OooO0oo;
            if (oooO00o.f39962OooO0o != null) {
                return -9223372036854775807L;
            }
            long jOooO0O0 = oooO00o.OooO0O0(j, j2) + oooO00o.OooO0OO(j, j2);
            return (oooO00o.OooO0o0(jOooO0O0, j) + oooO00o.OooO0oO(jOooO0O0)) - oooO00o.f39960OooO;
        }

        @Override // p227o00oOo0O.Oooo000
        public final long OooO0o(long j, long j2) {
            return this.f40010OooO0oo.OooO0o(j, j2);
        }

        @Override // p227o00oOo0O.Oooo000
        public final o0OO00O OooO0o0(long j) {
            return this.f40010OooO0oo.OooO0oo(j, this);
        }

        @Override // p227o00oOo0O.Oooo000
        public final long OooO0oO(long j) {
            return this.f40010OooO0oo.OooO0Oo(j);
        }

        @Override // p227o00oOo0O.Oooo000
        public final boolean OooO0oo() {
            return this.f40010OooO0oo.OooO();
        }

        @Override // p227o00oOo0O.Oooo000
        public final long OooOO0(long j, long j2) {
            return this.f40010OooO0oo.OooO0O0(j, j2);
        }

        @Override // p228o00oOo0o.oo0o0Oo
        @Nullable
        public final String OooOO0O() {
            return null;
        }

        @Override // p228o00oOo0o.oo0o0Oo
        public final Oooo000 OooOO0o() {
            return this;
        }

        @Override // p228o00oOo0o.oo0o0Oo
        @Nullable
        public final o0OO00O OooOOO0() {
            return null;
        }
    }

    public static class OooO0O0 extends oo0o0Oo {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @Nullable
        public final o0OO00O f40011OooO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public final String f40012OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @Nullable
        public final o000000 f40013OooOO0;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(long j, OooOo oooOo, ImmutableList immutableList, o0O0O00.OooO oooO, @Nullable ArrayList arrayList, List list, List list2) {
            super(oooOo, immutableList, oooO, arrayList, list, list2);
            Uri.parse(((o00Oo0) immutableList.get(0)).f39935OooO00o);
            long j2 = oooO.f39959OooO0o0;
            o0OO00O o0oo00o2 = j2 <= 0 ? null : new o0OO00O(oooO.f39958OooO0Oo, j2, null);
            this.f40011OooO = o0oo00o2;
            this.f40012OooO0oo = null;
            this.f40013OooOO0 = o0oo00o2 == null ? new o000000(new o0OO00O(0L, -1L, null)) : null;
        }

        @Override // p228o00oOo0o.oo0o0Oo
        @Nullable
        public final String OooOO0O() {
            return this.f40012OooO0oo;
        }

        @Override // p228o00oOo0o.oo0o0Oo
        @Nullable
        public final Oooo000 OooOO0o() {
            return this.f40013OooOO0;
        }

        @Override // p228o00oOo0o.oo0o0Oo
        @Nullable
        public final o0OO00O OooOOO0() {
            return this.f40011OooO;
        }
    }

    public oo0o0Oo() {
        throw null;
    }

    public oo0o0Oo(OooOo oooOo, ImmutableList immutableList, o0O0O00 o0o0o00, ArrayList arrayList, List list, List list2) {
        o00O000o.OooO00o(!immutableList.isEmpty());
        this.f40003OooO00o = oooOo;
        this.f40004OooO0O0 = ImmutableList.OooOO0O(immutableList);
        this.f40006OooO0Oo = Collections.unmodifiableList(arrayList);
        this.f40008OooO0o0 = list;
        this.f40007OooO0o = list2;
        this.f40009OooO0oO = o0o0o00.OooO00o(this);
        this.f40005OooO0OO = o0O00.Oooo0oo(o0o0o00.f39957OooO0OO, AnimationKt.MillisToNanos, o0o0o00.f39956OooO0O0);
    }

    @Nullable
    public abstract String OooOO0O();

    @Nullable
    public abstract Oooo000 OooOO0o();

    @Nullable
    public abstract o0OO00O OooOOO0();
}
