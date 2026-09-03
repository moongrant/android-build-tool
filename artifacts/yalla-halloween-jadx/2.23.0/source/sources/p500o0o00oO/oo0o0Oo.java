package p500o0o00oO;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.model.TopRankHeaderModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0o0Oo extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BoxScope f49434OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f49435OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ TopRankHeaderModel f49436OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f49437OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0Oo(BoxScope boxScope, TopRankHeaderModel topRankHeaderModel, int i, int i2) {
        super(2);
        this.f49434OooO0Oo = boxScope;
        this.f49436OooO0o0 = topRankHeaderModel;
        this.f49435OooO0o = i;
        this.f49437OooO0oO = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49437OooO0oO | 1);
        TopRankHeaderModel topRankHeaderModel = this.f49436OooO0o0;
        int i = this.f49435OooO0o;
        o000OOo.OooO00o(this.f49434OooO0Oo, topRankHeaderModel, i, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
