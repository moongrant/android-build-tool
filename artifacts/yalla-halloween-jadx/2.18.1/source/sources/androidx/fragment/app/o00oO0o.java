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
public final class o00oO0o implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final FragmentManager f8509Oooo0o;

    public class OooO00o implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00000O0 f8510Oooo0o;

        public OooO00o(o00000O0 o00000o1) {
            this.f8510Oooo0o = o00000o1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            o00000O0 o00000o1 = this.f8510Oooo0o;
            Fragment fragment = o00000o1.f8437OooO0OO;
            o00000o1.OooOO0O();
            o000O0o.OooO0o((ViewGroup) fragment.mView.getParent(), o00oO0o.this.f8509Oooo0o).OooO0o0();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public o00oO0o(FragmentManager fragmentManager) {
        this.f8509Oooo0o = fragmentManager;
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
        o00000O0 o00000o0OooO0o;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f8509Oooo0o);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p079o000Oo0O.Oooo0.Fragment);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(p079o000Oo0O.Oooo0.Fragment_android_name);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(p079o000Oo0O.Oooo0.Fragment_android_id, -1);
        String string = typedArrayObtainStyledAttributes.getString(p079o000Oo0O.Oooo0.Fragment_android_tag);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue != null) {
            ClassLoader classLoader = context.getClassLoader();
            p021OooOooo.o00oO0o<ClassLoader, p021OooOooo.o00oO0o<String, Class<?>>> o00oo0o2 = o00Ooo.f8508OooO00o;
            try {
                zIsAssignableFrom = Fragment.class.isAssignableFrom(o00Ooo.OooO0O0(classLoader, attributeValue));
            } catch (ClassNotFoundException unused) {
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                Fragment fragment = resourceId != -1 ? this.f8509Oooo0o.Oooo000(resourceId) : null;
                if (fragment == null && string != null) {
                    fragment = this.f8509Oooo0o.Oooo00O(string);
                }
                if (fragment == null && id != -1) {
                    fragment = this.f8509Oooo0o.Oooo000(id);
                }
                if (fragment == null) {
                    fragment = this.f8509Oooo0o.Oooo0O0().OooO00o(context.getClassLoader(), attributeValue);
                    fragment.mFromLayout = true;
                    fragment.mFragmentId = resourceId != 0 ? resourceId : id;
                    fragment.mContainerId = id;
                    fragment.mTag = string;
                    fragment.mInLayout = true;
                    FragmentManager fragmentManager = this.f8509Oooo0o;
                    fragment.mFragmentManager = fragmentManager;
                    oo000o<?> oo000oVar = fragmentManager.f8306OooOo0;
                    fragment.mHost = oo000oVar;
                    fragment.onInflate(oo000oVar.f8529Oooo0oO, attributeSet, fragment.mSavedFragmentState);
                    o00000o0OooO0o = this.f8509Oooo0o.OooO00o(fragment);
                    if (FragmentManager.Oooo0oO(2)) {
                        Log.v("FragmentManager", "Fragment " + fragment + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    if (fragment.mInLayout) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    fragment.mInLayout = true;
                    FragmentManager fragmentManager2 = this.f8509Oooo0o;
                    fragment.mFragmentManager = fragmentManager2;
                    oo000o<?> oo000oVar2 = fragmentManager2.f8306OooOo0;
                    fragment.mHost = oo000oVar2;
                    fragment.onInflate(oo000oVar2.f8529Oooo0oO, attributeSet, fragment.mSavedFragmentState);
                    o00000o0OooO0o = this.f8509Oooo0o.OooO0o(fragment);
                    if (FragmentManager.Oooo0oO(2)) {
                        Log.v("FragmentManager", "Retained Fragment " + fragment + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                FragmentStrictMode fragmentStrictMode = FragmentStrictMode.f8532OooO00o;
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, viewGroup);
                FragmentStrictMode fragmentStrictMode2 = FragmentStrictMode.f8532OooO00o;
                FragmentStrictMode.OooO0OO(fragmentTagUsageViolation);
                FragmentStrictMode.OooO0O0 oooO0O0OooO00o = FragmentStrictMode.OooO00o(fragment);
                if (oooO0O0OooO00o.f8535OooO00o.contains(FragmentStrictMode.Flag.DETECT_FRAGMENT_TAG_USAGE) && FragmentStrictMode.OooO0o(oooO0O0OooO00o, fragment.getClass(), FragmentTagUsageViolation.class)) {
                    FragmentStrictMode.OooO0O0(oooO0O0OooO00o, fragmentTagUsageViolation);
                }
                fragment.mContainer = viewGroup;
                o00000o0OooO0o.OooOO0O();
                o00000o0OooO0o.OooOO0();
                View view2 = fragment.mView;
                if (view2 == null) {
                    throw new IllegalStateException(OooO0o.OooO0OO.OooO00o("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (fragment.mView.getTag() == null) {
                    fragment.mView.setTag(string);
                }
                fragment.mView.addOnAttachStateChangeListener(new OooO00o(o00000o0OooO0o));
                return fragment.mView;
            }
        }
        return null;
    }
}
