package p022Oooo00O;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import o000OO.OooOOO0;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final class oo0OOoo extends CameraCaptureSession.StateCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0O0OOOo f905OooO00o;

    public oo0OOoo(o0O0OOOo o0o0oooo) {
        this.f905OooO00o = o0o0oooo;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(@NonNull CameraCaptureSession cameraCaptureSession) {
        o0O0OOOo o0o0oooo = this.f905OooO00o;
        o0o0oooo.OooOOo(cameraCaptureSession);
        o0o0oooo.OooOO0(o0o0oooo);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    @RequiresApi(api = 26)
    public final void onCaptureQueueEmpty(@NonNull CameraCaptureSession cameraCaptureSession) {
        o0O0OOOo o0o0oooo = this.f905OooO00o;
        o0o0oooo.OooOOo(cameraCaptureSession);
        o0o0oooo.OooOO0O(o0o0oooo);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(@NonNull CameraCaptureSession cameraCaptureSession) {
        o0O0OOOo o0o0oooo = this.f905OooO00o;
        o0o0oooo.OooOOo(cameraCaptureSession);
        o0o0oooo.OooOO0o(o0o0oooo);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
        o00O000.OooO00o<Void> oooO00o;
        try {
            this.f905OooO00o.OooOOo(cameraCaptureSession);
            o0O0OOOo o0o0oooo = this.f905OooO00o;
            o0o0oooo.OooOOO0(o0o0oooo);
            synchronized (this.f905OooO00o.f759OooO00o) {
                OooOOO0.OooO0o0(this.f905OooO00o.f758OooO, "OpenCaptureSession completer should not null");
                o0O0OOOo o0o0oooo2 = this.f905OooO00o;
                oooO00o = o0o0oooo2.f758OooO;
                o0o0oooo2.f758OooO = null;
            }
        } finally {
            synchronized (this.f905OooO00o.f759OooO00o) {
                OooOOO0.OooO0o0(this.f905OooO00o.f758OooO, "OpenCaptureSession completer should not null");
                o0O0OOOo o0o0oooo3 = this.f905OooO00o;
                oooO00o = o0o0oooo3.f758OooO;
                o0o0oooo3.f758OooO = null;
                oooO00o.OooO0OO(new IllegalStateException("onConfigureFailed"));
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
        o00O000.OooO00o<Void> oooO00o;
        try {
            this.f905OooO00o.OooOOo(cameraCaptureSession);
            o0O0OOOo o0o0oooo = this.f905OooO00o;
            o0o0oooo.OooOOO(o0o0oooo);
            synchronized (this.f905OooO00o.f759OooO00o) {
                OooOOO0.OooO0o0(this.f905OooO00o.f758OooO, "OpenCaptureSession completer should not null");
                o0O0OOOo o0o0oooo2 = this.f905OooO00o;
                oooO00o = o0o0oooo2.f758OooO;
                o0o0oooo2.f758OooO = null;
            }
        } finally {
            synchronized (this.f905OooO00o.f759OooO00o) {
                OooOOO0.OooO0o0(this.f905OooO00o.f758OooO, "OpenCaptureSession completer should not null");
                o0O0OOOo o0o0oooo3 = this.f905OooO00o;
                oooO00o = o0o0oooo3.f758OooO;
                o0o0oooo3.f758OooO = null;
                oooO00o.OooO0O0(null);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(@NonNull CameraCaptureSession cameraCaptureSession) {
        o0O0OOOo o0o0oooo = this.f905OooO00o;
        o0o0oooo.OooOOo(cameraCaptureSession);
        o0o0oooo.OooOOOO(o0o0oooo);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    @RequiresApi(api = 23)
    public final void onSurfacePrepared(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull Surface surface) {
        o0O0OOOo o0o0oooo = this.f905OooO00o;
        o0o0oooo.OooOOo(cameraCaptureSession);
        o0o0oooo.OooOOo0(o0o0oooo, surface);
    }
}
