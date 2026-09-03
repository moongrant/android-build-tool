package p493o0o00O0o;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment;
import com.yalla.yalla.ui.view.refresh.RefreshLayout;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p675oO0Oo.i1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oO00000o implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49219OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49220OooO0o0;

    public /* synthetic */ oO00000o(Object obj, int i) {
        this.f49219OooO0Oo = i;
        this.f49220OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f49219OooO0Oo;
        Object obj2 = this.f49220OooO0o0;
        switch (i) {
            case 0:
                MomentDetailActivity this$0 = (MomentDetailActivity) obj2;
                int i2 = MomentDetailActivity.f25610Oooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoO().f45007OooO.OooO();
                break;
            case 1:
                i1 this$1 = (i1) obj2;
                int i3 = i1.f59228OooOo0o;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                ArrayList<RoomUserInfoModel> arrayList = (ArrayList) obj;
                RefreshLayout refreshLayout = null;
                if (arrayList == null || arrayList.isEmpty()) {
                    RefreshLayout refreshLayout2 = this$1.f59235OooOOoo;
                    if (refreshLayout2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rlOnlineList");
                    } else {
                        refreshLayout = refreshLayout2;
                    }
                    refreshLayout.OooOoOO(false, true, true);
                } else {
                    boolean z = this$1.f59232OooOOOo;
                    int i4 = this$1.f59231OooOOOO;
                    if (z) {
                        this$1.f59232OooOOOo = false;
                        this$1.f59234OooOOo0.clear();
                        ArrayList<Long> arrayList2 = this$1.f59234OooOOo0;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.OooO0oo(arrayList));
                        for (RoomUserInfoModel roomUserInfoModel : arrayList) {
                            ArrayList arrayList4 = OooO00o.f24519OooO00o;
                            OooO00o.OooO0o(roomUserInfoModel);
                            arrayList3.add(roomUserInfoModel.getUserId().getValue());
                        }
                        arrayList2.addAll(arrayList3);
                        i1.OooO0OO oooO0OO = this$1.f59236OooOo0;
                        if (oooO0OO == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapter");
                            oooO0OO = null;
                        }
                        oooO0OO.notifyDataSetChanged();
                        RefreshLayout refreshLayout3 = this$1.f59235OooOOoo;
                        if (refreshLayout3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("rlOnlineList");
                            refreshLayout3 = null;
                        }
                        refreshLayout3.OooOoOO(true, true, arrayList.size() < i4);
                    } else {
                        i1.OooO0OO oooO0OO2 = this$1.f59236OooOo0;
                        if (oooO0OO2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapter");
                            oooO0OO2 = null;
                        }
                        ArrayList arrayList5 = new ArrayList(CollectionsKt.OooO0oo(arrayList));
                        for (RoomUserInfoModel roomUserInfoModel2 : arrayList) {
                            ArrayList arrayList6 = OooO00o.f24519OooO00o;
                            OooO00o.OooO0o(roomUserInfoModel2);
                            arrayList5.add(Long.valueOf(roomUserInfoModel2.getUserId().getValue().longValue()));
                        }
                        oooO0OO2.OooO0O0(arrayList5);
                        RefreshLayout refreshLayout4 = this$1.f59235OooOOoo;
                        if (refreshLayout4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("rlOnlineList");
                            refreshLayout4 = null;
                        }
                        refreshLayout4.OooOoOO(false, true, arrayList.size() < i4);
                    }
                    RefreshLayout refreshLayout5 = this$1.f59235OooOOoo;
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
