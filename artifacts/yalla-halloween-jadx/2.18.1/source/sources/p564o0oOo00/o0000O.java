package p564o0oOo00;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.base.framework.view.textView.ViewLocation;
import com.chad.library.adapter.base.OooO00o;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOo;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import com.yalla.yalla.ui.activity.store.VehicleStoreActivity;
import com.yalla.yalla.util.netimage.NetImageView;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p028Oooo0o0.o00O0O0O;
import p152o00Oo0o0.o00Oo00;
import p168o00Ooo0.oo000o;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p255o00ooO0o.oo0oOO0;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O extends OooO0OO<ShopVehicleListModel> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ VehicleStoreActivity f45141OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O(VehicleStoreActivity vehicleStoreActivity) {
        super(vehicleStoreActivity, R.layout.user_activity_vehicle_store_item);
        this.f45141OooO00o = vehicleStoreActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o helper = (OooO0o) oooO00o;
        final ShopVehicleListModel item = (ShopVehicleListModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        TextView textView = (TextView) helper.OooO0Oo(R.id.tvLimitTime);
        Intrinsics.checkNotNullExpressionValue(textView, "");
        o00O0O.OooO0O0(textView);
        textView.setTextColor(o000O0O0.OooO00o(R.color.white_));
        textView.setBackgroundResource(R.drawable.user_all_head_bg_ff5b48);
        o00Oo00.OooO00o(textView, OooOOO.OooO0O0(R.drawable.user_ic_vehicle_limit_time_store), ViewLocation.start, oo000o.OooO0o0());
        if (item.getLimitNum() > 0 && (item.getNVehicleTagType() == 0 || item.getNVehicleTagType() == 10)) {
            o00O0O.OooO(textView);
            textView.setText(OooOo.OooO00o(OooOOO.OooO0OO(R.string.vehicle_store_xxx_days), String.valueOf(item.getLimitNum())));
        }
        View viewOooO0Oo = helper.OooO0Oo(R.id.ivImage);
        Intrinsics.checkNotNullExpressionValue(viewOooO0Oo, "helper.getView(R.id.ivImage)");
        NetImageView netImageView = (NetImageView) viewOooO0Oo;
        View viewOooO0Oo2 = helper.OooO0Oo(R.id.ivPlay);
        Intrinsics.checkNotNullExpressionValue(viewOooO0Oo2, "helper.getView(R.id.ivPlay)");
        try {
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getContext());
            oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgFormat(item.getPic());
            oooO00o2.f48427OooO00o = 0;
            oooO00o2.f48441OooOOOo = R.drawable.icon_vehicel_placeholder;
            oooO00o2.OooO0o(netImageView);
        } catch (Exception e) {
            e.printStackTrace();
        }
        TextView textView2 = (TextView) helper.OooO0Oo(R.id.tvVehicleTag);
        if (textView2 != null) {
            textView2.setText(item.getVehicleTag());
            o00O0O.OooO(textView2);
            int nVehicleTagType = item.getNVehicleTagType();
            if (nVehicleTagType == 10 || nVehicleTagType == 11) {
                textView2.setTextColor(o000O0O0.OooO00o(R.color.color_4A90E2));
                textView2.setBackgroundColor(o000O0O0.OooO00o(R.color.color_E4EFFB));
            } else if (nVehicleTagType == 300) {
                textView2.setTextColor(o000O0O0.OooO00o(R.color.color_FF5B48));
                textView2.setBackgroundColor(o000O0O0.OooO00o(R.color.color_FFE7E4));
                textView2.setText(OooOOO.OooO0OO(R.string.vehicle_store_tag_vip300));
            } else if (nVehicleTagType == 400) {
                textView2.setTextColor(o000O0O0.OooO00o(R.color.color_FF5B48));
                textView2.setBackgroundColor(o000O0O0.OooO00o(R.color.color_FFE7E4));
                textView2.setText(OooOOO.OooO0OO(R.string.vehicle_store_tag_vip400));
            } else if (nVehicleTagType != 500) {
                o00O0O.OooO0O0(textView2);
            } else {
                textView2.setTextColor(o000O0O0.OooO00o(R.color.color_FF5B48));
                textView2.setBackgroundColor(o000O0O0.OooO00o(R.color.color_FFE7E4));
                textView2.setText(OooOOO.OooO0OO(R.string.vehicle_store_tag_vip5));
            }
        }
        final TextView textView3 = (TextView) helper.OooO0Oo(R.id.tvPurchase);
        if (textView3 != null) {
            final VehicleStoreActivity vehicleStoreActivity = this.f45141OooO00o;
            if (item.getIsHave() == 1) {
                textView3.setBackground(OooOOO.OooO0O0(R.drawable.shape_bg_room_theme_item_sold_out));
                textView3.setText((item.getNVehicleTagType() == 0 || item.getNVehicleTagType() == 10) ? OooOOO.OooO0OO(R.string.Purchased) : OooOOO.OooO0OO(R.string.Obtained));
            } else {
                textView3.setBackground(OooOOO.OooO0O0(R.drawable.shape_bg_room_theme_item_buy));
                textView3.setText((item.getNVehicleTagType() == 0 || item.getNVehicleTagType() == 10) ? OooOOO.OooO0OO(R.string.Purchase) : OooOOO.OooO0OO(R.string.Obtain));
            }
            textView3.setOnClickListener(new View.OnClickListener() { // from class: o0oOo00.o0000O0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ShopVehicleListModel item2 = item;
                    VehicleStoreActivity this$0 = vehicleStoreActivity;
                    TextView this_run = textView3;
                    Intrinsics.checkNotNullParameter(item2, "$item");
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(this_run, "$this_run");
                    if (item2.getIsHave() == 1) {
                        String strOooO0OO = OooOOO.OooO0OO(R.string.vehicle_store_you_have_vehicle);
                        ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                        if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
                            return;
                        }
                        o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O0.run();
                            return;
                        } else {
                            o00O000 o00o001 = o00O000.f34346OooO00o;
                            o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                            return;
                        }
                    }
                    int nVehicleTagType2 = item2.getNVehicleTagType();
                    if (nVehicleTagType2 == 0) {
                        Pair<Boolean, Integer> value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOOO0().getValue();
                        Intrinsics.checkNotNull(value);
                        Pair<Boolean, Integer> pair = value;
                        if (pair.getFirst().booleanValue() && pair.getSecond().intValue() >= PremiumLevel.Premium3.getValue()) {
                            if (item2.getTimeLong() == -1) {
                                VehicleStoreActivity.OooOoo(this$0, item2, OooOo.OooO00o(OooOOO.OooO0OO(R.string.vehicle_store_buy_permanent), String.valueOf(item2.getPrices())));
                                return;
                            } else {
                                VehicleStoreActivity.OooOoo(this$0, item2, OooOo.OooO00o(OooOOO.OooO0OO(R.string.vehicle_store_buy_temp), String.valueOf(item2.getPrices()), String.valueOf(item2.getTimeLong())));
                                return;
                            }
                        }
                        Context context = this_run.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "context");
                        oo0oOO0 oo0ooo0 = new oo0oOO0(context);
                        oo0ooo0.OooOo0O(OooOOO.OooO0OO(R.string.vehicle_store_only_vip2_buy_vehicle));
                        oo0ooo0.OooOOo0(OooOOO.OooO0OO(R.string.Get_Yalla_Premium));
                        oo0ooo0.OooOo0o(new o0000O0O(this$0));
                        oo0ooo0.OooOoOO(true);
                        oo0ooo0.OooOOO0();
                        return;
                    }
                    if (nVehicleTagType2 == 300) {
                        VehicleStoreActivity.OooOooO(this$0, item2, UserPremiumView.f21052OoooO00.OooO0OO(PremiumLevel.Premium3));
                        return;
                    }
                    if (nVehicleTagType2 == 400) {
                        VehicleStoreActivity.OooOooO(this$0, item2, UserPremiumView.f21052OoooO00.OooO0OO(PremiumLevel.Premium4));
                        return;
                    }
                    if (nVehicleTagType2 == 500) {
                        VehicleStoreActivity.OooOooO(this$0, item2, UserPremiumView.f21052OoooO00.OooO0OO(PremiumLevel.Premium5));
                        return;
                    }
                    if (nVehicleTagType2 != 10) {
                        if (nVehicleTagType2 != 11) {
                            return;
                        }
                        Context context2 = this_run.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "context");
                        oo0oOO0 oo0ooo1 = new oo0oOO0(context2);
                        oo0ooo1.OooOo0O(OooOo.OooO00o(OooOOO.OooO0OO(R.string.vehicle_store_only_activity), item2.getVehicleTag()));
                        oo0ooo1.OooOOO0();
                        return;
                    }
                    Pair<Boolean, Integer> value2 = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOOO0().getValue();
                    Intrinsics.checkNotNull(value2);
                    Pair<Boolean, Integer> pair2 = value2;
                    if (pair2.getFirst().booleanValue() && pair2.getSecond().intValue() >= PremiumLevel.Premium3.getValue()) {
                        if (item2.getTimeLong() == -1) {
                            VehicleStoreActivity.OooOoo(this$0, item2, OooOo.OooO00o(OooOOO.OooO0OO(R.string.vehicle_store_buy_or_activity_permanent), String.valueOf(item2.getPrices()), item2.getVehicleTag()));
                            return;
                        } else {
                            VehicleStoreActivity.OooOoo(this$0, item2, OooOo.OooO00o(OooOOO.OooO0OO(R.string.vehicle_store_buy_or_activity_temp), String.valueOf(item2.getPrices()), String.valueOf(item2.getTimeLong()), item2.getVehicleTag()));
                            return;
                        }
                    }
                    Context context3 = this_run.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "context");
                    oo0oOO0 oo0ooo2 = new oo0oOO0(context3);
                    oo0ooo2.OooOo0O(OooOOO.OooO0OO(R.string.vehicle_store_only_vip2_buy_vehicle));
                    oo0ooo2.OooOOo0(OooOOO.OooO0OO(R.string.Get_Yalla_Premium));
                    oo0ooo2.OooOo0o(new o000OO(this$0));
                    oo0ooo2.OooOoOO(true);
                    oo0ooo2.OooOOO0();
                }
            });
        }
        LinearLayout layoutPrice = (LinearLayout) helper.OooO0Oo(R.id.layoutPrice);
        TextView textView4 = (TextView) helper.OooO0Oo(R.id.tvPrice);
        TextView tvPromotionPrice = (TextView) helper.OooO0Oo(R.id.tvPromotionPrice);
        TextView textView5 = (TextView) helper.OooO0Oo(R.id.tvDays);
        if (layoutPrice != null) {
            o00O0O.OooO(layoutPrice);
        }
        if (item.getNVehicleTagType() == 11 || item.getNVehicleTagType() == 300 || item.getNVehicleTagType() == 400 || item.getNVehicleTagType() == 500) {
            Intrinsics.checkNotNullExpressionValue(layoutPrice, "layoutPrice");
            o00O0O.OooO00o(layoutPrice);
            return;
        }
        if (textView4 != null) {
            o00O0O.OooO(textView4);
            o00Oo00.OooO00o(textView4, OooOOO.OooO0O0(R.drawable.icon_theme_coin), ViewLocation.start, oo000o.OooO0o0());
            textView4.setText(String.valueOf(item.getPrice()));
            Intrinsics.checkNotNullExpressionValue(tvPromotionPrice, "tvPromotionPrice");
            o00O0O.OooO00o(tvPromotionPrice);
            if (item.getPrice() > item.getPromotionPrice() && item.getPromotionPrice() > 0) {
                textView4.getPaint().setFlags(16);
                tvPromotionPrice.setText(String.valueOf(item.getPromotionPrice()));
                o00O0O.OooO(tvPromotionPrice);
            }
        }
        if (textView5 != null) {
            String strOooO0OO = OooOOO.OooO0OO(R.string.vehicle_store_xxx_days);
            StringBuilder sbOooO00o = o00O0O0O.OooO00o('/');
            sbOooO00o.append(item.getTimeLong());
            textView5.setText(OooOo.OooO00o(strOooO0OO, sbOooO00o.toString()));
            o00O0O.OooO(textView5);
            if (item.getTimeLong() == -1) {
                textView5.setText("");
                o00O0O.OooO0O0(textView5);
            }
        }
    }
}
