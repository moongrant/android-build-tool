package p176o00OoooO;

import com.weieyu.yalla.R;
import com.yalla.yalla.model.MyGiftModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00000.OooO0OO;
import o00OOO0.OooO00o;
import p043OooooO0.o00O0000;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p257o00ooOO0.o0O0oo0o;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes.dex */
public final class oO0OOO00 extends Lambda implements Function3<o0O00OO<Boolean>, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Function1<Boolean, Unit> f32866Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MyGiftModel.Data f32867Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ long f32868Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ OooO00o f32869Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oO0OOO00(MyGiftModel.Data data, long j, OooO00o oooO00o, Function1<? super Boolean, Unit> function1) {
        super(3);
        this.f32867Oooo0o = data;
        this.f32868Oooo0oO = j;
        this.f32869Oooo0oo = oooO00o;
        this.f32866Oooo = function1;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(o0O00OO<Boolean> o0o00oo2, oOO00O ooo00o, Integer num) {
        boolean z;
        o0O00OO<Boolean> it = o0o00oo2;
        oOO00O ooo00o2 = ooo00o;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(it, "it");
        if ((iIntValue & 14) == 0) {
            iIntValue |= ooo00o2.Oooo0oo(it) ? 4 : 2;
        }
        int i = iIntValue;
        if ((i & 91) == 18 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            if (this.f32867Oooo0o.getState() != 1) {
                z = false;
            } else {
                if (this.f32867Oooo0o.getRegion() != 0) {
                    Integer value = OooOOO.f41216OooO00o.OooOOO().getValue();
                    int region = this.f32867Oooo0o.getRegion();
                    if (value == null || value.intValue() != region) {
                        z = false;
                    }
                }
                z = true;
            }
            o0O0oo0o.OooO0Oo(it, OooO0OO.OooO00o(R.string.UserInfo_Dialog_title, ooo00o2), null, o00O0000.OooO00o(ooo00o2, -1457137824, new oOOoOOO0(this.f32867Oooo0o, z)), true, true, null, null, OooO0OO.OooO00o(R.string.UserInfo_Dialog_send, ooo00o2), false, null, false, (!z || this.f32867Oooo0o.isGiftBlind() || this.f32867Oooo0o.iGiftCustomMade() || this.f32867Oooo0o.isGiftMember()) ? null : new oO00o00(this.f32868Oooo0oO, this.f32867Oooo0o, this.f32869Oooo0oo, this.f32866Oooo), null, false, null, null, null, null, ooo00o2, (i & 14) | 224256, 0, 519876);
        }
        return Unit.INSTANCE;
    }
}
