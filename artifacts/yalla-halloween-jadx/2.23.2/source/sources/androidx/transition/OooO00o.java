package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import java.util.WeakHashMap;
import oOO00O.OooOo;
import oOO00O.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ ChangeTransform.OooO f11246OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f11247OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f11248OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Matrix f11249OooO0o0 = new Matrix();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Matrix f11250OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ View f11251OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ ChangeTransform.OooO0o f11252OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ ChangeTransform f11253OooOO0O;

    public OooO00o(ChangeTransform changeTransform, boolean z, Matrix matrix, View view, ChangeTransform.OooO oooO, ChangeTransform.OooO0o oooO0o) {
        this.f11253OooOO0O = changeTransform;
        this.f11248OooO0o = z;
        this.f11250OooO0oO = matrix;
        this.f11251OooO0oo = view;
        this.f11246OooO = oooO;
        this.f11252OooOO0 = oooO0o;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f11247OooO0Oo = true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z = this.f11247OooO0Oo;
        ChangeTransform.OooO oooO = this.f11246OooO;
        View view = this.f11251OooO0oo;
        if (!z) {
            if (this.f11248OooO0o && this.f11253OooOO0O.f11217OooOoo0) {
                Matrix matrix = this.f11249OooO0o0;
                matrix.set(this.f11250OooO0oO);
                view.setTag(OooOo.transition_transform, matrix);
                oooO.getClass();
                String[] strArr = ChangeTransform.f11212OooOooo;
                view.setTranslationX(oooO.f11219OooO00o);
                view.setTranslationY(oooO.f11220OooO0O0);
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                ViewCompat.OooOOO.OooOo0o(view, oooO.f11221OooO0OO);
                view.setScaleX(oooO.f11222OooO0Oo);
                view.setScaleY(oooO.f11224OooO0o0);
                view.setRotationX(oooO.f11223OooO0o);
                view.setRotationY(oooO.f11225OooO0oO);
                view.setRotation(oooO.f11226OooO0oo);
            } else {
                view.setTag(OooOo.transition_transform, null);
                view.setTag(OooOo.parent_matrix, null);
            }
        }
        oo0o0Oo.f60176OooO00o.OooO0Oo(view, null);
        oooO.getClass();
        String[] strArr2 = ChangeTransform.f11212OooOooo;
        view.setTranslationX(oooO.f11219OooO00o);
        view.setTranslationY(oooO.f11220OooO0O0);
        WeakHashMap<View, o000OOo0> weakHashMap2 = ViewCompat.f5341OooO00o;
        ViewCompat.OooOOO.OooOo0o(view, oooO.f11221OooO0OO);
        view.setScaleX(oooO.f11222OooO0Oo);
        view.setScaleY(oooO.f11224OooO0o0);
        view.setRotationX(oooO.f11223OooO0o);
        view.setRotationY(oooO.f11225OooO0oO);
        view.setRotation(oooO.f11226OooO0oo);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        Matrix matrix = this.f11252OooOO0.f11229OooO00o;
        Matrix matrix2 = this.f11249OooO0o0;
        matrix2.set(matrix);
        int i = OooOo.transition_transform;
        View view = this.f11251OooO0oo;
        view.setTag(i, matrix2);
        ChangeTransform.OooO oooO = this.f11246OooO;
        oooO.getClass();
        String[] strArr = ChangeTransform.f11212OooOooo;
        view.setTranslationX(oooO.f11219OooO00o);
        view.setTranslationY(oooO.f11220OooO0O0);
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooOOO.OooOo0o(view, oooO.f11221OooO0OO);
        view.setScaleX(oooO.f11222OooO0Oo);
        view.setScaleY(oooO.f11224OooO0o0);
        view.setRotationX(oooO.f11223OooO0o);
        view.setRotationY(oooO.f11225OooO0oO);
        view.setRotation(oooO.f11226OooO0oo);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        String[] strArr = ChangeTransform.f11212OooOooo;
        View view = this.f11251OooO0oo;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooOOO.OooOo0o(view, 0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
    }
}
