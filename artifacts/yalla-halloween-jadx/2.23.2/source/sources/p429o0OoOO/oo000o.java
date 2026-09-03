package p429o0OoOO;

import androidx.lifecycle.Observer;
import com.code.android.util.OooOo00;
import com.common.support.roomgiftplayer.VideoModel;
import com.common.support.roomgiftplayer.VideoType;
import com.yalla.yalla.model.RoomGiftCombineGiftInfo;
import com.yalla.yalla.model.RoomGiftCustomModel;
import com.yalla.yalla.model.RoomGiftModel;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import p041Ooooo0o.o00000;
import p187o00o00o0.OooO;
import p511o0o0O.o00000OO;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oo000o implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f46826OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f46827OooO0o0;

    public /* synthetic */ oo000o(Object obj, int i) {
        this.f46826OooO0Oo = i;
        this.f46827OooO0o0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f46826OooO0Oo;
        Object obj2 = this.f46827OooO0o0;
        switch (i) {
            case 0:
                o0ooOOo this$0 = (o0ooOOo) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (obj instanceof RoomGiftModel) {
                    o0000O00.OooO0O0("RoomEffectGiftPlayer giftModel = ".concat(OooO.OooO00o(obj)));
                    RoomGiftModel roomGiftModel = (RoomGiftModel) obj;
                    if (this$0.f46823OooO00o.f22280OooO0oO) {
                        if (!OooOo00.OooO0O0(roomGiftModel.getCustomGiftInfo())) {
                            int giftid = roomGiftModel.getGiftid();
                            int effectFrameType = roomGiftModel.getEffectFrameType();
                            int number = roomGiftModel.getNumber();
                            String effectUrl = roomGiftModel.getEffectUrl();
                            RoomGiftCombineGiftInfo combineGiftInfo = roomGiftModel.getCombineGiftInfo();
                            o0ooOOo.OooO00o(this$0, giftid, effectFrameType, number, effectUrl, combineGiftInfo != null ? combineGiftInfo.transformToGiftPlayReplaceInfo() : null, false, 32);
                            break;
                        } else {
                            int giftid2 = roomGiftModel.getGiftid();
                            int number2 = roomGiftModel.getNumber();
                            RoomGiftCustomModel customGiftInfo = roomGiftModel.getCustomGiftInfo();
                            StringBuilder sbOooO00o = o00000.OooO00o("addEffectGiftCustomMade giftId = ", giftid2, "  times = ", number2, "  customGiftInfo = ");
                            sbOooO00o.append(customGiftInfo);
                            o0000O00.OooO0OO("RoomEffectGiftPlayer", sbOooO00o.toString());
                            if (customGiftInfo != null) {
                                if (number2 < 1) {
                                    number2 = 1;
                                }
                                String customSkinUrl = customGiftInfo.getCustomSkinUrl();
                                if (customSkinUrl == null) {
                                    customSkinUrl = "";
                                }
                                this$0.f46824OooO0O0.addItem(new VideoModel(customSkinUrl, VideoType.Svga, number2 - 1, customGiftInfo.transformToGiftPlayReplaceInfo()));
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                RoomLiveService this$1 = (RoomLiveService) obj2;
                RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                o0000O00.OooO0OO("RoomLiveService", "Room_State_Disconnect");
                this$1.OooO0o0();
                this$1.OooO0O0();
                break;
            case 2:
                TopicDetailActivity this$2 = (TopicDetailActivity) obj2;
                Long l = (Long) obj;
                int i2 = TopicDetailActivity.f25854OooOoOO;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                TopicInfoModel value = this$2.OooOoo0().getTopicDetailLocal().getValue();
                if (Intrinsics.areEqual(value != null ? Long.valueOf(value.getId()) : null, l)) {
                    this$2.OooOoo0().isFollow().setValue(Boolean.TRUE);
                }
                break;
            default:
                o00000OO this$3 = (o00000OO) obj2;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                this$3.OooOo(!((Boolean) obj).booleanValue());
                break;
        }
    }
}
