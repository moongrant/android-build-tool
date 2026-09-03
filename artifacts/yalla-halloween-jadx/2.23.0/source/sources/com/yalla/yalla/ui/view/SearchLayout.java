package com.yalla.yalla.ui.view;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000OO00;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.ext.KeyboardExtKt;
import com.yalla.yalla.ui.view.SearchLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p203o00o0o0o.o00;
import p417o0OoO0.o000Oo0;
import p519o0o0O0oO.j2;
import p519o0o0O0oO.q3;
import p597o0oo00o0.OooOOO;
import p641o0ooOOOO.ac;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010>\u001a\u00020=\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010?\u0012\b\b\u0002\u0010A\u001a\u00020(¢\u0006\u0004\bB\u0010CR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R0\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R0\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\f\u001a\u0004\b \u0010\u000e\"\u0004\b!\u0010\u0010RT\u00100\u001a4\u0012\u0013\u0012\u00110$¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b('\u0012\u0013\u0012\u00110(¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\n\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00107\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R?\u0010<\u001a\u001f\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(8\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010\f\u001a\u0004\b:\u0010\u000e\"\u0004\b;\u0010\u0010¨\u0006D"}, d2 = {"Lcom/yalla/yalla/ui/view/SearchLayout;", "Landroid/widget/LinearLayout;", "Lo0ooOOOO/ac;", "OooO0Oo", "Lo0ooOOOO/ac;", "getBinding", "()Lo0ooOOOO/ac;", "binding", "Lkotlin/Function1;", "", "", "OooO0o0", "Lkotlin/jvm/functions/Function1;", "getEditDelayListener", "()Lkotlin/jvm/functions/Function1;", "setEditDelayListener", "(Lkotlin/jvm/functions/Function1;)V", "editDelayListener", "Lkotlin/Function0;", "OooO0o", "Lkotlin/jvm/functions/Function0;", "getCancelListener", "()Lkotlin/jvm/functions/Function0;", "setCancelListener", "(Lkotlin/jvm/functions/Function0;)V", "cancelListener", "OooO0oO", "getClearListener", "setClearListener", "clearListener", "", "OooO0oo", "getEditFocusListener", "setEditFocusListener", "editFocusListener", "Lkotlin/Function2;", "Landroid/widget/EditText;", "Lkotlin/ParameterName;", "name", ViewHierarchyConstants.VIEW_KEY, "", "actionId", "OooO", "Lkotlin/jvm/functions/Function2;", "getEditorActionListener", "()Lkotlin/jvm/functions/Function2;", "setEditorActionListener", "(Lkotlin/jvm/functions/Function2;)V", "editorActionListener", "OooOO0O", "Z", "getEditFocusLoseResetView", "()Z", "setEditFocusLoseResetView", "(Z)V", "editFocusLoseResetView", "focus", "OooOO0o", "getEditStateListener", "setEditStateListener", "editStateListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSearchLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchLayout.kt\ncom/yalla/yalla/ui/view/SearchLayout\n+ 2 TextViewExt.kt\ncom/yalla/yalla/ext/TextViewExtKt\n*L\n1#1,133:1\n160#2,2:134\n*S KotlinDebug\n*F\n+ 1 SearchLayout.kt\ncom/yalla/yalla/ui/view/SearchLayout\n*L\n57#1:134,2\n*E\n"})
public final class SearchLayout extends LinearLayout {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final /* synthetic */ int f30634OooOOO0 = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function2<? super EditText, ? super Integer, Unit> editorActionListener;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ac binding;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> cancelListener;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super String, Unit> editDelayListener;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> clearListener;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Boolean, Unit> editFocusListener;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f30641OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name and from kotlin metadata */
    public boolean editFocusLoseResetView;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Boolean, Unit> editStateListener;

    public static final class OooO00o extends Lambda implements Function1<Editable, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Editable editable) {
            String strValueOf = String.valueOf(editable);
            int i = SearchLayout.f30634OooOOO0;
            SearchLayout.this.OooO00o(strValueOf);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SearchLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void OooO00o(String str) {
        boolean z = this.f30641OooOO0;
        ac acVar = this.binding;
        if (z) {
            if (str.length() > 0) {
                ImageView imageView = acVar.f57528OooO0OO;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.clear");
                o000OO00.OooOOOO(imageView);
                return;
            }
        }
        ImageView imageView2 = acVar.f57528OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.clear");
        o000OO00.OooO0O0(imageView2);
    }

    public final void OooO0O0(boolean z) {
        this.f30641OooOO0 = z;
        ac acVar = this.binding;
        if (z) {
            EditText editText = acVar.f57529OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(editText, "binding.edit");
            o000OO00.OooOOOO(editText);
            TextView textView = acVar.f57531OooO0o0;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.hint");
            o000OO00.OooO0O0(textView);
            TextView textView2 = acVar.f57527OooO0O0;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.cancel");
            o000OO00.OooOOOO(textView2);
        } else {
            ImageView imageView = acVar.f57528OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.clear");
            o000OO00.OooO0O0(imageView);
            if (this.editFocusLoseResetView) {
                OooO0OO();
            }
        }
        OooO00o(acVar.f57529OooO0Oo.getText().toString());
    }

    public final void OooO0OO() {
        ac acVar = this.binding;
        EditText editText = acVar.f57529OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.edit");
        o000OO00.OooO0O0(editText);
        TextView textView = acVar.f57531OooO0o0;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.hint");
        o000OO00.OooOOOO(textView);
        TextView textView2 = acVar.f57527OooO0O0;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.cancel");
        o000OO00.OooO0O0(textView2);
        ImageView imageView = acVar.f57528OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.clear");
        o000OO00.OooO0O0(imageView);
        this.f30641OooOO0 = false;
    }

    @NotNull
    public final ac getBinding() {
        return this.binding;
    }

    @Nullable
    public final Function0<Unit> getCancelListener() {
        return this.cancelListener;
    }

    @Nullable
    public final Function0<Unit> getClearListener() {
        return this.clearListener;
    }

    @Nullable
    public final Function1<String, Unit> getEditDelayListener() {
        return this.editDelayListener;
    }

    @Nullable
    public final Function1<Boolean, Unit> getEditFocusListener() {
        return this.editFocusListener;
    }

    public final boolean getEditFocusLoseResetView() {
        return this.editFocusLoseResetView;
    }

    @Nullable
    public final Function1<Boolean, Unit> getEditStateListener() {
        return this.editStateListener;
    }

    @Nullable
    public final Function2<EditText, Integer, Unit> getEditorActionListener() {
        return this.editorActionListener;
    }

    public final void setCancelListener(@Nullable Function0<Unit> function0) {
        this.cancelListener = function0;
    }

    public final void setClearListener(@Nullable Function0<Unit> function0) {
        this.clearListener = function0;
    }

    public final void setEditDelayListener(@Nullable Function1<? super String, Unit> function1) {
        this.editDelayListener = function1;
    }

    public final void setEditFocusListener(@Nullable Function1<? super Boolean, Unit> function1) {
        this.editFocusListener = function1;
    }

    public final void setEditFocusLoseResetView(boolean z) {
        this.editFocusLoseResetView = z;
    }

    public final void setEditStateListener(@Nullable Function1<? super Boolean, Unit> function1) {
        this.editStateListener = function1;
    }

    public final void setEditorActionListener(@Nullable Function2<? super EditText, ? super Integer, Unit> function2) {
        this.editorActionListener = function2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SearchLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SearchLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SearchLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ac acVarInflate = ac.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(acVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.binding = acVarInflate;
        acVarInflate.f57530OooO0o.setOnClickListener(new View.OnClickListener() { // from class: o0o0OoOO.r2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = SearchLayout.f30634OooOOO0;
                SearchLayout this$0 = this.f55671OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.binding.f57529OooO0Oo.setText("");
                ac acVar = this$0.binding;
                acVar.f57529OooO0Oo.requestFocus();
                this$0.OooO0O0(true);
                KeyboardExtKt.OooO0O0(acVar.f57529OooO0Oo);
                Function1<? super Boolean, Unit> function1 = this$0.editStateListener;
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(this$0.f30641OooOO0));
                }
            }
        });
        acVarInflate.f57527OooO0O0.setOnClickListener(new j2(this, 1));
        acVarInflate.f57528OooO0OO.setOnClickListener(new q3(this, 1));
        EditText editText = acVarInflate.f57529OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.edit");
        o000Oo0 o000oo1 = new o000Oo0();
        OooO00o listener = new OooO00o();
        Intrinsics.checkNotNullParameter(listener, "listener");
        o000oo1.f45518OooO0o0 = listener;
        editText.addTextChangedListener(o000oo1);
        acVarInflate.f57529OooO0Oo.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o0o0OoOO.s2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                int i2 = SearchLayout.f30634OooOOO0;
                SearchLayout this$0 = this.f55683OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0O0(z);
                Function1<? super Boolean, Unit> function1 = this$0.editFocusListener;
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(z));
                }
            }
        });
        acVarInflate.f57529OooO0Oo.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o0o0OoOO.t2
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                int i3 = SearchLayout.f30634OooOOO0;
                SearchLayout this$0 = this.f55708OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function2<? super EditText, ? super Integer, Unit> function2 = this$0.editorActionListener;
                if (function2 == null) {
                    return true;
                }
                EditText editText2 = this$0.binding.f57529OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(editText2, "binding.edit");
                function2.invoke(editText2, Integer.valueOf(i2));
                return true;
            }
        });
        OooOOO.OooO0O0().OooO0OO(acVarInflate.f57529OooO0Oo, new o00(this));
        OooO0OO();
    }
}
