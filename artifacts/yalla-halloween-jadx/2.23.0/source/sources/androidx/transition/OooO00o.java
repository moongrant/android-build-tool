package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import java.util.WeakHashMap;
import p078o000Oo0O.o0000O00;
import p078o000Oo0O.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ ChangeTransform.OooO f8152OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f8153OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f8154OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Matrix f8155OooO0o0 = new Matrix();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Matrix f8156OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ View f8157OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ ChangeTransform.OooO0o f8158OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ ChangeTransform f8159OooOO0O;

    public OooO00o(ChangeTransform changeTransform, boolean z, Matrix matrix, View view, ChangeTransform.OooO oooO, ChangeTransform.OooO0o oooO0o) {
        this.f8159OooOO0O = changeTransform;
        this.f8154OooO0o = z;
        this.f8156OooO0oO = matrix;
        this.f8157OooO0oo = view;
        this.f8152OooO = oooO;
        this.f8158OooOO0 = oooO0o;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f8153OooO0Oo = true;
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
        boolean z = this.f8153OooO0Oo;
        ChangeTransform.OooO oooO = this.f8152OooO;
        View view = this.f8157OooO0oo;
        if (!z) {
            if (this.f8154OooO0o && this.f8159OooOO0O.f8123OooOoo0) {
                Matrix matrix = this.f8155OooO0o0;
                matrix.set(this.f8156OooO0oO);
                view.setTag(o0OOO0o.transition_transform, matrix);
                oooO.getClass();
                String[] strArr = ChangeTransform.f8118OooOooo;
                view.setTranslationX(oooO.f8125OooO00o);
                view.setTranslationY(oooO.f8126OooO0O0);
                WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                ViewCompat.OooOOO.OooOo0o(view, oooO.f8127OooO0OO);
                view.setScaleX(oooO.f8128OooO0Oo);
                view.setScaleY(oooO.f8130OooO0o0);
                view.setRotationX(oooO.f8129OooO0o);
                view.setRotationY(oooO.f8131OooO0oO);
                view.setRotation(oooO.f8132OooO0oo);
            } else {
                view.setTag(o0OOO0o.transition_transform, null);
                view.setTag(o0OOO0o.parent_matrix, null);
            }
        }
        o0000O00.f34939OooO00o.OooO0Oo(view, null);
        oooO.getClass();
        String[] strArr2 = ChangeTransform.f8118OooOooo;
        view.setTranslationX(oooO.f8125OooO00o);
        view.setTranslationY(oooO.f8126OooO0O0);
        WeakHashMap<View, o000O0Oo> weakHashMap2 = ViewCompat.f5334OooO00o;
        ViewCompat.OooOOO.OooOo0o(view, oooO.f8127OooO0OO);
        view.setScaleX(oooO.f8128OooO0Oo);
        view.setScaleY(oooO.f8130OooO0o0);
        view.setRotationX(oooO.f8129OooO0o);
        view.setRotationY(oooO.f8131OooO0oO);
        view.setRotation(oooO.f8132OooO0oo);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        Matrix matrix = this.f8158OooOO0.f8135OooO00o;
        Matrix matrix2 = this.f8155OooO0o0;
        matrix2.set(matrix);
        int i = o0OOO0o.transition_transform;
        View view = this.f8157OooO0oo;
        view.setTag(i, matrix2);
        ChangeTransform.OooO oooO = this.f8152OooO;
        oooO.getClass();
        String[] strArr = ChangeTransform.f8118OooOooo;
        view.setTranslationX(oooO.f8125OooO00o);
        view.setTranslationY(oooO.f8126OooO0O0);
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        ViewCompat.OooOOO.OooOo0o(view, oooO.f8127OooO0OO);
        view.setScaleX(oooO.f8128OooO0Oo);
        view.setScaleY(oooO.f8130OooO0o0);
        view.setRotationX(oooO.f8129OooO0o);
        view.setRotationY(oooO.f8131OooO0oO);
        view.setRotation(oooO.f8132OooO0oo);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        String[] strArr = ChangeTransform.f8118OooOooo;
        View view = this.f8157OooO0oo;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        ViewCompat.OooOOO.OooOo0o(view, 0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
    }
}
