package p505o0o00oOO;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.input.key.OooO00o;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.ShopVehicleListModel;
import com.yalla.yalla.ui.activity.store.VehicleStoreActivity;
import com.yalla.yalla.ui.view.UserPremiumView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.yalla.yalla.ui.view.textView.ViewLocation;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p184o00o00O0.OooO0OO;
import p368o0OOo0Oo.Oooo000;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p571o0oOoO0.o0000oo;
import p573o0oOoOO.o0O0o0;
import p595o0oo00O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOOO0o extends o0000oo<ShopVehicleListModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ VehicleStoreActivity f50366OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOOO0o(VehicleStoreActivity vehicleStoreActivity, int i) {
        super(vehicleStoreActivity, i);
        this.f50366OooOoo0 = vehicleStoreActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        final ShopVehicleListModel item = (ShopVehicleListModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        TextView textView = (TextView) helper.getView(o0OO00O.tvLimitTime);
        Intrinsics.checkNotNull(textView);
        o000O.OooO0OO(textView);
        textView.setTextColor(o0000.OooO00o(o0OOO0o.white_));
        textView.setBackgroundResource(o0Oo0oo.user_all_head_bg_ff5b48);
        o0O0o0.OooO00o(textView, o0000.OooO0O0(o0Oo0oo.user_ic_vehicle_limit_time_store), ViewLocation.start, OooOo00.OooO0o0());
        if (item.getLimitNum() > 0 && (item.getNVehicleTagType() == 0 || item.getNVehicleTagType() == 10)) {
            o000O.OooOOOO(textView);
            textView.setText(o0000O.OooO00o(o0000.OooO0OO(o000000.vehicle_store_xxx_days), String.valueOf(item.getLimitNum())));
        }
        View view = helper.getView(o0OO00O.ivImage);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        NetImageView netImageView = (NetImageView) view;
        View view2 = helper.getView(o0OO00O.ivPlay);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        try {
            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this.f56423OooOo);
            oooO00o.f43126OooO0OO = OooO0OO.OooO0Oo(item.getPic());
            oooO00o.f43124OooO00o = 0;
            oooO00o.f43138OooOOOo = o0Oo0oo.icon_vehicel_placeholder;
            oooO00o.OooO0Oo(netImageView);
        } catch (Exception e) {
            e.printStackTrace();
        }
        TextView textView2 = (TextView) helper.getView(o0OO00O.tvVehicleTag);
        if (textView2 != null) {
            textView2.setText(item.getVehicleTag());
            o000O.OooOOOO(textView2);
            int nVehicleTagType = item.getNVehicleTagType();
            if (nVehicleTagType == 10 || nVehicleTagType == 11) {
                textView2.setTextColor(o0000.OooO00o(o0OOO0o.color_4A90E2));
                textView2.setBackgroundColor(o0000.OooO00o(o0OOO0o.color_E4EFFB));
            } else if (nVehicleTagType == 300) {
                textView2.setTextColor(o0000.OooO00o(o0OOO0o.color_FF5B48));
                textView2.setBackgroundColor(o0000.OooO00o(o0OOO0o.color_FFE7E4));
                textView2.setText(o0000.OooO0OO(o000000.vehicle_store_tag_vip300));
            } else if (nVehicleTagType == 400) {
                textView2.setTextColor(o0000.OooO00o(o0OOO0o.color_FF5B48));
                textView2.setBackgroundColor(o0000.OooO00o(o0OOO0o.color_FFE7E4));
                textView2.setText(o0000.OooO0OO(o000000.vehicle_store_tag_vip400));
            } else if (nVehicleTagType != 500) {
                o000O.OooO0OO(textView2);
            } else {
                textView2.setTextColor(o0000.OooO00o(o0OOO0o.color_FF5B48));
                textView2.setBackgroundColor(o0000.OooO00o(o0OOO0o.color_FFE7E4));
                textView2.setText(o0000.OooO0OO(o000000.vehicle_store_tag_vip5));
            }
        }
        final TextView textView3 = (TextView) helper.getView(o0OO00O.tvPurchase);
        if (textView3 != null) {
            if (item.getIsHave() == 1) {
                textView3.setBackground(o0000.OooO0O0(o0Oo0oo.shape_bg_room_theme_item_sold_out));
                textView3.setText((item.getNVehicleTagType() == 0 || item.getNVehicleTagType() == 10) ? o0000.OooO0OO(o000000.Purchased) : o0000.OooO0OO(o000000.Obtained));
            } else {
                textView3.setBackground(o0000.OooO0O0(o0Oo0oo.shape_bg_room_theme_item_buy));
                textView3.setText((item.getNVehicleTagType() == 0 || item.getNVehicleTagType() == 10) ? o0000.OooO0OO(o000000.Purchase) : o0000.OooO0OO(o000000.Obtain));
            }
            final VehicleStoreActivity vehicleStoreActivity = this.f50366OooOoo0;
            textView3.setOnClickListener(new View.OnClickListener() { // from class: o0o00oOO.o0OOO0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    ShopVehicleListModel item2 = item;
                    Intrinsics.checkNotNullParameter(item2, "$item");
                    VehicleStoreActivity this$0 = vehicleStoreActivity;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    TextView this_run = textView3;
                    Intrinsics.checkNotNullParameter(this_run, "$this_run");
                    boolean z = true;
                    if (item2.getIsHave() == 1) {
                        String strOooO0OO = o0000.OooO0OO(o000000.vehicle_store_you_have_vehicle);
                        if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                            z = false;
                        }
                        if (z) {
                            return;
                        }
                        o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o.run();
                            return;
                        } else {
                            o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                            return;
                        }
                    }
                    int nVehicleTagType2 = item2.getNVehicleTagType();
                    if (nVehicleTagType2 == 0) {
                        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                        T value = o0O00oO0.OooOO0o().getValue();
                        Intrinsics.checkNotNull(value);
                        Pair pair = (Pair) value;
                        if (((Boolean) pair.getFirst()).booleanValue() && ((Number) pair.getSecond()).intValue() >= PremiumLevel.Premium3.getValue()) {
                            if (item2.getTimeLong() == -1) {
                                VehicleStoreActivity.OooOo(this$0, item2, o0000O.OooO00o(o0000.OooO0OO(o000000.vehicle_store_buy_permanent), String.valueOf(item2.getPrices())));
                                return;
                            } else {
                                VehicleStoreActivity.OooOo(this$0, item2, o0000O.OooO00o(o0000.OooO0OO(o000000.vehicle_store_buy_temp), String.valueOf(item2.getPrices()), String.valueOf(item2.getTimeLong())));
                                return;
                            }
                        }
                        Context context = this_run.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        p205o00o0o0o.o000O o000o = new p205o00o0o0o.o000O(context);
                        o000o.OooOo00(o0000.OooO0OO(o000000.vehicle_store_only_vip2_buy_vehicle));
                        o000o.OooOOOo(o0000.OooO0OO(o000000.Get_Yalla_Premium));
                        o000o.OooOo0(new o0OOO0OO(this$0));
                        o000o.OooOo(true);
                        o000o.OooOO0o();
                        return;
                    }
                    if (nVehicleTagType2 == 300) {
                        int i = UserPremiumView.f30257OooO0o0;
                        VehicleStoreActivity.OooOoO0(this$0, item2, UserPremiumView.OooO00o.OooO0OO(PremiumLevel.Premium3));
                        return;
                    }
                    if (nVehicleTagType2 == 400) {
                        int i2 = UserPremiumView.f30257OooO0o0;
                        VehicleStoreActivity.OooOoO0(this$0, item2, UserPremiumView.OooO00o.OooO0OO(PremiumLevel.Premium4));
                        return;
                    }
                    if (nVehicleTagType2 == 500) {
                        int i3 = UserPremiumView.f30257OooO0o0;
                        VehicleStoreActivity.OooOoO0(this$0, item2, UserPremiumView.OooO00o.OooO0OO(PremiumLevel.Premium5));
                        return;
                    }
                    if (nVehicleTagType2 != 10) {
                        if (nVehicleTagType2 != 11) {
                            return;
                        }
                        Context context2 = this_run.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        p205o00o0o0o.o000O o000o2 = new p205o00o0o0o.o000O(context2);
                        o000o2.OooOo00(o0000O.OooO00o(o0000.OooO0OO(o000000.vehicle_store_only_activity), item2.getVehicleTag()));
                        o000o2.OooOO0o();
                        return;
                    }
                    o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                    T value2 = o0O00oO0.OooOO0o().getValue();
                    Intrinsics.checkNotNull(value2);
                    Pair pair2 = (Pair) value2;
                    if (((Boolean) pair2.getFirst()).booleanValue() && ((Number) pair2.getSecond()).intValue() >= PremiumLevel.Premium3.getValue()) {
                        if (item2.getTimeLong() == -1) {
                            VehicleStoreActivity.OooOo(this$0, item2, o0000O.OooO00o(o0000.OooO0OO(o000000.vehicle_store_buy_or_activity_permanent), String.valueOf(item2.getPrices()), item2.getVehicleTag()));
                            return;
                        } else {
                            VehicleStoreActivity.OooOo(this$0, item2, o0000O.OooO00o(o0000.OooO0OO(o000000.vehicle_store_buy_or_activity_temp), String.valueOf(item2.getPrices()), String.valueOf(item2.getTimeLong()), item2.getVehicleTag()));
                            return;
                        }
                    }
                    Context context3 = this_run.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    p205o00o0o0o.o000O o000o3 = new p205o00o0o0o.o000O(context3);
                    o000o3.OooOo00(o0000.OooO0OO(o000000.vehicle_store_only_vip2_buy_vehicle));
                    o000o3.OooOOOo(o0000.OooO0OO(o000000.Get_Yalla_Premium));
                    o000o3.OooOo0(new o0OOOO00(this$0));
                    o000o3.OooOo(true);
                    o000o3.OooOO0o();
                }
            });
        }
        LinearLayout linearLayout = (LinearLayout) helper.getView(o0OO00O.layoutPrice);
        TextView textView4 = (TextView) helper.getView(o0OO00O.tvPrice);
        TextView textView5 = (TextView) helper.getView(o0OO00O.tvPromotionPrice);
        TextView textView6 = (TextView) helper.getView(o0OO00O.tvDays);
        if (linearLayout != null) {
            o000O.OooOOOO(linearLayout);
        }
        if (item.getNVehicleTagType() == 11 || item.getNVehicleTagType() == 300 || item.getNVehicleTagType() == 400 || item.getNVehicleTagType() == 500) {
            Intrinsics.checkNotNull(linearLayout);
            o000O.OooO0O0(linearLayout);
            return;
        }
        if (textView4 != null) {
            o000O.OooOOOO(textView4);
            o0O0o0.OooO00o(textView4, o0000.OooO0O0(o0Oo0oo.icon_theme_coin), ViewLocation.start, OooOo00.OooO0o0());
            textView4.setText(String.valueOf(item.getPrice()));
            Intrinsics.checkNotNull(textView5);
            o000O.OooO0O0(textView5);
            if (item.getPrice() > item.getPromotionPrice() && item.getPromotionPrice() > 0) {
                textView4.getPaint().setFlags(16);
                textView5.setText(String.valueOf(item.getPromotionPrice()));
                o000O.OooOOOO(textView5);
            }
        }
        if (textView6 != null) {
            textView6.setText(o0000O.OooO00o(o0000.OooO0OO(o000000.vehicle_store_xxx_days), OooO00o.OooO00o("/", item.getTimeLong())));
            o000O.OooOOOO(textView6);
            if (item.getTimeLong() == -1) {
                textView6.setText("");
                o000O.OooO0OO(textView6);
            }
        }
    }
}
