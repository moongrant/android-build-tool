package com.facebook.internal;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import p581o0oOoOOo.oOO;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o00O0O implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f12856Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f12857OoooO00;

    public /* synthetic */ o00O0O(Object obj, int i) {
        this.f12856Oooo = i;
        this.f12857OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f12856Oooo) {
            case 0:
                WebDialog.m195createCrossImage$lambda5((WebDialog) this.f12857OoooO00, view);
                break;
            default:
                oOO this$0 = (oOO) this.f12857OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0O0();
                break;
        }
    }
}
