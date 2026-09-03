package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO00O implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final FragmentManager f6048OooO0Oo;

    public class OooO00o implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0000 f6049OooO0Oo;

        public OooO00o(o0000 o0000Var) {
            this.f6049OooO0Oo = o0000Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            o0000 o0000Var = this.f6049OooO0Oo;
            Fragment fragment = o0000Var.f5966OooO0OO;
            o0000Var.OooOO0O();
            SpecialEffectsController.OooOO0((ViewGroup) fragment.mView.getParent(), o0OO00O.this.f6048OooO0Oo).OooO();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public o0OO00O(FragmentManager fragmentManager) {
        this.f6048OooO0Oo = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    @Nullable
    public final View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    @Nullable
    public final View onCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        o0000 o0000VarOooO0o;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        FragmentManager fragmentManager = this.f6048OooO0Oo;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, fragmentManager);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p062o0000o0o.o00000.Fragment);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(p062o0000o0o.o00000.Fragment_android_name);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(p062o0000o0o.o00000.Fragment_android_id, -1);
        String string = typedArrayObtainStyledAttributes.getString(p062o0000o0o.o00000.Fragment_android_tag);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                zIsAssignableFrom = Fragment.class.isAssignableFrom(o0OOO0o.OooO00o(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                Fragment fragment = resourceId != -1 ? fragmentManager.OooOoo0(resourceId) : null;
                if (fragment == null && string != null) {
                    fragment = fragmentManager.OooOoo(string);
                }
                if (fragment == null && id != -1) {
                    fragment = fragmentManager.OooOoo0(id);
                }
                if (fragment == null) {
                    o0OOO0o o0ooo0oOooo000 = fragmentManager.Oooo000();
                    context.getClassLoader();
                    fragment = Fragment.instantiate(FragmentManager.this.f5836OooOo0.f6054OooO0o0, attributeValue, null);
                    fragment.mFromLayout = true;
                    fragment.mFragmentId = resourceId != 0 ? resourceId : id;
                    fragment.mContainerId = id;
                    fragment.mTag = string;
                    fragment.mInLayout = true;
                    fragment.mFragmentManager = fragmentManager;
                    o0Oo0oo<?> o0oo0oo2 = fragmentManager.f5836OooOo0;
                    fragment.mHost = o0oo0oo2;
                    fragment.onInflate(o0oo0oo2.f6054OooO0o0, attributeSet, fragment.mSavedFragmentState);
                    o0000VarOooO0o = fragmentManager.OooO00o(fragment);
                    if (FragmentManager.Oooo0O0(2)) {
                        Log.v("FragmentManager", "Fragment " + fragment + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    if (fragment.mInLayout) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    fragment.mInLayout = true;
                    fragment.mFragmentManager = fragmentManager;
                    o0Oo0oo<?> o0oo0oo3 = fragmentManager.f5836OooOo0;
                    fragment.mHost = o0oo0oo3;
                    fragment.onInflate(o0oo0oo3.f6054OooO0o0, attributeSet, fragment.mSavedFragmentState);
                    o0000VarOooO0o = fragmentManager.OooO0o(fragment);
                    if (FragmentManager.Oooo0O0(2)) {
                        Log.v("FragmentManager", "Retained Fragment " + fragment + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                FragmentStrictMode.OooO00o oooO00o = FragmentStrictMode.f6069OooO00o;
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, viewGroup);
                FragmentStrictMode.OooO0OO(fragmentTagUsageViolation);
                FragmentStrictMode.OooO00o OooO00o2 = FragmentStrictMode.OooO00o(fragment);
                if (OooO00o2.f6071OooO00o.contains(FragmentStrictMode.Flag.DETECT_FRAGMENT_TAG_USAGE) && FragmentStrictMode.OooO0o0(OooO00o2, fragment.getClass(), FragmentTagUsageViolation.class)) {
                    FragmentStrictMode.OooO0O0(OooO00o2, fragmentTagUsageViolation);
                }
                fragment.mContainer = viewGroup;
                o0000VarOooO0o.OooOO0O();
                o0000VarOooO0o.OooOO0();
                View view2 = fragment.mView;
                if (view2 == null) {
                    throw new IllegalStateException(p004OooO0oO.o000oOoO.OooO0O0("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (fragment.mView.getTag() == null) {
                    fragment.mView.setTag(string);
                }
                fragment.mView.addOnAttachStateChangeListener(new OooO00o(o0000VarOooO0o));
                return fragment.mView;
            }
        }
        return null;
    }
}
