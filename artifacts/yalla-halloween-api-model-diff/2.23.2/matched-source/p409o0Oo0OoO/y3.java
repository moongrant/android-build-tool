package p409o0Oo0OoO;

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
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p590o0oOooo0.oOOO00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nOldMomentMessageMigration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OldMomentMessageMigration.kt\ncom/yalla/yalla/data/db/migration/OldMomentMessageMigration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,334:1\n1549#2:335\n1620#2,3:336\n1855#2,2:339\n*S KotlinDebug\n*F\n+ 1 OldMomentMessageMigration.kt\ncom/yalla/yalla/data/db/migration/OldMomentMessageMigration\n*L\n19#1:335\n19#1:336,3\n260#1:339,2\n*E\n"})
public final class y3 {
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

    /* JADX WARN: Code duplicated, block: B:220:0x04f3 A[Catch: Exception -> 0x0569, TryCatch #3 {Exception -> 0x0569, blocks: (B:197:0x0454, B:199:0x045e, B:201:0x046b, B:205:0x0495, B:209:0x04a5, B:213:0x04cf, B:217:0x04e2, B:219:0x04e9, B:216:0x04de, B:212:0x04cc, B:208:0x04a2, B:204:0x0492, B:220:0x04f3, B:224:0x051d, B:228:0x052d, B:232:0x054a, B:236:0x0558, B:238:0x055f, B:235:0x0554, B:231:0x0547, B:227:0x052a, B:223:0x051a), top: B:320:0x0454 }] */
    /* JADX WARN: Code duplicated, block: B:222:0x0518  */
    /* JADX WARN: Code duplicated, block: B:223:0x051a A[Catch: Exception -> 0x0569, TryCatch #3 {Exception -> 0x0569, blocks: (B:197:0x0454, B:199:0x045e, B:201:0x046b, B:205:0x0495, B:209:0x04a5, B:213:0x04cf, B:217:0x04e2, B:219:0x04e9, B:216:0x04de, B:212:0x04cc, B:208:0x04a2, B:204:0x0492, B:220:0x04f3, B:224:0x051d, B:228:0x052d, B:232:0x054a, B:236:0x0558, B:238:0x055f, B:235:0x0554, B:231:0x0547, B:227:0x052a, B:223:0x051a), top: B:320:0x0454 }] */
    /* JADX WARN: Code duplicated, block: B:226:0x0528  */
    /* JADX WARN: Code duplicated, block: B:227:0x052a A[Catch: Exception -> 0x0569, TryCatch #3 {Exception -> 0x0569, blocks: (B:197:0x0454, B:199:0x045e, B:201:0x046b, B:205:0x0495, B:209:0x04a5, B:213:0x04cf, B:217:0x04e2, B:219:0x04e9, B:216:0x04de, B:212:0x04cc, B:208:0x04a2, B:204:0x0492, B:220:0x04f3, B:224:0x051d, B:228:0x052d, B:232:0x054a, B:236:0x0558, B:238:0x055f, B:235:0x0554, B:231:0x0547, B:227:0x052a, B:223:0x051a), top: B:320:0x0454 }] */
    /* JADX WARN: Code duplicated, block: B:230:0x0545  */
    /* JADX WARN: Code duplicated, block: B:231:0x0547 A[Catch: Exception -> 0x0569, TryCatch #3 {Exception -> 0x0569, blocks: (B:197:0x0454, B:199:0x045e, B:201:0x046b, B:205:0x0495, B:209:0x04a5, B:213:0x04cf, B:217:0x04e2, B:219:0x04e9, B:216:0x04de, B:212:0x04cc, B:208:0x04a2, B:204:0x0492, B:220:0x04f3, B:224:0x051d, B:228:0x052d, B:232:0x054a, B:236:0x0558, B:238:0x055f, B:235:0x0554, B:231:0x0547, B:227:0x052a, B:223:0x051a), top: B:320:0x0454 }] */
    /* JADX WARN: Code duplicated, block: B:234:0x0553  */
    /* JADX WARN: Code duplicated, block: B:235:0x0554 A[Catch: Exception -> 0x0569, TryCatch #3 {Exception -> 0x0569, blocks: (B:197:0x0454, B:199:0x045e, B:201:0x046b, B:205:0x0495, B:209:0x04a5, B:213:0x04cf, B:217:0x04e2, B:219:0x04e9, B:216:0x04de, B:212:0x04cc, B:208:0x04a2, B:204:0x0492, B:220:0x04f3, B:224:0x051d, B:228:0x052d, B:232:0x054a, B:236:0x0558, B:238:0x055f, B:235:0x0554, B:231:0x0547, B:227:0x052a, B:223:0x051a), top: B:320:0x0454 }] */
    /* JADX WARN: Code duplicated, block: B:238:0x055f A[Catch: Exception -> 0x0569, TRY_LEAVE, TryCatch #3 {Exception -> 0x0569, blocks: (B:197:0x0454, B:199:0x045e, B:201:0x046b, B:205:0x0495, B:209:0x04a5, B:213:0x04cf, B:217:0x04e2, B:219:0x04e9, B:216:0x04de, B:212:0x04cc, B:208:0x04a2, B:204:0x0492, B:220:0x04f3, B:224:0x051d, B:228:0x052d, B:232:0x054a, B:236:0x0558, B:238:0x055f, B:235:0x0554, B:231:0x0547, B:227:0x052a, B:223:0x051a), top: B:320:0x0454 }] */
    /* JADX WARN: Code duplicated, block: B:342:0x0720 A[SYNTHETIC] */
    public static void OooO0O0(@NotNull SupportSQLiteDatabase db, @NotNull ArrayList msg) {
        String nickname;
        String headurl;
        String image;
        String content;
        String str;
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(msg, "msg");
        ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(msg));
        Iterator it = msg.iterator();
        while (it.hasNext()) {
            CommentNoticeOld commentNoticeOld = (CommentNoticeOld) it.next();
            ContentValues contentValues = new ContentValues();
            contentValues.put("uid", Long.valueOf(o0OoOo0.OooO(0L, commentNoticeOld.uid)));
            String str2 = commentNoticeOld.mid;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            } else {
                Intrinsics.checkNotNull(str2);
            }
            contentValues.put("mid", str2);
            String str4 = commentNoticeOld.msg;
            if (str4 == null) {
                str4 = "";
            } else {
                Intrinsics.checkNotNull(str4);
            }
            contentValues.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, str4);
            contentValues.put("time", Long.valueOf(commentNoticeOld.localtime));
            contentValues.put("isRead", Boolean.valueOf(commentNoticeOld.isRead));
            int i = commentNoticeOld.type_code;
            if (i == 1) {
                try {
                    contentValues.put("type", (Integer) 3);
                    CommentMessageModel.FromBean fromBean = (CommentMessageModel.FromBean) oOOO00.OooO00o(commentNoticeOld.from, CommentMessageModel.FromBean.class);
                    contentValues.put("userId_MomentComment", Long.valueOf(fromBean.getId()));
                    String nickname2 = fromBean.getNickname();
                    if (nickname2 == null) {
                        nickname2 = "";
                    } else {
                        Intrinsics.checkNotNull(nickname2);
                    }
                    contentValues.put("userNickName_MomentComment", nickname2);
                    String headurl2 = fromBean.getHeadurl();
                    if (headurl2 == null) {
                        headurl2 = "";
                    } else {
                        Intrinsics.checkNotNull(headurl2);
                    }
                    contentValues.put("userHeadUrl_MomentComment", headurl2);
                    CommentMessageModel.MomentBean momentBean = (CommentMessageModel.MomentBean) oOOO00.OooO00o(commentNoticeOld.moment, CommentMessageModel.MomentBean.class);
                    contentValues.put("momentId_MomentComment", Long.valueOf(momentBean.getId()));
                    contentValues.put("commentId_MomentComment", Long.valueOf(momentBean.getCid()));
                    String image2 = momentBean.getImage();
                    if (image2 == null) {
                        image2 = "";
                    } else {
                        Intrinsics.checkNotNull(image2);
                    }
                    contentValues.put("momentImageUrl_MomentComment", image2);
                    contentValues.put("momentContent_MomentComment", "");
                    String content2 = momentBean.getContent();
                    if (content2 != null) {
                        Intrinsics.checkNotNull(content2);
                        str3 = content2;
                    }
                    contentValues.put("commentContent_MomentComment", str3);
                    String str5 = commentNoticeOld.msg;
                    if (str5 != null) {
                        Intrinsics.checkNotNull(str5);
                        contentValues.put("commentContent_MomentComment", str5);
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (i == 2) {
                try {
                    contentValues.put("type", (Integer) 4);
                    CommentMessageModel.FromBean fromBean2 = (CommentMessageModel.FromBean) oOOO00.OooO00o(commentNoticeOld.from, CommentMessageModel.FromBean.class);
                    contentValues.put("userId_CommentReply", Long.valueOf(fromBean2.getId()));
                    String nickname3 = fromBean2.getNickname();
                    if (nickname3 == null) {
                        nickname3 = "";
                    } else {
                        Intrinsics.checkNotNull(nickname3);
                    }
                    contentValues.put("userNickName_CommentReply", nickname3);
                    String headurl3 = fromBean2.getHeadurl();
                    if (headurl3 == null) {
                        headurl3 = "";
                    } else {
                        Intrinsics.checkNotNull(headurl3);
                    }
                    contentValues.put("userHeadUrl_CommentReply", headurl3);
                    CommentMessageModel.MomentBean momentBean2 = (CommentMessageModel.MomentBean) oOOO00.OooO00o(commentNoticeOld.moment, CommentMessageModel.MomentBean.class);
                    contentValues.put("momentId_CommentReply", Long.valueOf(momentBean2.getId()));
                    contentValues.put("commentId_CommentReply", Long.valueOf(momentBean2.getCid()));
                    String image3 = momentBean2.getImage();
                    if (image3 == null) {
                        image3 = "";
                    } else {
                        Intrinsics.checkNotNull(image3);
                    }
                    contentValues.put("momentImageUrl_CommentReply", image3);
                    String content3 = momentBean2.getContent();
                    if (content3 == null) {
                        content3 = "";
                    } else {
                        Intrinsics.checkNotNull(content3);
                    }
                    contentValues.put("commentContent_CommentReply", content3);
                    contentValues.put("momentContent_CommentReply", "");
                    contentValues.put("replyContent_CommentReply", "");
                    contentValues.put("replyId_CommentReply", (Integer) 0);
                    String str6 = commentNoticeOld.msg;
                    if (str6 != null) {
                        Intrinsics.checkNotNull(str6);
                        contentValues.put("commentContent_CommentReply", str6);
                        Unit unit2 = Unit.INSTANCE;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } else if (i == 3) {
                try {
                    contentValues.put("type", (Integer) 1);
                    CommentMessageModel.FromBean fromBean3 = (CommentMessageModel.FromBean) oOOO00.OooO00o(commentNoticeOld.from, CommentMessageModel.FromBean.class);
                    contentValues.put("userId_MomentPraise", Long.valueOf(fromBean3.getId()));
                    String nickname4 = fromBean3.getNickname();
                    if (nickname4 == null) {
                        nickname4 = "";
                    } else {
                        Intrinsics.checkNotNull(nickname4);
                    }
                    contentValues.put("userNickName_MomentPraise", nickname4);
                    String headurl4 = fromBean3.getHeadurl();
                    if (headurl4 == null) {
                        headurl4 = "";
                    } else {
                        Intrinsics.checkNotNull(headurl4);
                    }
                    contentValues.put("userHeadUrl_MomentPraise", headurl4);
                    CommentMessageModel.MomentBean momentBean3 = (CommentMessageModel.MomentBean) oOOO00.OooO00o(commentNoticeOld.moment, CommentMessageModel.MomentBean.class);
                    contentValues.put("momentId_MomentPraise", Long.valueOf(momentBean3.getId()));
                    String image4 = momentBean3.getImage();
                    if (image4 == null) {
                        image4 = "";
                    } else {
                        Intrinsics.checkNotNull(image4);
                    }
                    contentValues.put("momentImageUrl_MomentPraise", image4);
                    String content4 = momentBean3.getContent();
                    if (content4 != null) {
                        Intrinsics.checkNotNull(content4);
                        str3 = content4;
                    }
                    contentValues.put("momentContent_MomentPraise", str3);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            } else if (i == 4) {
                try {
                    CommentMessageModel.MomentBean momentBean4 = (CommentMessageModel.MomentBean) oOOO00.OooO00o(commentNoticeOld.moment, CommentMessageModel.MomentBean.class);
                    if (momentBean4 != null) {
                        momentBean4.getCid();
                        if (momentBean4.getCid() > 0) {
                            contentValues.put("type", (Integer) 6);
                            CommentMessageModel.FromBean fromBean4 = (CommentMessageModel.FromBean) oOOO00.OooO00o(commentNoticeOld.from, CommentMessageModel.FromBean.class);
                            contentValues.put("userId_CommentAt", Long.valueOf(fromBean4.getId()));
                            String nickname5 = fromBean4.getNickname();
                            if (nickname5 == null) {
                                nickname5 = "";
                            } else {
                                Intrinsics.checkNotNull(nickname5);
                            }
                            contentValues.put("userNickName_CommentAt", nickname5);
                            String headurl5 = fromBean4.getHeadurl();
                            if (headurl5 == null) {
                                headurl5 = "";
                            } else {
                                Intrinsics.checkNotNull(headurl5);
                            }
                            contentValues.put("userHeadUrl_CommentAt", headurl5);
                            contentValues.put("momentId_CommentAt", Long.valueOf(momentBean4.getId()));
                            contentValues.put("commentId_CommentAt", Long.valueOf(momentBean4.getCid()));
                            String image5 = momentBean4.getImage();
                            if (image5 == null) {
                                image5 = "";
                            } else {
                                Intrinsics.checkNotNull(image5);
                            }
                            contentValues.put("momentImageUrl_CommentAt", image5);
                            contentValues.put("momentContent_CommentAt", "");
                            String content5 = momentBean4.getContent();
                            if (content5 != null) {
                                Intrinsics.checkNotNull(content5);
                                str3 = content5;
                            }
                            contentValues.put("commentContent_CommentAt", str3);
                            String str7 = commentNoticeOld.msg;
                            if (str7 != null) {
                                Intrinsics.checkNotNull(str7);
                                contentValues.put("commentContent_CommentAt", str7);
                                Unit unit3 = Unit.INSTANCE;
                            }
                        } else {
                            contentValues.put("type", (Integer) 5);
                            CommentMessageModel.FromBean fromBean5 = (CommentMessageModel.FromBean) oOOO00.OooO00o(commentNoticeOld.from, CommentMessageModel.FromBean.class);
                            contentValues.put("userId_MomentAt", Long.valueOf(fromBean5.getId()));
                            nickname = fromBean5.getNickname();
                            if (nickname == null) {
                                nickname = "";
                            } else {
                                Intrinsics.checkNotNull(nickname);
                            }
                            contentValues.put("userNickName_MomentAt", nickname);
                            headurl = fromBean5.getHeadurl();
                            if (headurl == null) {
                                headurl = "";
                            } else {
                                Intrinsics.checkNotNull(headurl);
                            }
                            contentValues.put("userHeadUrl_MomentAt", headurl);
                            contentValues.put("momentId_MomentAt", Long.valueOf(momentBean4.getId()));
                            image = momentBean4.getImage();
                            if (image == null) {
                                image = "";
                            } else {
                                Intrinsics.checkNotNull(image);
                            }
                            contentValues.put("momentImageUrl_MomentAt", image);
                            content = momentBean4.getContent();
                            if (content == null) {
                                Intrinsics.checkNotNull(content);
                                str3 = content;
                            }
                            contentValues.put("momentContent_MomentAt", str3);
                            str = commentNoticeOld.msg;
                            if (str != null) {
                                Intrinsics.checkNotNull(str);
                                contentValues.put("momentContent_MomentAt", str);
                                Unit unit4 = Unit.INSTANCE;
                            }
                        }
                    } else {
                        contentValues.put("type", (Integer) 5);
                        CommentMessageModel.FromBean fromBean6 = (CommentMessageModel.FromBean) oOOO00.OooO00o(commentNoticeOld.from, CommentMessageModel.FromBean.class);
                        contentValues.put("userId_MomentAt", Long.valueOf(fromBean6.getId()));
                        nickname = fromBean6.getNickname();
                        if (nickname == null) {
                            nickname = "";
                        } else {
                            Intrinsics.checkNotNull(nickname);
                        }
                        contentValues.put("userNickName_MomentAt", nickname);
                        headurl = fromBean6.getHeadurl();
                        if (headurl == null) {
                            headurl = "";
                        } else {
                            Intrinsics.checkNotNull(headurl);
                        }
                        contentValues.put("userHeadUrl_MomentAt", headurl);
                        contentValues.put("momentId_MomentAt", Long.valueOf(momentBean4.getId()));
                        image = momentBean4.getImage();
                        if (image == null) {
                            image = "";
                        } else {
                            Intrinsics.checkNotNull(image);
                        }
                        contentValues.put("momentImageUrl_MomentAt", image);
                        content = momentBean4.getContent();
                        if (content == null) {
                            Intrinsics.checkNotNull(content);
                            str3 = content;
                        }
                        contentValues.put("momentContent_MomentAt", str3);
                        str = commentNoticeOld.msg;
                        if (str != null) {
                            Intrinsics.checkNotNull(str);
                            contentValues.put("momentContent_MomentAt", str);
                            Unit unit5 = Unit.INSTANCE;
                        }
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            } else if (i == 5) {
                contentValues.put("type", (Integer) 10);
                CommentMessageModel.FromBean fromBean7 = (CommentMessageModel.FromBean) oOOO00.OooO00o(commentNoticeOld.from, CommentMessageModel.FromBean.class);
                contentValues.put("momentId_MomentFeatured", Long.valueOf(fromBean7.getId()));
                String headurl6 = fromBean7.getHeadurl();
                if (headurl6 != null) {
                    Intrinsics.checkNotNull(headurl6);
                    str3 = headurl6;
                }
                contentValues.put("momentImageUrl_MomentFeatured", str3);
            } else if (i == 7) {
                try {
                    contentValues.put("type", (Integer) 15);
                    contentValues.put("momentId_MomentSystemRemove", Long.valueOf(commentNoticeOld.momentId));
                    CommentMessageModel.MomentBean momentBean5 = (CommentMessageModel.MomentBean) oOOO00.OooO00o(commentNoticeOld.moment, CommentMessageModel.MomentBean.class);
                    String image6 = momentBean5 != null ? momentBean5.getImage() : null;
                    if (image6 != null) {
                        Intrinsics.checkNotNull(image6);
                        str3 = image6;
                    }
                    contentValues.put("momentImageUrl_MomentSystemRemove", str3);
                    contentValues.put("deleteType_MomentSystemRemove", Integer.valueOf(commentNoticeOld.delete_type));
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            } else if (i == 8) {
                try {
                    contentValues.put("type", (Integer) 11);
                    CommentMessageModel.MomentBean momentBean6 = (CommentMessageModel.MomentBean) oOOO00.OooO00o(commentNoticeOld.moment, CommentMessageModel.MomentBean.class);
                    contentValues.put("momentId_CommentFeatured", Long.valueOf(momentBean6.getId()));
                    String image7 = momentBean6.getImage();
                    if (image7 == null) {
                        image7 = "";
                    } else {
                        Intrinsics.checkNotNull(image7);
                    }
                    contentValues.put("momentImageUrl_CommentFeatured", image7);
                    String content6 = momentBean6.getContent();
                    if (content6 != null) {
                        Intrinsics.checkNotNull(content6);
                        str3 = content6;
                    }
                    contentValues.put("momentContent_CommentFeatured", str3);
                    contentValues.put("commentId_CommentFeatured", Long.valueOf(momentBean6.getCid()));
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            } else if (i == 101) {
                contentValues.put("type", (Integer) 7);
                contentValues.put("userId_MomentGift", Long.valueOf(commentNoticeOld.fromUid));
                String str8 = commentNoticeOld.formName;
                if (str8 == null) {
                    str8 = "";
                } else {
                    Intrinsics.checkNotNull(str8);
                }
                contentValues.put("userNickName_MomentGift", str8);
                String str9 = commentNoticeOld.formHeader;
                if (str9 == null) {
                    str9 = "";
                } else {
                    Intrinsics.checkNotNull(str9);
                }
                contentValues.put("userHeadUrl_MomentGift", str9);
                contentValues.put("momentId_MomentGift", Long.valueOf(commentNoticeOld.momentId));
                String str10 = commentNoticeOld.postImage;
                if (str10 == null) {
                    str10 = "";
                } else {
                    Intrinsics.checkNotNull(str10);
                }
                contentValues.put("momentImageUrl_MomentGift", str10);
                contentValues.put("giftNum_MomentGift", Integer.valueOf(commentNoticeOld.giftNum));
                String str11 = commentNoticeOld.giftImage;
                if (str11 != null) {
                    Intrinsics.checkNotNull(str11);
                    str3 = str11;
                }
                contentValues.put("giftImage_MomentGift", str3);
            } else if (i == 104) {
                contentValues.put("type", (Integer) 2);
                contentValues.put("userId_CommentPraise", Long.valueOf(commentNoticeOld.fromUid));
                String str12 = commentNoticeOld.formName;
                if (str12 == null) {
                    str12 = "";
                } else {
                    Intrinsics.checkNotNull(str12);
                }
                contentValues.put("userNickName_CommentPraise", str12);
                String str13 = commentNoticeOld.formHeader;
                if (str13 == null) {
                    str13 = "";
                } else {
                    Intrinsics.checkNotNull(str13);
                }
                contentValues.put("userHeadUrl_CommentPraise", str13);
                contentValues.put("momentId_CommentPraise", Long.valueOf(commentNoticeOld.momentId));
                String str14 = commentNoticeOld.postImage;
                if (str14 == null) {
                    str14 = "";
                } else {
                    Intrinsics.checkNotNull(str14);
                }
                contentValues.put("momentImageUrl_CommentPraise", str14);
                String str15 = commentNoticeOld.msg;
                if (str15 != null) {
                    Intrinsics.checkNotNull(str15);
                    str3 = str15;
                }
                contentValues.put("momentContent_CommentPraise", str3);
            } else if (i != 105) {
                switch (i) {
                    case 1003:
                        contentValues.put("type", (Integer) 12);
                        contentValues.put("userId_MomentTopicTop", Long.valueOf(commentNoticeOld.hostId));
                        String str16 = commentNoticeOld.hostImg;
                        if (str16 == null) {
                            str16 = "";
                        } else {
                            Intrinsics.checkNotNull(str16);
                        }
                        contentValues.put("userHeadUrl_MomentTopicTop", str16);
                        String str17 = commentNoticeOld.dyImg;
                        if (str17 == null) {
                            str17 = "";
                        } else {
                            Intrinsics.checkNotNull(str17);
                        }
                        contentValues.put("momentImageUrl_MomentTopicTop", str17);
                        contentValues.put("topicId_MomentTopicTop", Long.valueOf(commentNoticeOld.objectId));
                        String str18 = commentNoticeOld.circleName;
                        if (str18 != null) {
                            Intrinsics.checkNotNull(str18);
                            str3 = str18;
                        }
                        contentValues.put("topicName_MomentTopicTop", str3);
                        break;
                    case 1004:
                        contentValues.put("type", (Integer) (-12));
                        contentValues.put("userId_MomentTopicTopRevoke", Long.valueOf(commentNoticeOld.hostId));
                        String str19 = commentNoticeOld.hostImg;
                        if (str19 == null) {
                            str19 = "";
                        } else {
                            Intrinsics.checkNotNull(str19);
                        }
                        contentValues.put("userHeadUrl_MomentTopicTopRevoke", str19);
                        String str20 = commentNoticeOld.dyImg;
                        if (str20 == null) {
                            str20 = "";
                        } else {
                            Intrinsics.checkNotNull(str20);
                        }
                        contentValues.put("momentImageUrl_MomentTopicTopRevoke", str20);
                        contentValues.put("topicId_MomentTopicTopRevoke", Long.valueOf(commentNoticeOld.objectId));
                        String str21 = commentNoticeOld.circleName;
                        if (str21 != null) {
                            Intrinsics.checkNotNull(str21);
                            str3 = str21;
                        }
                        contentValues.put("topicName_MomentTopicTopRevoke", str3);
                        break;
                    case 1005:
                        contentValues.put("type", (Integer) 13);
                        contentValues.put("userId_MomentTopicRemoveOwner", Long.valueOf(commentNoticeOld.hostId));
                        String str22 = commentNoticeOld.hostImg;
                        if (str22 == null) {
                            str22 = "";
                        } else {
                            Intrinsics.checkNotNull(str22);
                        }
                        contentValues.put("userHeadUrl_MomentTopicRemoveOwner", str22);
                        String str23 = commentNoticeOld.dyImg;
                        if (str23 == null) {
                            str23 = "";
                        } else {
                            Intrinsics.checkNotNull(str23);
                        }
                        contentValues.put("momentImageUrl_MomentTopicRemoveOwner", str23);
                        contentValues.put("momentId_MomentTopicRemoveOwner", Long.valueOf(commentNoticeOld.objectId));
                        String str24 = commentNoticeOld.circleName;
                        if (str24 != null) {
                            Intrinsics.checkNotNull(str24);
                            str3 = str24;
                        }
                        contentValues.put("topicName_MomentTopicRemoveOwner", str3);
                        break;
                    case 1006:
                        contentValues.put("type", (Integer) 14);
                        contentValues.put("userId_MomentTopicRemoveAdmin", Long.valueOf(commentNoticeOld.hostId));
                        String str25 = commentNoticeOld.hostImg;
                        if (str25 == null) {
                            str25 = "";
                        } else {
                            Intrinsics.checkNotNull(str25);
                        }
                        contentValues.put("userHeadUrl_MomentTopicRemoveAdmin", str25);
                        String str26 = commentNoticeOld.dyImg;
                        if (str26 == null) {
                            str26 = "";
                        } else {
                            Intrinsics.checkNotNull(str26);
                        }
                        contentValues.put("momentImageUrl_MomentTopicRemoveAdmin", str26);
                        contentValues.put("momentId_MomentTopicRemoveAdmin", Long.valueOf(commentNoticeOld.objectId));
                        String str27 = commentNoticeOld.circleName;
                        if (str27 != null) {
                            Intrinsics.checkNotNull(str27);
                            str3 = str27;
                        }
                        contentValues.put("topicName_MomentTopicRemoveAdmin", str3);
                        break;
                    case 1007:
                        contentValues.put("type", (Integer) 17);
                        contentValues.put("commentId_CommentReportFeedback", Long.valueOf(commentNoticeOld.momentId));
                        String str28 = commentNoticeOld.postImage;
                        if (str28 == null) {
                            str28 = "";
                        } else {
                            Intrinsics.checkNotNull(str28);
                        }
                        contentValues.put("commentContent_CommentReportFeedback", str28);
                        String str29 = commentNoticeOld.msg;
                        if (str29 != null) {
                            Intrinsics.checkNotNull(str29);
                            str3 = str29;
                        }
                        contentValues.put("momentImageUrl_CommentReportFeedback", str3);
                        break;
                }
            } else {
                int i2 = commentNoticeOld.rewardType;
                if (i2 == 1) {
                    contentValues.put("type", (Integer) 8);
                    contentValues.put("userId_CommentReward", Long.valueOf(commentNoticeOld.fromUid));
                    String str30 = commentNoticeOld.formName;
                    if (str30 == null) {
                        str30 = "";
                    } else {
                        Intrinsics.checkNotNull(str30);
                    }
                    contentValues.put("userNickName_CommentReward", str30);
                    String str31 = commentNoticeOld.formHeader;
                    if (str31 == null) {
                        str31 = "";
                    } else {
                        Intrinsics.checkNotNull(str31);
                    }
                    contentValues.put("userHeadUrl_CommentReward", str31);
                    contentValues.put("momentId_CommentReward", Long.valueOf(commentNoticeOld.momentId));
                    String str32 = commentNoticeOld.postImage;
                    if (str32 == null) {
                        str32 = "";
                    } else {
                        Intrinsics.checkNotNull(str32);
                    }
                    contentValues.put("momentImageUrl_CommentReward", str32);
                    contentValues.put("commentId_CommentReward", Long.valueOf(commentNoticeOld.commentId));
                    String str33 = commentNoticeOld.msg;
                    if (str33 != null) {
                        Intrinsics.checkNotNull(str33);
                        str3 = str33;
                    }
                    contentValues.put("commentContent_CommentReward", str3);
                } else if (i2 == 2) {
                    contentValues.put("type", (Integer) 9);
                    contentValues.put("userId_ReplyReward", Long.valueOf(commentNoticeOld.fromUid));
                    String str34 = commentNoticeOld.formName;
                    if (str34 == null) {
                        str34 = "";
                    } else {
                        Intrinsics.checkNotNull(str34);
                    }
                    contentValues.put("userNickName_ReplyReward", str34);
                    String str35 = commentNoticeOld.formHeader;
                    if (str35 == null) {
                        str35 = "";
                    } else {
                        Intrinsics.checkNotNull(str35);
                    }
                    contentValues.put("userHeadUrl_ReplyReward", str35);
                    contentValues.put("momentId_ReplyReward", Long.valueOf(commentNoticeOld.momentId));
                    String str36 = commentNoticeOld.postImage;
                    if (str36 == null) {
                        str36 = "";
                    } else {
                        Intrinsics.checkNotNull(str36);
                    }
                    contentValues.put("momentImageUrl_ReplyReward", str36);
                    contentValues.put("commentId_ReplyReward", Long.valueOf(commentNoticeOld.commentId));
                    String str37 = commentNoticeOld.msg;
                    if (str37 != null) {
                        Intrinsics.checkNotNull(str37);
                        str3 = str37;
                    }
                    contentValues.put("commentContent_ReplyReward", str3);
                }
            }
            arrayList.add(contentValues);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            db.insert("MomentMessageTable", 5, (ContentValues) it2.next());
        }
    }
}
