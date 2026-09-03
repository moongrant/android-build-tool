package androidx.activity;

import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.ui.view.moment.SendMomentLocationPowerView;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import kotlin.jvm.internal.Intrinsics;
import p566o0oOo00O.o00OO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Oooo000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f2192OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f2193OooO0o0;

    public /* synthetic */ Oooo000(Object obj, int i) {
        this.f2192OooO0Oo = i;
        this.f2193OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2192OooO0Oo;
        Object obj = this.f2193OooO0o0;
        switch (i) {
            case 1:
                androidx.work.impl.background.systemalarm.OooO0OO.OooO0O0((androidx.work.impl.background.systemalarm.OooO0OO) obj);
                break;
            default:
                SendMomentLocationPowerView this$0 = (SendMomentLocationPowerView) obj;
                int i2 = SendMomentLocationPowerView.f30665OooOOOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                p597o0oo00O.OooOOOO.OooO0O0("onReLocation : isOpenLocation = " + this$0.f30675OooOOO);
                this$0.f30677OooOOOO = true;
                FragmentActivity fragmentActivity = this$0.f30668OooO0o;
                if (fragmentActivity == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("activity");
                    fragmentActivity = null;
                }
                com.yalla.yalla.util.permission.OooO00o.OooO0OO(fragmentActivity, PermissionGroupReveal.f32343OooO0OO, null, new o00OO(this$0));
                break;
        }
    }
}
