package com.yalla.yalla.common.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.yalla.yalla.common.db.table.ChatMessage;
import com.yalla.yalla.common.db.table.Conversation;
import com.yalla.yalla.common.db.table.DraftMessage;
import com.yalla.yalla.common.db.table.Friend;
import com.yalla.yalla.common.db.table.FriendRequestMessage;
import com.yalla.yalla.common.db.table.MomentMessage;
import com.yalla.yalla.common.db.table.PayOrder;
import com.yalla.yalla.common.db.table.SimpleMessage;
import com.yalla.yalla.common.db.table.SquareEventRoom;
import com.yalla.yalla.common.db.table.SystemMessage;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.db.table.YallaTeamMessage;
import com.yalla.yalla.data.db.model.ApiErrorCodeDB;
import com.yalla.yalla.data.db.model.BillingOrder;
import com.yalla.yalla.data.db.model.BuriedPoint;
import com.yalla.yalla.data.db.model.ChatMessageOld;
import com.yalla.yalla.data.db.model.CommentNoticeOld;
import com.yalla.yalla.data.db.model.FriendsTableOld;
import com.yalla.yalla.data.db.model.MessageRecord;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.data.db.model.NewFans;
import com.yalla.yalla.data.db.model.NewFriendsOld;
import com.yalla.yalla.data.db.model.NewVisitor;
import com.yalla.yalla.data.db.model.ReadPostTable;
import com.yalla.yalla.data.db.model.RoomHistory;
import com.yalla.yalla.data.db.model.RoomJoinHistory;
import com.yalla.yalla.data.db.model.RoomTheme;
import com.yalla.yalla.data.db.model.SearchHistoryTable;
import com.yalla.yalla.data.db.model.SystemMessageOld;
import com.yalla.yalla.data.db.model.TopicRecentTable;
import com.yalla.yalla.data.db.model.UserRecord;
import p492o0o00O0.OooOOO;
import p492o0o00O0.OooOo00;
import p492o0o00O0.Oooo0;
import p492o0o00O0.o000000;
import p492o0o00O0.o00oO0o;
import p492o0o00O0.o0O0O00;
import p492o0o00O0.o0OO00O;
import p492o0o00O0.o0OOO0o;
import p519o0o0O00O.o0000;
import p519o0o0O00O.o000000O;
import p519o0o0O00O.o00000O0;
import p519o0o0O00O.o00000OO;
import p519o0o0O00O.o0000O0O;
import p519o0o0O00O.o0000oo;
import p519o0o0O00O.o00Ooo;
import p519o0o0O00O.o0Oo0oo;
import p519o0o0O00O.o0OoOo0;
import p519o0o0O00O.o0ooOOo;
import p519o0o0O00O.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
@Database(entities = {MessageRecord.class, ChatMessageOld.class, UserRecord.class, SystemMessageOld.class, CommentNoticeOld.class, FriendsTableOld.class, NewFriendsOld.class, NewFans.class, NewVisitor.class, DraftMessage.class, MusicTable.class, SearchHistoryTable.class, RoomHistory.class, RoomJoinHistory.class, RoomTheme.class, ApiErrorCodeDB.class, ReadPostTable.class, TopicRecentTable.class, BillingOrder.class, UserInfo.class, Conversation.class, ChatMessage.class, YallaTeamMessage.class, SystemMessage.class, Friend.class, FriendRequestMessage.class, SimpleMessage.class, MomentMessage.class, PayOrder.class, SquareEventRoom.class, BuriedPoint.class}, version = 37)
public abstract class YlAppDataBase extends RoomDatabase {
    public abstract OooOOO OooOOo();

    public abstract o0OoOo0 OooOOo0();

    public abstract OooOo00 OooOOoo();

    public abstract o0OOO0o OooOo();

    public abstract o0ooOOo OooOo0();

    public abstract Oooo0 OooOo00();

    public abstract o0Oo0oo OooOo0O();

    public abstract o00Ooo OooOo0o();

    public abstract oo0o0Oo OooOoO();

    public abstract p492o0o00O0.o0OoOo0 OooOoO0();

    public abstract p492o0o00O0.o00Ooo OooOoOO();

    public abstract o00000O0 OooOoo();

    public abstract o000000O OooOoo0();

    public abstract o00000OO OooOooO();

    public abstract o0000 OooOooo();

    public abstract o0000O0O Oooo0();

    public abstract o0000oo Oooo000();

    public abstract o00oO0o Oooo00O();

    public abstract o0OO00O Oooo00o();

    public abstract o0O0O00 Oooo0O0();

    public abstract o000000 Oooo0OO();
}
