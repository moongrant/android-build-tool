package p485o0o00O0;

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
import p515o0o0O0O0.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O0O00 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ MutableState<p579o0oOoo.oO0O0O00> f48086OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ NestedScrollConnection f48087OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ TopicPopularMomentVM f48088OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LazyListState f48089OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f48090OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f48091OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ TopicDetailVM f48092OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ Long f48093OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ int f48094OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final /* synthetic */ int f48095OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ MutableState<o0Oo0oo> f48096OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O0O00(int i, int i2, int i3, LazyListState lazyListState, MutableState mutableState, MutableState mutableState2, NestedScrollConnection nestedScrollConnection, FragmentActivity fragmentActivity, TopicDetailVM topicDetailVM, TopicPopularMomentVM topicPopularMomentVM, Long l) {
        super(3);
        this.f48087OooO0Oo = nestedScrollConnection;
        this.f48089OooO0o0 = lazyListState;
        this.f48088OooO0o = topicPopularMomentVM;
        this.f48090OooO0oO = i;
        this.f48091OooO0oo = fragmentActivity;
        this.f48086OooO = mutableState;
        this.f48092OooOO0 = topicDetailVM;
        this.f48093OooOO0O = l;
        this.f48094OooOO0o = i2;
        this.f48096OooOOO0 = mutableState2;
        this.f48095OooOOO = i3;
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
                ComposerKt.traceEventStart(1373901269, iIntValue, -1, "com.yalla.yalla.ui.activity.moment.TopicDetailContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TopicDetailContentComp.kt:111)");
            }
            LazyDslKt.LazyColumn(NestedScrollModifierKt.nestedScroll$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), this.f48087OooO0Oo, null, 2, null), this.f48089OooO0o0, null, false, null, null, null, false, new oO0O0(this.f48088OooO0o, this.f48090OooO0oO, this.f48091OooO0oo, this.f48086OooO, this.f48092OooOO0, this.f48093OooOO0O, this.f48094OooOO0o, this.f48096OooOOO0, this.f48095OooOOO), composer2, 0, 252);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
