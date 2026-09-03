package p472o0Oooo0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.support.keyboardpanel.KeyBoardUtil$hideKeyboard$1;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025Oooo0O0.o000O0Oo;
import p140o00OOOo0.o0OOO0o;
import p473o0Oooo0o.o0oOo0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public Function3<? super Boolean, ? super Integer, ? super View, Unit> f40641OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Function2<? super Boolean, ? super Integer, Unit> f40642OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o00 f40643OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f40644OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public View f40645OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f40646OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o0oOo0O0 f40647OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final EditText f40648OooO0oo;

    public static final class OooO00o extends Lambda implements Function1<Integer, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            o00O0000.this.f40647OooO0oO.OooO00o(num.intValue());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Boolean, Integer, Unit> {
        public OooO0O0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Boolean bool, Integer num) {
            Function2<? super Boolean, ? super Integer, Unit> function2;
            boolean zBooleanValue = bool.booleanValue();
            int iIntValue = num.intValue();
            if (zBooleanValue) {
                o00O0000.this.f40647OooO0oO.OooO00o(iIntValue);
                o00O0000 o00o0001 = o00O0000.this;
                if (o00o0001.f40644OooO0Oo == 0 && (function2 = o00o0001.f40642OooO0O0) != null) {
                    function2.invoke(Boolean.TRUE, Integer.valueOf(iIntValue));
                }
                Function3<? super Boolean, ? super Integer, ? super View, Unit> function3 = o00O0000.this.f40641OooO00o;
                if (function3 != null) {
                    function3.invoke(Boolean.TRUE, Integer.valueOf(iIntValue), o00O0000.this.f40645OooO0o);
                }
                o00O0000.this.f40644OooO0Oo = 1;
            } else {
                o00O0000 o00o0002 = o00O0000.this;
                if (o00o0002.f40646OooO0o0) {
                    o00O0000.OooO00o(o00o0002, iIntValue);
                } else {
                    o00o0002.OooO0Oo();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO implements View.OnClickListener {
        public OooO0OO() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View it) {
            o00O0000 o00o0001 = o00O0000.this;
            o00o0001.f40645OooO0o = it;
            int i = o00o0001.f40644OooO0Oo;
            if (i == 0) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                Context context = it.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "it.context");
                o00O0000.OooO00o(o00o0001, o00oOoo.OooO00o(context));
                return;
            }
            if (i == 1) {
                o00o0001.f40646OooO0o0 = true;
                EditText editText = o00o0001.f40648OooO0oo;
                o0OOO0o.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "view.context").hideSoftInputFromWindow(editText.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO0O0(editText, "view.context"), new Handler()));
                return;
            }
            o00o0001.f40646OooO0o0 = false;
            EditText view = o00o0001.f40648OooO0oo;
            Intrinsics.checkNotNullParameter(view, "view");
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "view.context");
            InputMethodManager inputMethodManagerOooO00o = o00O000.OooO00o(context2);
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(o000O0Oo.OooO0O0(view, "view.context"), new Handler()));
        }
    }

    public o00O0000(@NotNull o0oOo0O0 panelView, @NotNull EditText editText) {
        Activity activity;
        Intrinsics.checkNotNullParameter(panelView, "panelView");
        Intrinsics.checkNotNullParameter(editText, "editText");
        this.f40647OooO0oO = panelView;
        this.f40648OooO0oo = editText;
        Context context = panelView.getPanelView().getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity == null) {
            throw new RuntimeException("仅支持在Activity中使用");
        }
        o00 o00Var = new o00(activity);
        this.f40643OooO0OO = o00Var;
        o00Var.f40636OooO0Oo = new OooO00o();
        o00Var.f40638OooO0o0 = new OooO0O0();
    }

    public static final void OooO00o(o00O0000 o00o0001, int i) {
        Function2<? super Boolean, ? super Integer, Unit> function2;
        o00o0001.f40646OooO0o0 = false;
        if (o00o0001.f40644OooO0Oo != 1 && (function2 = o00o0001.f40642OooO0O0) != null) {
            function2.invoke(Boolean.TRUE, Integer.valueOf(i));
        }
        o00o0001.f40647OooO0oO.OooO0O0(i);
        o00o0001.f40644OooO0Oo = 2;
        Function3<? super Boolean, ? super Integer, ? super View, Unit> function3 = o00o0001.f40641OooO00o;
        if (function3 != null) {
            function3.invoke(Boolean.FALSE, Integer.valueOf(i), o00o0001.f40645OooO0o);
        }
    }

    @NotNull
    public final o00O0000 OooO0O0(@NotNull View btSwitch) {
        Intrinsics.checkNotNullParameter(btSwitch, "btSwitch");
        btSwitch.setOnClickListener(new OooO0OO());
        return this;
    }

    public final void OooO0OO() {
        if (this.f40644OooO0Oo != 2) {
            EditText editText = this.f40648OooO0oo;
            o0OOO0o.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "view.context").hideSoftInputFromWindow(editText.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO0O0(editText, "view.context"), new Handler()));
            return;
        }
        this.f40647OooO0oO.OooO0OO();
        this.f40644OooO0Oo = 0;
        Function2<? super Boolean, ? super Integer, Unit> function2 = this.f40642OooO0O0;
        if (function2 != null) {
            Boolean bool = Boolean.FALSE;
            Context context = this.f40648OooO0oo.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "editText.context");
            function2.invoke(bool, Integer.valueOf(o00oOoo.OooO00o(context)));
        }
    }

    public final void OooO0Oo() {
        Context context = this.f40648OooO0oo.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "editText.context");
        int iOooO00o = o00oOoo.OooO00o(context);
        this.f40647OooO0oO.OooO0OO();
        this.f40644OooO0Oo = 0;
        Function2<? super Boolean, ? super Integer, Unit> function2 = this.f40642OooO0O0;
        if (function2 != null) {
            function2.invoke(Boolean.FALSE, Integer.valueOf(iOooO00o));
        }
    }

    public final boolean OooO0o0() {
        if (this.f40644OooO0Oo != 2) {
            return false;
        }
        OooO0Oo();
        return true;
    }
}
