package p538o0o0Oo0;

import android.view.View;
import com.yalla.yalla.model.TopicBlackUserModel;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p188o00o00o0.OooO0OO;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00O0o extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ TopicBlackListActivity f43999Oooo;

    public o0O00O0o(TopicBlackListActivity topicBlackListActivity) {
        this.f43999Oooo = topicBlackListActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        OooO0OO<TopicBlackUserModel> oooO0OO = this.f43999Oooo.f22542Ooooo0o;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            oooO0OO = null;
        }
        oooO0OO.setFirstLoading(true);
        this.f43999Oooo.OooOooo(true);
    }
}
