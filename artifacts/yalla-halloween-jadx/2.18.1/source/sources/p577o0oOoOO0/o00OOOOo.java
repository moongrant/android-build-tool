package p577o0oOoOO0;

import Oooo0.o00;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import com.weieyu.yalla.R;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o00O00o0;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OOOOo {

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00O00o0 f45765Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f45766Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f45767Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00O00o0 o00o00o1, int i, int i2) {
            super(2);
            this.f45765Oooo0o = o00o00o1;
            this.f45766Oooo0oO = i;
            this.f45767Oooo0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o00OOOOo.OooO00o(this.f45765Oooo0o, this.f45766Oooo0oO, ooo00o, this.f45767Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00O00o0 f45768Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f45769Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f45770Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o00O00o0 o00o00o1, int i, int i2) {
            super(2);
            this.f45768Oooo0o = o00o00o1;
            this.f45769Oooo0oO = i;
            this.f45770Oooo0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o00OOOOo.OooO00o(this.f45768Oooo0o, this.f45769Oooo0oO, ooo00o, this.f45770Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull o00O00o0 o00o00o1, int i, @Nullable oOO00O ooo00o, int i2) {
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(o00o00o1, "<this>");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(936382007);
        if ((i2 & 14) == 0) {
            i3 = (ooo00oOooOOo.Oooo0oo(o00o00o1) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= ooo00oOooOOo.OooO(i) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            if (i > 3 || i < 1) {
                oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO00o(o00o00o1, i, i2));
                return;
            }
            if (i != 1) {
                i4 = i != 2 ? R.mipmap.ic_room_member_user_rank_number_3 : R.mipmap.ic_room_member_user_rank_number_2;
            } else {
                i4 = R.mipmap.ic_room_member_user_rank_number_1;
            }
            o00.OooO00o(o00000.OooO0O0.OooO00o(i4, ooo00oOooOOo), null, o00o00o1.OooO00o(SizeKt.OooOO0(o00OOOO0.OooO00o.f4198Oooo0o, 24), o00OO0O0.OooO00o.f4175OooO0o), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, ooo00oOooOOo, 56, 120);
        }
        oo0ooO oo0oooOooOo2 = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo2 == null) {
            return;
        }
        oo0oooOooOo2.OooO00o(new OooO0O0(o00o00o1, i, i2));
    }
}
