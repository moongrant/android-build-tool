package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.OooO0OO;
import p102o000oo.OooOOO;
import p236o00oOoo.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
public abstract class ListenableWorker {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f9726Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NonNull
    public Context f9727Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NonNull
    public WorkerParameters f9728Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public volatile boolean f9729Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f9730OoooO00;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f9727Oooo0o = context;
        this.f9728Oooo0oO = workerParameters;
    }

    @NonNull
    public OooO0OO<OooOOO> OooO00o() {
        o00OOOO0 o00oooo1 = new o00OOOO0();
        o00oooo1.OooOO0O(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return o00oooo1;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean OooO0OO() {
        return this.f9730OoooO00;
    }

    public void OooO0Oo() {
    }

    @NonNull
    @MainThread
    public abstract OooO0OO<OooO00o> OooO0o0();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooO0oO() {
        this.f9729Oooo0oo = true;
        OooO0Oo();
    }

    public static abstract class OooO00o {

        /* JADX INFO: renamed from: androidx.work.ListenableWorker$OooO00o$OooO00o, reason: collision with other inner class name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final class C0067OooO00o extends OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final androidx.work.OooO0O0 f9731OooO00o = androidx.work.OooO0O0.f9742OooO0OO;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0067OooO00o.class != obj.getClass()) {
                    return false;
                }
                return this.f9731OooO00o.equals(((C0067OooO00o) obj).f9731OooO00o);
            }

            public final int hashCode() {
                return this.f9731OooO00o.hashCode() + (C0067OooO00o.class.getName().hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Failure {mOutputData=");
                sbOooO0o0.append(this.f9731OooO00o);
                sbOooO0o0.append('}');
                return sbOooO0o0.toString();
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
        public OooO00o() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final class OooO0OO extends OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final androidx.work.OooO0O0 f9732OooO00o;

            public OooO0OO() {
                this.f9732OooO00o = androidx.work.OooO0O0.f9742OooO0OO;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || OooO0OO.class != obj.getClass()) {
                    return false;
                }
                return this.f9732OooO00o.equals(((OooO0OO) obj).f9732OooO00o);
            }

            public final int hashCode() {
                return this.f9732OooO00o.hashCode() + (OooO0OO.class.getName().hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Success {mOutputData=");
                sbOooO0o0.append(this.f9732OooO00o);
                sbOooO0o0.append('}');
                return sbOooO0o0.toString();
            }

            public OooO0OO(@NonNull androidx.work.OooO0O0 oooO0O0) {
                this.f9732OooO00o = oooO0O0;
            }
        }
    }
}
