package com.yalla.yalla.ui.activity.message;

import android.view.ViewGroup;
import com.yalla.support.emojifaceutil.EmojiEditText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo extends Lambda implements Function0<EmojiEditText> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f25219OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(Oooo000 oooo000) {
        super(0);
        this.f25219OooO0Oo = oooo000;
    }

    @Override // kotlin.jvm.functions.Function0
    public final EmojiEditText invoke() {
        Oooo000 oooo000 = this.f25219OooO0Oo;
        EmojiEditText emojiEditText = new EmojiEditText(oooo000.f25224OooO00o);
        emojiEditText.setBackground(null);
        emojiEditText.setGravity(8388627);
        emojiEditText.setHint(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.please_chat_friendly));
        emojiEditText.setTextColor(p423o0OoO0OO.o00O0OOO.OooO00o(p562o0oOo000.o0OOO0o.color_333333_85, emojiEditText));
        emojiEditText.setHintTextColor(p423o0OoO0OO.o00O0OOO.OooO00o(p562o0oOo000.o0OOO0o.color_333333_25, emojiEditText));
        emojiEditText.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Intrinsics.checkNotNullParameter(emojiEditText, "<this>");
        emojiEditText.setTextSize(2, 14.0f);
        emojiEditText.setMaxContentLength(300);
        emojiEditText.setMaxContentTips(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.char_room_text_lenght));
        emojiEditText.setMaxEmojiCount(50);
        emojiEditText.setMaxEmojiCountTips(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.char_room_edit1));
        emojiEditText.setPadding(0, 0, 0, 0);
        emojiEditText.addTextChangedListener(new OooOo00(oooo000));
        float f = 6;
        emojiEditText.setPadding(0, com.code.android.util.o0000O0.OooO00o(f), 0, com.code.android.util.o0000O0.OooO00o(f));
        return emojiEditText;
    }
}
