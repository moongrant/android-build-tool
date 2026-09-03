package p538o0o0Oo0;

import android.text.Editable;
import android.text.TextWatcher;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0000O implements TextWatcher {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TopicSearchActivity f44084Oooo0o;

    public oO0000O(TopicSearchActivity topicSearchActivity) {
        this.f44084Oooo0o = topicSearchActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Nullable Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence == null || StringsKt.isBlank(charSequence)) {
            TopicSearchActivity topicSearchActivity = this.f44084Oooo0o;
            TopicSearchActivity.OooO00o oooO00o = TopicSearchActivity.f22654OooooOo;
            topicSearchActivity.Oooo00o();
        }
    }
}
