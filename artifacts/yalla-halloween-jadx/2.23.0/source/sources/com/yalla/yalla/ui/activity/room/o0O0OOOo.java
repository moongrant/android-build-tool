package com.yalla.yalla.ui.activity.room;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.MusicSelecterModel;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OOOo implements BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SelectMusicActivity f26911OooO0Oo;

    public o0O0OOOo(SelectMusicActivity selectMusicActivity) {
        this.f26911OooO0Oo = selectMusicActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        SelectMusicActivity selectMusicActivity = this.f26911OooO0Oo;
        ((MusicSelecterModel) selectMusicActivity.f26708OooOOoo.get(i)).select = !((MusicSelecterModel) selectMusicActivity.f26708OooOOoo.get(i)).select;
        baseQuickAdapter.notifyItemChanged(i);
        selectMusicActivity.OooOo0();
    }
}
