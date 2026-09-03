package p032OoooO0;

import android.view.KeyEvent;
import androidx.compose.foundation.text.HandleState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p034OoooO0O.o0000oo;
import p650o0ooOoO.f;
import p650o0ooOoO.g;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0 extends Lambda implements Function1<f, Boolean> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O0000O f3020Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0000oo f3021Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0(o0O0000O o0o0000o2, o0000oo o0000ooVar) {
        super(1);
        this.f3020Oooo0o = o0o0000o2;
        this.f3021Oooo0oO = o0000ooVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(f fVar) {
        boolean z;
        KeyEvent cancelsTextSelection = fVar.f51138OooO00o;
        Intrinsics.checkNotNullParameter(cancelsTextSelection, "keyEvent");
        boolean z2 = false;
        if (this.f3020Oooo0o.OooO00o() == HandleState.Selection) {
            Intrinsics.checkNotNullParameter(cancelsTextSelection, "$this$cancelsTextSelection");
            if (cancelsTextSelection.getKeyCode() != 4) {
                z = false;
            } else {
                if (g.OooO0O0(cancelsTextSelection) == 1) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                this.f3021Oooo0oO.OooO0oO(null);
                z2 = true;
            }
        }
        return Boolean.valueOf(z2);
    }
}
