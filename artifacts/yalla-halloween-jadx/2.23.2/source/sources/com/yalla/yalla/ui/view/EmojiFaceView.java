package com.yalla.yalla.ui.view;

import OooO0OO.OooO00o;
import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.Html;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000O0;
import com.facebook.internal.AnalyticsEvents;
import com.yalla.yalla.ui.fragment.o000Oo0;
import com.yalla.yalla.ui.view.EmojiFaceView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p369o0OOo0o.OooOOO;
import p369o0OOo0o.OooOOO0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;
import p571o0oOoO0.o0000oo;
import p590o0oOooo0.oOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/yalla/yalla/ui/view/EmojiFaceView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "OooO0o0", "Z", "isMomentPage", "()Z", "setMomentPage", "(Z)V", "Landroid/widget/EditText;", "OooO0o", "Landroid/widget/EditText;", "getEditText", "()Landroid/widget/EditText;", "setEditText", "(Landroid/widget/EditText;)V", "editText", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "", AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nEmojiFaceView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmojiFaceView.kt\ncom/yalla/yalla/ui/view/EmojiFaceView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1#2:127\n*E\n"})
public final class EmojiFaceView extends RecyclerView {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final /* synthetic */ int f29840OooO0oo = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooO00o f29841OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public EditText editText;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    public boolean isMomentPage;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public oOO.OooO00o f29844OooO0oO;

    public static final class OooO00o extends o0000oo<OooOOO0> {

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ Context f29845OooOoo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, int i) {
            super(context, i);
            this.f29845OooOoo0 = context;
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            ViewHolder helper = (ViewHolder) baseViewHolder;
            OooOOO0 oooOOO0 = (OooOOO0) obj;
            Intrinsics.checkNotNullParameter(helper, "helper");
            ImageView imageView = (ImageView) helper.getView(o0OO00O.iv_face);
            if (oooOOO0 == null) {
                imageView.setImageResource(0);
                return;
            }
            String str = oooOOO0.f43163OooO00o;
            String strSubstring = str.substring(0, str.length() - 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            Context context = this.f29845OooOoo0;
            imageView.setImageResource(context.getResources().getIdentifier(strSubstring, "raw", context.getPackageName()));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EmojiFaceView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Nullable
    public final EditText getEditText() {
        return this.editText;
    }

    public final void setEditText(@Nullable EditText editText) {
        this.editText = editText;
    }

    public final void setMomentPage(boolean z) {
        this.isMomentPage = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EmojiFaceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EmojiFaceView(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isMomentPage = true;
        setLayoutManager(new GridLayoutManager(context, 7));
        OooO00o oooO00o = new OooO00o(context, oo0o0Oo.item_emoji_face);
        this.f29841OooO0Oo = oooO00o;
        setOverScrollMode(2);
        oooO00o.OooOoOO(true);
        setClipToPadding(false);
        setAdapter(oooO00o);
        oooO00o.f13176OooO0o = new BaseQuickAdapter.OooO0o() { // from class: o0oOooOO.f
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
            public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i2) {
                int i3 = EmojiFaceView.f29840OooO0oo;
                EmojiFaceView this$0 = this.f56787OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Context context2 = context;
                Intrinsics.checkNotNullParameter(context2, "$context");
                boolean z = this$0.isMomentPage;
                EmojiFaceView.OooO00o oooO00o2 = this$0.f29841OooO0Oo;
                if (!z) {
                    Object obj = oooO00o2.f13189OooOOoo.get(i2);
                    Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                    OooOOO0 oooOOO0 = (OooOOO0) obj;
                    EditText editText = this$0.editText;
                    if (editText != null) {
                        String text = oooOOO0.f43165OooO0OO;
                        Intrinsics.checkNotNullParameter(editText, "<this>");
                        Intrinsics.checkNotNullParameter(text, "text");
                        Editable editableText = editText.getEditableText();
                        Intrinsics.checkNotNullExpressionValue(editableText, "getEditableText(...)");
                        int selectionEnd = editText.getSelectionEnd();
                        Intrinsics.checkNotNullParameter(editableText, "<this>");
                        Intrinsics.checkNotNullParameter(text, "text");
                        if (selectionEnd < 0 || selectionEnd >= editableText.length()) {
                            editableText.append((CharSequence) text);
                            return;
                        } else {
                            editableText.insert(selectionEnd, text);
                            return;
                        }
                    }
                    return;
                }
                String str = ((OooOOO0) oooO00o2.f13189OooOOoo.get(i2)).f43163OooO00o;
                String strSubstring = str.substring(0, str.length() - 4);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                int identifier = context2.getResources().getIdentifier(strSubstring, "raw", context2.getPackageName());
                EditText editText2 = this$0.editText;
                if (editText2 != null) {
                    if (this$0.f29844OooO0oO == null) {
                        this$0.f29844OooO0oO = new oOO(editText2.getContext(), new Rect(0, 0, o0000O0.OooO00o(30.0f), o0000O0.OooO00o(30.0f))).f57165OooO0OO;
                    }
                    Spanned spannedFromHtml = Html.fromHtml(OooO00o.OooO00o("<img src='", identifier, "'/>"), this$0.f29844OooO0oO, null);
                    int selectionStart = editText2.getSelectionStart();
                    int length = editText2.getText().length();
                    if (selectionStart <= length) {
                        CharSequence charSequenceSubSequence = editText2.getText().subSequence(0, length);
                        CharSequence charSequenceSubSequence2 = charSequenceSubSequence.subSequence(0, selectionStart);
                        CharSequence charSequenceSubSequence3 = charSequenceSubSequence.subSequence(selectionStart, length);
                        editText2.setText((CharSequence) null);
                        editText2.append(charSequenceSubSequence2);
                        editText2.append(spannedFromHtml);
                        editText2.append(charSequenceSubSequence3);
                    } else {
                        editText2.append(spannedFromHtml);
                    }
                    int length2 = editText2.length();
                    int i4 = selectionStart + 1;
                    if (i4 > length2) {
                        editText2.setSelection(length2);
                    } else {
                        editText2.setSelection(i4);
                    }
                }
            }
        };
        MutableLiveData<List<OooOOO0>> mutableLiveData = OooOOO.f43158OooO00o;
        List<OooOOO0> value = mutableLiveData.getValue();
        if (value == null || value.isEmpty()) {
            OooOOO.OooO0OO();
        }
        Object context2 = getContext();
        Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        mutableLiveData.observe((LifecycleOwner) context2, new o000Oo0(this, 1));
    }

    public /* synthetic */ EmojiFaceView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
