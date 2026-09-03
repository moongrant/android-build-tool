package com.google.android.exoplayer2.trackselection;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;

/* JADX INFO: loaded from: classes2.dex */
public interface OooO0OO {

    public interface OooO0O0 {
    }

    void OooO();

    TrackGroup OooO00o();

    void OooO0O0();

    void OooO0OO();

    Format OooO0Oo(int i);

    void OooO0o();

    void OooO0o0();

    int OooO0oO(int i);

    Format OooO0oo();

    int length();

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TrackGroup f14778OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int[] f14779OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f14780OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public final Object f14781OooO0Oo;

        public OooO00o(TrackGroup trackGroup, int... iArr) {
            this.f14778OooO00o = trackGroup;
            this.f14779OooO0O0 = iArr;
            this.f14780OooO0OO = 0;
            this.f14781OooO0Oo = null;
        }

        public OooO00o(TrackGroup trackGroup, int[] iArr, int i, @Nullable Object obj) {
            this.f14778OooO00o = trackGroup;
            this.f14779OooO0O0 = iArr;
            this.f14780OooO0OO = i;
            this.f14781OooO0Oo = obj;
        }
    }
}
