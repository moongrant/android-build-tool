package com.yalla.yalla.data.db.model;

import OooO00o.OooO00o;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.app.base.adapter.message.MessageModelHeadType;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.share.internal.ShareConstants;

/* JADX INFO: loaded from: classes2.dex */
@Entity(indices = {@Index(unique = true, value = {"midx", "fromid"})})
@Deprecated
public class MessageRecord {

    @ColumnInfo(name = "dtime")
    public long dtime;

    @ColumnInfo(name = "fromid")
    public long fromid;

    @Ignore
    private MessageModelHeadType headType;

    @ColumnInfo(name = "headframeurl")
    public String headframeurl;

    @ColumnInfo(name = "headphoto")
    public String headphoto;

    @PrimaryKey(autoGenerate = true)
    public Integer id;

    @ColumnInfo(name = "isread")
    public int isRead;

    @ColumnInfo(name = "isTop")
    @Deprecated
    public int isTop;

    @ColumnInfo(name = "isTopTime")
    public long isTopTime;

    @ColumnInfo(name = "level")
    public int level;

    @ColumnInfo(name = "ltime")
    public long localtime;

    @ColumnInfo(name = ShareConstants.WEB_DIALOG_PARAM_MESSAGE)
    public String message;

    @ColumnInfo(name = "midx")
    public String mid;

    @ColumnInfo(name = "msgstatus")
    public int msgstatus;

    @ColumnInfo(name = "role")
    public int role;

    @ColumnInfo(name = "scount")
    public int scount;

    @ColumnInfo(name = AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS)
    public int status = 0;

    @ColumnInfo(name = ShareConstants.WEB_DIALOG_PARAM_TITLE)
    public String title;

    @ColumnInfo(name = "toid")
    public long to;

    @ColumnInfo(name = "type")
    public int type;

    public MessageRecord() {
    }

    public MessageModelHeadType getHeadType() {
        return this.headType;
    }

    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("MessageRecord{id=");
        sbOooO0o0.append(this.id);
        sbOooO0o0.append(", mid='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.mid, '\'', ", title='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.title, '\'', ", message='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.message, '\'', ", type=");
        sbOooO0o0.append(this.type);
        sbOooO0o0.append(", headphoto='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.headphoto, '\'', ", scount=");
        sbOooO0o0.append(this.scount);
        sbOooO0o0.append(", fromid=");
        sbOooO0o0.append(this.fromid);
        sbOooO0o0.append(", to=");
        sbOooO0o0.append(this.to);
        sbOooO0o0.append(", level=");
        sbOooO0o0.append(this.level);
        sbOooO0o0.append(", isTop=");
        sbOooO0o0.append(this.isTop);
        sbOooO0o0.append(", isTopTime=");
        sbOooO0o0.append(this.isTopTime);
        sbOooO0o0.append(", dtime=");
        sbOooO0o0.append(this.dtime);
        sbOooO0o0.append(", localtime=");
        sbOooO0o0.append(this.localtime);
        sbOooO0o0.append(", status=");
        sbOooO0o0.append(this.status);
        sbOooO0o0.append(", isRead=");
        sbOooO0o0.append(this.isRead);
        sbOooO0o0.append(", msgstatus=");
        sbOooO0o0.append(this.msgstatus);
        sbOooO0o0.append(", role=");
        sbOooO0o0.append(this.role);
        sbOooO0o0.append(", headframeurl='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.headframeurl, '\'', ", headType=");
        sbOooO0o0.append(this.headType);
        sbOooO0o0.append('}');
        return sbOooO0o0.toString();
    }

    public MessageRecord(MessageModelHeadType messageModelHeadType) {
        this.headType = messageModelHeadType;
    }
}
