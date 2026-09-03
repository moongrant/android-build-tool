package p519o0o0O0oO;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OOOo extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<TextFieldValue> f52664OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f52665OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f52666OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f52667OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOOo(MutableState<TextFieldValue> mutableState, int i, int i2, int i3) {
        super(2);
        this.f52664OooO0Oo = mutableState;
        this.f52666OooO0o0 = i;
        this.f52665OooO0o = i2;
        this.f52667OooO0oO = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52667OooO0oO | 1);
        int i = this.f52666OooO0o0;
        int i2 = this.f52665OooO0o;
        oo0OOoo.OooO00o(this.f52664OooO0Oo, i, i2, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
