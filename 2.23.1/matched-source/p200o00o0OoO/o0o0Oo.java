package p200o00o0OoO;

import com.code.android.uikit.svga.SVGAPlayState;
import com.code.android.uikit.svga.SVGAView;
import com.opensource.svgaplayer.OooO0OO;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o0OO0O0O.o00Ooo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o0o0Oo implements OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ SVGAView f39271OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Function1<o00Ooo, Unit> f39272OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f39273OooO0OO;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SVGAPlayState.values().length];
            try {
                iArr[SVGAPlayState.Playing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SVGAPlayState.Pause.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SVGAPlayState.Stop.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o0o0Oo(SVGAView sVGAView, Function1<? super o00Ooo, Unit> function1, Function0<Unit> function0) {
        this.f39271OooO00o = sVGAView;
        this.f39272OooO0O0 = function1;
        this.f39273OooO0OO = function0;
    }

    @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
    public final void OooO00o(@NotNull o00Ooo videoItem) {
        Intrinsics.checkNotNullParameter(videoItem, "videoItem");
        SVGAView sVGAView = this.f39271OooO00o;
        sVGAView.f13232OooOOoo = true;
        Function1<o00Ooo, Unit> function1 = this.f39272OooO0O0;
        if (function1 != null) {
            function1.invoke(videoItem);
        }
        int i = OooO00o.$EnumSwitchMapping$0[sVGAView.getPlayState().ordinal()];
        if (i == 1) {
            sVGAView.setVideoItem(videoItem);
            sVGAView.OooO0Oo();
            sVGAView.OooO0oo();
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            if (!sVGAView.f13236OooOo0O) {
                sVGAView.setVideoItem(videoItem);
            }
            sVGAView.OooO0oO(sVGAView.f13236OooOo0O);
            sVGAView.OooO();
            return;
        }
        sVGAView.setVideoItem(videoItem);
        sVGAView.OooO0oO(false);
        o0OO0O0O.OooO0OO oooO0OO = sVGAView.callback;
        if (oooO0OO != null) {
            oooO0OO.onPause();
        }
        SVGAPlayState sVGAPlayState = sVGAView.playState;
        SVGAPlayState sVGAPlayState2 = SVGAPlayState.Pause;
        if (sVGAPlayState != sVGAPlayState2) {
            sVGAView.playState = sVGAPlayState2;
        }
    }

    @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
    public final void onError() {
        Function0<Unit> function0 = this.f39273OooO0OO;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
