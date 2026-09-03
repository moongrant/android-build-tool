package p499o0o00o0O;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.input.key.OooO00o;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000OO00;
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
import p139o00OOooO.OooO0o;
import p157o00OoOO0.o0OO00O;
import p362o0OOo0O.OooOO0;
import p464o0Oooo.o000000O;
import p564o0oOo0OO.o000O;
import p576o0oOoOo0.oO000Oo;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p591o0oo000O.OooO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO extends o000O<ShopVehicleListModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ VehicleStoreActivity f49395OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO(VehicleStoreActivity vehicleStoreActivity, int i) {
        super(vehicleStoreActivity, i);
        this.f49395OooOoo0 = vehicleStoreActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        final ShopVehicleListModel item = (ShopVehicleListModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        TextView showLimitTimeLabel$lambda$0 = (TextView) helper.getView(oO00O0oO.tvLimitTime);
        Intrinsics.checkNotNullExpressionValue(showLimitTimeLabel$lambda$0, "showLimitTimeLabel$lambda$0");
        o000OO00.OooO0OO(showLimitTimeLabel$lambda$0);
        showLimitTimeLabel$lambda$0.setTextColor(o0000.OooO00o(oO00O0o.white_));
        showLimitTimeLabel$lambda$0.setBackgroundResource(oOo00OO0.user_all_head_bg_ff5b48);
        oO000Oo.OooO00o(showLimitTimeLabel$lambda$0, o0000.OooO0O0(oOo00OO0.user_ic_vehicle_limit_time_store), ViewLocation.start, OooO.OooO0o0());
        if (item.getLimitNum() > 0 && (item.getNVehicleTagType() == 0 || item.getNVehicleTagType() == 10)) {
            o000OO00.OooOOOO(showLimitTimeLabel$lambda$0);
            showLimitTimeLabel$lambda$0.setText(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.vehicle_store_xxx_days), String.valueOf(item.getLimitNum())));
        }
        View view = helper.getView(oO00O0oO.ivImage);
        Intrinsics.checkNotNullExpressionValue(view, "helper.getView(R.id.ivImage)");
        NetImageView netImageView = (NetImageView) view;
        View view2 = helper.getView(oO00O0oO.ivPlay);
        Intrinsics.checkNotNullExpressionValue(view2, "helper.getView(R.id.ivPlay)");
        try {
            OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(this.f56196OooOo);
            oooO00o.f43911OooO0OO = OooO0o.OooO0Oo(item.getPic());
            oooO00o.f43909OooO00o = 0;
            oooO00o.f43923OooOOOo = oOo00OO0.icon_vehicel_placeholder;
            oooO00o.OooO0Oo(netImageView);
        } catch (Exception e) {
            e.printStackTrace();
        }
        TextView textView = (TextView) helper.getView(oO00O0oO.tvVehicleTag);
        if (textView != null) {
            textView.setText(item.getVehicleTag());
            o000OO00.OooOOOO(textView);
            int nVehicleTagType = item.getNVehicleTagType();
            if (nVehicleTagType == 10 || nVehicleTagType == 11) {
                textView.setTextColor(o0000.OooO00o(oO00O0o.color_4A90E2));
                textView.setBackgroundColor(o0000.OooO00o(oO00O0o.color_E4EFFB));
            } else if (nVehicleTagType == 300) {
                textView.setTextColor(o0000.OooO00o(oO00O0o.color_FF5B48));
                textView.setBackgroundColor(o0000.OooO00o(oO00O0o.color_FFE7E4));
                textView.setText(o0000.OooO0OO(oO00OOo0.vehicle_store_tag_vip300));
            } else if (nVehicleTagType == 400) {
                textView.setTextColor(o0000.OooO00o(oO00O0o.color_FF5B48));
                textView.setBackgroundColor(o0000.OooO00o(oO00O0o.color_FFE7E4));
                textView.setText(o0000.OooO0OO(oO00OOo0.vehicle_store_tag_vip400));
            } else if (nVehicleTagType != 500) {
                o000OO00.OooO0OO(textView);
            } else {
                textView.setTextColor(o0000.OooO00o(oO00O0o.color_FF5B48));
                textView.setBackgroundColor(o0000.OooO00o(oO00O0o.color_FFE7E4));
                textView.setText(o0000.OooO0OO(oO00OOo0.vehicle_store_tag_vip5));
            }
        }
        final TextView textView2 = (TextView) helper.getView(oO00O0oO.tvPurchase);
        if (textView2 != null) {
            if (item.getIsHave() == 1) {
                textView2.setBackground(o0000.OooO0O0(oOo00OO0.shape_bg_room_theme_item_sold_out));
                textView2.setText((item.getNVehicleTagType() == 0 || item.getNVehicleTagType() == 10) ? o0000.OooO0OO(oO00OOo0.Purchased) : o0000.OooO0OO(oO00OOo0.Obtained));
            } else {
                textView2.setBackground(o0000.OooO0O0(oOo00OO0.shape_bg_room_theme_item_buy));
                textView2.setText((item.getNVehicleTagType() == 0 || item.getNVehicleTagType() == 10) ? o0000.OooO0OO(oO00OOo0.Purchase) : o0000.OooO0OO(oO00OOo0.Obtain));
            }
            final VehicleStoreActivity vehicleStoreActivity = this.f49395OooOoo0;
            textView2.setOnClickListener(new View.OnClickListener() { // from class: o0o00o0O.o00OO0O0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    ShopVehicleListModel item2 = item;
                    Intrinsics.checkNotNullParameter(item2, "$item");
                    VehicleStoreActivity this$0 = vehicleStoreActivity;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    TextView this_run = textView2;
                    Intrinsics.checkNotNullParameter(this_run, "$this_run");
                    boolean z = true;
                    if (item2.getIsHave() == 1) {
                        String strOooO0OO = o0000.OooO0OO(oO00OOo0.vehicle_store_you_have_vehicle);
                        if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                            z = false;
                        }
                        if (z) {
                            return;
                        }
                        o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o.run();
                            return;
                        } else {
                            o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                            return;
                        }
                    }
                    int nVehicleTagType2 = item2.getNVehicleTagType();
                    if (nVehicleTagType2 == 0) {
                        o000000O o000000o2 = o000000O.f46674OooO00o;
                        T value = o000000O.OooOO0o().getValue();
                        Intrinsics.checkNotNull(value);
                        Pair pair = (Pair) value;
                        if (((Boolean) pair.getFirst()).booleanValue() && ((Number) pair.getSecond()).intValue() >= PremiumLevel.Premium3.getValue()) {
                            if (item2.getTimeLong() == -1) {
                                VehicleStoreActivity.OooOo(this$0, item2, o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.vehicle_store_buy_permanent), String.valueOf(item2.getPrices())));
                                return;
                            } else {
                                VehicleStoreActivity.OooOo(this$0, item2, o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.vehicle_store_buy_temp), String.valueOf(item2.getPrices()), String.valueOf(item2.getTimeLong())));
                                return;
                            }
                        }
                        Context context = this_run.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "context");
                        o0OO00O o0oo00o2 = new o0OO00O(context);
                        o0oo00o2.OooOo00(o0000.OooO0OO(oO00OOo0.vehicle_store_only_vip2_buy_vehicle));
                        o0oo00o2.OooOOOo(o0000.OooO0OO(oO00OOo0.Get_Yalla_Premium));
                        o0oo00o2.OooOo0(new o00OO0OO(this$0));
                        o0oo00o2.OooOo(true);
                        o0oo00o2.OooOO0o();
                        return;
                    }
                    if (nVehicleTagType2 == 300) {
                        int i = UserPremiumView.f30802OooO0o0;
                        VehicleStoreActivity.OooOoO0(this$0, item2, UserPremiumView.OooO00o.OooO0OO(PremiumLevel.Premium3));
                        return;
                    }
                    if (nVehicleTagType2 == 400) {
                        int i2 = UserPremiumView.f30802OooO0o0;
                        VehicleStoreActivity.OooOoO0(this$0, item2, UserPremiumView.OooO00o.OooO0OO(PremiumLevel.Premium4));
                        return;
                    }
                    if (nVehicleTagType2 == 500) {
                        int i3 = UserPremiumView.f30802OooO0o0;
                        VehicleStoreActivity.OooOoO0(this$0, item2, UserPremiumView.OooO00o.OooO0OO(PremiumLevel.Premium5));
                        return;
                    }
                    if (nVehicleTagType2 != 10) {
                        if (nVehicleTagType2 != 11) {
                            return;
                        }
                        Context context2 = this_run.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "context");
                        o0OO00O o0oo00o3 = new o0OO00O(context2);
                        o0oo00o3.OooOo00(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.vehicle_store_only_activity), item2.getVehicleTag()));
                        o0oo00o3.OooOO0o();
                        return;
                    }
                    o000000O o000000o3 = o000000O.f46674OooO00o;
                    T value2 = o000000O.OooOO0o().getValue();
                    Intrinsics.checkNotNull(value2);
                    Pair pair2 = (Pair) value2;
                    if (((Boolean) pair2.getFirst()).booleanValue() && ((Number) pair2.getSecond()).intValue() >= PremiumLevel.Premium3.getValue()) {
                        if (item2.getTimeLong() == -1) {
                            VehicleStoreActivity.OooOo(this$0, item2, o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.vehicle_store_buy_or_activity_permanent), String.valueOf(item2.getPrices()), item2.getVehicleTag()));
                            return;
                        } else {
                            VehicleStoreActivity.OooOo(this$0, item2, o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.vehicle_store_buy_or_activity_temp), String.valueOf(item2.getPrices()), String.valueOf(item2.getTimeLong()), item2.getVehicleTag()));
                            return;
                        }
                    }
                    Context context3 = this_run.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "context");
                    o0OO00O o0oo00o4 = new o0OO00O(context3);
                    o0oo00o4.OooOo00(o0000.OooO0OO(oO00OOo0.vehicle_store_only_vip2_buy_vehicle));
                    o0oo00o4.OooOOOo(o0000.OooO0OO(oO00OOo0.Get_Yalla_Premium));
                    o0oo00o4.OooOo0(new oo0O(this$0));
                    o0oo00o4.OooOo(true);
                    o0oo00o4.OooOO0o();
                }
            });
        }
        LinearLayout layoutPrice = (LinearLayout) helper.getView(oO00O0oO.layoutPrice);
        TextView textView3 = (TextView) helper.getView(oO00O0oO.tvPrice);
        TextView tvPromotionPrice = (TextView) helper.getView(oO00O0oO.tvPromotionPrice);
        TextView textView4 = (TextView) helper.getView(oO00O0oO.tvDays);
        if (layoutPrice != null) {
            o000OO00.OooOOOO(layoutPrice);
        }
        if (item.getNVehicleTagType() == 11 || item.getNVehicleTagType() == 300 || item.getNVehicleTagType() == 400 || item.getNVehicleTagType() == 500) {
            Intrinsics.checkNotNullExpressionValue(layoutPrice, "layoutPrice");
            o000OO00.OooO0O0(layoutPrice);
            return;
        }
        if (textView3 != null) {
            o000OO00.OooOOOO(textView3);
            oO000Oo.OooO00o(textView3, o0000.OooO0O0(oOo00OO0.icon_theme_coin), ViewLocation.start, OooO.OooO0o0());
            textView3.setText(String.valueOf(item.getPrice()));
            Intrinsics.checkNotNullExpressionValue(tvPromotionPrice, "tvPromotionPrice");
            o000OO00.OooO0O0(tvPromotionPrice);
            if (item.getPrice() > item.getPromotionPrice() && item.getPromotionPrice() > 0) {
                textView3.getPaint().setFlags(16);
                tvPromotionPrice.setText(String.valueOf(item.getPromotionPrice()));
                o000OO00.OooOOOO(tvPromotionPrice);
            }
        }
        if (textView4 != null) {
            textView4.setText(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.vehicle_store_xxx_days), OooO00o.OooO00o("/", item.getTimeLong())));
            o000OO00.OooOOOO(textView4);
            if (item.getTimeLong() == -1) {
                textView4.setText("");
                o000OO00.OooO0OO(textView4);
            }
        }
    }
}
