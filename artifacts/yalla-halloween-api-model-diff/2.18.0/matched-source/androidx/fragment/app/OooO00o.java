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

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends o0000Ooo implements FragmentManager.OooOo {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final FragmentManager f8384OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f8385OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f8386OooOOo0;

    public OooO00o(@NonNull FragmentManager fragmentManager) {
        fragmentManager.Oooo0O0();
        o00oO0o<?> o00oo0o2 = fragmentManager.f8321OooOo0;
        if (o00oo0o2 != null) {
            o00oo0o2.f8533OoooO00.getClassLoader();
        }
        this.f8385OooOOo = -1;
        this.f8384OooOOOo = fragmentManager;
    }

    public final int OooO(boolean z) {
        if (this.f8386OooOOo0) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.Oooo0oO(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new o000());
            OooOO0o("  ", printWriter, true);
            printWriter.close();
        }
        this.f8386OooOOo0 = true;
        if (this.f8476OooO0oO) {
            this.f8385OooOOo = this.f8384OooOOOo.f8301OooO.getAndIncrement();
        } else {
            this.f8385OooOOo = -1;
        }
        this.f8384OooOOOo.OooOoO0(this, z);
        return this.f8385OooOOo;
    }

    @Override // androidx.fragment.app.FragmentManager.OooOo
    public final boolean OooO00o(@NonNull ArrayList<OooO00o> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (FragmentManager.Oooo0oO(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f8476OooO0oO) {
            return true;
        }
        FragmentManager fragmentManager = this.f8384OooOOOo;
        if (fragmentManager.f8305OooO0Oo == null) {
            fragmentManager.f8305OooO0Oo = new ArrayList<>();
        }
        fragmentManager.f8305OooO0Oo.add(this);
        return true;
    }

    @Override // androidx.fragment.app.o0000Ooo
    public final void OooO0OO() {
        if (this.f8476OooO0oO) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f8384OooOOOo.OooOoo0(this, false);
    }

    @Override // androidx.fragment.app.o0000Ooo
    public final void OooO0Oo(int i, Fragment fragment, @Nullable String str, int i2) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            FragmentStrictMode.OooO0Oo(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Fragment ");
            sbOooO0O0.append(cls.getCanonicalName());
            sbOooO0O0.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(sbOooO0O0.toString());
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't change tag of fragment ");
                sb.append(fragment);
                sb.append(": was ");
                throw new IllegalStateException(Oooo000.o00O0O.OooO00o(sb, fragment.mTag, " now ", str));
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
        OooO0O0(new o0000Ooo.OooO00o(i2, fragment));
        fragment.mFragmentManager = this.f8384OooOOOo;
    }

    public final void OooO0o(int i) {
        if (this.f8476OooO0oO) {
            if (FragmentManager.Oooo0oO(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f8470OooO00o.size();
            for (int i2 = 0; i2 < size; i2++) {
                o0000Ooo.OooO00o oooO00o = this.f8470OooO00o.get(i2);
                Fragment fragment = oooO00o.f8486OooO0O0;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (FragmentManager.Oooo0oO(2)) {
                        StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Bump nesting of ");
                        sbOooO0O0.append(oooO00o.f8486OooO0O0);
                        sbOooO0O0.append(" to ");
                        sbOooO0O0.append(oooO00o.f8486OooO0O0.mBackStackNesting);
                        Log.v("FragmentManager", sbOooO0O0.toString());
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.o0000Ooo
    @NonNull
    public final o0000Ooo OooO0o0(@NonNull Fragment fragment, @NonNull Lifecycle.State state) {
        if (fragment.mFragmentManager != this.f8384OooOOOo) {
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            sbOooO0O0.append(this.f8384OooOOOo);
            throw new IllegalArgumentException(sbOooO0O0.toString());
        }
        if (state == Lifecycle.State.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + " after the Fragment has been created");
        }
        if (state != Lifecycle.State.DESTROYED) {
            OooO0O0(new o0000Ooo.OooO00o(fragment, state));
            return this;
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    public final int OooO0oO() {
        return OooO(false);
    }

    public final int OooO0oo() {
        return OooO(true);
    }

    public final void OooOO0() {
        if (this.f8476OooO0oO) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f8384OooOOOo.OooOoo0(this, true);
    }

    @NonNull
    public final o0000Ooo OooOO0O(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f8384OooOOOo) {
            OooO0O0(new o0000Ooo.OooO00o(6, fragment));
            return this;
        }
        StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
        sbOooO0O0.append(fragment.toString());
        sbOooO0O0.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sbOooO0O0.toString());
    }

    public final void OooOO0o(String str, PrintWriter printWriter, boolean z) {
        String string;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f8477OooO0oo);
            printWriter.print(" mIndex=");
            printWriter.print(this.f8385OooOOo);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f8386OooOOo0);
            if (this.f8474OooO0o != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f8474OooO0o));
            }
            if (this.f8471OooO0O0 != 0 || this.f8472OooO0OO != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f8471OooO0O0));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f8472OooO0OO));
            }
            if (this.f8473OooO0Oo != 0 || this.f8475OooO0o0 != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f8473OooO0Oo));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f8475OooO0o0));
            }
            if (this.f8469OooO != 0 || this.f8478OooOO0 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f8469OooO));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f8478OooOO0);
            }
            if (this.f8479OooOO0O != 0 || this.f8480OooOO0o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f8479OooOO0O));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f8480OooOO0o);
            }
        }
        if (this.f8470OooO00o.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f8470OooO00o.size();
        for (int i = 0; i < size; i++) {
            o0000Ooo.OooO00o oooO00o = this.f8470OooO00o.get(i);
            switch (oooO00o.f8485OooO00o) {
                case 0:
                    string = "NULL";
                    break;
                case 1:
                    string = "ADD";
                    break;
                case 2:
                    string = "REPLACE";
                    break;
                case 3:
                    string = "REMOVE";
                    break;
                case 4:
                    string = "HIDE";
                    break;
                case 5:
                    string = "SHOW";
                    break;
                case 6:
                    string = "DETACH";
                    break;
                case 7:
                    string = "ATTACH";
                    break;
                case 8:
                    string = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    string = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    string = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("cmd=");
                    sbOooO0O0.append(oooO00o.f8485OooO00o);
                    string = sbOooO0O0.toString();
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(string);
            printWriter.print(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            printWriter.println(oooO00o.f8486OooO0O0);
            if (z) {
                if (oooO00o.f8488OooO0Oo != 0 || oooO00o.f8490OooO0o0 != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(oooO00o.f8488OooO0Oo));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(oooO00o.f8490OooO0o0));
                }
                if (oooO00o.f8489OooO0o != 0 || oooO00o.f8491OooO0oO != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(oooO00o.f8489OooO0o));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(oooO00o.f8491OooO0oO));
                }
            }
        }
    }

    @NonNull
    public final o0000Ooo OooOOO0(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f8384OooOOOo) {
            OooO0O0(new o0000Ooo.OooO00o(3, fragment));
            return this;
        }
        StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        sbOooO0O0.append(fragment.toString());
        sbOooO0O0.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sbOooO0O0.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f8385OooOOo >= 0) {
            sb.append(" #");
            sb.append(this.f8385OooOOo);
        }
        if (this.f8477OooO0oo != null) {
            sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            sb.append(this.f8477OooO0oo);
        }
        sb.append("}");
        return sb.toString();
    }
}
