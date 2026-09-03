package p650o0ooo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<TextFieldValue> f58570OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f58571OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f58572OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f58573OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO0O(MutableState<TextFieldValue> mutableState, int i, int i2, int i3) {
        super(2);
        this.f58570OooO0Oo = mutableState;
        this.f58572OooO0o0 = i;
        this.f58571OooO0o = i2;
        this.f58573OooO0oO = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f58573OooO0oO | 1);
        int i = this.f58572OooO0o0;
        int i2 = this.f58571OooO0o;
        o0o0Oo.OooO00o(this.f58570OooO0Oo, i, i2, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
