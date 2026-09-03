package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SaveableStateHolder f7042OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f7043OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f7044OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Oooo000(SaveableStateHolder saveableStateHolder, Function2<? super Composer, ? super Integer, Unit> function2, int i) {
        super(2);
        this.f7042OooO0Oo = saveableStateHolder;
        this.f7044OooO0o0 = function2;
        this.f7043OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f7043OooO0o | 1);
        OooOo.OooO0O0(this.f7042OooO0Oo, this.f7044OooO0o0, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
