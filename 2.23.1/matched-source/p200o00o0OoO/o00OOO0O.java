package p200o00o0OoO;

import com.code.android.uikit.svga.SVGAPlayState;
import com.code.android.uikit.svga.SVGAView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o0OO0O0O.OooO0OO;
import o0OO0O0O.o00Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OOO0O extends Lambda implements Function1<o00Ooo, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SVGAView f39255OooO0Oo;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO0O(SVGAView sVGAView) {
        super(1);
        this.f39255OooO0Oo = sVGAView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00Ooo o00ooo2) {
        o00Ooo o00ooo3 = o00ooo2;
        boolean z = o00ooo3 != null;
        SVGAView sVGAView = this.f39255OooO0Oo;
        if (z) {
            sVGAView.f13232OooOOoo = true;
            int i = OooO00o.$EnumSwitchMapping$0[sVGAView.getPlayState().ordinal()];
            if (i == 1) {
                sVGAView.setVideoItem(o00ooo3);
                sVGAView.OooO0Oo();
                sVGAView.OooO0oo();
            } else if (i == 2) {
                sVGAView.setVideoItem(o00ooo3);
                sVGAView.OooO0oO(false);
                OooO0OO oooO0OO = sVGAView.callback;
                if (oooO0OO != null) {
                    oooO0OO.onPause();
                }
                SVGAPlayState sVGAPlayState = sVGAView.playState;
                SVGAPlayState sVGAPlayState2 = SVGAPlayState.Pause;
                if (sVGAPlayState != sVGAPlayState2) {
                    sVGAView.playState = sVGAPlayState2;
                }
            } else if (i == 3) {
                if (!sVGAView.f13236OooOo0O) {
                    sVGAView.setVideoItem(o00ooo3);
                }
                sVGAView.OooO0oO(sVGAView.f13236OooOo0O);
                sVGAView.OooO();
            }
        } else {
            sVGAView.f13232OooOOoo = false;
            sVGAView.OooOOO0(sVGAView.f13236OooOo0O);
            sVGAView.OooO();
        }
        return Unit.INSTANCE;
    }
}
