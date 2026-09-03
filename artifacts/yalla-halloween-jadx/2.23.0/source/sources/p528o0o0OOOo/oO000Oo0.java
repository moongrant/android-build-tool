package p528o0o0OOOo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.model.PostUserModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000Oo0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO0o0o f53829OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ PostUserModel f53830OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f53831OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f53832OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000Oo0(oO0o0o oo0o0o, int i, PostUserModel postUserModel, int i2) {
        super(2);
        this.f53829OooO0Oo = oo0o0o;
        this.f53831OooO0o0 = i;
        this.f53830OooO0o = postUserModel;
        this.f53832OooO0oO = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f53832OooO0oO | 1);
        int i = this.f53831OooO0o0;
        PostUserModel postUserModel = this.f53830OooO0o;
        oO0o0o.OooO0OO(this.f53829OooO0Oo, i, postUserModel, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
