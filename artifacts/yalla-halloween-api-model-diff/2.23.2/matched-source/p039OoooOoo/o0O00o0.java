package p039OoooOoo;

import androidx.camera.video.OooOOOO;
import com.facebook.internal.FetchedAppGateKeepersManager;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0O00o0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1718OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1719OooO0o0;

    public /* synthetic */ o0O00o0(Object obj, int i) {
        this.f1718OooO0Oo = i;
        this.f1719OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1718OooO0Oo;
        Object obj = this.f1719OooO0o0;
        switch (i) {
            case 0:
                ((OooOOOO) obj).OooOOo0();
                break;
            case 1:
                ((FetchedAppGateKeepersManager.Callback) obj).onCompleted();
                break;
            default:
                UserInfoEditActivity this$0 = (UserInfoEditActivity) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoo();
                this$0.OooOoO().f45657OooO0O0.requestLayout();
                break;
        }
    }
}
