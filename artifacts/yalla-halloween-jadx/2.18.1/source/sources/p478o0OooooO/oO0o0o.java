package p478o0OooooO;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o000O0O0.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0o0o implements oo000o {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function1 f40672Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function1 f40673Oooo0oO;

    public oO0o0o(Function1 function1, Function1 function2) {
        this.f40672Oooo0o = function1;
        this.f40673Oooo0oO = function2;
    }

    @Override // o000O0O0.oo000o
    public final WindowInsetsCompat OooO00o(View view, WindowInsetsCompat insets) {
        Function1 function1 = this.f40672Oooo0o;
        if (function1 != null) {
            Intrinsics.checkNotNullExpressionValue(insets, "insets");
        }
        Function1 function2 = this.f40673Oooo0oO;
        if (function2 != null) {
            Intrinsics.checkNotNullExpressionValue(insets, "insets");
        }
        return insets;
    }
}
