package com.yalla.yalla.ui.activity.message;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.Observer;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.data.db.table.Conversation;
import com.yalla.yalla.mixedroom.model.RoomConfiguration;
import com.yalla.yalla.model.ProfileLimitModel;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00000 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f25340OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BaseFragmentActivity f25341OooO0o0;

    public /* synthetic */ o00000(BaseFragmentActivity baseFragmentActivity, int i) {
        this.f25340OooO0Oo = i;
        this.f25341OooO0o0 = baseFragmentActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i;
        RoomConfiguration roomConfiguration;
        ArrayList<ProfileLimitModel> profileLimit;
        ArrayList<ProfileLimitModel> profileLimit2;
        int i2 = this.f25340OooO0Oo;
        MutableState<Oooo000> mutableState = null;
        BaseFragmentActivity baseFragmentActivity = this.f25341OooO0o0;
        switch (i2) {
            case 0:
                PrivateChatActivity this$0 = (PrivateChatActivity) baseFragmentActivity;
                Conversation conversation = (Conversation) obj;
                int i3 = PrivateChatActivity.f25240Oooo000;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f25253OooOoo0.f46954OooO0OO = conversation;
                if (conversation != null) {
                    MutableState<Oooo000> mutableState2 = this$0.f25255OooOooo;
                    if (mutableState2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
                        mutableState2 = null;
                    }
                    if (com.code.android.util.OooOo00.OooO00o(String.valueOf(mutableState2.getValue().OooO00o().getText()))) {
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            MutableState<Oooo000> mutableState3 = this$0.f25255OooOooo;
                            if (mutableState3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
                            } else {
                                mutableState = mutableState3;
                            }
                            mutableState.getValue().OooO00o().setText(conversation.getDraft());
                            Result.m4215constructorimpl(Unit.INSTANCE);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            Result.m4215constructorimpl(ResultKt.createFailure(th));
                        }
                    }
                }
                break;
            default:
                RoomSettingActivity this$1 = (RoomSettingActivity) baseFragmentActivity;
                int i4 = RoomSettingActivity.f26193Oooo00O;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.f26204OooOoo0.setValue(null);
                RoomConfiguration roomConfiguration2 = this$1.f26196OooOo0;
                if (roomConfiguration2 == null || (profileLimit2 = roomConfiguration2.getProfileLimit()) == null) {
                    i = -1;
                } else {
                    int i5 = 0;
                    i = -1;
                    for (Object obj2 : profileLimit2) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((ProfileLimitModel) obj2).getOperationType() == 3) {
                            i = i5;
                        }
                        i5 = i6;
                    }
                }
                if (i > -1 && (roomConfiguration = this$1.f26196OooOo0) != null && (profileLimit = roomConfiguration.getProfileLimit()) != null) {
                    profileLimit.remove(i);
                    break;
                }
                break;
        }
    }
}
