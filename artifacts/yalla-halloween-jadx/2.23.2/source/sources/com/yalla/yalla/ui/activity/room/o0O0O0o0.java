package com.yalla.yalla.ui.activity.room;

import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O0o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VoteGameCreateActivity f26455OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0o0(VoteGameCreateActivity voteGameCreateActivity) {
        super(0);
        this.f26455OooO0Oo = voteGameCreateActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = VoteHistoryActivity.f26312OooOoO;
        VoteGameCreateActivity context = this.f26455OooO0Oo;
        Intrinsics.checkNotNullParameter(context, "context");
        context.startActivity(new Intent(context, (Class<?>) VoteHistoryActivity.class));
        return Unit.INSTANCE;
    }
}
