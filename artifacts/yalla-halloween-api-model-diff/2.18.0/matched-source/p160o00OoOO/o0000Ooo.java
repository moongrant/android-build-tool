package p160o00OoOO;

import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.model.ProfileLimitModel;
import com.app.base.model.RoomItemInfoModel;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.FriendChatModel;
import com.yalla.yalla.ui.activity.account.PhoneBindActivity;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.fragment.MessageListFragment;
import com.yalla.yalla.ui.vm.moment.YallaChatVM;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import o0o0000.OooOOOO;
import p500o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000Ooo implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32440OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f32441OooO0O0;

    public /* synthetic */ o0000Ooo(Object obj, int i) {
        this.f32440OooO00o = i;
        this.f32441OooO0O0 = obj;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList, java.util.List<com.app.base.model.RoomItemInfoModel>] */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f32440OooO00o) {
            case 0:
                MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) this.f32441OooO0O0;
                int i = MixedRoomActivity.f11779o0000O00;
                mixedRoomActivity.OooOoOO();
                mixedRoomActivity.finish();
                break;
            case 1:
                PhoneBindActivity this$0 = (PhoneBindActivity) this.f32441OooO0O0;
                int i2 = PhoneBindActivity.f21819Oooooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.finish();
                break;
            case 2:
                PrivateChatActivity this$1 = (PrivateChatActivity) this.f32441OooO0O0;
                ApiResult apiResult = (ApiResult) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (apiResult.isSuccess()) {
                    FriendChatModel friendChatModel = (FriendChatModel) apiResult.getData();
                    if (friendChatModel != null) {
                        PrivateChatActivity.OooO00o oooO00o = PrivateChatActivity.f22185o0ooOOo;
                        UserInfo value = this$1.Oooo0O0().getChatUserInfo().getValue();
                        if (value != null) {
                            friendChatModel.setLocalUserId(value.getUserId());
                            friendChatModel.setLocalUserName(value.getUserName());
                        }
                        ((YallaChatVM) this$1.f22194Ooooooo.getValue()).toYallaChat(friendChatModel);
                    }
                } else {
                    int code2 = apiResult.getCode();
                    if (code2 == 2077) {
                        FriendChatModel friendChatModel2 = new FriendChatModel();
                        friendChatModel2.setLocalBindChatFriendChatType(2);
                        PrivateChatActivity.OooO00o oooO00o2 = PrivateChatActivity.f22185o0ooOOo;
                        UserInfo value2 = this$1.Oooo0O0().getChatUserInfo().getValue();
                        if (value2 != null) {
                            friendChatModel2.setLocalUserId(value2.getUserId());
                            friendChatModel2.setLocalUserName(value2.getUserName());
                        }
                        ((YallaChatVM) this$1.f22194Ooooooo.getValue()).setFriendChatModel(friendChatModel2);
                        ((YallaChatVM) this$1.f22194Ooooooo.getValue()).yallaChatLogin();
                    } else if (code2 == 2078) {
                        FriendChatModel friendChatModel3 = new FriendChatModel();
                        friendChatModel3.setLocalBindChatFriendChatType(1);
                        PrivateChatActivity.OooO00o oooO00o3 = PrivateChatActivity.f22185o0ooOOo;
                        UserInfo value3 = this$1.Oooo0O0().getChatUserInfo().getValue();
                        if (value3 != null) {
                            friendChatModel3.setLocalUserId(value3.getUserId());
                            friendChatModel3.setLocalUserName(value3.getUserName());
                        }
                        ((YallaChatVM) this$1.f22194Ooooooo.getValue()).setFriendChatModel(friendChatModel3);
                        ((YallaChatVM) this$1.f22194Ooooooo.getValue()).getYallaChatDialogBindShow().setValue(Boolean.TRUE);
                    } else if (code2 != 2080) {
                        ApiError error = apiResult.getError();
                        Intrinsics.checkNotNullParameter(error, "error");
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error, null), 3, null);
                    } else {
                        ((YallaChatVM) this$1.f22194Ooooooo.getValue()).getYallaChatDialogFriendNoBindShow().setValue(Boolean.TRUE);
                    }
                }
                break;
            case 3:
                RoomSettingActivity this$2 = (RoomSettingActivity) this.f32441OooO0O0;
                ProfileLimitModel profileLimitModel = (ProfileLimitModel) obj;
                RoomSettingActivity.OooO00o oooO00o4 = RoomSettingActivity.f22988oo000o;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                for (RoomItemInfoModel roomItemInfoModel : this$2.f22990OooooOO) {
                    ProfileLimitModel profileLimitModel2 = roomItemInfoModel.getProfileLimitModel();
                    if (profileLimitModel2 != null && profileLimitModel2.getOperationType() == 2) {
                        roomItemInfoModel.setProfileLimitModel(profileLimitModel);
                    }
                }
                this$2.OooOoo().notifyDataSetChanged();
                break;
            case 4:
                UserInfoActivity this$3 = (UserInfoActivity) this.f32441OooO0O0;
                Integer num = (Integer) obj;
                UserInfoActivity.OooO00o oooO00o5 = UserInfoActivity.f23471o0OOO0o;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                if ((num == null) || (num != null && num.intValue() == 0)) {
                    this$3.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49996OooOo0O.setVisibility(4);
                } else {
                    this$3.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49996OooOo0O.setVisibility(0);
                    Integer value4 = OooOOO.f41235OooO00o.OooOOO().getValue();
                    Intrinsics.checkNotNull(value4);
                    int iIntValue = value4.intValue();
                    if (iIntValue == 1 || iIntValue == 8) {
                        TextView textView = this$3.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49996OooOo0O;
                        StringBuilder sb = new StringBuilder();
                        sb.append(num);
                        sb.append('+');
                        textView.setText(sb.toString());
                    } else {
                        TextView textView2 = this$3.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49996OooOo0O;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append('+');
                        sb2.append(num);
                        textView2.setText(sb2.toString());
                    }
                }
                break;
            default:
                MessageListFragment.m383initObserver$lambda4((MessageListFragment) this.f32441OooO0O0, (Integer) obj);
                break;
        }
    }
}
