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
import p063o0000oO.oo000o;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000OOo0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O0ooO f1111OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Executor f1112OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Context f1113OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o000Oo0.OooO00o f1114OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ long f1115OooO0oo;

    public /* synthetic */ o000OOo0(o0O0ooO o0o0ooo, Context context, Executor executor, o000Oo0.OooO00o oooO00o, long j) {
        this.f1111OooO0Oo = o0o0ooo;
        this.f1113OooO0o0 = context;
        this.f1112OooO0o = executor;
        this.f1114OooO0oO = oooO00o;
        this.f1115OooO0oo = j;
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
        final o0O0ooO o0o0ooo = this.f1111OooO0Oo;
        Context context = this.f1113OooO0o0;
        final Executor executor = this.f1112OooO0o;
        final o000Oo0.OooO00o oooO00o = this.f1114OooO0oO;
        final long j = this.f1115OooO0oo;
        o0o0ooo.getClass();
        try {
            Application applicationOooO0O0 = o000oOoO.OooO0O0(context);
            o0o0ooo.f1171OooO = applicationOooO0O0;
            if (applicationOooO0O0 == null) {
                o0o0ooo.f1171OooO = o000oOoO.OooO00o(context);
            }
            o0OOO0o.OooO00o oooO00oOooo0OO = o0o0ooo.f1174OooO0OO.Oooo0OO();
            if (oooO00oOooo0OO == null) {
                throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
            }
            OooO0OO oooO0OO = new OooO0OO(o0o0ooo.f1175OooO0Oo, o0o0ooo.f1177OooO0o0);
            CameraSelector cameraSelectorOooo0O0 = o0o0ooo.f1174OooO0OO.Oooo0O0();
            o0o0ooo.f1176OooO0o = oooO00oOooo0OO.OooO00o(o0o0ooo.f1171OooO, oooO0OO, cameraSelectorOooo0O0);
            o0ooOOo.OooO00o oooO00oOooo0o0 = o0o0ooo.f1174OooO0OO.Oooo0o0();
            if (oooO00oOooo0o0 == null) {
                throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
            }
            o0o0ooo.f1178OooO0oO = oooO00oOooo0o0.OooO00o(o0o0ooo.f1171OooO, o0o0ooo.f1176OooO0o.OooO00o(), o0o0ooo.f1176OooO0o.OooO0OO());
            UseCaseConfigFactory.OooO0O0 oooO0O0Oooo0o = o0o0ooo.f1174OooO0OO.Oooo0o();
            if (oooO0O0Oooo0o == null) {
                throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
            }
            o0o0ooo.f1179OooO0oo = oooO0O0Oooo0o.OooO00o(o0o0ooo.f1171OooO);
            if (executor instanceof o000O0O0) {
                ((o000O0O0) executor).OooO0O0(o0o0ooo.f1176OooO0o);
            }
            o0o0ooo.f1172OooO00o.OooO0O0(o0o0ooo.f1176OooO0o);
            CameraValidator.OooO00o(o0o0ooo.f1171OooO, o0o0ooo.f1172OooO00o, cameraSelectorOooo0O0);
            o0o0ooo.OooO0OO();
            oooO00o.OooO0O0(null);
        } catch (InitializationException | CameraValidator.CameraIdListIncorrectException | RuntimeException e) {
            if (SystemClock.elapsedRealtime() - j < 2500) {
                StringBuilder sbOooO00o = o00O0000.OooO00o("Retry init. Start time ", j, " current time ");
                sbOooO00o.append(SystemClock.elapsedRealtime());
                o00O0O0.OooO("CameraX", sbOooO00o.toString(), e);
                Handler handler = o0o0ooo.f1177OooO0o0;
                ?? r7 = new Runnable() { // from class: Oooo0oO.o00
                    @Override // java.lang.Runnable
                    public final void run() {
                        Executor executor2 = executor;
                        long j2 = j;
                        o000Oo0.OooO00o oooO00o2 = oooO00o;
                        o0O0ooO o0o0ooo2 = o0o0ooo;
                        executor2.execute(new o000OOo0(o0o0ooo2, o0o0ooo2.f1171OooO, executor2, oooO00o2, j2));
                    }
                };
                if (Build.VERSION.SDK_INT >= 28) {
                    oo000o.OooO00o.OooO0O0(handler, r7);
                    return;
                }
                Message messageObtain = Message.obtain(handler, (Runnable) r7);
                messageObtain.obj = "retry_token";
                handler.sendMessageDelayed(messageObtain, 500L);
                return;
            }
            synchronized (o0o0ooo.f1173OooO0O0) {
                o0o0ooo.f1181OooOO0O = o0O0ooO.OooO00o.INITIALIZING_ERROR;
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
