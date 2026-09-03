package com.facebook.internal;

import android.content.DialogInterface;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0OoOo0 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f12847Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f12848Oooo0oO;

    public /* synthetic */ o0OoOo0(Object obj, int i) {
        this.f12847Oooo0o = i;
        this.f12848Oooo0oO = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f12847Oooo0o) {
            case 0:
                WebDialog.m196onCreate$lambda4((WebDialog) this.f12848Oooo0oO, dialogInterface);
                break;
            default:
                Function1 listener = (Function1) this.f12848Oooo0oO;
                Intrinsics.checkNotNullParameter(listener, "$listener");
                Intrinsics.checkNotNullExpressionValue(dialogInterface, "dialogInterface");
                listener.invoke(dialogInterface);
                break;
        }
    }
}
