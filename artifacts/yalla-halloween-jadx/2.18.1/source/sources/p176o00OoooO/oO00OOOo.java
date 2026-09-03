package p176o00OoooO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.base.activity.BaseFragmentActivity;
import com.weieyu.yalla.R;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p043OooooO0.o000OOo0;
import p043OooooO0.o00O0000;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p254o00ooO0O.o000O0O0;
import p257o00ooOO0.o0O0oo0o;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class oO00OOOo {

    public static final class OooO00o extends Lambda implements Function3<o0O00OO<Boolean>, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f32849Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Function0<Unit> function0) {
            super(3);
            this.f32849Oooo0o = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o0O00OO<Boolean> o0o00oo2, oOO00O ooo00o, Integer num) {
            o0O00OO<Boolean> it = o0o00oo2;
            oOO00O ooo00o2 = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(it, "it");
            if ((iIntValue & 14) == 0) {
                iIntValue |= ooo00o2.Oooo0oo(it) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                ooo00o2.OooO0o0(-492369756);
                Object objOooO0o = ooo00o2.OooO0o();
                oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                if (objOooO0o == c0323OooO00o) {
                    objOooO0o = o0OOO00.OooO0Oo(Boolean.FALSE);
                    ooo00o2.Oooo00o(objOooO0o);
                }
                ooo00o2.Oooo0o0();
                o0O00OO o0o00oo3 = (o0O00OO) objOooO0o;
                String strOooO0OO = o000O0O0.OooO0OO(R.string.send_reward_title);
                o000OOo0 o000ooo0OooO00o = o00O0000.OooO00o(ooo00o2, 1946778888, new oO00O0oO(o0o00oo3));
                Function0<Unit> function0 = this.f32849Oooo0o;
                ooo00o2.OooO0o0(511388516);
                boolean zOooo0oo = ooo00o2.Oooo0oo(o0o00oo3) | ooo00o2.Oooo0oo(function0);
                Object objOooO0o2 = ooo00o2.OooO0o();
                if (zOooo0oo || objOooO0o2 == c0323OooO00o) {
                    objOooO0o2 = new oO00OO0O(o0o00oo3, function0);
                    ooo00o2.Oooo00o(objOooO0o2);
                }
                ooo00o2.Oooo0o0();
                o0O0oo0o.OooO0Oo(it, null, strOooO0OO, o000ooo0OooO00o, false, false, null, null, null, false, null, false, (Function0) objOooO0o2, null, false, null, oO00OOO.f32848Oooo0o, null, null, ooo00o2, (iIntValue & 14) | 3072, 1572864, 454642);
            }
            return Unit.INSTANCE;
        }
    }

    @JvmStatic
    public static final void OooO00o(@NotNull BaseFragmentActivity activity, @NotNull Function0<Unit> confirmClick) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(confirmClick, "confirmClick");
        activity.showDialog((String) null, o00O0000.OooO0O0(-530038045, true, new OooO00o(confirmClick)));
    }
}
