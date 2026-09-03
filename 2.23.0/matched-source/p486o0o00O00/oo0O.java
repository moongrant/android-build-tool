package p486o0o00O00;

import android.view.View;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p502o0o00oOO.o0OOO0;
import p519o0o0O0oO.o00O0OOO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oo0O implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f48411OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f48412OooO0o0;

    public /* synthetic */ oo0O(Object obj, int i) {
        this.f48411OooO0Oo = i;
        this.f48412OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Function1<? super ChatModel, Unit> function1;
        int i = this.f48411OooO0Oo;
        Object obj = this.f48412OooO0o0;
        switch (i) {
            case 0:
                TaskActivity this$0 = (TaskActivity) obj;
                int i2 = TaskActivity.f25537OooOooO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                new o00O0OOO(this$0).OooO();
                break;
            default:
                o0OOO0 this$1 = (o0OOO0) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                ChatModel chatModel = this$1.f49469OooOo0o;
                if (chatModel != null && (function1 = this$1.f49453OooO0o0) != null) {
                    function1.invoke(chatModel);
                    break;
                }
                break;
        }
    }
}
