package com.yalla.yalla.ui.screen.user.vip;

import androidx.appcompat.app.AppCompatActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p402o0Oo0OOO.o00O000o;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f30205OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(AppCompatActivity appCompatActivity) {
        super(0);
        this.f30205OooO0Oo = appCompatActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AppCompatActivity appCompatActivity = this.f30205OooO0Oo;
        if (appCompatActivity != null) {
            o00O000o.f44508OooOo.observe(appCompatActivity, new VipScreen.o0000oo(new OooO(appCompatActivity)));
        }
        o0OO000.OooO00o("105123");
        return Unit.INSTANCE;
    }
}
