package com.app.base.view;

import OooO0O0.OooO00o;
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
import com.app.base.view.EmojiFaceView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.facebook.internal.AnalyticsEvents;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo00;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p142o00OOooO.o0000Ooo;
import p168o00Ooo0.o0OoOo0;
import p453o0Ooo.OooO;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/app/base/view/EmojiFaceView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "Oooo0oO", "Z", "isPost", "()Z", "setPost", "(Z)V", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attr", "", AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class EmojiFaceView extends RecyclerView {

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final /* synthetic */ int f11948OoooO00 = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public o0OoOo0.OooO00o f11949Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final p188o00o00o0.OooO0OO<p453o0Ooo.OooO> f11950Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name and from kotlin metadata */
    public boolean isPost;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public EditText f11952Oooo0oo;

    public static final class OooO00o extends p188o00o00o0.OooO0OO<p453o0Ooo.OooO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Context f11953OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context) {
            super(context, R.layout.item_emoji_face);
            this.f11953OooO00o = context;
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            p188o00o00o0.OooO0o helper = (p188o00o00o0.OooO0o) oooO00o;
            p453o0Ooo.OooO oooO = (p453o0Ooo.OooO) obj;
            Intrinsics.checkNotNullParameter(helper, "helper");
            ImageView imageView = (ImageView) helper.OooO0Oo(R.id.iv_face);
            if (oooO == null) {
                imageView.setImageResource(0);
                return;
            }
            String str = oooO.f40343OooO00o;
            String strSubstring = str.substring(0, str.length() - 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            imageView.setImageResource(this.f11953OooO00o.getResources().getIdentifier(strSubstring, "raw", this.f11953OooO00o.getPackageName()));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EmojiFaceView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void OooO00o(@NotNull EditText editText, boolean z) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        this.f11952Oooo0oo = editText;
        this.isPost = z;
    }

    public final void setPost(boolean z) {
        this.isPost = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EmojiFaceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EmojiFaceView(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) throws JSONException {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        int i2 = 1;
        this.isPost = true;
        setLayoutManager(new GridLayoutManager(context, 7));
        OooO00o oooO00o = new OooO00o(context);
        this.f11950Oooo0o = oooO00o;
        setOverScrollMode(2);
        oooO00o.hindEmptyView(true);
        setClipToPadding(false);
        setPaddingRelative(OooOo00.OooO00o(10.0f), OooOo00.OooO00o(16.0f), OooOo00.OooO00o(10.0f), OooOo00.OooO00o(16.0f));
        setAdapter(oooO00o);
        oooO00o.setOnItemClickListener(new BaseQuickAdapter.OooOOOO() { // from class: o00OooOo.o0O0O0O
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
            public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i3) {
                EmojiFaceView this$0 = this.f32707OooO0Oo;
                Context context2 = context;
                int i4 = EmojiFaceView.f11948OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(context2, "$context");
                if (!this$0.isPost) {
                    OooO oooO = this$0.f11950Oooo0o.getData().get(i3);
                    Intrinsics.checkNotNullExpressionValue(oooO, "faceAdapter.data[position]");
                    OooO oooO2 = oooO;
                    EditText editText = this$0.f11952Oooo0oo;
                    if (editText != null) {
                        String text = oooO2.f40345OooO0OO;
                        Intrinsics.checkNotNullParameter(editText, "<this>");
                        Intrinsics.checkNotNullParameter(text, "text");
                        Editable editableText = editText.getEditableText();
                        Intrinsics.checkNotNullExpressionValue(editableText, "editableText");
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
                String str = this$0.f11950Oooo0o.getData().get(i3).f40343OooO00o;
                String strSubstring = str.substring(0, str.length() - 4);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                int identifier = context2.getResources().getIdentifier(strSubstring, "raw", context2.getPackageName());
                EditText editText2 = this$0.f11952Oooo0oo;
                if (editText2 != null) {
                    if (this$0.f11949Oooo == null) {
                        this$0.f11949Oooo = new o0OoOo0(editText2.getContext(), new Rect(0, 0, OooOo00.OooO00o(30.0f), OooOo00.OooO00o(30.0f))).f32668OooO0OO;
                    }
                    Spanned spannedFromHtml = Html.fromHtml(OooO00o.OooO00o("<img src='", identifier, "'/>"), this$0.f11949Oooo, null);
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
                    int i5 = selectionStart + 1;
                    if (i5 > length2) {
                        editText2.setSelection(length2);
                    } else {
                        editText2.setSelection(i5);
                    }
                }
            }
        });
        p453o0Ooo.OooOO0 oooOO1 = p453o0Ooo.OooOO0.f40347OooO00o;
        MutableLiveData<List<p453o0Ooo.OooO>> mutableLiveData = p453o0Ooo.OooOO0.f40348OooO0O0;
        List<p453o0Ooo.OooO> value = mutableLiveData.getValue();
        if (value == null || value.isEmpty()) {
            p453o0Ooo.OooOO0.OooO0OO();
        }
        Object context2 = getContext();
        Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        mutableLiveData.observe((LifecycleOwner) context2, new o0000Ooo(this, i2));
    }
}
