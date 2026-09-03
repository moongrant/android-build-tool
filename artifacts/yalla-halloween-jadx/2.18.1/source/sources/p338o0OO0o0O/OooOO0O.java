package p338o0OO0o0O;

import android.util.Property;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import p337o0OO0o0.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O extends Property<ViewGroup, Float> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Property<ViewGroup, Float> f37978OooO00o = new OooOO0O();

    public OooOO0O() {
        super(Float.class, "childrenAlpha");
    }

    @Override // android.util.Property
    @NonNull
    public final Float get(@NonNull ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(OooOOO0.mtrl_internal_children_alpha_tag);
        return f != null ? f : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public final void set(@NonNull ViewGroup viewGroup, @NonNull Float f) {
        ViewGroup viewGroup2 = viewGroup;
        float fFloatValue = f.floatValue();
        viewGroup2.setTag(OooOOO0.mtrl_internal_children_alpha_tag, Float.valueOf(fFloatValue));
        int childCount = viewGroup2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup2.getChildAt(i).setAlpha(fFloatValue);
        }
    }
}
