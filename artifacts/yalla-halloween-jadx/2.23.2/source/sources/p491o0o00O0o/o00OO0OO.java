package p491o0o00O0o;

import android.text.Editable;
import android.text.TextWatcher;
import com.code.android.util.OooOo00;
import com.yalla.yalla.ui.activity.account.PasswordActivity;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 PasswordActivity.kt\ncom/yalla/yalla/ui/activity/account/PasswordActivity\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n134#2,10:98\n71#3:108\n77#4:109\n*E\n"})
public final class o00OO0OO implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PasswordActivity f48987OooO0Oo;

    public o00OO0OO(PasswordActivity passwordActivity) {
        this.f48987OooO0Oo = passwordActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Nullable Editable editable) {
        int i = PasswordActivity.f24770OooOoOO;
        PasswordActivity passwordActivity = this.f48987OooO0Oo;
        String string = StringsKt.trim((CharSequence) passwordActivity.OooOoO0().f44208OooO0OO.getText().toString()).toString();
        passwordActivity.OooOoO0().f44207OooO0O0.setEnabled(OooOo00.OooO0O0(string) && string.length() >= 6 && string.length() <= 24);
        if (OooOo00.OooO0O0(string)) {
            passwordActivity.OooOoO0().f44209OooO0Oo.setVisibility(0);
            passwordActivity.OooOoO0().f44209OooO0Oo.setClickable(true);
        } else {
            passwordActivity.OooOoO0().f44209OooO0Oo.setClickable(false);
            passwordActivity.OooOoO0().f44209OooO0Oo.setVisibility(4);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }
}
