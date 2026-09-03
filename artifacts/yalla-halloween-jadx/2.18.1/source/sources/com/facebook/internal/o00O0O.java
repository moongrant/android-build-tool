package com.facebook.internal;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import p579o0oOoOOo.oOOO000o;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o00O0O implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f12840Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f12841Oooo0oO;

    public /* synthetic */ o00O0O(Object obj, int i) {
        this.f12840Oooo0o = i;
        this.f12841Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f12840Oooo0o) {
            case 0:
                WebDialog.m195createCrossImage$lambda5((WebDialog) this.f12841Oooo0oO, view);
                break;
            default:
                oOOO000o this$0 = (oOOO000o) this.f12841Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0O0();
                break;
        }
    }
}
