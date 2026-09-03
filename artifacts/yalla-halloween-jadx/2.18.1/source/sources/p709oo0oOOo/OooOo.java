package p709oo0oOOo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.o0;
import com.google.common.collect.o0O00000;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import p292o0O0Oo0.OooO0OO;
import p310o0O0o0oo.o00O00O;
import p318o0O0oOo.o00000O;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000O00;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo implements OooO, o000oOoO {

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public static OooOo f53399OooOo00;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f53400OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Context f53401OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ImmutableMap<Integer, Long> f53402OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO.OooO00o.C0442OooO00o f53403OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000O00 f53404OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f53405OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00000O f53406OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f53407OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f53408OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public long f53409OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f53410OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f53411OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f53412OooOOO0;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final ImmutableListMultimap<String, Integer> f53393OooOOO = OooO0oo();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final ImmutableList<Long> f53394OooOOOO = (o0) ImmutableList.OooOOo0(6100000L, 3800000L, 2100000L, 1300000L, 590000L);

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final ImmutableList<Long> f53395OooOOOo = (o0) ImmutableList.OooOOo0(218000L, 159000L, 145000L, 130000L, 112000L);

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final ImmutableList<Long> f53397OooOOo0 = (o0) ImmutableList.OooOOo0(2200000L, 1300000L, 930000L, 730000L, 530000L);

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final ImmutableList<Long> f53396OooOOo = (o0) ImmutableList.OooOOo0(4800000L, 2700000L, 1800000L, 1200000L, 630000L);

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static final ImmutableList<Long> f53398OooOOoo = (o0) ImmutableList.OooOOo0(12000000L, 8800000L, 5900000L, 3500000L, 1800000L);

    public static class OooO00o extends BroadcastReceiver {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static OooO00o f53413OooO0OO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Handler f53414OooO00o = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList<WeakReference<OooOo>> f53415OooO0O0 = new ArrayList<>();

        public final void OooO00o() {
            for (int size = this.f53415OooO0O0.size() - 1; size >= 0; size--) {
                if (this.f53415OooO0O0.get(size).get() == null) {
                    this.f53415OooO0O0.remove(size);
                }
            }
        }

        public final void OooO0O0(OooOo oooOo) {
            ImmutableListMultimap<String, Integer> immutableListMultimap = OooOo.f53393OooOOO;
            synchronized (oooOo) {
                Context context = oooOo.f53401OooO00o;
                int iOooOOo = context == null ? 0 : o000OOo0.OooOOo(context);
                if (oooOo.f53400OooO == iOooOOo) {
                    return;
                }
                oooOo.f53400OooO = iOooOOo;
                if (iOooOOo != 1 && iOooOOo != 0 && iOooOOo != 8) {
                    oooOo.f53411OooOO0o = oooOo.OooO(iOooOOo);
                    long jElapsedRealtime = oooOo.f53406OooO0o0.elapsedRealtime();
                    oooOo.OooOO0o(oooOo.f53405OooO0o > 0 ? (int) (jElapsedRealtime - oooOo.f53407OooO0oO) : 0, oooOo.f53408OooO0oo, oooOo.f53411OooOO0o);
                    oooOo.f53407OooO0oO = jElapsedRealtime;
                    oooOo.f53408OooO0oo = 0L;
                    oooOo.f53410OooOO0O = 0L;
                    oooOo.f53409OooOO0 = 0L;
                    o000O00 o000o01 = oooOo.f53404OooO0Oo;
                    o000o01.f36707OooO0O0.clear();
                    o000o01.f36709OooO0Oo = -1;
                    o000o01.f36711OooO0o0 = 0;
                    o000o01.f36710OooO0o = 0;
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public final synchronized void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            OooO00o();
            for (int i = 0; i < this.f53415OooO0O0.size(); i++) {
                OooOo oooOo = this.f53415OooO0O0.get(i).get();
                if (oooOo != null) {
                    OooO0O0(oooOo);
                }
            }
        }
    }

    @Deprecated
    public OooOo() {
        this(null, o0O00000.f18579OoooO0O, RecyclerView.MAX_SCROLL_DURATION, o00000O.f36668OooO00o, false);
    }

    public static ImmutableListMultimap<String, Integer> OooO0oo() {
        ImmutableListMultimap.OooO00o oooO00oOooO = ImmutableListMultimap.OooO();
        oooO00oOooO.OooO0O0("AD", 1, 2, 0, 0, 2);
        oooO00oOooO.OooO0O0("AE", 1, 4, 4, 4, 1);
        oooO00oOooO.OooO0O0("AF", 4, 4, 3, 4, 2);
        oooO00oOooO.OooO0O0("AG", 2, 2, 1, 1, 2);
        oooO00oOooO.OooO0O0("AI", 1, 2, 2, 2, 2);
        oooO00oOooO.OooO0O0("AL", 1, 1, 0, 1, 2);
        oooO00oOooO.OooO0O0("AM", 2, 2, 1, 2, 2);
        oooO00oOooO.OooO0O0("AO", 3, 4, 4, 2, 2);
        oooO00oOooO.OooO0O0("AR", 2, 4, 2, 2, 2);
        oooO00oOooO.OooO0O0("AS", 2, 2, 4, 3, 2);
        oooO00oOooO.OooO0O0("AT", 0, 3, 0, 0, 2);
        oooO00oOooO.OooO0O0("AU", 0, 2, 0, 1, 1);
        oooO00oOooO.OooO0O0("AW", 1, 2, 0, 4, 2);
        oooO00oOooO.OooO0O0("AX", 0, 2, 2, 2, 2);
        oooO00oOooO.OooO0O0("AZ", 3, 3, 3, 4, 2);
        oooO00oOooO.OooO0O0("BA", 1, 1, 0, 1, 2);
        oooO00oOooO.OooO0O0("BB", 0, 2, 0, 0, 2);
        oooO00oOooO.OooO0O0("BD", 2, 0, 3, 3, 2);
        oooO00oOooO.OooO0O0("BE", 0, 1, 2, 3, 2);
        oooO00oOooO.OooO0O0("BF", 4, 4, 4, 2, 2);
        oooO00oOooO.OooO0O0("BG", 0, 1, 0, 0, 2);
        oooO00oOooO.OooO0O0("BH", 1, 0, 2, 4, 2);
        oooO00oOooO.OooO0O0("BI", 4, 4, 4, 4, 2);
        oooO00oOooO.OooO0O0("BJ", 4, 4, 3, 4, 2);
        oooO00oOooO.OooO0O0("BL", 1, 2, 2, 2, 2);
        oooO00oOooO.OooO0O0("BM", 1, 2, 0, 0, 2);
        oooO00oOooO.OooO0O0("BN", 4, 0, 1, 1, 2);
        oooO00oOooO.OooO0O0("BO", 2, 3, 3, 2, 2);
        oooO00oOooO.OooO0O0("BQ", 1, 2, 1, 2, 2);
        oooO00oOooO.OooO0O0("BR", 2, 4, 2, 1, 2);
        oooO00oOooO.OooO0O0("BS", 3, 2, 2, 3, 2);
        oooO00oOooO.OooO0O0("BT", 3, 0, 3, 2, 2);
        oooO00oOooO.OooO0O0("BW", 3, 4, 2, 2, 2);
        oooO00oOooO.OooO0O0("BY", 1, 0, 2, 1, 2);
        oooO00oOooO.OooO0O0("BZ", 2, 2, 2, 1, 2);
        oooO00oOooO.OooO0O0("CA", 0, 3, 1, 2, 3);
        oooO00oOooO.OooO0O0("CD", 4, 3, 2, 2, 2);
        oooO00oOooO.OooO0O0("CF", 4, 2, 2, 2, 2);
        oooO00oOooO.OooO0O0("CG", 3, 4, 1, 1, 2);
        oooO00oOooO.OooO0O0("CH", 0, 1, 0, 0, 0);
        oooO00oOooO.OooO0O0("CI", 3, 3, 3, 3, 2);
        oooO00oOooO.OooO0O0("CK", 3, 2, 1, 0, 2);
        oooO00oOooO.OooO0O0("CL", 1, 1, 2, 3, 2);
        oooO00oOooO.OooO0O0("CM", 3, 4, 3, 2, 2);
        oooO00oOooO.OooO0O0("CN", 2, 2, 2, 1, 3);
        oooO00oOooO.OooO0O0("CO", 2, 4, 3, 2, 2);
        oooO00oOooO.OooO0O0("CR", 2, 3, 4, 4, 2);
        oooO00oOooO.OooO0O0("CU", 4, 4, 2, 1, 2);
        oooO00oOooO.OooO0O0("CV", 2, 3, 3, 3, 2);
        oooO00oOooO.OooO0O0("CW", 1, 2, 0, 0, 2);
        oooO00oOooO.OooO0O0("CY", 1, 2, 0, 0, 2);
        oooO00oOooO.OooO0O0("CZ", 0, 1, 0, 0, 2);
        oooO00oOooO.OooO0O0("DE", 0, 1, 1, 2, 0);
        oooO00oOooO.OooO0O0("DJ", 4, 1, 4, 4, 2);
        oooO00oOooO.OooO0O0("DK", 0, 0, 1, 0, 2);
        oooO00oOooO.OooO0O0("DM", 1, 2, 2, 2, 2);
        oooO00oOooO.OooO0O0("DO", 3, 4, 4, 4, 2);
        oooO00oOooO.OooO0O0("DZ", 3, 2, 4, 4, 2);
        oooO00oOooO.OooO0O0("EC", 2, 4, 3, 2, 2);
        oooO00oOooO.OooO0O0("EE", 0, 0, 0, 0, 2);
        oooO00oOooO.OooO0O0("EG", 3, 4, 2, 1, 2);
        oooO00oOooO.OooO0O0("EH", 2, 2, 2, 2, 2);
        oooO00oOooO.OooO0O0("ER", 4, 2, 2, 2, 2);
        oooO00oOooO.OooO0O0("ES", 0, 1, 2, 1, 2);
        oooO00oOooO.OooO0O0("ET", 4, 4, 4, 1, 2);
        oooO00oOooO.OooO0O0("FI", 0, 0, 1, 0, 0);
        oooO00oOooO.OooO0O0("FJ", 3, 0, 3, 3, 2);
        oooO00oOooO.OooO0O0("FK", 2, 2, 2, 2, 2);
        oooO00oOooO.OooO0O0("FM", 4, 2, 4, 3, 2);
        oooO00oOooO.OooO0O0("FO", 0, 2, 0, 0, 2);
        oooO00oOooO.OooO0O0("FR", 1, 0, 2, 1, 2);
        oooO00oOooO.OooO0O0("GA", 3, 3, 1, 0, 2);
        oooO00oOooO.OooO0O0("GB", 0, 0, 1, 2, 2);
        oooO00oOooO.OooO0O0("GD", 1, 2, 2, 2, 2);
        oooO00oOooO.OooO0O0("GE", 1, 0, 1, 3, 2);
        oooO00oOooO.OooO0O0("GF", 2, 2, 2, 4, 2);
        oooO00oOooO.OooO0O0("GG", 0, 2, 0, 0, 2);
        oooO00oOooO.OooO0O0("GH", 3, 2, 3, 2, 2);
        oooO00oOooO.OooO0O0("GI", 0, 2, 0, 0, 2);
        oooO00oOooO.OooO0O0("GL", 1, 2, 2, 1, 2);
        oooO00oOooO.OooO0O0("GM", 4, 3, 2, 4, 2);
        oooO00oOooO.OooO0O0("GN", 4, 3, 4, 2, 2);
        oooO00oOooO.OooO0O0("GP", 2, 2, 3, 4, 2);
        oooO00oOooO.OooO0O0("GQ", 4, 2, 3, 4, 2);
        oooO00oOooO.OooO0O0("GR", 1, 1, 0, 1, 2);
        oooO00oOooO.OooO0O0("GT", 3, 2, 3, 2, 2);
        oooO00oOooO.OooO0O0("GU", 1, 2, 4, 4, 2);
        oooO00oOooO.OooO0O0("GW", 3, 4, 4, 3, 2);
        oooO00oOooO.OooO0O0("GY", 3, 3, 1, 0, 2);
        oooO00oOooO.OooO0O0("HK", 0, 2, 3, 4, 2);
        oooO00oOooO.OooO0O0("HN", 3, 0, 3, 3, 2);
        oooO00oOooO.OooO0O0("HR", 1, 1, 0, 1, 2);
        oooO00oOooO.OooO0O0("HT", 4, 3, 4, 4, 2);
        oooO00oOooO.OooO0O0("HU", 0, 1, 0, 0, 2);
        oooO00oOooO.OooO0O0("ID", 3, 2, 2, 3, 2);
        oooO00oOooO.OooO0O0("IE", 0, 0, 1, 1, 2);
        oooO00oOooO.OooO0O0("IL", 1, 0, 2, 3, 2);
        oooO00oOooO.OooO0O0("IM", 0, 2, 0, 1, 2);
        oooO00oOooO.OooO0O0("IN", 2, 1, 3, 3, 2);
        oooO00oOooO.OooO0O0("IO", 4, 2, 2, 4, 2);
        oooO00oOooO.OooO0O0("IQ", 3, 2, 4, 3, 2);
        oooO00oOooO.OooO0O0("IR", 4, 2, 3, 4, 2);
        oooO00oOooO.OooO0O0("IS", 0, 2, 0, 0, 2);
        oooO00oOooO.OooO0O0("IT", 0, 0, 1, 1, 2);
        oooO00oOooO.OooO0O0("JE", 2, 2, 0, 2, 2);
        oooO00oOooO.OooO0O0("JM", 3, 3, 4, 4, 2);
        oooO00oOooO.OooO0O0("JO", 1, 2, 1, 1, 2);
        oooO00oOooO.OooO0O0("JP", 0, 2, 0, 1, 3);
        oooO00oOooO.OooO0O0("KE", 3, 4, 2, 2, 2);
        oooO00oOooO.OooO0O0("KG", 1, 0, 2, 2, 2);
        oooO00oOooO.OooO0O0("KH", 2, 0, 4, 3, 2);
        oooO00oOooO.OooO0O0("KI", 4, 2, 3, 1, 2);
        oooO00oOooO.OooO0O0("KM", 4, 2, 2, 3, 2);
        oooO00oOooO.OooO0O0("KN", 1, 2, 2, 2, 2);
        oooO00oOooO.OooO0O0("KP", 4, 2, 2, 2, 2);
        oooO00oOooO.OooO0O0("KR", 0, 2, 1, 1, 1);
        oooO00oOooO.OooO0O0("KW", 2, 3, 1, 1, 1);
        oooO00oOooO.OooO0O0("KY", 1, 2, 0, 0, 2);
        oooO00oOooO.OooO0O0("KZ", 1, 2, 2, 3, 2);
        oooO00oOooO.OooO0O0("LA", 2, 2, 1, 1, 2);
        oooO00oOooO.OooO0O0("LB", 3, 2, 0, 0, 2);
        oooO00oOooO.OooO0O0("LC", 1, 1, 0, 0, 2);
        oooO00oOooO.OooO0O0("LI", 0, 2, 2, 2, 2);
        oooO00oOooO.OooO0O0("LK", 2, 0, 2, 3, 2);
        oooO00oOooO.OooO0O0("LR", 3, 4, 3, 2, 2);
        oooO00oOooO.OooO0O0("LS", 3, 3, 2, 3, 2);
        oooO00oOooO.OooO0O0("LT", 0, 0, 0, 0, 2);
        oooO00oOooO.OooO0O0("LU", 0, 0, 0, 0, 2);
        oooO00oOooO.OooO0O0("LV", 0, 0, 0, 0, 2);
        oooO00oOooO.OooO0O0("LY", 4, 2, 4, 3, 2);
        oooO00oOooO.OooO0O0("MA", 2, 1, 2, 1, 2);
        oooO00oOooO.OooO0O0("MC", 0, 2, 2, 2, 2);
        oooO00oOooO.OooO0O0("MD", 1, 2, 0, 0, 2);
        oooO00oOooO.OooO0O0("ME", 1, 2, 1, 2, 2);
        oooO00oOooO.OooO0O0("MF", 1, 2, 1, 0, 2);
        oooO00oOooO.OooO0O0("MG", 3, 4, 3, 3, 2);
        oooO00oOooO.OooO0O0("MH", 4, 2, 2, 4, 2);
        oooO00oOooO.OooO0O0("MK", 1, 0, 0, 0, 2);
        oooO00oOooO.OooO0O0("ML", 4, 4, 1, 1, 2);
        oooO00oOooO.OooO0O0("MM", 2, 3, 2, 2, 2);
        oooO00oOooO.OooO0O0("MN", 2, 4, 1, 1, 2);
        oooO00oOooO.OooO0O0("MO", 0, 2, 4, 4, 2);
        oooO00oOooO.OooO0O0("MP", 0, 2, 2, 2, 2);
        oooO00oOooO.OooO0O0("MQ", 2, 2, 2, 3, 2);
        oooO00oOooO.OooO0O0("MR", 3, 0, 4, 2, 2);
        oooO00oOooO.OooO0O0("MS", 1, 2, 2, 2, 2);
        oooO00oOooO.OooO0O0("MT", 0, 2, 0, 1, 2);
        oooO00oOooO.OooO0O0("MU", 3, 1, 2, 3, 2);
        oooO00oOooO.OooO0O0("MV", 4, 3, 1, 4, 2);
        oooO00oOooO.OooO0O0("MW", 4, 1, 1, 0, 2);
        oooO00oOooO.OooO0O0("MX", 2, 4, 3, 3, 2);
        oooO00oOooO.OooO0O0("MY", 2, 0, 3, 3, 2);
        oooO00oOooO.OooO0O0("MZ", 3, 3, 2, 3, 2);
        oooO00oOooO.OooO0O0("NA", 4, 3, 2, 2, 2);
        oooO00oOooO.OooO0O0("NC", 2, 0, 4, 4, 2);
        oooO00oOooO.OooO0O0("NE", 4, 4, 4, 4, 2);
        oooO00oOooO.OooO0O0("NF", 2, 2, 2, 2, 2);
        oooO00oOooO.OooO0O0("NG", 3, 3, 2, 2, 2);
        oooO00oOooO.OooO0O0("NI", 3, 1, 4, 4, 2);
        oooO00oOooO.OooO0O0("NL", 0, 2, 4, 2, 0);
        oooO00oOooO.OooO0O0("NO", 0, 1, 1, 0, 2);
        oooO00oOooO.OooO0O0("NP", 2, 0, 4, 3, 2);
        oooO00oOooO.OooO0O0("NR", 4, 2, 3, 1, 2);
        oooO00oOooO.OooO0O0("NU", 4, 2, 2, 2, 2);
        oooO00oOooO.OooO0O0("NZ", 0, 2, 1, 2, 4);
        oooO00oOooO.OooO0O0("OM", 2, 2, 0, 2, 2);
        oooO00oOooO.OooO0O0("PA", 1, 3, 3, 4, 2);
        oooO00oOooO.OooO0O0("PE", 2, 4, 4, 4, 2);
        oooO00oOooO.OooO0O0("PF", 2, 2, 1, 1, 2);
        oooO00oOooO.OooO0O0("PG", 4, 3, 3, 2, 2);
        oooO00oOooO.OooO0O0("PH", 3, 0, 3, 4, 4);
        oooO00oOooO.OooO0O0("PK", 3, 2, 3, 3, 2);
        oooO00oOooO.OooO0O0("PL", 1, 0, 2, 2, 2);
        oooO00oOooO.OooO0O0("PM", 0, 2, 2, 2, 2);
        oooO00oOooO.OooO0O0("PR", 1, 2, 2, 3, 4);
        oooO00oOooO.OooO0O0("PS", 3, 3, 2, 2, 2);
        oooO00oOooO.OooO0O0("PT", 1, 1, 0, 0, 2);
        oooO00oOooO.OooO0O0("PW", 1, 2, 3, 0, 2);
        oooO00oOooO.OooO0O0("PY", 2, 0, 3, 3, 2);
        oooO00oOooO.OooO0O0("QA", 2, 3, 1, 2, 2);
        oooO00oOooO.OooO0O0("RE", 1, 0, 2, 1, 2);
        oooO00oOooO.OooO0O0("RO", 1, 1, 1, 2, 2);
        oooO00oOooO.OooO0O0("RS", 1, 2, 0, 0, 2);
        oooO00oOooO.OooO0O0("RU", 0, 1, 0, 1, 2);
        oooO00oOooO.OooO0O0("RW", 4, 3, 3, 4, 2);
        oooO00oOooO.OooO0O0("SA", 2, 2, 2, 1, 2);
        oooO00oOooO.OooO0O0("SB", 4, 2, 4, 2, 2);
        oooO00oOooO.OooO0O0("SC", 4, 2, 0, 1, 2);
        oooO00oOooO.OooO0O0("SD", 4, 4, 4, 3, 2);
        oooO00oOooO.OooO0O0("SE", 0, 0, 0, 0, 2);
        oooO00oOooO.OooO0O0("SG", 0, 0, 3, 3, 4);
        oooO00oOooO.OooO0O0("SH", 4, 2, 2, 2, 2);
        oooO00oOooO.OooO0O0("SI", 0, 1, 0, 0, 2);
        oooO00oOooO.OooO0O0("SJ", 2, 2, 2, 2, 2);
        oooO00oOooO.OooO0O0("SK", 0, 1, 0, 0, 2);
        oooO00oOooO.OooO0O0("SL", 4, 3, 3, 1, 2);
        oooO00oOooO.OooO0O0("SM", 0, 2, 2, 2, 2);
        oooO00oOooO.OooO0O0("SN", 4, 4, 4, 3, 2);
        oooO00oOooO.OooO0O0("SO", 3, 4, 4, 4, 2);
        oooO00oOooO.OooO0O0("SR", 3, 2, 3, 1, 2);
        oooO00oOooO.OooO0O0("SS", 4, 1, 4, 2, 2);
        oooO00oOooO.OooO0O0("ST", 2, 2, 1, 2, 2);
        oooO00oOooO.OooO0O0("SV", 2, 1, 4, 4, 2);
        oooO00oOooO.OooO0O0("SX", 2, 2, 1, 0, 2);
        oooO00oOooO.OooO0O0("SY", 4, 3, 2, 2, 2);
        oooO00oOooO.OooO0O0("SZ", 3, 4, 3, 4, 2);
        oooO00oOooO.OooO0O0("TC", 1, 2, 1, 0, 2);
        oooO00oOooO.OooO0O0("TD", 4, 4, 4, 4, 2);
        oooO00oOooO.OooO0O0("TG", 3, 2, 1, 0, 2);
        oooO00oOooO.OooO0O0("TH", 1, 3, 4, 3, 0);
        oooO00oOooO.OooO0O0("TJ", 4, 4, 4, 4, 2);
        oooO00oOooO.OooO0O0("TL", 4, 1, 4, 4, 2);
        oooO00oOooO.OooO0O0("TM", 4, 2, 1, 2, 2);
        oooO00oOooO.OooO0O0("TN", 2, 1, 1, 1, 2);
        oooO00oOooO.OooO0O0("TO", 3, 3, 4, 2, 2);
        oooO00oOooO.OooO0O0("TR", 1, 2, 1, 1, 2);
        oooO00oOooO.OooO0O0("TT", 1, 3, 1, 3, 2);
        oooO00oOooO.OooO0O0("TV", 3, 2, 2, 4, 2);
        oooO00oOooO.OooO0O0("TW", 0, 0, 0, 0, 1);
        oooO00oOooO.OooO0O0("TZ", 3, 3, 3, 2, 2);
        oooO00oOooO.OooO0O0("UA", 0, 3, 0, 0, 2);
        oooO00oOooO.OooO0O0("UG", 3, 2, 2, 3, 2);
        oooO00oOooO.OooO0O0("US", 0, 1, 3, 3, 3);
        oooO00oOooO.OooO0O0("UY", 2, 1, 1, 1, 2);
        oooO00oOooO.OooO0O0("UZ", 2, 0, 3, 2, 2);
        oooO00oOooO.OooO0O0("VC", 2, 2, 2, 2, 2);
        oooO00oOooO.OooO0O0("VE", 4, 4, 4, 4, 2);
        oooO00oOooO.OooO0O0("VG", 2, 2, 1, 2, 2);
        oooO00oOooO.OooO0O0("VI", 1, 2, 2, 4, 2);
        oooO00oOooO.OooO0O0("VN", 0, 1, 4, 4, 2);
        oooO00oOooO.OooO0O0("VU", 4, 1, 3, 1, 2);
        oooO00oOooO.OooO0O0("WS", 3, 1, 4, 2, 2);
        oooO00oOooO.OooO0O0("XK", 1, 1, 1, 0, 2);
        oooO00oOooO.OooO0O0("YE", 4, 4, 4, 4, 2);
        oooO00oOooO.OooO0O0("YT", 3, 2, 1, 3, 2);
        oooO00oOooO.OooO0O0("ZA", 2, 3, 2, 2, 2);
        oooO00oOooO.OooO0O0("ZM", 3, 2, 2, 3, 2);
        oooO00oOooO.OooO0O0("ZW", 3, 3, 3, 3, 2);
        return oooO00oOooO.OooO00o();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0032 A[Catch: all -> 0x0129, TryCatch #0 {, blocks: (B:4:0x0003, B:9:0x000f, B:11:0x0014, B:13:0x001e, B:22:0x0043, B:24:0x0050, B:25:0x0068, B:17:0x002b, B:18:0x0032, B:21:0x003d, B:8:0x000b, B:26:0x0125), top: B:32:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:21:0x003d A[Catch: all -> 0x0129, TryCatch #0 {, blocks: (B:4:0x0003, B:9:0x000f, B:11:0x0014, B:13:0x001e, B:22:0x0043, B:24:0x0050, B:25:0x0068, B:17:0x002b, B:18:0x0032, B:21:0x003d, B:8:0x000b, B:26:0x0125), top: B:32:0x0003 }] */
    public static synchronized OooOo OooOO0(Context context) {
        String country;
        TelephonyManager telephonyManager;
        if (f53399OooOo00 == null) {
            Context applicationContext = context == null ? null : context.getApplicationContext();
            int i = o000OOo0.f36740OooO00o;
            if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
                country = Locale.getDefault().getCountry();
                if (country == null) {
                    country = country.toUpperCase(Locale.US);
                }
            } else {
                country = telephonyManager.getNetworkCountryIso();
                if (TextUtils.isEmpty(country)) {
                    country = Locale.getDefault().getCountry();
                    if (country == null) {
                        country = country.toUpperCase(Locale.US);
                    }
                } else if (country != null) {
                    country = country.toUpperCase(Locale.US);
                }
            }
            ImmutableList<Integer> immutableListOooOOo0 = f53393OooOOO.get(country);
            if (immutableListOooOOo0.isEmpty()) {
                immutableListOooOOo0 = ImmutableList.OooOOo0(2, 2, 2, 2, 2);
            }
            HashMap map = new HashMap(6);
            map.put(0, 1000000L);
            ImmutableList<Long> immutableList = f53394OooOOOO;
            map.put(2, immutableList.get(immutableListOooOOo0.get(0).intValue()));
            map.put(3, f53395OooOOOo.get(immutableListOooOOo0.get(1).intValue()));
            map.put(4, f53397OooOOo0.get(immutableListOooOOo0.get(2).intValue()));
            map.put(5, f53396OooOOo.get(immutableListOooOOo0.get(3).intValue()));
            map.put(9, f53398OooOOoo.get(immutableListOooOOo0.get(4).intValue()));
            map.put(7, immutableList.get(immutableListOooOOo0.get(0).intValue()));
            f53399OooOo00 = new OooOo(applicationContext, map, RecyclerView.MAX_SCROLL_DURATION, o00000O.f36668OooO00o, true);
        }
        return f53399OooOo00;
    }

    public static boolean OooOO0O(DataSpec dataSpec, boolean z) {
        if (z) {
            if (!((dataSpec.f14800OooO & 8) == 8)) {
                return true;
            }
        }
        return false;
    }

    public final long OooO(int i) {
        Long l = this.f53402OooO0O0.get(Integer.valueOf(i));
        if (l == null) {
            l = this.f53402OooO0O0.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    @Override // p709oo0oOOo.o000oOoO
    public final synchronized void OooO00o(DataSpec dataSpec, boolean z, int i) {
        if (OooOO0O(dataSpec, z)) {
            this.f53408OooO0oo += (long) i;
        }
    }

    @Override // p709oo0oOOo.OooO
    public final void OooO0O0(Handler handler, OooO.OooO00o oooO00o) {
        Objects.requireNonNull(oooO00o);
        OooO.OooO00o.C0442OooO00o c0442OooO00o = this.f53403OooO0OO;
        Objects.requireNonNull(c0442OooO00o);
        c0442OooO00o.OooO00o(oooO00o);
        c0442OooO00o.f53363OooO00o.add(new OooO.OooO00o.C0442OooO00o.C0443OooO00o(handler, oooO00o));
    }

    @Override // p709oo0oOOo.o000oOoO
    public final synchronized void OooO0OO(DataSpec dataSpec, boolean z) {
        if (OooOO0O(dataSpec, z)) {
            o00000O0.OooO0Oo(this.f53405OooO0o > 0);
            long jElapsedRealtime = this.f53406OooO0o0.elapsedRealtime();
            int i = (int) (jElapsedRealtime - this.f53407OooO0oO);
            this.f53409OooOO0 += (long) i;
            long j = this.f53410OooOO0O;
            long j2 = this.f53408OooO0oo;
            this.f53410OooOO0O = j + j2;
            if (i > 0) {
                this.f53404OooO0Oo.OooO00o((int) Math.sqrt(j2), (j2 * 8000.0f) / i);
                if (this.f53409OooOO0 >= 2000 || this.f53410OooOO0O >= 524288) {
                    this.f53411OooOO0o = (long) this.f53404OooO0Oo.OooO0O0();
                }
                OooOO0o(i, this.f53408OooO0oo, this.f53411OooOO0o);
                this.f53407OooO0oO = jElapsedRealtime;
                this.f53408OooO0oo = 0L;
            }
            this.f53405OooO0o--;
        }
    }

    @Override // p709oo0oOOo.o000oOoO
    public final void OooO0Oo() {
    }

    @Override // p709oo0oOOo.o000oOoO
    public final synchronized void OooO0o(DataSpec dataSpec, boolean z) {
        if (OooOO0O(dataSpec, z)) {
            if (this.f53405OooO0o == 0) {
                this.f53407OooO0oO = this.f53406OooO0o0.elapsedRealtime();
            }
            this.f53405OooO0o++;
        }
    }

    @Override // p709oo0oOOo.OooO
    public final o000oOoO OooO0o0() {
        return this;
    }

    @Override // p709oo0oOOo.OooO
    public final void OooO0oO(OooO.OooO00o oooO00o) {
        this.f53403OooO0OO.OooO00o(oooO00o);
    }

    public final void OooOO0o(final int i, final long j, final long j2) {
        if (i == 0 && j == 0 && j2 == this.f53412OooOOO0) {
            return;
        }
        this.f53412OooOOO0 = j2;
        for (final OooO.OooO00o.C0442OooO00o.C0443OooO00o c0443OooO00o : this.f53403OooO0OO.f53363OooO00o) {
            if (!c0443OooO00o.f53366OooO0OO) {
                c0443OooO00o.f53364OooO00o.post(new Runnable() { // from class: oo0oOOo.OooO0o
                    @Override // java.lang.Runnable
                    public final void run() {
                        o00O00O.OooO00o next;
                        o00O00O.OooO00o oooO00o;
                        o00O00O.OooO00o oooO00o2;
                        OooO0OO oooO0OO = (OooO0OO) c0443OooO00o.f53365OooO0O0;
                        OooO0OO.OooO00o oooO00o3 = oooO0OO.f35712OoooO00;
                        if (oooO00o3.f35714OooO0O0.isEmpty()) {
                            oooO00o2 = null;
                        } else {
                            ImmutableList<o00O00O.OooO00o> immutableList = oooO00o3.f35714OooO0O0;
                            if (!(immutableList instanceof List)) {
                                Iterator<o00O00O.OooO00o> it = immutableList.iterator();
                                do {
                                    next = it.next();
                                } while (it.hasNext());
                                oooO00o = next;
                            } else {
                                if (immutableList.isEmpty()) {
                                    throw new NoSuchElementException();
                                }
                                oooO00o = immutableList.get(immutableList.size() - 1);
                            }
                            oooO00o2 = oooO00o;
                        }
                        oooO0OO.OoooOOO(oooO00o2);
                        Iterator<p292o0O0Oo0.OooO0o> it2 = oooO0OO.f35708Oooo0o.iterator();
                        while (it2.hasNext()) {
                            it2.next().OoooOO0();
                        }
                    }
                });
            }
        }
    }

    public OooOo(@Nullable Context context, Map<Integer, Long> map, int i, o00000O o00000o, boolean z) {
        final OooO00o oooO00o;
        this.f53401OooO00o = context == null ? null : context.getApplicationContext();
        this.f53402OooO0O0 = ImmutableMap.OooO0O0(map);
        this.f53403OooO0OO = new OooO.OooO00o.C0442OooO00o();
        this.f53404OooO0Oo = new o000O00(i);
        this.f53406OooO0o0 = o00000o;
        int iOooOOo = context == null ? 0 : o000OOo0.OooOOo(context);
        this.f53400OooO = iOooOOo;
        this.f53411OooOO0o = OooO(iOooOOo);
        if (context == null || !z) {
            return;
        }
        OooO00o oooO00o2 = OooO00o.f53413OooO0OO;
        synchronized (OooO00o.class) {
            if (OooO00o.f53413OooO0OO == null) {
                OooO00o.f53413OooO0OO = new OooO00o();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(OooO00o.f53413OooO0OO, intentFilter);
            }
            oooO00o = OooO00o.f53413OooO0OO;
        }
        synchronized (oooO00o) {
            oooO00o.OooO00o();
            oooO00o.f53415OooO0O0.add(new WeakReference<>(this));
            oooO00o.f53414OooO00o.post(new Runnable() { // from class: oo0oOOo.OooOo00
                @Override // java.lang.Runnable
                public final void run() {
                    oooO00o.OooO0O0(this);
                }
            });
        }
    }
}
