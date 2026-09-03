package p487o0o00O;

import android.widget.ImageView;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p405o0Oo0OOO.k1;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO00 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TaskActivity f48826OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO00(TaskActivity taskActivity) {
        super(1);
        this.f48826OooO0Oo = taskActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        int i = TaskActivity.f25083OooOooO;
        ImageView imageView = ((k1) this.f48826OooO0Oo.f25092OooOoOO.getValue()).f44076OooO0OO;
        Intrinsics.checkNotNull(bool2);
        imageView.setImageResource(bool2.booleanValue() ? o0Oo0oo.task_check_in_check : o0Oo0oo.task_check_in_checked);
        return Unit.INSTANCE;
    }
}
