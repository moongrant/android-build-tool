package p598o0oo00O;

import Oooo0.o00;
import androidx.compose.foundation.layout.SizeKt;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.StoreRoomChatBubbleModel;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00000.OooO0O0;
import p028Oooo0o0.o0O0O0O;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p254o00ooO0O.o0000oo;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0OOo0o extends Lambda implements Function3<o0O0O0O, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ StoreRoomChatBubbleModel f47854Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OOo0o(StoreRoomChatBubbleModel storeRoomChatBubbleModel) {
        super(3);
        this.f47854Oooo0o = storeRoomChatBubbleModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(o0O0O0O o0o0o0o, oOO00O ooo00o, Integer num) {
        o0O0O0O TextButton = o0o0o0o;
        oOO00O ooo00o2 = ooo00o;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        if ((iIntValue & 81) == 16 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            if (this.f47854Oooo0o.getSelected()) {
                o00.OooO00o(OooO0O0.OooO00o(R.drawable.ic_store_bubble_use, ooo00o2), null, SizeKt.OooOO0(o00OOOO0.OooO00o.f4198Oooo0o, 12), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, ooo00o2, 440, 120);
                o0000oo.OooO0O0(8, null, ooo00o2, 6, 2);
            }
        }
        return Unit.INSTANCE;
    }
}
