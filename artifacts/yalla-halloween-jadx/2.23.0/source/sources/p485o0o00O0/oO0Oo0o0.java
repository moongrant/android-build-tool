package p485o0o00O0;

import android.view.View;
import androidx.lifecycle.ViewModelLazy;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.ui.activity.moment.TopicEditDescActivity;
import com.yalla.yalla.ui.vm.moment.TopicEditVM;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import p466o0Oooo0o.oo00o;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0Oo0o0 extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ TopicEditDescActivity f48125OooO0oO;

    public oO0Oo0o0(TopicEditDescActivity topicEditDescActivity) {
        this.f48125OooO0oO = topicEditDescActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@Nullable View view) {
        int i = TopicEditDescActivity.f26349OooOo0o;
        TopicEditDescActivity topicEditDescActivity = this.f48125OooO0oO;
        String string = StringsKt.trim((CharSequence) topicEditDescActivity.OooOo().f57919OooO0O0.getText().toString()).toString();
        boolean z = string.length() == 0;
        ViewModelLazy viewModelLazy = topicEditDescActivity.f26353OooOo0O;
        if (!z) {
            ((TopicEditVM) viewModelLazy.getValue()).checkTopicDesc(string).observe(topicEditDescActivity, new oO0OO00(topicEditDescActivity, string));
        } else if (topicEditDescActivity.f26351OooOo0 != 0) {
            ((TopicEditVM) viewModelLazy.getValue()).changeTopicDesc(topicEditDescActivity.f26351OooOo0, string).observe(topicEditDescActivity, new oO0oO000(topicEditDescActivity, string));
        } else {
            LiveEventBus.get("TOPIC_DESC").post(string);
            topicEditDescActivity.finish();
        }
    }
}
