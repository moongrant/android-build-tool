package p319o0O0oOo0;

import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import java.util.Comparator;
import java.util.regex.Pattern;
import p439o0OoOOo0.o00O0O0O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000O0O implements Comparator {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final /* synthetic */ o0000O0O f36760Oooo0oO = new o0000O0O(0);

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final /* synthetic */ o0000O0O f36761Oooo0oo = new o0000O0O(1);

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f36762Oooo0o;

    public /* synthetic */ o0000O0O(int i) {
        this.f36762Oooo0o = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f36762Oooo0o) {
            case 0:
                int[] iArr = DefaultTrackSelector.f14695OooO0Oo;
                return 0;
            default:
                p439o0OoOOo0.o0000O0O o0000o0o2 = (p439o0OoOOo0.o0000O0O) obj;
                p439o0OoOOo0.o0000O0O o0000o0o3 = (p439o0OoOOo0.o0000O0O) obj2;
                Pattern pattern = o00O0O0O.f40171OooO00o;
                if (o0000o0o2 != null || o0000o0o3 == null) {
                    if (o0000o0o2 == null || o0000o0o3 != null) {
                        if (o0000o0o2 == null && o0000o0o3 == null) {
                            return 0;
                        }
                        int i = o0000o0o2.f40130OooO00o;
                        int i2 = o0000o0o3.f40130OooO00o;
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
