package com.yalla.yalla.ui.activity.room;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.data.db.model.MusicTable;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OOo implements BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ DeleteMusicActivity f26853OooO0Oo;

    public o000OOo(DeleteMusicActivity deleteMusicActivity) {
        this.f26853OooO0Oo = deleteMusicActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        DeleteMusicActivity deleteMusicActivity = this.f26853OooO0Oo;
        ((MusicTable) deleteMusicActivity.f26521OooOo0.f10111OooOOoo.get(i)).isSelect = !((MusicTable) deleteMusicActivity.f26521OooOo0.f10111OooOOoo.get(i)).isSelect;
        baseQuickAdapter.notifyItemChanged(i);
        DeleteMusicActivity.OooOo0(deleteMusicActivity);
    }
}
