package p509o0o00ooO;

import android.os.Looper;
import androidx.activity.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o0oo0000.OooO00o;
import p562o0oOo000.o000000;
import p650o0ooo.oOOO0OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class e4 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f50664OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ d4 f50665OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ChatModel f50666OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(ChatModel chatModel, d4 d4Var, boolean z) {
        super(0);
        this.f50664OooO0Oo = z;
        this.f50666OooO0o0 = chatModel;
        this.f50665OooO0o = d4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (!this.f50664OooO0Oo) {
            ChatModel chatModel = this.f50666OooO0o0;
            if (chatModel.getPkType() != 3) {
                if (chatModel.getPkType() == 2) {
                    OooO00o.OooO0O0("102124");
                    String strOooO0OO = o0000.OooO0OO(o000000.room_mora_code_10048);
                    if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                        o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o.run();
                        } else {
                            o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                        }
                    }
                } else {
                    OooO00o.OooO0O0("102123");
                    oOOO0OO0 oooo0oo0 = new oOOO0OO0(this.f50665OooO0o.f50780OooO00o, false);
                    long muuid = chatModel.getMuuid();
                    int giftid = chatModel.getGiftid();
                    String giftUrl = chatModel.getGiftUrl();
                    Intrinsics.checkNotNull(giftUrl);
                    String num = chatModel.getNum();
                    Intrinsics.checkNotNull(num);
                    int giftPrice = chatModel.getGiftPrice();
                    RoomUserInfoModel newFrom = chatModel.getNewFrom();
                    Intrinsics.checkNotNull(newFrom);
                    oooo0oo0.OooOO0O(muuid, giftid, giftUrl, num, giftPrice, newFrom, chatModel.getToUserId());
                    oooo0oo0.OooO();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
