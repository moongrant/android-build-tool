package com.google.android.material.textfield;

import android.view.View;
import com.yalla.yalla.ui.fragment.MainSearchRoomFragment;
import kotlin.jvm.internal.Intrinsics;
import p650o0ooo.o000OO00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOOOO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f17497OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f17498OooO0o0;

    public /* synthetic */ OooOOOO(Object obj, int i) {
        this.f17497OooO0Oo = i;
        this.f17498OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f17497OooO0Oo;
        Object obj = this.f17498OooO0o0;
        switch (i) {
            case 0:
                ((o0OoOo0) obj).OooOo0();
                break;
            case 1:
                o000OO00 this$0 = (o000OO00) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f58511OooO0oo) {
                    this$0.OooO0O0();
                }
                break;
            default:
                MainSearchRoomFragment this$1 = (MainSearchRoomFragment) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.getVm().clearSearchHistory();
                break;
        }
    }
}
