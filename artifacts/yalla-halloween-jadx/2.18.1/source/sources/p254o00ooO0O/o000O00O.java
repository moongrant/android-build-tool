package p254o00ooO0O;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00O0O.OooO0O0;
import o00O0O.OooOO0;
import o00O0O.OooOo;
import o00O0O.OooOo00;
import p191o00o0O.o000000;
import p191o00o0O.o00oO0o;
import p191o00o0O.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class o000O00O extends Lambda implements Function1<o00oO0o, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ float f34301Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f34302Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ float f34303Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ float f34304Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ boolean f34305OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ boolean f34306OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ float f34307OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ boolean f34308OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final /* synthetic */ boolean f34309OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final /* synthetic */ long f34310OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final /* synthetic */ long f34311o000oOoO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00O(boolean z, float f, float f2, float f3, float f4, boolean z2, boolean z3, boolean z4, boolean z5, long j, long j2) {
        super(1);
        this.f34302Oooo0o = z;
        this.f34303Oooo0oO = f;
        this.f34304Oooo0oo = f2;
        this.f34301Oooo = f3;
        this.f34307OoooO00 = f4;
        this.f34306OoooO0 = z2;
        this.f34308OoooO0O = z3;
        this.f34305OoooO = z4;
        this.f34309OoooOO0 = z5;
        this.f34311o000oOoO = j;
        this.f34310OoooOOO = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00oO0o o00oo0o2) {
        o00oO0o drawWithContent = o00oo0o2;
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.o0ooOOo();
        if (this.f34302Oooo0o) {
            float fOoooOoo = drawWithContent.OoooOoo(this.f34303Oooo0oO);
            float fOoooOoo2 = drawWithContent.OoooOoo(this.f34304Oooo0oo);
            float fOoooOoo3 = drawWithContent.OoooOoo(this.f34301Oooo);
            float fOoooOoo4 = drawWithContent.OoooOoo(this.f34307OoooO00);
            float fOooO0Oo = fOoooOoo3 + ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            float fOooO0O0 = fOoooOoo4 + ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            float f = 2;
            float f2 = fOoooOoo2 * f;
            if (this.f34306OoooO0 && this.f34308OoooO0O) {
                fOooO0Oo += (OooOo00.OooO0Oo(drawWithContent.OooO0OO()) - f2) - (fOoooOoo3 * f);
                if (this.f34305OoooO) {
                    fOooO0Oo -= OooOo00.OooO0Oo(drawWithContent.OooO0OO()) - f2;
                }
            } else if (this.f34305OoooO) {
                fOooO0Oo += OooOo00.OooO0Oo(drawWithContent.OooO0OO()) - f2;
            }
            float f3 = fOooO0Oo;
            if (this.f34309OoooOO0) {
                fOooO0O0 += OooOo00.OooO0O0(drawWithContent.OooO0OO()) - f2;
            }
            float f4 = fOooO0O0;
            float f5 = 1000;
            o0OOO0o.OooOO0o(drawWithContent, this.f34311o000oOoO, OooOO0.OooO00o(f3, f4), OooOo.OooO00o(f2, f2), OooO0O0.OooO00o(drawWithContent.OoooOoo(f5), drawWithContent.OoooOoo(f5)), null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, 0, 240, null);
            if (fOoooOoo > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                o0OOO0o.OooOO0o(drawWithContent, this.f34310OoooOOO, OooOO0.OooO00o(f3, f4), OooOo.OooO00o(f2, f2), OooO0O0.OooO00o(drawWithContent.OoooOoo(f5), drawWithContent.OoooOoo(f5)), new o000000(fOoooOoo, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0, 0, null, 30), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, 0, 224, null);
            }
        }
        return Unit.INSTANCE;
    }
}
