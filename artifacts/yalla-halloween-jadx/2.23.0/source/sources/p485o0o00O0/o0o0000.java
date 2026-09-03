package p485o0o00O0;

import android.view.View;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p466o0Oooo0o.oo00o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0o0000 extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ TopicBlackListActivity f48008OooO0oO;

    public o0o0000(TopicBlackListActivity topicBlackListActivity) {
        this.f48008OooO0oO = topicBlackListActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        TopicBlackListActivity topicBlackListActivity = this.f48008OooO0oO;
        o0OOo000 o0ooo001 = topicBlackListActivity.f26277OooOo0;
        if (o0ooo001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            o0ooo001 = null;
        }
        o0ooo001.Oooo00O(true);
        topicBlackListActivity.OooOoO0(true);
    }
}
