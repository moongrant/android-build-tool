package com.yalla.yalla.data.db.table;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Index;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p590o0oOooo0.oOOOOo0O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Entity(indices = {@Index(unique = true, value = {"uid", "mid"})}, primaryKeys = {"uid", "mid"}, tableName = "MomentMessageTable")
@Metadata(d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b$\b\u0007\u0018\u0000 Å\u00012\u00020\u0001:6½\u0001¾\u0001¿\u0001À\u0001Á\u0001Â\u0001Ã\u0001Ä\u0001Å\u0001Æ\u0001Ç\u0001È\u0001É\u0001Ê\u0001Ë\u0001Ì\u0001Í\u0001Î\u0001Ï\u0001Ð\u0001Ñ\u0001Ò\u0001Ó\u0001Ô\u0001Õ\u0001Ö\u0001×\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010¼\u0001\u001a\u000209H\u0016R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010!\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R \u0010'\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R \u0010-\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001e\u00103\u001a\u0002048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00105\"\u0004\b6\u00107R\u001e\u00108\u001a\u0002098\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001e\u0010>\u001a\u0002098\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010;\"\u0004\b@\u0010=R \u0010A\u001a\u0004\u0018\u00010B8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR \u0010G\u001a\u0004\u0018\u00010H8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR \u0010M\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR \u0010S\u001a\u0004\u0018\u00010T8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR \u0010Y\u001a\u0004\u0018\u00010Z8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R \u0010_\u001a\u0004\u0018\u00010`8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR \u0010e\u001a\u0004\u0018\u00010f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR \u0010k\u001a\u0004\u0018\u00010l8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR \u0010q\u001a\u0004\u0018\u00010r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR \u0010w\u001a\u0004\u0018\u00010x8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R#\u0010}\u001a\u0004\u0018\u00010~8\u0006@\u0006X\u0087\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R&\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R$\u0010\u0089\u0001\u001a\u00030\u008a\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R&\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R&\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0096\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R&\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009c\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R&\u0010¡\u0001\u001a\u0005\u0018\u00010¢\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R&\u0010§\u0001\u001a\u0005\u0018\u00010¨\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R&\u0010\u00ad\u0001\u001a\u0005\u0018\u00010®\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R$\u0010³\u0001\u001a\u00030´\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001R$\u0010¹\u0001\u001a\u00030\u008a\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bº\u0001\u0010\u008c\u0001\"\u0006\b»\u0001\u0010\u008e\u0001¨\u0006Ø\u0001"}, d2 = {"Lcom/yalla/yalla/data/db/table/MomentMessage;", "", "()V", "circleReportFeedback", "Lcom/yalla/yalla/data/db/table/MomentMessage$CircleReportFeedback;", "getCircleReportFeedback", "()Lcom/yalla/yalla/data/db/table/MomentMessage$CircleReportFeedback;", "setCircleReportFeedback", "(Lcom/yalla/yalla/data/db/table/MomentMessage$CircleReportFeedback;)V", "commentAt", "Lcom/yalla/yalla/data/db/table/MomentMessage$CommentAt;", "getCommentAt", "()Lcom/yalla/yalla/data/db/table/MomentMessage$CommentAt;", "setCommentAt", "(Lcom/yalla/yalla/data/db/table/MomentMessage$CommentAt;)V", "commentFeatured", "Lcom/yalla/yalla/data/db/table/MomentMessage$CommentFeatured;", "getCommentFeatured", "()Lcom/yalla/yalla/data/db/table/MomentMessage$CommentFeatured;", "setCommentFeatured", "(Lcom/yalla/yalla/data/db/table/MomentMessage$CommentFeatured;)V", "commentPraise", "Lcom/yalla/yalla/data/db/table/MomentMessage$CommentPraise;", "getCommentPraise", "()Lcom/yalla/yalla/data/db/table/MomentMessage$CommentPraise;", "setCommentPraise", "(Lcom/yalla/yalla/data/db/table/MomentMessage$CommentPraise;)V", "commentReply", "Lcom/yalla/yalla/data/db/table/MomentMessage$CommentReply;", "getCommentReply", "()Lcom/yalla/yalla/data/db/table/MomentMessage$CommentReply;", "setCommentReply", "(Lcom/yalla/yalla/data/db/table/MomentMessage$CommentReply;)V", "commentReportFeedback", "Lcom/yalla/yalla/data/db/table/MomentMessage$CommentReportFeedback;", "getCommentReportFeedback", "()Lcom/yalla/yalla/data/db/table/MomentMessage$CommentReportFeedback;", "setCommentReportFeedback", "(Lcom/yalla/yalla/data/db/table/MomentMessage$CommentReportFeedback;)V", "commentReward", "Lcom/yalla/yalla/data/db/table/MomentMessage$CommentReward;", "getCommentReward", "()Lcom/yalla/yalla/data/db/table/MomentMessage$CommentReward;", "setCommentReward", "(Lcom/yalla/yalla/data/db/table/MomentMessage$CommentReward;)V", "commentSystemRemove", "Lcom/yalla/yalla/data/db/table/MomentMessage$CommentSystemRemove;", "getCommentSystemRemove", "()Lcom/yalla/yalla/data/db/table/MomentMessage$CommentSystemRemove;", "setCommentSystemRemove", "(Lcom/yalla/yalla/data/db/table/MomentMessage$CommentSystemRemove;)V", "isRead", "", "()Z", "setRead", "(Z)V", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "mid", "getMid", "setMid", "momentAt", "Lcom/yalla/yalla/data/db/table/MomentMessage$MomentAt;", "getMomentAt", "()Lcom/yalla/yalla/data/db/table/MomentMessage$MomentAt;", "setMomentAt", "(Lcom/yalla/yalla/data/db/table/MomentMessage$MomentAt;)V", "momentComment", "Lcom/yalla/yalla/data/db/table/MomentMessage$MomentComment;", "getMomentComment", "()Lcom/yalla/yalla/data/db/table/MomentMessage$MomentComment;", "setMomentComment", "(Lcom/yalla/yalla/data/db/table/MomentMessage$MomentComment;)V", "momentFeatured", "Lcom/yalla/yalla/data/db/table/MomentMessage$MomentFeatured;", "getMomentFeatured", "()Lcom/yalla/yalla/data/db/table/MomentMessage$MomentFeatured;", "setMomentFeatured", "(Lcom/yalla/yalla/data/db/table/MomentMessage$MomentFeatured;)V", "momentGift", "Lcom/yalla/yalla/data/db/table/MomentMessage$MomentGift;", "getMomentGift", "()Lcom/yalla/yalla/data/db/table/MomentMessage$MomentGift;", "setMomentGift", "(Lcom/yalla/yalla/data/db/table/MomentMessage$MomentGift;)V", "momentPraise", "Lcom/yalla/yalla/data/db/table/MomentMessage$MomentPraise;", "getMomentPraise", "()Lcom/yalla/yalla/data/db/table/MomentMessage$MomentPraise;", "setMomentPraise", "(Lcom/yalla/yalla/data/db/table/MomentMessage$MomentPraise;)V", "momentReportFeedback", "Lcom/yalla/yalla/data/db/table/MomentMessage$MomentReportFeedback;", "getMomentReportFeedback", "()Lcom/yalla/yalla/data/db/table/MomentMessage$MomentReportFeedback;", "setMomentReportFeedback", "(Lcom/yalla/yalla/data/db/table/MomentMessage$MomentReportFeedback;)V", "momentSystemRemove", "Lcom/yalla/yalla/data/db/table/MomentMessage$MomentSystemRemove;", "getMomentSystemRemove", "()Lcom/yalla/yalla/data/db/table/MomentMessage$MomentSystemRemove;", "setMomentSystemRemove", "(Lcom/yalla/yalla/data/db/table/MomentMessage$MomentSystemRemove;)V", "momentTopicRemoveAdmin", "Lcom/yalla/yalla/data/db/table/MomentMessage$MomentTopicRemoveAdmin;", "getMomentTopicRemoveAdmin", "()Lcom/yalla/yalla/data/db/table/MomentMessage$MomentTopicRemoveAdmin;", "setMomentTopicRemoveAdmin", "(Lcom/yalla/yalla/data/db/table/MomentMessage$MomentTopicRemoveAdmin;)V", "momentTopicRemoveOwner", "Lcom/yalla/yalla/data/db/table/MomentMessage$MomentTopicRemoveOwner;", "getMomentTopicRemoveOwner", "()Lcom/yalla/yalla/data/db/table/MomentMessage$MomentTopicRemoveOwner;", "setMomentTopicRemoveOwner", "(Lcom/yalla/yalla/data/db/table/MomentMessage$MomentTopicRemoveOwner;)V", "momentTopicTop", "Lcom/yalla/yalla/data/db/table/MomentMessage$MomentTopicTop;", "getMomentTopicTop", "()Lcom/yalla/yalla/data/db/table/MomentMessage$MomentTopicTop;", "setMomentTopicTop", "(Lcom/yalla/yalla/data/db/table/MomentMessage$MomentTopicTop;)V", "momentTopicTopRevoke", "Lcom/yalla/yalla/data/db/table/MomentMessage$MomentTopicTopRevoke;", "getMomentTopicTopRevoke", "()Lcom/yalla/yalla/data/db/table/MomentMessage$MomentTopicTopRevoke;", "setMomentTopicTopRevoke", "(Lcom/yalla/yalla/data/db/table/MomentMessage$MomentTopicTopRevoke;)V", "replyReward", "Lcom/yalla/yalla/data/db/table/MomentMessage$ReplyReward;", "getReplyReward", "()Lcom/yalla/yalla/data/db/table/MomentMessage$ReplyReward;", "setReplyReward", "(Lcom/yalla/yalla/data/db/table/MomentMessage$ReplyReward;)V", "time", "", "getTime", "()J", "setTime", "(J)V", "topicCreateDisband", "Lcom/yalla/yalla/data/db/table/MomentMessage$TopicCreateDisband;", "getTopicCreateDisband", "()Lcom/yalla/yalla/data/db/table/MomentMessage$TopicCreateDisband;", "setTopicCreateDisband", "(Lcom/yalla/yalla/data/db/table/MomentMessage$TopicCreateDisband;)V", "topicCreateFail", "Lcom/yalla/yalla/data/db/table/MomentMessage$TopicCreateFail;", "getTopicCreateFail", "()Lcom/yalla/yalla/data/db/table/MomentMessage$TopicCreateFail;", "setTopicCreateFail", "(Lcom/yalla/yalla/data/db/table/MomentMessage$TopicCreateFail;)V", "topicCreateSuccess", "Lcom/yalla/yalla/data/db/table/MomentMessage$TopicCreateSuccess;", "getTopicCreateSuccess", "()Lcom/yalla/yalla/data/db/table/MomentMessage$TopicCreateSuccess;", "setTopicCreateSuccess", "(Lcom/yalla/yalla/data/db/table/MomentMessage$TopicCreateSuccess;)V", "topicGroupCreateOrJoinResult", "Lcom/yalla/yalla/data/db/table/MomentMessage$TopicGroupCreateOrJoinResult;", "getTopicGroupCreateOrJoinResult", "()Lcom/yalla/yalla/data/db/table/MomentMessage$TopicGroupCreateOrJoinResult;", "setTopicGroupCreateOrJoinResult", "(Lcom/yalla/yalla/data/db/table/MomentMessage$TopicGroupCreateOrJoinResult;)V", "topicGroupCreateSuccessNotice", "Lcom/yalla/yalla/data/db/table/MomentMessage$TopicGroupCreateSuccessNotice;", "getTopicGroupCreateSuccessNotice", "()Lcom/yalla/yalla/data/db/table/MomentMessage$TopicGroupCreateSuccessNotice;", "setTopicGroupCreateSuccessNotice", "(Lcom/yalla/yalla/data/db/table/MomentMessage$TopicGroupCreateSuccessNotice;)V", "topicMemberAdd", "Lcom/yalla/yalla/data/db/table/MomentMessage$TopicMemberAdd;", "getTopicMemberAdd", "()Lcom/yalla/yalla/data/db/table/MomentMessage$TopicMemberAdd;", "setTopicMemberAdd", "(Lcom/yalla/yalla/data/db/table/MomentMessage$TopicMemberAdd;)V", "type", "", "getType", "()I", "setType", "(I)V", "uid", "getUid", "setUid", "toString", "CircleReportFeedback", "CommentAt", "CommentFeatured", "CommentPraise", "CommentReply", "CommentReportFeedback", "CommentReward", "CommentSystemRemove", "Companion", "MomentAt", "MomentComment", "MomentFeatured", "MomentGift", "MomentPraise", "MomentReportFeedback", "MomentSystemRemove", "MomentTopicRemoveAdmin", "MomentTopicRemoveOwner", "MomentTopicTop", "MomentTopicTopRevoke", "ReplyReward", "TopicCreateDisband", "TopicCreateFail", "TopicCreateSuccess", "TopicGroupCreateOrJoinResult", "TopicGroupCreateSuccessNotice", "TopicMemberAdd", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MomentMessage {
    public static final int TYPE_CIRCLE_REPORT_FEEDBACK = 20;
    public static final int TYPE_COMMENT_AT_ADD = 6;
    public static final int TYPE_COMMENT_AT_REVOKE = -6;
    public static final int TYPE_COMMENT_FEATURED_ADD = 11;
    public static final int TYPE_COMMENT_PRAISE_ADD = 2;
    public static final int TYPE_COMMENT_REPLY_ADD = 4;
    public static final int TYPE_COMMENT_REPLY_REVOKE = -4;
    public static final int TYPE_COMMENT_REPORT_FEEDBACK = 17;
    public static final int TYPE_COMMENT_REWARD_ADD = 8;
    public static final int TYPE_MOMENT_AT_ADD = 5;
    public static final int TYPE_MOMENT_COMMENT_ADD = 3;
    public static final int TYPE_MOMENT_COMMENT_REVOKE = -3;
    public static final int TYPE_MOMENT_FEATURED_ADD = 10;
    public static final int TYPE_MOMENT_GIFT_ADD = 7;
    public static final int TYPE_MOMENT_PRAISE_ADD = 1;
    public static final int TYPE_MOMENT_PRAISE_REVOKE = -1;
    public static final int TYPE_MOMENT_REPORT_FEEDBACK = 16;
    public static final int TYPE_MOMENT_SYSTEM_REMOVE = 15;
    public static final int TYPE_MOMENT_TOPIC_REMOVE_ADMIN = 14;
    public static final int TYPE_MOMENT_TOPIC_REMOVE_OWNER = 13;
    public static final int TYPE_MOMENT_TOPIC_TOP_ADD = 12;
    public static final int TYPE_MOMENT_TOPIC_TOP_REVOKE = -12;
    public static final int TYPE_REPLY_REWARD_ADD = 9;
    public static final int TYPE_TOPIC_GROUP_CREATE = 18;
    public static final int TYPE_TOPIC_GROUP_JOIN = 19;

    @Embedded
    @Nullable
    private CircleReportFeedback circleReportFeedback;

    @Embedded
    @Nullable
    private CommentAt commentAt;

    @Embedded
    @Nullable
    private CommentFeatured commentFeatured;

    @Embedded
    @Nullable
    private CommentPraise commentPraise;

    @Embedded
    @Nullable
    private CommentReply commentReply;

    @Embedded
    @Nullable
    private CommentReportFeedback commentReportFeedback;

    @Embedded
    @Nullable
    private CommentReward commentReward;

    @Embedded
    @Nullable
    private CommentSystemRemove commentSystemRemove;

    @ColumnInfo(name = "isRead")
    private boolean isRead;

    @Embedded
    @Nullable
    private MomentAt momentAt;

    @Embedded
    @Nullable
    private MomentComment momentComment;

    @Embedded
    @Nullable
    private MomentFeatured momentFeatured;

    @Embedded
    @Nullable
    private MomentGift momentGift;

    @Embedded
    @Nullable
    private MomentPraise momentPraise;

    @Embedded
    @Nullable
    private MomentReportFeedback momentReportFeedback;

    @Embedded
    @Nullable
    private MomentSystemRemove momentSystemRemove;

    @Embedded
    @Nullable
    private MomentTopicRemoveAdmin momentTopicRemoveAdmin;

    @Embedded
    @Nullable
    private MomentTopicRemoveOwner momentTopicRemoveOwner;

    @Embedded
    @Nullable
    private MomentTopicTop momentTopicTop;

    @Embedded
    @Nullable
    private MomentTopicTopRevoke momentTopicTopRevoke;

    @Embedded
    @Nullable
    private ReplyReward replyReward;

    @ColumnInfo(name = "time")
    private long time;

    @Embedded
    @Nullable
    private TopicCreateDisband topicCreateDisband;

    @Embedded
    @Nullable
    private TopicCreateFail topicCreateFail;

    @Embedded
    @Nullable
    private TopicCreateSuccess topicCreateSuccess;

    @Embedded
    @Nullable
    private TopicGroupCreateOrJoinResult topicGroupCreateOrJoinResult;

    @Embedded
    @Nullable
    private TopicGroupCreateSuccessNotice topicGroupCreateSuccessNotice;

    @Embedded
    @Nullable
    private TopicMemberAdd topicMemberAdd;

    @ColumnInfo(name = "type")
    private int type;

    @ColumnInfo(name = "uid")
    private long uid;
    public static final int $stable = 8;

    @ColumnInfo(name = "mid")
    @NotNull
    private String mid = "";

    @ColumnInfo(name = ShareConstants.WEB_DIALOG_PARAM_MESSAGE)
    @NotNull
    private String message = "";

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR \u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/yalla/yalla/data/db/table/MomentMessage$CircleReportFeedback;", "", "()V", "circleContent", "", "getCircleContent", "()Ljava/lang/String;", "setCircleContent", "(Ljava/lang/String;)V", "circleId", "", "getCircleId", "()Ljava/lang/Long;", "setCircleId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "circleImageUrl", "getCircleImageUrl", "setCircleImageUrl", "circleTitle", "getCircleTitle", "setCircleTitle", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CircleReportFeedback {
        public static final int $stable = 8;

        @ColumnInfo(name = "circleContent_CircleReportFeedback")
        @Nullable
        private String circleContent;

        @ColumnInfo(name = "circleId_CircleReportFeedback")
        @Nullable
        private Long circleId;

        @ColumnInfo(name = "circleImageUrl_CircleReportFeedback")
        @Nullable
        private String circleImageUrl;

        @ColumnInfo(name = "circleTitle_CircleReportFeedback")
        @Nullable
        private String circleTitle;

        @Nullable
        public final String getCircleContent() {
            return this.circleContent;
        }

        @Nullable
        public final Long getCircleId() {
            return this.circleId;
        }

        @Nullable
        public final String getCircleImageUrl() {
            return this.circleImageUrl;
        }

        @Nullable
        public final String getCircleTitle() {
            return this.circleTitle;
        }

        public final void setCircleContent(@Nullable String str) {
            this.circleContent = str;
        }

        public final void setCircleId(@Nullable Long l) {
            this.circleId = l;
        }

        public final void setCircleImageUrl(@Nullable String str) {
            this.circleImageUrl = str;
        }

        public final void setCircleTitle(@Nullable String str) {
            this.circleTitle = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001e\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001e\u0010\u001b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001e\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/yalla/yalla/data/db/table/MomentMessage$CommentAt;", "", "()V", "commentContent", "", "getCommentContent", "()Ljava/lang/String;", "setCommentContent", "(Ljava/lang/String;)V", "commentId", "", "getCommentId", "()J", "setCommentId", "(J)V", "momentContent", "getMomentContent", "setMomentContent", "momentId", "getMomentId", "setMomentId", "momentImageUrl", "getMomentImageUrl", "setMomentImageUrl", "userHeadUrl", "getUserHeadUrl", "setUserHeadUrl", "userId", "getUserId", "setUserId", "userNickName", "getUserNickName", "setUserNickName", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CommentAt {
        public static final int $stable = 8;

        @ColumnInfo(name = "commentId_CommentAt")
        private long commentId;

        @ColumnInfo(name = "momentId_CommentAt")
        private long momentId;

        @ColumnInfo(name = "userId_CommentAt")
        private long userId;

        @ColumnInfo(name = "userNickName_CommentAt")
        @NotNull
        private String userNickName = "";

        @ColumnInfo(name = "userHeadUrl_CommentAt")
        @NotNull
        private String userHeadUrl = "";

        @ColumnInfo(name = "momentImageUrl_CommentAt")
        @NotNull
        private String momentImageUrl = "";

        @ColumnInfo(name = "momentContent_CommentAt")
        @NotNull
        private String momentContent = "";

        @ColumnInfo(name = "commentContent_CommentAt")
        @NotNull
        private String commentContent = "";

        @NotNull
        public final String getCommentContent() {
            return this.commentContent;
        }

        public final long getCommentId() {
            return this.commentId;
        }

        @NotNull
        public final String getMomentContent() {
            return this.momentContent;
        }

        public final long getMomentId() {
            return this.momentId;
        }

        @NotNull
        public final String getMomentImageUrl() {
            return this.momentImageUrl;
        }

        @NotNull
        public final String getUserHeadUrl() {
            return this.userHeadUrl;
        }

        public final long getUserId() {
            return this.userId;
        }

        @NotNull
        public final String getUserNickName() {
            return this.userNickName;
        }

        public final void setCommentContent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.commentContent = str;
        }

        public final void setCommentId(long j) {
            this.commentId = j;
        }

        public final void setMomentContent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.momentContent = str;
        }

        public final void setMomentId(long j) {
            this.momentId = j;
        }

        public final void setMomentImageUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.momentImageUrl = str;
        }

        public final void setUserHeadUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userHeadUrl = str;
        }

        public final void setUserId(long j) {
            this.userId = j;
        }

        public final void setUserNickName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userNickName = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/data/db/table/MomentMessage$CommentFeatured;", "", "()V", "commentId", "", "getCommentId", "()J", "setCommentId", "(J)V", "momentContent", "", "getMomentContent", "()Ljava/lang/String;", "setMomentContent", "(Ljava/lang/String;)V", "momentId", "getMomentId", "setMomentId", "momentImageUrl", "getMomentImageUrl", "setMomentImageUrl", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CommentFeatured {
        public static final int $stable = 8;

        @ColumnInfo(name = "commentId_CommentFeatured")
        private long commentId;

        @ColumnInfo(name = "momentId_CommentFeatured")
        private long momentId;

        @ColumnInfo(name = "momentImageUrl_CommentFeatured")
        @NotNull
        private String momentImageUrl = "";

        @ColumnInfo(name = "momentContent_CommentFeatured")
        @NotNull
        private String momentContent = "";

        public final long getCommentId() {
            return this.commentId;
        }

        @NotNull
        public final String getMomentContent() {
            return this.momentContent;
        }

        public final long getMomentId() {
            return this.momentId;
        }

        @NotNull
        public final String getMomentImageUrl() {
            return this.momentImageUrl;
        }

        public final void setCommentId(long j) {
            this.commentId = j;
        }

        public final void setMomentContent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.momentContent = str;
        }

        public final void setMomentId(long j) {
            this.momentId = j;
        }

        public final void setMomentImageUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.momentImageUrl = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001e\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/yalla/yalla/data/db/table/MomentMessage$CommentPraise;", "", "()V", "momentContent", "", "getMomentContent", "()Ljava/lang/String;", "setMomentContent", "(Ljava/lang/String;)V", "momentId", "", "getMomentId", "()J", "setMomentId", "(J)V", "momentImageUrl", "getMomentImageUrl", "setMomentImageUrl", "userHeadUrl", "getUserHeadUrl", "setUserHeadUrl", "userId", "getUserId", "setUserId", "userNickName", "getUserNickName", "setUserNickName", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CommentPraise {
        public static final int $stable = 8;

        @ColumnInfo(name = "momentId_CommentPraise")
        private long momentId;

        @ColumnInfo(name = "userId_CommentPraise")
        private long userId;

        @ColumnInfo(name = "userNickName_CommentPraise")
        @NotNull
        private String userNickName = "";

        @ColumnInfo(name = "userHeadUrl_CommentPraise")
        @NotNull
        private String userHeadUrl = "";

        @ColumnInfo(name = "momentImageUrl_CommentPraise")
        @NotNull
        private String momentImageUrl = "";

        @ColumnInfo(name = "momentContent_CommentPraise")
        @NotNull
        private String momentContent = "";

        @NotNull
        public final String getMomentContent() {
            return this.momentContent;
        }

        public final long getMomentId() {
            return this.momentId;
        }

        @NotNull
        public final String getMomentImageUrl() {
            return this.momentImageUrl;
        }

        @NotNull
        public final String getUserHeadUrl() {
            return this.userHeadUrl;
        }

        public final long getUserId() {
            return this.userId;
        }

        @NotNull
        public final String getUserNickName() {
            return this.userNickName;
        }

        public final void setMomentContent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.momentContent = str;
        }

        public final void setMomentId(long j) {
            this.momentId = j;
        }

        public final void setMomentImageUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.momentImageUrl = str;
        }

        public final void setUserHeadUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userHeadUrl = str;
        }

        public final void setUserId(long j) {
            this.userId = j;
        }

        public final void setUserNickName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userNickName = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001e\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001e\u0010\u001b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001e\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001e\u0010!\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\u001e\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\b¨\u0006'"}, d2 = {"Lcom/yalla/yalla/data/db/table/MomentMessage$CommentReply;", "", "()V", "commentContent", "", "getCommentContent", "()Ljava/lang/String;", "setCommentContent", "(Ljava/lang/String;)V", "commentId", "", "getCommentId", "()J", "setCommentId", "(J)V", "momentContent", "getMomentContent", "setMomentContent", "momentId", "getMomentId", "setMomentId", "momentImageUrl", "getMomentImageUrl", "setMomentImageUrl", "replyContent", "getReplyContent", "setReplyContent", "replyId", "getReplyId", "setReplyId", "userHeadUrl", "getUserHeadUrl", "setUserHeadUrl", "userId", "getUserId", "setUserId", "userNickName", "getUserNickName", "setUserNickName", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CommentReply {
        public static final int $stable = 8;

        @ColumnInfo(name = "commentId_CommentReply")
        private long commentId;

        @ColumnInfo(name = "momentId_CommentReply")
        private long momentId;

        @ColumnInfo(name = "replyId_CommentReply")
        private long replyId;

        @ColumnInfo(name = "userId_CommentReply")
        private long userId;

        @ColumnInfo(name = "userNickName_CommentReply")
        @NotNull
        private String userNickName = "";

        @ColumnInfo(name = "userHeadUrl_CommentReply")
        @NotNull
        private String userHeadUrl = "";

        @ColumnInfo(name = "momentImageUrl_CommentReply")
        @NotNull
        private String momentImageUrl = "";

        @ColumnInfo(name = "momentContent_CommentReply")
        @NotNull
        private String momentContent = "";

        @ColumnInfo(name = "commentContent_CommentReply")
        @NotNull
        private String commentContent = "";

        @ColumnInfo(name = "replyContent_CommentReply")
        @NotNull
        private String replyContent = "";

        @NotNull
        public final String getCommentContent() {
            return this.commentContent;
        }

        public final long getCommentId() {
            return this.commentId;
        }

        @NotNull
        public final String getMomentContent() {
            return this.momentContent;
        }

        public final long getMomentId() {
            return this.momentId;
        }

        @NotNull
        public final String getMomentImageUrl() {
            return this.momentImageUrl;
        }

        @NotNull
        public final String getReplyContent() {
            return this.replyContent;
        }

        public final long getReplyId() {
            return this.replyId;
        }

        @NotNull
        public final String getUserHeadUrl() {
            return this.userHeadUrl;
        }

        public final long getUserId() {
            return this.userId;
        }

        @NotNull
        public final String getUserNickName() {
            return this.userNickName;
        }

        public final void setCommentContent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.commentContent = str;
        }

        public final void setCommentId(long j) {
            this.commentId = j;
        }

        public final void setMomentContent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.momentContent = str;
        }

        public final void setMomentId(long j) {
            this.momentId = j;
        }

        public final void setMomentImageUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.momentImageUrl = str;
        }

        public final void setReplyContent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.replyContent = str;
        }

        public final void setReplyId(long j) {
            this.replyId = j;
        }

        public final void setUserHeadUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userHeadUrl = str;
        }

        public final void setUserId(long j) {
            this.userId = j;
        }

        public final void setUserNickName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userNickName = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\"\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR \u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR \u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/yalla/yalla/data/db/table/MomentMessage$CommentReportFeedback;", "", "()V", "commentContent", "", "getCommentContent", "()Ljava/lang/String;", "setCommentContent", "(Ljava/lang/String;)V", "commentId", "", "getCommentId", "()Ljava/lang/Long;", "setCommentId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "content", "getContent", "setContent", "momentId", "getMomentId", "setMomentId", "momentImageUrl", "getMomentImageUrl", "setMomentImageUrl", ShareConstants.WEB_DIALOG_PARAM_TITLE, "getTitle", "setTitle", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CommentReportFeedback {
        public static final int $stable = 8;

        @ColumnInfo(name = "commentCommentContent_CommentReportFeedback")
        @Nullable
        private String commentContent;

        @ColumnInfo(name = "commentCommentId_CommentReportFeedback")
        @Nullable
        private Long commentId;

        @ColumnInfo(name = "commentContent_CommentReportFeedback")
        @Nullable
        private String content;

        @ColumnInfo(name = "commentId_CommentReportFeedback")
        @Nullable
        private Long momentId;

        @ColumnInfo(name = "momentImageUrl_CommentReportFeedback")
        @Nullable
        private String momentImageUrl;

        @ColumnInfo(name = "commentTitle_CommentReportFeedback")
        @Nullable
        private String title;

        @Nullable
        public final String getCommentContent() {
            return this.commentContent;
        }

        @Nullable
        public final Long getCommentId() {
            return this.commentId;
        }

        @Nullable
        public final String getContent() {
            return this.content;
        }

        @Nullable
        public final Long getMomentId() {
            return this.momentId;
        }

        @Nullable
        public final String getMomentImageUrl() {
            return this.momentImageUrl;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public final void setCommentContent(@Nullable String str) {
            this.commentContent = str;
        }

        public final void setCommentId(@Nullable Long l) {
            this.commentId = l;
        }

        public final void setContent(@Nullable String str) {
            this.content = str;
        }

        public final void setMomentId(@Nullable Long l) {
            this.momentId = l;
        }

        public final void setMomentImageUrl(@Nullable String str) {
            this.momentImageUrl = str;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001e\u0010\u0018\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001e\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\b¨\u0006\u001e"}, d2 = {"Lcom/yalla/yalla/data/db/table/MomentMessage$CommentReward;", "", "()V", "commentContent", "", "getCommentContent", "()Ljava/lang/String;", "setCommentContent", "(Ljava/lang/String;)V", "commentId", "", "getCommentId", "()J", "setCommentId", "(J)V", "momentId", "getMomentId", "setMomentId", "momentImageUrl", "getMomentImageUrl", "setMomentImageUrl", "userHeadUrl", "getUserHeadUrl", "setUserHeadUrl", "userId", "getUserId", "setUserId", "userNickName", "getUserNickName", "setUserNickName", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CommentReward {
        public static final int $stable = 8;

        @ColumnInfo(name = "commentId_CommentReward")
        private long commentId;

        @ColumnInfo(name = "momentId_CommentReward")
        private long momentId;

        @ColumnInfo(name = "userId_CommentReward")
        private long userId;

        @ColumnInfo(name = "userNickName_CommentReward")
        @NotNull
        private String userNickName = "";

        @ColumnInfo(name = "userHeadUrl_CommentReward")
        @NotNull
        private String userHeadUrl = "";

        @ColumnInfo(name = "momentImageUrl_CommentReward")
        @NotNull
        private String momentImageUrl = "";

        @ColumnInfo(name = "commentContent_CommentReward")
        @NotNull
        private String commentContent = "";

        @NotNull
        public final String getCommentContent() {
            return this.commentContent;
        }

        public final long getCommentId() {
            return this.commentId;
        }

        public final long getMomentId() {
            return this.momentId;
        }

        @NotNull
        public final String getMomentImageUrl() {
            return this.momentImageUrl;
        }

        @NotNull
        public final String getUserHeadUrl() {
            return this.userHeadUrl;
        }

        public final long getUserId() {
            return this.userId;
        }

        @NotNull
        public final String getUserNickName() {
            return this.userNickName;
        }

        public final void setCommentContent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.commentContent = str;
        }

        public final void setCommentId(long j) {
            this.commentId = j;
        }

        public final void setMomentId(long j) {
            this.momentId = j;
        }

        public final void setMomentImageUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.momentImageUrl = str;
        }

        public final void setUserHeadUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userHeadUrl = str;
        }

        public final void setUserId(long j) {
            this.userId = j;
        }

        public final void setUserNickName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userNickName = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/yalla/yalla/data/db/table/MomentMessage$CommentSystemRemove;", "", "()V", "commentContent", "", "getCommentContent", "()Ljava/lang/String;", "setCommentContent", "(Ljava/lang/String;)V", "commentId", "", "getCommentId", "()J", "setCommentId", "(J)V", "deleteContent", "getDeleteContent", "setDeleteContent", "deleteType", "", "getDeleteType", "()Ljava/lang/Integer;", "setDeleteType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CommentSystemRemove {
        public static final int $stable = 8;

        @ColumnInfo(name = "commentId_CommentSystemRemove")
        private long commentId;

        @ColumnInfo(name = "deleteContent_CommentSystemRemove")
        @Nullable
        private String deleteContent;

        @ColumnInfo(name = "commentContent_CommentSystemRemove")
        @NotNull
        private String commentContent = "";

        @ColumnInfo(name = "deleteType_CommentSystemRemove")
        @Nullable
        private Integer deleteType = 0;

        @NotNull
        public final String getCommentContent() {
            return this.commentContent;
        }

        public final long getCommentId() {
            return this.commentId;
        }

        @Nullable
        public final String getDeleteContent() {
            return this.deleteContent;
        }

        @Nullable
        public final Integer getDeleteType() {
            return this.deleteType;
        }

        public final void setCommentContent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.commentContent = str;
        }

        public final void setCommentId(long j) {
            this.commentId = j;
        }

        public final void setDeleteContent(@Nullable String str) {
            this.deleteContent = str;
        }

        public final void setDeleteType(@Nullable Integer num) {
            this.deleteType = num;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001e\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/yalla/yalla/data/db/table/MomentMessage$MomentAt;", "", "()V", "momentContent", "", "getMomentContent", "()Ljava/lang/String;", "setMomentContent", "(Ljava/lang/String;)V", "momentId", "", "getMomentId", "()J", "setMomentId", "(J)V", "momentImageUrl", "getMomentImageUrl", "setMomentImageUrl", "userHeadUrl", "getUserHeadUrl", "setUserHeadUrl", "userId", "getUserId", "setUserId", "userNickName", "getUserNickName", "setUserNickName", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MomentAt {
        public static final int $stable = 8;

        @ColumnInfo(name = "momentId_MomentAt")
        private long momentId;

        @ColumnInfo(name = "userId_MomentAt")
        private long userId;

        @ColumnInfo(name = "userNickName_MomentAt")
        @NotNull
        private String userNickName = "";

        @ColumnInfo(name = "userHeadUrl_MomentAt")
        @NotNull
        private String userHeadUrl = "";

        @ColumnInfo(name = "momentImageUrl_MomentAt")
        @NotNull
        private String momentImageUrl = "";

        @ColumnInfo(name = "momentContent_MomentAt")
        @NotNull
        private String momentContent = "";

        @NotNull
        public final String getMomentContent() {
            return this.momentContent;
        }

        public final long getMomentId() {
            return this.momentId;
        }

        @NotNull
        public final String getMomentImageUrl() {
            return this.momentImageUrl;
        }

        @NotNull
        public final String getUserHeadUrl() {
            return this.userHeadUrl;
        }

        public final long getUserId() {
            return this.userId;
        }

        @NotNull
        public final String getUserNickName() {
            return this.userNickName;
        }

        public final void setMomentContent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.momentContent = str;
        }

        public final void setMomentId(long j) {
            this.momentId = j;
        }

        public final void setMomentImageUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.momentImageUrl = str;
        }

        public final void setUserHeadUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userHeadUrl = str;
        }

        public final void setUserId(long j) {
            this.userId = j;
        }

        public final void setUserNickName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userNickName = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001e\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001e\u0010\u001b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001e\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/yalla/yalla/data/db/table/MomentMessage$MomentComment;", "", "()V", "commentContent", "", "getCommentContent", "()Ljava/lang/String;", "setCommentContent", "(Ljava/lang/String;)V", "commentId", "", "getCommentId", "()J", "setCommentId", "(J)V", "momentContent", "getMomentContent", "setMomentContent", "momentId", "getMomentId", "setMomentId", "momentImageUrl", "getMomentImageUrl", "setMomentImageUrl", "userHeadUrl", "getUserHeadUrl", "setUserHeadUrl", "userId", "getUserId", "setUserId", "userNickName", "getUserNickName", "setUserNickName", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MomentComment {
        public static final int $stable = 8;

        @ColumnInfo(name = "commentId_MomentComment")
        private long commentId;

        @ColumnInfo(name = "momentId_MomentComment")
        private long momentId;

        @ColumnInfo(name = "userId_MomentComment")
        private long userId;

        @ColumnInfo(name = "userNickName_MomentComment")
        @NotNull
        private String userNickName = "";

        @ColumnInfo(name = "userHeadUrl_MomentComment")
        @NotNull
        private String userHeadUrl = "";

        @ColumnInfo(name = "momentImageUrl_MomentComment")
        @NotNull
        private String momentImageUrl = "";

        @ColumnInfo(name = "momentContent_MomentComment")
        @NotNull
        private String momentContent = "";

        @ColumnInfo(name = "commentContent_MomentComment")
        @NotNull
        private String commentContent = "";

        @NotNull
        public final String getCommentContent() {
            return this.commentContent;
        }

        public final long getCommentId() {
            return this.commentId;
        }

        @NotNull
        public final String getMomentContent() {
            return this.momentContent;
        }

        public final long getMomentId() {
            return this.momentId;
        }

        @NotNull
        public final String getMomentImageUrl() {
            return this.momentImageUrl;
        }

        @NotNull
        public final String getUserHeadUrl() {
            return this.userHeadUrl;
        }

        public final long getUserId() {
            return this.userId;
        }

        @NotNull
        public final String getUserNickName() {
            return this.userNickName;
        }

        public final void setCommentContent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.commentContent = str;
        }

        public final void setCommentId(long j) {
            this.commentId = j;
        }

        public final void setMomentContent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.momentContent = str;
        }

        public final void setMomentId(long j) {
            this.momentId = j;
        }

        public final void setMomentImageUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.momentImageUrl = str;
        }

        public final void setUserHeadUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userHeadUrl = str;
        }

        public final void setUserId(long j) {
            this.userId = j;
        }

        public final void setUserNickName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userNickName = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/data/db/table/MomentMessage$MomentFeatured;", "", "()V", "momentId", "", "getMomentId", "()J", "setMomentId", "(J)V", "momentImageUrl", "", "getMomentImageUrl", "()Ljava/lang/String;", "setMomentImageUrl", "(Ljava/lang/String;)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MomentFeatured {
        public static final int $stable = 8;

        @ColumnInfo(name = "momentId_MomentFeatured")
        private long momentId;

        @ColumnInfo(name = "momentImageUrl_MomentFeatured")
        @NotNull
        private String momentImageUrl = "";

        public final long getMomentId() {
            return this.momentId;
        }

        @NotNull
        public final String getMomentImageUrl() {
            return this.momentImageUrl;
        }

        public final void setMomentId(long j) {
            this.momentId = j;
        }

        public final void setMomentImageUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.momentImageUrl = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001e\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001e\u0010\u001b\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u001e\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/yalla/yalla/data/db/table/MomentMessage$MomentGift;", "", "()V", "giftImage", "", "getGiftImage", "()Ljava/lang/String;", "setGiftImage", "(Ljava/lang/String;)V", "giftNum", "", "getGiftNum", "()I", "setGiftNum", "(I)V", "momentId", "", "getMomentId", "()J", "setMomentId", "(J)V", "momentImageUrl", "getMomentImageUrl", "setMomentImageUrl", "userHeadUrl", "getUserHeadUrl", "setUserHeadUrl", "userId", "getUserId", "setUserId", "userNickName", "getUserNickName", "setUserNickName", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MomentGift {
        public static final int $stable = 8;

        @ColumnInfo(name = "giftNum_MomentGift")
        private int giftNum;

        @ColumnInfo(name = "momentId_MomentGift")
        private long momentId;

        @ColumnInfo(name = "userId_MomentGift")
        private long userId;

        @ColumnInfo(name = "userNickName_MomentGift")
        @NotNull
        private String userNickName = "";

        @ColumnInfo(name = "userHeadUrl_MomentGift")
        @NotNull
        private String userHeadUrl = "";

        @ColumnInfo(name = "momentImageUrl_MomentGift")
        @NotNull
        private String momentImageUrl = "";

        @ColumnInfo(name = "giftImage_MomentGift")
        @NotNull
        private String giftImage = "";

        @NotNull
        public final String getGiftImage() {
            return this.giftImage;
        }

        public final int getGiftNum() {
            return this.giftNum;
        }

        public final long getMomentId() {
            return this.momentId;
        }

        @NotNull
        public final String getMomentImageUrl() {
            return this.momentImageUrl;
        }

        @NotNull
        public final String getUserHeadUrl() {
            return this.userHeadUrl;
        }

        public final long getUserId() {
            return this.userId;
        }

        @NotNull
        public final String getUserNickName() {
            return this.userNickName;
        }

        public final void setGiftImage(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.giftImage = str;
        }

        public final void setGiftNum(int i) {
            this.giftNum = i;
        }

        public final void setMomentId(long j) {
            this.momentId = j;
        }

        public final void setMomentImageUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.momentImageUrl = str;
        }

        public final void setUserHeadUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userHeadUrl = str;
        }

        public final void setUserId(long j) {
            this.userId = j;
        }

        public final void setUserNickName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userNickName = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001e\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/yalla/yalla/data/db/table/MomentMessage$MomentPraise;", "", "()V", "momentContent", "", "getMomentContent", "()Ljava/lang/String;", "setMomentContent", "(Ljava/lang/String;)V", "momentId", "", "getMomentId", "()J", "setMomentId", "(J)V", "momentImageUrl", "getMomentImageUrl", "setMomentImageUrl", "userHeadUrl", "getUserHeadUrl", "setUserHeadUrl", "userId", "getUserId", "setUserId", "userNickName", "getUserNickName", "setUserNickName", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MomentPraise {
        public static final int $stable = 8;

        @ColumnInfo(name = "momentId_MomentPraise")
        private long momentId;

        @ColumnInfo(name = "userId_MomentPraise")
        private long userId;

        @ColumnInfo(name = "userNickName_MomentPraise")
        @NotNull
        private String userNickName = "";

        @ColumnInfo(name = "userHeadUrl_MomentPraise")
        @NotNull
        private String userHeadUrl = "";

        @ColumnInfo(name = "momentImageUrl_MomentPraise")
        @NotNull
        private String momentImageUrl = "";

        @ColumnInfo(name = "momentContent_MomentPraise")
        @NotNull
        private String momentContent = "";

        @NotNull
        public final String getMomentContent() {
            return this.momentContent;
        }

        public final long getMomentId() {
            return this.momentId;
        }

        @NotNull
        public final String getMomentImageUrl() {
            return this.momentImageUrl;
        }

        @NotNull
        public final String getUserHeadUrl() {
            return this.userHeadUrl;
        }

        public final long getUserId() {
            return this.userId;
        }

        @NotNull
        public final String getUserNickName() {
            return this.userNickName;
        }

        public final void setMomentContent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.momentContent = str;
        }

        public final void setMomentId(long j) {
            this.momentId = j;
        }

        public final void setMomentImageUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.momentImageUrl = str;
        }

        public final void setUserHeadUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userHeadUrl = str;
        }

        public final void setUserId(long j) {
            this.userId = j;
        }

        public final void setUserNickName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userNickName = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR \u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/yalla/yalla/data/db/table/MomentMessage$MomentReportFeedback;", "", "()V", "momentContent", "", "getMomentContent", "()Ljava/lang/String;", "setMomentContent", "(Ljava/lang/String;)V", "momentId", "", "getMomentId", "()Ljava/lang/Long;", "setMomentId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "momentImageUrl", "getMomentImageUrl", "setMomentImageUrl", "momentTitle", "getMomentTitle", "setMomentTitle", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MomentReportFeedback {
        public static final int $stable = 8;

        @ColumnInfo(name = "momentContent_MomentReportFeedback")
        @Nullable
        private String momentContent;

        @ColumnInfo(name = "momentId_MomentReportFeedback")
        @Nullable
        private Long momentId;

        @ColumnInfo(name = "momentImageUrl_MomentReportFeedback")
        @Nullable
        private String momentImageUrl;

        @ColumnInfo(name = "momentTitle_MomentReportFeedback")
        @Nullable
        private String momentTitle;

        @Nullable
        public final String getMomentContent() {
            return this.momentContent;
        }

        @Nullable
        public final Long getMomentId() {
            return this.momentId;
        }

        @Nullable
        public final String getMomentImageUrl() {
            return this.momentImageUrl;
        }

        @Nullable
        public final String getMomentTitle() {
            return this.momentTitle;
        }

        public final void setMomentContent(@Nullable String str) {
            this.momentContent = str;
        }

        public final void setMomentId(@Nullable Long l) {
            this.momentId = l;
        }

        public final void setMomentImageUrl(@Nullable String str) {
            this.momentImageUrl = str;
        }

        public final void setMomentTitle(@Nullable String str) {
            this.momentTitle = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yalla/yalla/data/db/table/MomentMessage$MomentSystemRemove;", "", "()V", "deleteType", "", "getDeleteType", "()Ljava/lang/Integer;", "setDeleteType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "momentId", "", "getMomentId", "()J", "setMomentId", "(J)V", "momentImageUrl", "", "getMomentImageUrl", "()Ljava/lang/String;", "setMomentImageUrl", "(Ljava/lang/String;)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MomentSystemRemove {
        public static final int $stable = 8;

        @ColumnInfo(name = "momentId_MomentSystemRemove")
        private long momentId;

        @ColumnInfo(name = "momentImageUrl_MomentSystemRemove")
        @NotNull
        private String momentImageUrl = "";

        @ColumnInfo(name = "deleteType_MomentSystemRemove")
        @Nullable
        private Integer deleteType = 0;

        @Nullable
        public final Integer getDeleteType() {
            return this.deleteType;
        }

        public final long getMomentId() {
            return this.momentId;
        }

        @NotNull
        public final String getMomentImageUrl() {
            return this.momentImageUrl;
        }

        public final void setDeleteType(@Nullable Integer num) {
            this.deleteType = num;
        }

        public final void setMomentId(long j) {
            this.momentId = j;
        }

        public final void setMomentImageUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.momentImageUrl = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/data/db/table/MomentMessage$MomentTopicRemoveAdmin;", "", "()V", "momentId", "", "getMomentId", "()J", "setMomentId", "(J)V", "momentImageUrl", "", "getMomentImageUrl", "()Ljava/lang/String;", "setMomentImageUrl", "(Ljava/lang/String;)V", "topicName", "getTopicName", "setTopicName", "userHeadUrl", "getUserHeadUrl", "setUserHeadUrl", "userId", "getUserId", "setUserId", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MomentTopicRemoveAdmin {
        public static final int $stable = 8;

        @ColumnInfo(name = "momentId_MomentTopicRemoveAdmin")
        private long momentId;

        @ColumnInfo(name = "userId_MomentTopicRemoveAdmin")
        private long userId;

        @ColumnInfo(name = "userHeadUrl_MomentTopicRemoveAdmin")
        @NotNull
        private String userHeadUrl = "";

        @ColumnInfo(name = "momentImageUrl_MomentTopicRemoveAdmin")
        @NotNull
        private String momentImageUrl = "";

        @ColumnInfo(name = "topicName_MomentTopicRemoveAdmin")
        @NotNull
        private String topicName = "";

        public final long getMomentId() {
            return this.momentId;
        }

        @NotNull
        public final String getMomentImageUrl() {
            return this.momentImageUrl;
        }

        @NotNull
        public final String getTopicName() {
            return this.topicName;
        }

        @NotNull
        public final String getUserHeadUrl() {
            return this.userHeadUrl;
        }

        public final long getUserId() {
            return this.userId;
        }

        public final void setMomentId(long j) {
            this.momentId = j;
        }

        public final void setMomentImageUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.momentImageUrl = str;
        }

        public final void setTopicName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.topicName = str;
        }

        public final void setUserHeadUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userHeadUrl = str;
        }

        public final void setUserId(long j) {
            this.userId = j;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/data/db/table/MomentMessage$MomentTopicRemoveOwner;", "", "()V", "momentId", "", "getMomentId", "()J", "setMomentId", "(J)V", "momentImageUrl", "", "getMomentImageUrl", "()Ljava/lang/String;", "setMomentImageUrl", "(Ljava/lang/String;)V", "topicName", "getTopicName", "setTopicName", "userHeadUrl", "getUserHeadUrl", "setUserHeadUrl", "userId", "getUserId", "setUserId", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MomentTopicRemoveOwner {
        public static final int $stable = 8;

        @ColumnInfo(name = "momentId_MomentTopicRemoveOwner")
        private long momentId;

        @ColumnInfo(name = "userId_MomentTopicRemoveOwner")
        private long userId;

        @ColumnInfo(name = "userHeadUrl_MomentTopicRemoveOwner")
        @NotNull
        private String userHeadUrl = "";

        @ColumnInfo(name = "momentImageUrl_MomentTopicRemoveOwner")
        @NotNull
        private String momentImageUrl = "";

        @ColumnInfo(name = "topicName_MomentTopicRemoveOwner")
        @NotNull
        private String topicName = "";

        public final long getMomentId() {
            return this.momentId;
        }

        @NotNull
        public final String getMomentImageUrl() {
            return this.momentImageUrl;
        }

        @NotNull
        public final String getTopicName() {
            return this.topicName;
        }

        @NotNull
        public final String getUserHeadUrl() {
            return this.userHeadUrl;
        }

        public final long getUserId() {
            return this.userId;
        }

        public final void setMomentId(long j) {
            this.momentId = j;
        }

        public final void setMomentImageUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.momentImageUrl = str;
        }

        public final void setTopicName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.topicName = str;
        }

        public final void setUserHeadUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userHeadUrl = str;
        }

        public final void setUserId(long j) {
            this.userId = j;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/data/db/table/MomentMessage$MomentTopicTop;", "", "()V", "momentImageUrl", "", "getMomentImageUrl", "()Ljava/lang/String;", "setMomentImageUrl", "(Ljava/lang/String;)V", "topicId", "", "getTopicId", "()J", "setTopicId", "(J)V", "topicName", "getTopicName", "setTopicName", "userHeadUrl", "getUserHeadUrl", "setUserHeadUrl", "userId", "getUserId", "setUserId", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MomentTopicTop {
        public static final int $stable = 8;

        @ColumnInfo(name = "topicId_MomentTopicTop")
        private long topicId;

        @ColumnInfo(name = "userId_MomentTopicTop")
        private long userId;

        @ColumnInfo(name = "userHeadUrl_MomentTopicTop")
        @NotNull
        private String userHeadUrl = "";

        @ColumnInfo(name = "momentImageUrl_MomentTopicTop")
        @NotNull
        private String momentImageUrl = "";

        @ColumnInfo(name = "topicName_MomentTopicTop")
        @NotNull
        private String topicName = "";

        @NotNull
        public final String getMomentImageUrl() {
            return this.momentImageUrl;
        }

        public final long getTopicId() {
            return this.topicId;
        }

        @NotNull
        public final String getTopicName() {
            return this.topicName;
        }

        @NotNull
        public final String getUserHeadUrl() {
            return this.userHeadUrl;
        }

        public final long getUserId() {
            return this.userId;
        }

        public final void setMomentImageUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.momentImageUrl = str;
        }

        public final void setTopicId(long j) {
            this.topicId = j;
        }

        public final void setTopicName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.topicName = str;
        }

        public final void setUserHeadUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userHeadUrl = str;
        }

        public final void setUserId(long j) {
            this.userId = j;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/data/db/table/MomentMessage$MomentTopicTopRevoke;", "", "()V", "momentImageUrl", "", "getMomentImageUrl", "()Ljava/lang/String;", "setMomentImageUrl", "(Ljava/lang/String;)V", "topicId", "", "getTopicId", "()J", "setTopicId", "(J)V", "topicName", "getTopicName", "setTopicName", "userHeadUrl", "getUserHeadUrl", "setUserHeadUrl", "userId", "getUserId", "setUserId", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MomentTopicTopRevoke {
        public static final int $stable = 8;

        @ColumnInfo(name = "topicId_MomentTopicTopRevoke")
        private long topicId;

        @ColumnInfo(name = "userId_MomentTopicTopRevoke")
        private long userId;

        @ColumnInfo(name = "userHeadUrl_MomentTopicTopRevoke")
        @NotNull
        private String userHeadUrl = "";

        @ColumnInfo(name = "momentImageUrl_MomentTopicTopRevoke")
        @NotNull
        private String momentImageUrl = "";

        @ColumnInfo(name = "topicName_MomentTopicTopRevoke")
        @NotNull
        private String topicName = "";

        @NotNull
        public final String getMomentImageUrl() {
            return this.momentImageUrl;
        }

        public final long getTopicId() {
            return this.topicId;
        }

        @NotNull
        public final String getTopicName() {
            return this.topicName;
        }

        @NotNull
        public final String getUserHeadUrl() {
            return this.userHeadUrl;
        }

        public final long getUserId() {
            return this.userId;
        }

        public final void setMomentImageUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.momentImageUrl = str;
        }

        public final void setTopicId(long j) {
            this.topicId = j;
        }

        public final void setTopicName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.topicName = str;
        }

        public final void setUserHeadUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userHeadUrl = str;
        }

        public final void setUserId(long j) {
            this.userId = j;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001e\u0010\u0018\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001e\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\b¨\u0006\u001e"}, d2 = {"Lcom/yalla/yalla/data/db/table/MomentMessage$ReplyReward;", "", "()V", "commentContent", "", "getCommentContent", "()Ljava/lang/String;", "setCommentContent", "(Ljava/lang/String;)V", "commentId", "", "getCommentId", "()J", "setCommentId", "(J)V", "momentId", "getMomentId", "setMomentId", "momentImageUrl", "getMomentImageUrl", "setMomentImageUrl", "userHeadUrl", "getUserHeadUrl", "setUserHeadUrl", "userId", "getUserId", "setUserId", "userNickName", "getUserNickName", "setUserNickName", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ReplyReward {
        public static final int $stable = 8;

        @ColumnInfo(name = "commentId_ReplyReward")
        private long commentId;

        @ColumnInfo(name = "momentId_ReplyReward")
        private long momentId;

        @ColumnInfo(name = "userId_ReplyReward")
        private long userId;

        @ColumnInfo(name = "userNickName_ReplyReward")
        @NotNull
        private String userNickName = "";

        @ColumnInfo(name = "userHeadUrl_ReplyReward")
        @NotNull
        private String userHeadUrl = "";

        @ColumnInfo(name = "momentImageUrl_ReplyReward")
        @NotNull
        private String momentImageUrl = "";

        @ColumnInfo(name = "commentContent_ReplyReward")
        @NotNull
        private String commentContent = "";

        @NotNull
        public final String getCommentContent() {
            return this.commentContent;
        }

        public final long getCommentId() {
            return this.commentId;
        }

        public final long getMomentId() {
            return this.momentId;
        }

        @NotNull
        public final String getMomentImageUrl() {
            return this.momentImageUrl;
        }

        @NotNull
        public final String getUserHeadUrl() {
            return this.userHeadUrl;
        }

        public final long getUserId() {
            return this.userId;
        }

        @NotNull
        public final String getUserNickName() {
            return this.userNickName;
        }

        public final void setCommentContent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.commentContent = str;
        }

        public final void setCommentId(long j) {
            this.commentId = j;
        }

        public final void setMomentId(long j) {
            this.momentId = j;
        }

        public final void setMomentImageUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.momentImageUrl = str;
        }

        public final void setUserHeadUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userHeadUrl = str;
        }

        public final void setUserId(long j) {
            this.userId = j;
        }

        public final void setUserNickName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userNickName = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001e\u0010\u0018\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/yalla/yalla/data/db/table/MomentMessage$TopicCreateDisband;", "", "()V", "disbandContent", "", "getDisbandContent", "()I", "setDisbandContent", "(I)V", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "topicId", "", "getTopicId", "()J", "setTopicId", "(J)V", "topicName", "getTopicName", "setTopicName", "topicUserId", "getTopicUserId", "setTopicUserId", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TopicCreateDisband {
        public static final int $stable = 8;

        @ColumnInfo(name = "disbandContent_TopicCreateDisband")
        private int disbandContent;

        @ColumnInfo(name = "topicId_TopicCreateDisband")
        private long topicId;

        @ColumnInfo(name = "topicUserId_TopicCreateDisband")
        private long topicUserId;

        @ColumnInfo(name = "topicName_TopicCreateDisband")
        @NotNull
        private String topicName = "";

        @ColumnInfo(name = "message_TopicCreateDisband")
        @NotNull
        private String message = "";

        public final int getDisbandContent() {
            return this.disbandContent;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public final long getTopicId() {
            return this.topicId;
        }

        @NotNull
        public final String getTopicName() {
            return this.topicName;
        }

        public final long getTopicUserId() {
            return this.topicUserId;
        }

        public final void setDisbandContent(int i) {
            this.disbandContent = i;
        }

        public final void setMessage(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.message = str;
        }

        public final void setTopicId(long j) {
            this.topicId = j;
        }

        public final void setTopicName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.topicName = str;
        }

        public final void setTopicUserId(long j) {
            this.topicUserId = j;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001e\u0010\u0018\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/yalla/yalla/data/db/table/MomentMessage$TopicCreateFail;", "", "()V", "failType", "", "getFailType", "()I", "setFailType", "(I)V", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "topicId", "", "getTopicId", "()J", "setTopicId", "(J)V", "topicName", "getTopicName", "setTopicName", "topicUserId", "getTopicUserId", "setTopicUserId", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TopicCreateFail {
        public static final int $stable = 8;

        @ColumnInfo(name = "failType_TopicCreateFail")
        private int failType;

        @ColumnInfo(name = "topicId_TopicCreateFail")
        private long topicId;

        @ColumnInfo(name = "topicUserId_TopicCreateFail")
        private long topicUserId;

        @ColumnInfo(name = "topicName_TopicCreateFail")
        @NotNull
        private String topicName = "";

        @ColumnInfo(name = "message_TopicCreateFail")
        @NotNull
        private String message = "";

        public final int getFailType() {
            return this.failType;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public final long getTopicId() {
            return this.topicId;
        }

        @NotNull
        public final String getTopicName() {
            return this.topicName;
        }

        public final long getTopicUserId() {
            return this.topicUserId;
        }

        public final void setFailType(int i) {
            this.failType = i;
        }

        public final void setMessage(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.message = str;
        }

        public final void setTopicId(long j) {
            this.topicId = j;
        }

        public final void setTopicName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.topicName = str;
        }

        public final void setTopicUserId(long j) {
            this.topicUserId = j;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/data/db/table/MomentMessage$TopicCreateSuccess;", "", "()V", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "topicId", "", "getTopicId", "()J", "setTopicId", "(J)V", "topicName", "getTopicName", "setTopicName", "topicUserId", "getTopicUserId", "setTopicUserId", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TopicCreateSuccess {
        public static final int $stable = 8;

        @ColumnInfo(name = "topicId_TopicCreateSuccess")
        private long topicId;

        @ColumnInfo(name = "topicUserId_TopicCreateSuccess")
        private long topicUserId;

        @ColumnInfo(name = "topicName_TopicCreateSuccess")
        @NotNull
        private String topicName = "";

        @ColumnInfo(name = "message_TopicCreateSuccess")
        @NotNull
        private String message = "";

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public final long getTopicId() {
            return this.topicId;
        }

        @NotNull
        public final String getTopicName() {
            return this.topicName;
        }

        public final long getTopicUserId() {
            return this.topicUserId;
        }

        public final void setMessage(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.message = str;
        }

        public final void setTopicId(long j) {
            this.topicId = j;
        }

        public final void setTopicName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.topicName = str;
        }

        public final void setTopicUserId(long j) {
            this.topicUserId = j;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/data/db/table/MomentMessage$TopicGroupCreateOrJoinResult;", "", "()V", "circleId", "", "getCircleId", "()Ljava/lang/Long;", "setCircleId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "type", "", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "userId", "getUserId", "setUserId", "Companion", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TopicGroupCreateOrJoinResult {
        public static final int TYPE_CREATE = 1;
        public static final int TYPE_JOIN = 2;

        @ColumnInfo(name = "circleId_TopicGroupCreateOrJoinResult")
        @Nullable
        private Long circleId;

        @ColumnInfo(name = "type_TopicGroupCreateOrJoinResult")
        @Nullable
        private Integer type;

        @ColumnInfo(name = "userId_TopicGroupCreateOrJoinResult")
        @Nullable
        private Long userId;
        public static final int $stable = 8;

        @Nullable
        public final Long getCircleId() {
            return this.circleId;
        }

        @Nullable
        public final Integer getType() {
            return this.type;
        }

        @Nullable
        public final Long getUserId() {
            return this.userId;
        }

        public final void setCircleId(@Nullable Long l) {
            this.circleId = l;
        }

        public final void setType(@Nullable Integer num) {
            this.type = num;
        }

        public final void setUserId(@Nullable Long l) {
            this.userId = l;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR \u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR \u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR \u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\"\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010#\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010\u000e¨\u0006&"}, d2 = {"Lcom/yalla/yalla/data/db/table/MomentMessage$TopicGroupCreateSuccessNotice;", "", "()V", "circleHead", "", "getCircleHead", "()Ljava/lang/String;", "setCircleHead", "(Ljava/lang/String;)V", "circleId", "", "getCircleId", "()Ljava/lang/Long;", "setCircleId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "circleName", "getCircleName", "setCircleName", "groupOpenId", "getGroupOpenId", "setGroupOpenId", "headUrl", "getHeadUrl", "setHeadUrl", "nickName", "getNickName", "setNickName", "type", "", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "userId", "getUserId", "setUserId", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TopicGroupCreateSuccessNotice {
        public static final int $stable = 8;

        @ColumnInfo(name = "circleHead_TopicGroupCreateSuccessNotice")
        @Nullable
        private String circleHead;

        @ColumnInfo(name = "circleId_TopicGroupCreateSuccessNotice")
        @Nullable
        private Long circleId;

        @ColumnInfo(name = "circleName_TopicGroupCreateSuccessNotice")
        @Nullable
        private String circleName;

        @ColumnInfo(name = "groupOpenId_TopicGroupCreateSuccessNotice")
        @Nullable
        private String groupOpenId;

        @ColumnInfo(name = "headUrl_TopicGroupCreateSuccessNotice")
        @Nullable
        private String headUrl;

        @ColumnInfo(name = "nickName_TopicGroupCreateSuccessNotice")
        @Nullable
        private String nickName;

        @ColumnInfo(name = "type_TopicGroupCreateSuccessNotice")
        @Nullable
        private Integer type;

        @ColumnInfo(name = "userId_TopicGroupCreateSuccessNotice")
        @Nullable
        private Long userId;

        @Nullable
        public final String getCircleHead() {
            return this.circleHead;
        }

        @Nullable
        public final Long getCircleId() {
            return this.circleId;
        }

        @Nullable
        public final String getCircleName() {
            return this.circleName;
        }

        @Nullable
        public final String getGroupOpenId() {
            return this.groupOpenId;
        }

        @Nullable
        public final String getHeadUrl() {
            return this.headUrl;
        }

        @Nullable
        public final String getNickName() {
            return this.nickName;
        }

        @Nullable
        public final Integer getType() {
            return this.type;
        }

        @Nullable
        public final Long getUserId() {
            return this.userId;
        }

        public final void setCircleHead(@Nullable String str) {
            this.circleHead = str;
        }

        public final void setCircleId(@Nullable Long l) {
            this.circleId = l;
        }

        public final void setCircleName(@Nullable String str) {
            this.circleName = str;
        }

        public final void setGroupOpenId(@Nullable String str) {
            this.groupOpenId = str;
        }

        public final void setHeadUrl(@Nullable String str) {
            this.headUrl = str;
        }

        public final void setNickName(@Nullable String str) {
            this.nickName = str;
        }

        public final void setType(@Nullable Integer num) {
            this.type = num;
        }

        public final void setUserId(@Nullable Long l) {
            this.userId = l;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/data/db/table/MomentMessage$TopicMemberAdd;", "", "()V", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "topicId", "", "getTopicId", "()J", "setTopicId", "(J)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TopicMemberAdd {
        public static final int $stable = 8;

        @ColumnInfo(name = "content_TopicMemberAdd")
        @NotNull
        private String content = "";

        @ColumnInfo(name = "topicId_TopicMemberAdd")
        private long topicId;

        @NotNull
        public final String getContent() {
            return this.content;
        }

        public final long getTopicId() {
            return this.topicId;
        }

        public final void setContent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.content = str;
        }

        public final void setTopicId(long j) {
            this.topicId = j;
        }
    }

    @Nullable
    public final CircleReportFeedback getCircleReportFeedback() {
        return this.circleReportFeedback;
    }

    @Nullable
    public final CommentAt getCommentAt() {
        return this.commentAt;
    }

    @Nullable
    public final CommentFeatured getCommentFeatured() {
        return this.commentFeatured;
    }

    @Nullable
    public final CommentPraise getCommentPraise() {
        return this.commentPraise;
    }

    @Nullable
    public final CommentReply getCommentReply() {
        return this.commentReply;
    }

    @Nullable
    public final CommentReportFeedback getCommentReportFeedback() {
        return this.commentReportFeedback;
    }

    @Nullable
    public final CommentReward getCommentReward() {
        return this.commentReward;
    }

    @Nullable
    public final CommentSystemRemove getCommentSystemRemove() {
        return this.commentSystemRemove;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getMid() {
        return this.mid;
    }

    @Nullable
    public final MomentAt getMomentAt() {
        return this.momentAt;
    }

    @Nullable
    public final MomentComment getMomentComment() {
        return this.momentComment;
    }

    @Nullable
    public final MomentFeatured getMomentFeatured() {
        return this.momentFeatured;
    }

    @Nullable
    public final MomentGift getMomentGift() {
        return this.momentGift;
    }

    @Nullable
    public final MomentPraise getMomentPraise() {
        return this.momentPraise;
    }

    @Nullable
    public final MomentReportFeedback getMomentReportFeedback() {
        return this.momentReportFeedback;
    }

    @Nullable
    public final MomentSystemRemove getMomentSystemRemove() {
        return this.momentSystemRemove;
    }

    @Nullable
    public final MomentTopicRemoveAdmin getMomentTopicRemoveAdmin() {
        return this.momentTopicRemoveAdmin;
    }

    @Nullable
    public final MomentTopicRemoveOwner getMomentTopicRemoveOwner() {
        return this.momentTopicRemoveOwner;
    }

    @Nullable
    public final MomentTopicTop getMomentTopicTop() {
        return this.momentTopicTop;
    }

    @Nullable
    public final MomentTopicTopRevoke getMomentTopicTopRevoke() {
        return this.momentTopicTopRevoke;
    }

    @Nullable
    public final ReplyReward getReplyReward() {
        return this.replyReward;
    }

    public final long getTime() {
        return this.time;
    }

    @Nullable
    public final TopicCreateDisband getTopicCreateDisband() {
        return this.topicCreateDisband;
    }

    @Nullable
    public final TopicCreateFail getTopicCreateFail() {
        return this.topicCreateFail;
    }

    @Nullable
    public final TopicCreateSuccess getTopicCreateSuccess() {
        return this.topicCreateSuccess;
    }

    @Nullable
    public final TopicGroupCreateOrJoinResult getTopicGroupCreateOrJoinResult() {
        return this.topicGroupCreateOrJoinResult;
    }

    @Nullable
    public final TopicGroupCreateSuccessNotice getTopicGroupCreateSuccessNotice() {
        return this.topicGroupCreateSuccessNotice;
    }

    @Nullable
    public final TopicMemberAdd getTopicMemberAdd() {
        return this.topicMemberAdd;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: isRead, reason: from getter */
    public final boolean getIsRead() {
        return this.isRead;
    }

    public final void setCircleReportFeedback(@Nullable CircleReportFeedback circleReportFeedback) {
        this.circleReportFeedback = circleReportFeedback;
    }

    public final void setCommentAt(@Nullable CommentAt commentAt) {
        this.commentAt = commentAt;
    }

    public final void setCommentFeatured(@Nullable CommentFeatured commentFeatured) {
        this.commentFeatured = commentFeatured;
    }

    public final void setCommentPraise(@Nullable CommentPraise commentPraise) {
        this.commentPraise = commentPraise;
    }

    public final void setCommentReply(@Nullable CommentReply commentReply) {
        this.commentReply = commentReply;
    }

    public final void setCommentReportFeedback(@Nullable CommentReportFeedback commentReportFeedback) {
        this.commentReportFeedback = commentReportFeedback;
    }

    public final void setCommentReward(@Nullable CommentReward commentReward) {
        this.commentReward = commentReward;
    }

    public final void setCommentSystemRemove(@Nullable CommentSystemRemove commentSystemRemove) {
        this.commentSystemRemove = commentSystemRemove;
    }

    public final void setMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }

    public final void setMid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mid = str;
    }

    public final void setMomentAt(@Nullable MomentAt momentAt) {
        this.momentAt = momentAt;
    }

    public final void setMomentComment(@Nullable MomentComment momentComment) {
        this.momentComment = momentComment;
    }

    public final void setMomentFeatured(@Nullable MomentFeatured momentFeatured) {
        this.momentFeatured = momentFeatured;
    }

    public final void setMomentGift(@Nullable MomentGift momentGift) {
        this.momentGift = momentGift;
    }

    public final void setMomentPraise(@Nullable MomentPraise momentPraise) {
        this.momentPraise = momentPraise;
    }

    public final void setMomentReportFeedback(@Nullable MomentReportFeedback momentReportFeedback) {
        this.momentReportFeedback = momentReportFeedback;
    }

    public final void setMomentSystemRemove(@Nullable MomentSystemRemove momentSystemRemove) {
        this.momentSystemRemove = momentSystemRemove;
    }

    public final void setMomentTopicRemoveAdmin(@Nullable MomentTopicRemoveAdmin momentTopicRemoveAdmin) {
        this.momentTopicRemoveAdmin = momentTopicRemoveAdmin;
    }

    public final void setMomentTopicRemoveOwner(@Nullable MomentTopicRemoveOwner momentTopicRemoveOwner) {
        this.momentTopicRemoveOwner = momentTopicRemoveOwner;
    }

    public final void setMomentTopicTop(@Nullable MomentTopicTop momentTopicTop) {
        this.momentTopicTop = momentTopicTop;
    }

    public final void setMomentTopicTopRevoke(@Nullable MomentTopicTopRevoke momentTopicTopRevoke) {
        this.momentTopicTopRevoke = momentTopicTopRevoke;
    }

    public final void setRead(boolean z) {
        this.isRead = z;
    }

    public final void setReplyReward(@Nullable ReplyReward replyReward) {
        this.replyReward = replyReward;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setTopicCreateDisband(@Nullable TopicCreateDisband topicCreateDisband) {
        this.topicCreateDisband = topicCreateDisband;
    }

    public final void setTopicCreateFail(@Nullable TopicCreateFail topicCreateFail) {
        this.topicCreateFail = topicCreateFail;
    }

    public final void setTopicCreateSuccess(@Nullable TopicCreateSuccess topicCreateSuccess) {
        this.topicCreateSuccess = topicCreateSuccess;
    }

    public final void setTopicGroupCreateOrJoinResult(@Nullable TopicGroupCreateOrJoinResult topicGroupCreateOrJoinResult) {
        this.topicGroupCreateOrJoinResult = topicGroupCreateOrJoinResult;
    }

    public final void setTopicGroupCreateSuccessNotice(@Nullable TopicGroupCreateSuccessNotice topicGroupCreateSuccessNotice) {
        this.topicGroupCreateSuccessNotice = topicGroupCreateSuccessNotice;
    }

    public final void setTopicMemberAdd(@Nullable TopicMemberAdd topicMemberAdd) {
        this.topicMemberAdd = topicMemberAdd;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUid(long j) {
        this.uid = j;
    }

    @NotNull
    public String toString() {
        return oOOOOo0O.OooO00o(this);
    }
}
