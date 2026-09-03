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
public final class o0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Integer> f58421OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f58422OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ List<RecommendNewPostModel> f58423OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ l f58424OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f58425OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(int i, MutableState mutableState, FragmentActivity fragmentActivity, l lVar, List list) {
        super(2);
        this.f58421OooO0Oo = mutableState;
        this.f58423OooO0o0 = list;
        this.f58422OooO0o = fragmentActivity;
        this.f58424OooO0oO = lVar;
        this.f58425OooO0oo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        MutableState<Integer> mutableState = this.f58421OooO0Oo;
        List<RecommendNewPostModel> list = this.f58423OooO0o0;
        o0oO0Ooo.OooO00o(RecomposeScopeImplKt.updateChangedFlags(this.f58425OooO0oo | 1), composer, mutableState, this.f58422OooO0o, this.f58424OooO0oO, list);
        return Unit.INSTANCE;
    }
}
