package p522o0o0O0o;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00O0OO implements TextWatcher {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @Nullable
    public Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> f43010Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public Function1<? super Editable, Unit> f43011Oooo0oO;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Nullable Editable editable) {
        Function1<? super Editable, Unit> function1 = this.f43011Oooo0oO;
        if (function1 != null) {
            function1.invoke(editable);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> function4 = this.f43010Oooo0o;
        if (function4 != null) {
            function4.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }
}
