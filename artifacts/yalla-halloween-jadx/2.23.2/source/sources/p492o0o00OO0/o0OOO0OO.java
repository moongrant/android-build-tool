package p492o0o00OO0;

import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.topic.TopicBlackUserModel;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.vm.moment.TopicBlackListVM;
import java.util.Collection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicBlackListActivity f49325OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ TopicBlackUserModel f49326OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0OO(TopicBlackListActivity topicBlackListActivity, TopicBlackUserModel topicBlackUserModel) {
        super(0);
        this.f49325OooO0Oo = topicBlackListActivity;
        this.f49326OooO0o0 = topicBlackUserModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = TopicBlackListActivity.f25826OooOo;
        final TopicBlackListActivity topicBlackListActivity = this.f49325OooO0Oo;
        TopicBlackListVM topicBlackListVM = (TopicBlackListVM) topicBlackListActivity.f25829OooOo00.getValue();
        final TopicBlackUserModel topicBlackUserModel = this.f49326OooO0o0;
        topicBlackListVM.blackUser(topicBlackUserModel.getUserId(), false).observe(topicBlackListActivity, new Observer() { // from class: o0o00OO0.o0OOooO0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                TextView f29928OoooOOo;
                ApiResult apiResult = (ApiResult) obj;
                int i2 = TopicBlackListActivity.f25826OooOo;
                TopicBlackListActivity this$0 = topicBlackListActivity;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                TopicBlackUserModel userModel = topicBlackUserModel;
                Intrinsics.checkNotNullParameter(userModel, "$userModel");
                if (apiResult.isSuccess()) {
                    o0OOO00 o0ooo00 = this$0.f25828OooOo0;
                    o0OOO00 o0ooo01 = null;
                    if (o0ooo00 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                        o0ooo00 = null;
                    }
                    Collection collection = o0ooo00.f13189OooOOoo;
                    Intrinsics.checkNotNullExpressionValue(collection, "getData(...)");
                    int i3 = 0;
                    for (Object obj2 : collection) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((TopicBlackUserModel) obj2).getUserId() == userModel.getUserId()) {
                            o0OOO00 o0ooo02 = this$0.f25828OooOo0;
                            if (o0ooo02 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                                o0ooo02 = null;
                            }
                            o0ooo02.OooOOo(i3);
                            o0OOO00 o0ooo03 = this$0.f25828OooOo0;
                            if (o0ooo03 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                                o0ooo03 = null;
                            }
                            if (o0ooo03.f13189OooOOoo.isEmpty()) {
                                this$0.f25830OooOo0O = false;
                                HeaderLayout headerLayout = this$0.f22282OooOO0;
                                if (headerLayout != null && (f29928OoooOOo = headerLayout.getF29928OoooOOo()) != null) {
                                    f29928OoooOOo.setText(o000000.Edit);
                                }
                                HeaderLayout headerLayout2 = this$0.f22282OooOO0;
                                TextView f29928OoooOOo2 = headerLayout2 != null ? headerLayout2.getF29928OoooOOo() : null;
                                if (f29928OoooOOo2 != null) {
                                    f29928OoooOOo2.setEnabled(false);
                                }
                                o0OOO00 o0ooo04 = this$0.f25828OooOo0;
                                if (o0ooo04 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                                } else {
                                    o0ooo01 = o0ooo04;
                                }
                                o0ooo01.Oooo0O0(apiResult.isSuccess());
                            }
                            this$0.OooOoO(true);
                            return;
                        }
                        i3 = i4;
                    }
                }
            }
        });
        return Unit.INSTANCE;
    }
}
