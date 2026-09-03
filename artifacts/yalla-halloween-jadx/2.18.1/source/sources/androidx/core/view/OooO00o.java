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
import java.util.Objects;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p069o0000oo0.o000OO0O;
import p072o000O0o0.o000;
import p072o000O0o0.o0000OO0;
import p072o000O0o0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public class OooO00o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final View.AccessibilityDelegate f7861OooO0OO = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final View.AccessibilityDelegate f7862OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C0046OooO00o f7863OooO0O0;

    /* JADX INFO: renamed from: androidx.core.view.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0046OooO00o extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO00o f7864OooO00o;

        public C0046OooO00o(OooO00o oooO00o) {
            this.f7864OooO00o = oooO00o;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f7864OooO00o.OooO00o(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        @RequiresApi(16)
        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            o000 o000VarOooO0O0 = this.f7864OooO00o.OooO0O0(view);
            if (o000VarOooO0O0 != null) {
                return (AccessibilityNodeProvider) o000VarOooO0O0.f28190OooO00o;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f7864OooO00o.OooO0OO(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            Object tag;
            Object objValueOf;
            int iKeyAt;
            o0000OO0 o0000oo1 = new o0000OO0(accessibilityNodeInfo);
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            int i = o000OO0O.tag_screen_reader_focusable;
            int i2 = Build.VERSION.SDK_INT;
            Object objOooO00o = null;
            if (i2 >= 28) {
                tag = Boolean.valueOf(ViewCompat.Oooo000.OooO0Oo(view));
            } else {
                tag = view.getTag(i);
                if (!Boolean.class.isInstance(tag)) {
                    tag = null;
                }
            }
            Boolean bool = (Boolean) tag;
            o0000oo1.OoooOo0(bool != null && bool.booleanValue());
            int i3 = o000OO0O.tag_accessibility_heading;
            if (i2 >= 28) {
                objValueOf = Boolean.valueOf(ViewCompat.Oooo000.OooO0OO(view));
            } else {
                Object tag2 = view.getTag(i3);
                objValueOf = Boolean.class.isInstance(tag2) ? tag2 : null;
            }
            Boolean bool2 = (Boolean) objValueOf;
            o0000oo1.Oooo0oo(bool2 != null && bool2.booleanValue());
            o0000oo1.OoooO(ViewCompat.OooO(view));
            int i4 = o000OO0O.tag_state_description;
            if (i2 >= 30) {
                objOooO00o = ViewCompat.o000oOoO.OooO00o(view);
            } else {
                Object tag3 = view.getTag(i4);
                if (CharSequence.class.isInstance(tag3)) {
                    objOooO00o = tag3;
                }
            }
            o0000oo1.Ooooo0o((CharSequence) objOooO00o);
            this.f7864OooO00o.OooO0Oo(view, o0000oo1);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i2 < 26) {
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view.getTag(o000OO0O.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i5 = 0; i5 < sparseArray.size(); i5++) {
                        if (((WeakReference) sparseArray.valueAt(i5)).get() == null) {
                            arrayList.add(Integer.valueOf(i5));
                        }
                    }
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        sparseArray.remove(((Integer) arrayList.get(i6)).intValue());
                    }
                }
                ClickableSpan[] clickableSpanArrOooOO0 = o0000OO0.OooOO0(text);
                if (clickableSpanArrOooOO0 != null && clickableSpanArrOooOO0.length > 0) {
                    o0000oo1.OooOO0o().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", o000OO0O.accessibility_action_clickable_span);
                    int i7 = o000OO0O.tag_accessibility_clickable_spans;
                    SparseArray sparseArray2 = (SparseArray) view.getTag(i7);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(i7, sparseArray2);
                    }
                    for (int i8 = 0; i8 < clickableSpanArrOooOO0.length; i8++) {
                        ClickableSpan clickableSpan = clickableSpanArrOooOO0[i8];
                        int i9 = 0;
                        while (true) {
                            if (i9 >= sparseArray2.size()) {
                                iKeyAt = o0000OO0.f28193OooO0Oo;
                                o0000OO0.f28193OooO0Oo = iKeyAt + 1;
                                break;
                            } else {
                                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i9)).get())) {
                                    iKeyAt = sparseArray2.keyAt(i9);
                                    break;
                                }
                                i9++;
                            }
                        }
                        sparseArray2.put(iKeyAt, new WeakReference(clickableSpanArrOooOO0[i8]));
                        ClickableSpan clickableSpan2 = clickableSpanArrOooOO0[i8];
                        Spanned spanned = (Spanned) text;
                        o0000oo1.OooO0Oo("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        o0000oo1.OooO0Oo("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        o0000oo1.OooO0Oo("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        o0000oo1.OooO0Oo("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(iKeyAt));
                    }
                }
            }
            List listEmptyList = (List) view.getTag(o000OO0O.tag_accessibility_actions);
            if (listEmptyList == null) {
                listEmptyList = Collections.emptyList();
            }
            for (int i10 = 0; i10 < listEmptyList.size(); i10++) {
                o0000oo1.OooO0O0((o0000OO0.OooO00o) listEmptyList.get(i10));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f7864OooO00o.OooO0o0(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f7864OooO00o.OooO0o(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f7864OooO00o.OooO0oO(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEvent(View view, int i) {
            this.f7864OooO00o.OooO0oo(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f7864OooO00o.OooO(view, accessibilityEvent);
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
        this.f7862OooO00o = f7861OooO0OO;
        this.f7863OooO0O0 = new C0046OooO00o(this);
    }

    public void OooO(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        this.f7862OooO00o.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean OooO00o(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        return this.f7862OooO00o.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Nullable
    public o000 OooO0O0(@NonNull View view) {
        AccessibilityNodeProvider accessibilityNodeProviderOooO00o = OooO0O0.OooO00o(this.f7862OooO00o, view);
        if (accessibilityNodeProviderOooO00o != null) {
            return new o000(accessibilityNodeProviderOooO00o);
        }
        return null;
    }

    public void OooO0OO(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        this.f7862OooO00o.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void OooO0Oo(@NonNull View view, @NonNull o0000OO0 o0000oo1) {
        this.f7862OooO00o.onInitializeAccessibilityNodeInfo(view, o0000oo1.f28194OooO00o);
    }

    public boolean OooO0o(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        return this.f7862OooO00o.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public void OooO0o0(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        this.f7862OooO00o.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean OooO0oO(@NonNull View view, int i, @Nullable Bundle bundle) {
        boolean zOooO0O0;
        WeakReference weakReference;
        boolean z;
        o000Oo0.OooO00o oooO00oNewInstance;
        Exception e;
        List listEmptyList = (List) view.getTag(o000OO0O.tag_accessibility_actions);
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 < listEmptyList.size()) {
                o0000OO0.OooO00o oooO00o = (o0000OO0.OooO00o) listEmptyList.get(i2);
                if (oooO00o.OooO00o() != i) {
                    i2++;
                } else if (oooO00o.f28215OooO0Oo != null) {
                    o000Oo0.OooO00o oooO00o2 = null;
                    Class<? extends o000Oo0.OooO00o> cls = oooO00o.f28214OooO0OO;
                    if (cls != null) {
                        try {
                            oooO00oNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                            try {
                                Objects.requireNonNull(oooO00oNewInstance);
                            } catch (Exception e2) {
                                e = e2;
                                Class<? extends o000Oo0.OooO00o> cls2 = oooO00o.f28214OooO0OO;
                                Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                            }
                        } catch (Exception e3) {
                            oooO00oNewInstance = null;
                            e = e3;
                        }
                        oooO00o2 = oooO00oNewInstance;
                    }
                    zOooO0O0 = oooO00o.f28215OooO0Oo.perform(view, oooO00o2);
                    break;
                }
            }
            zOooO0O0 = false;
            break;
        }
        if (!zOooO0O0) {
            zOooO0O0 = OooO0O0.OooO0O0(this.f7862OooO00o, view, i, bundle);
        }
        if (zOooO0O0 || i != o000OO0O.accessibility_action_clickable_span || bundle == null) {
            return zOooO0O0;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(o000OO0O.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null) {
            ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
            if (clickableSpan == null) {
                z = false;
                break;
            }
            ClickableSpan[] clickableSpanArrOooOO0 = o0000OO0.OooOO0(view.createAccessibilityNodeInfo().getText());
            int i4 = 0;
            while (true) {
                if (clickableSpanArrOooOO0 == null || i4 >= clickableSpanArrOooOO0.length) {
                    z = false;
                    break;
                }
                if (clickableSpan.equals(clickableSpanArrOooOO0[i4])) {
                    z = true;
                    break;
                }
                i4++;
            }
            if (z) {
                clickableSpan.onClick(view);
                z2 = true;
            }
        }
        return z2;
    }

    public void OooO0oo(@NonNull View view, int i) {
        this.f7862OooO00o.sendAccessibilityEvent(view, i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public OooO00o(@NonNull View.AccessibilityDelegate accessibilityDelegate) {
        this.f7862OooO00o = accessibilityDelegate;
        this.f7863OooO0O0 = new C0046OooO00o(this);
    }
}
