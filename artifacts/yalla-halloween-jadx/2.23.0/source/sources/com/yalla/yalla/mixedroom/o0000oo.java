package com.yalla.yalla.mixedroom;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.chat.ChatModel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000oo implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f23514OooO0Oo;

    public o0000oo(MixedRoomActivity mixedRoomActivity) {
        this.f23514OooO0Oo = mixedRoomActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        long jLongValue = ((Long) obj).longValue();
        ArrayList<ChatModel> arrayList = MixedRoomDataSource.OooO0o0().f23465OooOO0O;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                i = -1;
                break;
            }
            ChatModel chatModel = arrayList.get(i);
            if (chatModel.getType() == 26 && chatModel.getEventModel() != null && chatModel.getEventModel().getId() == jLongValue) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0 && i < arrayList.size()) {
            arrayList.remove(i);
        }
        if (i >= 0) {
            MixedRoomActivity mixedRoomActivity = this.f23514OooO0Oo;
            if (i < mixedRoomActivity.f23437OooOoo.f49490OooO0o0.size()) {
                mixedRoomActivity.f23437OooOoo.f49490OooO0o0.remove(i);
            }
        }
    }
}
