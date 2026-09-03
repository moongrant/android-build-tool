package p538o0o0Oo0;

import android.view.View;
import android.widget.TextView;
import com.app.base.view.HeaderLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.TopicBlackUserModel;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p188o00o00o0.OooO0OO;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ TopicBlackListActivity f43986Oooo;

    public o0O00(TopicBlackListActivity topicBlackListActivity) {
        this.f43986Oooo = topicBlackListActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@Nullable View view) {
        TextView f12044o000000;
        TopicBlackListActivity topicBlackListActivity = this.f43986Oooo;
        topicBlackListActivity.f22543OooooO0 = !topicBlackListActivity.f22543OooooO0;
        HeaderLayout headerLayout = topicBlackListActivity.f11463OoooO;
        if (headerLayout != null && (f12044o000000 = headerLayout.getF12044o000000()) != null) {
            f12044o000000.setText(this.f43986Oooo.f22543OooooO0 ? R.string.Done : R.string.Edit);
        }
        OooO0OO<TopicBlackUserModel> oooO0OO = this.f43986Oooo.f22542Ooooo0o;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            oooO0OO = null;
        }
        oooO0OO.notifyDataSetChanged();
    }
}
