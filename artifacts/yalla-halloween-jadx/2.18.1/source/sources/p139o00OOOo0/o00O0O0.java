package p139o00OOOo0;

import androidx.compose.foundation.layout.PaddingKt;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.model.GifListJson;
import com.yalla.yalla.model.ThemeConfig;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import o00000O.OooO00o;
import o00000O.o00Oo0;
import o0000O0.OooO;
import p031OoooO.o000O0O0;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p145o00Oo0.o00000O0;
import p507o0o00oOO.o0000O0;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ GifListJson f31833Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O0(GifListJson gifListJson) {
        super(2);
        this.f31833Oooo0o = gifListJson;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        oOO00O ooo00o2 = ooo00o;
        if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            int price = this.f31833Oooo0o.getPrice();
            int promotionPrice = this.f31833Oooo0o.getPromotionPrice();
            boolean z = price == promotionPrice;
            String beforeTips2 = null;
            ThemeConfig themeConfig = this.f31833Oooo0o.getThemeConfig();
            if (z) {
                if (themeConfig != null) {
                    beforeTips2 = themeConfig.getBeforeTips1();
                }
            } else if (themeConfig != null) {
                beforeTips2 = themeConfig.getBeforeTips2();
            }
            if (beforeTips2 != null) {
                String strOooO00o = z ? OooOo.OooO00o(beforeTips2, "XXX", String.valueOf(price)) : OooOo.OooO00o(OooOo.OooO00o(beforeTips2, "XXX1", String.valueOf(price)), "XXX2", String.valueOf(promotionPrice));
                OooO00o.C0282OooO00o c0282OooO00o = new OooO00o.C0282OooO00o();
                c0282OooO00o.OooO0O0(strOooO00o);
                if (z) {
                    int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) beforeTips2, "XXX", 0, false, 6, (Object) null);
                    o0000O0 o0000o1 = o0000O0.f41691OooO00o;
                    c0282OooO00o.OooO00o(new o00Oo0(o0000O0.f41788o000O0O, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16382), iIndexOf$default, String.valueOf(price).length() + iIndexOf$default);
                } else if (StringsKt__StringsKt.indexOf$default((CharSequence) beforeTips2, "XXX1", 0, false, 6, (Object) null) < StringsKt__StringsKt.indexOf$default((CharSequence) beforeTips2, "XXX2", 0, false, 6, (Object) null)) {
                    int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) beforeTips2, "XXX1", 0, false, 6, (Object) null);
                    int length = String.valueOf(price).length();
                    o0000O0 o0000o2 = o0000O0.f41691OooO00o;
                    long j = o0000O0.f41788o000O0O;
                    int i = length + iIndexOf$default2;
                    c0282OooO00o.OooO00o(new o00Oo0(o00000O0.OooO0OO(j, 0.6f), 0L, null, null, null, null, null, 0L, null, null, null, 0L, OooO.f27248OooO0o0, null, 12286), iIndexOf$default2, i);
                    int i2 = i + 1;
                    c0282OooO00o.OooO00o(new o00Oo0(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16382), i2, String.valueOf(promotionPrice).length() + i2);
                } else {
                    int iIndexOf$default3 = StringsKt__StringsKt.indexOf$default((CharSequence) beforeTips2, "XXX2", 0, false, 6, (Object) null);
                    int length2 = String.valueOf(price).length();
                    o0000O0 o0000o3 = o0000O0.f41691OooO00o;
                    long j2 = o0000O0.f41788o000O0O;
                    int i3 = length2 + iIndexOf$default3;
                    c0282OooO00o.OooO00o(new o00Oo0(j2, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16382), iIndexOf$default3, i3);
                    int i4 = i3 + 1;
                    c0282OooO00o.OooO00o(new o00Oo0(o00000O0.OooO0OO(j2, 0.6f), 0L, null, null, null, null, null, 0L, null, null, null, 0L, OooO.f27248OooO0o0, null, 12286), i4, String.valueOf(price).length() + i4);
                }
                OooO00o oooO00oOooO0oo = c0282OooO00o.OooO0oo();
                o00OOOO0 o00oooo0OooO0oO = PaddingKt.OooO0oO(o00OOOO0.OooO00o.f4198Oooo0o, 25, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
                long jOooO0OO = o0000O0O.o00Oo0.OooO0OO(15);
                o0000O0 o0000o4 = o0000O0.f41691OooO00o;
                o000O0O0.OooO0O0(oooO00oOooO0oo, o00oooo0OooO0oO, o0000O0.f41793o000Ooo, jOooO0OO, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, null, ooo00o2, 3504, 0, 131056);
            }
        }
        return Unit.INSTANCE;
    }
}
