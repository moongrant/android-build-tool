package p435o0OoOOOo;

import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f47016OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f47017OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000Oo(Ref.BooleanRef booleanRef, FragmentActivity fragmentActivity) {
        super(0);
        this.f47016OooO0Oo = booleanRef;
        this.f47017OooO0o0 = fragmentActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f47016OooO0Oo.element = true;
        int i = TaskActivity.f25083OooOooO;
        TaskActivity.OooO00o.OooO00o(this.f47017OooO0o0, true);
        return Unit.INSTANCE;
    }
}
