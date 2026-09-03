package p160o00OoOO;

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
import p153o00Oo0o0.o00Oo00;
import p169o00Ooo0.oo000o;
import p472o0Oooo0.o00O0000;
import p492o0o00O0.OooOOO;
import p493o0o00O00.OooO0OO;
import p538o0o0OOoo.z;
import p656o0ooo.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00000O implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32427OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f32428OooO0O0;

    public /* synthetic */ o00000O(Object obj, int i) {
        this.f32427OooO00o = i;
        this.f32428OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = 1;
        switch (this.f32427OooO00o) {
            case 0:
                MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) this.f32428OooO0O0;
                mixedRoomActivity.f11816oo000o.postDelayed(new OooO0o(mixedRoomActivity, (ChatModel) obj, i), 300L);
                break;
            case 1:
                PhoneBindActivity this$0 = (PhoneBindActivity) this.f32428OooO0O0;
                Response response = (Response) obj;
                int i2 = PhoneBindActivity.f21819Oooooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoO();
                if (response.getIsSuccess()) {
                    if ((response.getData() == null ? 0 : 1) != 0) {
                        AccountBindInfo accountBindInfo = (AccountBindInfo) response.getData();
                        this$0.f21822OooooOo = accountBindInfo;
                        Intrinsics.checkNotNull(accountBindInfo);
                        this$0.OooOooO(accountBindInfo);
                    }
                }
                break;
            case 2:
                PrivateChatActivity this$1 = (PrivateChatActivity) this.f32428OooO0O0;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                PrivateChatActivity.OooO00o oooO00o = PrivateChatActivity.f22185o0ooOOo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.f22187Ooooo0o = zBooleanValue;
                this$1.Oooo0O0().addChatMessageToYallaChatMessage(new z(this$1));
                if (!this$1.f22187Ooooo0o) {
                    this$1.f22201o00ooo.OooO00o();
                    this$1.f22190OooooOo = false;
                    this$1.Oooo00o().f49032OooO0Oo.setVisibility(8);
                    o00O0000 o00o0001 = this$1.f22193OoooooO;
                    if (o00o0001 != null) {
                        o00o0001.OooO0OO();
                    }
                    this$1.Oooo00o().f49034OooO0o0.f49490OooO0oo.setVisibility(0);
                    this$1.Oooo00o().f49034OooO0o0.f49487OooO0o.setEnabled(false);
                    this$1.Oooo00o().f49034OooO0o0.f49484OooO0O0.setEnabled(false);
                    this$1.Oooo00o().f49034OooO0o0.f49484OooO0O0.setVisibility(4);
                    long targetId = this$1.Oooo0O0().getTargetId();
                    OooOOO OooOOo2 = OooO0OO.OooO00o().OooOOo();
                    Long value = p500o0o00Oo0.OooOOO.f41235OooO00o.OooOo().getValue();
                    OooOOo2.OooOOOO(value == null ? 0L : value.longValue(), targetId);
                } else {
                    this$1.f22190OooooOo = true;
                    this$1.Oooo00o().f49032OooO0Oo.setVisibility(0);
                    this$1.Oooo00o().f49034OooO0o0.f49490OooO0oo.setVisibility(8);
                    this$1.Oooo00o().f49034OooO0o0.f49487OooO0o.setEnabled(true);
                    this$1.Oooo00o().f49034OooO0o0.f49484OooO0O0.setEnabled(true);
                    this$1.Oooo00o().f49034OooO0o0.f49484OooO0O0.setVisibility(0);
                }
                break;
            case 3:
                UserInfoActivity this$2 = (UserInfoActivity) this.f32428OooO0O0;
                Friend friend = (Friend) obj;
                UserInfoActivity.OooO00o oooO00o2 = UserInfoActivity.f23471o0OOO0o;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                if (friend == null) {
                    UserInfoModel userInfoModel = this$2.f23475Oooooo;
                    if (userInfoModel != null) {
                        userInfoModel.setFriend(false);
                    }
                    o00Oo00.OooO00o(this$2.Oooo00o().f50345OooOOO0, com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.icon_profile_addfriend), ViewLocation.top, oo000o.OooO0o0());
                    this$2.Oooo00o().f50345OooOOO0.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.addfriend));
                } else {
                    UserInfoModel userInfoModel2 = this$2.f23475Oooooo;
                    if (userInfoModel2 != null) {
                        userInfoModel2.setFriend(true);
                    }
                    o00Oo00.OooO00o(this$2.Oooo00o().f50345OooOOO0, com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.icon_profile_delfriend), ViewLocation.top, oo000o.OooO0o0());
                    this$2.Oooo00o().f50345OooOOO0.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Friend));
                    o000oOoO o000oooo2 = this$2.f23489o0ooOoO;
                    if (o000oooo2 != null) {
                        Intrinsics.checkNotNull(o000oooo2);
                        o000oooo2.OooO0Oo();
                        this$2.f23489o0ooOoO = null;
                    }
                }
                break;
            case 4:
                BadgeFragment.m306initData$lambda5((BadgeFragment) this.f32428OooO0O0, (List) obj);
                break;
            case 5:
                MessageFragment.m382onLazyInit$lambda1((MessageFragment) this.f32428OooO0O0, (Integer) obj);
                break;
            default:
                WalletCoinFragment.m436iniView$lambda14$lambda13((WalletCoinFragment) this.f32428OooO0O0, (String) obj);
                break;
        }
    }
}
