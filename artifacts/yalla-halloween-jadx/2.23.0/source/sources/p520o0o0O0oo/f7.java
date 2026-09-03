package p520o0o0O0oo;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.dialog.giftDialog.GiftCustomMadeWebManager;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class f7 extends Lambda implements Function3<x6, Integer, KeyEvent, Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ x6 f53279OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(x6 x6Var) {
        super(3);
        this.f53279OooO0Oo = x6Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003b  */
    @Override // kotlin.jvm.functions.Function3
    public final Boolean invoke(x6 x6Var, Integer num, KeyEvent keyEvent) {
        boolean z;
        int iIntValue = num.intValue();
        KeyEvent event = keyEvent;
        Intrinsics.checkNotNullParameter(x6Var, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (iIntValue == 4) {
            z = true;
            if (event.getAction() == 1) {
                GiftCustomMadeWebManager giftCustomMadeWebManagerOooOOoo = this.f53279OooO0Oo.OooOOoo();
                if (!giftCustomMadeWebManagerOooOOoo.f28004OooOO0) {
                    FrameLayout frameLayout = giftCustomMadeWebManagerOooOOoo.f27997OooO0O0;
                    if (!o000OO00.OooO0o0(frameLayout) || frameLayout.getChildCount() <= 0) {
                        z = false;
                    } else {
                        giftCustomMadeWebManagerOooOOoo.OooO0O0();
                    }
                }
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
