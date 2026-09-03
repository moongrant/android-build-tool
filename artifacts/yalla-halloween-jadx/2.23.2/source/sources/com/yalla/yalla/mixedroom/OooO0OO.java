package com.yalla.yalla.mixedroom;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.ui.activity.account.LoginOnRoomDialogActivity;
import com.yalla.yalla.ui.fragment.room.RoomInfoMemberListFragment;
import kotlin.jvm.internal.Intrinsics;
import p042OooooO0.o00O00o0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OooO0OO implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f23017OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f23018OooO0o0;

    public /* synthetic */ OooO0OO(Object obj, int i) {
        this.f23017OooO0Oo = i;
        this.f23018OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f23017OooO0Oo;
        Object obj2 = this.f23018OooO0o0;
        switch (i) {
            case 0:
                MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) obj2;
                mixedRoomActivity.f22965OooOoO.postDelayed(new o00O00o0(2, mixedRoomActivity, (ChatModel) obj), 300L);
                break;
            case 1:
                LoginOnRoomDialogActivity this$0 = (LoginOnRoomDialogActivity) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.finish();
                break;
            default:
                RoomInfoMemberListFragment.initObserve$lambda$14((RoomInfoMemberListFragment) obj2, obj);
                break;
        }
    }
}
