package com.yalla.yalla.ui.view.rich_edit_text;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p423o0OoO0OO.o00O0OOO;
import p522o0o0O0oO.oO000O0;
import p562o0oOo000.o0OOO0o;
import p578o0oOoOo0.oO0OO00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0015\u0010\u0019B#\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u001bJ\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0007R\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/yalla/yalla/ui/view/rich_edit_text/RichEditText;", "Lcom/yalla/yalla/ui/view/rich_edit_text/EmojiFaceEditText;", "", "getAtUserCount", "", "Lcom/yalla/yalla/ui/view/rich_edit_text/AtUserSpan;", "getAtUserSpans", "Lo0o0O0oO/oO000O0;", "getRichTextFieldValue", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "setRichTextFieldValue", "OooOOOO", "I", "getAtUserTextColor", "()I", "setAtUserTextColor", "(I)V", "atUserTextColor", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRichEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RichEditText.kt\ncom/yalla/yalla/ui/view/rich_edit_text/RichEditText\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n13309#2,2:112\n1855#3,2:114\n*S KotlinDebug\n*F\n+ 1 RichEditText.kt\ncom/yalla/yalla/ui/view/rich_edit_text/RichEditText\n*L\n55#1:112,2\n65#1:114,2\n*E\n"})
public final class RichEditText extends EmojiFaceEditText {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name and from kotlin metadata */
    public int atUserTextColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RichEditText(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.atUserTextColor = o00O0OOO.OooO00o(o0OOO0o.color_00d8c9, this);
    }

    public final int getAtUserCount() {
        AtUserSpan[] atUserSpanArr = (AtUserSpan[]) getEditableText().getSpans(0, getEditableText().length(), AtUserSpan.class);
        if (atUserSpanArr != null) {
            return atUserSpanArr.length;
        }
        return 0;
    }

    @NotNull
    public final List<AtUserSpan> getAtUserSpans() {
        AtUserSpan[] atUserSpanArr = (AtUserSpan[]) getEditableText().getSpans(0, getEditableText().length(), AtUserSpan.class);
        Intrinsics.checkNotNull(atUserSpanArr);
        return ArraysKt.toList(atUserSpanArr);
    }

    public final int getAtUserTextColor() {
        return this.atUserTextColor;
    }

    @NotNull
    public final oO000O0 getRichTextFieldValue() {
        AtUserSpan[] atUserSpanArr = (AtUserSpan[]) getEditableText().getSpans(0, getEditableText().length(), AtUserSpan.class);
        Intrinsics.checkNotNull(atUserSpanArr);
        for (AtUserSpan atUserSpan : atUserSpanArr) {
            atUserSpan.f30736OooO0oO = getEditableText().getSpanStart(atUserSpan);
            atUserSpan.f30737OooO0oo = getEditableText().getSpanEnd(atUserSpan);
        }
        return new oO000O0(String.valueOf(getText()), getSelectionEnd(), ArraysKt.toList(atUserSpanArr));
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    @Nullable
    public final InputConnection onCreateInputConnection(@NotNull EditorInfo outAttrs) {
        Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(outAttrs);
        if (inputConnectionOnCreateInputConnection != null) {
            outAttrs.imeOptions &= -1073741825;
        }
        return inputConnectionOnCreateInputConnection;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        boolean z;
        super.onSelectionChanged(i, i2);
        AtUserSpan[] atUserSpanArr = (AtUserSpan[]) getEditableText().getSpans(getSelectionStart(), getSelectionEnd(), AtUserSpan.class);
        if (atUserSpanArr == null) {
            z = true;
        } else {
            if (atUserSpanArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            return;
        }
        if (getSelectionStart() == getSelectionEnd()) {
            int spanStart = getEditableText().getSpanStart(atUserSpanArr[0]);
            int spanEnd = getEditableText().getSpanEnd(atUserSpanArr[0]);
            if (Math.abs(spanStart - getSelectionStart()) < Math.abs(spanEnd - getSelectionStart())) {
                setSelection(spanStart);
                return;
            } else {
                setSelection(spanEnd);
                return;
            }
        }
        int spanStart2 = getEditableText().getSpanStart(atUserSpanArr[0]);
        int spanEnd2 = getEditableText().getSpanEnd(atUserSpanArr[atUserSpanArr.length - 1]);
        if (getSelectionStart() > spanStart2) {
            setSelection(spanStart2, getSelectionEnd());
        } else if (getSelectionEnd() < spanEnd2) {
            setSelection(getSelectionStart(), spanEnd2);
        }
    }

    public final void setAtUserTextColor(int i) {
        this.atUserTextColor = i;
    }

    public final void setRichTextFieldValue(@Nullable oO000O0 value) {
        if (value == null) {
            return;
        }
        String str = value.f53109OooO00o;
        SpannableStringBuilder spannableStringBuilderOooO0OO = OooO0OO(str);
        if (spannableStringBuilderOooO0OO == null) {
            spannableStringBuilderOooO0OO = SpannableStringBuilder.valueOf(str);
        }
        for (AtUserSpan atUserSpan : value.f53111OooO0OO) {
            int i = this.atUserTextColor;
            spannableStringBuilderOooO0OO.setSpan(new AtUserSpan(atUserSpan.f30735OooO0o0, atUserSpan.f30733OooO0Oo, i, atUserSpan.f30734OooO0o), atUserSpan.f30736OooO0oO, atUserSpan.f30737OooO0oo, 33);
            spannableStringBuilderOooO0OO.setSpan(new oO0OO00(), atUserSpan.f30736OooO0oO, atUserSpan.f30737OooO0oo, 33);
        }
        setIgnoreReplace$Common_YallaRelease(true);
        setText(spannableStringBuilderOooO0OO);
        setIgnoreReplace$Common_YallaRelease(false);
        setSelection(value.f53110OooO0O0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RichEditText(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.atUserTextColor = o00O0OOO.OooO00o(o0OOO0o.color_00d8c9, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RichEditText(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.atUserTextColor = o00O0OOO.OooO00o(o0OOO0o.color_00d8c9, this);
    }
}
