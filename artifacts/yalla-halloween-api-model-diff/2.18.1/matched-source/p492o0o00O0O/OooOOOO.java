package p492o0o00O0O;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.android.billingclient.api.o0Oo0oo;
import com.facebook.share.internal.ShareConstants;
import com.yalla.support.common.util.OooO;
import com.yalla.yalla.data.db.model.CommentNoticeOld;
import com.yalla.yalla.model.CommentMessageModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooOOOO {
    @NotNull
    public static final List OooO00o(@NotNull Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        try {
            int columnIndexOrThrow = cursor.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("type_code");
            int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("midx");
            int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("fromUser");
            int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("fromUid");
            int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow("msg");
            int columnIndexOrThrow7 = cursor.getColumnIndexOrThrow("localtime");
            int columnIndexOrThrow8 = cursor.getColumnIndexOrThrow("moment");
            int columnIndexOrThrow9 = cursor.getColumnIndexOrThrow("momentId");
            int columnIndexOrThrow10 = cursor.getColumnIndexOrThrow("cid");
            int columnIndexOrThrow11 = cursor.getColumnIndexOrThrow("uid");
            int columnIndexOrThrow12 = cursor.getColumnIndexOrThrow("isRead");
            int columnIndexOrThrow13 = cursor.getColumnIndexOrThrow("form_header");
            int columnIndexOrThrow14 = cursor.getColumnIndexOrThrow("form_name");
            int columnIndexOrThrow15 = cursor.getColumnIndexOrThrow("post_image");
            int columnIndexOrThrow16 = cursor.getColumnIndexOrThrow("gift_id");
            int columnIndexOrThrow17 = cursor.getColumnIndexOrThrow("gift_image");
            int columnIndexOrThrow18 = cursor.getColumnIndexOrThrow("gift_num");
            int columnIndexOrThrow19 = cursor.getColumnIndexOrThrow("delete_type");
            int columnIndexOrThrow20 = cursor.getColumnIndexOrThrow("objectId");
            int columnIndexOrThrow21 = cursor.getColumnIndexOrThrow("dyImg");
            int columnIndexOrThrow22 = cursor.getColumnIndexOrThrow("hostImg");
            int columnIndexOrThrow23 = cursor.getColumnIndexOrThrow("circleName");
            int columnIndexOrThrow24 = cursor.getColumnIndexOrThrow("hostId");
            int columnIndexOrThrow25 = cursor.getColumnIndexOrThrow("commentId");
            int columnIndexOrThrow26 = cursor.getColumnIndexOrThrow("rewardType");
            int i = columnIndexOrThrow14;
            ArrayList arrayList = new ArrayList(cursor.getCount());
            while (true) {
                ArrayList arrayList2 = arrayList;
                if (!cursor.moveToNext()) {
                    CloseableKt.closeFinally(cursor, null);
                    return arrayList2;
                }
                CommentNoticeOld commentNoticeOld = new CommentNoticeOld();
                if (cursor.isNull(columnIndexOrThrow)) {
                    commentNoticeOld.id = null;
                } else {
                    commentNoticeOld.id = Integer.valueOf(cursor.getInt(columnIndexOrThrow));
                }
                commentNoticeOld.type_code = cursor.getInt(columnIndexOrThrow2);
                commentNoticeOld.mid = cursor.getString(columnIndexOrThrow3);
                commentNoticeOld.from = cursor.getString(columnIndexOrThrow4);
                int i2 = columnIndexOrThrow2;
                int i3 = columnIndexOrThrow3;
                commentNoticeOld.fromUid = cursor.getLong(columnIndexOrThrow5);
                commentNoticeOld.msg = cursor.getString(columnIndexOrThrow6);
                commentNoticeOld.localtime = cursor.getLong(columnIndexOrThrow7);
                commentNoticeOld.moment = cursor.getString(columnIndexOrThrow8);
                commentNoticeOld.momentId = cursor.getLong(columnIndexOrThrow9);
                commentNoticeOld.cid = cursor.getLong(columnIndexOrThrow10);
                commentNoticeOld.uid = cursor.getString(columnIndexOrThrow11);
                commentNoticeOld.isRead = cursor.getInt(columnIndexOrThrow12) != 0;
                commentNoticeOld.formHeader = cursor.getString(columnIndexOrThrow13);
                int i4 = i;
                commentNoticeOld.formName = cursor.getString(i4);
                int i5 = columnIndexOrThrow15;
                commentNoticeOld.postImage = cursor.getString(i5);
                int i6 = columnIndexOrThrow;
                int i7 = columnIndexOrThrow16;
                commentNoticeOld.giftId = cursor.getInt(i7);
                i = i4;
                int i8 = columnIndexOrThrow17;
                commentNoticeOld.giftImage = cursor.getString(i8);
                columnIndexOrThrow17 = i8;
                int i9 = columnIndexOrThrow18;
                commentNoticeOld.giftNum = cursor.getInt(i9);
                columnIndexOrThrow18 = i9;
                int i10 = columnIndexOrThrow19;
                commentNoticeOld.delete_type = cursor.getInt(i10);
                int i11 = columnIndexOrThrow4;
                int i12 = columnIndexOrThrow20;
                commentNoticeOld.objectId = cursor.getLong(i12);
                int i13 = columnIndexOrThrow21;
                commentNoticeOld.dyImg = cursor.getString(i13);
                int i14 = columnIndexOrThrow22;
                commentNoticeOld.hostImg = cursor.getString(i14);
                int i15 = columnIndexOrThrow23;
                commentNoticeOld.circleName = cursor.getString(i15);
                int i16 = columnIndexOrThrow24;
                commentNoticeOld.hostId = cursor.getLong(i16);
                int i17 = columnIndexOrThrow5;
                int i18 = columnIndexOrThrow25;
                commentNoticeOld.commentId = cursor.getLong(i18);
                int i19 = columnIndexOrThrow26;
                commentNoticeOld.rewardType = cursor.getInt(i19);
                arrayList2.add(commentNoticeOld);
                columnIndexOrThrow25 = i18;
                columnIndexOrThrow26 = i19;
                columnIndexOrThrow4 = i11;
                columnIndexOrThrow3 = i3;
                columnIndexOrThrow16 = i7;
                arrayList = arrayList2;
                columnIndexOrThrow5 = i17;
                columnIndexOrThrow24 = i16;
                columnIndexOrThrow2 = i2;
                columnIndexOrThrow23 = i15;
                columnIndexOrThrow = i6;
                columnIndexOrThrow15 = i5;
                columnIndexOrThrow19 = i10;
                columnIndexOrThrow20 = i12;
                columnIndexOrThrow21 = i13;
                columnIndexOrThrow22 = i14;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(cursor, th);
                throw th2;
            }
        }
    }

    public static final void OooO0O0(@NotNull SupportSQLiteDatabase db, @NotNull List msg) {
        String str;
        String str2;
        String str3 = "commentContent_MomentComment";
        String str4 = "commentContent_CommentReply";
        String str5 = "momentContent_MomentAt";
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(msg, "msg");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(msg, 10));
        Iterator it = msg.iterator();
        while (it.hasNext()) {
            CommentNoticeOld commentNoticeOld = (CommentNoticeOld) it.next();
            ContentValues contentValues = new ContentValues();
            String str6 = commentNoticeOld.uid;
            Intrinsics.checkNotNullExpressionValue(str6, "it.uid");
            contentValues.put("uid", Long.valueOf(OooO.OooO0o(str6)));
            String str7 = commentNoticeOld.mid;
            String str8 = "";
            if (str7 == null) {
                str7 = "";
            } else {
                Intrinsics.checkNotNullExpressionValue(str7, "it.mid ?: \"\"");
            }
            contentValues.put("mid", str7);
            String str9 = commentNoticeOld.msg;
            if (str9 == null) {
                str9 = "";
            } else {
                Intrinsics.checkNotNullExpressionValue(str9, "it.msg ?: \"\"");
            }
            contentValues.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, str9);
            contentValues.put("time", Long.valueOf(commentNoticeOld.localtime));
            contentValues.put("isRead", Boolean.valueOf(commentNoticeOld.isRead));
            int i = commentNoticeOld.type_code;
            Iterator it2 = it;
            ArrayList arrayList2 = arrayList;
            if (i != 1) {
                String str10 = str3;
                String str11 = str4;
                if (i != 2) {
                    String str12 = str5;
                    if (i != 3) {
                        if (i == 4) {
                            try {
                                CommentMessageModel.MomentBean momentBean = (CommentMessageModel.MomentBean) o0Oo0oo.OooO0O0(commentNoticeOld.moment, CommentMessageModel.MomentBean.class);
                                if (momentBean != null) {
                                    momentBean.getCid();
                                    if (momentBean.getCid() > 0) {
                                        contentValues.put("type", (Integer) 6);
                                        CommentMessageModel.FromBean fromBean = (CommentMessageModel.FromBean) o0Oo0oo.OooO0O0(commentNoticeOld.from, CommentMessageModel.FromBean.class);
                                        contentValues.put("userId_CommentAt", Long.valueOf(fromBean.getId()));
                                        String nickname = fromBean.getNickname();
                                        if (nickname == null) {
                                            nickname = "";
                                        } else {
                                            Intrinsics.checkNotNullExpressionValue(nickname, "tempFrom.nickname ?: \"\"");
                                        }
                                        contentValues.put("userNickName_CommentAt", nickname);
                                        String headurl = fromBean.getHeadurl();
                                        if (headurl == null) {
                                            headurl = "";
                                        } else {
                                            Intrinsics.checkNotNullExpressionValue(headurl, "tempFrom.headurl ?: \"\"");
                                        }
                                        contentValues.put("userHeadUrl_CommentAt", headurl);
                                        contentValues.put("momentId_CommentAt", Long.valueOf(momentBean.getId()));
                                        contentValues.put("commentId_CommentAt", Long.valueOf(momentBean.getCid()));
                                        String image = momentBean.getImage();
                                        if (image == null) {
                                            image = "";
                                        } else {
                                            Intrinsics.checkNotNullExpressionValue(image, "momentBean.image ?: \"\"");
                                        }
                                        contentValues.put("momentImageUrl_CommentAt", image);
                                        contentValues.put("momentContent_CommentAt", "");
                                        String content = momentBean.getContent();
                                        if (content != null) {
                                            Intrinsics.checkNotNullExpressionValue(content, "momentBean.content ?: \"\"");
                                            str8 = content;
                                        }
                                        contentValues.put("commentContent_CommentAt", str8);
                                        String msg2 = commentNoticeOld.msg;
                                        if (msg2 != null) {
                                            Intrinsics.checkNotNullExpressionValue(msg2, "msg");
                                            contentValues.put("commentContent_CommentAt", msg2);
                                            Unit unit = Unit.INSTANCE;
                                        }
                                    }
                                }
                                contentValues.put("type", (Integer) 5);
                                CommentMessageModel.FromBean fromBean2 = (CommentMessageModel.FromBean) o0Oo0oo.OooO0O0(commentNoticeOld.from, CommentMessageModel.FromBean.class);
                                contentValues.put("userId_MomentAt", Long.valueOf(fromBean2.getId()));
                                String nickname2 = fromBean2.getNickname();
                                if (nickname2 == null) {
                                    nickname2 = "";
                                } else {
                                    Intrinsics.checkNotNullExpressionValue(nickname2, "tempFrom.nickname ?: \"\"");
                                }
                                contentValues.put("userNickName_MomentAt", nickname2);
                                String headurl2 = fromBean2.getHeadurl();
                                if (headurl2 == null) {
                                    headurl2 = "";
                                } else {
                                    Intrinsics.checkNotNullExpressionValue(headurl2, "tempFrom.headurl ?: \"\"");
                                }
                                contentValues.put("userHeadUrl_MomentAt", headurl2);
                                contentValues.put("momentId_MomentAt", Long.valueOf(momentBean.getId()));
                                String image2 = momentBean.getImage();
                                if (image2 == null) {
                                    image2 = "";
                                } else {
                                    Intrinsics.checkNotNullExpressionValue(image2, "momentBean.image ?: \"\"");
                                }
                                contentValues.put("momentImageUrl_MomentAt", image2);
                                String content2 = momentBean.getContent();
                                if (content2 != null) {
                                    Intrinsics.checkNotNullExpressionValue(content2, "momentBean.content ?: \"\"");
                                    str8 = content2;
                                }
                                str5 = str12;
                                try {
                                    contentValues.put(str5, str8);
                                    String msg3 = commentNoticeOld.msg;
                                    if (msg3 != null) {
                                        Intrinsics.checkNotNullExpressionValue(msg3, "msg");
                                        contentValues.put(str5, msg3);
                                        Unit unit2 = Unit.INSTANCE;
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    e.printStackTrace();
                                }
                            } catch (Exception e2) {
                                e = e2;
                                str5 = str12;
                            }
                        } else if (i == 5) {
                            contentValues.put("type", (Integer) 10);
                            CommentMessageModel.FromBean fromBean3 = (CommentMessageModel.FromBean) o0Oo0oo.OooO0O0(commentNoticeOld.from, CommentMessageModel.FromBean.class);
                            contentValues.put("momentId_MomentFeatured", Long.valueOf(fromBean3.getId()));
                            String headurl3 = fromBean3.getHeadurl();
                            if (headurl3 != null) {
                                Intrinsics.checkNotNullExpressionValue(headurl3, "fromBean.headurl ?: \"\"");
                                str8 = headurl3;
                            }
                            contentValues.put("momentImageUrl_MomentFeatured", str8);
                        } else if (i == 7) {
                            try {
                                contentValues.put("type", (Integer) 15);
                                contentValues.put("momentId_MomentSystemRemove", Long.valueOf(commentNoticeOld.momentId));
                                CommentMessageModel.MomentBean momentBean2 = (CommentMessageModel.MomentBean) o0Oo0oo.OooO0O0(commentNoticeOld.moment, CommentMessageModel.MomentBean.class);
                                String image3 = momentBean2 != null ? momentBean2.getImage() : null;
                                if (image3 != null) {
                                    Intrinsics.checkNotNullExpressionValue(image3, "momentBean?.image ?: \"\"");
                                    str8 = image3;
                                }
                                contentValues.put("momentImageUrl_MomentSystemRemove", str8);
                                contentValues.put("deleteType_MomentSystemRemove", Integer.valueOf(commentNoticeOld.delete_type));
                            } catch (Exception e3) {
                                e3.printStackTrace();
                            }
                        } else if (i == 8) {
                            try {
                                contentValues.put("type", (Integer) 11);
                                CommentMessageModel.MomentBean momentBean3 = (CommentMessageModel.MomentBean) o0Oo0oo.OooO0O0(commentNoticeOld.moment, CommentMessageModel.MomentBean.class);
                                contentValues.put("momentId_CommentFeatured", Long.valueOf(momentBean3.getId()));
                                String image4 = momentBean3.getImage();
                                if (image4 == null) {
                                    image4 = "";
                                } else {
                                    Intrinsics.checkNotNullExpressionValue(image4, "tempMoment.image ?: \"\"");
                                }
                                contentValues.put("momentImageUrl_CommentFeatured", image4);
                                String content3 = momentBean3.getContent();
                                if (content3 != null) {
                                    Intrinsics.checkNotNullExpressionValue(content3, "tempMoment.content ?: \"\"");
                                    str8 = content3;
                                }
                                contentValues.put("momentContent_CommentFeatured", str8);
                                contentValues.put("commentId_CommentFeatured", Long.valueOf(momentBean3.getCid()));
                            } catch (Exception e4) {
                                e4.printStackTrace();
                            }
                        } else if (i == 101) {
                            contentValues.put("type", (Integer) 7);
                            contentValues.put("userId_MomentGift", Long.valueOf(commentNoticeOld.fromUid));
                            String str13 = commentNoticeOld.formName;
                            if (str13 == null) {
                                str13 = "";
                            } else {
                                Intrinsics.checkNotNullExpressionValue(str13, "it.formName ?: \"\"");
                            }
                            contentValues.put("userNickName_MomentGift", str13);
                            String str14 = commentNoticeOld.formHeader;
                            if (str14 == null) {
                                str14 = "";
                            } else {
                                Intrinsics.checkNotNullExpressionValue(str14, "it.formHeader ?: \"\"");
                            }
                            contentValues.put("userHeadUrl_MomentGift", str14);
                            contentValues.put("momentId_MomentGift", Long.valueOf(commentNoticeOld.momentId));
                            String str15 = commentNoticeOld.postImage;
                            if (str15 == null) {
                                str15 = "";
                            } else {
                                Intrinsics.checkNotNullExpressionValue(str15, "it.postImage ?: \"\"");
                            }
                            contentValues.put("momentImageUrl_MomentGift", str15);
                            contentValues.put("giftNum_MomentGift", Integer.valueOf(commentNoticeOld.giftNum));
                            String str16 = commentNoticeOld.giftImage;
                            if (str16 != null) {
                                Intrinsics.checkNotNullExpressionValue(str16, "it.giftImage ?: \"\"");
                                str8 = str16;
                            }
                            contentValues.put("giftImage_MomentGift", str8);
                        } else if (i == 104) {
                            contentValues.put("type", (Integer) 2);
                            contentValues.put("userId_CommentPraise", Long.valueOf(commentNoticeOld.fromUid));
                            String str17 = commentNoticeOld.formName;
                            if (str17 == null) {
                                str17 = "";
                            } else {
                                Intrinsics.checkNotNullExpressionValue(str17, "it.formName ?: \"\"");
                            }
                            contentValues.put("userNickName_CommentPraise", str17);
                            String str18 = commentNoticeOld.formHeader;
                            if (str18 == null) {
                                str18 = "";
                            } else {
                                Intrinsics.checkNotNullExpressionValue(str18, "it.formHeader ?: \"\"");
                            }
                            contentValues.put("userHeadUrl_CommentPraise", str18);
                            contentValues.put("momentId_CommentPraise", Long.valueOf(commentNoticeOld.momentId));
                            String str19 = commentNoticeOld.postImage;
                            if (str19 == null) {
                                str19 = "";
                            } else {
                                Intrinsics.checkNotNullExpressionValue(str19, "it.postImage ?: \"\"");
                            }
                            contentValues.put("momentImageUrl_CommentPraise", str19);
                            String str20 = commentNoticeOld.msg;
                            if (str20 != null) {
                                Intrinsics.checkNotNullExpressionValue(str20, "it.msg ?: \"\"");
                                str8 = str20;
                            }
                            contentValues.put("momentContent_CommentPraise", str8);
                        } else if (i != 105) {
                            switch (i) {
                                case 1003:
                                    contentValues.put("type", (Integer) 12);
                                    contentValues.put("userId_MomentTopicTop", Long.valueOf(commentNoticeOld.hostId));
                                    String str21 = commentNoticeOld.hostImg;
                                    if (str21 == null) {
                                        str21 = "";
                                    } else {
                                        Intrinsics.checkNotNullExpressionValue(str21, "it.hostImg ?: \"\"");
                                    }
                                    contentValues.put("userHeadUrl_MomentTopicTop", str21);
                                    String str22 = commentNoticeOld.dyImg;
                                    if (str22 == null) {
                                        str22 = "";
                                    } else {
                                        Intrinsics.checkNotNullExpressionValue(str22, "it.dyImg ?: \"\"");
                                    }
                                    contentValues.put("momentImageUrl_MomentTopicTop", str22);
                                    contentValues.put("topicId_MomentTopicTop", Long.valueOf(commentNoticeOld.objectId));
                                    String str23 = commentNoticeOld.circleName;
                                    if (str23 != null) {
                                        Intrinsics.checkNotNullExpressionValue(str23, "it.circleName ?: \"\"");
                                        str8 = str23;
                                    }
                                    contentValues.put("topicName_MomentTopicTop", str8);
                                    break;
                                case 1004:
                                    contentValues.put("type", (Integer) (-12));
                                    contentValues.put("userId_MomentTopicTopRevoke", Long.valueOf(commentNoticeOld.hostId));
                                    String str24 = commentNoticeOld.hostImg;
                                    if (str24 == null) {
                                        str24 = "";
                                    } else {
                                        Intrinsics.checkNotNullExpressionValue(str24, "it.hostImg ?: \"\"");
                                    }
                                    contentValues.put("userHeadUrl_MomentTopicTopRevoke", str24);
                                    String str25 = commentNoticeOld.dyImg;
                                    if (str25 == null) {
                                        str25 = "";
                                    } else {
                                        Intrinsics.checkNotNullExpressionValue(str25, "it.dyImg ?: \"\"");
                                    }
                                    contentValues.put("momentImageUrl_MomentTopicTopRevoke", str25);
                                    contentValues.put("topicId_MomentTopicTopRevoke", Long.valueOf(commentNoticeOld.objectId));
                                    String str26 = commentNoticeOld.circleName;
                                    if (str26 != null) {
                                        Intrinsics.checkNotNullExpressionValue(str26, "it.circleName ?: \"\"");
                                        str8 = str26;
                                    }
                                    contentValues.put("topicName_MomentTopicTopRevoke", str8);
                                    break;
                                case 1005:
                                    contentValues.put("type", (Integer) 13);
                                    contentValues.put("userId_MomentTopicRemoveOwner", Long.valueOf(commentNoticeOld.hostId));
                                    String str27 = commentNoticeOld.hostImg;
                                    if (str27 == null) {
                                        str27 = "";
                                    } else {
                                        Intrinsics.checkNotNullExpressionValue(str27, "it.hostImg ?: \"\"");
                                    }
                                    contentValues.put("userHeadUrl_MomentTopicRemoveOwner", str27);
                                    String str28 = commentNoticeOld.dyImg;
                                    if (str28 == null) {
                                        str28 = "";
                                    } else {
                                        Intrinsics.checkNotNullExpressionValue(str28, "it.dyImg ?: \"\"");
                                    }
                                    contentValues.put("momentImageUrl_MomentTopicRemoveOwner", str28);
                                    contentValues.put("momentId_MomentTopicRemoveOwner", Long.valueOf(commentNoticeOld.objectId));
                                    String str29 = commentNoticeOld.circleName;
                                    if (str29 != null) {
                                        Intrinsics.checkNotNullExpressionValue(str29, "it.circleName ?: \"\"");
                                        str8 = str29;
                                    }
                                    contentValues.put("topicName_MomentTopicRemoveOwner", str8);
                                    break;
                                case 1006:
                                    contentValues.put("type", (Integer) 14);
                                    contentValues.put("userId_MomentTopicRemoveAdmin", Long.valueOf(commentNoticeOld.hostId));
                                    String str30 = commentNoticeOld.hostImg;
                                    if (str30 == null) {
                                        str30 = "";
                                    } else {
                                        Intrinsics.checkNotNullExpressionValue(str30, "it.hostImg ?: \"\"");
                                    }
                                    contentValues.put("userHeadUrl_MomentTopicRemoveAdmin", str30);
                                    String str31 = commentNoticeOld.dyImg;
                                    if (str31 == null) {
                                        str31 = "";
                                    } else {
                                        Intrinsics.checkNotNullExpressionValue(str31, "it.dyImg ?: \"\"");
                                    }
                                    contentValues.put("momentImageUrl_MomentTopicRemoveAdmin", str31);
                                    contentValues.put("momentId_MomentTopicRemoveAdmin", Long.valueOf(commentNoticeOld.objectId));
                                    String str32 = commentNoticeOld.circleName;
                                    if (str32 != null) {
                                        Intrinsics.checkNotNullExpressionValue(str32, "it.circleName ?: \"\"");
                                        str8 = str32;
                                    }
                                    contentValues.put("topicName_MomentTopicRemoveAdmin", str8);
                                    break;
                                case 1007:
                                    contentValues.put("type", (Integer) 17);
                                    contentValues.put("commentId_CommentReportFeedback", Long.valueOf(commentNoticeOld.momentId));
                                    String str33 = commentNoticeOld.postImage;
                                    if (str33 == null) {
                                        str33 = "";
                                    } else {
                                        Intrinsics.checkNotNullExpressionValue(str33, "it.postImage ?: \"\"");
                                    }
                                    contentValues.put("commentContent_CommentReportFeedback", str33);
                                    String str34 = commentNoticeOld.msg;
                                    if (str34 != null) {
                                        Intrinsics.checkNotNullExpressionValue(str34, "it.msg ?: \"\"");
                                        str8 = str34;
                                    }
                                    contentValues.put("momentImageUrl_CommentReportFeedback", str8);
                                    break;
                            }
                        } else {
                            int i2 = commentNoticeOld.rewardType;
                            if (i2 == 1) {
                                contentValues.put("type", (Integer) 8);
                                contentValues.put("userId_CommentReward", Long.valueOf(commentNoticeOld.fromUid));
                                String str35 = commentNoticeOld.formName;
                                if (str35 == null) {
                                    str35 = "";
                                } else {
                                    Intrinsics.checkNotNullExpressionValue(str35, "it.formName ?: \"\"");
                                }
                                contentValues.put("userNickName_CommentReward", str35);
                                String str36 = commentNoticeOld.formHeader;
                                if (str36 == null) {
                                    str36 = "";
                                } else {
                                    Intrinsics.checkNotNullExpressionValue(str36, "it.formHeader ?: \"\"");
                                }
                                contentValues.put("userHeadUrl_CommentReward", str36);
                                contentValues.put("momentId_CommentReward", Long.valueOf(commentNoticeOld.momentId));
                                String str37 = commentNoticeOld.postImage;
                                if (str37 == null) {
                                    str37 = "";
                                } else {
                                    Intrinsics.checkNotNullExpressionValue(str37, "it.postImage ?: \"\"");
                                }
                                contentValues.put("momentImageUrl_CommentReward", str37);
                                contentValues.put("commentId_CommentReward", Long.valueOf(commentNoticeOld.commentId));
                                String str38 = commentNoticeOld.msg;
                                if (str38 != null) {
                                    Intrinsics.checkNotNullExpressionValue(str38, "it.msg ?: \"\"");
                                    str8 = str38;
                                }
                                contentValues.put("commentContent_CommentReward", str8);
                            } else if (i2 == 2) {
                                contentValues.put("type", (Integer) 9);
                                contentValues.put("userId_ReplyReward", Long.valueOf(commentNoticeOld.fromUid));
                                String str39 = commentNoticeOld.formName;
                                if (str39 == null) {
                                    str39 = "";
                                } else {
                                    Intrinsics.checkNotNullExpressionValue(str39, "it.formName ?: \"\"");
                                }
                                contentValues.put("userNickName_ReplyReward", str39);
                                String str40 = commentNoticeOld.formHeader;
                                if (str40 == null) {
                                    str40 = "";
                                } else {
                                    Intrinsics.checkNotNullExpressionValue(str40, "it.formHeader ?: \"\"");
                                }
                                contentValues.put("userHeadUrl_ReplyReward", str40);
                                contentValues.put("momentId_ReplyReward", Long.valueOf(commentNoticeOld.momentId));
                                String str41 = commentNoticeOld.postImage;
                                if (str41 == null) {
                                    str41 = "";
                                } else {
                                    Intrinsics.checkNotNullExpressionValue(str41, "it.postImage ?: \"\"");
                                }
                                contentValues.put("momentImageUrl_ReplyReward", str41);
                                contentValues.put("commentId_ReplyReward", Long.valueOf(commentNoticeOld.commentId));
                                String str42 = commentNoticeOld.msg;
                                if (str42 != null) {
                                    Intrinsics.checkNotNullExpressionValue(str42, "it.msg ?: \"\"");
                                    str8 = str42;
                                }
                                contentValues.put("commentContent_ReplyReward", str8);
                            }
                        }
                        str2 = str10;
                        str = str11;
                        str5 = str12;
                    } else {
                        str5 = str12;
                        try {
                            contentValues.put("type", (Integer) 1);
                            CommentMessageModel.FromBean fromBean4 = (CommentMessageModel.FromBean) o0Oo0oo.OooO0O0(commentNoticeOld.from, CommentMessageModel.FromBean.class);
                            contentValues.put("userId_MomentPraise", Long.valueOf(fromBean4.getId()));
                            String nickname3 = fromBean4.getNickname();
                            if (nickname3 == null) {
                                nickname3 = "";
                            } else {
                                Intrinsics.checkNotNullExpressionValue(nickname3, "fromBean.nickname ?: \"\"");
                            }
                            contentValues.put("userNickName_MomentPraise", nickname3);
                            String headurl4 = fromBean4.getHeadurl();
                            if (headurl4 == null) {
                                headurl4 = "";
                            } else {
                                Intrinsics.checkNotNullExpressionValue(headurl4, "fromBean.headurl ?: \"\"");
                            }
                            contentValues.put("userHeadUrl_MomentPraise", headurl4);
                            CommentMessageModel.MomentBean momentBean4 = (CommentMessageModel.MomentBean) o0Oo0oo.OooO0O0(commentNoticeOld.moment, CommentMessageModel.MomentBean.class);
                            contentValues.put("momentId_MomentPraise", Long.valueOf(momentBean4.getId()));
                            String image5 = momentBean4.getImage();
                            if (image5 == null) {
                                image5 = "";
                            } else {
                                Intrinsics.checkNotNullExpressionValue(image5, "momentBean.image ?: \"\"");
                            }
                            contentValues.put("momentImageUrl_MomentPraise", image5);
                            String content4 = momentBean4.getContent();
                            if (content4 != null) {
                                Intrinsics.checkNotNullExpressionValue(content4, "momentBean.content ?: \"\"");
                                str8 = content4;
                            }
                            contentValues.put("momentContent_MomentPraise", str8);
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                    str2 = str10;
                    str = str11;
                } else {
                    try {
                        contentValues.put("type", (Integer) 4);
                        CommentMessageModel.FromBean fromBean5 = (CommentMessageModel.FromBean) o0Oo0oo.OooO0O0(commentNoticeOld.from, CommentMessageModel.FromBean.class);
                        contentValues.put("userId_CommentReply", Long.valueOf(fromBean5.getId()));
                        String nickname4 = fromBean5.getNickname();
                        if (nickname4 == null) {
                            nickname4 = "";
                        } else {
                            Intrinsics.checkNotNullExpressionValue(nickname4, "tempFrom.nickname ?: \"\"");
                        }
                        contentValues.put("userNickName_CommentReply", nickname4);
                        String headurl5 = fromBean5.getHeadurl();
                        if (headurl5 == null) {
                            headurl5 = "";
                        } else {
                            Intrinsics.checkNotNullExpressionValue(headurl5, "tempFrom.headurl ?: \"\"");
                        }
                        contentValues.put("userHeadUrl_CommentReply", headurl5);
                        CommentMessageModel.MomentBean momentBean5 = (CommentMessageModel.MomentBean) o0Oo0oo.OooO0O0(commentNoticeOld.moment, CommentMessageModel.MomentBean.class);
                        contentValues.put("momentId_CommentReply", Long.valueOf(momentBean5.getId()));
                        contentValues.put("commentId_CommentReply", Long.valueOf(momentBean5.getCid()));
                        String image6 = momentBean5.getImage();
                        if (image6 == null) {
                            image6 = "";
                        } else {
                            Intrinsics.checkNotNullExpressionValue(image6, "tempMoment.image ?: \"\"");
                        }
                        contentValues.put("momentImageUrl_CommentReply", image6);
                        String content5 = momentBean5.getContent();
                        if (content5 == null) {
                            content5 = "";
                        } else {
                            Intrinsics.checkNotNullExpressionValue(content5, "tempMoment.content ?: \"\"");
                        }
                        str = str11;
                        try {
                            contentValues.put(str, content5);
                            contentValues.put("momentContent_CommentReply", "");
                            contentValues.put("replyContent_CommentReply", "");
                            contentValues.put("replyId_CommentReply", (Integer) 0);
                            String msg4 = commentNoticeOld.msg;
                            if (msg4 != null) {
                                Intrinsics.checkNotNullExpressionValue(msg4, "msg");
                                contentValues.put(str, msg4);
                                Unit unit3 = Unit.INSTANCE;
                            }
                        } catch (Exception e6) {
                            e = e6;
                            e.printStackTrace();
                        }
                    } catch (Exception e7) {
                        e = e7;
                        str = str11;
                    }
                    str2 = str10;
                }
            } else {
                String str43 = str3;
                str = str4;
                try {
                    contentValues.put("type", (Integer) 3);
                    CommentMessageModel.FromBean fromBean6 = (CommentMessageModel.FromBean) o0Oo0oo.OooO0O0(commentNoticeOld.from, CommentMessageModel.FromBean.class);
                    contentValues.put("userId_MomentComment", Long.valueOf(fromBean6.getId()));
                    String nickname5 = fromBean6.getNickname();
                    if (nickname5 == null) {
                        nickname5 = "";
                    } else {
                        Intrinsics.checkNotNullExpressionValue(nickname5, "fromBean.nickname ?: \"\"");
                    }
                    contentValues.put("userNickName_MomentComment", nickname5);
                    String headurl6 = fromBean6.getHeadurl();
                    if (headurl6 == null) {
                        headurl6 = "";
                    } else {
                        Intrinsics.checkNotNullExpressionValue(headurl6, "fromBean.headurl ?: \"\"");
                    }
                    contentValues.put("userHeadUrl_MomentComment", headurl6);
                    CommentMessageModel.MomentBean momentBean6 = (CommentMessageModel.MomentBean) o0Oo0oo.OooO0O0(commentNoticeOld.moment, CommentMessageModel.MomentBean.class);
                    contentValues.put("momentId_MomentComment", Long.valueOf(momentBean6.getId()));
                    contentValues.put("commentId_MomentComment", Long.valueOf(momentBean6.getCid()));
                    String image7 = momentBean6.getImage();
                    if (image7 == null) {
                        image7 = "";
                    } else {
                        Intrinsics.checkNotNullExpressionValue(image7, "tempMoment.image ?: \"\"");
                    }
                    contentValues.put("momentImageUrl_MomentComment", image7);
                    contentValues.put("momentContent_MomentComment", "");
                    String content6 = momentBean6.getContent();
                    if (content6 != null) {
                        Intrinsics.checkNotNullExpressionValue(content6, "tempMoment.content ?: \"\"");
                        str8 = content6;
                    }
                    str2 = str43;
                    try {
                        contentValues.put(str2, str8);
                        String msg5 = commentNoticeOld.msg;
                        if (msg5 != null) {
                            Intrinsics.checkNotNullExpressionValue(msg5, "msg");
                            contentValues.put(str2, msg5);
                            Unit unit4 = Unit.INSTANCE;
                        }
                    } catch (Exception e8) {
                        e = e8;
                        e.printStackTrace();
                    }
                } catch (Exception e9) {
                    e = e9;
                    str2 = str43;
                }
            }
            arrayList2.add(contentValues);
            it = it2;
            arrayList = arrayList2;
            str4 = str;
            str3 = str2;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            db.insert("MomentMessageTable", 5, (ContentValues) it3.next());
        }
    }
}
