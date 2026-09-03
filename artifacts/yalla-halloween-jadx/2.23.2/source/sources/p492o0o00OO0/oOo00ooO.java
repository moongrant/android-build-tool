package p492o0o00OO0;

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
import p196o00o0OOO.oOO00O;
import p521o0o0O0o0.o000OO;
import p590o0oOooo0.l;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nTopicDetailContentComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicDetailContentComp.kt\ncom/yalla/yalla/ui/activity/moment/TopicDetailContentCompKt$TopicDetailContent$2$1$4\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,212:1\n67#2,3:213\n66#2:216\n1097#3,6:217\n*S KotlinDebug\n*F\n+ 1 TopicDetailContentComp.kt\ncom/yalla/yalla/ui/activity/moment/TopicDetailContentCompKt$TopicDetailContent$2$1$4\n*L\n108#1:213,3\n108#1:216\n108#1:217,6\n*E\n"})
public final class oOo00ooO extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ NestedScrollConnection f49525OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicPopularMomentVM f49526OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Long f49527OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f49528OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f49529OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f49530OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ LazyListState f49531OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f49532OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<l> f49533OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final /* synthetic */ MutableState<o000OO> f49534OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ TopicDetailVM f49535OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo00ooO(int i, int i2, int i3, LazyListState lazyListState, MutableState mutableState, MutableState mutableState2, NestedScrollConnection nestedScrollConnection, FragmentActivity fragmentActivity, TopicDetailVM topicDetailVM, TopicPopularMomentVM topicPopularMomentVM, Long l) {
        super(2);
        this.f49526OooO0Oo = topicPopularMomentVM;
        this.f49528OooO0o0 = i;
        this.f49527OooO0o = l;
        this.f49529OooO0oO = i2;
        this.f49530OooO0oo = i3;
        this.f49525OooO = nestedScrollConnection;
        this.f49531OooOO0 = lazyListState;
        this.f49532OooOO0O = fragmentActivity;
        this.f49533OooOO0o = mutableState;
        this.f49535OooOOO0 = topicDetailVM;
        this.f49534OooOOO = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1424901549, iIntValue, -1, "com.yalla.yalla.ui.activity.moment.TopicDetailContent.<anonymous>.<anonymous>.<anonymous> (TopicDetailContentComp.kt:105)");
            }
            TopicPopularMomentVM topicPopularMomentVM = this.f49526OooO0Oo;
            ContentState value = topicPopularMomentVM.getContentState().getValue();
            int i = this.f49528OooO0o0;
            Integer numValueOf = Integer.valueOf(i);
            composer2.startReplaceableGroup(1618982084);
            boolean zChanged = composer2.changed(numValueOf) | composer2.changed(topicPopularMomentVM);
            Long l = this.f49527OooO0o;
            boolean zChanged2 = zChanged | composer2.changed(l);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new oO00o000(topicPopularMomentVM, i, l);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            Function0 function0 = (Function0) objRememberedValue;
            NestedScrollConnection nestedScrollConnection = this.f49525OooO;
            LazyListState lazyListState = this.f49531OooOO0;
            TopicPopularMomentVM topicPopularMomentVM2 = this.f49526OooO0Oo;
            int i2 = this.f49528OooO0o0;
            FragmentActivity fragmentActivity = this.f49532OooOO0O;
            MutableState<l> mutableState = this.f49533OooOO0o;
            TopicDetailVM topicDetailVM = this.f49535OooOOO0;
            Long l2 = this.f49527OooO0o;
            oOO00O.OooO0o0(value, false, null, null, null, null, function0, ComposableLambdaKt.composableLambda(composer2, 1373901269, true, new oOo00o0o(i2, this.f49530OooO0oo, this.f49529OooO0oO, lazyListState, mutableState, this.f49534OooOOO, nestedScrollConnection, fragmentActivity, topicDetailVM, topicPopularMomentVM2, l2)), composer2, 12582912, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
