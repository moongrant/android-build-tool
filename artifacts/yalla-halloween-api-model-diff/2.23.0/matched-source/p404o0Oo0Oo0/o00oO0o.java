package p404o0Oo0Oo0;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.code.android.util.o0OoOo0;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.data.db.model.CommentNoticeOld;
import com.yalla.yalla.model.CommentMessageModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p579o0oOoo.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nOldMomentMessageMigration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OldMomentMessageMigration.kt\ncom/yalla/yalla/data/db/migration/OldMomentMessageMigration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,334:1\n1549#2:335\n1620#2,3:336\n1855#2,2:339\n*S KotlinDebug\n*F\n+ 1 OldMomentMessageMigration.kt\ncom/yalla/yalla/data/db/migration/OldMomentMessageMigration\n*L\n19#1:335\n19#1:336,3\n260#1:339,2\n*E\n"})
public final class o00oO0o {
    @NotNull
    public static ArrayList OooO00o(@NotNull Cursor cursor) {
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

    /* JADX WARN: Code duplicated, block: B:232:0x0564 A[Catch: Exception -> 0x05e6, TryCatch #7 {Exception -> 0x05e6, blocks: (B:225:0x0545, B:232:0x0564, B:236:0x0594, B:240:0x05a5, B:244:0x05c2, B:247:0x05ce, B:243:0x05bf, B:239:0x05a2, B:235:0x0591), top: B:358:0x0545 }] */
    /* JADX WARN: Code duplicated, block: B:234:0x058f  */
    /* JADX WARN: Code duplicated, block: B:235:0x0591 A[Catch: Exception -> 0x05e6, TryCatch #7 {Exception -> 0x05e6, blocks: (B:225:0x0545, B:232:0x0564, B:236:0x0594, B:240:0x05a5, B:244:0x05c2, B:247:0x05ce, B:243:0x05bf, B:239:0x05a2, B:235:0x0591), top: B:358:0x0545 }] */
    /* JADX WARN: Code duplicated, block: B:238:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:239:0x05a2 A[Catch: Exception -> 0x05e6, TryCatch #7 {Exception -> 0x05e6, blocks: (B:225:0x0545, B:232:0x0564, B:236:0x0594, B:240:0x05a5, B:244:0x05c2, B:247:0x05ce, B:243:0x05bf, B:239:0x05a2, B:235:0x0591), top: B:358:0x0545 }] */
    /* JADX WARN: Code duplicated, block: B:242:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:243:0x05bf A[Catch: Exception -> 0x05e6, TryCatch #7 {Exception -> 0x05e6, blocks: (B:225:0x0545, B:232:0x0564, B:236:0x0594, B:240:0x05a5, B:244:0x05c2, B:247:0x05ce, B:243:0x05bf, B:239:0x05a2, B:235:0x0591), top: B:358:0x0545 }] */
    /* JADX WARN: Code duplicated, block: B:247:0x05ce A[Catch: Exception -> 0x05e6, TRY_LEAVE, TryCatch #7 {Exception -> 0x05e6, blocks: (B:225:0x0545, B:232:0x0564, B:236:0x0594, B:240:0x05a5, B:244:0x05c2, B:247:0x05ce, B:243:0x05bf, B:239:0x05a2, B:235:0x0591), top: B:358:0x0545 }] */
    /* JADX WARN: Code duplicated, block: B:251:0x05da A[Catch: Exception -> 0x05e4, TRY_LEAVE, TryCatch #10 {Exception -> 0x05e4, blocks: (B:249:0x05d3, B:251:0x05da), top: B:364:0x05d3 }] */
    public static void OooO0O0(@NotNull SupportSQLiteDatabase db, @NotNull ArrayList msg) {
        String str;
        String str2;
        String str3;
        String nickname;
        String headurl;
        String image;
        String content;
        String str4;
        String str5 = "commentContent_CommentAt";
        String str6 = "commentContent_MomentComment";
        String str7 = "commentContent_CommentReply";
        String str8 = "momentContent_MomentAt";
        Intrinsics.checkNotNullParameter(db, "db");
        String str9 = "msg";
        Intrinsics.checkNotNullParameter(msg, "msg");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(msg, 10));
        Iterator it = msg.iterator();
        while (it.hasNext()) {
            CommentNoticeOld commentNoticeOld = (CommentNoticeOld) it.next();
            ContentValues contentValues = new ContentValues();
            contentValues.put("uid", Long.valueOf(o0OoOo0.OooO(0L, commentNoticeOld.uid)));
            String str10 = commentNoticeOld.mid;
            String str11 = "";
            if (str10 == null) {
                str10 = "";
            } else {
                Intrinsics.checkNotNullExpressionValue(str10, "it.mid ?: \"\"");
            }
            contentValues.put("mid", str10);
            String str12 = commentNoticeOld.msg;
            if (str12 == null) {
                str12 = "";
            } else {
                Intrinsics.checkNotNullExpressionValue(str12, "it.msg ?: \"\"");
            }
            contentValues.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, str12);
            contentValues.put("time", Long.valueOf(commentNoticeOld.localtime));
            contentValues.put("isRead", Boolean.valueOf(commentNoticeOld.isRead));
            int i = commentNoticeOld.type_code;
            Iterator it2 = it;
            ArrayList arrayList2 = arrayList;
            String str13 = str6;
            String str14 = str7;
            if (i != 1) {
                String str15 = str8;
                if (i != 2) {
                    String str16 = str9;
                    String str17 = str5;
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                contentValues.put("type", (Integer) 10);
                                CommentMessageModel.FromBean fromBean = (CommentMessageModel.FromBean) oOo00OO0.OooO00o(commentNoticeOld.from, CommentMessageModel.FromBean.class);
                                contentValues.put("momentId_MomentFeatured", Long.valueOf(fromBean.getId()));
                                String headurl2 = fromBean.getHeadurl();
                                if (headurl2 != null) {
                                    Intrinsics.checkNotNullExpressionValue(headurl2, "fromBean.headurl ?: \"\"");
                                    str11 = headurl2;
                                }
                                contentValues.put("momentImageUrl_MomentFeatured", str11);
                            } else if (i == 7) {
                                try {
                                    contentValues.put("type", (Integer) 15);
                                    contentValues.put("momentId_MomentSystemRemove", Long.valueOf(commentNoticeOld.momentId));
                                    CommentMessageModel.MomentBean momentBean = (CommentMessageModel.MomentBean) oOo00OO0.OooO00o(commentNoticeOld.moment, CommentMessageModel.MomentBean.class);
                                    String image2 = momentBean != null ? momentBean.getImage() : null;
                                    if (image2 != null) {
                                        Intrinsics.checkNotNullExpressionValue(image2, "momentBean?.image ?: \"\"");
                                        str11 = image2;
                                    }
                                    contentValues.put("momentImageUrl_MomentSystemRemove", str11);
                                    contentValues.put("deleteType_MomentSystemRemove", Integer.valueOf(commentNoticeOld.delete_type));
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            } else if (i == 8) {
                                try {
                                    contentValues.put("type", (Integer) 11);
                                    CommentMessageModel.MomentBean momentBean2 = (CommentMessageModel.MomentBean) oOo00OO0.OooO00o(commentNoticeOld.moment, CommentMessageModel.MomentBean.class);
                                    contentValues.put("momentId_CommentFeatured", Long.valueOf(momentBean2.getId()));
                                    String image3 = momentBean2.getImage();
                                    if (image3 == null) {
                                        image3 = "";
                                    } else {
                                        Intrinsics.checkNotNullExpressionValue(image3, "tempMoment.image ?: \"\"");
                                    }
                                    contentValues.put("momentImageUrl_CommentFeatured", image3);
                                    String content2 = momentBean2.getContent();
                                    if (content2 != null) {
                                        Intrinsics.checkNotNullExpressionValue(content2, "tempMoment.content ?: \"\"");
                                        str11 = content2;
                                    }
                                    contentValues.put("momentContent_CommentFeatured", str11);
                                    contentValues.put("commentId_CommentFeatured", Long.valueOf(momentBean2.getCid()));
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                }
                            } else if (i == 101) {
                                contentValues.put("type", (Integer) 7);
                                contentValues.put("userId_MomentGift", Long.valueOf(commentNoticeOld.fromUid));
                                String str18 = commentNoticeOld.formName;
                                if (str18 == null) {
                                    str18 = "";
                                } else {
                                    Intrinsics.checkNotNullExpressionValue(str18, "it.formName ?: \"\"");
                                }
                                contentValues.put("userNickName_MomentGift", str18);
                                String str19 = commentNoticeOld.formHeader;
                                if (str19 == null) {
                                    str19 = "";
                                } else {
                                    Intrinsics.checkNotNullExpressionValue(str19, "it.formHeader ?: \"\"");
                                }
                                contentValues.put("userHeadUrl_MomentGift", str19);
                                contentValues.put("momentId_MomentGift", Long.valueOf(commentNoticeOld.momentId));
                                String str20 = commentNoticeOld.postImage;
                                if (str20 == null) {
                                    str20 = "";
                                } else {
                                    Intrinsics.checkNotNullExpressionValue(str20, "it.postImage ?: \"\"");
                                }
                                contentValues.put("momentImageUrl_MomentGift", str20);
                                contentValues.put("giftNum_MomentGift", Integer.valueOf(commentNoticeOld.giftNum));
                                String str21 = commentNoticeOld.giftImage;
                                if (str21 != null) {
                                    Intrinsics.checkNotNullExpressionValue(str21, "it.giftImage ?: \"\"");
                                    str11 = str21;
                                }
                                contentValues.put("giftImage_MomentGift", str11);
                            } else if (i == 104) {
                                contentValues.put("type", (Integer) 2);
                                contentValues.put("userId_CommentPraise", Long.valueOf(commentNoticeOld.fromUid));
                                String str22 = commentNoticeOld.formName;
                                if (str22 == null) {
                                    str22 = "";
                                } else {
                                    Intrinsics.checkNotNullExpressionValue(str22, "it.formName ?: \"\"");
                                }
                                contentValues.put("userNickName_CommentPraise", str22);
                                String str23 = commentNoticeOld.formHeader;
                                if (str23 == null) {
                                    str23 = "";
                                } else {
                                    Intrinsics.checkNotNullExpressionValue(str23, "it.formHeader ?: \"\"");
                                }
                                contentValues.put("userHeadUrl_CommentPraise", str23);
                                contentValues.put("momentId_CommentPraise", Long.valueOf(commentNoticeOld.momentId));
                                String str24 = commentNoticeOld.postImage;
                                if (str24 == null) {
                                    str24 = "";
                                } else {
                                    Intrinsics.checkNotNullExpressionValue(str24, "it.postImage ?: \"\"");
                                }
                                contentValues.put("momentImageUrl_CommentPraise", str24);
                                String str25 = commentNoticeOld.msg;
                                if (str25 != null) {
                                    Intrinsics.checkNotNullExpressionValue(str25, "it.msg ?: \"\"");
                                    str11 = str25;
                                }
                                contentValues.put("momentContent_CommentPraise", str11);
                            } else if (i != 105) {
                                switch (i) {
                                    case 1003:
                                        contentValues.put("type", (Integer) 12);
                                        contentValues.put("userId_MomentTopicTop", Long.valueOf(commentNoticeOld.hostId));
                                        String str26 = commentNoticeOld.hostImg;
                                        if (str26 == null) {
                                            str26 = "";
                                        } else {
                                            Intrinsics.checkNotNullExpressionValue(str26, "it.hostImg ?: \"\"");
                                        }
                                        contentValues.put("userHeadUrl_MomentTopicTop", str26);
                                        String str27 = commentNoticeOld.dyImg;
                                        if (str27 == null) {
                                            str27 = "";
                                        } else {
                                            Intrinsics.checkNotNullExpressionValue(str27, "it.dyImg ?: \"\"");
                                        }
                                        contentValues.put("momentImageUrl_MomentTopicTop", str27);
                                        contentValues.put("topicId_MomentTopicTop", Long.valueOf(commentNoticeOld.objectId));
                                        String str28 = commentNoticeOld.circleName;
                                        if (str28 != null) {
                                            Intrinsics.checkNotNullExpressionValue(str28, "it.circleName ?: \"\"");
                                            str11 = str28;
                                        }
                                        contentValues.put("topicName_MomentTopicTop", str11);
                                        break;
                                    case 1004:
                                        contentValues.put("type", (Integer) (-12));
                                        contentValues.put("userId_MomentTopicTopRevoke", Long.valueOf(commentNoticeOld.hostId));
                                        String str29 = commentNoticeOld.hostImg;
                                        if (str29 == null) {
                                            str29 = "";
                                        } else {
                                            Intrinsics.checkNotNullExpressionValue(str29, "it.hostImg ?: \"\"");
                                        }
                                        contentValues.put("userHeadUrl_MomentTopicTopRevoke", str29);
                                        String str30 = commentNoticeOld.dyImg;
                                        if (str30 == null) {
                                            str30 = "";
                                        } else {
                                            Intrinsics.checkNotNullExpressionValue(str30, "it.dyImg ?: \"\"");
                                        }
                                        contentValues.put("momentImageUrl_MomentTopicTopRevoke", str30);
                                        contentValues.put("topicId_MomentTopicTopRevoke", Long.valueOf(commentNoticeOld.objectId));
                                        String str31 = commentNoticeOld.circleName;
                                        if (str31 != null) {
                                            Intrinsics.checkNotNullExpressionValue(str31, "it.circleName ?: \"\"");
                                            str11 = str31;
                                        }
                                        contentValues.put("topicName_MomentTopicTopRevoke", str11);
                                        break;
                                    case 1005:
                                        contentValues.put("type", (Integer) 13);
                                        contentValues.put("userId_MomentTopicRemoveOwner", Long.valueOf(commentNoticeOld.hostId));
                                        String str32 = commentNoticeOld.hostImg;
                                        if (str32 == null) {
                                            str32 = "";
                                        } else {
                                            Intrinsics.checkNotNullExpressionValue(str32, "it.hostImg ?: \"\"");
                                        }
                                        contentValues.put("userHeadUrl_MomentTopicRemoveOwner", str32);
                                        String str33 = commentNoticeOld.dyImg;
                                        if (str33 == null) {
                                            str33 = "";
                                        } else {
                                            Intrinsics.checkNotNullExpressionValue(str33, "it.dyImg ?: \"\"");
                                        }
                                        contentValues.put("momentImageUrl_MomentTopicRemoveOwner", str33);
                                        contentValues.put("momentId_MomentTopicRemoveOwner", Long.valueOf(commentNoticeOld.objectId));
                                        String str34 = commentNoticeOld.circleName;
                                        if (str34 != null) {
                                            Intrinsics.checkNotNullExpressionValue(str34, "it.circleName ?: \"\"");
                                            str11 = str34;
                                        }
                                        contentValues.put("topicName_MomentTopicRemoveOwner", str11);
                                        break;
                                    case 1006:
                                        contentValues.put("type", (Integer) 14);
                                        contentValues.put("userId_MomentTopicRemoveAdmin", Long.valueOf(commentNoticeOld.hostId));
                                        String str35 = commentNoticeOld.hostImg;
                                        if (str35 == null) {
                                            str35 = "";
                                        } else {
                                            Intrinsics.checkNotNullExpressionValue(str35, "it.hostImg ?: \"\"");
                                        }
                                        contentValues.put("userHeadUrl_MomentTopicRemoveAdmin", str35);
                                        String str36 = commentNoticeOld.dyImg;
                                        if (str36 == null) {
                                            str36 = "";
                                        } else {
                                            Intrinsics.checkNotNullExpressionValue(str36, "it.dyImg ?: \"\"");
                                        }
                                        contentValues.put("momentImageUrl_MomentTopicRemoveAdmin", str36);
                                        contentValues.put("momentId_MomentTopicRemoveAdmin", Long.valueOf(commentNoticeOld.objectId));
                                        String str37 = commentNoticeOld.circleName;
                                        if (str37 != null) {
                                            Intrinsics.checkNotNullExpressionValue(str37, "it.circleName ?: \"\"");
                                            str11 = str37;
                                        }
                                        contentValues.put("topicName_MomentTopicRemoveAdmin", str11);
                                        break;
                                    case 1007:
                                        contentValues.put("type", (Integer) 17);
                                        contentValues.put("commentId_CommentReportFeedback", Long.valueOf(commentNoticeOld.momentId));
                                        String str38 = commentNoticeOld.postImage;
                                        if (str38 == null) {
                                            str38 = "";
                                        } else {
                                            Intrinsics.checkNotNullExpressionValue(str38, "it.postImage ?: \"\"");
                                        }
                                        contentValues.put("commentContent_CommentReportFeedback", str38);
                                        String str39 = commentNoticeOld.msg;
                                        if (str39 != null) {
                                            Intrinsics.checkNotNullExpressionValue(str39, "it.msg ?: \"\"");
                                            str11 = str39;
                                        }
                                        contentValues.put("momentImageUrl_CommentReportFeedback", str11);
                                        break;
                                }
                            } else {
                                int i2 = commentNoticeOld.rewardType;
                                if (i2 == 1) {
                                    contentValues.put("type", (Integer) 8);
                                    contentValues.put("userId_CommentReward", Long.valueOf(commentNoticeOld.fromUid));
                                    String str40 = commentNoticeOld.formName;
                                    if (str40 == null) {
                                        str40 = "";
                                    } else {
                                        Intrinsics.checkNotNullExpressionValue(str40, "it.formName ?: \"\"");
                                    }
                                    contentValues.put("userNickName_CommentReward", str40);
                                    String str41 = commentNoticeOld.formHeader;
                                    if (str41 == null) {
                                        str41 = "";
                                    } else {
                                        Intrinsics.checkNotNullExpressionValue(str41, "it.formHeader ?: \"\"");
                                    }
                                    contentValues.put("userHeadUrl_CommentReward", str41);
                                    contentValues.put("momentId_CommentReward", Long.valueOf(commentNoticeOld.momentId));
                                    String str42 = commentNoticeOld.postImage;
                                    if (str42 == null) {
                                        str42 = "";
                                    } else {
                                        Intrinsics.checkNotNullExpressionValue(str42, "it.postImage ?: \"\"");
                                    }
                                    contentValues.put("momentImageUrl_CommentReward", str42);
                                    contentValues.put("commentId_CommentReward", Long.valueOf(commentNoticeOld.commentId));
                                    String str43 = commentNoticeOld.msg;
                                    if (str43 != null) {
                                        Intrinsics.checkNotNullExpressionValue(str43, "it.msg ?: \"\"");
                                        str11 = str43;
                                    }
                                    contentValues.put("commentContent_CommentReward", str11);
                                } else if (i2 == 2) {
                                    contentValues.put("type", (Integer) 9);
                                    contentValues.put("userId_ReplyReward", Long.valueOf(commentNoticeOld.fromUid));
                                    String str44 = commentNoticeOld.formName;
                                    if (str44 == null) {
                                        str44 = "";
                                    } else {
                                        Intrinsics.checkNotNullExpressionValue(str44, "it.formName ?: \"\"");
                                    }
                                    contentValues.put("userNickName_ReplyReward", str44);
                                    String str45 = commentNoticeOld.formHeader;
                                    if (str45 == null) {
                                        str45 = "";
                                    } else {
                                        Intrinsics.checkNotNullExpressionValue(str45, "it.formHeader ?: \"\"");
                                    }
                                    contentValues.put("userHeadUrl_ReplyReward", str45);
                                    contentValues.put("momentId_ReplyReward", Long.valueOf(commentNoticeOld.momentId));
                                    String str46 = commentNoticeOld.postImage;
                                    if (str46 == null) {
                                        str46 = "";
                                    } else {
                                        Intrinsics.checkNotNullExpressionValue(str46, "it.postImage ?: \"\"");
                                    }
                                    contentValues.put("momentImageUrl_ReplyReward", str46);
                                    contentValues.put("commentId_ReplyReward", Long.valueOf(commentNoticeOld.commentId));
                                    String str47 = commentNoticeOld.msg;
                                    if (str47 != null) {
                                        Intrinsics.checkNotNullExpressionValue(str47, "it.msg ?: \"\"");
                                        str11 = str47;
                                    }
                                    contentValues.put("commentContent_ReplyReward", str11);
                                }
                            }
                            str3 = str13;
                            str7 = str14;
                            str = str15;
                            str2 = str16;
                            str5 = str17;
                        } else {
                            try {
                                CommentMessageModel.MomentBean momentBean3 = (CommentMessageModel.MomentBean) oOo00OO0.OooO00o(commentNoticeOld.moment, CommentMessageModel.MomentBean.class);
                                if (momentBean3 != null) {
                                    try {
                                        momentBean3.getCid();
                                        if (momentBean3.getCid() > 0) {
                                            contentValues.put("type", (Integer) 6);
                                            CommentMessageModel.FromBean fromBean2 = (CommentMessageModel.FromBean) oOo00OO0.OooO00o(commentNoticeOld.from, CommentMessageModel.FromBean.class);
                                            contentValues.put("userId_CommentAt", Long.valueOf(fromBean2.getId()));
                                            String nickname2 = fromBean2.getNickname();
                                            if (nickname2 == null) {
                                                nickname2 = "";
                                            } else {
                                                Intrinsics.checkNotNullExpressionValue(nickname2, "tempFrom.nickname ?: \"\"");
                                            }
                                            contentValues.put("userNickName_CommentAt", nickname2);
                                            String headurl3 = fromBean2.getHeadurl();
                                            if (headurl3 == null) {
                                                headurl3 = "";
                                            } else {
                                                Intrinsics.checkNotNullExpressionValue(headurl3, "tempFrom.headurl ?: \"\"");
                                            }
                                            contentValues.put("userHeadUrl_CommentAt", headurl3);
                                            contentValues.put("momentId_CommentAt", Long.valueOf(momentBean3.getId()));
                                            contentValues.put("commentId_CommentAt", Long.valueOf(momentBean3.getCid()));
                                            String image4 = momentBean3.getImage();
                                            if (image4 == null) {
                                                image4 = "";
                                            } else {
                                                Intrinsics.checkNotNullExpressionValue(image4, "momentBean.image ?: \"\"");
                                            }
                                            contentValues.put("momentImageUrl_CommentAt", image4);
                                            contentValues.put("momentContent_CommentAt", "");
                                            String content3 = momentBean3.getContent();
                                            if (content3 != null) {
                                                Intrinsics.checkNotNullExpressionValue(content3, "momentBean.content ?: \"\"");
                                                str11 = content3;
                                            }
                                            str5 = str17;
                                            try {
                                                contentValues.put(str5, str11);
                                                String str48 = commentNoticeOld.msg;
                                                if (str48 != null) {
                                                    str2 = str16;
                                                    try {
                                                        Intrinsics.checkNotNullExpressionValue(str48, str2);
                                                        contentValues.put(str5, str48);
                                                        Unit unit = Unit.INSTANCE;
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                        str = str15;
                                                        e.printStackTrace();
                                                        str3 = str13;
                                                        str7 = str14;
                                                    }
                                                } else {
                                                    str2 = str16;
                                                }
                                                str3 = str13;
                                                str7 = str14;
                                                str = str15;
                                            } catch (Exception e4) {
                                                e = e4;
                                                str2 = str16;
                                            }
                                        } else {
                                            str2 = str16;
                                            str5 = str17;
                                            contentValues.put("type", (Integer) 5);
                                            CommentMessageModel.FromBean fromBean3 = (CommentMessageModel.FromBean) oOo00OO0.OooO00o(commentNoticeOld.from, CommentMessageModel.FromBean.class);
                                            contentValues.put("userId_MomentAt", Long.valueOf(fromBean3.getId()));
                                            nickname = fromBean3.getNickname();
                                            if (nickname == null) {
                                                nickname = "";
                                            } else {
                                                Intrinsics.checkNotNullExpressionValue(nickname, "tempFrom.nickname ?: \"\"");
                                            }
                                            contentValues.put("userNickName_MomentAt", nickname);
                                            headurl = fromBean3.getHeadurl();
                                            if (headurl == null) {
                                                headurl = "";
                                            } else {
                                                Intrinsics.checkNotNullExpressionValue(headurl, "tempFrom.headurl ?: \"\"");
                                            }
                                            contentValues.put("userHeadUrl_MomentAt", headurl);
                                            contentValues.put("momentId_MomentAt", Long.valueOf(momentBean3.getId()));
                                            image = momentBean3.getImage();
                                            if (image == null) {
                                                image = "";
                                            } else {
                                                Intrinsics.checkNotNullExpressionValue(image, "momentBean.image ?: \"\"");
                                            }
                                            contentValues.put("momentImageUrl_MomentAt", image);
                                            content = momentBean3.getContent();
                                            if (content != null) {
                                                Intrinsics.checkNotNullExpressionValue(content, "momentBean.content ?: \"\"");
                                                str11 = content;
                                            }
                                            str = str15;
                                            try {
                                                contentValues.put(str, str11);
                                                str4 = commentNoticeOld.msg;
                                                if (str4 != null) {
                                                    Intrinsics.checkNotNullExpressionValue(str4, str2);
                                                    contentValues.put(str, str4);
                                                    Unit unit2 = Unit.INSTANCE;
                                                }
                                            } catch (Exception e5) {
                                                e = e5;
                                                e.printStackTrace();
                                            }
                                        }
                                    } catch (Exception e6) {
                                        e = e6;
                                        str2 = str16;
                                        str5 = str17;
                                    }
                                } else {
                                    str2 = str16;
                                    str5 = str17;
                                    contentValues.put("type", (Integer) 5);
                                    CommentMessageModel.FromBean fromBean4 = (CommentMessageModel.FromBean) oOo00OO0.OooO00o(commentNoticeOld.from, CommentMessageModel.FromBean.class);
                                    contentValues.put("userId_MomentAt", Long.valueOf(fromBean4.getId()));
                                    nickname = fromBean4.getNickname();
                                    if (nickname == null) {
                                        nickname = "";
                                    } else {
                                        Intrinsics.checkNotNullExpressionValue(nickname, "tempFrom.nickname ?: \"\"");
                                    }
                                    contentValues.put("userNickName_MomentAt", nickname);
                                    headurl = fromBean4.getHeadurl();
                                    if (headurl == null) {
                                        headurl = "";
                                    } else {
                                        Intrinsics.checkNotNullExpressionValue(headurl, "tempFrom.headurl ?: \"\"");
                                    }
                                    contentValues.put("userHeadUrl_MomentAt", headurl);
                                    contentValues.put("momentId_MomentAt", Long.valueOf(momentBean3.getId()));
                                    image = momentBean3.getImage();
                                    if (image == null) {
                                        image = "";
                                    } else {
                                        Intrinsics.checkNotNullExpressionValue(image, "momentBean.image ?: \"\"");
                                    }
                                    contentValues.put("momentImageUrl_MomentAt", image);
                                    content = momentBean3.getContent();
                                    if (content != null) {
                                        Intrinsics.checkNotNullExpressionValue(content, "momentBean.content ?: \"\"");
                                        str11 = content;
                                    }
                                    str = str15;
                                    contentValues.put(str, str11);
                                    str4 = commentNoticeOld.msg;
                                    if (str4 != null) {
                                        Intrinsics.checkNotNullExpressionValue(str4, str2);
                                        contentValues.put(str, str4);
                                        Unit unit3 = Unit.INSTANCE;
                                    }
                                }
                            } catch (Exception e7) {
                                e = e7;
                                str = str15;
                                str2 = str16;
                                str5 = str17;
                            }
                        }
                        arrayList2.add(contentValues);
                        arrayList = arrayList2;
                        str9 = str2;
                        str8 = str;
                        it = it2;
                        str6 = str3;
                    } else {
                        str = str15;
                        str2 = str16;
                        str5 = str17;
                        try {
                            contentValues.put("type", (Integer) 1);
                            CommentMessageModel.FromBean fromBean5 = (CommentMessageModel.FromBean) oOo00OO0.OooO00o(commentNoticeOld.from, CommentMessageModel.FromBean.class);
                            contentValues.put("userId_MomentPraise", Long.valueOf(fromBean5.getId()));
                            String nickname3 = fromBean5.getNickname();
                            if (nickname3 == null) {
                                nickname3 = "";
                            } else {
                                Intrinsics.checkNotNullExpressionValue(nickname3, "fromBean.nickname ?: \"\"");
                            }
                            contentValues.put("userNickName_MomentPraise", nickname3);
                            String headurl4 = fromBean5.getHeadurl();
                            if (headurl4 == null) {
                                headurl4 = "";
                            } else {
                                Intrinsics.checkNotNullExpressionValue(headurl4, "fromBean.headurl ?: \"\"");
                            }
                            contentValues.put("userHeadUrl_MomentPraise", headurl4);
                            CommentMessageModel.MomentBean momentBean4 = (CommentMessageModel.MomentBean) oOo00OO0.OooO00o(commentNoticeOld.moment, CommentMessageModel.MomentBean.class);
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
                                str11 = content4;
                            }
                            contentValues.put("momentContent_MomentPraise", str11);
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                    }
                    str3 = str13;
                    str7 = str14;
                } else {
                    str2 = str9;
                    str = str15;
                    try {
                        contentValues.put("type", (Integer) 4);
                        CommentMessageModel.FromBean fromBean6 = (CommentMessageModel.FromBean) oOo00OO0.OooO00o(commentNoticeOld.from, CommentMessageModel.FromBean.class);
                        contentValues.put("userId_CommentReply", Long.valueOf(fromBean6.getId()));
                        String nickname4 = fromBean6.getNickname();
                        if (nickname4 == null) {
                            nickname4 = "";
                        } else {
                            Intrinsics.checkNotNullExpressionValue(nickname4, "tempFrom.nickname ?: \"\"");
                        }
                        contentValues.put("userNickName_CommentReply", nickname4);
                        String headurl5 = fromBean6.getHeadurl();
                        if (headurl5 == null) {
                            headurl5 = "";
                        } else {
                            Intrinsics.checkNotNullExpressionValue(headurl5, "tempFrom.headurl ?: \"\"");
                        }
                        contentValues.put("userHeadUrl_CommentReply", headurl5);
                        CommentMessageModel.MomentBean momentBean5 = (CommentMessageModel.MomentBean) oOo00OO0.OooO00o(commentNoticeOld.moment, CommentMessageModel.MomentBean.class);
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
                        str7 = str14;
                        try {
                            contentValues.put(str7, content5);
                            contentValues.put("momentContent_CommentReply", "");
                            contentValues.put("replyContent_CommentReply", "");
                            contentValues.put("replyId_CommentReply", (Integer) 0);
                            String str49 = commentNoticeOld.msg;
                            if (str49 != null) {
                                Intrinsics.checkNotNullExpressionValue(str49, str2);
                                contentValues.put(str7, str49);
                                Unit unit4 = Unit.INSTANCE;
                            }
                        } catch (Exception e9) {
                            e = e9;
                            e.printStackTrace();
                        }
                    } catch (Exception e10) {
                        e = e10;
                        str7 = str14;
                    }
                    str3 = str13;
                }
            } else {
                str = str8;
                str2 = str9;
                str7 = str14;
                try {
                    contentValues.put("type", (Integer) 3);
                    CommentMessageModel.FromBean fromBean7 = (CommentMessageModel.FromBean) oOo00OO0.OooO00o(commentNoticeOld.from, CommentMessageModel.FromBean.class);
                    contentValues.put("userId_MomentComment", Long.valueOf(fromBean7.getId()));
                    String nickname5 = fromBean7.getNickname();
                    if (nickname5 == null) {
                        nickname5 = "";
                    } else {
                        Intrinsics.checkNotNullExpressionValue(nickname5, "fromBean.nickname ?: \"\"");
                    }
                    contentValues.put("userNickName_MomentComment", nickname5);
                    String headurl6 = fromBean7.getHeadurl();
                    if (headurl6 == null) {
                        headurl6 = "";
                    } else {
                        Intrinsics.checkNotNullExpressionValue(headurl6, "fromBean.headurl ?: \"\"");
                    }
                    contentValues.put("userHeadUrl_MomentComment", headurl6);
                    CommentMessageModel.MomentBean momentBean6 = (CommentMessageModel.MomentBean) oOo00OO0.OooO00o(commentNoticeOld.moment, CommentMessageModel.MomentBean.class);
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
                        str11 = content6;
                    }
                    str3 = str13;
                    try {
                        contentValues.put(str3, str11);
                        String str50 = commentNoticeOld.msg;
                        if (str50 != null) {
                            Intrinsics.checkNotNullExpressionValue(str50, str2);
                            contentValues.put(str3, str50);
                            Unit unit5 = Unit.INSTANCE;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        e.printStackTrace();
                    }
                } catch (Exception e12) {
                    e = e12;
                    str3 = str13;
                }
            }
            arrayList2.add(contentValues);
            arrayList = arrayList2;
            str9 = str2;
            str8 = str;
            it = it2;
            str6 = str3;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            db.insert("MomentMessageTable", 5, (ContentValues) it3.next());
        }
    }
}
