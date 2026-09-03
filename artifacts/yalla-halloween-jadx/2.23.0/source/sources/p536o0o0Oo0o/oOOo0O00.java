package p536o0o0Oo0o;

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
import p150o00Oo0oO.o0000Ooo;
import p515o0o0O0O0.o0Oo0oo;
import p579o0oOoo.oO0O0O00;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOo0O00 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f55238OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentUserListVM f55239OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f55240OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LazyListState f55241OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ String f55242OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Context f55243OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ MutableState<o0Oo0oo> f55244OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ MutableState<oO0O0O00> f55245OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOo0O00(int i, Context context, LazyListState lazyListState, MutableState mutableState, MutableState mutableState2, FragmentActivity fragmentActivity, MomentUserListVM momentUserListVM, String str) {
        super(2);
        this.f55239OooO0Oo = momentUserListVM;
        this.f55241OooO0o0 = lazyListState;
        this.f55240OooO0o = i;
        this.f55242OooO0oO = str;
        this.f55243OooO0oo = context;
        this.f55238OooO = fragmentActivity;
        this.f55244OooOO0 = mutableState;
        this.f55245OooOO0O = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1756822048, iIntValue, -1, "com.yalla.yalla.ui.screen.user.UserMomentListContent.<anonymous>.<anonymous> (UserMomentListScreen.kt:219)");
            }
            MomentUserListVM momentUserListVM = this.f55239OooO0Oo;
            ContentState value = momentUserListVM.getContentState().getValue();
            oOOO00 oooo00 = new oOOO00(momentUserListVM);
            LazyListState lazyListState = this.f55241OooO0o0;
            int i = this.f55240OooO0o;
            MomentUserListVM momentUserListVM2 = this.f55239OooO0Oo;
            String str = this.f55242OooO0oO;
            o0000Ooo.OooO0o0(value, false, null, null, null, null, oooo00, ComposableLambdaKt.composableLambda(composer2, 385587806, true, new oOOo0000(i, this.f55243OooO0oo, lazyListState, this.f55244OooOO0, this.f55245OooOO0O, this.f55238OooO, momentUserListVM2, str)), composer2, 12582912, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
