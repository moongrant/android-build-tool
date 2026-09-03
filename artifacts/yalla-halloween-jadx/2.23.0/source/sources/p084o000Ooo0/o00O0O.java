package p084o000Ooo0;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
public interface o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @SuppressLint({"SyntheticAccessor"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final OooO00o.OooO0OO f35111OooO00o = new OooO00o.OooO0OO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @SuppressLint({"SyntheticAccessor"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final OooO00o.OooO0O0 f35112OooO0O0 = new OooO00o.OooO0O0();

    public static abstract class OooO00o {

        /* JADX INFO: renamed from: o000Ooo0.o00O0O$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0411OooO00o extends OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final Throwable f35113OooO00o;

            public C0411OooO00o(@NonNull Throwable th) {
                this.f35113OooO00o = th;
            }

            @NonNull
            public final String toString() {
                return String.format("FAILURE (%s)", this.f35113OooO00o.getMessage());
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
