package p379o0OOoOOO;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o000000O;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00 implements o000000O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1 f43247OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1 f43248OooO0o0;

    public o00O00(Function1 function1, Function1 function2) {
        this.f43247OooO0Oo = function1;
        this.f43248OooO0o0 = function2;
    }

    @Override // androidx.core.view.o000000O
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat insets) {
        Function1 function1 = this.f43247OooO0Oo;
        if (function1 != null) {
            Intrinsics.checkNotNullExpressionValue(insets, "insets");
        }
        Function1 function2 = this.f43248OooO0o0;
        if (function2 != null) {
            Intrinsics.checkNotNullExpressionValue(insets, "insets");
        }
        return insets;
    }
}
