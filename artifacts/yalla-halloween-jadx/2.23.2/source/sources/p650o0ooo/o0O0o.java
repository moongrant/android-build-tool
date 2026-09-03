package p650o0ooo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.model.RecommendNewPostModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p590o0oOooo0.l;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ List<RecommendNewPostModel> f58653OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ l f58654OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f58655OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Integer> f58656OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f58657OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o(int i, MutableState mutableState, FragmentActivity fragmentActivity, l lVar, List list) {
        super(2);
        this.f58653OooO0Oo = list;
        this.f58655OooO0o0 = fragmentActivity;
        this.f58654OooO0o = lVar;
        this.f58656OooO0oO = mutableState;
        this.f58657OooO0oo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(742874880, iIntValue, -1, "com.yalla.yalla.ui.dialog.FollowingMomentTopUserDialog.<anonymous> (FollowingMomentTopUserDialog.kt:74)");
            }
            List<RecommendNewPostModel> list = this.f58653OooO0Oo;
            FragmentActivity fragmentActivity = this.f58655OooO0o0;
            l lVar = this.f58654OooO0o;
            o0oO0Ooo.OooO0Oo(((this.f58657OooO0oo << 9) & 7168) | 584, composer2, this.f58656OooO0oO, fragmentActivity, lVar, list);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
