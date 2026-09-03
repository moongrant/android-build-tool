package p203o00o0o0o;

import com.facebook.appevents.AppEventsConstants;
import com.google.android.exoplayer2.Renderer;
import com.google.android.exoplayer2.trackselection.OooO0o;
import com.google.android.exoplayer2.util.Log;
import net.sqlcipher.database.SQLiteDatabase;
import p244o00oo0Oo.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o000O000 implements o0o0Oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f39161OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00O000o f39162OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f39163OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f39164OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f39165OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f39166OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f39167OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f39168OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f39169OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f39170OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f39171OooOO0O;

    public o000O000(o00O000o o00o000o2, boolean z) {
        OooOO0(2500, 0, "bufferForPlaybackMs", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        OooOO0(5000, 0, "bufferForPlaybackAfterRebufferMs", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        OooOO0(SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH, 2500, "minBufferMs", "bufferForPlaybackMs");
        OooOO0(SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        OooOO0(SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH, SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH, "maxBufferMs", "minBufferMs");
        OooOO0(0, 0, "backBufferDurationMs", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        this.f39162OooO00o = o00o000o2;
        long j = SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH;
        this.f39163OooO0O0 = o0O00.Oooo0O0(j);
        this.f39164OooO0OO = o0O00.Oooo0O0(j);
        this.f39165OooO0Oo = o0O00.Oooo0O0(2500);
        this.f39167OooO0o0 = o0O00.Oooo0O0(5000);
        this.f39166OooO0o = -1;
        this.f39170OooOO0 = 13107200;
        this.f39168OooO0oO = z;
        this.f39169OooO0oo = o0O00.Oooo0O0(0);
        this.f39161OooO = false;
    }

    public static void OooOO0(int i, int i2, String str, String str2) {
        p245o00oo0o.o00O000o.OooO0O0(i >= i2, str + " cannot be less than " + str2);
    }

    @Override // p203o00o0o0o.o0o0Oo
    public final void OooO() {
        OooOO0O(true);
    }

    @Override // p203o00o0o0o.o0o0Oo
    public final void OooO00o() {
        OooOO0O(false);
    }

    @Override // p203o00o0o0o.o0o0Oo
    public final boolean OooO0O0() {
        return this.f39161OooO;
    }

    @Override // p203o00o0o0o.o0o0Oo
    public final long OooO0OO() {
        return this.f39169OooO0oo;
    }

    @Override // p203o00o0o0o.o0o0Oo
    public final boolean OooO0Oo(long j, float f, boolean z, long j2) {
        int i;
        long jOooOo0O = o0O00.OooOo0O(j, f);
        long jMin = z ? this.f39167OooO0o0 : this.f39165OooO0Oo;
        if (j2 != -9223372036854775807L) {
            jMin = Math.min(j2 / 2, jMin);
        }
        if (jMin > 0 && jOooOo0O < jMin) {
            if (!this.f39168OooO0oO) {
                o00O000o o00o000o2 = this.f39162OooO00o;
                synchronized (o00o000o2) {
                    i = o00o000o2.f40483OooO0Oo * o00o000o2.f40481OooO0O0;
                }
                if (i >= this.f39170OooOO0) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // p203o00o0o0o.o0o0Oo
    public final void OooO0o() {
        OooOO0O(true);
    }

    @Override // p203o00o0o0o.o0o0Oo
    public final o00O000o OooO0o0() {
        return this.f39162OooO00o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p203o00o0o0o.o0o0Oo
    public final void OooO0oO(Renderer[] rendererArr, OooO0o[] oooO0oArr) {
        int iMax = this.f39166OooO0o;
        if (iMax == -1) {
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 13107200;
                if (i < rendererArr.length) {
                    if (oooO0oArr[i] != null) {
                        switch (rendererArr[i].OooOOO()) {
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
        this.f39170OooOO0 = iMax;
        this.f39162OooO00o.OooO00o(iMax);
    }

    @Override // p203o00o0o0o.o0o0Oo
    public final boolean OooO0oo(long j, float f) {
        int i;
        o00O000o o00o000o2 = this.f39162OooO00o;
        synchronized (o00o000o2) {
            i = o00o000o2.f40483OooO0Oo * o00o000o2.f40481OooO0O0;
        }
        boolean z = true;
        boolean z2 = i >= this.f39170OooOO0;
        long j2 = this.f39164OooO0OO;
        long jMin = this.f39163OooO0O0;
        if (f > 1.0f) {
            jMin = Math.min(o0O00.OooOOo(jMin, f), j2);
        }
        if (j < Math.max(jMin, 500000L)) {
            if (!this.f39168OooO0oO && z2) {
                z = false;
            }
            this.f39171OooOO0O = z;
            if (!z && j < 500000) {
                Log.OooO0o("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= j2 || z2) {
            this.f39171OooOO0O = false;
        }
        return this.f39171OooOO0O;
    }

    public final void OooOO0O(boolean z) {
        int i = this.f39166OooO0o;
        if (i == -1) {
            i = 13107200;
        }
        this.f39170OooOO0 = i;
        this.f39171OooOO0O = false;
        if (z) {
            o00O000o o00o000o2 = this.f39162OooO00o;
            synchronized (o00o000o2) {
                if (o00o000o2.f40480OooO00o) {
                    o00o000o2.OooO00o(0);
                }
            }
        }
    }
}
