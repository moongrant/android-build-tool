package p538o0o0Oo0;

import android.text.Editable;
import android.text.TextWatcher;
import com.yalla.yalla.ui.activity.moment.TopicEditRuleActivity;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0oO0 implements TextWatcher {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TopicEditRuleActivity f44109Oooo0o;

    public oo0oO0(TopicEditRuleActivity topicEditRuleActivity) {
        this.f44109Oooo0o = topicEditRuleActivity;
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
        TopicEditRuleActivity topicEditRuleActivity = this.f44109Oooo0o;
        int i4 = TopicEditRuleActivity.f22610OooooOO;
        topicEditRuleActivity.OooOoo().f49031OooO0Oo.setText(length + "/200");
    }
}
