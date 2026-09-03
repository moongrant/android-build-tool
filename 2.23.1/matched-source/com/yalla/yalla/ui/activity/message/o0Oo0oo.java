package com.yalla.yalla.ui.activity.message;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import p593o0oOoooO.h0;
import p675oO0Oo.oO00Oo00;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0Oo0oo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f25530OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f25531OooO0o0;

    public /* synthetic */ o0Oo0oo(Object obj, int i) {
        this.f25530OooO0Oo = i;
        this.f25531OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f25530OooO0Oo;
        Object obj = this.f25531OooO0o0;
        switch (i) {
            case 0:
                PrivateChatActivity this$0 = (PrivateChatActivity) obj;
                int i2 = PrivateChatActivity.f25240Oooo000;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                h0.OooO0O0("104007");
                this$0.getClass();
                o0oo0O0O.o0O0OOO0.OooO00o.OooO00o(p607o0oo0O0O.o0O0OOO0.f56969OooO0O0, new o00(this$0));
                break;
            default:
                oO00Oo00 this$1 = (oO00Oo00) obj;
                int i3 = oO00Oo00.f59656OooOOO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.dismiss();
                break;
        }
    }
}
