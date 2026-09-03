package p526o0o0O0oO;

import android.os.Looper;
import androidx.lifecycle.Observer;
import com.app.base.protobuf.room.Room;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.yalla.yalla.common.ui.view.DotView;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentSendModel;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.UntieAccountBindActivity;
import com.yalla.yalla.ui.activity.message.ShareToFriendsActivity;
import com.yalla.yalla.ui.activity.moment.UserPostListActivity;
import com.yalla.yalla.ui.activity.store.VehicleStoreActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment;
import com.yalla.yalla.ui.vm.account.AccountVM;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p143o00OOooO.o0000O;
import p144o00OOooo.o00O0O00;
import p170o00Ooo00.OooOOOO;
import p189o00o00o0.OooO0OO;
import p255o00ooO0O.o00O000;
import p255o00ooO0O.o0O0ooO;
import p517o0o0O00.o00O00;
import p581o0oOoOOo.i;
import p608o0oo0O.OooOo;
import p651o0ooOOoo.va;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0oOOo implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f43113OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f43114OooO0O0;

    public /* synthetic */ o0oOOo(Object obj, int i) {
        this.f43113OooO00o = i;
        this.f43114OooO0O0 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0093  */
    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        OooO0OO<ShopVehicleListModel> oooO0OO;
        OooO0OO<ShopVehicleListModel> oooO0OO2;
        boolean z = true;
        va vaVar = null;
        OooO0OO<Long> oooO0OO3 = null;
        OooO0OO<ShopVehicleListModel> oooO0OO4 = null;
        switch (this.f43113OooO00o) {
            case 0:
                o0O000 this$0 = (o0O000) this.f43114OooO0O0;
                Boolean it = (Boolean) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                va vaVar2 = this$0.f43042OooO0oo;
                if (vaVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bindingDrawer");
                } else {
                    vaVar = vaVar2;
                }
                DotView dotView = vaVar.f50812OooO0o.f50873OooO0O0;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                dotView.OooO0OO(it.booleanValue());
                break;
            case 1:
                UntieAccountBindActivity this$1 = (UntieAccountBindActivity) this.f43114OooO0O0;
                int i = UntieAccountBindActivity.f21906Oooooo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Objects.requireNonNull(this$1);
                BaseActivityK.OooOoo0(this$1, null, 0L, 3, null);
                ((AccountVM) this$1.f21908OooooOO.getValue()).getAccountBindInfo().observe(this$1, new o00O0O00(this$1, 2));
                break;
            case 2:
                ShareToFriendsActivity this$2 = (ShareToFriendsActivity) this.f43114OooO0O0;
                Boolean it2 = (Boolean) obj;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                if (it2.booleanValue()) {
                    String strOooO0OO = OooOOO.OooO0OO(R.string.Share_Shared_successfully);
                    ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z = false;
                    }
                    if (!z) {
                        o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O0.run();
                        } else {
                            o00O000 o00o001 = o00O000.f34368OooO00o;
                            o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                        }
                    }
                    OooOo.OooO0O0("202026");
                }
                this$2.finish();
                break;
            case 3:
                UserPostListActivity this$3 = (UserPostListActivity) this.f43114OooO0O0;
                MomentSendModel momentSendModel = (MomentSendModel) obj;
                UserPostListActivity.OooO00o oooO00o = UserPostListActivity.f22693o00O0O;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                o00O00.OooO0O0("动态任务 发送失败 刷新 ");
                if (o0000O.OooO00o(p500o0o00Oo0.OooOOO.f41235OooO00o, this$3.f22696OooooOo)) {
                    OooOOOO oooOOOO = OooOOOO.f32692OooO00o;
                    int iOooO0O0 = OooOOOO.OooO0O0(this$3.OooOooo().getData(), momentSendModel);
                    if (iOooO0O0 > -1 && iOooO0O0 < this$3.OooOooo().getData().size()) {
                        MomentDetailModel momentDetailModel = new MomentDetailModel();
                        momentDetailModel.setSendPostModel(momentSendModel);
                        this$3.OooOooo().setData(iOooO0O0, momentDetailModel);
                        break;
                    }
                }
                break;
            case 4:
                VehicleStoreActivity this$4 = (VehicleStoreActivity) this.f43114OooO0O0;
                Response response = (Response) obj;
                VehicleStoreActivity.OooO00o oooO00o2 = VehicleStoreActivity.f23278Oooooo;
                Intrinsics.checkNotNullParameter(this$4, "this$0");
                if (!response.getIsSuccess() || response.getData() == null) {
                    oooO0OO = this$4.f23281OooooOo;
                    if (oooO0OO == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                        oooO0OO = null;
                    }
                    oooO0OO.setNewData(null);
                    oooO0OO2 = this$4.f23281OooooOo;
                    if (oooO0OO2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    } else {
                        oooO0OO4 = oooO0OO2;
                    }
                    oooO0OO4.setLoadComplete();
                } else {
                    Object data = response.getData();
                    Intrinsics.checkNotNull(data);
                    if (((List) data).size() > 0) {
                        OooO0OO<ShopVehicleListModel> oooO0OO5 = this$4.f23281OooooOo;
                        if (oooO0OO5 != null) {
                            Object data2 = response.getData();
                            Intrinsics.checkNotNull(data2);
                            oooO0OO5.setNewData((List) data2);
                        }
                    } else {
                        oooO0OO = this$4.f23281OooooOo;
                        if (oooO0OO == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                            oooO0OO = null;
                        }
                        oooO0OO.setNewData(null);
                        oooO0OO2 = this$4.f23281OooooOo;
                        if (oooO0OO2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                        } else {
                            oooO0OO4 = oooO0OO2;
                        }
                        oooO0OO4.setLoadComplete();
                    }
                }
                this$4.OooOooo().f50921OooO0Oo.Oooo0o0(true, response.getIsSuccess(), response.getNoMoreData());
                this$4.OooOoO();
                break;
            case 5:
                i this$5 = (i) this.f43114OooO0O0;
                int i2 = i.f45956Oooooo0;
                Intrinsics.checkNotNullParameter(this$5, "this$0");
                try {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.app.base.protobuf.room.Room.UserModel>");
                    this$5.f45961OoooOoo.clear();
                    Iterator it3 = ((List) obj).iterator();
                    while (it3.hasNext()) {
                        this$5.f45961OoooOoo.add(Long.valueOf(RoomUserInfoModel.INSTANCE.of((Room.UserModel) it3.next()).getUserId()));
                    }
                    OooO0OO<Long> oooO0OO6 = this$5.f45965OooooOO;
                    if (oooO0OO6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    } else {
                        oooO0OO3 = oooO0OO6;
                    }
                    oooO0OO3.notifyDataSetChanged();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            default:
                MainRoomFragment.m453initObserver$lambda6((MainRoomFragment) this.f43114OooO0O0, (Integer) obj);
                break;
        }
    }
}
