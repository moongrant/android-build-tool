package p476o0o0000o;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.colorspace.OooO0OO;
import com.android.billingclient.api.o0000OO0;
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
import p386o0OOooOo.o00O0O0O;
import p464o0Oooo.o000000O;
import p579o0oOoo.oOo00OO0;
import p585o0oOooOO.h;
import p591o0oo000O.OooO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0000O {
    /* JADX WARN: Multi-variable type inference failed */
    public static void OooO00o(boolean z, boolean z2) {
        RoomUserInfoModel roomUserInfoModel;
        MutableStateFlow<Long> userId;
        RoomMike.MicUpFromMicApplyInviteRequest.Builder builderNewBuilder = RoomMike.MicUpFromMicApplyInviteRequest.newBuilder();
        builderNewBuilder.setRoomId(OooO00o.f24978OooO0o0.OooO0o0());
        o000000O o000000o2 = o000000O.f46674OooO00o;
        builderNewBuilder.setUserId(((Number) OooO0OO.OooO0O0()).longValue());
        Pair pair = (Pair) OooO00o.f24979OooO0oO.f47375OooO0o.getValue();
        builderNewBuilder.setInviter((pair == null || (roomUserInfoModel = (RoomUserInfoModel) pair.getFirst()) == null || (userId = roomUserInfoModel.getUserId()) == null) ? 0L : userId.getValue().longValue());
        builderNewBuilder.setYesOrNo(z ? 1 : 2);
        builderNewBuilder.setFromApplyMicList(z2);
        RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooO0oo(1001105, builderNewBuilder.build().toByteArray());
        }
        Long l = (Long) o000000O.OooOOo0().getValue();
        String str = "Hold_MIC_" + l;
        SharedPreferences sharedPreferences = o0000OO0.OooO0O0().f47688OooO00o;
        if ((sharedPreferences != null ? sharedPreferences.getInt(str, 0) : 0) == 0) {
            o00O0O0O.OooO00o("AFEventMic", null);
            o0000OO0.OooO0O0().OooO0OO(1, "Hold_MIC_" + l);
        }
    }

    public static void OooO0O0(int i, @NotNull String userIdx, @NotNull String roomId, @NotNull String invitefalg) {
        Intrinsics.checkNotNullParameter(userIdx, "userIdx");
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(invitefalg, "invitefalg");
        String str = "{\"userid\":" + userIdx + ",\"barid\":" + roomId + ",\"dues\":" + i + ",\"invitefalg\":" + invitefalg + "}";
        RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooO0oO(10042, str);
        }
    }

    @JvmOverloads
    public static void OooO0OO(@Nullable String str, @Nullable h hVar, @Nullable RoomMessageReplyInfo roomMessageReplyInfo) {
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (hVar != null) {
            int i = hVar.f56770OooO0o;
            String str2 = hVar.f56769OooO0Oo;
            if (i == 40) {
                map.put("atHead", "@" + str2);
                map.put("type", Integer.valueOf(hVar.f56770OooO0o));
            } else if (i == 39) {
                map.put("atHead", "@" + str2);
                map.put("type", Integer.valueOf(hVar.f56770OooO0o));
            } else {
                AtUserInfoModel atUserInfoModel = new AtUserInfoModel();
                atUserInfoModel.setUserid(hVar.f56771OooO0o0);
                atUserInfoModel.setUsername(str2);
                arrayList.add(atUserInfoModel);
            }
        }
        map.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, str);
        map.put("lang", OooO.OooO0O0());
        map.put("aites", arrayList);
        if (roomMessageReplyInfo != null) {
            map.put("replyinfo", roomMessageReplyInfo);
        }
        RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooO0oO(10003, oOo00OO0.OooO0OO(map));
        }
    }
}
