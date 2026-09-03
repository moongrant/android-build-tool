package p485o0o00O0;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.fragment.app.FragmentActivity;
import com.code.android.uikit.contentstate.ContentState;
import com.yalla.yalla.ui.vm.moment.TopicDetailVM;
import com.yalla.yalla.ui.vm.moment.TopicPopularMomentVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p150o00Oo0oO.o0000Ooo;
import p515o0o0O0O0.o0Oo0oo;
import p579o0oOoo.oO0O0O00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nTopicDetailContentComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicDetailContentComp.kt\ncom/yalla/yalla/ui/activity/moment/TopicDetailContentCompKt$TopicDetailContent$2$1$4\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,212:1\n67#2,3:213\n66#2:216\n1097#3,6:217\n*S KotlinDebug\n*F\n+ 1 TopicDetailContentComp.kt\ncom/yalla/yalla/ui/activity/moment/TopicDetailContentCompKt$TopicDetailContent$2$1$4\n*L\n108#1:213,3\n108#1:216\n108#1:217,6\n*E\n"})
public final class oO0O0O0o extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ NestedScrollConnection f48097OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicPopularMomentVM f48098OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Long f48099OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f48100OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f48101OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f48102OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ LazyListState f48103OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f48104OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<oO0O0O00> f48105OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final /* synthetic */ MutableState<o0Oo0oo> f48106OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ TopicDetailVM f48107OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O0O0o(int i, int i2, int i3, LazyListState lazyListState, MutableState mutableState, MutableState mutableState2, NestedScrollConnection nestedScrollConnection, FragmentActivity fragmentActivity, TopicDetailVM topicDetailVM, TopicPopularMomentVM topicPopularMomentVM, Long l) {
        super(2);
        this.f48098OooO0Oo = topicPopularMomentVM;
        this.f48100OooO0o0 = i;
        this.f48099OooO0o = l;
        this.f48101OooO0oO = i2;
        this.f48102OooO0oo = i3;
        this.f48097OooO = nestedScrollConnection;
        this.f48103OooOO0 = lazyListState;
        this.f48104OooOO0O = fragmentActivity;
        this.f48105OooOO0o = mutableState;
        this.f48107OooOOO0 = topicDetailVM;
        this.f48106OooOOO = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1424901549, iIntValue, -1, "com.yalla.yalla.ui.activity.moment.TopicDetailContent.<anonymous>.<anonymous>.<anonymous> (TopicDetailContentComp.kt:104)");
            }
            TopicPopularMomentVM topicPopularMomentVM = this.f48098OooO0Oo;
            ContentState value = topicPopularMomentVM.getContentState().getValue();
            int i = this.f48100OooO0o0;
            Integer numValueOf = Integer.valueOf(i);
            composer2.startReplaceableGroup(1618982084);
            boolean zChanged = composer2.changed(numValueOf) | composer2.changed(topicPopularMomentVM);
            Long l = this.f48099OooO0o;
            boolean zChanged2 = zChanged | composer2.changed(l);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new oO0O00(topicPopularMomentVM, i, l);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            Function0 function0 = (Function0) objRememberedValue;
            NestedScrollConnection nestedScrollConnection = this.f48097OooO;
            LazyListState lazyListState = this.f48103OooOO0;
            TopicPopularMomentVM topicPopularMomentVM2 = this.f48098OooO0Oo;
            int i2 = this.f48100OooO0o0;
            FragmentActivity fragmentActivity = this.f48104OooOO0O;
            MutableState<oO0O0O00> mutableState = this.f48105OooOO0o;
            TopicDetailVM topicDetailVM = this.f48107OooOOO0;
            Long l2 = this.f48099OooO0o;
            o0000Ooo.OooO0o0(value, false, null, null, null, null, function0, ComposableLambdaKt.composableLambda(composer2, 1373901269, true, new oO0O0O00(i2, this.f48102OooO0oo, this.f48101OooO0oO, lazyListState, mutableState, this.f48106OooOOO, nestedScrollConnection, fragmentActivity, topicDetailVM, topicPopularMomentVM2, l2)), composer2, 12582912, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
