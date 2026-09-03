package o0O000;

import android.util.Property;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import p270o0O0000o.o0000Ooo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO extends Property<ViewGroup, Float> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO f41570OooO00o = new OooO();

    public OooO() {
        super(Float.class, "childrenAlpha");
    }

    @Override // android.util.Property
    @NonNull
    public final Float get(@NonNull ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(o0000Ooo.mtrl_internal_children_alpha_tag);
        return f != null ? f : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public final void set(@NonNull ViewGroup viewGroup, @NonNull Float f) {
        ViewGroup viewGroup2 = viewGroup;
        float fFloatValue = f.floatValue();
        viewGroup2.setTag(o0000Ooo.mtrl_internal_children_alpha_tag, Float.valueOf(fFloatValue));
        int childCount = viewGroup2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup2.getChildAt(i).setAlpha(fFloatValue);
        }
    }
}
