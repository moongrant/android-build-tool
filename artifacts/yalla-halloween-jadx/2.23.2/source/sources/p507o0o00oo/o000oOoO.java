package p507o0o00oo;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.model.TopRankHeaderModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000oOoO extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BoxScope f50610OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f50611OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ TopRankHeaderModel f50612OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f50613OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(BoxScope boxScope, TopRankHeaderModel topRankHeaderModel, int i, int i2) {
        super(2);
        this.f50610OooO0Oo = boxScope;
        this.f50612OooO0o0 = topRankHeaderModel;
        this.f50611OooO0o = i;
        this.f50613OooO0oO = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f50613OooO0oO | 1);
        TopRankHeaderModel topRankHeaderModel = this.f50612OooO0o0;
        int i = this.f50611OooO0o;
        o00O0O.OooO00o(this.f50610OooO0Oo, topRankHeaderModel, i, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
