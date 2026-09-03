package p492o0o00OO0;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.ui.vm.moment.TopicDetailVM;
import com.yalla.yalla.ui.vm.moment.TopicPopularMomentVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p521o0o0O0o0.o000OO;
import p590o0oOooo0.l;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo00o0o extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ MutableState<l> f49514OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ NestedScrollConnection f49515OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ TopicPopularMomentVM f49516OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LazyListState f49517OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f49518OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f49519OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ TopicDetailVM f49520OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ Long f49521OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ int f49522OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final /* synthetic */ int f49523OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ MutableState<o000OO> f49524OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo00o0o(int i, int i2, int i3, LazyListState lazyListState, MutableState mutableState, MutableState mutableState2, NestedScrollConnection nestedScrollConnection, FragmentActivity fragmentActivity, TopicDetailVM topicDetailVM, TopicPopularMomentVM topicPopularMomentVM, Long l) {
        super(3);
        this.f49515OooO0Oo = nestedScrollConnection;
        this.f49517OooO0o0 = lazyListState;
        this.f49516OooO0o = topicPopularMomentVM;
        this.f49518OooO0oO = i;
        this.f49519OooO0oo = fragmentActivity;
        this.f49514OooO = mutableState;
        this.f49520OooOO0 = topicDetailVM;
        this.f49521OooOO0O = l;
        this.f49522OooOO0o = i2;
        this.f49524OooOOO0 = mutableState2;
        this.f49523OooOOO = i3;
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
                ComposerKt.traceEventStart(1373901269, iIntValue, -1, "com.yalla.yalla.ui.activity.moment.TopicDetailContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TopicDetailContentComp.kt:112)");
            }
            LazyDslKt.LazyColumn(NestedScrollModifierKt.nestedScroll$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), this.f49515OooO0Oo, null, 2, null), this.f49517OooO0o0, null, false, null, null, null, false, new oO00o0(this.f49516OooO0o, this.f49518OooO0oO, this.f49519OooO0oo, this.f49514OooO, this.f49520OooOO0, this.f49521OooOO0O, this.f49522OooOO0o, this.f49524OooOOO0, this.f49523OooOOO), composer2, 0, 252);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
