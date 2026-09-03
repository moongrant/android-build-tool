package p485o0o00O0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.moment.TopicCreateActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00000 implements Observer<String> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicCreateActivity f48032OooO0Oo;

    public oO00000(TopicCreateActivity topicCreateActivity) {
        this.f48032OooO0Oo = topicCreateActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        int i = TopicCreateActivity.f26287OooOo0O;
        TopicCreateActivity topicCreateActivity = this.f48032OooO0Oo;
        topicCreateActivity.OooOo().f57587OooO0OO.f58954OooO0Oo.setText(it);
        if (!StringsKt.isBlank(it)) {
            topicCreateActivity.OooOo().f57587OooO0OO.f58954OooO0Oo.setHint("");
        } else {
            topicCreateActivity.OooOo().f57587OooO0OO.f58954OooO0Oo.setHint(oO00OOo0.Name_your_topic);
        }
        topicCreateActivity.OooOoO0();
    }
}
