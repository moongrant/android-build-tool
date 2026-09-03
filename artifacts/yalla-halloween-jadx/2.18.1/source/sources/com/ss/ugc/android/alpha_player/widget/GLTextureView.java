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
import java.util.Objects;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;
import p421o0Oo0ooo.oOo00o0o;

/* JADX INFO: loaded from: classes2.dex */
public class GLTextureView extends TextureView implements TextureView.SurfaceTextureListener, View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public static final OooOOOO f19876OoooOo0 = new OooOOOO();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public Oooo000 f19877Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public oOo00o0o f19878Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final WeakReference<GLTextureView> f19879Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public OooOOO f19880Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public OooOO0O f19881OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public OooO f19882OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f19883OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public OooOO0 f19884OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public OooOo00 f19885OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f19886OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f19887OoooOOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public int f19888o000oOoO;

    public interface OooO {
    }

    public abstract class OooO00o implements OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int[] f19889OooO00o;

        public OooO00o(int[] iArr) {
            if (GLTextureView.this.f19886OoooOOO == 2) {
                int length = iArr.length;
                int[] iArr2 = new int[length + 2];
                int i = length - 1;
                System.arraycopy(iArr, 0, iArr2, 0, i);
                iArr2[i] = 12352;
                iArr2[length] = 4;
                iArr2[length + 1] = 12344;
                iArr = iArr2;
            }
            this.f19889OooO00o = iArr;
        }
    }

    public class OooO0O0 extends OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f19891OooO;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int[] f19892OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f19893OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f19894OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f19895OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f19896OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f19897OooO0oo;

        public OooO0O0(int i, int i2) {
            super(new int[]{12324, 8, 12323, 8, 12322, 8, 12321, i, 12325, i2, 12326, 0, 12344});
            this.f19892OooO0OO = new int[1];
            this.f19893OooO0Oo = 8;
            this.f19895OooO0o0 = 8;
            this.f19894OooO0o = 8;
            this.f19896OooO0oO = i;
            this.f19897OooO0oo = i2;
            this.f19891OooO = 0;
        }

        public final int OooO00o(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f19892OooO0OO)) {
                return this.f19892OooO0OO[0];
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

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public boolean f19900Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public boolean f19901Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public boolean f19902Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public boolean f19903Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public boolean f19904OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public boolean f19905OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public boolean f19906OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public boolean f19907OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public boolean f19908OoooOO0;

        /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
        public boolean f19913OoooOoo;

        /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
        public OooOOO0 f19916OooooO0;

        /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
        public WeakReference<GLTextureView> f19917OooooOO;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public boolean f19918o000oOoO;

        /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
        public ArrayList<Runnable> f19914Ooooo00 = new ArrayList<>();

        /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
        public boolean f19915Ooooo0o = true;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public int f19909OoooOOO = 0;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public int f19910OoooOOo = 0;

        /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
        public boolean f19912OoooOoO = true;

        /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
        public int f19911OoooOo0 = 1;

        public OooOOO(WeakReference<GLTextureView> weakReference) {
            this.f19917OooooOO = weakReference;
        }

        /* JADX WARN: Code duplicated, block: B:103:0x0167 A[Catch: all -> 0x0272, TryCatch #1 {, blocks: (B:5:0x0021, B:7:0x0025, B:16:0x0036, B:18:0x003e, B:106:0x017f, B:19:0x004e, B:21:0x0054, B:23:0x005f, B:25:0x0063, B:27:0x006f, B:29:0x0078, B:31:0x007c, B:33:0x0081, B:35:0x0085, B:40:0x0095, B:42:0x009f, B:38:0x0091, B:44:0x00a4, B:46:0x00ae, B:47:0x00b3, B:49:0x00b7, B:51:0x00bb, B:53:0x00bf, B:54:0x00c2, B:55:0x00cf, B:57:0x00d3, B:59:0x00d7, B:61:0x00e3, B:62:0x00ef, B:64:0x00f5, B:94:0x0151, B:96:0x0155, B:98:0x0159, B:99:0x015f, B:101:0x0163, B:103:0x0167, B:105:0x0176, B:176:0x0266, B:68:0x0100, B:72:0x010b, B:83:0x0130, B:85:0x0136, B:87:0x013f, B:89:0x0147, B:90:0x014a, B:91:0x014d, B:75:0x0115, B:77:0x0119, B:80:0x0126), top: B:191:0x0021, outer: #5, inners: #6 }] */
        /* JADX WARN: Code duplicated, block: B:104:0x0175  */
        /* JADX WARN: Code duplicated, block: B:173:0x0260  */
        /* JADX WARN: Code duplicated, block: B:192:0x027b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:199:0x0130 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:210:0x0163 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:212:0x0266 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:42:0x009f A[Catch: all -> 0x0272, TryCatch #1 {, blocks: (B:5:0x0021, B:7:0x0025, B:16:0x0036, B:18:0x003e, B:106:0x017f, B:19:0x004e, B:21:0x0054, B:23:0x005f, B:25:0x0063, B:27:0x006f, B:29:0x0078, B:31:0x007c, B:33:0x0081, B:35:0x0085, B:40:0x0095, B:42:0x009f, B:38:0x0091, B:44:0x00a4, B:46:0x00ae, B:47:0x00b3, B:49:0x00b7, B:51:0x00bb, B:53:0x00bf, B:54:0x00c2, B:55:0x00cf, B:57:0x00d3, B:59:0x00d7, B:61:0x00e3, B:62:0x00ef, B:64:0x00f5, B:94:0x0151, B:96:0x0155, B:98:0x0159, B:99:0x015f, B:101:0x0163, B:103:0x0167, B:105:0x0176, B:176:0x0266, B:68:0x0100, B:72:0x010b, B:83:0x0130, B:85:0x0136, B:87:0x013f, B:89:0x0147, B:90:0x014a, B:91:0x014d, B:75:0x0115, B:77:0x0119, B:80:0x0126), top: B:191:0x0021, outer: #5, inners: #6 }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v33 */
        /* JADX WARN: Type inference failed for: r2v34, types: [java.io.Writer] */
        /* JADX WARN: Type inference failed for: r2v69 */
        public final void OooO00o() throws InterruptedException {
            Runnable runnable;
            boolean z;
            boolean z2;
            this.f19916OooooO0 = new OooOOO0(this.f19917OooooOO);
            this.f19904OoooO = false;
            this.f19908OoooOO0 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            GL10 gl10 = null;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            int i = 0;
            int i2 = 0;
            boolean z10 = false;
            Runnable runnableRemove = null;
            while (true) {
                try {
                    OooOOOO oooOOOO = GLTextureView.f19876OoooOo0;
                    synchronized (GLTextureView.f19876OoooOo0) {
                        while (true) {
                            if (this.f19901Oooo0o) {
                                OooOOOO oooOOOO2 = GLTextureView.f19876OoooOo0;
                                synchronized (GLTextureView.f19876OoooOo0) {
                                    OooO0o();
                                    OooO0o0();
                                }
                                return;
                            }
                            if (!this.f19914Ooooo00.isEmpty()) {
                                runnableRemove = this.f19914Ooooo00.remove(0);
                                z3 = z3;
                                runnable = null;
                                break;
                            }
                            boolean z11 = this.f19900Oooo;
                            boolean z12 = this.f19903Oooo0oo;
                            if (z11 != z12) {
                                this.f19900Oooo = z12;
                                OooOOOO oooOOOO3 = GLTextureView.f19876OoooOo0;
                                GLTextureView.f19876OoooOo0.notifyAll();
                            } else {
                                z12 = false;
                            }
                            if (this.f19918o000oOoO) {
                                OooO0o();
                                OooO0o0();
                                this.f19918o000oOoO = false;
                                z5 = true;
                            }
                            if (z3) {
                                OooO0o();
                                OooO0o0();
                                z3 = false;
                            }
                            if (z12 && this.f19908OoooOO0) {
                                OooO0o();
                            }
                            if (z12 && this.f19904OoooO) {
                                GLTextureView gLTextureView = this.f19917OooooOO.get();
                                if (gLTextureView == null ? false : gLTextureView.f19887OoooOOo) {
                                    OooOOOO oooOOOO4 = GLTextureView.f19876OoooOo0;
                                    if (GLTextureView.f19876OoooOo0.OooO0OO()) {
                                        OooO0o0();
                                    }
                                } else {
                                    OooO0o0();
                                }
                            }
                            if (z12) {
                                OooOOOO oooOOOO5 = GLTextureView.f19876OoooOo0;
                                if (GLTextureView.f19876OoooOo0.OooO0Oo()) {
                                    this.f19916OooooO0.OooO0OO();
                                }
                            }
                            if (!this.f19906OoooO00 && !this.f19907OoooO0O) {
                                if (this.f19908OoooOO0) {
                                    OooO0o();
                                }
                                this.f19907OoooO0O = true;
                                this.f19905OoooO0 = false;
                                OooOOOO oooOOOO6 = GLTextureView.f19876OoooOo0;
                                GLTextureView.f19876OoooOo0.notifyAll();
                            }
                            if (this.f19906OoooO00 && this.f19907OoooO0O) {
                                this.f19907OoooO0O = false;
                                OooOOOO oooOOOO7 = GLTextureView.f19876OoooOo0;
                                GLTextureView.f19876OoooOo0.notifyAll();
                            }
                            if (z4) {
                                this.f19913OoooOoo = true;
                                OooOOOO oooOOOO8 = GLTextureView.f19876OoooOo0;
                                GLTextureView.f19876OoooOo0.notifyAll();
                                z4 = false;
                                z10 = false;
                            }
                            if (OooO0O0()) {
                                if (this.f19904OoooO) {
                                    z3 = z3;
                                } else {
                                    if (z5) {
                                        z3 = z3;
                                        runnable = null;
                                        z5 = false;
                                    } else {
                                        OooOOOO oooOOOO9 = GLTextureView.f19876OoooOo0;
                                        OooOOOO oooOOOO10 = GLTextureView.f19876OoooOo0;
                                        OooOOO oooOOO = oooOOOO10.f19929OooO0o0;
                                        if (oooOOO == this || oooOOO == null) {
                                            oooOOOO10.f19929OooO0o0 = this;
                                            oooOOOO10.notifyAll();
                                        } else {
                                            oooOOOO10.OooO0O0();
                                            if (!oooOOOO10.f19927OooO0OO) {
                                                OooOOO oooOOO2 = oooOOOO10.f19929OooO0o0;
                                                if (oooOOO2 != null) {
                                                    oooOOO2.f19918o000oOoO = true;
                                                    oooOOOO10.notifyAll();
                                                }
                                                z2 = false;
                                            }
                                            if (z2) {
                                                try {
                                                    this.f19916OooooO0.OooO0o0();
                                                    this.f19904OoooO = true;
                                                    oooOOOO10.notifyAll();
                                                    runnable = null;
                                                    z6 = true;
                                                } catch (RuntimeException e) {
                                                    OooOOOO oooOOOO11 = GLTextureView.f19876OoooOo0;
                                                    OooOOOO oooOOOO12 = GLTextureView.f19876OoooOo0;
                                                    if (oooOOOO12.f19929OooO0o0 == this) {
                                                        oooOOOO12.f19929OooO0o0 = null;
                                                    }
                                                    oooOOOO12.notifyAll();
                                                    throw e;
                                                }
                                            }
                                        }
                                        z2 = true;
                                        if (z2) {
                                            this.f19916OooooO0.OooO0o0();
                                            this.f19904OoooO = true;
                                            oooOOOO10.notifyAll();
                                            runnable = null;
                                            z6 = true;
                                        }
                                    }
                                    if (this.f19904OoooO && !this.f19908OoooOO0) {
                                        this.f19908OoooOO0 = true;
                                        z7 = true;
                                        z8 = true;
                                        z9 = true;
                                    }
                                    if (this.f19908OoooOO0) {
                                        if (this.f19915Ooooo0o) {
                                            int i3 = this.f19909OoooOOO;
                                            int i4 = this.f19910OoooOOo;
                                            this.f19915Ooooo0o = false;
                                            i = i3;
                                            i2 = i4;
                                            z = false;
                                            z7 = true;
                                            z9 = true;
                                            z10 = true;
                                        } else {
                                            z = false;
                                        }
                                        this.f19912OoooOoO = z;
                                        OooOOOO oooOOOO13 = GLTextureView.f19876OoooOo0;
                                        GLTextureView.f19876OoooOo0.notifyAll();
                                        break;
                                    }
                                }
                                runnable = null;
                                if (this.f19904OoooO) {
                                    this.f19908OoooOO0 = true;
                                    z7 = true;
                                    z8 = true;
                                    z9 = true;
                                }
                                if (this.f19908OoooOO0) {
                                    if (this.f19915Ooooo0o) {
                                        int i5 = this.f19909OoooOOO;
                                        int i6 = this.f19910OoooOOo;
                                        this.f19915Ooooo0o = false;
                                        i = i5;
                                        i2 = i6;
                                        z = false;
                                        z7 = true;
                                        z9 = true;
                                        z10 = true;
                                    } else {
                                        z = false;
                                    }
                                    this.f19912OoooOoO = z;
                                    OooOOOO oooOOOO14 = GLTextureView.f19876OoooOo0;
                                    GLTextureView.f19876OoooOo0.notifyAll();
                                    break;
                                }
                            } else {
                                z3 = z3;
                            }
                            OooOOOO oooOOOO15 = GLTextureView.f19876OoooOo0;
                            GLTextureView.f19876OoooOo0.wait();
                            z3 = z3;
                        }
                    }
                    if (runnableRemove != null) {
                        runnableRemove.run();
                        runnableRemove = runnable;
                    } else {
                        if (z7) {
                            if (this.f19916OooooO0.OooO00o()) {
                                z7 = false;
                            } else {
                                OooOOOO oooOOOO16 = GLTextureView.f19876OoooOo0;
                                OooOOOO oooOOOO17 = GLTextureView.f19876OoooOo0;
                                synchronized (oooOOOO17) {
                                    this.f19905OoooO0 = true;
                                    oooOOOO17.notifyAll();
                                }
                            }
                            OooOOOO oooOOOO18 = GLTextureView.f19876OoooOo0;
                            synchronized (GLTextureView.f19876OoooOo0) {
                                OooO0o();
                                OooO0o0();
                                throw th;
                            }
                        }
                        if (z8) {
                            OooOOO0 oooOOO0 = this.f19916OooooO0;
                            GL gl = oooOOO0.f19923OooO0o.getGL();
                            GLTextureView gLTextureView2 = oooOOO0.f19919OooO00o.get();
                            if (gLTextureView2 != null) {
                                OooOo00 oooOo00 = gLTextureView2.f19885OoooOO0;
                                if (oooOo00 != null) {
                                    gl = oooOo00.OooO00o();
                                }
                                int i7 = gLTextureView2.f19888o000oOoO;
                                if ((i7 & 3) != 0) {
                                    gl = GLDebugHelper.wrap(gl, (i7 & 1) != 0 ? 1 : 0, (Writer) ((i7 & 2) != 0 ? new OooOo() : runnable));
                                }
                            }
                            gl10 = (GL10) gl;
                            OooOOOO oooOOOO19 = GLTextureView.f19876OoooOo0;
                            GLTextureView.f19876OoooOo0.OooO00o(gl10);
                            z8 = false;
                        }
                        if (z6) {
                            GLTextureView gLTextureView3 = this.f19917OooooOO.get();
                            if (gLTextureView3 != null) {
                                gLTextureView3.f19877Oooo.onSurfaceCreated(gl10, this.f19916OooooO0.f19924OooO0o0);
                            }
                            z6 = false;
                        }
                        if (z9) {
                            GLTextureView gLTextureView4 = this.f19917OooooOO.get();
                            if (gLTextureView4 != null) {
                                gLTextureView4.f19877Oooo.onSurfaceChanged(gl10, i, i2);
                            }
                            z9 = false;
                        }
                        GLTextureView gLTextureView5 = this.f19917OooooOO.get();
                        if (gLTextureView5 != null) {
                            gLTextureView5.f19877Oooo.onDrawFrame(gl10);
                        }
                        OooOOO0 oooOOO1 = this.f19916OooooO0;
                        int iEglGetError = !oooOOO1.f19920OooO0O0.eglSwapBuffers(oooOOO1.f19921OooO0OO, oooOOO1.f19922OooO0Oo) ? oooOOO1.f19920OooO0O0.eglGetError() : 12288;
                        if (iEglGetError != 12288) {
                            if (iEglGetError != 12302) {
                                Log.w("GLThread", OooOOO0.OooO0Oo("eglSwapBuffers", iEglGetError));
                                OooOOOO oooOOOO20 = GLTextureView.f19876OoooOo0;
                                OooOOOO oooOOOO21 = GLTextureView.f19876OoooOo0;
                                synchronized (oooOOOO21) {
                                    this.f19905OoooO0 = true;
                                    oooOOOO21.notifyAll();
                                }
                            } else {
                                z3 = true;
                            }
                            if (z10) {
                                z4 = true;
                            }
                        }
                        z3 = z3;
                        if (z10) {
                            z4 = true;
                        }
                    }
                    z3 = z3;
                } catch (Throwable th) {
                    OooOOOO oooOOOO110 = GLTextureView.f19876OoooOo0;
                    synchronized (GLTextureView.f19876OoooOo0) {
                        OooO0o();
                        OooO0o0();
                        throw th;
                    }
                }
            }
        }

        public final boolean OooO0O0() {
            return !this.f19900Oooo && this.f19906OoooO00 && !this.f19905OoooO0 && this.f19909OoooOOO > 0 && this.f19910OoooOOo > 0 && (this.f19912OoooOoO || this.f19911OoooOo0 == 1);
        }

        public final void OooO0OO() {
            OooOOOO oooOOOO = GLTextureView.f19876OoooOo0;
            OooOOOO oooOOOO2 = GLTextureView.f19876OoooOo0;
            synchronized (oooOOOO2) {
                this.f19901Oooo0o = true;
                oooOOOO2.notifyAll();
                while (!this.f19902Oooo0oO) {
                    try {
                        OooOOOO oooOOOO3 = GLTextureView.f19876OoooOo0;
                        GLTextureView.f19876OoooOo0.wait();
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
            OooOOOO oooOOOO = GLTextureView.f19876OoooOo0;
            OooOOOO oooOOOO2 = GLTextureView.f19876OoooOo0;
            synchronized (oooOOOO2) {
                this.f19911OoooOo0 = i;
                oooOOOO2.notifyAll();
            }
        }

        public final void OooO0o() {
            if (this.f19908OoooOO0) {
                this.f19908OoooOO0 = false;
                this.f19916OooooO0.OooO0O0();
            }
        }

        public final void OooO0o0() {
            if (this.f19904OoooO) {
                this.f19916OooooO0.OooO0OO();
                this.f19904OoooO = false;
                OooOOOO oooOOOO = GLTextureView.f19876OoooOo0;
                OooOOOO oooOOOO2 = GLTextureView.f19876OoooOo0;
                if (oooOOOO2.f19929OooO0o0 == this) {
                    oooOOOO2.f19929OooO0o0 = null;
                }
                oooOOOO2.notifyAll();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("GLThread ");
            sbOooO0o0.append(getId());
            setName(sbOooO0o0.toString());
            try {
                OooO00o();
            } catch (InterruptedException unused) {
            } finally {
                OooOOOO oooOOOO = GLTextureView.f19876OoooOo0;
                GLTextureView.f19876OoooOo0.OooO0o0(this);
            }
        }
    }

    public static class OooOOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public WeakReference<GLTextureView> f19919OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public EGL10 f19920OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public EGLDisplay f19921OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public EGLSurface f19922OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public EGLContext f19923OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public EGLConfig f19924OooO0o0;

        public OooOOO0(WeakReference<GLTextureView> weakReference) {
            this.f19919OooO00o = weakReference;
        }

        public static String OooO0Oo(String str, int i) {
            return str + " failed: " + i;
        }

        public final boolean OooO00o() {
            if (this.f19920OooO0O0 == null) {
                throw new RuntimeException("egl not initialized");
            }
            if (this.f19921OooO0OO == null) {
                throw new RuntimeException("eglDisplay not initialized");
            }
            if (this.f19924OooO0o0 == null) {
                throw new RuntimeException("mEglConfig not initialized");
            }
            OooO0O0();
            GLTextureView gLTextureView = this.f19919OooO00o.get();
            EGLSurface eGLSurfaceEglCreateWindowSurface = null;
            if (gLTextureView != null) {
                OooOO0O oooOO0O = gLTextureView.f19881OoooO;
                EGL10 egl10 = this.f19920OooO0O0;
                EGLDisplay eGLDisplay = this.f19921OooO0OO;
                EGLConfig eGLConfig = this.f19924OooO0o0;
                SurfaceTexture surfaceTexture = gLTextureView.getSurfaceTexture();
                Objects.requireNonNull((OooO0o) oooOO0O);
                try {
                    eGLSurfaceEglCreateWindowSurface = egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, surfaceTexture, null);
                } catch (IllegalArgumentException e) {
                    Log.e("GLTextureView", "eglCreateWindowSurface", e);
                }
                this.f19922OooO0Oo = eGLSurfaceEglCreateWindowSurface;
            } else {
                this.f19922OooO0Oo = null;
            }
            EGLSurface eGLSurface = this.f19922OooO0Oo;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                if (this.f19920OooO0O0.eglGetError() == 12299) {
                    Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            }
            if (this.f19920OooO0O0.eglMakeCurrent(this.f19921OooO0OO, eGLSurface, eGLSurface, this.f19923OooO0o)) {
                return true;
            }
            Log.w("EGLHelper", OooO0Oo("eglMakeCurrent", this.f19920OooO0O0.eglGetError()));
            return false;
        }

        public final void OooO0O0() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.f19922OooO0Oo;
            if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                return;
            }
            this.f19920OooO0O0.eglMakeCurrent(this.f19921OooO0OO, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            GLTextureView gLTextureView = this.f19919OooO00o.get();
            if (gLTextureView != null) {
                OooOO0O oooOO0O = gLTextureView.f19881OoooO;
                EGL10 egl10 = this.f19920OooO0O0;
                EGLDisplay eGLDisplay = this.f19921OooO0OO;
                EGLSurface eGLSurface3 = this.f19922OooO0Oo;
                Objects.requireNonNull((OooO0o) oooOO0O);
                egl10.eglDestroySurface(eGLDisplay, eGLSurface3);
            }
            this.f19922OooO0Oo = null;
        }

        public final void OooO0OO() {
            if (this.f19923OooO0o != null) {
                GLTextureView gLTextureView = this.f19919OooO00o.get();
                if (gLTextureView != null) {
                    OooOO0 oooOO1 = gLTextureView.f19884OoooO0O;
                    EGL10 egl10 = this.f19920OooO0O0;
                    EGLDisplay eGLDisplay = this.f19921OooO0OO;
                    EGLContext eGLContext = this.f19923OooO0o;
                    Objects.requireNonNull((OooO0OO) oooOO1);
                    if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                        Log.e("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
                        throw new RuntimeException(OooO0Oo("eglDestroyContex", egl10.eglGetError()));
                    }
                }
                this.f19923OooO0o = null;
            }
            EGLDisplay eGLDisplay2 = this.f19921OooO0OO;
            if (eGLDisplay2 != null) {
                this.f19920OooO0O0.eglTerminate(eGLDisplay2);
                this.f19921OooO0OO = null;
            }
        }

        public final void OooO0o0() {
            EGLConfig eGLConfig;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f19920OooO0O0 = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f19921OooO0OO = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                throw new RuntimeException("eglGetDisplay failed");
            }
            if (!this.f19920OooO0O0.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                throw new RuntimeException("eglInitialize failed");
            }
            GLTextureView gLTextureView = this.f19919OooO00o.get();
            if (gLTextureView == null) {
                this.f19924OooO0o0 = null;
                this.f19923OooO0o = null;
            } else {
                OooO oooO = gLTextureView.f19882OoooO0;
                EGL10 egl11 = this.f19920OooO0O0;
                EGLDisplay eGLDisplay = this.f19921OooO0OO;
                OooO00o oooO00o = (OooO00o) oooO;
                int[] iArr = new int[1];
                if (!egl11.eglChooseConfig(eGLDisplay, oooO00o.f19889OooO00o, null, 0, iArr)) {
                    GLTextureView gLTextureView2 = GLTextureView.this;
                    String stackTraceString = Log.getStackTraceString(new IllegalArgumentException("eglChooseConfig failed"));
                    oOo00o0o ooo00o0o = gLTextureView2.f19878Oooo0o;
                    if (ooo00o0o != null) {
                        ooo00o0o.OooO00o("unknown", stackTraceString);
                    }
                    throw new IllegalArgumentException("eglChooseConfig failed");
                }
                int i = iArr[0];
                if (i <= 0) {
                    throw new IllegalArgumentException("No configs match configSpec");
                }
                EGLConfig[] eGLConfigArr = new EGLConfig[i];
                if (!egl11.eglChooseConfig(eGLDisplay, oooO00o.f19889OooO00o, eGLConfigArr, i, iArr)) {
                    throw new IllegalArgumentException("eglChooseConfig#2 failed");
                }
                OooO0O0 oooO0O0 = (OooO0O0) oooO00o;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        eGLConfig = null;
                        break;
                    }
                    eGLConfig = eGLConfigArr[i2];
                    int iOooO00o = oooO0O0.OooO00o(egl11, eGLDisplay, eGLConfig, 12325);
                    int iOooO00o2 = oooO0O0.OooO00o(egl11, eGLDisplay, eGLConfig, 12326);
                    if (iOooO00o >= oooO0O0.f19897OooO0oo && iOooO00o2 >= oooO0O0.f19891OooO) {
                        int iOooO00o3 = oooO0O0.OooO00o(egl11, eGLDisplay, eGLConfig, 12324);
                        int iOooO00o4 = oooO0O0.OooO00o(egl11, eGLDisplay, eGLConfig, 12323);
                        int iOooO00o5 = oooO0O0.OooO00o(egl11, eGLDisplay, eGLConfig, 12322);
                        int iOooO00o6 = oooO0O0.OooO00o(egl11, eGLDisplay, eGLConfig, 12321);
                        if (iOooO00o3 == oooO0O0.f19893OooO0Oo && iOooO00o4 == oooO0O0.f19895OooO0o0 && iOooO00o5 == oooO0O0.f19894OooO0o && iOooO00o6 == oooO0O0.f19896OooO0oO) {
                            break;
                        }
                    }
                    i2++;
                }
                if (eGLConfig == null) {
                    throw new IllegalArgumentException("No config chosen");
                }
                this.f19924OooO0o0 = eGLConfig;
                OooOO0 oooOO1 = gLTextureView.f19884OoooO0O;
                EGL10 egl12 = this.f19920OooO0O0;
                EGLDisplay eGLDisplay2 = this.f19921OooO0OO;
                OooO0OO oooO0OO = (OooO0OO) oooOO1;
                Objects.requireNonNull(oooO0OO);
                int i3 = GLTextureView.this.f19886OoooOOO;
                int[] iArr2 = {12440, i3, 12344};
                EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
                if (i3 == 0) {
                    iArr2 = null;
                }
                this.f19923OooO0o = egl12.eglCreateContext(eGLDisplay2, eGLConfig, eGLContext, iArr2);
            }
            EGLContext eGLContext2 = this.f19923OooO0o;
            if (eGLContext2 == null || eGLContext2 == EGL10.EGL_NO_CONTEXT) {
                this.f19923OooO0o = null;
                throw new RuntimeException(OooO0Oo("createContext", this.f19920OooO0O0.eglGetError()));
            }
            this.f19922OooO0Oo = null;
        }
    }

    public static class OooOOOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f19925OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f19926OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f19927OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f19928OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public OooOOO f19929OooO0o0;

        public final synchronized void OooO00o(GL10 gl10) {
            if (!this.f19926OooO0O0) {
                OooO0O0();
                this.f19927OooO0OO = !gl10.glGetString(7937).startsWith("Q3Dimension MSM7500 ");
                notifyAll();
                this.f19928OooO0Oo = this.f19927OooO0OO ? false : true;
                this.f19926OooO0O0 = true;
            }
        }

        public final void OooO0O0() {
            if (this.f19925OooO00o) {
                return;
            }
            this.f19925OooO00o = true;
        }

        public final synchronized boolean OooO0OO() {
            return this.f19928OooO0Oo;
        }

        public final synchronized boolean OooO0Oo() {
            OooO0O0();
            return !this.f19927OooO0OO;
        }

        public final synchronized void OooO0o0(OooOOO oooOOO) {
            oooOOO.f19902Oooo0oO = true;
            if (this.f19929OooO0o0 == oooOOO) {
                this.f19929OooO0o0 = null;
            }
            notifyAll();
        }
    }

    public static class OooOo extends Writer {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public StringBuilder f19930Oooo0o = new StringBuilder();

        public final void OooO00o() {
            if (this.f19930Oooo0o.length() > 0) {
                Log.v("GLTextureView", this.f19930Oooo0o.toString());
                StringBuilder sb = this.f19930Oooo0o;
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
                    this.f19930Oooo0o.append(c);
                }
            }
        }
    }

    public interface OooOo00 {
        GL OooO00o();
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
        this.f19879Oooo0oO = new WeakReference<>(this);
        setSurfaceTextureListener(this);
    }

    public final void OooO0oO() {
        if (this.f19880Oooo0oo != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    public final void OooO0oo(int i, int i2) {
        OooOOO oooOOO = this.f19880Oooo0oo;
        Objects.requireNonNull(oooOOO);
        OooOOOO oooOOOO = f19876OoooOo0;
        synchronized (oooOOOO) {
            oooOOO.f19909OoooOOO = i;
            oooOOO.f19910OoooOOo = i2;
            oooOOO.f19915Ooooo0o = true;
            oooOOO.f19912OoooOoO = true;
            oooOOO.f19913OoooOoo = false;
            oooOOOO.notifyAll();
            while (!oooOOO.f19902Oooo0oO && !oooOOO.f19900Oooo && !oooOOO.f19913OoooOoo) {
                if (!(oooOOO.f19904OoooO && oooOOO.f19908OoooOO0 && oooOOO.OooO0O0())) {
                    break;
                }
                try {
                    f19876OoooOo0.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
    }

    public final void finalize() throws Throwable {
        try {
            OooOOO oooOOO = this.f19880Oooo0oo;
            if (oooOOO != null) {
                oooOOO.OooO0OO();
            }
        } finally {
            super.finalize();
        }
    }

    public int getDebugFlags() {
        return this.f19888o000oOoO;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.f19887OoooOOo;
    }

    public int getRenderMode() {
        int i;
        OooOOO oooOOO = this.f19880Oooo0oo;
        Objects.requireNonNull(oooOOO);
        synchronized (f19876OoooOo0) {
            i = oooOOO.f19911OoooOo0;
        }
        return i;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        if (this.f19883OoooO00 && this.f19877Oooo != null) {
            OooOOO oooOOO = this.f19880Oooo0oo;
            if (oooOOO != null) {
                Objects.requireNonNull(oooOOO);
                synchronized (f19876OoooOo0) {
                    i = oooOOO.f19911OoooOo0;
                }
            } else {
                i = 1;
            }
            OooOOO oooOOO2 = new OooOOO(this.f19879Oooo0oO);
            this.f19880Oooo0oo = oooOOO2;
            if (i != 1) {
                oooOOO2.OooO0Oo(i);
            }
            this.f19880Oooo0oo.start();
        }
        this.f19883OoooO00 = false;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        OooOOO oooOOO = this.f19880Oooo0oo;
        if (oooOOO != null) {
            oooOOO.OooO0OO();
        }
        this.f19883OoooO00 = true;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        getSurfaceTexture();
        OooO0oo(i3 - i, i4 - i2);
    }

    public final void onPause() {
        OooOOO oooOOO = this.f19880Oooo0oo;
        Objects.requireNonNull(oooOOO);
        OooOOOO oooOOOO = f19876OoooOo0;
        synchronized (oooOOOO) {
            oooOOO.f19903Oooo0oo = true;
            oooOOOO.notifyAll();
            while (!oooOOO.f19902Oooo0oO && !oooOOO.f19900Oooo) {
                try {
                    f19876OoooOo0.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        OooOOO oooOOO = this.f19880Oooo0oo;
        Objects.requireNonNull(oooOOO);
        OooOOOO oooOOOO = f19876OoooOo0;
        synchronized (oooOOOO) {
            oooOOO.f19906OoooO00 = true;
            oooOOOO.notifyAll();
            while (oooOOO.f19907OoooO0O && !oooOOO.f19902Oooo0oO) {
                try {
                    f19876OoooOo0.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        OooO0oo(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        OooOOO oooOOO = this.f19880Oooo0oo;
        Objects.requireNonNull(oooOOO);
        OooOOOO oooOOOO = f19876OoooOo0;
        synchronized (oooOOOO) {
            oooOOO.f19906OoooO00 = false;
            oooOOOO.notifyAll();
            while (!oooOOO.f19907OoooO0O && !oooOOO.f19902Oooo0oO) {
                try {
                    f19876OoooOo0.wait();
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
        OooOOO oooOOO = this.f19880Oooo0oo;
        Objects.requireNonNull(oooOOO);
        OooOOOO oooOOOO = f19876OoooOo0;
        synchronized (oooOOOO) {
            oooOOO.f19912OoooOoO = true;
            oooOOOO.notifyAll();
        }
    }

    public void setDebugFlags(int i) {
        this.f19888o000oOoO = i;
    }

    public void setEGLConfigChooser(OooO oooO) {
        OooO0oO();
        this.f19882OoooO0 = oooO;
    }

    public void setEGLContextClientVersion(int i) {
        OooO0oO();
        this.f19886OoooOOO = i;
    }

    public void setEGLContextFactory(OooOO0 oooOO1) {
        OooO0oO();
        this.f19884OoooO0O = oooOO1;
    }

    public void setEGLWindowSurfaceFactory(OooOO0O oooOO0O) {
        OooO0oO();
        this.f19881OoooO = oooOO0O;
    }

    public void setGLWrapper(OooOo00 oooOo00) {
        this.f19885OoooOO0 = oooOo00;
    }

    public void setMonitor(oOo00o0o ooo00o0o) {
        this.f19878Oooo0o = ooo00o0o;
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.f19887OoooOOo = z;
    }

    public void setRenderMode(int i) {
        this.f19880Oooo0oo.OooO0Oo(i);
    }

    public void setRenderer(Oooo000 oooo000) {
        OooO0oO();
        if (this.f19882OoooO0 == null) {
            this.f19882OoooO0 = new Oooo0(true);
        }
        if (this.f19884OoooO0O == null) {
            this.f19884OoooO0O = new OooO0OO();
        }
        if (this.f19881OoooO == null) {
            this.f19881OoooO = new OooO0o();
        }
        this.f19877Oooo = oooo000;
        OooOOO oooOOO = new OooOOO(this.f19879Oooo0oO);
        this.f19880Oooo0oo = oooOOO;
        oooOOO.start();
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser(new Oooo0(z));
    }

    public GLTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19879Oooo0oO = new WeakReference<>(this);
        setSurfaceTextureListener(this);
    }
}
