package p035OoooOO0;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.Oooo0;
import p023Oooo00O.o000oOoO;
import p023Oooo00O.o0Oo0oo;
import p100o000oOoO.oO0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f3606OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final oO0Oo<o000000> f3607OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Oooo0<Float, o0Oo0oo> f3608OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final List<p026Oooo0OO.o0000O> f3609OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public p026Oooo0OO.o0000O f3610OooO0o0;

    public o0000O(boolean z, @NotNull oO0Oo<o000000> rippleAlpha) {
        Intrinsics.checkNotNullParameter(rippleAlpha, "rippleAlpha");
        this.f3606OooO00o = z;
        this.f3607OooO0O0 = rippleAlpha;
        this.f3608OooO0OO = o000oOoO.OooO0o0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f3609OooO0Oo = new ArrayList();
    }
}
