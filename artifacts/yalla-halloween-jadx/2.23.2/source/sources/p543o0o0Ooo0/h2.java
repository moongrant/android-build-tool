package p543o0o0Ooo0;

import android.content.Context;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.ui.vm.moment.MomentUserListVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p521o0o0O0o0.o000OO;
import p590o0oOooo0.l;

/* JADX INFO: loaded from: classes4.dex */
public final class h2 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f55424OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LazyListState f55425OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentUserListVM f55426OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f55427OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ String f55428OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Context f55429OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ MutableState<o000OO> f55430OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ MutableState<l> f55431OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(int i, Context context, LazyListState lazyListState, MutableState mutableState, MutableState mutableState2, FragmentActivity fragmentActivity, MomentUserListVM momentUserListVM, String str) {
        super(3);
        this.f55425OooO0Oo = lazyListState;
        this.f55427OooO0o0 = i;
        this.f55426OooO0o = momentUserListVM;
        this.f55428OooO0oO = str;
        this.f55429OooO0oo = context;
        this.f55424OooO = fragmentActivity;
        this.f55430OooOO0 = mutableState;
        this.f55431OooOO0O = mutableState2;
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
                ComposerKt.traceEventStart(385587806, iIntValue, -1, "com.yalla.yalla.ui.screen.user.UserMomentListContent.<anonymous>.<anonymous>.<anonymous> (UserMomentListScreen.kt:227)");
            }
            LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), this.f55425OooO0Oo, null, false, null, null, null, false, new g2(this.f55426OooO0o, this.f55428OooO0oO, this.f55429OooO0oo, this.f55424OooO, this.f55430OooOO0, this.f55431OooOO0O), composer2, ((this.f55427OooO0o0 >> 3) & 112) | 6, 252);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
