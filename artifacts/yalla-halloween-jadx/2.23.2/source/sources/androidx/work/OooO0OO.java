package androidx.work;

import android.content.Context;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.OooOO0O;
import p115o00O00oO.o00O0O;
import p117o00O0OOo.o00000O;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final Context f11476OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile boolean f11477OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final WorkerParameters f11478OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f11479OooO0oO;

    public static abstract class OooO00o {

        /* JADX INFO: renamed from: androidx.work.OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final class C0185OooO00o extends OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final androidx.work.OooO0O0 f11480OooO00o = androidx.work.OooO0O0.f11473OooO0OO;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0185OooO00o.class != obj.getClass()) {
                    return false;
                }
                return this.f11480OooO00o.equals(((C0185OooO00o) obj).f11480OooO00o);
            }

            public final int hashCode() {
                return this.f11480OooO00o.hashCode() + (C0185OooO00o.class.getName().hashCode() * 31);
            }

            @NonNull
            public final String toString() {
                return "Failure {mOutputData=" + this.f11480OooO00o + '}';
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final class OooO0O0 extends OooO00o {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && OooO0O0.class == obj.getClass();
            }

            public final int hashCode() {
                return OooO0O0.class.getName().hashCode();
            }

            @NonNull
            public final String toString() {
                return "Retry";
            }
        }

        /* JADX INFO: renamed from: androidx.work.OooO0OO$OooO00o$OooO0OO, reason: collision with other inner class name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final class C0186OooO0OO extends OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final androidx.work.OooO0O0 f11481OooO00o;

            public C0186OooO0OO() {
                this(androidx.work.OooO0O0.f11473OooO0OO);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0186OooO0OO.class != obj.getClass()) {
                    return false;
                }
                return this.f11481OooO00o.equals(((C0186OooO0OO) obj).f11481OooO00o);
            }

            public final int hashCode() {
                return this.f11481OooO00o.hashCode() + (C0186OooO0OO.class.getName().hashCode() * 31);
            }

            @NonNull
            public final String toString() {
                return "Success {mOutputData=" + this.f11481OooO00o + '}';
            }

            public C0186OooO0OO(@NonNull androidx.work.OooO0O0 oooO0O0) {
                this.f11481OooO00o = oooO0O0;
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public OooO00o() {
        }
    }

    public OooO0OO(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f11476OooO0Oo = context;
        this.f11478OooO0o0 = workerParameters;
    }

    @NonNull
    public OooOO0O<o00O0O> OooO00o() {
        o00000O o00000o = new o00000O();
        o00000o.OooOO0(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return o00000o;
    }

    public void OooO0O0() {
    }

    @NonNull
    @MainThread
    public abstract o00000O OooO0Oo();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooO0o0() {
        this.f11477OooO0o = true;
        OooO0O0();
    }
}
