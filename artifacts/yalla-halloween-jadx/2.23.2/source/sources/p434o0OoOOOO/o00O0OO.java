package p434o0OoOOOO;

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
import p371o0OOo0oO.oo000o;
import p391o0OOooo0.oo0o0Oo;
import p405o0Oo0OOO.oO0O00oO;
import p511o0o0O.o00000OO;
import p511o0o0O.o00OO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00O0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final PrivateChatActivity f46926OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final PrivateChatVM f46927OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final oO0O00oO f46928OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public BaseMomentDetailVM f46929OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Lazy f46930OooO0o0;

    public static final class OooO00o extends Lambda implements Function0<o00000OO> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00000OO invoke() {
            return new o00000OO(o00O0OO.this.f46926OooO00o, o00OO.f51040OooO0O0, GiftPropTypeShow.InChat);
        }
    }

    public o00O0OO(@NotNull PrivateChatActivity activity, @NotNull o0oOOo mPrivateChatVoiceManager, @NotNull PrivateChatVM mPrivateChatVM, @NotNull oO0O00oO mBinding) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(mPrivateChatVoiceManager, "mPrivateChatVoiceManager");
        Intrinsics.checkNotNullParameter(mPrivateChatVM, "mPrivateChatVM");
        Intrinsics.checkNotNullParameter(mBinding, "mBinding");
        this.f46926OooO00o = activity;
        this.f46927OooO0O0 = mPrivateChatVM;
        this.f46928OooO0OO = mBinding;
        this.f46930OooO0o0 = LazyKt.lazy(new OooO00o());
    }

    public final void OooO00o(@NotNull Oooo000 chatBottomState) {
        Intrinsics.checkNotNullParameter(chatBottomState, "chatBottomState");
        if (OooO0OO.OooO00o(this.f46926OooO00o)) {
            PrivateChatVM privateChatVM = this.f46927OooO0O0;
            if (privateChatVM.userInfo() == null || privateChatVM.getIsFriend()) {
                return;
            }
            privateChatVM.setLayoutYallaChatShowing(false);
            this.f46928OooO0OO.f44882OooO0Oo.setVisibility(8);
            chatBottomState.f25227OooO0Oo.setValue(Boolean.TRUE);
        }
    }

    public final void OooO0O0(@NotNull Oooo000 chatBottomState) {
        Intrinsics.checkNotNullParameter(chatBottomState, "chatBottomState");
        o0oo0000.OooO00o.OooO0O0("104013");
        oo0o0Oo.OooO0Oo(false);
        oo000o value = chatBottomState.f25223OooO.getValue();
        if (value != null) {
            value.OooO00o();
        }
        Lazy lazy = this.f46930OooO0o0;
        o00000OO o00000oo2 = (o00000OO) lazy.getValue();
        o00000oo2.f50962OooOO0O = new o00O0OOO(this, o00000oo2, chatBottomState);
        o00000oo2.f50963OooOO0o = new oo0oOO0(this, o00000oo2);
        o00000oo2.f50965OooOOO0 = new o00O(o00000oo2);
        PrivateChatVM privateChatVM = this.f46927OooO0O0;
        UserInfo userInfo = privateChatVM.userInfo();
        if (userInfo != null) {
            privateChatVM.getGiftSendUser().getUserId().setValue(Long.valueOf(userInfo.getUserId()));
            privateChatVM.getGiftSendUser().getUserName().setValue(userInfo.getUserName());
            privateChatVM.getGiftSendUser().getUserHeader().setValue(userInfo.getUserHeader());
            if (privateChatVM.getIsFriend()) {
                privateChatVM.setLayoutYallaChatShowing(true);
                this.f46928OooO0OO.f44882OooO0Oo.setVisibility(0);
                chatBottomState.f25227OooO0Oo.setValue(Boolean.FALSE);
            }
        }
        if (OooOo00.OooO0O0(privateChatVM.getFriendRemark())) {
            privateChatVM.getGiftSendUser().getUserName().setValue(privateChatVM.getFriendRemark());
        }
        o00000OO o00000oo3 = (o00000OO) lazy.getValue();
        RoomUserInfoModel user = privateChatVM.getGiftSendUser();
        o00000oo3.getClass();
        Intrinsics.checkNotNullParameter(user, "user");
        o00000oo3.OooOoOO(user);
        ((o00000OO) lazy.getValue()).OooOO0o();
    }
}
