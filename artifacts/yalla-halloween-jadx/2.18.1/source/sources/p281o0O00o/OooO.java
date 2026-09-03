package p281o0O00o;

import OooO00o.OooO00o;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO implements OooOo00.OooO0O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final OooOO0 f35152OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooOO0 f35153OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f35154OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f35155OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float f35156OooO0oO;

    public OooO() {
        OooOO0.OooO00o oooO00o = OooOO0.f35177OooO00o;
        Objects.requireNonNull(oooO00o);
        OooO0OO animatedInsets = OooOO0.OooO00o.f35179OooO0O0;
        Objects.requireNonNull(oooO00o);
        Intrinsics.checkNotNullParameter(animatedInsets, "layoutInsets");
        Intrinsics.checkNotNullParameter(animatedInsets, "animatedInsets");
        this.f35152OooO0OO = animatedInsets;
        this.f35153OooO0Oo = animatedInsets;
        this.f35155OooO0o0 = false;
        this.f35154OooO0o = false;
        this.f35156OooO0oO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    @Override // o0O00o.OooOo00.OooO0O0
    @NotNull
    public final OooOO0 OooO00o() {
        return this.f35153OooO0Oo;
    }

    @Override // o0O00o.OooOo00.OooO0O0
    @NotNull
    public final OooOO0 OooO0O0() {
        return this.f35152OooO0OO;
    }

    @Override // o0O00o.OooOo00.OooO0O0
    public final float OooO0OO() {
        return this.f35156OooO0oO;
    }

    @Override // o0O00o.OooOo00.OooO0O0
    public final boolean OooO0Oo() {
        return this.f35154OooO0o;
    }

    @Override // p281o0O00o.OooOO0
    public final /* synthetic */ int OooO0o0() {
        return OooO00o.OooO00o(this);
    }

    @Override // p281o0O00o.OooOO0
    public final /* synthetic */ int OooO0oO() {
        return OooO00o.OooO0O0(this);
    }

    @Override // p281o0O00o.OooOO0
    public final /* synthetic */ int OooOO0O() {
        return OooO00o.OooO0Oo(this);
    }

    @Override // p281o0O00o.OooOO0
    public final /* synthetic */ int OooOOO() {
        return OooO00o.OooO0OO(this);
    }

    @Override // o0O00o.OooOo00.OooO0O0
    public final boolean isVisible() {
        return this.f35155OooO0o0;
    }
}
