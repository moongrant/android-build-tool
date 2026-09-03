package androidx.recyclerview.widget;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface o00000O {

    public static class OooO00o implements o00000O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public long f7763OooO00o = 0;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.o00000O$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0161OooO00o implements OooO0o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final p188o00o0O.OooOo00<Long> f7764OooO00o = new p188o00o0O.OooOo00<>();

            public C0161OooO00o() {
            }

            @Override // androidx.recyclerview.widget.o00000O.OooO0o
            public final long OooO00o(long j) {
                p188o00o0O.OooOo00<Long> oooOo00 = this.f7764OooO00o;
                Long lValueOf = (Long) oooOo00.OooO0oO(j, null);
                if (lValueOf == null) {
                    OooO00o oooO00o = OooO00o.this;
                    long j2 = oooO00o.f7763OooO00o;
                    oooO00o.f7763OooO00o = 1 + j2;
                    lValueOf = Long.valueOf(j2);
                    oooOo00.OooO(j, lValueOf);
                }
                return lValueOf.longValue();
            }
        }

        @Override // androidx.recyclerview.widget.o00000O
        @NonNull
        public final OooO0o OooO00o() {
            return new C0161OooO00o();
        }
    }

    public static class OooO0O0 implements o00000O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO00o f7766OooO00o = new OooO00o();

        public class OooO00o implements OooO0o {
            @Override // androidx.recyclerview.widget.o00000O.OooO0o
            public final long OooO00o(long j) {
                return -1L;
            }
        }

        @Override // androidx.recyclerview.widget.o00000O
        @NonNull
        public final OooO0o OooO00o() {
            return this.f7766OooO00o;
        }
    }

    public static class OooO0OO implements o00000O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO00o f7767OooO00o = new OooO00o();

        public class OooO00o implements OooO0o {
            @Override // androidx.recyclerview.widget.o00000O.OooO0o
            public final long OooO00o(long j) {
                return j;
            }
        }

        @Override // androidx.recyclerview.widget.o00000O
        @NonNull
        public final OooO0o OooO00o() {
            return this.f7767OooO00o;
        }
    }

    public interface OooO0o {
        long OooO00o(long j);
    }

    @NonNull
    OooO0o OooO00o();
}
