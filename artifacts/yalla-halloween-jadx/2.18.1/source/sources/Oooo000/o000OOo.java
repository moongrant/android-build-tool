package Oooo000;

import androidx.compose.animation.ExperimentalAnimationApi;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@ExperimentalAnimationApi
public final class o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0000OO0 f882OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o000O000 f883OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f884OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public o00O0000 f885OooO0Oo;

    public o000OOo(o0000OO0 targetContentEnter, o000O000 initialContentExit) {
        OooOo sizeAnimationSpec = OooOo.f811Oooo0o;
        Intrinsics.checkNotNullParameter(sizeAnimationSpec, "sizeAnimationSpec");
        o0O0ooO o0o0ooo = new o0O0ooO(true, sizeAnimationSpec);
        Intrinsics.checkNotNullParameter(targetContentEnter, "targetContentEnter");
        Intrinsics.checkNotNullParameter(initialContentExit, "initialContentExit");
        this.f882OooO00o = targetContentEnter;
        this.f883OooO0O0 = initialContentExit;
        this.f884OooO0OO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
        this.f885OooO0Oo = o0o0ooo;
    }
}
