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
import p590o0oOooo0.n0;
import p643o0ooOOOO.h3;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00O extends Lambda implements Function3<h3<SystemMessage>, View, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SystemMessageActivity f25491OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00O(SystemMessageActivity systemMessageActivity) {
        super(3);
        this.f25491OooO0Oo = systemMessageActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(h3<SystemMessage> h3Var, View view, Integer num) {
        Long eventId;
        Long roomId;
        h3<SystemMessage> adapter = h3Var;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        SystemMessage data = adapter.getData(iIntValue);
        int type = data.getType();
        SystemMessageActivity systemMessageActivity = this.f25491OooO0Oo;
        if (type == 1) {
            int i = PremiumActivity.f26673Oooo0oO;
            PremiumLevel.Companion companion = PremiumLevel.INSTANCE;
            SystemMessage.PremiumInfo vipInfo = data.getVipInfo();
            PremiumActivity.OooO00o.OooO00o(systemMessageActivity, companion.of(Integer.valueOf(vipInfo != null ? vipInfo.getVipLevel() : PremiumLevel.Premium1.getValue())));
        } else if (type == 2) {
            TopicInfoModel topicInfoModel = new TopicInfoModel();
            SystemMessage.JoinTopicInfo joinTopicInfo = data.getJoinTopicInfo();
            topicInfoModel.setId(joinTopicInfo != null ? joinTopicInfo.getJoinTopicId() : 0L);
            int i2 = TopicDetailActivity.f25854OooOoOO;
            TopicDetailActivity.OooO00o.OooO00o(systemMessageActivity, topicInfoModel);
        } else if (type == 3) {
            SystemMessage.TopicStateInfo topicStateInfo = data.getTopicStateInfo();
            if (topicStateInfo != null && topicStateInfo.getTopicType() == 1) {
                TopicInfoModel topicInfoModel2 = new TopicInfoModel();
                SystemMessage.TopicStateInfo topicStateInfo2 = data.getTopicStateInfo();
                topicInfoModel2.setId(topicStateInfo2 != null ? topicStateInfo2.getTopicId() : 0L);
                int i3 = TopicDetailActivity.f25854OooOoOO;
                TopicDetailActivity.OooO00o.OooO00o(systemMessageActivity, topicInfoModel2);
            }
        } else if (type != 7) {
            p569o0oOo0o0.o0OOO0o o0ooo0o2 = null;
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
                    p569o0oOo0o0.o0OOO0o o0ooo0o3 = p569o0oOo0o0.o00000OO.f56399OooO0O0;
                    if (o0ooo0o3 != null) {
                        o0ooo0o2 = o0ooo0o3;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("event");
                    }
                    o0ooo0o2.OooO0o(eventModel);
                }
            } else if (type != 88) {
                if (type != 27 && type != 28) {
                    switch (type) {
                        case 11:
                        case 15:
                        case 17:
                            int i4 = PremiumActivity.f26673Oooo0oO;
                            PremiumLevel.Companion companion2 = PremiumLevel.INSTANCE;
                            p475o0Ooooo0.o0O00oO0 o0o00oo1 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
                            Pair pair = (Pair) p475o0Ooooo0.o0O00oO0.OooOO0o().getValue();
                            PremiumActivity.OooO00o.OooO00o(systemMessageActivity, companion2.of(Integer.valueOf(pair != null ? ((Number) pair.getSecond()).intValue() : PremiumLevel.Premium1.getValue())));
                            break;
                        case 12:
                            p583o0oOoo00.o00000OO.f56669OooOO0o.observe(systemMessageActivity, new SystemMessageActivity.OooO00o(o0O00O0o.f25492OooO0Oo));
                            break;
                        case 13:
                        case 14:
                            systemMessageActivity.startActivity(new Intent(systemMessageActivity, (Class<?>) PurchaseTopCardActivity.class));
                            break;
                        case 16:
                            p532o0o0OOo0.o00O00.OooO0o0(HeaderFrameScreen.INSTANCE, null, false, null, 14);
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
                                            o0oo0000.OooO00o.OooO0O0("102053");
                                            SystemMessage.MemberBadgeFrozenInfo memberBadgeFrozenInfo = adapter.getData(iIntValue).getMemberBadgeFrozenInfo();
                                            if (memberBadgeFrozenInfo != null) {
                                                RoomModel roomModel = new RoomModel();
                                                Long roomId2 = memberBadgeFrozenInfo.getRoomId();
                                                if (roomId2 != null) {
                                                    roomModel.setId(roomId2.longValue());
                                                    n0.OooO00o(null, null, Long.valueOf(roomModel.getId()), 3);
                                                    com.yalla.yalla.service.room.OooO00o.f24524OooOOOO.f48543OooOoO0.setValue(Boolean.TRUE);
                                                }
                                            }
                                            break;
                                        case 37:
                                            MyOutfitScreen.navigate$default(MyOutfitScreen.INSTANCE, 3, null, false, 6, null);
                                            break;
                                        case 38:
                                            SystemMessage.GiftBackpackExpired giftBackpackExpired = data.getGiftBackpackExpired();
                                            if (giftBackpackExpired != null) {
                                                n0.OooO00o(Integer.valueOf(com.code.android.util.o0OoOo0.OooO0oO(giftBackpackExpired.getDyid())), GiftPropTypeUser.Backpack, null, 4);
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
                                                                p532o0o0OOo0.o00O00.OooO0o0(HeaderFrameScreen.INSTANCE, null, false, null, 14);
                                                            }
                                                        } else {
                                                            n0.OooO00o(Integer.valueOf(com.code.android.util.o0OoOo0.OooO0oO(giftBlindTaskReward.getAwardId())), GiftPropTypeUser.Backpack, null, 4);
                                                        }
                                                    } else {
                                                        PurchaseSkillCardActivity.OooOo0(0, systemMessageActivity);
                                                    }
                                                } else {
                                                    p532o0o0OOo0.o00O00.OooO0o0(StoreChatBubbleMineScreen.INSTANCE, null, false, null, 14);
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
                                                                p532o0o0OOo0.o00O00.OooO0o0(HeaderFrameScreen.INSTANCE, null, false, null, 14);
                                                            }
                                                        } else {
                                                            n0.OooO00o(Integer.valueOf(com.code.android.util.o0OoOo0.OooO0oO(giftBlindRankingReward.getAwardId())), GiftPropTypeUser.Backpack, null, 4);
                                                        }
                                                    } else {
                                                        PurchaseSkillCardActivity.OooOo0(0, systemMessageActivity);
                                                    }
                                                } else {
                                                    p532o0o0OOo0.o00O00.OooO0o0(StoreChatBubbleMineScreen.INSTANCE, null, false, null, 14);
                                                }
                                            }
                                            break;
                                        case 41:
                                            SystemMessage.Vip6DistributeSupremeGift vip6DistributeSupremeGift = data.getVip6DistributeSupremeGift();
                                            if (vip6DistributeSupremeGift != null) {
                                                n0.OooO00o(Integer.valueOf(com.code.android.util.o0OoOo0.OooO0oO(vip6DistributeSupremeGift.getPropId())), GiftPropTypeUser.Backpack, null, 4);
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
                        n0.OooO00o(null, null, Long.valueOf(roomId.longValue()), 3);
                    }
                }
            } else if (data.getWealthLevelUpInfo() != null) {
                n0.OooO00o(null, null, null, 7);
            }
        } else {
            p583o0oOoo00.o00000OO.f56668OooOO0O.observe(systemMessageActivity, new SystemMessageActivity.OooO00o(new o0OoO00O(systemMessageActivity)));
        }
        return Unit.INSTANCE;
    }
}
