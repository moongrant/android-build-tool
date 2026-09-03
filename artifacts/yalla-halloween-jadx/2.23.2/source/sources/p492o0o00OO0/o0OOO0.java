package p492o0o00OO0;

import android.view.View;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0 extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ TopicBlackListActivity f49323OooO0oO;

    public o0OOO0(TopicBlackListActivity topicBlackListActivity) {
        this.f49323OooO0oO = topicBlackListActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        TopicBlackListActivity topicBlackListActivity = this.f49323OooO0oO;
        o0OOO00 o0ooo00 = topicBlackListActivity.f25828OooOo0;
        if (o0ooo00 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            o0ooo00 = null;
        }
        o0ooo00.Oooo00O(true);
        topicBlackListActivity.OooOoO0(true);
    }
}
