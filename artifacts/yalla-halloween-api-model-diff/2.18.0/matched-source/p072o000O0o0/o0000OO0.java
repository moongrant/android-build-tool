package p072o000O0o0;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.RecyclerView;
import com.yallatech.support.platform.share.bean.ShareRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o0000OO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static int f28213OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AccessibilityNodeInfo f28214OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int f28215OooO0O0 = -1;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f28216OooO0OO = -1;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final OooO00o f28217OooO;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final OooO00o f28220OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final OooO00o f28221OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static final OooO00o f28222OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final OooO00o f28223OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public static final OooO00o f28224OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public static final OooO00o f28225OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public static final OooO00o f28226OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public static final OooO00o f28227OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public static final OooO00o f28228OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public static final OooO00o f28229OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public static final OooO00o f28230OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public static final OooO00o f28231OooOOoo;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Object f28232OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f28233OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Class<? extends o000Oo0.OooO00o> f28234OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final o000Oo0 f28235OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final OooO00o f28219OooO0o0 = new OooO00o(1, (CharSequence) null);

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final OooO00o f28218OooO0o = new OooO00o(2, (CharSequence) null);

        static {
            new OooO00o(4, (CharSequence) null);
            new OooO00o(8, (CharSequence) null);
            f28220OooO0oO = new OooO00o(16, (CharSequence) null);
            new OooO00o(32, (CharSequence) null);
            f28221OooO0oo = new OooO00o(64, (CharSequence) null);
            f28217OooO = new OooO00o(128, (CharSequence) null);
            new OooO00o(256, o000Oo0.OooO0O0.class);
            new OooO00o(512, o000Oo0.OooO0O0.class);
            new OooO00o(1024, o000Oo0.OooO0OO.class);
            new OooO00o(RecyclerView.oo0o0Oo.FLAG_MOVED, o000Oo0.OooO0OO.class);
            f28222OooOO0 = new OooO00o(4096, (CharSequence) null);
            f28223OooOO0O = new OooO00o(8192, (CharSequence) null);
            new OooO00o(16384, (CharSequence) null);
            new OooO00o(ShareRequest.THUMB_DATA_SIZE_LIMIT, (CharSequence) null);
            new OooO00o(65536, (CharSequence) null);
            new OooO00o(131072, o000Oo0.OooOO0O.class);
            f28224OooOO0o = new OooO00o(262144, (CharSequence) null);
            f28226OooOOO0 = new OooO00o(524288, (CharSequence) null);
            f28225OooOOO = new OooO00o(1048576, (CharSequence) null);
            new OooO00o(2097152, o000Oo0.OooOOO0.class);
            int i = Build.VERSION.SDK_INT;
            new OooO00o(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, R.id.accessibilityActionShowOnScreen, null, null, null);
            new OooO00o(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, R.id.accessibilityActionScrollToPosition, null, null, o000Oo0.OooO.class);
            f28227OooOOOO = new OooO00o(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null, null, null);
            f28228OooOOOo = new OooO00o(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, R.id.accessibilityActionScrollLeft, null, null, null);
            f28230OooOOo0 = new OooO00o(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null, null, null);
            f28229OooOOo = new OooO00o(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, R.id.accessibilityActionScrollRight, null, null, null);
            new OooO00o(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            new OooO00o(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            new OooO00o(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            new OooO00o(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            new OooO00o(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, R.id.accessibilityActionContextClick, null, null, null);
            f28231OooOOoo = new OooO00o(i >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, o000Oo0.OooOO0.class);
            new OooO00o(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, o000Oo0.OooO0o.class);
            new OooO00o(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            new OooO00o(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            new OooO00o(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            new OooO00o(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        }

        public OooO00o(int i, CharSequence charSequence) {
            this(null, i, charSequence, null, null);
        }

        public final int OooO00o() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f28232OooO00o).getId();
        }

        public final CharSequence OooO0O0() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f28232OooO00o).getLabel();
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj == null || !(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            Object obj2 = this.f28232OooO00o;
            if (obj2 == null) {
                return oooO00o.f28232OooO00o == null;
            }
            return obj2.equals(oooO00o.f28232OooO00o);
        }

        public final int hashCode() {
            Object obj = this.f28232OooO00o;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public OooO00o(int i, Class cls) {
            this(null, i, null, null, cls);
        }

        public OooO00o(Object obj, int i, CharSequence charSequence, o000Oo0 o000oo1, Class<? extends o000Oo0.OooO00o> cls) {
            this.f28233OooO0O0 = i;
            this.f28235OooO0Oo = o000oo1;
            if (obj == null) {
                this.f28232OooO00o = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            } else {
                this.f28232OooO00o = obj;
            }
            this.f28234OooO0OO = cls;
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Object f28236OooO00o;

        public OooO0O0(Object obj) {
            this.f28236OooO00o = obj;
        }

        public static OooO0O0 OooO00o(int i, int i2, boolean z, int i3) {
            return new OooO0O0(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Object f28237OooO00o;

        public OooO0OO(Object obj) {
            this.f28237OooO00o = obj;
        }

        public static OooO0OO OooO00o(int i, int i2, int i3, int i4, boolean z) {
            return new OooO0OO(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
        }
    }

    public static class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Object f28238OooO00o;

        public OooO0o(Object obj) {
            this.f28238OooO00o = obj;
        }

        public static OooO0o OooO00o(float f, float f2, float f3) {
            return new OooO0o(AccessibilityNodeInfo.RangeInfo.obtain(1, f, f2, f3));
        }
    }

    public o0000OO0(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f28214OooO00o = accessibilityNodeInfo;
    }

    public static String OooO0o0(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case RecyclerView.oo0o0Oo.FLAG_MOVED /* 2048 */:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case ShareRequest.THUMB_DATA_SIZE_LIMIT /* 32768 */:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionImeEnter:
                return "ACTION_IME_ENTER";
            default:
                switch (i) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static ClickableSpan[] OooOO0(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public static o0000OO0 OooOo0O() {
        return new o0000OO0(AccessibilityNodeInfo.obtain());
    }

    public static o0000OO0 OooOo0o(o0000OO0 o0000oo1) {
        return new o0000OO0(AccessibilityNodeInfo.obtain(o0000oo1.f28214OooO00o));
    }

    public final CharSequence OooO() {
        return this.f28214OooO00o.getClassName();
    }

    public final void OooO00o(int i) {
        this.f28214OooO00o.addAction(i);
    }

    public final void OooO0O0(OooO00o oooO00o) {
        this.f28214OooO00o.addAction((AccessibilityNodeInfo.AccessibilityAction) oooO00o.f28232OooO00o);
    }

    public final void OooO0OO(View view) {
        this.f28214OooO00o.addChild(view);
    }

    public final List<Integer> OooO0Oo(String str) {
        ArrayList<Integer> integerArrayList = this.f28214OooO00o.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f28214OooO00o.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public final int OooO0o() {
        return this.f28214OooO00o.getActions();
    }

    @Deprecated
    public final void OooO0oO(Rect rect) {
        this.f28214OooO00o.getBoundsInParent(rect);
    }

    public final void OooO0oo(Rect rect) {
        this.f28214OooO00o.getBoundsInScreen(rect);
    }

    public final CharSequence OooOO0O() {
        return this.f28214OooO00o.getContentDescription();
    }

    public final Bundle OooOO0o() {
        return this.f28214OooO00o.getExtras();
    }

    public final CharSequence OooOOO() {
        return this.f28214OooO00o.getPackageName();
    }

    public final int OooOOO0() {
        return this.f28214OooO00o.getMovementGranularities();
    }

    @Nullable
    public final CharSequence OooOOOO() {
        return Build.VERSION.SDK_INT >= 30 ? this.f28214OooO00o.getStateDescription() : this.f28214OooO00o.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public final CharSequence OooOOOo() {
        if (!(!OooO0Oo("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty())) {
            return this.f28214OooO00o.getText();
        }
        List<Integer> listOooO0Oo = OooO0Oo("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> listOooO0Oo2 = OooO0Oo("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> listOooO0Oo3 = OooO0Oo("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> listOooO0Oo4 = OooO0Oo("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f28214OooO00o.getText(), 0, this.f28214OooO00o.getText().length()));
        for (int i = 0; i < listOooO0Oo.size(); i++) {
            spannableString.setSpan(new o0000oo(listOooO0Oo4.get(i).intValue(), this, OooOO0o().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), listOooO0Oo.get(i).intValue(), listOooO0Oo2.get(i).intValue(), listOooO0Oo3.get(i).intValue());
        }
        return spannableString;
    }

    public final boolean OooOOo() {
        return this.f28214OooO00o.isFocusable();
    }

    public final boolean OooOOo0() {
        return this.f28214OooO00o.isEnabled();
    }

    public final boolean OooOOoo() {
        return this.f28214OooO00o.isFocused();
    }

    public final void OooOo() {
        this.f28214OooO00o.recycle();
    }

    public final boolean OooOo0() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f28214OooO00o.isShowingHintText();
        }
        Bundle bundleOooOO0o = OooOO0o();
        return bundleOooOO0o != null && (bundleOooOO0o.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) == 4;
    }

    public final boolean OooOo00() {
        return this.f28214OooO00o.isSelected();
    }

    public final void OooOoO(boolean z) {
        this.f28214OooO00o.setAccessibilityFocused(z);
    }

    public final boolean OooOoO0(OooO00o oooO00o) {
        return this.f28214OooO00o.removeAction((AccessibilityNodeInfo.AccessibilityAction) oooO00o.f28232OooO00o);
    }

    public final void OooOoOO(int i, boolean z) {
        Bundle bundleOooOO0o = OooOO0o();
        if (bundleOooOO0o != null) {
            int i2 = bundleOooOO0o.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            bundleOooOO0o.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public final void OooOoo(Rect rect) {
        this.f28214OooO00o.setBoundsInScreen(rect);
    }

    @Deprecated
    public final void OooOoo0(Rect rect) {
        this.f28214OooO00o.setBoundsInParent(rect);
    }

    public final void OooOooO(boolean z) {
        this.f28214OooO00o.setCheckable(z);
    }

    public final void OooOooo(boolean z) {
        this.f28214OooO00o.setChecked(z);
    }

    public final void Oooo(@Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f28214OooO00o.setHintText(charSequence);
        } else {
            this.f28214OooO00o.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public final void Oooo0(Object obj) {
        this.f28214OooO00o.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((OooO0OO) obj).f28237OooO00o);
    }

    public final void Oooo000(CharSequence charSequence) {
        this.f28214OooO00o.setClassName(charSequence);
    }

    public final void Oooo00O(boolean z) {
        this.f28214OooO00o.setClickable(z);
    }

    public final void Oooo00o(Object obj) {
        this.f28214OooO00o.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((OooO0O0) obj).f28236OooO00o);
    }

    public final void Oooo0O0(CharSequence charSequence) {
        this.f28214OooO00o.setContentDescription(charSequence);
    }

    public final void Oooo0OO(boolean z) {
        this.f28214OooO00o.setDismissable(z);
    }

    public final void Oooo0o(boolean z) {
        this.f28214OooO00o.setFocusable(z);
    }

    public final void Oooo0o0(boolean z) {
        this.f28214OooO00o.setEnabled(z);
    }

    public final void Oooo0oO(boolean z) {
        this.f28214OooO00o.setFocused(z);
    }

    public final void Oooo0oo(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f28214OooO00o.setHeading(z);
        } else {
            OooOoOO(2, z);
        }
    }

    public final void OoooO(@Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f28214OooO00o.setPaneTitle(charSequence);
        } else {
            this.f28214OooO00o.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public final void OoooO0(int i) {
        this.f28214OooO00o.setMovementGranularities(i);
    }

    public final void OoooO00(boolean z) {
        this.f28214OooO00o.setLongClickable(z);
    }

    public final void OoooO0O(CharSequence charSequence) {
        this.f28214OooO00o.setPackageName(charSequence);
    }

    public final void OoooOO0(View view) {
        this.f28215OooO0O0 = -1;
        this.f28214OooO00o.setParent(view);
    }

    public final void OoooOOO(OooO0o oooO0o) {
        this.f28214OooO00o.setRangeInfo((AccessibilityNodeInfo.RangeInfo) oooO0o.f28238OooO00o);
    }

    public final void OoooOOo(@Nullable CharSequence charSequence) {
        this.f28214OooO00o.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public final void OoooOo0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f28214OooO00o.setScreenReaderFocusable(z);
        } else {
            OooOoOO(1, z);
        }
    }

    public final void OoooOoO(boolean z) {
        this.f28214OooO00o.setScrollable(z);
    }

    public final void OoooOoo(boolean z) {
        this.f28214OooO00o.setSelected(z);
    }

    public final void Ooooo00(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f28214OooO00o.setShowingHintText(z);
        } else {
            OooOoOO(4, z);
        }
    }

    public final void Ooooo0o(@Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f28214OooO00o.setStateDescription(charSequence);
        } else {
            this.f28214OooO00o.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public final void OooooO0(CharSequence charSequence) {
        this.f28214OooO00o.setText(charSequence);
    }

    public final void OooooOO(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f28214OooO00o.setTraversalAfter(view);
        }
    }

    public final void OooooOo(boolean z) {
        this.f28214OooO00o.setVisibleToUser(z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o0000OO0)) {
            return false;
        }
        o0000OO0 o0000oo1 = (o0000OO0) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f28214OooO00o;
        if (accessibilityNodeInfo == null) {
            if (o0000oo1.f28214OooO00o != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(o0000oo1.f28214OooO00o)) {
            return false;
        }
        return this.f28216OooO0OO == o0000oo1.f28216OooO0OO && this.f28215OooO0O0 == o0000oo1.f28215OooO0O0;
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f28214OooO00o;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final void o000oOoO(View view, int i) {
        this.f28215OooO0O0 = i;
        this.f28214OooO00o.setParent(view, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    @NonNull
    public final String toString() {
        ?? EmptyList;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        OooO0oO(rect);
        sb.append("; boundsInParent: " + rect);
        OooO0oo(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(OooOOO());
        sb.append("; className: ");
        sb.append(OooO());
        sb.append("; text: ");
        sb.append(OooOOOo());
        sb.append("; contentDescription: ");
        sb.append(OooOO0O());
        sb.append("; viewId: ");
        sb.append(this.f28214OooO00o.getViewIdResourceName());
        sb.append("; checkable: ");
        sb.append(this.f28214OooO00o.isCheckable());
        sb.append("; checked: ");
        sb.append(this.f28214OooO00o.isChecked());
        sb.append("; focusable: ");
        sb.append(OooOOo());
        sb.append("; focused: ");
        sb.append(OooOOoo());
        sb.append("; selected: ");
        sb.append(OooOo00());
        sb.append("; clickable: ");
        sb.append(this.f28214OooO00o.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.f28214OooO00o.isLongClickable());
        sb.append("; enabled: ");
        sb.append(OooOOo0());
        sb.append("; password: ");
        sb.append(this.f28214OooO00o.isPassword());
        sb.append("; scrollable: " + this.f28214OooO00o.isScrollable());
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f28214OooO00o.getActionList();
        if (actionList != null) {
            EmptyList = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                EmptyList.add(new OooO00o(actionList.get(i), 0, null, null, null));
            }
        } else {
            EmptyList = Collections.emptyList();
        }
        for (int i2 = 0; i2 < EmptyList.size(); i2++) {
            OooO00o oooO00o = (OooO00o) EmptyList.get(i2);
            String strOooO0o0 = OooO0o0(oooO00o.OooO00o());
            if (strOooO0o0.equals("ACTION_UNKNOWN") && oooO00o.OooO0O0() != null) {
                strOooO0o0 = oooO00o.OooO0O0().toString();
            }
            sb.append(strOooO0o0);
            if (i2 != EmptyList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
