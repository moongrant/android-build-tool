package com.yalla.yalla.ui.fragment;

import android.view.View;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p466o0Oooo0o.oo00o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0o extends oo00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ ViewHolder f28944OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MainExploreFragment f28945OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ RoomIndexModel f28946OooO0oo;

    public o0OOO0o(MainExploreFragment mainExploreFragment, RoomIndexModel roomIndexModel, ViewHolder viewHolder) {
        this.f28945OooO0oO = mainExploreFragment;
        this.f28946OooO0oo = roomIndexModel;
        this.f28944OooO = viewHolder;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f28945OooO0oO.enterRoom(this.f28946OooO0oo, this.f28944OooO.getLayoutPosition() + 3);
    }
}
