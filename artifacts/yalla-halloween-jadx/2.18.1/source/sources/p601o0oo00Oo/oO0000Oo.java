package p601o0oo00Oo;

import android.text.Editable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p188o00o00o0.OooO0o;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0000Oo extends Lambda implements Function1<Editable, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oO000 f48248Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ OooO0o f48249Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000Oo(oO000 oo000, OooO0o oooO0o) {
        super(1);
        this.f48248Oooo0o = oo000;
        this.f48249Oooo0oO = oooO0o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Editable editable) {
        Editable editable2 = editable;
        if (editable2 != null) {
            oO000 oo000 = this.f48248Oooo0o;
            OooO0o oooO0o = this.f48249Oooo0oO;
            Function2<? super Integer, ? super String, Unit> function2 = oo000.f48239OooO00o;
            if (function2 != null) {
                function2.invoke(Integer.valueOf(oooO0o.getLayoutPosition()), editable2.toString());
            }
        }
        return Unit.INSTANCE;
    }
}
