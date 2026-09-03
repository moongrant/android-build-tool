package p035OoooOO0;

import androidx.compose.material.ripple.RippleHostView;
import com.facebook.bolts.Task;
import com.facebook.bolts.TaskCompletionSource;
import kotlin.jvm.internal.Intrinsics;
import p526o0o0O0oO.o0O0O0Oo;
import p581o0oOoOOo.x;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000Ooo implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f3641Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f3642OoooO00;

    public /* synthetic */ o0000Ooo(Object obj, int i) {
        this.f3641Oooo = i;
        this.f3642OoooO00 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3641Oooo) {
            case 0:
                RippleHostView.m1setRippleState$lambda2((RippleHostView) this.f3642OoooO00);
                break;
            case 1:
                Task.Companion.m171delay$lambda0((TaskCompletionSource) this.f3642OoooO00);
                break;
            case 2:
                o0O0O0Oo this$0 = (o0O0O0Oo) this.f3642OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f43061OooO0o0.f49472OooO0OO.OooO0OO(false);
                this$0.f43061OooO0o0.f49472OooO0OO.setDrawerLockMode(1);
                break;
            default:
                x this$1 = (x) this.f3642OoooO00;
                int i = x.f46378OoooOoO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.f46380OoooOOO.setVisibility(0);
                break;
        }
    }
}
