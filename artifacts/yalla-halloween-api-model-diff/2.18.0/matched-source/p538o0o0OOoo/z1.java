package p538o0o0OOoo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.app.base.model.RoomModel;
import com.yalla.yalla.common.db.table.SystemMessage;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.common.manager.data.SharedUrlManager;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.message.SystemMessageActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.room.RoomThemeMineActivity;
import com.yalla.yalla.ui.activity.store.PurchaseTopCardActivity;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.activity.user.VipActivity;
import com.yalla.yalla.ui.screen.event.EventDetailScreen;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000O00O.OooO0OO;
import p466o0Ooo0oO.o0000O0O;
import p500o0o00Oo0.OooOOO;
import p532o0o0OOO.o00OO000;
import p586o0oOoo.o000O;
import p602o0oo00OO.o0000O;
import p608o0oo0O.OooOo;

/* JADX INFO: loaded from: classes2.dex */
public final class z1 extends Lambda implements Function3<o0000O0O<SystemMessage>, View, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ SystemMessageActivity f43912Oooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(SystemMessageActivity systemMessageActivity) {
        super(3);
        this.f43912Oooo = systemMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(o0000O0O<SystemMessage> o0000o0o2, View view, Integer num) {
        Long eventId;
        Long roomId;
        o0000O0O<SystemMessage> adapter = o0000o0o2;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        SystemMessage data = adapter.getData(iIntValue);
        int type = data.getType();
        if (type == 1) {
            PremiumActivity.OooO00o oooO00o = PremiumActivity.f23379o0Oo0oo;
            SystemMessageActivity systemMessageActivity = this.f43912Oooo;
            PremiumLevel.Companion companion = PremiumLevel.INSTANCE;
            SystemMessage.PremiumInfo vipInfo = data.getVipInfo();
            oooO00o.OooO00o(systemMessageActivity, companion.OooO00o(Integer.valueOf(vipInfo != null ? vipInfo.getVipLevel() : PremiumLevel.Premium1.getValue())));
        } else if (type == 2) {
            TopicInfoModel topicInfoModel = new TopicInfoModel();
            SystemMessage.JoinTopicInfo joinTopicInfo = data.getJoinTopicInfo();
            topicInfoModel.setId(joinTopicInfo != null ? joinTopicInfo.getJoinTopicId() : 0L);
            TopicDetailActivity.f22586o00Oo0.OooO00o(this.f43912Oooo, topicInfoModel);
        } else if (type == 3) {
            SystemMessage.TopicStateInfo topicStateInfo = data.getTopicStateInfo();
            if (topicStateInfo != null && topicStateInfo.getTopicType() == 1) {
                TopicInfoModel topicInfoModel2 = new TopicInfoModel();
                SystemMessage.TopicStateInfo topicStateInfo2 = data.getTopicStateInfo();
                topicInfoModel2.setId(topicStateInfo2 != null ? topicStateInfo2.getTopicId() : 0L);
                TopicDetailActivity.f22586o00Oo0.OooO00o(this.f43912Oooo, topicInfoModel2);
            }
        } else if (type == 7) {
            MutableLiveData<String> roomBonusUrl = SharedUrlManager.INSTANCE.getRoomBonusUrl();
            SystemMessageActivity systemMessageActivity2 = this.f43912Oooo;
            roomBonusUrl.observe(systemMessageActivity2, new x1(systemMessageActivity2));
        } else if (type == 25) {
            VipActivity.OooO0O0 oooO0O0 = VipActivity.f23589OoooOoo;
            SystemMessageActivity systemMessageActivity3 = this.f43912Oooo;
            VipLevel.Companion companion2 = VipLevel.INSTANCE;
            SystemMessage.VipMsgInfo kaVipMsgInfo = adapter.getData(iIntValue).getKaVipMsgInfo();
            oooO0O0.OooO00o(systemMessageActivity3, companion2.OooO0O0(kaVipMsgInfo != null ? kaVipMsgInfo.getKaVipLevel() : 0));
        } else if (type == 31) {
            SystemMessage.EventInfo eventInfo = adapter.getData(iIntValue).getEventInfo();
            if (eventInfo != null && (eventId = eventInfo.getEventId()) != null) {
                long jLongValue = eventId.longValue();
                EventModel model = new EventModel();
                model.setId(jLongValue);
                Intrinsics.checkNotNullParameter(model, "model");
                Bundle bundleOooO00o = OooO0OO.OooO00o();
                bundleOooO00o.putSerializable("key", model);
                o000O.OooO00o(EventDetailScreen.f24587OooO00o, bundleOooO00o);
            }
        } else if (type == 27 || type == 28) {
            SystemMessage.EventInfo eventInfo2 = adapter.getData(iIntValue).getEventInfo();
            if (eventInfo2 != null && (roomId = eventInfo2.getRoomId()) != null) {
                RoomStateManager.enterRoom$default(RoomStateManager.INSTANCE, roomId.longValue(), (EnterRoomParentPage) null, 2, (Object) null);
            }
        } else if (type == 36) {
            OooOo.OooO0O0("102053");
            SystemMessage.MemberBadgeFrozenInfo memberBadgeFrozenInfo = adapter.getData(iIntValue).getMemberBadgeFrozenInfo();
            if (memberBadgeFrozenInfo != null) {
                RoomModel roomModel = new RoomModel();
                Long roomId2 = memberBadgeFrozenInfo.getRoomId();
                if (roomId2 != null) {
                    roomModel.setId(roomId2.longValue());
                    roomModel.setName(memberBadgeFrozenInfo.getRoomName());
                    RoomStateManager.enterRoom$default(RoomStateManager.INSTANCE, roomModel, (EnterRoomParentPage) null, 2, (Object) null);
                    o00OO000 o00oo001 = o00OO000.f43171OooO00o;
                    o00OO000.f43213OoooO0.setValue(Boolean.TRUE);
                }
            }
        } else if (type != 37) {
            switch (type) {
                case 11:
                case 15:
                case 17:
                    PremiumActivity.OooO00o oooO00o2 = PremiumActivity.f23379o0Oo0oo;
                    SystemMessageActivity systemMessageActivity4 = this.f43912Oooo;
                    PremiumLevel.Companion companion3 = PremiumLevel.INSTANCE;
                    Pair<Boolean, Integer> value = OooOOO.f41235OooO00o.OooOOO0().getValue();
                    oooO00o2.OooO00o(systemMessageActivity4, companion3.OooO00o(Integer.valueOf(value != null ? value.getSecond().intValue() : PremiumLevel.Premium1.getValue())));
                    break;
                case 12:
                    SharedUrlManager.INSTANCE.getPrettyUserIdUrl().observe(this.f43912Oooo, new y1());
                    break;
                case 13:
                case 14:
                    this.f43912Oooo.startActivity(new Intent(this.f43912Oooo, (Class<?>) PurchaseTopCardActivity.class));
                    break;
                case 16:
                    o000O.OooO00o(o0000O.f48025OooO00o, null);
                    break;
                default:
                    switch (type) {
                        case 19:
                            SystemMessageActivity.OooOoo(this.f43912Oooo, false);
                            break;
                        case 20:
                            SystemMessageActivity.OooOoo(this.f43912Oooo, true);
                            break;
                        case 21:
                            SystemMessage.TreasureBox treasureBox = adapter.getData(iIntValue).getTreasureBox();
                            if (treasureBox != null && treasureBox.getAwardType() == 1) {
                                RoomThemeMineActivity.OooO00o oooO00o3 = RoomThemeMineActivity.f23012Ooooooo;
                                RoomThemeMineActivity.f23012Ooooooo.OooO00o(this.f43912Oooo, RoomThemeMineActivity.ThemeType.Mine);
                            }
                            break;
                        case 22:
                            RoomThemeMineActivity.f23012Ooooooo.OooO00o(this.f43912Oooo, RoomThemeMineActivity.ThemeType.Customize);
                            break;
                    }
                    break;
            }
        } else {
            RoomThemeMineActivity.OooO00o oooO00o4 = RoomThemeMineActivity.f23012Ooooooo;
            RoomThemeMineActivity.f23012Ooooooo.OooO00o(this.f43912Oooo, RoomThemeMineActivity.ThemeType.Mine);
        }
        return Unit.INSTANCE;
    }
}
