package p535o0o0Oo0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.model.PostUserModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0oO0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0OO00o0 f53762OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ PostUserModel f53763OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f53764OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f53765OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0oO0(o0OO00o0 o0oo00o1, int i, PostUserModel postUserModel, int i2) {
        super(2);
        this.f53762OooO0Oo = o0oo00o1;
        this.f53764OooO0o0 = i;
        this.f53763OooO0o = postUserModel;
        this.f53765OooO0oO = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f53765OooO0oO | 1);
        int i = this.f53764OooO0o0;
        PostUserModel postUserModel = this.f53763OooO0o;
        o0OO00o0.OooO0OO(this.f53762OooO0Oo, i, postUserModel, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
