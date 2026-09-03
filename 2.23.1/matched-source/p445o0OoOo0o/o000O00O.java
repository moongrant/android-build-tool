package p445o0OoOo0o;

import android.os.Looper;
import androidx.lifecycle.Observer;
import com.yalla.yalla.mixedroom.roomcenter.RoomFrameUIController;
import com.yalla.yalla.model.ApiServiceUpdateModel;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.vm.moment.BaseMomentVM;
import kotlin.jvm.internal.Intrinsics;
import p435o0OoOOO0.o0000OO0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o000O00O implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f47289OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f47290OooO0o0;

    public /* synthetic */ o000O00O(Object obj, int i) {
        this.f47289OooO0Oo = i;
        this.f47290OooO0o0 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        boolean z;
        int i = this.f47289OooO0Oo;
        Object obj2 = this.f47290OooO0o0;
        switch (i) {
            case 0:
                RoomFrameUIController this$0 = (RoomFrameUIController) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Looper.myQueue().addIdleHandler(this$0.f23102OooO0oo);
                break;
            case 1:
                MainActivity this$1 = (MainActivity) obj2;
                Response response = (Response) obj;
                int i2 = MainActivity.f24941OooOoo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (response.getIsSuccess()) {
                    ApiServiceUpdateModel apiServiceUpdateModel = (ApiServiceUpdateModel) response.getData();
                    if (apiServiceUpdateModel != null) {
                        z = apiServiceUpdateModel.isServiceUp();
                    }
                    if (z) {
                        o0000OO0 o0000oo1 = (o0000OO0) this$1.f24943OooOo.getValue();
                        o0000oo1.getClass();
                        Looper.myQueue().addIdleHandler(o0000oo1.f46845OooO0OO);
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
