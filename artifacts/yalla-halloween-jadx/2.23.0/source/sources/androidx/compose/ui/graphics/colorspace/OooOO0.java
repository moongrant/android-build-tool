package androidx.compose.ui.graphics.colorspace;

import com.yalla.yalla.ui.activity.store.VehicleStoreActivity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p562o0oOo0O.o000oOoO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0 implements DoubleFunction, o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f4164OooO0Oo;

    public /* synthetic */ OooOO0(Object obj) {
        this.f4164OooO0Oo = obj;
    }

    @Override // p562o0oOo0O.o000oOoO
    public final void OooO0O0() {
        VehicleStoreActivity this$0 = (VehicleStoreActivity) this.f4164OooO0Oo;
        int i = VehicleStoreActivity.f27043OooOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOoOO();
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        return Rgb._init_$lambda$2((Function1) this.f4164OooO0Oo, d);
    }
}
