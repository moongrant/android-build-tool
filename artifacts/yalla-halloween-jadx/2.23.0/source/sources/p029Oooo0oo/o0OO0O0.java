package p029Oooo0oo;

import android.graphics.Bitmap;
import android.media.Image;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.ExperimentalGetImage;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.OooOOO0;
import java.nio.ByteBuffer;
import java.util.Objects;
import p028Oooo0oO.oo00o;
import p037OoooOo0.o000O00O;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o0OO0O0 implements OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f1306OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f1307OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f1308OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    @GuardedBy("mLock")
    public OooOOO0.OooO00o[] f1309OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final o0OO0 f1310OooO0oo;

    public o0OO0O0(@NonNull o000O00O<Bitmap> o000o00o2) {
        Bitmap bitmapOooO0OO = o000o00o2.OooO0OO();
        o000o00o2.OooO0O0();
        o000o00o2.OooO0o();
        o000o00o2.OooO0oO();
        long jOooO0OO = o000o00o2.OooO00o().OooO0OO();
        o000OO.OooOOO0.OooO0O0(bitmapOooO0OO.getConfig() == Bitmap.Config.ARGB_8888, "Only accept Bitmap with ARGB_8888 format for now.");
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bitmapOooO0OO.getAllocationByteCount());
        ImageProcessingUtil.OooO0O0(bitmapOooO0OO, byteBufferAllocateDirect, bitmapOooO0OO.getRowBytes());
        byteBufferAllocateDirect.rewind();
        int width = bitmapOooO0OO.getWidth();
        int height = bitmapOooO0OO.getHeight();
        this.f1306OooO0Oo = new Object();
        this.f1308OooO0o0 = width;
        this.f1307OooO0o = height;
        this.f1310OooO0oo = new o0OO0(jOooO0OO);
        byteBufferAllocateDirect.rewind();
        this.f1309OooO0oO = new OooOOO0.OooO00o[]{new o0OO00o0(byteBufferAllocateDirect, width * 4)};
    }

    public final void OooO00o() {
        synchronized (this.f1306OooO0Oo) {
            o000OO.OooOOO0.OooO0o("The image is closed.", this.f1309OooO0oO != null);
        }
    }

    @Override // androidx.camera.core.OooOOO0
    @NonNull
    public final OooOOO0.OooO00o[] OooooOO() {
        OooOOO0.OooO00o[] oooO00oArr;
        synchronized (this.f1306OooO0Oo) {
            OooO00o();
            OooOOO0.OooO00o[] oooO00oArr2 = this.f1309OooO0oO;
            Objects.requireNonNull(oooO00oArr2);
            oooO00oArr = oooO00oArr2;
        }
        return oooO00oArr;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f1306OooO0Oo) {
            OooO00o();
            this.f1309OooO0oO = null;
        }
    }

    @Override // androidx.camera.core.OooOOO0
    public final int getFormat() {
        synchronized (this.f1306OooO0Oo) {
            OooO00o();
        }
        return 1;
    }

    @Override // androidx.camera.core.OooOOO0
    public final int getHeight() {
        int i;
        synchronized (this.f1306OooO0Oo) {
            OooO00o();
            i = this.f1307OooO0o;
        }
        return i;
    }

    @Override // androidx.camera.core.OooOOO0
    @Nullable
    @ExperimentalGetImage
    public final Image getImage() {
        synchronized (this.f1306OooO0Oo) {
            OooO00o();
        }
        return null;
    }

    @Override // androidx.camera.core.OooOOO0
    public final int getWidth() {
        int i;
        synchronized (this.f1306OooO0Oo) {
            OooO00o();
            i = this.f1308OooO0o0;
        }
        return i;
    }

    @Override // androidx.camera.core.OooOOO0
    @NonNull
    public final oo00o o00000OO() {
        o0OO0 o0oo1;
        synchronized (this.f1306OooO0Oo) {
            OooO00o();
            o0oo1 = this.f1310OooO0oo;
        }
        return o0oo1;
    }
}
