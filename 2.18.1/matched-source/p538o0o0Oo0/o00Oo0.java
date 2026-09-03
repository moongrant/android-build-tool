package p538o0o0Oo0;

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

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f43976Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f43977Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f43978Oooo0oo;

    public /* synthetic */ o00Oo0(Object obj, Object obj2, int i) {
        this.f43976Oooo0o = i;
        this.f43977Oooo0oO = obj;
        this.f43978Oooo0oo = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f43976Oooo0o) {
            case 0:
                AddTopicListActivity.OooO00o this$0 = (AddTopicListActivity.OooO00o) this.f43977Oooo0oO;
                TopicInfoModel item = (TopicInfoModel) this.f43978Oooo0oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(item, "$item");
                Function1<? super Boolean, Unit> function1 = this$0.f22278OooO0O0;
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(!item.getIsUpLocal()));
                }
                break;
            default:
                Dialog this_apply = (Dialog) this.f43977Oooo0oO;
                Function0 function0 = (Function0) this.f43978Oooo0oo;
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
