package com.yalla.yalla.ui.activity.moment;

import android.widget.TextView;
import com.android.billingclient.api.o00000O;
import com.app.base.util.DateNumeralUtils;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.LockShopModel;
import kotlin.jvm.internal.Intrinsics;
import p166o00OoOoo.o0O00O0o;
import p168o00Ooo0.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 extends p188o00o00o0.OooO0OO<LockShopModel.LockShopModelItem> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PurchaseLockRoomActivity f22414OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(PurchaseLockRoomActivity purchaseLockRoomActivity) {
        super(purchaseLockRoomActivity, R.layout.room_item_store_lockroom);
        this.f22414OooO00o = purchaseLockRoomActivity;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x011d  */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
        DateNumeralUtils.DateType dateType;
        p188o00o00o0.OooO0o helper = (p188o00o00o0.OooO0o) oooO00o;
        LockShopModel.LockShopModelItem item = (LockShopModel.LockShopModelItem) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
        Intrinsics.checkNotNull(oooOOO.OooOOO0().getValue());
        TextView textView = (TextView) helper.OooO0Oo(R.id.tv_price);
        TextView textView2 = (TextView) helper.OooO0Oo(R.id.tv_num);
        TextView textView3 = (TextView) helper.OooO0Oo(R.id.tv_num_unit);
        TextView textView4 = (TextView) helper.OooO0Oo(R.id.tv_buy_room_lock);
        TextView textView5 = (TextView) helper.OooO0Oo(R.id.tv_origin_price);
        if (item.getPromotionPrice() > item.getDiscountPrice()) {
            textView.setText(o0O0O00.OooO0OO(Long.valueOf(item.getDiscountPrice())));
            textView5.setText(o0O0O00.OooO0OO(Long.valueOf(item.getPromotionPrice())));
            textView5.getPaint().setAntiAlias(true);
            textView5.getPaint().setFlags(17);
        } else {
            textView.setText(o0O0O00.OooO0OO(Long.valueOf(item.getPromotionPrice())));
        }
        o0O00O0o o0o00o0oOooO0O0 = o00000O.OooO0O0();
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("HAS_ROOM");
        sbOooO0o0.append(oooOOO.OooOo().getValue());
        String string = sbOooO0o0.toString();
        byte b = 0;
        if (o0o00o0oOooO0O0.OooO0Oo(string, false)) {
            textView4.setBackgroundResource(R.drawable.bg_buy_roomlock);
        } else {
            textView4.setBackgroundResource(R.drawable.bg_btn_gray);
        }
        textView2.setText(String.valueOf(item.getTimeLong()));
        PurchaseLockRoomActivity purchaseLockRoomActivity = this.f22414OooO00o;
        long timeLong = item.getTimeLong();
        String unit = item.getUnit();
        if (com.yalla.support.common.util.OooO0OO.OooO00o(unit)) {
            dateType = DateNumeralUtils.DateType.d;
        } else {
            int iHashCode = unit.hashCode();
            if (iHashCode != 77) {
                if (iHashCode != 100) {
                    if (iHashCode != 104) {
                        if (iHashCode != 109 || !unit.equals("m")) {
                            b = -1;
                        }
                    } else if (unit.equals("h")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else if (unit.equals("d")) {
                    b = 3;
                } else {
                    b = -1;
                }
            } else if (unit.equals("M")) {
                b = 2;
            } else {
                b = -1;
            }
            if (b == 0) {
                dateType = DateNumeralUtils.DateType.m;
            } else if (b != 1) {
                dateType = b != 2 ? DateNumeralUtils.DateType.d : DateNumeralUtils.DateType.M;
            } else {
                dateType = DateNumeralUtils.DateType.h;
            }
        }
        String string2 = purchaseLockRoomActivity.getString(DateNumeralUtils.OooO00o(timeLong, dateType));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(DateNumeralUti…tem.timeLong, item.unit))");
        textView3.setText(string2);
    }
}
