package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p021OooOooo.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
public class o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object[] f4536OooO00o = new Object[2];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Class<?>[] f4529OooO0O0 = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int[] f4530OooO0OO = {R.attr.onClick};

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int[] f4531OooO0Oo = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int[] f4533OooO0o0 = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final int[] f4532OooO0o = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final String[] f4534OooO0oO = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final o00oO0o<String, Constructor<? extends View>> f4535OooO0oo = new o00oO0o<>();

    public static class OooO00o implements View.OnClickListener {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public Context f4537Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final View f4538Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final String f4539Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public Method f4540Oooo0oo;

        public OooO00o(@NonNull View view, @NonNull String str) {
            this.f4538Oooo0o = view;
            this.f4539Oooo0oO = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@NonNull View view) {
            String string;
            Method method;
            if (this.f4540Oooo0oo != null) {
                break;
            }
            Context context = this.f4538Oooo0o.getContext();
            while (true) {
                if (context == null) {
                    int id = this.f4538Oooo0o.getId();
                    if (id == -1) {
                        string = "";
                    } else {
                        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0(" with id '");
                        sbOooO0o0.append(this.f4538Oooo0o.getContext().getResources().getResourceEntryName(id));
                        sbOooO0o0.append("'");
                        string = sbOooO0o0.toString();
                    }
                    StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("Could not find method ");
                    sbOooO0o1.append(this.f4539Oooo0oO);
                    sbOooO0o1.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    sbOooO0o1.append(this.f4538Oooo0o.getClass());
                    sbOooO0o1.append(string);
                    throw new IllegalStateException(sbOooO0o1.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f4539Oooo0oO, View.class)) != null) {
                        this.f4540Oooo0oo = method;
                        this.f4537Oooo = context;
                        break;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            try {
                this.f4540Oooo0oo.invoke(this.f4537Oooo, view);
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
        String str3;
        o00oO0o<String, Constructor<? extends View>> o00oo0o2 = f4535OooO0oo;
        Constructor<? extends View> orDefault = o00oo0o2.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            orDefault = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f4529OooO0O0);
            o00oo0o2.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return orDefault.newInstance(this.f4536OooO00o);
    }

    @NonNull
    public AppCompatTextView OooO0o0(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public final void OooO0oO(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
