package p143o00OOooO;

import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.app.base.fragment.MainMomentFragment;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.common.db.table.ChatMessage;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.ui.activity.account.LoginErrorActivity;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.vm.store.RoomThemeCustomizeVM;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o00OOO.OooO00o;
import p169o00Ooo0.o0O0O00;
import p255o00ooO0O.o000O0O0;
import p500o0o00Oo0.OooOOO;
import p536o0o0OOo0.o0O00o00;
import p538o0o0OOoo.p0;
import p538o0o0OOoo.q0;
import p581o0oOoOOo.d1;
import p581o0oOoOOo.oOOO00;
import p618o0oo0Ooo.oO0O000o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000O0 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31947OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31948OooO0O0;

    public /* synthetic */ o0000O0(Object obj, int i) {
        this.f31947OooO00o = i;
        this.f31948OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f31947OooO00o) {
            case 0:
                MainMomentFragment.m29initObserver$lambda10((MainMomentFragment) this.f31948OooO0O0, obj);
                break;
            case 1:
                LoginErrorActivity this$0 = (LoginErrorActivity) this.f31948OooO0O0;
                ApiResult apiResult = (ApiResult) obj;
                LoginErrorActivity.OooO00o oooO00o = LoginErrorActivity.f21780OooooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoO();
                if (apiResult.isSuccess()) {
                    if (apiResult.getData() != null) {
                        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new o0O00o00(null), 3, null);
                        this$0.finish();
                    }
                }
                break;
            case 2:
                PrivateChatActivity this$1 = (PrivateChatActivity) this.f31948OooO0O0;
                Pair pair = (Pair) obj;
                PrivateChatActivity.OooO00o oooO00o2 = PrivateChatActivity.f22185o0ooOOo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.f22197o00Ooo = false;
                if (pair != null) {
                    ChatMessage chatMessage = (ChatMessage) pair.getSecond();
                    if (chatMessage.getGiveRoomThemeInfo() != null) {
                        ChatMessage.GiveRoomThemeInfo giveRoomThemeInfo = chatMessage.getGiveRoomThemeInfo();
                        d1 d1Var = new d1(this$1, new p0(this$1, chatMessage), new q0(this$1));
                        this$1.f22196o00Oo0 = d1Var;
                        Intrinsics.checkNotNull(d1Var);
                        boolean isAcceptMsg = chatMessage.getIsAcceptMsg();
                        int iIntValue = ((Number) pair.getFirst()).intValue();
                        Intrinsics.checkNotNull(giveRoomThemeInfo);
                        d1Var.OooOOO0(isAcceptMsg, iIntValue, giveRoomThemeInfo.getThemeBgImgUrl(), giveRoomThemeInfo.getThemeVideoUrl());
                        d1 d1Var2 = this$1.f22196o00Oo0;
                        Intrinsics.checkNotNull(d1Var2);
                        d1Var2.OooOO0();
                        break;
                    }
                }
                break;
            case 3:
                UserInfoActivity this$2 = (UserInfoActivity) this.f31948OooO0O0;
                String str = (String) obj;
                UserInfoActivity.OooO00o oooO00o3 = UserInfoActivity.f23471o0OOO0o;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                if (o0000O.OooO00o(OooOOO.f41235OooO00o, this$2.f23476Oooooo0)) {
                    oO0O000o.OooO00o oooO00o4 = new oO0O000o.OooO00o(this$2);
                    oooO00o4.OooO00o(OooO00o.OooO00o());
                    oooO00o4.f48447OooO0OO = CloudImageUtilKt.imgFormat(str);
                    oooO00o4.f48445OooO00o = 0;
                    oooO00o4.OooO0OO(2, o000O0O0.OooO00o(R.color.white));
                    oooO00o4.OooO0o(this$2.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49988OooOOOO);
                }
                break;
            case 4:
                oOOO00 this$3 = (oOOO00) this.f31948OooO0O0;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                this$3.OooOOo0();
                break;
            default:
                RoomThemeCustomizeVM roomThemeCustomizeVM = (RoomThemeCustomizeVM) this.f31948OooO0O0;
                String strOooO0Oo = o0O0O00.OooO0Oo(String.valueOf((Long) obj));
                Intrinsics.checkNotNullExpressionValue(strOooO0Oo, "fmtMicrometer(aLong.toString())");
                roomThemeCustomizeVM.setCoin(strOooO0Oo);
                break;
        }
    }
}
