package androidx.work.impl.workers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.List;
import p084o000Ooo0.o000oOoO;
import p089o000o00O.o00O00o0;
import p094o000o0Oo.o0000O00;
import p095o000o0o.o00000;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ConstraintTrackingWorker extends ListenableWorker implements o00O00o0 {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final String f8489OooOOO = o000oOoO.OooO0o0("ConstraintTrkngWrkr");

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final WorkerParameters f8490OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Object f8491OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public volatile boolean f8492OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final o0000O00<ListenableWorker.OooO00o> f8493OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public ListenableWorker f8494OooOOO0;

    public ConstraintTrackingWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f8490OooO = workerParameters;
        this.f8491OooOO0 = new Object();
        this.f8492OooOO0O = false;
        this.f8493OooOO0o = new o0000O00<>();
    }

    @Override // p089o000o00O.o00O00o0
    public final void OooO0O0(@NonNull ArrayList arrayList) {
        o000oOoO.OooO0OO().OooO00o(f8489OooOOO, String.format("Constraints changed for %s", arrayList), new Throwable[0]);
        synchronized (this.f8491OooOO0) {
            this.f8492OooOO0O = true;
        }
    }

    @Override // androidx.work.ListenableWorker
    public final boolean OooO0OO() {
        ListenableWorker listenableWorker = this.f8494OooOOO0;
        return listenableWorker != null && listenableWorker.OooO0OO();
    }

    @Override // androidx.work.ListenableWorker
    public final void OooO0Oo() {
        ListenableWorker listenableWorker = this.f8494OooOOO0;
        if (listenableWorker == null || listenableWorker.f8372OooO0o) {
            return;
        }
        this.f8494OooOOO0.OooO0oO();
    }

    @Override // p089o000o00O.o00O00o0
    public final void OooO0o(@NonNull List<String> list) {
    }

    @Override // androidx.work.ListenableWorker
    @NonNull
    public final o0000O00 OooO0o0() {
        this.f8373OooO0o0.f8395OooO0OO.execute(new o00000(this));
        return this.f8493OooOO0o;
    }
}
