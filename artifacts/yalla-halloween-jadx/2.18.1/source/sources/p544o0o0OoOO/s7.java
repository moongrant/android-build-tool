package p544o0o0OoOO;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import p649o0ooOOoo.vf;

/* JADX INFO: loaded from: classes2.dex */
public final class s7 implements TextWatcher {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ vf f44310Oooo0o;

    public s7(vf vfVar) {
        this.f44310Oooo0o = vfVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Nullable Editable editable) {
        if (StringsKt.isBlank(this.f44310Oooo0o.f50817OooO0O0.getText().toString())) {
            Editable text = this.f44310Oooo0o.f50817OooO0O0.getText();
            Intrinsics.checkNotNullExpressionValue(text, "dialogBinding.etVoteSetTitle.text");
            if (text.length() > 0) {
                this.f44310Oooo0o.f50817OooO0O0.setText("");
            }
        }
        this.f44310Oooo0o.f50818OooO0OO.setText(this.f44310Oooo0o.f50817OooO0O0.getText().toString().length() + "/60");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }
}
