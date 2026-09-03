package p645o0ooOOoo;

import androidx.lifecycle.Observer;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.MomentChangeUserIsInRoomModel;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.vm.moment.BaseMomentVM;
import kotlin.jvm.internal.Intrinsics;
import p570o0oOoO.o00000OO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l3 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f58109OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f58110OooO0o0;

    public /* synthetic */ l3(Object obj, int i) {
        this.f58109OooO0Oo = i;
        this.f58110OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f58109OooO0Oo;
        Object obj2 = this.f58110OooO0o0;
        switch (i) {
            case 0:
                n3 this$0 = (n3) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO00o(0);
                break;
            case 1:
                MainActivity this$1 = (MainActivity) obj2;
                o00000OO o00000oo2 = (o00000OO) obj;
                int i2 = MainActivity.f24940OooOoo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                long jCurrentTimeMillis = System.currentTimeMillis();
                o00000OO o00000oo3 = this$1.f24947OooOoO;
                if (jCurrentTimeMillis - o0OoOo0.OooOO0(o00000oo3 != null ? Long.valueOf(o00000oo3.f56420OooO0o) : null) > 3600000) {
                    this$1.f24947OooOoO = o00000oo2;
                    this$1.OooOoOO();
                }
                break;
            default:
                BaseMomentVM newMomentVM = (BaseMomentVM) obj2;
                MomentChangeUserIsInRoomModel it = (MomentChangeUserIsInRoomModel) obj;
                Intrinsics.checkNotNullParameter(newMomentVM, "$newMomentVM");
                Intrinsics.checkNotNullParameter(it, "it");
                newMomentVM.updateInRoom(it);
                break;
        }
    }
}
