package com.facebook;

import android.view.View;
import com.yalla.yalla.ui.view.GifFaceView;
import kotlin.jvm.internal.Intrinsics;
import p675oO0Oo.o0oO0Ooo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO0o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f13635OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f13636OooO0o0;

    public /* synthetic */ OooO0o(Object obj, int i) {
        this.f13635OooO0Oo = i;
        this.f13636OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f13635OooO0Oo;
        Object obj = this.f13636OooO0o0;
        switch (i) {
            case 0:
                FacebookButtonBase.m4037setupOnClickListener$lambda0((FacebookButtonBase) obj, view);
                break;
            case 1:
                o0oO0Ooo this_apply = (o0oO0Ooo) obj;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                this_apply.OooO0O0();
                break;
            default:
                GifFaceView.OooO0O0 this$0 = (GifFaceView.OooO0O0) obj;
                int i2 = GifFaceView.OooO0O0.f29926OooO0OO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.dismiss();
                break;
        }
    }
}
