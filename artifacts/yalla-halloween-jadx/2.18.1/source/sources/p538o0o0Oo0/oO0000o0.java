package p538o0o0Oo0;

import android.text.Editable;
import android.view.View;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0000o0 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ TopicSearchActivity f44087Oooo;

    public oO0000o0(TopicSearchActivity topicSearchActivity) {
        this.f44087Oooo = topicSearchActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@Nullable View view) {
        TopicSearchActivity topicSearchActivity = this.f44087Oooo;
        TopicSearchActivity.OooO00o oooO00o = TopicSearchActivity.f22654OooooOo;
        Editable text = topicSearchActivity.OooOooO().f50444OooO0O0.getText();
        if (text == null || StringsKt.isBlank(text)) {
            this.f44087Oooo.Oooo000().loadSearchRecommendTopic();
            this.f44087Oooo.Oooo00o();
        } else {
            TopicSearchActivity topicSearchActivity2 = this.f44087Oooo;
            topicSearchActivity2.Oooo00O(topicSearchActivity2.OooOooO().f50444OooO0O0.getText().toString());
        }
    }
}
