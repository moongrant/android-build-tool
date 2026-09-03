package p501o0o00o;

import android.view.KeyEvent;
import com.yalla.yalla.common.ui.dialog.giftDialog.GiftCustomMadeWebManager;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.oOO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0 extends Lambda implements Function3<o000, Integer, KeyEvent, Boolean> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000 f41463Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0(o000 o000Var) {
        super(3);
        this.f41463Oooo0o = o000Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Boolean invoke(o000 o000Var, Integer num, KeyEvent keyEvent) {
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(o000Var, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(keyEvent, "<anonymous parameter 2>");
        boolean z = false;
        if (iIntValue == 4) {
            GiftCustomMadeWebManager giftCustomMadeWebManagerOooOOO = o000.OooOOO(this.f41463Oooo0o);
            if (giftCustomMadeWebManagerOooOOO.f20900OooOO0) {
                z = true;
            } else if (oOO00O.OooO0Oo(giftCustomMadeWebManagerOooOOO.f20893OooO0O0) && giftCustomMadeWebManagerOooOOO.f20893OooO0O0.getChildCount() > 0) {
                giftCustomMadeWebManagerOooOOO.OooO0O0();
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
