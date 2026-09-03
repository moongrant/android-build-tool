package com.yalla.yalla.ui.activity.room;

import android.content.Intent;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import p664o0oooOO.oO00O0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00 implements BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SearchMusicActivity f26439OooO0Oo;

    public o0O00(SearchMusicActivity searchMusicActivity) {
        this.f26439OooO0Oo = searchMusicActivity;
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.Object] */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        SearchMusicActivity searchMusicActivity = this.f26439OooO0Oo;
        Intent intent = new Intent(searchMusicActivity, (Class<?>) SelectMusicActivity.class);
        searchMusicActivity.f26248OooOo00 = i;
        p545o0oO0O00.OooOOO oooOOO = new p545o0oO0O00.OooOOO();
        oooOOO.f55758OooO00o = 504;
        oooOOO.f55760OooO0OO = searchMusicActivity.f26245OooOOoo.get(i).clone();
        oO00O0o oo00o0oOooO00o = p545o0oO0O00.OooOo00.OooO00o();
        synchronized (oo00o0oOooO00o.f59844OooO0OO) {
            oo00o0oOooO00o.f59844OooO0OO.put(p545o0oO0O00.OooOOO.class, oooOOO);
        }
        oo00o0oOooO00o.OooO0Oo(oooOOO);
        searchMusicActivity.startActivityForResult(intent, 1000);
    }
}
