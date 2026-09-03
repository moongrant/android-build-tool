package com.yalla.yalla.ui.activity.message;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oO0Ooo extends RecyclerView.o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessageActivity f25529OooO00o;

    public o0oO0Ooo(YallaTeamMessageActivity yallaTeamMessageActivity) {
        this.f25529OooO00o = yallaTeamMessageActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
    public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        YallaTeamMessageActivity yallaTeamMessageActivity = this.f25529OooO00o;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            yallaTeamMessageActivity.f25327OooOoO0 = false;
        } else {
            int i2 = YallaTeamMessageActivity.f25319OooOoo0;
            RecyclerView.Oooo000 layoutManager = yallaTeamMessageActivity.OooOo().f45225OooO0OO.getLayoutManager();
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            yallaTeamMessageActivity.f25327OooOoO0 = ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition() == 0;
        }
    }
}
