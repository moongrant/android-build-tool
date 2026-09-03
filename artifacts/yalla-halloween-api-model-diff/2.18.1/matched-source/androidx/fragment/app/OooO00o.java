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
public final class OooO00o extends o00000OO implements FragmentManager.OooOo {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final FragmentManager f8369OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f8370OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f8371OooOOo0;

    public OooO00o(@NonNull FragmentManager fragmentManager) {
        fragmentManager.Oooo0O0();
        oo000o<?> oo000oVar = fragmentManager.f8306OooOo0;
        if (oo000oVar != null) {
            oo000oVar.f8529Oooo0oO.getClassLoader();
        }
        this.f8370OooOOo = -1;
        this.f8369OooOOOo = fragmentManager;
    }

    public final int OooO(boolean z) {
        if (this.f8371OooOOo0) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.Oooo0oO(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new o0000OO0());
            OooOO0o("  ", printWriter, true);
            printWriter.close();
        }
        this.f8371OooOOo0 = true;
        if (this.f8449OooO0oO) {
            this.f8370OooOOo = this.f8369OooOOOo.f8286OooO.getAndIncrement();
        } else {
            this.f8370OooOOo = -1;
        }
        this.f8369OooOOOo.OooOoO0(this, z);
        return this.f8370OooOOo;
    }

    @Override // androidx.fragment.app.FragmentManager.OooOo
    public final boolean OooO00o(@NonNull ArrayList<OooO00o> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (FragmentManager.Oooo0oO(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f8449OooO0oO) {
            return true;
        }
        FragmentManager fragmentManager = this.f8369OooOOOo;
        if (fragmentManager.f8290OooO0Oo == null) {
            fragmentManager.f8290OooO0Oo = new ArrayList<>();
        }
        fragmentManager.f8290OooO0Oo.add(this);
        return true;
    }

    @Override // androidx.fragment.app.o00000OO
    public final void OooO0OO() {
        if (this.f8449OooO0oO) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f8369OooOOOo.OooOoo0(this, false);
    }

    @Override // androidx.fragment.app.o00000OO
    public final void OooO0Oo(int i, Fragment fragment, @Nullable String str, int i2) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            FragmentStrictMode.OooO0Oo(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Fragment ");
            sbOooO0o0.append(cls.getCanonicalName());
            sbOooO0o0.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(sbOooO0o0.toString());
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't change tag of fragment ");
                sb.append(fragment);
                sb.append(": was ");
                throw new IllegalStateException(Oooo000.o00O0O.OooO0O0(sb, fragment.mTag, " now ", str));
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
        OooO0O0(new o00000OO.OooO00o(i2, fragment));
        fragment.mFragmentManager = this.f8369OooOOOo;
    }

    public final void OooO0o(int i) {
        if (this.f8449OooO0oO) {
            if (FragmentManager.Oooo0oO(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f8443OooO00o.size();
            for (int i2 = 0; i2 < size; i2++) {
                o00000OO.OooO00o oooO00o = this.f8443OooO00o.get(i2);
                Fragment fragment = oooO00o.f8459OooO0O0;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (FragmentManager.Oooo0oO(2)) {
                        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Bump nesting of ");
                        sbOooO0o0.append(oooO00o.f8459OooO0O0);
                        sbOooO0o0.append(" to ");
                        sbOooO0o0.append(oooO00o.f8459OooO0O0.mBackStackNesting);
                        Log.v("FragmentManager", sbOooO0o0.toString());
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.o00000OO
    @NonNull
    public final o00000OO OooO0o0(@NonNull Fragment fragment, @NonNull Lifecycle.State state) {
        if (fragment.mFragmentManager != this.f8369OooOOOo) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            sbOooO0o0.append(this.f8369OooOOOo);
            throw new IllegalArgumentException(sbOooO0o0.toString());
        }
        if (state == Lifecycle.State.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + " after the Fragment has been created");
        }
        if (state != Lifecycle.State.DESTROYED) {
            OooO0O0(new o00000OO.OooO00o(fragment, state));
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
        if (this.f8449OooO0oO) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f8369OooOOOo.OooOoo0(this, true);
    }

    @NonNull
    public final o00000OO OooOO0O(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f8369OooOOOo) {
            OooO0O0(new o00000OO.OooO00o(6, fragment));
            return this;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
        sbOooO0o0.append(fragment.toString());
        sbOooO0o0.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sbOooO0o0.toString());
    }

    public final void OooOO0o(String str, PrintWriter printWriter, boolean z) {
        String string;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f8450OooO0oo);
            printWriter.print(" mIndex=");
            printWriter.print(this.f8370OooOOo);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f8371OooOOo0);
            if (this.f8447OooO0o != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f8447OooO0o));
            }
            if (this.f8444OooO0O0 != 0 || this.f8445OooO0OO != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f8444OooO0O0));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f8445OooO0OO));
            }
            if (this.f8446OooO0Oo != 0 || this.f8448OooO0o0 != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f8446OooO0Oo));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f8448OooO0o0));
            }
            if (this.f8442OooO != 0 || this.f8451OooOO0 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f8442OooO));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f8451OooOO0);
            }
            if (this.f8452OooOO0O != 0 || this.f8453OooOO0o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f8452OooOO0O));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f8453OooOO0o);
            }
        }
        if (this.f8443OooO00o.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f8443OooO00o.size();
        for (int i = 0; i < size; i++) {
            o00000OO.OooO00o oooO00o = this.f8443OooO00o.get(i);
            switch (oooO00o.f8458OooO00o) {
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
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("cmd=");
                    sbOooO0o0.append(oooO00o.f8458OooO00o);
                    string = sbOooO0o0.toString();
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(string);
            printWriter.print(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            printWriter.println(oooO00o.f8459OooO0O0);
            if (z) {
                if (oooO00o.f8461OooO0Oo != 0 || oooO00o.f8463OooO0o0 != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(oooO00o.f8461OooO0Oo));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(oooO00o.f8463OooO0o0));
                }
                if (oooO00o.f8462OooO0o != 0 || oooO00o.f8464OooO0oO != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(oooO00o.f8462OooO0o));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(oooO00o.f8464OooO0oO));
                }
            }
        }
    }

    @NonNull
    public final o00000OO OooOOO0(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f8369OooOOOo) {
            OooO0O0(new o00000OO.OooO00o(3, fragment));
            return this;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        sbOooO0o0.append(fragment.toString());
        sbOooO0o0.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sbOooO0o0.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f8370OooOOo >= 0) {
            sb.append(" #");
            sb.append(this.f8370OooOOo);
        }
        if (this.f8450OooO0oo != null) {
            sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            sb.append(this.f8450OooO0oo);
        }
        sb.append("}");
        return sb.toString();
    }
}
