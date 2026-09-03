package p029Oooo0oo;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0OOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1316OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1317OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1318OooO0o0;

    public /* synthetic */ o0OOO0(int i, Object obj, Object obj2) {
        this.f1316OooO0Oo = i;
        this.f1318OooO0o0 = obj;
        this.f1317OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1316OooO0Oo;
        Object obj = this.f1317OooO0o;
        Object obj2 = this.f1318OooO0o0;
        switch (i) {
            case 0:
                ((o0OOOO0o) obj2).f1328OooO0o0.remove((o0OO00OO) obj);
                break;
            default:
                o0Oo0oo o0oo0oo2 = (o0Oo0oo) obj2;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                o0oo0oo2.getClass();
                try {
                    taskCompletionSource.setResult(o0oo0oo2.OooO00o());
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
                break;
        }
    }
}
