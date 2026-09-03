package p313o0O0oOo;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000OOo implements SuccessContinuation {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000000 f42576OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o000000O f42577OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f42578OooO0o0 = true;

    public /* synthetic */ o000OOo(o000000 o000000Var, o000000O o000000o2) {
        this.f42576OooO0Oo = o000000Var;
        this.f42577OooO0o = o000000o2;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        o000000 o000000Var = this.f42576OooO0Oo;
        boolean z = this.f42578OooO0o0;
        o000000O o000000o2 = this.f42577OooO0o;
        if (z) {
            synchronized (o000000Var) {
                o000000Var.f42544OooO0OO = Tasks.forResult(o000000o2);
            }
        } else {
            o000000Var.getClass();
        }
        return Tasks.forResult(o000000o2);
    }
}
