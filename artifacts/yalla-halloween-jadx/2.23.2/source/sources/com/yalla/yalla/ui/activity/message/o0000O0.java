package com.yalla.yalla.ui.activity.message;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O0 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25353OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0(PrivateChatActivity privateChatActivity) {
        super(1);
        this.f25353OooO0Oo = privateChatActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        int i = PrivateChatActivity.f25239Oooo000;
        PrivateChatActivity privateChatActivity = this.f25353OooO0Oo;
        privateChatActivity.OooOo().setFriend(zBooleanValue);
        privateChatActivity.OooOo().addChatMessageToYallaChatMessage(new o0000oo(privateChatActivity));
        MutableState<Oooo000> mutableState = null;
        if (privateChatActivity.OooOo().getIsFriend()) {
            privateChatActivity.OooOo().setLayoutYallaChatShowing(true);
            privateChatActivity.OooOo0().f44882OooO0Oo.setVisibility(0);
            MutableState<Oooo000> mutableState2 = privateChatActivity.f25254OooOooo;
            if (mutableState2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
            } else {
                mutableState = mutableState2;
            }
            mutableState.getValue().f25227OooO0Oo.setValue(Boolean.FALSE);
        } else {
            MutableState<Oooo000> mutableState3 = privateChatActivity.f25254OooOooo;
            if (mutableState3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
                mutableState3 = null;
            }
            privateChatActivity.f25251OooOoo.OooO00o(mutableState3.getValue());
            privateChatActivity.OooOo().setLayoutYallaChatShowing(false);
            privateChatActivity.OooOo0().f44882OooO0Oo.setVisibility(8);
            MutableState<Oooo000> mutableState4 = privateChatActivity.f25254OooOooo;
            if (mutableState4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
                mutableState4 = null;
            }
            p371o0OOo0oO.oo000o value = mutableState4.getValue().f25223OooO.getValue();
            if (value != null) {
                value.OooO00o();
            }
            MutableState<Oooo000> mutableState5 = privateChatActivity.f25254OooOooo;
            if (mutableState5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
            } else {
                mutableState = mutableState5;
            }
            mutableState.getValue().f25227OooO0Oo.setValue(Boolean.TRUE);
            long targetId = privateChatActivity.OooOo().getTargetId();
            p407o0Oo0Oo.Oooo000 oooo000OooOOo0 = p408o0Oo0Oo0.o00Oo0.OooO00o().OooOOo0();
            p475o0Ooooo0.o0O00oO0 o0o00oo1 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
            Long l = (Long) p475o0Ooooo0.o0O00oO0.OooOOo0().getValue();
            oooo000OooOOo0.OooOOo0(l == null ? 0L : l.longValue(), targetId);
        }
        return Unit.INSTANCE;
    }
}
