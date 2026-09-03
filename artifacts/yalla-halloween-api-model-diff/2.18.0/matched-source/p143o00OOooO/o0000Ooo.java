package p143o00OOooO;

import androidx.lifecycle.Observer;
import com.app.base.fragment.MainMomentFragment;
import com.app.base.view.EmojiFaceView;
import com.yalla.yalla.common.db.table.ChatMessage;
import com.yalla.yalla.common.ui.view.UserNameView;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.common.ui.view.VipState;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p455o0Ooo.OooO;
import p500o0o00Oo0.OooOOO;
import p581o0oOoOOo.d1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000Ooo implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31955OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31956OooO0O0;

    public /* synthetic */ o0000Ooo(Object obj, int i) {
        this.f31955OooO00o = i;
        this.f31956OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        d1 d1Var;
        boolean z = false;
        switch (this.f31955OooO00o) {
            case 0:
                MainMomentFragment.m30initObserver$lambda11((MainMomentFragment) this.f31956OooO0O0, (Boolean) obj);
                break;
            case 1:
                EmojiFaceView this$0 = (EmojiFaceView) this.f31956OooO0O0;
                List<OooO> list = (List) obj;
                int i = EmojiFaceView.f11963OoooO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (list != null) {
                    this$0.f11964Oooo.setNewData(list);
                }
                break;
            case 2:
                PrivateChatActivity this$1 = (PrivateChatActivity) this.f31956OooO0O0;
                Pair pair = (Pair) obj;
                PrivateChatActivity.OooO00o oooO00o = PrivateChatActivity.f22185o0ooOOo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.f22197o00Ooo = false;
                if (pair != null && (d1Var = this$1.f22196o00Oo0) != null) {
                    Intrinsics.checkNotNull(d1Var);
                    if (d1Var.OooO0OO() && ((ChatMessage) pair.getSecond()).getGiveRoomThemeInfo() != null) {
                        ChatMessage.GiveRoomThemeInfo giveRoomThemeInfo = ((ChatMessage) pair.getSecond()).getGiveRoomThemeInfo();
                        d1 d1Var2 = this$1.f22196o00Oo0;
                        Intrinsics.checkNotNull(d1Var2);
                        boolean isAcceptMsg = ((ChatMessage) pair.getSecond()).getIsAcceptMsg();
                        Object first = pair.getFirst();
                        Intrinsics.checkNotNull(first);
                        int iIntValue = ((Number) first).intValue();
                        Intrinsics.checkNotNull(giveRoomThemeInfo);
                        d1Var2.OooOOO0(isAcceptMsg, iIntValue, giveRoomThemeInfo.getThemeBgImgUrl(), giveRoomThemeInfo.getThemeVideoUrl());
                        break;
                    }
                }
                break;
            default:
                UserInfoActivity this$2 = (UserInfoActivity) this.f31956OooO0O0;
                String str = (String) obj;
                UserInfoActivity.OooO00o oooO00o2 = UserInfoActivity.f23471o0OOO0o;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                String str2 = this$2.f23476Oooooo0;
                OooOOO oooOOO = OooOOO.f41235OooO00o;
                if (o0000O.OooO00o(oooOOO, str2)) {
                    this$2.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49993OooOo.setText(str);
                    UserNameView userNameView = this$2.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49993OooOo;
                    Pair<Integer, Integer> value = oooOOO.OooO().getValue();
                    if (value != null && value.getFirst().intValue() == VipState.Vip.getValue()) {
                        Pair<Integer, Integer> value2 = oooOOO.OooO().getValue();
                        if ((value2 != null ? value2.getSecond().intValue() : 0) >= VipLevel.Vip4.getValue()) {
                            z = true;
                        }
                    }
                    userNameView.setFlash(z);
                }
                break;
        }
    }
}
