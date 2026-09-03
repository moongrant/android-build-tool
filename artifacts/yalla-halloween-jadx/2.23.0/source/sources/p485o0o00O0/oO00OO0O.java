package p485o0o00O0;

import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.code.android.util.o000OO00;
import com.yalla.yalla.model.http.Error;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.view.HeaderLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00OO0O extends Lambda implements Function1<Response<TopicInfoModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicDetailActivity f48048OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OO0O(TopicDetailActivity topicDetailActivity) {
        super(1);
        this.f48048OooO0Oo = topicDetailActivity;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0044  */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Response<TopicInfoModel> response) {
        Error error;
        Integer code;
        HeaderLayout headerLayout;
        Response<TopicInfoModel> response2 = response;
        boolean isSuccess = response2.getIsSuccess();
        TopicDetailActivity topicDetailActivity = this.f48048OooO0Oo;
        if (isSuccess) {
            if (response2.getData() != null) {
                TopicInfoModel data = response2.getData();
                Intrinsics.checkNotNull(data);
                TopicDetailActivity.OooOo(topicDetailActivity, data);
            } else if (!response2.getIsSuccess()) {
                error = response2.getError();
                if (error != null) {
                    code = error.getCode();
                } else {
                    code = null;
                }
                if (code != null) {
                    headerLayout = topicDetailActivity.f22755OooOO0;
                    if (headerLayout != null) {
                        ImageView imageView = headerLayout.f30474OoooOo0;
                        imageView.setImageDrawable(null);
                        o000OO00.OooO0O0(imageView);
                    }
                    int i = TopicDetailActivity.f26305OooOoOO;
                    CoordinatorLayout coordinatorLayout = topicDetailActivity.OooOoOO().f57822OooO0OO;
                    Intrinsics.checkNotNullExpressionValue(coordinatorLayout, "binding.clTopics");
                    o000OO00.OooO0O0(coordinatorLayout);
                    ImageView imageView2 = topicDetailActivity.OooOoOO().f57827OooO0oo;
                    Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivCreate");
                    o000OO00.OooO0O0(imageView2);
                    LinearLayout linearLayout = topicDetailActivity.OooOoOO().f57824OooO0o.f58153OooO00o;
                    Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.emptyLayout.root");
                    o000OO00.OooOOOO(linearLayout);
                }
            }
        } else if (!response2.getIsSuccess()) {
            error = response2.getError();
            if (error != null) {
                code = error.getCode();
            } else {
                code = null;
            }
            if (code != null && code.intValue() == 4006) {
                headerLayout = topicDetailActivity.f22755OooOO0;
                if (headerLayout != null) {
                    ImageView imageView3 = headerLayout.f30474OoooOo0;
                    imageView3.setImageDrawable(null);
                    o000OO00.OooO0O0(imageView3);
                }
                int i2 = TopicDetailActivity.f26305OooOoOO;
                CoordinatorLayout coordinatorLayout2 = topicDetailActivity.OooOoOO().f57822OooO0OO;
                Intrinsics.checkNotNullExpressionValue(coordinatorLayout2, "binding.clTopics");
                o000OO00.OooO0O0(coordinatorLayout2);
                ImageView imageView4 = topicDetailActivity.OooOoOO().f57827OooO0oo;
                Intrinsics.checkNotNullExpressionValue(imageView4, "binding.ivCreate");
                o000OO00.OooO0O0(imageView4);
                LinearLayout linearLayout2 = topicDetailActivity.OooOoOO().f57824OooO0o.f58153OooO00o;
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.emptyLayout.root");
                o000OO00.OooOOOO(linearLayout2);
            }
        }
        return Unit.INSTANCE;
    }
}
