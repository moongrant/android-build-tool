package p700oO0Oo;

import android.os.Looper;
import android.view.MotionEvent;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.vm.message.PrivateChatVM;
import java.util.Timer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p074o000O0oo.OooOOO;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p649o0ooOOoo.cc;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00000OO implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0000 f52882Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ MotionEvent f52883Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatVM f52884Oooo0oo;

    public /* synthetic */ o00000OO(o0000 o0000Var, MotionEvent motionEvent, PrivateChatVM privateChatVM) {
        this.f52882Oooo0o = o0000Var;
        this.f52883Oooo0oO = motionEvent;
        this.f52884Oooo0oo = privateChatVM;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0101 A[PHI: r0
      0x0101: PHI (r0v20 java.util.Timer) = (r0v17 java.util.Timer), (r0v28 java.util.Timer) binds: [B:62:0x00ff, B:31:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.lang.Runnable
    public final void run() {
        Timer timer;
        o0000 this$0 = this.f52882Oooo0o;
        MotionEvent motionEvent = this.f52883Oooo0oO;
        PrivateChatVM privateChatVM = this.f52884Oooo0oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(motionEvent, "$motionEvent");
        Intrinsics.checkNotNullParameter(privateChatVM, "$privateChatVM");
        cc ccVar = this$0.f52864OooO0O0;
        if (ccVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar = null;
        }
        ccVar.f49098OooO0oO.f49748OooO0o.setImageResource(R.drawable.icon_voice_prepare);
        cc ccVar2 = this$0.f52864OooO0O0;
        if (ccVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar2 = null;
        }
        ccVar2.f49098OooO0oO.f49745OooO0O0.setVisibility(8);
        cc ccVar3 = this$0.f52864OooO0O0;
        if (ccVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar3 = null;
        }
        ccVar3.f49098OooO0oO.f49750OooO0oO.setVisibility(8);
        boolean z = true;
        try {
            try {
                this$0.f52869OooO0oO.stop();
                if (this$0.f52870OooO0oo <= 1000) {
                    this$0.f52862OooO = false;
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.too_short_record);
                    ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z = false;
                    }
                    if (!z) {
                        o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O0.run();
                        } else {
                            o00O000 o00o001 = o00O000.f34346OooO00o;
                            o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                        }
                    }
                    o0000Ooo o0000ooo = this$0.f52872OooOO0O;
                    if (o0000ooo != null) {
                        o0000ooo.cancel();
                        this$0.f52872OooOO0O = null;
                    }
                    timer = this$0.f52871OooOO0;
                    if (timer != null) {
                        timer.cancel();
                        Timer timer2 = this$0.f52871OooOO0;
                        Intrinsics.checkNotNull(timer2);
                        timer2.purge();
                        this$0.f52871OooOO0 = null;
                    }
                } else if (this$0.f52862OooO) {
                    this$0.f52862OooO = false;
                    if (motionEvent.getRawY() >= this$0.f52868OooO0o0) {
                        if (!this$0.f52863OooO00o.Oooo0o()) {
                            return;
                        }
                        String str = this$0.f52865OooO0OO;
                        Intrinsics.checkNotNull(str);
                        privateChatVM.sendVoiceMessage(str, this$0.f52870OooO0oo);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (this$0.f52870OooO0oo <= 1000) {
                    this$0.f52862OooO = false;
                    String strOooO0OO2 = o000O0O0.OooO0OO(R.string.too_short_record);
                    ToastUtil toastUtil2 = ToastUtil.f12568OooO0O0;
                    if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                        z = false;
                    }
                    if (!z) {
                        o0O0ooO o0o0oooOooO0O1 = OooOOO.OooO0O0(toastUtil2, strOooO0OO2, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O1.run();
                        } else {
                            o00O000 o00o002 = o00O000.f34346OooO00o;
                            o00O000.f34348OooO0OO.post(o0o0oooOooO0O1);
                        }
                    }
                    o0000Ooo o0000ooo2 = this$0.f52872OooOO0O;
                    if (o0000ooo2 != null) {
                        o0000ooo2.cancel();
                        this$0.f52872OooOO0O = null;
                    }
                    timer = this$0.f52871OooOO0;
                    if (timer != null) {
                        timer.cancel();
                        Timer timer3 = this$0.f52871OooOO0;
                        Intrinsics.checkNotNull(timer3);
                        timer3.purge();
                        this$0.f52871OooOO0 = null;
                    }
                } else if (this$0.f52862OooO) {
                    this$0.f52862OooO = false;
                    if (motionEvent.getRawY() >= this$0.f52868OooO0o0) {
                        if (!this$0.f52863OooO00o.Oooo0o()) {
                            return;
                        }
                        String str2 = this$0.f52865OooO0OO;
                        Intrinsics.checkNotNull(str2);
                        privateChatVM.sendVoiceMessage(str2, this$0.f52870OooO0oo);
                    }
                }
            }
            this$0.f52870OooO0oo = 0;
            this$0.OooO0O0(0);
        } catch (Throwable th) {
            if (this$0.f52870OooO0oo <= 1000) {
                this$0.f52862OooO = false;
                String strOooO0OO3 = o000O0O0.OooO0OO(R.string.too_short_record);
                ToastUtil toastUtil3 = ToastUtil.f12568OooO0O0;
                if (strOooO0OO3 != null && !StringsKt.isBlank(strOooO0OO3)) {
                    z = false;
                }
                if (!z) {
                    o0O0ooO o0o0oooOooO0O2 = OooOOO.OooO0O0(toastUtil3, strOooO0OO3, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o0o0oooOooO0O2.run();
                    } else {
                        o00O000 o00o003 = o00O000.f34346OooO00o;
                        o00O000.f34348OooO0OO.post(o0o0oooOooO0O2);
                    }
                }
                o0000Ooo o0000ooo3 = this$0.f52872OooOO0O;
                if (o0000ooo3 != null) {
                    o0000ooo3.cancel();
                    this$0.f52872OooOO0O = null;
                }
                Timer timer4 = this$0.f52871OooOO0;
                if (timer4 != null) {
                    timer4.cancel();
                    Timer timer5 = this$0.f52871OooOO0;
                    Intrinsics.checkNotNull(timer5);
                    timer5.purge();
                    this$0.f52871OooOO0 = null;
                }
            } else if (this$0.f52862OooO) {
                this$0.f52862OooO = false;
                if (motionEvent.getRawY() >= this$0.f52868OooO0o0) {
                    if (!this$0.f52863OooO00o.Oooo0o()) {
                        return;
                    }
                    String str3 = this$0.f52865OooO0OO;
                    Intrinsics.checkNotNull(str3);
                    privateChatVM.sendVoiceMessage(str3, this$0.f52870OooO0oo);
                }
            }
            this$0.f52870OooO0oo = 0;
            this$0.OooO0O0(0);
            throw th;
        }
    }
}
