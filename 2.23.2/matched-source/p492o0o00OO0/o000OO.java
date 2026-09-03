package p492o0o00OO0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment;
import com.yalla.yalla.ui.view.refresh.RefreshLayout;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p650o0ooo.j;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o000OO implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49143OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49144OooO0o0;

    public /* synthetic */ o000OO(Object obj, int i) {
        this.f49143OooO0Oo = i;
        this.f49144OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f49143OooO0Oo;
        Object obj2 = this.f49144OooO0o0;
        switch (i) {
            case 0:
                MomentDetailActivity this$0 = (MomentDetailActivity) obj2;
                int i2 = MomentDetailActivity.f25608Oooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoO().f44928OooO0O0.setExpanded(false);
                break;
            case 1:
                j this$1 = (j) obj2;
                int i3 = j.f58287OooOo0o;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                ArrayList<RoomUserInfoModel> arrayList = (ArrayList) obj;
                RefreshLayout refreshLayout = null;
                if (arrayList == null || arrayList.isEmpty()) {
                    RefreshLayout refreshLayout2 = this$1.f58294OooOOoo;
                    if (refreshLayout2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rlOnlineList");
                    } else {
                        refreshLayout = refreshLayout2;
                    }
                    refreshLayout.OooOoOO(false, true, true);
                } else {
                    boolean z = this$1.f58291OooOOOo;
                    int i4 = this$1.f58290OooOOOO;
                    if (z) {
                        this$1.f58291OooOOOo = false;
                        this$1.f58293OooOOo0.clear();
                        ArrayList<Long> arrayList2 = this$1.f58293OooOOo0;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.OooO0oo(arrayList));
                        for (RoomUserInfoModel roomUserInfoModel : arrayList) {
                            ArrayList arrayList4 = OooO00o.f24511OooO00o;
                            OooO00o.OooO0o(roomUserInfoModel);
                            arrayList3.add(roomUserInfoModel.getUserId().getValue());
                        }
                        arrayList2.addAll(arrayList3);
                        j.OooO0OO oooO0OO = this$1.f58295OooOo0;
                        if (oooO0OO == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapter");
                            oooO0OO = null;
                        }
                        oooO0OO.notifyDataSetChanged();
                        RefreshLayout refreshLayout3 = this$1.f58294OooOOoo;
                        if (refreshLayout3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("rlOnlineList");
                            refreshLayout3 = null;
                        }
                        refreshLayout3.OooOoOO(true, true, arrayList.size() < i4);
                    } else {
                        j.OooO0OO oooO0OO2 = this$1.f58295OooOo0;
                        if (oooO0OO2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapter");
                            oooO0OO2 = null;
                        }
                        ArrayList arrayList5 = new ArrayList(CollectionsKt.OooO0oo(arrayList));
                        for (RoomUserInfoModel roomUserInfoModel2 : arrayList) {
                            ArrayList arrayList6 = OooO00o.f24511OooO00o;
                            OooO00o.OooO0o(roomUserInfoModel2);
                            arrayList5.add(Long.valueOf(roomUserInfoModel2.getUserId().getValue().longValue()));
                        }
                        oooO0OO2.OooO0O0(arrayList5);
                        RefreshLayout refreshLayout4 = this$1.f58294OooOOoo;
                        if (refreshLayout4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("rlOnlineList");
                            refreshLayout4 = null;
                        }
                        refreshLayout4.OooOoOO(false, true, arrayList.size() < i4);
                    }
                    RefreshLayout refreshLayout5 = this$1.f58294OooOOoo;
                    if (refreshLayout5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rlOnlineList");
                    } else {
                        refreshLayout = refreshLayout5;
                    }
                    refreshLayout.OooOo00(arrayList.size() >= i4);
                }
                break;
            default:
                MainRoomFragment.initObserver$lambda$6((MainRoomFragment) obj2, (Integer) obj);
                break;
        }
    }
}
