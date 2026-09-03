package p029Oooo0oo;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.o00OO;
import androidx.camera.core.impl.utils.ExifData;
import p028Oooo0oO.oo00o;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO0 implements oo00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ long f1283OooO00o;

    public o0OO0(long j) {
        this.f1283OooO00o = j;
    }

    @Override // p028Oooo0oO.oo00o
    public final void OooO00o(@NonNull ExifData.OooO0O0 oooO0O0) {
        throw new UnsupportedOperationException("Custom ImageProxy does not contain Exif data.");
    }

    @Override // p028Oooo0oO.oo00o
    @NonNull
    public final o00OO OooO0O0() {
        throw new UnsupportedOperationException("Custom ImageProxy does not contain TagBundle");
    }

    @Override // p028Oooo0oO.oo00o
    public final long OooO0OO() {
        return this.f1283OooO00o;
    }
}
