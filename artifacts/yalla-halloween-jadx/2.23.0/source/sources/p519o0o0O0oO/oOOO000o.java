package p519o0o0O0oO;

import android.view.View;
import androidx.lifecycle.Observer;
import com.code.android.util.o000OO00;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO000o implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ooooO0O0 f52987OooO0Oo;

    public oOOO000o(ooooO0O0 ooooo0o0) {
        this.f52987OooO0Oo = ooooo0o0;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        ooooO0O0 ooooo0o0 = this.f52987OooO0Oo;
        if (obj != null) {
            View view = ooooo0o0.OooOO0().f59493OooOoo0;
            Intrinsics.checkNotNullExpressionValue(view, "binding.vMoraPoint");
            o000OO00.OooOOOO(view);
        } else {
            View view2 = ooooo0o0.OooOO0().f59493OooOoo0;
            Intrinsics.checkNotNullExpressionValue(view2, "binding.vMoraPoint");
            o000OO00.OooO0OO(view2);
        }
    }
}
