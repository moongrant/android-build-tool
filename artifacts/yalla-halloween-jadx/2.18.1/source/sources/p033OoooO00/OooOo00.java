package p033OoooO00;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.LayoutDirection;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.Intrinsics;
import o0000O0O.OooO;
import org.jetbrains.annotations.NotNull;
import p145o00Oo0.o0000OO0;
import p145o00Oo0.o000OOo0;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public abstract class OooOo00 implements o000OOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooOo f3425OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooOo f3426OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final OooOo f3427OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooOo f3428OooO0Oo;

    public OooOo00(@NotNull OooOo topStart, @NotNull OooOo topEnd, @NotNull OooOo bottomEnd, @NotNull OooOo bottomStart) {
        Intrinsics.checkNotNullParameter(topStart, "topStart");
        Intrinsics.checkNotNullParameter(topEnd, "topEnd");
        Intrinsics.checkNotNullParameter(bottomEnd, "bottomEnd");
        Intrinsics.checkNotNullParameter(bottomStart, "bottomStart");
        this.f3425OooO00o = topStart;
        this.f3426OooO0O0 = topEnd;
        this.f3427OooO0OO = bottomEnd;
        this.f3428OooO0Oo = bottomStart;
    }

    @Override // p145o00Oo0.o000OOo0
    @NotNull
    public final o0000OO0 OooO00o(long j, @NotNull LayoutDirection layoutDirection, @NotNull OooO density) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        float fOooO00o = this.f3425OooO00o.OooO00o(j, density);
        float fOooO00o2 = this.f3426OooO0O0.OooO00o(j, density);
        float fOooO00o3 = this.f3427OooO0OO.OooO00o(j, density);
        float fOooO00o4 = this.f3428OooO0Oo.OooO00o(j, density);
        float fOooO0OO = o00O0O.OooOo00.OooO0OO(j);
        float f = fOooO00o + fOooO00o4;
        if (f > fOooO0OO) {
            float f2 = fOooO0OO / f;
            fOooO00o *= f2;
            fOooO00o4 *= f2;
        }
        float f3 = fOooO00o4;
        float f4 = fOooO00o2 + fOooO00o3;
        if (f4 > fOooO0OO) {
            float f5 = fOooO0OO / f4;
            fOooO00o2 *= f5;
            fOooO00o3 *= f5;
        }
        if (fOooO00o >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && fOooO00o2 >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && fOooO00o3 >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && f3 >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            return OooO0O0(j, fOooO00o, fOooO00o2, fOooO00o3, f3, layoutDirection);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + fOooO00o + ", topEnd = " + fOooO00o2 + ", bottomEnd = " + fOooO00o3 + ", bottomStart = " + f3 + ")!").toString());
    }

    @NotNull
    public abstract o0000OO0 OooO0O0(long j, float f, float f2, float f3, float f4, @NotNull LayoutDirection layoutDirection);
}
