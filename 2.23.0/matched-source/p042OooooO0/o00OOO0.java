package p042OooooO0;

import androidx.camera.video.internal.audio.OooO0o;
import com.yalla.yalla.ui.activity.user.UserInfoTagActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00OOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1802OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1803OooO0o0;

    public /* synthetic */ o00OOO0(Object obj, int i) {
        this.f1802OooO0Oo = i;
        this.f1803OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1802OooO0Oo;
        Object obj = this.f1803OooO0o0;
        switch (i) {
            case 0:
                ((OooO0o) obj).OooO0OO();
                break;
            default:
                UserInfoTagActivity this$0 = (UserInfoTagActivity) obj;
                int i2 = UserInfoTagActivity.f27333Oooo0O0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f27350Oooo00o = true;
                break;
        }
    }
}
