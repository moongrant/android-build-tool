package com.yalla.yalla.ui.activity.room;

import com.yalla.yalla.model.VoteGameGift;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0oo00 extends Lambda implements Function1<List<List<VoteGameGift>>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VoteGameCreateActivity f26916OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0oo00(VoteGameCreateActivity voteGameCreateActivity) {
        super(1);
        this.f26916OooO0Oo = voteGameCreateActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<List<VoteGameGift>> list) {
        List<List<VoteGameGift>> list2 = list;
        if (list2.size() > 0) {
            VoteGameGift voteGameGift = list2.get(0).get(0);
            VoteGameCreateActivity voteGameCreateActivity = this.f26916OooO0Oo;
            voteGameCreateActivity.f26759OooOo0O = voteGameGift;
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(voteGameCreateActivity);
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0O0());
            VoteGameGift voteGameGift2 = voteGameCreateActivity.f26759OooOo0O;
            oooO00o.f43911OooO0OO = voteGameGift2 != null ? voteGameGift2.getGiftImageUrl() : null;
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0Oo(voteGameCreateActivity.OooOo().f58525OooO0OO);
            voteGameCreateActivity.OooOo().f58526OooO0Oo.setOnClickListener(voteGameCreateActivity);
        }
        return Unit.INSTANCE;
    }
}
