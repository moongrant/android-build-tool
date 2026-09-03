package com.yy.yyeva.mix;

import android.graphics.Bitmap;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yy.yyeva.util.EvaJniUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO0O0 extends Lambda implements Function2<Bitmap, EvaSrc.FitType, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EvaSrc f32967OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ com.yy.yyeva.mix.OooO00o f32968OooO0o0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EvaSrc.FitType.values().length];
            try {
                iArr[EvaSrc.FitType.CENTER_FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EvaSrc.FitType.CENTER_FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(EvaSrc evaSrc, com.yy.yyeva.mix.OooO00o oooO00o) {
        super(2);
        this.f32967OooO0Oo = evaSrc;
        this.f32968OooO0o0 = oooO00o;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Bitmap bitmap, EvaSrc.FitType fitType) {
        Bitmap bitmapCopy;
        String str;
        Bitmap bitmap2 = bitmap;
        EvaSrc.FitType fitType2 = fitType;
        EvaSrc evaSrc = this.f32967OooO0Oo;
        if (bitmap2 == null) {
            String msg = "fetch image " + this.f32967OooO0Oo.f32947OooO00o + " bitmap return null";
            Intrinsics.checkNotNullParameter("EvaAnimPlayer.MixAnimPlugin", ViewHierarchyConstants.TAG_KEY);
            Intrinsics.checkNotNullParameter(msg, "msg");
            bitmapCopy = Bitmap.createBitmap(16, 16, Bitmap.Config.ARGB_8888);
            bitmapCopy.eraseColor(0);
            Intrinsics.checkNotNullExpressionValue(bitmapCopy, "createBitmap(16, 16, Bit…or.TRANSPARENT)\n        }");
        } else {
            bitmapCopy = bitmap2.copy(Bitmap.Config.ARGB_8888, true);
        }
        evaSrc.f32954OooO0oo = bitmapCopy;
        int i = fitType2 == null ? -1 : OooO00o.$EnumSwitchMapping$0[fitType2.ordinal()];
        if (i == -1) {
            str = this.f32967OooO0Oo.f32953OooO0oO;
        } else if (i != 1) {
            str = i != 2 ? "scaleFill" : "aspectFit";
        } else {
            str = "aspectFill";
        }
        EvaJniUtil evaJniUtil = EvaJniUtil.f32972OooO00o;
        int i2 = this.f32968OooO0o0.f32959OooO00o.f56944OooO0O0;
        EvaSrc evaSrc2 = this.f32967OooO0Oo;
        evaJniUtil.setSrcBitmap(i2, evaSrc2.f32947OooO00o, evaSrc2.f32954OooO0oo, str);
        StringBuilder sb = new StringBuilder("fetch image ");
        sb.append(this.f32967OooO0Oo.f32947OooO00o);
        sb.append(" finish bitmap is ");
        Bitmap bitmap3 = this.f32967OooO0Oo.f32954OooO0oo;
        sb.append(bitmap3 != null ? Integer.valueOf(bitmap3.hashCode()) : null);
        String msg2 = sb.toString();
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.MixAnimPlugin", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg2, "msg");
        Bitmap bitmap4 = this.f32967OooO0Oo.f32954OooO0oo;
        if (bitmap4 != null) {
            bitmap4.recycle();
        }
        com.yy.yyeva.mix.OooO00o oooO00o = this.f32968OooO0o0;
        synchronized (oooO00o.f32963OooO0o) {
            oooO00o.f32962OooO0Oo++;
            oooO00o.f32963OooO0o.notifyAll();
        }
        return Unit.INSTANCE;
    }
}
