package com.yalla.yalla.ui.activity.room;

import android.content.Intent;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O0O implements BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SearchMusicActivity f26906OooO0Oo;

    public o0O0O0O(SearchMusicActivity searchMusicActivity) {
        this.f26906OooO0Oo = searchMusicActivity;
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.Object] */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        SearchMusicActivity searchMusicActivity = this.f26906OooO0Oo;
        Intent intent = new Intent(searchMusicActivity, (Class<?>) SelectMusicActivity.class);
        searchMusicActivity.f26702OooOo00 = i;
        p418o0OoO000.OooOo oooOo = new p418o0OoO000.OooOo();
        oooOo.f45532OooO00o = 504;
        oooOo.f45534OooO0OO = searchMusicActivity.f26699OooOOoo.get(i).clone();
        p660o0oooO0O.o00OOO00 o00ooo00OooO0O0 = com.squareup.okhttp.OooOo.OooO0O0();
        synchronized (o00ooo00OooO0O0.f60269OooO0OO) {
            o00ooo00OooO0O0.f60269OooO0OO.put(p418o0OoO000.OooOo.class, oooOo);
        }
        o00ooo00OooO0O0.OooO0Oo(oooOo);
        searchMusicActivity.startActivityForResult(intent, 1000);
    }
}
