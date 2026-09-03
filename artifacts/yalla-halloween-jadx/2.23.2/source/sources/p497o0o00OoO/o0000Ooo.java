package p497o0o00OoO;

import android.view.ViewGroup;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.yalla.yalla.ui.view.editTextSpan.MessageEditText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import p423o0OoO0OO.o00O0;
import p423o0OoO0OO.o00O00o0;
import p423o0OoO0OO.oo00o;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomBottomMessageInputComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomBottomMessageInputComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/MessageInputState$etMessageInput$2\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,585:1\n49#2:586\n65#2,16:587\n93#2,3:603\n58#2,23:606\n93#2,3:629\n*S KotlinDebug\n*F\n+ 1 RoomBottomMessageInputComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/MessageInputState$etMessageInput$2\n*L\n514#1:586\n514#1:587,16\n514#1:603,3\n525#1:606,23\n525#1:629,3\n*E\n"})
public final class o0000Ooo extends Lambda implements Function0<MessageEditText> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000 f49751OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000Ooo(o0000 o0000Var) {
        super(0);
        this.f49751OooO0Oo = o0000Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final MessageEditText invoke() {
        o0000 o0000Var = this.f49751OooO0Oo;
        MessageEditText messageEditText = new MessageEditText(o0000Var.f49682OooO00o);
        messageEditText.setBackground(null);
        messageEditText.setGravity(8388627);
        messageEditText.setHint(o0000.OooO0OO(o000000.please_chat_friendly));
        messageEditText.setTextColor(o0000.OooO00o(o0OOO0o.color_333333_85));
        messageEditText.setHintTextColor(o0000.OooO00o(o0OOO0o.color_333333_25));
        messageEditText.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        Intrinsics.checkNotNullParameter(messageEditText, "<this>");
        messageEditText.setTextSize(2, 14.0f);
        messageEditText.setTextAlignment(2);
        messageEditText.setMaxContentLength(200);
        messageEditText.setMaxContentTips(o0000.OooO0OO(o000000.char_room_text_lenght));
        messageEditText.setMaxEmojiCount(50);
        messageEditText.setMaxEmojiCountTips(o0000.OooO0OO(o000000.char_room_edit1));
        messageEditText.addTextChangedListener(new o00000OO(o0000Var));
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        o00000O0 o00000o1 = new o00000O0(objectRef, intRef);
        Intrinsics.checkNotNullParameter(messageEditText, "<this>");
        oo00o oo00oVar = new oo00o(messageEditText, o00000o1);
        Intrinsics.checkNotNullParameter(messageEditText, "<this>");
        messageEditText.addTextChangedListener(new o00O0(oo00oVar, o00O00o0.f46703OooO0Oo));
        messageEditText.addTextChangedListener(new o00000O(objectRef, o0000Var, intRef, messageEditText));
        o000O.OooOO0o(messageEditText, 0);
        o000O.OooOO0(messageEditText, 0);
        return messageEditText;
    }
}
