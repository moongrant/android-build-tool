package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.actions.SearchIntents;
import io.agora.rtc.Constants;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import net.sqlcipher.database.SQLiteDatabase;
import org.conscrypt.PSKKeyManager;
import org.jctools.util.Pow2;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements p016OooOoOO.o00O0O {

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public static final o000oOoO f3012Oooooo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final SearchAutoComplete f3013OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ImageView f3014OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final View f3015OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final View f3016OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final View f3017OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ImageView f3018OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final ImageView f3019OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final ImageView f3020OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final View f3021OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final Rect f3022OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public o0OoOo0 f3023OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final Rect f3024OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final int[] f3025OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f3026Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final int f3027Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final int[] f3028Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final ImageView f3029Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final Drawable f3030Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final int f3031Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final Intent f3032Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final CharSequence f3033Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final Intent f3034Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public View.OnFocusChangeListener f3035Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public View.OnClickListener f3036Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public CharSequence f3037OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public o0000OOO.OooO00o f3038OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f3039OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f3040OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f3041OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f3042OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f3043OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public CharSequence f3044OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f3045OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f3046OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public SearchableInfo f3047Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public Bundle f3048Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final OooO0O0 f3049OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final OooO0OO f3050OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f3051OooooOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f3052o000oOoO;

    public class OooO implements View.OnLayoutChangeListener {
        public OooO() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int dimensionPixelSize;
            SearchView searchView = SearchView.this;
            View view2 = searchView.f3021OooOoOO;
            if (view2.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.f3015OooOo0.getPaddingLeft();
                Rect rect = new Rect();
                boolean zOooO00o = o0O0ooO.OooO00o(searchView);
                if (searchView.f3026Oooo) {
                    dimensionPixelSize = resources.getDimensionPixelSize(p012OooOo0O.OooOo00.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(p012OooOo0O.OooOo00.abc_dropdownitem_icon_width);
                } else {
                    dimensionPixelSize = 0;
                }
                SearchAutoComplete searchAutoComplete = searchView.f3013OooOOoo;
                searchAutoComplete.getDropDownBackground().getPadding(rect);
                searchAutoComplete.setDropDownHorizontalOffset(zOooO00o ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    public class OooO00o implements TextWatcher {
        public OooO00o() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.f3013OooOOoo.getText();
            searchView.f3044OoooOo0 = text;
            boolean z = !TextUtils.isEmpty(text);
            searchView.OooOo(z);
            boolean z2 = !z;
            int i4 = 8;
            if (searchView.f3043OoooOOo && !searchView.f3039OoooO00 && z2) {
                searchView.f3014OooOo.setVisibility(8);
                i4 = 0;
            }
            searchView.f3019OooOoO.setVisibility(i4);
            searchView.OooOo00();
            searchView.OooOo0o();
            charSequence.toString();
            searchView.getClass();
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SearchView.this.OooOo0();
        }
    }

    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o0000OOO.OooO00o oooO00o = SearchView.this.f3038OoooO0;
            if (oooO00o instanceof o000OO) {
                oooO00o.OooO0OO(null);
            }
        }
    }

    public class OooO0o implements View.OnFocusChangeListener {
        public OooO0o() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f3035Oooo0oO;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    public class OooOO0 implements View.OnClickListener {
        public OooOO0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SearchView searchView = SearchView.this;
            ImageView imageView = searchView.f3018OooOo0o;
            SearchAutoComplete searchAutoComplete = searchView.f3013OooOOoo;
            if (view == imageView) {
                searchView.OooOoO0(false);
                searchAutoComplete.requestFocus();
                searchAutoComplete.setImeVisibility(true);
                View.OnClickListener onClickListener = searchView.f3036Oooo0oo;
                if (onClickListener != null) {
                    onClickListener.onClick(searchView);
                    return;
                }
                return;
            }
            if (view == searchView.f3020OooOoO0) {
                searchView.OooOOOO();
                return;
            }
            if (view == searchView.f3014OooOo) {
                searchView.OooOOoo();
                return;
            }
            if (view != searchView.f3019OooOoO) {
                if (view == searchAutoComplete) {
                    searchView.OooOOO();
                    return;
                }
                return;
            }
            SearchableInfo searchableInfo = searchView.f3047Ooooo00;
            if (searchableInfo == null) {
                return;
            }
            try {
                if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        searchView.getContext().startActivity(searchView.OooOOO0(searchView.f3034Oooo0o0, searchableInfo));
                    }
                } else {
                    Intent intent = new Intent(searchView.f3032Oooo0OO);
                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                    intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                    searchView.getContext().startActivity(intent);
                }
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    public class OooOO0O implements View.OnKeyListener {
        public OooOO0O() {
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f3047Ooooo00 == null) {
                return false;
            }
            SearchAutoComplete searchAutoComplete = searchView.f3013OooOOoo;
            if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                if ((TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                    return false;
                }
                view.cancelLongPress();
                searchView.getContext().startActivity(searchView.OooOO0o("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
                return true;
            }
            if (searchView.f3047Ooooo00 == null || searchView.f3038OoooO0 == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                return false;
            }
            if (i == 66 || i == 84 || i == 61) {
                searchView.OooOOOo(searchAutoComplete.getListSelection());
            } else {
                if (i != 21 && i != 22) {
                    if (i != 19) {
                        return false;
                    }
                    searchAutoComplete.getListSelection();
                    return false;
                }
                searchAutoComplete.setSelection(i == 21 ? 0 : searchAutoComplete.length());
                searchAutoComplete.setListSelection(0);
                searchAutoComplete.clearListSelection();
                searchAutoComplete.OooO00o();
            }
            return true;
        }
    }

    public class OooOOO implements AdapterView.OnItemClickListener {
        public OooOOO() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.OooOOOo(i);
        }
    }

    public class OooOOO0 implements TextView.OnEditorActionListener {
        public OooOOO0() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.OooOOoo();
            return true;
        }
    }

    public class OooOOOO implements AdapterView.OnItemSelectedListener {
        public OooOOOO() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.OooOOo0(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public interface OooOo {
    }

    @RequiresApi(29)
    public static class OooOo00 {
        @DoNotInline
        public static void OooO00o(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        @DoNotInline
        public static void OooO0O0(SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }
    }

    public interface Oooo0 {
    }

    public interface Oooo000 {
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f3063OooO0o;

        public class OooO00o implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3063OooO0o = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public final String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f3063OooO0o + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f5545OooO0Oo, i);
            parcel.writeValue(Boolean.valueOf(this.f3063OooO0o));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public SearchView f3064OooO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f3065OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public boolean f3066OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final OooO00o f3067OooOO0O;

        public class OooO00o implements Runnable {
            public OooO00o() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f3066OooOO0) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f3066OooOO0 = false;
                }
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            if (i >= 600) {
                return 192;
            }
            if (i < 640 || i2 < 480) {
                return Constants.ERR_ALREADY_IN_RECORDING;
            }
            return 192;
        }

        public final void OooO00o() {
            if (Build.VERSION.SDK_INT >= 29) {
                OooOo00.OooO0O0(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            o000oOoO o000oooo2 = SearchView.f3012Oooooo0;
            o000oooo2.getClass();
            o000oOoO.OooO00o();
            Method method = o000oooo2.f3071OooO0OO;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f3065OooO0oo <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f3066OooOO0) {
                OooO00o oooO00o = this.f3067OooOO0O;
                removeCallbacks(oooO00o);
                post(oooO00o);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.f3064OooO;
            searchView.OooOoO0(searchView.f3039OoooO00);
            searchView.post(searchView.f3049OooooO0);
            if (searchView.f3013OooOOoo.hasFocus()) {
                searchView.OooOOO();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f3064OooO.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f3064OooO.hasFocus() && getVisibility() == 0) {
                this.f3066OooOO0 = true;
                Context context = getContext();
                o000oOoO o000oooo2 = SearchView.f3012Oooooo0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    OooO00o();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            OooO00o oooO00o = this.f3067OooOO0O;
            if (!z) {
                this.f3066OooOO0 = false;
                removeCallbacks(oooO00o);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f3066OooOO0 = true;
                    return;
                }
                this.f3066OooOO0 = false;
                removeCallbacks(oooO00o);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f3064OooO = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f3065OooO0oo = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, p012OooOo0O.OooOOO0.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f3067OooOO0O = new OooO00o();
            this.f3065OooO0oo = getThreshold();
        }
    }

    public static class o000oOoO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f3069OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Method f3070OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Method f3071OooO0OO;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public o000oOoO() {
            this.f3069OooO00o = null;
            this.f3070OooO0O0 = null;
            this.f3071OooO0OO = null;
            OooO00o();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f3069OooO00o = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f3070OooO0O0 = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f3071OooO0OO = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void OooO00o() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    public static class o0OoOo0 extends TouchDelegate {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final View f3072OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Rect f3073OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Rect f3074OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Rect f3075OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f3076OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f3077OooO0o0;

        public o0OoOo0(Rect rect, Rect rect2, SearchAutoComplete searchAutoComplete) {
            super(rect, searchAutoComplete);
            int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
            this.f3077OooO0o0 = scaledTouchSlop;
            Rect rect3 = new Rect();
            this.f3073OooO0O0 = rect3;
            Rect rect4 = new Rect();
            this.f3075OooO0Oo = rect4;
            Rect rect5 = new Rect();
            this.f3074OooO0OO = rect5;
            rect3.set(rect);
            rect4.set(rect);
            int i = -scaledTouchSlop;
            rect4.inset(i, i);
            rect5.set(rect2);
            this.f3072OooO00o = searchAutoComplete;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003f  */
        @Override // android.view.TouchDelegate
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f3076OooO0o;
                    if (z2 && !this.f3075OooO0Oo.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else if (action != 3) {
                    z = true;
                    z3 = false;
                } else {
                    z2 = this.f3076OooO0o;
                    this.f3076OooO0o = false;
                }
                z3 = z2;
                z = true;
            } else if (this.f3073OooO0O0.contains(x, y)) {
                this.f3076OooO0o = true;
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            Rect rect = this.f3074OooO0OO;
            View view = this.f3072OooO00o;
            if (!z || rect.contains(x, y)) {
                motionEvent.setLocation(x - rect.left, y - rect.top);
            } else {
                motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
            }
            return view.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f3012Oooooo0 = Build.VERSION.SDK_INT < 29 ? new o000oOoO() : null;
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(p012OooOo0O.OooOo00.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(p012OooOo0O.OooOo00.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f3013OooOOoo;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // p016OooOoOO.o00O0O
    public final void OooO0O0() {
        if (this.f3045OoooOoO) {
            return;
        }
        this.f3045OoooOoO = true;
        SearchAutoComplete searchAutoComplete = this.f3013OooOOoo;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f3046OoooOoo = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // p016OooOoOO.o00O0O
    public final void OooO0o0() {
        SearchAutoComplete searchAutoComplete = this.f3013OooOOoo;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f3044OoooOo0 = "";
        clearFocus();
        OooOoO0(true);
        searchAutoComplete.setImeOptions(this.f3046OoooOoo);
        this.f3045OoooOoO = false;
    }

    public final Intent OooOO0o(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f3044OoooOo0);
        if (str3 != null) {
            intent.putExtra(SearchIntents.EXTRA_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f3048Ooooo0o;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f3047Ooooo00.getSearchActivity());
        return intent;
    }

    public final void OooOOO() {
        int i = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f3013OooOOoo;
        if (i >= 29) {
            OooOo00.OooO00o(searchAutoComplete);
            return;
        }
        o000oOoO o000oooo2 = f3012Oooooo0;
        o000oooo2.getClass();
        o000oOoO.OooO00o();
        Method method = o000oooo2.f3069OooO00o;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        o000oooo2.getClass();
        o000oOoO.OooO00o();
        Method method2 = o000oooo2.f3070OooO0O0;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final Intent OooOOO0(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3048Ooooo0o;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void OooOOOO() {
        SearchAutoComplete searchAutoComplete = this.f3013OooOOoo;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f3026Oooo) {
            clearFocus();
            OooOoO0(true);
        }
    }

    public final void OooOOOo(int i) {
        int position;
        String strOooO;
        Cursor cursor = this.f3038OoooO0.f33613OooO0o;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intentOooOO0o = null;
            try {
                int i2 = o000OO.f3271OooOoOO;
                String strOooO2 = o000OO.OooO(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strOooO2 == null) {
                    strOooO2 = this.f3047Ooooo00.getSuggestIntentAction();
                }
                if (strOooO2 == null) {
                    strOooO2 = "android.intent.action.SEARCH";
                }
                String strOooO3 = o000OO.OooO(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strOooO3 == null) {
                    strOooO3 = this.f3047Ooooo00.getSuggestIntentData();
                }
                if (strOooO3 != null && (strOooO = o000OO.OooO(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strOooO3 = strOooO3 + "/" + Uri.encode(strOooO);
                }
                intentOooOO0o = OooOO0o(strOooO2, strOooO3 == null ? null : Uri.parse(strOooO3), o000OO.OooO(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), o000OO.OooO(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e);
            }
            if (intentOooOO0o != null) {
                try {
                    getContext().startActivity(intentOooOO0o);
                } catch (RuntimeException e2) {
                    Log.e("SearchView", "Failed launch activity: " + intentOooOO0o, e2);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f3013OooOOoo;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void OooOOo(@Nullable CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void OooOOo0(int i) {
        Editable text = this.f3013OooOOoo.getText();
        Cursor cursor = this.f3038OoooO0.f33613OooO0o;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i)) {
            setQuery(text);
            return;
        }
        String strOooO0Oo = this.f3038OoooO0.OooO0Oo(cursor);
        if (strOooO0Oo != null) {
            setQuery(strOooO0Oo);
        } else {
            setQuery(text);
        }
    }

    public final void OooOOoo() {
        SearchAutoComplete searchAutoComplete = this.f3013OooOOoo;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f3047Ooooo00 != null) {
            getContext().startActivity(OooOO0o("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0021  */
    public final void OooOo(boolean z) {
        int i;
        boolean z2 = this.f3040OoooO0O;
        if (z2) {
            i = 0;
            if (!((z2 || this.f3043OoooOOo) && !this.f3039OoooO00) || !hasFocus() || (!z && this.f3043OoooOOo)) {
                i = 8;
            }
        } else {
            i = 8;
        }
        this.f3014OooOo.setVisibility(i);
    }

    public final void OooOo0() {
        int[] iArr = this.f3013OooOOoo.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f3015OooOo0.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f3017OooOo0O.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void OooOo00() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f3013OooOOoo.getText());
        if (!z2 && (!this.f3026Oooo || this.f3045OoooOoO)) {
            z = false;
        }
        int i = z ? 0 : 8;
        ImageView imageView = this.f3020OooOoO0;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void OooOo0O() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        boolean z = this.f3026Oooo;
        SearchAutoComplete searchAutoComplete = this.f3013OooOOoo;
        CharSequence charSequence2 = charSequence;
        if (z && (drawable = this.f3030Oooo00o) != null) {
            charSequence2 = charSequence;
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            charSequence2 = spannableStringBuilder;
        }
        charSequence2 = charSequence;
        searchAutoComplete.setHint(charSequence2);
    }

    public final void OooOo0o() {
        int i = 0;
        if (!((this.f3040OoooO0O || this.f3043OoooOOo) && !this.f3039OoooO00) || (this.f3014OooOo.getVisibility() != 0 && this.f3019OooOoO.getVisibility() != 0)) {
            i = 8;
        }
        this.f3017OooOo0O.setVisibility(i);
    }

    public final void OooOoO0(boolean z) {
        this.f3039OoooO00 = z;
        int i = 0;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f3013OooOOoo.getText());
        this.f3018OooOo0o.setVisibility(i2);
        OooOo(z2);
        this.f3016OooOo00.setVisibility(z ? 8 : 0);
        ImageView imageView = this.f3029Oooo00O;
        imageView.setVisibility((imageView.getDrawable() == null || this.f3026Oooo) ? 8 : 0);
        OooOo00();
        boolean z3 = !z2;
        if (this.f3043OoooOOo && !this.f3039OoooO00 && z3) {
            this.f3014OooOo.setVisibility(8);
        } else {
            i = 8;
        }
        this.f3019OooOoO.setVisibility(i);
        OooOo0o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f3052o000oOoO = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f3013OooOOoo;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f3052o000oOoO = false;
    }

    public int getImeOptions() {
        return this.f3013OooOOoo.getImeOptions();
    }

    public int getInputType() {
        return this.f3013OooOOoo.getInputType();
    }

    public int getMaxWidth() {
        return this.f3042OoooOOO;
    }

    public CharSequence getQuery() {
        return this.f3013OooOOoo.getText();
    }

    @Nullable
    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f3037OoooO;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f3047Ooooo00;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f3033Oooo0o : getContext().getText(this.f3047Ooooo00.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f3031Oooo0O0;
    }

    public int getSuggestionRowLayout() {
        return this.f3027Oooo0;
    }

    public o0000OOO.OooO00o getSuggestionsAdapter() {
        return this.f3038OoooO0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f3049OooooO0);
        post(this.f3050OooooOO);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.f3013OooOOoo;
            int[] iArr = this.f3025OooOooo;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f3028Oooo000;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i6;
            int height = searchAutoComplete.getHeight() + i5;
            Rect rect = this.f3022OooOoo;
            rect.set(i6, i5, width, height);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.f3024OooOooO;
            rect2.set(i7, 0, i8, i9);
            o0OoOo0 o0oooo1 = this.f3023OooOoo0;
            if (o0oooo1 == null) {
                o0OoOo0 o0oooo2 = new o0OoOo0(rect2, rect, searchAutoComplete);
                this.f3023OooOoo0 = o0oooo2;
                setTouchDelegate(o0oooo2);
            } else {
                o0oooo1.f3073OooO0O0.set(rect2);
                Rect rect3 = o0oooo1.f3075OooO0Oo;
                rect3.set(rect2);
                int i10 = -o0oooo1.f3077OooO0o0;
                rect3.inset(i10, i10);
                o0oooo1.f3074OooO0OO.set(rect);
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f3039OoooO00) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.f3042OoooOOO;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f3042OoooOOO;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.f3042OoooOOO) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, Pow2.MAX_POW2), View.MeasureSpec.makeMeasureSpec(size2, Pow2.MAX_POW2));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f5545OooO0Oo);
        OooOoO0(savedState.f3063OooO0o);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3063OooO0o = this.f3039OoooO00;
        return savedState;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f3049OooooO0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.f3052o000oOoO || !isFocusable()) {
            return false;
        }
        if (this.f3039OoooO00) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.f3013OooOOoo.requestFocus(i, rect);
        if (zRequestFocus) {
            OooOoO0(false);
        }
        return zRequestFocus;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAppSearchData(Bundle bundle) {
        this.f3048Ooooo0o = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            OooOOOO();
            return;
        }
        OooOoO0(false);
        SearchAutoComplete searchAutoComplete = this.f3013OooOOoo;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f3036Oooo0oo;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f3026Oooo == z) {
            return;
        }
        this.f3026Oooo = z;
        OooOoO0(z);
        OooOo0O();
    }

    public void setImeOptions(int i) {
        this.f3013OooOOoo.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f3013OooOOoo.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f3042OoooOOO = i;
        requestLayout();
    }

    public void setOnCloseListener(OooOo oooOo) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f3035Oooo0oO = onFocusChangeListener;
    }

    public void setOnQueryTextListener(Oooo000 oooo000) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f3036Oooo0oo = onClickListener;
    }

    public void setOnSuggestionListener(Oooo0 oooo0) {
    }

    public void setQueryHint(@Nullable CharSequence charSequence) {
        this.f3037OoooO = charSequence;
        OooOo0O();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f3041OoooOO0 = z;
        o0000OOO.OooO00o oooO00o = this.f3038OoooO0;
        if (oooO00o instanceof o000OO) {
            ((o000OO) oooO00o).f3277OooOOoo = z ? 2 : 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        boolean z;
        this.f3047Ooooo00 = searchableInfo;
        SearchAutoComplete searchAutoComplete = this.f3013OooOOoo;
        Intent intent = null;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f3047Ooooo00.getImeOptions());
            int inputType = this.f3047Ooooo00.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f3047Ooooo00.getSuggestAuthority() != null) {
                    inputType = inputType | 65536 | 524288;
                }
            }
            searchAutoComplete.setInputType(inputType);
            o0000OOO.OooO00o oooO00o = this.f3038OoooO0;
            if (oooO00o != null) {
                oooO00o.OooO0OO(null);
            }
            if (this.f3047Ooooo00.getSuggestAuthority() != null) {
                o000OO o000oo2 = new o000OO(getContext(), this, this.f3047Ooooo00, this.f3051OooooOo);
                this.f3038OoooO0 = o000oo2;
                searchAutoComplete.setAdapter(o000oo2);
                ((o000OO) this.f3038OoooO0).f3277OooOOoo = this.f3041OoooOO0 ? 2 : 1;
            }
            OooOo0O();
        }
        SearchableInfo searchableInfo2 = this.f3047Ooooo00;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f3047Ooooo00.getVoiceSearchLaunchWebSearch()) {
                intent = this.f3032Oooo0OO;
            } else if (this.f3047Ooooo00.getVoiceSearchLaunchRecognizer()) {
                intent = this.f3034Oooo0o0;
            }
            z = (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
        }
        this.f3043OoooOOo = z;
        if (z) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        OooOoO0(this.f3039OoooO00);
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f3040OoooO0O = z;
        OooOoO0(this.f3039OoooO00);
    }

    public void setSuggestionsAdapter(o0000OOO.OooO00o oooO00o) {
        this.f3038OoooO0 = oooO00o;
        this.f3013OooOOoo.setAdapter(oooO00o);
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p012OooOo0O.OooOOO0.searchViewStyle);
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3022OooOoo = new Rect();
        this.f3024OooOooO = new Rect();
        this.f3025OooOooo = new int[2];
        this.f3028Oooo000 = new int[2];
        this.f3049OooooO0 = new OooO0O0();
        this.f3050OooooOO = new OooO0OO();
        this.f3051OooooOo = new WeakHashMap<>();
        OooOO0 oooOO1 = new OooOO0();
        OooOO0O oooOO0O = new OooOO0O();
        OooOOO0 oooOOO0 = new OooOOO0();
        OooOOO oooOOO = new OooOOO();
        OooOOOO oooOOOO = new OooOOOO();
        OooO00o oooO00o = new OooO00o();
        int[] iArr = p012OooOo0O.o00O0O.SearchView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        o000Oo0 o000oo1 = new o000Oo0(context, typedArrayObtainStyledAttributes);
        ViewCompat.OooOOO(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        LayoutInflater.from(context).inflate(o000oo1.OooO(p012OooOo0O.o00O0O.SearchView_layout, p012OooOo0O.Oooo0.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(p012OooOo0O.Oooo000.search_src_text);
        this.f3013OooOOoo = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f3016OooOo00 = findViewById(p012OooOo0O.Oooo000.search_edit_frame);
        View viewFindViewById = findViewById(p012OooOo0O.Oooo000.search_plate);
        this.f3015OooOo0 = viewFindViewById;
        View viewFindViewById2 = findViewById(p012OooOo0O.Oooo000.submit_area);
        this.f3017OooOo0O = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(p012OooOo0O.Oooo000.search_button);
        this.f3018OooOo0o = imageView;
        ImageView imageView2 = (ImageView) findViewById(p012OooOo0O.Oooo000.search_go_btn);
        this.f3014OooOo = imageView2;
        ImageView imageView3 = (ImageView) findViewById(p012OooOo0O.Oooo000.search_close_btn);
        this.f3020OooOoO0 = imageView3;
        ImageView imageView4 = (ImageView) findViewById(p012OooOo0O.Oooo000.search_voice_btn);
        this.f3019OooOoO = imageView4;
        ImageView imageView5 = (ImageView) findViewById(p012OooOo0O.Oooo000.search_mag_icon);
        this.f3029Oooo00O = imageView5;
        ViewCompat.OooO0o.OooOOo0(viewFindViewById, o000oo1.OooO0o0(p012OooOo0O.o00O0O.SearchView_queryBackground));
        ViewCompat.OooO0o.OooOOo0(viewFindViewById2, o000oo1.OooO0o0(p012OooOo0O.o00O0O.SearchView_submitBackground));
        int i2 = p012OooOo0O.o00O0O.SearchView_searchIcon;
        imageView.setImageDrawable(o000oo1.OooO0o0(i2));
        imageView2.setImageDrawable(o000oo1.OooO0o0(p012OooOo0O.o00O0O.SearchView_goIcon));
        imageView3.setImageDrawable(o000oo1.OooO0o0(p012OooOo0O.o00O0O.SearchView_closeIcon));
        imageView4.setImageDrawable(o000oo1.OooO0o0(p012OooOo0O.o00O0O.SearchView_voiceIcon));
        imageView5.setImageDrawable(o000oo1.OooO0o0(i2));
        this.f3030Oooo00o = o000oo1.OooO0o0(p012OooOo0O.o00O0O.SearchView_searchHintIcon);
        o000O0O0.OooO00o(imageView, getResources().getString(p012OooOo0O.o000oOoO.abc_searchview_description_search));
        this.f3027Oooo0 = o000oo1.OooO(p012OooOo0O.o00O0O.SearchView_suggestionRowLayout, p012OooOo0O.Oooo0.abc_search_dropdown_item_icons_2line);
        this.f3031Oooo0O0 = o000oo1.OooO(p012OooOo0O.o00O0O.SearchView_commitIcon, 0);
        imageView.setOnClickListener(oooOO1);
        imageView3.setOnClickListener(oooOO1);
        imageView2.setOnClickListener(oooOO1);
        imageView4.setOnClickListener(oooOO1);
        searchAutoComplete.setOnClickListener(oooOO1);
        searchAutoComplete.addTextChangedListener(oooO00o);
        searchAutoComplete.setOnEditorActionListener(oooOOO0);
        searchAutoComplete.setOnItemClickListener(oooOOO);
        searchAutoComplete.setOnItemSelectedListener(oooOOOO);
        searchAutoComplete.setOnKeyListener(oooOO0O);
        searchAutoComplete.setOnFocusChangeListener(new OooO0o());
        setIconifiedByDefault(o000oo1.OooO00o(p012OooOo0O.o00O0O.SearchView_iconifiedByDefault, true));
        int iOooO0Oo = o000oo1.OooO0Oo(p012OooOo0O.o00O0O.SearchView_android_maxWidth, -1);
        if (iOooO0Oo != -1) {
            setMaxWidth(iOooO0Oo);
        }
        this.f3033Oooo0o = o000oo1.OooOO0O(p012OooOo0O.o00O0O.SearchView_defaultQueryHint);
        this.f3037OoooO = o000oo1.OooOO0O(p012OooOo0O.o00O0O.SearchView_queryHint);
        int iOooO0oo = o000oo1.OooO0oo(p012OooOo0O.o00O0O.SearchView_android_imeOptions, -1);
        if (iOooO0oo != -1) {
            setImeOptions(iOooO0oo);
        }
        int iOooO0oo2 = o000oo1.OooO0oo(p012OooOo0O.o00O0O.SearchView_android_inputType, -1);
        if (iOooO0oo2 != -1) {
            setInputType(iOooO0oo2);
        }
        setFocusable(o000oo1.OooO00o(p012OooOo0O.o00O0O.SearchView_android_focusable, true));
        o000oo1.OooOOO();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f3032Oooo0OO = intent;
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f3034Oooo0o0 = intent2;
        intent2.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f3021OooOoOO = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new OooO());
        }
        OooOoO0(this.f3026Oooo);
        OooOo0O();
    }
}
