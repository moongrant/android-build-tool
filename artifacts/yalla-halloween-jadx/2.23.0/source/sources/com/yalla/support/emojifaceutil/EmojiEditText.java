package com.yalla.support.emojifaceutil;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o0000O;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O00O;
import com.yalla.support.emojifaceutil.EmojiEditText;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p365o0OOo0Oo.OooOo;
import p365o0OOo0Oo.OooOo00;
import p365o0OOo0Oo.Oooo000;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0002%&B\u0011\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fB\u001b\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001e\u0010\"B#\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010$J\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001b\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016¨\u0006'"}, d2 = {"Lcom/yalla/support/emojifaceutil/EmojiEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "Landroid/text/Editable;", "getTransformedText", "", "OooOO0o", "I", "getMaxEmojiCount", "()I", "setMaxEmojiCount", "(I)V", "maxEmojiCount", "OooOOO0", "getMaxContentLength", "setMaxContentLength", "maxContentLength", "", "OooOOOo", "Ljava/lang/String;", "getMaxEmojiCountTips", "()Ljava/lang/String;", "setMaxEmojiCountTips", "(Ljava/lang/String;)V", "maxEmojiCountTips", "OooOOo0", "getMaxContentTips", "setMaxContentTips", "maxContentTips", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "OooO00o", "OooO0O0", "EmojiFaceUtil_release"}, k = 1, mv = {1, 8, 0})
public class EmojiEditText extends AppCompatEditText {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final /* synthetic */ int f22622OooOOo = 0;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f22623OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f22624OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name and from kotlin metadata */
    public int maxEmojiCount;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f22626OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name and from kotlin metadata */
    public int maxContentLength;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int f22628OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String maxEmojiCountTips;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String maxContentTips;

    public final class OooO00o implements InputFilter {
        public OooO00o() {
        }

        public static CharSequence OooO00o(int i, ArrayList arrayList, CharSequence charSequence) {
            int size = arrayList.size();
            int i2 = size - i;
            if (i2 < 0) {
                i2 = 0;
            }
            int i3 = size - 1;
            if (i2 <= i3) {
                while (true) {
                    Pair pair = (Pair) arrayList.get(i3);
                    charSequence = StringsKt.removeRange(charSequence, ((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue());
                    if (i3 == i2) {
                        break;
                    }
                    i3--;
                }
            }
            return charSequence;
        }

        @Override // android.text.InputFilter
        @NotNull
        public final CharSequence filter(@Nullable CharSequence charSequence, int i, int i2, @Nullable Spanned spanned, int i3, int i4) {
            List list;
            List listDropLast;
            boolean z = false;
            if (charSequence == null || charSequence.length() == 0) {
                return "";
            }
            ArrayList arrayListOooO00o = OooOo00.OooO00o(charSequence);
            int size = arrayListOooO00o.size();
            EmojiEditText emojiEditText = EmojiEditText.this;
            int maxContentLength = emojiEditText.getMaxContentLength() - emojiEditText.f22626OooOOO;
            int length = charSequence.length() - (emojiEditText.f22628OooOOOO * size);
            if (length <= maxContentLength) {
                if (emojiEditText.f22623OooOO0 + size <= emojiEditText.getMaxEmojiCount()) {
                    return charSequence;
                }
                CharSequence charSequenceOooO00o = OooO00o((emojiEditText.f22623OooOO0 + size) - emojiEditText.getMaxEmojiCount(), arrayListOooO00o, charSequence);
                if (emojiEditText.getMaxEmojiCountTips().length() > 0) {
                    o000O00O.OooO0O0(o0000O.OooO00o(emojiEditText.getMaxEmojiCountTips(), String.valueOf(emojiEditText.getMaxEmojiCount())));
                }
                return charSequenceOooO00o;
            }
            if (maxContentLength <= 0) {
                if (emojiEditText.getMaxContentTips().length() > 0) {
                    o000O00O.OooO0O0(o0000O.OooO00o(emojiEditText.getMaxContentTips(), String.valueOf(emojiEditText.getMaxContentLength())));
                }
                return "";
            }
            int i5 = emojiEditText.f22623OooOO0 + size;
            if (i5 > emojiEditText.getMaxEmojiCount()) {
                int maxEmojiCount = i5 - emojiEditText.getMaxEmojiCount();
                charSequence = OooO00o(maxEmojiCount, arrayListOooO00o, charSequence);
                emojiEditText.f22623OooOO0 -= maxEmojiCount;
                length -= maxEmojiCount;
                listDropLast = CollectionsKt.dropLast(arrayListOooO00o, maxEmojiCount);
                if (length <= maxContentLength) {
                    if (emojiEditText.getMaxEmojiCountTips().length() > 0) {
                        list = arrayListOooO00o;
                        list = listDropLast;
                        z = true;
                    }
                    if (z) {
                        o000O00O.OooO0O0(o0000O.OooO00o(emojiEditText.getMaxEmojiCountTips(), String.valueOf(emojiEditText.getMaxEmojiCount())));
                    }
                    return charSequence;
                }
            }
            list = arrayListOooO00o;
            list = listDropLast;
            list = arrayListOooO00o;
            int length2 = charSequence.length();
            int iIntValue = length2 - (length - maxContentLength);
            for (int size2 = list.size() - 1; -1 < size2; size2--) {
                Pair pair = (Pair) list.get(size2);
                if (iIntValue > ((Number) pair.getSecond()).intValue()) {
                    break;
                }
                if (iIntValue <= ((Number) pair.getSecond()).intValue() && iIntValue >= ((Number) pair.getFirst()).intValue()) {
                    iIntValue = ((Number) pair.getFirst()).intValue();
                }
            }
            if (emojiEditText.getMaxContentTips().length() > 0) {
                o000O00O.OooO0O0(o0000O.OooO00o(emojiEditText.getMaxContentTips(), String.valueOf(emojiEditText.getMaxContentLength())));
            }
            return StringsKt.removeRange(charSequence, iIntValue, length2);
        }
    }

    public final class OooO0O0 extends InputConnectionWrapper {
        public OooO0O0(InputConnection inputConnection) {
            super(inputConnection, true);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public final boolean deleteSurroundingText(int i, int i2) {
            if (i == 1 && i2 == 0) {
                return sendKeyEvent(new KeyEvent(0, 67)) && sendKeyEvent(new KeyEvent(1, 67));
            }
            return super.deleteSurroundingText(i, i2);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public final boolean sendKeyEvent(@NotNull KeyEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            int i = EmojiEditText.f22622OooOOo;
            return EmojiEditText.this.OooO0OO(event) || super.sendKeyEvent(event);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiEditText(@NotNull Context context) {
        super(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f22624OooOO0O = o0000O0.OooO00o(20);
        this.maxEmojiCount = 50;
        this.maxContentLength = 300;
        MutableLiveData<List<OooOo>> mutableLiveData = Oooo000.f43954OooO00o;
        this.f22628OooOOOO = Oooo000.f43958OooO0o0;
        this.maxEmojiCountTips = "";
        this.maxContentTips = "";
        setOnKeyListener(new View.OnKeyListener() { // from class: o0OOo0Oo.OooOOOO
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent event) {
                int i2 = EmojiEditText.f22622OooOOo;
                EmojiEditText this$0 = this.f43950OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullExpressionValue(event, "event");
                return this$0.OooO0OO(event);
            }
        });
        setFilters(new InputFilter[]{new OooO00o()});
    }

    public final boolean OooO0OO(KeyEvent keyEvent) {
        int selectionStart;
        int i;
        if (keyEvent.getKeyCode() != 67 || keyEvent.getAction() != 0 || getSelectionEnd() != (selectionStart = getSelectionStart()) || selectionStart < (i = this.f22628OooOOOO)) {
            return false;
        }
        int i2 = selectionStart - i;
        CharSequence chars = getEditableText().subSequence(i2, selectionStart);
        Intrinsics.checkNotNullParameter(chars, "chars");
        String string = chars.toString();
        MutableLiveData<List<OooOo>> mutableLiveData = Oooo000.f43954OooO00o;
        if (!(Oooo000.OooO0O0(StringsKt__StringsKt.removeSuffix(string, (CharSequence) "_")) != null)) {
            return false;
        }
        getEditableText().delete(i2, selectionStart);
        return true;
    }

    public final int getMaxContentLength() {
        return this.maxContentLength;
    }

    @NotNull
    public final String getMaxContentTips() {
        return this.maxContentTips;
    }

    public final int getMaxEmojiCount() {
        return this.maxEmojiCount;
    }

    @NotNull
    public final String getMaxEmojiCountTips() {
        return this.maxEmojiCountTips;
    }

    @NotNull
    public final Editable getTransformedText() {
        Editable text = super.getText();
        if (text == null) {
            return new SpannableStringBuilder();
        }
        String string = text.toString();
        char[] charArray = string.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        String str = new String(charArray);
        ArrayList arrayListOooO00o = OooOo00.OooO00o(string);
        if (!arrayListOooO00o.isEmpty()) {
            for (int size = arrayListOooO00o.size() - 1; -1 < size; size--) {
                Pair pair = (Pair) arrayListOooO00o.get(size);
                str = StringsKt.removeRange((CharSequence) str, ((Number) pair.getSecond()).intValue() - 1, ((Number) pair.getSecond()).intValue()).toString();
            }
        }
        return new SpannableStringBuilder(str);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    @NotNull
    public InputConnection onCreateInputConnection(@NotNull EditorInfo outAttrs) {
        Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
        return new OooO0O0(super.onCreateInputConnection(outAttrs));
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        try {
            super.onDraw(canvas);
        } catch (Exception unused) {
        }
    }

    @Override // android.widget.TextView
    public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        int length;
        int identifier;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Editable editableText = getEditableText();
        Intrinsics.checkNotNullParameter(context, "context");
        int i4 = 0;
        if (editableText == null) {
            length = 0;
        } else {
            Matcher matcher = Oooo000.f43957OooO0Oo.matcher(editableText);
            ImageSpan[] existsEmoji = (ImageSpan[]) editableText.getSpans(0, editableText.length(), ImageSpan.class);
            int[] iArr = new int[existsEmoji.length];
            Intrinsics.checkNotNullExpressionValue(existsEmoji, "existsEmoji");
            int length2 = existsEmoji.length;
            int i5 = 0;
            int i6 = 0;
            while (i5 < length2) {
                iArr[i6] = editableText.getSpanStart(existsEmoji[i5]);
                i5++;
                i6++;
            }
            length = existsEmoji.length;
            while (matcher.find()) {
                String faceTag = matcher.group();
                if (!ArraysKt.contains(iArr, matcher.start())) {
                    Intrinsics.checkNotNullExpressionValue(faceTag, "faceTag");
                    MutableLiveData<List<OooOo>> mutableLiveData = Oooo000.f43954OooO00o;
                    String strOooO0O0 = Oooo000.OooO0O0(StringsKt__StringsKt.removeSuffix(faceTag, (CharSequence) "_"));
                    if (strOooO0O0 != null && (identifier = context.getResources().getIdentifier(StringsKt.OooOoO(strOooO0O0, ".png", ""), "raw", context.getPackageName())) > 0) {
                        length++;
                        Drawable drawable = context.getResources().getDrawable(identifier);
                        int i7 = this.f22624OooOO0O;
                        drawable.setBounds(0, 0, i7, i7);
                        editableText.setSpan(new ImageSpan(drawable), matcher.start(), matcher.end(), 33);
                    }
                }
            }
        }
        this.f22623OooOO0 = length;
        if (charSequence != null) {
            int length3 = charSequence.length();
            int i8 = this.f22623OooOO0;
            i4 = (length3 - (this.f22628OooOOOO * i8)) + i8;
        }
        this.f22626OooOOO = i4;
    }

    public final void setMaxContentLength(int i) {
        this.maxContentLength = i;
    }

    public final void setMaxContentTips(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.maxContentTips = str;
    }

    public final void setMaxEmojiCount(int i) {
        this.maxEmojiCount = i;
    }

    public final void setMaxEmojiCountTips(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.maxEmojiCountTips = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiEditText(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f22624OooOO0O = o0000O0.OooO00o(20);
        this.maxEmojiCount = 50;
        this.maxContentLength = 300;
        MutableLiveData<List<OooOo>> mutableLiveData = Oooo000.f43954OooO00o;
        this.f22628OooOOOO = Oooo000.f43958OooO0o0;
        this.maxEmojiCountTips = "";
        this.maxContentTips = "";
        setOnKeyListener(new View.OnKeyListener() { // from class: o0OOo0Oo.OooOOOO
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent event) {
                int i2 = EmojiEditText.f22622OooOOo;
                EmojiEditText this$0 = this.f43950OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullExpressionValue(event, "event");
                return this$0.OooO0OO(event);
            }
        });
        setFilters(new InputFilter[]{new OooO00o()});
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiEditText(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f22624OooOO0O = o0000O0.OooO00o(20);
        this.maxEmojiCount = 50;
        this.maxContentLength = 300;
        MutableLiveData<List<OooOo>> mutableLiveData = Oooo000.f43954OooO00o;
        this.f22628OooOOOO = Oooo000.f43958OooO0o0;
        this.maxEmojiCountTips = "";
        this.maxContentTips = "";
        setOnKeyListener(new View.OnKeyListener() { // from class: o0OOo0Oo.OooOOOO
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent event) {
                int i3 = EmojiEditText.f22622OooOOo;
                EmojiEditText this$0 = this.f43950OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullExpressionValue(event, "event");
                return this$0.OooO0OO(event);
            }
        });
        setFilters(new InputFilter[]{new OooO00o()});
    }
}
