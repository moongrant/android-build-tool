package com.facebook.login;

import android.view.View;
import com.yallatech.support.basecore.dialog.SheetAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p608o0oo0OO0.o000Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOOO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f13749OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f13750OooO0o0;

    public /* synthetic */ OooOOO0(Object obj, int i) {
        this.f13749OooO0Oo = i;
        this.f13750OooO0o0 = obj;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Function2<Integer, o000Oo0, Unit> function2;
        int i = this.f13749OooO0Oo;
        Object obj = this.f13750OooO0o0;
        switch (i) {
            case 0:
                DeviceAuthDialog.m4166initializeContentView$lambda2((DeviceAuthDialog) obj, view);
                break;
            default:
                SheetAdapter this$0 = (SheetAdapter) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Object tag = view.getTag();
                if ((tag instanceof Integer) && (function2 = this$0.f32390OooO0O0) != 0) {
                    function2.invoke((Integer) tag, this$0.f32389OooO00o.get(((Number) tag).intValue()));
                    break;
                }
                break;
        }
    }
}
