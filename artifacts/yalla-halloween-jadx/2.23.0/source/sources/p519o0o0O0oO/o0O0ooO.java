package p519o0o0O0oO;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import p641o0ooOOOO.g1;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 AppealDialog.kt\ncom/yalla/yalla/ui/dialog/AppealDialog\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n41#2,3:98\n71#3:101\n77#4:102\n*E\n"})
public final class o0O0ooO implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O000o f52693OooO0Oo;

    public o0O0ooO(o00O000o o00o000o2) {
        this.f52693OooO0Oo = o00o000o2;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Nullable Editable editable) {
        o00O000o o00o000o2 = this.f52693OooO0Oo;
        g1 g1Var = o00o000o2.f52529OooOO0o;
        g1Var.f57951OooO0O0.setEnabled(StringsKt.trim((CharSequence) g1Var.f57952OooO0OO.getText().toString()).toString().length() >= 10);
        g1 g1Var2 = o00o000o2.f52529OooOO0o;
        TextView textView = g1Var2.f57954OooO0o;
        Editable text = g1Var2.f57952OooO0OO.getText();
        Intrinsics.checkNotNullExpressionValue(text, "binding.etReason.text");
        textView.setText(StringsKt.trim(text).length() + "/150");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }
}
