package p538o0o0Oo0;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.app.base.view.HeaderLayout;
import com.yalla.yalla.ui.activity.moment.TopicEditDescActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0oo00 implements TextWatcher {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TopicEditDescActivity f44023Oooo0o;

    public o0O0oo00(TopicEditDescActivity topicEditDescActivity) {
        this.f44023Oooo0o = topicEditDescActivity;
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
        TopicEditDescActivity topicEditDescActivity = this.f44023Oooo0o;
        int i4 = TopicEditDescActivity.f22601OooooOO;
        topicEditDescActivity.OooOoo().f48940OooO0Oo.setText(length + "/200");
        HeaderLayout headerLayout = this.f44023Oooo0o.f11463OoooO;
        TextView f12044o000000 = headerLayout != null ? headerLayout.getF12044o000000() : null;
        if (f12044o000000 == null) {
            return;
        }
        f12044o000000.setEnabled(!Intrinsics.areEqual(StringsKt.trim((CharSequence) String.valueOf(charSequence)).toString(), this.f44023Oooo0o.f22603Ooooo00));
    }
}
