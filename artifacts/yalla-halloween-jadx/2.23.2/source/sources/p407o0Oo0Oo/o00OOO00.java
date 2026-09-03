package p407o0Oo0Oo;

import androidx.compose.runtime.OooO0OO;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.table.MomentMessage;
import com.zego.zegoliveroom.constants.ZegoConstants;
import io.agora.rtc.Constants;
import p110o000ooo0.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO00 extends o0OO00O<MomentMessage> {
    public o00OOO00(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // p110o000ooo0.o000Oo0
    public final String OooO0OO() {
        return "INSERT OR REPLACE INTO `MomentMessageTable` (`uid`,`mid`,`message`,`time`,`isRead`,`type`,`userId_MomentPraise`,`userNickName_MomentPraise`,`userHeadUrl_MomentPraise`,`momentId_MomentPraise`,`momentImageUrl_MomentPraise`,`momentContent_MomentPraise`,`userId_CommentPraise`,`userNickName_CommentPraise`,`userHeadUrl_CommentPraise`,`momentId_CommentPraise`,`momentImageUrl_CommentPraise`,`momentContent_CommentPraise`,`userId_MomentComment`,`userNickName_MomentComment`,`userHeadUrl_MomentComment`,`momentId_MomentComment`,`momentImageUrl_MomentComment`,`momentContent_MomentComment`,`commentId_MomentComment`,`commentContent_MomentComment`,`userId_CommentReply`,`userNickName_CommentReply`,`userHeadUrl_CommentReply`,`momentId_CommentReply`,`momentImageUrl_CommentReply`,`momentContent_CommentReply`,`commentId_CommentReply`,`commentContent_CommentReply`,`replyId_CommentReply`,`replyContent_CommentReply`,`userId_MomentAt`,`userNickName_MomentAt`,`userHeadUrl_MomentAt`,`momentId_MomentAt`,`momentImageUrl_MomentAt`,`momentContent_MomentAt`,`userId_CommentAt`,`userNickName_CommentAt`,`userHeadUrl_CommentAt`,`momentId_CommentAt`,`momentImageUrl_CommentAt`,`momentContent_CommentAt`,`commentId_CommentAt`,`commentContent_CommentAt`,`userId_MomentGift`,`userNickName_MomentGift`,`userHeadUrl_MomentGift`,`momentId_MomentGift`,`momentImageUrl_MomentGift`,`giftNum_MomentGift`,`giftImage_MomentGift`,`userId_CommentReward`,`userNickName_CommentReward`,`userHeadUrl_CommentReward`,`momentId_CommentReward`,`momentImageUrl_CommentReward`,`commentId_CommentReward`,`commentContent_CommentReward`,`userId_ReplyReward`,`userNickName_ReplyReward`,`userHeadUrl_ReplyReward`,`momentId_ReplyReward`,`momentImageUrl_ReplyReward`,`commentId_ReplyReward`,`commentContent_ReplyReward`,`momentId_MomentFeatured`,`momentImageUrl_MomentFeatured`,`momentId_CommentFeatured`,`momentImageUrl_CommentFeatured`,`momentContent_CommentFeatured`,`commentId_CommentFeatured`,`userId_MomentTopicTop`,`userHeadUrl_MomentTopicTop`,`momentImageUrl_MomentTopicTop`,`topicId_MomentTopicTop`,`topicName_MomentTopicTop`,`userId_MomentTopicTopRevoke`,`userHeadUrl_MomentTopicTopRevoke`,`momentImageUrl_MomentTopicTopRevoke`,`topicId_MomentTopicTopRevoke`,`topicName_MomentTopicTopRevoke`,`userId_MomentTopicRemoveOwner`,`userHeadUrl_MomentTopicRemoveOwner`,`momentImageUrl_MomentTopicRemoveOwner`,`momentId_MomentTopicRemoveOwner`,`topicName_MomentTopicRemoveOwner`,`userId_MomentTopicRemoveAdmin`,`userHeadUrl_MomentTopicRemoveAdmin`,`momentImageUrl_MomentTopicRemoveAdmin`,`momentId_MomentTopicRemoveAdmin`,`topicName_MomentTopicRemoveAdmin`,`userId_TopicGroupCreateSuccessNotice`,`nickName_TopicGroupCreateSuccessNotice`,`headUrl_TopicGroupCreateSuccessNotice`,`circleId_TopicGroupCreateSuccessNotice`,`circleName_TopicGroupCreateSuccessNotice`,`circleHead_TopicGroupCreateSuccessNotice`,`type_TopicGroupCreateSuccessNotice`,`groupOpenId_TopicGroupCreateSuccessNotice`,`userId_TopicGroupCreateOrJoinResult`,`circleId_TopicGroupCreateOrJoinResult`,`type_TopicGroupCreateOrJoinResult`,`momentId_MomentSystemRemove`,`momentImageUrl_MomentSystemRemove`,`deleteType_MomentSystemRemove`,`commentId_CommentSystemRemove`,`commentContent_CommentSystemRemove`,`deleteType_CommentSystemRemove`,`deleteContent_CommentSystemRemove`,`momentId_MomentReportFeedback`,`momentImageUrl_MomentReportFeedback`,`momentContent_MomentReportFeedback`,`momentTitle_MomentReportFeedback`,`commentId_CommentReportFeedback`,`commentContent_CommentReportFeedback`,`momentImageUrl_CommentReportFeedback`,`commentTitle_CommentReportFeedback`,`commentCommentId_CommentReportFeedback`,`commentCommentContent_CommentReportFeedback`,`circleId_CircleReportFeedback`,`circleContent_CircleReportFeedback`,`circleImageUrl_CircleReportFeedback`,`circleTitle_CircleReportFeedback`,`topicUserId_TopicCreateSuccess`,`topicId_TopicCreateSuccess`,`topicName_TopicCreateSuccess`,`message_TopicCreateSuccess`,`topicUserId_TopicCreateFail`,`topicId_TopicCreateFail`,`topicName_TopicCreateFail`,`message_TopicCreateFail`,`failType_TopicCreateFail`,`topicUserId_TopicCreateDisband`,`topicId_TopicCreateDisband`,`topicName_TopicCreateDisband`,`message_TopicCreateDisband`,`disbandContent_TopicCreateDisband`,`topicId_TopicMemberAdd`,`content_TopicMemberAdd`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // p110o000ooo0.o0OO00O
    public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, MomentMessage momentMessage) {
        MomentMessage momentMessage2 = momentMessage;
        supportSQLiteStatement.bindLong(1, momentMessage2.getUid());
        if (momentMessage2.getMid() == null) {
            supportSQLiteStatement.bindNull(2);
        } else {
            supportSQLiteStatement.bindString(2, momentMessage2.getMid());
        }
        if (momentMessage2.getMessage() == null) {
            supportSQLiteStatement.bindNull(3);
        } else {
            supportSQLiteStatement.bindString(3, momentMessage2.getMessage());
        }
        supportSQLiteStatement.bindLong(4, momentMessage2.getTime());
        supportSQLiteStatement.bindLong(5, momentMessage2.getIsRead() ? 1L : 0L);
        supportSQLiteStatement.bindLong(6, momentMessage2.getType());
        MomentMessage.MomentPraise momentPraise = momentMessage2.getMomentPraise();
        if (momentPraise != null) {
            supportSQLiteStatement.bindLong(7, momentPraise.getUserId());
            if (momentPraise.getUserNickName() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, momentPraise.getUserNickName());
            }
            if (momentPraise.getUserHeadUrl() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, momentPraise.getUserHeadUrl());
            }
            supportSQLiteStatement.bindLong(10, momentPraise.getMomentId());
            if (momentPraise.getMomentImageUrl() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, momentPraise.getMomentImageUrl());
            }
            if (momentPraise.getMomentContent() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, momentPraise.getMomentContent());
            }
        } else {
            OooO0OO.OooO0O0(supportSQLiteStatement, 7, 8, 9, 10);
            supportSQLiteStatement.bindNull(11);
            supportSQLiteStatement.bindNull(12);
        }
        MomentMessage.CommentPraise commentPraise = momentMessage2.getCommentPraise();
        if (commentPraise != null) {
            supportSQLiteStatement.bindLong(13, commentPraise.getUserId());
            if (commentPraise.getUserNickName() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindString(14, commentPraise.getUserNickName());
            }
            if (commentPraise.getUserHeadUrl() == null) {
                supportSQLiteStatement.bindNull(15);
            } else {
                supportSQLiteStatement.bindString(15, commentPraise.getUserHeadUrl());
            }
            supportSQLiteStatement.bindLong(16, commentPraise.getMomentId());
            if (commentPraise.getMomentImageUrl() == null) {
                supportSQLiteStatement.bindNull(17);
            } else {
                supportSQLiteStatement.bindString(17, commentPraise.getMomentImageUrl());
            }
            if (commentPraise.getMomentContent() == null) {
                supportSQLiteStatement.bindNull(18);
            } else {
                supportSQLiteStatement.bindString(18, commentPraise.getMomentContent());
            }
        } else {
            OooO0OO.OooO0O0(supportSQLiteStatement, 13, 14, 15, 16);
            supportSQLiteStatement.bindNull(17);
            supportSQLiteStatement.bindNull(18);
        }
        MomentMessage.MomentComment momentComment = momentMessage2.getMomentComment();
        if (momentComment != null) {
            supportSQLiteStatement.bindLong(19, momentComment.getUserId());
            if (momentComment.getUserNickName() == null) {
                supportSQLiteStatement.bindNull(20);
            } else {
                supportSQLiteStatement.bindString(20, momentComment.getUserNickName());
            }
            if (momentComment.getUserHeadUrl() == null) {
                supportSQLiteStatement.bindNull(21);
            } else {
                supportSQLiteStatement.bindString(21, momentComment.getUserHeadUrl());
            }
            supportSQLiteStatement.bindLong(22, momentComment.getMomentId());
            if (momentComment.getMomentImageUrl() == null) {
                supportSQLiteStatement.bindNull(23);
            } else {
                supportSQLiteStatement.bindString(23, momentComment.getMomentImageUrl());
            }
            if (momentComment.getMomentContent() == null) {
                supportSQLiteStatement.bindNull(24);
            } else {
                supportSQLiteStatement.bindString(24, momentComment.getMomentContent());
            }
            supportSQLiteStatement.bindLong(25, momentComment.getCommentId());
            if (momentComment.getCommentContent() == null) {
                supportSQLiteStatement.bindNull(26);
            } else {
                supportSQLiteStatement.bindString(26, momentComment.getCommentContent());
            }
        } else {
            OooO0OO.OooO0O0(supportSQLiteStatement, 19, 20, 21, 22);
            OooO0OO.OooO0O0(supportSQLiteStatement, 23, 24, 25, 26);
        }
        MomentMessage.CommentReply commentReply = momentMessage2.getCommentReply();
        if (commentReply != null) {
            supportSQLiteStatement.bindLong(27, commentReply.getUserId());
            if (commentReply.getUserNickName() == null) {
                supportSQLiteStatement.bindNull(28);
            } else {
                supportSQLiteStatement.bindString(28, commentReply.getUserNickName());
            }
            if (commentReply.getUserHeadUrl() == null) {
                supportSQLiteStatement.bindNull(29);
            } else {
                supportSQLiteStatement.bindString(29, commentReply.getUserHeadUrl());
            }
            supportSQLiteStatement.bindLong(30, commentReply.getMomentId());
            if (commentReply.getMomentImageUrl() == null) {
                supportSQLiteStatement.bindNull(31);
            } else {
                supportSQLiteStatement.bindString(31, commentReply.getMomentImageUrl());
            }
            if (commentReply.getMomentContent() == null) {
                supportSQLiteStatement.bindNull(32);
            } else {
                supportSQLiteStatement.bindString(32, commentReply.getMomentContent());
            }
            supportSQLiteStatement.bindLong(33, commentReply.getCommentId());
            if (commentReply.getCommentContent() == null) {
                supportSQLiteStatement.bindNull(34);
            } else {
                supportSQLiteStatement.bindString(34, commentReply.getCommentContent());
            }
            supportSQLiteStatement.bindLong(35, commentReply.getReplyId());
            if (commentReply.getReplyContent() == null) {
                supportSQLiteStatement.bindNull(36);
            } else {
                supportSQLiteStatement.bindString(36, commentReply.getReplyContent());
            }
        } else {
            OooO0OO.OooO0O0(supportSQLiteStatement, 27, 28, 29, 30);
            OooO0OO.OooO0O0(supportSQLiteStatement, 31, 32, 33, 34);
            supportSQLiteStatement.bindNull(35);
            supportSQLiteStatement.bindNull(36);
        }
        MomentMessage.MomentAt momentAt = momentMessage2.getMomentAt();
        if (momentAt != null) {
            supportSQLiteStatement.bindLong(37, momentAt.getUserId());
            if (momentAt.getUserNickName() == null) {
                supportSQLiteStatement.bindNull(38);
            } else {
                supportSQLiteStatement.bindString(38, momentAt.getUserNickName());
            }
            if (momentAt.getUserHeadUrl() == null) {
                supportSQLiteStatement.bindNull(39);
            } else {
                supportSQLiteStatement.bindString(39, momentAt.getUserHeadUrl());
            }
            supportSQLiteStatement.bindLong(40, momentAt.getMomentId());
            if (momentAt.getMomentImageUrl() == null) {
                supportSQLiteStatement.bindNull(41);
            } else {
                supportSQLiteStatement.bindString(41, momentAt.getMomentImageUrl());
            }
            if (momentAt.getMomentContent() == null) {
                supportSQLiteStatement.bindNull(42);
            } else {
                supportSQLiteStatement.bindString(42, momentAt.getMomentContent());
            }
        } else {
            OooO0OO.OooO0O0(supportSQLiteStatement, 37, 38, 39, 40);
            supportSQLiteStatement.bindNull(41);
            supportSQLiteStatement.bindNull(42);
        }
        MomentMessage.CommentAt commentAt = momentMessage2.getCommentAt();
        if (commentAt != null) {
            supportSQLiteStatement.bindLong(43, commentAt.getUserId());
            if (commentAt.getUserNickName() == null) {
                supportSQLiteStatement.bindNull(44);
            } else {
                supportSQLiteStatement.bindString(44, commentAt.getUserNickName());
            }
            if (commentAt.getUserHeadUrl() == null) {
                supportSQLiteStatement.bindNull(45);
            } else {
                supportSQLiteStatement.bindString(45, commentAt.getUserHeadUrl());
            }
            supportSQLiteStatement.bindLong(46, commentAt.getMomentId());
            if (commentAt.getMomentImageUrl() == null) {
                supportSQLiteStatement.bindNull(47);
            } else {
                supportSQLiteStatement.bindString(47, commentAt.getMomentImageUrl());
            }
            if (commentAt.getMomentContent() == null) {
                supportSQLiteStatement.bindNull(48);
            } else {
                supportSQLiteStatement.bindString(48, commentAt.getMomentContent());
            }
            supportSQLiteStatement.bindLong(49, commentAt.getCommentId());
            if (commentAt.getCommentContent() == null) {
                supportSQLiteStatement.bindNull(50);
            } else {
                supportSQLiteStatement.bindString(50, commentAt.getCommentContent());
            }
        } else {
            OooO0OO.OooO0O0(supportSQLiteStatement, 43, 44, 45, 46);
            OooO0OO.OooO0O0(supportSQLiteStatement, 47, 48, 49, 50);
        }
        MomentMessage.MomentGift momentGift = momentMessage2.getMomentGift();
        if (momentGift != null) {
            supportSQLiteStatement.bindLong(51, momentGift.getUserId());
            if (momentGift.getUserNickName() == null) {
                supportSQLiteStatement.bindNull(52);
            } else {
                supportSQLiteStatement.bindString(52, momentGift.getUserNickName());
            }
            if (momentGift.getUserHeadUrl() == null) {
                supportSQLiteStatement.bindNull(53);
            } else {
                supportSQLiteStatement.bindString(53, momentGift.getUserHeadUrl());
            }
            supportSQLiteStatement.bindLong(54, momentGift.getMomentId());
            if (momentGift.getMomentImageUrl() == null) {
                supportSQLiteStatement.bindNull(55);
            } else {
                supportSQLiteStatement.bindString(55, momentGift.getMomentImageUrl());
            }
            supportSQLiteStatement.bindLong(56, momentGift.getGiftNum());
            if (momentGift.getGiftImage() == null) {
                supportSQLiteStatement.bindNull(57);
            } else {
                supportSQLiteStatement.bindString(57, momentGift.getGiftImage());
            }
        } else {
            OooO0OO.OooO0O0(supportSQLiteStatement, 51, 52, 53, 54);
            supportSQLiteStatement.bindNull(55);
            supportSQLiteStatement.bindNull(56);
            supportSQLiteStatement.bindNull(57);
        }
        MomentMessage.CommentReward commentReward = momentMessage2.getCommentReward();
        if (commentReward != null) {
            supportSQLiteStatement.bindLong(58, commentReward.getUserId());
            if (commentReward.getUserNickName() == null) {
                supportSQLiteStatement.bindNull(59);
            } else {
                supportSQLiteStatement.bindString(59, commentReward.getUserNickName());
            }
            if (commentReward.getUserHeadUrl() == null) {
                supportSQLiteStatement.bindNull(60);
            } else {
                supportSQLiteStatement.bindString(60, commentReward.getUserHeadUrl());
            }
            supportSQLiteStatement.bindLong(61, commentReward.getMomentId());
            if (commentReward.getMomentImageUrl() == null) {
                supportSQLiteStatement.bindNull(62);
            } else {
                supportSQLiteStatement.bindString(62, commentReward.getMomentImageUrl());
            }
            supportSQLiteStatement.bindLong(63, commentReward.getCommentId());
            if (commentReward.getCommentContent() == null) {
                supportSQLiteStatement.bindNull(64);
            } else {
                supportSQLiteStatement.bindString(64, commentReward.getCommentContent());
            }
        } else {
            OooO0OO.OooO0O0(supportSQLiteStatement, 58, 59, 60, 61);
            supportSQLiteStatement.bindNull(62);
            supportSQLiteStatement.bindNull(63);
            supportSQLiteStatement.bindNull(64);
        }
        MomentMessage.ReplyReward replyReward = momentMessage2.getReplyReward();
        if (replyReward != null) {
            supportSQLiteStatement.bindLong(65, replyReward.getUserId());
            if (replyReward.getUserNickName() == null) {
                supportSQLiteStatement.bindNull(66);
            } else {
                supportSQLiteStatement.bindString(66, replyReward.getUserNickName());
            }
            if (replyReward.getUserHeadUrl() == null) {
                supportSQLiteStatement.bindNull(67);
            } else {
                supportSQLiteStatement.bindString(67, replyReward.getUserHeadUrl());
            }
            supportSQLiteStatement.bindLong(68, replyReward.getMomentId());
            if (replyReward.getMomentImageUrl() == null) {
                supportSQLiteStatement.bindNull(69);
            } else {
                supportSQLiteStatement.bindString(69, replyReward.getMomentImageUrl());
            }
            supportSQLiteStatement.bindLong(70, replyReward.getCommentId());
            if (replyReward.getCommentContent() == null) {
                supportSQLiteStatement.bindNull(71);
            } else {
                supportSQLiteStatement.bindString(71, replyReward.getCommentContent());
            }
        } else {
            OooO0OO.OooO0O0(supportSQLiteStatement, 65, 66, 67, 68);
            supportSQLiteStatement.bindNull(69);
            supportSQLiteStatement.bindNull(70);
            supportSQLiteStatement.bindNull(71);
        }
        MomentMessage.MomentFeatured momentFeatured = momentMessage2.getMomentFeatured();
        if (momentFeatured != null) {
            supportSQLiteStatement.bindLong(72, momentFeatured.getMomentId());
            if (momentFeatured.getMomentImageUrl() == null) {
                supportSQLiteStatement.bindNull(73);
            } else {
                supportSQLiteStatement.bindString(73, momentFeatured.getMomentImageUrl());
            }
        } else {
            supportSQLiteStatement.bindNull(72);
            supportSQLiteStatement.bindNull(73);
        }
        MomentMessage.CommentFeatured commentFeatured = momentMessage2.getCommentFeatured();
        if (commentFeatured != null) {
            supportSQLiteStatement.bindLong(74, commentFeatured.getMomentId());
            if (commentFeatured.getMomentImageUrl() == null) {
                supportSQLiteStatement.bindNull(75);
            } else {
                supportSQLiteStatement.bindString(75, commentFeatured.getMomentImageUrl());
            }
            if (commentFeatured.getMomentContent() == null) {
                supportSQLiteStatement.bindNull(76);
            } else {
                supportSQLiteStatement.bindString(76, commentFeatured.getMomentContent());
            }
            supportSQLiteStatement.bindLong(77, commentFeatured.getCommentId());
        } else {
            OooO0OO.OooO0O0(supportSQLiteStatement, 74, 75, 76, 77);
        }
        MomentMessage.MomentTopicTop momentTopicTop = momentMessage2.getMomentTopicTop();
        if (momentTopicTop != null) {
            supportSQLiteStatement.bindLong(78, momentTopicTop.getUserId());
            if (momentTopicTop.getUserHeadUrl() == null) {
                supportSQLiteStatement.bindNull(79);
            } else {
                supportSQLiteStatement.bindString(79, momentTopicTop.getUserHeadUrl());
            }
            if (momentTopicTop.getMomentImageUrl() == null) {
                supportSQLiteStatement.bindNull(80);
            } else {
                supportSQLiteStatement.bindString(80, momentTopicTop.getMomentImageUrl());
            }
            supportSQLiteStatement.bindLong(81, momentTopicTop.getTopicId());
            if (momentTopicTop.getTopicName() == null) {
                supportSQLiteStatement.bindNull(82);
            } else {
                supportSQLiteStatement.bindString(82, momentTopicTop.getTopicName());
            }
        } else {
            OooO0OO.OooO0O0(supportSQLiteStatement, 78, 79, 80, 81);
            supportSQLiteStatement.bindNull(82);
        }
        MomentMessage.MomentTopicTopRevoke momentTopicTopRevoke = momentMessage2.getMomentTopicTopRevoke();
        if (momentTopicTopRevoke != null) {
            supportSQLiteStatement.bindLong(83, momentTopicTopRevoke.getUserId());
            if (momentTopicTopRevoke.getUserHeadUrl() == null) {
                supportSQLiteStatement.bindNull(84);
            } else {
                supportSQLiteStatement.bindString(84, momentTopicTopRevoke.getUserHeadUrl());
            }
            if (momentTopicTopRevoke.getMomentImageUrl() == null) {
                supportSQLiteStatement.bindNull(85);
            } else {
                supportSQLiteStatement.bindString(85, momentTopicTopRevoke.getMomentImageUrl());
            }
            supportSQLiteStatement.bindLong(86, momentTopicTopRevoke.getTopicId());
            if (momentTopicTopRevoke.getTopicName() == null) {
                supportSQLiteStatement.bindNull(87);
            } else {
                supportSQLiteStatement.bindString(87, momentTopicTopRevoke.getTopicName());
            }
        } else {
            OooO0OO.OooO0O0(supportSQLiteStatement, 83, 84, 85, 86);
            supportSQLiteStatement.bindNull(87);
        }
        MomentMessage.MomentTopicRemoveOwner momentTopicRemoveOwner = momentMessage2.getMomentTopicRemoveOwner();
        if (momentTopicRemoveOwner != null) {
            supportSQLiteStatement.bindLong(88, momentTopicRemoveOwner.getUserId());
            if (momentTopicRemoveOwner.getUserHeadUrl() == null) {
                supportSQLiteStatement.bindNull(89);
            } else {
                supportSQLiteStatement.bindString(89, momentTopicRemoveOwner.getUserHeadUrl());
            }
            if (momentTopicRemoveOwner.getMomentImageUrl() == null) {
                supportSQLiteStatement.bindNull(90);
            } else {
                supportSQLiteStatement.bindString(90, momentTopicRemoveOwner.getMomentImageUrl());
            }
            supportSQLiteStatement.bindLong(91, momentTopicRemoveOwner.getMomentId());
            if (momentTopicRemoveOwner.getTopicName() == null) {
                supportSQLiteStatement.bindNull(92);
            } else {
                supportSQLiteStatement.bindString(92, momentTopicRemoveOwner.getTopicName());
            }
        } else {
            OooO0OO.OooO0O0(supportSQLiteStatement, 88, 89, 90, 91);
            supportSQLiteStatement.bindNull(92);
        }
        MomentMessage.MomentTopicRemoveAdmin momentTopicRemoveAdmin = momentMessage2.getMomentTopicRemoveAdmin();
        if (momentTopicRemoveAdmin != null) {
            supportSQLiteStatement.bindLong(93, momentTopicRemoveAdmin.getUserId());
            if (momentTopicRemoveAdmin.getUserHeadUrl() == null) {
                supportSQLiteStatement.bindNull(94);
            } else {
                supportSQLiteStatement.bindString(94, momentTopicRemoveAdmin.getUserHeadUrl());
            }
            if (momentTopicRemoveAdmin.getMomentImageUrl() == null) {
                supportSQLiteStatement.bindNull(95);
            } else {
                supportSQLiteStatement.bindString(95, momentTopicRemoveAdmin.getMomentImageUrl());
            }
            supportSQLiteStatement.bindLong(96, momentTopicRemoveAdmin.getMomentId());
            if (momentTopicRemoveAdmin.getTopicName() == null) {
                supportSQLiteStatement.bindNull(97);
            } else {
                supportSQLiteStatement.bindString(97, momentTopicRemoveAdmin.getTopicName());
            }
        } else {
            OooO0OO.OooO0O0(supportSQLiteStatement, 93, 94, 95, 96);
            supportSQLiteStatement.bindNull(97);
        }
        MomentMessage.TopicGroupCreateSuccessNotice topicGroupCreateSuccessNotice = momentMessage2.getTopicGroupCreateSuccessNotice();
        if (topicGroupCreateSuccessNotice != null) {
            if (topicGroupCreateSuccessNotice.getUserId() == null) {
                supportSQLiteStatement.bindNull(98);
            } else {
                supportSQLiteStatement.bindLong(98, topicGroupCreateSuccessNotice.getUserId().longValue());
            }
            if (topicGroupCreateSuccessNotice.getNickName() == null) {
                supportSQLiteStatement.bindNull(99);
            } else {
                supportSQLiteStatement.bindString(99, topicGroupCreateSuccessNotice.getNickName());
            }
            if (topicGroupCreateSuccessNotice.getHeadUrl() == null) {
                supportSQLiteStatement.bindNull(100);
            } else {
                supportSQLiteStatement.bindString(100, topicGroupCreateSuccessNotice.getHeadUrl());
            }
            if (topicGroupCreateSuccessNotice.getCircleId() == null) {
                supportSQLiteStatement.bindNull(101);
            } else {
                supportSQLiteStatement.bindLong(101, topicGroupCreateSuccessNotice.getCircleId().longValue());
            }
            if (topicGroupCreateSuccessNotice.getCircleName() == null) {
                supportSQLiteStatement.bindNull(102);
            } else {
                supportSQLiteStatement.bindString(102, topicGroupCreateSuccessNotice.getCircleName());
            }
            if (topicGroupCreateSuccessNotice.getCircleHead() == null) {
                supportSQLiteStatement.bindNull(103);
            } else {
                supportSQLiteStatement.bindString(103, topicGroupCreateSuccessNotice.getCircleHead());
            }
            if (topicGroupCreateSuccessNotice.getType() == null) {
                supportSQLiteStatement.bindNull(104);
            } else {
                supportSQLiteStatement.bindLong(104, topicGroupCreateSuccessNotice.getType().intValue());
            }
            if (topicGroupCreateSuccessNotice.getGroupOpenId() == null) {
                supportSQLiteStatement.bindNull(105);
            } else {
                supportSQLiteStatement.bindString(105, topicGroupCreateSuccessNotice.getGroupOpenId());
            }
        } else {
            OooO0OO.OooO0O0(supportSQLiteStatement, 98, 99, 100, 101);
            OooO0OO.OooO0O0(supportSQLiteStatement, 102, 103, 104, 105);
        }
        MomentMessage.TopicGroupCreateOrJoinResult topicGroupCreateOrJoinResult = momentMessage2.getTopicGroupCreateOrJoinResult();
        if (topicGroupCreateOrJoinResult != null) {
            if (topicGroupCreateOrJoinResult.getUserId() == null) {
                supportSQLiteStatement.bindNull(106);
            } else {
                supportSQLiteStatement.bindLong(106, topicGroupCreateOrJoinResult.getUserId().longValue());
            }
            if (topicGroupCreateOrJoinResult.getCircleId() == null) {
                supportSQLiteStatement.bindNull(107);
            } else {
                supportSQLiteStatement.bindLong(107, topicGroupCreateOrJoinResult.getCircleId().longValue());
            }
            if (topicGroupCreateOrJoinResult.getType() == null) {
                supportSQLiteStatement.bindNull(108);
            } else {
                supportSQLiteStatement.bindLong(108, topicGroupCreateOrJoinResult.getType().intValue());
            }
        } else {
            supportSQLiteStatement.bindNull(106);
            supportSQLiteStatement.bindNull(107);
            supportSQLiteStatement.bindNull(108);
        }
        MomentMessage.MomentSystemRemove momentSystemRemove = momentMessage2.getMomentSystemRemove();
        if (momentSystemRemove != null) {
            supportSQLiteStatement.bindLong(109, momentSystemRemove.getMomentId());
            if (momentSystemRemove.getMomentImageUrl() == null) {
                supportSQLiteStatement.bindNull(110);
            } else {
                supportSQLiteStatement.bindString(110, momentSystemRemove.getMomentImageUrl());
            }
            if (momentSystemRemove.getDeleteType() == null) {
                supportSQLiteStatement.bindNull(111);
            } else {
                supportSQLiteStatement.bindLong(111, momentSystemRemove.getDeleteType().intValue());
            }
        } else {
            supportSQLiteStatement.bindNull(109);
            supportSQLiteStatement.bindNull(110);
            supportSQLiteStatement.bindNull(111);
        }
        MomentMessage.CommentSystemRemove commentSystemRemove = momentMessage2.getCommentSystemRemove();
        if (commentSystemRemove != null) {
            supportSQLiteStatement.bindLong(112, commentSystemRemove.getCommentId());
            if (commentSystemRemove.getCommentContent() == null) {
                supportSQLiteStatement.bindNull(113);
            } else {
                supportSQLiteStatement.bindString(113, commentSystemRemove.getCommentContent());
            }
            if (commentSystemRemove.getDeleteType() == null) {
                supportSQLiteStatement.bindNull(114);
            } else {
                supportSQLiteStatement.bindLong(114, commentSystemRemove.getDeleteType().intValue());
            }
            if (commentSystemRemove.getDeleteContent() == null) {
                supportSQLiteStatement.bindNull(115);
            } else {
                supportSQLiteStatement.bindString(115, commentSystemRemove.getDeleteContent());
            }
        } else {
            OooO0OO.OooO0O0(supportSQLiteStatement, 112, 113, 114, 115);
        }
        MomentMessage.MomentReportFeedback momentReportFeedback = momentMessage2.getMomentReportFeedback();
        if (momentReportFeedback != null) {
            if (momentReportFeedback.getMomentId() == null) {
                supportSQLiteStatement.bindNull(116);
            } else {
                supportSQLiteStatement.bindLong(116, momentReportFeedback.getMomentId().longValue());
            }
            if (momentReportFeedback.getMomentImageUrl() == null) {
                supportSQLiteStatement.bindNull(117);
            } else {
                supportSQLiteStatement.bindString(117, momentReportFeedback.getMomentImageUrl());
            }
            if (momentReportFeedback.getMomentContent() == null) {
                supportSQLiteStatement.bindNull(118);
            } else {
                supportSQLiteStatement.bindString(118, momentReportFeedback.getMomentContent());
            }
            if (momentReportFeedback.getMomentTitle() == null) {
                supportSQLiteStatement.bindNull(119);
            } else {
                supportSQLiteStatement.bindString(119, momentReportFeedback.getMomentTitle());
            }
        } else {
            OooO0OO.OooO0O0(supportSQLiteStatement, 116, 117, 118, 119);
        }
        MomentMessage.CommentReportFeedback commentReportFeedback = momentMessage2.getCommentReportFeedback();
        if (commentReportFeedback != null) {
            if (commentReportFeedback.getMomentId() == null) {
                supportSQLiteStatement.bindNull(120);
            } else {
                supportSQLiteStatement.bindLong(120, commentReportFeedback.getMomentId().longValue());
            }
            if (commentReportFeedback.getContent() == null) {
                supportSQLiteStatement.bindNull(121);
            } else {
                supportSQLiteStatement.bindString(121, commentReportFeedback.getContent());
            }
            if (commentReportFeedback.getMomentImageUrl() == null) {
                supportSQLiteStatement.bindNull(122);
            } else {
                supportSQLiteStatement.bindString(122, commentReportFeedback.getMomentImageUrl());
            }
            if (commentReportFeedback.getTitle() == null) {
                supportSQLiteStatement.bindNull(123);
            } else {
                supportSQLiteStatement.bindString(123, commentReportFeedback.getTitle());
            }
            if (commentReportFeedback.getCommentId() == null) {
                supportSQLiteStatement.bindNull(124);
            } else {
                supportSQLiteStatement.bindLong(124, commentReportFeedback.getCommentId().longValue());
            }
            if (commentReportFeedback.getCommentContent() == null) {
                supportSQLiteStatement.bindNull(125);
            } else {
                supportSQLiteStatement.bindString(125, commentReportFeedback.getCommentContent());
            }
        } else {
            OooO0OO.OooO0O0(supportSQLiteStatement, 120, 121, 122, 123);
            supportSQLiteStatement.bindNull(124);
            supportSQLiteStatement.bindNull(125);
        }
        MomentMessage.CircleReportFeedback circleReportFeedback = momentMessage2.getCircleReportFeedback();
        if (circleReportFeedback != null) {
            if (circleReportFeedback.getCircleId() == null) {
                supportSQLiteStatement.bindNull(126);
            } else {
                supportSQLiteStatement.bindLong(126, circleReportFeedback.getCircleId().longValue());
            }
            if (circleReportFeedback.getCircleContent() == null) {
                supportSQLiteStatement.bindNull(127);
            } else {
                supportSQLiteStatement.bindString(127, circleReportFeedback.getCircleContent());
            }
            if (circleReportFeedback.getCircleImageUrl() == null) {
                supportSQLiteStatement.bindNull(128);
            } else {
                supportSQLiteStatement.bindString(128, circleReportFeedback.getCircleImageUrl());
            }
            if (circleReportFeedback.getCircleTitle() == null) {
                supportSQLiteStatement.bindNull(Constants.ERR_WATERMARK_READ);
            } else {
                supportSQLiteStatement.bindString(Constants.ERR_WATERMARK_READ, circleReportFeedback.getCircleTitle());
            }
        } else {
            OooO0OO.OooO0O0(supportSQLiteStatement, 126, 127, 128, Constants.ERR_WATERMARK_READ);
        }
        MomentMessage.TopicCreateSuccess topicCreateSuccess = momentMessage2.getTopicCreateSuccess();
        if (topicCreateSuccess != null) {
            supportSQLiteStatement.bindLong(Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED, topicCreateSuccess.getTopicUserId());
            supportSQLiteStatement.bindLong(131, topicCreateSuccess.getTopicId());
            if (topicCreateSuccess.getTopicName() == null) {
                supportSQLiteStatement.bindNull(132);
            } else {
                supportSQLiteStatement.bindString(132, topicCreateSuccess.getTopicName());
            }
            if (topicCreateSuccess.getMessage() == null) {
                supportSQLiteStatement.bindNull(133);
            } else {
                supportSQLiteStatement.bindString(133, topicCreateSuccess.getMessage());
            }
        } else {
            OooO0OO.OooO0O0(supportSQLiteStatement, Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED, 131, 132, 133);
        }
        MomentMessage.TopicCreateFail topicCreateFail = momentMessage2.getTopicCreateFail();
        if (topicCreateFail != null) {
            supportSQLiteStatement.bindLong(134, topicCreateFail.getTopicUserId());
            supportSQLiteStatement.bindLong(135, topicCreateFail.getTopicId());
            if (topicCreateFail.getTopicName() == null) {
                supportSQLiteStatement.bindNull(136);
            } else {
                supportSQLiteStatement.bindString(136, topicCreateFail.getTopicName());
            }
            if (topicCreateFail.getMessage() == null) {
                supportSQLiteStatement.bindNull(137);
            } else {
                supportSQLiteStatement.bindString(137, topicCreateFail.getMessage());
            }
            supportSQLiteStatement.bindLong(138, topicCreateFail.getFailType());
        } else {
            OooO0OO.OooO0O0(supportSQLiteStatement, 134, 135, 136, 137);
            supportSQLiteStatement.bindNull(138);
        }
        MomentMessage.TopicCreateDisband topicCreateDisband = momentMessage2.getTopicCreateDisband();
        if (topicCreateDisband != null) {
            supportSQLiteStatement.bindLong(139, topicCreateDisband.getTopicUserId());
            supportSQLiteStatement.bindLong(140, topicCreateDisband.getTopicId());
            if (topicCreateDisband.getTopicName() == null) {
                supportSQLiteStatement.bindNull(ZegoConstants.RoomError.SessionError);
            } else {
                supportSQLiteStatement.bindString(ZegoConstants.RoomError.SessionError, topicCreateDisband.getTopicName());
            }
            if (topicCreateDisband.getMessage() == null) {
                supportSQLiteStatement.bindNull(142);
            } else {
                supportSQLiteStatement.bindString(142, topicCreateDisband.getMessage());
            }
            supportSQLiteStatement.bindLong(143, topicCreateDisband.getDisbandContent());
        } else {
            OooO0OO.OooO0O0(supportSQLiteStatement, 139, 140, ZegoConstants.RoomError.SessionError, 142);
            supportSQLiteStatement.bindNull(143);
        }
        MomentMessage.TopicMemberAdd topicMemberAdd = momentMessage2.getTopicMemberAdd();
        if (topicMemberAdd == null) {
            supportSQLiteStatement.bindNull(144);
            supportSQLiteStatement.bindNull(145);
            return;
        }
        supportSQLiteStatement.bindLong(144, topicMemberAdd.getTopicId());
        if (topicMemberAdd.getContent() == null) {
            supportSQLiteStatement.bindNull(145);
        } else {
            supportSQLiteStatement.bindString(145, topicMemberAdd.getContent());
        }
    }
}
