package p241o00oo0O;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.o0O0O00;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import com.google.android.exoplayer2.trackselection.OooO0o;
import p203o00o0o0o.o0O00O0o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f40402OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O00O0o[] f40403OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0o[] f40404OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0O0O00 f40405OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final Object f40406OooO0o0;

    public o00O000(o0O00O0o[] o0o00o0oArr, OooO0o[] oooO0oArr, o0O0O00 o0o0o00, @Nullable MappingTrackSelector.MappedTrackInfo mappedTrackInfo) {
        this.f40403OooO0O0 = o0o00o0oArr;
        this.f40404OooO0OO = (OooO0o[]) oooO0oArr.clone();
        this.f40405OooO0Oo = o0o0o00;
        this.f40406OooO0o0 = mappedTrackInfo;
        this.f40402OooO00o = o0o00o0oArr.length;
    }

    public final boolean OooO00o(@Nullable o00O000 o00o001, int i) {
        return o00o001 != null && o0O00.OooO00o(this.f40403OooO0O0[i], o00o001.f40403OooO0O0[i]) && o0O00.OooO00o(this.f40404OooO0OO[i], o00o001.f40404OooO0OO[i]);
    }

    public final boolean OooO0O0(int i) {
        return this.f40403OooO0O0[i] != null;
    }
}
