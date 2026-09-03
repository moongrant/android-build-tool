package p409o0Oo0Oo;

import androidx.compose.material.OooO;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.table.SystemMessage;
import p110o000ooo0.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0o extends o0OO00O<SystemMessage> {
    public o0OO0o(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // p110o000ooo0.o000O0o
    public final String OooO0OO() {
        return "INSERT OR IGNORE INTO `SystemMessageTable` (`mid`,`type`,`message`,`time`,`uid`,`isRead`,`vipLevel`,`awardType`,`treasureBoxNumber`,`treasureBoxImageUrl`,`kaVipType`,`kaVipLevel`,`rewardCoin`,`messageType`,`MemberBadgeFrozenInfo_roomId`,`MemberBadgeFrozenInfo_roomName`,`MemberBadgeTopRankReward_shopId`,`MemberBadgeTopRankReward_shopUrl`,`GiftBackpackExpired_dyid`,`GiftBackpackExpired_headurl`,`GiftBackpackExpired_sex`,`GiftBackpackExpired_ispraise`,`GiftBackpackExpired_level`,`GiftBackpackExpired_coin`,`GiftBackpackExpired_upcrystal`,`GiftBackpackExpired_language`,`GiftBackpackExpired_nickname`,`GiftBackpackExpired_dyurl`,`GiftBlindTaskReward_awardtype`,`GiftBlindTaskReward_awardcount`,`GiftBlindTaskReward_awardId`,`GiftBlindTaskReward_awardimage`,`GiftBlindRankingReward_toprank`,`GiftBlindRankingReward_toptype`,`GiftBlindRankingReward_awardtype`,`GiftBlindRankingReward_awardcount`,`GiftBlindRankingReward_awardId`,`GiftBlindRankingReward_awardimage`,`Vip6DistributeSupremeGift_propCount`,`Vip6DistributeSupremeGift_propId`,`Vip6DistributeSupremeGift_propImage`,`joinTopicId`,`topicType`,`topicId`,`topicName`,`topicFailType`,`userUpLevel`,`userUpCoin`,`userUpCrystal`,`roomUpLevel`,`roomWageCoin`,`aristocracyBuyType`,`aristocracyLevel`,`nVIPLv`,`uniqueIdExpirationTime`,`consumerRebateCoin`,`unlockAvatarFrameUrl`,`subscribeRewardCoin`,`medalLevel`,`medalId`,`WealthLevelUpInfo_wealthLevel`,`WealthLevelUpInfo_badgeLevel`,`WealthLevelUpInfo_badgeImage`,`custom_theme_cause`,`give_theme_userId`,`give_theme_dayNum`,`eventName`,`eventMinute`,`eventStartTime`,`eventReason`,`reasonType`,`eventRoomId`,`eventId`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // p110o000ooo0.o0OO00O
    public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, SystemMessage systemMessage) {
        SystemMessage systemMessage2 = systemMessage;
        if (systemMessage2.getMid() == null) {
            supportSQLiteStatement.bindNull(1);
        } else {
            supportSQLiteStatement.bindString(1, systemMessage2.getMid());
        }
        supportSQLiteStatement.bindLong(2, systemMessage2.getType());
        if (systemMessage2.getMessage() == null) {
            supportSQLiteStatement.bindNull(3);
        } else {
            supportSQLiteStatement.bindString(3, systemMessage2.getMessage());
        }
        supportSQLiteStatement.bindLong(4, systemMessage2.getTime());
        supportSQLiteStatement.bindLong(5, systemMessage2.getUid());
        supportSQLiteStatement.bindLong(6, systemMessage2.getIsRead() ? 1L : 0L);
        SystemMessage.PremiumInfo vipInfo = systemMessage2.getVipInfo();
        if (vipInfo != null) {
            supportSQLiteStatement.bindLong(7, vipInfo.getVipLevel());
        } else {
            supportSQLiteStatement.bindNull(7);
        }
        SystemMessage.TreasureBox treasureBox = systemMessage2.getTreasureBox();
        if (treasureBox != null) {
            supportSQLiteStatement.bindLong(8, treasureBox.getAwardType());
            supportSQLiteStatement.bindLong(9, treasureBox.getNumber());
            if (treasureBox.getImageurl() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, treasureBox.getImageurl());
            }
        } else {
            supportSQLiteStatement.bindNull(8);
            supportSQLiteStatement.bindNull(9);
            supportSQLiteStatement.bindNull(10);
        }
        SystemMessage.VipMsgInfo kaVipMsgInfo = systemMessage2.getKaVipMsgInfo();
        if (kaVipMsgInfo != null) {
            supportSQLiteStatement.bindLong(11, kaVipMsgInfo.getKaVipType());
            supportSQLiteStatement.bindLong(12, kaVipMsgInfo.getKaVipLevel());
        } else {
            supportSQLiteStatement.bindNull(11);
            supportSQLiteStatement.bindNull(12);
        }
        SystemMessage.FirstRewardInfo firstRewardInfo = systemMessage2.getFirstRewardInfo();
        if (firstRewardInfo != null) {
            supportSQLiteStatement.bindLong(13, firstRewardInfo.getRewardCoin());
            supportSQLiteStatement.bindLong(14, firstRewardInfo.getMessageType());
        } else {
            supportSQLiteStatement.bindNull(13);
            supportSQLiteStatement.bindNull(14);
        }
        SystemMessage.MemberBadgeFrozenInfo memberBadgeFrozenInfo = systemMessage2.getMemberBadgeFrozenInfo();
        if (memberBadgeFrozenInfo != null) {
            if (memberBadgeFrozenInfo.getRoomId() == null) {
                supportSQLiteStatement.bindNull(15);
            } else {
                supportSQLiteStatement.bindLong(15, memberBadgeFrozenInfo.getRoomId().longValue());
            }
            if (memberBadgeFrozenInfo.getRoomName() == null) {
                supportSQLiteStatement.bindNull(16);
            } else {
                supportSQLiteStatement.bindString(16, memberBadgeFrozenInfo.getRoomName());
            }
        } else {
            supportSQLiteStatement.bindNull(15);
            supportSQLiteStatement.bindNull(16);
        }
        SystemMessage.MemberBadgeTopRankReward memberBadgeTopRankReward = systemMessage2.getMemberBadgeTopRankReward();
        if (memberBadgeTopRankReward != null) {
            if (memberBadgeTopRankReward.getShopId() == null) {
                supportSQLiteStatement.bindNull(17);
            } else {
                supportSQLiteStatement.bindLong(17, memberBadgeTopRankReward.getShopId().intValue());
            }
            if (memberBadgeTopRankReward.getShopUrl() == null) {
                supportSQLiteStatement.bindNull(18);
            } else {
                supportSQLiteStatement.bindString(18, memberBadgeTopRankReward.getShopUrl());
            }
        } else {
            supportSQLiteStatement.bindNull(17);
            supportSQLiteStatement.bindNull(18);
        }
        SystemMessage.GiftBackpackExpired giftBackpackExpired = systemMessage2.getGiftBackpackExpired();
        if (giftBackpackExpired != null) {
            if (giftBackpackExpired.getDyid() == null) {
                supportSQLiteStatement.bindNull(19);
            } else {
                supportSQLiteStatement.bindLong(19, giftBackpackExpired.getDyid().longValue());
            }
            if (giftBackpackExpired.getHeadurl() == null) {
                supportSQLiteStatement.bindNull(20);
            } else {
                supportSQLiteStatement.bindString(20, giftBackpackExpired.getHeadurl());
            }
            if (giftBackpackExpired.getSex() == null) {
                supportSQLiteStatement.bindNull(21);
            } else {
                supportSQLiteStatement.bindLong(21, giftBackpackExpired.getSex().intValue());
            }
            if (giftBackpackExpired.getIspraise() == null) {
                supportSQLiteStatement.bindNull(22);
            } else {
                supportSQLiteStatement.bindLong(22, giftBackpackExpired.getIspraise().intValue());
            }
            if (giftBackpackExpired.getLevel() == null) {
                supportSQLiteStatement.bindNull(23);
            } else {
                supportSQLiteStatement.bindLong(23, giftBackpackExpired.getLevel().intValue());
            }
            if (giftBackpackExpired.getCoin() == null) {
                supportSQLiteStatement.bindNull(24);
            } else {
                supportSQLiteStatement.bindLong(24, giftBackpackExpired.getCoin().longValue());
            }
            if (giftBackpackExpired.getUpcrystal() == null) {
                supportSQLiteStatement.bindNull(25);
            } else {
                supportSQLiteStatement.bindLong(25, giftBackpackExpired.getUpcrystal().longValue());
            }
            if (giftBackpackExpired.getLanguage() == null) {
                supportSQLiteStatement.bindNull(26);
            } else {
                supportSQLiteStatement.bindLong(26, giftBackpackExpired.getLanguage().intValue());
            }
            if (giftBackpackExpired.getNickname() == null) {
                supportSQLiteStatement.bindNull(27);
            } else {
                supportSQLiteStatement.bindString(27, giftBackpackExpired.getNickname());
            }
            if (giftBackpackExpired.getDyurl() == null) {
                supportSQLiteStatement.bindNull(28);
            } else {
                supportSQLiteStatement.bindString(28, giftBackpackExpired.getDyurl());
            }
        } else {
            OooO.OooO0O0(supportSQLiteStatement, 19, 20, 21, 22);
            OooO.OooO0O0(supportSQLiteStatement, 23, 24, 25, 26);
            supportSQLiteStatement.bindNull(27);
            supportSQLiteStatement.bindNull(28);
        }
        SystemMessage.GiftBlindTaskReward giftBlindTaskReward = systemMessage2.getGiftBlindTaskReward();
        if (giftBlindTaskReward != null) {
            if (giftBlindTaskReward.getAwardtype() == null) {
                supportSQLiteStatement.bindNull(29);
            } else {
                supportSQLiteStatement.bindLong(29, giftBlindTaskReward.getAwardtype().intValue());
            }
            if (giftBlindTaskReward.getAwardcount() == null) {
                supportSQLiteStatement.bindNull(30);
            } else {
                supportSQLiteStatement.bindLong(30, giftBlindTaskReward.getAwardcount().intValue());
            }
            if (giftBlindTaskReward.getAwardId() == null) {
                supportSQLiteStatement.bindNull(31);
            } else {
                supportSQLiteStatement.bindLong(31, giftBlindTaskReward.getAwardId().longValue());
            }
            if (giftBlindTaskReward.getAwardimage() == null) {
                supportSQLiteStatement.bindNull(32);
            } else {
                supportSQLiteStatement.bindString(32, giftBlindTaskReward.getAwardimage());
            }
        } else {
            OooO.OooO0O0(supportSQLiteStatement, 29, 30, 31, 32);
        }
        SystemMessage.GiftBlindRankingReward giftBlindRankingReward = systemMessage2.getGiftBlindRankingReward();
        if (giftBlindRankingReward != null) {
            if (giftBlindRankingReward.getToprank() == null) {
                supportSQLiteStatement.bindNull(33);
            } else {
                supportSQLiteStatement.bindLong(33, giftBlindRankingReward.getToprank().intValue());
            }
            if (giftBlindRankingReward.getToptype() == null) {
                supportSQLiteStatement.bindNull(34);
            } else {
                supportSQLiteStatement.bindLong(34, giftBlindRankingReward.getToptype().intValue());
            }
            if (giftBlindRankingReward.getAwardtype() == null) {
                supportSQLiteStatement.bindNull(35);
            } else {
                supportSQLiteStatement.bindLong(35, giftBlindRankingReward.getAwardtype().intValue());
            }
            if (giftBlindRankingReward.getAwardcount() == null) {
                supportSQLiteStatement.bindNull(36);
            } else {
                supportSQLiteStatement.bindLong(36, giftBlindRankingReward.getAwardcount().intValue());
            }
            if (giftBlindRankingReward.getAwardId() == null) {
                supportSQLiteStatement.bindNull(37);
            } else {
                supportSQLiteStatement.bindLong(37, giftBlindRankingReward.getAwardId().longValue());
            }
            if (giftBlindRankingReward.getAwardimage() == null) {
                supportSQLiteStatement.bindNull(38);
            } else {
                supportSQLiteStatement.bindString(38, giftBlindRankingReward.getAwardimage());
            }
        } else {
            OooO.OooO0O0(supportSQLiteStatement, 33, 34, 35, 36);
            supportSQLiteStatement.bindNull(37);
            supportSQLiteStatement.bindNull(38);
        }
        SystemMessage.Vip6DistributeSupremeGift vip6DistributeSupremeGift = systemMessage2.getVip6DistributeSupremeGift();
        if (vip6DistributeSupremeGift != null) {
            if (vip6DistributeSupremeGift.getPropCount() == null) {
                supportSQLiteStatement.bindNull(39);
            } else {
                supportSQLiteStatement.bindLong(39, vip6DistributeSupremeGift.getPropCount().intValue());
            }
            if (vip6DistributeSupremeGift.getPropId() == null) {
                supportSQLiteStatement.bindNull(40);
            } else {
                supportSQLiteStatement.bindLong(40, vip6DistributeSupremeGift.getPropId().longValue());
            }
            if (vip6DistributeSupremeGift.getPropImage() == null) {
                supportSQLiteStatement.bindNull(41);
            } else {
                supportSQLiteStatement.bindString(41, vip6DistributeSupremeGift.getPropImage());
            }
        } else {
            supportSQLiteStatement.bindNull(39);
            supportSQLiteStatement.bindNull(40);
            supportSQLiteStatement.bindNull(41);
        }
        SystemMessage.JoinTopicInfo joinTopicInfo = systemMessage2.getJoinTopicInfo();
        if (joinTopicInfo != null) {
            supportSQLiteStatement.bindLong(42, joinTopicInfo.getJoinTopicId());
        } else {
            supportSQLiteStatement.bindNull(42);
        }
        SystemMessage.TopicStateInfo topicStateInfo = systemMessage2.getTopicStateInfo();
        if (topicStateInfo != null) {
            supportSQLiteStatement.bindLong(43, topicStateInfo.getTopicType());
            supportSQLiteStatement.bindLong(44, topicStateInfo.getTopicId());
            if (topicStateInfo.getTopicName() == null) {
                supportSQLiteStatement.bindNull(45);
            } else {
                supportSQLiteStatement.bindString(45, topicStateInfo.getTopicName());
            }
            supportSQLiteStatement.bindLong(46, topicStateInfo.getTopicFailType());
        } else {
            OooO.OooO0O0(supportSQLiteStatement, 43, 44, 45, 46);
        }
        SystemMessage.UserUpgradeInfo userUpgradeInfo = systemMessage2.getUserUpgradeInfo();
        if (userUpgradeInfo != null) {
            supportSQLiteStatement.bindLong(47, userUpgradeInfo.getUserLevel());
            supportSQLiteStatement.bindLong(48, userUpgradeInfo.getUpCoin());
            supportSQLiteStatement.bindLong(49, userUpgradeInfo.getUpCrystal());
        } else {
            supportSQLiteStatement.bindNull(47);
            supportSQLiteStatement.bindNull(48);
            supportSQLiteStatement.bindNull(49);
        }
        SystemMessage.RoomUpgradeInfo roomUpgradeInfo = systemMessage2.getRoomUpgradeInfo();
        if (roomUpgradeInfo != null) {
            supportSQLiteStatement.bindLong(50, roomUpgradeInfo.getRoomLevel());
        } else {
            supportSQLiteStatement.bindNull(50);
        }
        SystemMessage.RoomWageInfo roomWageInfo = systemMessage2.getRoomWageInfo();
        if (roomWageInfo != null) {
            supportSQLiteStatement.bindLong(51, roomWageInfo.getWageCoin());
        } else {
            supportSQLiteStatement.bindNull(51);
        }
        SystemMessage.AristocracyExpiredInfo aristocracyInfo = systemMessage2.getAristocracyInfo();
        if (aristocracyInfo != null) {
            supportSQLiteStatement.bindLong(52, aristocracyInfo.getBuyType());
            supportSQLiteStatement.bindLong(53, aristocracyInfo.getVipLevel());
            supportSQLiteStatement.bindLong(54, aristocracyInfo.getNVIPLv());
        } else {
            supportSQLiteStatement.bindNull(52);
            supportSQLiteStatement.bindNull(53);
            supportSQLiteStatement.bindNull(54);
        }
        SystemMessage.UniqueIdDueRemindInfo uniqueIdDueRemindInfo = systemMessage2.getUniqueIdDueRemindInfo();
        if (uniqueIdDueRemindInfo != null) {
            supportSQLiteStatement.bindLong(55, uniqueIdDueRemindInfo.getExpirationTime());
        } else {
            supportSQLiteStatement.bindNull(55);
        }
        SystemMessage.ConsumerRebateInfo consumerRebateInfo = systemMessage2.getConsumerRebateInfo();
        if (consumerRebateInfo != null) {
            supportSQLiteStatement.bindLong(56, consumerRebateInfo.getRebateCoin());
        } else {
            supportSQLiteStatement.bindNull(56);
        }
        SystemMessage.UnlockAvatarFrameInfo unlockAvatarFrameInfo = systemMessage2.getUnlockAvatarFrameInfo();
        if (unlockAvatarFrameInfo == null || unlockAvatarFrameInfo.getAvatarFrameUrl() == null) {
            supportSQLiteStatement.bindNull(57);
        } else {
            supportSQLiteStatement.bindString(57, unlockAvatarFrameInfo.getAvatarFrameUrl());
        }
        SystemMessage.SubscribeRewardInfo subscribeRewardInfo = systemMessage2.getSubscribeRewardInfo();
        if (subscribeRewardInfo != null) {
            supportSQLiteStatement.bindLong(58, subscribeRewardInfo.getRewardCoin());
        } else {
            supportSQLiteStatement.bindNull(58);
        }
        SystemMessage.MedalNoticeInfo medalNoticeInfo = systemMessage2.getMedalNoticeInfo();
        if (medalNoticeInfo != null) {
            supportSQLiteStatement.bindLong(59, medalNoticeInfo.getMedalLevel());
            supportSQLiteStatement.bindLong(60, medalNoticeInfo.getMedalId());
        } else {
            supportSQLiteStatement.bindNull(59);
            supportSQLiteStatement.bindNull(60);
        }
        SystemMessage.WealthLevelUpInfo wealthLevelUpInfo = systemMessage2.getWealthLevelUpInfo();
        if (wealthLevelUpInfo != null) {
            if (wealthLevelUpInfo.getWealthLv() == null) {
                supportSQLiteStatement.bindNull(61);
            } else {
                supportSQLiteStatement.bindLong(61, wealthLevelUpInfo.getWealthLv().intValue());
            }
            if (wealthLevelUpInfo.getBadgeLevel() == null) {
                supportSQLiteStatement.bindNull(62);
            } else {
                supportSQLiteStatement.bindLong(62, wealthLevelUpInfo.getBadgeLevel().intValue());
            }
            if (wealthLevelUpInfo.getBadgeImage() == null) {
                supportSQLiteStatement.bindNull(63);
            } else {
                supportSQLiteStatement.bindString(63, wealthLevelUpInfo.getBadgeImage());
            }
        } else {
            supportSQLiteStatement.bindNull(61);
            supportSQLiteStatement.bindNull(62);
            supportSQLiteStatement.bindNull(63);
        }
        SystemMessage.CustomTheme customTheme = systemMessage2.getCustomTheme();
        if (customTheme != null) {
            supportSQLiteStatement.bindLong(64, customTheme.getCause());
        } else {
            supportSQLiteStatement.bindNull(64);
        }
        SystemMessage.GiveThemeInfo giveThemeInfo = systemMessage2.getGiveThemeInfo();
        if (giveThemeInfo != null) {
            supportSQLiteStatement.bindLong(65, giveThemeInfo.getUserId());
            supportSQLiteStatement.bindLong(66, giveThemeInfo.getDayNum());
        } else {
            supportSQLiteStatement.bindNull(65);
            supportSQLiteStatement.bindNull(66);
        }
        SystemMessage.EventInfo eventInfo = systemMessage2.getEventInfo();
        if (eventInfo == null) {
            OooO.OooO0O0(supportSQLiteStatement, 67, 68, 69, 70);
            supportSQLiteStatement.bindNull(71);
            supportSQLiteStatement.bindNull(72);
            supportSQLiteStatement.bindNull(73);
            return;
        }
        if (eventInfo.getName() == null) {
            supportSQLiteStatement.bindNull(67);
        } else {
            supportSQLiteStatement.bindString(67, eventInfo.getName());
        }
        if (eventInfo.getMinute() == null) {
            supportSQLiteStatement.bindNull(68);
        } else {
            supportSQLiteStatement.bindLong(68, eventInfo.getMinute().intValue());
        }
        if (eventInfo.getStartTime() == null) {
            supportSQLiteStatement.bindNull(69);
        } else {
            supportSQLiteStatement.bindLong(69, eventInfo.getStartTime().longValue());
        }
        if (eventInfo.getReason() == null) {
            supportSQLiteStatement.bindNull(70);
        } else {
            supportSQLiteStatement.bindString(70, eventInfo.getReason());
        }
        if (eventInfo.getReasonType() == null) {
            supportSQLiteStatement.bindNull(71);
        } else {
            supportSQLiteStatement.bindLong(71, eventInfo.getReasonType().intValue());
        }
        if (eventInfo.getRoomId() == null) {
            supportSQLiteStatement.bindNull(72);
        } else {
            supportSQLiteStatement.bindLong(72, eventInfo.getRoomId().longValue());
        }
        if (eventInfo.getEventId() == null) {
            supportSQLiteStatement.bindNull(73);
        } else {
            supportSQLiteStatement.bindLong(73, eventInfo.getEventId().longValue());
        }
    }
}
