package p443o0OoOo0o;

import android.os.Looper;
import androidx.lifecycle.Observer;
import com.yalla.yalla.mixedroom.roomcenter.RoomFrameUIController;
import com.yalla.yalla.model.ApiServiceUpdateModel;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.vm.moment.BaseMomentVM;
import kotlin.jvm.internal.Intrinsics;
import p433o0OoOOO0.o000;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o000Oo0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f47295OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f47296OooO0o0;

    public /* synthetic */ o000Oo0(Object obj, int i) {
        this.f47295OooO0Oo = i;
        this.f47296OooO0o0 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        boolean z;
        int i = this.f47295OooO0Oo;
        Object obj2 = this.f47296OooO0o0;
        switch (i) {
            case 0:
                RoomFrameUIController this$0 = (RoomFrameUIController) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Looper.myQueue().addIdleHandler(this$0.f23091OooO0oo);
                break;
            case 1:
                MainActivity this$1 = (MainActivity) obj2;
                Response response = (Response) obj;
                int i2 = MainActivity.f24940OooOoo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (response.getIsSuccess()) {
                    ApiServiceUpdateModel apiServiceUpdateModel = (ApiServiceUpdateModel) response.getData();
                    if (apiServiceUpdateModel != null) {
                        z = apiServiceUpdateModel.isServiceUp();
                    }
                    if (z) {
                        o000 o000Var = (o000) this$1.f24942OooOo.getValue();
                        o000Var.getClass();
                        Looper.myQueue().addIdleHandler(o000Var.f46845OooO0OO);
                    }
                }
                break;
            default:
                BaseMomentVM newMomentVM = (BaseMomentVM) obj2;
                long jLongValue = ((Long) obj).longValue();
                Intrinsics.checkNotNullParameter(newMomentVM, "$newMomentVM");
                newMomentVM.removeMoment(jLongValue);
                break;
        }
    }
}
