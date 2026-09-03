package Oooo0;

import android.view.KeyEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p650o0ooOoO.f;
import p650o0ooOoO.g;

/* JADX INFO: loaded from: classes.dex */
public final class o000000 extends Lambda implements Function1<f, Boolean> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f540Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f541Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000(boolean z, Function0<Unit> function0) {
        super(1);
        this.f540Oooo0o = z;
        this.f541Oooo0oO = function0;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(f fVar) {
        boolean z;
        KeyEvent isClick = fVar.f51138OooO00o;
        Intrinsics.checkNotNullParameter(isClick, "it");
        boolean z2 = false;
        if (this.f540Oooo0o) {
            int i = o00000.f539OooO0O0;
            Intrinsics.checkNotNullParameter(isClick, "$this$isClick");
            if (g.OooO0O0(isClick) == 1) {
                int iOooO00o = (int) (g.OooO00o(isClick) >> 32);
                if (iOooO00o == 23 || iOooO00o == 66 || iOooO00o == 160) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z) {
                this.f541Oooo0oO.invoke();
                z2 = true;
            }
        }
        return Boolean.valueOf(z2);
    }
}
