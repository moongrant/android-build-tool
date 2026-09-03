package p371o0OOo0oO;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import kotlin.Unit;
import kotlin.collections.OooO00o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372o0OOo0oo.o0Oo0oo;
import p497o0o00OoO.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0Oo0oo f43181OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final EditText f43182OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Function2<? super Boolean, ? super Integer, Unit> f43183OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Function2<? super Boolean, ? super Integer, Unit> f43184OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f43185OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o0OoOo0 f43186OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f43187OooO0oO;

    public oo000o(@NotNull o0000oo panelView, @NotNull EditText editText) {
        Activity activity;
        Intrinsics.checkNotNullParameter(panelView, "panelView");
        Intrinsics.checkNotNullParameter(editText, "editText");
        this.f43181OooO00o = panelView;
        this.f43182OooO0O0 = editText;
        panelView.getClass();
        Context context = panelView.getContext();
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
        o0OoOo0 o0oooo1 = new o0OoOo0(activity);
        this.f43186OooO0o0 = o0oooo1;
        o0oooo1.f43177OooO0o0 = new o00Oo0(this);
        o0oooo1.f43176OooO0o = new o00Ooo(this);
    }

    public final void OooO00o() {
        int i = this.f43185OooO0o;
        EditText editText = this.f43182OooO0O0;
        if (i != 2) {
            InputMethodManager inputMethodManagerOooO00o = o00O0O.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "getContext(...)");
            OooO00o.OooO0O0(editText.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, editText.getWindowToken(), 0);
            return;
        }
        this.f43181OooO00o.OooO0OO();
        this.f43185OooO0o = 0;
        Function2<? super Boolean, ? super Integer, Unit> function2 = this.f43184OooO0Oo;
        if (function2 != null) {
            Boolean bool = Boolean.FALSE;
            Context context = editText.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Intrinsics.checkNotNullParameter(context, "context");
            if (o0ooOOo.f43180OooO00o == 0) {
                o00oO0o o00oo0o2 = o00oO0o.f43168OooO00o;
                int i2 = (int) ((Resources.getSystem().getDisplayMetrics().density * 300.0f) + 0.5f);
                o00oo0o2.getClass();
                o0ooOOo.f43180OooO00o = o00oO0o.OooO00o(i2, context);
            }
            function2.invoke(bool, Integer.valueOf(o0ooOOo.f43180OooO00o));
        }
    }

    public final void OooO0O0() {
        Context context = this.f43182OooO0O0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        if (o0ooOOo.f43180OooO00o == 0) {
            o00oO0o o00oo0o2 = o00oO0o.f43168OooO00o;
            int i = (int) ((Resources.getSystem().getDisplayMetrics().density * 300.0f) + 0.5f);
            o00oo0o2.getClass();
            o0ooOOo.f43180OooO00o = o00oO0o.OooO00o(i, context);
        }
        int i2 = o0ooOOo.f43180OooO00o;
        this.f43181OooO00o.OooO0OO();
        this.f43185OooO0o = 0;
        Function2<? super Boolean, ? super Integer, Unit> function2 = this.f43184OooO0Oo;
        if (function2 != null) {
            function2.invoke(Boolean.FALSE, Integer.valueOf(i2));
        }
    }

    public final void OooO0OO(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = this.f43185OooO0o;
        if (i == 0) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (o0ooOOo.f43180OooO00o == 0) {
                o00oO0o o00oo0o2 = o00oO0o.f43168OooO00o;
                int i2 = (int) ((Resources.getSystem().getDisplayMetrics().density * 300.0f) + 0.5f);
                o00oo0o2.getClass();
                o0ooOOo.f43180OooO00o = o00oO0o.OooO00o(i2, context);
            }
            OooO0Oo(o0ooOOo.f43180OooO00o);
            return;
        }
        EditText view = this.f43182OooO0O0;
        if (i == 1) {
            this.f43187OooO0oO = true;
            InputMethodManager inputMethodManagerOooO00o = o00O0O.OooO00o(view, ViewHierarchyConstants.VIEW_KEY, "getContext(...)");
            OooO00o.OooO0O0(view.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view.getWindowToken(), 0);
            return;
        }
        this.f43187OooO0oO = false;
        Intrinsics.checkNotNullParameter(view, "view");
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        InputMethodManager inputMethodManagerOooO00o2 = o0OOO0o.OooO00o(context2);
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        inputMethodManagerOooO00o2.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
    }

    public final void OooO0Oo(int i) {
        Function2<? super Boolean, ? super Integer, Unit> function2;
        this.f43187OooO0oO = false;
        int i2 = this.f43185OooO0o;
        o0Oo0oo o0oo0oo2 = this.f43181OooO00o;
        if (i2 != 1 && (function2 = this.f43184OooO0Oo) != null) {
            function2.invoke(Boolean.TRUE, Integer.valueOf(i));
        }
        o0oo0oo2.OooO0O0(i);
        this.f43185OooO0o = 2;
        Function2<? super Boolean, ? super Integer, Unit> function3 = this.f43183OooO0OO;
        if (function3 != null) {
            function3.invoke(Boolean.FALSE, Integer.valueOf(i));
        }
    }
}
