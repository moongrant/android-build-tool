package p485o0o00O0;

import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicBlackUserModel;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import com.yalla.yalla.ui.view.HeaderLayout;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nTopicBlackListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicBlackListActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicBlackListActivity$searchTopicBlackList$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,266:1\n1#2:267\n*E\n"})
public final class o0oo0000 implements Observer<Response<ArrayList<TopicBlackUserModel>>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f48022OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ TopicBlackListActivity f48023OooO0o0;

    public o0oo0000(TopicBlackListActivity topicBlackListActivity, boolean z) {
        this.f48022OooO0Oo = z;
        this.f48023OooO0o0 = topicBlackListActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Response<ArrayList<TopicBlackUserModel>> response) {
        TextView f30473OoooOOo;
        Response<ArrayList<TopicBlackUserModel>> response2 = response;
        boolean isSuccess = response2.getIsSuccess();
        boolean z = this.f48022OooO0Oo;
        o0OOo000 o0ooo001 = null;
        TopicBlackListActivity topicBlackListActivity = this.f48023OooO0o0;
        if (isSuccess) {
            if (z) {
                o0OOo000 o0ooo002 = topicBlackListActivity.f26277OooOo0;
                if (o0ooo002 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                    o0ooo002 = null;
                }
                o0ooo002.OooOoO0(response2.getData());
                ArrayList<TopicBlackUserModel> data = response2.getData();
                if (data == null || data.isEmpty()) {
                    HeaderLayout headerLayout = topicBlackListActivity.f22755OooOO0;
                    if (headerLayout != null && (f30473OoooOOo = headerLayout.getF30473OoooOOo()) != null) {
                        f30473OoooOOo.setText(oO00OOo0.Edit);
                    }
                    HeaderLayout headerLayout2 = topicBlackListActivity.f22755OooOO0;
                    TextView f30473OoooOOo2 = headerLayout2 != null ? headerLayout2.getF30473OoooOOo() : null;
                    if (f30473OoooOOo2 != null) {
                        f30473OoooOOo2.setEnabled(false);
                    }
                } else {
                    HeaderLayout headerLayout3 = topicBlackListActivity.f22755OooOO0;
                    TextView f30473OoooOOo3 = headerLayout3 != null ? headerLayout3.getF30473OoooOOo() : null;
                    if (f30473OoooOOo3 != null) {
                        f30473OoooOOo3.setEnabled(true);
                    }
                }
            } else {
                ArrayList<TopicBlackUserModel> data2 = response2.getData();
                if (data2 != null) {
                    o0OOo000 o0ooo003 = topicBlackListActivity.f26277OooOo0;
                    if (o0ooo003 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                        o0ooo003 = null;
                    }
                    o0ooo003.OooO0O0(data2);
                }
            }
        }
        o0OOo000 o0ooo004 = topicBlackListActivity.f26277OooOo0;
        if (o0ooo004 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            o0ooo004 = null;
        }
        o0ooo004.Oooo000(oO00OOo0.topic_black_list_No_Result);
        topicBlackListActivity.OooOo().f57485OooO0OO.OooOooo(z, response2.getIsSuccess(), response2.getNoMoreData());
        o0OOo000 o0ooo005 = topicBlackListActivity.f26277OooOo0;
        if (o0ooo005 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
        } else {
            o0ooo001 = o0ooo005;
        }
        o0ooo001.Oooo0O0(response2.getIsSuccess());
        topicBlackListActivity.OooOoO(false);
    }
}
