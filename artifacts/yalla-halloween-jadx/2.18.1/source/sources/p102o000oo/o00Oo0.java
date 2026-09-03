package p102o000oo;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public interface o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @SuppressLint({"SyntheticAccessor"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final OooO0O0.OooO0OO f29811OooO00o = new OooO0O0.OooO0OO(null);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @SuppressLint({"SyntheticAccessor"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final OooO0O0.C0324OooO0O0 f29812OooO0O0 = new OooO0O0.C0324OooO0O0();

    public static abstract class OooO0O0 {

        public static final class OooO00o extends OooO0O0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final Throwable f29813OooO00o;

            public OooO00o(@NonNull Throwable th) {
                this.f29813OooO00o = th;
            }

            @NonNull
            public final String toString() {
                return String.format("FAILURE (%s)", this.f29813OooO00o.getMessage());
            }
        }

        /* JADX INFO: renamed from: o000oo.o00Oo0$OooO0O0$OooO0O0, reason: collision with other inner class name */
        public static final class C0324OooO0O0 extends OooO0O0 {
            @NonNull
            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class OooO0OO extends OooO0O0 {
            public OooO0OO() {
            }

            @NonNull
            public final String toString() {
                return "SUCCESS";
            }

            public OooO0OO(OooO00o oooO00o) {
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public OooO0O0() {
        }
    }
}
