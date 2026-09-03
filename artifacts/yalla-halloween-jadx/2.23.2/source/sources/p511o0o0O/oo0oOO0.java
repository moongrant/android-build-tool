package p511o0o0O;

import com.yalla.yalla.model.gift.GiftPropTypeShow;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0oOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000OO f51073OooO0Oo;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GiftPropTypeShow.values().length];
            try {
                iArr[GiftPropTypeShow.InMomentDetail.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GiftPropTypeShow.InMomentList.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0oOO0(o00000OO o00000oo2) {
        super(0);
        this.f51073OooO0Oo = o00000oo2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00000OO o00000oo2 = this.f51073OooO0Oo;
        int i = OooO00o.$EnumSwitchMapping$0[o00000oo2.f50958OooO.ordinal()];
        if (i == 1 || i == 2) {
            o00000oo2.OooO0OO();
        }
        return Unit.INSTANCE;
    }
}
