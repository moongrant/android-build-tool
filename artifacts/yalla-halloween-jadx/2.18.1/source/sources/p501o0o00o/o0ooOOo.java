package p501o0o00o;

import android.os.Looper;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.app.base.mixedroom.model.RoomConfiguration;
import com.app.base.model.ProfileLimitModel;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.common.ui.dialog.giftDialog.GiftCustomMadeWebManager;
import com.yalla.yalla.model.GiftPropModel;
import com.yalla.yalla.ui.activity.account.ProtectionDetailActivity;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import com.yalla.yalla.ui.fragment.BadgeRankDataFragment;
import com.yalla.yalla.ui.fragment.WalletCoinFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p074o000O0oo.OooOOO;
import p254o00ooO0O.o0000O0;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p579o0oOoOOo.O0000000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0ooOOo implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f41528OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f41529OooO0O0;

    public /* synthetic */ o0ooOOo(Object obj, int i) {
        this.f41528OooO00o = i;
        this.f41529OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i;
        RoomConfiguration roomConfiguration;
        ArrayList<ProfileLimitModel> profileLimit;
        ArrayList<ProfileLimitModel> profileLimit2;
        List<ProfileLimitModel> profileLimit3;
        int i2 = 0;
        switch (this.f41528OooO00o) {
            case 0:
                GiftCustomMadeWebManager this$0 = (GiftCustomMadeWebManager) this.f41529OooO0O0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                GiftPropModel giftPropModel = obj instanceof GiftPropModel ? (GiftPropModel) obj : null;
                if (giftPropModel != null && giftPropModel.isCustomMade()) {
                    i2 = 1;
                }
                if (i2 != 0) {
                    o0000O0.OooO0O0(LifecycleOwnerKt.getLifecycleScope(this$0.f20892OooO00o), new o0OOO0o(this$0, null));
                }
                break;
            case 1:
                ProtectionDetailActivity this$1 = (ProtectionDetailActivity) this.f41529OooO0O0;
                Boolean it = (Boolean) obj;
                int i3 = ProtectionDetailActivity.f21828Ooooo0o;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullExpressionValue(it, "it");
                if (it.booleanValue()) {
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.account_login_protection_delete_success);
                    ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                    if (((strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) ? 1 : 0) == 0) {
                        o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O0.run();
                        } else {
                            o00O000 o00o001 = o00O000.f34346OooO00o;
                            o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                        }
                    }
                    LiveEventBus.get("DELETE_DEVICE_SUCCESS").post(null);
                    this$1.finish();
                }
                break;
            case 2:
                RoomSettingActivity this$2 = (RoomSettingActivity) this.f41529OooO0O0;
                RoomSettingActivity.OooO00o oooO00o = RoomSettingActivity.f22969o00Ooo;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.f22976Oooooo.setValue(null);
                RoomConfiguration roomConfiguration2 = this$2.f22972Ooooo0o;
                if (roomConfiguration2 == null || (profileLimit2 = roomConfiguration2.getProfileLimit()) == null) {
                    i = -1;
                } else {
                    i = -1;
                    for (Object obj2 : profileLimit2) {
                        int i4 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((ProfileLimitModel) obj2).getOperationType() == 1) {
                            i = i2;
                        }
                        i2 = i4;
                    }
                }
                if (i > -1 && (roomConfiguration = this$2.f22972Ooooo0o) != null && (profileLimit = roomConfiguration.getProfileLimit()) != null) {
                    profileLimit.remove(i);
                    break;
                }
                break;
            case 3:
                UserInfoEditActivity this$3 = (UserInfoEditActivity) this.f41529OooO0O0;
                UserInfoEditActivity.OooO00o oooO00o2 = UserInfoEditActivity.f23493o0ooOOo;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                ArrayList arrayList = new ArrayList();
                UserInfoModel userInfoModel = this$3.f23514ooOO;
                if (userInfoModel != null && (profileLimit3 = userInfoModel.getProfileLimit()) != null) {
                    for (ProfileLimitModel profileLimitModel : profileLimit3) {
                        if (profileLimitModel.getOperationType() != 1) {
                            arrayList.add(profileLimitModel);
                        }
                    }
                }
                UserInfoModel userInfoModel2 = this$3.f23514ooOO;
                if (userInfoModel2 != null) {
                    userInfoModel2.setProfileLimit(arrayList);
                }
                this$3.f23504o00O0O.setValue(null);
                break;
            case 4:
                O0000000 this$4 = (O0000000) this.f41529OooO0O0;
                Intrinsics.checkNotNullParameter(this$4, "this$0");
                View view = this$4.OooOO0O().f49795OooOoo0;
                Intrinsics.checkNotNullExpressionValue(view, "binding.vMoraPoint");
                if (obj != null) {
                    o00O0O.OooO(view);
                } else {
                    o00O0O.OooO0O0(view);
                }
                break;
            case 5:
                BadgeRankDataFragment.m318initData$lambda4((BadgeRankDataFragment) this.f41529OooO0O0, (List) obj);
                break;
            default:
                WalletCoinFragment.m440startHelperActivity$lambda26$lambda25((FragmentActivity) this.f41529OooO0O0, (String) obj);
                break;
        }
    }
}
