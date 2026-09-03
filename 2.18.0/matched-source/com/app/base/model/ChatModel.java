package com.app.base.model;

import OooO00o.OooO00o;
import com.app.base.protobuf.room.Room;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.data.db.model.ChatMessageOld;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.model.RoomUserInfoModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ChatModel {
    public ApplyMicSwitchModel applyMicSwitchModel;
    public String atHead;
    public int atType;
    public long balance;
    public BecomeMemberModel becomeMemberModel;
    public String emjUrl;
    public EventModel eventModel;
    public RoomUserInfoModel from;
    public long fromcoin;
    public Room.GetBonusMessage getBonusMessage;
    public ChatMessageOld.Gif gif;
    public int giftPrice;
    public int giftType;
    public String giftUrl;
    public int giftUserType;
    public String giftVideoUrl;
    public int giftid;
    public int hatsID;
    public String hatsUrl;
    public String id;
    public boolean isTie;
    public int luckSetRole;
    public long luckSetRoleUserId;
    public long lucknum;
    public int lucknummode;
    public MagicVoiceInfo magicVoiceInfo;
    public boolean memberBadgeActivate;
    public MemberUpLevelModel memberUpLevelModel;
    public String message;
    public int micNumber;
    public long muuid;
    public String num;
    public int number;
    public int picheight;
    public int picwidth;
    public PkResult pkResult;
    public PkStart pkStart;
    public int pkType;
    public long playTime;
    public String price;

    @SerializedName("replyinfo")
    public RoomMessageReplyInfo replyInfo;
    public int roleReceiving;
    public Room.SendBonusMessage sendBonusMessage;
    public RoomUserInfoModel to;
    public String toHeadphoto;
    public String toNickname;
    public TreasureBoxShow treasureBoxInfo;
    public int type;
    public long voteId;
    public List<VoteResult> voteResultList;
    public int wincoinnum;
    public long toUserId = 0;
    public String uuid = "";
    public int fromboxid = 0;
    public boolean isSkillCard = false;
    public ArrayList<AtUserInfoModel> aites = new ArrayList<>();
    public boolean luckNumAnim = false;
    public boolean voteIsRunning = false;
    public String voteGiftImage = "";

    public static class ApplyMicSwitchModel {
        public boolean isOpen;
        public RoomUserInfoModel switchUser;

        public ApplyMicSwitchModel(RoomUserInfoModel roomUserInfoModel, boolean z) {
            this.switchUser = roomUserInfoModel;
            this.isOpen = z;
        }
    }

    public static class BecomeMemberModel {
        public boolean haveWelcome = false;
        public String headphoto;
        public long userId;
        public String userName;

        public BecomeMemberModel(long j, String str, String str2) {
            this.userId = j;
            this.headphoto = str;
            this.userName = str2;
        }
    }

    public static class GifInfo {
        public int gifId;
        public String gifUrl;

        public GifInfo(int i, String str) {
            this.gifId = i;
            this.gifUrl = str;
        }
    }

    public static class MagicVoiceInfo {
        public String cardUrl;
        public int cardid;

        public MagicVoiceInfo(int i, String str) {
            this.cardid = i;
            this.cardUrl = str;
        }
    }

    public static class MemberUpLevelModel {
        public int level;
        public String userHeader;
        public long userId;
        public String userName;

        public MemberUpLevelModel(long j, String str, String str2, int i) {
            this.userId = j;
            this.userName = str;
            this.userHeader = str2;
            this.level = i;
        }
    }

    public static class PkResult {
        public String roomNameA = "";
        public String roomNameB = "";
        public int giftNumberA = 0;
        public int giftNumberB = 0;
        public String giftUrl = "";
    }

    public static class PkStart {
        public String roomNameA = "";
        public String roomNameB = "";
    }

    public static class TreasureBoxShow {
        public List<Room.TreasureBoxDrawAwardUserModel> treasureBox;
        public boolean open = false;
        public int level = 1;
    }

    public static class VoteResult {
        public long userId = 0;
        public int totalCount = 0;
        public String nickName = "";
    }

    public boolean isGetLuckyNumber() {
        return this.lucknum == ((long) this.number);
    }

    public boolean isMySelfMessage(long j) {
        RoomUserInfoModel roomUserInfoModel = this.from;
        return roomUserInfoModel != null && roomUserInfoModel.getUserId() == j;
    }

    public String toString() {
        StringBuilder sbOooO0O0 = OooO00o.OooO0O0("ChatModel{from=");
        sbOooO0O0.append(this.from);
        sbOooO0O0.append(", to=");
        sbOooO0O0.append(this.to);
        sbOooO0O0.append(", giftid=");
        sbOooO0O0.append(this.giftid);
        sbOooO0O0.append(", giftUserType=");
        sbOooO0O0.append(this.giftUserType);
        sbOooO0O0.append(", giftType=");
        sbOooO0O0.append(this.giftType);
        sbOooO0O0.append(", toUserId=");
        sbOooO0O0.append(this.toUserId);
        sbOooO0O0.append(", toNickname='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0O0, this.toNickname, '\'', ", toHeadphoto='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0O0, this.toHeadphoto, '\'', ", id='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0O0, this.id, '\'', ", uuid='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0O0, this.uuid, '\'', ", type=");
        sbOooO0O0.append(this.type);
        sbOooO0O0.append(", num='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0O0, this.num, '\'', ", message='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0O0, this.message, '\'', ", aites=");
        sbOooO0O0.append(this.aites);
        sbOooO0O0.append(", hatsID=");
        sbOooO0O0.append(this.hatsID);
        sbOooO0O0.append(", hatsUrl='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0O0, this.hatsUrl, '\'', ", number=");
        sbOooO0O0.append(this.number);
        sbOooO0O0.append(", picwidth=");
        sbOooO0O0.append(this.picwidth);
        sbOooO0O0.append(", picheight=");
        sbOooO0O0.append(this.picheight);
        sbOooO0O0.append(", balance=");
        sbOooO0O0.append(this.balance);
        sbOooO0O0.append(", playTime=");
        sbOooO0O0.append(this.playTime);
        sbOooO0O0.append(", magicVoiceInfo=");
        sbOooO0O0.append(this.magicVoiceInfo);
        sbOooO0O0.append(", gif=");
        sbOooO0O0.append(this.gif);
        sbOooO0O0.append(", micNumber=");
        sbOooO0O0.append(this.micNumber);
        sbOooO0O0.append(", emjUrl='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0O0, this.emjUrl, '\'', ", wincoinnum=");
        sbOooO0O0.append(this.wincoinnum);
        sbOooO0O0.append(", pkType=");
        sbOooO0O0.append(this.pkType);
        sbOooO0O0.append(", muuid=");
        sbOooO0O0.append(this.muuid);
        sbOooO0O0.append(", price='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0O0, this.price, '\'', ", isTie=");
        sbOooO0O0.append(this.isTie);
        sbOooO0O0.append(", fromcoin=");
        sbOooO0O0.append(this.fromcoin);
        sbOooO0O0.append(", voteId=");
        sbOooO0O0.append(this.voteId);
        sbOooO0O0.append(", voteIsRunning=");
        sbOooO0O0.append(this.voteIsRunning);
        sbOooO0O0.append(", voteResultList=");
        sbOooO0O0.append(this.voteResultList);
        sbOooO0O0.append(", voteGiftImage='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0O0, this.voteGiftImage, '\'', ", getBonusMessage=");
        sbOooO0O0.append(this.getBonusMessage);
        sbOooO0O0.append(", sendBonusMessage=");
        sbOooO0O0.append(this.sendBonusMessage);
        sbOooO0O0.append(", pkStart=");
        sbOooO0O0.append(this.pkStart);
        sbOooO0O0.append(", pkResult=");
        sbOooO0O0.append(this.pkResult);
        sbOooO0O0.append(", treasureBoxInfo=");
        sbOooO0O0.append(this.treasureBoxInfo);
        sbOooO0O0.append(", replyInfo=");
        sbOooO0O0.append(this.replyInfo);
        sbOooO0O0.append('}');
        return sbOooO0O0.toString();
    }
}
