package com.yalla.yalla.ui.activity.main;

import Oooo000.o00O00;
import android.content.Context;
import java.io.File;
import p034OoooO0O.o0Oo0oo;
import p160o00OoOO0.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ File f22038OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(Context context, File file) {
        super(context);
        this.f22038OooO00o = file;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onError(String str, String str2) {
        super.onError(str, str2);
        o0Oo0oo.OooO0o0(604, 0);
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(String str) {
        o0Oo0oo.OooO0o0(604, 1);
        o00O00.OooO(this.f22038OooO00o);
    }
}
