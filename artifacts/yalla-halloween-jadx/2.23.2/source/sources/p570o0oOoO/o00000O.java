package p570o0oOoO;

import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000O;
import com.opensource.svgaplayer.OooO0OO;
import com.yalla.yalla.ui.view.room.RoomBroadcastViewAll;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o0OO0O0O.OooO;
import o0OO0O0O.OooOO0;
import o0OO0O0O.o00Ooo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000O implements OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Function1<Boolean, Unit> f56412OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ RoomBroadcastViewAll f56413OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ boolean f56414OooO0OO;

    /* JADX WARN: Multi-variable type inference failed */
    public o00000O(Function1<? super Boolean, Unit> function1, RoomBroadcastViewAll roomBroadcastViewAll, boolean z) {
        this.f56412OooO00o = function1;
        this.f56413OooO0O0 = roomBroadcastViewAll;
        this.f56414OooO0OO = z;
    }

    @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
    public final void OooO00o(@NotNull o00Ooo videoItem) {
        boolean z = this.f56414OooO0OO;
        RoomBroadcastViewAll roomBroadcastViewAll = this.f56413OooO0O0;
        Function1<Boolean, Unit> function1 = this.f56412OooO00o;
        Intrinsics.checkNotNullParameter(videoItem, "videoItem");
        try {
            OooOO0 oooOO1 = new OooOO0();
            RoomBroadcastViewAll.OooO0O0(roomBroadcastViewAll, oooOO1, z);
            OooO oooO = new OooO(videoItem, oooOO1);
            SVGAView sVGAView = roomBroadcastViewAll.f30750OooO0Oo.f43995OooOOO0;
            sVGAView.setImageDrawable(oooO);
            if (z) {
                sVGAView.setLoops(-1);
                sVGAView.OooO0Oo();
            } else {
                sVGAView.setLoops(1);
                sVGAView.OooO0Oo();
                sVGAView.OooO0o();
            }
            Intrinsics.checkNotNull(sVGAView);
            o000O.OooO00o(sVGAView);
            o000O.OooOOOO(sVGAView);
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
        }
    }

    @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
    public final void onError() {
        Function1<Boolean, Unit> function1 = this.f56412OooO00o;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
    }
}
