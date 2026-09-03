package androidx.recyclerview.widget;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public interface o00000OO {

    public static class OooO00o implements o00000OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public long f10832OooO00o = 0;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.o00000OO$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0180OooO00o implements OooO0o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final p190o00o0O.OooOOOO<Long> f10833OooO00o = new p190o00o0O.OooOOOO<>();

            public C0180OooO00o() {
            }

            @Override // androidx.recyclerview.widget.o00000OO.OooO0o
            public final long OooO00o(long j) {
                p190o00o0O.OooOOOO<Long> oooOOOO = this.f10833OooO00o;
                Long lValueOf = (Long) oooOOOO.OooO0oO(j, null);
                if (lValueOf == null) {
                    OooO00o oooO00o = OooO00o.this;
                    long j2 = oooO00o.f10832OooO00o;
                    oooO00o.f10832OooO00o = 1 + j2;
                    lValueOf = Long.valueOf(j2);
                    oooOOOO.OooO(j, lValueOf);
                }
                return lValueOf.longValue();
            }
        }

        @Override // androidx.recyclerview.widget.o00000OO
        @NonNull
        public final OooO0o OooO00o() {
            return new C0180OooO00o();
        }
    }

    public static class OooO0O0 implements o00000OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO00o f10835OooO00o = new OooO00o();

        public class OooO00o implements OooO0o {
            @Override // androidx.recyclerview.widget.o00000OO.OooO0o
            public final long OooO00o(long j) {
                return -1L;
            }
        }

        @Override // androidx.recyclerview.widget.o00000OO
        @NonNull
        public final OooO0o OooO00o() {
            return this.f10835OooO00o;
        }
    }

    public static class OooO0OO implements o00000OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO00o f10836OooO00o = new OooO00o();

        public class OooO00o implements OooO0o {
            @Override // androidx.recyclerview.widget.o00000OO.OooO0o
            public final long OooO00o(long j) {
                return j;
            }
        }

        @Override // androidx.recyclerview.widget.o00000OO
        @NonNull
        public final OooO0o OooO00o() {
            return this.f10836OooO00o;
        }
    }

    public interface OooO0o {
        long OooO00o(long j);
    }

    @NonNull
    OooO0o OooO00o();
}
