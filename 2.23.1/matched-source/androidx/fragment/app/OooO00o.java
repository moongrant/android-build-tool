package androidx.fragment.app;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p527o0o0OO0.o00OO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends o0000oo implements FragmentManager.OooOo {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final FragmentManager f5901OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f5902OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f5903OooOOo0;

    public OooO00o(@NonNull FragmentManager fragmentManager) {
        fragmentManager.Oooo000();
        o0Oo0oo<?> o0oo0oo2 = fragmentManager.f5841OooOo0;
        if (o0oo0oo2 != null) {
            o0oo0oo2.f6059OooO0o0.getClassLoader();
        }
        this.f5902OooOOo = -1;
        this.f5901OooOOOo = fragmentManager;
    }

    @NonNull
    public final OooO00o OooO(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f5901OooOOOo) {
            OooO0O0(new o0000oo.OooO00o(fragment, 6));
            return this;
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.FragmentManager.OooOo
    public final boolean OooO00o(@NonNull ArrayList<OooO00o> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (FragmentManager.Oooo0O0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f6013OooO0oO) {
            return true;
        }
        FragmentManager fragmentManager = this.f5901OooOOOo;
        if (fragmentManager.f5825OooO0Oo == null) {
            fragmentManager.f5825OooO0Oo = new ArrayList<>();
        }
        fragmentManager.f5825OooO0Oo.add(this);
        return true;
    }

    @Override // androidx.fragment.app.o0000oo
    public final void OooO0OO(int i, Fragment fragment, @Nullable String str, int i2) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            FragmentStrictMode.OooO0Oo(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(fragment);
                sb.append(": was ");
                throw new IllegalStateException(androidx.compose.compiler.plugins.kotlin.OooO0O0.OooO00o(sb, fragment.mTag, " now ", str));
            }
            fragment.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i3 = fragment.mFragmentId;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
            }
            fragment.mFragmentId = i;
            fragment.mContainerId = i;
        }
        OooO0O0(new o0000oo.OooO00o(fragment, i2));
        fragment.mFragmentManager = this.f5901OooOOOo;
    }

    public final void OooO0Oo(int i) {
        if (this.f6013OooO0oO) {
            if (FragmentManager.Oooo0O0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList<o0000oo.OooO00o> arrayList = this.f6007OooO00o;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                o0000oo.OooO00o oooO00o = arrayList.get(i2);
                Fragment fragment = oooO00o.f6023OooO0O0;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (FragmentManager.Oooo0O0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + oooO00o.f6023OooO0O0 + " to " + oooO00o.f6023OooO0O0.mBackStackNesting);
                    }
                }
            }
        }
    }

    public final int OooO0o() {
        return OooO0oO(true);
    }

    public final int OooO0o0() {
        return OooO0oO(false);
    }

    public final int OooO0oO(boolean z) {
        if (this.f5903OooOOo0) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.Oooo0O0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new o000O00());
            OooOO0("  ", printWriter, true);
            printWriter.close();
        }
        this.f5903OooOOo0 = true;
        boolean z2 = this.f6013OooO0oO;
        FragmentManager fragmentManager = this.f5901OooOOOo;
        if (z2) {
            this.f5902OooOOo = fragmentManager.f5821OooO.getAndIncrement();
        } else {
            this.f5902OooOOo = -1;
        }
        fragmentManager.OooOo0O(this, z);
        return this.f5902OooOOo;
    }

    public final void OooO0oo() {
        if (this.f6013OooO0oO) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f5901OooOOOo.OooOoO0(this, false);
    }

    public final void OooOO0(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f6014OooO0oo);
            printWriter.print(" mIndex=");
            printWriter.print(this.f5902OooOOo);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f5903OooOOo0);
            if (this.f6011OooO0o != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f6011OooO0o));
            }
            if (this.f6008OooO0O0 != 0 || this.f6009OooO0OO != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f6008OooO0O0));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f6009OooO0OO));
            }
            if (this.f6010OooO0Oo != 0 || this.f6012OooO0o0 != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f6010OooO0Oo));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f6012OooO0o0));
            }
            if (this.f6006OooO != 0 || this.f6015OooOO0 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f6006OooO));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f6015OooOO0);
            }
            if (this.f6016OooOO0O != 0 || this.f6017OooOO0o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f6016OooOO0O));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f6017OooOO0o);
            }
        }
        ArrayList<o0000oo.OooO00o> arrayList = this.f6007OooO00o;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            o0000oo.OooO00o oooO00o = arrayList.get(i);
            switch (oooO00o.f6022OooO00o) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + oooO00o.f6022OooO00o;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            printWriter.println(oooO00o.f6023OooO0O0);
            if (z) {
                if (oooO00o.f6025OooO0Oo != 0 || oooO00o.f6027OooO0o0 != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(oooO00o.f6025OooO0Oo));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(oooO00o.f6027OooO0o0));
                }
                if (oooO00o.f6026OooO0o != 0 || oooO00o.f6028OooO0oO != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(oooO00o.f6026OooO0o));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(oooO00o.f6028OooO0oO));
                }
            }
        }
    }

    @NonNull
    public final OooO00o OooOO0O(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f5901OooOOOo) {
            OooO0O0(new o0000oo.OooO00o(fragment, 4));
            return this;
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @NonNull
    public final OooO00o OooOO0o(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f5901OooOOOo) {
            OooO0O0(new o0000oo.OooO00o(fragment, 3));
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @NonNull
    public final OooO00o OooOOO(@NonNull o00OO0O0 o00oo0o1) {
        FragmentManager fragmentManager = o00oo0o1.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f5901OooOOOo) {
            OooO0O0(new o0000oo.OooO00o(o00oo0o1, 5));
            return this;
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + o00oo0o1.toString() + " is already attached to a FragmentManager.");
    }

    @NonNull
    public final OooO00o OooOOO0(@NonNull Fragment fragment, @NonNull Lifecycle.State state) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        FragmentManager fragmentManager2 = this.f5901OooOOOo;
        if (fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + fragmentManager2);
        }
        if (state == Lifecycle.State.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + " after the Fragment has been created");
        }
        if (state != Lifecycle.State.DESTROYED) {
            OooO0O0(new o0000oo.OooO00o(fragment, state));
            return this;
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f5902OooOOo >= 0) {
            sb.append(" #");
            sb.append(this.f5902OooOOo);
        }
        if (this.f6014OooO0oo != null) {
            sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            sb.append(this.f6014OooO0oo);
        }
        sb.append("}");
        return sb.toString();
    }
}
