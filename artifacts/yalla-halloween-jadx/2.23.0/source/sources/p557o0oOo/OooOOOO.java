package p557o0oOo;

import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000OO00;
import com.opensource.svgaplayer.OooO0OO;
import com.yalla.yalla.ui.view.room.RoomBroadcastViewAll;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o0OO0O0.OooO;
import o0OO0O0.OooOO0;
import o0OO0O0.oo000o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOOOO implements OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Function1<Boolean, Unit> f56164OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ RoomBroadcastViewAll f56165OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ boolean f56166OooO0OO;

    /* JADX WARN: Multi-variable type inference failed */
    public OooOOOO(Function1<? super Boolean, Unit> function1, RoomBroadcastViewAll roomBroadcastViewAll, boolean z) {
        this.f56164OooO00o = function1;
        this.f56165OooO0O0 = roomBroadcastViewAll;
        this.f56166OooO0OO = z;
    }

    @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
    public final void OooO00o(@NotNull oo000o videoItem) {
        boolean z = this.f56166OooO0OO;
        RoomBroadcastViewAll roomBroadcastViewAll = this.f56165OooO0O0;
        Function1<Boolean, Unit> function1 = this.f56164OooO00o;
        Intrinsics.checkNotNullParameter(videoItem, "videoItem");
        try {
            OooOO0 oooOO1 = new OooOO0();
            RoomBroadcastViewAll.OooO0O0(roomBroadcastViewAll, oooOO1, z);
            OooO oooO = new OooO(videoItem, oooOO1);
            SVGAView it = roomBroadcastViewAll.f31291OooO0Oo.f58998OooOOO0;
            it.setImageDrawable(oooO);
            if (z) {
                it.setLoops(-1);
                it.OooO0Oo();
            } else {
                it.setLoops(1);
                it.OooO0Oo();
                it.OooO0o();
            }
            Intrinsics.checkNotNullExpressionValue(it, "it");
            o000OO00.OooO00o(it);
            o000OO00.OooOOOO(it);
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
        Function1<Boolean, Unit> function1 = this.f56164OooO00o;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
    }
}
