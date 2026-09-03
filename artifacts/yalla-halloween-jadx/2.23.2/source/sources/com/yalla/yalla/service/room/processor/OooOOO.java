package com.yalla.yalla.service.room.processor;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import com.yalla.yalla.mixedroom.model.RoomPKResultModel;
import com.yalla.yalla.mixedroom.model.RoomPkStartModel;
import com.yalla.yalla.model.chat.ChatModel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooOOO implements OooO00o {
    @Override // com.yalla.yalla.service.room.processor.OooO00o
    @NotNull
    public final String OooO00o() {
        return OooO00o.C0318OooO00o.OooO00o(this);
    }

    public final void OooO0O0(int i, @Nullable Object obj) {
        OooO00o.C0318OooO00o.OooO0O0(this, i, obj);
        switch (i) {
            case 1000300:
                RoomPkStartModel startModel = (RoomPkStartModel) p187o00o00o0.OooO.OooO0O0(RoomPkStartModel.class, new String((byte[]) obj, Charsets.UTF_8));
                if (startModel != null) {
                    Intrinsics.checkNotNullParameter(startModel, "startModel");
                    ChatModel chatModel = new ChatModel();
                    chatModel.setType(22);
                    ChatModel.PkStart pkStart = new ChatModel.PkStart();
                    pkStart.setRoomNameA(startModel.getRoom_a_name());
                    pkStart.setRoomNameB(startModel.getRoom_b_name());
                    chatModel.setPkStart(pkStart);
                    MixedRoomDataSource.OooO0o0().OooO00o(chatModel);
                }
                break;
            case 1000301:
                RoomPKResultModel resultModel = (RoomPKResultModel) p187o00o00o0.OooO.OooO0O0(RoomPKResultModel.class, new String((byte[]) obj, Charsets.UTF_8));
                if (resultModel != null) {
                    com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24566Oooo.postValue(resultModel);
                    Intrinsics.checkNotNullParameter(resultModel, "resultModel");
                    ChatModel.PkResult pkResult = new ChatModel.PkResult();
                    pkResult.setRoomNameA(resultModel.getRoom_a_name());
                    pkResult.setRoomNameB(resultModel.getRoom_b_name());
                    pkResult.setGiftNumberA(resultModel.getRoom_a_giftnumber());
                    pkResult.setGiftNumberB(resultModel.getRoom_b_giftnumber());
                    pkResult.setGiftUrl(resultModel.getGift_picurl());
                    ChatModel chatModel2 = new ChatModel();
                    chatModel2.setType(23);
                    chatModel2.setPkResult(pkResult);
                    MixedRoomDataSource.OooO0o0().OooO00o(chatModel2);
                }
                break;
        }
    }
}
