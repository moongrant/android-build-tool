package Oooo0;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO extends Lambda implements Function1<p191o00o0O.o00oO0o, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ p145o00Oo0.o00000O f504Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00O0O.OooOO0O f505Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<p145o00Oo0.o0000oo> f506Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ long f507Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(o00O0O.OooOO0O oooOO0O, Ref.ObjectRef<p145o00Oo0.o0000oo> objectRef, long j, p145o00Oo0.o00000O o00000o) {
        super(1);
        this.f505Oooo0o = oooOO0O;
        this.f506Oooo0oO = objectRef;
        this.f507Oooo0oo = j;
        this.f504Oooo = o00000o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(p191o00o0O.o00oO0o o00oo0o2) {
        p191o00o0O.o00oO0o onDrawWithContent = o00oo0o2;
        Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.o0ooOOo();
        o00O0O.OooOO0O oooOO0O = this.f505Oooo0o;
        float f = oooOO0O.f30404OooO00o;
        float f2 = oooOO0O.f30405OooO0O0;
        Ref.ObjectRef<p145o00Oo0.o0000oo> objectRef = this.f506Oooo0oO;
        long j = this.f507Oooo0oo;
        p145o00Oo0.o00000O o00000o = this.f504Oooo;
        onDrawWithContent.Ooooo0o().OooO0Oo().OooO0O0(f, f2);
        p191o00o0O.o0OOO0o.OooO0Oo(onDrawWithContent, objectRef.element, 0L, j, 0L, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, o00000o, 0, 0, 890, null);
        onDrawWithContent.Ooooo0o().OooO0Oo().OooO0O0(-f, -f2);
        return Unit.INSTANCE;
    }
}
