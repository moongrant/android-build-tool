package com.yalla.yalla.ui.activity.room;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.data.db.model.MusicTable;
import p535o0o0Oo0.oO0O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO00 implements BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MusicActivity f26397OooO0Oo;

    public o000OO00(MusicActivity musicActivity) {
        this.f26397OooO0Oo = musicActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        MusicActivity musicActivity = this.f26397OooO0Oo;
        if (i >= musicActivity.f26134OooOo0O.f13189OooOOoo.size()) {
            return;
        }
        boolean z = oO0O00.f53970OooO00o;
        oO0O00.OooO0o0((MusicTable) musicActivity.f26134OooOo0O.f13189OooOOoo.get(i), false);
    }
}
