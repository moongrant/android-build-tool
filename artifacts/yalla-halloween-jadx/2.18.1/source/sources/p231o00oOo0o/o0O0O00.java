package p231o00oOo0o;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import androidx.annotation.Nullable;
import com.bumptech.glide.OooOOO;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class o0O0O00 extends Fragment {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public OooOOO f33935Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Oooo0 f33936Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final OooO00o f33937Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final Set<o0O0O00> f33938Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public Fragment f33939OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public o0O0O00 f33940OoooO00;

    public class OooO00o implements o000000 {
        public OooO00o() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + o0O0O00.this + "}";
        }
    }

    public o0O0O00() {
        Oooo0 oooo0 = new Oooo0();
        this.f33937Oooo0oO = new OooO00o();
        this.f33938Oooo0oo = new HashSet();
        this.f33936Oooo0o = oooo0;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to o00oOo0o.o0O0O00 for r1v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public final void OooO00o(@androidx.annotation.NonNull android.app.Activity r2) {
        /*
            r1 = this;
            r1.OooO0O0()
            com.bumptech.glide.OooO0OO r0 = com.bumptech.glide.OooO0OO.OooO0O0(r2)
            o00oOo0o.o000OOo r0 = r0.f12378OoooO0O
            java.util.Objects.requireNonNull(r0)
            android.app.FragmentManager r2 = r2.getFragmentManager()
            o00oOo0o.o0O0O00 r2 = r0.OooO0Oo(r2)
            r1.f33940OoooO00 = r2
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L23
            o00oOo0o.o0O0O00 r2 = r1.f33940OoooO00
            java.util.Set<o00oOo0o.o0O0O00> r2 = r2.f33938Oooo0oo
            r2.add(r1)
        L23:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p231o00oOo0o.o0O0O00.OooO00o(android.app.Activity):void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashSet, java.util.Set<o00oOo0o.o0O0O00>] */
    public final void OooO0O0() {
        o0O0O00 o0o0o00 = this.f33940OoooO00;
        if (o0o0o00 != null) {
            o0o0o00.f33938Oooo0oo.remove(this);
            this.f33940OoooO00 = null;
        }
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            OooO00o(activity);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f33936Oooo0o.OooO0OO();
        OooO0O0();
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        OooO0O0();
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f33936Oooo0o.OooO0Oo();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f33936Oooo0o.OooO0o0();
    }

    @Override // android.app.Fragment
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f33939OoooO0;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}
