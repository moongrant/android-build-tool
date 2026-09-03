package p496o0o00o;

import android.text.Editable;
import android.text.TextWatcher;
import com.yalla.yalla.ui.activity.user.UserInfoEditRemarkActivity;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 UserInfoEditRemarkActivity.kt\ncom/yalla/yalla/ui/activity/user/UserInfoEditRemarkActivity\n*L\n1#1,97:1\n78#2:98\n71#3:99\n65#4,2:100\n*E\n"})
public final class oO0 implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditRemarkActivity f49125OooO0Oo;

    public oO0(UserInfoEditRemarkActivity userInfoEditRemarkActivity) {
        this.f49125OooO0Oo = userInfoEditRemarkActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Nullable Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        int i4 = UserInfoEditRemarkActivity.f27323OooOo0o;
        this.f49125OooO0Oo.OooOoO0(charSequence);
    }
}
