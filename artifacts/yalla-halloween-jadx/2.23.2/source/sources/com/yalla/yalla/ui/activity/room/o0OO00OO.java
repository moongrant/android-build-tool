package com.yalla.yalla.ui.activity.room;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00OO extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ VoteHistoryDetailActivity f26473OooO0oO;

    public o0OO00OO(VoteHistoryDetailActivity voteHistoryDetailActivity) {
        this.f26473OooO0oO = voteHistoryDetailActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        VoteHistoryDetailActivity voteHistoryDetailActivity = this.f26473OooO0oO;
        voteHistoryDetailActivity.f26336OooOoO = !voteHistoryDetailActivity.f26336OooOoO;
        oo0ooO oo0ooo = voteHistoryDetailActivity.f26331OooOo;
        if (oo0ooo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oo0ooo = null;
        }
        oo0ooo.notifyDataSetChanged();
        voteHistoryDetailActivity.OooOoO0().f43708OooO0O0.setImageResource(voteHistoryDetailActivity.f26336OooOoO ? p562o0oOo000.o0Oo0oo.room_vote_game_less : p562o0oOo000.o0Oo0oo.room_vote_game_more);
    }
}
