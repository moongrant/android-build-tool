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
import com.umeng.analytics.pro.d;
import com.yalla.support.common.util.OooOo;
import com.yalla.support.common.util.OooOo00;
import com.yalla.support.emojifaceutil.EmojiEditText;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o00oOoo;
import p453o0Ooo.OooO0o;
import p453o0Ooo.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0002%&B\u0011\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fB\u001b\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001e\u0010\"B#\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010$J\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001b\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016¨\u0006'"}, d2 = {"Lcom/yalla/support/emojifaceutil/EmojiEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "Landroid/text/Editable;", "getTransformedText", "", "OoooO", "I", "getMaxEmojiCount", "()I", "setMaxEmojiCount", "(I)V", "maxEmojiCount", "OoooOO0", "getMaxContentLength", "setMaxContentLength", "maxContentLength", "", "OoooOOo", "Ljava/lang/String;", "getMaxEmojiCountTips", "()Ljava/lang/String;", "setMaxEmojiCountTips", "(Ljava/lang/String;)V", "maxEmojiCountTips", "OoooOo0", "getMaxContentTips", "setMaxContentTips", "maxContentTips", "Landroid/content/Context;", d.R, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "OooO00o", "OooO0O0", "EmojiFaceUtil_release"}, k = 1, mv = {1, 7, 1})
public class EmojiEditText extends AppCompatEditText {

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public static final /* synthetic */ int f20511OoooOoO = 0;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name and from kotlin metadata */
    public int maxEmojiCount;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f20513OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f20514OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name and from kotlin metadata */
    public int maxContentLength;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f20516OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String maxEmojiCountTips;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String maxContentTips;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public int f20519o000oOoO;

    public final class OooO00o implements InputFilter {
        public OooO00o() {
        }

        public final CharSequence OooO00o(int i, List<Pair<Integer, Integer>> list, CharSequence charSequence) {
            int size = list.size();
            int i2 = size - i;
            if (i2 < 0) {
                i2 = 0;
            }
            int i3 = size - 1;
            if (i2 <= i3) {
                while (true) {
                    Pair<Integer, Integer> pair = list.get(i3);
                    charSequence = StringsKt.removeRange(charSequence, pair.getFirst().intValue(), pair.getSecond().intValue());
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
            if (charSequence == null || charSequence.length() == 0) {
                return "";
            }
            List<Pair<Integer, Integer>> listOooO00o = OooO0o.OooO00o(charSequence);
            int size = ((ArrayList) listOooO00o).size();
            int maxContentLength = EmojiEditText.this.getMaxContentLength() - EmojiEditText.this.f20519o000oOoO;
            int length = charSequence.length();
            EmojiEditText emojiEditText = EmojiEditText.this;
            int i5 = length - (emojiEditText.f20516OoooOOO * size);
            if (i5 <= maxContentLength) {
                if (emojiEditText.f20513OoooO0 + size <= emojiEditText.getMaxEmojiCount()) {
                    return charSequence;
                }
                EmojiEditText emojiEditText2 = EmojiEditText.this;
                CharSequence charSequenceOooO00o = OooO00o((emojiEditText2.f20513OoooO0 + size) - emojiEditText2.getMaxEmojiCount(), listOooO00o, charSequence);
                if (EmojiEditText.this.getMaxEmojiCountTips().length() > 0) {
                    o00oOoo.OooO0O0(OooOo.OooO00o(EmojiEditText.this.getMaxEmojiCountTips(), String.valueOf(EmojiEditText.this.getMaxEmojiCount())));
                }
                return charSequenceOooO00o;
            }
            if (maxContentLength <= 0) {
                if (emojiEditText.getMaxContentTips().length() > 0) {
                    o00oOoo.OooO0O0(OooOo.OooO00o(EmojiEditText.this.getMaxContentTips(), String.valueOf(EmojiEditText.this.getMaxContentLength())));
                }
                return "";
            }
            int i6 = emojiEditText.f20513OoooO0 + size;
            if (i6 > emojiEditText.getMaxEmojiCount()) {
                int maxEmojiCount = i6 - EmojiEditText.this.getMaxEmojiCount();
                charSequence = OooO00o(maxEmojiCount, listOooO00o, charSequence);
                EmojiEditText.this.f20513OoooO0 -= maxEmojiCount;
                i5 -= maxEmojiCount;
                listOooO00o = CollectionsKt.dropLast(listOooO00o, maxEmojiCount);
                if (i5 <= maxContentLength) {
                    if (EmojiEditText.this.getMaxEmojiCountTips().length() > 0) {
                        o00oOoo.OooO0O0(OooOo.OooO00o(EmojiEditText.this.getMaxEmojiCountTips(), String.valueOf(EmojiEditText.this.getMaxEmojiCount())));
                    }
                    return charSequence;
                }
            }
            int length2 = charSequence.length();
            int iIntValue = length2 - (i5 - maxContentLength);
            for (int size2 = listOooO00o.size() - 1; -1 < size2; size2--) {
                Pair<Integer, Integer> pair = listOooO00o.get(size2);
                if (iIntValue > pair.getSecond().intValue()) {
                    break;
                }
                if (iIntValue <= pair.getSecond().intValue() && iIntValue >= pair.getFirst().intValue()) {
                    iIntValue = pair.getFirst().intValue();
                }
            }
            if (EmojiEditText.this.getMaxContentTips().length() > 0) {
                o00oOoo.OooO0O0(OooOo.OooO00o(EmojiEditText.this.getMaxContentTips(), String.valueOf(EmojiEditText.this.getMaxContentLength())));
            }
            return StringsKt.removeRange(charSequence, iIntValue, length2);
        }
    }

    public final class OooO0O0 extends InputConnectionWrapper {
        /* JADX WARN: Incorrect types in method signature: (Landroid/view/inputmethod/InputConnection;Z)V */
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
            EmojiEditText emojiEditText = EmojiEditText.this;
            int i = EmojiEditText.f20511OoooOoO;
            return emojiEditText.OooO0OO(event) || super.sendKeyEvent(event);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiEditText(@NotNull Context context) {
        super(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f20514OoooO0O = OooOo00.OooO00o(20.0f);
        this.maxEmojiCount = 50;
        this.maxContentLength = ShopVehicleListModel.VehicleTagType_Vip300;
        OooOO0 oooOO1 = OooOO0.f40347OooO00o;
        this.f20516OoooOOO = OooOO0.f40351OooO0o;
        this.maxEmojiCountTips = "";
        this.maxContentTips = "";
        setOnKeyListener(new View.OnKeyListener() { // from class: o0Ooo.OooO0OO
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                return EmojiEditText.OooO0O0(this.f40346Oooo0o, keyEvent);
            }
        });
        setFilters(new InputFilter[]{new OooO00o()});
    }

    public static boolean OooO0O0(EmojiEditText this$0, KeyEvent event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(event, "event");
        return this$0.OooO0OO(event);
    }

    public final boolean OooO0OO(KeyEvent keyEvent) {
        int selectionStart;
        int i;
        if (keyEvent.getKeyCode() != 67 || keyEvent.getAction() != 0 || getSelectionEnd() != (selectionStart = getSelectionStart()) || selectionStart < (i = this.f20516OoooOOO)) {
            return false;
        }
        int i2 = selectionStart - i;
        CharSequence chars = getEditableText().subSequence(selectionStart - this.f20516OoooOOO, selectionStart);
        Intrinsics.checkNotNullParameter(chars, "chars");
        String string = chars.toString();
        OooOO0 oooOO1 = OooOO0.f40347OooO00o;
        if (!(OooOO0.OooO0O0(StringsKt.removeSuffix(string, (CharSequence) "_")) != null)) {
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
        ArrayList arrayList = (ArrayList) OooO0o.OooO00o(string);
        if (!arrayList.isEmpty()) {
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                Pair pair = (Pair) arrayList.get(size);
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
        int i4;
        int identifier;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Editable editableText = getEditableText();
        int i5 = this.f20514OoooO0O;
        Intrinsics.checkNotNullParameter(context, "context");
        int i6 = 0;
        if (editableText == null) {
            i4 = 0;
        } else {
            OooOO0 oooOO1 = OooOO0.f40347OooO00o;
            Matcher matcher = OooOO0.f40352OooO0o0.matcher(editableText);
            ImageSpan[] existsEmoji = (ImageSpan[]) editableText.getSpans(0, editableText.length(), ImageSpan.class);
            int[] iArr = new int[existsEmoji.length];
            Intrinsics.checkNotNullExpressionValue(existsEmoji, "existsEmoji");
            int length = existsEmoji.length;
            int i7 = 0;
            int i8 = 0;
            while (i7 < length) {
                iArr[i8] = editableText.getSpanStart(existsEmoji[i7]);
                i7++;
                i8++;
            }
            int length2 = existsEmoji.length;
            while (matcher.find()) {
                String faceTag = matcher.group();
                if (!ArraysKt.contains(iArr, matcher.start())) {
                    Intrinsics.checkNotNullExpressionValue(faceTag, "faceTag");
                    OooOO0 oooOO2 = OooOO0.f40347OooO00o;
                    String strOooO0O0 = OooOO0.OooO0O0(StringsKt.removeSuffix(faceTag, (CharSequence) "_"));
                    if (strOooO0O0 != null && (identifier = context.getResources().getIdentifier(StringsKt.OooOo00(strOooO0O0, ".png", ""), "raw", context.getPackageName())) > 0) {
                        length2++;
                        Drawable drawable = context.getResources().getDrawable(identifier);
                        drawable.setBounds(0, 0, i5, i5);
                        editableText.setSpan(new ImageSpan(drawable), matcher.start(), matcher.end(), 33);
                    }
                }
            }
            i4 = length2;
        }
        this.f20513OoooO0 = i4;
        if (charSequence != null) {
            int length3 = charSequence.length();
            int i9 = this.f20513OoooO0;
            i6 = (length3 - (this.f20516OoooOOO * i9)) + i9;
        }
        this.f20519o000oOoO = i6;
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
        this.f20514OoooO0O = OooOo00.OooO00o(20.0f);
        this.maxEmojiCount = 50;
        this.maxContentLength = ShopVehicleListModel.VehicleTagType_Vip300;
        OooOO0 oooOO1 = OooOO0.f40347OooO00o;
        this.f20516OoooOOO = OooOO0.f40351OooO0o;
        this.maxEmojiCountTips = "";
        this.maxContentTips = "";
        setOnKeyListener(new View.OnKeyListener() { // from class: o0Ooo.OooO0OO
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                return EmojiEditText.OooO0O0(this.f40346Oooo0o, keyEvent);
            }
        });
        setFilters(new InputFilter[]{new OooO00o()});
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiEditText(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f20514OoooO0O = OooOo00.OooO00o(20.0f);
        this.maxEmojiCount = 50;
        this.maxContentLength = ShopVehicleListModel.VehicleTagType_Vip300;
        OooOO0 oooOO1 = OooOO0.f40347OooO00o;
        this.f20516OoooOOO = OooOO0.f40351OooO0o;
        this.maxEmojiCountTips = "";
        this.maxContentTips = "";
        setOnKeyListener(new View.OnKeyListener() { // from class: o0Ooo.OooO0OO
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                return EmojiEditText.OooO0O0(this.f40346Oooo0o, keyEvent);
            }
        });
        setFilters(new InputFilter[]{new OooO00o()});
    }
}
