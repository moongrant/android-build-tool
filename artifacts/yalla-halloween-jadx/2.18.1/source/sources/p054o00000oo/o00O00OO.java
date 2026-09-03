package p054o00000oo;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00OO implements oOO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Lazy f27177OooO00o;

    public static final class OooO00o extends Lambda implements Function0<InputMethodManager> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Context f27178Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context) {
            super(0);
            this.f27178Oooo0o = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final InputMethodManager invoke() {
            Object systemService = this.f27178Oooo0o.getSystemService("input_method");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    }

    public o00O00OO(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f27177OooO00o = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new OooO00o(context));
    }

    @Override // p054o00000oo.oOO00O
    public final void OooO00o(@Nullable IBinder iBinder) {
        OooO0o().hideSoftInputFromWindow(iBinder, 0);
    }

    @Override // p054o00000oo.oOO00O
    public final void OooO0O0(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        OooO0o().showSoftInput(view, 0);
    }

    @Override // p054o00000oo.oOO00O
    public final void OooO0OO(@NotNull View view, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(view, "view");
        OooO0o().updateSelection(view, i, i2, i3, i4);
    }

    @Override // p054o00000oo.oOO00O
    public final void OooO0Oo(@NotNull View view, int i, @NotNull ExtractedText extractedText) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(extractedText, "extractedText");
        OooO0o().updateExtractedText(view, i, extractedText);
    }

    public final InputMethodManager OooO0o() {
        return (InputMethodManager) this.f27177OooO00o.getValue();
    }

    @Override // p054o00000oo.oOO00O
    public final void OooO0o0(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        OooO0o().restartInput(view);
    }
}
