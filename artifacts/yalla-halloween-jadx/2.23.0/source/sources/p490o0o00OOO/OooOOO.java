package p490o0o00OOO;

import android.view.ViewGroup;
import com.code.android.util.o0000;
import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.view.editTextSpan.MessageEditText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import p417o0OoO0.o0000O;
import p417o0OoO0.o0000OO0;
import p417o0OoO0.o000OO;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomBottomMessageInputComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomBottomMessageInputComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/MessageInputState$etMessageInput$2\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,584:1\n49#2:585\n65#2,16:586\n93#2,3:602\n58#2,23:605\n93#2,3:628\n*S KotlinDebug\n*F\n+ 1 RoomBottomMessageInputComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/MessageInputState$etMessageInput$2\n*L\n513#1:585\n513#1:586,16\n513#1:602,3\n524#1:605,23\n524#1:628,3\n*E\n"})
public final class OooOOO extends Lambda implements Function0<MessageEditText> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOOO f48494OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(OooOOOO oooOOOO) {
        super(0);
        this.f48494OooO0Oo = oooOOOO;
    }

    @Override // kotlin.jvm.functions.Function0
    public final MessageEditText invoke() {
        OooOOOO oooOOOO = this.f48494OooO0Oo;
        MessageEditText messageEditText = new MessageEditText(oooOOOO.f48497OooO00o);
        messageEditText.setBackground(null);
        messageEditText.setGravity(8388627);
        messageEditText.setHint(o0000.OooO0OO(oO00OOo0.please_chat_friendly));
        messageEditText.setTextColor(o0000.OooO00o(oO00O0o.color_333333_85));
        messageEditText.setHintTextColor(o0000.OooO00o(oO00O0o.color_333333_25));
        messageEditText.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        Intrinsics.checkNotNullParameter(messageEditText, "<this>");
        messageEditText.setTextSize(2, 14.0f);
        messageEditText.setTextAlignment(2);
        messageEditText.setMaxContentLength(200);
        messageEditText.setMaxContentTips(o0000.OooO0OO(oO00OOo0.char_room_text_lenght));
        messageEditText.setMaxEmojiCount(50);
        messageEditText.setMaxEmojiCountTips(o0000.OooO0OO(oO00OOo0.char_room_edit1));
        messageEditText.addTextChangedListener(new OooOOO0(oooOOOO));
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        OooOO0 oooOO1 = new OooOO0(objectRef, intRef);
        Intrinsics.checkNotNullParameter(messageEditText, "<this>");
        o0000O o0000o2 = new o0000O(messageEditText, oooOO1);
        Intrinsics.checkNotNullParameter(messageEditText, "<this>");
        messageEditText.addTextChangedListener(new o0000OO0(o0000o2, o000OO.f45514OooO0Oo));
        messageEditText.addTextChangedListener(new OooOO0O(objectRef, oooOOOO, intRef, messageEditText));
        o000OO00.OooOO0o(messageEditText, 0);
        o000OO00.OooOO0(messageEditText, 0);
        return messageEditText;
    }
}
