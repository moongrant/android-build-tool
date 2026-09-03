package com.yalla.yalla.ui.activity.message;

import android.os.Looper;
import androidx.compose.runtime.MutableState;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.room.RoomModel;
import com.yalla.yalla.model.user.UserInBarModel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p579o0oOoo.oOo00OO0;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0o0Oo extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f25998OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25999OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0Oo(PrivateChatActivity privateChatActivity, boolean z) {
        super(privateChatActivity);
        this.f25999OooO0o0 = privateChatActivity;
        this.f25998OooO0o = z;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0O0(@NotNull String code, @NotNull String message) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        if (1039 == p590o0oo0.OooOOOO.OooOO0O(code)) {
            return;
        }
        super.OooO0O0(code, message);
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        PrivateChatActivity privateChatActivity = this.f25999OooO0o0;
        if (privateChatActivity.isFinishing()) {
            return;
        }
        UserInBarModel userInBarModel = (UserInBarModel) oOo00OO0.OooO00o(response, UserInBarModel.class);
        if (userInBarModel == null || !Intrinsics.areEqual("1000", userInBarModel.code) || userInBarModel.data == null) {
            privateChatActivity.OooOo0().f58172OooO0o0.f58517OooO0O0.setVisibility(8);
            return;
        }
        boolean z = userInBarModel.isinbar;
        boolean z2 = true;
        boolean z3 = this.f25998OooO0o;
        if (!z) {
            if (z3) {
                String strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.notinroom);
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    z2 = false;
                }
                if (!z2) {
                    com.code.android.util.o000Oo0 o000oo0OooO00o = com.code.android.util.o000O00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        com.code.android.util.o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                    }
                }
            }
            privateChatActivity.OooOo0().f58172OooO0o0.f58517OooO0O0.setVisibility(8);
            return;
        }
        if (!z3) {
            if (privateChatActivity.OooOo().userInfo() == null || !privateChatActivity.OooOo().getIsFriend() || privateChatActivity.OooOo0().f58173OooO0oO.f58666OooO0O0.getVisibility() == 0 || privateChatActivity.f25695OooOOo) {
                return;
            }
            privateChatActivity.OooOo0().f58172OooO0o0.f58517OooO0O0.setVisibility(0);
            return;
        }
        RoomModel roomModel = new RoomModel();
        roomModel.setRoomIp(userInBarModel.data.roomserverip);
        UserInBarModel.DataBean dataBean = userInBarModel.data;
        roomModel.websocketaddr = dataBean.websocketaddr;
        roomModel.setId(p590o0oo0.OooOOOO.OooOO0o(dataBean.barid));
        roomModel.setName(userInBarModel.data.barname);
        roomModel.setLevel(userInBarModel.data.barlevel);
        if (roomModel.getKinds() == 0 || roomModel.getKinds() == 1) {
            MutableState mutableState = p427o0OoOO00.o0OOO0o.f45698OooO00o;
            p427o0OoOO00.o0OOO0o.OooO0o(roomModel, EnterRoomParentPage.Message_Chat_lnRoom);
        }
    }
}
