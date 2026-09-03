package p029Oooo0oO;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p027Oooo0o.OooOOO0;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes.dex */
public final class o00OOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f2358OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f2359OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f2360OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Object f2361OooO0Oo;

    public o00OOO0O(int i, int i2) {
        this.f2358OooO00o = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(new o000O0O0(i));
        this.f2359OooO0O0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Integer.valueOf(i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int OooO00o() {
        return ((o000O0O0) this.f2358OooO00o.getValue()).f2257OooO00o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int OooO0O0() {
        return ((Number) this.f2359OooO0O0.getValue()).intValue();
    }

    public final void OooO0OO(int i, int i2) {
        if (!(((float) i) >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
            throw new IllegalArgumentException(OooOOO0.OooO00o("Index should be non-negative (", i, ')').toString());
        }
        if (!(i == OooO00o())) {
            this.f2358OooO00o.setValue(new o000O0O0(i));
        }
        if (i2 != OooO0O0()) {
            this.f2359OooO0O0.setValue(Integer.valueOf(i2));
        }
    }
}
