package com.yalla.yalla.ui.activity.message;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.Observer;
import com.yalla.yalla.data.db.table.Conversation;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000O implements Observer<Conversation> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25798OooO0Oo;

    public o00000O(PrivateChatActivity privateChatActivity) {
        this.f25798OooO0Oo = privateChatActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Conversation conversation) {
        Conversation conversation2 = conversation;
        PrivateChatActivity privateChatActivity = this.f25798OooO0Oo;
        privateChatActivity.f25707OooOoo0.f45781OooO0OO = conversation2;
        if (conversation2 != null) {
            MutableState<Oooo000> mutableState = privateChatActivity.f25709OooOooo;
            MutableState<Oooo000> mutableState2 = null;
            if (mutableState == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
                mutableState = null;
            }
            if (com.code.android.util.OooOo00.OooO00o(String.valueOf(mutableState.getValue().OooO00o().getText()))) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    MutableState<Oooo000> mutableState3 = privateChatActivity.f25709OooOooo;
                    if (mutableState3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
                    } else {
                        mutableState2 = mutableState3;
                    }
                    mutableState2.getValue().OooO00o().setText(conversation2.getDraft());
                    Result.m4213constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m4213constructorimpl(ResultKt.createFailure(th));
                }
            }
        }
    }
}
