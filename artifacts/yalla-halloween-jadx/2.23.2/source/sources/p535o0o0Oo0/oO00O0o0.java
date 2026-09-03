package p535o0o0Oo0;

import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00O0o0 extends Lambda implements Function1<MomentReplyModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f53911OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<MomentReplyModel> f53912OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00O0o0(MomentVideoVM momentVideoVM, Ref.ObjectRef<MomentReplyModel> objectRef) {
        super(1);
        this.f53911OooO0Oo = momentVideoVM;
        this.f53912OooO0o0 = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentReplyModel momentReplyModel) {
        MomentReplyModel it = momentReplyModel;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f53911OooO0Oo.setShowDialogReplySonMore(this.f53912OooO0o0.element);
        return Unit.INSTANCE;
    }
}
