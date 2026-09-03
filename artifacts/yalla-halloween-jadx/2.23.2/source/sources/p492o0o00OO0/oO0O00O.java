package p492o0o00OO0;

import android.view.View;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.ui.activity.moment.TopicEditDescActivity;
import com.yalla.yalla.ui.vm.moment.TopicEditVM;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O00O extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ TopicEditDescActivity f49431OooO0oO;

    public oO0O00O(TopicEditDescActivity topicEditDescActivity) {
        this.f49431OooO0oO = topicEditDescActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@Nullable View view) {
        int i = TopicEditDescActivity.f25898OooOo0o;
        final TopicEditDescActivity topicEditDescActivity = this.f49431OooO0oO;
        final String string = StringsKt.trim((CharSequence) topicEditDescActivity.OooOo().f45041OooO0O0.getText().toString()).toString();
        boolean z = string.length() == 0;
        ViewModelLazy viewModelLazy = topicEditDescActivity.f25902OooOo0O;
        if (!z) {
            ((TopicEditVM) viewModelLazy.getValue()).checkTopicDesc(string).observe(topicEditDescActivity, new Observer() { // from class: o0o00OO0.oO0O000
                /* JADX WARN: Multi-variable type inference failed */
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    int i2 = TopicEditDescActivity.f25898OooOo0o;
                    TopicEditDescActivity this$0 = topicEditDescActivity;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    String desc = string;
                    Intrinsics.checkNotNullParameter(desc, "$desc");
                    if (((Response) obj).getIsSuccess()) {
                        if (this$0.f25900OooOo0 != 0) {
                            ((TopicEditVM) this$0.f25902OooOo0O.getValue()).changeTopicDesc(this$0.f25900OooOo0, desc).observe(this$0, new oO0O000o(this$0, desc));
                        } else {
                            LiveEventBus.get("TOPIC_DESC").post(desc);
                            this$0.finish();
                        }
                    }
                }
            });
        } else if (topicEditDescActivity.f25900OooOo0 != 0) {
            ((TopicEditVM) viewModelLazy.getValue()).changeTopicDesc(topicEditDescActivity.f25900OooOo0, string).observe(topicEditDescActivity, new oO0O000o(topicEditDescActivity, string));
        } else {
            LiveEventBus.get("TOPIC_DESC").post(string);
            topicEditDescActivity.finish();
        }
    }
}
