package p650o0ooo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.model.RecommendNewPostModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p590o0oOooo0.l;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00OOO extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ List<RecommendNewPostModel> f58634OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ l f58635OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f58636OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Integer> f58637OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f58638OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00OOO(int i, MutableState mutableState, FragmentActivity fragmentActivity, l lVar, List list) {
        super(2);
        this.f58634OooO0Oo = list;
        this.f58636OooO0o0 = fragmentActivity;
        this.f58635OooO0o = lVar;
        this.f58637OooO0oO = mutableState;
        this.f58638OooO0oo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        List<RecommendNewPostModel> list = this.f58634OooO0Oo;
        FragmentActivity fragmentActivity = this.f58636OooO0o0;
        l lVar = this.f58635OooO0o;
        o0oO0Ooo.OooO0Oo(RecomposeScopeImplKt.updateChangedFlags(this.f58638OooO0oo | 1), composer, this.f58637OooO0oO, fragmentActivity, lVar, list);
        return Unit.INSTANCE;
    }
}
