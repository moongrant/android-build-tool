package p528o0o0OOOo;

import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.vm.moment.MomentCommentsVM;
import com.yalla.yalla.ui.vm.moment.MomentReplyVM;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p375o0OOoOO.o0000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00OOOo extends Lambda implements Function1<o0000<Object>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyVM f53876OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentCommentsVM f53877OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentReplyModel f53878OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f53879OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OOOo(MomentReplyVM momentReplyVM, MomentReplyModel momentReplyModel, MomentCommentsVM momentCommentsVM, MomentVideoVM momentVideoVM) {
        super(1);
        this.f53876OooO0Oo = momentReplyVM;
        this.f53878OooO0o0 = momentReplyModel;
        this.f53877OooO0o = momentCommentsVM;
        this.f53879OooO0oO = momentVideoVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o0000<Object> o0000Var) {
        o0000<Object> launchCollectApi = o0000Var;
        Intrinsics.checkNotNullParameter(launchCollectApi, "$this$launchCollectApi");
        launchCollectApi.f44046OooO00o = new oO00OOO(this.f53876OooO0Oo, this.f53878OooO0o0, this.f53877OooO0o, this.f53879OooO0oO);
        return Unit.INSTANCE;
    }
}
