package p522o0o0O0o;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O0O implements TextWatcher {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function3 f43008Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function3 f43009Oooo0oO;

    public o00O0O0O(Function3 function3, Function3 function4) {
        this.f43008Oooo0o = function3;
        this.f43009Oooo0oO = function4;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Nullable Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        if (i2 > 0) {
            Function3 function3 = this.f43008Oooo0o;
            if (function3 != null) {
                function3.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2));
                return;
            }
            return;
        }
        Function3 function4 = this.f43009Oooo0oO;
        if (function4 != null) {
            function4.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i3));
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }
}
