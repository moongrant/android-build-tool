package androidx.compose.ui.graphics.colorspace;

import com.yalla.yalla.ui.activity.user.FollowerActivity;
import kotlin.jvm.internal.Intrinsics;
import p562o0oOo0O.o000oOoO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOO0 implements DoubleFunction, o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f4166OooO0Oo;

    public /* synthetic */ OooOOO0(Object obj) {
        this.f4166OooO0Oo = obj;
    }

    @Override // p562o0oOo0O.o000oOoO
    public final void OooO0O0() {
        FollowerActivity this$0 = (FollowerActivity) this.f4166OooO0Oo;
        int i = FollowerActivity.f27105OooOo0o;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOo0O();
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        return Rgb._init_$lambda$9((TransferParameters) this.f4166OooO0Oo, d);
    }
}
