package com.yalla.yalla.data.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;
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
import com.yalla.yalla.data.db.table.ChatMessage;
import com.yalla.yalla.data.db.table.Conversation;
import com.yalla.yalla.data.db.table.DraftMessage;
import com.yalla.yalla.data.db.table.Friend;
import com.yalla.yalla.data.db.table.FriendRequestMessage;
import com.yalla.yalla.data.db.table.HideContent;
import com.yalla.yalla.data.db.table.MomentMessage;
import com.yalla.yalla.data.db.table.PayOrder;
import com.yalla.yalla.data.db.table.SimpleMessage;
import com.yalla.yalla.data.db.table.SquareEventRoom;
import com.yalla.yalla.data.db.table.SystemMessage;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import p403o0Oo0OOo.o00O00OO;
import p403o0Oo0OOo.o00OOOOo;
import p403o0Oo0OOo.o0O00;
import p403o0Oo0OOo.o0O0O0o0;
import p403o0Oo0OOo.o0O0oo00;
import p403o0Oo0OOo.o0OO00o0;
import p403o0Oo0OOo.o0OOooO0;
import p403o0Oo0OOo.oO0000O;
import p403o0Oo0OOo.oO000Oo0;
import p403o0Oo0OOo.oO00O0oO;
import p403o0Oo0OOo.oO00OOOo;
import p403o0Oo0OOo.oO00Oo0;
import p403o0Oo0OOo.oO0O000;
import p403o0Oo0OOo.oO0O00o0;
import p403o0Oo0OOo.oO0O0Oo0;
import p403o0Oo0OOo.oO0O0OoO;
import p403o0Oo0OOo.oO0OoOO0;
import p403o0Oo0OOo.oO0oO000;
import p403o0Oo0OOo.oOo00ooO;
import p403o0Oo0OOo.oo0o0O0;
import p403o0Oo0OOo.ooo0o;

/* JADX INFO: loaded from: classes4.dex */
@Database(entities = {MessageRecord.class, ChatMessageOld.class, UserRecord.class, SystemMessageOld.class, CommentNoticeOld.class, FriendsTableOld.class, NewFriendsOld.class, NewFans.class, NewVisitor.class, DraftMessage.class, MusicTable.class, SearchHistoryTable.class, RoomHistory.class, RoomJoinHistory.class, RoomTheme.class, ApiErrorCodeDB.class, ReadPostTable.class, TopicRecentTable.class, BillingOrder.class, UserInfo.class, Conversation.class, ChatMessage.class, YallaTeamMessage.class, SystemMessage.class, Friend.class, FriendRequestMessage.class, SimpleMessage.class, MomentMessage.class, PayOrder.class, SquareEventRoom.class, BuriedPoint.class, HideContent.class}, version = 47)
public abstract class YlAppDataBase extends RoomDatabase {
    public abstract o00O00OO OooOOOO();

    public abstract oo0o0O0 OooOOOo();

    public abstract o0O00 OooOOo();

    public abstract o00OOOOo OooOOo0();

    public abstract o0O0O0o0 OooOOoo();

    public abstract oO0000O OooOo();

    public abstract oO0O000 OooOo0();

    public abstract o0O0oo00 OooOo00();

    public abstract o0OO00o0 OooOo0O();

    public abstract o0OOooO0 OooOo0o();

    public abstract oO000Oo0 OooOoO();

    public abstract oO0OoOO0 OooOoO0();

    public abstract oO0O0OoO OooOoOO();

    public abstract oO00OOOo OooOoo();

    public abstract oO00O0oO OooOoo0();

    public abstract oO00Oo0 OooOooO();

    public abstract oOo00ooO OooOooo();

    public abstract oO0oO000 Oooo0();

    public abstract oO0O00o0 Oooo000();

    public abstract oO0O0Oo0 Oooo00O();

    public abstract ooo0o Oooo00o();
}
