package com.yalla.yalla.data.db.model;

import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.facebook.AccessToken;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes4.dex */
@Entity(indices = {@Index(unique = true, value = {"midx"})}, tableName = "ChatMessage")
@Deprecated
public class ChatMessageOld {

    @ColumnInfo(name = "description")
    public String description;

    @ColumnInfo(name = "duration")
    public int duration;

    @ColumnInfo(name = "filename")
    public String filename;

    @ColumnInfo(name = "fromid")
    public long from;

    @Embedded
    public Gif gif;

    @ColumnInfo(name = "giftid")
    public long giftid;

    @PrimaryKey(autoGenerate = true)
    public Integer id;

    @ColumnInfo(name = "isread")
    public int isRead;

    @ColumnInfo(name = "warn")
    public boolean isWarn;

    @ColumnInfo(name = "ltime")
    public long localtime;

    @ColumnInfo(name = "midx")
    public String mid;

    @ColumnInfo(name = "msg")
    public String msg;

    @ColumnInfo(name = "msgstatus")
    public int msgstatus;

    @ColumnInfo(name = "number")
    public int number;

    @Embedded
    public ShareMoment shareMoment;

    @Embedded
    public ShareRoom shareRoom;

    @Embedded
    public ShareTopic shareTopic;

    @Embedded
    public ShareUser shareUser;

    @ColumnInfo(name = "time")
    public long time;

    @ColumnInfo(name = "toid")
    public long to;

    @ColumnInfo(name = "type")
    public int type;

    @ColumnInfo(name = "uid")
    public String uid;

    @ColumnInfo(name = "url")
    public String url;

    public static class Gif {

        @ColumnInfo(name = "gif_id")
        public int gifId;

        @ColumnInfo(name = "gif_url")
        public String gifUrl;
    }

    public static class ShareMoment {

        @ColumnInfo(name = "moment_image")
        public String image;

        @ColumnInfo(name = "moment_id")
        public long momentId;

        @ColumnInfo(name = "moment_msg")
        public String msg;

        @ColumnInfo(name = "moment_text")
        public String text;
    }

    public static class ShareRoom {

        @ColumnInfo(name = "room_head")
        public String roomHeader;

        @ColumnInfo(name = "room_id")
        public long roomId;

        @ColumnInfo(name = "room_idx")
        public String roomIdx;

        @ColumnInfo(name = "room_ip")
        public String roomIp;

        @ColumnInfo(name = "room_name")
        public String roomName;
    }

    public static class ShareTopic {

        @ColumnInfo(name = "topic_id")
        public long circleId;

        @ColumnInfo(name = "topic_image")
        public String image;

        @ColumnInfo(name = "topic_momentCount")
        public int momentCount;

        @ColumnInfo(name = "topic_msg")
        public String msg;

        @ColumnInfo(name = "topic_name")
        public String name;

        @ColumnInfo(name = "topic_userCount")
        public int userCount;
    }

    public static class ShareUser {

        @ColumnInfo(name = "user_head")
        public String head;

        @ColumnInfo(name = AccessToken.USER_ID_KEY)
        public long id;

        @ColumnInfo(name = "user_idx")
        public long idx;

        @ColumnInfo(name = "user_msg")
        public String msg;

        @ColumnInfo(name = "user_name")
        public String name;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChatMessage{mid='");
        sb.append(this.mid);
        sb.append("', msg='");
        sb.append(this.msg);
        sb.append("', uid='");
        return o0oOO.OooO0O0(sb, this.uid, "'}");
    }
}
