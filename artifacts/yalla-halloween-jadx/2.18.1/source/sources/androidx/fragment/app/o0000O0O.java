package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class o0000O0O {
    public static void OooO0Oo(List<View> list, View view) {
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
        WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        if (ViewCompat.OooOOO.OooOO0O(view) != null) {
            list.add(view);
        }
        for (int i2 = size; i2 < list.size(); i2++) {
            View view2 = list.get(i2);
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

    public static boolean OooO0oo(List list) {
        return list == null || list.isEmpty();
    }

    public abstract Object OooO(Object obj, Object obj2, Object obj3);

    public abstract void OooO00o(Object obj, View view);

    public abstract void OooO0O0(Object obj, ArrayList<View> arrayList);

    public abstract void OooO0OO(ViewGroup viewGroup, Object obj);

    public abstract Object OooO0o(Object obj);

    public abstract boolean OooO0o0(Object obj);

    public final void OooO0oO(View view, Rect rect) {
        WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        if (ViewCompat.OooOO0O.OooO0O0(view)) {
            RectF rectF = new RectF();
            rectF.set(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, view.getWidth(), view.getHeight());
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

    public abstract Object OooOO0(Object obj, Object obj2);

    public abstract void OooOO0O(Object obj, View view, ArrayList<View> arrayList);

    public abstract void OooOO0o(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2);

    public abstract void OooOOO(Object obj, View view);

    public abstract void OooOOO0(Object obj, Rect rect);

    public void OooOOOO(@NonNull Object obj, @NonNull o000O00O.OooO0o oooO0o, @NonNull Runnable runnable) {
        ((OooOOOO) runnable).run();
    }

    public abstract void OooOOOo(Object obj, View view, ArrayList<View> arrayList);

    public abstract Object OooOOo(Object obj);

    public abstract void OooOOo0(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);
}
