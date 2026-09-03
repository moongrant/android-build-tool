package p538o0o0Oo0;

import android.app.Dialog;
import android.view.View;
import com.yalla.yalla.ui.activity.moment.AddTopicListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p188o00o00o0.OooO0o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O0O implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f43951Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f43952Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f43953Oooo0oo;

    public /* synthetic */ o00O0O(Object obj, Object obj2, int i) {
        this.f43951Oooo0o = i;
        this.f43952Oooo0oO = obj;
        this.f43953Oooo0oo = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f43951Oooo0o) {
            case 0:
                AddTopicListActivity.OooO00o this$0 = (AddTopicListActivity.OooO00o) this.f43952Oooo0oO;
                OooO0o helper = (OooO0o) this.f43953Oooo0oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(helper, "$helper");
                Function1<? super Integer, Unit> function1 = this$0.f22279OooO0OO;
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(helper.getLayoutPosition()));
                }
                break;
            default:
                Dialog this_apply = (Dialog) this.f43952Oooo0oO;
                Function0 function0 = (Function0) this.f43953Oooo0oo;
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
