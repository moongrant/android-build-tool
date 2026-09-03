package p423o0OoO0OO;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000O;
import com.opensource.svgaplayer.OooO0OO;
import com.yalla.yalla.model.SVGAState;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o0OO0O0O.OooO;
import o0OO0O0O.OooOO0;
import o0OO0O0O.o00Ooo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00O {

    public static final class OooO00o implements OooO0OO.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Function1<SVGAState, Unit> f46697OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ Function1<OooOO0, Unit> f46698OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ SVGAView f46699OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f46700OooO0Oo;

        /* JADX INFO: renamed from: o0OoO0OO.o00O00O$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0451OooO00o implements o0OO0O0O.OooO0OO {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ Function1<SVGAState, Unit> f46701OooO00o;

            /* JADX WARN: Multi-variable type inference failed */
            public C0451OooO00o(Function1<? super SVGAState, Unit> function1) {
                this.f46701OooO00o = function1;
            }

            @Override // o0OO0O0O.OooO0OO
            public final void OooO00o() {
                Function1<SVGAState, Unit> function1 = this.f46701OooO00o;
                if (function1 != null) {
                    function1.invoke(SVGAState.PlayRepeat);
                }
            }

            @Override // o0OO0O0O.OooO0OO
            public final void OooO0O0() {
                Function1<SVGAState, Unit> function1 = this.f46701OooO00o;
                if (function1 != null) {
                    function1.invoke(SVGAState.PlayFinished);
                }
            }

            @Override // o0OO0O0O.OooO0OO
            public final void OooO0OO(int i) {
                Function1<SVGAState, Unit> function1 = this.f46701OooO00o;
                if (function1 != null) {
                    function1.invoke(SVGAState.PlayStep);
                }
            }

            @Override // o0OO0O0O.OooO0OO
            public final void onPause() {
                Function1<SVGAState, Unit> function1 = this.f46701OooO00o;
                if (function1 != null) {
                    function1.invoke(SVGAState.PlayPause);
                }
            }
        }

        public OooO00o(int i, SVGAView sVGAView, Function1 function1, Function1 function2) {
            this.f46697OooO00o = function1;
            this.f46698OooO0O0 = function2;
            this.f46699OooO0OO = sVGAView;
            this.f46700OooO0Oo = i;
        }

        @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
        public final void OooO00o(@NotNull o00Ooo videoItem) {
            Intrinsics.checkNotNullParameter(videoItem, "videoItem");
            Function1<SVGAState, Unit> function1 = this.f46697OooO00o;
            if (function1 != null) {
                try {
                    function1.invoke(SVGAState.LoadingSuccess);
                } catch (Exception e) {
                    e.printStackTrace();
                    if (function1 != null) {
                        function1.invoke(SVGAState.LoadingError);
                        return;
                    }
                    return;
                }
            }
            OooOO0 oooOO1 = new OooOO0();
            Function1<OooOO0, Unit> function2 = this.f46698OooO0O0;
            if (function2 != null) {
                function2.invoke(oooOO1);
            }
            OooO oooO = new OooO(videoItem, oooOO1);
            SVGAView sVGAView = this.f46699OooO0OO;
            int i = this.f46700OooO0Oo;
            sVGAView.setImageDrawable(oooO);
            sVGAView.setLoops(i);
            sVGAView.OooO0Oo();
            o000O.OooO00o(sVGAView);
            sVGAView.setClearsAfterStop(false);
            sVGAView.setCallback(new C0451OooO00o(function1));
        }

        @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
        public final void onError() {
            Function1<SVGAState, Unit> function1 = this.f46697OooO00o;
            if (function1 != null) {
                function1.invoke(SVGAState.LoadingError);
            }
        }
    }

    public static final void OooO00o(@NotNull SVGAView sVGAView, @NotNull String svgaUrl, int i, @Nullable Function1<? super SVGAState, Unit> function1, @Nullable Function1<? super OooOO0, Unit> function2) {
        Intrinsics.checkNotNullParameter(sVGAView, "<this>");
        Intrinsics.checkNotNullParameter(svgaUrl, "svgaUrl");
        OooO0OO oooO0OO = new OooO0OO(sVGAView.getContext());
        if (function1 != null) {
            function1.invoke(SVGAState.Loading);
        }
        oooO0OO.OooO00o(svgaUrl, new OooO00o(i, sVGAView, function1, function2));
    }

    public static final void OooO0O0(@NotNull OooOO0 oooOO1, @NotNull View view, @NotNull String key) {
        Intrinsics.checkNotNullParameter(oooOO1, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(key, "key");
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        if (!ViewCompat.OooOO0O.OooO0OO(view)) {
            throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        oooOO1.OooO00o(bitmapCreateBitmap, key);
    }
}
