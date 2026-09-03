package com.yalla.yalla.ui.activity.message;

import androidx.lifecycle.Observer;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.mixedroom.model.RoomConfiguration;
import com.yalla.yalla.model.ProfileLimitModel;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o000OOo implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f25372OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BaseFragmentActivity f25373OooO0o0;

    public /* synthetic */ o000OOo(BaseFragmentActivity baseFragmentActivity, int i) {
        this.f25372OooO0Oo = i;
        this.f25373OooO0o0 = baseFragmentActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i;
        RoomConfiguration roomConfiguration;
        ArrayList<ProfileLimitModel> profileLimit;
        ArrayList<ProfileLimitModel> profileLimit2;
        int i2 = this.f25372OooO0Oo;
        int i3 = 0;
        BaseFragmentActivity baseFragmentActivity = this.f25373OooO0o0;
        boolean z = true;
        switch (i2) {
            case 0:
                PrivateChatActivity this$0 = (PrivateChatActivity) baseFragmentActivity;
                String str = (String) obj;
                int i4 = PrivateChatActivity.f25239Oooo000;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (str != null && str.length() != 0) {
                    z = false;
                }
                if (!z) {
                    int itemCount = this$0.OooOo0O().getItemCount();
                    while (i3 < itemCount) {
                        if (Intrinsics.areEqual(str, this$0.OooOo0O().getData(i3).getMid())) {
                            this$0.OooOo0O().notifyItemChanged(i3);
                        } else {
                            i3++;
                        }
                    }
                }
                break;
            default:
                RoomSettingActivity this$1 = (RoomSettingActivity) baseFragmentActivity;
                int i5 = RoomSettingActivity.f26191Oooo00O;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.f26198OooOoO.setValue(null);
                RoomConfiguration roomConfiguration2 = this$1.f26194OooOo0;
                if (roomConfiguration2 == null || (profileLimit2 = roomConfiguration2.getProfileLimit()) == null) {
                    i = -1;
                } else {
                    i = -1;
                    for (Object obj2 : profileLimit2) {
                        int i6 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((ProfileLimitModel) obj2).getOperationType() == 1) {
                            i = i3;
                        }
                        i3 = i6;
                    }
                }
                if (i > -1 && (roomConfiguration = this$1.f26194OooOo0) != null && (profileLimit = roomConfiguration.getProfileLimit()) != null) {
                    profileLimit.remove(i);
                    break;
                }
                break;
        }
    }
}
