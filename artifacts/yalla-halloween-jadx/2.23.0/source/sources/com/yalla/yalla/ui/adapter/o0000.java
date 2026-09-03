package com.yalla.yalla.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.model.CategoryModel;
import com.yalla.yalla.ui.activity.room.ExploreTagRoomListActivity;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000 extends p466o0Oooo0o.oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ RecAdapterTag f27463OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f27464OooO0oo;

    public o0000(RecAdapterTag recAdapterTag, int i) {
        this.f27463OooO0oO = recAdapterTag;
        this.f27464OooO0oo = i;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        RecAdapterTag recAdapterTag = this.f27463OooO0oO;
        List<CategoryModel> list = recAdapterTag.f27449OooO00o;
        int i = this.f27464OooO0oo;
        o0OO000.OooO0O0("101025", MapsKt.mapOf(new Pair("tagid", list.get(i).id)));
        Observable<Object> observable = LiveEventBus.get("EXPLORE_TAGS_DATA");
        List<CategoryModel> list2 = recAdapterTag.f27449OooO00o;
        observable.post(list2);
        int i2 = ExploreTagRoomListActivity.f26546OooOoOO;
        Context context = recAdapterTag.f27450OooO0O0;
        Intrinsics.checkNotNull(context);
        int iOooO0o0 = com.code.android.util.o000000.OooO0o0(list2.get(i).id);
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, (Class<?>) ExploreTagRoomListActivity.class);
        intent.putExtra("TAG_ID", iOooO0o0);
        context.startActivity(intent);
    }
}
