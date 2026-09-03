package p563o0oOo0;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oOO00O f45064Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f45065Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0(oOO00O ooo00o, String str) {
        super(1);
        this.f45064Oooo0o = ooo00o;
        this.f45065Oooo0oO = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        Function1<? super String, Unit> function1 = this.f45064Oooo0o.f45108OooOOo;
        if (function1 != null) {
            function1.invoke(this.f45065Oooo0oO);
        }
        return Unit.INSTANCE;
    }
}
