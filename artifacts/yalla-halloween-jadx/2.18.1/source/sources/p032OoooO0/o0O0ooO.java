package p032OoooO0;

import Oooo000.o0000O00;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.unit.LayoutDirection;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import o00000O.o00Oo0;
import o00000O.o0O0O00;
import o00000O.oo0o0Oo;
import o0000O0O.OooO;
import o0000O0O.o000oOoO;
import p048OoooooO.o00OOOO0;
import p053o00000oO.o0000;
import p053o00000oO.o0000Ooo;
import p053o00000oO.o000OOo;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0ooO extends Lambda implements Function3<o00OOOO0, oOO00O, Integer, o00OOOO0> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f3360Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ oo0o0Oo f3361Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0ooO(int i, oo0o0Oo oo0o0oo) {
        super(3);
        this.f3360Oooo0o = i;
        this.f3361Oooo0oO = oo0o0oo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final o00OOOO0 invoke(o00OOOO0 o00oooo1, oOO00O ooo00o, Integer num) {
        oOO00O ooo00o2 = ooo00o;
        o0000O00.OooO00o(num, o00oooo1, "$this$composed", ooo00o2, -1027014173);
        int i = this.f3360Oooo0o;
        if (!(i > 0)) {
            throw new IllegalArgumentException("maxLines must be greater than 0".toString());
        }
        if (i == Integer.MAX_VALUE) {
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            ooo00o2.Oooo0o0();
            return oooO00o;
        }
        OooO oooO = (OooO) ooo00o2.OooOO0o(o000.f6356OooO0o0);
        o000OOo.OooO0O0 oooO0O0 = (o000OOo.OooO0O0) ooo00o2.OooOO0o(o000.f6358OooO0oo);
        LayoutDirection layoutDirection = (LayoutDirection) ooo00o2.OooOO0o(o000.f6360OooOO0O);
        oo0o0Oo oo0o0oo = this.f3361Oooo0oO;
        ooo00o2.OooO0o0(511388516);
        boolean zOooo0oo = ooo00o2.Oooo0oo(oo0o0oo) | ooo00o2.Oooo0oo(layoutDirection);
        Object objOooO0o = ooo00o2.OooO0o();
        if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0o = o0O0O00.OooO00o(oo0o0oo, layoutDirection);
            ooo00o2.Oooo00o(objOooO0o);
        }
        ooo00o2.Oooo0o0();
        oo0o0Oo oo0o0oo2 = (oo0o0Oo) objOooO0o;
        ooo00o2.OooO0o0(511388516);
        boolean zOooo0oo2 = ooo00o2.Oooo0oo(oooO0O0) | ooo00o2.Oooo0oo(oo0o0oo2);
        Object objOooO0o2 = ooo00o2.OooO0o();
        if (zOooo0oo2 || objOooO0o2 == oOO00O.OooO00o.f29689OooO0O0) {
            o00Oo0 o00oo1 = oo0o0oo2.f26901OooO00o;
            o000OOo o000ooo2 = o00oo1.f26863OooO0o;
            p053o00000oO.o0000O00 o0000o00 = o00oo1.f26861OooO0OO;
            if (o0000o00 == null) {
                o00000oO.o0000O00.OooO00o oooO00o2 = p053o00000oO.o0000O00.f27125Oooo0oO;
                o0000o00 = p053o00000oO.o0000O00.f27128OoooO0;
            }
            o0000Ooo o0000ooo = o00oo1.f26862OooO0Oo;
            int i2 = o0000ooo != null ? o0000ooo.f27135OooO00o : 0;
            o0000 o0000Var = o00oo1.f26864OooO0o0;
            objOooO0o2 = oooO0O0.OooO00o(o000ooo2, o0000o00, i2, o0000Var != null ? o0000Var.f27110OooO00o : 1);
            ooo00o2.Oooo00o(objOooO0o2);
        }
        ooo00o2.Oooo0o0();
        oO0Oo oo0oo = (oO0Oo) objOooO0o2;
        Object[] objArr = {oooO, oooO0O0, this.f3361Oooo0oO, layoutDirection, oo0oo.getValue()};
        ooo00o2.OooO0o0(-568225417);
        boolean zOooo0oo3 = false;
        for (int i3 = 0; i3 < 5; i3++) {
            zOooo0oo3 |= ooo00o2.Oooo0oo(objArr[i3]);
        }
        Object objOooO0o3 = ooo00o2.OooO0o();
        if (zOooo0oo3 || objOooO0o3 == oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0o3 = Integer.valueOf(o000oOoO.OooO0O0(o00O0OO0.OooO00o(oo0o0oo2, oooO, oooO0O0, o00O0OO0.f3175OooO00o, 1)));
            ooo00o2.Oooo00o(objOooO0o3);
        }
        ooo00o2.Oooo0o0();
        int iIntValue = ((Number) objOooO0o3).intValue();
        Object[] objArr2 = {oooO, oooO0O0, this.f3361Oooo0oO, layoutDirection, oo0oo.getValue()};
        ooo00o2.OooO0o0(-568225417);
        boolean zOooo0oo4 = false;
        for (int i4 = 0; i4 < 5; i4++) {
            zOooo0oo4 |= ooo00o2.Oooo0oo(objArr2[i4]);
        }
        Object objOooO0o4 = ooo00o2.OooO0o();
        if (zOooo0oo4 || objOooO0o4 == oOO00O.OooO00o.f29689OooO0O0) {
            StringBuilder sb = new StringBuilder();
            String str = o00O0OO0.f3175OooO00o;
            sb.append(str);
            sb.append('\n');
            sb.append(str);
            objOooO0o4 = Integer.valueOf(o000oOoO.OooO0O0(o00O0OO0.OooO00o(oo0o0oo2, oooO, oooO0O0, sb.toString(), 2)));
            ooo00o2.Oooo00o(objOooO0o4);
        }
        ooo00o2.Oooo0o0();
        o00OOOO0 o00oooo0OooO0oo = SizeKt.OooO0oo(o00OOOO0.OooO00o.f4198Oooo0o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, oooO.OooO0o0(((this.f3360Oooo0o - 1) * (((Number) objOooO0o4).intValue() - iIntValue)) + iIntValue), 1);
        ooo00o2.Oooo0o0();
        return o00oooo0OooO0oo;
    }
}
