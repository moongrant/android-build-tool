package p320o0O0oOo0;

import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import java.util.Comparator;
import java.util.regex.Pattern;
import p442o0OoOOo0.o0000O0O;
import p442o0OoOOo0.o00O0O0O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000O0 implements Comparator {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f36774Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final /* synthetic */ o0000O0 f36773OoooO00 = new o0000O0(0);

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static final /* synthetic */ o0000O0 f36772OoooO0 = new o0000O0(1);

    public /* synthetic */ o0000O0(int i) {
        this.f36774Oooo = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f36774Oooo) {
            case 0:
                int[] iArr = DefaultTrackSelector.f14713OooO0Oo;
                return 0;
            default:
                o0000O0O o0000o0o2 = (o0000O0O) obj;
                o0000O0O o0000o0o3 = (o0000O0O) obj2;
                Pattern pattern = o00O0O0O.f40191OooO00o;
                if (o0000o0o2 != null || o0000o0o3 == null) {
                    if (o0000o0o2 == null || o0000o0o3 != null) {
                        if (o0000o0o2 == null && o0000o0o3 == null) {
                            return 0;
                        }
                        int i = o0000o0o2.f40150OooO00o;
                        int i2 = o0000o0o3.f40150OooO00o;
                        if (i >= i2) {
                            if (i <= i2) {
                                return 0;
                            }
                        }
                    }
                    return 1;
                }
                return -1;
        }
    }
}
