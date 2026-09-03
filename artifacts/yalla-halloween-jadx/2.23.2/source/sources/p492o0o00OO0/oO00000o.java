package p492o0o00OO0;

import android.view.View;
import androidx.lifecycle.Observer;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.ui.activity.moment.TopicCreateNameActivity;
import com.yalla.yalla.ui.vm.moment.TopicEditVM;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00000o extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ TopicCreateNameActivity f49362OooO0oO;

    public oO00000o(TopicCreateNameActivity topicCreateNameActivity) {
        this.f49362OooO0oO = topicCreateNameActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@Nullable View view) {
        int i = TopicCreateNameActivity.f25851OooOo0;
        final TopicCreateNameActivity topicCreateNameActivity = this.f49362OooO0oO;
        final String string = StringsKt.trim((CharSequence) topicCreateNameActivity.OooOo().f45032OooO0O0.getText().toString()).toString();
        TopicEditVM topicEditVM = topicCreateNameActivity.f25853OooOo00;
        if (topicEditVM == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            topicEditVM = null;
        }
        topicEditVM.checkTopicName(string).observe(topicCreateNameActivity, new Observer() { // from class: o0o00OO0.o
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i2 = TopicCreateNameActivity.f25851OooOo0;
                String topicName = string;
                Intrinsics.checkNotNullParameter(topicName, "$topicName");
                TopicCreateNameActivity this$0 = topicCreateNameActivity;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (((Response) obj).getIsSuccess()) {
                    LiveEventBus.get("TOPIC_NAME").post(topicName);
                    this$0.finish();
                }
            }
        });
    }
}
