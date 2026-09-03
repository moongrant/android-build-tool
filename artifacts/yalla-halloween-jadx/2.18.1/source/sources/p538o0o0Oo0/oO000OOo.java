package p538o0o0Oo0;

import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.UserPostListActivity;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class oO000OOo extends Lambda implements Function1<MomentDetailModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UserPostListActivity f44092Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ long f44093Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000OOo(UserPostListActivity userPostListActivity, long j) {
        super(1);
        this.f44092Oooo0o = userPostListActivity;
        this.f44093Oooo0oO = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentDetailModel momentDetailModel) {
        MomentDetailModel momentDetailModel2 = momentDetailModel;
        if (momentDetailModel2 != null) {
            UserPostListActivity userPostListActivity = this.f44092Oooo0o;
            UserPostListActivity.OooO00o oooO00o = UserPostListActivity.f22674Ooooooo;
            List<MomentDetailModel> data = userPostListActivity.OooOooo().getData();
            Intrinsics.checkNotNullExpressionValue(data, "mAdapter.data");
            long j = this.f44093Oooo0oO;
            Iterator<MomentDetailModel> it = data.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (it.next().getId() == j) {
                    break;
                }
                i++;
            }
            if (i != -1 && this.f44092Oooo0o.OooOooo().getData().size() > i) {
                this.f44092Oooo0o.OooOooo().setData(i, momentDetailModel2);
            }
        }
        return Unit.INSTANCE;
    }
}
