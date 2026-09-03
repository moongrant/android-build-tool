package p409o0Oo0OoO;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.code.android.util.o0OoOo0;
import com.facebook.AccessToken;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.data.db.model.ChatMessageOld;
import com.yalla.yalla.data.db.model.NewFriendsOld;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.LongProgression;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import p109o000ooo.o00O0OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMigration21_22.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Migration21_22.kt\ncom/yalla/yalla/data/db/migration/Migration21_22\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,415:1\n1549#2:416\n1620#2,3:417\n1855#2,2:420\n1549#2:422\n1620#2,3:423\n1855#2,2:426\n1549#2:428\n1620#2,3:429\n1855#2,2:432\n*S KotlinDebug\n*F\n+ 1 Migration21_22.kt\ncom/yalla/yalla/data/db/migration/Migration21_22\n*L\n106#1:416\n106#1:417,3\n180#1:420,2\n182#1:422\n182#1:423,3\n200#1:426,2\n361#1:428\n361#1:429,3\n372#1:432,2\n*E\n"})
public final class w3 extends o00O0OO0 {
    public w3() {
        super(21, 22);
    }

    public static long OooO0O0(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        Cursor cursorQuery = supportSQLiteDatabase.query("SELECT COUNT(*) FROM ".concat(str));
        if (cursorQuery.moveToFirst()) {
            return cursorQuery.getLong(0);
        }
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0267 A[Catch: all -> 0x0400, TryCatch #0 {all -> 0x0400, blocks: (B:3:0x0002, B:4:0x0132, B:6:0x013a, B:8:0x0140, B:13:0x015a, B:15:0x0160, B:17:0x0166, B:19:0x016c, B:21:0x0172, B:26:0x01a8, B:28:0x01ae, B:30:0x01b4, B:32:0x01ba, B:37:0x01e6, B:39:0x01ec, B:41:0x01f2, B:43:0x01fa, B:45:0x0202, B:47:0x020c, B:55:0x0230, B:56:0x0261, B:58:0x0267, B:60:0x026f, B:62:0x0279, B:64:0x0283, B:73:0x02b0, B:74:0x02d9, B:76:0x02e6, B:78:0x02f8, B:82:0x03a8, B:77:0x02ec, B:36:0x01c6, B:25:0x0180, B:12:0x0149), top: B:92:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x026f A[Catch: all -> 0x0400, TryCatch #0 {all -> 0x0400, blocks: (B:3:0x0002, B:4:0x0132, B:6:0x013a, B:8:0x0140, B:13:0x015a, B:15:0x0160, B:17:0x0166, B:19:0x016c, B:21:0x0172, B:26:0x01a8, B:28:0x01ae, B:30:0x01b4, B:32:0x01ba, B:37:0x01e6, B:39:0x01ec, B:41:0x01f2, B:43:0x01fa, B:45:0x0202, B:47:0x020c, B:55:0x0230, B:56:0x0261, B:58:0x0267, B:60:0x026f, B:62:0x0279, B:64:0x0283, B:73:0x02b0, B:74:0x02d9, B:76:0x02e6, B:78:0x02f8, B:82:0x03a8, B:77:0x02ec, B:36:0x01c6, B:25:0x0180, B:12:0x0149), top: B:92:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0279 A[Catch: all -> 0x0400, TryCatch #0 {all -> 0x0400, blocks: (B:3:0x0002, B:4:0x0132, B:6:0x013a, B:8:0x0140, B:13:0x015a, B:15:0x0160, B:17:0x0166, B:19:0x016c, B:21:0x0172, B:26:0x01a8, B:28:0x01ae, B:30:0x01b4, B:32:0x01ba, B:37:0x01e6, B:39:0x01ec, B:41:0x01f2, B:43:0x01fa, B:45:0x0202, B:47:0x020c, B:55:0x0230, B:56:0x0261, B:58:0x0267, B:60:0x026f, B:62:0x0279, B:64:0x0283, B:73:0x02b0, B:74:0x02d9, B:76:0x02e6, B:78:0x02f8, B:82:0x03a8, B:77:0x02ec, B:36:0x01c6, B:25:0x0180, B:12:0x0149), top: B:92:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0283 A[Catch: all -> 0x0400, TryCatch #0 {all -> 0x0400, blocks: (B:3:0x0002, B:4:0x0132, B:6:0x013a, B:8:0x0140, B:13:0x015a, B:15:0x0160, B:17:0x0166, B:19:0x016c, B:21:0x0172, B:26:0x01a8, B:28:0x01ae, B:30:0x01b4, B:32:0x01ba, B:37:0x01e6, B:39:0x01ec, B:41:0x01f2, B:43:0x01fa, B:45:0x0202, B:47:0x020c, B:55:0x0230, B:56:0x0261, B:58:0x0267, B:60:0x026f, B:62:0x0279, B:64:0x0283, B:73:0x02b0, B:74:0x02d9, B:76:0x02e6, B:78:0x02f8, B:82:0x03a8, B:77:0x02ec, B:36:0x01c6, B:25:0x0180, B:12:0x0149), top: B:92:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x028d  */
    /* JADX WARN: Code duplicated, block: B:67:0x028e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0296  */
    /* JADX WARN: Code duplicated, block: B:71:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:76:0x02e6 A[Catch: all -> 0x0400, TryCatch #0 {all -> 0x0400, blocks: (B:3:0x0002, B:4:0x0132, B:6:0x013a, B:8:0x0140, B:13:0x015a, B:15:0x0160, B:17:0x0166, B:19:0x016c, B:21:0x0172, B:26:0x01a8, B:28:0x01ae, B:30:0x01b4, B:32:0x01ba, B:37:0x01e6, B:39:0x01ec, B:41:0x01f2, B:43:0x01fa, B:45:0x0202, B:47:0x020c, B:55:0x0230, B:56:0x0261, B:58:0x0267, B:60:0x026f, B:62:0x0279, B:64:0x0283, B:73:0x02b0, B:74:0x02d9, B:76:0x02e6, B:78:0x02f8, B:82:0x03a8, B:77:0x02ec, B:36:0x01c6, B:25:0x0180, B:12:0x0149), top: B:92:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x02ec A[Catch: all -> 0x0400, TryCatch #0 {all -> 0x0400, blocks: (B:3:0x0002, B:4:0x0132, B:6:0x013a, B:8:0x0140, B:13:0x015a, B:15:0x0160, B:17:0x0166, B:19:0x016c, B:21:0x0172, B:26:0x01a8, B:28:0x01ae, B:30:0x01b4, B:32:0x01ba, B:37:0x01e6, B:39:0x01ec, B:41:0x01f2, B:43:0x01fa, B:45:0x0202, B:47:0x020c, B:55:0x0230, B:56:0x0261, B:58:0x0267, B:60:0x026f, B:62:0x0279, B:64:0x0283, B:73:0x02b0, B:74:0x02d9, B:76:0x02e6, B:78:0x02f8, B:82:0x03a8, B:77:0x02ec, B:36:0x01c6, B:25:0x0180, B:12:0x0149), top: B:92:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:81:0x03a6  */
    public static ArrayList OooO0OO(Cursor cursor) {
        ChatMessageOld.Gif gif;
        ChatMessageOld.ShareRoom shareRoom;
        ChatMessageOld.ShareMoment shareMoment;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        ChatMessageOld.ShareTopic shareTopic;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        ChatMessageOld.ShareUser shareUser;
        ChatMessageOld chatMessageOld;
        int i13;
        int i14;
        boolean z;
        try {
            int columnIndexOrThrow = cursor.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("midx");
            int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("fromid");
            int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("toid");
            int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("type");
            int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow("msg");
            int columnIndexOrThrow7 = cursor.getColumnIndexOrThrow("time");
            int columnIndexOrThrow8 = cursor.getColumnIndexOrThrow("ltime");
            int columnIndexOrThrow9 = cursor.getColumnIndexOrThrow("giftid");
            int columnIndexOrThrow10 = cursor.getColumnIndexOrThrow("number");
            int columnIndexOrThrow11 = cursor.getColumnIndexOrThrow("url");
            int columnIndexOrThrow12 = cursor.getColumnIndexOrThrow("description");
            int columnIndexOrThrow13 = cursor.getColumnIndexOrThrow("duration");
            int columnIndexOrThrow14 = cursor.getColumnIndexOrThrow("msgstatus");
            int columnIndexOrThrow15 = cursor.getColumnIndexOrThrow("filename");
            int columnIndexOrThrow16 = cursor.getColumnIndexOrThrow("isread");
            int columnIndexOrThrow17 = cursor.getColumnIndexOrThrow("uid");
            int columnIndexOrThrow18 = cursor.getColumnIndexOrThrow("warn");
            int columnIndexOrThrow19 = cursor.getColumnIndexOrThrow("gif_id");
            int i15 = columnIndexOrThrow14;
            int columnIndexOrThrow20 = cursor.getColumnIndexOrThrow("gif_url");
            int i16 = columnIndexOrThrow13;
            int columnIndexOrThrow21 = cursor.getColumnIndexOrThrow("room_head");
            int i17 = columnIndexOrThrow12;
            int columnIndexOrThrow22 = cursor.getColumnIndexOrThrow("room_name");
            int i18 = columnIndexOrThrow11;
            int columnIndexOrThrow23 = cursor.getColumnIndexOrThrow("room_id");
            int i19 = columnIndexOrThrow10;
            int columnIndexOrThrow24 = cursor.getColumnIndexOrThrow("room_idx");
            int i20 = columnIndexOrThrow9;
            int columnIndexOrThrow25 = cursor.getColumnIndexOrThrow("room_ip");
            int i21 = columnIndexOrThrow8;
            int columnIndexOrThrow26 = cursor.getColumnIndexOrThrow("moment_id");
            int i22 = columnIndexOrThrow7;
            int columnIndexOrThrow27 = cursor.getColumnIndexOrThrow("moment_image");
            int i23 = columnIndexOrThrow6;
            int columnIndexOrThrow28 = cursor.getColumnIndexOrThrow("moment_text");
            int i24 = columnIndexOrThrow5;
            int columnIndexOrThrow29 = cursor.getColumnIndexOrThrow("moment_msg");
            int i25 = columnIndexOrThrow4;
            int columnIndexOrThrow30 = cursor.getColumnIndexOrThrow("topic_id");
            int i26 = columnIndexOrThrow3;
            int columnIndexOrThrow31 = cursor.getColumnIndexOrThrow("topic_image");
            int i27 = columnIndexOrThrow2;
            int columnIndexOrThrow32 = cursor.getColumnIndexOrThrow("topic_name");
            int i28 = columnIndexOrThrow;
            int columnIndexOrThrow33 = cursor.getColumnIndexOrThrow("topic_userCount");
            int columnIndexOrThrow34 = cursor.getColumnIndexOrThrow("topic_momentCount");
            int columnIndexOrThrow35 = cursor.getColumnIndexOrThrow("topic_msg");
            int columnIndexOrThrow36 = cursor.getColumnIndexOrThrow(AccessToken.USER_ID_KEY);
            int columnIndexOrThrow37 = cursor.getColumnIndexOrThrow("user_idx");
            int columnIndexOrThrow38 = cursor.getColumnIndexOrThrow("user_head");
            int columnIndexOrThrow39 = cursor.getColumnIndexOrThrow("user_name");
            int columnIndexOrThrow40 = cursor.getColumnIndexOrThrow("user_msg");
            int i29 = columnIndexOrThrow32;
            ArrayList arrayList = new ArrayList(cursor.getCount());
            while (true) {
                ArrayList arrayList2 = arrayList;
                if (!cursor.moveToNext()) {
                    CloseableKt.closeFinally(cursor, null);
                    return arrayList2;
                }
                if (cursor.isNull(columnIndexOrThrow19) && cursor.isNull(columnIndexOrThrow20)) {
                    gif = null;
                } else {
                    gif = new ChatMessageOld.Gif();
                    gif.gifId = cursor.getInt(columnIndexOrThrow19);
                    gif.gifUrl = cursor.getString(columnIndexOrThrow20);
                }
                if (cursor.isNull(columnIndexOrThrow21) && cursor.isNull(columnIndexOrThrow22) && cursor.isNull(columnIndexOrThrow23) && cursor.isNull(columnIndexOrThrow24) && cursor.isNull(columnIndexOrThrow25)) {
                    shareRoom = null;
                } else {
                    shareRoom = new ChatMessageOld.ShareRoom();
                    shareRoom.roomHeader = cursor.getString(columnIndexOrThrow21);
                    shareRoom.roomName = cursor.getString(columnIndexOrThrow22);
                    shareRoom.roomId = cursor.getLong(columnIndexOrThrow23);
                    shareRoom.roomIdx = cursor.getString(columnIndexOrThrow24);
                    shareRoom.roomIp = cursor.getString(columnIndexOrThrow25);
                }
                if (cursor.isNull(columnIndexOrThrow26) && cursor.isNull(columnIndexOrThrow27) && cursor.isNull(columnIndexOrThrow28) && cursor.isNull(columnIndexOrThrow29)) {
                    shareMoment = null;
                } else {
                    shareMoment = new ChatMessageOld.ShareMoment();
                    shareMoment.momentId = cursor.getLong(columnIndexOrThrow26);
                    shareMoment.image = cursor.getString(columnIndexOrThrow27);
                    shareMoment.text = cursor.getString(columnIndexOrThrow28);
                    shareMoment.msg = cursor.getString(columnIndexOrThrow29);
                }
                if (cursor.isNull(columnIndexOrThrow30) && cursor.isNull(columnIndexOrThrow31)) {
                    i2 = i29;
                    if (cursor.isNull(i2)) {
                        i = columnIndexOrThrow33;
                        if (cursor.isNull(i)) {
                            i3 = columnIndexOrThrow29;
                            i4 = columnIndexOrThrow34;
                            if (cursor.isNull(i4)) {
                                i5 = columnIndexOrThrow28;
                                i6 = columnIndexOrThrow35;
                                if (cursor.isNull(i6)) {
                                    shareTopic = null;
                                }
                                if (cursor.isNull(columnIndexOrThrow36)) {
                                    i8 = columnIndexOrThrow37;
                                    if (cursor.isNull(i8)) {
                                        i7 = columnIndexOrThrow31;
                                        i9 = columnIndexOrThrow38;
                                        if (cursor.isNull(i9)) {
                                            i10 = columnIndexOrThrow30;
                                            i11 = columnIndexOrThrow39;
                                            if (cursor.isNull(i11)) {
                                                i4 = i4;
                                                i12 = columnIndexOrThrow40;
                                                if (cursor.isNull(i12)) {
                                                    shareUser = null;
                                                } else {
                                                    shareUser = new ChatMessageOld.ShareUser();
                                                    shareUser.id = cursor.getLong(columnIndexOrThrow36);
                                                    shareUser.idx = cursor.getLong(i8);
                                                    shareUser.head = cursor.getString(i9);
                                                    shareUser.name = cursor.getString(i11);
                                                    shareUser.msg = cursor.getString(i12);
                                                }
                                            }
                                        }
                                        chatMessageOld = new ChatMessageOld();
                                        i13 = i28;
                                        if (cursor.isNull(i13)) {
                                            chatMessageOld.id = null;
                                        } else {
                                            chatMessageOld.id = Integer.valueOf(cursor.getInt(i13));
                                        }
                                        int i30 = i27;
                                        int i31 = i11;
                                        chatMessageOld.mid = cursor.getString(i30);
                                        int i32 = i26;
                                        int i33 = i;
                                        chatMessageOld.from = cursor.getLong(i32);
                                        int i34 = i25;
                                        chatMessageOld.to = cursor.getLong(i34);
                                        int i35 = i24;
                                        chatMessageOld.type = cursor.getInt(i35);
                                        i24 = i35;
                                        int i36 = i23;
                                        chatMessageOld.msg = cursor.getString(i36);
                                        i23 = i36;
                                        int i37 = i22;
                                        int i38 = i12;
                                        chatMessageOld.time = cursor.getLong(i37);
                                        int i39 = i21;
                                        chatMessageOld.localtime = cursor.getLong(i39);
                                        int i40 = i20;
                                        chatMessageOld.giftid = cursor.getLong(i40);
                                        int i41 = i19;
                                        chatMessageOld.number = cursor.getInt(i41);
                                        i19 = i41;
                                        int i42 = i18;
                                        chatMessageOld.url = cursor.getString(i42);
                                        i18 = i42;
                                        int i43 = i17;
                                        chatMessageOld.description = cursor.getString(i43);
                                        i17 = i43;
                                        int i44 = i16;
                                        chatMessageOld.duration = cursor.getInt(i44);
                                        i16 = i44;
                                        int i45 = i15;
                                        chatMessageOld.msgstatus = cursor.getInt(i45);
                                        i15 = i45;
                                        int i46 = columnIndexOrThrow15;
                                        chatMessageOld.filename = cursor.getString(i46);
                                        columnIndexOrThrow15 = i46;
                                        int i47 = columnIndexOrThrow16;
                                        chatMessageOld.isRead = cursor.getInt(i47);
                                        columnIndexOrThrow16 = i47;
                                        int i48 = columnIndexOrThrow17;
                                        chatMessageOld.uid = cursor.getString(i48);
                                        i14 = columnIndexOrThrow18;
                                        if (cursor.getInt(i14) != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        columnIndexOrThrow18 = i14;
                                        chatMessageOld.isWarn = z;
                                        chatMessageOld.gif = gif;
                                        chatMessageOld.shareRoom = shareRoom;
                                        chatMessageOld.shareMoment = shareMoment;
                                        chatMessageOld.shareTopic = shareTopic;
                                        chatMessageOld.shareUser = shareUser;
                                        arrayList = arrayList2;
                                        arrayList.add(chatMessageOld);
                                        columnIndexOrThrow17 = i48;
                                        columnIndexOrThrow28 = i5;
                                        columnIndexOrThrow27 = columnIndexOrThrow27;
                                        columnIndexOrThrow31 = i7;
                                        columnIndexOrThrow30 = i10;
                                        columnIndexOrThrow34 = i4;
                                        columnIndexOrThrow35 = i6;
                                        columnIndexOrThrow26 = columnIndexOrThrow26;
                                        columnIndexOrThrow22 = columnIndexOrThrow22;
                                        columnIndexOrThrow36 = columnIndexOrThrow36;
                                        columnIndexOrThrow37 = i8;
                                        columnIndexOrThrow40 = i38;
                                        columnIndexOrThrow39 = i31;
                                        columnIndexOrThrow38 = i9;
                                        columnIndexOrThrow21 = columnIndexOrThrow21;
                                        i28 = i13;
                                        columnIndexOrThrow20 = columnIndexOrThrow20;
                                        i29 = i2;
                                        i22 = i37;
                                        i27 = i30;
                                        columnIndexOrThrow24 = columnIndexOrThrow24;
                                        i21 = i39;
                                        i20 = i40;
                                        columnIndexOrThrow25 = columnIndexOrThrow25;
                                        i25 = i34;
                                        columnIndexOrThrow29 = i3;
                                        columnIndexOrThrow33 = i33;
                                        i26 = i32;
                                    } else {
                                        i7 = columnIndexOrThrow31;
                                        i10 = columnIndexOrThrow30;
                                        i9 = columnIndexOrThrow38;
                                        i11 = columnIndexOrThrow39;
                                    }
                                    i12 = columnIndexOrThrow40;
                                    shareUser = new ChatMessageOld.ShareUser();
                                    shareUser.id = cursor.getLong(columnIndexOrThrow36);
                                    shareUser.idx = cursor.getLong(i8);
                                    shareUser.head = cursor.getString(i9);
                                    shareUser.name = cursor.getString(i11);
                                    shareUser.msg = cursor.getString(i12);
                                    chatMessageOld = new ChatMessageOld();
                                    i13 = i28;
                                    if (cursor.isNull(i13)) {
                                        chatMessageOld.id = null;
                                    } else {
                                        chatMessageOld.id = Integer.valueOf(cursor.getInt(i13));
                                    }
                                    int i310 = i27;
                                    int i311 = i11;
                                    chatMessageOld.mid = cursor.getString(i310);
                                    int i312 = i26;
                                    int i313 = i;
                                    chatMessageOld.from = cursor.getLong(i312);
                                    int i314 = i25;
                                    chatMessageOld.to = cursor.getLong(i314);
                                    int i315 = i24;
                                    chatMessageOld.type = cursor.getInt(i315);
                                    i24 = i315;
                                    int i316 = i23;
                                    chatMessageOld.msg = cursor.getString(i316);
                                    i23 = i316;
                                    int i317 = i22;
                                    int i318 = i12;
                                    chatMessageOld.time = cursor.getLong(i317);
                                    int i319 = i21;
                                    chatMessageOld.localtime = cursor.getLong(i319);
                                    int i49 = i20;
                                    chatMessageOld.giftid = cursor.getLong(i49);
                                    int i410 = i19;
                                    chatMessageOld.number = cursor.getInt(i410);
                                    i19 = i410;
                                    int i411 = i18;
                                    chatMessageOld.url = cursor.getString(i411);
                                    i18 = i411;
                                    int i412 = i17;
                                    chatMessageOld.description = cursor.getString(i412);
                                    i17 = i412;
                                    int i413 = i16;
                                    chatMessageOld.duration = cursor.getInt(i413);
                                    i16 = i413;
                                    int i414 = i15;
                                    chatMessageOld.msgstatus = cursor.getInt(i414);
                                    i15 = i414;
                                    int i415 = columnIndexOrThrow15;
                                    chatMessageOld.filename = cursor.getString(i415);
                                    columnIndexOrThrow15 = i415;
                                    int i416 = columnIndexOrThrow16;
                                    chatMessageOld.isRead = cursor.getInt(i416);
                                    columnIndexOrThrow16 = i416;
                                    int i417 = columnIndexOrThrow17;
                                    chatMessageOld.uid = cursor.getString(i417);
                                    i14 = columnIndexOrThrow18;
                                    if (cursor.getInt(i14) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    columnIndexOrThrow18 = i14;
                                    chatMessageOld.isWarn = z;
                                    chatMessageOld.gif = gif;
                                    chatMessageOld.shareRoom = shareRoom;
                                    chatMessageOld.shareMoment = shareMoment;
                                    chatMessageOld.shareTopic = shareTopic;
                                    chatMessageOld.shareUser = shareUser;
                                    arrayList = arrayList2;
                                    arrayList.add(chatMessageOld);
                                    columnIndexOrThrow17 = i417;
                                    columnIndexOrThrow28 = i5;
                                    columnIndexOrThrow27 = columnIndexOrThrow27;
                                    columnIndexOrThrow31 = i7;
                                    columnIndexOrThrow30 = i10;
                                    columnIndexOrThrow34 = i4;
                                    columnIndexOrThrow35 = i6;
                                    columnIndexOrThrow26 = columnIndexOrThrow26;
                                    columnIndexOrThrow22 = columnIndexOrThrow22;
                                    columnIndexOrThrow36 = columnIndexOrThrow36;
                                    columnIndexOrThrow37 = i8;
                                    columnIndexOrThrow40 = i318;
                                    columnIndexOrThrow39 = i311;
                                    columnIndexOrThrow38 = i9;
                                    columnIndexOrThrow21 = columnIndexOrThrow21;
                                    i28 = i13;
                                    columnIndexOrThrow20 = columnIndexOrThrow20;
                                    i29 = i2;
                                    i22 = i317;
                                    i27 = i310;
                                    columnIndexOrThrow24 = columnIndexOrThrow24;
                                    i21 = i319;
                                    i20 = i49;
                                    columnIndexOrThrow25 = columnIndexOrThrow25;
                                    i25 = i314;
                                    columnIndexOrThrow29 = i3;
                                    columnIndexOrThrow33 = i313;
                                    i26 = i312;
                                } else {
                                    i7 = columnIndexOrThrow31;
                                    i8 = columnIndexOrThrow37;
                                    i9 = columnIndexOrThrow38;
                                }
                                i10 = columnIndexOrThrow30;
                                i11 = columnIndexOrThrow39;
                                i12 = columnIndexOrThrow40;
                                shareUser = new ChatMessageOld.ShareUser();
                                shareUser.id = cursor.getLong(columnIndexOrThrow36);
                                shareUser.idx = cursor.getLong(i8);
                                shareUser.head = cursor.getString(i9);
                                shareUser.name = cursor.getString(i11);
                                shareUser.msg = cursor.getString(i12);
                                chatMessageOld = new ChatMessageOld();
                                i13 = i28;
                                if (cursor.isNull(i13)) {
                                    chatMessageOld.id = null;
                                } else {
                                    chatMessageOld.id = Integer.valueOf(cursor.getInt(i13));
                                }
                                int i3110 = i27;
                                int i3111 = i11;
                                chatMessageOld.mid = cursor.getString(i3110);
                                int i3112 = i26;
                                int i3113 = i;
                                chatMessageOld.from = cursor.getLong(i3112);
                                int i3114 = i25;
                                chatMessageOld.to = cursor.getLong(i3114);
                                int i3115 = i24;
                                chatMessageOld.type = cursor.getInt(i3115);
                                i24 = i3115;
                                int i3116 = i23;
                                chatMessageOld.msg = cursor.getString(i3116);
                                i23 = i3116;
                                int i3117 = i22;
                                int i3118 = i12;
                                chatMessageOld.time = cursor.getLong(i3117);
                                int i3119 = i21;
                                chatMessageOld.localtime = cursor.getLong(i3119);
                                int i418 = i20;
                                chatMessageOld.giftid = cursor.getLong(i418);
                                int i419 = i19;
                                chatMessageOld.number = cursor.getInt(i419);
                                i19 = i419;
                                int i4110 = i18;
                                chatMessageOld.url = cursor.getString(i4110);
                                i18 = i4110;
                                int i4111 = i17;
                                chatMessageOld.description = cursor.getString(i4111);
                                i17 = i4111;
                                int i4112 = i16;
                                chatMessageOld.duration = cursor.getInt(i4112);
                                i16 = i4112;
                                int i4113 = i15;
                                chatMessageOld.msgstatus = cursor.getInt(i4113);
                                i15 = i4113;
                                int i4114 = columnIndexOrThrow15;
                                chatMessageOld.filename = cursor.getString(i4114);
                                columnIndexOrThrow15 = i4114;
                                int i4115 = columnIndexOrThrow16;
                                chatMessageOld.isRead = cursor.getInt(i4115);
                                columnIndexOrThrow16 = i4115;
                                int i4116 = columnIndexOrThrow17;
                                chatMessageOld.uid = cursor.getString(i4116);
                                i14 = columnIndexOrThrow18;
                                if (cursor.getInt(i14) != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                columnIndexOrThrow18 = i14;
                                chatMessageOld.isWarn = z;
                                chatMessageOld.gif = gif;
                                chatMessageOld.shareRoom = shareRoom;
                                chatMessageOld.shareMoment = shareMoment;
                                chatMessageOld.shareTopic = shareTopic;
                                chatMessageOld.shareUser = shareUser;
                                arrayList = arrayList2;
                                arrayList.add(chatMessageOld);
                                columnIndexOrThrow17 = i4116;
                                columnIndexOrThrow28 = i5;
                                columnIndexOrThrow27 = columnIndexOrThrow27;
                                columnIndexOrThrow31 = i7;
                                columnIndexOrThrow30 = i10;
                                columnIndexOrThrow34 = i4;
                                columnIndexOrThrow35 = i6;
                                columnIndexOrThrow26 = columnIndexOrThrow26;
                                columnIndexOrThrow22 = columnIndexOrThrow22;
                                columnIndexOrThrow36 = columnIndexOrThrow36;
                                columnIndexOrThrow37 = i8;
                                columnIndexOrThrow40 = i3118;
                                columnIndexOrThrow39 = i3111;
                                columnIndexOrThrow38 = i9;
                                columnIndexOrThrow21 = columnIndexOrThrow21;
                                i28 = i13;
                                columnIndexOrThrow20 = columnIndexOrThrow20;
                                i29 = i2;
                                i22 = i3117;
                                i27 = i3110;
                                columnIndexOrThrow24 = columnIndexOrThrow24;
                                i21 = i3119;
                                i20 = i418;
                                columnIndexOrThrow25 = columnIndexOrThrow25;
                                i25 = i3114;
                                columnIndexOrThrow29 = i3;
                                columnIndexOrThrow33 = i3113;
                                i26 = i3112;
                            }
                            shareTopic = new ChatMessageOld.ShareTopic();
                            shareTopic.circleId = cursor.getLong(columnIndexOrThrow30);
                            shareTopic.image = cursor.getString(columnIndexOrThrow31);
                            shareTopic.name = cursor.getString(i2);
                            shareTopic.userCount = cursor.getInt(i);
                            shareTopic.momentCount = cursor.getInt(i4);
                            shareTopic.msg = cursor.getString(i6);
                            if (cursor.isNull(columnIndexOrThrow36)) {
                                i8 = columnIndexOrThrow37;
                                if (cursor.isNull(i8)) {
                                    i7 = columnIndexOrThrow31;
                                    i9 = columnIndexOrThrow38;
                                    if (cursor.isNull(i9)) {
                                        i10 = columnIndexOrThrow30;
                                        i11 = columnIndexOrThrow39;
                                        if (cursor.isNull(i11)) {
                                            i4 = i4;
                                            i12 = columnIndexOrThrow40;
                                            if (cursor.isNull(i12)) {
                                                shareUser = new ChatMessageOld.ShareUser();
                                                shareUser.id = cursor.getLong(columnIndexOrThrow36);
                                                shareUser.idx = cursor.getLong(i8);
                                                shareUser.head = cursor.getString(i9);
                                                shareUser.name = cursor.getString(i11);
                                                shareUser.msg = cursor.getString(i12);
                                            } else {
                                                shareUser = null;
                                            }
                                        }
                                    }
                                    chatMessageOld = new ChatMessageOld();
                                    i13 = i28;
                                    if (cursor.isNull(i13)) {
                                        chatMessageOld.id = null;
                                    } else {
                                        chatMessageOld.id = Integer.valueOf(cursor.getInt(i13));
                                    }
                                    int i31110 = i27;
                                    int i31111 = i11;
                                    chatMessageOld.mid = cursor.getString(i31110);
                                    int i31112 = i26;
                                    int i31113 = i;
                                    chatMessageOld.from = cursor.getLong(i31112);
                                    int i31114 = i25;
                                    chatMessageOld.to = cursor.getLong(i31114);
                                    int i31115 = i24;
                                    chatMessageOld.type = cursor.getInt(i31115);
                                    i24 = i31115;
                                    int i31116 = i23;
                                    chatMessageOld.msg = cursor.getString(i31116);
                                    i23 = i31116;
                                    int i31117 = i22;
                                    int i31118 = i12;
                                    chatMessageOld.time = cursor.getLong(i31117);
                                    int i31119 = i21;
                                    chatMessageOld.localtime = cursor.getLong(i31119);
                                    int i4117 = i20;
                                    chatMessageOld.giftid = cursor.getLong(i4117);
                                    int i4118 = i19;
                                    chatMessageOld.number = cursor.getInt(i4118);
                                    i19 = i4118;
                                    int i4119 = i18;
                                    chatMessageOld.url = cursor.getString(i4119);
                                    i18 = i4119;
                                    int i41110 = i17;
                                    chatMessageOld.description = cursor.getString(i41110);
                                    i17 = i41110;
                                    int i41111 = i16;
                                    chatMessageOld.duration = cursor.getInt(i41111);
                                    i16 = i41111;
                                    int i41112 = i15;
                                    chatMessageOld.msgstatus = cursor.getInt(i41112);
                                    i15 = i41112;
                                    int i41113 = columnIndexOrThrow15;
                                    chatMessageOld.filename = cursor.getString(i41113);
                                    columnIndexOrThrow15 = i41113;
                                    int i41114 = columnIndexOrThrow16;
                                    chatMessageOld.isRead = cursor.getInt(i41114);
                                    columnIndexOrThrow16 = i41114;
                                    int i41115 = columnIndexOrThrow17;
                                    chatMessageOld.uid = cursor.getString(i41115);
                                    i14 = columnIndexOrThrow18;
                                    if (cursor.getInt(i14) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    columnIndexOrThrow18 = i14;
                                    chatMessageOld.isWarn = z;
                                    chatMessageOld.gif = gif;
                                    chatMessageOld.shareRoom = shareRoom;
                                    chatMessageOld.shareMoment = shareMoment;
                                    chatMessageOld.shareTopic = shareTopic;
                                    chatMessageOld.shareUser = shareUser;
                                    arrayList = arrayList2;
                                    arrayList.add(chatMessageOld);
                                    columnIndexOrThrow17 = i41115;
                                    columnIndexOrThrow28 = i5;
                                    columnIndexOrThrow27 = columnIndexOrThrow27;
                                    columnIndexOrThrow31 = i7;
                                    columnIndexOrThrow30 = i10;
                                    columnIndexOrThrow34 = i4;
                                    columnIndexOrThrow35 = i6;
                                    columnIndexOrThrow26 = columnIndexOrThrow26;
                                    columnIndexOrThrow22 = columnIndexOrThrow22;
                                    columnIndexOrThrow36 = columnIndexOrThrow36;
                                    columnIndexOrThrow37 = i8;
                                    columnIndexOrThrow40 = i31118;
                                    columnIndexOrThrow39 = i31111;
                                    columnIndexOrThrow38 = i9;
                                    columnIndexOrThrow21 = columnIndexOrThrow21;
                                    i28 = i13;
                                    columnIndexOrThrow20 = columnIndexOrThrow20;
                                    i29 = i2;
                                    i22 = i31117;
                                    i27 = i31110;
                                    columnIndexOrThrow24 = columnIndexOrThrow24;
                                    i21 = i31119;
                                    i20 = i4117;
                                    columnIndexOrThrow25 = columnIndexOrThrow25;
                                    i25 = i31114;
                                    columnIndexOrThrow29 = i3;
                                    columnIndexOrThrow33 = i31113;
                                    i26 = i31112;
                                } else {
                                    i7 = columnIndexOrThrow31;
                                    i10 = columnIndexOrThrow30;
                                    i9 = columnIndexOrThrow38;
                                    i11 = columnIndexOrThrow39;
                                }
                                i12 = columnIndexOrThrow40;
                                shareUser = new ChatMessageOld.ShareUser();
                                shareUser.id = cursor.getLong(columnIndexOrThrow36);
                                shareUser.idx = cursor.getLong(i8);
                                shareUser.head = cursor.getString(i9);
                                shareUser.name = cursor.getString(i11);
                                shareUser.msg = cursor.getString(i12);
                                chatMessageOld = new ChatMessageOld();
                                i13 = i28;
                                if (cursor.isNull(i13)) {
                                    chatMessageOld.id = null;
                                } else {
                                    chatMessageOld.id = Integer.valueOf(cursor.getInt(i13));
                                }
                                int i311110 = i27;
                                int i311111 = i11;
                                chatMessageOld.mid = cursor.getString(i311110);
                                int i311112 = i26;
                                int i311113 = i;
                                chatMessageOld.from = cursor.getLong(i311112);
                                int i311114 = i25;
                                chatMessageOld.to = cursor.getLong(i311114);
                                int i311115 = i24;
                                chatMessageOld.type = cursor.getInt(i311115);
                                i24 = i311115;
                                int i311116 = i23;
                                chatMessageOld.msg = cursor.getString(i311116);
                                i23 = i311116;
                                int i311117 = i22;
                                int i311118 = i12;
                                chatMessageOld.time = cursor.getLong(i311117);
                                int i311119 = i21;
                                chatMessageOld.localtime = cursor.getLong(i311119);
                                int i41116 = i20;
                                chatMessageOld.giftid = cursor.getLong(i41116);
                                int i41117 = i19;
                                chatMessageOld.number = cursor.getInt(i41117);
                                i19 = i41117;
                                int i41118 = i18;
                                chatMessageOld.url = cursor.getString(i41118);
                                i18 = i41118;
                                int i41119 = i17;
                                chatMessageOld.description = cursor.getString(i41119);
                                i17 = i41119;
                                int i411110 = i16;
                                chatMessageOld.duration = cursor.getInt(i411110);
                                i16 = i411110;
                                int i411111 = i15;
                                chatMessageOld.msgstatus = cursor.getInt(i411111);
                                i15 = i411111;
                                int i411112 = columnIndexOrThrow15;
                                chatMessageOld.filename = cursor.getString(i411112);
                                columnIndexOrThrow15 = i411112;
                                int i411113 = columnIndexOrThrow16;
                                chatMessageOld.isRead = cursor.getInt(i411113);
                                columnIndexOrThrow16 = i411113;
                                int i411114 = columnIndexOrThrow17;
                                chatMessageOld.uid = cursor.getString(i411114);
                                i14 = columnIndexOrThrow18;
                                if (cursor.getInt(i14) != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                columnIndexOrThrow18 = i14;
                                chatMessageOld.isWarn = z;
                                chatMessageOld.gif = gif;
                                chatMessageOld.shareRoom = shareRoom;
                                chatMessageOld.shareMoment = shareMoment;
                                chatMessageOld.shareTopic = shareTopic;
                                chatMessageOld.shareUser = shareUser;
                                arrayList = arrayList2;
                                arrayList.add(chatMessageOld);
                                columnIndexOrThrow17 = i411114;
                                columnIndexOrThrow28 = i5;
                                columnIndexOrThrow27 = columnIndexOrThrow27;
                                columnIndexOrThrow31 = i7;
                                columnIndexOrThrow30 = i10;
                                columnIndexOrThrow34 = i4;
                                columnIndexOrThrow35 = i6;
                                columnIndexOrThrow26 = columnIndexOrThrow26;
                                columnIndexOrThrow22 = columnIndexOrThrow22;
                                columnIndexOrThrow36 = columnIndexOrThrow36;
                                columnIndexOrThrow37 = i8;
                                columnIndexOrThrow40 = i311118;
                                columnIndexOrThrow39 = i311111;
                                columnIndexOrThrow38 = i9;
                                columnIndexOrThrow21 = columnIndexOrThrow21;
                                i28 = i13;
                                columnIndexOrThrow20 = columnIndexOrThrow20;
                                i29 = i2;
                                i22 = i311117;
                                i27 = i311110;
                                columnIndexOrThrow24 = columnIndexOrThrow24;
                                i21 = i311119;
                                i20 = i41116;
                                columnIndexOrThrow25 = columnIndexOrThrow25;
                                i25 = i311114;
                                columnIndexOrThrow29 = i3;
                                columnIndexOrThrow33 = i311113;
                                i26 = i311112;
                            } else {
                                i7 = columnIndexOrThrow31;
                                i8 = columnIndexOrThrow37;
                                i9 = columnIndexOrThrow38;
                            }
                            i10 = columnIndexOrThrow30;
                            i11 = columnIndexOrThrow39;
                            i12 = columnIndexOrThrow40;
                            shareUser = new ChatMessageOld.ShareUser();
                            shareUser.id = cursor.getLong(columnIndexOrThrow36);
                            shareUser.idx = cursor.getLong(i8);
                            shareUser.head = cursor.getString(i9);
                            shareUser.name = cursor.getString(i11);
                            shareUser.msg = cursor.getString(i12);
                            chatMessageOld = new ChatMessageOld();
                            i13 = i28;
                            if (cursor.isNull(i13)) {
                                chatMessageOld.id = null;
                            } else {
                                chatMessageOld.id = Integer.valueOf(cursor.getInt(i13));
                            }
                            int i3111110 = i27;
                            int i3111111 = i11;
                            chatMessageOld.mid = cursor.getString(i3111110);
                            int i3111112 = i26;
                            int i3111113 = i;
                            chatMessageOld.from = cursor.getLong(i3111112);
                            int i3111114 = i25;
                            chatMessageOld.to = cursor.getLong(i3111114);
                            int i3111115 = i24;
                            chatMessageOld.type = cursor.getInt(i3111115);
                            i24 = i3111115;
                            int i3111116 = i23;
                            chatMessageOld.msg = cursor.getString(i3111116);
                            i23 = i3111116;
                            int i3111117 = i22;
                            int i3111118 = i12;
                            chatMessageOld.time = cursor.getLong(i3111117);
                            int i3111119 = i21;
                            chatMessageOld.localtime = cursor.getLong(i3111119);
                            int i411115 = i20;
                            chatMessageOld.giftid = cursor.getLong(i411115);
                            int i411116 = i19;
                            chatMessageOld.number = cursor.getInt(i411116);
                            i19 = i411116;
                            int i411117 = i18;
                            chatMessageOld.url = cursor.getString(i411117);
                            i18 = i411117;
                            int i411118 = i17;
                            chatMessageOld.description = cursor.getString(i411118);
                            i17 = i411118;
                            int i411119 = i16;
                            chatMessageOld.duration = cursor.getInt(i411119);
                            i16 = i411119;
                            int i4111110 = i15;
                            chatMessageOld.msgstatus = cursor.getInt(i4111110);
                            i15 = i4111110;
                            int i4111111 = columnIndexOrThrow15;
                            chatMessageOld.filename = cursor.getString(i4111111);
                            columnIndexOrThrow15 = i4111111;
                            int i4111112 = columnIndexOrThrow16;
                            chatMessageOld.isRead = cursor.getInt(i4111112);
                            columnIndexOrThrow16 = i4111112;
                            int i4111113 = columnIndexOrThrow17;
                            chatMessageOld.uid = cursor.getString(i4111113);
                            i14 = columnIndexOrThrow18;
                            if (cursor.getInt(i14) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            columnIndexOrThrow18 = i14;
                            chatMessageOld.isWarn = z;
                            chatMessageOld.gif = gif;
                            chatMessageOld.shareRoom = shareRoom;
                            chatMessageOld.shareMoment = shareMoment;
                            chatMessageOld.shareTopic = shareTopic;
                            chatMessageOld.shareUser = shareUser;
                            arrayList = arrayList2;
                            arrayList.add(chatMessageOld);
                            columnIndexOrThrow17 = i4111113;
                            columnIndexOrThrow28 = i5;
                            columnIndexOrThrow27 = columnIndexOrThrow27;
                            columnIndexOrThrow31 = i7;
                            columnIndexOrThrow30 = i10;
                            columnIndexOrThrow34 = i4;
                            columnIndexOrThrow35 = i6;
                            columnIndexOrThrow26 = columnIndexOrThrow26;
                            columnIndexOrThrow22 = columnIndexOrThrow22;
                            columnIndexOrThrow36 = columnIndexOrThrow36;
                            columnIndexOrThrow37 = i8;
                            columnIndexOrThrow40 = i3111118;
                            columnIndexOrThrow39 = i3111111;
                            columnIndexOrThrow38 = i9;
                            columnIndexOrThrow21 = columnIndexOrThrow21;
                            i28 = i13;
                            columnIndexOrThrow20 = columnIndexOrThrow20;
                            i29 = i2;
                            i22 = i3111117;
                            i27 = i3111110;
                            columnIndexOrThrow24 = columnIndexOrThrow24;
                            i21 = i3111119;
                            i20 = i411115;
                            columnIndexOrThrow25 = columnIndexOrThrow25;
                            i25 = i3111114;
                            columnIndexOrThrow29 = i3;
                            columnIndexOrThrow33 = i3111113;
                            i26 = i3111112;
                        }
                        i5 = columnIndexOrThrow28;
                        i6 = columnIndexOrThrow35;
                        shareTopic = new ChatMessageOld.ShareTopic();
                        shareTopic.circleId = cursor.getLong(columnIndexOrThrow30);
                        shareTopic.image = cursor.getString(columnIndexOrThrow31);
                        shareTopic.name = cursor.getString(i2);
                        shareTopic.userCount = cursor.getInt(i);
                        shareTopic.momentCount = cursor.getInt(i4);
                        shareTopic.msg = cursor.getString(i6);
                        if (cursor.isNull(columnIndexOrThrow36)) {
                            i8 = columnIndexOrThrow37;
                            if (cursor.isNull(i8)) {
                                i7 = columnIndexOrThrow31;
                                i9 = columnIndexOrThrow38;
                                if (cursor.isNull(i9)) {
                                    i10 = columnIndexOrThrow30;
                                    i11 = columnIndexOrThrow39;
                                    if (cursor.isNull(i11)) {
                                        i4 = i4;
                                        i12 = columnIndexOrThrow40;
                                        if (cursor.isNull(i12)) {
                                            shareUser = new ChatMessageOld.ShareUser();
                                            shareUser.id = cursor.getLong(columnIndexOrThrow36);
                                            shareUser.idx = cursor.getLong(i8);
                                            shareUser.head = cursor.getString(i9);
                                            shareUser.name = cursor.getString(i11);
                                            shareUser.msg = cursor.getString(i12);
                                        } else {
                                            shareUser = null;
                                        }
                                    }
                                }
                                chatMessageOld = new ChatMessageOld();
                                i13 = i28;
                                if (cursor.isNull(i13)) {
                                    chatMessageOld.id = null;
                                } else {
                                    chatMessageOld.id = Integer.valueOf(cursor.getInt(i13));
                                }
                                int i31111110 = i27;
                                int i31111111 = i11;
                                chatMessageOld.mid = cursor.getString(i31111110);
                                int i31111112 = i26;
                                int i31111113 = i;
                                chatMessageOld.from = cursor.getLong(i31111112);
                                int i31111114 = i25;
                                chatMessageOld.to = cursor.getLong(i31111114);
                                int i31111115 = i24;
                                chatMessageOld.type = cursor.getInt(i31111115);
                                i24 = i31111115;
                                int i31111116 = i23;
                                chatMessageOld.msg = cursor.getString(i31111116);
                                i23 = i31111116;
                                int i31111117 = i22;
                                int i31111118 = i12;
                                chatMessageOld.time = cursor.getLong(i31111117);
                                int i31111119 = i21;
                                chatMessageOld.localtime = cursor.getLong(i31111119);
                                int i4111114 = i20;
                                chatMessageOld.giftid = cursor.getLong(i4111114);
                                int i4111115 = i19;
                                chatMessageOld.number = cursor.getInt(i4111115);
                                i19 = i4111115;
                                int i4111116 = i18;
                                chatMessageOld.url = cursor.getString(i4111116);
                                i18 = i4111116;
                                int i4111117 = i17;
                                chatMessageOld.description = cursor.getString(i4111117);
                                i17 = i4111117;
                                int i4111118 = i16;
                                chatMessageOld.duration = cursor.getInt(i4111118);
                                i16 = i4111118;
                                int i4111119 = i15;
                                chatMessageOld.msgstatus = cursor.getInt(i4111119);
                                i15 = i4111119;
                                int i41111110 = columnIndexOrThrow15;
                                chatMessageOld.filename = cursor.getString(i41111110);
                                columnIndexOrThrow15 = i41111110;
                                int i41111111 = columnIndexOrThrow16;
                                chatMessageOld.isRead = cursor.getInt(i41111111);
                                columnIndexOrThrow16 = i41111111;
                                int i41111112 = columnIndexOrThrow17;
                                chatMessageOld.uid = cursor.getString(i41111112);
                                i14 = columnIndexOrThrow18;
                                if (cursor.getInt(i14) != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                columnIndexOrThrow18 = i14;
                                chatMessageOld.isWarn = z;
                                chatMessageOld.gif = gif;
                                chatMessageOld.shareRoom = shareRoom;
                                chatMessageOld.shareMoment = shareMoment;
                                chatMessageOld.shareTopic = shareTopic;
                                chatMessageOld.shareUser = shareUser;
                                arrayList = arrayList2;
                                arrayList.add(chatMessageOld);
                                columnIndexOrThrow17 = i41111112;
                                columnIndexOrThrow28 = i5;
                                columnIndexOrThrow27 = columnIndexOrThrow27;
                                columnIndexOrThrow31 = i7;
                                columnIndexOrThrow30 = i10;
                                columnIndexOrThrow34 = i4;
                                columnIndexOrThrow35 = i6;
                                columnIndexOrThrow26 = columnIndexOrThrow26;
                                columnIndexOrThrow22 = columnIndexOrThrow22;
                                columnIndexOrThrow36 = columnIndexOrThrow36;
                                columnIndexOrThrow37 = i8;
                                columnIndexOrThrow40 = i31111118;
                                columnIndexOrThrow39 = i31111111;
                                columnIndexOrThrow38 = i9;
                                columnIndexOrThrow21 = columnIndexOrThrow21;
                                i28 = i13;
                                columnIndexOrThrow20 = columnIndexOrThrow20;
                                i29 = i2;
                                i22 = i31111117;
                                i27 = i31111110;
                                columnIndexOrThrow24 = columnIndexOrThrow24;
                                i21 = i31111119;
                                i20 = i4111114;
                                columnIndexOrThrow25 = columnIndexOrThrow25;
                                i25 = i31111114;
                                columnIndexOrThrow29 = i3;
                                columnIndexOrThrow33 = i31111113;
                                i26 = i31111112;
                            } else {
                                i7 = columnIndexOrThrow31;
                                i10 = columnIndexOrThrow30;
                                i9 = columnIndexOrThrow38;
                                i11 = columnIndexOrThrow39;
                            }
                            i12 = columnIndexOrThrow40;
                            shareUser = new ChatMessageOld.ShareUser();
                            shareUser.id = cursor.getLong(columnIndexOrThrow36);
                            shareUser.idx = cursor.getLong(i8);
                            shareUser.head = cursor.getString(i9);
                            shareUser.name = cursor.getString(i11);
                            shareUser.msg = cursor.getString(i12);
                            chatMessageOld = new ChatMessageOld();
                            i13 = i28;
                            if (cursor.isNull(i13)) {
                                chatMessageOld.id = null;
                            } else {
                                chatMessageOld.id = Integer.valueOf(cursor.getInt(i13));
                            }
                            int i311111110 = i27;
                            int i311111111 = i11;
                            chatMessageOld.mid = cursor.getString(i311111110);
                            int i311111112 = i26;
                            int i311111113 = i;
                            chatMessageOld.from = cursor.getLong(i311111112);
                            int i311111114 = i25;
                            chatMessageOld.to = cursor.getLong(i311111114);
                            int i311111115 = i24;
                            chatMessageOld.type = cursor.getInt(i311111115);
                            i24 = i311111115;
                            int i311111116 = i23;
                            chatMessageOld.msg = cursor.getString(i311111116);
                            i23 = i311111116;
                            int i311111117 = i22;
                            int i311111118 = i12;
                            chatMessageOld.time = cursor.getLong(i311111117);
                            int i311111119 = i21;
                            chatMessageOld.localtime = cursor.getLong(i311111119);
                            int i41111113 = i20;
                            chatMessageOld.giftid = cursor.getLong(i41111113);
                            int i41111114 = i19;
                            chatMessageOld.number = cursor.getInt(i41111114);
                            i19 = i41111114;
                            int i41111115 = i18;
                            chatMessageOld.url = cursor.getString(i41111115);
                            i18 = i41111115;
                            int i41111116 = i17;
                            chatMessageOld.description = cursor.getString(i41111116);
                            i17 = i41111116;
                            int i41111117 = i16;
                            chatMessageOld.duration = cursor.getInt(i41111117);
                            i16 = i41111117;
                            int i41111118 = i15;
                            chatMessageOld.msgstatus = cursor.getInt(i41111118);
                            i15 = i41111118;
                            int i41111119 = columnIndexOrThrow15;
                            chatMessageOld.filename = cursor.getString(i41111119);
                            columnIndexOrThrow15 = i41111119;
                            int i411111110 = columnIndexOrThrow16;
                            chatMessageOld.isRead = cursor.getInt(i411111110);
                            columnIndexOrThrow16 = i411111110;
                            int i411111111 = columnIndexOrThrow17;
                            chatMessageOld.uid = cursor.getString(i411111111);
                            i14 = columnIndexOrThrow18;
                            if (cursor.getInt(i14) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            columnIndexOrThrow18 = i14;
                            chatMessageOld.isWarn = z;
                            chatMessageOld.gif = gif;
                            chatMessageOld.shareRoom = shareRoom;
                            chatMessageOld.shareMoment = shareMoment;
                            chatMessageOld.shareTopic = shareTopic;
                            chatMessageOld.shareUser = shareUser;
                            arrayList = arrayList2;
                            arrayList.add(chatMessageOld);
                            columnIndexOrThrow17 = i411111111;
                            columnIndexOrThrow28 = i5;
                            columnIndexOrThrow27 = columnIndexOrThrow27;
                            columnIndexOrThrow31 = i7;
                            columnIndexOrThrow30 = i10;
                            columnIndexOrThrow34 = i4;
                            columnIndexOrThrow35 = i6;
                            columnIndexOrThrow26 = columnIndexOrThrow26;
                            columnIndexOrThrow22 = columnIndexOrThrow22;
                            columnIndexOrThrow36 = columnIndexOrThrow36;
                            columnIndexOrThrow37 = i8;
                            columnIndexOrThrow40 = i311111118;
                            columnIndexOrThrow39 = i311111111;
                            columnIndexOrThrow38 = i9;
                            columnIndexOrThrow21 = columnIndexOrThrow21;
                            i28 = i13;
                            columnIndexOrThrow20 = columnIndexOrThrow20;
                            i29 = i2;
                            i22 = i311111117;
                            i27 = i311111110;
                            columnIndexOrThrow24 = columnIndexOrThrow24;
                            i21 = i311111119;
                            i20 = i41111113;
                            columnIndexOrThrow25 = columnIndexOrThrow25;
                            i25 = i311111114;
                            columnIndexOrThrow29 = i3;
                            columnIndexOrThrow33 = i311111113;
                            i26 = i311111112;
                        } else {
                            i7 = columnIndexOrThrow31;
                            i8 = columnIndexOrThrow37;
                            i9 = columnIndexOrThrow38;
                        }
                        i10 = columnIndexOrThrow30;
                        i11 = columnIndexOrThrow39;
                        i12 = columnIndexOrThrow40;
                        shareUser = new ChatMessageOld.ShareUser();
                        shareUser.id = cursor.getLong(columnIndexOrThrow36);
                        shareUser.idx = cursor.getLong(i8);
                        shareUser.head = cursor.getString(i9);
                        shareUser.name = cursor.getString(i11);
                        shareUser.msg = cursor.getString(i12);
                        chatMessageOld = new ChatMessageOld();
                        i13 = i28;
                        if (cursor.isNull(i13)) {
                            chatMessageOld.id = null;
                        } else {
                            chatMessageOld.id = Integer.valueOf(cursor.getInt(i13));
                        }
                        int i3111111110 = i27;
                        int i3111111111 = i11;
                        chatMessageOld.mid = cursor.getString(i3111111110);
                        int i3111111112 = i26;
                        int i3111111113 = i;
                        chatMessageOld.from = cursor.getLong(i3111111112);
                        int i3111111114 = i25;
                        chatMessageOld.to = cursor.getLong(i3111111114);
                        int i3111111115 = i24;
                        chatMessageOld.type = cursor.getInt(i3111111115);
                        i24 = i3111111115;
                        int i3111111116 = i23;
                        chatMessageOld.msg = cursor.getString(i3111111116);
                        i23 = i3111111116;
                        int i3111111117 = i22;
                        int i3111111118 = i12;
                        chatMessageOld.time = cursor.getLong(i3111111117);
                        int i3111111119 = i21;
                        chatMessageOld.localtime = cursor.getLong(i3111111119);
                        int i411111112 = i20;
                        chatMessageOld.giftid = cursor.getLong(i411111112);
                        int i411111113 = i19;
                        chatMessageOld.number = cursor.getInt(i411111113);
                        i19 = i411111113;
                        int i411111114 = i18;
                        chatMessageOld.url = cursor.getString(i411111114);
                        i18 = i411111114;
                        int i411111115 = i17;
                        chatMessageOld.description = cursor.getString(i411111115);
                        i17 = i411111115;
                        int i411111116 = i16;
                        chatMessageOld.duration = cursor.getInt(i411111116);
                        i16 = i411111116;
                        int i411111117 = i15;
                        chatMessageOld.msgstatus = cursor.getInt(i411111117);
                        i15 = i411111117;
                        int i411111118 = columnIndexOrThrow15;
                        chatMessageOld.filename = cursor.getString(i411111118);
                        columnIndexOrThrow15 = i411111118;
                        int i411111119 = columnIndexOrThrow16;
                        chatMessageOld.isRead = cursor.getInt(i411111119);
                        columnIndexOrThrow16 = i411111119;
                        int i4111111110 = columnIndexOrThrow17;
                        chatMessageOld.uid = cursor.getString(i4111111110);
                        i14 = columnIndexOrThrow18;
                        if (cursor.getInt(i14) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        columnIndexOrThrow18 = i14;
                        chatMessageOld.isWarn = z;
                        chatMessageOld.gif = gif;
                        chatMessageOld.shareRoom = shareRoom;
                        chatMessageOld.shareMoment = shareMoment;
                        chatMessageOld.shareTopic = shareTopic;
                        chatMessageOld.shareUser = shareUser;
                        arrayList = arrayList2;
                        arrayList.add(chatMessageOld);
                        columnIndexOrThrow17 = i4111111110;
                        columnIndexOrThrow28 = i5;
                        columnIndexOrThrow27 = columnIndexOrThrow27;
                        columnIndexOrThrow31 = i7;
                        columnIndexOrThrow30 = i10;
                        columnIndexOrThrow34 = i4;
                        columnIndexOrThrow35 = i6;
                        columnIndexOrThrow26 = columnIndexOrThrow26;
                        columnIndexOrThrow22 = columnIndexOrThrow22;
                        columnIndexOrThrow36 = columnIndexOrThrow36;
                        columnIndexOrThrow37 = i8;
                        columnIndexOrThrow40 = i3111111118;
                        columnIndexOrThrow39 = i3111111111;
                        columnIndexOrThrow38 = i9;
                        columnIndexOrThrow21 = columnIndexOrThrow21;
                        i28 = i13;
                        columnIndexOrThrow20 = columnIndexOrThrow20;
                        i29 = i2;
                        i22 = i3111111117;
                        i27 = i3111111110;
                        columnIndexOrThrow24 = columnIndexOrThrow24;
                        i21 = i3111111119;
                        i20 = i411111112;
                        columnIndexOrThrow25 = columnIndexOrThrow25;
                        i25 = i3111111114;
                        columnIndexOrThrow29 = i3;
                        columnIndexOrThrow33 = i3111111113;
                        i26 = i3111111112;
                    } else {
                        i = columnIndexOrThrow33;
                    }
                } else {
                    i = columnIndexOrThrow33;
                    i2 = i29;
                }
                i3 = columnIndexOrThrow29;
                i4 = columnIndexOrThrow34;
                i5 = columnIndexOrThrow28;
                i6 = columnIndexOrThrow35;
                shareTopic = new ChatMessageOld.ShareTopic();
                shareTopic.circleId = cursor.getLong(columnIndexOrThrow30);
                shareTopic.image = cursor.getString(columnIndexOrThrow31);
                shareTopic.name = cursor.getString(i2);
                shareTopic.userCount = cursor.getInt(i);
                shareTopic.momentCount = cursor.getInt(i4);
                shareTopic.msg = cursor.getString(i6);
                if (cursor.isNull(columnIndexOrThrow36)) {
                    i8 = columnIndexOrThrow37;
                    if (cursor.isNull(i8)) {
                        i7 = columnIndexOrThrow31;
                        i9 = columnIndexOrThrow38;
                        if (cursor.isNull(i9)) {
                            i10 = columnIndexOrThrow30;
                            i11 = columnIndexOrThrow39;
                            if (cursor.isNull(i11)) {
                                i4 = i4;
                                i12 = columnIndexOrThrow40;
                                if (cursor.isNull(i12)) {
                                    shareUser = new ChatMessageOld.ShareUser();
                                    shareUser.id = cursor.getLong(columnIndexOrThrow36);
                                    shareUser.idx = cursor.getLong(i8);
                                    shareUser.head = cursor.getString(i9);
                                    shareUser.name = cursor.getString(i11);
                                    shareUser.msg = cursor.getString(i12);
                                } else {
                                    shareUser = null;
                                }
                            }
                        }
                        chatMessageOld = new ChatMessageOld();
                        i13 = i28;
                        if (cursor.isNull(i13)) {
                            chatMessageOld.id = null;
                        } else {
                            chatMessageOld.id = Integer.valueOf(cursor.getInt(i13));
                        }
                        int i31111111110 = i27;
                        int i31111111111 = i11;
                        chatMessageOld.mid = cursor.getString(i31111111110);
                        int i31111111112 = i26;
                        int i31111111113 = i;
                        chatMessageOld.from = cursor.getLong(i31111111112);
                        int i31111111114 = i25;
                        chatMessageOld.to = cursor.getLong(i31111111114);
                        int i31111111115 = i24;
                        chatMessageOld.type = cursor.getInt(i31111111115);
                        i24 = i31111111115;
                        int i31111111116 = i23;
                        chatMessageOld.msg = cursor.getString(i31111111116);
                        i23 = i31111111116;
                        int i31111111117 = i22;
                        int i31111111118 = i12;
                        chatMessageOld.time = cursor.getLong(i31111111117);
                        int i31111111119 = i21;
                        chatMessageOld.localtime = cursor.getLong(i31111111119);
                        int i4111111111 = i20;
                        chatMessageOld.giftid = cursor.getLong(i4111111111);
                        int i4111111112 = i19;
                        chatMessageOld.number = cursor.getInt(i4111111112);
                        i19 = i4111111112;
                        int i4111111113 = i18;
                        chatMessageOld.url = cursor.getString(i4111111113);
                        i18 = i4111111113;
                        int i4111111114 = i17;
                        chatMessageOld.description = cursor.getString(i4111111114);
                        i17 = i4111111114;
                        int i4111111115 = i16;
                        chatMessageOld.duration = cursor.getInt(i4111111115);
                        i16 = i4111111115;
                        int i4111111116 = i15;
                        chatMessageOld.msgstatus = cursor.getInt(i4111111116);
                        i15 = i4111111116;
                        int i4111111117 = columnIndexOrThrow15;
                        chatMessageOld.filename = cursor.getString(i4111111117);
                        columnIndexOrThrow15 = i4111111117;
                        int i4111111118 = columnIndexOrThrow16;
                        chatMessageOld.isRead = cursor.getInt(i4111111118);
                        columnIndexOrThrow16 = i4111111118;
                        int i4111111119 = columnIndexOrThrow17;
                        chatMessageOld.uid = cursor.getString(i4111111119);
                        i14 = columnIndexOrThrow18;
                        if (cursor.getInt(i14) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        columnIndexOrThrow18 = i14;
                        chatMessageOld.isWarn = z;
                        chatMessageOld.gif = gif;
                        chatMessageOld.shareRoom = shareRoom;
                        chatMessageOld.shareMoment = shareMoment;
                        chatMessageOld.shareTopic = shareTopic;
                        chatMessageOld.shareUser = shareUser;
                        arrayList = arrayList2;
                        arrayList.add(chatMessageOld);
                        columnIndexOrThrow17 = i4111111119;
                        columnIndexOrThrow28 = i5;
                        columnIndexOrThrow27 = columnIndexOrThrow27;
                        columnIndexOrThrow31 = i7;
                        columnIndexOrThrow30 = i10;
                        columnIndexOrThrow34 = i4;
                        columnIndexOrThrow35 = i6;
                        columnIndexOrThrow26 = columnIndexOrThrow26;
                        columnIndexOrThrow22 = columnIndexOrThrow22;
                        columnIndexOrThrow36 = columnIndexOrThrow36;
                        columnIndexOrThrow37 = i8;
                        columnIndexOrThrow40 = i31111111118;
                        columnIndexOrThrow39 = i31111111111;
                        columnIndexOrThrow38 = i9;
                        columnIndexOrThrow21 = columnIndexOrThrow21;
                        i28 = i13;
                        columnIndexOrThrow20 = columnIndexOrThrow20;
                        i29 = i2;
                        i22 = i31111111117;
                        i27 = i31111111110;
                        columnIndexOrThrow24 = columnIndexOrThrow24;
                        i21 = i31111111119;
                        i20 = i4111111111;
                        columnIndexOrThrow25 = columnIndexOrThrow25;
                        i25 = i31111111114;
                        columnIndexOrThrow29 = i3;
                        columnIndexOrThrow33 = i31111111113;
                        i26 = i31111111112;
                    } else {
                        i7 = columnIndexOrThrow31;
                        i10 = columnIndexOrThrow30;
                        i9 = columnIndexOrThrow38;
                        i11 = columnIndexOrThrow39;
                    }
                    i12 = columnIndexOrThrow40;
                    shareUser = new ChatMessageOld.ShareUser();
                    shareUser.id = cursor.getLong(columnIndexOrThrow36);
                    shareUser.idx = cursor.getLong(i8);
                    shareUser.head = cursor.getString(i9);
                    shareUser.name = cursor.getString(i11);
                    shareUser.msg = cursor.getString(i12);
                    chatMessageOld = new ChatMessageOld();
                    i13 = i28;
                    if (cursor.isNull(i13)) {
                        chatMessageOld.id = null;
                    } else {
                        chatMessageOld.id = Integer.valueOf(cursor.getInt(i13));
                    }
                    int i311111111110 = i27;
                    int i311111111111 = i11;
                    chatMessageOld.mid = cursor.getString(i311111111110);
                    int i311111111112 = i26;
                    int i311111111113 = i;
                    chatMessageOld.from = cursor.getLong(i311111111112);
                    int i311111111114 = i25;
                    chatMessageOld.to = cursor.getLong(i311111111114);
                    int i311111111115 = i24;
                    chatMessageOld.type = cursor.getInt(i311111111115);
                    i24 = i311111111115;
                    int i311111111116 = i23;
                    chatMessageOld.msg = cursor.getString(i311111111116);
                    i23 = i311111111116;
                    int i311111111117 = i22;
                    int i311111111118 = i12;
                    chatMessageOld.time = cursor.getLong(i311111111117);
                    int i311111111119 = i21;
                    chatMessageOld.localtime = cursor.getLong(i311111111119);
                    int i41111111110 = i20;
                    chatMessageOld.giftid = cursor.getLong(i41111111110);
                    int i41111111111 = i19;
                    chatMessageOld.number = cursor.getInt(i41111111111);
                    i19 = i41111111111;
                    int i41111111112 = i18;
                    chatMessageOld.url = cursor.getString(i41111111112);
                    i18 = i41111111112;
                    int i41111111113 = i17;
                    chatMessageOld.description = cursor.getString(i41111111113);
                    i17 = i41111111113;
                    int i41111111114 = i16;
                    chatMessageOld.duration = cursor.getInt(i41111111114);
                    i16 = i41111111114;
                    int i41111111115 = i15;
                    chatMessageOld.msgstatus = cursor.getInt(i41111111115);
                    i15 = i41111111115;
                    int i41111111116 = columnIndexOrThrow15;
                    chatMessageOld.filename = cursor.getString(i41111111116);
                    columnIndexOrThrow15 = i41111111116;
                    int i41111111117 = columnIndexOrThrow16;
                    chatMessageOld.isRead = cursor.getInt(i41111111117);
                    columnIndexOrThrow16 = i41111111117;
                    int i41111111118 = columnIndexOrThrow17;
                    chatMessageOld.uid = cursor.getString(i41111111118);
                    i14 = columnIndexOrThrow18;
                    if (cursor.getInt(i14) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    columnIndexOrThrow18 = i14;
                    chatMessageOld.isWarn = z;
                    chatMessageOld.gif = gif;
                    chatMessageOld.shareRoom = shareRoom;
                    chatMessageOld.shareMoment = shareMoment;
                    chatMessageOld.shareTopic = shareTopic;
                    chatMessageOld.shareUser = shareUser;
                    arrayList = arrayList2;
                    arrayList.add(chatMessageOld);
                    columnIndexOrThrow17 = i41111111118;
                    columnIndexOrThrow28 = i5;
                    columnIndexOrThrow27 = columnIndexOrThrow27;
                    columnIndexOrThrow31 = i7;
                    columnIndexOrThrow30 = i10;
                    columnIndexOrThrow34 = i4;
                    columnIndexOrThrow35 = i6;
                    columnIndexOrThrow26 = columnIndexOrThrow26;
                    columnIndexOrThrow22 = columnIndexOrThrow22;
                    columnIndexOrThrow36 = columnIndexOrThrow36;
                    columnIndexOrThrow37 = i8;
                    columnIndexOrThrow40 = i311111111118;
                    columnIndexOrThrow39 = i311111111111;
                    columnIndexOrThrow38 = i9;
                    columnIndexOrThrow21 = columnIndexOrThrow21;
                    i28 = i13;
                    columnIndexOrThrow20 = columnIndexOrThrow20;
                    i29 = i2;
                    i22 = i311111111117;
                    i27 = i311111111110;
                    columnIndexOrThrow24 = columnIndexOrThrow24;
                    i21 = i311111111119;
                    i20 = i41111111110;
                    columnIndexOrThrow25 = columnIndexOrThrow25;
                    i25 = i311111111114;
                    columnIndexOrThrow29 = i3;
                    columnIndexOrThrow33 = i311111111113;
                    i26 = i311111111112;
                } else {
                    i7 = columnIndexOrThrow31;
                    i8 = columnIndexOrThrow37;
                    i9 = columnIndexOrThrow38;
                }
                i10 = columnIndexOrThrow30;
                i11 = columnIndexOrThrow39;
                i12 = columnIndexOrThrow40;
                shareUser = new ChatMessageOld.ShareUser();
                shareUser.id = cursor.getLong(columnIndexOrThrow36);
                shareUser.idx = cursor.getLong(i8);
                shareUser.head = cursor.getString(i9);
                shareUser.name = cursor.getString(i11);
                shareUser.msg = cursor.getString(i12);
                chatMessageOld = new ChatMessageOld();
                i13 = i28;
                if (cursor.isNull(i13)) {
                    chatMessageOld.id = null;
                } else {
                    chatMessageOld.id = Integer.valueOf(cursor.getInt(i13));
                }
                int i3111111111110 = i27;
                int i3111111111111 = i11;
                chatMessageOld.mid = cursor.getString(i3111111111110);
                int i3111111111112 = i26;
                int i3111111111113 = i;
                chatMessageOld.from = cursor.getLong(i3111111111112);
                int i3111111111114 = i25;
                chatMessageOld.to = cursor.getLong(i3111111111114);
                int i3111111111115 = i24;
                chatMessageOld.type = cursor.getInt(i3111111111115);
                i24 = i3111111111115;
                int i3111111111116 = i23;
                chatMessageOld.msg = cursor.getString(i3111111111116);
                i23 = i3111111111116;
                int i3111111111117 = i22;
                int i3111111111118 = i12;
                chatMessageOld.time = cursor.getLong(i3111111111117);
                int i3111111111119 = i21;
                chatMessageOld.localtime = cursor.getLong(i3111111111119);
                int i41111111119 = i20;
                chatMessageOld.giftid = cursor.getLong(i41111111119);
                int i411111111110 = i19;
                chatMessageOld.number = cursor.getInt(i411111111110);
                i19 = i411111111110;
                int i411111111111 = i18;
                chatMessageOld.url = cursor.getString(i411111111111);
                i18 = i411111111111;
                int i411111111112 = i17;
                chatMessageOld.description = cursor.getString(i411111111112);
                i17 = i411111111112;
                int i411111111113 = i16;
                chatMessageOld.duration = cursor.getInt(i411111111113);
                i16 = i411111111113;
                int i411111111114 = i15;
                chatMessageOld.msgstatus = cursor.getInt(i411111111114);
                i15 = i411111111114;
                int i411111111115 = columnIndexOrThrow15;
                chatMessageOld.filename = cursor.getString(i411111111115);
                columnIndexOrThrow15 = i411111111115;
                int i411111111116 = columnIndexOrThrow16;
                chatMessageOld.isRead = cursor.getInt(i411111111116);
                columnIndexOrThrow16 = i411111111116;
                int i411111111117 = columnIndexOrThrow17;
                chatMessageOld.uid = cursor.getString(i411111111117);
                i14 = columnIndexOrThrow18;
                if (cursor.getInt(i14) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                columnIndexOrThrow18 = i14;
                chatMessageOld.isWarn = z;
                chatMessageOld.gif = gif;
                chatMessageOld.shareRoom = shareRoom;
                chatMessageOld.shareMoment = shareMoment;
                chatMessageOld.shareTopic = shareTopic;
                chatMessageOld.shareUser = shareUser;
                arrayList = arrayList2;
                arrayList.add(chatMessageOld);
                columnIndexOrThrow17 = i411111111117;
                columnIndexOrThrow28 = i5;
                columnIndexOrThrow27 = columnIndexOrThrow27;
                columnIndexOrThrow31 = i7;
                columnIndexOrThrow30 = i10;
                columnIndexOrThrow34 = i4;
                columnIndexOrThrow35 = i6;
                columnIndexOrThrow26 = columnIndexOrThrow26;
                columnIndexOrThrow22 = columnIndexOrThrow22;
                columnIndexOrThrow36 = columnIndexOrThrow36;
                columnIndexOrThrow37 = i8;
                columnIndexOrThrow40 = i3111111111118;
                columnIndexOrThrow39 = i3111111111111;
                columnIndexOrThrow38 = i9;
                columnIndexOrThrow21 = columnIndexOrThrow21;
                i28 = i13;
                columnIndexOrThrow20 = columnIndexOrThrow20;
                i29 = i2;
                i22 = i3111111111117;
                i27 = i3111111111110;
                columnIndexOrThrow24 = columnIndexOrThrow24;
                i21 = i3111111111119;
                i20 = i41111111119;
                columnIndexOrThrow25 = columnIndexOrThrow25;
                i25 = i3111111111114;
                columnIndexOrThrow29 = i3;
                columnIndexOrThrow33 = i3111111111113;
                i26 = i3111111111112;
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

    public static ArrayList OooO0Oo(Cursor cursor) {
        try {
            int columnIndexOrThrow = cursor.getColumnIndexOrThrow("standbytwo");
            int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("userid");
            int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("mid");
            int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("state");
            int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow(ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
            int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow("time");
            int columnIndexOrThrow7 = cursor.getColumnIndexOrThrow("isRead");
            ArrayList arrayList = new ArrayList(cursor.getCount());
            while (cursor.moveToNext()) {
                NewFriendsOld newFriendsOld = new NewFriendsOld();
                if (!cursor.isNull(columnIndexOrThrow)) {
                    newFriendsOld.standbytwo = cursor.getString(columnIndexOrThrow);
                    newFriendsOld.userid = cursor.getString(columnIndexOrThrow2);
                    newFriendsOld.mid = cursor.getString(columnIndexOrThrow3);
                    newFriendsOld.state = cursor.getString(columnIndexOrThrow4);
                    newFriendsOld.message = cursor.getString(columnIndexOrThrow5);
                    newFriendsOld.time = cursor.getLong(columnIndexOrThrow6);
                    boolean z = true;
                    if (cursor.getInt(columnIndexOrThrow7) != 1) {
                        z = false;
                    }
                    newFriendsOld.isRead = z;
                }
                arrayList.add(newFriendsOld);
            }
            CloseableKt.closeFinally(cursor, null);
            return arrayList;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(cursor, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0346  */
    public static void OooO0o(SupportSQLiteDatabase supportSQLiteDatabase, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(CollectionsKt.OooO0oo(arrayList));
        Iterator it = arrayList.iterator();
        while (true) {
            String str = "";
            if (!it.hasNext()) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    supportSQLiteDatabase.insert("ChatMessageTable", 5, (ContentValues) it2.next());
                }
                ArrayList arrayList3 = new ArrayList(CollectionsKt.OooO0oo(arrayList));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ChatMessageOld chatMessageOld = (ChatMessageOld) it3.next();
                    long jOooO = o0OoOo0.OooO(0L, chatMessageOld.uid);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("uid", Long.valueOf(jOooO));
                    long j = chatMessageOld.from;
                    if (j == jOooO) {
                        j = chatMessageOld.to;
                    }
                    contentValues.put("targetId", Long.valueOf(j));
                    contentValues.put("mid", chatMessageOld.mid);
                    contentValues.put("sendState", Integer.valueOf(chatMessageOld.msgstatus));
                    contentValues.put(ShareConstants.WEB_DIALOG_PARAM_TITLE, "");
                    String str2 = chatMessageOld.msg;
                    if (str2 == null) {
                        str2 = "";
                    } else {
                        Intrinsics.checkNotNull(str2);
                    }
                    contentValues.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, str2);
                    int i = chatMessageOld.type;
                    if (i == 2103) {
                        i = 1;
                    } else if (i == 2105) {
                        i = 5;
                    } else if (i == 2109) {
                        i = 2;
                    } else if (i == 2115) {
                        i = 3;
                    } else if (i != 2124) {
                        switch (i) {
                            case 2119:
                                i = 4;
                                break;
                            case 2120:
                                i = 6;
                                break;
                            case 2121:
                                i = 7;
                                break;
                            case 2122:
                                i = 8;
                                break;
                        }
                    } else {
                        i = 6;
                    }
                    contentValues.put("type", Integer.valueOf(i));
                    contentValues.put("unReadCount", (Integer) 0);
                    contentValues.put("draft", "");
                    contentValues.put("time", Long.valueOf(chatMessageOld.time));
                    contentValues.put("topTime", (Integer) 0);
                    contentValues.put("isVoiceAndUnread", Boolean.valueOf(chatMessageOld.isRead == 1));
                    contentValues.put("isAcceptMsg", Boolean.valueOf(chatMessageOld.to == jOooO));
                    arrayList3.add(contentValues);
                }
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    supportSQLiteDatabase.insert("ConversationTable", 5, (ContentValues) it4.next());
                }
                return;
            }
            ChatMessageOld chatMessageOld2 = (ChatMessageOld) it.next();
            long jOooO2 = o0OoOo0.OooO(0L, chatMessageOld2.uid);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("uid", chatMessageOld2.uid);
            contentValues2.put("mid", chatMessageOld2.mid);
            long j2 = chatMessageOld2.from;
            if (j2 == jOooO2) {
                j2 = chatMessageOld2.to;
            }
            contentValues2.put("targetId", Long.valueOf(j2));
            String str3 = chatMessageOld2.msg;
            if (str3 == null) {
                str3 = "";
            } else {
                Intrinsics.checkNotNull(str3);
            }
            contentValues2.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, str3);
            contentValues2.put("time", Long.valueOf(chatMessageOld2.time));
            contentValues2.put("sendState", Integer.valueOf(chatMessageOld2.msgstatus));
            contentValues2.put("isWarn", Boolean.valueOf(chatMessageOld2.isWarn));
            contentValues2.put("isAcceptMsg", Boolean.valueOf(chatMessageOld2.to == jOooO2));
            int i2 = chatMessageOld2.type;
            if (i2 == 2103) {
                contentValues2.put("contentType", (Integer) 1);
            } else if (i2 == 2105) {
                contentValues2.put("contentType", (Integer) 5);
                contentValues2.put("giftId", Long.valueOf(chatMessageOld2.giftid));
                contentValues2.put("giftNumber", Integer.valueOf(chatMessageOld2.number));
                contentValues2.put("giftUrl", "");
            } else if (i2 == 2109) {
                contentValues2.put("contentType", (Integer) 2);
                String str4 = chatMessageOld2.url;
                if (str4 == null) {
                    str4 = "";
                } else {
                    Intrinsics.checkNotNull(str4);
                }
                contentValues2.put("voiceUrl", str4);
                contentValues2.put("voiceDuration", Integer.valueOf(chatMessageOld2.duration));
                String str5 = chatMessageOld2.filename;
                if (str5 != null) {
                    Intrinsics.checkNotNull(str5);
                    str = str5;
                }
                contentValues2.put("voiceFileName", str);
                contentValues2.put("isVoiceRead", Boolean.valueOf(chatMessageOld2.isRead == 1));
            } else if (i2 == 2115) {
                contentValues2.put("contentType", (Integer) 3);
                contentValues2.put("emoticonType", Long.valueOf(chatMessageOld2.giftid));
                contentValues2.put("emoticonValue", chatMessageOld2.msg);
                contentValues2.put("emoticonIsRead", Boolean.valueOf(chatMessageOld2.isRead == 1));
            } else if (i2 != 2124) {
                switch (i2) {
                    case 2119:
                        contentValues2.put("contentType", (Integer) 4);
                        contentValues2.put("gifId", Integer.valueOf(chatMessageOld2.gif.gifId));
                        contentValues2.put("gifUrl", chatMessageOld2.gif.gifUrl);
                        break;
                    case 2120:
                        contentValues2.put("contentType", (Integer) 6);
                        contentValues2.put("roomHeader", chatMessageOld2.shareRoom.roomHeader);
                        contentValues2.put("roomName", chatMessageOld2.shareRoom.roomName);
                        contentValues2.put(ContributionFragment.ARG_1, Long.valueOf(chatMessageOld2.shareRoom.roomId));
                        contentValues2.put("roomIdx", chatMessageOld2.shareRoom.roomIdx);
                        contentValues2.put("roomIp", chatMessageOld2.shareRoom.roomIp);
                        break;
                    case 2121:
                        contentValues2.put("contentType", (Integer) 7);
                        contentValues2.put("momentId", Long.valueOf(chatMessageOld2.shareMoment.momentId));
                        contentValues2.put("momentImage", chatMessageOld2.shareMoment.image);
                        contentValues2.put("momentText", chatMessageOld2.shareMoment.text);
                        contentValues2.put("momentMsg", chatMessageOld2.shareMoment.msg);
                        break;
                    case 2122:
                        contentValues2.put("contentType", (Integer) 8);
                        contentValues2.put("topicId", Long.valueOf(chatMessageOld2.shareTopic.circleId));
                        contentValues2.put("topicImage", chatMessageOld2.shareTopic.image);
                        contentValues2.put("topicName", chatMessageOld2.shareTopic.name);
                        contentValues2.put("topicUserCount", Integer.valueOf(chatMessageOld2.shareTopic.userCount));
                        contentValues2.put("topicMomentCount", Integer.valueOf(chatMessageOld2.shareTopic.momentCount));
                        contentValues2.put("topicMsg", chatMessageOld2.shareTopic.msg);
                        break;
                }
            } else {
                contentValues2.put("contentType", (Integer) 9);
                contentValues2.put("shareUserId", Long.valueOf(chatMessageOld2.shareUser.id));
                contentValues2.put("shareUserIdx", Long.valueOf(chatMessageOld2.shareUser.idx));
                contentValues2.put("shareUserHead", chatMessageOld2.shareUser.head);
                contentValues2.put("shareUserName", chatMessageOld2.shareUser.name);
                contentValues2.put("shareUserMessage", chatMessageOld2.shareUser.msg);
            }
            arrayList2.add(contentValues2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    public static void OooO0o0(SupportSQLiteDatabase supportSQLiteDatabase, ArrayList arrayList) {
        int i;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.OooO0oo(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            NewFriendsOld newFriendsOld = (NewFriendsOld) it.next();
            ContentValues contentValues = new ContentValues();
            contentValues.put("uid", newFriendsOld.standbytwo);
            contentValues.put("targetUserId", newFriendsOld.userid);
            contentValues.put("mid", newFriendsOld.mid);
            String state = newFriendsOld.state;
            Intrinsics.checkNotNullExpressionValue(state, "state");
            switch (state.hashCode()) {
                case -934813676:
                    if (!state.equals(NewFriendsOld.State_Refuse)) {
                        i = 0;
                    } else {
                        i = 2;
                    }
                    break;
                case 108960:
                    state.equals(NewFriendsOld.State_New);
                    i = 0;
                    break;
                case 92762796:
                    if (!state.equals(NewFriendsOld.State_Agree)) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    break;
                case 1544803905:
                    if (!state.equals(NewFriendsOld.State_Default)) {
                        i = 0;
                    } else {
                        i = -1;
                    }
                    break;
                default:
                    i = 0;
                    break;
            }
            contentValues.put("state", Integer.valueOf(i));
            contentValues.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, newFriendsOld.message);
            contentValues.put("time", Long.valueOf(newFriendsOld.time));
            contentValues.put("isRead", Boolean.valueOf(newFriendsOld.isRead));
            arrayList2.add(contentValues);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            supportSQLiteDatabase.insert("FriendRequestMessageTable", 5, (ContentValues) it2.next());
        }
    }

    public static Cursor OooO0oO(w3 w3Var, SupportSQLiteDatabase supportSQLiteDatabase, String str, long j) {
        w3Var.getClass();
        return supportSQLiteDatabase.query("SELECT * FROM " + str + " LIMIT " + j + ",500");
    }

    @Override // p109o000ooo.o00O0OO0
    public final void OooO00o(@NotNull SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.beginTransaction();
        try {
            database.execSQL("CREATE TABLE IF NOT EXISTS `SimpleMessageTable` (`uid` INTEGER NOT NULL, `type` INTEGER NOT NULL, `time` INTEGER NOT NULL, `content` TEXT, `activityNum` INTEGER, `fansNum` INTEGER, `visitorNum` INTEGER, PRIMARY KEY(`uid`, `type`))");
            database.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_SimpleMessageTable_uid_type` ON `SimpleMessageTable` (`uid`, `type`)");
            database.execSQL("CREATE TABLE IF NOT EXISTS `FriendTable` (`uid` INTEGER NOT NULL, `friendId` INTEGER NOT NULL, `memoName` TEXT, `time` INTEGER NOT NULL, `inRoom` INTEGER NOT NULL, `deleteMark` INTEGER NOT NULL, `isCheckUserRisk` INTEGER NOT NULL, PRIMARY KEY(`uid`, `friendId`))");
            database.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_FriendTable_uid_friendId` ON `FriendTable` (`uid`, `friendId`)");
            database.execSQL("DROP TABLE IF EXISTS `UserInfoTable` ");
            database.execSQL("CREATE TABLE IF NOT EXISTS `UserInfoTable` (`userId` INTEGER NOT NULL, `userIdx` TEXT NOT NULL, `idLevel` INTEGER NOT NULL, `userName` TEXT NOT NULL, `userAvatar` TEXT NOT NULL, `userFrame` TEXT, `background` TEXT, `userLevel` INTEGER NOT NULL, `gender` INTEGER NOT NULL, `bio` TEXT, `birthday` TEXT NOT NULL, `age` INTEGER NOT NULL, `countryId` INTEGER NOT NULL, `region` INTEGER NOT NULL, `medal` TEXT, `visitorNum` INTEGER NOT NULL, `followedNum` INTEGER NOT NULL, `fansNum` INTEGER NOT NULL, `joinRoomNum` INTEGER NOT NULL, `role` INTEGER NOT NULL, `regTime` INTEGER NOT NULL, `tags` TEXT NOT NULL, `vip` INTEGER NOT NULL, `vipLevel` INTEGER NOT NULL, PRIMARY KEY(`userId`))");
            database.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_UserInfoTable_userId` ON `UserInfoTable` (`userId`)");
            database.execSQL("CREATE TABLE IF NOT EXISTS `MomentMessageTable` (`uid` INTEGER NOT NULL, `mid` TEXT NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `type` INTEGER NOT NULL, `userId_MomentPraise` INTEGER, `userNickName_MomentPraise` TEXT, `userHeadUrl_MomentPraise` TEXT, `momentId_MomentPraise` INTEGER, `momentImageUrl_MomentPraise` TEXT, `momentContent_MomentPraise` TEXT, `userId_CommentPraise` INTEGER, `userNickName_CommentPraise` TEXT, `userHeadUrl_CommentPraise` TEXT, `momentId_CommentPraise` INTEGER, `momentImageUrl_CommentPraise` TEXT, `momentContent_CommentPraise` TEXT, `userId_MomentComment` INTEGER, `userNickName_MomentComment` TEXT, `userHeadUrl_MomentComment` TEXT, `momentId_MomentComment` INTEGER, `momentImageUrl_MomentComment` TEXT, `momentContent_MomentComment` TEXT, `commentId_MomentComment` INTEGER, `commentContent_MomentComment` TEXT, `userId_CommentReply` INTEGER, `userNickName_CommentReply` TEXT, `userHeadUrl_CommentReply` TEXT, `momentId_CommentReply` INTEGER, `momentImageUrl_CommentReply` TEXT, `momentContent_CommentReply` TEXT, `commentId_CommentReply` INTEGER, `commentContent_CommentReply` TEXT, `replyId_CommentReply` INTEGER, `replyContent_CommentReply` TEXT, `userId_MomentAt` INTEGER, `userNickName_MomentAt` TEXT, `userHeadUrl_MomentAt` TEXT, `momentId_MomentAt` INTEGER, `momentImageUrl_MomentAt` TEXT, `momentContent_MomentAt` TEXT, `userId_CommentAt` INTEGER, `userNickName_CommentAt` TEXT, `userHeadUrl_CommentAt` TEXT, `momentId_CommentAt` INTEGER, `momentImageUrl_CommentAt` TEXT, `momentContent_CommentAt` TEXT, `commentId_CommentAt` INTEGER, `commentContent_CommentAt` TEXT, `userId_MomentGift` INTEGER, `userNickName_MomentGift` TEXT, `userHeadUrl_MomentGift` TEXT, `momentId_MomentGift` INTEGER, `momentImageUrl_MomentGift` TEXT, `giftNum_MomentGift` INTEGER, `giftImage_MomentGift` TEXT, `userId_CommentReward` INTEGER, `userNickName_CommentReward` TEXT, `userHeadUrl_CommentReward` TEXT, `momentId_CommentReward` INTEGER, `momentImageUrl_CommentReward` TEXT, `commentId_CommentReward` INTEGER, `commentContent_CommentReward` TEXT, `userId_ReplyReward` INTEGER, `userNickName_ReplyReward` TEXT, `userHeadUrl_ReplyReward` TEXT, `momentId_ReplyReward` INTEGER, `momentImageUrl_ReplyReward` TEXT, `commentId_ReplyReward` INTEGER, `commentContent_ReplyReward` TEXT, `momentId_MomentFeatured` INTEGER, `momentImageUrl_MomentFeatured` TEXT, `momentId_CommentFeatured` INTEGER, `momentImageUrl_CommentFeatured` TEXT, `momentContent_CommentFeatured` TEXT, `commentId_CommentFeatured` INTEGER, `userId_MomentTopicTop` INTEGER, `userHeadUrl_MomentTopicTop` TEXT, `momentImageUrl_MomentTopicTop` TEXT, `topicId_MomentTopicTop` INTEGER, `topicName_MomentTopicTop` TEXT, `userId_MomentTopicTopRevoke` INTEGER, `userHeadUrl_MomentTopicTopRevoke` TEXT, `momentImageUrl_MomentTopicTopRevoke` TEXT, `topicId_MomentTopicTopRevoke` INTEGER, `topicName_MomentTopicTopRevoke` TEXT, `userId_MomentTopicRemoveOwner` INTEGER, `userHeadUrl_MomentTopicRemoveOwner` TEXT, `momentImageUrl_MomentTopicRemoveOwner` TEXT, `momentId_MomentTopicRemoveOwner` INTEGER, `topicName_MomentTopicRemoveOwner` TEXT, `userId_MomentTopicRemoveAdmin` INTEGER, `userHeadUrl_MomentTopicRemoveAdmin` TEXT, `momentImageUrl_MomentTopicRemoveAdmin` TEXT, `momentId_MomentTopicRemoveAdmin` INTEGER, `topicName_MomentTopicRemoveAdmin` TEXT, `momentId_MomentSystemRemove` INTEGER, `momentImageUrl_MomentSystemRemove` TEXT, `deleteType_MomentSystemRemove` INTEGER, `commentId_CommentSystemRemove` INTEGER, `commentContent_CommentSystemRemove` TEXT, `deleteType_CommentSystemRemove` INTEGER, `deleteContent_CommentSystemRemove` TEXT, `momentId_MomentReportFeedback` INTEGER, `momentImageUrl_MomentReportFeedback` TEXT, `momentContent_MomentReportFeedback` TEXT, `commentId_CommentReportFeedback` INTEGER, `commentContent_CommentReportFeedback` TEXT, `momentImageUrl_CommentReportFeedback` TEXT, `topicUserId_TopicCreateSuccess` INTEGER, `topicId_TopicCreateSuccess` INTEGER, `topicName_TopicCreateSuccess` TEXT, `message_TopicCreateSuccess` TEXT, `topicUserId_TopicCreateFail` INTEGER, `topicId_TopicCreateFail` INTEGER, `topicName_TopicCreateFail` TEXT, `message_TopicCreateFail` TEXT, `failType_TopicCreateFail` INTEGER, `topicUserId_TopicCreateDisband` INTEGER, `topicId_TopicCreateDisband` INTEGER, `topicName_TopicCreateDisband` TEXT, `message_TopicCreateDisband` TEXT, `disbandContent_TopicCreateDisband` INTEGER, `topicId_TopicMemberAdd` INTEGER, `content_TopicMemberAdd` TEXT, PRIMARY KEY(`uid`, `mid`))");
            database.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_MomentMessageTable_uid_mid` ON `MomentMessageTable` (`uid`, `mid`)");
            database.execSQL("CREATE TABLE IF NOT EXISTS `SystemMessageTable` (`mid` TEXT NOT NULL, `type` INTEGER NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `uid` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `vipLevel` INTEGER, `joinTopicId` INTEGER, `topicType` INTEGER, `topicId` INTEGER, `topicName` TEXT, `topicFailType` INTEGER, `userUpLevel` INTEGER, `userUpCoin` INTEGER, `userUpCrystal` INTEGER, `roomUpLevel` INTEGER, `roomWageCoin` INTEGER, `aristocracyBuyType` INTEGER, `aristocracyLevel` INTEGER, `uniqueIdExpirationTime` INTEGER, `consumerRebateCoin` INTEGER, `unlockAvatarFrameUrl` TEXT, `subscribeRewardCoin` INTEGER, `medalLevel` INTEGER, `medalId` INTEGER, PRIMARY KEY(`uid`, `mid`))");
            database.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_SystemMessageTable_uid_mid` ON `SystemMessageTable` (`uid`, `mid`)");
            database.execSQL("CREATE TABLE IF NOT EXISTS `FriendRequestMessageTable` (`uid` INTEGER NOT NULL, `targetUserId` INTEGER NOT NULL, `mid` TEXT, `state` INTEGER NOT NULL, `message` TEXT, `time` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, PRIMARY KEY(`uid`, `targetUserId`))");
            database.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_FriendRequestMessageTable_uid_targetUserId` ON `FriendRequestMessageTable` (`uid`, `targetUserId`)");
            database.execSQL("CREATE TABLE IF NOT EXISTS `YallaTeamMessageTable` (`uid` INTEGER NOT NULL, `mid` TEXT NOT NULL, `type` INTEGER NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, PRIMARY KEY(`uid`, `mid`))");
            database.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_YallaTeamMessageTable_uid_mid` ON `YallaTeamMessageTable` (`uid`, `mid`)");
            database.execSQL("CREATE TABLE IF NOT EXISTS `ConversationTable` (`uid` INTEGER NOT NULL, `targetId` INTEGER NOT NULL, `mid` TEXT NOT NULL, `sendState` INTEGER NOT NULL, `title` TEXT NOT NULL, `message` TEXT NOT NULL, `type` INTEGER NOT NULL, `unReadCount` INTEGER NOT NULL, `draft` TEXT NOT NULL, `time` INTEGER NOT NULL, `topTime` INTEGER NOT NULL, `isVoiceAndUnread` INTEGER NOT NULL, `isAcceptMsg` INTEGER NOT NULL, PRIMARY KEY(`targetId`, `uid`))");
            database.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_ConversationTable_uid_targetId` ON `ConversationTable` (`uid`, `targetId`)");
            database.execSQL("CREATE TABLE IF NOT EXISTS `ChatMessageTable` (`uid` INTEGER NOT NULL, `mid` TEXT NOT NULL, `targetId` INTEGER NOT NULL, `contentType` INTEGER NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `sendState` INTEGER NOT NULL, `isWarn` INTEGER NOT NULL, `isAcceptMsg` INTEGER NOT NULL, `voiceUrl` TEXT, `voiceDuration` INTEGER, `voiceFileName` TEXT, `isVoiceRead` INTEGER, `emoticonType` INTEGER, `emoticonValue` INTEGER, `emoticonIsRead` INTEGER, `giftId` INTEGER, `giftNumber` INTEGER,`giftUrl` TEXT, `gifId` INTEGER, `gifUrl` TEXT, `roomHeader` TEXT, `roomName` TEXT, `roomId` INTEGER, `roomIdx` INTEGER, `roomIp` TEXT, `momentId` INTEGER, `momentImage` TEXT, `momentText` TEXT, `momentMsg` TEXT, `topicId` INTEGER, `topicImage` TEXT, `topicName` TEXT, `topicUserCount` INTEGER, `topicMomentCount` INTEGER, `topicMsg` TEXT, `shareUserId` INTEGER, `shareUserIdx` INTEGER, `shareUserHead` TEXT, `shareUserName` TEXT, `shareUserMessage` TEXT, `activityImage` TEXT, `activityText1` TEXT, `activityText2` TEXT, `activityMsg` TEXT, `activityUrl` TEXT, PRIMARY KEY(`uid`, `mid`))");
            database.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_ChatMessageTable_uid_mid` ON `ChatMessageTable` (`uid`, `mid`)");
            long jOooO0O0 = OooO0O0(database, "ChatMessage");
            if (jOooO0O0 > 0) {
                LongProgression longProgressionStep = RangesKt___RangesKt.step(RangesKt___RangesKt.until(0, jOooO0O0), 500L);
                long first = longProgressionStep.getFirst();
                long last = longProgressionStep.getLast();
                long step = longProgressionStep.getStep();
                if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                    while (true) {
                        OooO0o(database, OooO0OO(OooO0oO(this, database, "ChatMessage", first)));
                        if (first == last) {
                            break;
                        } else {
                            first += step;
                        }
                    }
                }
            }
            long jOooO0O1 = OooO0O0(database, "NewFriendsTable");
            if (jOooO0O1 > 0) {
                LongProgression longProgressionStep2 = RangesKt___RangesKt.step(RangesKt___RangesKt.until(0, jOooO0O1), 500L);
                long first2 = longProgressionStep2.getFirst();
                long last2 = longProgressionStep2.getLast();
                long step2 = longProgressionStep2.getStep();
                if ((step2 > 0 && first2 <= last2) || (step2 < 0 && last2 <= first2)) {
                    while (true) {
                        OooO0o0(database, OooO0Oo(OooO0oO(this, database, "NewFriendsTable", first2)));
                        if (first2 == last2) {
                            break;
                        } else {
                            first2 += step2;
                        }
                    }
                }
            }
            long jOooO0O2 = OooO0O0(database, "CommentNotice");
            if (jOooO0O2 > 0) {
                LongProgression longProgressionStep3 = RangesKt___RangesKt.step(RangesKt___RangesKt.until(0, jOooO0O2), 500L);
                long first3 = longProgressionStep3.getFirst();
                long last3 = longProgressionStep3.getLast();
                long step3 = longProgressionStep3.getStep();
                if ((step3 > 0 && first3 <= last3) || (step3 < 0 && last3 <= first3)) {
                    while (true) {
                        y3.OooO0O0(database, y3.OooO00o(OooO0oO(this, database, "CommentNotice", first3)));
                        if (first3 == last3) {
                            break;
                        } else {
                            first3 += step3;
                        }
                    }
                }
            }
            database.setTransactionSuccessful();
        } finally {
            database.endTransaction();
        }
    }
}
