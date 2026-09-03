package p533o0o0Oo0;

import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.vm.LiveRoomVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p377o0OOoOo.o000O000;
import p420o0OoO0OO.o0OO00O;
import p507o0o00ooo.v0;
import p571o0oOoOO.o0O0OOO0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LiveRoomVM f54744OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f54745OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O0OOO0 f54746OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000(LiveRoomVM liveRoomVM, o0O0OOO0 o0o0ooo0, LifecycleOwner lifecycleOwner) {
        super(0);
        this.f54744OooO0Oo = liveRoomVM;
        this.f54746OooO0o0 = o0o0ooo0;
        this.f54745OooO0o = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000.OooO00o("102162");
        o0OO00O<ApiResult<Object>> o0oo00oFollowRoom = this.f54744OooO0Oo.followRoom(true);
        v0.OooO0O0(o0oo00oFollowRoom, this.f54746OooO0o0, false, 6);
        o000O000.OooO0Oo(o0oo00oFollowRoom, this.f54745OooO0o, false, null, null, o00oOoo.f54805OooO0Oo, 14);
        return Unit.INSTANCE;
    }
}
