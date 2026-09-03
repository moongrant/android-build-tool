package p028Oooo0oO;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraValidator;
import androidx.camera.core.impl.OooO0OO;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.o0OOO0o;
import androidx.camera.core.impl.o0ooOOo;
import java.util.concurrent.Executor;
import p031OoooO0.o000oOoO;
import p063o0000oO.o0Oo0oo;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000OOo0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O0ooO f1125OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Executor f1126OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Context f1127OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o00O000.OooO00o f1128OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ long f1129OooO0oo;

    public /* synthetic */ o000OOo0(o0O0ooO o0o0ooo, Context context, Executor executor, o00O000.OooO00o oooO00o, long j) {
        this.f1125OooO0Oo = o0o0ooo;
        this.f1127OooO0o0 = context;
        this.f1126OooO0o = executor;
        this.f1128OooO0oO = oooO00o;
        this.f1129OooO0oo = j;
    }

    /* JADX WARN: Type inference failed for: r7v6, types: [Oooo0oO.o00, java.lang.Runnable] */
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
    @Override // java.lang.Runnable
    public final void run() {
        final o0O0ooO o0o0ooo = this.f1125OooO0Oo;
        Context context = this.f1127OooO0o0;
        final Executor executor = this.f1126OooO0o;
        final o00O000.OooO00o oooO00o = this.f1128OooO0oO;
        final long j = this.f1129OooO0oo;
        o0o0ooo.getClass();
        try {
            Application applicationOooO0O0 = o000oOoO.OooO0O0(context);
            o0o0ooo.f1188OooO = applicationOooO0O0;
            if (applicationOooO0O0 == null) {
                o0o0ooo.f1188OooO = o000oOoO.OooO00o(context);
            }
            o0OOO0o.OooO00o oooO00oOooo0OO = o0o0ooo.f1191OooO0OO.Oooo0OO();
            if (oooO00oOooo0OO == null) {
                throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
            }
            OooO0OO oooO0OO = new OooO0OO(o0o0ooo.f1192OooO0Oo, o0o0ooo.f1194OooO0o0);
            CameraSelector cameraSelectorOooo0O0 = o0o0ooo.f1191OooO0OO.Oooo0O0();
            o0o0ooo.f1193OooO0o = oooO00oOooo0OO.OooO00o(o0o0ooo.f1188OooO, oooO0OO, cameraSelectorOooo0O0);
            o0ooOOo.OooO00o oooO00oOooo0o0 = o0o0ooo.f1191OooO0OO.Oooo0o0();
            if (oooO00oOooo0o0 == null) {
                throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
            }
            o0o0ooo.f1195OooO0oO = oooO00oOooo0o0.OooO00o(o0o0ooo.f1188OooO, o0o0ooo.f1193OooO0o.OooO00o(), o0o0ooo.f1193OooO0o.OooO0OO());
            UseCaseConfigFactory.OooO0O0 oooO0O0Oooo0o = o0o0ooo.f1191OooO0OO.Oooo0o();
            if (oooO0O0Oooo0o == null) {
                throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
            }
            o0o0ooo.f1196OooO0oo = oooO0O0Oooo0o.OooO00o(o0o0ooo.f1188OooO);
            if (executor instanceof o000O0O0) {
                ((o000O0O0) executor).OooO0O0(o0o0ooo.f1193OooO0o);
            }
            o0o0ooo.f1189OooO00o.OooO0O0(o0o0ooo.f1193OooO0o);
            CameraValidator.OooO00o(o0o0ooo.f1188OooO, o0o0ooo.f1189OooO00o, cameraSelectorOooo0O0);
            o0o0ooo.OooO0OO();
            oooO00o.OooO0O0(null);
        } catch (InitializationException | CameraValidator.CameraIdListIncorrectException | RuntimeException e) {
            if (SystemClock.elapsedRealtime() - j < 2500) {
                StringBuilder sbOooO00o = o00O0000.OooO00o("Retry init. Start time ", j, " current time ");
                sbOooO00o.append(SystemClock.elapsedRealtime());
                o00O0O0.OooO("CameraX", sbOooO00o.toString(), e);
                Handler handler = o0o0ooo.f1194OooO0o0;
                ?? r7 = new Runnable() { // from class: Oooo0oO.o00
                    @Override // java.lang.Runnable
                    public final void run() {
                        Executor executor2 = executor;
                        long j2 = j;
                        o00O000.OooO00o oooO00o2 = oooO00o;
                        o0O0ooO o0o0ooo2 = o0o0ooo;
                        executor2.execute(new o000OOo0(o0o0ooo2, o0o0ooo2.f1188OooO, executor2, oooO00o2, j2));
                    }
                };
                if (Build.VERSION.SDK_INT >= 28) {
                    o0Oo0oo.OooO00o.OooO0O0(handler, r7);
                    return;
                }
                Message messageObtain = Message.obtain(handler, (Runnable) r7);
                messageObtain.obj = "retry_token";
                handler.sendMessageDelayed(messageObtain, 500L);
                return;
            }
            synchronized (o0o0ooo.f1190OooO0O0) {
                o0o0ooo.f1198OooOO0O = o0O0ooO.OooO00o.INITIALIZING_ERROR;
            }
            if (e instanceof CameraValidator.CameraIdListIncorrectException) {
                o00O0O0.OooO0O0("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                oooO00o.OooO0O0(null);
            } else if (e instanceof InitializationException) {
                oooO00o.OooO0OO(e);
            } else {
                oooO00o.OooO0OO(new InitializationException(e));
            }
        }
    }
}
