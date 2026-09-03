package p154o00OoO00;

import com.code.android.uikit.svga.SVGAPlayState;
import com.code.android.uikit.svga.SVGAView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o0OO0O0.OooO0OO;
import o0OO0O0.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO extends Lambda implements Function1<oo000o, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SVGAView f38183OooO0Oo;

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
    public o000oOoO(SVGAView sVGAView) {
        super(1);
        this.f38183OooO0Oo = sVGAView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(oo000o oo000oVar) {
        oo000o oo000oVar2 = oo000oVar;
        boolean z = oo000oVar2 != null;
        SVGAView sVGAView = this.f38183OooO0Oo;
        if (z) {
            sVGAView.f10161OooOOoo = true;
            int i = OooO00o.$EnumSwitchMapping$0[sVGAView.getPlayState().ordinal()];
            if (i == 1) {
                sVGAView.setVideoItem(oo000oVar2);
                sVGAView.OooO0Oo();
                sVGAView.OooO0oo();
            } else if (i == 2) {
                sVGAView.setVideoItem(oo000oVar2);
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
                if (!sVGAView.f10165OooOo0O) {
                    sVGAView.setVideoItem(oo000oVar2);
                }
                sVGAView.OooO0oO(sVGAView.f10165OooOo0O);
                sVGAView.OooO();
            }
        } else {
            sVGAView.f10161OooOOoo = false;
            sVGAView.OooOOO0(sVGAView.f10165OooOo0O);
            sVGAView.OooO();
        }
        return Unit.INSTANCE;
    }
}
