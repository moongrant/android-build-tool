package p492o0o00OO0;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.yalla.yalla.ui.activity.moment.TopicCreateNameActivity;
import com.yalla.yalla.ui.view.HeaderLayout;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TopicCreateNameActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicCreateNameActivity\n*L\n1#1,97:1\n78#2:98\n71#3:99\n54#4,4:100\n*E\n"})
public final class oO00000 implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicCreateNameActivity f49361OooO0Oo;

    public oO00000(TopicCreateNameActivity topicCreateNameActivity) {
        this.f49361OooO0Oo = topicCreateNameActivity;
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
        int i4 = TopicCreateNameActivity.f25851OooOo0;
        TopicCreateNameActivity topicCreateNameActivity = this.f49361OooO0Oo;
        topicCreateNameActivity.OooOo().f45034OooO0Oo.setText(length + "/32");
        HeaderLayout headerLayout = topicCreateNameActivity.f22282OooOO0;
        TextView f29928OoooOOo = headerLayout != null ? headerLayout.getF29928OoooOOo() : null;
        if (f29928OoooOOo == null) {
            return;
        }
        f29928OoooOOo.setEnabled(length > 0);
    }
}
