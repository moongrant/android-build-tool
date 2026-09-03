package p482o0o000OO;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.protobuf.room.RoomMike;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.model.AtUserInfoModel;
import com.yalla.yalla.model.room.RoomMessageReplyInfo;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.RoomLiveService;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p269o00oooo0.o0O0oo0o;
import p390o0OOooo.o00000;
import p475o0Ooooo0.o0O00oO0;
import p557o0oOOooO.oOo00ooO;
import p590o0oOooo0.oOOO00;
import p595o0oo00O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooOOO {
    /* JADX WARN: Multi-variable type inference failed */
    public static void OooO00o(boolean z, boolean z2) {
        RoomUserInfoModel roomUserInfoModel;
        MutableStateFlow<Long> userId;
        RoomMike.MicUpFromMicApplyInviteRequest.Builder builderNewBuilder = RoomMike.MicUpFromMicApplyInviteRequest.newBuilder();
        builderNewBuilder.setRoomId(OooO00o.f24516OooO0o0.OooO0o0());
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        builderNewBuilder.setUserId(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
        Pair pair = (Pair) OooO00o.f24517OooO0oO.f48580OooO0o.getValue();
        builderNewBuilder.setInviter((pair == null || (roomUserInfoModel = (RoomUserInfoModel) pair.getFirst()) == null || (userId = roomUserInfoModel.getUserId()) == null) ? 0L : userId.getValue().longValue());
        builderNewBuilder.setYesOrNo(z ? 1 : 2);
        builderNewBuilder.setFromApplyMicList(z2);
        RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooO0oo(1001105, builderNewBuilder.build().toByteArray());
        }
        Long l = (Long) o0O00oO0.OooOOo0().getValue();
        String str = "Hold_MIC_" + l;
        SharedPreferences sharedPreferences = o0O0oo0o.OooO00o().f48377OooO00o;
        if ((sharedPreferences != null ? sharedPreferences.getInt(str, 0) : 0) == 0) {
            o00000.OooO00o("AFEventMic", null);
            o0O0oo0o.OooO00o().OooO0OO(1, "Hold_MIC_" + l);
        }
    }

    public static void OooO0O0(int i, @NotNull String userIdx, @NotNull String roomId, @NotNull String invitefalg) {
        Intrinsics.checkNotNullParameter(userIdx, "userIdx");
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(invitefalg, "invitefalg");
        String str = "{\"userid\":" + userIdx + ",\"barid\":" + roomId + ",\"dues\":" + i + ",\"invitefalg\":" + invitefalg + "}";
        RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooO0oO(10042, str);
        }
    }

    @JvmOverloads
    public static void OooO0OO(@Nullable String str, @Nullable oOo00ooO ooo00ooo, @Nullable RoomMessageReplyInfo roomMessageReplyInfo) {
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (ooo00ooo != null) {
            int i = ooo00ooo.f56181OooO0o;
            String str2 = ooo00ooo.f56180OooO0Oo;
            if (i == 40) {
                map.put("atHead", "@" + str2);
                map.put("type", Integer.valueOf(ooo00ooo.f56181OooO0o));
            } else if (i == 39) {
                map.put("atHead", "@" + str2);
                map.put("type", Integer.valueOf(ooo00ooo.f56181OooO0o));
            } else {
                AtUserInfoModel atUserInfoModel = new AtUserInfoModel();
                atUserInfoModel.setUserid(ooo00ooo.f56182OooO0o0);
                atUserInfoModel.setUsername(str2);
                arrayList.add(atUserInfoModel);
            }
        }
        map.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, str);
        map.put("lang", OooOo00.OooO0O0());
        map.put("aites", arrayList);
        if (roomMessageReplyInfo != null) {
            map.put("replyinfo", roomMessageReplyInfo);
        }
        RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooO0oO(10003, oOOO00.OooO0OO(map));
        }
    }
}
