package p535o0o0Oo0;

import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.ui.vm.moment.MomentCommentsVM;
import com.yalla.yalla.ui.vm.moment.MomentReplyVM;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p381o0OOoOo0.o00O0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOOO0o extends Lambda implements Function1<o00O0O<Object>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f53804OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentCommentDetailModel f53805OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentCommentsVM f53806OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MomentReplyVM f53807OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOOO0o(MomentVideoVM momentVideoVM, MomentCommentsVM momentCommentsVM, MomentCommentDetailModel momentCommentDetailModel, MomentReplyVM momentReplyVM) {
        super(1);
        this.f53804OooO0Oo = momentVideoVM;
        this.f53806OooO0o0 = momentCommentsVM;
        this.f53805OooO0o = momentCommentDetailModel;
        this.f53807OooO0oO = momentReplyVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00O0O<Object> o00o0o2) {
        o00O0O<Object> launchCollectApi = o00o0o2;
        Intrinsics.checkNotNullParameter(launchCollectApi, "$this$launchCollectApi");
        launchCollectApi.f43270OooO00o = new o0OOOO00(this.f53804OooO0Oo, this.f53806OooO0o0, this.f53805OooO0o, this.f53807OooO0oO);
        return Unit.INSTANCE;
    }
}
