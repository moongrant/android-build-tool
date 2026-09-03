package p165o00OoOoo;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.OooO;
import com.bumptech.glide.OooOOOO;
import com.bumptech.glide.OooOo00;
import com.bumptech.glide.gifdecoder.GifDecoder;
import java.util.ArrayList;
import p144o00Oo.o000O00O;
import p154o00Oo0oo.o000000;
import p156o00OoO00.OooOO0;
import p158o00OoOO.o00Oo0;
import p170o00Ooo0o.o00O0O;
import p173o00OooOO.oo00o;
import p174o00OooOo.o00O0OO0;
import p174o00OooOo.o00OO00O;
import p174o00OooOo.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooO00o f38180OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final GifDecoder f38181OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Handler f38182OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList f38183OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOo00 f38184OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f38185OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOO0 f38186OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f38187OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooOOOO<Bitmap> f38188OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f38189OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public OooO00o f38190OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public Bitmap f38191OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public OooO00o f38192OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public o000000<Bitmap> f38193OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f38194OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f38195OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f38196OooOOo0;

    @VisibleForTesting
    public static class OooO00o extends p172o00OooO0.o000000<Bitmap> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final long f38197OooO;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final Handler f38198OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int f38199OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public Bitmap f38200OooOO0;

        public OooO00o(Handler handler, int i, long j) {
            this.f38198OooO0oO = handler;
            this.f38199OooO0oo = i;
            this.f38197OooO = j;
        }

        @Override // p172o00OooO0.o00000OO
        public final void OooO0O0(@NonNull Object obj) {
            this.f38200OooOO0 = (Bitmap) obj;
            Handler handler = this.f38198OooO0oO;
            handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f38197OooO);
        }

        @Override // p172o00OooO0.o00000OO
        public final void OooO0Oo(@Nullable Drawable drawable) {
            this.f38200OooOO0 = null;
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
            o00O000 o00o001 = o00O000.this;
            if (i == 1) {
                o00o001.OooO0O0((OooO00o) message.obj);
                return true;
            }
            if (i != 2) {
                return false;
            }
            o00o001.f38184OooO0Oo.OooOOO0((OooO00o) message.obj);
            return false;
        }
    }

    public o00O000(com.bumptech.glide.OooO0OO oooO0OO, com.bumptech.glide.gifdecoder.OooO00o oooO00o, int i, int i2, o00Oo0 o00oo1, Bitmap bitmap) {
        OooOO0 oooOO1 = oooO0OO.f12944OooO0o0;
        OooO oooO = oooO0OO.f12945OooO0oO;
        OooOo00 oooOo00OooO0oo = com.bumptech.glide.OooO0OO.OooO0oo(oooO.getBaseContext());
        OooOOOO<Bitmap> oooOOOOOooo0oo = com.bumptech.glide.OooO0OO.OooO0oo(oooO.getBaseContext()).OooO0oO().OooO0O0(((o00O0O) new o00O0O().OooO(o000O00O.f37588OooO00o).Oooo0o()).Oooo000(true).OooOo0O(i, i2));
        this.f38183OooO0OO = new ArrayList();
        this.f38184OooO0Oo = oooOo00OooO0oo;
        Handler handler = new Handler(Looper.getMainLooper(), new OooO0OO());
        this.f38186OooO0o0 = oooOO1;
        this.f38182OooO0O0 = handler;
        this.f38188OooO0oo = oooOOOOOooo0oo;
        this.f38181OooO00o = oooO00o;
        OooO0OO(o00oo1, bitmap);
    }

    public final void OooO00o() {
        if (!this.f38185OooO0o || this.f38187OooO0oO) {
            return;
        }
        OooO00o oooO00o = this.f38192OooOOO;
        if (oooO00o != null) {
            this.f38192OooOOO = null;
            OooO0O0(oooO00o);
            return;
        }
        this.f38187OooO0oO = true;
        GifDecoder gifDecoder = this.f38181OooO00o;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) gifDecoder.OooO0o0());
        gifDecoder.OooO0O0();
        this.f38190OooOO0O = new OooO00o(this.f38182OooO0O0, gifDecoder.OooO0o(), jUptimeMillis);
        OooOOOO OoooOOo2 = this.f38188OooO0oo.OooO0O0(new o00O0O().OooOooO(new oo00o(Double.valueOf(Math.random())))).OoooOOo(gifDecoder);
        OoooOOo2.OoooO(this.f38190OooOO0O, null, OoooOOo2, o00O0OO0.f38344OooO00o);
    }

    @VisibleForTesting
    public final void OooO0O0(OooO00o oooO00o) {
        this.f38187OooO0oO = false;
        boolean z = this.f38189OooOO0;
        Handler handler = this.f38182OooO0O0;
        if (z) {
            handler.obtainMessage(2, oooO00o).sendToTarget();
            return;
        }
        if (!this.f38185OooO0o) {
            this.f38192OooOOO = oooO00o;
            return;
        }
        if (oooO00o.f38200OooOO0 != null) {
            Bitmap bitmap = this.f38191OooOO0o;
            if (bitmap != null) {
                this.f38186OooO0o0.OooO0Oo(bitmap);
                this.f38191OooOO0o = null;
            }
            OooO00o oooO00o2 = this.f38180OooO;
            this.f38180OooO = oooO00o;
            ArrayList arrayList = this.f38183OooO0OO;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((OooO0O0) arrayList.get(size)).OooO00o();
                }
            }
            if (oooO00o2 != null) {
                handler.obtainMessage(2, oooO00o2).sendToTarget();
            }
        }
        OooO00o();
    }

    public final void OooO0OO(o000000<Bitmap> o000000Var, Bitmap bitmap) {
        o00OO00O.OooO0O0(o000000Var);
        this.f38193OooOOO0 = o000000Var;
        o00OO00O.OooO0O0(bitmap);
        this.f38191OooOO0o = bitmap;
        this.f38188OooO0oo = this.f38188OooO0oo.OooO0O0(new o00O0O().Oooo0OO(o000000Var, true));
        this.f38194OooOOOO = o00OO0O0.OooO0OO(bitmap);
        this.f38195OooOOOo = bitmap.getWidth();
        this.f38196OooOOo0 = bitmap.getHeight();
    }
}
