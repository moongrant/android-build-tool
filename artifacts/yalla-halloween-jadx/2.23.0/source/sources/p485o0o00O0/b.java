package p485o0o00O0;

import android.view.View;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import p466o0Oooo0o.oo00o;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ TopicSearchActivity f47776OooO0oO;

    public b(TopicSearchActivity topicSearchActivity) {
        this.f47776OooO0oO = topicSearchActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@Nullable View view) {
        TopicSearchActivity topicSearchActivity = this.f47776OooO0oO;
        if (!StringsKt.isBlank(TopicSearchActivity.OooOo(topicSearchActivity))) {
            TopicSearchActivity.OooOoO0(topicSearchActivity, TopicSearchActivity.OooOo(topicSearchActivity));
        } else {
            topicSearchActivity.OooOoo().loadSearchRecommendTopic();
            topicSearchActivity.OooOooO();
        }
    }
}
