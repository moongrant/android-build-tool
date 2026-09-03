package p528o0o0OOOo;

import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.ui.vm.moment.MomentCommentsVM;
import com.yalla.yalla.ui.vm.moment.MomentReplyVM;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p375o0OOoOO.o0000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo00OO0 extends Lambda implements Function1<o0000<Object>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f54378OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentCommentDetailModel f54379OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentCommentsVM f54380OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MomentReplyVM f54381OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo00OO0(MomentVideoVM momentVideoVM, MomentCommentsVM momentCommentsVM, MomentCommentDetailModel momentCommentDetailModel, MomentReplyVM momentReplyVM) {
        super(1);
        this.f54378OooO0Oo = momentVideoVM;
        this.f54380OooO0o0 = momentCommentsVM;
        this.f54379OooO0o = momentCommentDetailModel;
        this.f54381OooO0oO = momentReplyVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o0000<Object> o0000Var) {
        o0000<Object> launchCollectApi = o0000Var;
        Intrinsics.checkNotNullParameter(launchCollectApi, "$this$launchCollectApi");
        launchCollectApi.f44046OooO00o = new oO00O0o(this.f54378OooO0Oo, this.f54380OooO0o0, this.f54379OooO0o, this.f54381OooO0oO);
        return Unit.INSTANCE;
    }
}
