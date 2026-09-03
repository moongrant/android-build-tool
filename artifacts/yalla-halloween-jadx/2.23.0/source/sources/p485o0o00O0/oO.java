package p485o0o00O0;

import android.text.Editable;
import android.text.TextWatcher;
import com.yalla.yalla.ui.activity.moment.TopicEditRuleActivity;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TopicEditRuleActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicEditRuleActivity\n*L\n1#1,97:1\n78#2:98\n71#3:99\n65#4,3:100\n*E\n"})
public final class oO implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicEditRuleActivity f48026OooO0Oo;

    public oO(TopicEditRuleActivity topicEditRuleActivity) {
        this.f48026OooO0Oo = topicEditRuleActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Nullable Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        int length = String.valueOf(charSequence).length();
        int i4 = TopicEditRuleActivity.f26358OooOo0o;
        this.f48026OooO0Oo.OooOo().f57973OooO0Oo.setText(length + "/200");
    }
}
