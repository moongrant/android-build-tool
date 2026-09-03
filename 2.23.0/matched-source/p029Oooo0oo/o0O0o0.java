package p029Oooo0oo;

import androidx.camera.core.OooOOO0;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.o0000O00;
import com.google.firebase.messaging.o0O0O00;
import o0O0o00O.OooO00o;
import p031OoooO0.o0Oo0oo;
import p045Oooooo.o0000Ooo;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0O0o0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1273OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1274OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1275OooO0o0;

    public /* synthetic */ o0O0o0(int i, Object obj, Object obj2) {
        this.f1273OooO0Oo = i;
        this.f1275OooO0o0 = obj;
        this.f1274OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1273OooO0Oo;
        Object obj = this.f1274OooO0o;
        Object obj2 = this.f1275OooO0o0;
        switch (i) {
            case 0:
                OooOOO0 oooOOO0 = (OooOOO0) obj;
                o0OO00OO o0oo00oo2 = (o0OO00OO) ((o0OO000) obj2).f1289OooO0o;
                o0oo00oo2.getClass();
                o0Oo0oo.OooO00o();
                if (!o0oo00oo2.f1301OooO0oO) {
                    o000OO.OooOOO0.OooO0o("onImageCaptured() must be called before onFinalResult()", o0oo00oo2.f1297OooO0OO.isDone());
                    o0oo00oo2.OooO00o();
                    o0oo0000 o0oo0000Var = o0oo00oo2.f1295OooO00o;
                    o0oo0000Var.OooO00o().execute(new oO0Oo(0, o0oo0000Var, oooOOO0));
                    break;
                }
                break;
            case 1:
                ((o0000Ooo) obj2).f1908OooOO0o.remove((o00O000.OooO00o) obj);
                break;
            default:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) obj2;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                o0000O00 o0000o00 = FirebaseMessaging.f20230OooOOO0;
                firebaseMessaging.getClass();
                try {
                    OooO00o oooO00o = firebaseMessaging.f20234OooO0O0;
                    o0O0O00.OooO0OO(firebaseMessaging.f20233OooO00o);
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
