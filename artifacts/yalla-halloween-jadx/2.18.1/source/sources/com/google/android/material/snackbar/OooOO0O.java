package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static OooOO0O f17727OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final Object f17728OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Handler f17729OooO0O0 = new Handler(Looper.getMainLooper(), new OooO00o());

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public OooO0OO f17730OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public OooO0OO f17731OooO0Oo;

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
            synchronized (oooOO0O.f17728OooO00o) {
                if (oooOO0O.f17730OooO0OO == oooO0OO || oooOO0O.f17731OooO0Oo == oooO0OO) {
                    oooOO0O.OooO00o(oooO0OO, 2);
                }
            }
            return true;
        }
    }

    public interface OooO0O0 {
        void OooO00o();

        void OooO0O0(int i);
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final WeakReference<OooO0O0> f17733OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f17734OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f17735OooO0OO;

        public OooO0OO(int i, OooO0O0 oooO0O0) {
            this.f17733OooO00o = new WeakReference<>(oooO0O0);
            this.f17734OooO0O0 = i;
        }
    }

    public static OooOO0O OooO0O0() {
        if (f17727OooO0o0 == null) {
            f17727OooO0o0 = new OooOO0O();
        }
        return f17727OooO0o0;
    }

    public final boolean OooO00o(@NonNull OooO0OO oooO0OO, int i) {
        OooO0O0 oooO0O0 = oooO0OO.f17733OooO00o.get();
        if (oooO0O0 == null) {
            return false;
        }
        this.f17729OooO0O0.removeCallbacksAndMessages(oooO0OO);
        oooO0O0.OooO0O0(i);
        return true;
    }

    public final boolean OooO0OO(OooO0O0 oooO0O0) {
        OooO0OO oooO0OO = this.f17730OooO0OO;
        if (oooO0OO != null) {
            Objects.requireNonNull(oooO0OO);
            if (oooO0O0 != null && oooO0OO.f17733OooO00o.get() == oooO0O0) {
                return true;
            }
        }
        return false;
    }

    public final boolean OooO0Oo(OooO0O0 oooO0O0) {
        OooO0OO oooO0OO = this.f17731OooO0Oo;
        if (oooO0OO != null) {
            Objects.requireNonNull(oooO0OO);
            if (oooO0O0 != null && oooO0OO.f17733OooO00o.get() == oooO0O0) {
                return true;
            }
        }
        return false;
    }

    public final void OooO0o(OooO0O0 oooO0O0) {
        synchronized (this.f17728OooO00o) {
            if (OooO0OO(oooO0O0)) {
                OooO0OO oooO0OO = this.f17730OooO0OO;
                if (oooO0OO.f17735OooO0OO) {
                    oooO0OO.f17735OooO0OO = false;
                    OooO0oO(oooO0OO);
                }
            }
        }
    }

    public final void OooO0o0(OooO0O0 oooO0O0) {
        synchronized (this.f17728OooO00o) {
            if (OooO0OO(oooO0O0)) {
                OooO0OO oooO0OO = this.f17730OooO0OO;
                if (!oooO0OO.f17735OooO0OO) {
                    oooO0OO.f17735OooO0OO = true;
                    this.f17729OooO0O0.removeCallbacksAndMessages(oooO0OO);
                }
            }
        }
    }

    public final void OooO0oO(@NonNull OooO0OO oooO0OO) {
        int i = oooO0OO.f17734OooO0O0;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED : 2750;
        }
        this.f17729OooO0O0.removeCallbacksAndMessages(oooO0OO);
        Handler handler = this.f17729OooO0O0;
        handler.sendMessageDelayed(Message.obtain(handler, 0, oooO0OO), i);
    }

    public final void OooO0oo() {
        OooO0OO oooO0OO = this.f17731OooO0Oo;
        if (oooO0OO != null) {
            this.f17730OooO0OO = oooO0OO;
            this.f17731OooO0Oo = null;
            OooO0O0 oooO0O0 = oooO0OO.f17733OooO00o.get();
            if (oooO0O0 != null) {
                oooO0O0.OooO00o();
            } else {
                this.f17730OooO0OO = null;
            }
        }
    }
}
