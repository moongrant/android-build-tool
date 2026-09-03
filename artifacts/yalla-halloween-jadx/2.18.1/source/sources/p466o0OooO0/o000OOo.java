package p466o0OooO0;

import com.facebook.appevents.AppEventsConstants;
import com.google.android.exoplayer2.C;
import net.sqlcipher.database.SQLiteDatabase;
import p318o0O0oOo.o00000O0;
import p709oo0oOOo.OooOOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f40543OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOOO f40544OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f40545OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f40546OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f40547OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f40548OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f40549OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f40550OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f40551OooO0oo;

    public o000OOo() {
        OooOOOO oooOOOO = new OooOOOO();
        OooO00o(2500, 0, "bufferForPlaybackMs", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        OooO00o(5000, 0, "bufferForPlaybackAfterRebufferMs", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        OooO00o(SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH, 2500, "minBufferMs", "bufferForPlaybackMs");
        OooO00o(SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        OooO00o(SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH, SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH, "maxBufferMs", "minBufferMs");
        OooO00o(0, 0, "backBufferDurationMs", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        this.f40544OooO00o = oooOOOO;
        long j = SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH;
        this.f40545OooO0O0 = C.OooO00o(j);
        this.f40546OooO0OO = C.OooO00o(j);
        this.f40547OooO0Oo = C.OooO00o(2500);
        this.f40549OooO0o0 = C.OooO00o(5000);
        this.f40548OooO0o = -1;
        this.f40551OooO0oo = 13107200;
        this.f40550OooO0oO = C.OooO00o(0);
    }

    public static void OooO00o(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 21);
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        o00000O0.OooO0O0(z, sb.toString());
    }

    public final void OooO0O0(boolean z) {
        int i = this.f40548OooO0o;
        if (i == -1) {
            i = 13107200;
        }
        this.f40551OooO0oo = i;
        this.f40543OooO = false;
        if (z) {
            OooOOOO oooOOOO = this.f40544OooO00o;
            synchronized (oooOOOO) {
                if (oooOOOO.f53386OooO00o) {
                    synchronized (oooOOOO) {
                        boolean z2 = oooOOOO.f53389OooO0Oo > 0;
                        oooOOOO.f53389OooO0Oo = 0;
                        if (z2) {
                            oooOOOO.OooO0O0();
                        }
                    }
                }
            }
        }
    }
}
