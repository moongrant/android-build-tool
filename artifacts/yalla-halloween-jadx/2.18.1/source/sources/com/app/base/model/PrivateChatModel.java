package com.app.base.model;

import OooO00o.OooO00o;
import Oooo000.o000O0;
import android.os.Parcel;
import android.os.Parcelable;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public class PrivateChatModel {

    public static class EmotionChatModel extends PrivateChatUIModel {
        public long emotionid;
        public int number;
        public boolean play;

        @Override // com.app.base.model.PrivateChatModel.PrivateChatUIModel
        public String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("EmotionChatModel{emotionid=");
            sbOooO0o0.append(this.emotionid);
            sbOooO0o0.append(", number=");
            return o0O0ooO.OooO00o(sbOooO0o0, this.number, '}');
        }
    }

    public static class GiftChatModel extends PrivateChatUIModel {
        public long giftid;
        public int number;

        @Override // com.app.base.model.PrivateChatModel.PrivateChatUIModel
        public String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("GiftChatModel{giftid=");
            sbOooO0o0.append(this.giftid);
            sbOooO0o0.append(", number=");
            return o0O0ooO.OooO00o(sbOooO0o0, this.number, '}');
        }
    }

    public static class MessageChatModel extends PrivateChatUIModel {
        public String msg;

        @Override // com.app.base.model.PrivateChatModel.PrivateChatUIModel
        public String toString() {
            return kotlin.reflect.jvm.internal.impl.builtins.OooO00o.OooO00o(OooO00o.OooO0o0("MessageChatModel{msg='"), this.msg, '\'', '}');
        }
    }

    public static class PrivateChatUIModel {
        public long from;
        public String id;
        public long localtime;
        public String mid;
        public int msgstatus;
        public long time;
        public long to;
        public int type;

        public String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("PrivateChatUIModel{time=");
            sbOooO0o0.append(this.time);
            sbOooO0o0.append(", type=");
            sbOooO0o0.append(this.type);
            sbOooO0o0.append(", from=");
            return o000O0.OooO0O0(sbOooO0o0, this.from, '}');
        }
    }

    public static class VoiceChatModel extends PrivateChatUIModel {
        public int duration;
        public String filename;
        public int isRead;
        public String url;

        @Override // com.app.base.model.PrivateChatModel.PrivateChatUIModel
        public String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("VoiceChatModel{url='");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.url, '\'', ", duration=");
            sbOooO0o0.append(this.duration);
            sbOooO0o0.append(", filename='");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.filename, '\'', ", isRead=");
            return o0O0ooO.OooO00o(sbOooO0o0, this.isRead, '}');
        }
    }

    public static class UserInfo implements Parcelable {
        public static final Parcelable.Creator<UserInfo> CREATOR = new Parcelable.Creator<UserInfo>() { // from class: com.app.base.model.PrivateChatModel.UserInfo.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public UserInfo createFromParcel(Parcel parcel) {
                return new UserInfo(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public UserInfo[] newArray(int i) {
                return new UserInfo[i];
            }
        };
        public String headframeurl;
        public String headphoto;
        public String isfriend;
        public String nickname;
        public int role;
        public String sex;
        public long uid;
        public int vip;
        public int vipLevel;

        public UserInfo() {
            this.uid = 0L;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("UserInfo{uid='");
            sbOooO0o0.append(this.uid);
            sbOooO0o0.append('\'');
            sbOooO0o0.append(", nickname='");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.nickname, '\'', ", headphoto='");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.headphoto, '\'', ", role='");
            sbOooO0o0.append(this.role);
            sbOooO0o0.append('\'');
            sbOooO0o0.append('}');
            return sbOooO0o0.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.uid);
            parcel.writeString(this.nickname);
            parcel.writeString(this.headphoto);
            parcel.writeString(this.isfriend);
            parcel.writeInt(this.role);
            parcel.writeInt(this.vip);
            parcel.writeInt(this.vipLevel);
        }

        public UserInfo(Parcel parcel) {
            this.uid = 0L;
            this.uid = parcel.readLong();
            this.nickname = parcel.readString();
            this.headphoto = parcel.readString();
            this.isfriend = parcel.readString();
            this.role = parcel.readInt();
            this.vip = parcel.readInt();
            this.vipLevel = parcel.readInt();
        }
    }
}
