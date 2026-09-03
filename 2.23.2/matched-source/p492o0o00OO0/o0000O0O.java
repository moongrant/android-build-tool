package p492o0o00OO0;

import androidx.lifecycle.Observer;
import com.app.base.protobuf.room.Room;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p650o0ooo.j;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0000O0O implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49124OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49125OooO0o0;

    public /* synthetic */ o0000O0O(Object obj, int i) {
        this.f49124OooO0Oo = i;
        this.f49125OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f49124OooO0Oo;
        Object obj2 = this.f49125OooO0o0;
        switch (i) {
            case 0:
                MomentDetailActivity this$0 = (MomentDetailActivity) obj2;
                int i2 = MomentDetailActivity.f25608Oooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoO().f44926OooO.OooO();
                break;
            case 1:
                j this$1 = (j) obj2;
                int i3 = j.f58287OooOo0o;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                try {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.app.base.protobuf.room.Room.UserModel>");
                    this$1.f58293OooOOo0.clear();
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        this$1.f58293OooOOo0.add(RoomUserInfoModel.INSTANCE.of((Room.UserModel) it.next()).getUserId().getValue());
                    }
                    j.OooO0OO oooO0OO = this$1.f58295OooOo0;
                    if (oooO0OO == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        oooO0OO = null;
                    }
                    oooO0OO.notifyDataSetChanged();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            default:
                MainRoomFragment.initObserver$lambda$4((MainRoomFragment) obj2, obj);
                break;
        }
    }
}
