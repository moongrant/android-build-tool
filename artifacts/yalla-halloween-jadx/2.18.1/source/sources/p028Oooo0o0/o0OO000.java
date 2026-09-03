package p028Oooo0o0;

import android.os.Build;
import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.platform.o0O0O00;
import androidx.core.view.WindowInsetsCompat;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import o000O0O0.OooO0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p047Oooooo0.o0oOOo;
import p047Oooooo0.oo0o0O0;
import p048OoooooO.o0oOO;
import p071o000O0o.OooO;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO000 {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public static final OooO00o f2172OooOo0O = new OooO00o();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public static final WeakHashMap<View, o0OO000> f2173OooOo0o = new WeakHashMap<>();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final o00oOoo f2174OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00oOoo f2175OooO00o = OooO00o.OooO00o(4, "captionBar");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00oOoo f2176OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o00oOoo f2177OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o00oOoo f2178OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o00oOoo f2179OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o00oOoo f2180OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o00oOoo f2181OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final o00oOoo f2182OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final o0O0o00O f2183OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final oo0OOoo f2184OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final oo0OOoo f2185OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final o0O0o00O f2186OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final oo0OOoo f2187OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final o0O0o00O f2188OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final o0O0o00O f2189OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final o0O0o00O f2190OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final o0O0o00O f2191OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final boolean f2192OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final oo0oOO0 f2193OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f2194OooOo00;

    public static final class OooO00o {
        public static final o00oOoo OooO00o(int i, String str) {
            OooO00o oooO00o = o0OO000.f2172OooOo0O;
            return new o00oOoo(i, str);
        }

        public static final o0O0o00O OooO0O0(int i, String name) {
            OooO00o oooO00o = o0OO000.f2172OooOo0O;
            OooO insets = OooO.f28161OooO0o0;
            Intrinsics.checkNotNullExpressionValue(insets, "windowInsets?.getInsetsI…e) ?: AndroidXInsets.NONE");
            Intrinsics.checkNotNullParameter(insets, "insets");
            Intrinsics.checkNotNullParameter(name, "name");
            return new o0O0o00O(oo0ooO.OooO0O0(insets), name);
        }

        @Composable
        @NotNull
        public final o0OO000 OooO0OO(@Nullable oOO00O ooo00o) {
            o0OO000 o0oo000;
            ooo00o.OooO0o0(-1366542614);
            View view = (View) ooo00o.OooOO0o(o0O0O00.f6594OooO0o);
            WeakHashMap<View, o0OO000> weakHashMap = o0OO000.f2173OooOo0o;
            synchronized (weakHashMap) {
                o0OO000 o0oo001 = weakHashMap.get(view);
                if (o0oo001 == null) {
                    o0oo001 = new o0OO000(view);
                    weakHashMap.put(view, o0oo001);
                }
                o0oo000 = o0oo001;
            }
            o00Oo00.OooO0O0(o0oo000, new o0O(o0oo000, view), ooo00o);
            ooo00o.Oooo0o0();
            return o0oo000;
        }
    }

    public o0OO000(View view) {
        o00oOoo o00ooooOooO00o = OooO00o.OooO00o(128, "displayCutout");
        this.f2176OooO0O0 = o00ooooOooO00o;
        o00oOoo o00ooooOooO00o2 = OooO00o.OooO00o(8, "ime");
        this.f2177OooO0OO = o00ooooOooO00o2;
        o00oOoo o00ooooOooO00o3 = OooO00o.OooO00o(32, "mandatorySystemGestures");
        this.f2178OooO0Oo = o00ooooOooO00o3;
        this.f2180OooO0o0 = OooO00o.OooO00o(2, "navigationBars");
        this.f2179OooO0o = OooO00o.OooO00o(1, "statusBars");
        o00oOoo o00ooooOooO00o4 = OooO00o.OooO00o(7, "systemBars");
        this.f2181OooO0oO = o00ooooOooO00o4;
        o00oOoo o00ooooOooO00o5 = OooO00o.OooO00o(16, "systemGestures");
        this.f2182OooO0oo = o00ooooOooO00o5;
        o00oOoo o00ooooOooO00o6 = OooO00o.OooO00o(64, "tappableElement");
        this.f2174OooO = o00ooooOooO00o6;
        OooO insets = OooO.f28161OooO0o0;
        Intrinsics.checkNotNullExpressionValue(insets, "insets?.displayCutout?.w…ts ?: AndroidXInsets.NONE");
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter("waterfall", "name");
        o0O0o00O o0o0o00o = new o0O0o00O(oo0ooO.OooO0O0(insets), "waterfall");
        this.f2183OooOO0 = o0o0o00o;
        o0oOo0O0 o0ooo0o0OooO0O0 = o0OO000o.OooO0O0(o0OO000o.OooO0O0(o00ooooOooO00o4, o00ooooOooO00o2), o00ooooOooO00o);
        this.f2184OooOO0O = (oo0OOoo) o0ooo0o0OooO0O0;
        o0oOo0O0 o0ooo0o0OooO0O1 = o0OO000o.OooO0O0(o0OO000o.OooO0O0(o0OO000o.OooO0O0(o00ooooOooO00o6, o00ooooOooO00o3), o00ooooOooO00o5), o0o0o00o);
        this.f2185OooOO0o = (oo0OOoo) o0ooo0o0OooO0O1;
        this.f2187OooOOO0 = (oo0OOoo) o0OO000o.OooO0O0(o0ooo0o0OooO0O0, o0ooo0o0OooO0O1);
        this.f2186OooOOO = OooO00o.OooO0O0(4, "captionBarIgnoringVisibility");
        this.f2188OooOOOO = OooO00o.OooO0O0(2, "navigationBarsIgnoringVisibility");
        this.f2189OooOOOo = OooO00o.OooO0O0(1, "statusBarsIgnoringVisibility");
        this.f2191OooOOo0 = OooO00o.OooO0O0(7, "systemBarsIgnoringVisibility");
        this.f2190OooOOo = OooO00o.OooO0O0(64, "tappableElementIgnoringVisibility");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(o0oOO.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f2192OooOOoo = bool != null ? bool.booleanValue() : true;
        this.f2193OooOo0 = new oo0oOO0(this);
    }

    public final void OooO00o(@NotNull WindowInsetsCompat windowInsets, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        Intrinsics.checkNotNullExpressionValue(windowInsets, "if (testInsets) {\n      …   windowInsets\n        }");
        this.f2175OooO00o.OooO0o(windowInsets, i);
        this.f2177OooO0OO.OooO0o(windowInsets, i);
        this.f2176OooO0O0.OooO0o(windowInsets, i);
        this.f2180OooO0o0.OooO0o(windowInsets, i);
        this.f2179OooO0o.OooO0o(windowInsets, i);
        this.f2181OooO0oO.OooO0o(windowInsets, i);
        this.f2182OooO0oo.OooO0o(windowInsets, i);
        this.f2174OooO.OooO0o(windowInsets, i);
        this.f2178OooO0Oo.OooO0o(windowInsets, i);
        if (i == 0) {
            o0O0o00O o0o0o00o = this.f2186OooOOO;
            OooO oooOOooO0o0 = windowInsets.OooO0o0(4);
            Intrinsics.checkNotNullExpressionValue(oooOOooO0o0, "insets.getInsetsIgnoring…aptionBar()\n            )");
            o0o0o00o.OooO0o(oo0ooO.OooO0O0(oooOOooO0o0));
            o0O0o00O o0o0o00o2 = this.f2188OooOOOO;
            OooO oooOOooO0o1 = windowInsets.OooO0o0(2);
            Intrinsics.checkNotNullExpressionValue(oooOOooO0o1, "insets.getInsetsIgnoring…ationBars()\n            )");
            o0o0o00o2.OooO0o(oo0ooO.OooO0O0(oooOOooO0o1));
            o0O0o00O o0o0o00o3 = this.f2189OooOOOo;
            OooO oooOOooO0o2 = windowInsets.OooO0o0(1);
            Intrinsics.checkNotNullExpressionValue(oooOOooO0o2, "insets.getInsetsIgnoring…tatusBars()\n            )");
            o0o0o00o3.OooO0o(oo0ooO.OooO0O0(oooOOooO0o2));
            o0O0o00O o0o0o00o4 = this.f2191OooOOo0;
            OooO oooOOooO0o3 = windowInsets.OooO0o0(7);
            Intrinsics.checkNotNullExpressionValue(oooOOooO0o3, "insets.getInsetsIgnoring…ystemBars()\n            )");
            o0o0o00o4.OooO0o(oo0ooO.OooO0O0(oooOOooO0o3));
            o0O0o00O o0o0o00o5 = this.f2190OooOOo;
            OooO oooOOooO0o4 = windowInsets.OooO0o0(64);
            Intrinsics.checkNotNullExpressionValue(oooOOooO0o4, "insets.getInsetsIgnoring…leElement()\n            )");
            o0o0o00o5.OooO0o(oo0ooO.OooO0O0(oooOOooO0o4));
            OooO0O0 oooO0O0OooO0OO = windowInsets.OooO0OO();
            if (oooO0O0OooO0OO != null) {
                OooO oooOOooO0Oo = Build.VERSION.SDK_INT >= 30 ? OooO.OooO0Oo(OooO0O0.C0295OooO0O0.OooO0O0(oooO0O0OooO0OO.f28103OooO00o)) : OooO.f28161OooO0o0;
                Intrinsics.checkNotNullExpressionValue(oooOOooO0Oo, "cutout.waterfallInsets");
                this.f2183OooOO0.OooO0o(oo0ooO.OooO0O0(oooOOooO0Oo));
            }
        }
        synchronized (oo0o0O0.f4158OooO0OO) {
            Set<o0oOOo> set = oo0o0O0.f4155OooO.get().f4068OooO0oo;
            z = set != null && (set.isEmpty() ^ true);
        }
        if (z) {
            oo0o0O0.OooO00o();
        }
    }
}
