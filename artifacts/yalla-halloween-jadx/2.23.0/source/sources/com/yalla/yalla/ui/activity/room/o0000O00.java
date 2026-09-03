package com.yalla.yalla.ui.activity.room;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import androidx.viewpager2.widget.ViewPager2;
import com.yalla.yalla.model.CategoryModel;
import com.yalla.yalla.ui.fragment.ExploreTagRoomListFragment;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import p584o0oOooO0.oO00O0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O00 implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ExploreTagRoomListActivity f26835OooO0Oo;

    public o0000O00(ExploreTagRoomListActivity exploreTagRoomListActivity) {
        this.f26835OooO0Oo = exploreTagRoomListActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(@NotNull Object it) {
        int i;
        StringBuilder sbOooO0O0;
        Intrinsics.checkNotNullParameter(it, "it");
        List listAsMutableList = TypeIntrinsics.asMutableList(it);
        ExploreTagRoomListActivity exploreTagRoomListActivity = this.f26835OooO0Oo;
        exploreTagRoomListActivity.f26550OooOo00.clear();
        ArrayList arrayList = exploreTagRoomListActivity.f26549OooOo0;
        arrayList.clear();
        ArrayList arrayList2 = exploreTagRoomListActivity.f26551OooOo0O;
        arrayList2.clear();
        if (listAsMutableList.size() > 0) {
            int size = listAsMutableList.size();
            i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                if (exploreTagRoomListActivity.f26548OooOo == com.code.android.util.o0OoOo0.OooO0o(0, ((CategoryModel) listAsMutableList.get(i2)).id)) {
                    exploreTagRoomListActivity.OooOo00(((CategoryModel) listAsMutableList.get(i2)).labelname);
                    i = i2;
                }
                if (p591o0oo000O.OooO.OooO0o0()) {
                    sbOooO0O0 = p037OoooOo0.o000Oo0.OooO0O0(((CategoryModel) listAsMutableList.get(i2)).labelname, "#");
                } else {
                    String str = ((CategoryModel) listAsMutableList.get(i2)).labelname;
                    StringBuilder sb = new StringBuilder("#");
                    sb.append(str);
                    sbOooO0O0 = sb;
                }
                arrayList.add(sbOooO0O0.toString());
                try {
                    Result.Companion companion = Result.INSTANCE;
                    Result.m4213constructorimpl(Boolean.valueOf(arrayList2.add(new ExploreTagRoomListFragment(com.code.android.util.o0OoOo0.OooO0o(0, ((CategoryModel) listAsMutableList.get(i2)).id)))));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m4213constructorimpl(ResultKt.createFailure(th));
                }
            }
            ConstraintLayout constraintLayout = exploreTagRoomListActivity.OooOo().f58583OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.topLayout");
            com.code.android.util.o000OO00.OooOOOO(constraintLayout);
            exploreTagRoomListActivity.f26550OooOo00.addAll(listAsMutableList);
        } else {
            ConstraintLayout constraintLayout2 = exploreTagRoomListActivity.OooOo().f58583OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.topLayout");
            com.code.android.util.o000OO00.OooO0O0(constraintLayout2);
            i = 0;
        }
        Context context = exploreTagRoomListActivity.OooOo().f58585OooO0o0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "binding.vpMoreRoom.context");
        Intrinsics.checkNotNullParameter(context, "context");
        o0oOOoo.o0oO0O0o.OooO00o oooO00o = new o0oOOoo.o0oO0O0o.OooO00o(context);
        oooO00o.OooO0O0(arrayList);
        oooO00o.f56022OooO0o0 = com.code.android.util.o0000.OooO00o(oO00O0o.color_333333);
        oooO00o.f56024OooO0oo = com.code.android.util.o0000.OooO00o(oO00O0o.color_999999);
        float f = 8;
        oooO00o.f56037OooOo0O = com.code.android.util.o0000O0.OooO00o(f);
        oooO00o.f56020OooO0Oo = 15.0f;
        oooO00o.f56019OooO0OO = 15.0f;
        oooO00o.f56035OooOo0 = com.code.android.util.o0000O0.OooO00o(f);
        oooO00o.f56024OooO0oo = com.code.android.util.o0000.OooO00o(oO00O0o.color_alpha_38_A3);
        ViewPager2 viewPager2 = exploreTagRoomListActivity.OooOo().f58585OooO0o0;
        Intrinsics.checkNotNullExpressionValue(viewPager2, "binding.vpMoreRoom");
        oooO00o.OooO0OO(viewPager2);
        oooO00o.f56016OooO = com.code.android.util.o0000O0.OooO00o(2);
        oooO00o.f56025OooOO0 = com.code.android.util.o0000.OooO00o(oO00O0o.color_00d8c9);
        oooO00o.f56026OooOO0O = com.code.android.util.o0000O0.OooO00o(11);
        oooO00o.f56027OooOO0o = com.code.android.util.o0000O0.OooO00o(3);
        oooO00o.f56017OooO00o.setAdjustMode(false);
        YlTableLayout ylTableLayout = exploreTagRoomListActivity.OooOo().f58584OooO0o;
        Intrinsics.checkNotNullExpressionValue(ylTableLayout, "binding.ylMoreRoom");
        oooO00o.OooO00o(ylTableLayout);
        exploreTagRoomListActivity.OooOo().f58585OooO0o0.setOffscreenPageLimit(arrayList2.size());
        exploreTagRoomListActivity.OooOo().f58585OooO0o0.setAdapter(exploreTagRoomListActivity.f26554OooOoO0);
        exploreTagRoomListActivity.OooOo().f58585OooO0o0.setCurrentItem(i);
    }
}
