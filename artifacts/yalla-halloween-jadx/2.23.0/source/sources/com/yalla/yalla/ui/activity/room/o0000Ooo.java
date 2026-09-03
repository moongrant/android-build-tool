package com.yalla.yalla.ui.activity.room;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yalla.yalla.model.CategoryModel;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000Ooo extends p466o0Oooo0o.oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ ExploreTagRoomListActivity f26838OooO0oO;

    public o0000Ooo(ExploreTagRoomListActivity exploreTagRoomListActivity) {
        this.f26838OooO0oO = exploreTagRoomListActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        StringBuilder sbOooO0O0;
        Intrinsics.checkNotNullParameter(view, "view");
        p587o0oOooo.o0OO000.OooO00o("101088");
        ExploreTagRoomListActivity exploreTagRoomListActivity = this.f26838OooO0oO;
        ArrayList arrayList = exploreTagRoomListActivity.f26550OooOo00;
        if (arrayList.size() == 0) {
            return;
        }
        ArrayList arrayList2 = exploreTagRoomListActivity.f26552OooOo0o;
        int i = 0;
        if (arrayList2.isEmpty()) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = View.inflate(exploreTagRoomListActivity, oO00OO0O.main_item_more_tag, null);
                Intrinsics.checkNotNullExpressionValue(view2, "view");
                arrayList2.add(view2);
                TextView textView = (TextView) view2.findViewById(oO00O0oO.tvTageName);
                if (p591o0oo000O.OooO.OooO0o0()) {
                    sbOooO0O0 = p037OoooOo0.o000Oo0.OooO0O0(((CategoryModel) arrayList.get(i2)).labelname, "#");
                } else {
                    String str = ((CategoryModel) arrayList.get(i2)).labelname;
                    StringBuilder sb = new StringBuilder("#");
                    sb.append(str);
                    sbOooO0O0 = sb;
                }
                textView.setText(sbOooO0O0.toString());
                exploreTagRoomListActivity.OooOo().f58582OooO0OO.f57811OooO0O0.addView(view2);
                view2.setOnClickListener(new o0000oo(exploreTagRoomListActivity, i2));
            }
            exploreTagRoomListActivity.OooOo().f58582OooO0OO.f57813OooO0Oo.setOnClickListener(new o00000OO(exploreTagRoomListActivity, i));
            exploreTagRoomListActivity.OooOo().f58582OooO0OO.f57812OooO0OO.setOnClickListener(new androidx.media3.ui.OooOOO(exploreTagRoomListActivity, 2));
        }
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            boolean z = exploreTagRoomListActivity.f26548OooOo == com.code.android.util.o0OoOo0.OooO0o(0, ((CategoryModel) arrayList.get(i3)).id);
            ((FrameLayout) ((View) arrayList2.get(i3)).findViewById(oO00O0oO.flMoreTag)).setSelected(z);
            ((TextView) ((View) arrayList2.get(i3)).findViewById(oO00O0oO.tvTageName)).setTextColor(com.code.android.util.o0000.OooO00o(z ? oO00O0o.color_333333 : oO00O0o.color_5f5f5f));
        }
        LinearLayout linearLayout = exploreTagRoomListActivity.OooOo().f58582OooO0OO.f57813OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llTags.llTagRoot");
        com.code.android.util.o000OO00.OooOOOO(linearLayout);
    }
}
