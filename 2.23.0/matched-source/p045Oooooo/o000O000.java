package p045Oooooo;

import android.media.MediaFormat;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.AppEventQueue;
import com.google.android.exoplayer2.source.Oooo0;
import com.google.android.exoplayer2.source.o000oOoO;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p022Oooo00O.OooOo;
import p028Oooo0oO.o00O0O0;
import p209o00o0oo0.o00OO0OO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1966OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1967OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1968OooO0o0;

    public /* synthetic */ o000O000(int i, Object obj, Object obj2) {
        this.f1966OooO0Oo = i;
        this.f1968OooO0o0 = obj;
        this.f1967OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o00Oo0 o00oo1;
        Executor executor;
        int i = 1;
        switch (this.f1966OooO0Oo) {
            case 0:
                o0000Ooo.OooO oooO = (o0000Ooo.OooO) this.f1968OooO0o0;
                MediaFormat mediaFormat = (MediaFormat) this.f1967OooO0o;
                if (oooO.f1927OooO) {
                    o00O0O0.OooO0oo(o0000Ooo.this.f1898OooO00o, "Receives onOutputFormatChanged after codec is reset.");
                    return;
                }
                switch (o0000Ooo.OooO00o.f1939OooO00o[o0000Ooo.this.f1918OooOo00.ordinal()]) {
                    case 1:
                    case 8:
                    case 9:
                        return;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        synchronized (o0000Ooo.this.f1899OooO0O0) {
                            o0000Ooo o0000ooo = o0000Ooo.this;
                            o00oo1 = o0000ooo.f1913OooOOo;
                            executor = o0000ooo.f1915OooOOoo;
                            break;
                        }
                        try {
                            executor.execute(new OooOo(i, o00oo1, mediaFormat));
                            return;
                        } catch (RejectedExecutionException e) {
                            o00O0O0.OooO0OO(o0000Ooo.this.f1898OooO00o, "Unable to post to the supplied executor.", e);
                            return;
                        }
                    default:
                        throw new IllegalStateException("Unknown state: " + o0000Ooo.this.f1918OooOo00);
                }
            case 1:
                AppEventQueue.m4056add$lambda3((AccessTokenAppIdPair) this.f1968OooO0o0, (AppEvent) this.f1967OooO0o);
                return;
            default:
                Oooo0 oooo0 = (Oooo0) this.f1968OooO0o0;
                o00OO0OO o00oo0oo = (o00OO0OO) this.f1967OooO0o;
                oooo0.f13090OooOoo0 = oooo0.f13082OooOo0 == null ? o00oo0oo : new o00OO0OO.OooO0O0(-9223372036854775807L);
                oooo0.f13089OooOoo = o00oo0oo.OooO();
                boolean z = !oooo0.f13093Oooo0 && o00oo0oo.OooO() == -9223372036854775807L;
                oooo0.f13091OooOooO = z;
                oooo0.f13092OooOooo = z ? 7 : 1;
                ((o000oOoO) oooo0.f13071OooOO0).OooOo0(oooo0.f13089OooOoo, o00oo0oo.OooO0o(), oooo0.f13091OooOooO);
                if (oooo0.f13087OooOoO0) {
                    return;
                }
                oooo0.OooOoO0();
                return;
        }
    }
}
