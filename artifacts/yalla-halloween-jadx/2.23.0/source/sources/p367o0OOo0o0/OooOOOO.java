package p367o0OOo0o0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.os.Handler;
import android.support.v4.media.session.OooO0o;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p366o0OOo0o.OooOOO;
import p490o0o00OOO.OooOo;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooOOO f43969OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final EditText f43970OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Function2<? super Boolean, ? super Integer, Unit> f43971OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Function2<? super Boolean, ? super Integer, Unit> f43972OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f43973OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final OooOO0 f43974OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f43975OooO0oO;

    public OooOOOO(@NotNull OooOo panelView, @NotNull EditText editText) {
        Activity activity;
        Intrinsics.checkNotNullParameter(panelView, "panelView");
        Intrinsics.checkNotNullParameter(editText, "editText");
        this.f43969OooO00o = panelView;
        this.f43970OooO0O0 = editText;
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
        OooOO0 oooOO1 = new OooOO0(activity);
        this.f43974OooO0o0 = oooOO1;
        oooOO1.f43964OooO0o0 = new OooOOO0(this);
        oooOO1.f43963OooO0o = new OooOOO(this);
    }

    public final void OooO00o() {
        int i = this.f43973OooO0o;
        EditText editText = this.f43970OooO0O0;
        if (i != 2) {
            InputMethodManager inputMethodManagerOooO00o = OooO0o.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "view.context");
            OooOO0O.OooO00o(editText.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, editText.getWindowToken(), 0);
            return;
        }
        this.f43969OooO00o.OooO0OO();
        this.f43973OooO0o = 0;
        Function2<? super Boolean, ? super Integer, Unit> function2 = this.f43972OooO0Oo;
        if (function2 != null) {
            Boolean bool = Boolean.FALSE;
            Context context = editText.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "editText.context");
            Intrinsics.checkNotNullParameter(context, "context");
            if (OooOo.f43976OooO00o == 0) {
                OooOo00 oooOo00 = OooOo00.f43977OooO00o;
                int i2 = (int) ((Resources.getSystem().getDisplayMetrics().density * 300.0f) + 0.5f);
                oooOo00.getClass();
                OooOo.f43976OooO00o = OooOo00.OooO00o(i2, context);
            }
            function2.invoke(bool, Integer.valueOf(OooOo.f43976OooO00o));
        }
    }

    public final void OooO0O0() {
        Context context = this.f43970OooO0O0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "editText.context");
        Intrinsics.checkNotNullParameter(context, "context");
        if (OooOo.f43976OooO00o == 0) {
            OooOo00 oooOo00 = OooOo00.f43977OooO00o;
            int i = (int) ((Resources.getSystem().getDisplayMetrics().density * 300.0f) + 0.5f);
            oooOo00.getClass();
            OooOo.f43976OooO00o = OooOo00.OooO00o(i, context);
        }
        int i2 = OooOo.f43976OooO00o;
        this.f43969OooO00o.OooO0OO();
        this.f43973OooO0o = 0;
        Function2<? super Boolean, ? super Integer, Unit> function2 = this.f43972OooO0Oo;
        if (function2 != null) {
            function2.invoke(Boolean.FALSE, Integer.valueOf(i2));
        }
    }

    public final void OooO0OO(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = this.f43973OooO0o;
        if (i == 0) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (OooOo.f43976OooO00o == 0) {
                OooOo00 oooOo00 = OooOo00.f43977OooO00o;
                int i2 = (int) ((Resources.getSystem().getDisplayMetrics().density * 300.0f) + 0.5f);
                oooOo00.getClass();
                OooOo.f43976OooO00o = OooOo00.OooO00o(i2, context);
            }
            OooO0Oo(OooOo.f43976OooO00o);
            return;
        }
        EditText view = this.f43970OooO0O0;
        if (i == 1) {
            this.f43975OooO0oO = true;
            InputMethodManager inputMethodManagerOooO00o = OooO0o.OooO00o(view, ViewHierarchyConstants.VIEW_KEY, "view.context");
            OooOO0O.OooO00o(view.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view.getWindowToken(), 0);
            return;
        }
        this.f43975OooO0oO = false;
        Intrinsics.checkNotNullParameter(view, "view");
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "view.context");
        InputMethodManager inputMethodManagerOooO00o2 = Oooo000.OooO00o(context2);
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        inputMethodManagerOooO00o2.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
    }

    public final void OooO0Oo(int i) {
        Function2<? super Boolean, ? super Integer, Unit> function2;
        this.f43975OooO0oO = false;
        int i2 = this.f43973OooO0o;
        OooOOO oooOOO = this.f43969OooO00o;
        if (i2 != 1 && (function2 = this.f43972OooO0Oo) != null) {
            function2.invoke(Boolean.TRUE, Integer.valueOf(i));
        }
        oooOOO.OooO0O0(i);
        this.f43973OooO0o = 2;
        Function2<? super Boolean, ? super Integer, Unit> function3 = this.f43971OooO0OO;
        if (function3 != null) {
            function3.invoke(Boolean.FALSE, Integer.valueOf(i));
        }
    }
}
