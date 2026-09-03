package com.ss.ugc.android.alpha_player.widget;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLDebugHelper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes2.dex */
public class GLTextureView extends TextureView implements TextureView.SurfaceTextureListener, View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final OooOOOO f21428OooOOO = new OooOOOO();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooOO0 f21429OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final WeakReference<GLTextureView> f21430OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Oooo000 f21431OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooOOO f21432OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f21433OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooO f21434OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public OooOO0O f21435OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f21436OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f21437OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f21438OooOOO0;

    public interface OooO {
    }

    public abstract class OooO00o implements OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int[] f21439OooO00o;

        public OooO00o(int[] iArr) {
            if (GLTextureView.this.f21437OooOO0o == 2) {
                int length = iArr.length;
                int[] iArr2 = new int[length + 2];
                int i = length - 1;
                System.arraycopy(iArr, 0, iArr2, 0, i);
                iArr2[i] = 12352;
                iArr2[length] = 4;
                iArr2[length + 1] = 12344;
                iArr = iArr2;
            }
            this.f21439OooO00o = iArr;
        }
    }

    public class OooO0O0 extends OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final int f21441OooO;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int[] f21442OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f21443OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f21444OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f21445OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f21446OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int f21447OooO0oo;

        public OooO0O0(int i, int i2) {
            super(new int[]{12324, 8, 12323, 8, 12322, 8, 12321, i, 12325, i2, 12326, 0, 12344});
            this.f21442OooO0OO = new int[1];
            this.f21443OooO0Oo = 8;
            this.f21445OooO0o0 = 8;
            this.f21444OooO0o = 8;
            this.f21446OooO0oO = i;
            this.f21447OooO0oo = i2;
            this.f21441OooO = 0;
        }

        public final int OooO00o(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
            int[] iArr = this.f21442OooO0OO;
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, iArr)) {
                return iArr[0];
            }
            return 0;
        }
    }

    public class OooO0OO implements OooOO0 {
        public OooO0OO() {
        }
    }

    public static class OooO0o implements OooOO0O {
    }

    public interface OooOO0 {
    }

    public interface OooOO0O {
    }

    public static class OooOOO extends Thread {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f21450OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f21451OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f21452OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f21453OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f21454OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f21455OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public boolean f21456OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public boolean f21457OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public boolean f21458OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public boolean f21460OooOOO0;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public boolean f21463OooOOo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public OooOOO0 f21466OooOo0;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public final WeakReference<GLTextureView> f21468OooOo0O;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public final ArrayList<Runnable> f21465OooOOoo = new ArrayList<>();

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public boolean f21467OooOo00 = true;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public int f21459OooOOO = 0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public int f21461OooOOOO = 0;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public boolean f21464OooOOo0 = true;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public int f21462OooOOOo = 1;

        public OooOOO(WeakReference<GLTextureView> weakReference) {
            this.f21468OooOo0O = weakReference;
        }

        /* JADX WARN: Code duplicated, block: B:105:0x0150 A[Catch: all -> 0x0259, TryCatch #2 {, blocks: (B:6:0x001f, B:8:0x0023, B:17:0x0032, B:19:0x003a, B:108:0x0163, B:20:0x004a, B:22:0x0050, B:24:0x0059, B:26:0x005d, B:28:0x0069, B:30:0x0072, B:32:0x0076, B:34:0x007b, B:36:0x007f, B:41:0x008f, B:43:0x0097, B:39:0x008b, B:45:0x009c, B:47:0x00a4, B:48:0x00a9, B:50:0x00ad, B:52:0x00b1, B:54:0x00b5, B:55:0x00b8, B:56:0x00c3, B:58:0x00c7, B:60:0x00cb, B:62:0x00d5, B:63:0x00df, B:65:0x00e5, B:96:0x013a, B:98:0x013e, B:100:0x0142, B:101:0x0148, B:103:0x014c, B:105:0x0150, B:107:0x015c, B:175:0x024f, B:69:0x00f0, B:73:0x00f9, B:75:0x00ff, B:76:0x0102, B:85:0x011b, B:87:0x0121, B:89:0x012a, B:91:0x0130, B:92:0x0133, B:93:0x0136, B:80:0x0109, B:82:0x0111), top: B:192:0x001f, outer: #3, inners: #4 }] */
        /* JADX WARN: Code duplicated, block: B:106:0x015b  */
        /* JADX WARN: Code duplicated, block: B:172:0x0249  */
        /* JADX WARN: Code duplicated, block: B:194:0x011b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:209:0x014c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:211:0x024f A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v11 */
        /* JADX WARN: Type inference failed for: r9v12, types: [int] */
        /* JADX WARN: Type inference failed for: r9v13 */
        public final void OooO00o() throws InterruptedException {
            boolean z;
            boolean z2;
            OooOo oooOo;
            boolean z3;
            boolean z4;
            this.f21466OooOo0 = new OooOOO0(this.f21468OooOo0O);
            this.f21457OooOO0O = false;
            this.f21458OooOO0o = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            int i = 0;
            int i2 = 0;
            boolean z12 = false;
            GL10 gl10 = null;
            while (true) {
                Runnable runnableRemove = null;
                while (true) {
                    try {
                        synchronized (GLTextureView.f21428OooOOO) {
                            while (true) {
                                if (this.f21451OooO0Oo) {
                                    synchronized (GLTextureView.f21428OooOOO) {
                                        OooO0o();
                                        OooO0o0();
                                    }
                                    return;
                                }
                                if (!this.f21465OooOOoo.isEmpty()) {
                                    runnableRemove = this.f21465OooOOoo.remove(0);
                                    z = z5;
                                    z2 = false;
                                    oooOo = null;
                                    break;
                                }
                                boolean z13 = this.f21454OooO0oO;
                                boolean z14 = this.f21452OooO0o;
                                if (z13 != z14) {
                                    this.f21454OooO0oO = z14;
                                    GLTextureView.f21428OooOOO.notifyAll();
                                } else {
                                    z14 = false;
                                }
                                if (this.f21460OooOOO0) {
                                    OooO0o();
                                    OooO0o0();
                                    this.f21460OooOOO0 = false;
                                    z7 = true;
                                }
                                if (z5) {
                                    OooO0o();
                                    OooO0o0();
                                    z5 = false;
                                }
                                if (z14 && this.f21458OooOO0o) {
                                    OooO0o();
                                }
                                if (z14 && this.f21457OooOO0O) {
                                    GLTextureView gLTextureView = this.f21468OooOo0O.get();
                                    if (!(gLTextureView == null ? false : gLTextureView.f21438OooOOO0) || GLTextureView.f21428OooOOO.OooO0O0()) {
                                        OooO0o0();
                                    }
                                }
                                if (z14 && GLTextureView.f21428OooOOO.OooO0OO()) {
                                    this.f21466OooOo0.OooO0OO();
                                }
                                if (!this.f21455OooO0oo && !this.f21456OooOO0) {
                                    if (this.f21458OooOO0o) {
                                        OooO0o();
                                    }
                                    this.f21456OooOO0 = true;
                                    this.f21450OooO = false;
                                    GLTextureView.f21428OooOOO.notifyAll();
                                }
                                if (this.f21455OooO0oo && this.f21456OooOO0) {
                                    this.f21456OooOO0 = false;
                                    GLTextureView.f21428OooOOO.notifyAll();
                                }
                                if (z6) {
                                    this.f21463OooOOo = true;
                                    GLTextureView.f21428OooOOO.notifyAll();
                                    z6 = false;
                                    z12 = false;
                                }
                                if (OooO0O0()) {
                                    if (this.f21457OooOO0O) {
                                        z = z5;
                                    } else {
                                        if (z7) {
                                            z = z5;
                                            oooOo = null;
                                            z7 = false;
                                        } else {
                                            OooOOOO oooOOOO = GLTextureView.f21428OooOOO;
                                            OooOOO oooOOO = oooOOOO.f21479OooO0o0;
                                            if (oooOOO == this || oooOOO == null) {
                                                z = z5;
                                                oooOOOO.f21479OooO0o0 = this;
                                                oooOOOO.notifyAll();
                                            } else {
                                                z = z5;
                                                if (!oooOOOO.f21475OooO00o) {
                                                    oooOOOO.f21475OooO00o = true;
                                                }
                                                if (!oooOOOO.f21477OooO0OO) {
                                                    if (oooOOO != null) {
                                                        oooOOO.f21460OooOOO0 = true;
                                                        oooOOOO.notifyAll();
                                                    }
                                                    z4 = false;
                                                }
                                                if (z4) {
                                                    try {
                                                        this.f21466OooOo0.OooO0Oo();
                                                        this.f21457OooOO0O = true;
                                                        oooOOOO.notifyAll();
                                                        oooOo = null;
                                                        z8 = true;
                                                    } catch (RuntimeException e) {
                                                        OooOOOO oooOOOO2 = GLTextureView.f21428OooOOO;
                                                        if (oooOOOO2.f21479OooO0o0 == this) {
                                                            oooOOOO2.f21479OooO0o0 = null;
                                                        }
                                                        oooOOOO2.notifyAll();
                                                        throw e;
                                                    }
                                                }
                                            }
                                            z4 = true;
                                            if (z4) {
                                                this.f21466OooOo0.OooO0Oo();
                                                this.f21457OooOO0O = true;
                                                oooOOOO.notifyAll();
                                                oooOo = null;
                                                z8 = true;
                                            }
                                        }
                                        if (this.f21457OooOO0O && !this.f21458OooOO0o) {
                                            this.f21458OooOO0o = true;
                                            z9 = true;
                                            z10 = true;
                                            z11 = true;
                                        }
                                        if (this.f21458OooOO0o) {
                                            if (this.f21467OooOo00) {
                                                i = this.f21459OooOOO;
                                                i2 = this.f21461OooOOOO;
                                                z2 = false;
                                                this.f21467OooOo00 = false;
                                                z9 = true;
                                                z11 = true;
                                                z12 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            this.f21464OooOOo0 = z2;
                                            GLTextureView.f21428OooOOO.notifyAll();
                                            break;
                                        }
                                    }
                                    oooOo = null;
                                    if (this.f21457OooOO0O) {
                                        this.f21458OooOO0o = true;
                                        z9 = true;
                                        z10 = true;
                                        z11 = true;
                                    }
                                    if (this.f21458OooOO0o) {
                                        if (this.f21467OooOo00) {
                                            i = this.f21459OooOOO;
                                            i2 = this.f21461OooOOOO;
                                            z2 = false;
                                            this.f21467OooOo00 = false;
                                            z9 = true;
                                            z11 = true;
                                            z12 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        this.f21464OooOOo0 = z2;
                                        GLTextureView.f21428OooOOO.notifyAll();
                                        break;
                                    }
                                } else {
                                    z = z5;
                                }
                                GLTextureView.f21428OooOOO.wait();
                                z5 = z;
                            }
                        }
                        if (runnableRemove != null) {
                            break;
                        }
                        if (z9) {
                            if (this.f21466OooOo0.OooO00o()) {
                                z9 = z2;
                            } else {
                                OooOOOO oooOOOO3 = GLTextureView.f21428OooOOO;
                                synchronized (oooOOOO3) {
                                    this.f21450OooO = true;
                                    oooOOOO3.notifyAll();
                                }
                                z5 = z;
                            }
                        }
                        if (z10) {
                            OooOOO0 oooOOO0 = this.f21466OooOo0;
                            GL gl = oooOOO0.f21473OooO0o.getGL();
                            GLTextureView gLTextureView2 = oooOOO0.f21469OooO00o.get();
                            if (gLTextureView2 != null) {
                                OooOOOO oooOOOO4 = GLTextureView.f21428OooOOO;
                                int i3 = gLTextureView2.f21436OooOO0O;
                                if ((i3 & 3) != 0) {
                                    gl = GLDebugHelper.wrap(gl, (int) ((i3 & 1) != 0 ? 1 : z2), (i3 & 2) != 0 ? new OooOo() : oooOo);
                                }
                            }
                            gl10 = (GL10) gl;
                            GLTextureView.f21428OooOOO.OooO00o(gl10);
                            z10 = z2;
                        }
                        if (z8) {
                            GLTextureView gLTextureView3 = this.f21468OooOo0O.get();
                            if (gLTextureView3 != null) {
                                gLTextureView3.f21431OooO0o.onSurfaceCreated(gl10, this.f21466OooOo0.f21474OooO0o0);
                            }
                            z8 = z2;
                        }
                        if (z11) {
                            GLTextureView gLTextureView4 = this.f21468OooOo0O.get();
                            if (gLTextureView4 != null) {
                                gLTextureView4.f21431OooO0o.onSurfaceChanged(gl10, i, i2);
                            }
                            z11 = z2;
                        }
                        GLTextureView gLTextureView5 = this.f21468OooOo0O.get();
                        if (gLTextureView5 != null) {
                            gLTextureView5.f21431OooO0o.onDrawFrame(gl10);
                        }
                        OooOOO0 oooOOO1 = this.f21466OooOo0;
                        int iEglGetError = !oooOOO1.f21470OooO0O0.eglSwapBuffers(oooOOO1.f21471OooO0OO, oooOOO1.f21472OooO0Oo) ? oooOOO1.f21470OooO0O0.eglGetError() : 12288;
                        if (iEglGetError != 12288) {
                            if (iEglGetError != 12302) {
                                Log.w("GLThread", "eglSwapBuffers failed: " + iEglGetError);
                                OooOOOO oooOOOO5 = GLTextureView.f21428OooOOO;
                                synchronized (oooOOOO5) {
                                    z3 = true;
                                    this.f21450OooO = true;
                                    oooOOOO5.notifyAll();
                                }
                            } else {
                                z3 = true;
                                z5 = true;
                            }
                            if (z12) {
                                z6 = z3;
                            }
                        } else {
                            z3 = true;
                        }
                        z5 = z;
                        if (z12) {
                            z6 = z3;
                        }
                    } catch (Throwable th) {
                        synchronized (GLTextureView.f21428OooOOO) {
                            OooO0o();
                            OooO0o0();
                            throw th;
                        }
                    }
                }
                runnableRemove.run();
                z5 = z;
            }
        }

        public final boolean OooO0O0() {
            return !this.f21454OooO0oO && this.f21455OooO0oo && !this.f21450OooO && this.f21459OooOOO > 0 && this.f21461OooOOOO > 0 && (this.f21464OooOOo0 || this.f21462OooOOOo == 1);
        }

        public final void OooO0OO() {
            OooOOOO oooOOOO = GLTextureView.f21428OooOOO;
            synchronized (oooOOOO) {
                this.f21451OooO0Oo = true;
                oooOOOO.notifyAll();
                while (!this.f21453OooO0o0) {
                    try {
                        GLTextureView.f21428OooOOO.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final void OooO0Oo(int i) {
            if (i < 0 || i > 1) {
                throw new IllegalArgumentException("renderMode");
            }
            OooOOOO oooOOOO = GLTextureView.f21428OooOOO;
            synchronized (oooOOOO) {
                this.f21462OooOOOo = i;
                oooOOOO.notifyAll();
            }
        }

        public final void OooO0o() {
            if (this.f21458OooOO0o) {
                this.f21458OooOO0o = false;
                this.f21466OooOo0.OooO0O0();
            }
        }

        public final void OooO0o0() {
            if (this.f21457OooOO0O) {
                this.f21466OooOo0.OooO0OO();
                this.f21457OooOO0O = false;
                OooOOOO oooOOOO = GLTextureView.f21428OooOOO;
                if (oooOOOO.f21479OooO0o0 == this) {
                    oooOOOO.f21479OooO0o0 = null;
                }
                oooOOOO.notifyAll();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            setName("GLThread " + getId());
            try {
                OooO00o();
            } catch (InterruptedException unused) {
                OooOOOO oooOOOO = GLTextureView.f21428OooOOO;
            } finally {
                OooOOOO oooOOOO2 = GLTextureView.f21428OooOOO;
                GLTextureView.f21428OooOOO.OooO0Oo(this);
            }
        }
    }

    public static class OooOOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final WeakReference<GLTextureView> f21469OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public EGL10 f21470OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public EGLDisplay f21471OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public EGLSurface f21472OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public EGLContext f21473OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public EGLConfig f21474OooO0o0;

        public OooOOO0(WeakReference<GLTextureView> weakReference) {
            this.f21469OooO00o = weakReference;
        }

        public final boolean OooO00o() {
            if (this.f21470OooO0O0 == null) {
                throw new RuntimeException("egl not initialized");
            }
            if (this.f21471OooO0OO == null) {
                throw new RuntimeException("eglDisplay not initialized");
            }
            if (this.f21474OooO0o0 == null) {
                throw new RuntimeException("mEglConfig not initialized");
            }
            OooO0O0();
            GLTextureView gLTextureView = this.f21469OooO00o.get();
            EGLSurface eGLSurfaceEglCreateWindowSurface = null;
            if (gLTextureView != null) {
                OooOO0O oooOO0O = gLTextureView.f21435OooOO0;
                EGL10 egl10 = this.f21470OooO0O0;
                EGLDisplay eGLDisplay = this.f21471OooO0OO;
                EGLConfig eGLConfig = this.f21474OooO0o0;
                SurfaceTexture surfaceTexture = gLTextureView.getSurfaceTexture();
                ((OooO0o) oooOO0O).getClass();
                try {
                    eGLSurfaceEglCreateWindowSurface = egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, surfaceTexture, null);
                } catch (IllegalArgumentException e) {
                    Log.e("GLTextureView", "eglCreateWindowSurface", e);
                }
                this.f21472OooO0Oo = eGLSurfaceEglCreateWindowSurface;
            } else {
                this.f21472OooO0Oo = null;
            }
            EGLSurface eGLSurface = this.f21472OooO0Oo;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                if (this.f21470OooO0O0.eglGetError() == 12299) {
                    Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            }
            if (this.f21470OooO0O0.eglMakeCurrent(this.f21471OooO0OO, eGLSurface, eGLSurface, this.f21473OooO0o)) {
                return true;
            }
            Log.w("EGLHelper", "eglMakeCurrent failed: " + this.f21470OooO0O0.eglGetError());
            return false;
        }

        public final void OooO0O0() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.f21472OooO0Oo;
            if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                return;
            }
            this.f21470OooO0O0.eglMakeCurrent(this.f21471OooO0OO, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            GLTextureView gLTextureView = this.f21469OooO00o.get();
            if (gLTextureView != null) {
                OooOO0O oooOO0O = gLTextureView.f21435OooOO0;
                EGL10 egl10 = this.f21470OooO0O0;
                EGLDisplay eGLDisplay = this.f21471OooO0OO;
                EGLSurface eGLSurface3 = this.f21472OooO0Oo;
                ((OooO0o) oooOO0O).getClass();
                egl10.eglDestroySurface(eGLDisplay, eGLSurface3);
            }
            this.f21472OooO0Oo = null;
        }

        public final void OooO0OO() {
            if (this.f21473OooO0o != null) {
                GLTextureView gLTextureView = this.f21469OooO00o.get();
                if (gLTextureView != null) {
                    OooOO0 oooOO1 = gLTextureView.f21429OooO;
                    EGL10 egl10 = this.f21470OooO0O0;
                    EGLDisplay eGLDisplay = this.f21471OooO0OO;
                    EGLContext eGLContext = this.f21473OooO0o;
                    ((OooO0OO) oooOO1).getClass();
                    if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                        Log.e("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
                        throw new RuntimeException(android.support.v4.media.OooO00o.OooO00o("eglDestroyContex failed: ", egl10.eglGetError()));
                    }
                }
                this.f21473OooO0o = null;
            }
            EGLDisplay eGLDisplay2 = this.f21471OooO0OO;
            if (eGLDisplay2 != null) {
                this.f21470OooO0O0.eglTerminate(eGLDisplay2);
                this.f21471OooO0OO = null;
            }
        }

        public final void OooO0Oo() {
            EGLConfig eGLConfig;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f21470OooO0O0 = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f21471OooO0OO = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                throw new RuntimeException("eglGetDisplay failed");
            }
            if (!this.f21470OooO0O0.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                throw new RuntimeException("eglInitialize failed");
            }
            GLTextureView gLTextureView = this.f21469OooO00o.get();
            if (gLTextureView == null) {
                this.f21474OooO0o0 = null;
                this.f21473OooO0o = null;
            } else {
                OooO oooO = gLTextureView.f21434OooO0oo;
                EGL10 egl11 = this.f21470OooO0O0;
                EGLDisplay eGLDisplay = this.f21471OooO0OO;
                OooO00o oooO00o = (OooO00o) oooO;
                int[] iArr = new int[1];
                if (!egl11.eglChooseConfig(eGLDisplay, oooO00o.f21439OooO00o, null, 0, iArr)) {
                    Log.getStackTraceString(new IllegalArgumentException("eglChooseConfig failed"));
                    OooOOOO oooOOOO = GLTextureView.f21428OooOOO;
                    GLTextureView.this.getClass();
                    throw new IllegalArgumentException("eglChooseConfig failed");
                }
                int i = 0;
                int i2 = iArr[0];
                if (i2 <= 0) {
                    throw new IllegalArgumentException("No configs match configSpec");
                }
                EGLConfig[] eGLConfigArr = new EGLConfig[i2];
                if (!egl11.eglChooseConfig(eGLDisplay, oooO00o.f21439OooO00o, eGLConfigArr, i2, iArr)) {
                    throw new IllegalArgumentException("eglChooseConfig#2 failed");
                }
                OooO0O0 oooO0O0 = (OooO0O0) oooO00o;
                while (true) {
                    if (i >= i2) {
                        eGLConfig = null;
                        break;
                    }
                    eGLConfig = eGLConfigArr[i];
                    int iOooO00o = oooO0O0.OooO00o(egl11, eGLDisplay, eGLConfig, 12325);
                    int iOooO00o2 = oooO0O0.OooO00o(egl11, eGLDisplay, eGLConfig, 12326);
                    if (iOooO00o >= oooO0O0.f21447OooO0oo && iOooO00o2 >= oooO0O0.f21441OooO) {
                        int iOooO00o3 = oooO0O0.OooO00o(egl11, eGLDisplay, eGLConfig, 12324);
                        int iOooO00o4 = oooO0O0.OooO00o(egl11, eGLDisplay, eGLConfig, 12323);
                        int iOooO00o5 = oooO0O0.OooO00o(egl11, eGLDisplay, eGLConfig, 12322);
                        int iOooO00o6 = oooO0O0.OooO00o(egl11, eGLDisplay, eGLConfig, 12321);
                        if (iOooO00o3 == oooO0O0.f21443OooO0Oo && iOooO00o4 == oooO0O0.f21445OooO0o0 && iOooO00o5 == oooO0O0.f21444OooO0o && iOooO00o6 == oooO0O0.f21446OooO0oO) {
                            break;
                        }
                    }
                    i++;
                }
                if (eGLConfig == null) {
                    throw new IllegalArgumentException("No config chosen");
                }
                this.f21474OooO0o0 = eGLConfig;
                OooOO0 oooOO1 = gLTextureView.f21429OooO;
                EGL10 egl12 = this.f21470OooO0O0;
                EGLDisplay eGLDisplay2 = this.f21471OooO0OO;
                int i3 = GLTextureView.this.f21437OooOO0o;
                int[] iArr2 = {12440, i3, 12344};
                EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
                if (i3 == 0) {
                    iArr2 = null;
                }
                this.f21473OooO0o = egl12.eglCreateContext(eGLDisplay2, eGLConfig, eGLContext, iArr2);
            }
            EGLContext eGLContext2 = this.f21473OooO0o;
            if (eGLContext2 == null || eGLContext2 == EGL10.EGL_NO_CONTEXT) {
                this.f21473OooO0o = null;
                throw new RuntimeException(android.support.v4.media.OooO00o.OooO00o("createContext failed: ", this.f21470OooO0O0.eglGetError()));
            }
            this.f21472OooO0Oo = null;
        }
    }

    public static class OooOOOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f21475OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f21476OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f21477OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f21478OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public OooOOO f21479OooO0o0;

        public final synchronized void OooO00o(GL10 gl10) {
            if (!this.f21476OooO0O0) {
                if (!this.f21475OooO00o) {
                    this.f21475OooO00o = true;
                }
                this.f21477OooO0OO = !gl10.glGetString(7937).startsWith("Q3Dimension MSM7500 ");
                notifyAll();
                this.f21478OooO0Oo = !this.f21477OooO0OO;
                this.f21476OooO0O0 = true;
            }
        }

        public final synchronized boolean OooO0O0() {
            return this.f21478OooO0Oo;
        }

        public final synchronized boolean OooO0OO() {
            if (!this.f21475OooO00o) {
                this.f21475OooO00o = true;
            }
            return !this.f21477OooO0OO;
        }

        public final synchronized void OooO0Oo(OooOOO oooOOO) {
            oooOOO.f21453OooO0o0 = true;
            if (this.f21479OooO0o0 == oooOOO) {
                this.f21479OooO0o0 = null;
            }
            notifyAll();
        }
    }

    public static class OooOo extends Writer {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final StringBuilder f21480OooO0Oo = new StringBuilder();

        public final void OooO00o() {
            StringBuilder sb = this.f21480OooO0Oo;
            if (sb.length() > 0) {
                Log.v("GLTextureView", sb.toString());
                sb.delete(0, sb.length());
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            OooO00o();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            OooO00o();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == '\n') {
                    OooO00o();
                } else {
                    this.f21480OooO0Oo.append(c);
                }
            }
        }
    }

    public interface OooOo00 {
    }

    public class Oooo0 extends OooO0O0 {
        public Oooo0(boolean z) {
            super(0, z ? 16 : 0);
        }
    }

    public interface Oooo000 {
        void onDrawFrame(GL10 gl10);

        void onSurfaceChanged(GL10 gl10, int i, int i2);

        void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig);
    }

    public GLTextureView(Context context) {
        super(context);
        this.f21430OooO0Oo = new WeakReference<>(this);
        setSurfaceTextureListener(this);
    }

    public final void OooO0oO() {
        if (this.f21432OooO0o0 != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    public final void OooO0oo(int i, int i2) {
        OooOOO oooOOO = this.f21432OooO0o0;
        oooOOO.getClass();
        OooOOOO oooOOOO = f21428OooOOO;
        synchronized (oooOOOO) {
            oooOOO.f21459OooOOO = i;
            oooOOO.f21461OooOOOO = i2;
            oooOOO.f21467OooOo00 = true;
            oooOOO.f21464OooOOo0 = true;
            oooOOO.f21463OooOOo = false;
            oooOOOO.notifyAll();
            while (!oooOOO.f21453OooO0o0 && !oooOOO.f21454OooO0oO && !oooOOO.f21463OooOOo) {
                if (!(oooOOO.f21457OooOO0O && oooOOO.f21458OooOO0o && oooOOO.OooO0O0())) {
                    break;
                }
                try {
                    f21428OooOOO.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
    }

    public final void finalize() throws Throwable {
        try {
            OooOOO oooOOO = this.f21432OooO0o0;
            if (oooOOO != null) {
                oooOOO.OooO0OO();
            }
        } finally {
            super.finalize();
        }
    }

    public int getDebugFlags() {
        return this.f21436OooOO0O;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.f21438OooOOO0;
    }

    public int getRenderMode() {
        int i;
        OooOOO oooOOO = this.f21432OooO0o0;
        oooOOO.getClass();
        synchronized (f21428OooOOO) {
            i = oooOOO.f21462OooOOOo;
        }
        return i;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        if (this.f21433OooO0oO && this.f21431OooO0o != null) {
            OooOOO oooOOO = this.f21432OooO0o0;
            if (oooOOO != null) {
                synchronized (f21428OooOOO) {
                    i = oooOOO.f21462OooOOOo;
                }
            } else {
                i = 1;
            }
            OooOOO oooOOO2 = new OooOOO(this.f21430OooO0Oo);
            this.f21432OooO0o0 = oooOOO2;
            if (i != 1) {
                oooOOO2.OooO0Oo(i);
            }
            this.f21432OooO0o0.start();
        }
        this.f21433OooO0oO = false;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        OooOOO oooOOO = this.f21432OooO0o0;
        if (oooOOO != null) {
            oooOOO.OooO0OO();
        }
        this.f21433OooO0oO = true;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        getSurfaceTexture();
        OooO0oo(i3 - i, i4 - i2);
    }

    public final void onPause() {
        OooOOO oooOOO = this.f21432OooO0o0;
        oooOOO.getClass();
        OooOOOO oooOOOO = f21428OooOOO;
        synchronized (oooOOOO) {
            oooOOO.f21452OooO0o = true;
            oooOOOO.notifyAll();
            while (!oooOOO.f21453OooO0o0 && !oooOOO.f21454OooO0oO) {
                try {
                    f21428OooOOO.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        OooOOO oooOOO = this.f21432OooO0o0;
        oooOOO.getClass();
        OooOOOO oooOOOO = f21428OooOOO;
        synchronized (oooOOOO) {
            oooOOO.f21455OooO0oo = true;
            oooOOOO.notifyAll();
            while (oooOOO.f21456OooOO0 && !oooOOO.f21453OooO0o0) {
                try {
                    f21428OooOOO.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        OooO0oo(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        OooOOO oooOOO = this.f21432OooO0o0;
        oooOOO.getClass();
        OooOOOO oooOOOO = f21428OooOOO;
        synchronized (oooOOOO) {
            oooOOO.f21455OooO0oo = false;
            oooOOOO.notifyAll();
            while (!oooOOO.f21456OooOO0 && !oooOOO.f21453OooO0o0) {
                try {
                    f21428OooOOO.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        OooO0oo(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void requestRender() {
        OooOOO oooOOO = this.f21432OooO0o0;
        oooOOO.getClass();
        OooOOOO oooOOOO = f21428OooOOO;
        synchronized (oooOOOO) {
            oooOOO.f21464OooOOo0 = true;
            oooOOOO.notifyAll();
        }
    }

    public void setDebugFlags(int i) {
        this.f21436OooOO0O = i;
    }

    public void setEGLConfigChooser(OooO oooO) {
        OooO0oO();
        this.f21434OooO0oo = oooO;
    }

    public void setEGLContextClientVersion(int i) {
        OooO0oO();
        this.f21437OooOO0o = i;
    }

    public void setEGLContextFactory(OooOO0 oooOO1) {
        OooO0oO();
        this.f21429OooO = oooOO1;
    }

    public void setEGLWindowSurfaceFactory(OooOO0O oooOO0O) {
        OooO0oO();
        this.f21435OooOO0 = oooOO0O;
    }

    public void setGLWrapper(OooOo00 oooOo00) {
    }

    public void setMonitor(o0OOO0.OooO00o oooO00o) {
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.f21438OooOOO0 = z;
    }

    public void setRenderMode(int i) {
        OooOOO oooOOO = this.f21432OooO0o0;
        oooOOO.getClass();
        if (i < 0 || i > 1) {
            throw new IllegalArgumentException("renderMode");
        }
        OooOOOO oooOOOO = f21428OooOOO;
        synchronized (oooOOOO) {
            oooOOO.f21462OooOOOo = i;
            oooOOOO.notifyAll();
        }
    }

    public void setRenderer(Oooo000 oooo000) {
        OooO0oO();
        if (this.f21434OooO0oo == null) {
            this.f21434OooO0oo = new Oooo0(true);
        }
        if (this.f21429OooO == null) {
            this.f21429OooO = new OooO0OO();
        }
        if (this.f21435OooOO0 == null) {
            this.f21435OooOO0 = new OooO0o();
        }
        this.f21431OooO0o = oooo000;
        OooOOO oooOOO = new OooOOO(this.f21430OooO0Oo);
        this.f21432OooO0o0 = oooOOO;
        oooOOO.start();
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser(new Oooo0(z));
    }

    public GLTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21430OooO0Oo = new WeakReference<>(this);
        setSurfaceTextureListener(this);
    }
}
