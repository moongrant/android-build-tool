package com.google.android.material.textfield;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.code.android.util.o000O0;
import com.yalla.yalla.model.chat.ChatModel;
import kotlin.jvm.internal.Intrinsics;
import p502o0o00oOO.oO000o00;
import p519o0o0O0oO.o0O0o000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOo00 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f17974OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f17975OooO0o0;

    public /* synthetic */ OooOo00(Object obj, int i) {
        this.f17974OooO0Oo = i;
        this.f17975OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f17974OooO0Oo;
        Object obj = this.f17975OooO0o0;
        switch (i) {
            case 0:
                ((o00Oo0) obj).OooOo0();
                break;
            default:
                ChatModel model = (ChatModel) obj;
                Intrinsics.checkNotNullParameter(model, "$model");
                Context context = o000O0.f10354OooO00o;
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                Intrinsics.checkNotNull(activityOooO0O0);
                o0O0o000 o0o0o000 = new o0O0o000(activityOooO0O0, false, false, true, true);
                o0o0o000.OooOOo0(new oO000o00(model));
                o0o0o000.OooOO0o();
                break;
        }
    }
}
