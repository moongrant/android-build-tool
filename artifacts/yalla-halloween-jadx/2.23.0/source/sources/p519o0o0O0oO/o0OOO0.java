package p519o0o0O0oO;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.model.RecommendNewPostModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p579o0oOoo.oO0O0O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ List<RecommendNewPostModel> f52732OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ oO0O0O00 f52733OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f52734OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Integer> f52735OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f52736OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0(int i, MutableState mutableState, FragmentActivity fragmentActivity, oO0O0O00 oo0o0o00, List list) {
        super(2);
        this.f52732OooO0Oo = list;
        this.f52734OooO0o0 = fragmentActivity;
        this.f52733OooO0o = oo0o0o00;
        this.f52735OooO0oO = mutableState;
        this.f52736OooO0oo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        List<RecommendNewPostModel> list = this.f52732OooO0Oo;
        FragmentActivity fragmentActivity = this.f52734OooO0o0;
        oO0O0O00 oo0o0o00 = this.f52733OooO0o;
        o0OOO0OO.OooO0Oo(RecomposeScopeImplKt.updateChangedFlags(this.f52736OooO0oo | 1), composer, this.f52735OooO0oO, fragmentActivity, oo0o0o00, list);
        return Unit.INSTANCE;
    }
}
