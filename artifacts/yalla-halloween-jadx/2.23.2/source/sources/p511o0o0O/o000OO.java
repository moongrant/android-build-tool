package p511o0o0O;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.code.android.util.o000O;
import com.yalla.yalla.ui.dialog.giftDialog.GiftCustomMadeWebManager;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO extends Lambda implements Function3<o00000OO, Integer, KeyEvent, Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000OO f51015OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO(o00000OO o00000oo2) {
        super(3);
        this.f51015OooO0Oo = o00000oo2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003b  */
    @Override // kotlin.jvm.functions.Function3
    public final Boolean invoke(o00000OO o00000oo2, Integer num, KeyEvent keyEvent) {
        boolean z;
        int iIntValue = num.intValue();
        KeyEvent event = keyEvent;
        Intrinsics.checkNotNullParameter(o00000oo2, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (iIntValue == 4) {
            z = true;
            if (event.getAction() == 1) {
                GiftCustomMadeWebManager giftCustomMadeWebManagerOooOOo = this.f51015OooO0Oo.OooOOo();
                if (!giftCustomMadeWebManagerOooOOo.f27532OooOO0) {
                    FrameLayout frameLayout = giftCustomMadeWebManagerOooOOo.f27525OooO0O0;
                    if (!o000O.OooO0o0(frameLayout) || frameLayout.getChildCount() <= 0) {
                        z = false;
                    } else {
                        giftCustomMadeWebManagerOooOOo.OooO0O0();
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
