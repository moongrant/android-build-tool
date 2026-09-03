package p045Oooooo;

import android.view.Surface;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.o00000OO;
import com.google.firebase.messaging.o0ooOOo;
import o0O0o0.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1953OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1954OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1955OooO0o0;

    public /* synthetic */ o000O0(int i, Object obj, Object obj2) {
        this.f1953OooO0Oo = i;
        this.f1955OooO0o0 = obj;
        this.f1954OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1953OooO0Oo;
        Object obj = this.f1954OooO0o;
        Object obj2 = this.f1955OooO0o0;
        switch (i) {
            case 0:
                ((o00O0O.OooO0OO.OooO00o) obj2).OooO00o((Surface) obj);
                break;
            default:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) obj2;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                o00000OO o00000oo2 = FirebaseMessaging.f19763OooOOO0;
                firebaseMessaging.getClass();
                try {
                    OooO00o oooO00o = firebaseMessaging.f19767OooO0O0;
                    o0ooOOo.OooO0OO(firebaseMessaging.f19766OooO00o);
                    oooO00o.OooO00o();
                    taskCompletionSource.setResult(null);
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
                break;
        }
    }
}
