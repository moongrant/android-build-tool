package p485o0o00O0;

import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.topic.TopicBlackUserModel;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import com.yalla.yalla.ui.view.HeaderLayout;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nTopicBlackListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicBlackListActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicBlackListActivity$removeBlack$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,266:1\n1864#2,3:267\n*S KotlinDebug\n*F\n+ 1 TopicBlackListActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicBlackListActivity$removeBlack$1\n*L\n236#1:267,3\n*E\n"})
public final class oO0Oo implements Observer<ApiResult<Object>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicBlackListActivity f48123OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ TopicBlackUserModel f48124OooO0o0;

    public oO0Oo(TopicBlackListActivity topicBlackListActivity, TopicBlackUserModel topicBlackUserModel) {
        this.f48123OooO0Oo = topicBlackListActivity;
        this.f48124OooO0o0 = topicBlackUserModel;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(ApiResult<Object> apiResult) {
        TextView f30473OoooOOo;
        ApiResult<Object> apiResult2 = apiResult;
        if (apiResult2.isSuccess()) {
            TopicBlackListActivity topicBlackListActivity = this.f48123OooO0Oo;
            o0OOo000 o0ooo001 = topicBlackListActivity.f26277OooOo0;
            o0OOo000 o0ooo002 = null;
            if (o0ooo001 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                o0ooo001 = null;
            }
            Collection collection = o0ooo001.f10111OooOOoo;
            Intrinsics.checkNotNullExpressionValue(collection, "baseAdapter.data");
            int i = 0;
            for (Object obj : collection) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (((TopicBlackUserModel) obj).getUserId() == this.f48124OooO0o0.getUserId()) {
                    o0OOo000 o0ooo003 = topicBlackListActivity.f26277OooOo0;
                    if (o0ooo003 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                        o0ooo003 = null;
                    }
                    o0ooo003.OooOOo(i);
                    o0OOo000 o0ooo004 = topicBlackListActivity.f26277OooOo0;
                    if (o0ooo004 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                        o0ooo004 = null;
                    }
                    if (o0ooo004.f10111OooOOoo.isEmpty()) {
                        topicBlackListActivity.f26279OooOo0O = false;
                        HeaderLayout headerLayout = topicBlackListActivity.f22755OooOO0;
                        if (headerLayout != null && (f30473OoooOOo = headerLayout.getF30473OoooOOo()) != null) {
                            f30473OoooOOo.setText(oO00OOo0.Edit);
                        }
                        HeaderLayout headerLayout2 = topicBlackListActivity.f22755OooOO0;
                        TextView f30473OoooOOo2 = headerLayout2 != null ? headerLayout2.getF30473OoooOOo() : null;
                        if (f30473OoooOOo2 != null) {
                            f30473OoooOOo2.setEnabled(false);
                        }
                        o0OOo000 o0ooo005 = topicBlackListActivity.f26277OooOo0;
                        if (o0ooo005 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                        } else {
                            o0ooo002 = o0ooo005;
                        }
                        o0ooo002.Oooo0O0(apiResult2.isSuccess());
                    }
                    topicBlackListActivity.OooOoO(true);
                    return;
                }
                i = i2;
            }
        }
    }
}
