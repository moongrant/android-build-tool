package p425o0OoO0o;

import androidx.annotation.Nullable;
import androidx.media3.common.o00Oo0;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.trackselection.MappingTrackSelector;
import androidx.media3.exoplayer.trackselection.OooO0o;
import o000O00O.o00OO000;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o00000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f46754OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00OO000[] f46755OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0o[] f46756OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00Oo0 f46757OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final Object f46758OooO0o0;

    public o00000O0(o00OO000[] o00oo000Arr, OooO0o[] oooO0oArr, o00Oo0 o00oo1, @Nullable MappingTrackSelector.MappedTrackInfo mappedTrackInfo) {
        this.f46755OooO0O0 = o00oo000Arr;
        this.f46756OooO0OO = (OooO0o[]) oooO0oArr.clone();
        this.f46757OooO0Oo = o00oo1;
        this.f46758OooO0o0 = mappedTrackInfo;
        this.f46754OooO00o = o00oo000Arr.length;
    }

    public final boolean OooO00o(@Nullable o00000O0 o00000o1, int i) {
        return o00000o1 != null && o00.OooO00o(this.f46755OooO0O0[i], o00000o1.f46755OooO0O0[i]) && o00.OooO00o(this.f46756OooO0OO[i], o00000o1.f46756OooO0OO[i]);
    }

    public final boolean OooO0O0(int i) {
        return this.f46755OooO0O0[i] != null;
    }
}
