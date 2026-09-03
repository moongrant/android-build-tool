package p573o0oOoO;

import Oooo0.o00O0O0O;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Stable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import org.jetbrains.annotations.NotNull;
import p023Oooo00O.Oooo0;
import p023Oooo00O.o000oOoO;
import p023Oooo00O.o0Oo0oo;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes3.dex */
@Stable
public final class o000OO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f45668OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f45669OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Oooo0<Float, o0Oo0oo> f45666OooO00o = o000oOoO.OooO0o0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00O0O0O f45667OooO0O0 = new o00O0O0O();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f45670OooO0o0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Boolean.FALSE);

    public o000OO(float f, float f2) {
        this.f45668OooO0OO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Float.valueOf(f2));
        this.f45669OooO0Oo = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Float.valueOf(f));
    }

    public final float OooO00o() {
        return this.f45666OooO00o.OooO0o().floatValue();
    }
}
