package com.yalla.yalla.ui.activity.message;

import androidx.lifecycle.Observer;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.model.WealthLevel;
import com.yalla.yalla.model.room.RoomItemInfoModel;
import com.yalla.yalla.model.room.RoomItemInfoModelTag;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p675oO0Oo.i7;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0O0O00 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f25494OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BaseFragmentActivity f25495OooO0o0;

    public /* synthetic */ o0O0O00(BaseFragmentActivity baseFragmentActivity, int i) {
        this.f25494OooO0Oo = i;
        this.f25495OooO0o0 = baseFragmentActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f25494OooO0Oo;
        BaseFragmentActivity baseFragmentActivity = this.f25495OooO0o0;
        switch (i) {
            case 0:
                PrivateChatActivity this$0 = (PrivateChatActivity) baseFragmentActivity;
                Boolean bool = (Boolean) obj;
                int i2 = PrivateChatActivity.f25240Oooo000;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNull(bool);
                if (bool.booleanValue() && !WealthLevel.Companion.isUnlocked$default(WealthLevel.INSTANCE, null, 1, null)) {
                    p425o0OoO0OO.oo0o0Oo.OooO00o(this$0, new i7(new o000O0(this$0)));
                    break;
                }
                break;
            default:
                RoomSettingActivity this$1 = (RoomSettingActivity) baseFragmentActivity;
                Boolean bool2 = (Boolean) obj;
                int i3 = RoomSettingActivity.f26193Oooo00O;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                int i4 = 0;
                for (Object obj2 : this$1.f26197OooOo00) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    RoomItemInfoModel roomItemInfoModel = (RoomItemInfoModel) obj2;
                    if (roomItemInfoModel.getTag() == RoomItemInfoModelTag.AllowLockMic) {
                        roomItemInfoModel.setTurnOnSwitch(bool2);
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
