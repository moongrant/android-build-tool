package p474o0o00;

import android.text.Editable;
import android.text.TextWatcher;
import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 PhoneNumberActivity.kt\ncom/yalla/yalla/ui/activity/account/PhoneNumberActivity\n*L\n1#1,97:1\n78#2:98\n71#3:99\n217#4,2:100\n*E\n"})
public final class o00OOOOo implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PhoneNumberActivity f47284OooO0Oo;

    public o00OOOOo(PhoneNumberActivity phoneNumberActivity) {
        this.f47284OooO0Oo = phoneNumberActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Nullable Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        int i4 = PhoneNumberActivity.f25262OooOoO;
        this.f47284OooO0Oo.OooOoo();
    }
}
