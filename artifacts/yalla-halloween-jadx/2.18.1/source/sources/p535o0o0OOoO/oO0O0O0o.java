package p535o0o0OOoO;

import OooO00o.OooO00o;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0O0O0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ DrawerLayout f43662Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O0O0o(DrawerLayout drawerLayout) {
        super(0);
        this.f43662Oooo0o = drawerLayout;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        DrawerLayout drawerLayout = this.f43662Oooo0o;
        if (drawerLayout == null) {
            return null;
        }
        View viewOooO0Oo = drawerLayout.OooO0Oo(8388611);
        if (viewOooO0Oo != null) {
            drawerLayout.OooOOO(viewOooO0Oo);
            return Unit.INSTANCE;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("No drawer view found with gravity ");
        sbOooO0o0.append(DrawerLayout.OooO(8388611));
        throw new IllegalArgumentException(sbOooO0o0.toString());
    }
}
