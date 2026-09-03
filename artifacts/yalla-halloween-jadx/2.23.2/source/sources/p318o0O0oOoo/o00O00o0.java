package p318o0O0oOoo;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O00o0 implements SuccessContinuation {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo00o f41980OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o00O0 f41981OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f41982OooO0o0 = true;

    public /* synthetic */ o00O00o0(oo00o oo00oVar, o00O0 o00o1) {
        this.f41980OooO0Oo = oo00oVar;
        this.f41981OooO0o = o00o1;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        oo00o oo00oVar = this.f41980OooO0Oo;
        boolean z = this.f41982OooO0o0;
        o00O0 o00o1 = this.f41981OooO0o;
        if (z) {
            synchronized (oo00oVar) {
                oo00oVar.f42011OooO0OO = Tasks.forResult(o00o1);
            }
        } else {
            oo00oVar.getClass();
        }
        return Tasks.forResult(o00o1);
    }
}
