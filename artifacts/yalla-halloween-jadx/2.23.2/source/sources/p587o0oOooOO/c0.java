package p587o0oOooOO;

import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.GifFaceBuyModel;
import com.yalla.yalla.model.gift.GifListJson;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.vm.LiveRoomVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p384o0OOoo0O.o000oOoO;
import p424o0OoO0Oo.o00OO0O0;
import p516o0o0O00o.o0oOO;
import p577o0oOoOo.o0oOo0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LiveRoomVM f56754OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0oOo0O0 f56755OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ GifListJson f56756OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f56757OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ q f56758OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(LiveRoomVM liveRoomVM, GifListJson gifListJson, o0oOo0O0 o0ooo0o1, LifecycleOwner lifecycleOwner, q qVar) {
        super(0);
        this.f56754OooO0Oo = liveRoomVM;
        this.f56756OooO0o0 = gifListJson;
        this.f56755OooO0o = o0ooo0o1;
        this.f56757OooO0oO = lifecycleOwner;
        this.f56758OooO0oo = qVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00OO0O0<ApiResult<GifFaceBuyModel>> o00oo0o0BuyEmoji = this.f56754OooO0Oo.buyEmoji(0, this.f56756OooO0o0.getCatalogId());
        o0oOO.OooO0O0(o00oo0o0BuyEmoji, this.f56755OooO0o, false, 6);
        o00oo0o0BuyEmoji.observe(this.f56757OooO0oO, new o000oOoO(new a0(this.f56758OooO0oo), b0.f56749OooO0Oo, null, true, 4));
        return Unit.INSTANCE;
    }
}
