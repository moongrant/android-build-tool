package p492o0o00OO0;

import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.code.android.util.o000O;
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
public final class oO0Oo0oo extends Lambda implements Function1<Response<TopicInfoModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicDetailActivity f49454OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Oo0oo(TopicDetailActivity topicDetailActivity) {
        super(1);
        this.f49454OooO0Oo = topicDetailActivity;
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
        TopicDetailActivity topicDetailActivity = this.f49454OooO0Oo;
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
                    headerLayout = topicDetailActivity.f22282OooOO0;
                    if (headerLayout != null) {
                        ImageView imageView = headerLayout.f29929OoooOo0;
                        imageView.setImageDrawable(null);
                        o000O.OooO0O0(imageView);
                    }
                    int i = TopicDetailActivity.f25854OooOoOO;
                    CoordinatorLayout clTopics = topicDetailActivity.OooOoOO().f45014OooO0OO;
                    Intrinsics.checkNotNullExpressionValue(clTopics, "clTopics");
                    o000O.OooO0O0(clTopics);
                    ImageView ivCreate = topicDetailActivity.OooOoOO().f45019OooO0oo;
                    Intrinsics.checkNotNullExpressionValue(ivCreate, "ivCreate");
                    o000O.OooO0O0(ivCreate);
                    LinearLayout linearLayout = topicDetailActivity.OooOoOO().f45016OooO0o.f44311OooO00o;
                    Intrinsics.checkNotNullExpressionValue(linearLayout, "getRoot(...)");
                    o000O.OooOOOO(linearLayout);
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
                headerLayout = topicDetailActivity.f22282OooOO0;
                if (headerLayout != null) {
                    ImageView imageView2 = headerLayout.f29929OoooOo0;
                    imageView2.setImageDrawable(null);
                    o000O.OooO0O0(imageView2);
                }
                int i2 = TopicDetailActivity.f25854OooOoOO;
                CoordinatorLayout clTopics2 = topicDetailActivity.OooOoOO().f45014OooO0OO;
                Intrinsics.checkNotNullExpressionValue(clTopics2, "clTopics");
                o000O.OooO0O0(clTopics2);
                ImageView ivCreate2 = topicDetailActivity.OooOoOO().f45019OooO0oo;
                Intrinsics.checkNotNullExpressionValue(ivCreate2, "ivCreate");
                o000O.OooO0O0(ivCreate2);
                LinearLayout linearLayout2 = topicDetailActivity.OooOoOO().f45016OooO0o.f44311OooO00o;
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "getRoot(...)");
                o000O.OooOOOO(linearLayout2);
            }
        }
        return Unit.INSTANCE;
    }
}
