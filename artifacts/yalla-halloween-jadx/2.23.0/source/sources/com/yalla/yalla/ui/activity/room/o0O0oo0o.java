package com.yalla.yalla.ui.activity.room;

import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p519o0o0O0oO.O0000000;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0oo0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SearchMusicActivity f26917OooO0Oo;

    public o0O0oo0o(SearchMusicActivity searchMusicActivity) {
        this.f26917OooO0Oo = searchMusicActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchMusicActivity searchMusicActivity = this.f26917OooO0Oo;
        O0000000 o0000000 = searchMusicActivity.f26704OooOo0o;
        if (o0000000 != null) {
            o0000000.OooO00o();
        }
        String strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.Success);
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            com.code.android.util.o000Oo0 o000oo0OooO00o = com.code.android.util.o000O00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                com.code.android.util.o000O0.f10355OooO0O0.post(o000oo0OooO00o);
            }
        }
        searchMusicActivity.finish();
    }
}
