package o000OOoO;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public interface o000000 {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000000O f34697OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o000000O f34698OooO0O0;

        public OooO00o() {
            throw null;
        }

        public OooO00o(o000000O o000000o2, o000000O o000000o3) {
            this.f34697OooO00o = o000000o2;
            this.f34698OooO0O0 = o000000o3;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OooO00o.class != obj.getClass()) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f34697OooO00o.equals(oooO00o.f34697OooO00o) && this.f34698OooO0O0.equals(oooO00o.f34698OooO0O0);
        }

        public final int hashCode() {
            return this.f34698OooO0O0.hashCode() + (this.f34697OooO00o.hashCode() * 31);
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("[");
            o000000O o000000o2 = this.f34697OooO00o;
            sb.append(o000000o2);
            o000000O o000000o3 = this.f34698OooO0O0;
            if (o000000o2.equals(o000000o3)) {
                str = "";
            } else {
                str = ", " + o000000o3;
            }
            return o0oOO.OooO0O0(sb, str, "]");
        }
    }

    public static class OooO0O0 implements o000000 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f34699OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO00o f34700OooO0O0;

        public OooO0O0(long j) {
            this(j, 0L);
        }

        @Override // o000OOoO.o000000
        public final long OooO() {
            return this.f34699OooO00o;
        }

        @Override // o000OOoO.o000000
        public final OooO00o OooO0Oo(long j) {
            return this.f34700OooO0O0;
        }

        @Override // o000OOoO.o000000
        public final boolean OooO0oO() {
            return false;
        }

        public OooO0O0(long j, long j2) {
            this.f34699OooO00o = j;
            o000000O o000000o2 = j2 == 0 ? o000000O.f34701OooO0OO : new o000000O(0L, j2);
            this.f34700OooO0O0 = new OooO00o(o000000o2, o000000o2);
        }
    }

    long OooO();

    OooO00o OooO0Oo(long j);

    boolean OooO0oO();
}
