package p492o0o00OO0;

import android.view.View;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0OOO extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ TopicSearchActivity f49488OooO0oO;

    public oOO0OOO(TopicSearchActivity topicSearchActivity) {
        this.f49488OooO0oO = topicSearchActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@Nullable View view) {
        TopicSearchActivity topicSearchActivity = this.f49488OooO0oO;
        if (!StringsKt.isBlank(TopicSearchActivity.OooOo(topicSearchActivity))) {
            TopicSearchActivity.OooOoO0(topicSearchActivity, TopicSearchActivity.OooOo(topicSearchActivity));
        } else {
            topicSearchActivity.OooOoo().loadSearchRecommendTopic();
            topicSearchActivity.OooOooO();
        }
    }
}
