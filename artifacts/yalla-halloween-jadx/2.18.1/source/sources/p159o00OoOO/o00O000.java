package p159o00OoOO;

import OooO00o.OooO00o;
import com.android.billingclient.api.o00000O;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.model.AtUserInfoModel;
import com.app.base.model.RoomMessageReplyInfo;
import com.app.base.model.socketPostModel.SkillCardSendModel;
import com.app.base.protobuf.room.Room;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.model.RoomUserInfoModel;
import java.util.ArrayList;
import java.util.HashMap;
import p060o0000o.oo000o;
import p130o00O0oo.o00oOoo;
import p141o00OOoo.OooO;
import p498o0o00Oo0.OooOOO;
import p530o0o0OOO.o00O;
import p530o0o0OOO.o00OO00O;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes.dex */
public final class o00O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static o00 f32468OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static o00O000 f32469OooO0O0;

    public static o00O000 OooO() {
        if (f32469OooO0O0 == null) {
            f32469OooO0O0 = new o00O000();
        }
        return f32469OooO0O0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO00o(boolean z, boolean z2) {
        if (f32468OooO00o != null) {
            Room.MicUpFromMicApplyInviteRequest.Builder builderNewBuilder = Room.MicUpFromMicApplyInviteRequest.newBuilder();
            builderNewBuilder.setRoomId(o00OO00O.f43313OooooOo.OooO00o().f43319OooO0Oo.getValue().longValue());
            OooOOO oooOOO = OooOOO.f41216OooO00o;
            builderNewBuilder.setUserId(oooOOO.OooOo().getValue().longValue());
            o00O.OooO0o oooO0o = o00O.OooO0o.f43216OooO00o;
            builderNewBuilder.setInviter(((RoomUserInfoModel) o00O.OooO0o.f43219OooO0Oo.getValue()).getUserId());
            builderNewBuilder.setYesOrNo(z ? 1 : 2);
            builderNewBuilder.setFromApplyMicList(z2);
            f32468OooO00o.OooO0oO(1001105, builderNewBuilder.build().toByteArray());
            Long value = oooOOO.OooOo().getValue();
            if (o00000O.OooO0O0().OooO00o("Hold_MIC_" + value) == 0) {
                OooO.OooO00o("AFEventMic", null);
                o00000O.OooO0O0().OooO0o0("Hold_MIC_" + value, 1);
            }
        }
    }

    public final void OooO0O0(boolean z) {
        if (f32468OooO00o != null) {
            Room.MicApplyRequest.Builder builderNewBuilder = Room.MicApplyRequest.newBuilder();
            builderNewBuilder.setRoomId(o00OO00O.f43313OooooOo.OooO00o().f43319OooO0Oo.getValue().longValue());
            builderNewBuilder.setUserId(OooOOO.f41216OooO00o.OooOo().getValue().longValue());
            builderNewBuilder.setOp(z ? 1 : 2);
            f32468OooO00o.OooO0oO(1001100, builderNewBuilder.build().toByteArray());
        }
    }

    public final void OooO0OO(String str) {
        if (f32468OooO00o != null) {
            Room.NoticeContentChangeRequest.Builder builderNewBuilder = Room.NoticeContentChangeRequest.newBuilder();
            builderNewBuilder.setNoticemsg(str);
            f32468OooO00o.OooO0oO(10059, builderNewBuilder.build().toByteArray());
        }
    }

    public final void OooO0Oo(int i) {
        if (f32468OooO00o != null) {
            Room.MicNumChangeRequest.Builder builderNewBuilder = Room.MicNumChangeRequest.newBuilder();
            builderNewBuilder.setMictype(i);
            f32468OooO00o.OooO0oO(10058, builderNewBuilder.build().toByteArray());
        }
    }

    public final void OooO0o(long j) {
        o00 o00Var = f32468OooO00o;
        if (o00Var != null) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("{\"userid\":");
            sbOooO0o0.append(String.valueOf(j));
            sbOooO0o0.append("}");
            o00Var.OooO0o(10024, sbOooO0o0.toString());
        }
    }

    public final void OooO0o0(int i, int i2, long j, boolean z) {
        if (f32468OooO00o != null) {
            Room.ChangeLuckNumSetRequest.Builder builderNewBuilder = Room.ChangeLuckNumSetRequest.newBuilder();
            builderNewBuilder.setLucknumcost(i);
            builderNewBuilder.setLucknummode(i2);
            builderNewBuilder.setLuckNum(j);
            builderNewBuilder.setIsAdminManage(z);
            f32468OooO00o.OooO0oO(10071, builderNewBuilder.build().toByteArray());
        }
    }

    public final void OooO0oO(int i) {
        if (f32468OooO00o != null) {
            Room.kickTouristRequest.Builder builderNewBuilder = Room.kickTouristRequest.newBuilder();
            builderNewBuilder.setKickOp(i);
            f32468OooO00o.OooO0oO(10070, builderNewBuilder.build().toByteArray());
        }
    }

    public final void OooO0oo(long j) {
        if (f32468OooO00o == null || j <= 0) {
            return;
        }
        Room.UserInfoRequest.Builder builderNewBuilder = Room.UserInfoRequest.newBuilder();
        builderNewBuilder.setUserid(j);
        f32468OooO00o.OooO0oO(10060, builderNewBuilder.build().toByteArray());
    }

    public final void OooOO0(int i, int i2) {
        if (f32468OooO00o != null) {
            Room.BonusDetailRequest.Builder builderNewBuilder = Room.BonusDetailRequest.newBuilder();
            builderNewBuilder.setBonustype(i2);
            builderNewBuilder.setBonusid(i);
            f32468OooO00o.OooO0oO(10078, builderNewBuilder.build().toByteArray());
        }
    }

    public final void OooOO0O() {
        o00 o00Var = f32468OooO00o;
        if (o00Var != null) {
            o00Var.OooO0o(10054, null);
        }
    }

    public final void OooOO0o(long j) {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("{\"userid\":");
        sbOooO0o0.append(String.valueOf(j));
        sbOooO0o0.append("}");
        String string = sbOooO0o0.toString();
        o00 o00Var = f32468OooO00o;
        if (o00Var != null) {
            o00Var.OooO0o(10023, string);
        }
    }

    public final void OooOOO(String str, String str2, String str3) {
        String strOooO00o = p058o0000OoO.OooO.OooO00o(o00oOoo.OooO00o("{\"userid\":", str, ",\"barid\":", str2, ",\"invitefalg\":"), str3, "}");
        o00 o00Var = f32468OooO00o;
        if (o00Var != null) {
            o00Var.OooO0o(10042, strOooO00o);
        }
    }

    public final void OooOOO0(long j, boolean z) {
        if (f32468OooO00o != null) {
            Room.MicInviteFromApplyRequest.Builder builderNewBuilder = Room.MicInviteFromApplyRequest.newBuilder();
            builderNewBuilder.setTarget(j);
            builderNewBuilder.setRoomId(o00OO00O.f43313OooooOo.OooO00o().f43319OooO0Oo.getValue().longValue());
            builderNewBuilder.setUserId(OooOOO.f41216OooO00o.OooOo().getValue().longValue());
            builderNewBuilder.setFromApplyMicList(z);
            f32468OooO00o.OooO0oO(1001103, builderNewBuilder.build().toByteArray());
        }
    }

    public final void OooOOOO(String str, String str2) {
        String strOooO00o = oo000o.OooO00o("{\"to\":", str, ",\"blockaction\":", str2, "}");
        o00 o00Var = f32468OooO00o;
        if (o00Var != null) {
            o00Var.OooO0o(10008, strOooO00o);
        }
    }

    public final void OooOOOo() {
        if (f32468OooO00o != null) {
            Room.MicApplyListRequest.Builder builderNewBuilder = Room.MicApplyListRequest.newBuilder();
            builderNewBuilder.setRoomId(o00OO00O.f43313OooooOo.OooO00o().f43319OooO0Oo.getValue().longValue());
            builderNewBuilder.setUserId(OooOOO.f41216OooO00o.OooOo().getValue().longValue());
            f32468OooO00o.OooO0oO(1001109, builderNewBuilder.build().toByteArray());
        }
    }

    public final void OooOOo(long j, int i, long j2) {
        o00 o00Var = f32468OooO00o;
        if (o00Var != null) {
            o00Var.OooO0o(10055, "{\"prioritid\":" + j + ",\"kind\":" + i + ",\"userid\":" + j2 + "}");
        }
    }

    public final void OooOOo0(Long l, boolean z) {
        if (f32468OooO00o != null) {
            Room.RoshamboListRequest.Builder builderNewBuilder = Room.RoshamboListRequest.newBuilder();
            builderNewBuilder.setListkind(!z ? 1 : 0);
            builderNewBuilder.setMorauuid(l.longValue());
            f32468OooO00o.OooO0oO(10065, builderNewBuilder.build().toByteArray());
        }
    }

    public final void OooOOoo(Integer num) {
        if (f32468OooO00o != null) {
            f32468OooO00o.OooO0o(10031, "{\"order\":" + num + "}");
        }
    }

    public final void OooOo(Long[] lArr, int i) {
        HashMap map = new HashMap();
        map.put("cardid", String.valueOf(i));
        OooOo.OooO0OO("102035", map);
        if (f32468OooO00o != null) {
            SkillCardSendModel skillCardSendModel = new SkillCardSendModel();
            skillCardSendModel.tousers = lArr;
            skillCardSendModel.headwearid = i;
            f32468OooO00o.OooO0o(10049, o0Oo0oo.OooO0Oo(skillCardSendModel));
        }
    }

    public final void OooOo0(String str) {
        o00 o00Var = f32468OooO00o;
        if (o00Var != null) {
            o00Var.OooO0o(10041, "{\"dues\":" + str + "}");
        }
    }

    public final void OooOo00(String str) {
        o00 o00Var = f32468OooO00o;
        if (o00Var != null) {
            o00Var.OooO0o(10022, "{\"userid\":" + str + "}");
        }
    }

    public final void OooOo0O(Room.BlindBoxGiftRequest.Builder builder) {
        if (f32468OooO00o != null) {
            builder.setTarget(builder.getTarget());
            builder.setBMic(builder.getBMic());
            builder.setPerNum(builder.getPerNum());
            builder.setGiftId(builder.getGiftId());
            f32468OooO00o.OooO0oO(1001000, builder.build().toByteArray());
        }
    }

    public final void OooOo0o(Room.CustomGiftRequest.Builder builder) {
        o00 o00Var = f32468OooO00o;
        if (o00Var != null) {
            o00Var.OooO0oO(1001002, builder.build().toByteArray());
        }
    }

    public final void OooOoO(int i) {
        if (f32468OooO00o != null) {
            Room.GetEnvelopListRequest.Builder builderNewBuilder = Room.GetEnvelopListRequest.newBuilder();
            builderNewBuilder.setAutotype(i);
            f32468OooO00o.OooO0oO(10074, builderNewBuilder.build().toByteArray());
        }
    }

    public final void OooOoO0(String str, p150o00Oo0Oo.OooOo oooOo, RoomMessageReplyInfo roomMessageReplyInfo) {
        if (f32468OooO00o != null) {
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            if (oooOo != null) {
                int i = oooOo.f32174Oooo0oo;
                if (i == 40) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO0o0("@");
                    sbOooO0o0.append(oooOo.f32172Oooo0o);
                    map.put("atHead", sbOooO0o0.toString());
                    map.put("type", Integer.valueOf(oooOo.f32174Oooo0oo));
                } else if (i == 39) {
                    StringBuilder sbOooO0o1 = OooO00o.OooO0o0("@");
                    sbOooO0o1.append(oooOo.f32172Oooo0o);
                    map.put("atHead", sbOooO0o1.toString());
                    map.put("type", Integer.valueOf(oooOo.f32174Oooo0oo));
                } else {
                    AtUserInfoModel atUserInfoModel = new AtUserInfoModel();
                    atUserInfoModel.setUserid(oooOo.f32173Oooo0oO);
                    atUserInfoModel.setUsername(oooOo.f32172Oooo0o);
                    arrayList.add(atUserInfoModel);
                }
            }
            map.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, str);
            map.put("lang", p168o00Ooo0.oo000o.OooO00o());
            map.put("aites", arrayList);
            if (roomMessageReplyInfo != null) {
                map.put("replyinfo", roomMessageReplyInfo);
            }
            f32468OooO00o.OooO0o(10003, o0Oo0oo.OooO0Oo(map));
        }
    }

    public final void OooOoOO(boolean z) {
        if (f32468OooO00o != null) {
            Room.MicApplySwitchOpenRequest.Builder builderNewBuilder = Room.MicApplySwitchOpenRequest.newBuilder();
            builderNewBuilder.setRoomId(o00OO00O.f43313OooooOo.OooO00o().f43319OooO0Oo.getValue().longValue());
            builderNewBuilder.setUserId(OooOOO.f41216OooO00o.OooOo().getValue().longValue());
            builderNewBuilder.setOp(z ? 1L : 2L);
            f32468OooO00o.OooO0oO(1001106, builderNewBuilder.build().toByteArray());
        }
    }

    public final void OooOoo(Integer num) {
        if (f32468OooO00o != null) {
            f32468OooO00o.OooO0o(10032, "{\"order\":" + num + "}");
        }
    }

    public final void OooOoo0(String str, String str2) {
        o00 o00Var = f32468OooO00o;
        if (o00Var != null) {
            o00Var.OooO0o(10022, oo000o.OooO00o("{\"userid\":", str, ",\"followtype\":", str2, "}"));
        }
    }
}
