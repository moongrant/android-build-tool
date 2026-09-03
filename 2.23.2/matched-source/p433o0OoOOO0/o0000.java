package p433o0OoOOO0;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import p511o0o0O.o00000OO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0000 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f46850OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f46851OooO0o0;

    public /* synthetic */ o0000(Object obj, int i) {
        this.f46850OooO0Oo = i;
        this.f46851OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        TopicInfoModel topicInfoModel;
        int i = this.f46850OooO0Oo;
        Object obj2 = this.f46851OooO0o0;
        switch (i) {
            case 0:
                MutableLiveData mutableLiveData = (MutableLiveData) obj2;
                int iIntValue = ((Integer) obj).intValue();
                if (mutableLiveData != null) {
                    mutableLiveData.setValue(Integer.valueOf(iIntValue));
                    break;
                }
                break;
            case 1:
                TopicDetailActivity this$0 = (TopicDetailActivity) obj2;
                Boolean bool = (Boolean) obj;
                int i2 = TopicDetailActivity.f25854OooOoOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Response response = (Response) this$0.OooOoo0().getTopicDetailLiveData().getValue();
                String strOooOOO0 = (response == null || (topicInfoModel = (TopicInfoModel) response.getData()) == null) ? null : o0OoOo0.OooOOO0("", Long.valueOf(topicInfoModel.getId()));
                boolean loadCircleAdminIsSuccess = this$0.OooOoo0().getLoadCircleAdminIsSuccess();
                Intrinsics.checkNotNull(bool);
                if (bool.booleanValue() && !loadCircleAdminIsSuccess) {
                    this$0.OooOoO(strOooOOO0);
                    break;
                }
                break;
            default:
                o00000OO this$1 = (o00000OO) obj2;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOoO0();
                break;
        }
    }
}
