package com.yalla.yalla.ui.screen.moment.media;

import androidx.appcompat.app.AppCompatActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p521o0o0O0o0.o000000O;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f28919OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f28920OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentAdapterTag f28921OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(MomentVideoVM momentVideoVM, MomentAdapterTag momentAdapterTag, AppCompatActivity appCompatActivity) {
        super(0);
        this.f28919OooO0Oo = momentVideoVM;
        this.f28921OooO0o0 = momentAdapterTag;
        this.f28920OooO0o = appCompatActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o000000O.OooO0OO(null, this.f28919OooO0Oo.getCurrentMomentDetail(), false, this.f28921OooO0o0, this.f28920OooO0o, null, false, null, null, this.f28919OooO0Oo, null, true, null);
        return Unit.INSTANCE;
    }
}
