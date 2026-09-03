package p492o0o00OO0;

import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p518o0o0O0O0.OooO0OO;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0oOO0 extends Lambda implements Function1<OooO0OO, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyActivity f49548OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0oOO0(MomentReplyActivity momentReplyActivity) {
        super(1);
        this.f49548OooO0Oo = momentReplyActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(OooO0OO oooO0OO) {
        this.f49548OooO0Oo.f25702OooOo.setValue(oooO0OO);
        return Unit.INSTANCE;
    }
}
