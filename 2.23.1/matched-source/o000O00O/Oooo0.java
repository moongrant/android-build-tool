package o000O00O;

import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.Renderer;
import com.facebook.appevents.AppEventsConstants;
import net.sqlcipher.database.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class Oooo0 implements o00O000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f33970OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final p074o000OO0o.o0ooOOo f33971OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f33972OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f33973OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f33974OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f33975OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f33976OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f33977OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f33978OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f33979OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f33980OooOO0O;

    public Oooo0(p074o000OO0o.o0ooOOo o0ooooo, boolean z) {
        OooOO0(2500, 0, "bufferForPlaybackMs", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        OooOO0(5000, 0, "bufferForPlaybackAfterRebufferMs", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        OooOO0(SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH, 2500, "minBufferMs", "bufferForPlaybackMs");
        OooOO0(SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        OooOO0(SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH, SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH, "maxBufferMs", "minBufferMs");
        OooOO0(0, 0, "backBufferDurationMs", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        this.f33971OooO00o = o0ooooo;
        long j = SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH;
        this.f33972OooO0O0 = p080o000OoO.o000OO00.Oooo0OO(j);
        this.f33973OooO0OO = p080o000OoO.o000OO00.Oooo0OO(j);
        this.f33974OooO0Oo = p080o000OoO.o000OO00.Oooo0OO(2500);
        this.f33976OooO0o0 = p080o000OoO.o000OO00.Oooo0OO(5000);
        this.f33975OooO0o = -1;
        this.f33979OooOO0 = 13107200;
        this.f33977OooO0oO = z;
        this.f33978OooO0oo = p080o000OoO.o000OO00.Oooo0OO(0);
        this.f33970OooO = false;
    }

    public static void OooOO0(int i, int i2, String str, String str2) {
        p080o000OoO.o00O0O.OooO0O0(i >= i2, str + " cannot be less than " + str2);
    }

    @Override // o000O00O.o00O000
    public final void OooO() {
        OooOO0O(true);
    }

    @Override // o000O00O.o00O000
    public final void OooO00o() {
        OooOO0O(false);
    }

    @Override // o000O00O.o00O000
    public final boolean OooO0O0() {
        return this.f33970OooO;
    }

    @Override // o000O00O.o00O000
    public final long OooO0OO() {
        return this.f33978OooO0oo;
    }

    @Override // o000O00O.o00O000
    public final boolean OooO0Oo(long j, float f, boolean z, long j2) {
        int i;
        long jOooOo0o = p080o000OoO.o000OO00.OooOo0o(j, f);
        long jMin = z ? this.f33976OooO0o0 : this.f33974OooO0Oo;
        if (j2 != -9223372036854775807L) {
            jMin = Math.min(j2 / 2, jMin);
        }
        if (jMin > 0 && jOooOo0o < jMin) {
            if (!this.f33977OooO0oO) {
                p074o000OO0o.o0ooOOo o0ooooo = this.f33971OooO00o;
                synchronized (o0ooooo) {
                    i = o0ooooo.f34466OooO0Oo * o0ooooo.f34464OooO0O0;
                }
                if (i >= this.f33979OooOO0) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // o000O00O.o00O000
    public final void OooO0o() {
        OooOO0O(true);
    }

    @Override // o000O00O.o00O000
    public final p074o000OO0o.o0ooOOo OooO0o0() {
        return this.f33971OooO00o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o000O00O.o00O000
    public final void OooO0oO(Renderer[] rendererArr, androidx.media3.exoplayer.trackselection.OooO0o[] oooO0oArr) {
        int iMax = this.f33975OooO0o;
        if (iMax == -1) {
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 13107200;
                if (i < rendererArr.length) {
                    if (oooO0oArr[i] != null) {
                        switch (rendererArr[i].OooOOOO()) {
                            case -2:
                                i3 = 0;
                                i2 += i3;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i3 = 144310272;
                                i2 += i3;
                                break;
                            case 1:
                                i2 += i3;
                                break;
                            case 2:
                                i3 = 131072000;
                                i2 += i3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i3 = 131072;
                                i2 += i3;
                                break;
                        }
                    }
                    i++;
                } else {
                    iMax = Math.max(13107200, i2);
                }
            }
        }
        this.f33979OooOO0 = iMax;
        this.f33971OooO00o.OooO00o(iMax);
    }

    @Override // o000O00O.o00O000
    public final boolean OooO0oo(long j, float f) {
        int i;
        p074o000OO0o.o0ooOOo o0ooooo = this.f33971OooO00o;
        synchronized (o0ooooo) {
            i = o0ooooo.f34466OooO0Oo * o0ooooo.f34464OooO0O0;
        }
        boolean z = true;
        boolean z2 = i >= this.f33979OooOO0;
        long j2 = this.f33973OooO0OO;
        long jMin = this.f33972OooO0O0;
        if (f > 1.0f) {
            jMin = Math.min(p080o000OoO.o000OO00.OooOo00(jMin, f), j2);
        }
        if (j < Math.max(jMin, 500000L)) {
            if (!this.f33977OooO0oO && z2) {
                z = false;
            }
            this.f33980OooOO0O = z;
            if (!z && j < 500000) {
                Log.OooO0o("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= j2 || z2) {
            this.f33980OooOO0O = false;
        }
        return this.f33980OooOO0O;
    }

    public final void OooOO0O(boolean z) {
        int i = this.f33975OooO0o;
        if (i == -1) {
            i = 13107200;
        }
        this.f33979OooOO0 = i;
        this.f33980OooOO0O = false;
        if (z) {
            p074o000OO0o.o0ooOOo o0ooooo = this.f33971OooO00o;
            synchronized (o0ooooo) {
                if (o0ooooo.f34463OooO00o) {
                    o0ooooo.OooO00o(0);
                }
            }
        }
    }
}
