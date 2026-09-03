package p159o00OoOO;

import OooOOO.OooO0o;
import androidx.lifecycle.Observer;
import com.app.base.framework.view.textView.ViewLocation;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.model.ChatModel;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.db.table.Friend;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.model.AccountBindInfo;
import com.yalla.yalla.ui.activity.account.PhoneBindActivity;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.fragment.BadgeFragment;
import com.yalla.yalla.ui.fragment.MessageFragment;
import com.yalla.yalla.ui.fragment.WalletCoinFragment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p152o00Oo0o0.o00Oo00;
import p168o00Ooo0.oo000o;
import p470o0Oooo0.o00O0000;
import p490o0o00O0.OooOOO;
import p491o0o00O00.OooO0OO;
import p536o0o0OOoo.a0;
import p654o0ooo.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00000O implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32405OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f32406OooO0O0;

    public /* synthetic */ o00000O(Object obj, int i) {
        this.f32405OooO00o = i;
        this.f32406OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = 1;
        switch (this.f32405OooO00o) {
            case 0:
                MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) this.f32406OooO0O0;
                mixedRoomActivity.f11788o00Ooo.postDelayed(new OooO0o(mixedRoomActivity, (ChatModel) obj, i), 300L);
                break;
            case 1:
                PhoneBindActivity this$0 = (PhoneBindActivity) this.f32406OooO0O0;
                Response response = (Response) obj;
                int i2 = PhoneBindActivity.f21800OooooO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoO();
                if (response.getIsSuccess()) {
                    if ((response.getData() == null ? 0 : 1) != 0) {
                        AccountBindInfo accountBindInfo = (AccountBindInfo) response.getData();
                        this$0.f21803Ooooo0o = accountBindInfo;
                        Intrinsics.checkNotNull(accountBindInfo);
                        this$0.OooOooO(accountBindInfo);
                    }
                }
                break;
            case 2:
                PrivateChatActivity this$1 = (PrivateChatActivity) this.f32406OooO0O0;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                PrivateChatActivity.OooO00o oooO00o = PrivateChatActivity.f22166o00oO0o;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.f22168OoooOoO = zBooleanValue;
                this$1.Oooo0O0().addChatMessageToYallaChatMessage(new a0(this$1));
                if (!this$1.f22168OoooOoO) {
                    this$1.f22180o00Oo0.OooO00o();
                    this$1.f22171Ooooo0o = false;
                    this$1.Oooo00o().f49095OooO0Oo.setVisibility(8);
                    o00O0000 o00o0001 = this$1.f22174OooooOo;
                    if (o00o0001 != null) {
                        o00o0001.OooO0OO();
                    }
                    this$1.Oooo00o().f49097OooO0o0.f49553OooO0oo.setVisibility(0);
                    this$1.Oooo00o().f49097OooO0o0.f49550OooO0o.setEnabled(false);
                    this$1.Oooo00o().f49097OooO0o0.f49547OooO0O0.setEnabled(false);
                    this$1.Oooo00o().f49097OooO0o0.f49547OooO0O0.setVisibility(4);
                    long targetId = this$1.Oooo0O0().getTargetId();
                    OooOOO OooOOo2 = OooO0OO.OooO00o().OooOOo();
                    Long value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue();
                    OooOOo2.OooOOOO(value == null ? 0L : value.longValue(), targetId);
                } else {
                    this$1.f22171Ooooo0o = true;
                    this$1.Oooo00o().f49095OooO0Oo.setVisibility(0);
                    this$1.Oooo00o().f49097OooO0o0.f49553OooO0oo.setVisibility(8);
                    this$1.Oooo00o().f49097OooO0o0.f49550OooO0o.setEnabled(true);
                    this$1.Oooo00o().f49097OooO0o0.f49547OooO0O0.setEnabled(true);
                    this$1.Oooo00o().f49097OooO0o0.f49547OooO0O0.setVisibility(0);
                }
                break;
            case 3:
                UserInfoActivity this$2 = (UserInfoActivity) this.f32406OooO0O0;
                Friend friend = (Friend) obj;
                UserInfoActivity.OooO00o oooO00o2 = UserInfoActivity.f23452o0ooOO0;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                if (friend == null) {
                    UserInfoModel userInfoModel = this$2.f23457OooooOO;
                    if (userInfoModel != null) {
                        userInfoModel.setFriend(false);
                    }
                    o00Oo00.OooO00o(this$2.Oooo00o().f50408OooOOO0, com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.icon_profile_addfriend), ViewLocation.top, oo000o.OooO0o0());
                    this$2.Oooo00o().f50408OooOOO0.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.addfriend));
                } else {
                    UserInfoModel userInfoModel2 = this$2.f23457OooooOO;
                    if (userInfoModel2 != null) {
                        userInfoModel2.setFriend(true);
                    }
                    o00Oo00.OooO00o(this$2.Oooo00o().f50408OooOOO0, com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.icon_profile_delfriend), ViewLocation.top, oo000o.OooO0o0());
                    this$2.Oooo00o().f50408OooOOO0.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Friend));
                    o000oOoO o000oooo2 = this$2.f23467o00oO0O;
                    if (o000oooo2 != null) {
                        Intrinsics.checkNotNull(o000oooo2);
                        o000oooo2.OooO0Oo();
                        this$2.f23467o00oO0O = null;
                    }
                }
                break;
            case 4:
                BadgeFragment.m306initData$lambda5((BadgeFragment) this.f32406OooO0O0, (List) obj);
                break;
            case 5:
                MessageFragment.m382onLazyInit$lambda1((MessageFragment) this.f32406OooO0O0, (Integer) obj);
                break;
            default:
                WalletCoinFragment.m436iniView$lambda14$lambda13((WalletCoinFragment) this.f32406OooO0O0, (String) obj);
                break;
        }
    }
}
