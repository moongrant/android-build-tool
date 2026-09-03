package p485o0o00O0;

import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p510o0o0O00.o0O0O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO0O0 extends Lambda implements Function1<o0O0O00, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyActivity f47851OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0O0(MomentReplyActivity momentReplyActivity) {
        super(1);
        this.f47851OooO0Oo = momentReplyActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o0O0O00 o0o0o00) {
        this.f47851OooO0Oo.f26151OooOo.setValue(o0o0o00);
        return Unit.INSTANCE;
    }
}
