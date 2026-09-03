package o0000O;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.yallatech.support.platform.share.bean.ShareRequest;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.io.ConstantsKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0O00 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static int f33509OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AccessibilityNodeInfo f33510OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int f33511OooO0O0 = -1;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f33512OooO0OO = -1;

    @RequiresApi(34)
    public static class OooO {
        @DoNotInline
        public static void OooO(AccessibilityNodeInfo accessibilityNodeInfo, long j) {
            accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(j));
        }

        @DoNotInline
        public static void OooO00o(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        @DoNotInline
        public static CharSequence OooO0O0(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        @DoNotInline
        public static long OooO0OO(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
        }

        @DoNotInline
        public static boolean OooO0Oo(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        @DoNotInline
        public static void OooO0o(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z);
        }

        @DoNotInline
        public static boolean OooO0o0(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        @DoNotInline
        public static void OooO0oO(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.setBoundsInWindow(rect);
        }

        @DoNotInline
        public static void OooO0oo(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setContainerTitle(charSequence);
        }

        @DoNotInline
        public static void OooOO0(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z);
        }

        @DoNotInline
        public static void OooOO0O(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z);
        }
    }

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final OooO00o f33513OooO;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final OooO00o f33516OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final OooO00o f33517OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static final OooO00o f33518OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final OooO00o f33519OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public static final OooO00o f33520OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public static final OooO00o f33521OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public static final OooO00o f33522OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public static final OooO00o f33523OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public static final OooO00o f33524OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public static final OooO00o f33525OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public static final OooO00o f33526OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public static final OooO00o f33527OooOOoo;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Object f33528OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f33529OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Class<? extends o00000.OooO00o> f33530OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final o00000 f33531OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final OooO00o f33515OooO0o0 = new OooO00o(1, (String) null);

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final OooO00o f33514OooO0o = new OooO00o(2, (String) null);

        static {
            new OooO00o(4, (String) null);
            new OooO00o(8, (String) null);
            f33516OooO0oO = new OooO00o(16, (String) null);
            new OooO00o(32, (String) null);
            f33517OooO0oo = new OooO00o(64, (String) null);
            f33513OooO = new OooO00o(128, (String) null);
            new OooO00o(PSKKeyManager.MAX_KEY_LENGTH_BYTES, o00000.OooO0O0.class);
            new OooO00o(ConstantsKt.MINIMUM_BLOCK_SIZE, o00000.OooO0O0.class);
            new OooO00o(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, o00000.OooO0OO.class);
            new OooO00o(2048, o00000.OooO0OO.class);
            f33518OooOO0 = new OooO00o(4096, (String) null);
            f33519OooOO0O = new OooO00o(8192, (String) null);
            new OooO00o(16384, (String) null);
            new OooO00o(ShareRequest.THUMB_DATA_SIZE_LIMIT, (String) null);
            new OooO00o(65536, (String) null);
            new OooO00o(131072, o00000.OooOO0O.class);
            f33520OooOO0o = new OooO00o(262144, (String) null);
            f33522OooOOO0 = new OooO00o(524288, (String) null);
            f33521OooOOO = new OooO00o(ZegoConstants.ErrorMask.RoomServerErrorMask, (String) null);
            new OooO00o(2097152, o00000.OooOOO0.class);
            int i = Build.VERSION.SDK_INT;
            new OooO00o(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            new OooO00o(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, o00000.OooO.class);
            f33523OooOOOO = new OooO00o(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f33524OooOOOo = new OooO00o(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f33526OooOOo0 = new OooO00o(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f33525OooOOo = new OooO00o(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            new OooO00o(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            new OooO00o(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            new OooO00o(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            new OooO00o(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            new OooO00o(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f33527OooOOoo = new OooO00o(i >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, o00000.OooOO0.class);
            new OooO00o(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, o00000.OooO0o.class);
            new OooO00o(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            new OooO00o(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            new OooO00o(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            new OooO00o(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            new OooO00o(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            new OooO00o(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            new OooO00o(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            new OooO00o(i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            new OooO00o(i >= 34 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public OooO00o(int i, String str) {
            this(null, i, str, null, null);
        }

        public final int OooO00o() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f33528OooO00o).getId();
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj == null || !(obj instanceof OooO00o)) {
                return false;
            }
            Object obj2 = ((OooO00o) obj).f33528OooO00o;
            Object obj3 = this.f33528OooO00o;
            if (obj3 == null) {
                return obj2 == null;
            }
            return obj3.equals(obj2);
        }

        public final int hashCode() {
            Object obj = this.f33528OooO00o;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        @NonNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
            String strOooO0Oo = o0O0O00.OooO0Oo(this.f33529OooO0O0);
            if (strOooO0Oo.equals("ACTION_UNKNOWN")) {
                Object obj = this.f33528OooO00o;
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

        public OooO00o(Object obj, int i, String str, o00000 o00000Var, Class cls) {
            this.f33529OooO0O0 = i;
            this.f33531OooO0Oo = o00000Var;
            if (obj == null) {
                this.f33528OooO00o = new AccessibilityNodeInfo.AccessibilityAction(i, str);
            } else {
                this.f33528OooO00o = obj;
            }
            this.f33530OooO0OO = cls;
        }
    }

    @RequiresApi(19)
    public static class OooO0O0 {
        @DoNotInline
        public static OooOO0O OooO00o(int i, int i2, int i3, int i4, boolean z) {
            return new OooOO0O(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
        }

        @DoNotInline
        public static Object OooO0O0(int i, float f, float f2, float f3) {
            return AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3);
        }

        @DoNotInline
        public static Bundle OooO0OO(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtras();
        }
    }

    @RequiresApi(30)
    public static class OooO0OO {
        @DoNotInline
        public static Object OooO00o(int i, float f, float f2, float f3) {
            return new AccessibilityNodeInfo.RangeInfo(i, f, f2, f3);
        }

        @DoNotInline
        public static CharSequence OooO0O0(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        @DoNotInline
        public static void OooO0OO(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    @RequiresApi(33)
    public static class OooO0o {
        @DoNotInline
        public static void OooO(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setTextSelectable(z);
        }

        @DoNotInline
        public static OooOO0O OooO00o(boolean z, int i, int i2, int i3, int i4, boolean z2, String str, String str2) {
            return new OooOO0O(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z).setColumnIndex(i).setRowIndex(i2).setColumnSpan(i3).setRowSpan(i4).setSelected(z2).setRowTitle(str).setColumnTitle(str2).build());
        }

        @DoNotInline
        public static o0O0O00 OooO0O0(AccessibilityNodeInfo accessibilityNodeInfo, int i, int i2) {
            AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i, i2);
            if (child != null) {
                return new o0O0O00(child, 0);
            }
            return null;
        }

        @DoNotInline
        public static String OooO0OO(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        }

        @DoNotInline
        public static String OooO0Oo(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        }

        @DoNotInline
        public static o0O0O00 OooO0o(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
            AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent(i);
            if (parent != null) {
                return new o0O0O00(parent, 0);
            }
            return null;
        }

        @DoNotInline
        public static AccessibilityNodeInfo.ExtraRenderingInfo OooO0o0(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        @DoNotInline
        public static String OooO0oO(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        @DoNotInline
        public static boolean OooO0oo(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        @DoNotInline
        public static void OooOO0(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
            accessibilityNodeInfo.setUniqueId(str);
        }
    }

    public static class OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Object f33532OooO00o;

        public OooOO0(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
            this.f33532OooO00o = collectionInfo;
        }

        public static OooOO0 OooO00o(int i, int i2, int i3, boolean z) {
            return new OooOO0(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }
    }

    public static class OooOO0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Object f33533OooO00o;

        public OooOO0O(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
            this.f33533OooO00o = collectionItemInfo;
        }

        public static OooOO0O OooO00o(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new OooOO0O(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }
    }

    @Deprecated
    public o0O0O00(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        this.f33510OooO00o = accessibilityNodeInfo;
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
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
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

    public final void OooO(int i, boolean z) {
        Bundle bundleOooO0OO = OooO0O0.OooO0OO(this.f33510OooO00o);
        if (bundleOooO0OO != null) {
            int i2 = bundleOooO0OO.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            bundleOooO0OO.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public final void OooO00o(int i) {
        this.f33510OooO00o.addAction(i);
    }

    public final void OooO0O0(OooO00o oooO00o) {
        this.f33510OooO00o.addAction((AccessibilityNodeInfo.AccessibilityAction) oooO00o.f33528OooO00o);
    }

    public final ArrayList OooO0OO(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f33510OooO00o;
        ArrayList<Integer> integerArrayList = OooO0O0.OooO0OO(accessibilityNodeInfo).getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        OooO0O0.OooO0OO(accessibilityNodeInfo).putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    @Deprecated
    public final void OooO0o(Rect rect) {
        this.f33510OooO00o.getBoundsInParent(rect);
    }

    public final boolean OooO0o0(int i) {
        Bundle bundleOooO0OO = OooO0O0.OooO0OO(this.f33510OooO00o);
        return bundleOooO0OO != null && (bundleOooO0OO.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    public final CharSequence OooO0oO() {
        boolean z = !OooO0OO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.f33510OooO00o;
        if (!z) {
            return accessibilityNodeInfo.getText();
        }
        ArrayList arrayListOooO0OO = OooO0OO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList arrayListOooO0OO2 = OooO0OO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList arrayListOooO0OO3 = OooO0OO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList arrayListOooO0OO4 = OooO0OO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i = 0; i < arrayListOooO0OO.size(); i++) {
            spannableString.setSpan(new o0000O.OooO00o(((Integer) arrayListOooO0OO4.get(i)).intValue(), this, OooO0O0.OooO0OO(accessibilityNodeInfo).getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) arrayListOooO0OO.get(i)).intValue(), ((Integer) arrayListOooO0OO2.get(i)).intValue(), ((Integer) arrayListOooO0OO3.get(i)).intValue());
        }
        return spannableString;
    }

    public final void OooO0oo(boolean z) {
        this.f33510OooO00o.setAccessibilityFocused(z);
    }

    @Deprecated
    public final void OooOO0(Rect rect) {
        this.f33510OooO00o.setBoundsInParent(rect);
    }

    public final void OooOO0O(CharSequence charSequence) {
        this.f33510OooO00o.setClassName(charSequence);
    }

    public final void OooOO0o(OooOO0 oooOO1) {
        this.f33510OooO00o.setCollectionInfo(oooOO1 == null ? null : (AccessibilityNodeInfo.CollectionInfo) oooOO1.f33532OooO00o);
    }

    public final void OooOOO(CharSequence charSequence) {
        this.f33510OooO00o.setContentDescription(charSequence);
    }

    public final void OooOOO0(OooOO0O oooOO0O) {
        this.f33510OooO00o.setCollectionItemInfo(oooOO0O == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) oooOO0O.f33533OooO00o);
    }

    public final void OooOOOO(@Nullable String str) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f33510OooO00o;
        if (i >= 26) {
            accessibilityNodeInfo.setHintText(str);
        } else {
            OooO0O0.OooO0OO(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", str);
        }
    }

    public final void OooOOOo(boolean z) {
        this.f33510OooO00o.setScrollable(z);
    }

    public final void OooOOo0(CharSequence charSequence) {
        this.f33510OooO00o.setText(charSequence);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o0O0O00)) {
            return false;
        }
        o0O0O00 o0o0o00 = (o0O0O00) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = o0o0o00.f33510OooO00o;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.f33510OooO00o;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.f33512OooO0OO == o0o0o00.f33512OooO0OO && this.f33511OooO0O0 == o0o0o00.f33511OooO0O0;
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f33510OooO00o;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    @NonNull
    public final String toString() {
        ?? EmptyList;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        OooO0o(rect);
        sb.append("; boundsInParent: " + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.f33510OooO00o;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            OooO.OooO00o(accessibilityNodeInfo, rect);
        } else {
            Rect rect2 = (Rect) OooO0O0.OooO0OO(accessibilityNodeInfo).getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(accessibilityNodeInfo.getPackageName());
        sb.append("; className: ");
        sb.append(accessibilityNodeInfo.getClassName());
        sb.append("; text: ");
        sb.append(OooO0oO());
        sb.append("; error: ");
        sb.append(accessibilityNodeInfo.getError());
        sb.append("; maxTextLength: ");
        sb.append(accessibilityNodeInfo.getMaxTextLength());
        sb.append("; stateDescription: ");
        sb.append(i >= 30 ? OooO0OO.OooO0O0(accessibilityNodeInfo) : OooO0O0.OooO0OO(accessibilityNodeInfo).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"));
        sb.append("; contentDescription: ");
        sb.append(accessibilityNodeInfo.getContentDescription());
        sb.append("; tooltipText: ");
        sb.append(i >= 28 ? accessibilityNodeInfo.getTooltipText() : OooO0O0.OooO0OO(accessibilityNodeInfo).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY"));
        sb.append("; viewIdResName: ");
        sb.append(accessibilityNodeInfo.getViewIdResourceName());
        sb.append("; uniqueId: ");
        sb.append(i >= 33 ? OooO0o.OooO0oO(accessibilityNodeInfo) : OooO0O0.OooO0OO(accessibilityNodeInfo).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
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
        sb.append("; contextClickable: ");
        sb.append(accessibilityNodeInfo.isContextClickable());
        sb.append("; enabled: ");
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append("; password: ");
        sb.append(accessibilityNodeInfo.isPassword());
        sb.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb.append("; containerTitle: ");
        sb.append(i >= 34 ? OooO.OooO0O0(accessibilityNodeInfo) : OooO0O0.OooO0OO(accessibilityNodeInfo).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"));
        sb.append("; granularScrollingSupported: ");
        sb.append(OooO0o0(67108864));
        sb.append("; importantForAccessibility: ");
        sb.append(i >= 24 ? accessibilityNodeInfo.isImportantForAccessibility() : true);
        sb.append("; visible: ");
        sb.append(accessibilityNodeInfo.isVisibleToUser());
        sb.append("; isTextSelectable: ");
        sb.append(i >= 33 ? OooO0o.OooO0oo(accessibilityNodeInfo) : OooO0o0(8388608));
        sb.append("; accessibilityDataSensitive: ");
        sb.append(i >= 34 ? OooO.OooO0o0(accessibilityNodeInfo) : OooO0o0(64));
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        if (actionList != null) {
            EmptyList = new ArrayList();
            int size = actionList.size();
            for (int i2 = 0; i2 < size; i2++) {
                EmptyList.add(new OooO00o(actionList.get(i2), 0, null, null, null));
            }
        } else {
            EmptyList = Collections.emptyList();
        }
        for (int i3 = 0; i3 < EmptyList.size(); i3++) {
            OooO00o oooO00o = (OooO00o) EmptyList.get(i3);
            String strOooO0Oo = OooO0Oo(oooO00o.OooO00o());
            if (strOooO0Oo.equals("ACTION_UNKNOWN")) {
                Object obj = oooO00o.f33528OooO00o;
                if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                    strOooO0Oo = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
                }
            }
            sb.append(strOooO0Oo);
            if (i3 != EmptyList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public o0O0O00(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f33510OooO00o = accessibilityNodeInfo;
    }
}
