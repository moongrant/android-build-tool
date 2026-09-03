package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.yalla.yalla.ui.view.SearchEditView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.o3;
import p423o0OoO0OO.o00O0OO0;
import p562o0oOo000.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u00100\u001a\u00020/\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101\u0012\b\b\u0002\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R*\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R0\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R0\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)¨\u00067"}, d2 = {"Lcom/yalla/yalla/ui/view/SearchEditView;", "Landroid/widget/LinearLayout;", "Landroid/widget/EditText;", "getEditText", "Lo0Oo0OOO/o3;", "OooO0Oo", "Lo0Oo0OOO/o3;", "getBinding", "()Lo0Oo0OOO/o3;", "binding", "", "OooO0o0", "Ljava/lang/String;", "getEditContent", "()Ljava/lang/String;", "setEditContent", "(Ljava/lang/String;)V", "editContent", "Lkotlin/Function0;", "", "OooO0o", "Lkotlin/jvm/functions/Function0;", "getBackgroundListener", "()Lkotlin/jvm/functions/Function0;", "setBackgroundListener", "(Lkotlin/jvm/functions/Function0;)V", "backgroundListener", "OooO0oO", "getForegroundListener", "setForegroundListener", "foregroundListener", "OooO0oo", "getDeleteListener", "setDeleteListener", "deleteListener", "Lkotlin/Function1;", "OooO", "Lkotlin/jvm/functions/Function1;", "getEditTextChangedListener", "()Lkotlin/jvm/functions/Function1;", "setEditTextChangedListener", "(Lkotlin/jvm/functions/Function1;)V", "editTextChangedListener", "OooOO0", "getSearchListener", "setSearchListener", "searchListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSearchEditView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchEditView.kt\ncom/yalla/yalla/ui/view/SearchEditView\n+ 2 TextViewExt.kt\ncom/yalla/yalla/ext/TextViewExtKt\n*L\n1#1,86:1\n160#2,2:87\n*S KotlinDebug\n*F\n+ 1 SearchEditView.kt\ncom/yalla/yalla/ui/view/SearchEditView\n*L\n41#1:87,2\n*E\n"})
public final class SearchEditView extends LinearLayout {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final /* synthetic */ int f30076OooOO0O = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super String, Unit> editTextChangedListener;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final o3 binding;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> backgroundListener;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String editContent;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> foregroundListener;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> deleteListener;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super String, Unit> searchListener;

    public static final class OooO extends Lambda implements Function1<View, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            SearchEditView searchEditView = SearchEditView.this;
            Function1<String, Unit> searchListener = searchEditView.getSearchListener();
            if (searchListener != null) {
                searchListener.invoke(searchEditView.getEditContent());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            Function0<Unit> backgroundListener = SearchEditView.this.getBackgroundListener();
            if (backgroundListener != null) {
                backgroundListener.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<View, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            Function0<Unit> foregroundListener = SearchEditView.this.getForegroundListener();
            if (foregroundListener != null) {
                foregroundListener.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function4<CharSequence, Integer, Integer, Integer, Unit> {
        public OooO0OO() {
            super(4);
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
            num.intValue();
            num2.intValue();
            num3.intValue();
            String string = StringsKt.trim((CharSequence) String.valueOf(charSequence)).toString();
            SearchEditView searchEditView = SearchEditView.this;
            searchEditView.setEditContent(string);
            if (StringsKt.isBlank(searchEditView.getEditContent())) {
                ImageView ivDelete = searchEditView.getBinding().f44711OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(ivDelete, "ivDelete");
                o000O.OooO0O0(ivDelete);
                searchEditView.getBinding().f44712OooO0o.setTextColor(o0000.OooO00o(o0OOO0o.color_333333_25));
            } else {
                ImageView ivDelete2 = searchEditView.getBinding().f44711OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(ivDelete2, "ivDelete");
                o000O.OooOOOO(ivDelete2);
                searchEditView.getBinding().f44712OooO0o.setTextColor(o0000.OooO00o(o0OOO0o.rec_color_00D8C9));
            }
            Function1<String, Unit> editTextChangedListener = searchEditView.getEditTextChangedListener();
            if (editTextChangedListener != null) {
                editTextChangedListener.invoke(searchEditView.getEditContent());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<View, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            SearchEditView searchEditView = SearchEditView.this;
            searchEditView.getBinding().f44709OooO0O0.setText("");
            Function0<Unit> deleteListener = searchEditView.getDeleteListener();
            if (deleteListener != null) {
                deleteListener.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SearchEditView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Nullable
    public final Function0<Unit> getBackgroundListener() {
        return this.backgroundListener;
    }

    @NotNull
    public final o3 getBinding() {
        return this.binding;
    }

    @Nullable
    public final Function0<Unit> getDeleteListener() {
        return this.deleteListener;
    }

    @NotNull
    public final String getEditContent() {
        return this.editContent;
    }

    @NotNull
    public final EditText getEditText() {
        EditText etSearch = this.binding.f44709OooO0O0;
        Intrinsics.checkNotNullExpressionValue(etSearch, "etSearch");
        return etSearch;
    }

    @Nullable
    public final Function1<String, Unit> getEditTextChangedListener() {
        return this.editTextChangedListener;
    }

    @Nullable
    public final Function0<Unit> getForegroundListener() {
        return this.foregroundListener;
    }

    @Nullable
    public final Function1<String, Unit> getSearchListener() {
        return this.searchListener;
    }

    public final void setBackgroundListener(@Nullable Function0<Unit> function0) {
        this.backgroundListener = function0;
    }

    public final void setDeleteListener(@Nullable Function0<Unit> function0) {
        this.deleteListener = function0;
    }

    public final void setEditContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.editContent = str;
    }

    public final void setEditTextChangedListener(@Nullable Function1<? super String, Unit> function1) {
        this.editTextChangedListener = function1;
    }

    public final void setForegroundListener(@Nullable Function0<Unit> function0) {
        this.foregroundListener = function0;
    }

    public final void setSearchListener(@Nullable Function1<? super String, Unit> function1) {
        this.searchListener = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SearchEditView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SearchEditView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SearchEditView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        o3 o3VarInflate = o3.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(o3VarInflate, "inflate(...)");
        this.binding = o3VarInflate;
        this.editContent = "";
        ImageView ivBg = o3VarInflate.f44710OooO0OO;
        Intrinsics.checkNotNullExpressionValue(ivBg, "ivBg");
        o000O.OooO(ivBg, new OooO00o());
        ImageView ivFg = o3VarInflate.f44713OooO0o0;
        Intrinsics.checkNotNullExpressionValue(ivFg, "ivFg");
        o000O.OooO(ivFg, new OooO0O0());
        EditText etSearch = o3VarInflate.f44709OooO0O0;
        Intrinsics.checkNotNullExpressionValue(etSearch, "etSearch");
        o00O0OO0 o00o0oo1 = new o00O0OO0();
        OooO0OO listener = new OooO0OO();
        Intrinsics.checkNotNullParameter(listener, "listener");
        o00o0oo1.f46713OooO0Oo = listener;
        etSearch.addTextChangedListener(o00o0oo1);
        o3VarInflate.f44709OooO0O0.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o0oOooOO.m1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                Function1<? super String, Unit> function1;
                int i3 = SearchEditView.f30076OooOO0O;
                SearchEditView this$0 = this.f56872OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (i2 != 3 || (function1 = this$0.searchListener) == null) {
                    return true;
                }
                function1.invoke(this$0.editContent);
                return true;
            }
        });
        ImageView ivDelete = o3VarInflate.f44711OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(ivDelete, "ivDelete");
        o000O.OooO(ivDelete, new OooO0o());
        TextView tvSearch = o3VarInflate.f44712OooO0o;
        Intrinsics.checkNotNullExpressionValue(tvSearch, "tvSearch");
        o000O.OooO(tvSearch, new OooO());
    }
}
