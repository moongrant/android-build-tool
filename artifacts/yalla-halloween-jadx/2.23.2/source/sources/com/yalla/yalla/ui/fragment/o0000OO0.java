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
import p205o00o0o0o.o000O;
import p384o0OOoo0O.Oooo0;
import p384o0OOoo0O.o00oO0o;
import p384o0OOoo0O.o0OO00O;
import p426o0OoO0o0.OooOOOO;
import p473o0OoooOo.o0OOOO0o;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000OO0 extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ SkillCardDataFragment.OooO0O0 f28371OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ SkillCardListModel.DataBean f28372OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ ViewHolder f28373OooO0oo;

    public o0000OO0(SkillCardDataFragment.OooO0O0 oooO0O0, SkillCardListModel.DataBean dataBean, ViewHolder viewHolder) {
        this.f28371OooO = oooO0O0;
        this.f28372OooO0oO = dataBean;
        this.f28373OooO0oo = viewHolder;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, o0o00oOO.o0oO0Ooo] */
    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(View view) {
        SkillCardListModel.DataBean dataBean;
        Integer numValueOf;
        Integer num;
        String str;
        String str2;
        SkillCardListModel.DataBean dataBean2 = this.f28372OooO0oO;
        if (dataBean2.warestype == 1 && dataBean2.state == 1) {
            return;
        }
        SkillCardDataFragment.OooO0O0 oooO0O0 = this.f28371OooO;
        PurchaseSkillCardActivity activity = (PurchaseSkillCardActivity) SkillCardDataFragment.this.getActivity();
        int i = SkillCardDataFragment.this.wareType;
        int layoutPosition = this.f28373OooO0oo.getLayoutPosition();
        if (i == 1) {
            dataBean = activity.f26523OooOOo.data1.get(layoutPosition);
        } else {
            dataBean = i == 2 ? activity.f26523OooOOo.data.get(layoutPosition) : activity.f26523OooOOo.data2.get(layoutPosition);
        }
        int i2 = Integer.parseInt(dataBean.promotionprice);
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Pair pair = (Pair) o0O00oO0.OooOO0o().getValue();
        if (((Boolean) pair.getFirst()).booleanValue() && ((Integer) pair.getSecond()).intValue() >= PremiumLevel.Premium5.getValue()) {
            i2 = Integer.parseInt(dataBean.discountprice);
        }
        int i3 = i2;
        int i4 = Integer.parseInt(dataBean.shopid);
        if (i4 != 10) {
            if (i4 != 38) {
                num = null;
            } else {
                numValueOf = Integer.valueOf(p562o0oOo000.o0Oo0oo.bg_wear_crazy_love_line);
            }
            String warnText = activity.getString(p562o0oOo000.o000000.cost) + " yyy " + activity.getString(p562o0oOo000.o000000.golds);
            if (num == null) {
                str = null;
                str2 = null;
            } else if (i == 1) {
                str = (String) o0O00oO0.OooO().getValue();
                str2 = dataBean.picurl;
            } else {
                str = dataBean.picurl;
                str2 = null;
            }
            ?? onConfirmClick = new Function1(dataBean, layoutPosition) { // from class: o0o00oOO.o0oO0Ooo

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public final /* synthetic */ SkillCardListModel.DataBean f50373OooO0o0;

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
                    int i6 = PurchaseSkillCardActivity.f26522OooOoO;
                    PurchaseSkillCardActivity purchaseSkillCardActivity = this.f50372OooO0Oo;
                    purchaseSkillCardActivity.getClass();
                    SkillCardListModel.DataBean dataBean3 = this.f50373OooO0o0;
                    if (dataBean3.lowestVIPLv > 0) {
                        o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                        if (((Boolean) ((Pair) o0O00oO0.OooOO0o().getValue()).getFirst()).booleanValue()) {
                            str3 = dataBean3.shopid;
                            jLongValue = l.longValue();
                            i5 = (int) jLongValue;
                            if (jLongValue == i5) {
                                throw new ArithmeticException();
                            }
                            o00oO0o o00oo0o2 = o0OO00O.f43462OooO00o;
                            o0oO0O0o o0oo0o0o2 = new o0oO0O0o(purchaseSkillCardActivity, App.f22232OooO0o);
                            o00oo0o2.getClass();
                            LinkedHashMap linkedHashMapOooO00o = OooOOOO.OooO00o();
                            linkedHashMapOooO00o.put("shopid", str3);
                            linkedHashMapOooO00o.put("num", i5 + "");
                            OooO0OO.OooO0O0(null, Oooo0.f43359OooOoo, Oooo0.f43383OoooOoo, linkedHashMapOooO00o, o0oo0o0o2);
                        } else {
                            o000O o000o = new o000O(purchaseSkillCardActivity);
                            o000o.OooOOoo(o000000.VIP_commodity);
                            o000o.OooOOOO(o000000.Get_Yalla_Premium);
                            o000o.OooOo0(new o0O00o00());
                            o000o.OooOo(true);
                            o000o.OooOO0o();
                        }
                    } else {
                        str3 = dataBean3.shopid;
                        jLongValue = l.longValue();
                        i5 = (int) jLongValue;
                        if (jLongValue == i5) {
                            throw new ArithmeticException();
                        }
                        o00oO0o o00oo0o3 = o0OO00O.f43462OooO00o;
                        o0oO0O0o o0oo0o0o3 = new o0oO0O0o(purchaseSkillCardActivity, App.f22232OooO0o);
                        o00oo0o3.getClass();
                        LinkedHashMap linkedHashMapOooO00o2 = OooOOOO.OooO00o();
                        linkedHashMapOooO00o2.put("shopid", str3);
                        linkedHashMapOooO00o2.put("num", i5 + "");
                        OooO0OO.OooO0O0(null, Oooo0.f43359OooOoo, Oooo0.f43383OoooOoo, linkedHashMapOooO00o2, o0oo0o0o3);
                    }
                    return null;
                }
            };
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(warnText, "warnText");
            Intrinsics.checkNotNullParameter(onConfirmClick, "onConfirmClick");
            activity.showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(-534252762, true, new p650o0ooo.o0000O0O(onConfirmClick, warnText, i3, str, str2, num)));
        }
        numValueOf = Integer.valueOf(p562o0oOo000.o0Oo0oo.bg_wear_crazy_nonsense);
        num = numValueOf;
        String warnText2 = activity.getString(p562o0oOo000.o000000.cost) + " yyy " + activity.getString(p562o0oOo000.o000000.golds);
        if (num == null) {
            str = null;
            str2 = null;
        } else if (i == 1) {
            str = (String) o0O00oO0.OooO().getValue();
            str2 = dataBean.picurl;
        } else {
            str = dataBean.picurl;
            str2 = null;
        }
        ?? onConfirmClick2 = new Function1(dataBean, layoutPosition) { // from class: o0o00oOO.o0oO0Ooo

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ SkillCardListModel.DataBean f50373OooO0o0;

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
                int i6 = PurchaseSkillCardActivity.f26522OooOoO;
                PurchaseSkillCardActivity purchaseSkillCardActivity = this.f50372OooO0Oo;
                purchaseSkillCardActivity.getClass();
                SkillCardListModel.DataBean dataBean3 = this.f50373OooO0o0;
                if (dataBean3.lowestVIPLv > 0) {
                    o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                    if (((Boolean) ((Pair) o0O00oO0.OooOO0o().getValue()).getFirst()).booleanValue()) {
                        str3 = dataBean3.shopid;
                        jLongValue = l.longValue();
                        i5 = (int) jLongValue;
                        if (jLongValue == i5) {
                            throw new ArithmeticException();
                        }
                        o00oO0o o00oo0o3 = o0OO00O.f43462OooO00o;
                        o0oO0O0o o0oo0o0o3 = new o0oO0O0o(purchaseSkillCardActivity, App.f22232OooO0o);
                        o00oo0o3.getClass();
                        LinkedHashMap linkedHashMapOooO00o2 = OooOOOO.OooO00o();
                        linkedHashMapOooO00o2.put("shopid", str3);
                        linkedHashMapOooO00o2.put("num", i5 + "");
                        OooO0OO.OooO0O0(null, Oooo0.f43359OooOoo, Oooo0.f43383OoooOoo, linkedHashMapOooO00o2, o0oo0o0o3);
                    } else {
                        o000O o000o = new o000O(purchaseSkillCardActivity);
                        o000o.OooOOoo(o000000.VIP_commodity);
                        o000o.OooOOOO(o000000.Get_Yalla_Premium);
                        o000o.OooOo0(new o0O00o00());
                        o000o.OooOo(true);
                        o000o.OooOO0o();
                    }
                } else {
                    str3 = dataBean3.shopid;
                    jLongValue = l.longValue();
                    i5 = (int) jLongValue;
                    if (jLongValue == i5) {
                        throw new ArithmeticException();
                    }
                    o00oO0o o00oo0o4 = o0OO00O.f43462OooO00o;
                    o0oO0O0o o0oo0o0o4 = new o0oO0O0o(purchaseSkillCardActivity, App.f22232OooO0o);
                    o00oo0o4.getClass();
                    LinkedHashMap linkedHashMapOooO00o3 = OooOOOO.OooO00o();
                    linkedHashMapOooO00o3.put("shopid", str3);
                    linkedHashMapOooO00o3.put("num", i5 + "");
                    OooO0OO.OooO0O0(null, Oooo0.f43359OooOoo, Oooo0.f43383OoooOoo, linkedHashMapOooO00o3, o0oo0o0o4);
                }
                return null;
            }
        };
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(warnText2, "warnText");
        Intrinsics.checkNotNullParameter(onConfirmClick2, "onConfirmClick");
        activity.showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(-534252762, true, new p650o0ooo.o0000O0O(onConfirmClick2, warnText2, i3, str, str2, num)));
    }
}
