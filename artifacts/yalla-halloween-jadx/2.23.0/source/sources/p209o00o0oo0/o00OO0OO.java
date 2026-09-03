package p209o00o0oo0;

import androidx.annotation.Nullable;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface o00OO0OO {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final oo0O f39549OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final oo0O f39550OooO0O0;

        public OooO00o() {
            throw null;
        }

        public OooO00o(oo0O oo0o, oo0O oo0o2) {
            this.f39549OooO00o = oo0o;
            this.f39550OooO0O0 = oo0o2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OooO00o.class != obj.getClass()) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f39549OooO00o.equals(oooO00o.f39549OooO00o) && this.f39550OooO0O0.equals(oooO00o.f39550OooO0O0);
        }

        public final int hashCode() {
            return this.f39550OooO0O0.hashCode() + (this.f39549OooO00o.hashCode() * 31);
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("[");
            oo0O oo0o = this.f39549OooO00o;
            sb.append(oo0o);
            oo0O oo0o2 = this.f39550OooO0O0;
            if (oo0o.equals(oo0o2)) {
                str = "";
            } else {
                str = ", " + oo0o2;
            }
            return o0O00o0.OooO0O0(sb, str, "]");
        }
    }

    public static class OooO0O0 implements o00OO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f39551OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO00o f39552OooO0O0;

        public OooO0O0(long j) {
            this(j, 0L);
        }

        @Override // p209o00o0oo0.o00OO0OO
        public final long OooO() {
            return this.f39551OooO00o;
        }

        @Override // p209o00o0oo0.o00OO0OO
        public final OooO00o OooO0OO(long j) {
            return this.f39552OooO0O0;
        }

        @Override // p209o00o0oo0.o00OO0OO
        public final boolean OooO0o() {
            return false;
        }

        public OooO0O0(long j, long j2) {
            this.f39551OooO00o = j;
            oo0O oo0o = j2 == 0 ? oo0O.f39574OooO0OO : new oo0O(0L, j2);
            this.f39552OooO0O0 = new OooO00o(oo0o, oo0o);
        }
    }

    long OooO();

    OooO00o OooO0OO(long j);

    boolean OooO0o();
}
