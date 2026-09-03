package com.google.firebase.messaging;

import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomRecommendFragment;
import kotlin.jvm.internal.Intrinsics;
import p466o0Oooo0o.o00O00OO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O0O implements androidx.activity.result.OooO00o, o00O00OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f20367OooO0Oo;

    public /* synthetic */ o00O0O(Object obj) {
        this.f20367OooO0Oo = obj;
    }

    @Override // p466o0Oooo0o.o00O00OO
    public final void OooO00o(RoomIndexModel roomIndexModel) {
        MainRoomRecommendFragment.initView$lambda$3((MainRoomRecommendFragment) this.f20367OooO0Oo, roomIndexModel);
    }

    @Override // androidx.activity.result.OooO00o
    public final void onActivityResult(Object obj) {
        p331o0OO0o0.o000OOo this$0 = (p331o0OO0o0.o000OOo) this.f20367OooO0Oo;
        int i = p331o0OO0o0.o000OOo.f43179OooOO0o;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooO0Oo();
    }
}
