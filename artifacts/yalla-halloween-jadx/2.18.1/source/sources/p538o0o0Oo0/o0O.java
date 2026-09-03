package p538o0o0Oo0;

import android.view.View;
import androidx.lifecycle.Observer;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.ui.activity.moment.TopicEditDescActivity;
import com.yalla.yalla.ui.vm.moment.TopicEditVM;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ TopicEditDescActivity f43985Oooo;

    public o0O(TopicEditDescActivity topicEditDescActivity) {
        this.f43985Oooo = topicEditDescActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@Nullable View view) {
        TopicEditDescActivity topicEditDescActivity = this.f43985Oooo;
        int i = TopicEditDescActivity.f22601OooooOO;
        final String string = StringsKt.trim((CharSequence) topicEditDescActivity.OooOoo().f48938OooO0O0.getText().toString()).toString();
        final TopicEditDescActivity topicEditDescActivity2 = this.f43985Oooo;
        Objects.requireNonNull(topicEditDescActivity2);
        if (!(string.length() == 0)) {
            ((TopicEditVM) topicEditDescActivity2.f22605OooooO0.getValue()).checkTopicDesc(string).observe(topicEditDescActivity2, new Observer() { // from class: o0o0Oo0.o0O0o0
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    TopicEditDescActivity this$0 = topicEditDescActivity2;
                    String desc = string;
                    int i2 = TopicEditDescActivity.f22601OooooOO;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(desc, "$desc");
                    if (((Response) obj).getIsSuccess()) {
                        if (this$0.f22604Ooooo0o != 0) {
                            this$0.OooOooO(desc);
                        } else {
                            LiveEventBus.get("TOPIC_DESC").post(desc);
                            this$0.finish();
                        }
                    }
                }
            });
        } else if (topicEditDescActivity2.f22604Ooooo0o != 0) {
            topicEditDescActivity2.OooOooO(string);
        } else {
            LiveEventBus.get("TOPIC_DESC").post(string);
            topicEditDescActivity2.finish();
        }
    }
}
