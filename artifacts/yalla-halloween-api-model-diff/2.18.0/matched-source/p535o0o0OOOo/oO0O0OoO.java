package p535o0o0OOOo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.mixedroom.model.RoomPKResultModel;
import com.app.base.mixedroom.model.RoomPkStartModel;
import com.app.base.model.ChatModel;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p160o00OoOO.o000O00O;
import p518o0o0O000.o0Oo0oo;
import p532o0o0OOO.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class oO0O0OoO implements o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public oO00000 f43505OooO00o;

    @Override // p535o0o0OOOo.o
    @NotNull
    public final String OooO00o() {
        return o.OooO00o.OooO00o(this);
    }

    public final void OooO0O0(int i, @Nullable byte[] bArr) {
        RoomPkStartModel startModel;
        RoomPKResultModel resultModel;
        o.OooO00o.OooO0O0(this, i, bArr);
        oO00000 oo00000 = null;
        switch (i) {
            case 1000300:
                if (bArr != null && (startModel = (RoomPkStartModel) o0Oo0oo.OooO0OO(new String(bArr, Charsets.UTF_8), RoomPkStartModel.class)) != null) {
                    oO00000 oo00001 = this.f43505OooO00o;
                    if (oo00001 != null) {
                        oo00000 = oo00001;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("chatMsgProcessor");
                    }
                    Objects.requireNonNull(oo00000);
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
                    o00OO0O0.f43338OooooOo.OooO00o().f43389OoooOo0.postValue(resultModel);
                    oO00000 oo00002 = this.f43505OooO00o;
                    if (oo00002 != null) {
                        oo00000 = oo00002;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("chatMsgProcessor");
                    }
                    Objects.requireNonNull(oo00000);
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
