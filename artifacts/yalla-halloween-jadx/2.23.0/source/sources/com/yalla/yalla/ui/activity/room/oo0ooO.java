package com.yalla.yalla.ui.activity.room;

import com.yalla.yalla.model.room.RoomUserInfoModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0ooO extends Lambda implements Function1<List<RoomUserInfoModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VoteGameCreateActivity f26967OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0ooO(VoteGameCreateActivity voteGameCreateActivity) {
        super(1);
        this.f26967OooO0Oo = voteGameCreateActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<RoomUserInfoModel> list) {
        List<RoomUserInfoModel> it = list;
        Intrinsics.checkNotNullParameter(it, "it");
        VoteGameCreateActivity voteGameCreateActivity = this.f26967OooO0Oo;
        voteGameCreateActivity.f26757OooOo0.clear();
        voteGameCreateActivity.f26757OooOo0.addAll(it);
        voteGameCreateActivity.OooOoO0();
        return Unit.INSTANCE;
    }
}
