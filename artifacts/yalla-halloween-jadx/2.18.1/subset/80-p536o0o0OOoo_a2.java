package p536o0o0OOoo;

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
import p464o0Ooo0oO.o0000O0O;
import p498o0o00Oo0.OooOOO;
import p530o0o0OOO.o00O;
import p584o0oOoo.o000O;
import p600o0oo00OO.o0000O;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes2.dex */
public final class a2 extends Lambda implements Function3<o0000O0O<SystemMessage>, View, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ SystemMessageActivity f43749Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(SystemMessageActivity systemMessageActivity) {
        super(3);
        this.f43749Oooo0o = systemMessageActivity;
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
            PremiumActivity.OooO00o oooO00o = PremiumActivity.f23360o0ooOOo;
            SystemMessageActivity systemMessageActivity = this.f43749Oooo0o;
            PremiumLevel.Companion companion = PremiumLevel.INSTANCE;
            SystemMessage.PremiumInfo vipInfo = data.getVipInfo();
            oooO00o.OooO00o(systemMessageActivity, companion.OooO00o(Integer.valueOf(vipInfo != null ? vipInfo.getVipLevel() : PremiumLevel.Premium1.getValue())));
        } else if (type == 2) {
            TopicInfoModel topicInfoModel = new TopicInfoModel();
            SystemMessage.JoinTopicInfo joinTopicInfo = data.getJoinTopicInfo();
            topicInfoModel.setId(joinTopicInfo != null ? joinTopicInfo.getJoinTopicId() : 0L);
            TopicDetailActivity.f22567o0OoOo0.OooO00o(this.f43749Oooo0o, topicInfoModel);
        } else if (type == 3) {
            SystemMessage.TopicStateInfo topicStateInfo = data.getTopicStateInfo();
            if (topicStateInfo != null && topicStateInfo.getTopicType() == 1) {
                TopicInfoModel topicInfoModel2 = new TopicInfoModel();
                SystemMessage.TopicStateInfo topicStateInfo2 = data.getTopicStateInfo();
                topicInfoModel2.setId(topicStateInfo2 != null ? topicStateInfo2.getTopicId() : 0L);
                TopicDetailActivity.f22567o0OoOo0.OooO00o(this.f43749Oooo0o, topicInfoModel2);
            }
        } else if (type == 7) {
            MutableLiveData<String> roomBonusUrl = SharedUrlManager.INSTANCE.getRoomBonusUrl();
            SystemMessageActivity systemMessageActivity2 = this.f43749Oooo0o;
            roomBonusUrl.observe(systemMessageActivity2, new y1(systemMessageActivity2));
        } else if (type == 25) {
            VipActivity.OooO0O0 oooO0O0 = VipActivity.f23570OoooOOo;
            SystemMessageActivity systemMessageActivity3 = this.f43749Oooo0o;
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
                o000O.OooO00o(EventDetailScreen.f24568OooO00o, bundleOooO00o);
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
                    o00O o00o2 = o00O.f43140OooO00o;
                    o00O.f43182OoooO0.setValue(Boolean.TRUE);
                }
            }
        } else if (type != 37) {
            switch (type) {
                case 11:
                case 15:
                case 17:
                    PremiumActivity.OooO00o oooO00o2 = PremiumActivity.f23360o0ooOOo;
                    SystemMessageActivity systemMessageActivity4 = this.f43749Oooo0o;
                    PremiumLevel.Companion companion3 = PremiumLevel.INSTANCE;
                    Pair<Boolean, Integer> value = OooOOO.f41216OooO00o.OooOOO0().getValue();
                    oooO00o2.OooO00o(systemMessageActivity4, companion3.OooO00o(Integer.valueOf(value != null ? value.getSecond().intValue() : PremiumLevel.Premium1.getValue())));
                    break;
                case 12:
                    SharedUrlManager.INSTANCE.getPrettyUserIdUrl().observe(this.f43749Oooo0o, new z1());
                    break;
                case 13:
                case 14:
                    this.f43749Oooo0o.startActivity(new Intent(this.f43749Oooo0o, (Class<?>) PurchaseTopCardActivity.class));
                    break;
                case 16:
                    o000O.OooO00o(o0000O.f48009OooO00o, null);
                    break;
                default:
                    switch (type) {
                        case 19:
                            SystemMessageActivity.OooOoo(this.f43749Oooo0o, false);
                            break;
                        case 20:
                            SystemMessageActivity.OooOoo(this.f43749Oooo0o, true);
                            break;
                        case 21:
                            SystemMessage.TreasureBox treasureBox = adapter.getData(iIntValue).getTreasureBox();
                            if (treasureBox != null && treasureBox.getAwardType() == 1) {
                                RoomThemeMineActivity.OooO00o oooO00o3 = RoomThemeMineActivity.f22993Oooooo0;
                                RoomThemeMineActivity.f22993Oooooo0.OooO00o(this.f43749Oooo0o, RoomThemeMineActivity.ThemeType.Mine);
                            }
                            break;
                        case 22:
                            RoomThemeMineActivity.f22993Oooooo0.OooO00o(this.f43749Oooo0o, RoomThemeMineActivity.ThemeType.Customize);
                            break;
                    }
                    break;
            }
        } else {
            RoomThemeMineActivity.OooO00o oooO00o4 = RoomThemeMineActivity.f22993Oooooo0;
            RoomThemeMineActivity.f22993Oooooo0.OooO00o(this.f43749Oooo0o, RoomThemeMineActivity.ThemeType.Mine);
        }
        return Unit.INSTANCE;
    }
}
