package p543o0o0Ooo0;

import android.content.Context;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.fragment.app.FragmentActivity;
import com.code.android.uikit.contentstate.ContentState;
import com.yalla.yalla.ui.vm.moment.MomentUserListVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p196o00o0OOO.oOO00O;
import p521o0o0O0o0.o000OO;
import p590o0oOooo0.l;

/* JADX INFO: loaded from: classes4.dex */
public final class i2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f55440OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentUserListVM f55441OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f55442OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LazyListState f55443OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ String f55444OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Context f55445OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ MutableState<o000OO> f55446OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ MutableState<l> f55447OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(int i, Context context, LazyListState lazyListState, MutableState mutableState, MutableState mutableState2, FragmentActivity fragmentActivity, MomentUserListVM momentUserListVM, String str) {
        super(2);
        this.f55441OooO0Oo = momentUserListVM;
        this.f55443OooO0o0 = lazyListState;
        this.f55442OooO0o = i;
        this.f55444OooO0oO = str;
        this.f55445OooO0oo = context;
        this.f55440OooO = fragmentActivity;
        this.f55446OooOO0 = mutableState;
        this.f55447OooOO0O = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1756822048, iIntValue, -1, "com.yalla.yalla.ui.screen.user.UserMomentListContent.<anonymous>.<anonymous> (UserMomentListScreen.kt:220)");
            }
            MomentUserListVM momentUserListVM = this.f55441OooO0Oo;
            ContentState value = momentUserListVM.getContentState().getValue();
            z1 z1Var = new z1(momentUserListVM);
            LazyListState lazyListState = this.f55443OooO0o0;
            int i = this.f55442OooO0o;
            MomentUserListVM momentUserListVM2 = this.f55441OooO0Oo;
            String str = this.f55444OooO0oO;
            oOO00O.OooO0o0(value, false, null, null, null, null, z1Var, ComposableLambdaKt.composableLambda(composer2, 385587806, true, new h2(i, this.f55445OooO0oo, lazyListState, this.f55446OooOO0, this.f55447OooOO0O, this.f55440OooO, momentUserListVM2, str)), composer2, 12582912, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
