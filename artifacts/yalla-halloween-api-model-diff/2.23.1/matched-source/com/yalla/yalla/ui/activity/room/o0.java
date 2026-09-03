package com.yalla.yalla.ui.activity.room;

import android.view.View;
import kotlin.jvm.functions.Function0;
import p675oO0Oo.oOO0Oo00;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0 implements Function0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f26369OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f26370OooO0o0;

    public /* synthetic */ o0(int i, View.OnClickListener onClickListener) {
        this.f26369OooO0Oo = i;
        this.f26370OooO0o0 = onClickListener;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f26369OooO0Oo;
        View.OnClickListener onClickListener = this.f26370OooO0o0;
        switch (i) {
            case 0:
                int i2 = SearchMusicActivity.f26244OooOoO0;
                ((SearchMusicActivity) onClickListener).finish();
                break;
            default:
                ((oOO0Oo00.OooO0O0) onClickListener).f59796OooO0oO.dismiss();
                break;
        }
        return null;
    }
}
