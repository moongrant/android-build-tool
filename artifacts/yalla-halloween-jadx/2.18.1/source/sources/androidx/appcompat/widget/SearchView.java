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
import java.util.Objects;
import java.util.WeakHashMap;
import net.sqlcipher.database.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements p016OooOoO0.OooOO0O {

    /* JADX INFO: renamed from: o0000OOO, reason: collision with root package name */
    public static final o000oOoO f5129o0000OOO;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public final SearchAutoComplete f5130Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public final View f5131Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final View f5132OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final View f5133OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public final ImageView f5134OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public final ImageView f5135Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public final ImageView f5136Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public final ImageView f5137OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public final View f5138Ooooooo;

    /* JADX INFO: renamed from: o0000, reason: collision with root package name */
    public Bundle f5139o0000;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    public boolean f5140o00000;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public o000O.OooO00o f5141o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public boolean f5142o000000O;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public CharSequence f5143o000000o;

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    public int f5144o00000O;

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    public boolean f5145o00000O0;

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public boolean f5146o00000OO;

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    public String f5147o00000Oo;

    /* JADX INFO: renamed from: o00000o0, reason: collision with root package name */
    public CharSequence f5148o00000o0;

    /* JADX INFO: renamed from: o00000oO, reason: collision with root package name */
    public int f5149o00000oO;

    /* JADX INFO: renamed from: o00000oo, reason: collision with root package name */
    public SearchableInfo f5150o00000oo;

    /* JADX INFO: renamed from: o0000O, reason: collision with root package name */
    public final OooOOO f5151o0000O;

    /* JADX INFO: renamed from: o0000O0, reason: collision with root package name */
    public final OooOO0 f5152o0000O0;

    /* JADX INFO: renamed from: o0000O00, reason: collision with root package name */
    public final OooO0O0 f5153o0000O00;

    /* JADX INFO: renamed from: o0000O0O, reason: collision with root package name */
    public OooOO0O f5154o0000O0O;

    /* JADX INFO: renamed from: o0000OO, reason: collision with root package name */
    public OooO00o f5155o0000OO;

    /* JADX INFO: renamed from: o0000OO0, reason: collision with root package name */
    public final OooOOOO f5156o0000OO0;

    /* JADX INFO: renamed from: o0000Ooo, reason: collision with root package name */
    public boolean f5157o0000Ooo;

    /* JADX INFO: renamed from: o0000oO, reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f5158o0000oO;

    /* JADX INFO: renamed from: o0000oo, reason: collision with root package name */
    public OooO0OO f5159o0000oo;

    /* JADX INFO: renamed from: o000OO, reason: collision with root package name */
    public final OooOOO0 f5160o000OO;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public boolean f5161o000OOo;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public Rect f5162o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public int[] f5163o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public int[] f5164o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public final ImageView f5165o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public final Intent f5166o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public final int f5167o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public final Drawable f5168o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public boolean f5169o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public Oooo0 f5170o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public OooOo f5171o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public View.OnFocusChangeListener f5172o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public o0OoOo0 f5173o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public final Intent f5174o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public final CharSequence f5175o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public Oooo000 f5176o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public final int f5177oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public View.OnClickListener f5178oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public Rect f5179ooOO;

    public class OooO implements View.OnLayoutChangeListener {
        public OooO() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int dimensionPixelSize;
            SearchView searchView = SearchView.this;
            if (searchView.f5138Ooooooo.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.f5132OooooO0.getPaddingLeft();
                Rect rect = new Rect();
                boolean zOooO0O0 = o000O00O.OooO0O0(searchView);
                if (searchView.f5169o0O0O00) {
                    dimensionPixelSize = resources.getDimensionPixelSize(OooOo00.OooO0o.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(OooOo00.OooO0o.abc_dropdownitem_icon_width);
                } else {
                    dimensionPixelSize = 0;
                }
                searchView.f5130Ooooo00.getDropDownBackground().getPadding(rect);
                searchView.f5130Ooooo00.setDropDownHorizontalOffset(zOooO0O0 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                searchView.f5130Ooooo00.setDropDownWidth((((searchView.f5138Ooooooo.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
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
            Editable text = searchView.f5130Ooooo00.getText();
            searchView.f5148o00000o0 = text;
            boolean z = !TextUtils.isEmpty(text);
            searchView.OooOoO0(z);
            searchView.OooOoOO(!z);
            searchView.OooOo0();
            searchView.OooOo();
            if (searchView.f5176o0ooOoO != null && !TextUtils.equals(charSequence, searchView.f5147o00000Oo)) {
                Oooo000 oooo000 = searchView.f5176o0ooOoO;
                charSequence.toString();
                oooo000.OooO00o();
            }
            searchView.f5147o00000Oo = charSequence.toString();
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SearchView.this.OooOo0O();
        }
    }

    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o000O.OooO00o oooO00o = SearchView.this.f5141o000000;
            if (oooO00o instanceof o00000O) {
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
            View.OnFocusChangeListener onFocusChangeListener = searchView.f5172o0Oo0oo;
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
            if (view == searchView.f5134OooooOo) {
                searchView.OooOOoo();
                return;
            }
            if (view == searchView.f5135Oooooo) {
                searchView.OooOOOO();
                return;
            }
            if (view == searchView.f5136Oooooo0) {
                searchView.OooOo00();
                return;
            }
            if (view != searchView.f5137OoooooO) {
                if (view == searchView.f5130Ooooo00) {
                    searchView.OooOOO();
                    return;
                }
                return;
            }
            SearchableInfo searchableInfo = searchView.f5150o00000oo;
            if (searchableInfo == null) {
                return;
            }
            try {
                if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        searchView.getContext().startActivity(searchView.OooOOO0(searchView.f5174o0ooOO0, searchableInfo));
                    }
                } else {
                    Intent intent = new Intent(searchView.f5166o00oO0O);
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
            if (searchView.f5150o00000oo == null) {
                return false;
            }
            if (!searchView.f5130Ooooo00.isPopupShowing() || SearchView.this.f5130Ooooo00.getListSelection() == -1) {
                if ((TextUtils.getTrimmedLength(SearchView.this.f5130Ooooo00.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                    return false;
                }
                view.cancelLongPress();
                SearchView searchView2 = SearchView.this;
                searchView2.getContext().startActivity(searchView2.OooOO0o("android.intent.action.SEARCH", null, null, searchView2.f5130Ooooo00.getText().toString()));
                return true;
            }
            SearchView searchView3 = SearchView.this;
            if (searchView3.f5150o00000oo == null || searchView3.f5141o000000 == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                return false;
            }
            if (i == 66 || i == 84 || i == 61) {
                return searchView3.OooOOOo(searchView3.f5130Ooooo00.getListSelection());
            }
            if (i != 21 && i != 22) {
                if (i != 19) {
                    return false;
                }
                searchView3.f5130Ooooo00.getListSelection();
                return false;
            }
            searchView3.f5130Ooooo00.setSelection(i == 21 ? 0 : searchView3.f5130Ooooo00.length());
            searchView3.f5130Ooooo00.setListSelection(0);
            searchView3.f5130Ooooo00.clearListSelection();
            searchView3.f5130Ooooo00.OooO00o();
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
            SearchView.this.OooOo00();
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
        boolean onClose();
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
        boolean OooO00o();

        boolean OooO0O0();
    }

    public interface Oooo000 {
        boolean OooO00o();

        boolean OooO0O0();
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public boolean f5190Oooo0oo;

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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("SearchView.SavedState{");
            sbOooO0o0.append(Integer.toHexString(System.identityHashCode(this)));
            sbOooO0o0.append(" isIconified=");
            sbOooO0o0.append(this.f5190Oooo0oo);
            sbOooO0o0.append("}");
            return sbOooO0o0.toString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f8027Oooo0o, i);
            parcel.writeValue(Boolean.valueOf(this.f5190Oooo0oo));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5190Oooo0oo = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final OooO00o f5191OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public SearchView f5192OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f5193OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public boolean f5194OoooO0O;

        public class OooO00o implements Runnable {
            public OooO00o() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f5194OoooO0O) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f5194OoooO0O = false;
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
                return 256;
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
            o000oOoO o000oooo2 = SearchView.f5129o0000OOO;
            Objects.requireNonNull(o000oooo2);
            o000oOoO.OooO00o();
            Method method = o000oooo2.f5198OooO0OO;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f5193OoooO00 <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f5194OoooO0O) {
                removeCallbacks(this.f5191OoooO);
                post(this.f5191OoooO);
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
            SearchView searchView = this.f5192OoooO0;
            searchView.OooOoO(searchView.f5161o000OOo);
            searchView.post(searchView.f5153o0000O00);
            if (searchView.f5130Ooooo00.hasFocus()) {
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
                        this.f5192OoooO0.clearFocus();
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
            if (z && this.f5192OoooO0.hasFocus() && getVisibility() == 0) {
                this.f5194OoooO0O = true;
                Context context = getContext();
                o000oOoO o000oooo2 = SearchView.f5129o0000OOO;
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
            if (!z) {
                this.f5194OoooO0O = false;
                removeCallbacks(this.f5191OoooO);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f5194OoooO0O = true;
                    return;
                }
                this.f5194OoooO0O = false;
                removeCallbacks(this.f5191OoooO);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f5192OoooO0 = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f5193OoooO00 = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, OooOo00.OooO00o.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f5191OoooO = new OooO00o();
            this.f5193OoooO00 = getThreshold();
        }
    }

    public static class o000oOoO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Method f5196OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Method f5197OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Method f5198OooO0OO;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public o000oOoO() {
            this.f5196OooO00o = null;
            this.f5197OooO0O0 = null;
            this.f5198OooO0OO = null;
            OooO00o();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f5196OooO00o = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f5197OooO0O0 = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f5198OooO0OO = method;
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
        public final View f5199OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Rect f5200OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Rect f5201OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Rect f5202OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f5203OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f5204OooO0o0;

        public o0OoOo0(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f5204OooO0o0 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f5200OooO0O0 = new Rect();
            this.f5202OooO0Oo = new Rect();
            this.f5201OooO0OO = new Rect();
            OooO00o(rect, rect2);
            this.f5199OooO00o = view;
        }

        public final void OooO00o(Rect rect, Rect rect2) {
            this.f5200OooO0O0.set(rect);
            this.f5202OooO0Oo.set(rect);
            Rect rect3 = this.f5202OooO0Oo;
            int i = this.f5204OooO0o0;
            rect3.inset(-i, -i);
            this.f5201OooO0OO.set(rect2);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x003d  */
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
                    z2 = this.f5203OooO0o;
                    if (z2 && !this.f5202OooO0Oo.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else if (action != 3) {
                    z = true;
                    z3 = false;
                } else {
                    z2 = this.f5203OooO0o;
                    this.f5203OooO0o = false;
                }
                z3 = z2;
                z = true;
            } else if (this.f5200OooO0O0.contains(x, y)) {
                this.f5203OooO0o = true;
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            if (!z || this.f5201OooO0OO.contains(x, y)) {
                Rect rect = this.f5201OooO0OO;
                motionEvent.setLocation(x - rect.left, y - rect.top);
            } else {
                motionEvent.setLocation(this.f5199OooO00o.getWidth() / 2, this.f5199OooO00o.getHeight() / 2);
            }
            return this.f5199OooO00o.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f5129o0000OOO = Build.VERSION.SDK_INT < 29 ? new o000oOoO() : null;
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(OooOo00.OooO0o.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(OooOo00.OooO0o.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.f5130Ooooo00.setText(charSequence);
        this.f5130Ooooo00.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // p016OooOoO0.OooOO0O
    public final void OooO0OO() {
        if (this.f5157o0000Ooo) {
            return;
        }
        this.f5157o0000Ooo = true;
        int imeOptions = this.f5130Ooooo00.getImeOptions();
        this.f5149o00000oO = imeOptions;
        this.f5130Ooooo00.setImeOptions(imeOptions | 33554432);
        this.f5130Ooooo00.setText("");
        setIconified(false);
    }

    @Override // p016OooOoO0.OooOO0O
    public final void OooO0o0() {
        this.f5130Ooooo00.setText("");
        SearchAutoComplete searchAutoComplete = this.f5130Ooooo00;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f5148o00000o0 = "";
        clearFocus();
        OooOoO(true);
        this.f5130Ooooo00.setImeOptions(this.f5149o00000oO);
        this.f5157o0000Ooo = false;
    }

    public final Intent OooOO0o(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f5148o00000o0);
        if (str3 != null) {
            intent.putExtra(SearchIntents.EXTRA_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f5139o0000;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f5150o00000oo.getSearchActivity());
        return intent;
    }

    public final void OooOOO() {
        if (Build.VERSION.SDK_INT >= 29) {
            OooOo00.OooO00o(this.f5130Ooooo00);
            return;
        }
        o000oOoO o000oooo2 = f5129o0000OOO;
        SearchAutoComplete searchAutoComplete = this.f5130Ooooo00;
        Objects.requireNonNull(o000oooo2);
        o000oOoO.OooO00o();
        Method method = o000oooo2.f5196OooO00o;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        o000oOoO o000oooo3 = f5129o0000OOO;
        SearchAutoComplete searchAutoComplete2 = this.f5130Ooooo00;
        Objects.requireNonNull(o000oooo3);
        o000oOoO.OooO00o();
        Method method2 = o000oooo3.f5197OooO0O0;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
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
        Bundle bundle2 = this.f5139o0000;
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
        if (!TextUtils.isEmpty(this.f5130Ooooo00.getText())) {
            this.f5130Ooooo00.setText("");
            this.f5130Ooooo00.requestFocus();
            this.f5130Ooooo00.setImeVisibility(true);
        } else if (this.f5169o0O0O00) {
            OooOo oooOo = this.f5171o0OOO0o;
            if (oooOo == null || !oooOo.onClose()) {
                clearFocus();
                OooOoO(true);
            }
        }
    }

    public final boolean OooOOOo(int i) {
        int position;
        String strOooO;
        Oooo0 oooo0 = this.f5170o0OO00O;
        if (oooo0 != null && oooo0.OooO00o()) {
            return false;
        }
        Cursor cursor = this.f5141o000000.f28030Oooo0oo;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intentOooOO0o = null;
            try {
                int i2 = o00000O.f5321o0OoOo0;
                String strOooO2 = o00000O.OooO(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strOooO2 == null) {
                    strOooO2 = this.f5150o00000oo.getSuggestIntentAction();
                }
                if (strOooO2 == null) {
                    strOooO2 = "android.intent.action.SEARCH";
                }
                String strOooO3 = o00000O.OooO(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strOooO3 == null) {
                    strOooO3 = this.f5150o00000oo.getSuggestIntentData();
                }
                if (strOooO3 != null && (strOooO = o00000O.OooO(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strOooO3 = strOooO3 + "/" + Uri.encode(strOooO);
                }
                intentOooOO0o = OooOO0o(strOooO2, strOooO3 == null ? null : Uri.parse(strOooO3), o00000O.OooO(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), o00000O.OooO(cursor, cursor.getColumnIndex("suggest_intent_query")));
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
        this.f5130Ooooo00.setImeVisibility(false);
        this.f5130Ooooo00.dismissDropDown();
        return true;
    }

    public final void OooOOo(@Nullable CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final boolean OooOOo0(int i) {
        Oooo0 oooo0 = this.f5170o0OO00O;
        if (oooo0 != null && oooo0.OooO0O0()) {
            return false;
        }
        Editable text = this.f5130Ooooo00.getText();
        Cursor cursor = this.f5141o000000.f28030Oooo0oo;
        if (cursor == null) {
            return true;
        }
        if (!cursor.moveToPosition(i)) {
            setQuery(text);
            return true;
        }
        CharSequence charSequenceOooO0Oo = this.f5141o000000.OooO0Oo(cursor);
        if (charSequenceOooO0Oo != null) {
            setQuery(charSequenceOooO0Oo);
            return true;
        }
        setQuery(text);
        return true;
    }

    public final void OooOOoo() {
        OooOoO(false);
        this.f5130Ooooo00.requestFocus();
        this.f5130Ooooo00.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f5178oo0o0Oo;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public final void OooOo() {
        int i = 0;
        if (!((this.f5142o000000O || this.f5146o00000OO) && !this.f5161o000OOo) || (this.f5136Oooooo0.getVisibility() != 0 && this.f5137OoooooO.getVisibility() != 0)) {
            i = 8;
        }
        this.f5133OooooOO.setVisibility(i);
    }

    public final void OooOo0() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f5130Ooooo00.getText());
        if (!z2 && (!this.f5169o0O0O00 || this.f5157o0000Ooo)) {
            z = false;
        }
        this.f5135Oooooo.setVisibility(z ? 0 : 8);
        Drawable drawable = this.f5135Oooooo.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void OooOo00() {
        Editable text = this.f5130Ooooo00.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        Oooo000 oooo000 = this.f5176o0ooOoO;
        if (oooo000 != null) {
            text.toString();
            if (oooo000.OooO0O0()) {
                return;
            }
        }
        if (this.f5150o00000oo != null) {
            getContext().startActivity(OooOO0o("android.intent.action.SEARCH", null, null, text.toString()));
        }
        this.f5130Ooooo00.setImeVisibility(false);
        this.f5130Ooooo00.dismissDropDown();
    }

    public final void OooOo0O() {
        int[] iArr = this.f5130Ooooo00.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f5132OooooO0.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f5133OooooOO.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
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
    public final void OooOo0o() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f5130Ooooo00;
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        CharSequence charSequence2 = charSequence;
        if (this.f5169o0O0O00 && this.f5168o00ooo != null) {
            charSequence2 = charSequence;
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            this.f5168o00ooo.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.f5168o00ooo), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            charSequence2 = spannableStringBuilder;
        }
        charSequence2 = charSequence;
        searchAutoComplete.setHint(charSequence2);
    }

    public final void OooOoO(boolean z) {
        this.f5161o000OOo = z;
        int i = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f5130Ooooo00.getText());
        this.f5134OooooOo.setVisibility(i);
        OooOoO0(z2);
        this.f5131Ooooo0o.setVisibility(z ? 8 : 0);
        this.f5165o00o0O.setVisibility((this.f5165o00o0O.getDrawable() == null || this.f5169o0O0O00) ? 8 : 0);
        OooOo0();
        OooOoOO(!z2);
        OooOo();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0021  */
    public final void OooOoO0(boolean z) {
        boolean z2 = this.f5142o000000O;
        int i = 0;
        if (z2) {
            if (!((z2 || this.f5146o00000OO) && !this.f5161o000OOo) || !hasFocus() || (!z && this.f5146o00000OO)) {
                i = 8;
            }
        } else {
            i = 8;
        }
        this.f5136Oooooo0.setVisibility(i);
    }

    public final void OooOoOO(boolean z) {
        int i = 8;
        if (this.f5146o00000OO && !this.f5161o000OOo && z) {
            this.f5136Oooooo0.setVisibility(8);
            i = 0;
        }
        this.f5137OoooooO.setVisibility(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f5145o00000O0 = true;
        super.clearFocus();
        this.f5130Ooooo00.clearFocus();
        this.f5130Ooooo00.setImeVisibility(false);
        this.f5145o00000O0 = false;
    }

    public int getImeOptions() {
        return this.f5130Ooooo00.getImeOptions();
    }

    public int getInputType() {
        return this.f5130Ooooo00.getInputType();
    }

    public int getMaxWidth() {
        return this.f5144o00000O;
    }

    public CharSequence getQuery() {
        return this.f5130Ooooo00.getText();
    }

    @Nullable
    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f5143o000000o;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f5150o00000oo;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f5175o0ooOOo : getContext().getText(this.f5150o00000oo.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f5167o00oO0o;
    }

    public int getSuggestionRowLayout() {
        return this.f5177oo000o;
    }

    public o000O.OooO00o getSuggestionsAdapter() {
        return this.f5141o000000;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f5153o0000O00);
        post(this.f5159o0000oo);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.f5130Ooooo00;
            Rect rect = this.f5179ooOO;
            searchAutoComplete.getLocationInWindow(this.f5163o00Oo0);
            getLocationInWindow(this.f5164o00Ooo);
            int[] iArr = this.f5163o00Oo0;
            int i5 = iArr[1];
            int[] iArr2 = this.f5164o00Ooo;
            int i6 = i5 - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            rect.set(i7, i6, searchAutoComplete.getWidth() + i7, searchAutoComplete.getHeight() + i6);
            Rect rect2 = this.f5162o00O0O;
            Rect rect3 = this.f5179ooOO;
            rect2.set(rect3.left, 0, rect3.right, i4 - i2);
            o0OoOo0 o0oooo1 = this.f5173o0OoOo0;
            if (o0oooo1 != null) {
                o0oooo1.OooO00o(this.f5162o00O0O, this.f5179ooOO);
                return;
            }
            o0OoOo0 o0oooo2 = new o0OoOo0(this.f5162o00O0O, this.f5179ooOO, this.f5130Ooooo00);
            this.f5173o0OoOo0 = o0oooo2;
            setTouchDelegate(o0oooo2);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f5161o000OOo) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.f5144o00000O;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f5144o00000O;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.f5144o00000O) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f8027Oooo0o);
        OooOoO(savedState.f5190Oooo0oo);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5190Oooo0oo = this.f5161o000OOo;
        return savedState;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f5153o0000O00);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.f5145o00000O0 || !isFocusable()) {
            return false;
        }
        if (this.f5161o000OOo) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.f5130Ooooo00.requestFocus(i, rect);
        if (zRequestFocus) {
            OooOoO(false);
        }
        return zRequestFocus;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAppSearchData(Bundle bundle) {
        this.f5139o0000 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            OooOOOO();
        } else {
            OooOOoo();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f5169o0O0O00 == z) {
            return;
        }
        this.f5169o0O0O00 = z;
        OooOoO(z);
        OooOo0o();
    }

    public void setImeOptions(int i) {
        this.f5130Ooooo00.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f5130Ooooo00.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f5144o00000O = i;
        requestLayout();
    }

    public void setOnCloseListener(OooOo oooOo) {
        this.f5171o0OOO0o = oooOo;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f5172o0Oo0oo = onFocusChangeListener;
    }

    public void setOnQueryTextListener(Oooo000 oooo000) {
        this.f5176o0ooOoO = oooo000;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f5178oo0o0Oo = onClickListener;
    }

    public void setOnSuggestionListener(Oooo0 oooo0) {
        this.f5170o0OO00O = oooo0;
    }

    public void setQueryHint(@Nullable CharSequence charSequence) {
        this.f5143o000000o = charSequence;
        OooOo0o();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f5140o00000 = z;
        o000O.OooO00o oooO00o = this.f5141o000000;
        if (oooO00o instanceof o00000O) {
            ((o00000O) oooO00o).f5327Ooooo0o = z ? 2 : 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        boolean z;
        this.f5150o00000oo = searchableInfo;
        Intent intent = null;
        if (searchableInfo != null) {
            this.f5130Ooooo00.setThreshold(searchableInfo.getSuggestThreshold());
            this.f5130Ooooo00.setImeOptions(this.f5150o00000oo.getImeOptions());
            int inputType = this.f5150o00000oo.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f5150o00000oo.getSuggestAuthority() != null) {
                    inputType = inputType | 65536 | 524288;
                }
            }
            this.f5130Ooooo00.setInputType(inputType);
            o000O.OooO00o oooO00o = this.f5141o000000;
            if (oooO00o != null) {
                oooO00o.OooO0OO(null);
            }
            if (this.f5150o00000oo.getSuggestAuthority() != null) {
                o00000O o00000o = new o00000O(getContext(), this, this.f5150o00000oo, this.f5158o0000oO);
                this.f5141o000000 = o00000o;
                this.f5130Ooooo00.setAdapter(o00000o);
                ((o00000O) this.f5141o000000).f5327Ooooo0o = this.f5140o00000 ? 2 : 1;
            }
            OooOo0o();
        }
        SearchableInfo searchableInfo2 = this.f5150o00000oo;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f5150o00000oo.getVoiceSearchLaunchWebSearch()) {
                intent = this.f5166o00oO0O;
            } else if (this.f5150o00000oo.getVoiceSearchLaunchRecognizer()) {
                intent = this.f5174o0ooOO0;
            }
            z = (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
        }
        this.f5146o00000OO = z;
        if (z) {
            this.f5130Ooooo00.setPrivateImeOptions("nm");
        }
        OooOoO(this.f5161o000OOo);
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f5142o000000O = z;
        OooOoO(this.f5161o000OOo);
    }

    public void setSuggestionsAdapter(o000O.OooO00o oooO00o) {
        this.f5141o000000 = oooO00o;
        this.f5130Ooooo00.setAdapter(oooO00o);
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, OooOo00.OooO00o.searchViewStyle);
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5179ooOO = new Rect();
        this.f5162o00O0O = new Rect();
        this.f5163o00Oo0 = new int[2];
        this.f5164o00Ooo = new int[2];
        this.f5153o0000O00 = new OooO0O0();
        this.f5159o0000oo = new OooO0OO();
        this.f5158o0000oO = new WeakHashMap<>();
        OooOO0 oooOO1 = new OooOO0();
        this.f5152o0000O0 = oooOO1;
        this.f5154o0000O0O = new OooOO0O();
        OooOOO0 oooOOO0 = new OooOOO0();
        this.f5160o000OO = oooOOO0;
        OooOOO oooOOO = new OooOOO();
        this.f5151o0000O = oooOOO;
        OooOOOO oooOOOO = new OooOOOO();
        this.f5156o0000OO0 = oooOOOO;
        this.f5155o0000OO = new OooO00o();
        int[] iArr = OooOo00.OooOOOO.SearchView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        o0000O0 o0000o1 = new o0000O0(context, typedArrayObtainStyledAttributes);
        ViewCompat.OooOo0O(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        LayoutInflater.from(context).inflate(o0000o1.OooOOO0(OooOo00.OooOOOO.SearchView_layout, OooOo00.OooOO0O.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(OooOo00.OooOO0.search_src_text);
        this.f5130Ooooo00 = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f5131Ooooo0o = findViewById(OooOo00.OooOO0.search_edit_frame);
        View viewFindViewById = findViewById(OooOo00.OooOO0.search_plate);
        this.f5132OooooO0 = viewFindViewById;
        View viewFindViewById2 = findViewById(OooOo00.OooOO0.submit_area);
        this.f5133OooooOO = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(OooOo00.OooOO0.search_button);
        this.f5134OooooOo = imageView;
        ImageView imageView2 = (ImageView) findViewById(OooOo00.OooOO0.search_go_btn);
        this.f5136Oooooo0 = imageView2;
        ImageView imageView3 = (ImageView) findViewById(OooOo00.OooOO0.search_close_btn);
        this.f5135Oooooo = imageView3;
        ImageView imageView4 = (ImageView) findViewById(OooOo00.OooOO0.search_voice_btn);
        this.f5137OoooooO = imageView4;
        ImageView imageView5 = (ImageView) findViewById(OooOo00.OooOO0.search_mag_icon);
        this.f5165o00o0O = imageView5;
        ViewCompat.OooO0o.OooOOo0(viewFindViewById, o0000o1.OooO0oO(OooOo00.OooOOOO.SearchView_queryBackground));
        ViewCompat.OooO0o.OooOOo0(viewFindViewById2, o0000o1.OooO0oO(OooOo00.OooOOOO.SearchView_submitBackground));
        int i2 = OooOo00.OooOOOO.SearchView_searchIcon;
        imageView.setImageDrawable(o0000o1.OooO0oO(i2));
        imageView2.setImageDrawable(o0000o1.OooO0oO(OooOo00.OooOOOO.SearchView_goIcon));
        imageView3.setImageDrawable(o0000o1.OooO0oO(OooOo00.OooOOOO.SearchView_closeIcon));
        imageView4.setImageDrawable(o0000o1.OooO0oO(OooOo00.OooOOOO.SearchView_voiceIcon));
        imageView5.setImageDrawable(o0000o1.OooO0oO(i2));
        this.f5168o00ooo = o0000o1.OooO0oO(OooOo00.OooOOOO.SearchView_searchHintIcon);
        o0000OO0.OooO00o(imageView, getResources().getString(OooOo00.OooOOO0.abc_searchview_description_search));
        this.f5177oo000o = o0000o1.OooOOO0(OooOo00.OooOOOO.SearchView_suggestionRowLayout, OooOo00.OooOO0O.abc_search_dropdown_item_icons_2line);
        this.f5167o00oO0o = o0000o1.OooOOO0(OooOo00.OooOOOO.SearchView_commitIcon, 0);
        imageView.setOnClickListener(oooOO1);
        imageView3.setOnClickListener(oooOO1);
        imageView2.setOnClickListener(oooOO1);
        imageView4.setOnClickListener(oooOO1);
        searchAutoComplete.setOnClickListener(oooOO1);
        searchAutoComplete.addTextChangedListener(this.f5155o0000OO);
        searchAutoComplete.setOnEditorActionListener(oooOOO0);
        searchAutoComplete.setOnItemClickListener(oooOOO);
        searchAutoComplete.setOnItemSelectedListener(oooOOOO);
        searchAutoComplete.setOnKeyListener(this.f5154o0000O0O);
        searchAutoComplete.setOnFocusChangeListener(new OooO0o());
        setIconifiedByDefault(o0000o1.OooO00o(OooOo00.OooOOOO.SearchView_iconifiedByDefault, true));
        int iOooO0o = o0000o1.OooO0o(OooOo00.OooOOOO.SearchView_android_maxWidth, -1);
        if (iOooO0o != -1) {
            setMaxWidth(iOooO0o);
        }
        this.f5175o0ooOOo = o0000o1.OooOOOO(OooOo00.OooOOOO.SearchView_defaultQueryHint);
        this.f5143o000000o = o0000o1.OooOOOO(OooOo00.OooOOOO.SearchView_queryHint);
        int iOooOO0 = o0000o1.OooOO0(OooOo00.OooOOOO.SearchView_android_imeOptions, -1);
        if (iOooOO0 != -1) {
            setImeOptions(iOooOO0);
        }
        int iOooOO1 = o0000o1.OooOO0(OooOo00.OooOOOO.SearchView_android_inputType, -1);
        if (iOooOO1 != -1) {
            setInputType(iOooOO1);
        }
        setFocusable(o0000o1.OooO00o(OooOo00.OooOOOO.SearchView_android_focusable, true));
        o0000o1.OooOOoo();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f5166o00oO0O = intent;
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f5174o0ooOO0 = intent2;
        intent2.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f5138Ooooooo = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new OooO());
        }
        OooOoO(this.f5169o0O0O00);
        OooOo0o();
    }
}
