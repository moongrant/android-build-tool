package p613o0oo0o00;

import android.graphics.Bitmap;
import androidx.compose.compiler.plugins.kotlin.OooO0OO;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yy.yyeva.mix.EvaSrc;
import com.yy.yyeva.mix.OooO00o;
import com.yy.yyeva.util.EvaJniUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p614o0oo0o0O.o000OO0O;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOOO0 extends Lambda implements Function2<String, String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EvaSrc f57016OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooO00o f57017OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(EvaSrc evaSrc, OooO00o oooO00o) {
        super(2);
        this.f57016OooO0Oo = evaSrc;
        this.f57017OooO0o0 = oooO00o;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        EvaSrc evaSrc = this.f57016OooO0Oo;
        String str5 = str3 == null ? "" : str3;
        evaSrc.getClass();
        Intrinsics.checkNotNullParameter(str5, "<set-?>");
        evaSrc.f32946OooO = str5;
        EvaSrc evaSrc2 = this.f57016OooO0Oo;
        if (str4 == null) {
            str4 = "center";
        }
        evaSrc2.getClass();
        Intrinsics.checkNotNullParameter(str4, "<set-?>");
        evaSrc2.f32958OooOOO0 = str4;
        EvaSrc src = this.f57016OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(src, "src");
        Bitmap bitmapOooO00o = o000OO0O.OooO00o(src);
        EvaJniUtil evaJniUtil = EvaJniUtil.f32972OooO00o;
        int i = this.f57017OooO0o0.f32959OooO00o.f56944OooO0O0;
        EvaSrc evaSrc3 = this.f57016OooO0Oo;
        evaJniUtil.setSrcBitmap(i, evaSrc3.f32947OooO00o, bitmapOooO00o, evaSrc3.f32953OooO0oO);
        String msg = OooO0OO.OooO0OO(new StringBuilder("fetch text "), this.f57016OooO0Oo.f32947OooO00o, " finish txt is ", str3);
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.MixAnimPlugin", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        bitmapOooO00o.recycle();
        OooO00o oooO00o = this.f57017OooO0o0;
        synchronized (oooO00o.f32963OooO0o) {
            oooO00o.f32962OooO0Oo++;
            oooO00o.f32963OooO0o.notifyAll();
        }
        return Unit.INSTANCE;
    }
}
