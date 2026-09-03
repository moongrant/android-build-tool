package com.yalla.yalla.ui.activity.room;

import android.view.View;
import com.yalla.yalla.model.VoteGameGift;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o00O extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<VoteGameGift> f26464OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ p650o0ooo.o000OO00 f26465OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ VoteGameCreateActivity f26466OooO0oo;

    public o0O0o00O(p650o0ooo.o000OO00 o000oo01, VoteGameCreateActivity voteGameCreateActivity, Ref.ObjectRef<VoteGameGift> objectRef) {
        this.f26465OooO0oO = o000oo01;
        this.f26466OooO0oo = voteGameCreateActivity;
        this.f26464OooO = objectRef;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        p650o0ooo.o000OO00 o000oo01 = this.f26465OooO0oO;
        o000oo01.OooO0O0();
        VoteGameGift voteGameGift = this.f26464OooO.element;
        VoteGameCreateActivity voteGameCreateActivity = this.f26466OooO0oo;
        voteGameCreateActivity.f26305OooOo0O = voteGameGift;
        o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(o000oo01.f58507OooO0Oo);
        oooO00o.OooO00o(d1.OooO0O0());
        VoteGameGift voteGameGift2 = voteGameCreateActivity.f26305OooOo0O;
        oooO00o.f43126OooO0OO = voteGameGift2 != null ? voteGameGift2.getGiftImageUrl() : null;
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0Oo(voteGameCreateActivity.OooOo().f43728OooO0OO);
    }
}
