package com.yalla.yalla.model;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.yalla.yalla.model.bean.AbsJavaBean;
import com.yalla.yalla.model.moment.MomentSendContentModel;
import p590o0oOooo0.oOOO00;

/* JADX INFO: loaded from: classes4.dex */
public class CommentMessageModel extends AbsJavaBean {
    public String circleName;
    private int code;
    public int deleteType;
    public String dyImg;
    public String formHeader;
    public String formName;
    public long formUid;
    private FromBean from;
    public int giftId;
    public String giftImage;
    public int giftNum;
    public long hostId;
    public String hostImg;
    private long localtime;
    public String mid;
    private MomentBean moment;
    private String msg;
    public long objectId;
    public long postId;
    public String postImage;
    private ReportBean report;
    public String uid;

    public static class FromBean extends AbsJavaBean {
        private String headurl;
        private long id;
        private String nickname;

        public FromBean(String str, long j, String str2) {
            this.headurl = str;
            this.id = j;
            this.nickname = str2;
        }

        public String getHeadurl() {
            return this.headurl;
        }

        public long getId() {
            return this.id;
        }

        public String getNickname() {
            return this.nickname;
        }
    }

    public static class MomentBean extends AbsJavaBean {
        private long cid;
        private String content;
        private long id;
        private String image;

        public MomentBean(long j, String str) {
            this.id = j;
            this.image = str;
        }

        public long getCid() {
            return this.cid;
        }

        public String getContent() {
            return this.content;
        }

        public long getId() {
            return this.id;
        }

        public String getImage() {
            return this.image;
        }

        public void setCid(long j) {
            this.cid = j;
        }

        public void setContent(String str) {
            this.content = str;
        }

        public void setId(long j) {
            this.id = j;
        }

        public void setImage(String str) {
            this.image = str;
        }
    }

    public static class ReportBean extends AbsJavaBean {
        private String content = "";
        private long id;
        private String name;

        public ReportBean(long j, String str) {
            this.id = j;
            this.name = str;
        }

        public String getContent() {
            return this.content;
        }

        public long getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public void setContent(String str) {
            this.content = str;
        }
    }

    public int getCode() {
        return this.code;
    }

    public int getDeleteType() {
        return this.deleteType;
    }

    public FromBean getFrom() {
        return this.from;
    }

    public long getLocaltime() {
        return this.localtime;
    }

    public MomentBean getMoment() {
        return this.moment;
    }

    public String getMsg() {
        return this.msg;
    }

    public MomentSendContentModel getMsgObj() {
        MomentSendContentModel momentSendContentModel = new MomentSendContentModel("");
        if (TextUtils.isEmpty(this.msg)) {
            return momentSendContentModel;
        }
        try {
            MomentSendContentModel momentSendContentModel2 = (MomentSendContentModel) oOOO00.OooO0O0(this.msg, new TypeToken<MomentSendContentModel>() { // from class: com.yalla.yalla.model.CommentMessageModel.1
            }.getType());
            return momentSendContentModel2 == null ? new MomentSendContentModel(this.msg) : momentSendContentModel2;
        } catch (Exception e) {
            e.printStackTrace();
            return momentSendContentModel;
        }
    }

    public ReportBean getReport() {
        return this.report;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setCommentId(long j) {
        if (j > 0) {
            if (this.moment == null) {
                this.moment = new MomentBean(this.postId, this.postImage);
            }
            this.moment.cid = j;
        }
    }

    public void setDeleteType(int i) {
        this.deleteType = i;
    }

    public void setFrom(long j, String str, String str2) {
        if (this.from == null) {
            this.from = new FromBean(str2, j, str);
        }
        if (!TextUtils.isEmpty(str2)) {
            this.from.headurl = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            this.from.nickname = str;
        }
        if (j > 0) {
            this.from.id = j;
        }
    }

    public void setLocaltime(long j) {
        this.localtime = j;
    }

    public void setMoment(MomentBean momentBean) {
        this.moment = momentBean;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setReport(ReportBean reportBean) {
        this.report = reportBean;
    }

    public void setFrom(FromBean fromBean) {
        this.from = fromBean;
    }
}
