package p417o0OoO0;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextChangedExt.kt\ncom/yalla/yalla/ext/TextChangedExtKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n78#2:98\n69#3,6:99\n77#4:105\n*E\n"})
public final class o0000OO0 implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function3 f45498OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function3 f45499OooO0o0;

    public o0000OO0(o0000O o0000o2, o000OO o000oo2) {
        this.f45498OooO0Oo = o0000o2;
        this.f45499OooO0o0 = o000oo2;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Nullable Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        if (i2 > 0) {
            Function3 function3 = this.f45498OooO0Oo;
            if (function3 != null) {
                function3.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2));
                return;
            }
            return;
        }
        Function3 function4 = this.f45499OooO0o0;
        if (function4 != null) {
            function4.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i3));
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }
}
