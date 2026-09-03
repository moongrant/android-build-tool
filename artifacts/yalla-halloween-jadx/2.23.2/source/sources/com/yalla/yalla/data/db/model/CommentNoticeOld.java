package com.yalla.yalla.data.db.model;

import androidx.compose.animation.o000oOoO;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.yalla.yalla.model.CommentMessageModel;
import p590o0oOooo0.oOOO00;

/* JADX INFO: loaded from: classes4.dex */
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
        commentMessageModel.setFrom((CommentMessageModel.FromBean) oOOO00.OooO00o(this.from, CommentMessageModel.FromBean.class));
        commentMessageModel.setMoment((CommentMessageModel.MomentBean) oOOO00.OooO00o(this.moment, CommentMessageModel.MomentBean.class));
        commentMessageModel.setCommentId(this.commentId);
        commentMessageModel.setFrom(this.fromUid, this.formName, this.formHeader);
        return commentMessageModel;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CommentNotice{id=");
        sb.append(this.id);
        sb.append("', type_code=");
        sb.append(this.type_code);
        sb.append("', mid='");
        sb.append(this.mid);
        sb.append("', from='");
        sb.append(this.from);
        sb.append("', fromUid=");
        sb.append(this.fromUid);
        sb.append(", msg='");
        sb.append(this.msg);
        sb.append("', localtime=");
        sb.append(this.localtime);
        sb.append(", moment='");
        sb.append(this.moment);
        sb.append("', momentId=");
        sb.append(this.momentId);
        sb.append("', commentId=");
        sb.append(this.commentId);
        sb.append("', rewardType=");
        sb.append(this.rewardType);
        sb.append("', cid=");
        sb.append(this.cid);
        sb.append("', uid='");
        sb.append(this.uid);
        sb.append("', isRead=");
        sb.append(this.isRead);
        sb.append("', formHeader='");
        sb.append(this.formHeader);
        sb.append("', formName='");
        sb.append(this.formName);
        sb.append("', postImage='");
        sb.append(this.postImage);
        sb.append("', giftId=");
        sb.append(this.giftId);
        sb.append("', giftImage='");
        sb.append(this.giftImage);
        sb.append("', giftNum=");
        sb.append(this.giftNum);
        sb.append("', delete_type=");
        sb.append(this.delete_type);
        sb.append("', objectId=");
        sb.append(this.objectId);
        sb.append("', dyImg='");
        sb.append(this.dyImg);
        sb.append("', hostImg='");
        sb.append(this.hostImg);
        sb.append("', circleName='");
        sb.append(this.circleName);
        sb.append("', hostId=");
        return o000oOoO.OooO00o(sb, this.hostId, '}');
    }
}
