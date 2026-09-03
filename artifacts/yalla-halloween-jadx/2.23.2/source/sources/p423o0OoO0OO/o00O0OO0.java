package p423o0OoO0OO;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00O0OO0 implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> f46713OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Function1<? super Editable, Unit> f46714OooO0o0;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Nullable Editable editable) {
        Function1<? super Editable, Unit> function1 = this.f46714OooO0o0;
        if (function1 != null) {
            function1.invoke(editable);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> function4 = this.f46713OooO0Oo;
        if (function4 != null) {
            function4.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }
}
