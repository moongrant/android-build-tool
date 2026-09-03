package p538o0o0Oo0;

import android.view.View;
import androidx.lifecycle.Observer;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.ui.activity.moment.TopicCreateNameActivity;
import com.yalla.yalla.ui.vm.moment.TopicEditVM;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0oO0O0o extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ TopicCreateNameActivity f44066Oooo;

    public o0oO0O0o(TopicCreateNameActivity topicCreateNameActivity) {
        this.f44066Oooo = topicCreateNameActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@Nullable View view) {
        final TopicCreateNameActivity topicCreateNameActivity = this.f44066Oooo;
        int i = TopicCreateNameActivity.f22564Ooooo0o;
        final String string = StringsKt.trim((CharSequence) topicCreateNameActivity.OooOoo().f51022OooO0O0.getText().toString()).toString();
        TopicEditVM topicEditVM = topicCreateNameActivity.f22566Ooooo00;
        if (topicEditVM == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            topicEditVM = null;
        }
        topicEditVM.checkTopicName(string).observe(topicCreateNameActivity, new Observer() { // from class: o0o0Oo0.o0O00oO0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                String topicName = string;
                TopicCreateNameActivity this$0 = topicCreateNameActivity;
                int i2 = TopicCreateNameActivity.f22564Ooooo0o;
                Intrinsics.checkNotNullParameter(topicName, "$topicName");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (((Response) obj).getIsSuccess()) {
                    LiveEventBus.get("TOPIC_NAME").post(topicName);
                    this$0.finish();
                }
            }
        });
    }
}
