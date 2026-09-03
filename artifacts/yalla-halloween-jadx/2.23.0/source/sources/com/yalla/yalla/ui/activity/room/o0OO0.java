package com.yalla.yalla.ui.activity.room;

import android.view.View;
import com.yalla.yalla.model.VoteGameGift;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0 extends p466o0Oooo0o.oo00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<VoteGameGift> f26920OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ p519o0o0O0oO.o00O00OO f26921OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ VoteGameCreateActivity f26922OooO0oo;

    public o0OO0(p519o0o0O0oO.o00O00OO o00o00oo2, VoteGameCreateActivity voteGameCreateActivity, Ref.ObjectRef<VoteGameGift> objectRef) {
        this.f26921OooO0oO = o00o00oo2;
        this.f26922OooO0oo = voteGameCreateActivity;
        this.f26920OooO = objectRef;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        p519o0o0O0oO.o00O00OO o00o00oo2 = this.f26921OooO0oO;
        o00o00oo2.OooO0O0();
        VoteGameGift voteGameGift = this.f26920OooO.element;
        VoteGameCreateActivity voteGameCreateActivity = this.f26922OooO0oo;
        voteGameCreateActivity.f26759OooOo0O = voteGameGift;
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(o00o00oo2.f52532OooO0Oo);
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0O0());
        VoteGameGift voteGameGift2 = voteGameCreateActivity.f26759OooOo0O;
        oooO00o.f43911OooO0OO = voteGameGift2 != null ? voteGameGift2.getGiftImageUrl() : null;
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo(voteGameCreateActivity.OooOo().f58525OooO0OO);
    }
}
