package p485o0o00O0;

import androidx.lifecycle.Observer;
import com.code.android.util.o0000O;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import com.yalla.yalla.ui.view.HeaderLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p029Oooo0oo.oo0ooO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0o0O0 implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyActivity f48224OooO0Oo;

    public oo0o0O0(MomentReplyActivity momentReplyActivity) {
        this.f48224OooO0Oo = momentReplyActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(@NotNull Object result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (((Boolean) result).booleanValue()) {
            MomentReplyActivity momentReplyActivity = this.f48224OooO0Oo;
            MomentCommentDetailModel currentComment = momentReplyActivity.OooOoO().getCurrentComment();
            Intrinsics.checkNotNull(currentComment);
            currentComment.setNum(currentComment.getNum() + 1);
            HeaderLayout headerLayout = momentReplyActivity.f22755OooOO0;
            if (headerLayout != null) {
                String string = momentReplyActivity.getString(oO00OOo0.xxx_replies);
                MomentCommentDetailModel currentComment2 = momentReplyActivity.OooOoO().getCurrentComment();
                Intrinsics.checkNotNull(currentComment2);
                headerLayout.setTitle(o0000O.OooO00o(string, oo0ooO.OooO00o(currentComment2.getNum())));
            }
        }
    }
}
