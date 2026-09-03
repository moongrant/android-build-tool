package p528o0o0OOOo;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.code.android.util.o0000;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.ui.vm.moment.MomentCommentsVM;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000O0.OooO0O0;
import p148o00Oo0o.oo0o0Oo;
import p153o00OoO0.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOOO00 extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<MomentCommentDetailModel> f53799OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentCommentsVM f53800OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f53801OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOOO00(OooO0O0<MomentCommentDetailModel> oooO0O0, MomentVideoVM momentVideoVM, MomentCommentsVM momentCommentsVM) {
        super(1);
        this.f53799OooO0Oo = oooO0O0;
        this.f53801OooO0o0 = momentVideoVM;
        this.f53800OooO0o = momentCommentsVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        MomentCommentsVM momentCommentsVM = this.f53800OooO0o;
        MomentVideoVM momentVideoVM = this.f53801OooO0o0;
        LazyListScope.CC.OooO(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-990234593, true, new o0OO(momentCommentsVM, momentVideoVM)), 3, null);
        OooO0O0<MomentCommentDetailModel> oooO0O0 = this.f53799OooO0Oo;
        LazyListScope.CC.OooOO0O(LazyColumn, oooO0O0.OooO0O0(), null, null, ComposableLambdaKt.composableLambdaInstance(315586166, true, new o0OOO0OO(oooO0O0, momentVideoVM, momentCommentsVM)), 6, null);
        OooOo00.OooO00o(LazyColumn, oooO0O0, o0000.OooO0OO(oo0o0Oo.refreshcontentstate_no_more_data));
        return Unit.INSTANCE;
    }
}
