package com.yalla.yalla.ui.activity.room;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.fragment.BadgeRankDataFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p519o0o0O0oO.f;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0O0o0 implements BaseQuickAdapter.OooO0o, BaseQuickAdapter.OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f26913OooO0Oo;

    public /* synthetic */ o0O0o0(Object obj) {
        this.f26913OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0O0
    public final void OooO0OO(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        BadgeRankDataFragment.initView$lambda$2((BadgeRankDataFragment) this.f26913OooO0Oo, baseQuickAdapter, view, i);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        VoteGameCreateActivity this$0 = (VoteGameCreateActivity) this.f26913OooO0Oo;
        int i2 = VoteGameCreateActivity.f26755OooOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object obj = baseQuickAdapter.f10111OooOOoo.get(i);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.room.RoomUserInfoModel");
        if (((RoomUserInfoModel) obj).getUserId().getValue().longValue() != 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this$0.f26757OooOo0);
        f fVar = new f(arrayList, new oo0ooO(this$0));
        FragmentManager supportFragmentManager = this$0.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        fVar.show(supportFragmentManager, com.code.android.util.o0000.OooO0OO(oO00OOo0.Online_Users));
    }
}
