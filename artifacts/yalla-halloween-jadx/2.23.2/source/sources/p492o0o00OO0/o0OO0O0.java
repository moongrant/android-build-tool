package p492o0o00OO0;

import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import com.yalla.yalla.ui.view.HeaderLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0OO0O0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f49318OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ TopicBlackListActivity f49319OooO0o0;

    public /* synthetic */ o0OO0O0(TopicBlackListActivity topicBlackListActivity, boolean z) {
        this.f49318OooO0Oo = z;
        this.f49319OooO0o0 = topicBlackListActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        TextView f29928OoooOOo;
        Response response = (Response) obj;
        int i = TopicBlackListActivity.f25826OooOo;
        TopicBlackListActivity this$0 = this.f49319OooO0o0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean isSuccess = response.getIsSuccess();
        boolean z = this.f49318OooO0Oo;
        o0OOO00 o0ooo00 = null;
        if (isSuccess) {
            if (z) {
                o0OOO00 o0ooo01 = this$0.f25828OooOo0;
                if (o0ooo01 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                    o0ooo01 = null;
                }
                o0ooo01.OooOoO0((List) response.getData());
                Collection collection = (Collection) response.getData();
                if (collection == null || collection.isEmpty()) {
                    HeaderLayout headerLayout = this$0.f22282OooOO0;
                    if (headerLayout != null && (f29928OoooOOo = headerLayout.getF29928OoooOOo()) != null) {
                        f29928OoooOOo.setText(o000000.Edit);
                    }
                    HeaderLayout headerLayout2 = this$0.f22282OooOO0;
                    TextView f29928OoooOOo2 = headerLayout2 != null ? headerLayout2.getF29928OoooOOo() : null;
                    if (f29928OoooOOo2 != null) {
                        f29928OoooOOo2.setEnabled(false);
                    }
                } else {
                    HeaderLayout headerLayout3 = this$0.f22282OooOO0;
                    TextView f29928OoooOOo3 = headerLayout3 != null ? headerLayout3.getF29928OoooOOo() : null;
                    if (f29928OoooOOo3 != null) {
                        f29928OoooOOo3.setEnabled(true);
                    }
                }
            } else {
                ArrayList arrayList = (ArrayList) response.getData();
                if (arrayList != null) {
                    o0OOO00 o0ooo02 = this$0.f25828OooOo0;
                    if (o0ooo02 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                        o0ooo02 = null;
                    }
                    o0ooo02.OooO0O0(arrayList);
                }
            }
        }
        o0OOO00 o0ooo03 = this$0.f25828OooOo0;
        if (o0ooo03 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            o0ooo03 = null;
        }
        o0ooo03.Oooo000(o000000.topic_black_list_No_Result);
        this$0.OooOo().f45030OooO0OO.OooOooo(z, response.getIsSuccess(), response.getNoMoreData());
        o0OOO00 o0ooo04 = this$0.f25828OooOo0;
        if (o0ooo04 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
        } else {
            o0ooo00 = o0ooo04;
        }
        o0ooo00.Oooo0O0(response.getIsSuccess());
        this$0.OooOoO(false);
    }
}
