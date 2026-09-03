package p115o00O00oO;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
public interface oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @SuppressLint({"SyntheticAccessor"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final OooO00o.OooO0OO f36163OooO00o = new OooO00o.OooO0OO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @SuppressLint({"SyntheticAccessor"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final OooO00o.OooO0O0 f36164OooO0O0 = new OooO00o.OooO0O0();

    public static abstract class OooO00o {

        /* JADX INFO: renamed from: o00O00oO.oo0o0Oo$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0414OooO00o extends OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final Throwable f36165OooO00o;

            public C0414OooO00o(@NonNull Throwable th) {
                this.f36165OooO00o = th;
            }

            @NonNull
            public final String toString() {
                return "FAILURE (" + this.f36165OooO00o.getMessage() + ")";
            }
        }

        public static final class OooO0O0 extends OooO00o {
            @NonNull
            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class OooO0OO extends OooO00o {
            @NonNull
            public final String toString() {
                return "SUCCESS";
            }
        }
    }
}
