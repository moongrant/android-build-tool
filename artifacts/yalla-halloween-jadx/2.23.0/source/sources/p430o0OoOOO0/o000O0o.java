package p430o0OoOOO0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooO0OO;
import com.code.android.util.OooOo00;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.gift.GiftPropTypeShow;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.message.Oooo000;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.vm.message.PrivateChatVM;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p367o0OOo0o0.OooOOOO;
import p385o0OOooOO.oOO00O;
import p520o0o0O0oo.h9;
import p520o0o0O0oo.x6;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.j5;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final PrivateChatActivity f45773OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final PrivateChatVM f45774OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final j5 f45775OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public BaseMomentDetailVM f45776OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Lazy f45777OooO0o0;

    public static final class OooO00o extends Lambda implements Function0<x6> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final x6 invoke() {
            return new x6(o000O0o.this.f45773OooO00o, h9.f53291OooO0O0, GiftPropTypeShow.InChat);
        }
    }

    public o000O0o(@NotNull PrivateChatActivity activity, @NotNull o00O00OO mPrivateChatVoiceManager, @NotNull PrivateChatVM mPrivateChatVM, @NotNull j5 mBinding) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(mPrivateChatVoiceManager, "mPrivateChatVoiceManager");
        Intrinsics.checkNotNullParameter(mPrivateChatVM, "mPrivateChatVM");
        Intrinsics.checkNotNullParameter(mBinding, "mBinding");
        this.f45773OooO00o = activity;
        this.f45774OooO0O0 = mPrivateChatVM;
        this.f45775OooO0OO = mBinding;
        this.f45777OooO0o0 = LazyKt.lazy(new OooO00o());
    }

    public final void OooO00o(@NotNull Oooo000 chatBottomState) {
        Intrinsics.checkNotNullParameter(chatBottomState, "chatBottomState");
        if (OooO0OO.OooO00o(this.f45773OooO00o)) {
            PrivateChatVM privateChatVM = this.f45774OooO0O0;
            if (privateChatVM.userInfo() == null || privateChatVM.getIsFriend()) {
                return;
            }
            privateChatVM.setLayoutYallaChatShowing(false);
            this.f45775OooO0OO.f58170OooO0Oo.setVisibility(8);
            chatBottomState.f25682OooO0Oo.setValue(Boolean.TRUE);
        }
    }

    public final void OooO0O0(@NotNull Oooo000 chatBottomState) {
        Intrinsics.checkNotNullParameter(chatBottomState, "chatBottomState");
        o0OO000.OooO00o("104013");
        oOO00O.OooO0Oo(false);
        OooOOOO value = chatBottomState.f25678OooO.getValue();
        if (value != null) {
            value.OooO00o();
        }
        Lazy lazy = this.f45777OooO0o0;
        x6 x6Var = (x6) lazy.getValue();
        x6Var.f53378OooOO0O = new o000Oo0(this, x6Var, chatBottomState);
        x6Var.f53379OooOO0o = new o000O00(this, x6Var);
        x6Var.f53381OooOOO0 = new o000O00O(x6Var);
        PrivateChatVM privateChatVM = this.f45774OooO0O0;
        UserInfo userInfo = privateChatVM.userInfo();
        if (userInfo != null) {
            privateChatVM.getGiftSendUser().getUserId().setValue(Long.valueOf(userInfo.getUserId()));
            privateChatVM.getGiftSendUser().getUserName().setValue(userInfo.getUserName());
            privateChatVM.getGiftSendUser().getUserHeader().setValue(userInfo.getUserHeader());
            if (privateChatVM.getIsFriend()) {
                privateChatVM.setLayoutYallaChatShowing(true);
                this.f45775OooO0OO.f58170OooO0Oo.setVisibility(0);
                chatBottomState.f25682OooO0Oo.setValue(Boolean.FALSE);
            }
        }
        if (OooOo00.OooO0O0(privateChatVM.getFriendRemark())) {
            privateChatVM.getGiftSendUser().getUserName().setValue(privateChatVM.getFriendRemark());
        }
        x6 x6Var2 = (x6) lazy.getValue();
        RoomUserInfoModel user = privateChatVM.getGiftSendUser();
        x6Var2.getClass();
        Intrinsics.checkNotNullParameter(user, "user");
        x6Var2.OooOoOO(user);
        ((x6) lazy.getValue()).OooOO0o();
    }
}
