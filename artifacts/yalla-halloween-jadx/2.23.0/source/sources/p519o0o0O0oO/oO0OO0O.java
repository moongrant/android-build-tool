package p519o0o0O0oO;

import android.view.LayoutInflater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p641o0ooOOOO.x7;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OO0O extends Lambda implements Function0<x7> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO0o0000 f52875OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OO0O(oO0o0000 oo0o0000) {
        super(0);
        this.f52875OooO0Oo = oo0o0000;
    }

    @Override // kotlin.jvm.functions.Function0
    public final x7 invoke() {
        oO0o0000 oo0o0000 = this.f52875OooO0Oo;
        x7 x7VarInflate = x7.inflate(LayoutInflater.from(oo0o0000.f52532OooO0Oo), oo0o0000.f52533OooO0o, false);
        Intrinsics.checkNotNullExpressionValue(x7VarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
        return x7VarInflate;
    }
}
