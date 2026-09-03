package o000OOo0;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.annotation.Nullable;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.video.spherical.Projection;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import o000OOO.OooOO0O;
import p080o000OoO.o00;
import p080o000OoO.o000O0;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO implements OooOO0O, OooO00o {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f34604OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public SurfaceTexture f34606OooOOO0;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public byte[] f34608OooOOOo;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AtomicBoolean f34597OooO0Oo = new AtomicBoolean();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AtomicBoolean f34599OooO0o0 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final androidx.media3.exoplayer.video.spherical.OooO0OO f34598OooO0o = new androidx.media3.exoplayer.video.spherical.OooO0OO();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO0OO f34600OooO0oO = new OooO0OO();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o000O0<Long> f34601OooO0oo = new o000O0<>();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o000O0<Projection> f34596OooO = new o000O0<>();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final float[] f34602OooOO0 = new float[16];

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final float[] f34603OooOO0O = new float[16];

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public volatile int f34605OooOOO = 0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f34607OooOOOO = -1;

    @Override // o000OOo0.OooO00o
    public final void OooO00o(float[] fArr, long j) {
        this.f34600OooO0oO.f34616OooO0OO.OooO00o(j, fArr);
    }

    @Override // o000OOo0.OooO00o
    public final void OooO0O0() {
        this.f34601OooO0oo.OooO0O0();
        OooO0OO oooO0OO = this.f34600OooO0oO;
        oooO0OO.f34616OooO0OO.OooO0O0();
        oooO0OO.f34617OooO0Oo = false;
        this.f34599OooO0o0.set(true);
    }

    @Override // o000OOO.OooOO0O
    public final void OooO0OO(long j, long j2, androidx.media3.common.OooOO0 oooOO1, @Nullable MediaFormat mediaFormat) {
        float f;
        float f2;
        int i;
        int i2;
        ArrayList<Projection.OooO00o> arrayListOooO00o;
        this.f34601OooO0oo.OooO00o(j2, Long.valueOf(j));
        byte[] bArr = oooOO1.f6423OooOoO0;
        int i3 = oooOO1.f6422OooOoO;
        byte[] bArr2 = this.f34608OooOOOo;
        int i4 = this.f34607OooOOOO;
        this.f34608OooOOOo = bArr;
        if (i3 == -1) {
            i3 = this.f34605OooOOO;
        }
        this.f34607OooOOOO = i3;
        if (i4 == i3 && Arrays.equals(bArr2, this.f34608OooOOOo)) {
            return;
        }
        byte[] bArr3 = this.f34608OooOOOo;
        Projection projection = null;
        if (bArr3 != null) {
            int i5 = this.f34607OooOOOO;
            o000O000 o000o001 = new o000O000(bArr3);
            try {
                o000o001.Oooo00o(4);
                int iOooO0o = o000o001.OooO0o();
                o000o001.Oooo00O(0);
                if (iOooO0o == 1886547818) {
                    o000o001.Oooo00o(8);
                    int i6 = o000o001.f34963OooO0O0;
                    int i7 = o000o001.f34964OooO0OO;
                    while (true) {
                        if (i6 < i7) {
                            int iOooO0o2 = o000o001.OooO0o() + i6;
                            if (iOooO0o2 > i6 && iOooO0o2 <= i7) {
                                int iOooO0o3 = o000o001.OooO0o();
                                if (iOooO0o3 != 2037673328 && iOooO0o3 != 1836279920) {
                                    o000o001.Oooo00O(iOooO0o2);
                                    i6 = iOooO0o2;
                                }
                                o000o001.Oooo000(iOooO0o2);
                                arrayListOooO00o = androidx.media3.exoplayer.video.spherical.OooO0O0.OooO00o(o000o001);
                            }
                        }
                        arrayListOooO00o = null;
                    }
                } else {
                    arrayListOooO00o = androidx.media3.exoplayer.video.spherical.OooO0O0.OooO00o(o000o001);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (arrayListOooO00o != null) {
                int size = arrayListOooO00o.size();
                if (size == 1) {
                    Projection.OooO00o oooO00o = arrayListOooO00o.get(0);
                    projection = new Projection(oooO00o, oooO00o, i5);
                } else if (size == 2) {
                    projection = new Projection(arrayListOooO00o.get(0), arrayListOooO00o.get(1), i5);
                }
            }
        }
        if (projection == null || !androidx.media3.exoplayer.video.spherical.OooO0OO.OooO0O0(projection)) {
            int i8 = this.f34607OooOOOO;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f3 = radians / 36;
            float f4 = radians2 / 72;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 36; i9 < i12; i12 = 36) {
                float f5 = radians / 2.0f;
                float f6 = (i9 * f3) - f5;
                int i13 = i9 + 1;
                float f7 = (i13 * f3) - f5;
                int i14 = 0;
                while (i14 < 73) {
                    int i15 = i13;
                    int i16 = 0;
                    int i17 = 2;
                    while (i16 < i17) {
                        if (i16 == 0) {
                            f2 = f7;
                            f = f6;
                        } else {
                            f = f7;
                            f2 = f;
                        }
                        float f8 = i14 * f4;
                        float f9 = f6;
                        int i18 = i10 + 1;
                        float f10 = f4;
                        double d = 50.0f;
                        int i19 = i14;
                        double d2 = (f8 + 3.1415927f) - (radians2 / 2.0f);
                        float f11 = f3;
                        double d3 = f;
                        int i20 = i8;
                        int i21 = i16;
                        fArr[i10] = -((float) (Math.cos(d3) * Math.sin(d2) * d));
                        int i22 = i18 + 1;
                        fArr[i18] = (float) (Math.sin(d3) * d);
                        int i23 = i22 + 1;
                        fArr[i22] = (float) (Math.cos(d3) * Math.cos(d2) * d);
                        int i24 = i11 + 1;
                        fArr2[i11] = f8 / radians2;
                        int i25 = i24 + 1;
                        fArr2[i24] = ((i9 + i21) * f11) / radians;
                        if (i19 == 0 && i21 == 0) {
                            i = i19;
                            i2 = i21;
                        } else {
                            i = i19;
                            i2 = i21;
                            int i26 = (i == 72 && i2 == 1) ? 2 : 2;
                            i11 = i25;
                            i10 = i23;
                            i16 = i2 + 1;
                            i14 = i;
                            i17 = i26;
                            f7 = f2;
                            f4 = f10;
                            f6 = f9;
                            f3 = f11;
                            i8 = i20;
                        }
                        System.arraycopy(fArr, i23 - 3, fArr, i23, 3);
                        i23 += 3;
                        System.arraycopy(fArr2, i25 - 2, fArr2, i25, 2);
                        i25 += 2;
                        i11 = i25;
                        i10 = i23;
                        i16 = i2 + 1;
                        i14 = i;
                        i17 = i26;
                        f7 = f2;
                        f4 = f10;
                        f6 = f9;
                        f3 = f11;
                        i8 = i20;
                    }
                    i14++;
                    i13 = i15;
                    f6 = f6;
                    i8 = i8;
                }
                i9 = i13;
            }
            Projection.OooO00o oooO00o2 = new Projection.OooO00o(new Projection.OooO0O0(fArr, 0, fArr2, 1));
            projection = new Projection(oooO00o2, oooO00o2, i8);
        }
        this.f34596OooO.OooO00o(j2, projection);
    }

    public final void OooO0Oo(float[] fArr) {
        float[] fArr2;
        Long lOooO0Oo;
        GLES20.glClear(16384);
        try {
            GlUtil.OooO0O0();
        } catch (GlUtil.GlException e) {
            Log.OooO0Oo("SceneRenderer", "Failed to draw a frame", e);
        }
        if (this.f34597OooO0Oo.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = this.f34606OooOOO0;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                GlUtil.OooO0O0();
            } catch (GlUtil.GlException e2) {
                Log.OooO0Oo("SceneRenderer", "Failed to draw a frame", e2);
            }
            if (this.f34599OooO0o0.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f34602OooOO0, 0);
            }
            long timestamp = this.f34606OooOOO0.getTimestamp();
            o000O0<Long> o000o0 = this.f34601OooO0oo;
            synchronized (o000o0) {
                lOooO0Oo = o000o0.OooO0Oo(timestamp, false);
            }
            Long l = lOooO0Oo;
            if (l != null) {
                OooO0OO oooO0OO = this.f34600OooO0oO;
                float[] fArr3 = this.f34602OooOO0;
                float[] fArrOooO0o0 = oooO0OO.f34616OooO0OO.OooO0o0(l.longValue());
                if (fArrOooO0o0 != null) {
                    float[] fArr4 = oooO0OO.f34615OooO0O0;
                    float f = fArrOooO0o0[0];
                    float f2 = -fArrOooO0o0[1];
                    float f3 = -fArrOooO0o0[2];
                    float length = Matrix.length(f, f2, f3);
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr4, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                    } else {
                        Matrix.setIdentityM(fArr4, 0);
                    }
                    if (!oooO0OO.f34617OooO0Oo) {
                        OooO0OO.OooO00o(oooO0OO.f34614OooO00o, oooO0OO.f34615OooO0O0);
                        oooO0OO.f34617OooO0Oo = true;
                    }
                    Matrix.multiplyMM(fArr3, 0, oooO0OO.f34614OooO00o, 0, oooO0OO.f34615OooO0O0, 0);
                }
            }
            Projection projectionOooO0o0 = this.f34596OooO.OooO0o0(timestamp);
            if (projectionOooO0o0 != null) {
                androidx.media3.exoplayer.video.spherical.OooO0OO oooO0OO2 = this.f34598OooO0o;
                oooO0OO2.getClass();
                if (androidx.media3.exoplayer.video.spherical.OooO0OO.OooO0O0(projectionOooO0o0)) {
                    oooO0OO2.f8305OooO00o = projectionOooO0o0.f8325OooO0OO;
                    oooO0OO2.f8306OooO0O0 = new androidx.media3.exoplayer.video.spherical.OooO0OO.OooO00o(projectionOooO0o0.f8323OooO00o.f8327OooO00o[0]);
                    if (!projectionOooO0o0.f8326OooO0Oo) {
                        new androidx.media3.exoplayer.video.spherical.OooO0OO.OooO00o(projectionOooO0o0.f8324OooO0O0.f8327OooO00o[0]);
                    }
                    oooO0OO2.getClass();
                }
            }
        }
        Matrix.multiplyMM(this.f34603OooOO0O, 0, fArr, 0, this.f34602OooOO0, 0);
        androidx.media3.exoplayer.video.spherical.OooO0OO oooO0OO3 = this.f34598OooO0o;
        int i = this.f34604OooOO0o;
        float[] fArr5 = this.f34603OooOO0O;
        androidx.media3.exoplayer.video.spherical.OooO0OO.OooO00o oooO00o = oooO0OO3.f8306OooO0O0;
        if (oooO00o == null) {
            return;
        }
        int i2 = oooO0OO3.f8305OooO00o;
        if (i2 == 1) {
            fArr2 = androidx.media3.exoplayer.video.spherical.OooO0OO.f8303OooOO0;
        } else {
            fArr2 = i2 == 2 ? androidx.media3.exoplayer.video.spherical.OooO0OO.f8304OooOO0O : androidx.media3.exoplayer.video.spherical.OooO0OO.f8302OooO;
        }
        GLES20.glUniformMatrix3fv(oooO0OO3.f8310OooO0o0, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(oooO0OO3.f8308OooO0Oo, 1, false, fArr5, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(oooO0OO3.f8312OooO0oo, 0);
        try {
            GlUtil.OooO0O0();
        } catch (GlUtil.GlException e3) {
            android.util.Log.e("ProjectionRenderer", "Failed to bind uniforms", e3);
        }
        GLES20.glVertexAttribPointer(oooO0OO3.f8309OooO0o, 3, 5126, false, 12, (Buffer) oooO00o.f8314OooO0O0);
        try {
            GlUtil.OooO0O0();
        } catch (GlUtil.GlException e4) {
            android.util.Log.e("ProjectionRenderer", "Failed to load position data", e4);
        }
        GLES20.glVertexAttribPointer(oooO0OO3.f8311OooO0oO, 2, 5126, false, 8, (Buffer) oooO00o.f8315OooO0OO);
        try {
            GlUtil.OooO0O0();
        } catch (GlUtil.GlException e5) {
            android.util.Log.e("ProjectionRenderer", "Failed to load texture data", e5);
        }
        GLES20.glDrawArrays(oooO00o.f8316OooO0Oo, 0, oooO00o.f8313OooO00o);
        try {
            GlUtil.OooO0O0();
        } catch (GlUtil.GlException e6) {
            android.util.Log.e("ProjectionRenderer", "Failed to render", e6);
        }
    }

    public final SurfaceTexture OooO0o0() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            GlUtil.OooO0O0();
            this.f34598OooO0o.OooO00o();
            GlUtil.OooO0O0();
            GlUtil.OooO0OO("No current context", !o00.OooO00o(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT));
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GlUtil.OooO0O0();
            int i = iArr[0];
            GlUtil.OooO00o(36197, i);
            this.f34604OooOO0o = i;
        } catch (GlUtil.GlException e) {
            Log.OooO0Oo("SceneRenderer", "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f34604OooOO0o);
        this.f34606OooOOO0 = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: o000OOo0.OooO0o
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f34618OooO0Oo.f34597OooO0Oo.set(true);
            }
        });
        return this.f34606OooOOO0;
    }
}
