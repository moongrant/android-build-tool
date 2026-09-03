package p296o0O0OoO0;

import androidx.annotation.Nullable;
import com.android.billingclient.api.o0OO00O;

/* JADX INFO: loaded from: classes2.dex */
public interface oo0o0Oo {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0O0O00 f35941OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o0O0O00 f35942OooO0O0;

        public OooO00o(o0O0O00 o0o0o00, o0O0O00 o0o0o01) {
            this.f35941OooO00o = o0o0o00;
            this.f35942OooO0O0 = o0o0o01;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OooO00o.class != obj.getClass()) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f35941OooO00o.equals(oooO00o.f35941OooO00o) && this.f35942OooO0O0.equals(oooO00o.f35942OooO0O0);
        }

        public final int hashCode() {
            return this.f35942OooO0O0.hashCode() + (this.f35941OooO00o.hashCode() * 31);
        }

        public final String toString() {
            String string;
            String strValueOf = String.valueOf(this.f35941OooO00o);
            if (this.f35941OooO00o.equals(this.f35942OooO0O0)) {
                string = "";
            } else {
                String strValueOf2 = String.valueOf(this.f35942OooO0O0);
                StringBuilder sb = new StringBuilder(strValueOf2.length() + 2);
                sb.append(", ");
                sb.append(strValueOf2);
                string = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder(o0OO00O.OooO00o(string, strValueOf.length() + 2));
            sb2.append("[");
            sb2.append(strValueOf);
            sb2.append(string);
            sb2.append("]");
            return sb2.toString();
        }
    }

    public static class OooO0O0 implements oo0o0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f35943OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO00o f35944OooO0O0;

        public OooO0O0(long j) {
            this(j, 0L);
        }

        @Override // p296o0O0OoO0.oo0o0Oo
        public final boolean OooO0O0() {
            return false;
        }

        @Override // p296o0O0OoO0.oo0o0Oo
        public final OooO00o OooO0oO(long j) {
            return this.f35944OooO0O0;
        }

        @Override // p296o0O0OoO0.oo0o0Oo
        public final long OooO0oo() {
            return this.f35943OooO00o;
        }

        public OooO0O0(long j, long j2) {
            this.f35943OooO00o = j;
            o0O0O00 o0o0o00 = j2 == 0 ? o0O0O00.f35926OooO0OO : new o0O0O00(0L, j2);
            this.f35944OooO0O0 = new OooO00o(o0o0o00, o0o0o00);
        }
    }

    boolean OooO0O0();

    OooO00o OooO0oO(long j);

    long OooO0oo();
}
