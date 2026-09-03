package com.yalla.yalla.ui.screen.user.vip;

import androidx.appcompat.app.AppCompatActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p583o0oOoo00.o00000OO;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f29661OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(AppCompatActivity appCompatActivity) {
        super(0);
        this.f29661OooO0Oo = appCompatActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AppCompatActivity appCompatActivity = this.f29661OooO0Oo;
        if (appCompatActivity != null) {
            o00000OO.f56677OooOo.observe(appCompatActivity, new VipScreen.o0000(new OooO(appCompatActivity)));
        }
        o0oo0000.OooO00o.OooO0O0("105123");
        return Unit.INSTANCE;
    }
}
