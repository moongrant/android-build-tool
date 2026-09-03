package p533o0o0OOOo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.mixedroom.model.RoomPKResultModel;
import com.app.base.mixedroom.model.RoomPkStartModel;
import com.app.base.model.ChatModel;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159o00OoOO.o000O00O;
import p516o0o0O000.o0Oo0oo;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class oO00O0o0 implements oO00000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public oO00000o f43488OooO00o;

    @Override // p533o0o0OOOo.oO00000
    @NotNull
    public final String OooO00o() {
        return oO00000.OooO00o.OooO00o(this);
    }

    public final void OooO0O0(int i, @Nullable byte[] bArr) {
        RoomPkStartModel startModel;
        RoomPKResultModel resultModel;
        oO00000.OooO00o.OooO0O0(this, i, bArr);
        oO00000o oo00000o = null;
        switch (i) {
            case 1000300:
                if (bArr != null && (startModel = (RoomPkStartModel) o0Oo0oo.OooO0OO(new String(bArr, Charsets.UTF_8), RoomPkStartModel.class)) != null) {
                    oO00000o oo00000o2 = this.f43488OooO00o;
                    if (oo00000o2 != null) {
                        oo00000o = oo00000o2;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("chatMsgProcessor");
                    }
                    Objects.requireNonNull(oo00000o);
                    Intrinsics.checkNotNullParameter(startModel, "startModel");
                    ChatModel chatModel = new ChatModel();
                    chatModel.type = 22;
                    ChatModel.PkStart pkStart = new ChatModel.PkStart();
                    pkStart.roomNameA = startModel.getRoom_a_name();
                    pkStart.roomNameB = startModel.getRoom_b_name();
                    chatModel.pkStart = pkStart;
                    o000O00O.OooO().OooO00o(chatModel);
                }
                break;
            case 1000301:
                if (bArr != null && (resultModel = (RoomPKResultModel) o0Oo0oo.OooO0OO(new String(bArr, Charsets.UTF_8), RoomPKResultModel.class)) != null) {
                    o00OO00O.f43313OooooOo.OooO00o().f43364OoooOo0.postValue(resultModel);
                    oO00000o oo00000o3 = this.f43488OooO00o;
                    if (oo00000o3 != null) {
                        oo00000o = oo00000o3;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("chatMsgProcessor");
                    }
                    Objects.requireNonNull(oo00000o);
                    Intrinsics.checkNotNullParameter(resultModel, "resultModel");
                    ChatModel.PkResult pkResult = new ChatModel.PkResult();
                    pkResult.roomNameA = resultModel.getRoom_a_name();
                    pkResult.roomNameB = resultModel.getRoom_b_name();
                    pkResult.giftNumberA = resultModel.getRoom_a_giftnumber();
                    pkResult.giftNumberB = resultModel.getRoom_b_giftnumber();
                    pkResult.giftUrl = resultModel.getGift_picurl();
                    ChatModel chatModel2 = new ChatModel();
                    chatModel2.type = 23;
                    chatModel2.pkResult = pkResult;
                    o000O00O.OooO().OooO00o(chatModel2);
                }
                break;
        }
    }
}
