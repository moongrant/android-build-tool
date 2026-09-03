package com.facebook.internal;

import android.content.DialogInterface;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0OoOo0 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f12863Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f12864OoooO00;

    public /* synthetic */ o0OoOo0(Object obj, int i) {
        this.f12863Oooo = i;
        this.f12864OoooO00 = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f12863Oooo) {
            case 0:
                WebDialog.m196onCreate$lambda4((WebDialog) this.f12864OoooO00, dialogInterface);
                break;
            default:
                Function1 listener = (Function1) this.f12864OoooO00;
                Intrinsics.checkNotNullParameter(listener, "$listener");
                Intrinsics.checkNotNullExpressionValue(dialogInterface, "dialogInterface");
                listener.invoke(dialogInterface);
                break;
        }
    }
}
