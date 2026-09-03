package com.yalla.yalla.ui.activity.room;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0OO extends p466o0Oooo0o.oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ VoteHistoryDetailActivity f26935OooO0oO;

    public o0OOO0OO(VoteHistoryDetailActivity voteHistoryDetailActivity) {
        this.f26935OooO0oO = voteHistoryDetailActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        VoteHistoryDetailActivity voteHistoryDetailActivity = this.f26935OooO0oO;
        voteHistoryDetailActivity.f26790OooOoO = !voteHistoryDetailActivity.f26790OooOoO;
        o0OOO0 o0ooo1 = voteHistoryDetailActivity.f26785OooOo;
        if (o0ooo1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o0ooo1 = null;
        }
        o0ooo1.notifyDataSetChanged();
        voteHistoryDetailActivity.OooOoO0().f58419OooO0O0.setImageResource(voteHistoryDetailActivity.f26790OooOoO ? oOo00OO0.room_vote_game_less : oOo00OO0.room_vote_game_more);
    }
}
