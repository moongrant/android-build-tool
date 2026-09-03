package p509o0o0O0;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.unit.Dp;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.adapter.postList.PostDetailHeaderViewTag;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p147o00Oo0Oo.o000OOo;
import p469o0OoooOO.o0oO0O0o;
import p515o0o0O0O0.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentDetailComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentDetailComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentDetailCompKt$MomentContent$2$2$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,333:1\n154#2:334\n154#2:336\n76#3:335\n*S KotlinDebug\n*F\n+ 1 MomentDetailComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentDetailCompKt$MomentContent$2$2$2\n*L\n275#1:334\n279#1:336\n278#1:335\n*E\n"})
public final class o00000 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Function2<PostDetailHeaderViewTag, Object, Unit> f50414OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f50415OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f50416OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Long f50417OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ EnterRoomParentPage f50418OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Function1<MomentDetailModel, Unit> f50419OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ boolean f50420OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ ArrayList<String> f50421OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ Long f50422OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ int f50423OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00000(String str, Long l, boolean z, EnterRoomParentPage enterRoomParentPage, Function1<? super MomentDetailModel, Unit> function1, Function2<? super PostDetailHeaderViewTag, Object, Unit> function2, boolean z2, ArrayList<String> arrayList, Long l2, int i) {
        super(2);
        this.f50415OooO0Oo = str;
        this.f50417OooO0o0 = l;
        this.f50416OooO0o = z;
        this.f50418OooO0oO = enterRoomParentPage;
        this.f50419OooO0oo = function1;
        this.f50414OooO = function2;
        this.f50420OooOO0 = z2;
        this.f50421OooOO0O = arrayList;
        this.f50422OooOO0o = l2;
        this.f50423OooOOO0 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1896075934, iIntValue, -1, "com.yalla.yalla.ui.composable.moment.MomentContent.<anonymous>.<anonymous>.<anonymous> (MomentDetailComp.kt:271)");
            }
            Modifier modifierM478paddingVpY3zN4$default = PaddingKt.m478paddingVpY3zN4$default(BackgroundKt.m169backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m3765constructorimpl(61), 0.0f, Dp.m3765constructorimpl(15), 0.0f, 10, null), 0.0f, 1, null), RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(oo0o0Oo.OooO00o(true))), ((Boolean) composer2.consume(o000OOo.f37692OooO00o)).booleanValue() ? o0oO0O0o.f47078o000o0O : o0oO0O0o.f47091o000oo0O, null, 2, null), 0.0f, Dp.m3765constructorimpl(10), 1, null);
            String str = this.f50415OooO0Oo;
            Long l = this.f50417OooO0o0;
            boolean z = this.f50416OooO0o;
            EnterRoomParentPage enterRoomParentPage = this.f50418OooO0oO;
            Function1<MomentDetailModel, Unit> function1 = this.f50419OooO0oo;
            Function2<PostDetailHeaderViewTag, Object, Unit> function2 = this.f50414OooO;
            boolean z2 = this.f50420OooOO0;
            ArrayList<String> arrayList = this.f50421OooOO0O;
            Long l2 = this.f50422OooOO0o;
            int i = this.f50423OooOOO0;
            o0000oo.OooO0O0(modifierM478paddingVpY3zN4$default, str, l, z, enterRoomParentPage, function1, function2, z2, arrayList, l2, composer2, (i & 112) | 134217728 | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | (3670016 & i) | (29360128 & i) | (i & 1879048192), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
