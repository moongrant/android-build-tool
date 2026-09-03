package com.yalla.yalla.ui.view.rich_edit_text;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.o000O000;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p566o0oOo0o.o00O0O;
import p566o0oOo0o.o00Oo0;
import p566o0oOo0o.o00Ooo;
import p579o0oOoo.oO0OOo0o;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017B\u001b\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0016\u0010\u001aB#\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u001cJ\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u000b\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/yalla/yalla/ui/view/rich_edit_text/EmojiFaceEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "", "getEmojiFaceCount", "", "OooOO0O", "Z", "getIgnoreReplace$Common_YallaRelease", "()Z", "setIgnoreReplace$Common_YallaRelease", "(Z)V", "ignoreReplace", "", "OooOOO", "J", "getT", "()J", "setT", "(J)V", "t", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEmojiFaceEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmojiFaceEditText.kt\ncom/yalla/yalla/ui/view/rich_edit_text/EmojiFaceEditText\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,157:1\n1855#2,2:158\n*S KotlinDebug\n*F\n+ 1 EmojiFaceEditText.kt\ncom/yalla/yalla/ui/view/rich_edit_text/EmojiFaceEditText\n*L\n132#1:158,2\n*E\n"})
public class EmojiFaceEditText extends AppCompatEditText {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final Regex f31279OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name and from kotlin metadata */
    public boolean ignoreReplace;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public o00Ooo f31281OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name and from kotlin metadata */
    public long t;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final int f31283OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiFaceEditText(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31279OooOO0 = new Regex("/\\[MRF_1000[0-9]{2}");
        o000O000.OooO0O0(getTextSize());
        this.f31283OooOOO0 = ((String) CollectionsKt.first(oO0OOo0o.f56612OooO00o.keySet())).length();
        addTextChangedListener(new o00O0O(this));
    }

    @SuppressLint({"ResourceType"})
    @Nullable
    public final SpannableStringBuilder OooO0OO(@NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        int i = this.f31283OooOOO0;
        if (length < i) {
            return null;
        }
        Matcher matcher = this.f31279OooOO0.getNativePattern().matcher(text);
        OooO0Oo("matcher");
        StringBuilder sb = new StringBuilder(text);
        ArrayList<Pair> arrayList = new ArrayList();
        int i2 = 0;
        while (matcher.find()) {
            String matchedText = matcher.group();
            Resources resources = getResources();
            Map<String, Integer> map = oO0OOo0o.f56612OooO00o;
            Intrinsics.checkNotNullExpressionValue(matchedText, "matchedText");
            Integer num = map.get(StringsKt__StringsKt.removeSuffix(matchedText, (CharSequence) ZegoConstants.ZegoVideoDataAuxPublishingStream));
            Intrinsics.checkNotNull(num);
            Drawable drawable = resources.getDrawable(num.intValue(), null);
            drawable.setBounds(0, 0, (int) getTextSize(), ((int) getTextSize()) + 2);
            Intrinsics.checkNotNullExpressionValue(drawable, "drawable");
            arrayList.add(new Pair(new o00Oo0(drawable), Integer.valueOf(matcher.start() + i2)));
            if (matcher.end() == text.length() || text.charAt(matcher.end()) != ' ') {
                sb.insert(matcher.end(), ' ');
                i2++;
            }
        }
        OooO0Oo("find");
        if (arrayList.isEmpty()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(sb);
        for (Pair pair : arrayList) {
            spannableStringBuilderValueOf.setSpan(pair.getFirst(), ((Number) pair.getSecond()).intValue(), ((Number) pair.getSecond()).intValue() + i + 1, 33);
            spannableStringBuilderValueOf.setSpan(new o00Ooo(), ((Number) pair.getSecond()).intValue(), ((Number) pair.getSecond()).intValue() + i + 1, 33);
        }
        return spannableStringBuilderValueOf;
    }

    public final void OooO0Oo(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        long jCurrentTimeMillis = System.currentTimeMillis();
        OooOOO0.OooO0OO("TTTTime", text + " = " + (jCurrentTimeMillis - this.t));
        this.t = jCurrentTimeMillis;
    }

    public final int getEmojiFaceCount() {
        o00Oo0[] o00oo0Arr;
        Editable editableText = getEditableText();
        if (editableText == null || (o00oo0Arr = (o00Oo0[]) editableText.getSpans(0, length(), o00Oo0.class)) == null) {
            return 0;
        }
        return o00oo0Arr.length;
    }

    /* JADX INFO: renamed from: getIgnoreReplace$Common_YallaRelease, reason: from getter */
    public final boolean getIgnoreReplace() {
        return this.ignoreReplace;
    }

    public final long getT() {
        return this.t;
    }

    public final void setIgnoreReplace$Common_YallaRelease(boolean z) {
        this.ignoreReplace = z;
    }

    public final void setT(long j) {
        this.t = j;
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        o000O000.OooO0O0(getTextSize());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiFaceEditText(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31279OooOO0 = new Regex("/\\[MRF_1000[0-9]{2}");
        o000O000.OooO0O0(getTextSize());
        this.f31283OooOOO0 = ((String) CollectionsKt.first(oO0OOo0o.f56612OooO00o.keySet())).length();
        addTextChangedListener(new o00O0O(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiFaceEditText(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31279OooOO0 = new Regex("/\\[MRF_1000[0-9]{2}");
        o000O000.OooO0O0(getTextSize());
        this.f31283OooOOO0 = ((String) CollectionsKt.first(oO0OOo0o.f56612OooO00o.keySet())).length();
        addTextChangedListener(new o00O0O(this));
    }
}
