package com.yalla.yalla.ui.activity.message;

import androidx.lifecycle.Observer;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.model.room.RoomItemInfoModel;
import com.yalla.yalla.model.room.RoomItemInfoModelTag;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oo0o0Oo implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f25561OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BaseFragmentActivity f25562OooO0o0;

    public /* synthetic */ oo0o0Oo(BaseFragmentActivity baseFragmentActivity, int i) {
        this.f25561OooO0Oo = i;
        this.f25562OooO0o0 = baseFragmentActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f25561OooO0Oo;
        BaseFragmentActivity baseFragmentActivity = this.f25562OooO0o0;
        switch (i) {
            case 0:
                PrivateChatActivity this$0 = (PrivateChatActivity) baseFragmentActivity;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i2 = PrivateChatActivity.f25240Oooo000;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (zBooleanValue) {
                    p205o00o0o0o.o000O o000o = new p205o00o0o0o.o000O(this$0);
                    o000o.OooOo00(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.backpack_frozen));
                    o000o.OooOO0o();
                }
                break;
            default:
                RoomSettingActivity this$1 = (RoomSettingActivity) baseFragmentActivity;
                Boolean bool = (Boolean) obj;
                int i3 = RoomSettingActivity.f26193Oooo00O;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                int i4 = 0;
                for (Object obj2 : this$1.f26197OooOo00) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    RoomItemInfoModel roomItemInfoModel = (RoomItemInfoModel) obj2;
                    if (roomItemInfoModel.getTag() == RoomItemInfoModelTag.EnterRoomAllow) {
                        roomItemInfoModel.setTurnOnSwitch(Boolean.valueOf(!Intrinsics.areEqual(bool, Boolean.TRUE)));
                        this$1.OooOo().notifyDataSetChanged();
                    } else {
                        i4 = i5;
                    }
                    break;
                }
                break;
        }
    }
}
