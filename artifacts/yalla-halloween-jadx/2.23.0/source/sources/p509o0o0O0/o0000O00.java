package p509o0o0O0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.adapter.postList.PostDetailHeaderViewTag;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O00 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ EnterRoomParentPage f50500OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f50501OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f50502OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f50503OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Long f50504OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ boolean f50505OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ Function1<MomentDetailModel, Unit> f50506OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ Function2<PostDetailHeaderViewTag, Object, Unit> f50507OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f50508OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final /* synthetic */ Long f50509OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ ArrayList<String> f50510OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final /* synthetic */ int f50511OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final /* synthetic */ int f50512OooOOOo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0000O00(MomentDetailModel momentDetailModel, FragmentActivity fragmentActivity, String str, Long l, boolean z, EnterRoomParentPage enterRoomParentPage, Function1<? super MomentDetailModel, Unit> function1, Function2<? super PostDetailHeaderViewTag, Object, Unit> function2, boolean z2, ArrayList<String> arrayList, Long l2, int i, int i2) {
        super(2);
        this.f50501OooO0Oo = momentDetailModel;
        this.f50503OooO0o0 = fragmentActivity;
        this.f50502OooO0o = str;
        this.f50504OooO0oO = l;
        this.f50505OooO0oo = z;
        this.f50500OooO = enterRoomParentPage;
        this.f50506OooOO0 = function1;
        this.f50507OooOO0O = function2;
        this.f50508OooOO0o = z2;
        this.f50510OooOOO0 = arrayList;
        this.f50509OooOOO = l2;
        this.f50511OooOOOO = i;
        this.f50512OooOOOo = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-71836360, iIntValue, -1, "com.yalla.yalla.ui.composable.moment.MomentDetailComp.<anonymous>.<anonymous> (MomentDetailComp.kt:96)");
            }
            if (this.f50501OooO0Oo.getType() == 5) {
                composer2.startReplaceableGroup(-384420768);
                o000oOoO.OooO00o(Modifier.INSTANCE, this.f50501OooO0Oo, this.f50503OooO0o0, composer2, 582, 0);
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(-384420692);
                Modifier.Companion companion = Modifier.INSTANCE;
                String str = this.f50502OooO0o;
                Long l = this.f50504OooO0oO;
                boolean z = this.f50505OooO0oo;
                EnterRoomParentPage enterRoomParentPage = this.f50500OooO;
                Function1<MomentDetailModel, Unit> function1 = this.f50506OooOO0;
                Function2<PostDetailHeaderViewTag, Object, Unit> function2 = this.f50507OooOO0O;
                boolean z2 = this.f50508OooOO0o;
                ArrayList<String> arrayList = this.f50510OooOOO0;
                Long l2 = this.f50509OooOOO;
                int i = this.f50511OooOOOO;
                int i2 = i >> 3;
                int i3 = (i2 & 896) | (i2 & 112) | 134217734;
                int i4 = this.f50512OooOOOo;
                int i5 = i4 >> 3;
                o0000oo.OooO0O0(companion, str, l, z, enterRoomParentPage, function1, function2, z2, arrayList, l2, composer2, i3 | ((i4 >> 15) & 7168) | (i5 & 57344) | (i5 & 458752) | ((i4 >> 9) & 3670016) | ((i << 21) & 29360128) | ((i << 12) & 1879048192), 0);
                composer2.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
