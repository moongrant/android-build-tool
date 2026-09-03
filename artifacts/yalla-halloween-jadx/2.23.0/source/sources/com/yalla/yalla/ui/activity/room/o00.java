package com.yalla.yalla.ui.activity.room;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.data.db.model.MusicTable;
import p528o0o0OOOo.oOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00 implements BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MusicActivity f26822OooO0Oo;

    public o00(MusicActivity musicActivity) {
        this.f26822OooO0Oo = musicActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        MusicActivity musicActivity = this.f26822OooO0Oo;
        if (i >= musicActivity.f26586OooOo0O.f10111OooOOoo.size()) {
            return;
        }
        boolean z = oOO0.f54098OooO00o;
        oOO0.OooO0o0((MusicTable) musicActivity.f26586OooOo0O.f10111OooOOoo.get(i), false);
    }
}
