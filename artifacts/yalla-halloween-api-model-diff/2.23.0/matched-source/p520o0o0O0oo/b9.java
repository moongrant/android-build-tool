package p520o0o0O0oo;

import com.yalla.yalla.model.gift.GiftPropTypeShow;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class b9 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ x6 f53254OooO0Oo;

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
    public b9(x6 x6Var) {
        super(0);
        this.f53254OooO0Oo = x6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        x6 x6Var = this.f53254OooO0Oo;
        int i = OooO00o.$EnumSwitchMapping$0[x6Var.f53374OooO.ordinal()];
        if (i == 1 || i == 2) {
            x6Var.OooO0OO();
        }
        return Unit.INSTANCE;
    }
}
