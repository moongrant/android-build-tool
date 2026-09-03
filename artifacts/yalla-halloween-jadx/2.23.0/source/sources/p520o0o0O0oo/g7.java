package p520o0o0O0oo;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.view.GiftView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g7 implements Observer<GiftView> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ x6 f53283OooO0Oo;

    public g7(x6 x6Var) {
        this.f53283OooO0Oo = x6Var;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(GiftView giftView) {
        GiftView giftView2 = giftView;
        x6 x6Var = this.f53283OooO0Oo;
        if (Intrinsics.areEqual(x6Var.f53385OooOOo0, giftView2)) {
            x6.OooOOO(x6Var, giftView2, giftView2.getF30469OooO0o0());
        } else {
            x6.OooOOO0(x6Var);
        }
    }
}
