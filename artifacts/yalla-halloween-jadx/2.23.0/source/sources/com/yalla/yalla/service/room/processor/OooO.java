package com.yalla.yalla.service.room.processor;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.model.InOutRoomModel;
import java.nio.charset.Charset;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooO implements OooO00o {
    @Override // com.yalla.yalla.service.room.processor.OooO00o
    @NotNull
    public final String OooO00o() {
        return OooO00o.C0319OooO00o.OooO00o(this);
    }

    public final void OooO0O0(int i, @Nullable Object obj) {
        OooO00o.C0319OooO00o.OooO0O0(this, i, obj);
        if (i == 10007) {
            byte[] bArr = (byte[]) obj;
            Charset charset = Charsets.UTF_8;
            InOutRoomModel inOutRoomModel = (InOutRoomModel) p140o00OOooo.OooOO0.OooO0O0(InOutRoomModel.class, new String(bArr, charset));
            p592o0oo00O.OooOOO0.OooO0OO("RoomIntoMsgProcessor", "parseInOrOutRoomMessage ".concat(new String(bArr, charset)));
            p592o0oo00O.OooOOO0.OooO0OO("RoomIntoMsgProcessor", "parseInOrOutRoomMessage2 ".concat(p140o00OOooo.OooOO0.OooO00o(inOutRoomModel)));
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new p477o0o000O.OooOOO0(inOutRoomModel, null), 3, null);
        }
    }
}
