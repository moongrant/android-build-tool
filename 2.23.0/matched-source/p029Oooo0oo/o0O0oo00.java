package p029Oooo0oo;

import androidx.camera.core.ImageCaptureException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.o0000O00;
import o000OO.OooOOO0;
import p031OoooO0.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0O0oo00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1280OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1281OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1282OooO0o0;

    public /* synthetic */ o0O0oo00(int i, Object obj, Object obj2) {
        this.f1280OooO0Oo = i;
        this.f1282OooO0o0 = obj;
        this.f1281OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1280OooO0Oo;
        Object obj = this.f1281OooO0o;
        Object obj2 = this.f1282OooO0o0;
        switch (i) {
            case 0:
                ImageCaptureException imageCaptureException = (ImageCaptureException) obj;
                o0OO00OO o0oo00oo2 = (o0OO00OO) ((o0OO000) obj2).f1289OooO0o;
                o0oo00oo2.getClass();
                o0Oo0oo.OooO00o();
                if (!o0oo00oo2.f1301OooO0oO) {
                    OooOOO0.OooO0o("onImageCaptured() must be called before onFinalResult()", o0oo00oo2.f1297OooO0OO.isDone());
                    o0oo00oo2.OooO00o();
                    o0Oo0oo.OooO00o();
                    o0oo0000 o0oo0000Var = o0oo00oo2.f1295OooO00o;
                    o0oo0000Var.OooO00o().execute(new o0OOo000(0, o0oo0000Var, imageCaptureException));
                    break;
                }
                break;
            default:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) obj2;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                o0000O00 o0000o00 = FirebaseMessaging.f20230OooOOO0;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.OooO00o());
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
                break;
        }
    }
}
