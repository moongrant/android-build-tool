package androidx.recyclerview.widget;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface o00000O {

    public static class OooO00o implements o00000O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public long f9145OooO00o = 0;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.o00000O$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0063OooO00o implements OooO0o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final p021OooOooo.o00Ooo<Long> f9146OooO00o = new p021OooOooo.o00Ooo<>();

            public C0063OooO00o() {
            }

            @Override // androidx.recyclerview.widget.o00000O.OooO0o
            public final long OooO00o(long j) {
                Long lOooO = this.f9146OooO00o.OooO(j, null);
                if (lOooO == null) {
                    OooO00o oooO00o = OooO00o.this;
                    long j2 = oooO00o.f9145OooO00o;
                    oooO00o.f9145OooO00o = 1 + j2;
                    lOooO = Long.valueOf(j2);
                    this.f9146OooO00o.OooOO0o(j, lOooO);
                }
                return lOooO.longValue();
            }
        }

        @Override // androidx.recyclerview.widget.o00000O
        @NonNull
        public final OooO0o OooO00o() {
            return new C0063OooO00o();
        }
    }

    public static class OooO0O0 implements o00000O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO00o f9148OooO00o = new OooO00o();

        public class OooO00o implements OooO0o {
            @Override // androidx.recyclerview.widget.o00000O.OooO0o
            public final long OooO00o(long j) {
                return -1L;
            }
        }

        @Override // androidx.recyclerview.widget.o00000O
        @NonNull
        public final OooO0o OooO00o() {
            return this.f9148OooO00o;
        }
    }

    public static class OooO0OO implements o00000O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO00o f9149OooO00o = new OooO00o();

        public class OooO00o implements OooO0o {
            @Override // androidx.recyclerview.widget.o00000O.OooO0o
            public final long OooO00o(long j) {
                return j;
            }
        }

        @Override // androidx.recyclerview.widget.o00000O
        @NonNull
        public final OooO0o OooO00o() {
            return this.f9149OooO00o;
        }
    }

    public interface OooO0o {
        long OooO00o(long j);
    }

    @NonNull
    OooO0o OooO00o();
}
