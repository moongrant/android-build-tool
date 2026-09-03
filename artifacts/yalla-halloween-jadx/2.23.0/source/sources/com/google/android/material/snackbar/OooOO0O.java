package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static OooOO0O f17831OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final Object f17832OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Handler f17833OooO0O0 = new Handler(Looper.getMainLooper(), new OooO00o());

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public OooO0OO f17834OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public OooO0OO f17835OooO0Oo;

    public class OooO00o implements Handler.Callback {
        public OooO00o() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(@NonNull Message message) {
            if (message.what != 0) {
                return false;
            }
            OooOO0O oooOO0O = OooOO0O.this;
            OooO0OO oooO0OO = (OooO0OO) message.obj;
            synchronized (oooOO0O.f17832OooO00o) {
                if (oooOO0O.f17834OooO0OO == oooO0OO || oooOO0O.f17835OooO0Oo == oooO0OO) {
                    oooOO0O.OooO00o(oooO0OO, 2);
                }
            }
            return true;
        }
    }

    public interface OooO0O0 {
        void OooO00o(int i);

        void show();
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final WeakReference<OooO0O0> f17837OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f17838OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f17839OooO0OO;

        public OooO0OO(int i, BaseTransientBottomBar.OooO0OO oooO0OO) {
            this.f17837OooO00o = new WeakReference<>(oooO0OO);
            this.f17838OooO0O0 = i;
        }
    }

    public static OooOO0O OooO0O0() {
        if (f17831OooO0o0 == null) {
            f17831OooO0o0 = new OooOO0O();
        }
        return f17831OooO0o0;
    }

    public final boolean OooO00o(@NonNull OooO0OO oooO0OO, int i) {
        OooO0O0 oooO0O0 = oooO0OO.f17837OooO00o.get();
        if (oooO0O0 == null) {
            return false;
        }
        this.f17833OooO0O0.removeCallbacksAndMessages(oooO0OO);
        oooO0O0.OooO00o(i);
        return true;
    }

    public final boolean OooO0OO(BaseTransientBottomBar.OooO0OO oooO0OO) {
        OooO0OO oooO0OO2 = this.f17834OooO0OO;
        if (oooO0OO2 != null) {
            return oooO0OO != null && oooO0OO2.f17837OooO00o.get() == oooO0OO;
        }
        return false;
    }

    public final void OooO0Oo(BaseTransientBottomBar.OooO0OO oooO0OO) {
        synchronized (this.f17832OooO00o) {
            if (OooO0OO(oooO0OO)) {
                OooO0OO oooO0OO2 = this.f17834OooO0OO;
                if (!oooO0OO2.f17839OooO0OO) {
                    oooO0OO2.f17839OooO0OO = true;
                    this.f17833OooO0O0.removeCallbacksAndMessages(oooO0OO2);
                }
            }
        }
    }

    public final void OooO0o(@NonNull OooO0OO oooO0OO) {
        int i = oooO0OO.f17838OooO0O0;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED : 2750;
        }
        Handler handler = this.f17833OooO0O0;
        handler.removeCallbacksAndMessages(oooO0OO);
        handler.sendMessageDelayed(Message.obtain(handler, 0, oooO0OO), i);
    }

    public final void OooO0o0(BaseTransientBottomBar.OooO0OO oooO0OO) {
        synchronized (this.f17832OooO00o) {
            if (OooO0OO(oooO0OO)) {
                OooO0OO oooO0OO2 = this.f17834OooO0OO;
                if (oooO0OO2.f17839OooO0OO) {
                    oooO0OO2.f17839OooO0OO = false;
                    OooO0o(oooO0OO2);
                }
            }
        }
    }
}
