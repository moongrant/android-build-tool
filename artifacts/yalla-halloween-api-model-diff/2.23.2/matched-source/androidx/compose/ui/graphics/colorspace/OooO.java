package androidx.compose.ui.graphics.colorspace;

import com.yalla.yalla.ui.activity.main.TaskActivity;
import com.yalla.yalla.ui.activity.room.MemberListRemoveActivity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p559o0oOo.o00O0O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO implements DoubleFunction, o00O0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f4164OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f4165OooO0o0;

    public /* synthetic */ OooO(Object obj, int i) {
        this.f4164OooO0Oo = i;
        this.f4165OooO0o0 = obj;
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        int i = this.f4164OooO0Oo;
        Object obj = this.f4165OooO0o0;
        switch (i) {
            case 1:
                TaskActivity this$0 = (TaskActivity) obj;
                int i2 = TaskActivity.f25083OooOooO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoO();
                break;
            default:
                MemberListRemoveActivity this$1 = (MemberListRemoveActivity) obj;
                int i3 = MemberListRemoveActivity.f26110OooOoO0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOoO(true);
                break;
        }
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        return Rgb._init_$lambda$2((Function1) this.f4165OooO0o0, d);
    }
}
