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
import p023Oooo00o.oO000o00;
import p024Oooo0O0.o000OO;
import p024Oooo0O0.oOO00O;
import p036OoooOOo.o0000O0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
public final class o0OOOO00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o000O f833OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final oO000o00 f834OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    @VisibleForTesting
    public final o0000O0 f835OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f836OooO0OO = false;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f837OooO0Oo = false;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f838OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f839OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public OooOo00 f840OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooOOO.OooO00o f841OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public ImageWriter f842OooOO0;

    public o0OOOO00(@NonNull oO000o00 oo000o00) {
        boolean z;
        this.f839OooO0o0 = false;
        this.f838OooO0o = false;
        this.f834OooO00o = oo000o00;
        int[] iArr = (int[]) oo000o00.OooO00o(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
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
        this.f839OooO0o0 = z;
        this.f838OooO0o = o000OO.OooO00o(oOO00O.class) != null;
        this.f835OooO0O0 = new o0000O0(new o0OOO0());
    }
}
