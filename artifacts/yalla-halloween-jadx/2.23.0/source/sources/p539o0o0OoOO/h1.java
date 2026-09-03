package p539o0o0OoOO;

import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.GifFaceBuyModel;
import com.yalla.yalla.model.gift.GifListJson;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.vm.LiveRoomVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p377o0OOoOo.o0000OO0;
import p420o0OoO0OO.o0OO00O;
import p507o0o00ooo.v0;
import p571o0oOoOO.o0O0OOO0;

/* JADX INFO: loaded from: classes5.dex */
public final class h1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LiveRoomVM f55552OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0O0OOO0 f55553OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ GifListJson f55554OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f55555OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ v0 f55556OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(LiveRoomVM liveRoomVM, GifListJson gifListJson, o0O0OOO0 o0o0ooo0, LifecycleOwner lifecycleOwner, v0 v0Var) {
        super(0);
        this.f55552OooO0Oo = liveRoomVM;
        this.f55554OooO0o0 = gifListJson;
        this.f55553OooO0o = o0o0ooo0;
        this.f55555OooO0oO = lifecycleOwner;
        this.f55556OooO0oo = v0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO00O<ApiResult<GifFaceBuyModel>> o0oo00oBuyEmoji = this.f55552OooO0Oo.buyEmoji(0, this.f55554OooO0o0.getCatalogId());
        v0.OooO0O0(o0oo00oBuyEmoji, this.f55553OooO0o, false, 6);
        o0oo00oBuyEmoji.observe(this.f55555OooO0oO, new o0000OO0(new f1(this.f55556OooO0oo), g1.f55545OooO0Oo, null, true, 4));
        return Unit.INSTANCE;
    }
}
