package p519o0o0O0OO;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.vm.moment.BaseMomentVM;
import com.yalla.yalla.ui.vm.store.RoomThemeCustomCreateVM;
import kotlin.jvm.internal.Intrinsics;
import p394o0Oo0.OooOO0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00O000o implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f52024OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f52025OooO0o0;

    public /* synthetic */ o00O000o(OooOO0 oooOO1, int i) {
        this.f52024OooO0Oo = i;
        this.f52025OooO0o0 = oooOO1;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f52024OooO0Oo;
        OooOO0 oooOO1 = this.f52025OooO0o0;
        switch (i) {
            case 0:
                BaseMomentVM newMomentVM = (BaseMomentVM) oooOO1;
                long jLongValue = ((Long) obj).longValue();
                Intrinsics.checkNotNullParameter(newMomentVM, "$newMomentVM");
                newMomentVM.isEventDeleted(Long.valueOf(jLongValue));
                break;
            default:
                RoomThemeCustomCreateVM roomThemeCustomCreateVM = (RoomThemeCustomCreateVM) oooOO1;
                if (obj != null) {
                    roomThemeCustomCreateVM.setCustomImagePath((String) obj);
                    break;
                }
                break;
        }
    }
}
