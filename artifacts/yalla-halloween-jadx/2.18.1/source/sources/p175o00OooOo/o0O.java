package p175o00OooOo;

import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LifecycleOwner;
import com.app.base.view.FacePanelView;
import com.yalla.yalla.common.vm.LiveRoomVM;
import com.yalla.yalla.model.GifListJson;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00OOO00.OooOO0O;
import p043OooooO0.o00O0000;
import p139o00OOOo0.oo0o0O0;
import p604o0oo00oO.oO0Oo0oo;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes.dex */
public final class o0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ oO0Oo0oo f32698Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ComposeView f32699Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ GifListJson f32700Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ LiveRoomVM f32701Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ FacePanelView.OooO0O0 f32702OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f32703OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O(ComposeView composeView, GifListJson gifListJson, LiveRoomVM liveRoomVM, oO0Oo0oo oo0oo0oo, LifecycleOwner lifecycleOwner, FacePanelView.OooO0O0 oooO0O0) {
        super(0);
        this.f32699Oooo0o = composeView;
        this.f32700Oooo0oO = gifListJson;
        this.f32701Oooo0oo = liveRoomVM;
        this.f32698Oooo = oo0oo0oo;
        this.f32703OoooO00 = lifecycleOwner;
        this.f32702OoooO0 = oooO0O0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context context = this.f32699Oooo0o.getContext();
        Object obj = context instanceof Activity ? (Activity) context : null;
        GifListJson gifListJson = this.f32700Oooo0oO;
        o0O0oo00 confirmClick = new o0O0oo00(this.f32701Oooo0oo, gifListJson, this.f32698Oooo, this.f32703OoooO00, this.f32702OoooO0);
        Intrinsics.checkNotNullParameter(gifListJson, "gifListJson");
        Intrinsics.checkNotNullParameter(confirmClick, "confirmClick");
        OooOo.OooO0O0("302009");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.app.base.base.activity.IComposeDialog");
        ((OooOO0O) obj).showDialog(null, o00O0000.OooO0O0(363378809, true, new oo0o0O0(confirmClick, gifListJson)));
        return Unit.INSTANCE;
    }
}
