package p231o00oOo0o;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.OooOOO;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class o00000 extends Fragment {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public o00000 f33911Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Oooo0 f33912Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final OooO00o f33913Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final Set<o00000> f33914Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public Fragment f33915OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public OooOOO f33916OoooO00;

    public class OooO00o implements o000000 {
        public OooO00o() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + o00000.this + "}";
        }
    }

    public o00000() {
        Oooo0 oooo0 = new Oooo0();
        this.f33913Oooo0oO = new OooO00o();
        this.f33914Oooo0oo = new HashSet();
        this.f33912Oooo0o = oooo0;
    }

    @Nullable
    public final Fragment OooO00o() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f33915OoooO0;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to o00oOo0o.o00000 for r0v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public final void OooO0O0(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull androidx.fragment.app.FragmentManager r2) {
        /*
            r0 = this;
            r0.OooO0OO()
            com.bumptech.glide.OooO0OO r1 = com.bumptech.glide.OooO0OO.OooO0O0(r1)
            o00oOo0o.o000OOo r1 = r1.f12378OoooO0O
            o00oOo0o.o00000 r1 = r1.OooO0o0(r2)
            r0.f33911Oooo = r1
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L1c
            o00oOo0o.o00000 r1 = r0.f33911Oooo
            java.util.Set<o00oOo0o.o00000> r1 = r1.f33914Oooo0oo
            r1.add(r0)
        L1c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p231o00oOo0o.o00000.OooO0O0(android.content.Context, androidx.fragment.app.FragmentManager):void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashSet, java.util.Set<o00oOo0o.o00000>] */
    public final void OooO0OO() {
        o00000 o00000Var = this.f33911Oooo;
        if (o00000Var != null) {
            o00000Var.f33914Oooo0oo.remove(this);
            this.f33911Oooo = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Fragment parentFragment = this;
        while (parentFragment.getParentFragment() != null) {
            parentFragment = parentFragment.getParentFragment();
        }
        FragmentManager fragmentManager = parentFragment.getFragmentManager();
        if (fragmentManager == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
            }
        } else {
            try {
                OooO0O0(getContext(), fragmentManager);
            } catch (IllegalStateException e) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f33912Oooo0o.OooO0OO();
        OooO0OO();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f33915OoooO0 = null;
        OooO0OO();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f33912Oooo0o.OooO0Oo();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f33912Oooo0o.OooO0o0();
    }

    @Override // androidx.fragment.app.Fragment
    public final String toString() {
        return super.toString() + "{parent=" + OooO00o() + "}";
    }
}
