package p492o0o00O0O;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.MomentChangeUserIsInRoomModel;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.vm.moment.BaseMomentVM;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o000O00 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f48919OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f48920OooO0o0;

    public /* synthetic */ o000O00(Object obj, int i) {
        this.f48919OooO0Oo = i;
        this.f48920OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f48919OooO0Oo;
        Object obj2 = this.f48920OooO0o0;
        switch (i) {
            case 0:
                MainActivity this$0 = (MainActivity) obj2;
                int i2 = MainActivity.f24941OooOoo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoO().loadUserInfo();
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
