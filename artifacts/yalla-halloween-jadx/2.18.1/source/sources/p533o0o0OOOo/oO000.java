package p533o0o0OOOo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.model.GiftRoomAllResultModel;
import com.app.base.model.GiftRoomModel;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.common.model.RoomActivityEffectAnimModel;
import com.yalla.yalla.model.GiftPropTypePay;
import com.yalla.yalla.model.GiftPropTypeTag;
import com.yalla.yalla.model.RoomUserInfoModel;
import kotlin.Pair;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p021OooOooo.o000oOoO;
import p159o00OoOO.o000O00O;
import p254o00ooO0O.o000O0O0;
import p498o0o00Oo0.OooOOO;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class oO000 implements oO00000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public oO00000o f43445OooO00o;

    @Override // p533o0o0OOOo.oO00000
    @NotNull
    public final String OooO00o() {
        return oO00000.OooO00o.OooO00o(this);
    }

    public final void OooO0O0(GiftRoomAllResultModel giftRoomAllResultModel, int i, boolean z) {
        if (giftRoomAllResultModel.type == 92) {
            return;
        }
        GiftRoomModel giftRoomModel = new GiftRoomModel();
        giftRoomModel.from = giftRoomAllResultModel.from;
        giftRoomModel.type = z ? 7 : 8;
        giftRoomModel.giftid = giftRoomAllResultModel.giftid;
        giftRoomModel.giftUrl = CloudImageUtilKt.imgFormat(giftRoomAllResultModel.giftUrl);
        giftRoomModel.giftVideoUrl = CloudImageUtilKt.imgFormat(giftRoomAllResultModel.giftVideoUrl);
        giftRoomModel.giftIsAudio = giftRoomAllResultModel.giftIsAudio;
        giftRoomModel.giftUserType = giftRoomAllResultModel.giftUserType;
        giftRoomModel.giftType = giftRoomModel.giftType;
        giftRoomModel.number = giftRoomAllResultModel.successnum;
        RoomUserInfoModel roomUserInfoModel = new RoomUserInfoModel();
        roomUserInfoModel.setUserName(z ? o000O0O0.OooO0OO(R.string.everyone) : o000O0O0.OooO0OO(R.string.room_dialog_send_gift_all_in_mic));
        giftRoomModel.to = roomUserInfoModel;
        giftRoomModel.coin = giftRoomAllResultModel.coin;
        giftRoomModel.crystal = giftRoomAllResultModel.crystal;
        giftRoomModel.luckyflag = giftRoomAllResultModel.luckyflag;
        giftRoomModel.luckymoney = giftRoomAllResultModel.luckymoney;
        giftRoomModel.luckynum = giftRoomAllResultModel.luckynum;
        giftRoomModel.luckymultiple = giftRoomAllResultModel.luckymultiple;
        giftRoomModel.luckyinstances = giftRoomAllResultModel.luckyinstances;
        OooO0o0(giftRoomModel, i);
        o000O00O.OooO().OooOooO(10009, 0, giftRoomModel);
    }

    public final void OooO0OO(GiftRoomModel giftRoomModel, int i) {
        oO00000o oo00000o;
        long userId = giftRoomModel.from.getUserId();
        OooOOO oooOOO = OooOOO.f41216OooO00o;
        Long value = oooOOO.OooOo().getValue();
        if (value != null && userId == value.longValue()) {
            OooOo.OooO0OO("202004", o000oOoO.OooO00o(new Pair("Giftid", Integer.valueOf(giftRoomModel.giftid))));
        }
        if (i == GiftPropTypePay.Coin.getValue()) {
            long j = giftRoomModel.morajuid;
            Long value2 = oooOOO.OooOo().getValue();
            if (value2 != null && j == value2.longValue()) {
                o000O00O.OooO().f32442Ooooo0o = giftRoomModel;
                return;
            } else if (giftRoomModel.envelopflag == 0 && giftRoomModel.morajuid <= 0 && giftRoomModel.giftType != GiftPropTypeTag.Blind.getValue() && (oo00000o = this.f43445OooO00o) != null) {
                oo00000o.OooO0OO(giftRoomModel);
            }
        } else {
            oO00000o oo00000o2 = this.f43445OooO00o;
            if (oo00000o2 != null) {
                oo00000o2.OooO0OO(giftRoomModel);
            }
        }
        OooO0o0(giftRoomModel, i);
        int i2 = giftRoomModel.type;
        if (i2 == 7 || i2 == 71 || i2 == 72 || i2 == 8) {
            return;
        }
        o000O00O.OooO().OooOooO(10009, 0, giftRoomModel);
    }

    public final void OooO0Oo(int i, @Nullable byte[] bArr) {
        GiftRoomAllResultModel giftRoomAllResultModel;
        oO00000.OooO00o.OooO0O0(this, i, bArr);
        String str = bArr == null ? "" : new String(bArr, Charsets.UTF_8);
        try {
            if (i == 10009) {
                GiftRoomModel giftRoomModel = (GiftRoomModel) o0Oo0oo.OooO0O0(str, GiftRoomModel.class);
                if (giftRoomModel != null) {
                    OooO0OO(giftRoomModel, GiftPropTypePay.Coin.getValue());
                    return;
                }
                return;
            }
            if (i == 10048) {
                GiftRoomAllResultModel giftRoomAllResultModel2 = (GiftRoomAllResultModel) o0Oo0oo.OooO0O0(str, GiftRoomAllResultModel.class);
                if (giftRoomAllResultModel2 != null) {
                    OooO0O0(giftRoomAllResultModel2, GiftPropTypePay.Coin.getValue(), true);
                    return;
                }
                return;
            }
            if (i == 1000100) {
                GiftRoomAllResultModel giftRoomAllResultModel3 = (GiftRoomAllResultModel) o0Oo0oo.OooO0O0(str, GiftRoomAllResultModel.class);
                if (giftRoomAllResultModel3 != null) {
                    OooO0O0(giftRoomAllResultModel3, giftRoomAllResultModel3.coin > 0 ? GiftPropTypePay.Coin.getValue() : GiftPropTypePay.Crystal.getValue(), false);
                    return;
                }
                return;
            }
            if (i == 1000600) {
                RoomActivityEffectAnimModel roomActivityEffectAnimModel = (RoomActivityEffectAnimModel) o0Oo0oo.OooO0O0(str, RoomActivityEffectAnimModel.class);
                if (roomActivityEffectAnimModel != null) {
                    o000O00O.OooO().OooOooO(1000600, 0, roomActivityEffectAnimModel);
                    return;
                }
                return;
            }
            if (i == 1001001) {
                GiftRoomModel giftRoomModel2 = (GiftRoomModel) o0Oo0oo.OooO0O0(str, GiftRoomModel.class);
                if (giftRoomModel2 != null) {
                    OooO0OO(giftRoomModel2, GiftPropTypePay.Coin.getValue());
                    return;
                }
                return;
            }
            if (i != 10056) {
                if (i == 10057 && (giftRoomAllResultModel = (GiftRoomAllResultModel) o0Oo0oo.OooO0O0(str, GiftRoomAllResultModel.class)) != null) {
                    OooO0O0(giftRoomAllResultModel, GiftPropTypePay.Crystal.getValue(), true);
                    return;
                }
                return;
            }
            GiftRoomModel giftRoomModel3 = (GiftRoomModel) o0Oo0oo.OooO0O0(str, GiftRoomModel.class);
            if (giftRoomModel3 != null) {
                OooO0OO(giftRoomModel3, GiftPropTypePay.Crystal.getValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void OooO0o0(GiftRoomModel giftRoomModel, int i) {
        if (giftRoomModel.from != null) {
            OooOOO oooOOO = OooOOO.f41216OooO00o;
            Long value = oooOOO.OooOo().getValue();
            long userId = giftRoomModel.from.getUserId();
            if (value != null && value.longValue() == userId) {
                if (i == GiftPropTypePay.Coin.getValue()) {
                    oooOOO.OooO0OO().postValue(Long.valueOf(giftRoomModel.coin));
                    return;
                } else {
                    oooOOO.OooO0o().postValue(Long.valueOf(giftRoomModel.crystal));
                    return;
                }
            }
        }
        if (giftRoomModel.to != null) {
            OooOOO oooOOO2 = OooOOO.f41216OooO00o;
            Long value2 = oooOOO2.OooOo().getValue();
            long userId2 = giftRoomModel.to.getUserId();
            if (value2 != null && value2.longValue() == userId2 && i == GiftPropTypePay.Coin.getValue()) {
                oooOOO2.OooO0OO().postValue(Long.valueOf(giftRoomModel.coin));
            }
        }
    }
}
