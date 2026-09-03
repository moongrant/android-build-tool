package p503o0o00o;

import android.content.Intent;
import android.os.Looper;
import androidx.lifecycle.Observer;
import com.code.android.util.ToastUtil;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentForwardContent;
import com.yalla.yalla.model.MomentTypeDelete;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.message.ShareToFriendsActivity;
import com.yalla.yalla.ui.activity.moment.PurchaseLockRoomActivity;
import com.yalla.yalla.ui.activity.moment.UserPostListActivity;
import com.yalla.yalla.ui.activity.store.VehicleMineActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment;
import com.yalla.yalla.ui.vm.moment.MomentEditVM;
import com.yalla.yalla.util.NetWork;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p169o00Ooo0.o0O0O00;
import p189o00o00o0.OooO0OO;
import p255o00ooO0O.o00O000;
import p255o00ooO0O.o0O0ooO;
import p489o0o000oO.o0OOO0o;
import p489o0o000oO.o0ooOOo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000O implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f41439OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f41440OooO0O0;

    public /* synthetic */ o0000O(Object obj, int i) {
        this.f41439OooO00o = i;
        this.f41440OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        MomentForwardContent forwardContent;
        List<ShopVehicleListModel> list;
        OooO0OO<ShopVehicleListModel> oooO0OO = null;
        switch (this.f41439OooO00o) {
            case 0:
                o000O000 this$0 = (o000O000) this.f41440OooO0O0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoo();
                break;
            case 1:
                SmsCodeActivity context = (SmsCodeActivity) this.f41440OooO0O0;
                String url = (String) obj;
                SmsCodeActivity.OooO00o oooO00o = SmsCodeActivity.f21864oo000o;
                Intrinsics.checkNotNullParameter(context, "this$0");
                if (!(url == null || StringsKt.isBlank(url))) {
                    WebPageInfo webPageInfo = new WebPageInfo(WebFrom.LoginPageFeedback);
                    Intrinsics.checkNotNullExpressionValue(url, "it");
                    Intrinsics.checkNotNullParameter(url, "url");
                    webPageInfo.f21237OoooO00 = url;
                    webPageInfo.OooO0OO(OooOOO.OooO0OO(R.string.feedback));
                    String strSubstring = context.f21870OoooooO.substring(context.f21871Ooooooo.length(), context.f21870OoooooO.length());
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    webPageInfo.OooO00o("Tel", strSubstring);
                    webPageInfo.OooO00o("type", "1");
                    webPageInfo.OooO00o("areaCode", "mAreaCode");
                    o0OOO0o o0ooo0o2 = o0OOO0o.f40953OooO00o;
                    webPageInfo.OooO00o("PID", o0OOO0o.OooO00o());
                    o0ooOOo o0ooooo2 = o0ooOOo.f40966OooO00o;
                    webPageInfo.OooO00o("appVersion", o0ooOOo.OooO0O0());
                    webPageInfo.OooO00o(DeviceRequestsHelper.DEVICE_INFO_MODEL, o0OOO0o.OooO0O0());
                    webPageInfo.OooO00o("sysVersion", o0OOO0o.OooO0Oo());
                    webPageInfo.OooO00o("internet", NetWork.OooO00o().toString());
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intent intent = new Intent(context, (Class<?>) WebActivity.class);
                    intent.putExtra("pageinfo", webPageInfo);
                    context.startActivity(intent);
                    break;
                }
                break;
            case 2:
                ShareToFriendsActivity this$1 = (ShareToFriendsActivity) this.f41440OooO0O0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                    String strOooO0OO = OooOOO.OooO0OO(R.string.Share_Shared_successfully);
                    ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
                    if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                        o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O0.run();
                        } else {
                            o00O000 o00o001 = o00O000.f34368OooO00o;
                            o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                        }
                    }
                    this$1.finish();
                }
                break;
            case 3:
                PurchaseLockRoomActivity this$2 = (PurchaseLockRoomActivity) this.f41440OooO0O0;
                PurchaseLockRoomActivity.OooO00o oooO00o2 = PurchaseLockRoomActivity.f22524Oooooo;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.OooOooO().f50540OooO0o.setText(o0O0O00.OooO0OO((Long) obj));
                break;
            case 4:
                UserPostListActivity this$3 = (UserPostListActivity) this.f41440OooO0O0;
                Long l = (Long) obj;
                UserPostListActivity.OooO00o oooO00o3 = UserPostListActivity.f22693o00O0O;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                int size = this$3.OooOooo().getData().size();
                for (int i = 0; i < size; i++) {
                    MomentDetailModel momentDetailModel = this$3.OooOooo().getData().get(i);
                    if ((momentDetailModel == null || (forwardContent = momentDetailModel.getForwardContent()) == null || forwardContent.getShareType() != 20) ? false : true) {
                        MomentForwardContent forwardContent2 = momentDetailModel.getForwardContent();
                        if (Intrinsics.areEqual(forwardContent2 != null ? Long.valueOf(forwardContent2.getId()) : null, l)) {
                            momentDetailModel.setDeleteType(MomentTypeDelete.EVENT.getValue());
                            this$3.OooOooo().notifyItemChanged(this$3.OooOooo().getHeaderLayoutCount() + i);
                            break;
                        }
                    }
                }
                break;
            case 5:
                VehicleMineActivity this$4 = (VehicleMineActivity) this.f41440OooO0O0;
                Response response = (Response) obj;
                VehicleMineActivity.OooO00o oooO00o4 = VehicleMineActivity.f23268OoooooO;
                Intrinsics.checkNotNullParameter(this$4, "this$0");
                if (response.getIsSuccess() && (list = (List) response.getData()) != null) {
                    for (ShopVehicleListModel shopVehicleListModel : list) {
                        if (shopVehicleListModel.getIsSelected()) {
                            this$4.f23273Oooooo0 = shopVehicleListModel.getShopId();
                        }
                    }
                    OooO0OO<ShopVehicleListModel> oooO0OO2 = this$4.f23271OooooOo;
                    if (oooO0OO2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                        oooO0OO2 = null;
                    }
                    oooO0OO2.setNewData(list);
                }
                OooO0OO<ShopVehicleListModel> oooO0OO3 = this$4.f23271OooooOo;
                if (oooO0OO3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                } else {
                    oooO0OO = oooO0OO3;
                }
                oooO0OO.setLoadComplete();
                this$4.OooOoo().f50844OooO0OO.Oooo0o0(true, response.getIsSuccess(), response.getNoMoreData());
                this$4.OooOoO();
                break;
            case 6:
                MainRoomFragment.m450initObserver$lambda3((MainRoomFragment) this.f41440OooO0O0, obj);
                break;
            default:
                MomentEditVM.m494getEditHistory$lambda2$lambda1((MomentEditVM) this.f41440OooO0O0, (ApiResult) obj);
                break;
        }
    }
}
