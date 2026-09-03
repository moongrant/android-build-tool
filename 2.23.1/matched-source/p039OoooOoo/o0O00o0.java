package p039OoooOoo;

import androidx.camera.video.OooOOOO;
import com.facebook.internal.FetchedAppGateKeepersManager;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0O00o0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1721OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1722OooO0o0;

    public /* synthetic */ o0O00o0(Object obj, int i) {
        this.f1721OooO0Oo = i;
        this.f1722OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1721OooO0Oo;
        Object obj = this.f1722OooO0o0;
        switch (i) {
            case 0:
                ((OooOOOO) obj).OooOOo0();
                break;
            default:
                ((FetchedAppGateKeepersManager.Callback) obj).onCompleted();
                break;
        }
    }
}
