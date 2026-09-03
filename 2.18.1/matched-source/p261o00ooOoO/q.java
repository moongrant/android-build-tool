package p261o00ooOoO;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.yltheme.TextButtonStyle;
import com.yallatech.support.platform.share.bean.ShareRequest;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO.OooO0O0;
import p031OoooO.OooO0OO;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p145o00Oo0.o00000O0;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class q {

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextButtonStyle.values().length];
            iArr[TextButtonStyle.Default.ordinal()] = 1;
            iArr[TextButtonStyle.OutLined.ordinal()] = 2;
            iArr[TextButtonStyle.OutLinedNegative.ordinal()] = 3;
            iArr[TextButtonStyle.None.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Composable
    @NotNull
    public static final OooO0O0 OooO00o(@NotNull TextButtonStyle style, @Nullable oOO00O ooo00o) {
        OooO0O0 oooO0O0OooO00o;
        Intrinsics.checkNotNullParameter(style, "style");
        ooo00o.OooO0o0(-1722142278);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        int i = OooO00o.$EnumSwitchMapping$0[style.ordinal()];
        if (i == 1) {
            ooo00o.OooO0o0(76937358);
            oooO0O0OooO00o = m.OooO00o(0L, 0L, ooo00o, 24576, 15);
            ooo00o.Oooo0o0();
        } else if (i == 2) {
            ooo00o.OooO0o0(76937421);
            ooo00o.OooO0o0(549926523);
            oooO0O0OooO00o = OooO0OO.f2549OooO00o.OooO00o(((o00000O0) u.OooO0O0(ooo00o).f34868OooOOO.getValue()).f32070OooO00o, u.OooO0O0(ooo00o).OooOOOo(), u.OooO0O0(ooo00o).OooOOo0(), ((o00000O0) u.OooO0O0(ooo00o).f34873OooOOo0.getValue()).f32070OooO00o, ooo00o, ShareRequest.THUMB_DATA_SIZE_LIMIT, 0);
            ooo00o.Oooo0o0();
            ooo00o.Oooo0o0();
        } else if (i == 3) {
            ooo00o.OooO0o0(76937493);
            ooo00o.OooO0o0(-700562608);
            oooO0O0OooO00o = OooO0OO.f2549OooO00o.OooO00o(u.OooO0O0(ooo00o).OooOOO(), u.OooO0O0(ooo00o).OooOOOO(), u.OooO0O0(ooo00o).OooOOO(), u.OooO0O0(ooo00o).OooOOOO(), ooo00o, ShareRequest.THUMB_DATA_SIZE_LIMIT, 0);
            ooo00o.Oooo0o0();
            ooo00o.Oooo0o0();
        } else {
            if (i != 4) {
                ooo00o.OooO0o0(76933614);
                ooo00o.Oooo0o0();
                throw new NoWhenBranchMatchedException();
            }
            ooo00o.OooO0o0(76937561);
            ooo00o.OooO0o0(-1600781455);
            long jOooOOOo = u.OooO0O0(ooo00o).OooOOOo();
            o00000O0.OooO00o oooO00o = o00000O0.f32063OooO0O0;
            long j = o00000O0.f32069OooO0oo;
            oooO0O0OooO00o = OooO0OO.f2549OooO00o.OooO00o(j, jOooOOOo, j, u.OooO0O0(ooo00o).OooOOo0(), ooo00o, ShareRequest.THUMB_DATA_SIZE_LIMIT, 0);
            ooo00o.Oooo0o0();
            ooo00o.Oooo0o0();
        }
        ooo00o.Oooo0o0();
        return oooO0O0OooO00o;
    }
}
