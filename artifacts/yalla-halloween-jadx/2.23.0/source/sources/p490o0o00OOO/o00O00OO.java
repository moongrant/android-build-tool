package p490o0o00OOO;

import android.widget.FrameLayout;
import androidx.compose.runtime.MutableState;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO00o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O f48643OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f48644OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00OO(o000O o000o, RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f48643OooO0Oo = o000o;
        this.f48644OooO0o0 = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        final o000O o000o = this.f48643OooO0Oo;
        o000o.getClass();
        o0OO000.OooO00o("102186");
        MutableState<Boolean> mutableState = OooO00o.f24979OooO0oO.f47384OooOOOO;
        Boolean bool = Boolean.FALSE;
        mutableState.setValue(bool);
        OooO00o.f24981OooOO0.f47412OooO00o.setValue(bool);
        FrameLayout frameLayout = o000o.f48470OooO00o.f23434OooOoO;
        final RoomUserInfoModel roomUserInfoModel = this.f48644OooO0o0;
        frameLayout.postDelayed(new Runnable() { // from class: o0o00OOO.o0000O
            @Override // java.lang.Runnable
            public final void run() {
                o000O this$0 = o000o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                RoomUserInfoModel userModel = roomUserInfoModel;
                Intrinsics.checkNotNullParameter(userModel, "$userModel");
                this$0.f48470OooO00o.OooOoO(userModel);
            }
        }, 200L);
        return Unit.INSTANCE;
    }
}
