package p175o00OooOo;

import androidx.lifecycle.LifecycleOwner;
import com.app.base.view.FacePanelView;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.GifFaceBuyModel;
import com.yalla.yalla.common.vm.LiveRoomVM;
import com.yalla.yalla.model.GifListJson;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0o0000.OooOo;
import p484o0o000OO.OooOOOO;
import p571o0oOo0o.oo00o;
import p604o0oo00oO.oO0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0oo00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f32721Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ LiveRoomVM f32722Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ GifListJson f32723Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ oO0Oo0oo f32724Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ FacePanelView.OooO0O0 f32725OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0oo00(LiveRoomVM liveRoomVM, GifListJson gifListJson, oO0Oo0oo oo0oo0oo, LifecycleOwner lifecycleOwner, FacePanelView.OooO0O0 oooO0O0) {
        super(0);
        this.f32722Oooo0o = liveRoomVM;
        this.f32723Oooo0oO = gifListJson;
        this.f32724Oooo0oo = oo0oo0oo;
        this.f32721Oooo = lifecycleOwner;
        this.f32725OoooO00 = oooO0O0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooOOOO<ApiResult<GifFaceBuyModel>> oooOOOOBuyEmoji = this.f32722Oooo0o.buyEmoji(0, this.f32723Oooo0oO.getCatalogId());
        oo00o.OooO0O0(oooOOOOBuyEmoji, this.f32724Oooo0oo);
        oooOOOOBuyEmoji.observe(this.f32721Oooo, new OooOo(new o0O0o0(this.f32725OoooO00), o0oOo0O0.f32759Oooo0o, null, true, 4));
        return Unit.INSTANCE;
    }
}
