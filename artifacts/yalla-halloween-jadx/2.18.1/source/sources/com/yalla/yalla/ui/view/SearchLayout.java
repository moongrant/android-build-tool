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
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.umeng.analytics.pro.d;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p172o00OooO.o00O0O0;
import p254o00ooO0O.oOO00O;
import p522o0o0O0o.o00O0OO;
import p534o0o0OOo0.o00OOOO0;
import p534o0o0OOo0.o00OOOOo;
import p534o0o0OOo0.o0O0o;
import p544o0o0OoOO.m4;
import p649o0ooOOoo.fj;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010=\u001a\u00020<\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>\u0012\b\b\u0002\u0010@\u001a\u00020\"¢\u0006\u0004\bA\u0010BR0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R0\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\b\"\u0004\b\u001b\u0010\nRT\u0010*\u001a4\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\"¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00101\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R?\u00106\u001a\u001f\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\b\"\u0004\b5\u0010\nR\u0017\u00108\u001a\u0002078\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006C"}, d2 = {"Lcom/yalla/yalla/ui/view/SearchLayout;", "Landroid/widget/LinearLayout;", "Lkotlin/Function1;", "", "", "Oooo0oO", "Lkotlin/jvm/functions/Function1;", "getEditDelayListener", "()Lkotlin/jvm/functions/Function1;", "setEditDelayListener", "(Lkotlin/jvm/functions/Function1;)V", "editDelayListener", "Lkotlin/Function0;", "Oooo0oo", "Lkotlin/jvm/functions/Function0;", "getCancelListener", "()Lkotlin/jvm/functions/Function0;", "setCancelListener", "(Lkotlin/jvm/functions/Function0;)V", "cancelListener", "Oooo", "getClearListener", "setClearListener", "clearListener", "", "OoooO00", "getEditFocusListener", "setEditFocusListener", "editFocusListener", "Lkotlin/Function2;", "Landroid/widget/EditText;", "Lkotlin/ParameterName;", "name", ViewHierarchyConstants.VIEW_KEY, "", "actionId", "OoooO0", "Lkotlin/jvm/functions/Function2;", "getEditorActionListener", "()Lkotlin/jvm/functions/Function2;", "setEditorActionListener", "(Lkotlin/jvm/functions/Function2;)V", "editorActionListener", "OoooO", "Z", "getEditFocusLoseResetView", "()Z", "setEditFocusLoseResetView", "(Z)V", "editFocusLoseResetView", "focus", "OoooOO0", "getEditStateListener", "setEditStateListener", "editStateListener", "Lo0ooOOoo/fj;", "binding", "Lo0ooOOoo/fj;", "getBinding", "()Lo0ooOOoo/fj;", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class SearchLayout extends LinearLayout {

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public static final /* synthetic */ int f25146o000oOoO = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> clearListener;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final fj f25148Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super String, Unit> editDelayListener;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> cancelListener;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name and from kotlin metadata */
    public boolean editFocusLoseResetView;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function2<? super EditText, ? super Integer, Unit> editorActionListener;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Boolean, Unit> editFocusListener;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f25154OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Boolean, Unit> editStateListener;

    public static final class OooO00o extends Lambda implements Function1<Editable, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Editable editable) {
            SearchLayout searchLayout = SearchLayout.this;
            String strValueOf = String.valueOf(editable);
            int i = SearchLayout.f25146o000oOoO;
            searchLayout.OooO00o(strValueOf);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SearchLayout(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void OooO00o(String str) {
        if (this.f25154OoooO0O) {
            if (str.length() > 0) {
                ImageView imageView = this.f25148Oooo0o.f49414OooO0OO;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.clear");
                oOO00O.OooO(imageView);
                return;
            }
        }
        ImageView imageView2 = this.f25148Oooo0o.f49414OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.clear");
        oOO00O.OooO00o(imageView2);
    }

    public final void OooO0O0(boolean z) {
        this.f25154OoooO0O = z;
        if (z) {
            EditText editText = this.f25148Oooo0o.f49415OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(editText, "binding.edit");
            oOO00O.OooO(editText);
            TextView textView = this.f25148Oooo0o.f49417OooO0o0;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.hint");
            oOO00O.OooO00o(textView);
            TextView textView2 = this.f25148Oooo0o.f49413OooO0O0;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.cancel");
            oOO00O.OooO(textView2);
        } else {
            ImageView imageView = this.f25148Oooo0o.f49414OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.clear");
            oOO00O.OooO00o(imageView);
            if (this.editFocusLoseResetView) {
                OooO0Oo();
            }
        }
        OooO00o(this.f25148Oooo0o.f49415OooO0Oo.getText().toString());
    }

    public final void OooO0OO() {
        KeyboardExtKt.OooO00o(this.f25148Oooo0o.f49415OooO0Oo);
        this.f25148Oooo0o.f49415OooO0Oo.clearFocus();
    }

    public final void OooO0Oo() {
        EditText editText = this.f25148Oooo0o.f49415OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.edit");
        oOO00O.OooO00o(editText);
        TextView textView = this.f25148Oooo0o.f49417OooO0o0;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.hint");
        oOO00O.OooO(textView);
        TextView textView2 = this.f25148Oooo0o.f49413OooO0O0;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.cancel");
        oOO00O.OooO00o(textView2);
        ImageView imageView = this.f25148Oooo0o.f49414OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.clear");
        oOO00O.OooO00o(imageView);
        this.f25154OoooO0O = false;
    }

    @NotNull
    /* JADX INFO: renamed from: getBinding, reason: from getter */
    public final fj getF25148Oooo0o() {
        return this.f25148Oooo0o;
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
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SearchLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        fj fjVarInflate = fj.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(fjVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f25148Oooo0o = fjVarInflate;
        fjVarInflate.f49416OooO0o.setOnClickListener(new o00OOOOo(this, 2));
        fjVarInflate.f49413OooO0O0.setOnClickListener(new o00OOOO0(this, 3));
        fjVarInflate.f49414OooO0OO.setOnClickListener(new o0O0o(this, 5));
        EditText editText = fjVarInflate.f49415OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.edit");
        o00O0OO o00o0oo2 = new o00O0OO();
        OooO00o listener = new OooO00o();
        Intrinsics.checkNotNullParameter(listener, "listener");
        o00o0oo2.f43011Oooo0oO = listener;
        editText.addTextChangedListener(o00o0oo2);
        fjVarInflate.f49415OooO0Oo.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o0oo00Oo.o0OOOO00
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                SearchLayout this$0 = this.f48222Oooo0o;
                int i2 = SearchLayout.f25146o000oOoO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0O0(z);
                Function1<? super Boolean, Unit> function1 = this$0.editFocusListener;
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(z));
                }
            }
        });
        fjVarInflate.f49415OooO0Oo.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o0oo00Oo.o0OOOO0o
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                SearchLayout this$0 = this.f48223OooO00o;
                int i3 = SearchLayout.f25146o000oOoO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function2<? super EditText, ? super Integer, Unit> function2 = this$0.editorActionListener;
                if (function2 == null) {
                    return true;
                }
                EditText editText2 = this$0.f25148Oooo0o.f49415OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(editText2, "binding.edit");
                function2.invoke(editText2, Integer.valueOf(i2));
                return true;
            }
        });
        o00O0O0.OooO0O0().OooO0OO(fjVarInflate.f49415OooO0Oo, new m4(this));
        OooO0Oo();
    }
}
