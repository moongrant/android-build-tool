package com.yalla.yalla.ui.activity.room;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yalla.yalla.model.CategoryModel;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000Ooo extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ ExploreTagRoomListActivity f26386OooO0oO;

    public o0000Ooo(ExploreTagRoomListActivity exploreTagRoomListActivity) {
        this.f26386OooO0oO = exploreTagRoomListActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        StringBuilder sbOooO0O0;
        Intrinsics.checkNotNullParameter(view, "view");
        o0oo0000.OooO00o.OooO0O0("101088");
        ExploreTagRoomListActivity exploreTagRoomListActivity = this.f26386OooO0oO;
        ArrayList arrayList = exploreTagRoomListActivity.f26098OooOo00;
        if (arrayList.size() == 0) {
            return;
        }
        ArrayList arrayList2 = exploreTagRoomListActivity.f26100OooOo0o;
        int i = 1;
        if (arrayList2.isEmpty()) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                View viewInflate = View.inflate(exploreTagRoomListActivity, p562o0oOo000.oo0o0Oo.main_item_more_tag, null);
                Intrinsics.checkNotNull(viewInflate);
                arrayList2.add(viewInflate);
                TextView textView = (TextView) viewInflate.findViewById(p562o0oOo000.o0OO00O.tvTageName);
                if (p595o0oo00O.OooOo00.OooO0o0()) {
                    sbOooO0O0 = p037OoooOo0.o000O0o.OooO0O0(((CategoryModel) arrayList.get(i2)).labelname, "#");
                } else {
                    String str = ((CategoryModel) arrayList.get(i2)).labelname;
                    StringBuilder sb = new StringBuilder("#");
                    sb.append(str);
                    sbOooO0O0 = sb;
                }
                textView.setText(sbOooO0O0.toString());
                exploreTagRoomListActivity.OooOo().f44742OooO0OO.f44775OooO0O0.addView(viewInflate);
                viewInflate.setOnClickListener(new o0000O00(exploreTagRoomListActivity, i2));
            }
            exploreTagRoomListActivity.OooOo().f44742OooO0OO.f44777OooO0Oo.setOnClickListener(new androidx.media3.ui.o0Oo0oo(exploreTagRoomListActivity, i));
            exploreTagRoomListActivity.OooOo().f44742OooO0OO.f44776OooO0OO.setOnClickListener(new com.google.android.material.textfield.OooO0OO(exploreTagRoomListActivity, i));
        }
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            boolean z = exploreTagRoomListActivity.f26096OooOo == com.code.android.util.o0OoOo0.OooO0o(0, ((CategoryModel) arrayList.get(i3)).id);
            ((FrameLayout) ((View) arrayList2.get(i3)).findViewById(p562o0oOo000.o0OO00O.flMoreTag)).setSelected(z);
            ((TextView) ((View) arrayList2.get(i3)).findViewById(p562o0oOo000.o0OO00O.tvTageName)).setTextColor(com.code.android.util.o0000.OooO00o(z ? p562o0oOo000.o0OOO0o.color_333333 : p562o0oOo000.o0OOO0o.color_5f5f5f));
        }
        LinearLayout llTagRoot = exploreTagRoomListActivity.OooOo().f44742OooO0OO.f44777OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(llTagRoot, "llTagRoot");
        com.code.android.util.o000O.OooOOOO(llTagRoot);
    }
}
