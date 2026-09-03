package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import p084o000Ooo0.OooOOO0;
import p094o000o0Oo.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ListenableWorker {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final Context f8371OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile boolean f8372OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final WorkerParameters f8373OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f8374OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f8375OooO0oo;

    public static abstract class OooO00o {

        /* JADX INFO: renamed from: androidx.work.ListenableWorker$OooO00o$OooO00o, reason: collision with other inner class name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final class C0165OooO00o extends OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final androidx.work.OooO0O0 f8376OooO00o = androidx.work.OooO0O0.f8387OooO0OO;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0165OooO00o.class != obj.getClass()) {
                    return false;
                }
                return this.f8376OooO00o.equals(((C0165OooO00o) obj).f8376OooO00o);
            }

            public final int hashCode() {
                return this.f8376OooO00o.hashCode() + (C0165OooO00o.class.getName().hashCode() * 31);
            }

            public final String toString() {
                return "Failure {mOutputData=" + this.f8376OooO00o + '}';
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

            public final String toString() {
                return "Retry";
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final class OooO0OO extends OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final androidx.work.OooO0O0 f8377OooO00o;

            public OooO0OO() {
                this(androidx.work.OooO0O0.f8387OooO0OO);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || OooO0OO.class != obj.getClass()) {
                    return false;
                }
                return this.f8377OooO00o.equals(((OooO0OO) obj).f8377OooO00o);
            }

            public final int hashCode() {
                return this.f8377OooO00o.hashCode() + (OooO0OO.class.getName().hashCode() * 31);
            }

            public final String toString() {
                return "Success {mOutputData=" + this.f8377OooO00o + '}';
            }

            public OooO0OO(@NonNull androidx.work.OooO0O0 oooO0O0) {
                this.f8377OooO00o = oooO0O0;
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public OooO00o() {
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f8371OooO0Oo = context;
        this.f8373OooO0o0 = workerParameters;
    }

    @NonNull
    public com.google.common.util.concurrent.OooO00o<OooOOO0> OooO00o() {
        o0000O00 o0000o00 = new o0000O00();
        o0000o00.OooOO0(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return o0000o00;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean OooO0OO() {
        return this.f8375OooO0oo;
    }

    public void OooO0Oo() {
    }

    @NonNull
    @MainThread
    public abstract o0000O00 OooO0o0();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooO0oO() {
        this.f8372OooO0o = true;
        OooO0Oo();
    }
}
