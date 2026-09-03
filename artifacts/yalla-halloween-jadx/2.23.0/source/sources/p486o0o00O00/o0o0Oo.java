package p486o0o00O00;

import android.widget.ImageView;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.v9;

/* JADX INFO: loaded from: classes4.dex */
public final class o0o0Oo extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TaskActivity f48395OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0o0Oo(TaskActivity taskActivity) {
        super(1);
        this.f48395OooO0Oo = taskActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean aBoolean = bool;
        int i = TaskActivity.f25537OooOooO;
        ImageView imageView = ((v9) this.f48395OooO0Oo.f25546OooOoOO.getValue()).f59079OooO0OO;
        Intrinsics.checkNotNullExpressionValue(aBoolean, "aBoolean");
        imageView.setImageResource(aBoolean.booleanValue() ? oOo00OO0.task_check_in_check : oOo00OO0.task_check_in_checked);
        return Unit.INSTANCE;
    }
}
