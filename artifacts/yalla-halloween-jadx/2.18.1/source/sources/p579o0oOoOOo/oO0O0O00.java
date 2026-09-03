package p579o0oOoOOo;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import p649o0ooOOoo.r7;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0O0O00 implements TextWatcher {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oO0O0Oo0 f46053Oooo0o;

    public oO0O0O00(oO0O0Oo0 oo0o0oo0) {
        this.f46053Oooo0o = oo0o0oo0;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Nullable Editable editable) {
        r7 r7Var = this.f46053Oooo0o.f46059OoooOO0;
        r7Var.f50424OooO0O0.setEnabled(StringsKt.trim((CharSequence) r7Var.f50425OooO0OO.getText().toString()).toString().length() >= 10);
        TextView textView = this.f46053Oooo0o.f46059OoooOO0.f50427OooO0o;
        StringBuilder sb = new StringBuilder();
        Editable text = this.f46053Oooo0o.f46059OoooOO0.f50425OooO0OO.getText();
        Intrinsics.checkNotNullExpressionValue(text, "binding.etReason.text");
        sb.append(StringsKt.trim(text).length());
        sb.append("/150");
        textView.setText(sb.toString());
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }
}
