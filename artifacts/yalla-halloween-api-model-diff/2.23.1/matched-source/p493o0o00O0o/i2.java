package p493o0o00O0o;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p510o0o00oo0.o0OO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i2 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49119OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49120OooO0o0;

    public /* synthetic */ i2(Object obj, int i) {
        this.f49119OooO0Oo = i;
        this.f49120OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f49119OooO0Oo;
        Object obj = this.f49120OooO0o0;
        switch (i) {
            case 0:
                TopicSearchActivity this$0 = (TopicSearchActivity) obj;
                int i2 = TopicSearchActivity.f25949OooOoo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (view instanceof RelativeLayout) {
                    View childAt = ((RelativeLayout) view).getChildAt(0);
                    Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
                    CharSequence text = ((TextView) childAt).getText();
                    Intrinsics.checkNotNull(text, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) text;
                    Function1<? super String, Unit> function1 = this$0.f25958OooOoOO;
                    if (function1 != null) {
                        function1.invoke(str);
                    }
                }
                break;
            default:
                o0OO this$1 = (o0OO) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Function0<Unit> function0 = this$1.f50613OooO0OO;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }
}
