package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.OooO0OO;
import java.util.Collections;
import java.util.List;
import o00O0000.o00Oo0;
import p102o000oo.o0OoOo0;
import p107o000ooO0.o00oO0o;
import p109o000ooo.o00000OO;
import p109o000ooo.o0000Ooo;
import p236o00oOoo.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ConstraintTrackingWorker extends ListenableWorker implements o00000OO {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public static final String f9850OoooOOO = o0OoOo0.OooO0o0("ConstraintTrkngWrkr");

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public volatile boolean f9851OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public WorkerParameters f9852OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final Object f9853OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public o00OOOO0<ListenableWorker.OooO00o> f9854OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @Nullable
    public ListenableWorker f9855o000oOoO;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
        @Override // java.lang.Runnable
        public final void run() {
            ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
            Object obj = constraintTrackingWorker.f9728Oooo0oO.f9749OooO0O0.f9743OooO00o.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            String str = obj instanceof String ? (String) obj : null;
            if (TextUtils.isEmpty(str)) {
                o0OoOo0.OooO0OO().OooO0O0(ConstraintTrackingWorker.f9850OoooOOO, "No worker to delegate to.", new Throwable[0]);
                constraintTrackingWorker.OooO0oo();
                return;
            }
            ListenableWorker listenableWorkerOooO00o = constraintTrackingWorker.f9728Oooo0oO.f9753OooO0o0.OooO00o(constraintTrackingWorker.f9727Oooo0o, str, constraintTrackingWorker.f9852OoooO0);
            constraintTrackingWorker.f9855o000oOoO = listenableWorkerOooO00o;
            if (listenableWorkerOooO00o == null) {
                o0OoOo0.OooO0OO().OooO00o(ConstraintTrackingWorker.f9850OoooOOO, "No worker to delegate to.", new Throwable[0]);
                constraintTrackingWorker.OooO0oo();
                return;
            }
            o00O0000.o0OoOo0 o0oooo0OooO0oo = ((o00Oo0) o00oO0o.OooO0O0(constraintTrackingWorker.f9727Oooo0o).f29976OooO0OO.OooOo0O()).OooO0oo(constraintTrackingWorker.f9728Oooo0oO.f9748OooO00o.toString());
            if (o0oooo0OooO0oo == null) {
                constraintTrackingWorker.OooO0oo();
                return;
            }
            Context context = constraintTrackingWorker.f9727Oooo0o;
            o0000Ooo o0000ooo = new o0000Ooo(context, o00oO0o.OooO0O0(context).f29977OooO0Oo, constraintTrackingWorker);
            o0000ooo.OooO0O0(Collections.singletonList(o0oooo0OooO0oo));
            if (!o0000ooo.OooO00o(constraintTrackingWorker.f9728Oooo0oO.f9748OooO00o.toString())) {
                o0OoOo0.OooO0OO().OooO00o(ConstraintTrackingWorker.f9850OoooOOO, String.format("Constraints not met for delegate %s. Requesting retry.", str), new Throwable[0]);
                constraintTrackingWorker.OooO();
                return;
            }
            o0OoOo0.OooO0OO().OooO00o(ConstraintTrackingWorker.f9850OoooOOO, String.format("Constraints met for delegate %s", str), new Throwable[0]);
            try {
                OooO0OO<ListenableWorker.OooO00o> oooO0OOOooO0o0 = constraintTrackingWorker.f9855o000oOoO.OooO0o0();
                oooO0OOOooO0o0.OooO00o(new o00O000o.OooO00o(constraintTrackingWorker, oooO0OOOooO0o0), constraintTrackingWorker.f9728Oooo0oO.f9750OooO0OO);
            } catch (Throwable th) {
                o0OoOo0 o0oooo0OooO0OO = o0OoOo0.OooO0OO();
                String str2 = ConstraintTrackingWorker.f9850OoooOOO;
                o0oooo0OooO0OO.OooO00o(str2, String.format("Delegated worker %s threw exception in startWork.", str), th);
                synchronized (constraintTrackingWorker.f9853OoooO0O) {
                    if (constraintTrackingWorker.f9851OoooO) {
                        o0OoOo0.OooO0OO().OooO00o(str2, "Constraints were unmet, Retrying.", new Throwable[0]);
                        constraintTrackingWorker.OooO();
                    } else {
                        constraintTrackingWorker.OooO0oo();
                    }
                }
            }
        }
    }

    public ConstraintTrackingWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f9852OoooO0 = workerParameters;
        this.f9853OoooO0O = new Object();
        this.f9851OoooO = false;
        this.f9854OoooOO0 = new o00OOOO0<>();
    }

    public final void OooO() {
        this.f9854OoooOO0.OooOO0(new ListenableWorker.OooO00o.OooO0O0());
    }

    @Override // p109o000ooo.o00000OO
    public final void OooO0O0(@NonNull List<String> list) {
        o0OoOo0.OooO0OO().OooO00o(f9850OoooOOO, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.f9853OoooO0O) {
            this.f9851OoooO = true;
        }
    }

    @Override // androidx.work.ListenableWorker
    public final boolean OooO0OO() {
        ListenableWorker listenableWorker = this.f9855o000oOoO;
        return listenableWorker != null && listenableWorker.OooO0OO();
    }

    @Override // androidx.work.ListenableWorker
    public final void OooO0Oo() {
        ListenableWorker listenableWorker = this.f9855o000oOoO;
        if (listenableWorker == null || listenableWorker.f9729Oooo0oo) {
            return;
        }
        this.f9855o000oOoO.OooO0oO();
    }

    @Override // p109o000ooo.o00000OO
    public final void OooO0o(@NonNull List<String> list) {
    }

    @Override // androidx.work.ListenableWorker
    @NonNull
    public final OooO0OO<ListenableWorker.OooO00o> OooO0o0() {
        this.f9728Oooo0oO.f9750OooO0OO.execute(new OooO00o());
        return this.f9854OoooOO0;
    }

    public final void OooO0oo() {
        this.f9854OoooOO0.OooOO0(new ListenableWorker.OooO00o.C0067OooO00o());
    }
}
