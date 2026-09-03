package p035OoooOO0;

import androidx.compose.material.ripple.RippleHostView;
import com.facebook.bolts.Task;
import com.facebook.bolts.TaskCompletionSource;
import kotlin.jvm.internal.Intrinsics;
import p524o0o0O0oO.o0O0oo0o;
import p579o0oOoOOo.y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000Ooo implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f3627Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f3628Oooo0oO;

    public /* synthetic */ o0000Ooo(Object obj, int i) {
        this.f3627Oooo0o = i;
        this.f3628Oooo0oO = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3627Oooo0o) {
            case 0:
                RippleHostView.m1setRippleState$lambda2((RippleHostView) this.f3628Oooo0oO);
                break;
            case 1:
                Task.Companion.m171delay$lambda0((TaskCompletionSource) this.f3628Oooo0oO);
                break;
            case 2:
                o0O0oo0o this$0 = (o0O0oo0o) this.f3628Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f43090OooO0o0.f49535OooO0OO.OooO0OO(false);
                this$0.f43090OooO0o0.f49535OooO0OO.setDrawerLockMode(1);
                break;
            default:
                y this$1 = (y) this.f3628Oooo0oO;
                int i = y.f46365OoooOOO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.f46366OoooO.setVisibility(0);
                break;
        }
    }
}
