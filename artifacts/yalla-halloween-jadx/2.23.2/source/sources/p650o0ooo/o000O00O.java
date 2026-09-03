package p650o0ooo;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.o0oOO;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 AppealDialog.kt\ncom/yalla/yalla/ui/dialog/AppealDialog\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n41#2,3:98\n71#3:101\n77#4:102\n*E\n"})
public final class o000O00O implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000OO0O f58494OooO0Oo;

    public o000O00O(o000OO0O o000oo0o2) {
        this.f58494OooO0Oo = o000oo0o2;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Nullable Editable editable) {
        o000OO0O o000oo0o2 = this.f58494OooO0Oo;
        o0oOO o0ooo2 = o000oo0o2.f58516OooOO0o;
        o0ooo2.f44678OooO0O0.setEnabled(StringsKt.trim((CharSequence) o0ooo2.f44679OooO0OO.getText().toString()).toString().length() >= 10);
        o0oOO o0ooo3 = o000oo0o2.f58516OooOO0o;
        TextView textView = o0ooo3.f44681OooO0o;
        Editable text = o0ooo3.f44679OooO0OO.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        textView.setText(StringsKt.trim(text).length() + "/150");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }
}
