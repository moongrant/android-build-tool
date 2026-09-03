package com.yalla.yalla.ui.activity.message;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000Ooo extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25808OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000Ooo(PrivateChatActivity privateChatActivity) {
        super(1);
        this.f25808OooO0Oo = privateChatActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        int i = PrivateChatActivity.f25694Oooo000;
        PrivateChatActivity privateChatActivity = this.f25808OooO0Oo;
        privateChatActivity.OooOo().setFriend(zBooleanValue);
        privateChatActivity.OooOo().addChatMessageToYallaChatMessage(new o00000OO(privateChatActivity));
        MutableState<Oooo000> mutableState = null;
        if (privateChatActivity.OooOo().getIsFriend()) {
            privateChatActivity.OooOo().setLayoutYallaChatShowing(true);
            privateChatActivity.OooOo0().f58170OooO0Oo.setVisibility(0);
            MutableState<Oooo000> mutableState2 = privateChatActivity.f25709OooOooo;
            if (mutableState2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
            } else {
                mutableState = mutableState2;
            }
            mutableState.getValue().f25682OooO0Oo.setValue(Boolean.FALSE);
        } else {
            MutableState<Oooo000> mutableState3 = privateChatActivity.f25709OooOooo;
            if (mutableState3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
                mutableState3 = null;
            }
            privateChatActivity.f25706OooOoo.OooO00o(mutableState3.getValue());
            privateChatActivity.OooOo().setLayoutYallaChatShowing(false);
            privateChatActivity.OooOo0().f58170OooO0Oo.setVisibility(8);
            MutableState<Oooo000> mutableState4 = privateChatActivity.f25709OooOooo;
            if (mutableState4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
                mutableState4 = null;
            }
            p367o0OOo0o0.OooOOOO value = mutableState4.getValue().f25678OooO.getValue();
            if (value != null) {
                value.OooO00o();
            }
            MutableState<Oooo000> mutableState5 = privateChatActivity.f25709OooOooo;
            if (mutableState5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
            } else {
                mutableState = mutableState5;
            }
            mutableState.getValue().f25682OooO0Oo.setValue(Boolean.TRUE);
            long targetId = privateChatActivity.OooOo().getTargetId();
            p403o0Oo0OOo.oo0o0O0 oo0o0o0OooOOOo = p581o0oOoo00.o000OOo.OooO00o().OooOOOo();
            p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
            Long l = (Long) p464o0Oooo.o000000O.OooOOo0().getValue();
            oo0o0o0OooOOOo.OooOOo0(l == null ? 0L : l.longValue(), targetId);
        }
        return Unit.INSTANCE;
    }
}
