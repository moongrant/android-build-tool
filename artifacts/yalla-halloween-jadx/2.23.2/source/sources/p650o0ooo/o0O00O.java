package p650o0ooo;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.model.RecommendNewPostModel;
import com.yalla.yalla.ui.vm.moment.MomentFollowingTopUserVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p521o0o0O0o0.o000OO;
import p590o0oOooo0.l;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00O extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ RecommendNewPostModel f58619OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LazyListState f58620OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f58621OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentFollowingTopUserVM f58622OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<o000OO> f58623OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ l f58624OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00O(LazyListState lazyListState, MomentFollowingTopUserVM momentFollowingTopUserVM, FragmentActivity fragmentActivity, MutableState<o000OO> mutableState, l lVar, RecommendNewPostModel recommendNewPostModel) {
        super(3);
        this.f58620OooO0Oo = lazyListState;
        this.f58622OooO0o0 = momentFollowingTopUserVM;
        this.f58621OooO0o = fragmentActivity;
        this.f58623OooO0oO = mutableState;
        this.f58624OooO0oo = lVar;
        this.f58619OooO = recommendNewPostModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
        BoxScope ContentStatus = boxScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(ContentStatus, "$this$ContentStatus");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-689581304, iIntValue, -1, "com.yalla.yalla.ui.dialog.FollowingUserMomentContent.<anonymous>.<anonymous>.<anonymous> (FollowingMomentTopUserDialog.kt:148)");
            }
            LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), this.f58620OooO0Oo, null, false, null, null, null, false, new o0O00O0o(this.f58622OooO0o0, this.f58621OooO0o, this.f58623OooO0oO, this.f58624OooO0oo, this.f58619OooO), composer2, 6, 252);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
