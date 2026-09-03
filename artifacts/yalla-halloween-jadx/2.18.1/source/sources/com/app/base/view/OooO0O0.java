package com.app.base.view;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends Lambda implements Function1<Context, View> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ View f12069Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(View view) {
        super(1);
        this.f12069Oooo0o = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final View invoke(Context context) {
        Context it = context;
        Intrinsics.checkNotNullParameter(it, "it");
        return this.f12069Oooo0o;
    }
}
