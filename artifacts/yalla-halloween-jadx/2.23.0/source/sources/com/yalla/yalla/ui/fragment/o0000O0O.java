package com.yalla.yalla.ui.fragment;

import android.view.View;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yalla.yalla.app.application.App;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.SkillCardListModel;
import com.yalla.yalla.ui.activity.store.PurchaseSkillCardActivity;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p157o00OoOO0.o0OO00O;
import p377o0OOoOo.o0000O;
import p377o0OOoOo.o000O00O;
import p377o0OOoOo.o000O0O0;
import p464o0Oooo.o000000O;
import p466o0Oooo0o.oo00o;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O0O extends oo00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ SkillCardDataFragment.OooO0O0 f28901OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ SkillCardListModel.DataBean f28902OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ ViewHolder f28903OooO0oo;

    public o0000O0O(SkillCardDataFragment.OooO0O0 oooO0O0, SkillCardListModel.DataBean dataBean, ViewHolder viewHolder) {
        this.f28901OooO = oooO0O0;
        this.f28902OooO0oO = dataBean;
        this.f28903OooO0oo = viewHolder;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, o0o00o0O.o000Oo0] */
    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(View view) {
        SkillCardListModel.DataBean dataBean;
        Integer numValueOf;
        Integer num;
        String str;
        String str2;
        SkillCardListModel.DataBean dataBean2 = this.f28902OooO0oO;
        if (dataBean2.warestype == 1 && dataBean2.state == 1) {
            return;
        }
        SkillCardDataFragment.OooO0O0 oooO0O0 = this.f28901OooO;
        PurchaseSkillCardActivity activity = (PurchaseSkillCardActivity) SkillCardDataFragment.this.getActivity();
        int i = SkillCardDataFragment.this.wareType;
        int layoutPosition = this.f28903OooO0oo.getLayoutPosition();
        if (i == 1) {
            dataBean = activity.f26988OooOOo.data1.get(layoutPosition);
        } else {
            dataBean = i == 2 ? activity.f26988OooOOo.data.get(layoutPosition) : activity.f26988OooOOo.data2.get(layoutPosition);
        }
        int i2 = Integer.parseInt(dataBean.promotionprice);
        p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
        Pair pair = (Pair) p464o0Oooo.o000000O.OooOO0o().getValue();
        if (((Boolean) pair.getFirst()).booleanValue() && ((Integer) pair.getSecond()).intValue() >= PremiumLevel.Premium5.getValue()) {
            i2 = Integer.parseInt(dataBean.discountprice);
        }
        int i3 = i2;
        int i4 = Integer.parseInt(dataBean.shopid);
        if (i4 != 10) {
            if (i4 != 38) {
                num = null;
            } else {
                numValueOf = Integer.valueOf(oOo00OO0.bg_wear_crazy_love_line);
            }
            String warnText = activity.getString(oO00OOo0.cost) + " yyy " + activity.getString(oO00OOo0.golds);
            if (num == null) {
                str = null;
                str2 = null;
            } else if (i == 1) {
                str = (String) p464o0Oooo.o000000O.OooO().getValue();
                str2 = dataBean.picurl;
            } else {
                str = dataBean.picurl;
                str2 = null;
            }
            ?? onConfirmClick = new Function1(dataBean, layoutPosition) { // from class: o0o00o0O.o000Oo0

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public final /* synthetic */ SkillCardListModel.DataBean f49377OooO0o0;

                /* JADX WARN: Code duplicated, block: B:11:0x0086  */
                /* JADX WARN: Code duplicated, block: B:7:0x0047  */
                /* JADX WARN: Code duplicated, block: B:9:0x0053  */
                /* JADX WARN: Instruction removed from duplicated block: B:9:0x0053, please report this as an issue */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str3;
                    long jLongValue;
                    int i5;
                    Long l = (Long) obj;
                    int i6 = PurchaseSkillCardActivity.f26987OooOoO;
                    PurchaseSkillCardActivity purchaseSkillCardActivity = this.f49376OooO0Oo;
                    purchaseSkillCardActivity.getClass();
                    SkillCardListModel.DataBean dataBean3 = this.f49377OooO0o0;
                    if (dataBean3.lowestVIPLv > 0) {
                        o000000O o000000o3 = o000000O.f46674OooO00o;
                        if (((Boolean) ((Pair) o000000O.OooOO0o().getValue()).getFirst()).booleanValue()) {
                            str3 = dataBean3.shopid;
                            jLongValue = l.longValue();
                            i5 = (int) jLongValue;
                            if (jLongValue == i5) {
                                throw new ArithmeticException();
                            }
                            o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
                            o000O0Oo o000o0oo2 = new o000O0Oo(purchaseSkillCardActivity, App.f22702OooO0o);
                            o000o00o2.getClass();
                            LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
                            linkedHashMapOooO00o.put("shopid", str3);
                            linkedHashMapOooO00o.put("num", i5 + "");
                            OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44124OoooOoo, linkedHashMapOooO00o, o000o0oo2);
                        } else {
                            o0OO00O o0oo00o2 = new o0OO00O(purchaseSkillCardActivity);
                            o0oo00o2.OooOOoo(oO00OOo0.VIP_commodity);
                            o0oo00o2.OooOOOO(oO00OOo0.Get_Yalla_Premium);
                            o0oo00o2.OooOo0(new o000O00());
                            o0oo00o2.OooOo(true);
                            o0oo00o2.OooOO0o();
                        }
                    } else {
                        str3 = dataBean3.shopid;
                        jLongValue = l.longValue();
                        i5 = (int) jLongValue;
                        if (jLongValue == i5) {
                            throw new ArithmeticException();
                        }
                        o000O00O o000o00o3 = o000O0O0.f44226OooO00o;
                        o000O0Oo o000o0oo3 = new o000O0Oo(purchaseSkillCardActivity, App.f22702OooO0o);
                        o000o00o3.getClass();
                        LinkedHashMap linkedHashMapOooO00o2 = oO00o000.OooO00o();
                        linkedHashMapOooO00o2.put("shopid", str3);
                        linkedHashMapOooO00o2.put("num", i5 + "");
                        OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44124OoooOoo, linkedHashMapOooO00o2, o000o0oo3);
                    }
                    return null;
                }
            };
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(warnText, "warnText");
            Intrinsics.checkNotNullParameter(onConfirmClick, "onConfirmClick");
            activity.showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(-534252762, true, new p519o0o0O0oO.o000O00O(onConfirmClick, warnText, i3, str, str2, num)));
        }
        numValueOf = Integer.valueOf(oOo00OO0.bg_wear_crazy_nonsense);
        num = numValueOf;
        String warnText2 = activity.getString(oO00OOo0.cost) + " yyy " + activity.getString(oO00OOo0.golds);
        if (num == null) {
            str = null;
            str2 = null;
        } else if (i == 1) {
            str = (String) p464o0Oooo.o000000O.OooO().getValue();
            str2 = dataBean.picurl;
        } else {
            str = dataBean.picurl;
            str2 = null;
        }
        ?? onConfirmClick2 = new Function1(dataBean, layoutPosition) { // from class: o0o00o0O.o000Oo0

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ SkillCardListModel.DataBean f49377OooO0o0;

            /* JADX WARN: Code duplicated, block: B:11:0x0086  */
            /* JADX WARN: Code duplicated, block: B:7:0x0047  */
            /* JADX WARN: Code duplicated, block: B:9:0x0053  */
            /* JADX WARN: Instruction removed from duplicated block: B:9:0x0053, please report this as an issue */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str3;
                long jLongValue;
                int i5;
                Long l = (Long) obj;
                int i6 = PurchaseSkillCardActivity.f26987OooOoO;
                PurchaseSkillCardActivity purchaseSkillCardActivity = this.f49376OooO0Oo;
                purchaseSkillCardActivity.getClass();
                SkillCardListModel.DataBean dataBean3 = this.f49377OooO0o0;
                if (dataBean3.lowestVIPLv > 0) {
                    o000000O o000000o3 = o000000O.f46674OooO00o;
                    if (((Boolean) ((Pair) o000000O.OooOO0o().getValue()).getFirst()).booleanValue()) {
                        str3 = dataBean3.shopid;
                        jLongValue = l.longValue();
                        i5 = (int) jLongValue;
                        if (jLongValue == i5) {
                            throw new ArithmeticException();
                        }
                        o000O00O o000o00o3 = o000O0O0.f44226OooO00o;
                        o000O0Oo o000o0oo3 = new o000O0Oo(purchaseSkillCardActivity, App.f22702OooO0o);
                        o000o00o3.getClass();
                        LinkedHashMap linkedHashMapOooO00o2 = oO00o000.OooO00o();
                        linkedHashMapOooO00o2.put("shopid", str3);
                        linkedHashMapOooO00o2.put("num", i5 + "");
                        OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44124OoooOoo, linkedHashMapOooO00o2, o000o0oo3);
                    } else {
                        o0OO00O o0oo00o2 = new o0OO00O(purchaseSkillCardActivity);
                        o0oo00o2.OooOOoo(oO00OOo0.VIP_commodity);
                        o0oo00o2.OooOOOO(oO00OOo0.Get_Yalla_Premium);
                        o0oo00o2.OooOo0(new o000O00());
                        o0oo00o2.OooOo(true);
                        o0oo00o2.OooOO0o();
                    }
                } else {
                    str3 = dataBean3.shopid;
                    jLongValue = l.longValue();
                    i5 = (int) jLongValue;
                    if (jLongValue == i5) {
                        throw new ArithmeticException();
                    }
                    o000O00O o000o00o4 = o000O0O0.f44226OooO00o;
                    o000O0Oo o000o0oo4 = new o000O0Oo(purchaseSkillCardActivity, App.f22702OooO0o);
                    o000o00o4.getClass();
                    LinkedHashMap linkedHashMapOooO00o3 = oO00o000.OooO00o();
                    linkedHashMapOooO00o3.put("shopid", str3);
                    linkedHashMapOooO00o3.put("num", i5 + "");
                    OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44124OoooOoo, linkedHashMapOooO00o3, o000o0oo4);
                }
                return null;
            }
        };
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(warnText2, "warnText");
        Intrinsics.checkNotNullParameter(onConfirmClick2, "onConfirmClick");
        activity.showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(-534252762, true, new p519o0o0O0oO.o000O00O(onConfirmClick2, warnText2, i3, str, str2, num)));
    }
}
