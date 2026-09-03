package com.yalla.yalla.ui.activity.room;

import com.yalla.yalla.model.VoteGameGift;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O0Oo extends Lambda implements Function1<List<List<VoteGameGift>>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VoteGameCreateActivity f26454OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0Oo(VoteGameCreateActivity voteGameCreateActivity) {
        super(1);
        this.f26454OooO0Oo = voteGameCreateActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<List<VoteGameGift>> list) {
        List<List<VoteGameGift>> list2 = list;
        if (list2.size() > 0) {
            VoteGameGift voteGameGift = list2.get(0).get(0);
            VoteGameCreateActivity voteGameCreateActivity = this.f26454OooO0Oo;
            voteGameCreateActivity.f26305OooOo0O = voteGameGift;
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(voteGameCreateActivity);
            oooO00o.OooO00o(d1.OooO0O0());
            VoteGameGift voteGameGift2 = voteGameCreateActivity.f26305OooOo0O;
            oooO00o.f43126OooO0OO = voteGameGift2 != null ? voteGameGift2.getGiftImageUrl() : null;
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo(voteGameCreateActivity.OooOo().f43728OooO0OO);
            voteGameCreateActivity.OooOo().f43729OooO0Oo.setOnClickListener(voteGameCreateActivity);
        }
        return Unit.INSTANCE;
    }
}
