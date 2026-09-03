package p045Oooooo;

import android.view.Surface;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.o0000Ooo;
import com.google.firebase.messaging.o0OOO0o;
import o0O0o0.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1950OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1951OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1952OooO0o0;

    public /* synthetic */ o000O0(int i, Object obj, Object obj2) {
        this.f1950OooO0Oo = i;
        this.f1952OooO0o0 = obj;
        this.f1951OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1950OooO0Oo;
        Object obj = this.f1951OooO0o;
        Object obj2 = this.f1952OooO0o0;
        switch (i) {
            case 0:
                ((o00O0O.OooO0OO.OooO00o) obj2).OooO00o((Surface) obj);
                break;
            default:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) obj2;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                o0000Ooo o0000ooo = FirebaseMessaging.f19758OooOOO0;
                firebaseMessaging.getClass();
                try {
                    OooO00o oooO00o = firebaseMessaging.f19762OooO0O0;
                    o0OOO0o.OooO0OO(firebaseMessaging.f19761OooO00o);
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
