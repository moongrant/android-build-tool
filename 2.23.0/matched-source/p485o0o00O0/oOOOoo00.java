package p485o0o00O0;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import com.yalla.yalla.ui.view.HeaderLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oOOOoo00 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f48175OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f48176OooO0o0;

    public /* synthetic */ oOOOoo00(Object obj, int i) {
        this.f48175OooO0Oo = i;
        this.f48176OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f48175OooO0Oo;
        Object obj = this.f48176OooO0o0;
        switch (i) {
            case 0:
                TopicSearchActivity this$0 = (TopicSearchActivity) obj;
                int i2 = TopicSearchActivity.f26398OooOoo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (view instanceof RelativeLayout) {
                    View childAt = ((RelativeLayout) view).getChildAt(0);
                    Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
                    CharSequence text = ((TextView) childAt).getText();
                    Intrinsics.checkNotNull(text, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) text;
                    Function1<? super String, Unit> function1 = this$0.f26407OooOoOO;
                    if (function1 != null) {
                        function1.invoke(str);
                    }
                }
                break;
            default:
                Function0 clickListener = (Function0) obj;
                int i3 = HeaderLayout.f30472OooooO0;
                Intrinsics.checkNotNullParameter(clickListener, "$clickListener");
                clickListener.invoke();
                break;
        }
    }
}
