package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import o0OOO0OO.OooO0O0;
import p084o000Ooo.o0OOO0o;
import p337o0OO0o0.OooO0o;
import p347o0OOO0o0.o00000;
import p394o0OOoooO.o0O0000O;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO00o {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final boolean f16714OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @ChecksSdkIntAtLeast(api = 21)
    public static final boolean f16715OooOo00;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public PorterDuff.Mode f16716OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MaterialButton f16717OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public com.google.android.material.shape.OooO00o f16718OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f16719OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f16720OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f16721OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f16722OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f16723OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f16724OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public ColorStateList f16725OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public ColorStateList f16726OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public ColorStateList f16727OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public Drawable f16729OooOOO0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public LayerDrawable f16732OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f16733OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f16734OooOOoo;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f16728OooOOO = false;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f16730OooOOOO = false;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f16731OooOOOo = false;

    static {
        int i = Build.VERSION.SDK_INT;
        f16715OooOo00 = true;
        f16714OooOo0 = i <= 22;
    }

    public OooO00o(MaterialButton materialButton, @NonNull com.google.android.material.shape.OooO00o oooO00o) {
        this.f16717OooO00o = materialButton;
        this.f16718OooO0O0 = oooO00o;
    }

    @Nullable
    public final o00000 OooO00o() {
        LayerDrawable layerDrawable = this.f16732OooOOo;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f16732OooOOo.getNumberOfLayers() > 2 ? (o00000) this.f16732OooOOo.getDrawable(2) : (o00000) this.f16732OooOOo.getDrawable(1);
    }

    @Nullable
    public final MaterialShapeDrawable OooO0O0(boolean z) {
        LayerDrawable layerDrawable = this.f16732OooOOo;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f16715OooOo00 ? (MaterialShapeDrawable) ((LayerDrawable) ((InsetDrawable) this.f16732OooOOo.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0) : (MaterialShapeDrawable) this.f16732OooOOo.getDrawable(!z ? 1 : 0);
    }

    public final void OooO0OO(@NonNull com.google.android.material.shape.OooO00o oooO00o) {
        this.f16718OooO0O0 = oooO00o;
        if (!f16714OooOo0 || this.f16730OooOOOO) {
            if (OooO0O0(false) != null) {
                OooO0O0(false).setShapeAppearanceModel(oooO00o);
            }
            if (OooO0O0(true) != null) {
                OooO0O0(true).setShapeAppearanceModel(oooO00o);
            }
            if (OooO00o() != null) {
                OooO00o().setShapeAppearanceModel(oooO00o);
                return;
            }
            return;
        }
        MaterialButton materialButton = this.f16717OooO00o;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        int iOooO0o = ViewCompat.OooO.OooO0o(materialButton);
        int paddingTop = this.f16717OooO00o.getPaddingTop();
        int iOooO0o0 = ViewCompat.OooO.OooO0o0(this.f16717OooO00o);
        int paddingBottom = this.f16717OooO00o.getPaddingBottom();
        OooO0o0();
        ViewCompat.OooO.OooOO0O(this.f16717OooO00o, iOooO0o, paddingTop, iOooO0o0, paddingBottom);
    }

    public final void OooO0Oo(@Dimension int i, @Dimension int i2) {
        MaterialButton materialButton = this.f16717OooO00o;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        int iOooO0o = ViewCompat.OooO.OooO0o(materialButton);
        int paddingTop = this.f16717OooO00o.getPaddingTop();
        int iOooO0o0 = ViewCompat.OooO.OooO0o0(this.f16717OooO00o);
        int paddingBottom = this.f16717OooO00o.getPaddingBottom();
        int i3 = this.f16722OooO0o0;
        int i4 = this.f16721OooO0o;
        this.f16721OooO0o = i2;
        this.f16722OooO0o0 = i;
        if (!this.f16730OooOOOO) {
            OooO0o0();
        }
        ViewCompat.OooO.OooOO0O(this.f16717OooO00o, iOooO0o, (paddingTop + i) - i3, iOooO0o0, (paddingBottom + i2) - i4);
    }

    public final void OooO0o() {
        MaterialShapeDrawable materialShapeDrawableOooO0O0 = OooO0O0(false);
        MaterialShapeDrawable materialShapeDrawableOooO0O1 = OooO0O0(true);
        if (materialShapeDrawableOooO0O0 != null) {
            materialShapeDrawableOooO0O0.OooOo0O(this.f16724OooO0oo, this.f16726OooOO0O);
            if (materialShapeDrawableOooO0O1 != null) {
                materialShapeDrawableOooO0O1.OooOo0(this.f16724OooO0oo, this.f16728OooOOO ? o0O0000O.OooO0OO(this.f16717OooO00o, OooO0o.colorSurface) : 0);
            }
        }
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
    public final void OooO0o0() {
        Drawable insetDrawable;
        MaterialButton materialButton = this.f16717OooO00o;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.f16718OooO0O0);
        materialShapeDrawable.OooOOO0(this.f16717OooO00o.getContext());
        o0OOO0o.OooO0O0.OooO0oo(materialShapeDrawable, this.f16725OooOO0);
        PorterDuff.Mode mode = this.f16716OooO;
        if (mode != null) {
            o0OOO0o.OooO0O0.OooO(materialShapeDrawable, mode);
        }
        materialShapeDrawable.OooOo0O(this.f16724OooO0oo, this.f16726OooOO0O);
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(this.f16718OooO0O0);
        materialShapeDrawable2.setTint(0);
        materialShapeDrawable2.OooOo0(this.f16724OooO0oo, this.f16728OooOOO ? o0O0000O.OooO0OO(this.f16717OooO00o, OooO0o.colorSurface) : 0);
        if (f16715OooOo00) {
            MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(this.f16718OooO0O0);
            this.f16729OooOOO0 = materialShapeDrawable3;
            o0OOO0o.OooO0O0.OooO0oO(materialShapeDrawable3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(OooO0O0.OooO0OO(this.f16727OooOO0o), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable}), this.f16719OooO0OO, this.f16722OooO0o0, this.f16720OooO0Oo, this.f16721OooO0o), this.f16729OooOOO0);
            this.f16732OooOOo = rippleDrawable;
            insetDrawable = rippleDrawable;
        } else {
            o0OOO0OO.OooO00o oooO00o = new o0OOO0OO.OooO00o(this.f16718OooO0O0);
            this.f16729OooOOO0 = oooO00o;
            o0OOO0o.OooO0O0.OooO0oo(oooO00o, OooO0O0.OooO0OO(this.f16727OooOO0o));
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable, this.f16729OooOOO0});
            this.f16732OooOOo = layerDrawable;
            insetDrawable = new InsetDrawable((Drawable) layerDrawable, this.f16719OooO0OO, this.f16722OooO0o0, this.f16720OooO0Oo, this.f16721OooO0o);
        }
        materialButton.setInternalBackground(insetDrawable);
        MaterialShapeDrawable materialShapeDrawableOooO0O0 = OooO0O0(false);
        if (materialShapeDrawableOooO0O0 != null) {
            materialShapeDrawableOooO0O0.OooOOOO(this.f16734OooOOoo);
        }
    }
}
