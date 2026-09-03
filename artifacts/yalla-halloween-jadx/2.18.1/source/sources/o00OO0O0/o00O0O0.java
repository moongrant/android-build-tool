package o00OO0O0;

import com.app.base.model.ChatModel;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p391o0OOooOo.o0O00000;
import p579o0oOoOOo.O0000000;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f31502Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ChatModel f31503Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o00O0O00 f31504Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O0(boolean z, ChatModel chatModel, o00O0O00 o00o0o01) {
        super(0);
        this.f31502Oooo0o = z;
        this.f31503Oooo0oO = chatModel;
        this.f31504Oooo0oo = o00o0o01;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i;
        if (this.f31502Oooo0o || (i = this.f31503Oooo0oO.pkType) == 3) {
            return null;
        }
        if (i == 2) {
            o0O00000.OooO0OO("InRoom_game_roshambo_expired");
            ToastUtil.f12567OooO00o.OooO0O0(p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_mora_code_10048));
            return null;
        }
        o0O00000.OooO0OO("InRoom_game_roshambo_pk");
        O0000000 o0000000 = new O0000000(this.f31504Oooo0oo.f31399OooO00o, false);
        ChatModel chatModel = this.f31503Oooo0oO;
        long j = chatModel.muuid;
        int i2 = chatModel.giftid;
        String str = chatModel.giftUrl;
        Intrinsics.checkNotNullExpressionValue(str, "model.giftUrl");
        String str2 = this.f31503Oooo0oO.num;
        Intrinsics.checkNotNullExpressionValue(str2, "model.num");
        ChatModel chatModel2 = this.f31503Oooo0oO;
        int i3 = chatModel2.giftPrice;
        RoomUserInfoModel roomUserInfoModel = chatModel2.from;
        Intrinsics.checkNotNullExpressionValue(roomUserInfoModel, "model.from");
        o0000000.OooOOO0(j, i2, str, str2, i3, roomUserInfoModel, this.f31503Oooo0oO.toUserId);
        o0000000.OooOO0();
        return null;
    }
}
