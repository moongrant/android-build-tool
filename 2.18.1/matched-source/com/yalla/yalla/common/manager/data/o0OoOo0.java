package com.yalla.yalla.common.manager.data;

import android.os.Looper;
import androidx.lifecycle.Observer;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0OoOo0 implements Observer {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ o0OoOo0 f20639OooO0O0 = new o0OoOo0(0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ o0OoOo0 f20640OooO0OO = new o0OoOo0(1);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f20641OooO00o;

    public /* synthetic */ o0OoOo0(int i) {
        this.f20641OooO00o = i;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f20641OooO00o) {
            case 0:
                SharedMainMessageManager.m272_get_userDot_$lambda11$lambda3((Boolean) obj);
                break;
            default:
                Integer num = (Integer) obj;
                if (num != null && num.intValue() == 1) {
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.send_successfully);
                    ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                    if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                        o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o00O000 o00o001 = o00O000.f34346OooO00o;
                            o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                        } else {
                            o0o0oooOooO0O0.run();
                        }
                        break;
                    }
                } else if (num != null && num.intValue() == 2) {
                    String strOooO0OO2 = o000O0O0.OooO0OO(R.string.Added_successfully);
                    ToastUtil toastUtil2 = ToastUtil.f12568OooO0O0;
                    if (!(strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2))) {
                        o0O0ooO o0o0oooOooO0O1 = p074o000O0oo.OooOOO.OooO0O0(toastUtil2, strOooO0OO2, "runnable");
                        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o00O000 o00o002 = o00O000.f34346OooO00o;
                            o00O000.f34348OooO0OO.post(o0o0oooOooO0O1);
                        } else {
                            o0o0oooOooO0O1.run();
                        }
                        break;
                    }
                } else if (num != null && num.intValue() == 3) {
                    String strOooO0OO3 = o000O0O0.OooO0OO(R.string.Friends_Already);
                    ToastUtil toastUtil3 = ToastUtil.f12568OooO0O0;
                    if (!(strOooO0OO3 == null || StringsKt.isBlank(strOooO0OO3))) {
                        o0O0ooO o0o0oooOooO0O2 = p074o000O0oo.OooOOO.OooO0O0(toastUtil3, strOooO0OO3, "runnable");
                        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o00O000 o00o003 = o00O000.f34346OooO00o;
                            o00O000.f34348OooO0OO.post(o0o0oooOooO0O2);
                        } else {
                            o0o0oooOooO0O2.run();
                        }
                        break;
                    }
                }
                break;
        }
    }
}
