package com.yalla.yalla.ui.adapter;

import android.view.View;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O00 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O00o0 f27626OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessage f27627OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O00(o00O00o0 o00o00o1, YallaTeamMessage yallaTeamMessage) {
        super(1);
        this.f27626OooO0Oo = o00o00o1;
        this.f27627OooO0o0 = yallaTeamMessage;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        Function1<? super YallaTeamMessage, Unit> function1 = this.f27626OooO0Oo.f27618OooOOo0;
        if (function1 != null) {
            function1.invoke(this.f27627OooO0o0);
        }
        return Unit.INSTANCE;
    }
}
