package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class o000O000 {
    public static void OooO0Oo(View view, List list) {
        boolean z;
        boolean z2;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            } else {
                if (list.get(i) == view) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        if (z) {
            return;
        }
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        if (ViewCompat.OooOOO.OooOO0O(view) != null) {
            list.add(view);
        }
        for (int i2 = size; i2 < list.size(); i2++) {
            View view2 = (View) list.get(i2);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            z2 = false;
                            break;
                        } else {
                            if (list.get(i4) == childAt) {
                                z2 = true;
                                break;
                            }
                            i4++;
                        }
                    }
                    if (!z2 && ViewCompat.OooOOO.OooOO0O(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    public static void OooO0oO(View view, Rect rect) {
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        if (ViewCompat.OooOO0O.OooO0O0(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public static boolean OooO0oo(List list) {
        return list == null || list.isEmpty();
    }

    public abstract Object OooO(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3);

    public abstract void OooO00o(@NonNull View view, @NonNull Object obj);

    public abstract void OooO0O0(@NonNull ArrayList arrayList, @NonNull Object obj);

    public abstract void OooO0OO(@NonNull ViewGroup viewGroup, @Nullable Object obj);

    public abstract Object OooO0o(@Nullable Object obj);

    public abstract boolean OooO0o0(@NonNull Object obj);

    public abstract Object OooOO0(@Nullable Object obj, @Nullable Object obj2);

    public abstract void OooOO0O(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList);

    public abstract void OooOO0o(@NonNull Object obj, @Nullable Object obj2, @Nullable ArrayList arrayList, @Nullable Object obj3, @Nullable ArrayList arrayList2);

    public abstract void OooOOO(@NonNull Object obj, @NonNull Rect rect);

    public abstract void OooOOO0(@Nullable View view, @NonNull Object obj);

    public void OooOOOO(@NonNull Object obj, @NonNull p063o0000oO.o0OoOo0 o0oooo1, @NonNull OooOO0 oooOO1) {
        oooOO1.run();
    }

    public abstract void OooOOOo(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList);

    public abstract Object OooOOo(@Nullable Object obj);

    public abstract void OooOOo0(@Nullable Object obj, @Nullable ArrayList<View> arrayList, @Nullable ArrayList<View> arrayList2);
}
