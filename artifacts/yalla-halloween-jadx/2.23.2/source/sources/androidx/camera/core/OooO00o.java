package androidx.camera.core;

import android.graphics.Matrix;
import android.media.Image;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.o00OOO0;
import java.nio.ByteBuffer;
import p028Oooo0oO.o000O0;
import p028Oooo0oO.oo00o;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooO00o implements OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Image f3432OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o000O0 f3433OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C0014OooO00o[] f3434OooO0o0;

    /* JADX INFO: renamed from: androidx.camera.core.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0014OooO00o implements OooOOO0.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Image.Plane f3435OooO00o;

        public C0014OooO00o(Image.Plane plane) {
            this.f3435OooO00o = plane;
        }

        @Override // androidx.camera.core.OooOOO0.OooO00o
        @NonNull
        public final ByteBuffer OooO0O0() {
            return this.f3435OooO00o.getBuffer();
        }

        @Override // androidx.camera.core.OooOOO0.OooO00o
        public final int OooO0OO() {
            return this.f3435OooO00o.getRowStride();
        }

        @Override // androidx.camera.core.OooOOO0.OooO00o
        public final int OooO0Oo() {
            return this.f3435OooO00o.getPixelStride();
        }
    }

    public OooO00o(@NonNull Image image) {
        this.f3432OooO0Oo = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f3434OooO0o0 = new C0014OooO00o[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.f3434OooO0o0[i] = new C0014OooO00o(planes[i]);
            }
        } else {
            this.f3434OooO0o0 = new C0014OooO00o[0];
        }
        this.f3433OooO0o = new o000O0(o00OOO0.f3743OooO0O0, image.getTimestamp(), 0, new Matrix());
    }

    @Override // androidx.camera.core.OooOOO0
    @NonNull
    public final OooOOO0.OooO00o[] OooooOo() {
        return this.f3434OooO0o0;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f3432OooO0Oo.close();
    }

    @Override // androidx.camera.core.OooOOO0
    public final int getFormat() {
        return this.f3432OooO0Oo.getFormat();
    }

    @Override // androidx.camera.core.OooOOO0
    public final int getHeight() {
        return this.f3432OooO0Oo.getHeight();
    }

    @Override // androidx.camera.core.OooOOO0
    @ExperimentalGetImage
    public final Image getImage() {
        return this.f3432OooO0Oo;
    }

    @Override // androidx.camera.core.OooOOO0
    public final int getWidth() {
        return this.f3432OooO0Oo.getWidth();
    }

    @Override // androidx.camera.core.OooOOO0
    @NonNull
    public final oo00o o00000Oo() {
        return this.f3433OooO0o;
    }
}
