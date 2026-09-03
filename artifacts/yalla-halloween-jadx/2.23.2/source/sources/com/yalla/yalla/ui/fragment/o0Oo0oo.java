package com.yalla.yalla.ui.fragment;

import android.view.View;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0Oo0oo extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ ViewHolder f28419OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MainExploreFragment f28420OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ RoomIndexModel f28421OooO0oo;

    public o0Oo0oo(MainExploreFragment mainExploreFragment, RoomIndexModel roomIndexModel, ViewHolder viewHolder) {
        this.f28420OooO0oO = mainExploreFragment;
        this.f28421OooO0oo = roomIndexModel;
        this.f28419OooO = viewHolder;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f28420OooO0oO.enterRoom(this.f28421OooO0oo, this.f28419OooO.getLayoutPosition() + 3);
    }
}
