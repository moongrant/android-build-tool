package com.yalla.yalla.ui.activity.room;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.MusicSelecterModel;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00o00 implements BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SelectMusicActivity f26451OooO0Oo;

    public o0O00o00(SelectMusicActivity selectMusicActivity) {
        this.f26451OooO0Oo = selectMusicActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        SelectMusicActivity selectMusicActivity = this.f26451OooO0Oo;
        ((MusicSelecterModel) selectMusicActivity.f26254OooOOoo.get(i)).select = !((MusicSelecterModel) selectMusicActivity.f26254OooOOoo.get(i)).select;
        baseQuickAdapter.notifyItemChanged(i);
        selectMusicActivity.OooOo0();
    }
}
