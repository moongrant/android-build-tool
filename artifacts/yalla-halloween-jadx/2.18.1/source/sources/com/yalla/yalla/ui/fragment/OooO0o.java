package com.yalla.yalla.ui.fragment;

import android.view.View;
import com.app.base.model.RoomIndexModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o extends p654o0ooo.o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ MainExploreFragment f24058Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ p188o00o00o0.OooO0o f24059OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ RoomIndexModel f24060OoooO00;

    public OooO0o(MainExploreFragment mainExploreFragment, RoomIndexModel roomIndexModel, p188o00o00o0.OooO0o oooO0o) {
        this.f24058Oooo = mainExploreFragment;
        this.f24060OoooO00 = roomIndexModel;
        this.f24059OoooO0 = oooO0o;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f24058Oooo.enterRoom(this.f24060OoooO00, this.f24059OoooO0.getLayoutPosition() + 3);
    }
}
