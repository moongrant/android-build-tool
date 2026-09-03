package p601o0oo00Oo;

import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.ui.view.RoomBroadcastStaticView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p254o00ooO0O.oOO00O;
import p405o0Oo0OO0.OooO;
import p405o0Oo0OO0.OooOO0;
import p405o0Oo0OO0.OooOo;
import p405o0Oo0OO0.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO0O0 implements OooOo00.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Function1<Boolean, Unit> f48200OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ RoomBroadcastStaticView f48201OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ boolean f48202OooO0OO;

    /* JADX WARN: Multi-variable type inference failed */
    public o0OO0O0(Function1<? super Boolean, Unit> function1, RoomBroadcastStaticView roomBroadcastStaticView, boolean z) {
        this.f48200OooO00o = function1;
        this.f48201OooO0O0 = roomBroadcastStaticView;
        this.f48202OooO0OO = z;
    }

    @Override // o0Oo0OO0.OooOo00.OooO0O0
    public final void onComplete(@NotNull OooOo videoItem) {
        Intrinsics.checkNotNullParameter(videoItem, "videoItem");
        try {
            OooOO0 oooOO1 = new OooOO0();
            RoomBroadcastStaticView.OooO0O0(this.f48201OooO0O0, oooOO1, this.f48202OooO0OO);
            OooO oooO = new OooO(videoItem, oooOO1);
            SVGAView it = this.f48201OooO0O0.f25082Oooo0o.f49133OooOOO0;
            boolean z = this.f48202OooO0OO;
            it.setImageDrawable(oooO);
            if (z) {
                it.setLoops(-1);
                it.OooO0OO();
            } else {
                it.setLoops(1);
                it.OooO0OO();
                it.OooO0Oo();
            }
            Intrinsics.checkNotNullExpressionValue(it, "it");
            Intrinsics.checkNotNullParameter(it, "<this>");
            it.setRotationY(it.getContext().getResources().getConfiguration().getLayoutDirection() == 1 ? 180.0f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            oOO00O.OooO(it);
            Function1<Boolean, Unit> function1 = this.f48200OooO00o;
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Function1<Boolean, Unit> function2 = this.f48200OooO00o;
            if (function2 != null) {
                function2.invoke(Boolean.FALSE);
            }
        }
    }

    @Override // o0Oo0OO0.OooOo00.OooO0O0
    public final void onError() {
        Function1<Boolean, Unit> function1 = this.f48200OooO00o;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
    }
}
