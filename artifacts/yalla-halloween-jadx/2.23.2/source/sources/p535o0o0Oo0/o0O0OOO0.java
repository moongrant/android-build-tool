package p535o0o0Oo0;

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
import p107o000ooO0.OooOOOO;
import p194o00o0OO.o00O00o0;
import p201o00o0Ooo.o0O0000O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OOO0 extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOOO<MomentCommentDetailModel> f53711OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentCommentsVM f53712OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f53713OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOO0(OooOOOO<MomentCommentDetailModel> oooOOOO, MomentVideoVM momentVideoVM, MomentCommentsVM momentCommentsVM) {
        super(1);
        this.f53711OooO0Oo = oooOOOO;
        this.f53713OooO0o0 = momentVideoVM;
        this.f53712OooO0o = momentCommentsVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        MomentCommentsVM momentCommentsVM = this.f53712OooO0o;
        MomentVideoVM momentVideoVM = this.f53713OooO0o0;
        LazyListScope.CC.OooO(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-990234593, true, new o0O0oo0o(momentCommentsVM, momentVideoVM)), 3, null);
        OooOOOO<MomentCommentDetailModel> oooOOOO = this.f53711OooO0Oo;
        LazyListScope.CC.OooOO0O(LazyColumn, oooOOOO.OooO0O0(), null, null, ComposableLambdaKt.composableLambdaInstance(315586166, true, new o0O0OO0(oooOOOO, momentVideoVM, momentCommentsVM)), 6, null);
        o0O0000O.OooO00o(LazyColumn, oooOOOO, o0000.OooO0OO(o00O00o0.refreshcontentstate_no_more_data));
        return Unit.INSTANCE;
    }
}
