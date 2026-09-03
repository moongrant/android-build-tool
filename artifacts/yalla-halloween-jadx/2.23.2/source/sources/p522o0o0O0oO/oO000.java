package p522o0o0O0oO;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.compose.runtime.MutableState;
import com.yalla.yalla.ui.view.rich_edit_text.RichEditText;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 RichTextField.kt\ncom/yalla/yalla/ui/composable/rich_text_filed/RichTextFieldKt$RichTextField$4$1$1\n*L\n1#1,97:1\n78#2:98\n71#3:99\n104#4,3:100\n*E\n"})
public final class oO000 implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1 f53071OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState f53072OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RichEditText f53073OooO0o0;

    public oO000(Function1 function1, RichEditText richEditText, MutableState mutableState) {
        this.f53071OooO0Oo = function1;
        this.f53073OooO0o0 = richEditText;
        this.f53072OooO0o = mutableState;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Nullable Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        this.f53072OooO0o.setValue(String.valueOf(charSequence));
        this.f53071OooO0Oo.invoke(this.f53073OooO0o0.getEditableText().toString());
    }
}
