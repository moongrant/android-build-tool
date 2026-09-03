package com.yalla.yalla.ui.activity.room;

import android.view.View;
import kotlin.jvm.functions.Function0;
import p650o0ooo.oO00Oo0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0O0000O implements Function0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f26442OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f26443OooO0o0;

    public /* synthetic */ o0O0000O(int i, View.OnClickListener onClickListener) {
        this.f26442OooO0Oo = i;
        this.f26443OooO0o0 = onClickListener;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f26442OooO0Oo;
        View.OnClickListener onClickListener = this.f26443OooO0o0;
        switch (i) {
            case 0:
                SearchMusicActivity searchMusicActivity = (SearchMusicActivity) onClickListener;
                int i2 = SearchMusicActivity.f26242OooOoO0;
                if (!searchMusicActivity.OooOo0()) {
                    searchMusicActivity.finish();
                }
                break;
            default:
                ((oO00Oo0.OooO0O0) onClickListener).f58828OooO0oO.dismiss();
                break;
        }
        return null;
    }
}
