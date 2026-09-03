package p095o000o0o;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.Collections;
import p084o000Ooo0.o000oOoO;
import p085o000OooO.o0OOO0o;
import p089o000o00O.oo00o;
import p091o000o0O.o0Oo0oo;
import p091o000o0O.oo0o0Oo;
import p094o000o0Oo.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f35386OooO0Oo;

    public o00000(ConstraintTrackingWorker constraintTrackingWorker) {
        this.f35386OooO0Oo = constraintTrackingWorker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConstraintTrackingWorker constraintTrackingWorker = this.f35386OooO0Oo;
        Object obj = constraintTrackingWorker.f8373OooO0o0.f8394OooO0O0.f8388OooO00o.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        String str = obj instanceof String ? (String) obj : null;
        if (TextUtils.isEmpty(str)) {
            o000oOoO.OooO0OO().OooO0O0(ConstraintTrackingWorker.f8489OooOOO, "No worker to delegate to.", new Throwable[0]);
            constraintTrackingWorker.f8493OooOO0o.OooO0oo(new ListenableWorker.OooO00o.C0165OooO00o());
            return;
        }
        ListenableWorker listenableWorkerOooO00o = constraintTrackingWorker.f8373OooO0o0.f8398OooO0o0.OooO00o(constraintTrackingWorker.f8371OooO0Oo, str, constraintTrackingWorker.f8490OooO);
        constraintTrackingWorker.f8494OooOOO0 = listenableWorkerOooO00o;
        if (listenableWorkerOooO00o == null) {
            o000oOoO.OooO0OO().OooO00o(ConstraintTrackingWorker.f8489OooOOO, "No worker to delegate to.", new Throwable[0]);
            constraintTrackingWorker.f8493OooOO0o.OooO0oo(new ListenableWorker.OooO00o.C0165OooO00o());
            return;
        }
        o0Oo0oo o0oo0ooOooO0oo = ((oo0o0Oo) o0OOO0o.OooO0OO(constraintTrackingWorker.f8371OooO0Oo).f35160OooO0OO.OooOo00()).OooO0oo(constraintTrackingWorker.f8373OooO0o0.f8393OooO00o.toString());
        if (o0oo0ooOooO0oo == null) {
            constraintTrackingWorker.f8493OooOO0o.OooO0oo(new ListenableWorker.OooO00o.C0165OooO00o());
            return;
        }
        Context context = constraintTrackingWorker.f8371OooO0Oo;
        oo00o oo00oVar = new oo00o(context, o0OOO0o.OooO0OO(context).f35161OooO0Oo, constraintTrackingWorker);
        oo00oVar.OooO0OO(Collections.singletonList(o0oo0ooOooO0oo));
        if (!oo00oVar.OooO00o(constraintTrackingWorker.f8373OooO0o0.f8393OooO00o.toString())) {
            o000oOoO.OooO0OO().OooO00o(ConstraintTrackingWorker.f8489OooOOO, String.format("Constraints not met for delegate %s. Requesting retry.", str), new Throwable[0]);
            constraintTrackingWorker.f8493OooOO0o.OooO0oo(new ListenableWorker.OooO00o.OooO0O0());
            return;
        }
        o000oOoO.OooO0OO().OooO00o(ConstraintTrackingWorker.f8489OooOOO, String.format("Constraints met for delegate %s", str), new Throwable[0]);
        try {
            o0000O00 o0000o00OooO0o0 = constraintTrackingWorker.f8494OooOOO0.OooO0o0();
            o0000o00OooO0o0.OooO(new o00000O0(constraintTrackingWorker, o0000o00OooO0o0), constraintTrackingWorker.f8373OooO0o0.f8395OooO0OO);
        } catch (Throwable th) {
            o000oOoO o000ooooOooO0OO = o000oOoO.OooO0OO();
            String str2 = ConstraintTrackingWorker.f8489OooOOO;
            o000ooooOooO0OO.OooO00o(str2, String.format("Delegated worker %s threw exception in startWork.", str), th);
            synchronized (constraintTrackingWorker.f8491OooOO0) {
                if (constraintTrackingWorker.f8492OooOO0O) {
                    o000oOoO.OooO0OO().OooO00o(str2, "Constraints were unmet, Retrying.", new Throwable[0]);
                    constraintTrackingWorker.f8493OooOO0o.OooO0oo(new ListenableWorker.OooO00o.OooO0O0());
                } else {
                    constraintTrackingWorker.f8493OooOO0o.OooO0oo(new ListenableWorker.OooO00o.C0165OooO00o());
                }
            }
        }
    }
}
