package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object[] f2485OooO00o = new Object[2];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Class<?>[] f2478OooO0O0 = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int[] f2479OooO0OO = {R.attr.onClick};

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int[] f2480OooO0Oo = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int[] f2482OooO0o0 = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final int[] f2481OooO0o = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final String[] f2483OooO0oO = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final p188o00o0O.Oooo000<String, Constructor<? extends View>> f2484OooO0oo = new p188o00o0O.Oooo000<>();

    public static class OooO00o implements View.OnClickListener {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final View f2486OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Method f2487OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final String f2488OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Context f2489OooO0oO;

        public OooO00o(@NonNull View view, @NonNull String str) {
            this.f2486OooO0Oo = view;
            this.f2488OooO0o0 = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@NonNull View view) {
            String str;
            Method method;
            if (this.f2487OooO0o != null) {
                break;
            }
            View view2 = this.f2486OooO0Oo;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f2488OooO0o0;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder sbOooO00o = p004OooO0oO.o0OoOo0.OooO00o("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    sbOooO00o.append(view2.getClass());
                    sbOooO00o.append(str);
                    throw new IllegalStateException(sbOooO00o.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f2487OooO0o = method;
                        this.f2489OooO0oO = context;
                        break;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            try {
                this.f2487OooO0o.invoke(this.f2489OooO0oO, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    @NonNull
    public AppCompatAutoCompleteTextView OooO00o(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    @NonNull
    public AppCompatButton OooO0O0(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    @NonNull
    public AppCompatCheckBox OooO0OO(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    @NonNull
    public AppCompatRadioButton OooO0Oo(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    public final View OooO0o(Context context, String str, String str2) throws InflateException, ClassNotFoundException {
        String strConcat;
        p188o00o0O.Oooo000<String, Constructor<? extends View>> oooo000 = f2484OooO0oo;
        Constructor<? extends View> orDefault = oooo000.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            orDefault = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f2478OooO0O0);
            oooo000.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return orDefault.newInstance(this.f2485OooO00o);
    }

    @NonNull
    public AppCompatTextView OooO0o0(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public final void OooO0oO(TextView textView, String str) {
        if (textView != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
