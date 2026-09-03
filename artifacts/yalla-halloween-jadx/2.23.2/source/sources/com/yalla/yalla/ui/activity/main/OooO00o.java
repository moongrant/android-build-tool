package com.yalla.yalla.ui.activity.main;

import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p571o0oOoO0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o extends o0000oo<ChangeRegionActivity.OooO00o> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ ChangeRegionActivity f24982OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(ChangeRegionActivity changeRegionActivity, int i, ArrayList<ChangeRegionActivity.OooO00o> arrayList) {
        super(i, changeRegionActivity, arrayList);
        this.f24982OooOoo0 = changeRegionActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        ChangeRegionActivity.OooO00o item = (ChangeRegionActivity.OooO00o) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int i = o0OO00O.tv_language;
        helper.setText(i, item.f24932OooO00o);
        ChangeRegionActivity changeRegionActivity = this.f24982OooOoo0;
        int i2 = changeRegionActivity.f24928OooOo0;
        if (i2 == -1) {
            i2 = changeRegionActivity.f24929OooOo00;
        }
        if (item.f24933OooO0O0 == i2) {
            helper.setTextColor(i, o0000.OooO00o(o0OOO0o.color_00d8c9));
            helper.setGone(o0OO00O.iv_language_selected, true);
        } else {
            helper.setTextColor(i, o0000.OooO00o(o0OOO0o.color_alpha_87));
            helper.setGone(o0OO00O.iv_language_selected, false);
        }
    }
}
