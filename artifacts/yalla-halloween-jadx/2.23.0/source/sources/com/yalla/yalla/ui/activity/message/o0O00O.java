package com.yalla.yalla.ui.activity.message;

import android.content.Intent;
import android.view.View;
import com.yalla.yalla.data.db.table.SystemMessage;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.model.gift.GiftPropTypeUser;
import com.yalla.yalla.model.room.RoomModel;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.store.PurchaseSkillCardActivity;
import com.yalla.yalla.ui.activity.store.PurchaseTopCardActivity;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.screen.store.StoreChatBubbleMineScreen;
import com.yalla.yalla.ui.screen.user.HeaderFrameScreen;
import com.yalla.yalla.ui.screen.user.MyOutfitScreen;
import com.yalla.yalla.ui.screen.user.RoomThemePageType;
import com.yalla.yalla.ui.screen.user.vip.VipScreen;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p579o0oOoo.oOO0OoO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00O extends Lambda implements Function3<p400o0Oo0OO.OooOO0O<SystemMessage>, View, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SystemMessageActivity f25933OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00O(SystemMessageActivity systemMessageActivity) {
        super(3);
        this.f25933OooO0Oo = systemMessageActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(p400o0Oo0OO.OooOO0O<SystemMessage> oooOO0O, View view, Integer num) {
        Long eventId;
        Long roomId;
        p400o0Oo0OO.OooOO0O<SystemMessage> adapter = oooOO0O;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        SystemMessage data = adapter.getData(iIntValue);
        int type = data.getType();
        SystemMessageActivity systemMessageActivity = this.f25933OooO0Oo;
        if (type == 1) {
            int i = PremiumActivity.f27140Oooo0oO;
            PremiumLevel.Companion companion = PremiumLevel.INSTANCE;
            SystemMessage.PremiumInfo vipInfo = data.getVipInfo();
            PremiumActivity.OooO00o.OooO00o(systemMessageActivity, companion.of(Integer.valueOf(vipInfo != null ? vipInfo.getVipLevel() : PremiumLevel.Premium1.getValue())));
        } else if (type == 2) {
            TopicInfoModel topicInfoModel = new TopicInfoModel();
            SystemMessage.JoinTopicInfo joinTopicInfo = data.getJoinTopicInfo();
            topicInfoModel.setId(joinTopicInfo != null ? joinTopicInfo.getJoinTopicId() : 0L);
            int i2 = TopicDetailActivity.f26305OooOoOO;
            TopicDetailActivity.OooO00o.OooO00o(systemMessageActivity, topicInfoModel);
        } else if (type == 3) {
            SystemMessage.TopicStateInfo topicStateInfo = data.getTopicStateInfo();
            if (topicStateInfo != null && topicStateInfo.getTopicType() == 1) {
                TopicInfoModel topicInfoModel2 = new TopicInfoModel();
                SystemMessage.TopicStateInfo topicStateInfo2 = data.getTopicStateInfo();
                topicInfoModel2.setId(topicStateInfo2 != null ? topicStateInfo2.getTopicId() : 0L);
                int i3 = TopicDetailActivity.f26305OooOoOO;
                TopicDetailActivity.OooO00o.OooO00o(systemMessageActivity, topicInfoModel2);
            }
        } else if (type != 7) {
            p560o0oOo000.o00000O0 o00000o1 = null;
            if (type == 25) {
                SystemMessage.VipMsgInfo kaVipMsgInfo = adapter.getData(iIntValue).getKaVipMsgInfo();
                int kaVipLevel = kaVipMsgInfo != null ? kaVipMsgInfo.getKaVipLevel() : VipLevel.Vip0.getValue();
                SystemMessage.VipMsgInfo kaVipMsgInfo2 = data.getKaVipMsgInfo();
                if (!(kaVipMsgInfo2 != null && kaVipMsgInfo2.getKaVipType() == 2) || kaVipLevel <= VipLevel.Vip0.getValue()) {
                    VipScreen.navigate$default(VipScreen.INSTANCE, VipLevel.INSTANCE.of(kaVipLevel), false, 2, null);
                } else {
                    VipScreen.navigate$default(VipScreen.INSTANCE, VipLevel.INSTANCE.of(kaVipLevel - VipLevel.Vip1.getValue()), false, 2, null);
                }
            } else if (type == 31) {
                SystemMessage.EventInfo eventInfo = adapter.getData(iIntValue).getEventInfo();
                if (eventInfo != null && (eventId = eventInfo.getEventId()) != null) {
                    long jLongValue = eventId.longValue();
                    EventModel eventModel = new EventModel();
                    eventModel.setId(jLongValue);
                    p560o0oOo000.o00000O0 o00000o2 = p560o0oOo000.o0000OO0.f56183OooO0O0;
                    if (o00000o2 != null) {
                        o00000o1 = o00000o2;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("event");
                    }
                    o00000o1.OooO0o(eventModel);
                }
            } else if (type != 88) {
                if (type != 27 && type != 28) {
                    switch (type) {
                        case 11:
                        case 15:
                        case 17:
                            int i4 = PremiumActivity.f27140Oooo0oO;
                            PremiumLevel.Companion companion2 = PremiumLevel.INSTANCE;
                            p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
                            Pair pair = (Pair) p464o0Oooo.o000000O.OooOO0o().getValue();
                            PremiumActivity.OooO00o.OooO00o(systemMessageActivity, companion2.of(Integer.valueOf(pair != null ? ((Number) pair.getSecond()).intValue() : PremiumLevel.Premium1.getValue())));
                            break;
                        case 12:
                            p402o0Oo0OOO.o00O000o.f44500OooOO0o.observe(systemMessageActivity, new SystemMessageActivity.OooO00o(o0O00O0o.f25934OooO0Oo));
                            break;
                        case 13:
                        case 14:
                            systemMessageActivity.startActivity(new Intent(systemMessageActivity, (Class<?>) PurchaseTopCardActivity.class));
                            break;
                        case 16:
                            p526o0o0OOO0.oo0oOO0.OooO0o0(HeaderFrameScreen.INSTANCE, null, false, null, 14);
                            break;
                        default:
                            switch (type) {
                                case 19:
                                    SystemMessageActivity.OooOo(systemMessageActivity, false);
                                    break;
                                case 20:
                                    SystemMessageActivity.OooOo(systemMessageActivity, true);
                                    break;
                                case 21:
                                    SystemMessage.TreasureBox treasureBox = adapter.getData(iIntValue).getTreasureBox();
                                    if (treasureBox != null && treasureBox.getAwardType() == 1) {
                                        MyOutfitScreen.navigate$default(MyOutfitScreen.INSTANCE, 3, null, false, 6, null);
                                    }
                                    break;
                                case 22:
                                    MyOutfitScreen.navigate$default(MyOutfitScreen.INSTANCE, 3, RoomThemePageType.Custom, false, 4, null);
                                    break;
                                default:
                                    switch (type) {
                                        case 36:
                                            p587o0oOooo.o0OO000.OooO00o("102053");
                                            SystemMessage.MemberBadgeFrozenInfo memberBadgeFrozenInfo = adapter.getData(iIntValue).getMemberBadgeFrozenInfo();
                                            if (memberBadgeFrozenInfo != null) {
                                                RoomModel roomModel = new RoomModel();
                                                Long roomId2 = memberBadgeFrozenInfo.getRoomId();
                                                if (roomId2 != null) {
                                                    roomModel.setId(roomId2.longValue());
                                                    oOO0OoO0.OooO00o(null, null, Long.valueOf(roomModel.getId()), 3);
                                                    com.yalla.yalla.service.room.OooO00o.f24986OooOOOO.f47530OooOoO0.setValue(Boolean.TRUE);
                                                }
                                            }
                                            break;
                                        case 37:
                                            MyOutfitScreen.navigate$default(MyOutfitScreen.INSTANCE, 3, null, false, 6, null);
                                            break;
                                        case 38:
                                            SystemMessage.GiftBackpackExpired giftBackpackExpired = data.getGiftBackpackExpired();
                                            if (giftBackpackExpired != null) {
                                                oOO0OoO0.OooO00o(Integer.valueOf(com.code.android.util.o0OoOo0.OooO0oO(giftBackpackExpired.getDyid())), GiftPropTypeUser.Backpack, null, 4);
                                            }
                                            break;
                                        case 39:
                                            SystemMessage.GiftBlindTaskReward giftBlindTaskReward = data.getGiftBlindTaskReward();
                                            if (giftBlindTaskReward != null) {
                                                Integer awardtype = giftBlindTaskReward.getAwardtype();
                                                SystemMessage.AwardType awardType = SystemMessage.AwardType.INSTANCE;
                                                int chatBox = awardType.getChatBox();
                                                if (awardtype == null || awardtype.intValue() != chatBox) {
                                                    int headdressCard = awardType.getHeaddressCard();
                                                    if (awardtype == null || awardtype.intValue() != headdressCard) {
                                                        int backpackGift = awardType.getBackpackGift();
                                                        if (awardtype == null || awardtype.intValue() != backpackGift) {
                                                            int headPortraitBox = awardType.getHeadPortraitBox();
                                                            if (awardtype != null && awardtype.intValue() == headPortraitBox) {
                                                                p526o0o0OOO0.oo0oOO0.OooO0o0(HeaderFrameScreen.INSTANCE, null, false, null, 14);
                                                            }
                                                        } else {
                                                            oOO0OoO0.OooO00o(Integer.valueOf(com.code.android.util.o0OoOo0.OooO0oO(giftBlindTaskReward.getAwardId())), GiftPropTypeUser.Backpack, null, 4);
                                                        }
                                                    } else {
                                                        PurchaseSkillCardActivity.OooOo0(0, systemMessageActivity);
                                                    }
                                                } else {
                                                    p526o0o0OOO0.oo0oOO0.OooO0o0(StoreChatBubbleMineScreen.INSTANCE, null, false, null, 14);
                                                }
                                            }
                                            break;
                                        case 40:
                                            SystemMessage.GiftBlindRankingReward giftBlindRankingReward = data.getGiftBlindRankingReward();
                                            if (giftBlindRankingReward != null) {
                                                Integer awardtype2 = giftBlindRankingReward.getAwardtype();
                                                SystemMessage.AwardType awardType2 = SystemMessage.AwardType.INSTANCE;
                                                int chatBox2 = awardType2.getChatBox();
                                                if (awardtype2 == null || awardtype2.intValue() != chatBox2) {
                                                    int headdressCard2 = awardType2.getHeaddressCard();
                                                    if (awardtype2 == null || awardtype2.intValue() != headdressCard2) {
                                                        int backpackGift2 = awardType2.getBackpackGift();
                                                        if (awardtype2 == null || awardtype2.intValue() != backpackGift2) {
                                                            int headPortraitBox2 = awardType2.getHeadPortraitBox();
                                                            if (awardtype2 != null && awardtype2.intValue() == headPortraitBox2) {
                                                                p526o0o0OOO0.oo0oOO0.OooO0o0(HeaderFrameScreen.INSTANCE, null, false, null, 14);
                                                            }
                                                        } else {
                                                            oOO0OoO0.OooO00o(Integer.valueOf(com.code.android.util.o0OoOo0.OooO0oO(giftBlindRankingReward.getAwardId())), GiftPropTypeUser.Backpack, null, 4);
                                                        }
                                                    } else {
                                                        PurchaseSkillCardActivity.OooOo0(0, systemMessageActivity);
                                                    }
                                                } else {
                                                    p526o0o0OOO0.oo0oOO0.OooO0o0(StoreChatBubbleMineScreen.INSTANCE, null, false, null, 14);
                                                }
                                            }
                                            break;
                                        case 41:
                                            SystemMessage.Vip6DistributeSupremeGift vip6DistributeSupremeGift = data.getVip6DistributeSupremeGift();
                                            if (vip6DistributeSupremeGift != null) {
                                                oOO0OoO0.OooO00o(Integer.valueOf(com.code.android.util.o0OoOo0.OooO0oO(vip6DistributeSupremeGift.getPropId())), GiftPropTypeUser.Backpack, null, 4);
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    SystemMessage.EventInfo eventInfo2 = adapter.getData(iIntValue).getEventInfo();
                    if (eventInfo2 != null && (roomId = eventInfo2.getRoomId()) != null) {
                        oOO0OoO0.OooO00o(null, null, Long.valueOf(roomId.longValue()), 3);
                    }
                }
            } else if (data.getWealthLevelUpInfo() != null) {
                oOO0OoO0.OooO00o(null, null, null, 7);
            }
        } else {
            p402o0Oo0OOO.o00O000o.f44499OooOO0O.observe(systemMessageActivity, new SystemMessageActivity.OooO00o(new o0OoO00O(systemMessageActivity)));
        }
        return Unit.INSTANCE;
    }
}
