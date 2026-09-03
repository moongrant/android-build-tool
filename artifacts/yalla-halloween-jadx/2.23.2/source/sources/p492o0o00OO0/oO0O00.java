package p492o0o00OO0;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.yalla.yalla.ui.activity.moment.TopicEditDescActivity;
import com.yalla.yalla.ui.view.HeaderLayout;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TopicEditDescActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicEditDescActivity\n*L\n1#1,97:1\n78#2:98\n71#3:99\n65#4,4:100\n*E\n"})
public final class oO0O00 implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicEditDescActivity f49426OooO0Oo;

    public oO0O00(TopicEditDescActivity topicEditDescActivity) {
        this.f49426OooO0Oo = topicEditDescActivity;
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
        int i4 = TopicEditDescActivity.f25898OooOo0o;
        TopicEditDescActivity topicEditDescActivity = this.f49426OooO0Oo;
        topicEditDescActivity.OooOo().f45043OooO0Oo.setText(length + "/200");
        HeaderLayout headerLayout = topicEditDescActivity.f22282OooOO0;
        TextView f29928OoooOOo = headerLayout != null ? headerLayout.getF29928OoooOOo() : null;
        if (f29928OoooOOo == null) {
            return;
        }
        f29928OoooOOo.setEnabled(!Intrinsics.areEqual(StringsKt.trim((CharSequence) String.valueOf(charSequence)).toString(), topicEditDescActivity.f25901OooOo00));
    }
}
