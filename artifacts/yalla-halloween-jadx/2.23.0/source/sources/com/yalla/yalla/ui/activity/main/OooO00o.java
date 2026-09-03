package com.yalla.yalla.ui.activity.main;

import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o extends o000O<ChangeRegionActivity.OooO00o> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ ChangeRegionActivity f25436OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(ChangeRegionActivity changeRegionActivity, int i, ArrayList<ChangeRegionActivity.OooO00o> arrayList) {
        super(i, changeRegionActivity, arrayList);
        this.f25436OooOoo0 = changeRegionActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        ChangeRegionActivity.OooO00o item = (ChangeRegionActivity.OooO00o) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int i = oO00O0oO.tv_language;
        helper.setText(i, item.f25386OooO00o);
        ChangeRegionActivity changeRegionActivity = this.f25436OooOoo0;
        int i2 = changeRegionActivity.f25382OooOo0;
        if (i2 == -1) {
            i2 = changeRegionActivity.f25383OooOo00;
        }
        if (item.f25387OooO0O0 == i2) {
            helper.setTextColor(i, o0000.OooO00o(oO00O0o.color_00d8c9));
            helper.setGone(oO00O0oO.iv_language_selected, true);
        } else {
            helper.setTextColor(i, o0000.OooO00o(oO00O0o.color_alpha_87));
            helper.setGone(oO00O0oO.iv_language_selected, false);
        }
    }
}
