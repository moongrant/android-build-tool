package o0000O;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.os.BuildCompat;
import com.yallatech.support.platform.share.bean.ShareRequest;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.io.ConstantsKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes.dex */
public final class o0Oo0oo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static int f34021OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AccessibilityNodeInfo f34022OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int f34023OooO0O0 = -1;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f34024OooO0OO = -1;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final OooO00o f34025OooO;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final OooO00o f34028OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final OooO00o f34029OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static final OooO00o f34030OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final OooO00o f34031OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public static final OooO00o f34032OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public static final OooO00o f34033OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public static final OooO00o f34034OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public static final OooO00o f34035OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public static final OooO00o f34036OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public static final OooO00o f34037OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public static final OooO00o f34038OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public static final OooO00o f34039OooOOoo;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Object f34040OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f34041OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Class<? extends o000OOo.OooO00o> f34042OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final o000OOo f34043OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final OooO00o f34027OooO0o0 = new OooO00o(1, (String) null);

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final OooO00o f34026OooO0o = new OooO00o(2, (String) null);

        static {
            new OooO00o(4, (String) null);
            new OooO00o(8, (String) null);
            f34028OooO0oO = new OooO00o(16, (String) null);
            new OooO00o(32, (String) null);
            f34029OooO0oo = new OooO00o(64, (String) null);
            f34025OooO = new OooO00o(128, (String) null);
            new OooO00o(PSKKeyManager.MAX_KEY_LENGTH_BYTES, o000OOo.OooO0O0.class);
            new OooO00o(ConstantsKt.MINIMUM_BLOCK_SIZE, o000OOo.OooO0O0.class);
            new OooO00o(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, o000OOo.OooO0OO.class);
            new OooO00o(2048, o000OOo.OooO0OO.class);
            f34030OooOO0 = new OooO00o(4096, (String) null);
            f34031OooOO0O = new OooO00o(8192, (String) null);
            new OooO00o(16384, (String) null);
            new OooO00o(ShareRequest.THUMB_DATA_SIZE_LIMIT, (String) null);
            new OooO00o(65536, (String) null);
            new OooO00o(131072, o000OOo.OooOO0O.class);
            f34032OooOO0o = new OooO00o(262144, (String) null);
            f34034OooOOO0 = new OooO00o(524288, (String) null);
            f34033OooOOO = new OooO00o(ZegoConstants.ErrorMask.RoomServerErrorMask, (String) null);
            new OooO00o(2097152, o000OOo.OooOOO0.class);
            int i = Build.VERSION.SDK_INT;
            new OooO00o(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            new OooO00o(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, o000OOo.OooO.class);
            f34035OooOOOO = new OooO00o(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f34036OooOOOo = new OooO00o(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f34038OooOOo0 = new OooO00o(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f34037OooOOo = new OooO00o(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            new OooO00o(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            new OooO00o(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            new OooO00o(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            new OooO00o(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            new OooO00o(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f34039OooOOoo = new OooO00o(i >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, o000OOo.OooOO0.class);
            new OooO00o(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, o000OOo.OooO0o.class);
            new OooO00o(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            new OooO00o(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            new OooO00o(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            new OooO00o(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            new OooO00o(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            new OooO00o(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            new OooO00o(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            new OooO00o(i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        }

        public OooO00o(int i, String str) {
            this(null, i, str, null, null);
        }

        public final int OooO00o() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f34040OooO00o).getId();
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj == null || !(obj instanceof OooO00o)) {
                return false;
            }
            Object obj2 = ((OooO00o) obj).f34040OooO00o;
            Object obj3 = this.f34040OooO00o;
            if (obj3 == null) {
                return obj2 == null;
            }
            return obj3.equals(obj2);
        }

        public final int hashCode() {
            Object obj = this.f34040OooO00o;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        @NonNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
            String strOooO0Oo = o0Oo0oo.OooO0Oo(this.f34041OooO0O0);
            if (strOooO0Oo.equals("ACTION_UNKNOWN")) {
                Object obj = this.f34040OooO00o;
                if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                    strOooO0Oo = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
                }
            }
            sb.append(strOooO0Oo);
            return sb.toString();
        }

        public OooO00o(int i, Class cls) {
            this(null, i, null, null, cls);
        }

        public OooO00o(Object obj, int i, String str, o000OOo o000ooo2, Class cls) {
            this.f34041OooO0O0 = i;
            this.f34043OooO0Oo = o000ooo2;
            if (obj == null) {
                this.f34040OooO00o = new AccessibilityNodeInfo.AccessibilityAction(i, str);
            } else {
                this.f34040OooO00o = obj;
            }
            this.f34042OooO0OO = cls;
        }
    }

    @RequiresApi(19)
    public static class OooO0O0 {
        @DoNotInline
        public static Bundle OooO00o(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtras();
        }
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Object f34044OooO00o;

        public OooO0OO(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
            this.f34044OooO00o = collectionInfo;
        }

        public static OooO0OO OooO00o(int i, int i2, int i3, boolean z) {
            return new OooO0OO(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }
    }

    public static class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Object f34045OooO00o;

        public OooO0o(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
            this.f34045OooO00o = collectionItemInfo;
        }

        public static OooO0o OooO00o(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new OooO0o(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }
    }

    public o0Oo0oo(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f34022OooO00o = accessibilityNodeInfo;
    }

    public static String OooO0Oo(int i) {
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
            case PSKKeyManager.MAX_KEY_LENGTH_BYTES /* 256 */:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case ConstantsKt.MINIMUM_BLOCK_SIZE /* 512 */:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY /* 1024 */:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
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
                                switch (i) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    @Deprecated
    public final void OooO(Rect rect) {
        this.f34022OooO00o.setBoundsInParent(rect);
    }

    public final void OooO00o(int i) {
        this.f34022OooO00o.addAction(i);
    }

    public final void OooO0O0(OooO00o oooO00o) {
        this.f34022OooO00o.addAction((AccessibilityNodeInfo.AccessibilityAction) oooO00o.f34040OooO00o);
    }

    public final ArrayList OooO0OO(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f34022OooO00o;
        ArrayList<Integer> integerArrayList = OooO0O0.OooO00o(accessibilityNodeInfo).getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        OooO0O0.OooO00o(accessibilityNodeInfo).putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public final CharSequence OooO0o() {
        boolean z = !OooO0OO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.f34022OooO00o;
        if (!z) {
            return accessibilityNodeInfo.getText();
        }
        ArrayList arrayListOooO0OO = OooO0OO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList arrayListOooO0OO2 = OooO0OO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList arrayListOooO0OO3 = OooO0OO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList arrayListOooO0OO4 = OooO0OO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i = 0; i < arrayListOooO0OO.size(); i++) {
            spannableString.setSpan(new o0000O.OooO00o(((Integer) arrayListOooO0OO4.get(i)).intValue(), this, OooO0O0.OooO00o(accessibilityNodeInfo).getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) arrayListOooO0OO.get(i)).intValue(), ((Integer) arrayListOooO0OO2.get(i)).intValue(), ((Integer) arrayListOooO0OO3.get(i)).intValue());
        }
        return spannableString;
    }

    @Deprecated
    public final void OooO0o0(Rect rect) {
        this.f34022OooO00o.getBoundsInParent(rect);
    }

    public final void OooO0oO(boolean z) {
        this.f34022OooO00o.setAccessibilityFocused(z);
    }

    public final void OooO0oo(int i, boolean z) {
        Bundle bundleOooO00o = OooO0O0.OooO00o(this.f34022OooO00o);
        if (bundleOooO00o != null) {
            int i2 = bundleOooO00o.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            bundleOooO00o.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public final void OooOO0(CharSequence charSequence) {
        this.f34022OooO00o.setClassName(charSequence);
    }

    public final void OooOO0O(OooO0OO oooO0OO) {
        this.f34022OooO00o.setCollectionInfo(oooO0OO == null ? null : (AccessibilityNodeInfo.CollectionInfo) oooO0OO.f34044OooO00o);
    }

    public final void OooOO0o(OooO0o oooO0o) {
        this.f34022OooO00o.setCollectionItemInfo(oooO0o == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) oooO0o.f34045OooO00o);
    }

    public final void OooOOO(@Nullable String str) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f34022OooO00o;
        if (i >= 26) {
            accessibilityNodeInfo.setHintText(str);
        } else {
            OooO0O0.OooO00o(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", str);
        }
    }

    public final void OooOOO0(CharSequence charSequence) {
        this.f34022OooO00o.setContentDescription(charSequence);
    }

    public final void OooOOOO(boolean z) {
        this.f34022OooO00o.setScrollable(z);
    }

    public final void OooOOOo(@Nullable CharSequence charSequence) {
        int i = BuildCompat.f5310OooO00o;
        boolean z = Build.VERSION.SDK_INT >= 30;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f34022OooO00o;
        if (z) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        } else {
            OooO0O0.OooO00o(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public final void OooOOo0(CharSequence charSequence) {
        this.f34022OooO00o.setText(charSequence);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o0Oo0oo)) {
            return false;
        }
        o0Oo0oo o0oo0oo2 = (o0Oo0oo) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = o0oo0oo2.f34022OooO00o;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.f34022OooO00o;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.f34024OooO0OO == o0oo0oo2.f34024OooO0OO && this.f34023OooO0O0 == o0oo0oo2.f34023OooO0O0;
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f34022OooO00o;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    @NonNull
    public final String toString() {
        ?? EmptyList;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        OooO0o0(rect);
        sb.append("; boundsInParent: " + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.f34022OooO00o;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(accessibilityNodeInfo.getPackageName());
        sb.append("; className: ");
        sb.append(accessibilityNodeInfo.getClassName());
        sb.append("; text: ");
        sb.append(OooO0o());
        sb.append("; contentDescription: ");
        sb.append(accessibilityNodeInfo.getContentDescription());
        sb.append("; viewId: ");
        sb.append(accessibilityNodeInfo.getViewIdResourceName());
        sb.append("; uniqueId: ");
        sb.append(BuildCompat.OooO0OO() ? accessibilityNodeInfo.getUniqueId() : OooO0O0.OooO00o(accessibilityNodeInfo).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo.isCheckable());
        sb.append("; checked: ");
        sb.append(accessibilityNodeInfo.isChecked());
        sb.append("; focusable: ");
        sb.append(accessibilityNodeInfo.isFocusable());
        sb.append("; focused: ");
        sb.append(accessibilityNodeInfo.isFocused());
        sb.append("; selected: ");
        sb.append(accessibilityNodeInfo.isSelected());
        sb.append("; clickable: ");
        sb.append(accessibilityNodeInfo.isClickable());
        sb.append("; longClickable: ");
        sb.append(accessibilityNodeInfo.isLongClickable());
        sb.append("; enabled: ");
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append("; password: ");
        sb.append(accessibilityNodeInfo.isPassword());
        sb.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
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
            String strOooO0Oo = OooO0Oo(oooO00o.OooO00o());
            if (strOooO0Oo.equals("ACTION_UNKNOWN")) {
                Object obj = oooO00o.f34040OooO00o;
                if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                    strOooO0Oo = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
                }
            }
            sb.append(strOooO0Oo);
            if (i2 != EmptyList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
