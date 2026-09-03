package p535o0o0Oo0;

import com.yalla.yalla.ui.vm.moment.MomentCommentsVM;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00O0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentCommentsVM f53671OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f53672OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00O0o(MomentCommentsVM momentCommentsVM, MomentVideoVM momentVideoVM) {
        super(0);
        this.f53671OooO0Oo = momentCommentsVM;
        this.f53672OooO0o0 = momentVideoVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f53671OooO0Oo.closeComment(this.f53672OooO0o0);
        return Unit.INSTANCE;
    }
}
