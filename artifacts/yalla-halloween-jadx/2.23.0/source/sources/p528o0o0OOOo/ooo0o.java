package p528o0o0OOOo;

import com.yalla.yalla.ui.vm.moment.MomentReplyVM;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ooo0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyVM f54414OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f54415OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooo0o(MomentReplyVM momentReplyVM, MomentVideoVM momentVideoVM) {
        super(0);
        this.f54414OooO0Oo = momentReplyVM;
        this.f54415OooO0o0 = momentVideoVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f54414OooO0Oo.closeCommentReply();
        this.f54415OooO0o0.closeCommentReply();
        return Unit.INSTANCE;
    }
}
