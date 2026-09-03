package p131o00OO0o;

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
import o00OO.OooOO0;
import o00OO0.OooOOO0;
import o00OOO0O.OooO0o;
import p126o00O0oOo.o00000OO;
import p127o00O0oo.oo0o0Oo;
import p129o00O0ooo.o0000oo;
import p532o0o0Oo.o000000O;
import p532o0o0Oo.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooO00o f37285OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final GifDecoder f37286OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Handler f37287OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList f37288OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOo00 f37289OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f37290OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0000oo f37291OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f37292OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooOOOO<Bitmap> f37293OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f37294OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public OooO00o f37295OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public Bitmap f37296OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public OooO00o f37297OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public o00000OO<Bitmap> f37298OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f37299OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f37300OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f37301OooOOo0;

    @VisibleForTesting
    public static class OooO00o extends o00OOO00.OooO0OO<Bitmap> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final long f37302OooO;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final Handler f37303OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int f37304OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public Bitmap f37305OooOO0;

        public OooO00o(Handler handler, int i, long j) {
            this.f37303OooO0oO = handler;
            this.f37304OooO0oo = i;
            this.f37302OooO = j;
        }

        @Override // o00OOO00.OooOOO0
        public final void OooO0OO(@NonNull Object obj) {
            this.f37305OooOO0 = (Bitmap) obj;
            Handler handler = this.f37303OooO0oO;
            handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f37302OooO);
        }

        @Override // o00OOO00.OooOOO0
        public final void OooO0o(@Nullable Drawable drawable) {
            this.f37305OooOO0 = null;
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
            OooOOO oooOOO = OooOOO.this;
            if (i == 1) {
                oooOOO.OooO0O0((OooO00o) message.obj);
                return true;
            }
            if (i != 2) {
                return false;
            }
            oooOOO.f37289OooO0Oo.OooOOO0((OooO00o) message.obj);
            return false;
        }
    }

    public OooOOO(com.bumptech.glide.OooO0OO oooO0OO, com.bumptech.glide.gifdecoder.OooO00o oooO00o, int i, int i2, OooOOO0 oooOOO0, Bitmap bitmap) {
        o0000oo o0000ooVar = oooO0OO.f9853OooO0o0;
        OooO oooO = oooO0OO.f9854OooO0oO;
        OooOo00 oooOo00OooO0oo = com.bumptech.glide.OooO0OO.OooO0oo(oooO.getBaseContext());
        OooOOOO<Bitmap> oooOOOOOooo0oo = com.bumptech.glide.OooO0OO.OooO0oo(oooO.getBaseContext()).OooO0oo().OooO0O0(((OooOO0) new OooOO0().OooO(oo0o0Oo.f36938OooO00o).Oooo0o()).Oooo000(true).OooOo0O(i, i2));
        this.f37288OooO0OO = new ArrayList();
        this.f37289OooO0Oo = oooOo00OooO0oo;
        Handler handler = new Handler(Looper.getMainLooper(), new OooO0OO());
        this.f37291OooO0o0 = o0000ooVar;
        this.f37287OooO0O0 = handler;
        this.f37293OooO0oo = oooOOOOOooo0oo;
        this.f37286OooO00o = oooO00o;
        OooO0OO(oooOOO0, bitmap);
    }

    public final void OooO00o() {
        if (!this.f37290OooO0o || this.f37292OooO0oO) {
            return;
        }
        OooO00o oooO00o = this.f37297OooOOO;
        if (oooO00o != null) {
            this.f37297OooOOO = null;
            OooO0O0(oooO00o);
            return;
        }
        this.f37292OooO0oO = true;
        GifDecoder gifDecoder = this.f37286OooO00o;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) gifDecoder.OooO0o0());
        gifDecoder.OooO0O0();
        this.f37295OooOO0O = new OooO00o(this.f37287OooO0O0, gifDecoder.OooO0o(), jUptimeMillis);
        OooOOOO OoooOOO2 = this.f37293OooO0oo.OooO0O0(new OooOO0().OooOooo(new OooO0o(Double.valueOf(Math.random())))).OoooOOO(gifDecoder);
        OoooOOO2.OoooO(this.f37295OooOO0O, null, OoooOOO2, o000000O.f54561OooO00o);
    }

    @VisibleForTesting
    public final void OooO0O0(OooO00o oooO00o) {
        this.f37292OooO0oO = false;
        boolean z = this.f37294OooOO0;
        Handler handler = this.f37287OooO0O0;
        if (z) {
            handler.obtainMessage(2, oooO00o).sendToTarget();
            return;
        }
        if (!this.f37290OooO0o) {
            this.f37297OooOOO = oooO00o;
            return;
        }
        if (oooO00o.f37305OooOO0 != null) {
            Bitmap bitmap = this.f37296OooOO0o;
            if (bitmap != null) {
                this.f37291OooO0o0.OooO0Oo(bitmap);
                this.f37296OooOO0o = null;
            }
            OooO00o oooO00o2 = this.f37285OooO;
            this.f37285OooO = oooO00o;
            ArrayList arrayList = this.f37288OooO0OO;
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

    public final void OooO0OO(o00000OO<Bitmap> o00000oo2, Bitmap bitmap) {
        o0000O00.OooO0O0(o00000oo2);
        this.f37298OooOOO0 = o00000oo2;
        o0000O00.OooO0O0(bitmap);
        this.f37296OooOO0o = bitmap;
        this.f37293OooO0oo = this.f37293OooO0oo.OooO0O0(new OooOO0().Oooo0OO(o00000oo2, true));
        this.f37299OooOOOO = p532o0o0Oo.o0000oo.OooO0OO(bitmap);
        this.f37300OooOOOo = bitmap.getWidth();
        this.f37301OooOOo0 = bitmap.getHeight();
    }
}
