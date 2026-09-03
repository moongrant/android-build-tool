package p485o0o00O0;

import android.view.View;
import com.yalla.yalla.ui.activity.moment.TopicEditRuleActivity;
import com.yalla.yalla.ui.vm.moment.TopicEditVM;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import p466o0Oooo0o.oo00o;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00000 extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ TopicEditRuleActivity f48140OooO0oO;

    public oOO00000(TopicEditRuleActivity topicEditRuleActivity) {
        this.f48140OooO0oO = topicEditRuleActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@Nullable View view) {
        int i = TopicEditRuleActivity.f26358OooOo0o;
        TopicEditRuleActivity topicEditRuleActivity = this.f48140OooO0oO;
        String string = StringsKt.trim((CharSequence) topicEditRuleActivity.OooOo().f57971OooO0O0.getText().toString()).toString();
        ((TopicEditVM) topicEditRuleActivity.f26362OooOo0O.getValue()).changeTopicRule(topicEditRuleActivity.f26360OooOo0, string).observe(topicEditRuleActivity, new oOO000(topicEditRuleActivity, string));
    }
}
