package p533o0o0OOOo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.mixedroom.model.RoomConfiguration;
import com.app.base.model.ChatModel;
import com.app.base.model.GiftRoomModel;
import com.yalla.support.common.util.OooO;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p159o00OoOO.o000O00O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class oO00000o implements oO00000 {
    @Override // p533o0o0OOOo.oO00000
    @NotNull
    public final String OooO00o() {
        return oO00000.OooO00o.OooO00o(this);
    }

    public final void OooO0O0(long j, @NotNull String userHeader, @NotNull String userName) {
        Intrinsics.checkNotNullParameter(userHeader, "userHeader");
        Intrinsics.checkNotNullParameter(userName, "userName");
        ChatModel chatModel = new ChatModel();
        ChatModel.BecomeMemberModel becomeMemberModel = new ChatModel.BecomeMemberModel(j, userHeader, userName);
        chatModel.type = 25;
        chatModel.becomeMemberModel = becomeMemberModel;
        o000O00O.OooO().OooO00o(chatModel);
    }

    public final void OooO0OO(@NotNull GiftRoomModel giftModel) {
        Intrinsics.checkNotNullParameter(giftModel, "giftModel");
        RoomConfiguration roomConfiguration = o000O00O.OooO().f32427Oooo;
        if (roomConfiguration == null) {
            return;
        }
        String barid = roomConfiguration.getBarid();
        Intrinsics.checkNotNullExpressionValue(barid, "roomConfiguration.barid");
        if (OooO.OooO0oO(barid) == giftModel.roominfo.getId()) {
            ChatModel chatModel = new ChatModel();
            chatModel.number = giftModel.number;
            chatModel.giftid = giftModel.giftid;
            chatModel.giftUrl = giftModel.giftUrl;
            chatModel.giftVideoUrl = giftModel.giftVideoUrl;
            chatModel.giftUserType = giftModel.giftUserType;
            chatModel.giftType = giftModel.giftType;
            chatModel.from = giftModel.from;
            chatModel.to = giftModel.to;
            chatModel.type = 1;
            chatModel.uuid = giftModel.uuid;
            chatModel.fromboxid = giftModel.fromboxid;
            o000O00O.OooO().OooO00o(chatModel);
        }
    }
}
