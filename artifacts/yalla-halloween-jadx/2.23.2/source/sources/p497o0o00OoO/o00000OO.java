package p497o0o00OoO;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 RoomBottomMessageInputComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/MessageInputState$etMessageInput$2\n*L\n1#1,97:1\n78#2:98\n71#3:99\n515#4,3:100\n*E\n"})
public final class o00000OO implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000 f49700OooO0Oo;

    public o00000OO(o0000 o0000Var) {
        this.f49700OooO0Oo = o0000Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Nullable Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        boolean z = charSequence == null || StringsKt.isBlank(charSequence);
        o0000 o0000Var = this.f49700OooO0Oo;
        o0000Var.f49693OooOOO0.setValue(Boolean.valueOf(z));
        o0000Var.f49683OooO0O0.setValue(Boolean.FALSE);
    }
}
