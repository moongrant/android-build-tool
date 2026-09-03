package p254o00ooO0O;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00O0O.OooO0O0;
import o00O0O.OooOO0;
import o00O0O.OooOo;
import o00O0O.OooOo00;
import p145o00Oo0.OooOOOO;
import p145o00Oo0.o00000OO;
import p145o00Oo0.o0O0O00;
import p191o00o0O.o000000;
import p191o00o0O.o00oO0o;
import p191o00o0O.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0Oo extends Lambda implements Function1<o00oO0o, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Integer f34312Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ float f34313Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ float f34314Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ float f34315Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ boolean f34316OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ float f34317OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ long f34318OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ boolean f34319OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final /* synthetic */ boolean f34320OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final /* synthetic */ boolean f34321OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final /* synthetic */ long f34322OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final /* synthetic */ long f34323OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final /* synthetic */ long f34324OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final /* synthetic */ float f34325OoooOoo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final /* synthetic */ boolean f34326o000oOoO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0Oo(float f, float f2, float f3, Integer num, long j, float f4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j2, long j3, long j4, float f5) {
        super(1);
        this.f34313Oooo0o = f;
        this.f34314Oooo0oO = f2;
        this.f34315Oooo0oo = f3;
        this.f34312Oooo = num;
        this.f34318OoooO00 = j;
        this.f34317OoooO0 = f4;
        this.f34319OoooO0O = z;
        this.f34316OoooO = z2;
        this.f34320OoooOO0 = z3;
        this.f34326o000oOoO = z4;
        this.f34321OoooOOO = z5;
        this.f34322OoooOOo = j2;
        this.f34323OoooOo0 = j3;
        this.f34324OoooOoO = j4;
        this.f34325OoooOoo = f5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00oO0o o00oo0o2) {
        float f;
        float f2;
        float f3;
        o00oO0o drawWithContent = o00oo0o2;
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.o0ooOOo();
        float fOoooOoo = drawWithContent.OoooOoo(this.f34313Oooo0o);
        float fOoooOoo2 = drawWithContent.OoooOoo(this.f34314Oooo0oO);
        float fOoooOoo3 = drawWithContent.OoooOoo(this.f34315Oooo0oo);
        float fOooO0Oo = fOoooOoo2 + ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        float f4 = fOoooOoo3 + ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        Integer num = this.f34312Oooo;
        if ((num != null ? num.intValue() : 0) > 0) {
            Integer num2 = this.f34312Oooo;
            Intrinsics.checkNotNull(num2);
            String string = num2.intValue() > 99 ? "..." : this.f34312Oooo.toString();
            long j = this.f34318OoooO00;
            float f5 = this.f34317OoooO0;
            boolean z = this.f34319OoooO0O;
            Integer num3 = this.f34312Oooo;
            boolean z2 = this.f34316OoooO;
            boolean z3 = this.f34320OoooOO0;
            boolean z4 = this.f34326o000oOoO;
            boolean z5 = this.f34321OoooOOO;
            long j2 = this.f34322OoooOOo;
            long j3 = this.f34323OoooOo0;
            long j4 = this.f34324OoooOoO;
            float f6 = this.f34325OoooOoo;
            o0O0O00 o0o0o00OooO0o = drawWithContent.Ooooo0o().OooO0o();
            float fOo000o = drawWithContent.oo000o(j);
            float f7 = 2;
            float fOoooOoo4 = drawWithContent.OoooOoo(f5) * f7;
            float f8 = (z || num3.toString().length() != 2) ? fOoooOoo4 : 1.34375f * fOoooOoo4;
            Paint paint = new Paint(7);
            paint.setAntiAlias(true);
            paint.setDither(true);
            paint.setColor(o00000OO.OooO0oO(j4));
            paint.setTextSize(num3.intValue() > 99 ? f6 * fOo000o : fOo000o);
            paint.setTypeface(Typeface.create(Typeface.SANS_SERIF, 0));
            paint.setTextAlign(Paint.Align.CENTER);
            float fMeasureText = paint.measureText(string);
            if (z2 && z3) {
                fOooO0Oo += (OooOo00.OooO0Oo(drawWithContent.OooO0OO()) - f8) - (fOoooOoo2 * f7);
                if (z4) {
                    fOooO0Oo -= OooOo00.OooO0Oo(drawWithContent.OooO0OO()) - f8;
                }
            } else if (z4) {
                fOooO0Oo += OooOo00.OooO0Oo(drawWithContent.OooO0OO()) - f8;
            }
            float f9 = fOooO0Oo;
            float fOooO0O0 = z5 ? (OooOo00.OooO0O0(drawWithContent.OooO0OO()) - fOoooOoo4) + f4 : f4;
            float f10 = 1000;
            float f11 = f8;
            float f12 = fOooO0O0;
            o0OOO0o.OooOO0o(drawWithContent, j2, OooOO0.OooO00o(f9, fOooO0O0), OooOo.OooO00o(f8, fOoooOoo4), OooO0O0.OooO00o(drawWithContent.OoooOoo(f10), drawWithContent.OoooOoo(f10)), null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, 0, 240, null);
            if (fOoooOoo > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                long jOooO00o = OooOo.OooO00o(f11, fOoooOoo4);
                long jOooO00o2 = OooOO0.OooO00o(f9, f12);
                long jOooO00o3 = OooO0O0.OooO00o(drawWithContent.OoooOoo(f10), drawWithContent.OoooOoo(f10));
                o000000 o000000Var = new o000000(fOoooOoo, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0, 0, null, 30);
                f3 = f12;
                f2 = f11;
                f = fOoooOoo4;
                o0OOO0o.OooOO0o(drawWithContent, j3, jOooO00o2, jOooO00o, jOooO00o3, o000000Var, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, 0, 224, null);
            } else {
                f = fOoooOoo4;
                f2 = f11;
                f3 = f12;
            }
            OooOOOO.OooO00o(o0o0o00OooO0o).drawText(string, ((f2 - fMeasureText) / 2.0f) + (fMeasureText / 2.0f) + f9, (f / 2.0f) + f3 + ((fOo000o / 100.0f) * (num3.intValue() > 99 ? 6 : 34)), paint);
        }
        return Unit.INSTANCE;
    }
}
