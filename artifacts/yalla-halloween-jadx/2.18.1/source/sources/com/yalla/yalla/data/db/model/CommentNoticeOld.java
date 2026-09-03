package com.yalla.yalla.data.db.model;

import OooO00o.OooO00o;
import Oooo000.o000O0;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.android.billingclient.api.o0Oo0oo;
import com.yalla.yalla.model.CommentMessageModel;

/* JADX INFO: loaded from: classes2.dex */
@Entity(indices = {@Index(unique = true, value = {"midx"})}, tableName = "CommentNotice")
@Deprecated
public class CommentNoticeOld {

    @ColumnInfo(name = "cid")
    public long cid;

    @ColumnInfo(name = "circleName")
    public String circleName;

    @ColumnInfo(name = "commentId")
    public long commentId;

    @ColumnInfo(name = "delete_type")
    public int delete_type;

    @ColumnInfo(name = "dyImg")
    public String dyImg;

    @ColumnInfo(name = "form_header")
    public String formHeader;

    @ColumnInfo(name = "form_name")
    public String formName;

    @ColumnInfo(name = "fromUser")
    public String from;

    @ColumnInfo(name = "fromUid")
    public long fromUid;

    @ColumnInfo(name = "gift_id")
    public int giftId;

    @ColumnInfo(name = "gift_image")
    public String giftImage;

    @ColumnInfo(name = "gift_num")
    public int giftNum;

    @ColumnInfo(name = "hostId")
    public long hostId;

    @ColumnInfo(name = "hostImg")
    public String hostImg;

    @PrimaryKey(autoGenerate = true)
    public Integer id;

    @ColumnInfo(name = "isRead")
    public boolean isRead = false;

    @ColumnInfo(name = "localtime")
    public long localtime;

    @ColumnInfo(name = "midx")
    public String mid;

    @ColumnInfo(name = "moment")
    public String moment;

    @ColumnInfo(name = "momentId")
    public long momentId;

    @ColumnInfo(name = "msg")
    public String msg;

    @ColumnInfo(name = "objectId")
    public long objectId;

    @ColumnInfo(name = "post_image")
    public String postImage;

    @ColumnInfo(name = "rewardType")
    public int rewardType;

    @ColumnInfo(name = "type_code")
    public int type_code;

    @ColumnInfo(name = "uid")
    public String uid;

    public CommentMessageModel toCommentMessageModel() {
        CommentMessageModel commentMessageModel = new CommentMessageModel();
        commentMessageModel.mid = this.mid;
        commentMessageModel.uid = this.uid;
        commentMessageModel.setCode(this.type_code);
        commentMessageModel.setDeleteType(this.delete_type);
        commentMessageModel.setLocaltime(this.localtime);
        commentMessageModel.setMsg(this.msg);
        commentMessageModel.formUid = this.fromUid;
        commentMessageModel.formHeader = this.formHeader;
        commentMessageModel.formName = this.formName;
        commentMessageModel.postImage = this.postImage;
        commentMessageModel.postId = this.momentId;
        commentMessageModel.giftId = this.giftId;
        commentMessageModel.giftImage = this.giftImage;
        commentMessageModel.giftNum = this.giftNum;
        commentMessageModel.objectId = this.objectId;
        commentMessageModel.dyImg = this.dyImg;
        commentMessageModel.hostImg = this.hostImg;
        commentMessageModel.circleName = this.circleName;
        commentMessageModel.hostId = this.hostId;
        commentMessageModel.setFrom((CommentMessageModel.FromBean) o0Oo0oo.OooO0O0(this.from, CommentMessageModel.FromBean.class));
        commentMessageModel.setMoment((CommentMessageModel.MomentBean) o0Oo0oo.OooO0O0(this.moment, CommentMessageModel.MomentBean.class));
        commentMessageModel.setCommentId(this.commentId);
        commentMessageModel.setFrom(this.fromUid, this.formName, this.formHeader);
        return commentMessageModel;
    }

    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("CommentNotice{id=");
        sbOooO0o0.append(this.id);
        sbOooO0o0.append('\'');
        sbOooO0o0.append(", type_code=");
        sbOooO0o0.append(this.type_code);
        sbOooO0o0.append('\'');
        sbOooO0o0.append(", mid='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.mid, '\'', ", from='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.from, '\'', ", fromUid=");
        sbOooO0o0.append(this.fromUid);
        sbOooO0o0.append(", msg='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.msg, '\'', ", localtime=");
        sbOooO0o0.append(this.localtime);
        sbOooO0o0.append(", moment='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.moment, '\'', ", momentId=");
        sbOooO0o0.append(this.momentId);
        sbOooO0o0.append('\'');
        sbOooO0o0.append(", commentId=");
        sbOooO0o0.append(this.commentId);
        sbOooO0o0.append('\'');
        sbOooO0o0.append(", rewardType=");
        sbOooO0o0.append(this.rewardType);
        sbOooO0o0.append('\'');
        sbOooO0o0.append(", cid=");
        sbOooO0o0.append(this.cid);
        sbOooO0o0.append('\'');
        sbOooO0o0.append(", uid='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.uid, '\'', ", isRead=");
        sbOooO0o0.append(this.isRead);
        sbOooO0o0.append('\'');
        sbOooO0o0.append(", formHeader='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.formHeader, '\'', ", formName='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.formName, '\'', ", postImage='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.postImage, '\'', ", giftId=");
        sbOooO0o0.append(this.giftId);
        sbOooO0o0.append('\'');
        sbOooO0o0.append(", giftImage='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.giftImage, '\'', ", giftNum=");
        sbOooO0o0.append(this.giftNum);
        sbOooO0o0.append('\'');
        sbOooO0o0.append(", delete_type=");
        sbOooO0o0.append(this.delete_type);
        sbOooO0o0.append('\'');
        sbOooO0o0.append(", objectId=");
        sbOooO0o0.append(this.objectId);
        sbOooO0o0.append('\'');
        sbOooO0o0.append(", dyImg='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.dyImg, '\'', ", hostImg='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.hostImg, '\'', ", circleName='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.circleName, '\'', ", hostId=");
        return o000O0.OooO0O0(sbOooO0o0, this.hostId, '}');
    }
}
