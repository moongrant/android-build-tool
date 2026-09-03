package p022Oooo00O;

import android.hardware.camera2.CameraCharacteristics;
import android.media.ImageWriter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.OooOOO;
import androidx.camera.core.OooOo00;
import androidx.camera.core.impl.o000O;
import p023Oooo00o.oO00O0o0;
import p024Oooo0O0.o0000O;
import p024Oooo0O0.o00O00OO;
import p036OoooOOo.o0000O0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
public final class o0OOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o000O f820OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final oO00O0o0 f821OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    @VisibleForTesting
    public final o0000O0 f822OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f823OooO0OO = false;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f824OooO0Oo = false;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f825OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f826OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public OooOo00 f827OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooOOO.OooO00o f828OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public ImageWriter f829OooOO0;

    public o0OOO0(@NonNull oO00O0o0 oo00o0o0) {
        boolean z;
        this.f826OooO0o0 = false;
        this.f825OooO0o = false;
        this.f821OooO00o = oo00o0o0;
        int[] iArr = (int[]) oo00o0o0.OooO00o(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr == null) {
            z = false;
            break;
        }
        int length = iArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else {
                if (iArr[i] == 4) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.f826OooO0o0 = z;
        this.f825OooO0o = o0000O.OooO00o(o00O00OO.class) != null;
        this.f822OooO0O0 = new o0000O0(new o0OO0oO0());
    }
}
