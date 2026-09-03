package p540o0o0Oo0;

import android.app.Dialog;
import android.view.View;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.AddTopicListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00Oo0 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f43991Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Object f43992OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f43993OoooO00;

    public /* synthetic */ o00Oo0(Object obj, Object obj2, int i) {
        this.f43991Oooo = i;
        this.f43993OoooO00 = obj;
        this.f43992OoooO0 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f43991Oooo) {
            case 0:
                AddTopicListActivity.OooO00o this$0 = (AddTopicListActivity.OooO00o) this.f43993OoooO00;
                TopicInfoModel item = (TopicInfoModel) this.f43992OoooO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(item, "$item");
                Function1<? super Boolean, Unit> function1 = this$0.f22297OooO0O0;
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(!item.getIsUpLocal()));
                }
                break;
            default:
                Dialog this_apply = (Dialog) this.f43993OoooO00;
                Function0 function0 = (Function0) this.f43992OoooO0;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                this_apply.dismiss();
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
        }
    }
}
