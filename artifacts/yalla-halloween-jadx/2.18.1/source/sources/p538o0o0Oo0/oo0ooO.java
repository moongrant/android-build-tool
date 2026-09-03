package p538o0o0Oo0;

import android.view.View;
import androidx.lifecycle.Observer;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.ui.activity.moment.TopicEditRuleActivity;
import com.yalla.yalla.ui.vm.moment.TopicEditVM;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0ooO extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ TopicEditRuleActivity f44112Oooo;

    public oo0ooO(TopicEditRuleActivity topicEditRuleActivity) {
        this.f44112Oooo = topicEditRuleActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@Nullable View view) {
        TopicEditRuleActivity topicEditRuleActivity = this.f44112Oooo;
        int i = TopicEditRuleActivity.f22610OooooOO;
        final String string = StringsKt.trim((CharSequence) topicEditRuleActivity.OooOoo().f49029OooO0O0.getText().toString()).toString();
        final TopicEditRuleActivity topicEditRuleActivity2 = this.f44112Oooo;
        ((TopicEditVM) topicEditRuleActivity2.f22614OooooO0.getValue()).changeTopicRule(topicEditRuleActivity2.f22613Ooooo0o, string).observe(topicEditRuleActivity2, new Observer() { // from class: o0o0Oo0.o0OO000o
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                String rule = string;
                TopicEditRuleActivity this$0 = topicEditRuleActivity2;
                int i2 = TopicEditRuleActivity.f22610OooooOO;
                Intrinsics.checkNotNullParameter(rule, "$rule");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (((Response) obj).getIsSuccess()) {
                    ToastUtil.f12567OooO00o.OooO00o(R.string.Success);
                    LiveEventBus.get("TOPIC_RULE").post(rule);
                    this$0.finish();
                }
            }
        });
    }
}
