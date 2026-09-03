package androidx.core.view;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class OooO00o {
    private static final View.AccessibilityDelegate DEFAULT_DELEGATE = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate mBridge;
    private final View.AccessibilityDelegate mOriginalDelegate;

    /* JADX INFO: renamed from: androidx.core.view.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0122OooO00o extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO00o f5328OooO00o;

        public C0122OooO00o(OooO00o oooO00o) {
            this.f5328OooO00o = oooO00o;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f5328OooO00o.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        @RequiresApi(16)
        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            o0000O.o0OO00O accessibilityNodeProvider = this.f5328OooO00o.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return (AccessibilityNodeProvider) accessibilityNodeProvider.f34019OooO00o;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f5328OooO00o.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            Object tag;
            Object tag2;
            Object tag3;
            int iKeyAt;
            o0000O.o0Oo0oo o0oo0oo2 = new o0000O.o0Oo0oo(accessibilityNodeInfo);
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            int i = o00000O0.OooO0OO.tag_screen_reader_focusable;
            int i2 = 0;
            if (Build.VERSION.SDK_INT >= 28) {
                tag = Boolean.valueOf(ViewCompat.Oooo000.OooO0Oo(view));
            } else {
                tag = view.getTag(i);
                if (!Boolean.class.isInstance(tag)) {
                    tag = null;
                }
            }
            Boolean bool = (Boolean) tag;
            boolean z = bool != null && bool.booleanValue();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                accessibilityNodeInfo.setScreenReaderFocusable(z);
            } else {
                o0oo0oo2.OooO0oo(1, z);
            }
            int i4 = o00000O0.OooO0OO.tag_accessibility_heading;
            if (Build.VERSION.SDK_INT >= 28) {
                tag2 = Boolean.valueOf(ViewCompat.Oooo000.OooO0OO(view));
            } else {
                tag2 = view.getTag(i4);
                if (!Boolean.class.isInstance(tag2)) {
                    tag2 = null;
                }
            }
            Boolean bool2 = (Boolean) tag2;
            boolean z2 = bool2 != null && bool2.booleanValue();
            if (i3 >= 28) {
                accessibilityNodeInfo.setHeading(z2);
            } else {
                o0oo0oo2.OooO0oo(2, z2);
            }
            CharSequence charSequenceOooO0o0 = ViewCompat.OooO0o0(view);
            if (i3 >= 28) {
                accessibilityNodeInfo.setPaneTitle(charSequenceOooO0o0);
            } else {
                o0000O.o0Oo0oo.OooO0O0.OooO00o(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequenceOooO0o0);
            }
            int i5 = o00000O0.OooO0OO.tag_state_description;
            if (Build.VERSION.SDK_INT >= 30) {
                tag3 = ViewCompat.o000oOoO.OooO00o(view);
            } else {
                tag3 = view.getTag(i5);
                if (!CharSequence.class.isInstance(tag3)) {
                    tag3 = null;
                }
            }
            o0oo0oo2.OooOOOo((CharSequence) tag3);
            this.f5328OooO00o.onInitializeAccessibilityNodeInfo(view, o0oo0oo2);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i3 < 26) {
                o0000O.o0Oo0oo.OooO0O0.OooO00o(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                o0000O.o0Oo0oo.OooO0O0.OooO00o(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                o0000O.o0Oo0oo.OooO0O0.OooO00o(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                o0000O.o0Oo0oo.OooO0O0.OooO00o(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view.getTag(o00000O0.OooO0OO.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i6 = 0; i6 < sparseArray.size(); i6++) {
                        if (((WeakReference) sparseArray.valueAt(i6)).get() == null) {
                            arrayList.add(Integer.valueOf(i6));
                        }
                    }
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        sparseArray.remove(((Integer) arrayList.get(i7)).intValue());
                    }
                }
                ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
                if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                    o0000O.o0Oo0oo.OooO0O0.OooO00o(o0oo0oo2.f34022OooO00o).putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", o00000O0.OooO0OO.accessibility_action_clickable_span);
                    int i8 = o00000O0.OooO0OO.tag_accessibility_clickable_spans;
                    SparseArray sparseArray2 = (SparseArray) view.getTag(i8);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(i8, sparseArray2);
                    }
                    int i9 = 0;
                    while (i9 < clickableSpanArr.length) {
                        ClickableSpan clickableSpan = clickableSpanArr[i9];
                        int i10 = i2;
                        while (true) {
                            if (i10 >= sparseArray2.size()) {
                                iKeyAt = o0000O.o0Oo0oo.f34021OooO0Oo;
                                o0000O.o0Oo0oo.f34021OooO0Oo = iKeyAt + 1;
                                break;
                            } else {
                                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i10)).get())) {
                                    iKeyAt = sparseArray2.keyAt(i10);
                                    break;
                                }
                                i10++;
                            }
                        }
                        sparseArray2.put(iKeyAt, new WeakReference(clickableSpanArr[i9]));
                        ClickableSpan clickableSpan2 = clickableSpanArr[i9];
                        Spanned spanned = (Spanned) text;
                        o0oo0oo2.OooO0OO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        o0oo0oo2.OooO0OO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        o0oo0oo2.OooO0OO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        o0oo0oo2.OooO0OO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(iKeyAt));
                        i9++;
                        i2 = 0;
                    }
                }
            }
            List<o0000O.o0Oo0oo.OooO00o> actionList = OooO00o.getActionList(view);
            for (int i11 = 0; i11 < actionList.size(); i11++) {
                o0oo0oo2.OooO0O0(actionList.get(i11));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f5328OooO00o.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f5328OooO00o.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f5328OooO00o.performAccessibilityAction(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEvent(View view, int i) {
            this.f5328OooO00o.sendAccessibilityEvent(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f5328OooO00o.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    @RequiresApi(16)
    public static class OooO0O0 {
        @DoNotInline
        public static AccessibilityNodeProvider OooO00o(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        @DoNotInline
        public static boolean OooO0O0(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
        }
    }

    public OooO00o() {
        this(DEFAULT_DELEGATE);
    }

    public static List<o0000O.o0Oo0oo.OooO00o> getActionList(View view) {
        List<o0000O.o0Oo0oo.OooO00o> list = (List) view.getTag(o00000O0.OooO0OO.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean isSpanStillValid(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i = 0; clickableSpanArr != null && i < clickableSpanArr.length; i++) {
                if (clickableSpan.equals(clickableSpanArr[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean performClickableSpanAction(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(o00000O0.OooO0OO.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!isSpanStillValid(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean dispatchPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Nullable
    public o0000O.o0OO00O getAccessibilityNodeProvider(@NonNull View view) {
        AccessibilityNodeProvider accessibilityNodeProviderOooO00o = OooO0O0.OooO00o(this.mOriginalDelegate, view);
        if (accessibilityNodeProviderOooO00o != null) {
            return new o0000O.o0OO00O(accessibilityNodeProviderOooO00o);
        }
        return null;
    }

    public View.AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public void onInitializeAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(@NonNull View view, @NonNull o0000O.o0Oo0oo o0oo0oo2) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, o0oo0oo2.f34022OooO00o);
    }

    public void onPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(@NonNull View view, int i, @Nullable Bundle bundle) {
        Exception e;
        o0000O.o000OOo.OooO00o oooO00oNewInstance;
        List<o0000O.o0Oo0oo.OooO00o> actionList = getActionList(view);
        boolean zOooO0O0 = false;
        for (int i2 = 0; i2 < actionList.size(); i2++) {
            o0000O.o0Oo0oo.OooO00o oooO00o = actionList.get(i2);
            if (oooO00o.OooO00o() == i) {
                o0000O.o000OOo o000ooo2 = oooO00o.f34043OooO0Oo;
                if (o000ooo2 == null) {
                    break;
                }
                Class<? extends o0000O.o000OOo.OooO00o> cls = oooO00o.f34042OooO0OO;
                o0000O.o000OOo.OooO00o oooO00o2 = null;
                if (cls != null) {
                    try {
                        oooO00oNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        try {
                            oooO00oNewInstance.getClass();
                        } catch (Exception e2) {
                            e = e2;
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e);
                        }
                    } catch (Exception e3) {
                        e = e3;
                        oooO00oNewInstance = null;
                    }
                    oooO00o2 = oooO00oNewInstance;
                }
                zOooO0O0 = o000ooo2.perform(view, oooO00o2);
                break;
            }
        }
        if (!zOooO0O0) {
            zOooO0O0 = OooO0O0.OooO0O0(this.mOriginalDelegate, view, i, bundle);
        }
        return (zOooO0O0 || i != o00000O0.OooO0OO.accessibility_action_clickable_span || bundle == null) ? zOooO0O0 : performClickableSpanAction(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void sendAccessibilityEvent(@NonNull View view, int i) {
        this.mOriginalDelegate.sendAccessibilityEvent(view, i);
    }

    public void sendAccessibilityEventUnchecked(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public OooO00o(@NonNull View.AccessibilityDelegate accessibilityDelegate) {
        this.mOriginalDelegate = accessibilityDelegate;
        this.mBridge = new C0122OooO00o(this);
    }
}
