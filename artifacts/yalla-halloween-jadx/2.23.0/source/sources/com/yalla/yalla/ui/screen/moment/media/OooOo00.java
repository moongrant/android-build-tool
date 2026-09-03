package com.yalla.yalla.ui.screen.moment.media;

import androidx.appcompat.app.AppCompatActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f29444OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f29445OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentAdapterTag f29446OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(MomentVideoVM momentVideoVM, MomentAdapterTag momentAdapterTag, AppCompatActivity appCompatActivity) {
        super(0);
        this.f29444OooO0Oo = momentVideoVM;
        this.f29446OooO0o0 = momentAdapterTag;
        this.f29445OooO0o = appCompatActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        p515o0o0O0O0.Oooo000.OooO0OO(null, this.f29444OooO0Oo.getCurrentMomentDetail(), false, this.f29446OooO0o0, this.f29445OooO0o, null, false, null, null, this.f29444OooO0Oo, null, true, null);
        return Unit.INSTANCE;
    }
}
