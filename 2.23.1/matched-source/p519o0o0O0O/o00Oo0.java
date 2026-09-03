package p519o0o0O0O;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.vm.moment.BaseMomentVM;
import com.yalla.yalla.ui.vm.store.RoomThemeCustomCreateVM;
import kotlin.jvm.internal.Intrinsics;
import p396o0Oo0.OooOO0;
import p597o0oo00O.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00Oo0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f52327OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f52328OooO0o0;

    public /* synthetic */ o00Oo0(OooOO0 oooOO1, int i) {
        this.f52327OooO0Oo = i;
        this.f52328OooO0o0 = oooOO1;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f52327OooO0Oo;
        OooOO0 oooOO1 = this.f52328OooO0o0;
        switch (i) {
            case 0:
                BaseMomentVM newMomentVM = (BaseMomentVM) oooOO1;
                long jLongValue = ((Long) obj).longValue();
                Intrinsics.checkNotNullParameter(newMomentVM, "$newMomentVM");
                OooOOOO.OooO("动态编辑 发送成功 刷新 = " + jLongValue);
                newMomentVM.squareSingle4Edited(jLongValue);
                break;
            default:
                ((RoomThemeCustomCreateVM) oooOO1).loadThemePrice();
                break;
        }
    }
}
