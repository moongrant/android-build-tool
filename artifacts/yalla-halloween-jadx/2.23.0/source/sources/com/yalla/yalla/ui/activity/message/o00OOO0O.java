package com.yalla.yalla.ui.activity.message;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO0O extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ p519o0o0O0oO.o00O00OO f25903OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ p152o00OoO.OooOO0 f25904OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO0O(p519o0o0O0oO.o00O00OO o00o00oo2, p152o00OoO.OooOO0 oooOO1) {
        super(1);
        this.f25903OooO0Oo = o00o00oo2;
        this.f25904OooO0o0 = oooOO1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String path = str;
        if (this.f25903OooO0Oo.OooO0OO()) {
            Intrinsics.checkNotNullExpressionValue(path, "path");
            p152o00OoO.OooOOO0 oooOOO0 = new p152o00OoO.OooOOO0(path);
            p152o00OoO.OooOO0 oooOO1 = this.f25904OooO0o0;
            oooOO1.OooO00o(oooOOO0);
            p152o00OoO.OooO oooO = oooOO1.f38118OooO00o;
            if (oooO != null) {
                oooO.OooO0O0();
            }
        }
        return Unit.INSTANCE;
    }
}
