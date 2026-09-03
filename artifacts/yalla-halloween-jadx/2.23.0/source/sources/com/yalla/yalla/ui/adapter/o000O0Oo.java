package com.yalla.yalla.ui.adapter;

import android.text.Editable;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0Oo extends Lambda implements Function1<Editable, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O0O0 f27536OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ViewHolder f27537OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0Oo(o000O0O0 o000o0o1, ViewHolder viewHolder) {
        super(1);
        this.f27536OooO0Oo = o000o0o1;
        this.f27537OooO0o0 = viewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Editable editable) {
        Function2<? super Integer, ? super String, Unit> function2;
        Editable editable2 = editable;
        if (editable2 != null && (function2 = this.f27536OooO0Oo.f27532OooOoo0) != null) {
            function2.invoke(Integer.valueOf(this.f27537OooO0o0.getLayoutPosition()), editable2.toString());
        }
        return Unit.INSTANCE;
    }
}
