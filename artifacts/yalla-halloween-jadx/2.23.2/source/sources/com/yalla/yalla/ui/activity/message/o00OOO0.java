package com.yalla.yalla.ui.activity.message;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO0 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ p650o0ooo.o000OO00 f25452OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0OOo000.OooO0O0 f25453OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO0(p650o0ooo.o000OO00 o000oo01, o0OOo000.OooO0O0 oooO0O0) {
        super(1);
        this.f25452OooO0Oo = o000oo01;
        this.f25453OooO0o0 = oooO0O0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        if (this.f25452OooO0Oo.OooO0OO()) {
            Intrinsics.checkNotNull(str2);
            o0OOo000.OooOO0 oooOO1 = new o0OOo000.OooOO0(str2);
            o0OOo000.OooO0O0 oooO0O0 = this.f25453OooO0o0;
            oooO0O0.OooO00o(oooOO1);
            o0OOo000.OooO00o oooO00o = oooO0O0.f43005OooO00o;
            if (oooO00o != null) {
                oooO00o.OooO0Oo();
            }
        }
        return Unit.INSTANCE;
    }
}
