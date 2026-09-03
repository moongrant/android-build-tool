package p532o0o0OOo0;

import com.yalla.yalla.ui.screen.ScreenNavigationActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0Oo extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ScreenNavigationActivity f53487OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0Oo(ScreenNavigationActivity screenNavigationActivity) {
        super(1);
        this.f53487OooO0Oo = screenNavigationActivity;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0017 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x001a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0022  */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int i;
        Integer num2 = num;
        if (num2 != null && num2.intValue() == 0) {
            i = -1;
        } else if (num2 != null) {
            i = 1;
            if (num2.intValue() != 1) {
                if (num2 == null) {
                    i = -1;
                } else {
                    i = 2;
                    if (num2.intValue() != 2) {
                        i = -1;
                    }
                }
            }
        } else if (num2 == null) {
            i = -1;
        } else {
            i = 2;
            if (num2.intValue() != 2) {
                i = -1;
            }
        }
        this.f53487OooO0Oo.OooOO0o().OooOoO0(i);
        return Unit.INSTANCE;
    }
}
