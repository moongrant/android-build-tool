package p538o0o0Oo0;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.app.base.view.HeaderLayout;
import com.yalla.yalla.ui.activity.moment.TopicCreateNameActivity;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O0O implements TextWatcher {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TopicCreateNameActivity f44008Oooo0o;

    public o0O0O0O(TopicCreateNameActivity topicCreateNameActivity) {
        this.f44008Oooo0o = topicCreateNameActivity;
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
        TopicCreateNameActivity topicCreateNameActivity = this.f44008Oooo0o;
        int i4 = TopicCreateNameActivity.f22564Ooooo0o;
        topicCreateNameActivity.OooOoo().f51024OooO0Oo.setText(length + "/32");
        HeaderLayout headerLayout = this.f44008Oooo0o.f11463OoooO;
        TextView f12044o000000 = headerLayout != null ? headerLayout.getF12044o000000() : null;
        if (f12044o000000 == null) {
            return;
        }
        f12044o000000.setEnabled(length > 0);
    }
}
