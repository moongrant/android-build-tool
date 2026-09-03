package p056o0000Oo0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import com.yallatech.support.platform.share.bean.ShareRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import o0000O.o0O0O00;
import o0000O.o0OO00O;
import o0000O.o0Oo0oo;
import org.conscrypt.PSKKeyManager;
import p188o00o0O.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0O0 extends androidx.core.view.OooO00o {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final Rect f34140OooOO0O = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final OooO00o f34141OooOO0o = new OooO00o();

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final C0396OooO0O0 f34142OooOOO0 = new C0396OooO0O0();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final View f34148OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AccessibilityManager f34149OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public OooO0OO f34150OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Rect f34144OooO00o = new Rect();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Rect f34145OooO0O0 = new Rect();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Rect f34146OooO0OO = new Rect();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int[] f34147OooO0Oo = new int[2];

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f34151OooO0oo = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f34143OooO = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f34152OooOO0 = Integer.MIN_VALUE;

    public class OooO00o implements o0000Oo0.OooO0OO.OooO00o<o0Oo0oo> {
    }

    /* JADX INFO: renamed from: o0000Oo0.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public class C0396OooO0O0 {
    }

    public class OooO0OO extends o0OO00O {
        public OooO0OO() {
        }

        @Override // o0000O.o0OO00O
        public final o0Oo0oo OooO00o(int i) {
            return new o0Oo0oo(AccessibilityNodeInfo.obtain(OooO0O0.this.OooO0oo(i).f34022OooO00o));
        }

        @Override // o0000O.o0OO00O
        public final o0Oo0oo OooO0O0(int i) {
            OooO0O0 oooO0O0 = OooO0O0.this;
            int i2 = i == 2 ? oooO0O0.f34151OooO0oo : oooO0O0.f34143OooO;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return OooO00o(i2);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x002c  */
        @Override // o0000O.o0OO00O
        public final boolean OooO0OO(int i, int i2, Bundle bundle) {
            int i3;
            OooO0O0 oooO0O0 = OooO0O0.this;
            View view = oooO0O0.f34148OooO0o;
            if (i == -1) {
                WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                return ViewCompat.OooO0o.OooOO0(view, i2, bundle);
            }
            boolean z = true;
            if (i2 == 1) {
                return oooO0O0.OooOOO0(i);
            }
            if (i2 == 2) {
                return oooO0O0.OooO00o(i);
            }
            if (i2 == 64) {
                AccessibilityManager accessibilityManager = oooO0O0.f34149OooO0o0;
                if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i3 = oooO0O0.f34151OooO0oo) != i) {
                    if (i3 != Integer.MIN_VALUE) {
                        oooO0O0.f34151OooO0oo = Integer.MIN_VALUE;
                        oooO0O0.f34148OooO0o.invalidate();
                        oooO0O0.OooOOO(i3, 65536);
                    }
                    oooO0O0.f34151OooO0oo = i;
                    view.invalidate();
                    oooO0O0.OooOOO(i, ShareRequest.THUMB_DATA_SIZE_LIMIT);
                } else {
                    z = false;
                }
            } else {
                if (i2 != 128) {
                    return oooO0O0.OooO(i, i2, bundle);
                }
                if (oooO0O0.f34151OooO0oo == i) {
                    oooO0O0.f34151OooO0oo = Integer.MIN_VALUE;
                    view.invalidate();
                    oooO0O0.OooOOO(i, 65536);
                } else {
                    z = false;
                }
            }
            return z;
        }
    }

    public OooO0O0(@NonNull View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f34148OooO0o = view;
        this.f34149OooO0o0 = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        if (ViewCompat.OooO0o.OooO0OO(view) == 0) {
            ViewCompat.OooO0o.OooOOoo(view, 1);
        }
    }

    public abstract boolean OooO(int i, int i2, @Nullable Bundle bundle);

    public final boolean OooO00o(int i) {
        if (this.f34143OooO != i) {
            return false;
        }
        this.f34143OooO = Integer.MIN_VALUE;
        OooOO0o(i, false);
        OooOOO(i, 8);
        return true;
    }

    public final AccessibilityEvent OooO0O0(int i, int i2) {
        View view = this.f34148OooO0o;
        if (i == -1) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
            return accessibilityEventObtain;
        }
        AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain(i2);
        o0Oo0oo o0oo0ooOooO0oo = OooO0oo(i);
        accessibilityEventObtain2.getText().add(o0oo0ooOooO0oo.OooO0o());
        AccessibilityNodeInfo accessibilityNodeInfo = o0oo0ooOooO0oo.f34022OooO00o;
        accessibilityEventObtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityEventObtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityEventObtain2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityEventObtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityEventObtain2.setChecked(accessibilityNodeInfo.isChecked());
        if (accessibilityEventObtain2.getText().isEmpty() && accessibilityEventObtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain2.setClassName(accessibilityNodeInfo.getClassName());
        o0O0O00.OooO00o(accessibilityEventObtain2, view, i);
        accessibilityEventObtain2.setPackageName(view.getContext().getPackageName());
        return accessibilityEventObtain2;
    }

    @NonNull
    public final o0Oo0oo OooO0OO(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        o0Oo0oo o0oo0oo2 = new o0Oo0oo(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        o0oo0oo2.OooOO0(AndroidComposeViewAccessibilityDelegateCompat.ClassName);
        Rect rect = f34140OooOO0O;
        o0oo0oo2.OooO(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        o0oo0oo2.f34023OooO0O0 = -1;
        View view = this.f34148OooO0o;
        accessibilityNodeInfoObtain.setParent(view);
        OooOO0O(i, o0oo0oo2);
        if (o0oo0oo2.OooO0o() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f34145OooO0O0;
        o0oo0oo2.OooO0o0(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(view.getContext().getPackageName());
        o0oo0oo2.f34024OooO0OO = i;
        accessibilityNodeInfoObtain.setSource(view, i);
        boolean z = false;
        if (this.f34151OooO0oo == i) {
            o0oo0oo2.OooO0oO(true);
            o0oo0oo2.OooO00o(128);
        } else {
            o0oo0oo2.OooO0oO(false);
            o0oo0oo2.OooO00o(64);
        }
        boolean z2 = this.f34143OooO == i;
        if (z2) {
            o0oo0oo2.OooO00o(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            o0oo0oo2.OooO00o(1);
        }
        accessibilityNodeInfoObtain.setFocused(z2);
        int[] iArr = this.f34147OooO0Oo;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.f34144OooO00o;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            o0oo0oo2.OooO0o0(rect3);
            if (o0oo0oo2.f34023OooO0O0 != -1) {
                o0Oo0oo o0oo0oo3 = new o0Oo0oo(AccessibilityNodeInfo.obtain());
                for (int i2 = o0oo0oo2.f34023OooO0O0; i2 != -1; i2 = o0oo0oo3.f34023OooO0O0) {
                    o0oo0oo3.f34023OooO0O0 = -1;
                    o0oo0oo3.f34022OooO00o.setParent(view, -1);
                    o0oo0oo3.OooO(rect);
                    OooOO0O(i2, o0oo0oo3);
                    o0oo0oo3.OooO0o0(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f34146OooO0OO;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                AccessibilityNodeInfo accessibilityNodeInfo = o0oo0oo2.f34022OooO00o;
                accessibilityNodeInfo.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (true) {
                        if (!(parent instanceof View)) {
                            if (parent == null) {
                                break;
                            }
                            z = true;
                            break;
                        }
                        View view2 = (View) parent;
                        if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                            break;
                        }
                        parent = view2.getParent();
                    }
                }
                if (z) {
                    accessibilityNodeInfo.setVisibleToUser(true);
                }
            }
        }
        return o0oo0oo2;
    }

    public abstract int OooO0Oo(float f, float f2);

    public final void OooO0o(int i) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f34149OooO0o0.isEnabled() || (parent = (view = this.f34148OooO0o).getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventOooO0O0 = OooO0O0(i, 2048);
        o0000O.OooO0O0.OooO0O0(accessibilityEventOooO0O0, 0);
        parent.requestSendAccessibilityEvent(view, accessibilityEventOooO0O0);
    }

    public abstract void OooO0o0(ArrayList arrayList);

    /* JADX WARN: Code duplicated, block: B:122:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:51:0x0100  */
    /* JADX WARN: Code duplicated, block: B:54:0x0109  */
    /* JADX WARN: Code duplicated, block: B:57:0x0116  */
    /* JADX WARN: Code duplicated, block: B:66:0x012b  */
    /* JADX WARN: Code duplicated, block: B:69:0x014b  */
    /* JADX WARN: Code duplicated, block: B:71:0x014e  */
    public final boolean OooO0oO(int i, @Nullable Rect rect) {
        int i2;
        int i3;
        Object obj;
        o0Oo0oo o0oo0oo2;
        int i4;
        int i5;
        Rect rect2;
        int iOooO;
        Rect rect3;
        int i6;
        o0Oo0oo o0oo0oo3;
        o0Oo0oo o0oo0oo4;
        int i7;
        int i8;
        int iOooO0Oo;
        int iOooO0o0;
        ArrayList arrayList = new ArrayList();
        OooO0o0(arrayList);
        Oooo0 oooo0 = new Oooo0();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            oooo0.OooO0oo(((Integer) arrayList.get(i9)).intValue(), OooO0OO(((Integer) arrayList.get(i9)).intValue()));
        }
        int i10 = this.f34143OooO;
        int iOooO0oO = Integer.MIN_VALUE;
        o0Oo0oo o0oo0oo5 = i10 == Integer.MIN_VALUE ? null : (o0Oo0oo) oooo0.OooO0o(i10, null);
        OooO00o oooO00o = f34141OooOO0o;
        C0396OooO0O0 c0396OooO0O0 = f34142OooOOO0;
        View view = this.f34148OooO0o;
        if (i == 1 || i == 2) {
            i2 = 0;
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            boolean z = ViewCompat.OooO.OooO0Oo(view) == 1;
            c0396OooO0O0.getClass();
            int iOooO2 = oooo0.OooO();
            ArrayList arrayList2 = new ArrayList(iOooO2);
            for (int i11 = 0; i11 < iOooO2; i11++) {
                arrayList2.add((o0Oo0oo) oooo0.OooOO0(i11));
            }
            Collections.sort(arrayList2, new o0000Oo0.OooO0OO.OooO0O0(z, oooO00o));
            if (i == 1) {
                int size = arrayList2.size();
                if (o0oo0oo5 != null) {
                    size = arrayList2.indexOf(o0oo0oo5);
                }
                i3 = -1;
                int i12 = size - 1;
                obj = i12 >= 0 ? arrayList2.get(i12) : null;
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (o0oo0oo5 == null ? -1 : arrayList2.lastIndexOf(o0oo0oo5)) + 1;
                if (iLastIndexOf < size2) {
                    obj = arrayList2.get(iLastIndexOf);
                    i3 = -1;
                } else {
                    i3 = -1;
                }
            }
            o0oo0oo2 = (o0Oo0oo) obj;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect4 = new Rect();
            int i13 = this.f34143OooO;
            if (i13 != Integer.MIN_VALUE) {
                OooO0oo(i13).OooO0o0(rect4);
            } else {
                if (rect != null) {
                    rect4.set(rect);
                } else {
                    int width = view.getWidth();
                    int height = view.getHeight();
                    if (i == 17) {
                        i5 = 0;
                        rect4.set(width, 0, width, height);
                    } else if (i == 33) {
                        i5 = 0;
                        rect4.set(0, height, width, height);
                    } else if (i == 66) {
                        rect4.set(-1, 0, -1, height);
                        i5 = 0;
                    } else {
                        if (i != 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        rect4.set(0, -1, width, -1);
                        i5 = 0;
                    }
                }
                rect2 = new Rect(rect4);
                if (i != 17) {
                    rect2.offset(rect4.width() + 1, i5);
                } else if (i != 33) {
                    rect2.offset(i5, rect4.height() + 1);
                } else if (i != 66) {
                    rect2.offset(-(rect4.width() + 1), i5);
                } else {
                    if (i == 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    rect2.offset(i5, -(rect4.height() + 1));
                }
                c0396OooO0O0.getClass();
                iOooO = oooo0.OooO();
                rect3 = new Rect();
                o0oo0oo3 = null;
                for (i6 = i5; i6 < iOooO; i6++) {
                    o0oo0oo4 = (o0Oo0oo) oooo0.OooOO0(i6);
                    if (o0oo0oo4 == o0oo0oo5) {
                        oooO00o.getClass();
                        o0oo0oo4.OooO0o0(rect3);
                        if (p056o0000Oo0.OooO0OO.OooO0OO(i, rect4, rect3)) {
                            if (p056o0000Oo0.OooO0OO.OooO0OO(i, rect4, rect2) && !p056o0000Oo0.OooO0OO.OooO00o(i, rect4, rect3, rect2)) {
                                if (!p056o0000Oo0.OooO0OO.OooO00o(i, rect4, rect2, rect3)) {
                                    int iOooO0Oo2 = p056o0000Oo0.OooO0OO.OooO0Oo(i, rect4, rect3);
                                    int iOooO0o1 = p056o0000Oo0.OooO0OO.OooO0o0(i, rect4, rect3);
                                    i8 = (iOooO0o1 * iOooO0o1) + (iOooO0Oo2 * 13 * iOooO0Oo2);
                                    iOooO0Oo = p056o0000Oo0.OooO0OO.OooO0Oo(i, rect4, rect2);
                                    iOooO0o0 = p056o0000Oo0.OooO0OO.OooO0o0(i, rect4, rect2);
                                    if (i8 < (iOooO0o0 * iOooO0o0) + (iOooO0Oo * 13 * iOooO0Oo)) {
                                    }
                                }
                                i7 = i5;
                            }
                            i7 = 1;
                        } else {
                            i7 = i5;
                        }
                        if (i7 != 0) {
                            rect2.set(rect3);
                            o0oo0oo3 = o0oo0oo4;
                        }
                    }
                }
                i2 = i5;
                o0oo0oo2 = o0oo0oo3;
                i3 = -1;
            }
            i5 = 0;
            rect2 = new Rect(rect4);
            if (i != 17) {
                rect2.offset(rect4.width() + 1, i5);
            } else if (i != 33) {
                rect2.offset(i5, rect4.height() + 1);
            } else if (i != 66) {
                rect2.offset(-(rect4.width() + 1), i5);
            } else {
                if (i == 130) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                rect2.offset(i5, -(rect4.height() + 1));
            }
            c0396OooO0O0.getClass();
            iOooO = oooo0.OooO();
            rect3 = new Rect();
            o0oo0oo3 = null;
            while (i6 < iOooO) {
                o0oo0oo4 = (o0Oo0oo) oooo0.OooOO0(i6);
                if (o0oo0oo4 == o0oo0oo5) {
                    oooO00o.getClass();
                    o0oo0oo4.OooO0o0(rect3);
                    if (p056o0000Oo0.OooO0OO.OooO0OO(i, rect4, rect3)) {
                        if (p056o0000Oo0.OooO0OO.OooO0OO(i, rect4, rect2)) {
                            if (!p056o0000Oo0.OooO0OO.OooO00o(i, rect4, rect2, rect3)) {
                                int iOooO0Oo3 = p056o0000Oo0.OooO0OO.OooO0Oo(i, rect4, rect3);
                                int iOooO0o2 = p056o0000Oo0.OooO0OO.OooO0o0(i, rect4, rect3);
                                i8 = (iOooO0o2 * iOooO0o2) + (iOooO0Oo3 * 13 * iOooO0Oo3);
                                iOooO0Oo = p056o0000Oo0.OooO0OO.OooO0Oo(i, rect4, rect2);
                                iOooO0o0 = p056o0000Oo0.OooO0OO.OooO0o0(i, rect4, rect2);
                                if (i8 < (iOooO0o0 * iOooO0o0) + (iOooO0Oo * 13 * iOooO0Oo)) {
                                }
                            }
                            i7 = i5;
                        }
                        i7 = 1;
                    } else {
                        i7 = i5;
                    }
                    if (i7 != 0) {
                        rect2.set(rect3);
                        o0oo0oo3 = o0oo0oo4;
                    }
                }
            }
            i2 = i5;
            o0oo0oo2 = o0oo0oo3;
            i3 = -1;
        }
        if (o0oo0oo2 != null) {
            if (oooo0.f38807OooO0Oo) {
                oooo0.OooO0o0();
            }
            int i14 = i2;
            while (true) {
                if (i14 >= oooo0.f38810OooO0oO) {
                    i4 = i3;
                    break;
                }
                if (oooo0.f38808OooO0o[i14] == o0oo0oo2) {
                    i4 = i14;
                    break;
                }
                i14++;
            }
            iOooO0oO = oooo0.OooO0oO(i4);
        }
        return OooOOO0(iOooO0oO);
    }

    @NonNull
    public final o0Oo0oo OooO0oo(int i) {
        if (i != -1) {
            return OooO0OO(i);
        }
        View view = this.f34148OooO0o;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
        o0Oo0oo o0oo0oo2 = new o0Oo0oo(accessibilityNodeInfoObtain);
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        OooO0o0(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            o0oo0oo2.f34022OooO00o.addChild(view, ((Integer) arrayList.get(i2)).intValue());
        }
        return o0oo0oo2;
    }

    public void OooOO0(@NonNull o0Oo0oo o0oo0oo2) {
    }

    public abstract void OooOO0O(int i, @NonNull o0Oo0oo o0oo0oo2);

    public void OooOO0o(int i, boolean z) {
    }

    public final void OooOOO(int i, int i2) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f34149OooO0o0.isEnabled() || (parent = (view = this.f34148OooO0o).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, OooO0O0(i, i2));
    }

    public final boolean OooOOO0(int i) {
        int i2;
        View view = this.f34148OooO0o;
        if ((!view.isFocused() && !view.requestFocus()) || (i2 = this.f34143OooO) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            OooO00o(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f34143OooO = i;
        OooOO0o(i, true);
        OooOOO(i, 8);
        return true;
    }

    public final boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        int i;
        AccessibilityManager accessibilityManager = this.f34149OooO0o0;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iOooO0Oo = OooO0Oo(motionEvent.getX(), motionEvent.getY());
            int i2 = this.f34152OooOO0;
            if (i2 != iOooO0Oo) {
                this.f34152OooOO0 = iOooO0Oo;
                OooOOO(iOooO0Oo, 128);
                OooOOO(i2, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            }
            return iOooO0Oo != Integer.MIN_VALUE;
        }
        if (action != 10 || (i = this.f34152OooOO0) == Integer.MIN_VALUE) {
            return false;
        }
        if (i != Integer.MIN_VALUE) {
            this.f34152OooOO0 = Integer.MIN_VALUE;
            OooOOO(Integer.MIN_VALUE, 128);
            OooOOO(i, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
        return true;
    }

    @Override // androidx.core.view.OooO00o
    public final o0OO00O getAccessibilityNodeProvider(View view) {
        if (this.f34150OooO0oO == null) {
            this.f34150OooO0oO = new OooO0OO();
        }
        return this.f34150OooO0oO;
    }

    @Override // androidx.core.view.OooO00o
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // androidx.core.view.OooO00o
    public final void onInitializeAccessibilityNodeInfo(View view, o0Oo0oo o0oo0oo2) {
        super.onInitializeAccessibilityNodeInfo(view, o0oo0oo2);
        OooOO0(o0oo0oo2);
    }
}
