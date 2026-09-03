package p485o0o00O0;

import android.view.View;
import android.widget.TextView;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import com.yalla.yalla.ui.view.HeaderLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p466o0Oooo0o.oo00o;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOOO0o extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ TopicBlackListActivity f48001OooO0oO;

    public o0OOOO0o(TopicBlackListActivity topicBlackListActivity) {
        this.f48001OooO0oO = topicBlackListActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@Nullable View view) {
        TextView f30473OoooOOo;
        TopicBlackListActivity topicBlackListActivity = this.f48001OooO0oO;
        topicBlackListActivity.f26279OooOo0O = !topicBlackListActivity.f26279OooOo0O;
        HeaderLayout headerLayout = topicBlackListActivity.f22755OooOO0;
        if (headerLayout != null && (f30473OoooOOo = headerLayout.getF30473OoooOOo()) != null) {
            f30473OoooOOo.setText(topicBlackListActivity.f26279OooOo0O ? oO00OOo0.Done : oO00OOo0.Edit);
        }
        o0OOo000 o0ooo001 = topicBlackListActivity.f26277OooOo0;
        if (o0ooo001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            o0ooo001 = null;
        }
        o0ooo001.notifyDataSetChanged();
    }
}
