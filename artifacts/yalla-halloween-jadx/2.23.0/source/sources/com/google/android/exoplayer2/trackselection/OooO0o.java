package com.google.android.exoplayer2.trackselection;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.util.Log;
import java.util.List;
import p226o00oOo00.o000O00O;
import p235o00oOooO.o00OO000;
import p235o00oOooO.o00OOO0;
import p235o00oOooO.o00OOO0O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface OooO0o extends TrackSelection {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000O00O f13732OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int[] f13733OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f13734OooO0OO;

        public OooO00o() {
            throw null;
        }

        public OooO00o(int i, o000O00O o000o00o2, int[] iArr) {
            if (iArr.length == 0) {
                Log.OooO0Oo("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f13732OooO00o = o000o00o2;
            this.f13733OooO0O0 = iArr;
            this.f13734OooO0OO = i;
        }
    }

    public interface OooO0O0 {
    }

    int OooO00o();

    boolean OooO0Oo(long j, o00OO000 o00oo001, List<? extends o00OOO0> list);

    void OooO0o();

    void OooO0o0(float f);

    @Nullable
    Object OooO0oO();

    void OooO0oo();

    void OooOO0O(boolean z);

    void OooOO0o();

    int OooOOO0(long j, List<? extends o00OOO0> list);

    void OooOOOO(long j, long j2, long j3, List<? extends o00OOO0> list, o00OOO0O[] o00ooo0oArr);

    OooOo OooOOOo();

    void OooOOo();

    int OooOOo0();
}
