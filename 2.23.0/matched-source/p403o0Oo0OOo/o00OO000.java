package p403o0Oo0OOo;

import androidx.appcompat.widget.OooO00o;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.table.ChatMessage;
import o000O0O0.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO000 extends OooOOO0<ChatMessage> {
    public o00OO000(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // o000O0O0.o000000
    public final String OooO0O0() {
        return "INSERT OR REPLACE INTO `ChatMessageTable` (`uid`,`mid`,`targetId`,`contentType`,`message`,`time`,`sendState`,`isWarn`,`isAcceptMsg`,`unknownMessage`,`voiceUrl`,`voiceDuration`,`voiceFileName`,`isVoiceRead`,`emoticonType`,`emoticonValue`,`emoticonIsRead`,`giftId`,`giftNumber`,`giftUrl`,`isGiftBlind`,`isGiftBlindBox`,`isGiftBackpack`,`isGiftCustomMade`,`gifId`,`gifUrl`,`roomHeader`,`roomName`,`roomId`,`roomIdx`,`roomIp`,`momentId`,`momentImage`,`momentText`,`momentMsg`,`momentType`,`topicId`,`topicImage`,`topicName`,`topicUserCount`,`topicMomentCount`,`topicMsg`,`shareUserId`,`shareUserIdx`,`shareUserHead`,`shareUserName`,`shareUserMessage`,`activityImage`,`activityText1`,`activityText2`,`activityMsg`,`activityUrl`,`themeBgName`,`themeBgImgUrl`,`themeVideoUrl`,`themeDayLimit`,`themeExpireTime`,`themeGiveId`,`themeState`,`eventId`,`eventName`,`eventImageUrl`,`eventTagId`,`eventStartTime`,`eventEndTime`,`eventRoomId`,`eventRoomName`,`eventRoomIp`,`eventDeleted`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // o000O0O0.OooOOO0
    public final void OooO0Oo(SupportSQLiteStatement supportSQLiteStatement, ChatMessage chatMessage) {
        ChatMessage chatMessage2 = chatMessage;
        supportSQLiteStatement.bindLong(1, chatMessage2.getUid());
        if (chatMessage2.getMid() == null) {
            supportSQLiteStatement.bindNull(2);
        } else {
            supportSQLiteStatement.bindString(2, chatMessage2.getMid());
        }
        supportSQLiteStatement.bindLong(3, chatMessage2.getTargetId());
        supportSQLiteStatement.bindLong(4, chatMessage2.getContentType());
        if (chatMessage2.getMessage() == null) {
            supportSQLiteStatement.bindNull(5);
        } else {
            supportSQLiteStatement.bindString(5, chatMessage2.getMessage());
        }
        supportSQLiteStatement.bindLong(6, chatMessage2.getTime());
        supportSQLiteStatement.bindLong(7, chatMessage2.getSendState());
        supportSQLiteStatement.bindLong(8, chatMessage2.getIsWarn() ? 1L : 0L);
        supportSQLiteStatement.bindLong(9, chatMessage2.getIsAcceptMsg() ? 1L : 0L);
        if (chatMessage2.getUnknownMessage() == null) {
            supportSQLiteStatement.bindNull(10);
        } else {
            supportSQLiteStatement.bindString(10, chatMessage2.getUnknownMessage());
        }
        ChatMessage.VoiceInfo voiceInfo = chatMessage2.getVoiceInfo();
        if (voiceInfo != null) {
            if (voiceInfo.getVoiceUrl() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, voiceInfo.getVoiceUrl());
            }
            supportSQLiteStatement.bindLong(12, voiceInfo.getVoiceDuration());
            if (voiceInfo.getFilename() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, voiceInfo.getFilename());
            }
            supportSQLiteStatement.bindLong(14, voiceInfo.getIsVoiceRead() ? 1L : 0L);
        } else {
            OooO00o.OooO0O0(supportSQLiteStatement, 11, 12, 13, 14);
        }
        ChatMessage.EmoticonInfo emoticonInfo = chatMessage2.getEmoticonInfo();
        if (emoticonInfo != null) {
            supportSQLiteStatement.bindLong(15, emoticonInfo.getEmoticonType());
            supportSQLiteStatement.bindLong(16, emoticonInfo.getEmoticonValue());
            supportSQLiteStatement.bindLong(17, emoticonInfo.getEmoticonIsRead() ? 1L : 0L);
        } else {
            supportSQLiteStatement.bindNull(15);
            supportSQLiteStatement.bindNull(16);
            supportSQLiteStatement.bindNull(17);
        }
        ChatMessage.GiftInfo giftInfo = chatMessage2.getGiftInfo();
        if (giftInfo != null) {
            supportSQLiteStatement.bindLong(18, giftInfo.getGiftId());
            supportSQLiteStatement.bindLong(19, giftInfo.getGiftNumber());
            if (giftInfo.getGiftUrl() == null) {
                supportSQLiteStatement.bindNull(20);
            } else {
                supportSQLiteStatement.bindString(20, giftInfo.getGiftUrl());
            }
            Integer numValueOf = giftInfo.getIsGiftBlind() == null ? null : Integer.valueOf(giftInfo.getIsGiftBlind().booleanValue() ? 1 : 0);
            if (numValueOf == null) {
                supportSQLiteStatement.bindNull(21);
            } else {
                supportSQLiteStatement.bindLong(21, numValueOf.intValue());
            }
            Integer numValueOf2 = giftInfo.getIsGiftBlindBox() == null ? null : Integer.valueOf(giftInfo.getIsGiftBlindBox().booleanValue() ? 1 : 0);
            if (numValueOf2 == null) {
                supportSQLiteStatement.bindNull(22);
            } else {
                supportSQLiteStatement.bindLong(22, numValueOf2.intValue());
            }
            Integer numValueOf3 = giftInfo.getIsGiftBackpack() == null ? null : Integer.valueOf(giftInfo.getIsGiftBackpack().booleanValue() ? 1 : 0);
            if (numValueOf3 == null) {
                supportSQLiteStatement.bindNull(23);
            } else {
                supportSQLiteStatement.bindLong(23, numValueOf3.intValue());
            }
            Integer numValueOf4 = giftInfo.getIsGiftCustomMade() != null ? Integer.valueOf(giftInfo.getIsGiftCustomMade().booleanValue() ? 1 : 0) : null;
            if (numValueOf4 == null) {
                supportSQLiteStatement.bindNull(24);
            } else {
                supportSQLiteStatement.bindLong(24, numValueOf4.intValue());
            }
        } else {
            OooO00o.OooO0O0(supportSQLiteStatement, 18, 19, 20, 21);
            supportSQLiteStatement.bindNull(22);
            supportSQLiteStatement.bindNull(23);
            supportSQLiteStatement.bindNull(24);
        }
        ChatMessage.GifInfo gifInfo = chatMessage2.getGifInfo();
        if (gifInfo != null) {
            supportSQLiteStatement.bindLong(25, gifInfo.getGifId());
            if (gifInfo.getGifUrl() == null) {
                supportSQLiteStatement.bindNull(26);
            } else {
                supportSQLiteStatement.bindString(26, gifInfo.getGifUrl());
            }
        } else {
            supportSQLiteStatement.bindNull(25);
            supportSQLiteStatement.bindNull(26);
        }
        ChatMessage.ShareRoomInfo shareRoomInfo = chatMessage2.getShareRoomInfo();
        if (shareRoomInfo != null) {
            if (shareRoomInfo.getRoomHeader() == null) {
                supportSQLiteStatement.bindNull(27);
            } else {
                supportSQLiteStatement.bindString(27, shareRoomInfo.getRoomHeader());
            }
            if (shareRoomInfo.getRoomName() == null) {
                supportSQLiteStatement.bindNull(28);
            } else {
                supportSQLiteStatement.bindString(28, shareRoomInfo.getRoomName());
            }
            supportSQLiteStatement.bindLong(29, shareRoomInfo.getRoomId());
            supportSQLiteStatement.bindLong(30, shareRoomInfo.getRoomIdx());
            if (shareRoomInfo.getRoomIp() == null) {
                supportSQLiteStatement.bindNull(31);
            } else {
                supportSQLiteStatement.bindString(31, shareRoomInfo.getRoomIp());
            }
        } else {
            OooO00o.OooO0O0(supportSQLiteStatement, 27, 28, 29, 30);
            supportSQLiteStatement.bindNull(31);
        }
        ChatMessage.ShareMomentInfo shareMomentInfo = chatMessage2.getShareMomentInfo();
        if (shareMomentInfo != null) {
            supportSQLiteStatement.bindLong(32, shareMomentInfo.getMomentId());
            if (shareMomentInfo.getMomentImage() == null) {
                supportSQLiteStatement.bindNull(33);
            } else {
                supportSQLiteStatement.bindString(33, shareMomentInfo.getMomentImage());
            }
            if (shareMomentInfo.getMomentText() == null) {
                supportSQLiteStatement.bindNull(34);
            } else {
                supportSQLiteStatement.bindString(34, shareMomentInfo.getMomentText());
            }
            if (shareMomentInfo.getMomentMsg() == null) {
                supportSQLiteStatement.bindNull(35);
            } else {
                supportSQLiteStatement.bindString(35, shareMomentInfo.getMomentMsg());
            }
            supportSQLiteStatement.bindLong(36, shareMomentInfo.getMomentType());
        } else {
            OooO00o.OooO0O0(supportSQLiteStatement, 32, 33, 34, 35);
            supportSQLiteStatement.bindNull(36);
        }
        ChatMessage.ShareTopicInfo shareTopicInfo = chatMessage2.getShareTopicInfo();
        if (shareTopicInfo != null) {
            supportSQLiteStatement.bindLong(37, shareTopicInfo.getTopicId());
            if (shareTopicInfo.getTopicImage() == null) {
                supportSQLiteStatement.bindNull(38);
            } else {
                supportSQLiteStatement.bindString(38, shareTopicInfo.getTopicImage());
            }
            if (shareTopicInfo.getTopicName() == null) {
                supportSQLiteStatement.bindNull(39);
            } else {
                supportSQLiteStatement.bindString(39, shareTopicInfo.getTopicName());
            }
            supportSQLiteStatement.bindLong(40, shareTopicInfo.getTopicUserCount());
            supportSQLiteStatement.bindLong(41, shareTopicInfo.getTopicMomentCount());
            if (shareTopicInfo.getTopicMsg() == null) {
                supportSQLiteStatement.bindNull(42);
            } else {
                supportSQLiteStatement.bindString(42, shareTopicInfo.getTopicMsg());
            }
        } else {
            OooO00o.OooO0O0(supportSQLiteStatement, 37, 38, 39, 40);
            supportSQLiteStatement.bindNull(41);
            supportSQLiteStatement.bindNull(42);
        }
        ChatMessage.ShareUserInfo shareUserInfo = chatMessage2.getShareUserInfo();
        if (shareUserInfo != null) {
            supportSQLiteStatement.bindLong(43, shareUserInfo.getUserId());
            supportSQLiteStatement.bindLong(44, shareUserInfo.getUserIdx());
            if (shareUserInfo.getUserHead() == null) {
                supportSQLiteStatement.bindNull(45);
            } else {
                supportSQLiteStatement.bindString(45, shareUserInfo.getUserHead());
            }
            if (shareUserInfo.getUserName() == null) {
                supportSQLiteStatement.bindNull(46);
            } else {
                supportSQLiteStatement.bindString(46, shareUserInfo.getUserName());
            }
            if (shareUserInfo.getUserMsg() == null) {
                supportSQLiteStatement.bindNull(47);
            } else {
                supportSQLiteStatement.bindString(47, shareUserInfo.getUserMsg());
            }
        } else {
            OooO00o.OooO0O0(supportSQLiteStatement, 43, 44, 45, 46);
            supportSQLiteStatement.bindNull(47);
        }
        ChatMessage.ShareActivityInfo shareActivityInfo = chatMessage2.getShareActivityInfo();
        if (shareActivityInfo != null) {
            if (shareActivityInfo.getActivityImage() == null) {
                supportSQLiteStatement.bindNull(48);
            } else {
                supportSQLiteStatement.bindString(48, shareActivityInfo.getActivityImage());
            }
            if (shareActivityInfo.getActivityText1() == null) {
                supportSQLiteStatement.bindNull(49);
            } else {
                supportSQLiteStatement.bindString(49, shareActivityInfo.getActivityText1());
            }
            if (shareActivityInfo.getActivityText2() == null) {
                supportSQLiteStatement.bindNull(50);
            } else {
                supportSQLiteStatement.bindString(50, shareActivityInfo.getActivityText2());
            }
            if (shareActivityInfo.getActivityMsg() == null) {
                supportSQLiteStatement.bindNull(51);
            } else {
                supportSQLiteStatement.bindString(51, shareActivityInfo.getActivityMsg());
            }
            if (shareActivityInfo.getActivityUrl() == null) {
                supportSQLiteStatement.bindNull(52);
            } else {
                supportSQLiteStatement.bindString(52, shareActivityInfo.getActivityUrl());
            }
        } else {
            OooO00o.OooO0O0(supportSQLiteStatement, 48, 49, 50, 51);
            supportSQLiteStatement.bindNull(52);
        }
        ChatMessage.GiveRoomThemeInfo giveRoomThemeInfo = chatMessage2.getGiveRoomThemeInfo();
        if (giveRoomThemeInfo != null) {
            if (giveRoomThemeInfo.getThemeBgName() == null) {
                supportSQLiteStatement.bindNull(53);
            } else {
                supportSQLiteStatement.bindString(53, giveRoomThemeInfo.getThemeBgName());
            }
            if (giveRoomThemeInfo.getThemeBgImgUrl() == null) {
                supportSQLiteStatement.bindNull(54);
            } else {
                supportSQLiteStatement.bindString(54, giveRoomThemeInfo.getThemeBgImgUrl());
            }
            if (giveRoomThemeInfo.getThemeVideoUrl() == null) {
                supportSQLiteStatement.bindNull(55);
            } else {
                supportSQLiteStatement.bindString(55, giveRoomThemeInfo.getThemeVideoUrl());
            }
            supportSQLiteStatement.bindLong(56, giveRoomThemeInfo.getThemeDayLimit());
            supportSQLiteStatement.bindLong(57, giveRoomThemeInfo.getThemeExpireTime());
            supportSQLiteStatement.bindLong(58, giveRoomThemeInfo.getThemeGiveId());
            supportSQLiteStatement.bindLong(59, giveRoomThemeInfo.getThemeState());
        } else {
            OooO00o.OooO0O0(supportSQLiteStatement, 53, 54, 55, 56);
            supportSQLiteStatement.bindNull(57);
            supportSQLiteStatement.bindNull(58);
            supportSQLiteStatement.bindNull(59);
        }
        ChatMessage.ShareEventRoomInfo shareEventRoomInfo = chatMessage2.getShareEventRoomInfo();
        if (shareEventRoomInfo == null) {
            OooO00o.OooO0O0(supportSQLiteStatement, 60, 61, 62, 63);
            OooO00o.OooO0O0(supportSQLiteStatement, 64, 65, 66, 67);
            supportSQLiteStatement.bindNull(68);
            supportSQLiteStatement.bindNull(69);
            return;
        }
        supportSQLiteStatement.bindLong(60, shareEventRoomInfo.getEventId());
        if (shareEventRoomInfo.getEventName() == null) {
            supportSQLiteStatement.bindNull(61);
        } else {
            supportSQLiteStatement.bindString(61, shareEventRoomInfo.getEventName());
        }
        if (shareEventRoomInfo.getEventImageUrl() == null) {
            supportSQLiteStatement.bindNull(62);
        } else {
            supportSQLiteStatement.bindString(62, shareEventRoomInfo.getEventImageUrl());
        }
        supportSQLiteStatement.bindLong(63, shareEventRoomInfo.getEventTagId());
        supportSQLiteStatement.bindLong(64, shareEventRoomInfo.getEventStartTime());
        supportSQLiteStatement.bindLong(65, shareEventRoomInfo.getEventEndTime());
        supportSQLiteStatement.bindLong(66, shareEventRoomInfo.getRoomId());
        if (shareEventRoomInfo.getRoomName() == null) {
            supportSQLiteStatement.bindNull(67);
        } else {
            supportSQLiteStatement.bindString(67, shareEventRoomInfo.getRoomName());
        }
        if (shareEventRoomInfo.getRoomIp() == null) {
            supportSQLiteStatement.bindNull(68);
        } else {
            supportSQLiteStatement.bindString(68, shareEventRoomInfo.getRoomIp());
        }
        supportSQLiteStatement.bindLong(69, shareEventRoomInfo.getIsDeleted() ? 1L : 0L);
    }
}
