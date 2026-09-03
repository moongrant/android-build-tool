package p502o0o00oOO;

import android.os.Looper;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p519o0o0O0oO.ooooO0O0;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OO00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f49582OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ ooo0o f49583OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ChatModel f49584OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OO00(ChatModel chatModel, ooo0o ooo0oVar, boolean z) {
        super(0);
        this.f49582OooO0Oo = z;
        this.f49584OooO0o0 = chatModel;
        this.f49583OooO0o = ooo0oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (!this.f49582OooO0Oo) {
            ChatModel chatModel = this.f49584OooO0o0;
            if (chatModel.getPkType() != 3) {
                if (chatModel.getPkType() == 2) {
                    o0OO000.OooO00o("102124");
                    String strOooO0OO = o0000.OooO0OO(oO00OOo0.room_mora_code_10048);
                    if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                        o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o.run();
                        } else {
                            o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                        }
                    }
                } else {
                    o0OO000.OooO00o("102123");
                    ooooO0O0 ooooo0o0 = new ooooO0O0(this.f49583OooO0o.f49471OooO00o, false);
                    long muuid = chatModel.getMuuid();
                    int giftid = chatModel.getGiftid();
                    String giftUrl = chatModel.getGiftUrl();
                    Intrinsics.checkNotNull(giftUrl);
                    String num = chatModel.getNum();
                    Intrinsics.checkNotNull(num);
                    int giftPrice = chatModel.getGiftPrice();
                    RoomUserInfoModel newFrom = chatModel.getNewFrom();
                    Intrinsics.checkNotNull(newFrom);
                    ooooo0o0.OooOO0O(muuid, giftid, giftUrl, num, giftPrice, newFrom, chatModel.getToUserId());
                    ooooo0o0.OooO();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
