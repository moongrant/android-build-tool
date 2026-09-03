package p485o0o00O0;

import android.view.View;
import com.yalla.yalla.ui.activity.moment.TopicCreateNameActivity;
import com.yalla.yalla.ui.vm.moment.TopicEditVM;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import p466o0Oooo0o.oo00o;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0Ooooo extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ TopicCreateNameActivity f48129OooO0oO;

    public oO0Ooooo(TopicCreateNameActivity topicCreateNameActivity) {
        this.f48129OooO0oO = topicCreateNameActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@Nullable View view) {
        int i = TopicCreateNameActivity.f26302OooOo0;
        TopicCreateNameActivity topicCreateNameActivity = this.f48129OooO0oO;
        String string = StringsKt.trim((CharSequence) topicCreateNameActivity.OooOo().f57731OooO0O0.getText().toString()).toString();
        TopicEditVM topicEditVM = topicCreateNameActivity.f26304OooOo00;
        if (topicEditVM == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            topicEditVM = null;
        }
        topicEditVM.checkTopicName(string).observe(topicCreateNameActivity, new oO000O0(topicCreateNameActivity, string));
    }
}
