package com.yalla.yalla.ui.activity.room;

import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p650o0ooo.a;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00O0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SearchMusicActivity f26447OooO0Oo;

    public o0O00O0o(SearchMusicActivity searchMusicActivity) {
        this.f26447OooO0Oo = searchMusicActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchMusicActivity searchMusicActivity = this.f26447OooO0Oo;
        a aVar = searchMusicActivity.f26250OooOo0o;
        if (aVar != null) {
            aVar.OooO00o();
        }
        String strOooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Success);
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                com.code.android.util.o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
            }
        }
        searchMusicActivity.finish();
    }
}
