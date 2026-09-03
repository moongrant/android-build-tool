package p238o00oOooO;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.OooOOO;
import com.bumptech.glide.OooOOO0;
import com.bumptech.glide.gifdecoder.GifDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p214o00oO0.o00O;
import p217o00oO00o.o00000OO;
import p219o00oO0O0.o0oOOo;
import p234o00oOoOO.oOO0OO0O;
import p235o00oOoOo.ooooO0O0;
import p237o00oOoo0.o0O000Oo;
import p239o00oOooo.b;
import p243o00oo00O.o000O000;

/* JADX INFO: loaded from: classes.dex */
public final class oo000000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooO00o f34086OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final GifDecoder f34087OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Handler f34088OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<OooO0O0> f34089OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOOO f34090OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f34091OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0oOOo f34092OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f34093OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooOOO0<Bitmap> f34094OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f34095OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public OooO00o f34096OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public Bitmap f34097OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public OooO00o f34098OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public o00000OO<Bitmap> f34099OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f34100OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f34101OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f34102OooOOo0;

    @VisibleForTesting
    public static class OooO00o extends ooooO0O0<Bitmap> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final Handler f34103Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final long f34104OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final int f34105OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public Bitmap f34106OoooO0O;

        public OooO00o(Handler handler, int i, long j) {
            super(Integer.MIN_VALUE, Integer.MIN_VALUE);
            this.f34103Oooo = handler;
            this.f34105OoooO00 = i;
            this.f34104OoooO0 = j;
        }

        @Override // p235o00oOoOo.oOOO0O0o
        public final void onLoadCleared(@Nullable Drawable drawable) {
            this.f34106OoooO0O = null;
        }

        @Override // p235o00oOoOo.oOOO0O0o
        public final void onResourceReady(@NonNull Object obj, @Nullable o0O000Oo o0o000oo2) {
            this.f34106OoooO0O = (Bitmap) obj;
            this.f34103Oooo.sendMessageAtTime(this.f34103Oooo.obtainMessage(1, this), this.f34104OoooO0);
        }
    }

    public interface OooO0O0 {
        void OooO00o();
    }

    public class OooO0OO implements Handler.Callback {
        public OooO0OO() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                oo000000.this.OooO0O0((OooO00o) message.obj);
                return true;
            }
            if (i != 2) {
                return false;
            }
            oo000000.this.f34090OooO0Oo.OooO0o0((OooO00o) message.obj);
            return false;
        }
    }

    public oo000000(com.bumptech.glide.OooO0OO oooO0OO, GifDecoder gifDecoder, int i, int i2, o00000OO<Bitmap> o00000oo2, Bitmap bitmap) {
        o0oOOo o0oooo2 = oooO0OO.f12373Oooo0oO;
        OooOOO oooOOOOooO = com.bumptech.glide.OooO0OO.OooO(oooO0OO.OooO0Oo());
        OooOOO0<Bitmap> oooOOO0Oooo0 = com.bumptech.glide.OooO0OO.OooO(oooO0OO.OooO0Oo()).OooO0O0().OooO0OO(((oOO0OO0O) oOO0OO0O.Oooo00o(o00O.f33387OooO00o).Oooo00O()).OooOoo0(true).OooOo0(i, i2));
        this.f34089OooO0OO = new ArrayList();
        this.f34090OooO0Oo = oooOOOOooO;
        Handler handler = new Handler(Looper.getMainLooper(), new OooO0OO());
        this.f34092OooO0o0 = o0oooo2;
        this.f34088OooO0O0 = handler;
        this.f34094OooO0oo = oooOOO0Oooo0;
        this.f34087OooO00o = gifDecoder;
        OooO0OO(o00000oo2, bitmap);
    }

    public final void OooO00o() {
        if (!this.f34091OooO0o || this.f34093OooO0oO) {
            return;
        }
        OooO00o oooO00o = this.f34098OooOOO;
        if (oooO00o != null) {
            this.f34098OooOOO = null;
            OooO0O0(oooO00o);
            return;
        }
        this.f34093OooO0oO = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) this.f34087OooO00o.OooO0Oo());
        this.f34087OooO00o.OooO0O0();
        this.f34096OooOO0O = new OooO00o(this.f34088OooO0O0, this.f34087OooO00o.OooO0o(), jUptimeMillis);
        OooOOO0<Bitmap> oooOOO0OoooO0 = this.f34094OooO0oo.OooO0OO(new oOO0OO0O().OooOoOO(new b(Double.valueOf(Math.random())))).OoooO0(this.f34087OooO00o);
        oooOOO0OoooO0.Oooo0o(this.f34096OooOO0O, oooOOO0OoooO0);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<o00oOooO.oo000000$OooO0O0>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList, java.util.List<o00oOooO.oo000000$OooO0O0>] */
    @VisibleForTesting
    public final void OooO0O0(OooO00o oooO00o) {
        this.f34093OooO0oO = false;
        if (this.f34095OooOO0) {
            this.f34088OooO0O0.obtainMessage(2, oooO00o).sendToTarget();
            return;
        }
        if (!this.f34091OooO0o) {
            this.f34098OooOOO = oooO00o;
            return;
        }
        if (oooO00o.f34106OoooO0O != null) {
            Bitmap bitmap = this.f34097OooOO0o;
            if (bitmap != null) {
                this.f34092OooO0o0.OooO0O0(bitmap);
                this.f34097OooOO0o = null;
            }
            OooO00o oooO00o2 = this.f34086OooO;
            this.f34086OooO = oooO00o;
            int size = this.f34089OooO0OO.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((OooO0O0) this.f34089OooO0OO.get(size)).OooO00o();
                }
            }
            if (oooO00o2 != null) {
                this.f34088OooO0O0.obtainMessage(2, oooO00o2).sendToTarget();
            }
        }
        OooO00o();
    }

    public final void OooO0OO(o00000OO<Bitmap> o00000oo2, Bitmap bitmap) {
        Objects.requireNonNull(o00000oo2, "Argument must not be null");
        this.f34099OooOOO0 = o00000oo2;
        Objects.requireNonNull(bitmap, "Argument must not be null");
        this.f34097OooOO0o = bitmap;
        this.f34094OooO0oo = this.f34094OooO0oo.OooO0OO(new oOO0OO0O().Oooo000(o00000oo2, true));
        this.f34100OooOOOO = o000O000.OooO0Oo(bitmap);
        this.f34101OooOOOo = bitmap.getWidth();
        this.f34102OooOOo0 = bitmap.getHeight();
    }
}
