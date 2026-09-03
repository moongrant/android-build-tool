package p561o0oOOooo;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p159o00OoOO.o00O000;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00o00 extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oOo000Oo f44910Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f44911Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00o00(oOo000Oo ooo000oo, int i) {
        super(0);
        this.f44910Oooo0o = ooo000oo;
        this.f44911Oooo0oO = i;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        if (this.f44910Oooo0o.f44927OooO0o0 == null) {
            return null;
        }
        o00O000.OooO().OooOoo(Integer.valueOf(this.f44911Oooo0oO + 1));
        return null;
    }
}
