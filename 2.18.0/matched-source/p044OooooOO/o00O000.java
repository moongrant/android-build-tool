package p044OooooOO;

import androidx.lifecycle.Observer;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.model.ProfileLimitModel;
import com.app.base.view.GifFaceView;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.common.db.table.Conversation;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.model.GifListJson;
import com.yalla.yalla.ui.activity.account.PasswordActivity;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.fragment.MessageFragment;
import com.yalla.yalla.ui.fragment.UserNewPostFragment;
import com.yalla.yalla.ui.view.NumberSize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o00OOO.OooO00o;
import p100o000oOoO.o0O00O;
import p255o00ooO0O.o000O0O0;
import p500o0o00Oo0.OooOOO;
import p524o0o0O0o.o00O0;
import p524o0o0O0o.oOO00O;
import p532o0o0OOO.o00OO0O0;
import p581o0oOoOOo.s;
import p618o0oo0Ooo.oO0O000o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00O000 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f4018OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f4019OooO0O0;

    public /* synthetic */ o00O000(Object obj, int i) {
        this.f4018OooO00o = i;
        this.f4019OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        List<ProfileLimitModel> profileLimit;
        switch (this.f4018OooO00o) {
            case 0:
                o0O00O state = (o0O00O) this.f4019OooO0O0;
                Intrinsics.checkNotNullParameter(state, "$state");
                state.setValue(obj);
                break;
            case 1:
                MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) this.f4019OooO0O0;
                Integer num = (Integer) obj;
                int i = MixedRoomActivity.f11779o0000O00;
                Objects.requireNonNull(mixedRoomActivity);
                if (num.intValue() > -1) {
                    s sVar = new s(mixedRoomActivity);
                    String number = String.valueOf(num.intValue());
                    Intrinsics.checkNotNullParameter(number, "number");
                    oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(sVar.f46315OoooOOO);
                    oooO00o.OooO00o(OooO00o.OooO0o0());
                    oooO00o.f48472OooOoo0 = 2;
                    oooO00o.f48462OooOOoo = 3;
                    OooOOO oooOOO = OooOOO.f41235OooO00o;
                    oooO00o.f48447OooO0OO = o00O0.OooO0oO(oooOOO.OooO0oo().getValue());
                    oooO00o.f48445OooO00o = 0;
                    oooO00o.OooO0o(sVar.OooOO0O().f49087OooO0OO);
                    sVar.OooOO0O().f49090OooO0o0.setText(o00O0.OooO0oO(oooOOO.OooOoO().getValue()));
                    sVar.OooOO0O().f49088OooO0Oo.setText(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.room_lucky_number_open_info_xxx), number));
                    sVar.OooOO0O().f49089OooO0o.setSize(NumberSize.Size.XX);
                    sVar.OooOO0O().f49089OooO0o.setNumCount(oOO00O.OooO0Oo(o00OO0O0.f43338OooooOo.OooO00o().OooO().getValue(), 0));
                    sVar.OooOO0O().f49089OooO0o.setData(number);
                    sVar.OooOO0();
                }
                break;
            case 2:
                GifFaceView this$0 = (GifFaceView) this.f4019OooO0O0;
                GifListJson gifListJson = (GifListJson) obj;
                int i2 = GifFaceView.f12041OoooOoO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f12044OoooO0 = gifListJson.getFolderName();
                this$0.f12043OoooO = gifListJson;
                this$0.f12042Oooo.setNewData(gifListJson.getItem());
                break;
            case 3:
                PasswordActivity this$1 = (PasswordActivity) this.f4019OooO0O0;
                PasswordActivity.OooO00o oooO00o2 = PasswordActivity.f21800ooOO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.finish();
                break;
            case 4:
                PrivateChatActivity this$2 = (PrivateChatActivity) this.f4019OooO0O0;
                Conversation conversation = (Conversation) obj;
                PrivateChatActivity.OooO00o oooO00o3 = PrivateChatActivity.f22185o0ooOOo;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.f22198o00o0O.f52938OooO0OO = conversation;
                if (conversation != null && OooO0OO.OooO00o(String.valueOf(this$2.Oooo00o().f49034OooO0o0.f49484OooO0O0.getText()))) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        this$2.Oooo00o().f49034OooO0o0.f49484OooO0O0.setText(conversation.getDraft());
                        Result.m502constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m502constructorimpl(ResultKt.createFailure(th));
                        return;
                    }
                    break;
                }
                break;
            case 5:
                Function1 tmp0 = (Function1) this.f4019OooO0O0;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case 6:
                UserInfoActivity this$3 = (UserInfoActivity) this.f4019OooO0O0;
                UserInfoActivity.OooO00o oooO00o4 = UserInfoActivity.f23471o0OOO0o;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                ArrayList arrayList = new ArrayList();
                UserInfoModel userInfoModel = this$3.f23475Oooooo;
                if (userInfoModel != null && (profileLimit = userInfoModel.getProfileLimit()) != null) {
                    for (ProfileLimitModel profileLimitModel : profileLimit) {
                        if (profileLimitModel.getOperationType() != 1) {
                            arrayList.add(profileLimitModel);
                        }
                    }
                }
                UserInfoModel userInfoModel2 = this$3.f23475Oooooo;
                if (userInfoModel2 != null) {
                    userInfoModel2.setProfileLimit(arrayList);
                    break;
                }
                break;
            case 7:
                MessageFragment.m381onLazyInit$lambda0((MessageFragment) this.f4019OooO0O0, (Integer) obj);
                break;
            default:
                UserNewPostFragment.m430initObserver$lambda4((UserNewPostFragment) this.f4019OooO0O0, (Long) obj);
                break;
        }
    }
}
