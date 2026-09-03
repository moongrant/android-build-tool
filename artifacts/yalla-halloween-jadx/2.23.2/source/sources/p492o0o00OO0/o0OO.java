package p492o0o00OO0;

import android.view.View;
import android.widget.TextView;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import com.yalla.yalla.ui.view.HeaderLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p473o0OoooOo.o0OOOO0o;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ TopicBlackListActivity f49309OooO0oO;

    public o0OO(TopicBlackListActivity topicBlackListActivity) {
        this.f49309OooO0oO = topicBlackListActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@Nullable View view) {
        TextView f29928OoooOOo;
        TopicBlackListActivity topicBlackListActivity = this.f49309OooO0oO;
        topicBlackListActivity.f25830OooOo0O = !topicBlackListActivity.f25830OooOo0O;
        HeaderLayout headerLayout = topicBlackListActivity.f22282OooOO0;
        if (headerLayout != null && (f29928OoooOOo = headerLayout.getF29928OoooOOo()) != null) {
            f29928OoooOOo.setText(topicBlackListActivity.f25830OooOo0O ? o000000.Done : o000000.Edit);
        }
        o0OOO00 o0ooo00 = topicBlackListActivity.f25828OooOo0;
        if (o0ooo00 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            o0ooo00 = null;
        }
        o0ooo00.notifyDataSetChanged();
    }
}
