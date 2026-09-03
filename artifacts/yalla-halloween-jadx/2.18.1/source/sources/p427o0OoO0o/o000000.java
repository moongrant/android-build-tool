package p427o0OoO0o;

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
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.yallatech.support.platform.share.bean.ShareRequest;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p021OooOooo.o0ooOOo;
import p072o000O0o0.o000;
import p072o000O0o0.o0000O0;
import p072o000O0o0.o0000OO0;
import p072o000O0o0.o000O0o;

/* JADX INFO: loaded from: classes.dex */
public abstract class o000000 extends androidx.core.view.OooO00o {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final Rect f39872OooOOO = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final o000000O.OooO00o<o0000OO0> f39873OooOOOO = new OooO00o();

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final OooO0O0 f39874OooOOOo = new OooO0O0();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final View f39875OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final AccessibilityManager f39880OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public OooO0OO f39881OooOO0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Rect f39876OooO0Oo = new Rect();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Rect f39878OooO0o0 = new Rect();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Rect f39877OooO0o = new Rect();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int[] f39879OooO0oO = new int[2];

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f39882OooOO0O = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f39883OooOO0o = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f39884OooOOO0 = Integer.MIN_VALUE;

    public class OooO00o implements o000000O.OooO00o<o0000OO0> {
        public final void OooO00o(Object obj, Rect rect) {
            ((o0000OO0) obj).OooO0oO(rect);
        }
    }

    public class OooO0O0 {
    }

    public class OooO0OO extends o000 {
        public OooO0OO() {
        }

        @Override // p072o000O0o0.o000
        public final o0000OO0 OooO00o(int i) {
            return o0000OO0.OooOo0o(o000000.this.OooOOoo(i));
        }

        @Override // p072o000O0o0.o000
        public final o0000OO0 OooO0O0(int i) {
            int i2 = i == 2 ? o000000.this.f39882OooOO0O : o000000.this.f39883OooOO0o;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return o0000OO0.OooOo0o(o000000.this.OooOOoo(i2));
        }

        @Override // p072o000O0o0.o000
        public final boolean OooO0OO(int i, int i2, Bundle bundle) {
            int i3;
            o000000 o000000Var = o000000.this;
            if (i == -1) {
                View view = o000000Var.f39875OooO;
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                return ViewCompat.OooO0o.OooOO0(view, i2, bundle);
            }
            boolean z = true;
            if (i2 == 1) {
                return o000000Var.OooOo(i);
            }
            if (i2 == 2) {
                return o000000Var.OooOO0O(i);
            }
            if (i2 != 64) {
                return i2 != 128 ? o000000Var.OooOo00(i, i2, bundle) : o000000Var.OooOO0(i);
            }
            if (o000000Var.f39880OooO0oo.isEnabled() && o000000Var.f39880OooO0oo.isTouchExplorationEnabled() && (i3 = o000000Var.f39882OooOO0O) != i) {
                if (i3 != Integer.MIN_VALUE) {
                    o000000Var.OooOO0(i3);
                }
                o000000Var.f39882OooOO0O = i;
                o000000Var.f39875OooO.invalidate();
                o000000Var.OooOoO0(i, ShareRequest.THUMB_DATA_SIZE_LIMIT);
            } else {
                z = false;
            }
            return z;
        }
    }

    public o000000(@NonNull View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f39875OooO = view;
        this.f39880OooO0oo = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        if (ViewCompat.OooO0o.OooO0OO(view) == 0) {
            ViewCompat.OooO0o.OooOOoo(view, 1);
        }
    }

    @Override // androidx.core.view.OooO00o
    public final o000 OooO0O0(View view) {
        if (this.f39881OooOO0 == null) {
            this.f39881OooOO0 = new OooO0OO();
        }
        return this.f39881OooOO0;
    }

    @Override // androidx.core.view.OooO00o
    public final void OooO0OO(View view, AccessibilityEvent accessibilityEvent) {
        super.OooO0OO(view, accessibilityEvent);
    }

    @Override // androidx.core.view.OooO00o
    public final void OooO0Oo(View view, o0000OO0 o0000oo1) {
        this.f7862OooO00o.onInitializeAccessibilityNodeInfo(view, o0000oo1.f28194OooO00o);
        OooOo0(o0000oo1);
    }

    public final boolean OooOO0(int i) {
        if (this.f39882OooOO0O != i) {
            return false;
        }
        this.f39882OooOO0O = Integer.MIN_VALUE;
        this.f39875OooO.invalidate();
        OooOoO0(i, 65536);
        return true;
    }

    public final boolean OooOO0O(int i) {
        if (this.f39883OooOO0o != i) {
            return false;
        }
        this.f39883OooOO0o = Integer.MIN_VALUE;
        OooOo0o(i, false);
        OooOoO0(i, 8);
        return true;
    }

    public final AccessibilityEvent OooOO0o(int i, int i2) {
        if (i == -1) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            this.f39875OooO.onInitializeAccessibilityEvent(accessibilityEventObtain);
            return accessibilityEventObtain;
        }
        AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain(i2);
        o0000OO0 o0000oo0OooOOoo = OooOOoo(i);
        accessibilityEventObtain2.getText().add(o0000oo0OooOOoo.OooOOOo());
        accessibilityEventObtain2.setContentDescription(o0000oo0OooOOoo.OooOO0O());
        accessibilityEventObtain2.setScrollable(o0000oo0OooOOoo.f28194OooO00o.isScrollable());
        accessibilityEventObtain2.setPassword(o0000oo0OooOOoo.f28194OooO00o.isPassword());
        accessibilityEventObtain2.setEnabled(o0000oo0OooOOoo.OooOOo0());
        accessibilityEventObtain2.setChecked(o0000oo0OooOOoo.f28194OooO00o.isChecked());
        if (accessibilityEventObtain2.getText().isEmpty() && accessibilityEventObtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain2.setClassName(o0000oo0OooOOoo.OooO());
        o000O0o.OooO00o(accessibilityEventObtain2, this.f39875OooO, i);
        accessibilityEventObtain2.setPackageName(this.f39875OooO.getContext().getPackageName());
        return accessibilityEventObtain2;
    }

    public final boolean OooOOO(@NonNull MotionEvent motionEvent) {
        int i;
        if (this.f39880OooO0oo.isEnabled() && this.f39880OooO0oo.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action != 10 || (i = this.f39884OooOOO0) == Integer.MIN_VALUE) {
                    return false;
                }
                if (i != Integer.MIN_VALUE) {
                    this.f39884OooOOO0 = Integer.MIN_VALUE;
                    OooOoO0(Integer.MIN_VALUE, 128);
                    OooOoO0(i, 256);
                }
                return true;
            }
            int iOooOOOO = OooOOOO(motionEvent.getX(), motionEvent.getY());
            int i2 = this.f39884OooOOO0;
            if (i2 != iOooOOOO) {
                this.f39884OooOOO0 = iOooOOOO;
                OooOoO0(iOooOOOO, 128);
                OooOoO0(i2, 256);
            }
            if (iOooOOOO != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public final o0000OO0 OooOOO0(int i) {
        o0000OO0 o0000oo0OooOo0O = o0000OO0.OooOo0O();
        o0000oo0OooOo0O.Oooo0o0(true);
        o0000oo0OooOo0O.Oooo0o(true);
        o0000oo0OooOo0O.Oooo000("android.view.View");
        Rect rect = f39872OooOOO;
        o0000oo0OooOo0O.OooOoo0(rect);
        o0000oo0OooOo0O.OooOoo(rect);
        o0000oo0OooOo0O.OoooOO0(this.f39875OooO);
        OooOo0O(i, o0000oo0OooOo0O);
        if (o0000oo0OooOo0O.OooOOOo() == null && o0000oo0OooOo0O.OooOO0O() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        o0000oo0OooOo0O.OooO0oO(this.f39878OooO0o0);
        if (this.f39878OooO0o0.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iOooO0o = o0000oo0OooOo0O.OooO0o();
        if ((iOooO0o & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iOooO0o & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        o0000oo0OooOo0O.OoooO0O(this.f39875OooO.getContext().getPackageName());
        View view = this.f39875OooO;
        o0000oo0OooOo0O.f28196OooO0OO = i;
        o0000oo0OooOo0O.f28194OooO00o.setSource(view, i);
        boolean z = false;
        if (this.f39882OooOO0O == i) {
            o0000oo0OooOo0O.OooOoO(true);
            o0000oo0OooOo0O.OooO00o(128);
        } else {
            o0000oo0OooOo0O.OooOoO(false);
            o0000oo0OooOo0O.OooO00o(64);
        }
        boolean z2 = this.f39883OooOO0o == i;
        if (z2) {
            o0000oo0OooOo0O.OooO00o(2);
        } else if (o0000oo0OooOo0O.OooOOo()) {
            o0000oo0OooOo0O.OooO00o(1);
        }
        o0000oo0OooOo0O.Oooo0oO(z2);
        this.f39875OooO.getLocationOnScreen(this.f39879OooO0oO);
        o0000oo0OooOo0O.OooO0oo(this.f39876OooO0Oo);
        if (this.f39876OooO0Oo.equals(rect)) {
            o0000oo0OooOo0O.OooO0oO(this.f39876OooO0Oo);
            if (o0000oo0OooOo0O.f28195OooO0O0 != -1) {
                o0000OO0 o0000oo0OooOo0O2 = o0000OO0.OooOo0O();
                for (int i2 = o0000oo0OooOo0O.f28195OooO0O0; i2 != -1; i2 = o0000oo0OooOo0O2.f28195OooO0O0) {
                    o0000oo0OooOo0O2.o000oOoO(this.f39875OooO, -1);
                    o0000oo0OooOo0O2.OooOoo0(f39872OooOOO);
                    OooOo0O(i2, o0000oo0OooOo0O2);
                    o0000oo0OooOo0O2.OooO0oO(this.f39878OooO0o0);
                    Rect rect2 = this.f39876OooO0Oo;
                    Rect rect3 = this.f39878OooO0o0;
                    rect2.offset(rect3.left, rect3.top);
                }
                o0000oo0OooOo0O2.OooOo();
            }
            this.f39876OooO0Oo.offset(this.f39879OooO0oO[0] - this.f39875OooO.getScrollX(), this.f39879OooO0oO[1] - this.f39875OooO.getScrollY());
        }
        if (this.f39875OooO.getLocalVisibleRect(this.f39877OooO0o)) {
            this.f39877OooO0o.offset(this.f39879OooO0oO[0] - this.f39875OooO.getScrollX(), this.f39879OooO0oO[1] - this.f39875OooO.getScrollY());
            if (this.f39876OooO0Oo.intersect(this.f39877OooO0o)) {
                o0000oo0OooOo0O.OooOoo(this.f39876OooO0Oo);
                Rect rect4 = this.f39876OooO0Oo;
                if (rect4 != null && !rect4.isEmpty() && this.f39875OooO.getWindowVisibility() == 0) {
                    Object parent = this.f39875OooO.getParent();
                    while (true) {
                        if (!(parent instanceof View)) {
                            if (parent == null) {
                                break;
                            }
                            z = true;
                            break;
                        }
                        View view2 = (View) parent;
                        if (view2.getAlpha() <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || view2.getVisibility() != 0) {
                            break;
                        }
                        parent = view2.getParent();
                    }
                }
                if (z) {
                    o0000oo0OooOo0O.OooooOo(true);
                }
            }
        }
        return o0000oo0OooOo0O;
    }

    public abstract int OooOOOO(float f, float f2);

    public abstract void OooOOOo(List<Integer> list);

    /* JADX WARN: Code duplicated, block: B:99:0x01b5  */
    /* JADX WARN: Type inference failed for: r8v4, types: [o0OoO0o.o000000$OooO00o, o0OoO0o.o000000O$OooO00o<o000O0o0.o0000OO0>] */
    public final boolean OooOOo(int i, @Nullable Rect rect) {
        Object obj;
        o0000OO0 o0000oo1;
        boolean z;
        ArrayList arrayList = new ArrayList();
        OooOOOo(arrayList);
        o0ooOOo o0ooooo2 = new o0ooOOo();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            o0ooooo2.OooOO0O(((Integer) arrayList.get(i2)).intValue(), OooOOO0(((Integer) arrayList.get(i2)).intValue()));
        }
        int i3 = this.f39883OooOO0o;
        o0000OO0 o0000oo2 = i3 == Integer.MIN_VALUE ? null : (o0000OO0) o0ooooo2.OooO0oO(i3, null);
        if (i == 1 || i == 2) {
            View view = this.f39875OooO;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            boolean z2 = ViewCompat.OooO.OooO0Oo(view) == 1;
            OooO0O0 oooO0O0 = f39874OooOOOo;
            o000000O.OooO00o<o0000OO0> oooO00o = f39873OooOOOO;
            Objects.requireNonNull(oooO0O0);
            int iOooOO0o = o0ooooo2.OooOO0o();
            ArrayList arrayList2 = new ArrayList(iOooOO0o);
            for (int i4 = 0; i4 < iOooOO0o; i4++) {
                arrayList2.add((o0000OO0) o0ooooo2.OooOOO0(i4));
            }
            Collections.sort(arrayList2, new o000000O.OooO0O0(z2, oooO00o));
            if (i == 1) {
                int size = arrayList2.size();
                if (o0000oo2 != null) {
                    size = arrayList2.indexOf(o0000oo2);
                }
                int i5 = size - 1;
                if (i5 >= 0) {
                    obj = arrayList2.get(i5);
                } else {
                    obj = null;
                }
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (o0000oo2 != null ? arrayList2.lastIndexOf(o0000oo2) : -1) + 1;
                if (iLastIndexOf < size2) {
                    obj = arrayList2.get(iLastIndexOf);
                } else {
                    obj = null;
                }
            }
            o0000oo1 = (o0000OO0) obj;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i6 = this.f39883OooOO0o;
            if (i6 != Integer.MIN_VALUE) {
                OooOOoo(i6).OooO0oO(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                View view2 = this.f39875OooO;
                int width = view2.getWidth();
                int height = view2.getHeight();
                if (i == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    rect2.set(0, -1, width, -1);
                }
            }
            OooO0O0 oooO0O1 = f39874OooOOOo;
            ?? r8 = f39873OooOOOO;
            Rect rect3 = new Rect(rect2);
            if (i == 17) {
                rect3.offset(rect2.width() + 1, 0);
            } else if (i == 33) {
                rect3.offset(0, rect2.height() + 1);
            } else if (i == 66) {
                rect3.offset(-(rect2.width() + 1), 0);
            } else {
                if (i != 130) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                rect3.offset(0, -(rect2.height() + 1));
            }
            Objects.requireNonNull(oooO0O1);
            int iOooOO0o2 = o0ooooo2.OooOO0o();
            Rect rect4 = new Rect();
            o0000oo1 = null;
            for (int i7 = 0; i7 < iOooOO0o2; i7++) {
                o0000OO0 o0000oo3 = (o0000OO0) o0ooooo2.OooOOO0(i7);
                if (o0000oo3 != o0000oo2) {
                    r8.OooO00o(o0000oo3, rect4);
                    if (o000000O.OooO0OO(rect2, rect4, i)) {
                        if (o000000O.OooO0OO(rect2, rect3, i) && !o000000O.OooO00o(i, rect2, rect4, rect3)) {
                            if (!o000000O.OooO00o(i, rect2, rect3, rect4)) {
                                int iOooO0Oo = o000000O.OooO0Oo(i, rect2, rect4);
                                int iOooO0o0 = o000000O.OooO0o0(i, rect2, rect4);
                                int i8 = (iOooO0o0 * iOooO0o0) + (iOooO0Oo * 13 * iOooO0Oo);
                                int iOooO0Oo2 = o000000O.OooO0Oo(i, rect2, rect3);
                                int iOooO0o1 = o000000O.OooO0o0(i, rect2, rect3);
                                if (i8 < (iOooO0o1 * iOooO0o1) + (iOooO0Oo2 * 13 * iOooO0Oo2)) {
                                }
                            }
                            z = false;
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        rect3.set(rect4);
                        o0000oo1 = o0000oo3;
                    }
                }
            }
        }
        o0000OO0 o0000oo4 = o0000oo1;
        return OooOo(o0000oo4 != null ? o0ooooo2.OooOO0(o0ooooo2.OooO(o0000oo4)) : Integer.MIN_VALUE);
    }

    public final void OooOOo0(int i) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f39880OooO0oo.isEnabled() || (parent = this.f39875OooO.getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventOooOO0o = OooOO0o(i, RecyclerView.oo0o0Oo.FLAG_MOVED);
        o0000O0.OooO0O0(accessibilityEventOooOO0o, 0);
        parent.requestSendAccessibilityEvent(this.f39875OooO, accessibilityEventOooOO0o);
    }

    @NonNull
    public final o0000OO0 OooOOoo(int i) {
        if (i != -1) {
            return OooOOO0(i);
        }
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(this.f39875OooO);
        o0000OO0 o0000oo1 = new o0000OO0(accessibilityNodeInfoObtain);
        View view = this.f39875OooO;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        OooOOOo(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            o0000oo1.f28194OooO00o.addChild(this.f39875OooO, ((Integer) arrayList.get(i2)).intValue());
        }
        return o0000oo1;
    }

    public final boolean OooOo(int i) {
        int i2;
        if ((!this.f39875OooO.isFocused() && !this.f39875OooO.requestFocus()) || (i2 = this.f39883OooOO0o) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            OooOO0O(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f39883OooOO0o = i;
        OooOo0o(i, true);
        OooOoO0(i, 8);
        return true;
    }

    public void OooOo0(@NonNull o0000OO0 o0000oo1) {
    }

    public abstract boolean OooOo00(int i, int i2, @Nullable Bundle bundle);

    public abstract void OooOo0O(int i, @NonNull o0000OO0 o0000oo1);

    public void OooOo0o(int i, boolean z) {
    }

    public final boolean OooOoO0(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f39880OooO0oo.isEnabled() || (parent = this.f39875OooO.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f39875OooO, OooOO0o(i, i2));
    }
}
