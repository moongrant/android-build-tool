package p038OoooOoO;

import android.hardware.camera2.CaptureResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CameraCaptureMetaData$AeState;
import androidx.camera.core.impl.CameraCaptureMetaData$AfState;
import androidx.camera.core.impl.CameraCaptureMetaData$AwbState;
import androidx.camera.core.impl.CameraCaptureMetaData$FlashState;
import androidx.camera.core.impl.o00O0O;
import androidx.camera.core.impl.o00OOO0;
import androidx.camera.core.impl.o00Oo0;
import androidx.camera.core.impl.utils.ExifData;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 21)
public final class o000Oo0 implements o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final o00Oo0 f1608OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final o00OOO0 f1609OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f1610OooO0OO;

    public o000Oo0(@Nullable o00Oo0 o00oo1, @NonNull o00OOO0 o00ooo1, long j) {
        this.f1608OooO00o = o00oo1;
        this.f1609OooO0O0 = o00ooo1;
        this.f1610OooO0OO = j;
    }

    @Override // androidx.camera.core.impl.o00Oo0
    public final /* synthetic */ void OooO00o(ExifData.OooO0O0 oooO0O0) {
        o00O0O.OooO0O0(this, oooO0O0);
    }

    @Override // androidx.camera.core.impl.o00Oo0
    @NonNull
    public final o00OOO0 OooO0O0() {
        return this.f1609OooO0O0;
    }

    @Override // androidx.camera.core.impl.o00Oo0
    public final long OooO0OO() {
        o00Oo0 o00oo1 = this.f1608OooO00o;
        if (o00oo1 != null) {
            return o00oo1.OooO0OO();
        }
        long j = this.f1610OooO0OO;
        if (j != -1) {
            return j;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    @Override // androidx.camera.core.impl.o00Oo0
    @NonNull
    public final CameraCaptureMetaData$FlashState OooO0Oo() {
        o00Oo0 o00oo1 = this.f1608OooO00o;
        return o00oo1 != null ? o00oo1.OooO0Oo() : CameraCaptureMetaData$FlashState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.o00Oo0
    @NonNull
    public final CameraCaptureMetaData$AfState OooO0o() {
        o00Oo0 o00oo1 = this.f1608OooO00o;
        return o00oo1 != null ? o00oo1.OooO0o() : CameraCaptureMetaData$AfState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.o00Oo0
    public final CaptureResult OooO0o0() {
        return o00O0O.OooO00o();
    }

    @Override // androidx.camera.core.impl.o00Oo0
    @NonNull
    public final CameraCaptureMetaData$AwbState OooO0oO() {
        o00Oo0 o00oo1 = this.f1608OooO00o;
        return o00oo1 != null ? o00oo1.OooO0oO() : CameraCaptureMetaData$AwbState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.o00Oo0
    @NonNull
    public final CameraCaptureMetaData$AeState OooO0oo() {
        o00Oo0 o00oo1 = this.f1608OooO00o;
        return o00oo1 != null ? o00oo1.OooO0oo() : CameraCaptureMetaData$AeState.UNKNOWN;
    }
}
