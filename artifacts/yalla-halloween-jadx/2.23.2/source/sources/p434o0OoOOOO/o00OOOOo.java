package p434o0OoOOOO;

import android.os.Looper;
import android.view.MotionEvent;
import androidx.activity.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.vm.message.PrivateChatVM;
import java.util.Timer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p405o0Oo0OOO.oO0O00oO;
import p562o0oOo000.o000000;
import p562o0oOo000.o0O0O00;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00OOOOo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0oOOo f46967OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ PrivateChatVM f46968OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MotionEvent f46969OooO0o0;

    public /* synthetic */ o00OOOOo(o0oOOo o0oooo, MotionEvent motionEvent, PrivateChatVM privateChatVM) {
        this.f46967OooO0Oo = o0oooo;
        this.f46969OooO0o0 = motionEvent;
        this.f46968OooO0o = privateChatVM;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00f9 A[PHI: r0 r2 r3 r4
      0x00f9: PHI (r0v20 java.util.Timer) = (r0v6 java.util.Timer), (r0v29 java.util.Timer) binds: [B:62:0x00f7, B:31:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x00f9: PHI (r2v20 ??) = (r2v42 ??), (r2v43 ??) binds: [B:62:0x00f7, B:31:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x00f9: PHI (r3v9 ??) = (r3v30 ??), (r3v31 ??) binds: [B:62:0x00f7, B:31:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x00f9: PHI (r4v19 boolean) = (r4v14 boolean), (r4v22 boolean) binds: [B:62:0x00f7, B:31:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ad, code lost:
    
        if (r0 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011c, code lost:
    
        if (r0 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0120, code lost:
    
        r2 = r2;
        r3 = r3;
        r2 = r2;
        r3 = r3;
        r0 = r0;
        r2 = r2;
        r3 = r3;
        r2 = r2;
        r3 = r3;
        r2 = r2;
        r3 = r3;
        r0 = r0;
        r2 = r2;
        r3 = r3;
        r0 = r1.f46980OooO0OO;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
        r2 = r1.f46985OooO0oo;
        r6 = r2;
        r3.sendVoiceMessage(r0, r6);
        r2 = r2;
        r3 = r3;
        r6 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.MotionEvent, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [android.view.MotionEvent] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v30, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.yalla.yalla.ui.vm.message.PrivateChatVM, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [android.os.Looper, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.os.Looper, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.yalla.yalla.ui.vm.message.PrivateChatVM] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v9 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        float f;
        boolean zSendFilter;
        ?? mainLooper;
        Timer timer;
        boolean zIsBlank;
        ?? r3;
        ?? r2;
        ?? r4;
        ?? r5;
        float f2;
        boolean zSendFilter2;
        ?? mainLooper2;
        boolean zIsBlank2;
        ?? r0 = "runnable";
        o0oOOo this$0 = this.f46967OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ?? motionEvent = this.f46969OooO0o0;
        Intrinsics.checkNotNullParameter(motionEvent, "$motionEvent");
        ?? privateChatVM = this.f46968OooO0o;
        Intrinsics.checkNotNullParameter(privateChatVM, "$privateChatVM");
        oO0O00oO oo0o00oo = this$0.f46979OooO0O0;
        PrivateChatActivity privateChatActivity = this$0.f46978OooO00o;
        if (oo0o00oo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oo0o00oo = null;
        }
        oo0o00oo.f44883OooO0o.f45237OooO0o.setImageResource(o0O0O00.icon_voice_prepare);
        oO0O00oO oo0o00oo2 = this$0.f46979OooO0O0;
        if (oo0o00oo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oo0o00oo2 = null;
        }
        oo0o00oo2.f44883OooO0o.f45234OooO0O0.setVisibility(8);
        oO0O00oO oo0o00oo3 = this$0.f46979OooO0O0;
        if (oo0o00oo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oo0o00oo3 = null;
        }
        oo0o00oo3.f44883OooO0o.f45239OooO0oO.setVisibility(8);
        boolean z = true;
        ?? r6 = 1000;
        f = 1.401E-42f;
        r6 = 1000;
        f = 1.401E-42f;
        f = 1.401E-42f;
        r6 = 1000;
        f = 1.401E-42f;
        f = 1.401E-42f;
        r6 = 1000;
        f = 1.401E-42f;
        float f3 = 1.401E-42f;
        try {
            try {
                this$0.f46984OooO0oO.stop();
                if (this$0.f46985OooO0oo > 1000) {
                    if (this$0.f46977OooO) {
                        this$0.f46977OooO = false;
                        float rawY = motionEvent.getRawY();
                        f2 = this$0.f46983OooO0o0;
                        if (rawY >= f2) {
                            zSendFilter2 = privateChatVM.sendFilter();
                        }
                    }
                    r5 = motionEvent;
                    r4 = privateChatVM;
                    r5 = f;
                    r4 = privateChatVM;
                    r0 = zSendFilter;
                    motionEvent = f;
                    privateChatVM = privateChatVM;
                    r5 = motionEvent;
                    r4 = privateChatVM;
                    r5 = f2;
                    r4 = privateChatVM;
                    r0 = zSendFilter2;
                    motionEvent = f2;
                    privateChatVM = privateChatVM;
                }
                this$0.f46977OooO = false;
                ?? OooO0OO2 = o0000.OooO0OO(o000000.too_short_record);
                if (OooO0OO2 != 0 && !(zIsBlank2 = StringsKt.isBlank(OooO0OO2))) {
                    mainLooper2 = privateChatVM;
                    mainLooper2 = zIsBlank2;
                    z = false;
                    mainLooper2 = zIsBlank2;
                }
                if (!z) {
                    o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(OooO0OO2, "runnable");
                    Looper looperMyLooper = Looper.myLooper();
                    mainLooper2 = Looper.getMainLooper();
                    OooO0OO2 = Intrinsics.areEqual(looperMyLooper, (Object) mainLooper2);
                    if (OooO0OO2 != 0) {
                        o000oo0OooO00o.run();
                    } else {
                        OooO0OO2 = o000O00O.f13422OooO0O0;
                        OooO0OO2.post(o000oo0OooO00o);
                    }
                }
                o0O00o0 o0o00o1 = this$0.f46987OooOO0O;
                if (o0o00o1 != null) {
                    o0o00o1.cancel();
                    this$0.f46987OooOO0O = null;
                }
                timer = this$0.f46986OooOO0;
                r5 = OooO0OO2;
                r4 = mainLooper2;
                r2 = OooO0OO2;
                r3 = mainLooper2;
                if (timer != null) {
                    timer.cancel();
                    Timer timer2 = this$0.f46986OooOO0;
                    Intrinsics.checkNotNull(timer2);
                    timer2.purge();
                    this$0.f46986OooOO0 = null;
                    r5 = r2;
                    r4 = r3;
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (this$0.f46985OooO0oo <= 1000) {
                    this$0.f46977OooO = false;
                    ?? OooO0OO3 = o0000.OooO0OO(o000000.too_short_record);
                    if (OooO0OO3 != 0 && !(zIsBlank = StringsKt.isBlank(OooO0OO3))) {
                        mainLooper = privateChatVM;
                        mainLooper = zIsBlank;
                        z = false;
                        mainLooper = zIsBlank;
                    }
                    if (!z) {
                        o000Oo0 o000oo0OooO00o2 = OooOo00.OooO00o(OooO0OO3, "runnable");
                        Looper looperMyLooper2 = Looper.myLooper();
                        mainLooper = Looper.getMainLooper();
                        OooO0OO3 = Intrinsics.areEqual(looperMyLooper2, (Object) mainLooper);
                        if (OooO0OO3 != 0) {
                            o000oo0OooO00o2.run();
                        } else {
                            OooO0OO3 = o000O00O.f13422OooO0O0;
                            OooO0OO3.post(o000oo0OooO00o2);
                        }
                    }
                    o0O00o0 o0o00o2 = this$0.f46987OooOO0O;
                    if (o0o00o2 != null) {
                        o0o00o2.cancel();
                        this$0.f46987OooOO0O = null;
                    }
                    timer = this$0.f46986OooOO0;
                    r5 = OooO0OO3;
                    r4 = mainLooper;
                    r2 = OooO0OO3;
                    r3 = mainLooper;
                    if (timer != null) {
                        timer.cancel();
                        Timer timer3 = this$0.f46986OooOO0;
                        Intrinsics.checkNotNull(timer3);
                        timer3.purge();
                        this$0.f46986OooOO0 = null;
                        r5 = r2;
                        r4 = r3;
                    }
                } else if (this$0.f46977OooO) {
                    this$0.f46977OooO = false;
                    float rawY2 = motionEvent.getRawY();
                    f = this$0.f46983OooO0o0;
                    if (rawY2 >= f) {
                        zSendFilter = privateChatVM.sendFilter();
                    }
                }
            }
            r5 = motionEvent;
            r4 = privateChatVM;
            r5 = f;
            r4 = privateChatVM;
            r5 = motionEvent;
            r4 = privateChatVM;
            r5 = motionEvent;
            r4 = privateChatVM;
            r5 = f2;
            r4 = privateChatVM;
            r5 = motionEvent;
            r4 = privateChatVM;
            this$0.f46985OooO0oo = 0;
            o0oOO o0ooo2 = new o0oOO(this$0, 0);
            privateChatActivity.runOnUiThread(o0ooo2);
            r0 = o0ooo2;
            motionEvent = r5;
            privateChatVM = r4;
            r6 = f3;
            r5 = motionEvent;
            r4 = privateChatVM;
            r5 = f;
            r4 = privateChatVM;
            r0 = zSendFilter;
            motionEvent = f;
            privateChatVM = privateChatVM;
            r5 = motionEvent;
            r4 = privateChatVM;
            r5 = f2;
            r4 = privateChatVM;
            r0 = zSendFilter2;
            motionEvent = f2;
            privateChatVM = privateChatVM;
        } catch (Throwable th) {
            if (this$0.f46985OooO0oo <= r6) {
                this$0.f46977OooO = false;
                String strOooO0OO = o0000.OooO0OO(o000000.too_short_record);
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    z = false;
                }
                if (!z) {
                    o000Oo0 o000oo0OooO00o3 = OooOo00.OooO00o(strOooO0OO, r0);
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o3.run();
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o3);
                    }
                }
                o0O00o0 o0o00o3 = this$0.f46987OooOO0O;
                if (o0o00o3 != null) {
                    o0o00o3.cancel();
                    this$0.f46987OooOO0O = null;
                }
                Timer timer4 = this$0.f46986OooOO0;
                if (timer4 != null) {
                    timer4.cancel();
                    Timer timer5 = this$0.f46986OooOO0;
                    Intrinsics.checkNotNull(timer5);
                    timer5.purge();
                    this$0.f46986OooOO0 = null;
                }
            } else if (this$0.f46977OooO) {
                this$0.f46977OooO = false;
                if (motionEvent.getRawY() >= this$0.f46983OooO0o0) {
                    if (!privateChatVM.sendFilter()) {
                        return;
                    }
                    String str = this$0.f46980OooO0OO;
                    Intrinsics.checkNotNull(str);
                    privateChatVM.sendVoiceMessage(str, this$0.f46985OooO0oo);
                }
            }
            this$0.f46985OooO0oo = 0;
            privateChatActivity.runOnUiThread(new o0oOO(this$0, 0));
            throw th;
        }
    }
}
