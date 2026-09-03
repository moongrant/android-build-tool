package p546o0o0Ooo0;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.app.base.mixedroom.MixedRoomActivity;
import com.weieyu.yalla.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p043OooooO0.o00O0000;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p545o0o0OoOo.b8;
import p545o0o0OoOo.c8;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class oO0OOo0o extends c8 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final b8 f44583OooO0O0;

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {
        public OooO00o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            oOO00O ooo00o2 = ooo00o;
            if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                oO000Oo0.OooOOO0(oO0OOo0o.this.f44583OooO0O0, ooo00o2, 8);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OOo0o(@NotNull MixedRoomActivity roomActivity, @NotNull b8 dataMedium) {
        super(roomActivity);
        Intrinsics.checkNotNullParameter(roomActivity, "roomActivity");
        Intrinsics.checkNotNullParameter(dataMedium, "dataMedium");
        this.f44583OooO0O0 = dataMedium;
        ((ComposeView) roomActivity.findViewById(R.id.compose_room_bottom_layout)).setContent(o00O0000.OooO0O0(103169120, true, new OooO00o()));
    }

    @Override // p545o0o0OoOo.c8
    public final void OooO00o() {
    }

    @Override // p545o0o0OoOo.c8
    public final void OooO0O0() {
    }
}
