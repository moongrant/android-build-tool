package p430o0OoOOO0;

import android.os.Looper;
import android.view.MotionEvent;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.vm.message.PrivateChatVM;
import java.util.Timer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;
import p641o0ooOOOO.j5;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00O000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O00OO f45799OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ PrivateChatVM f45800OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MotionEvent f45801OooO0o0;

    public /* synthetic */ o00O000(o00O00OO o00o00oo2, MotionEvent motionEvent, PrivateChatVM privateChatVM) {
        this.f45799OooO0Oo = o00o00oo2;
        this.f45801OooO0o0 = motionEvent;
        this.f45800OooO0o = privateChatVM;
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
        r0 = r1.f45814OooO0OO;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
        r2 = r1.f45819OooO0oo;
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
        o00O00OO this$0 = this.f45799OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ?? motionEvent = this.f45801OooO0o0;
        Intrinsics.checkNotNullParameter(motionEvent, "$motionEvent");
        ?? privateChatVM = this.f45800OooO0o;
        Intrinsics.checkNotNullParameter(privateChatVM, "$privateChatVM");
        j5 j5Var = this$0.f45813OooO0O0;
        PrivateChatActivity privateChatActivity = this$0.f45812OooO00o;
        if (j5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            j5Var = null;
        }
        j5Var.f58171OooO0o.f58595OooO0o.setImageResource(oO00OOO.icon_voice_prepare);
        j5 j5Var2 = this$0.f45813OooO0O0;
        if (j5Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            j5Var2 = null;
        }
        j5Var2.f58171OooO0o.f58592OooO0O0.setVisibility(8);
        j5 j5Var3 = this$0.f45813OooO0O0;
        if (j5Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            j5Var3 = null;
        }
        j5Var3.f58171OooO0o.f58597OooO0oO.setVisibility(8);
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
                this$0.f45818OooO0oO.stop();
                if (this$0.f45819OooO0oo > 1000) {
                    if (this$0.f45811OooO) {
                        this$0.f45811OooO = false;
                        float rawY = motionEvent.getRawY();
                        f2 = this$0.f45817OooO0o0;
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
                this$0.f45811OooO = false;
                ?? OooO0OO2 = o0000.OooO0OO(oO00OOo0.too_short_record);
                if (OooO0OO2 != 0 && !(zIsBlank2 = StringsKt.isBlank(OooO0OO2))) {
                    mainLooper2 = privateChatVM;
                    mainLooper2 = zIsBlank2;
                    z = false;
                    mainLooper2 = zIsBlank2;
                }
                if (!z) {
                    o000Oo0 o000oo0OooO00o = o000O00.OooO00o(OooO0OO2, "runnable");
                    Looper looperMyLooper = Looper.myLooper();
                    mainLooper2 = Looper.getMainLooper();
                    OooO0OO2 = Intrinsics.areEqual(looperMyLooper, (Object) mainLooper2);
                    if (OooO0OO2 != 0) {
                        o000oo0OooO00o.run();
                    } else {
                        OooO0OO2 = o000O0.f10355OooO0O0;
                        OooO0OO2.post(o000oo0OooO00o);
                    }
                }
                o00O00O o00o00o2 = this$0.f45821OooOO0O;
                if (o00o00o2 != null) {
                    o00o00o2.cancel();
                    this$0.f45821OooOO0O = null;
                }
                timer = this$0.f45820OooOO0;
                r5 = OooO0OO2;
                r4 = mainLooper2;
                r2 = OooO0OO2;
                r3 = mainLooper2;
                if (timer != null) {
                    timer.cancel();
                    Timer timer2 = this$0.f45820OooOO0;
                    Intrinsics.checkNotNull(timer2);
                    timer2.purge();
                    this$0.f45820OooOO0 = null;
                    r5 = r2;
                    r4 = r3;
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (this$0.f45819OooO0oo <= 1000) {
                    this$0.f45811OooO = false;
                    ?? OooO0OO3 = o0000.OooO0OO(oO00OOo0.too_short_record);
                    if (OooO0OO3 != 0 && !(zIsBlank = StringsKt.isBlank(OooO0OO3))) {
                        mainLooper = privateChatVM;
                        mainLooper = zIsBlank;
                        z = false;
                        mainLooper = zIsBlank;
                    }
                    if (!z) {
                        o000Oo0 o000oo0OooO00o2 = o000O00.OooO00o(OooO0OO3, "runnable");
                        Looper looperMyLooper2 = Looper.myLooper();
                        mainLooper = Looper.getMainLooper();
                        OooO0OO3 = Intrinsics.areEqual(looperMyLooper2, (Object) mainLooper);
                        if (OooO0OO3 != 0) {
                            o000oo0OooO00o2.run();
                        } else {
                            OooO0OO3 = o000O0.f10355OooO0O0;
                            OooO0OO3.post(o000oo0OooO00o2);
                        }
                    }
                    o00O00O o00o00o3 = this$0.f45821OooOO0O;
                    if (o00o00o3 != null) {
                        o00o00o3.cancel();
                        this$0.f45821OooOO0O = null;
                    }
                    timer = this$0.f45820OooOO0;
                    r5 = OooO0OO3;
                    r4 = mainLooper;
                    r2 = OooO0OO3;
                    r3 = mainLooper;
                    if (timer != null) {
                        timer.cancel();
                        Timer timer3 = this$0.f45820OooOO0;
                        Intrinsics.checkNotNull(timer3);
                        timer3.purge();
                        this$0.f45820OooOO0 = null;
                        r5 = r2;
                        r4 = r3;
                    }
                } else if (this$0.f45811OooO) {
                    this$0.f45811OooO = false;
                    float rawY2 = motionEvent.getRawY();
                    f = this$0.f45817OooO0o0;
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
            this$0.f45819OooO0oo = 0;
            o00O00 o00o01 = new o00O00(this$0, 0);
            privateChatActivity.runOnUiThread(o00o01);
            r0 = o00o01;
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
            if (this$0.f45819OooO0oo <= r6) {
                this$0.f45811OooO = false;
                String strOooO0OO = o0000.OooO0OO(oO00OOo0.too_short_record);
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    z = false;
                }
                if (!z) {
                    o000Oo0 o000oo0OooO00o3 = o000O00.OooO00o(strOooO0OO, r0);
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o3.run();
                    } else {
                        o000O0.f10355OooO0O0.post(o000oo0OooO00o3);
                    }
                }
                o00O00O o00o00o4 = this$0.f45821OooOO0O;
                if (o00o00o4 != null) {
                    o00o00o4.cancel();
                    this$0.f45821OooOO0O = null;
                }
                Timer timer4 = this$0.f45820OooOO0;
                if (timer4 != null) {
                    timer4.cancel();
                    Timer timer5 = this$0.f45820OooOO0;
                    Intrinsics.checkNotNull(timer5);
                    timer5.purge();
                    this$0.f45820OooOO0 = null;
                }
            } else if (this$0.f45811OooO) {
                this$0.f45811OooO = false;
                if (motionEvent.getRawY() >= this$0.f45817OooO0o0) {
                    if (!privateChatVM.sendFilter()) {
                        return;
                    }
                    String str = this$0.f45814OooO0OO;
                    Intrinsics.checkNotNull(str);
                    privateChatVM.sendVoiceMessage(str, this$0.f45819OooO0oo);
                }
            }
            this$0.f45819OooO0oo = 0;
            privateChatActivity.runOnUiThread(new o00O00(this$0, 0));
            throw th;
        }
    }
}
