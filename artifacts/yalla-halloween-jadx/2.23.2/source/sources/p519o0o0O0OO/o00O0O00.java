package p519o0o0O0OO;

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
import p193o00o0O0O.o0000oo;
import p476o0OooooO.o0OOo000;
import p521o0o0O0o0.o0000OO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentDetailComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentDetailComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentDetailCompKt$MomentContent$2$2$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,334:1\n154#2:335\n154#2:337\n76#3:336\n*S KotlinDebug\n*F\n+ 1 MomentDetailComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentDetailCompKt$MomentContent$2$2$2\n*L\n276#1:335\n280#1:337\n279#1:336\n*E\n"})
public final class o00O0O00 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Function2<PostDetailHeaderViewTag, Object, Unit> f52069OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f52070OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f52071OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Long f52072OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ EnterRoomParentPage f52073OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Function1<MomentDetailModel, Unit> f52074OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ boolean f52075OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ ArrayList<String> f52076OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ Long f52077OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ int f52078OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00O0O00(String str, Long l, boolean z, EnterRoomParentPage enterRoomParentPage, Function1<? super MomentDetailModel, Unit> function1, Function2<? super PostDetailHeaderViewTag, Object, Unit> function2, boolean z2, ArrayList<String> arrayList, Long l2, int i) {
        super(2);
        this.f52070OooO0Oo = str;
        this.f52072OooO0o0 = l;
        this.f52071OooO0o = z;
        this.f52073OooO0oO = enterRoomParentPage;
        this.f52074OooO0oo = function1;
        this.f52069OooO = function2;
        this.f52075OooOO0 = z2;
        this.f52076OooOO0O = arrayList;
        this.f52077OooOO0o = l2;
        this.f52078OooOOO0 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1896075934, iIntValue, -1, "com.yalla.yalla.ui.composable.moment.MomentContent.<anonymous>.<anonymous>.<anonymous> (MomentDetailComp.kt:273)");
            }
            Modifier modifierM480paddingVpY3zN4$default = PaddingKt.m480paddingVpY3zN4$default(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m3775constructorimpl(61), 0.0f, Dp.m3775constructorimpl(15), 0.0f, 10, null), 0.0f, 1, null), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(o0000OO0.OooO00o(true))), ((Boolean) composer2.consume(o0000oo.f38633OooO00o)).booleanValue() ? o0OOo000.f48272o000o0o0 : o0OOo000.f48283o000ooO0, null, 2, null), 0.0f, Dp.m3775constructorimpl(10), 1, null);
            String str = this.f52070OooO0Oo;
            Long l = this.f52072OooO0o0;
            boolean z = this.f52071OooO0o;
            EnterRoomParentPage enterRoomParentPage = this.f52073OooO0oO;
            Function1<MomentDetailModel, Unit> function1 = this.f52074OooO0oo;
            Function2<PostDetailHeaderViewTag, Object, Unit> function2 = this.f52069OooO;
            boolean z2 = this.f52075OooOO0;
            ArrayList<String> arrayList = this.f52076OooOO0O;
            Long l2 = this.f52077OooOO0o;
            int i = this.f52078OooOOO0;
            oo0oOO0.OooO0O0(modifierM480paddingVpY3zN4$default, str, l, z, enterRoomParentPage, function1, function2, z2, arrayList, l2, composer2, (i & 112) | 134217728 | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | (3670016 & i) | (29360128 & i) | (i & 1879048192), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
