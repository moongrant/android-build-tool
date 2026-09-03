package com.yalla.yalla.ui.activity.main;

import Oooo000.o00O00;
import java.io.File;
import p034OoooO0O.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO extends com.app.base.Function.OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ long f22039OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ File f22040OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ NetworkTestActivity.OooO0o f22041OooO0o0;

    public OooO0OO(NetworkTestActivity.OooO0o oooO0o, long j, File file) {
        this.f22041OooO0o0 = oooO0o;
        this.f22039OooO0OO = j;
        this.f22040OooO0Oo = file;
    }

    @Override // com.app.base.Function.OooO0OO.OooO0O0, com.app.base.Function.OooO0OO.OooO00o
    public final void onError(String str, String str2) {
        o0Oo0oo.OooO0o0(603, 0);
    }

    @Override // com.app.base.Function.OooO0OO.OooO0O0, com.app.base.Function.OooO0OO.OooO00o
    public final void onFinish(String str) {
        super.onFinish(str);
        NetworkTestActivity.this.f22001o00000oO = System.currentTimeMillis() - this.f22039OooO0OO;
        NetworkTestActivity.this.f22000o00000o0 = this.f22040OooO0Oo.length();
        NetworkTestActivity networkTestActivity = NetworkTestActivity.this;
        networkTestActivity.f22004o0000Ooo = ((networkTestActivity.f21996o00000O * 1000) / 1024) / networkTestActivity.f22001o00000oO;
        o00O00.OooO(this.f22040OooO0Oo);
        o0Oo0oo.OooO0o0(603, 1);
    }
}
