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
import com.code.android.util.o000O;
import com.code.android.util.o0OoOo0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.ext.KeyboardExtKt;
import com.yalla.yalla.ui.fragment.o00;
import com.yalla.yalla.ui.fragment.o000OOo0;
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
import p405o0Oo0OOO.p3;
import p423o0OoO0OO.o00O0OO0;
import p601o0oo00oO.o0000O;
import p601o0oo00oO.o000OO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010>\u001a\u00020=\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010?\u0012\b\b\u0002\u0010A\u001a\u00020(¢\u0006\u0004\bB\u0010CR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R0\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R0\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\f\u001a\u0004\b \u0010\u000e\"\u0004\b!\u0010\u0010RT\u00100\u001a4\u0012\u0013\u0012\u00110$¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b('\u0012\u0013\u0012\u00110(¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\n\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00107\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R?\u0010<\u001a\u001f\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(8\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010\f\u001a\u0004\b:\u0010\u000e\"\u0004\b;\u0010\u0010¨\u0006D"}, d2 = {"Lcom/yalla/yalla/ui/view/SearchLayout;", "Landroid/widget/LinearLayout;", "Lo0Oo0OOO/p3;", "OooO0Oo", "Lo0Oo0OOO/p3;", "getBinding", "()Lo0Oo0OOO/p3;", "binding", "Lkotlin/Function1;", "", "", "OooO0o0", "Lkotlin/jvm/functions/Function1;", "getEditDelayListener", "()Lkotlin/jvm/functions/Function1;", "setEditDelayListener", "(Lkotlin/jvm/functions/Function1;)V", "editDelayListener", "Lkotlin/Function0;", "OooO0o", "Lkotlin/jvm/functions/Function0;", "getCancelListener", "()Lkotlin/jvm/functions/Function0;", "setCancelListener", "(Lkotlin/jvm/functions/Function0;)V", "cancelListener", "OooO0oO", "getClearListener", "setClearListener", "clearListener", "", "OooO0oo", "getEditFocusListener", "setEditFocusListener", "editFocusListener", "Lkotlin/Function2;", "Landroid/widget/EditText;", "Lkotlin/ParameterName;", "name", ViewHierarchyConstants.VIEW_KEY, "", "actionId", "OooO", "Lkotlin/jvm/functions/Function2;", "getEditorActionListener", "()Lkotlin/jvm/functions/Function2;", "setEditorActionListener", "(Lkotlin/jvm/functions/Function2;)V", "editorActionListener", "OooOO0O", "Z", "getEditFocusLoseResetView", "()Z", "setEditFocusLoseResetView", "(Z)V", "editFocusLoseResetView", "focus", "OooOO0o", "getEditStateListener", "setEditStateListener", "editStateListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSearchLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchLayout.kt\ncom/yalla/yalla/ui/view/SearchLayout\n+ 2 TextViewExt.kt\ncom/yalla/yalla/ext/TextViewExtKt\n*L\n1#1,133:1\n160#2,2:134\n*S KotlinDebug\n*F\n+ 1 SearchLayout.kt\ncom/yalla/yalla/ui/view/SearchLayout\n*L\n57#1:134,2\n*E\n"})
public final class SearchLayout extends LinearLayout {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final /* synthetic */ int f30089OooOOO0 = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function2<? super EditText, ? super Integer, Unit> editorActionListener;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p3 binding;

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
    public boolean f30096OooOO0;

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
            int i = SearchLayout.f30089OooOOO0;
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
        boolean z = this.f30096OooOO0;
        p3 p3Var = this.binding;
        if (z) {
            if (str.length() > 0) {
                ImageView clear = p3Var.f45393OooO0OO;
                Intrinsics.checkNotNullExpressionValue(clear, "clear");
                o000O.OooOOOO(clear);
                return;
            }
        }
        ImageView clear2 = p3Var.f45393OooO0OO;
        Intrinsics.checkNotNullExpressionValue(clear2, "clear");
        o000O.OooO0O0(clear2);
    }

    public final void OooO0O0(boolean z) {
        this.f30096OooOO0 = z;
        p3 p3Var = this.binding;
        if (z) {
            EditText edit = p3Var.f45394OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(edit, "edit");
            o000O.OooOOOO(edit);
            TextView hint = p3Var.f45396OooO0o0;
            Intrinsics.checkNotNullExpressionValue(hint, "hint");
            o000O.OooO0O0(hint);
            TextView cancel = p3Var.f45392OooO0O0;
            Intrinsics.checkNotNullExpressionValue(cancel, "cancel");
            o000O.OooOOOO(cancel);
        } else {
            ImageView clear = p3Var.f45393OooO0OO;
            Intrinsics.checkNotNullExpressionValue(clear, "clear");
            o000O.OooO0O0(clear);
            if (this.editFocusLoseResetView) {
                OooO0OO();
            }
        }
        OooO00o(p3Var.f45394OooO0Oo.getText().toString());
    }

    public final void OooO0OO() {
        p3 p3Var = this.binding;
        EditText edit = p3Var.f45394OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(edit, "edit");
        o000O.OooO0O0(edit);
        TextView hint = p3Var.f45396OooO0o0;
        Intrinsics.checkNotNullExpressionValue(hint, "hint");
        o000O.OooOOOO(hint);
        TextView cancel = p3Var.f45392OooO0O0;
        Intrinsics.checkNotNullExpressionValue(cancel, "cancel");
        o000O.OooO0O0(cancel);
        ImageView clear = p3Var.f45393OooO0OO;
        Intrinsics.checkNotNullExpressionValue(clear, "clear");
        o000O.OooO0O0(clear);
        this.f30096OooOO0 = false;
    }

    @NotNull
    public final p3 getBinding() {
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
        p3 p3VarInflate = p3.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(p3VarInflate, "inflate(...)");
        this.binding = p3VarInflate;
        p3VarInflate.f45395OooO0o.setOnClickListener(new o000OOo0(this, 1));
        p3VarInflate.f45392OooO0O0.setOnClickListener(new View.OnClickListener() { // from class: o0oOooOO.n1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = SearchLayout.f30089OooOOO0;
                SearchLayout this$0 = this.f56883OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.binding.f45394OooO0Oo.setText("");
                KeyboardExtKt.OooO00o(this$0.binding.f45394OooO0Oo);
                this$0.OooO0OO();
                Function0<Unit> function0 = this$0.cancelListener;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
        p3VarInflate.f45393OooO0OO.setOnClickListener(new o00(this, 1));
        EditText edit = p3VarInflate.f45394OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(edit, "edit");
        o00O0OO0 o00o0oo1 = new o00O0OO0();
        OooO00o listener = new OooO00o();
        Intrinsics.checkNotNullParameter(listener, "listener");
        o00o0oo1.f46714OooO0o0 = listener;
        edit.addTextChangedListener(o00o0oo1);
        p3VarInflate.f45394OooO0Oo.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o0oOooOO.o1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                int i2 = SearchLayout.f30089OooOOO0;
                SearchLayout this$0 = this.f56885OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0O0(z);
                Function1<? super Boolean, Unit> function1 = this$0.editFocusListener;
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(z));
                }
            }
        });
        p3VarInflate.f45394OooO0Oo.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o0oOooOO.p1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                int i3 = SearchLayout.f30089OooOOO0;
                SearchLayout this$0 = this.f56932OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function2<? super EditText, ? super Integer, Unit> function2 = this$0.editorActionListener;
                if (function2 == null) {
                    return true;
                }
                EditText edit2 = this$0.binding.f45394OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(edit2, "edit");
                function2.invoke(edit2, Integer.valueOf(i2));
                return true;
            }
        });
        o000OO.OooO0O0().OooO0OO(p3VarInflate.f45394OooO0Oo, new o0000O() { // from class: o0oOooOO.q1
            @Override // p601o0oo00oO.o0000O
            public final void OooO00o(String str) {
                int i2 = SearchLayout.f30089OooOOO0;
                SearchLayout this$0 = this.f56938OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function1<? super String, Unit> function1 = this$0.editDelayListener;
                if (function1 != null) {
                    function1.invoke(o0OoOo0.OooOOO(str, ""));
                }
            }
        });
        OooO0OO();
    }
}
