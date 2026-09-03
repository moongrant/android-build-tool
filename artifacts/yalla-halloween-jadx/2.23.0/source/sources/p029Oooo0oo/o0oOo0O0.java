package p029Oooo0oo;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.camera.core.ImageCapture;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.o0000O00;
import com.google.firebase.messaging.o0O0O00;
import com.google.firebase.messaging.o0OOO0o;
import o000OO.OooOOO0;
import p031OoooO0.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0oOo0O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1348OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1349OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1350OooO0o0;

    public /* synthetic */ o0oOo0O0(int i, Object obj, Object obj2) {
        this.f1348OooO0Oo = i;
        this.f1350OooO0o0 = obj;
        this.f1349OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1348OooO0Oo) {
            case 0:
                o0OO000 o0oo000 = (o0OO000) this.f1350OooO0o0;
                ImageCapture.OooOOO0 oooOOO0 = (ImageCapture.OooOOO0) this.f1349OooO0o;
                o0OO00OO o0oo00oo2 = (o0OO00OO) o0oo000.f1289OooO0o;
                o0oo00oo2.getClass();
                o0Oo0oo.OooO00o();
                if (o0oo00oo2.f1301OooO0oO) {
                    return;
                }
                OooOOO0.OooO0o("onImageCaptured() must be called before onFinalResult()", o0oo00oo2.f1297OooO0OO.isDone());
                o0oo00oo2.OooO00o();
                o0oo0000 o0oo0000Var = o0oo00oo2.f1295OooO00o;
                o0oo0000Var.OooO00o().execute(new o0o0000(0, o0oo0000Var, oooOOO0));
                return;
            default:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f1350OooO0o0;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f1349OooO0o;
                o0000O00 o0000o00 = FirebaseMessaging.f20230OooOOO0;
                firebaseMessaging.getClass();
                try {
                    o0OOO0o o0ooo0o2 = firebaseMessaging.f20238OooO0o0;
                    o0ooo0o2.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("delete", "1");
                    Tasks.await(o0ooo0o2.OooO00o(o0ooo0o2.OooO0OO(bundle, o0O0O00.OooO0OO(o0ooo0o2.f20376OooO00o), "*")));
                    o0000O00 o0000o00OooO0Oo = FirebaseMessaging.OooO0Oo(firebaseMessaging.f20236OooO0Oo);
                    String strOooO0o0 = firebaseMessaging.OooO0o0();
                    String strOooO0OO = o0O0O00.OooO0OO(firebaseMessaging.f20233OooO00o);
                    synchronized (o0000o00OooO0Oo) {
                        String strOooO00o = o0000O00.OooO00o(strOooO0o0, strOooO0OO);
                        SharedPreferences.Editor editorEdit = o0000o00OooO0Oo.f20318OooO00o.edit();
                        editorEdit.remove(strOooO00o);
                        editorEdit.commit();
                    }
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
        }
    }
}
