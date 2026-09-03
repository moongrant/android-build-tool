package p139o00OOOo0;

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
import p043OooooO0.o00O0000;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p254o00ooO0O.o000O0O0;
import p257o00ooOO0.o0O0oo0o;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class oo0oOO0 {

    public static final class OooO00o extends Lambda implements Function3<o0O00OO<Boolean>, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ boolean f31883Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f31884Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, Function0<Unit> function0) {
            super(3);
            this.f31883Oooo0o = z;
            this.f31884Oooo0oO = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o0O00OO<Boolean> o0o00oo2, oOO00O ooo00o, Integer num) {
            String strOooO0OO;
            String strOooO0OO2;
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
                if (this.f31883Oooo0o) {
                    strOooO0OO = o000O0O0.OooO0OO(R.string.user_add_power_see_room_friend);
                    strOooO0OO2 = o000O0O0.OooO0OO(R.string.Add_Friend);
                } else {
                    strOooO0OO = o000O0O0.OooO0OO(R.string.user_add_power_see_room_follow);
                    strOooO0OO2 = o000O0O0.OooO0OO(R.string.Follow);
                }
                o0O0oo0o.OooO0Oo(it, null, strOooO0OO, null, false, false, null, null, strOooO0OO2, false, null, false, this.f31884Oooo0oO, null, false, null, o00O0OOO.f31839Oooo0o, null, null, ooo00o2, i & 14, 1572864, 454394);
            }
            return Unit.INSTANCE;
        }
    }

    @JvmStatic
    public static final void OooO00o(@NotNull BaseFragmentActivity activity, boolean z, @NotNull Function0<Unit> onConfirmClick) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onConfirmClick, "onConfirmClick");
        activity.showDialog((String) null, o00O0000.OooO0O0(-2064368538, true, new OooO00o(z, onConfirmClick)));
    }
}
